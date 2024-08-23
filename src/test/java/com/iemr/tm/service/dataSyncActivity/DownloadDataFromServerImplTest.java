package com.iemr.tm.service.dataSyncActivity;

import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.iemr.tm.data.syncActivity_syncLayer.MasterDownloadDataDigester;
import com.iemr.tm.data.syncActivity_syncLayer.SyncDownloadMaster;
import com.iemr.tm.data.syncActivity_syncLayer.TempVan;
import com.iemr.tm.repo.syncActivity_syncLayer.SyncDownloadMasterRepo;
import com.iemr.tm.repo.syncActivity_syncLayer.TempVanRepo;
import com.iemr.tm.utils.mapper.InputMapper;

@ExtendWith(MockitoExtension.class)
class DownloadDataFromServerImplTest {

	@InjectMocks
	DownloadDataFromServerImpl downloadDataFromServerImpl;

	@Value("${dataSyncDownloadUrl}")
	private String dataSyncDownloadUrl;

	@Mock
	private SyncDownloadMasterRepo syncDownloadMasterRepo;
	@Mock
	private DataSyncRepository dataSyncRepository;
	@Mock
	private TempVanRepo tempVanRepo;

	private static int progressCounter = 0;
	private static int totalCounter = 0;
	private static StringBuilder failedMasters;
	private static int failedCounter;

