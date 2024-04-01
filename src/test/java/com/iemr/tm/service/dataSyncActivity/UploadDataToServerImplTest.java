package com.iemr.tm.service.dataSyncActivity;

import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.iemr.tm.data.syncActivity_syncLayer.DataSyncGroups;
import com.iemr.tm.data.syncActivity_syncLayer.SyncUtilityClass;
import com.iemr.tm.repo.syncActivity_syncLayer.DataSyncGroupsRepo;

@ExtendWith(MockitoExtension.class)
class UploadDataToServerImplTest {

	@InjectMocks
	UploadDataToServerImpl uploadDataToServerImpl;

	@Value("${dataSyncUploadUrl}")
	private String dataSyncUploadUrl;

	@Mock
	private DataSyncRepository dataSyncRepository;
	@Mock
	private DataSyncGroupsRepo dataSyncGroupsRepo;

	// batch size for data upload
	private static final int BATCH_SIZE = 30;

	@Test
	void getVanAndServerColumnsTest() throws Exception {

		Integer groupID = 1;

		SyncUtilityClass syncUtilityClass = new SyncUtilityClass();

		syncUtilityClass.setSyncTableDetailID(123);
		syncUtilityClass.setSchemaName("DBA");
		syncUtilityClass.setServerColumnName("Coloumn1");
		syncUtilityClass.setSyncTableGroupID(234);
		syncUtilityClass.setTableName("DB");
		syncUtilityClass.setDataClassName("Class Data");
		syncUtilityClass.setDeleted(false);
		syncUtilityClass.setVanAutoIncColumnName("vanAutoIncColumnName");
		syncUtilityClass.setVanColumnName("vanColumnName");
		syncUtilityClass.setIsMaster(true);

		syncUtilityClass.toString();

		List<SyncUtilityClass> syncUtilityClassList = new ArrayList<SyncUtilityClass>();

		syncUtilityClassList.add(syncUtilityClass);

		when(dataSyncRepository.getVanAndServerColumnList(groupID)).thenReturn(syncUtilityClassList);

		Assertions.assertEquals(syncUtilityClassList, uploadDataToServerImpl.getVanAndServerColumns(groupID));

	}

	@Test
	void getDataToSyncTest() throws Exception {

		String schemaName = "S";
		String tableName = "T";
		String columnNames = "C";

		SyncUtilityClass syncUtilityClass = new SyncUtilityClass();

		syncUtilityClass.setSyncTableDetailID(123);
		syncUtilityClass.setSchemaName("DBA");
		syncUtilityClass.setServerColumnName("Coloumn1");
		syncUtilityClass.setSyncTableGroupID(234);
		syncUtilityClass.setTableName("DB");
		syncUtilityClass.setDataClassName("Class Data");
		syncUtilityClass.setDeleted(false);
		syncUtilityClass.setVanAutoIncColumnName("vanAutoIncColumnName");
		syncUtilityClass.setVanColumnName("vanColumnName");
		syncUtilityClass.setIsMaster(true);

		syncUtilityClass.toString();

		Map<String, Object> mapSync = new HashMap<>();

		mapSync.put("syncUtilityClass", syncUtilityClass);

		List<Map<String, Object>> resultSetList = new ArrayList<Map<String, Object>>();

		resultSetList.add(mapSync);

		when(dataSyncRepository.getDataForGivenSchemaAndTable(schemaName, tableName, columnNames))
				.thenReturn(resultSetList);

		Assertions.assertEquals(resultSetList,
				uploadDataToServerImpl.getDataToSync(schemaName, tableName, columnNames));
	}

	@Test
	void getDataSyncGroupDetailsNotNullTest() {

		DataSyncGroups dataSyncGroups = new DataSyncGroups(12, "syncTableGroupName", "syncTableGroupDesc", false, "U",
				"AK Hossain", Timestamp.valueOf("2020-09-09 12:09:08"), "modifiedBy",
				Timestamp.valueOf("2020-09-09 12:09:09"));

		dataSyncGroups.toString();

		ArrayList<DataSyncGroups> dataSyncGroupList = new ArrayList<DataSyncGroups>();
		dataSyncGroupList.add(dataSyncGroups);

		when(dataSyncGroupsRepo.findByDeleted(false)).thenReturn(dataSyncGroupList);

		Assertions.assertEquals(new Gson().toJson(dataSyncGroupList), uploadDataToServerImpl.getDataSyncGroupDetails());

	}

	@Test
	void getDataSyncGroupDetailsAsNullTest() {

		ArrayList<DataSyncGroups> dataSyncGroupList = null;

		when(dataSyncGroupsRepo.findByDeleted(false)).thenReturn(dataSyncGroupList);

		Assertions.assertEquals(null, uploadDataToServerImpl.getDataSyncGroupDetails());
	}

	private List<Map<String, Object>> getBatchOfAskedSizeDataToSync(List<Map<String, Object>> syncData, int startIndex,
			int size) throws Exception {
		List<Map<String, Object>> syncDataOfBatchSize = syncData.subList(startIndex, (startIndex + size));
		return syncDataOfBatchSize;
	}

	public String syncDataToServer(String schemaName, String tableName, String vanAutoIncColumnName,
			String serverColumns, List<Map<String, Object>> dataToBesync, String user, String Authorization)
			throws Exception {

		RestTemplate restTemplate = new RestTemplate();

		// serialize null
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.serializeNulls();
		Gson gson = gsonBuilder.create();

		Map<String, Object> dataMap = new HashMap<>();
		dataMap.put("schemaName", schemaName);
		dataMap.put("tableName", tableName);
		dataMap.put("vanAutoIncColumnName", vanAutoIncColumnName);
		dataMap.put("serverColumns", serverColumns);
		dataMap.put("syncData", dataToBesync);
		dataMap.put("syncedBy", user);

		String requestOBJ = gson.toJson(dataMap);

		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add("Content-Type", "application/json");
		headers.add("AUTHORIZATION", Authorization);
		HttpEntity<Object> request = new HttpEntity<Object>(requestOBJ, headers);

		ResponseEntity<String> response = restTemplate.exchange(dataSyncUploadUrl, HttpMethod.POST, request,
				String.class);

		/**
		 * if data successfully synced then getVanSerialNo of synced data to update
		 * processed flag
		 */
		int i = 0;
		if (response != null && response.hasBody()) {
			JSONObject obj = new JSONObject(response.getBody());
			if (obj != null && obj.has("statusCode") && obj.getInt("statusCode") == 200) {
				StringBuilder vanSerialNos = getVanSerialNoListForSyncedData(vanAutoIncColumnName, dataToBesync);
				// update table for processed flag = "P"

				i = dataSyncRepository.updateProcessedFlagInVan(schemaName, tableName, vanSerialNos,
						vanAutoIncColumnName, user);
			}
		}
		if (i > 0)
			return "Data successfully synced";
		else
			return null;
	}

	public StringBuilder getVanSerialNoListForSyncedData(String vanAutoIncColumnName,
			List<Map<String, Object>> dataToBesync) throws Exception {
		// comma separated van serial no
		StringBuilder vanSerialNos = new StringBuilder();

		int pointer1 = 0;
		for (Map<String, Object> map : dataToBesync) {
			if (pointer1 == dataToBesync.size() - 1)
				vanSerialNos.append(map.get(vanAutoIncColumnName.trim()));
			else
				vanSerialNos.append(map.get(vanAutoIncColumnName.trim()) + ",");

			pointer1++;
		}
		return vanSerialNos;
	}

}
