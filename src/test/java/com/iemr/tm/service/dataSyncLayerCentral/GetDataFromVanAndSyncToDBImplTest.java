package com.iemr.tm.service.dataSyncLayerCentral;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iemr.tm.data.syncActivity_syncLayer.SyncUploadDataDigester;

@ExtendWith(MockitoExtension.class)
class GetDataFromVanAndSyncToDBImplTest {

    @Mock
    private DataSyncRepositoryCentral mockDataSyncRepositoryCentral;

    @InjectMocks
    private GetDataFromVanAndSyncToDBImpl getDataFromVanAndSyncToDBImplUnderTest;

    

    @Test
    void testUpdate_M_BeneficiaryRegIdMapping_for_provisioned_benID() {
        // Setup
        final SyncUploadDataDigester syncUploadDataDigester = new SyncUploadDataDigester();
        syncUploadDataDigester.setSchemaName("schemaName");
        syncUploadDataDigester.setTableName("tableName");
        syncUploadDataDigester.setVanAutoIncColumnName("vanAutoIncColumnName");
        syncUploadDataDigester.setServerColumns("serverColumns");
        syncUploadDataDigester.setSyncData(List.of(Map.ofEntries(Map.entry("value", "value"))));
        syncUploadDataDigester.setSyncedBy("syncedBy");

        syncUploadDataDigester.toString();
        
        // Run the test
        final String result = getDataFromVanAndSyncToDBImplUnderTest.update_M_BeneficiaryRegIdMapping_for_provisioned_benID(
                syncUploadDataDigester);

        // Verify the results
        assertThat(result).isEqualTo("data sync passed");
    }

    @Test
    void testUpdate_M_BeneficiaryRegIdMapping_for_provisioned_benID_DataSyncRepositoryCentralReturnsNoItems() {
        // Setup
        final SyncUploadDataDigester syncUploadDataDigester = new SyncUploadDataDigester();
        syncUploadDataDigester.setSchemaName("schemaName");
        syncUploadDataDigester.setTableName("tableName");
        syncUploadDataDigester.setVanAutoIncColumnName("vanAutoIncColumnName");
        syncUploadDataDigester.setServerColumns("serverColumns");
        syncUploadDataDigester.setSyncData(List.of(Map.ofEntries(Map.entry("value", "value"))));
        syncUploadDataDigester.setSyncedBy("syncedBy");

        syncUploadDataDigester.toString();
        
        // Run the test
        final String result = getDataFromVanAndSyncToDBImplUnderTest.update_M_BeneficiaryRegIdMapping_for_provisioned_benID(
                syncUploadDataDigester);

        // Verify the results
        assertThat(result).isEqualTo("data sync passed");
    }

   
}