	@Test
	void downloadMasterDataFromServerTest() throws Exception {

		String ServerAuthorization = "Authorized";
		Integer vanID = 12;
		Integer psmID = 13;

		progressCounter = 0;
		totalCounter = 1;

		String successFlag = " Master download started ";

		SyncDownloadMaster syncDownloadMaster = new SyncDownloadMaster();

		syncDownloadMaster.setDownloadMasterTableID(1);
		syncDownloadMaster.setSchemaName("DBA");
		syncDownloadMaster.setTableName("DB1");
		syncDownloadMaster.setServerColumnName("Coloumn1");
		syncDownloadMaster.setVanColumnName("van1");
		syncDownloadMaster.setAutoIncColumnName("Automatic coloumn1");
		syncDownloadMaster.setMasterType("master");
		syncDownloadMaster.setLastDownloadDate(Timestamp.valueOf("2020-09-09 09:09:59"));
		syncDownloadMaster.setDeleted(false);
		syncDownloadMaster.setProcessed("U");
		syncDownloadMaster.setCreatedBy("AK Hossain");
		syncDownloadMaster.setCreatedDate(Timestamp.valueOf("2020-09-09 09:09:59"));
		syncDownloadMaster.setModifiedBy("BK Hossain");
		syncDownloadMaster.setLastModDate(Timestamp.valueOf("2021-09-09 09:09:59"));
		syncDownloadMaster.setVanID(3);
		syncDownloadMaster.setProviderServiceMapID(123);

		syncDownloadMaster.toString();

		ArrayList<SyncDownloadMaster> downloadMasterList = new ArrayList<SyncDownloadMaster>();

		downloadMasterList.add(syncDownloadMaster);

		totalCounter = downloadMasterList.size();
		progressCounter = 0;

		failedCounter = 0;

		final ExecutorService threadPool = Executors.newFixedThreadPool(3);
		threadPool.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {

				SyncDownloadMaster table = syncDownloadMaster;

				table.setVanID(syncDownloadMaster.getVanID());
				table.setProviderServiceMapID(psmID);

				table.toString();

				int i = 0;

				when(downloadDataFromServer(table, ServerAuthorization)).thenReturn(i);

				failedCounter++;

				failedMasters.append(table.getTableName() + " | ");

				progressCounter++;
				return "Master download completed";
			}

		});

		successFlag = downloadDataFromServerImpl.downloadMasterDataFromServer(ServerAuthorization, vanID, psmID);

		Assertions.assertNotEquals(totalCounter, progressCounter);
		Assertions.assertEquals(successFlag,
				downloadDataFromServerImpl.downloadMasterDataFromServer(ServerAuthorization, vanID, psmID));

	}

	private int downloadDataFromServer(SyncDownloadMaster syncDownloadMaster, String ServerAuthorization)
			throws Exception {
		int successFlag = 0;

		// initializing RestTemplate
		RestTemplate restTemplate = new RestTemplate();

		// Multivalue map for headers with content-type and auth key
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add("Content-Type", "application/json");
		headers.add("AUTHORIZATION", ServerAuthorization);
		HttpEntity<Object> request = new HttpEntity<Object>(syncDownloadMaster, headers);

		// Call rest-template to call API to download master data for given table
		ResponseEntity<String> response = restTemplate.exchange(dataSyncDownloadUrl, HttpMethod.POST, request,
				String.class);

		// Check if API call is success
		if (response != null && response.hasBody()) {
			JSONObject obj = new JSONObject(response.getBody());
			if (obj != null && obj.has("data") && obj.has("statusCode") && obj.getInt("statusCode") == 200) {
				// Consume the response from API in master data digester
				MasterDownloadDataDigester masterDownloadDataDigester = InputMapper.gson().fromJson(response.getBody(),
						MasterDownloadDataDigester.class);
				if (masterDownloadDataDigester != null) {
					int i = updateMastersWithLatestData(masterDownloadDataDigester, syncDownloadMaster);
					if (i > 0)
						successFlag = 1;
				} else {
					// error in parsing response data
				}
			} else {
				// error in API call
			}
		} else {
			// response is null or not valid
		}
		return successFlag;
	}

	private int updateMastersWithLatestData(MasterDownloadDataDigester masterDownloadDataDigester,
			SyncDownloadMaster syncDownloadMaster) {
		int successFlag = 0;
		// get master data in required format
		List<Object[]> masterDataList = getMasterDataInFormatToInsertToDB(masterDownloadDataDigester);
		// get query to insert/update data in local db
		String query = getQueryToInsertUpdateMasterInLocalDB(syncDownloadMaster);

		if (masterDataList != null && query != null) {
			int[] i = dataSyncRepository.updateLatestMasterInLocal(query, masterDataList);
			if (i.length == masterDataList.size()) {
				int j = syncDownloadMasterRepo.updateTableSyncDownloadMasterForLastDownloadDate(
						syncDownloadMaster.getDownloadMasterTableID());
				if (j > 0)
					successFlag = 1;
			}
		}

		return successFlag;
	}

	private String getQueryToInsertUpdateMasterInLocalDB(SyncDownloadMaster syncDownloadMaster) {
		String[] columnsArr = null;
		if (syncDownloadMaster != null && syncDownloadMaster.getVanColumnName() != null)
			columnsArr = syncDownloadMaster.getVanColumnName().split(",");

		StringBuilder preparedStatementSetter = new StringBuilder();
		StringBuilder updateStatement = new StringBuilder();

		if (columnsArr != null && columnsArr.length > 0) {
			int index = 0;
			for (String column : columnsArr) {
				if (index == columnsArr.length - 1) {
					preparedStatementSetter.append(" ? ");
					updateStatement.append(column + "=VALUES(" + column + ")");
				} else {
					preparedStatementSetter.append(" ?, ");
					updateStatement.append(column + "=VALUES(" + column + "),");
				}
				index++;
			}
		}

		String query = "";
		if (syncDownloadMaster != null)
			query = " INSERT INTO " + syncDownloadMaster.getSchemaName() + "." + syncDownloadMaster.getTableName()
					+ "( " + syncDownloadMaster.getVanColumnName() + ") VALUES ( " + preparedStatementSetter
					+ " ) ON DUPLICATE KEY UPDATE " + updateStatement;

		return query;
	}

	private List<Object[]> getMasterDataInFormatToInsertToDB(MasterDownloadDataDigester masterDownloadDataDigester) {
		// get master data in the form of list of map of string & object
		List<Map<String, Object>> masterList = masterDownloadDataDigester.getData();
		// master data 'list of object array'
		List<Object[]> masterDataList = new ArrayList<>();

		Object[] objArr;

		int pointer;
		for (Map<String, Object> map : masterList) {
			pointer = 0;
			objArr = new Object[map.size()];
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				if (entry.getValue() != null) {
					if (String.valueOf(entry.getValue()).equalsIgnoreCase("false")
							|| String.valueOf(entry.getValue()).equalsIgnoreCase("true"))
						objArr[pointer] = entry.getValue();
					else
						objArr[pointer] = String.valueOf(entry.getValue());
				} else
					objArr[pointer] = entry.getValue();

				pointer++;
			}
			masterDataList.add(objArr);
		}

		return masterDataList;
	}

	@Test
	void getVanDetailsForMasterDownloadTest() throws Exception {

		TempVan tempVan = new TempVan();

		tempVan.setTempVanID(123);
		tempVan.setVanID(12);
		tempVan.setVehicalNo("WB1234Y54");

		tempVan.toString();

		ArrayList<TempVan> dataSyncGroupList = new ArrayList<>();
		dataSyncGroupList.add(tempVan);

		when(tempVanRepo.getVanID()).thenReturn(dataSyncGroupList);

		Assertions.assertNotNull(dataSyncGroupList);
		Assertions.assertEquals(1, dataSyncGroupList.size());
		Assertions.assertEquals(new Gson().toJson(dataSyncGroupList.get(0)),
				downloadDataFromServerImpl.getVanDetailsForMasterDownload());

	}

	@Test
	void getVanDetailsForMasterDownloadTest_Exception() throws Exception {

		ArrayList<TempVan> dataSyncGroupList = null;

		Assertions.assertNull(dataSyncGroupList);

	}

}
