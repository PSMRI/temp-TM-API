package com.iemr.tm.controller.dataSyncActivity;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.service.dataSyncActivity.UploadDataToServerImpl;

import java.util.Map;
import java.util.HashMap;

import org.mockito.MockitoAnnotations;
import com.iemr.tm.service.dataSyncActivity.DownloadDataFromServerImpl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class StartSyncActivitySapientGeneratedTest {

    private final UploadDataToServerImpl uploadDataToServerImplMock = mock(UploadDataToServerImpl.class, "uploadDataToServerImpl");

    private final DownloadDataFromServerImpl downloadDataFromServerImplMock = mock(DownloadDataFromServerImpl.class, "downloadDataFromServerImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private StartSyncActivity target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${ccbac46f-69d0-3d45-89ca-e1b1eff56f0b}, hash: F0B1CCE9AC16170F65AE095CB5F3168F
    @Disabled()
    @Test()
    void dataSyncToServerWhenObjGetUserIsNull() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("groupID")) : true* (obj.get("groupID") != null) : true* (obj.has("user")) : true* (obj.get("user") != null) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.dataSyncToServer("requestOBJ1", "Authorization1", "ServerAuthorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":null,\"statusCode\":5000,\"errorMessage\":\"Invalid request, Either of groupID or user is invalid or null\",\"status\":\"Invalid request, Either of groupID or user is invalid or null\"}")));
    }

    //Sapient generated method id: ${754506d5-dace-35db-a867-4b07718ebad3}, hash: 704072B0D06E982F417CAEA8E4B0E8A6
    @Disabled()
    @Test()
    void dataSyncToServerWhenSIsNotNull() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("groupID")) : true* (obj.get("groupID") != null) : true* (obj.has("user")) : true* (obj.get("user") != null) : true* (s != null) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(uploadDataToServerImplMock).getDataToSyncToServer(0, "return_of_getString1", "ServerAuthorization1");
        //Act Statement(s)
        String result = target.dataSyncToServer("requestOBJ1", "Authorization1", "ServerAuthorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(uploadDataToServerImplMock).getDataToSyncToServer(0, "return_of_getString1", "ServerAuthorization1");
        });
    }

    //Sapient generated method id: ${d45c485e-e96e-33cd-9fe5-09426fe9c62f}, hash: EBCB3200480A50F1F5809FC80DECEFA8
    @Disabled()
    @Test()
    void dataSyncToServerWhenSIsNull() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("groupID")) : true* (obj.get("groupID") != null) : true* (obj.has("user")) : true* (obj.get("user") != null) : true* (s != null) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(uploadDataToServerImplMock).getDataToSyncToServer(1, "return_of_getString1", "ServerAuthorization1");
        //Act Statement(s)
        String result = target.dataSyncToServer("requestOBJ1", "Authorization1", "ServerAuthorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":null,\"statusCode\":5000,\"errorMessage\":\"Error in data sync\",\"status\":\"Error in data sync\"}"));
            verify(uploadDataToServerImplMock).getDataToSyncToServer(1, "return_of_getString1", "ServerAuthorization1");
        });
    }

    //Sapient generated method id: ${03c78ebf-f098-3c10-a57b-bdd145970579}, hash: ACD111660F00B57594EBBD008EE01006
    @Disabled()
    @Test()
    void dataSyncToServerWhenObjGetUserIsNullAndCaughtException() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("groupID")) : true* (obj.get("groupID") != null) : true* (obj.has("user")) : true* (obj.get("user") != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.dataSyncToServer("requestOBJ1", "Authorization1", "ServerAuthorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":null,\"statusCode\":5000,\"errorMessage\":\"Invalid request, Either of groupID or user is invalid or null\",\"status\":\"Invalid request, Either of groupID or user is invalid or null\"}")));
    }

    //Sapient generated method id: ${ddf9b032-fc7d-32d4-a604-e58f2dbed8f8}, hash: D367625279AFA685B6B05BE3377D94BB
    @Disabled()
    @Test()
    void dataSyncToServerWhenSIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("groupID")) : true* (obj.get("groupID") != null) : true* (obj.has("user")) : true* (obj.get("user") != null) : true* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(uploadDataToServerImplMock).getDataToSyncToServer(0, "return_of_getString1", "ServerAuthorization1");
        //Act Statement(s)
        String result = target.dataSyncToServer("requestOBJ1", "Authorization1", "ServerAuthorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(uploadDataToServerImplMock).getDataToSyncToServer(0, "return_of_getString1", "ServerAuthorization1");
        });
    }

    //Sapient generated method id: ${6601b22f-a10a-37b1-9d66-d9052554ae3e}, hash: E0C92617D53950BF07DFC95755D1B56C
    @Disabled()
    @Test()
    void dataSyncToServerWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("groupID")) : true* (obj.get("groupID") != null) : true* (obj.has("user")) : true* (obj.get("user") != null) : true* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(uploadDataToServerImplMock).getDataToSyncToServer(1, "return_of_getString1", "ServerAuthorization1");
        //Act Statement(s)
        String result = target.dataSyncToServer("requestOBJ1", "Authorization1", "ServerAuthorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":null,\"statusCode\":5000,\"errorMessage\":\"Error in data sync\",\"status\":\"Error in data sync\"}"));
            verify(uploadDataToServerImplMock).getDataToSyncToServer(1, "return_of_getString1", "ServerAuthorization1");
        });
    }

    //Sapient generated method id: ${bddd1a80-1657-30e3-b0b3-18c3213eba43}, hash: 7F0EA60A28B4E896449D70F0AEA3F753
    @Test()
    void getSyncGroupDetailsWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(uploadDataToServerImplMock).getDataSyncGroupDetails();
        //Act Statement(s)
        String result = target.getSyncGroupDetails();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(uploadDataToServerImplMock).getDataSyncGroupDetails();
        });
    }

    //Sapient generated method id: ${766194df-0a54-3f55-8b15-f29c42bf45ee}, hash: 0200237DB02E8C70DAF8744AE91ABB82
    @Test()
    void getSyncGroupDetailsWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(uploadDataToServerImplMock).getDataSyncGroupDetails();
        //Act Statement(s)
        String result = target.getSyncGroupDetails();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error in getting data sync group details\",\"status\":\"Error in getting data sync group details\"}"));
            verify(uploadDataToServerImplMock).getDataSyncGroupDetails();
        });
    }

    //Sapient generated method id: ${98bb8e9f-3fe6-3a13-9ef4-e17dc0eba0da}, hash: 56882FB342F748689A02C22AA7A69540
    @Test()
    void getSyncGroupDetailsWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(uploadDataToServerImplMock).getDataSyncGroupDetails();
        //Act Statement(s)
        String result = target.getSyncGroupDetails();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(uploadDataToServerImplMock).getDataSyncGroupDetails();
        });
    }

    //Sapient generated method id: ${f6f5e52a-088a-3a57-9d7b-cebb4caf8fb5}, hash: 11E9694FDDBE81858C2E7ACC8127C24E
    @Test()
    void getSyncGroupDetailsWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(uploadDataToServerImplMock).getDataSyncGroupDetails();
        //Act Statement(s)
        String result = target.getSyncGroupDetails();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error in getting data sync group details\",\"status\":\"Error in getting data sync group details\"}"));
            verify(uploadDataToServerImplMock).getDataSyncGroupDetails();
        });
    }

    //Sapient generated method id: ${7de7ade1-5c3c-34eb-a8d0-5213fd5a8733}, hash: FCD8C1A7F12D6848699B91ABFABF41C1
    @Disabled()
    @Test()
    void startMasterDownloadWhenObjGetProviderServiceMapIDIsNull() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("vanID")) : true* (obj.get("vanID") != null) : true* (obj.has("providerServiceMapID")) : true* (obj.get("providerServiceMapID") != null) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.startMasterDownload("requestOBJ1", "Authorization1", "ServerAuthorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"vanID / providerServiceMapID or both are missing, Kindly contact the administrator.\",\"status\":\"vanID / providerServiceMapID or both are missing, Kindly contact the administrator.\"}")));
    }

    //Sapient generated method id: ${7b017e0b-b02a-35c7-a2d2-3dfe40434196}, hash: 8F8BD07DCFDBBFEDA036FDA2D2ACB697
    @Disabled()
    @Test()
    void startMasterDownloadWhenSIsNull() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("vanID")) : true* (obj.get("vanID") != null) : true* (obj.has("providerServiceMapID")) : true* (obj.get("providerServiceMapID") != null) : true* (s != null) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(downloadDataFromServerImplMock).downloadMasterDataFromServer("ServerAuthorization1", 1, 1);
        //Act Statement(s)
        String result = target.startMasterDownload("requestOBJ1", "Authorization1", "ServerAuthorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000}"));
            verify(downloadDataFromServerImplMock).downloadMasterDataFromServer("ServerAuthorization1", 1, 1);
        });
    }

    //Sapient generated method id: ${b5002c84-17f0-313d-99d1-6d48b6d65ea6}, hash: 3F824180A83EED217C6EB3727D46A10F
    @Disabled()
    @Test()
    void startMasterDownloadWhenObjGetProviderServiceMapIDIsNullAndCaughtException() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("vanID")) : true* (obj.get("vanID") != null) : true* (obj.has("providerServiceMapID")) : true* (obj.get("providerServiceMapID") != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.startMasterDownload("requestOBJ1", "Authorization1", "ServerAuthorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"vanID / providerServiceMapID or both are missing, Kindly contact the administrator.\",\"status\":\"vanID / providerServiceMapID or both are missing, Kindly contact the administrator.\"}")));
    }

    //Sapient generated method id: ${ef75c859-6dce-3f87-a9b7-9a246c9f95dd}, hash: C9A103B6B086CECB2A3B7AAD3CD0EC0B
    @Disabled()
    @Test()
    void startMasterDownloadWhenSEqualsIgnoreCaseInProgress() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("vanID")) : true* (obj.get("vanID") != null) : true* (obj.has("providerServiceMapID")) : true* (obj.get("providerServiceMapID") != null) : true* (s != null) : true* (s.equalsIgnoreCase("inProgress")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("INPROGRESS").when(downloadDataFromServerImplMock).downloadMasterDataFromServer("ServerAuthorization1", 1, 1);
        //Act Statement(s)
        String result = target.startMasterDownload("requestOBJ1", "Authorization1", "ServerAuthorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Download is already in progress from different device, kindly wait to finish this\",\"status\":\"Download is already in progress from different device, kindly wait to finish this\"}"));
            verify(downloadDataFromServerImplMock).downloadMasterDataFromServer("ServerAuthorization1", 1, 1);
        });
    }

    //Sapient generated method id: ${241268c8-75cf-300d-88d2-6edc4c953854}, hash: 5B16CD9D03FFFB5ECC4C47160D73C7C6
    @Disabled()
    @Test()
    void startMasterDownloadWhenSNotEqualsIgnoreCaseInProgress() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("vanID")) : true* (obj.get("vanID") != null) : true* (obj.has("providerServiceMapID")) : true* (obj.get("providerServiceMapID") != null) : true* (s != null) : true* (s.equalsIgnoreCase("inProgress")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(downloadDataFromServerImplMock).downloadMasterDataFromServer("ServerAuthorization1", 1, 1);
        //Act Statement(s)
        String result = target.startMasterDownload("requestOBJ1", "Authorization1", "ServerAuthorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(downloadDataFromServerImplMock).downloadMasterDataFromServer("ServerAuthorization1", 1, 1);
        });
    }

    //Sapient generated method id: ${134f2060-585e-3273-8c0c-cf833a0159f5}, hash: C6C78146E8CA7184286EB69BFAFA30CF
    @Disabled()
    @Test()
    void startMasterDownloadWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("vanID")) : true* (obj.get("vanID") != null) : true* (obj.has("providerServiceMapID")) : true* (obj.get("providerServiceMapID") != null) : true* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(downloadDataFromServerImplMock).downloadMasterDataFromServer("ServerAuthorization1", 1, 1);
        //Act Statement(s)
        String result = target.startMasterDownload("requestOBJ1", "Authorization1", "ServerAuthorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000}"));
            verify(downloadDataFromServerImplMock).downloadMasterDataFromServer("ServerAuthorization1", 1, 1);
        });
    }

    //Sapient generated method id: ${ba5381de-c3ea-39a1-b9a6-67752ddc9b0e}, hash: E5F2B8FF05457557891C3DAD97B9EC41
    @Disabled()
    @Test()
    void startMasterDownloadWhenSEqualsIgnoreCaseInProgressAndCaughtException() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("vanID")) : true* (obj.get("vanID") != null) : true* (obj.has("providerServiceMapID")) : true* (obj.get("providerServiceMapID") != null) : true* (s != null) : true* (s.equalsIgnoreCase("inProgress")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("INPROGRESS").when(downloadDataFromServerImplMock).downloadMasterDataFromServer("ServerAuthorization1", 1, 1);
        //Act Statement(s)
        String result = target.startMasterDownload("requestOBJ1", "Authorization1", "ServerAuthorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Download is already in progress from different device, kindly wait to finish this\",\"status\":\"Download is already in progress from different device, kindly wait to finish this\"}"));
            verify(downloadDataFromServerImplMock).downloadMasterDataFromServer("ServerAuthorization1", 1, 1);
        });
    }

    //Sapient generated method id: ${3c788fb1-6cfa-34db-9e49-9d4629bb8f40}, hash: E01C2AE40D5B65B779201444983FE8DF
    @Disabled()
    @Test()
    void startMasterDownloadWhenSNotEqualsIgnoreCaseInProgressAndCaughtException() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("vanID")) : true* (obj.get("vanID") != null) : true* (obj.has("providerServiceMapID")) : true* (obj.get("providerServiceMapID") != null) : true* (s != null) : true* (s.equalsIgnoreCase("inProgress")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(downloadDataFromServerImplMock).downloadMasterDataFromServer("ServerAuthorization1", 1, 1);
        //Act Statement(s)
        String result = target.startMasterDownload("requestOBJ1", "Authorization1", "ServerAuthorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(downloadDataFromServerImplMock).downloadMasterDataFromServer("ServerAuthorization1", 1, 1);
        });
    }

    //Sapient generated method id: ${ee46c792-954e-301d-8ae4-56fb37f8defa}, hash: 45D67A42B1935CFBFD6B98556CE3E388
    @Disabled()
    @Test()
    void checkMastersDownloadProgressTest() throws Exception {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Map<String, Object> stringObjectMap = new HashMap<>();
        doReturn(stringObjectMap).when(downloadDataFromServerImplMock).getDownloadStatus();
        //Act Statement(s)
        String result = target.checkMastersDownloadProgress();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(downloadDataFromServerImplMock).getDownloadStatus();
        });
    }

    //Sapient generated method id: ${0e3672fc-b453-3944-8fe8-e99503c2c8f9}, hash: AA214BDC700D76E6D6D6B00DFC52C866
    @Disabled()
    @Test()
    void checkMastersDownloadProgressWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response, object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Map<String, Object> stringObjectMap = new HashMap<>();
        doReturn(stringObjectMap).when(downloadDataFromServerImplMock).getDownloadStatus();
        //Act Statement(s)
        String result = target.checkMastersDownloadProgress();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(downloadDataFromServerImplMock).getDownloadStatus();
        });
    }

    //Sapient generated method id: ${9496cb6c-babc-3db1-8f09-56df20ef7da6}, hash: 8903A7EA5BCD78CB9E26C30E114F7262
    @Test()
    void getVanDetailsForMasterDownloadWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(downloadDataFromServerImplMock).getVanDetailsForMasterDownload();
        //Act Statement(s)
        String result = target.getVanDetailsForMasterDownload();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(downloadDataFromServerImplMock).getVanDetailsForMasterDownload();
        });
    }

    //Sapient generated method id: ${4e7f9e50-e8ae-3b4e-a068-25a658faa04a}, hash: 9ED9275FCE3B09F04A681D13C2F4F0A1
    @Test()
    void getVanDetailsForMasterDownloadWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(downloadDataFromServerImplMock).getVanDetailsForMasterDownload();
        //Act Statement(s)
        String result = target.getVanDetailsForMasterDownload();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting van details.\",\"status\":\"Error while getting van details.\"}"));
            verify(downloadDataFromServerImplMock).getVanDetailsForMasterDownload();
        });
    }

    //Sapient generated method id: ${41abcb43-bb1d-39d4-ab02-80f1455b6b8e}, hash: 01A13BCE52FF8970A98F2AD82474D7B4
    @Test()
    void getVanDetailsForMasterDownloadWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(downloadDataFromServerImplMock).getVanDetailsForMasterDownload();
        //Act Statement(s)
        String result = target.getVanDetailsForMasterDownload();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(downloadDataFromServerImplMock).getVanDetailsForMasterDownload();
        });
    }

    //Sapient generated method id: ${c194c7ea-b3d6-3e3a-a889-2a9121b4ef2e}, hash: 47EF6C0E3DE222D4AB7D00CF10BE5FD1
    @Test()
    void getVanDetailsForMasterDownloadWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new StartSyncActivity();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(downloadDataFromServerImplMock).getVanDetailsForMasterDownload();
        //Act Statement(s)
        String result = target.getVanDetailsForMasterDownload();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting van details.\",\"status\":\"Error while getting van details.\"}"));
            verify(downloadDataFromServerImplMock).getVanDetailsForMasterDownload();
        });
    }
}
