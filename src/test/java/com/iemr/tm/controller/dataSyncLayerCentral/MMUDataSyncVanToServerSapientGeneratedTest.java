package com.iemr.tm.controller.dataSyncLayerCentral;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.service.dataSyncLayerCentral.GetMasterDataFromCentralForVanImpl;
import com.iemr.tm.data.syncActivity_syncLayer.SyncDownloadMaster;
import com.iemr.tm.service.dataSyncLayerCentral.GetDataFromVanAndSyncToDBImpl;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class MMUDataSyncVanToServerSapientGeneratedTest {

    private final GetDataFromVanAndSyncToDBImpl getDataFromVanAndSyncToDBImplMock = mock(GetDataFromVanAndSyncToDBImpl.class, "getDataFromVanAndSyncToDBImpl");

    private final GetMasterDataFromCentralForVanImpl getMasterDataFromCentralForVanImplMock = mock(GetMasterDataFromCentralForVanImpl.class, "getMasterDataFromCentralForVanImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private MMUDataSyncVanToServer target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${754506d5-dace-35db-a867-4b07718ebad3}, hash: 4038ED07ECEB726C56F655CE43A674C7
    @Test()
    void dataSyncToServerWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new MMUDataSyncVanToServer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(getDataFromVanAndSyncToDBImplMock).syncDataToServer("requestOBJ1", "Authorization1");
        //Act Statement(s)
        String result = target.dataSyncToServer("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(getDataFromVanAndSyncToDBImplMock).syncDataToServer("requestOBJ1", "Authorization1");
        });
    }

    //Sapient generated method id: ${d45c485e-e96e-33cd-9fe5-09426fe9c62f}, hash: EA07D279ADA56D11C43C2B35E45441CF
    @Test()
    void dataSyncToServerWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new MMUDataSyncVanToServer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(getDataFromVanAndSyncToDBImplMock).syncDataToServer("requestOBJ1", "Authorization1");
        //Act Statement(s)
        String result = target.dataSyncToServer("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"data dync failed\",\"status\":\"data dync failed\"}"));
            verify(getDataFromVanAndSyncToDBImplMock).syncDataToServer("requestOBJ1", "Authorization1");
        });
    }

    //Sapient generated method id: ${2c68e7b6-a249-33a9-9acc-26828d187460}, hash: F18E2686970E7EE99AD1ADFA534E490A
    @Test()
    void dataSyncToServerWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new MMUDataSyncVanToServer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(getDataFromVanAndSyncToDBImplMock).syncDataToServer("requestOBJ1", "Authorization1");
        //Act Statement(s)
        String result = target.dataSyncToServer("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(getDataFromVanAndSyncToDBImplMock).syncDataToServer("requestOBJ1", "Authorization1");
        });
    }

    //Sapient generated method id: ${6601b22f-a10a-37b1-9d66-d9052554ae3e}, hash: B51BC1014CD097CC382D7F1DAD87A6AA
    @Test()
    void dataSyncToServerWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new MMUDataSyncVanToServer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(getDataFromVanAndSyncToDBImplMock).syncDataToServer("requestOBJ1", "Authorization1");
        //Act Statement(s)
        String result = target.dataSyncToServer("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"data dync failed\",\"status\":\"data dync failed\"}"));
            verify(getDataFromVanAndSyncToDBImplMock).syncDataToServer("requestOBJ1", "Authorization1");
        });
    }

    //Sapient generated method id: ${d02e40c7-0f8b-3800-846f-7ecb6776b0a7}, hash: D30A5A2DE7C93365F9433616BF297DD6
    @Test()
    void dataDownloadFromServerWhenSyncDownloadMasterIsNull() throws Exception {
        /* Branches:* (syncDownloadMaster != null) : false*/
        //Arrange Statement(s)
        target = new MMUDataSyncVanToServer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        SyncDownloadMaster syncDownloadMaster = null;
        //Act Statement(s)
        String result = target.dataDownloadFromServer(syncDownloadMaster, "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":null,\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${e186aa72-05c0-3d66-bb9a-b172d1010716}, hash: 3EA20C56F8E16BFC1C686CEB4636DCBB
    @Test()
    void dataDownloadFromServerWhenSIsNotNull() throws Exception {
        /* Branches:* (syncDownloadMaster != null) : true* (s != null) : true*/
        //Arrange Statement(s)
        target = new MMUDataSyncVanToServer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        SyncDownloadMaster syncDownloadMasterMock = mock(SyncDownloadMaster.class);
        doReturn("A").when(getMasterDataFromCentralForVanImplMock).getMasterDataForVan(syncDownloadMasterMock);
        //Act Statement(s)
        String result = target.dataDownloadFromServer(syncDownloadMasterMock, "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(getMasterDataFromCentralForVanImplMock).getMasterDataForVan(syncDownloadMasterMock);
        });
    }

    //Sapient generated method id: ${086f6000-ca6f-388c-9e3d-0d50cac4e01f}, hash: C54B6A320C5BF0A59AB2F0E070A6FE92
    @Test()
    void dataDownloadFromServerWhenSIsNull() throws Exception {
        /* Branches:* (syncDownloadMaster != null) : true* (s != null) : false*/
        //Arrange Statement(s)
        target = new MMUDataSyncVanToServer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        SyncDownloadMaster syncDownloadMaster = new SyncDownloadMaster();
        syncDownloadMaster.setSchemaName("A");
        syncDownloadMaster.setTableName("B");
        doReturn(null).when(getMasterDataFromCentralForVanImplMock).getMasterDataForVan(syncDownloadMaster);
        //Act Statement(s)
        String result = target.dataDownloadFromServer(syncDownloadMaster, "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":null,\"statusCode\":5000,\"errorMessage\":\"Error in master download for table A.B\",\"status\":\"Error in master download for table A.B\"}"));
            verify(getMasterDataFromCentralForVanImplMock).getMasterDataForVan(syncDownloadMaster);
        });
    }

    //Sapient generated method id: ${b13226e3-c079-3618-b65b-84db4c3690c0}, hash: 67B0A03448D68C55840F20D438DD0A20
    @Test()
    void dataDownloadFromServerWhenCaughtException() throws Exception {
        /* Branches:* (syncDownloadMaster != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new MMUDataSyncVanToServer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        SyncDownloadMaster syncDownloadMaster = null;
        //Act Statement(s)
        String result = target.dataDownloadFromServer(syncDownloadMaster, "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":null,\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${2e742dce-d6f1-395f-9a26-93508aedc3c3}, hash: 4FF590B3D71CB33A2A1B583C74BEECD8
    @Test()
    void dataDownloadFromServerWhenSIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (syncDownloadMaster != null) : true* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new MMUDataSyncVanToServer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        SyncDownloadMaster syncDownloadMasterMock = mock(SyncDownloadMaster.class);
        doReturn("A").when(getMasterDataFromCentralForVanImplMock).getMasterDataForVan(syncDownloadMasterMock);
        //Act Statement(s)
        String result = target.dataDownloadFromServer(syncDownloadMasterMock, "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(getMasterDataFromCentralForVanImplMock).getMasterDataForVan(syncDownloadMasterMock);
        });
    }

    //Sapient generated method id: ${ed73dac8-1d85-398e-a7bc-8c62a5f921de}, hash: D3FE8F7AEB023DA06C2B47A0E092480A
    @Test()
    void dataDownloadFromServerWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (syncDownloadMaster != null) : true* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new MMUDataSyncVanToServer();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        SyncDownloadMaster syncDownloadMaster = new SyncDownloadMaster();
        syncDownloadMaster.setSchemaName("A");
        syncDownloadMaster.setTableName("B");
        doReturn(null).when(getMasterDataFromCentralForVanImplMock).getMasterDataForVan(syncDownloadMaster);
        //Act Statement(s)
        String result = target.dataDownloadFromServer(syncDownloadMaster, "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":null,\"statusCode\":5000,\"errorMessage\":\"Error in master download for table A.B\",\"status\":\"Error in master download for table A.B\"}"));
            verify(getMasterDataFromCentralForVanImplMock).getMasterDataForVan(syncDownloadMaster);
        });
    }
}
