package com.iemr.tm.controller.ncdCare;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.google.gson.JsonObject;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.service.ncdCare.NCDCareServiceImpl;

import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class NCDCareControllerSapientGeneratedTest {

    private final NCDCareServiceImpl ncdCareServiceImplMock = mock(NCDCareServiceImpl.class, "ncdCareServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private NCDCareController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${3cd22b1d-32f7-3789-868c-ccf52cdeafb3}, hash: F3BBBC25542424EE769CCCD582894334
    @Disabled()
    @Test()
    void saveBenNCDCareNurseDataWhenJsnOBJIsNotNull() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : true*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(ncdCareServiceImplMock).saveNCDCareNurseData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenNCDCareNurseData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ncdCareServiceImplMock).saveNCDCareNurseData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${274050fb-a0af-32c4-a7b5-74a0d55acaa6}, hash: EAA23B177E6B32AB215E10B98C5F7305
    @Disabled()
    @Test()
    void saveBenNCDCareNurseDataWhenJsnOBJIsNull() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenNCDCareNurseData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid Request !!!\",\"status\":\"Invalid Request !!!\"}")));
    }

    //Sapient generated method id: ${6958d2c9-9efd-32e0-9220-8a3b71a9f7e6}, hash: B0F8558DF33CD257D89BC7E6F6AA0A29
    @Disabled()
    @Test()
    void saveBenNCDCareNurseDataWhenCaughtException() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(ncdCareServiceImplMock).saveNCDCareNurseData((JsonObject) any(), eq("<value>"));
        doNothing().when(ncdCareServiceImplMock).deleteVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.saveBenNCDCareNurseData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"F\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(ncdCareServiceImplMock).saveNCDCareNurseData((JsonObject) any(), eq("<value>"));
            verify(ncdCareServiceImplMock).deleteVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${3b56e9b2-bfb4-35d5-b6d7-9964f5f219fb}, hash: 64807D65A0D484BD0C1EFD87D29A1571
    @Disabled()
    @Test()
    void saveBenNCDCareNurseDataWhenJsnOBJIsNullAndCaughtException() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(ncdCareServiceImplMock).saveNCDCareNurseData((JsonObject) any(), eq("<value>"));
        doNothing().when(ncdCareServiceImplMock).deleteVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.saveBenNCDCareNurseData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"B\",\"status\":\"B\"}"));
            verify(ncdCareServiceImplMock).saveNCDCareNurseData((JsonObject) any(), eq("<value>"));
            verify(ncdCareServiceImplMock).deleteVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${6ad4a3b3-8659-3047-a9ed-6b63200e0232}, hash: 1D023BC280013B4BCBCBE2F85FCF4294
    @Disabled()
    @Test()
    void saveBenNCDCareDoctorDataWhenJsnOBJIsNull() throws Exception {
        /* Branches:* (jsnOBJ != null) : false*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenNCDCareDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"Invalid request\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}")));
    }

    //Sapient generated method id: ${99b5079f-0c4e-3c65-b609-215fff4ae922}, hash: 379AFCF6C9AF9ECCAA42B69D9302BF8F
    @Disabled()
    @Test()
    void saveBenNCDCareDoctorDataWhenCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenNCDCareDoctorData("<valid_request_object>", "<valid_authorization>");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"Invalid request\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}")));
    }

    //Sapient generated method id: ${2778ebd0-bc97-32b2-913a-9f39598d0cde}, hash: 1B6C3F5CF2AFE00E89C2E8AB44E35152
    @Disabled()
    @Test()
    void saveBenNCDCareDoctorDataWhenNcdCareResGreaterThan0() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != ncdCareRes) : true* (ncdCareRes > 0) : true*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1L).when(ncdCareServiceImplMock).saveDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenNCDCareDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data saved successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ncdCareServiceImplMock).saveDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${d7a2eb82-6668-3348-98c3-dd439af7ef36}, hash: 962C7561267A5332D9C91FFB68297811
    @Disabled()
    @Test()
    void saveBenNCDCareDoctorDataWhenNcdCareResNotGreaterThan0() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != ncdCareRes) : true* (ncdCareRes > 0) : false*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1L).when(ncdCareServiceImplMock).saveDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenNCDCareDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Unable to save data\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ncdCareServiceImplMock).saveDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${d3cfbc2d-2a00-324e-9451-2445681b14fb}, hash: 7B69B7883C4E631D61DFF752C7E6D988
    @Disabled()
    @Test()
    void saveBenNCDCareDoctorDataWhenNcdCareResGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != ncdCareRes) : true* (ncdCareRes > 0) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(ncdCareServiceImplMock).saveDoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.saveBenNCDCareDoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data saved successfully\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(ncdCareServiceImplMock).saveDoctorData((JsonObject) any(), eq("<value>"));
        });
    }

    //Sapient generated method id: ${c683e070-a5b2-3c0f-88bc-4b0fb31018c5}, hash: 34CB73E14833E2D81CC9BC3585419E4E
    @Disabled()
    @Test()
    void saveBenNCDCareDoctorDataWhenNcdCareResNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != ncdCareRes) : true* (ncdCareRes > 0) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(ncdCareServiceImplMock).saveDoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.saveBenNCDCareDoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Unable to save data\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(ncdCareServiceImplMock).saveDoctorData((JsonObject) any(), eq("<value>"));
        });
    }

    //Sapient generated method id: ${15d0a952-266a-3ece-a596-edc733390628}, hash: C2D5E4405F48303DB489484E343ECB7C
    @Disabled()
    @Test()
    void getBenVisitDetailsFrmNurseNCDCareWhenObjLengthGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ncdCareServiceImplMock).getBenVisitDetailsFrmNurseNCDCare(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseNCDCare("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ncdCareServiceImplMock).getBenVisitDetailsFrmNurseNCDCare(1L, 1L);
        });
    }

    //Sapient generated method id: ${6c32149e-07ea-3d26-85c6-c3f1345cf1e7}, hash: A1A97E496739D200F5E6BBA872FF33E3
    @Disabled()
    @Test()
    void getBenVisitDetailsFrmNurseNCDCareWhenObjLengthNotGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseNCDCare("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${4d183e3a-bb80-3c7f-bc84-20112f430e38}, hash: 3C6B201A98DE270FBE51EBF72DA675EE
    @Disabled()
    @Test()
    void getBenVisitDetailsFrmNurseNCDCareWhenCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ncdCareServiceImplMock).getBenVisitDetailsFrmNurseNCDCare(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseNCDCare("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary visit data\",\"status\":\"Error while getting beneficiary visit data\"}"));
            verify(ncdCareServiceImplMock).getBenVisitDetailsFrmNurseNCDCare(1L, 1L);
        });
    }

    //Sapient generated method id: ${7213ddb4-639f-37d1-8980-712d8c9106e3}, hash: D62484F0EECD6FF71F7BAFCBAC34BF5B
    @Test()
    void getBenVisitDetailsFrmNurseNCDCareWhenObjLengthNotGreaterThan1AndCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseNCDCare("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary visit data\",\"status\":\"Error while getting beneficiary visit data\"}")));
    }

    //Sapient generated method id: ${60f38e91-584b-33d7-9df4-d67ebe135955}, hash: AA0AB5AB1F12FA41FF4C39DA1339FCE8
    @Disabled()
    @Test()
    void getBenNCDCareHistoryDetailsWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ncdCareServiceImplMock).getBenNCDCareHistoryDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenNCDCareHistoryDetails("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ncdCareServiceImplMock).getBenNCDCareHistoryDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${a32ca23b-654d-3566-9fd7-ff3b3c2cc8fd}, hash: E42A0194CC05E96D8329C010E646289F
    @Disabled()
    @Test()
    void getBenNCDCareHistoryDetailsWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenNCDCareHistoryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${16baf52d-7905-3546-91ed-18f36e7f3d8e}, hash: 298873624182442ACE3AFF7164D306EA
    @Disabled()
    @Test()
    void getBenNCDCareHistoryDetailsWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ncdCareServiceImplMock).getBenNCDCareHistoryDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenNCDCareHistoryDetails("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary history data\",\"status\":\"Error while getting beneficiary history data\"}"));
            verify(ncdCareServiceImplMock).getBenNCDCareHistoryDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${27bf62c6-9e59-37c1-8805-08e75d233663}, hash: 031A73E61813BCD0E1E10D0E14672D23
    @Test()
    void getBenNCDCareHistoryDetailsWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenNCDCareHistoryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary history data\",\"status\":\"Error while getting beneficiary history data\"}")));
    }

    //Sapient generated method id: ${9f366ef8-b1be-3f96-9382-d692d2f91e16}, hash: EA98216BD3FAC1E4CEAC9A025D9D5CF8
    @Disabled()
    @Test()
    void getBenVitalDetailsFrmNurseNCDCareWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ncdCareServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurseNCDCare("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ncdCareServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${6ef8bd29-6a8f-34e4-b33b-cd3ca9e60933}, hash: C59207DFB60959129B18A3BF584F9B31
    @Disabled()
    @Test()
    void getBenVitalDetailsFrmNurseNCDCareWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurseNCDCare("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${7a7b1fe9-99f4-381f-834e-dd7f6f8623c5}, hash: 4725C1C10D15F21AE3025C1E289DEEB2
    @Disabled()
    @Test()
    void getBenVitalDetailsFrmNurseNCDCareWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ncdCareServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurseNCDCare("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary vital data\",\"status\":\"Error while getting beneficiary vital data\"}"));
            verify(ncdCareServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${f90e7cf1-8959-3d4c-bb92-323894ef74a2}, hash: E41FABD996BD2ACBF7311ADD0A1AC8B0
    @Test()
    void getBenVitalDetailsFrmNurseNCDCareWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurseNCDCare("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary vital data\",\"status\":\"Error while getting beneficiary vital data\"}")));
    }

    //Sapient generated method id: ${0e98efa8-744d-3265-9b6c-a311cd506e50}, hash: 2054C07197DB8889D620DBC23EC11148
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorNCDCareWhenObjHasVisitCode() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ncdCareServiceImplMock).getBenCaseRecordFromDoctorNCDCare(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorNCDCare("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ncdCareServiceImplMock).getBenCaseRecordFromDoctorNCDCare(1L, 1L);
        });
    }

    //Sapient generated method id: ${4088181b-d1ef-31e8-847f-207c0b6a5444}, hash: B3E157853FB399D8A9D8507C0C186021
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorNCDCareWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorNCDCare("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${02fdfb53-8de8-3d0b-8769-54969e1f31a6}, hash: 57C196664DF489E36E4CB5F0BD635626
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorNCDCareWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ncdCareServiceImplMock).getBenCaseRecordFromDoctorNCDCare(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorNCDCare("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary doctor data\",\"status\":\"Error while getting beneficiary doctor data\"}"));
            verify(ncdCareServiceImplMock).getBenCaseRecordFromDoctorNCDCare(1L, 1L);
        });
    }

    //Sapient generated method id: ${0b8a6663-4a0f-3b08-8e0a-3c769206a695}, hash: B03785E935C1A04A7D64A2BF52E765F2
    @Test()
    void getBenCaseRecordFromDoctorNCDCareWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorNCDCare("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary doctor data\",\"status\":\"Error while getting beneficiary doctor data\"}")));
    }

    //Sapient generated method id: ${fde89bde-3fdb-30d7-8379-3744b518545e}, hash: 6C435C873B18272BD59E66345FB3FC49
    @Disabled()
    @Test()
    void updateHistoryNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(ncdCareServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ncdCareServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${67f6c3dc-fb90-3f6d-b452-6d925ed0118c}, hash: 28687D4B6ECB4CD49534DCB7507B0A58
    @Disabled()
    @Test()
    void updateHistoryNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(ncdCareServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ncdCareServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${5a58c2ce-8dea-39fc-9583-19be45a14aa5}, hash: E1FE742AF80C55B6F615FEBD30E40C85
    @Disabled()
    @Test()
    void updateHistoryNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(ncdCareServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ncdCareServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${b72d41d2-b3eb-3369-8b5e-b4c82b438381}, hash: 9144AF5F003419001F6A9FB3AEDFE278
    @Disabled()
    @Test()
    void updateHistoryNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(ncdCareServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ncdCareServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${c08c7ced-363f-30e2-9153-a015daa1fb13}, hash: 905B81CDBC0E2DC732F252E7B0DD432C
    @Disabled()
    @Test()
    void updateVitalNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(ncdCareServiceImplMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ncdCareServiceImplMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${3d31ac92-1575-3b5a-8866-a9569579c1e7}, hash: B5552482F628E7A4BF830DBFAB1B677D
    @Disabled()
    @Test()
    void updateVitalNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(ncdCareServiceImplMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ncdCareServiceImplMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${d996a484-7d33-3c31-b4de-388c54dae395}, hash: 953BAAE445B00ABB2729707B156CA209
    @Disabled()
    @Test()
    void updateVitalNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(ncdCareServiceImplMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ncdCareServiceImplMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${ec1b2b7c-0f51-3eab-b499-6f651c0c3daa}, hash: 0B5F1452B6CDCF983C372DE98A60F7B4
    @Disabled()
    @Test()
    void updateVitalNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(ncdCareServiceImplMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ncdCareServiceImplMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${2dfd0e96-9d17-3f23-8a48-1623ee4a524e}, hash: AAD2AB77808E99E4D558124475D8651E
    @Disabled()
    @Test()
    void updateNCDCareDoctorDataWhenResultGreaterThan0() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : true*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1L).when(ncdCareServiceImplMock).updateNCDCareDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.updateNCDCareDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ncdCareServiceImplMock).updateNCDCareDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${67ae0a72-6b1b-39a0-be66-613ab3a3564e}, hash: B526403B9D4FD9C9D8BFDB2D3DD71772
    @Disabled()
    @Test()
    void updateNCDCareDoctorDataWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : false*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1L).when(ncdCareServiceImplMock).updateNCDCareDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.updateNCDCareDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ncdCareServiceImplMock).updateNCDCareDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${6210be9d-0cec-3ec5-8400-32c2ec93db43}, hash: 60BB9650BC8EE8C76289E42D8B554A91
    @Disabled()
    @Test()
    void updateNCDCareDoctorDataWhenCaughtException() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(ncdCareServiceImplMock).updateNCDCareDoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.updateNCDCareDoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(ncdCareServiceImplMock).updateNCDCareDoctorData((JsonObject) any(), eq("<value>"));
        });
    }

    //Sapient generated method id: ${567cf171-86aa-332f-8b44-8018b9a18754}, hash: B90A41D548DEC48841AEDC7352D7040F
    @Disabled()
    @Test()
    void updateNCDCareDoctorDataWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new NCDCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(ncdCareServiceImplMock).updateNCDCareDoctorData((JsonObject) any(), eq("Bearer token"));
        //Act Statement(s)
        String result = target.updateNCDCareDoctorData("{\"key1\": \"value1\", \"key2\": \"value2\"}", "Bearer token");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(ncdCareServiceImplMock).updateNCDCareDoctorData((JsonObject) any(), eq("Bearer token"));
        });
    }
}
