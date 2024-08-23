package com.iemr.tm.service.dataSyncLayerCentral;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iemr.tm.data.syncActivity_syncLayer.SyncDownloadMaster;

@ExtendWith(MockitoExtension.class)
class GetMasterDataFromCentralForVanImplTest {

	@Mock
	private DataSyncRepositoryCentral mockDataSyncRepositoryCentral;

	@InjectMocks
	private GetMasterDataFromCentralForVanImpl getMasterDataFromCentralForVanImplUnderTest;

	@Test
	void testGetMasterDataForVan_DataSyncRepositoryCentralThrowsException() throws Exception {
		// Setup
		final SyncDownloadMaster obj = new SyncDownloadMaster();
		obj.setSchemaName("schemaName");
		obj.setTableName("tableName");
		obj.setServerColumnName("serverColumnName");
		obj.setMasterType("masterType");
		obj.setLastDownloadDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		obj.setVanID(0);
		obj.setProviderServiceMapID(0);
		
		obj.toString();

		when(mockDataSyncRepositoryCentral.getMasterDataFromTable("schemaName", "tableName", "serverColumnName",
				"masterType", Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)), 0, 0))
				.thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> getMasterDataFromCentralForVanImplUnderTest.getMasterDataForVan(obj))
				.isInstanceOf(Exception.class);
	}
}
