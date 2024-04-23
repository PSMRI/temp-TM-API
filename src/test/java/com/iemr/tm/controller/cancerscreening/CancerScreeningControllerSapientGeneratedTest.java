package com.iemr.tm.controller.cancerscreening;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.google.gson.JsonObject;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.service.cancerScreening.CSServiceImpl;
import com.iemr.tm.data.doctor.CancerDiagnosis;
import org.mockito.MockedStatic;
import com.iemr.tm.data.nurse.BenCancerVitalDetail;
import com.iemr.tm.utils.mapper.InputMapper;

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
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CancerScreeningControllerSapientGeneratedTest {

    private final CSServiceImpl cSServiceImplMock = mock(CSServiceImpl.class, "cSServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private CancerScreeningController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${b0fcc84c-509f-3e9e-9aa3-c585d1425e2b}, hash: F32AD6C0D32ACDA6657ABFBD36A3B6C4
    @Disabled()
    @Test()
    void saveBenCancerScreeningNurseDataWhenJsnOBJIsNotNull() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : true*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(cSServiceImplMock).saveCancerScreeningNurseData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenCancerScreeningNurseData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cSServiceImplMock).saveCancerScreeningNurseData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${2d4119a8-62b0-36af-b70b-f5adbb4f3c44}, hash: 856583862D84C644053C990F9D154E9A
    @Disabled()
    @Test()
    void saveBenCancerScreeningNurseDataWhenJsnOBJIsNull() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenCancerScreeningNurseData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${13b8cd49-9d37-33a1-9640-49aee176b98a}, hash: 4400FD997B475A599C01DEAC291B5612
    @Disabled()
    @Test()
    void saveBenCancerScreeningNurseDataWhenCaughtException() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(cSServiceImplMock).saveCancerScreeningNurseData((JsonObject) any(), eq("<valid_value>"));
        doNothing().when(cSServiceImplMock).deleteVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.saveBenCancerScreeningNurseData("<valid_value>", "<valid_value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"D\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(cSServiceImplMock).saveCancerScreeningNurseData((JsonObject) any(), eq("<valid_value>"));
            verify(cSServiceImplMock).deleteVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${0a9a0a7a-9000-3501-948e-749fe6cab20b}, hash: C4B9875156E32F487B9055D74AB86FAE
    @Disabled()
    @Test()
    void saveBenCancerScreeningNurseDataWhenJsnOBJIsNullAndCaughtException() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(cSServiceImplMock).saveCancerScreeningNurseData((JsonObject) any(), eq("<valid_authorization>"));
        doNothing().when(cSServiceImplMock).deleteVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.saveBenCancerScreeningNurseData("<valid_request_object>", "<valid_authorization>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"B\",\"status\":\"B\"}"));
            verify(cSServiceImplMock).saveCancerScreeningNurseData((JsonObject) any(), eq("<valid_authorization>"));
            verify(cSServiceImplMock).deleteVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${1e47f690-853d-3bda-afd0-226408441107}, hash: 2576C9A738006ED6A18EAE371DA8F8FA
    @Disabled()
    @Test()
    void saveBenCancerScreeningDoctorDataWhenJsnOBJIsNull() throws Exception {
        /* Branches:* (jsnOBJ != null) : false*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenCancerScreeningDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${1a4a0202-87e0-353e-8e71-60c9ccf01c01}, hash: AE9ED2392530743596291F27A09779BC
    @Disabled()
    @Test()
    void saveBenCancerScreeningDoctorDataWhenCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenCancerScreeningDoctorData("valid_request", "valid_token");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}")));
    }

    //Sapient generated method id: ${348cddea-3f90-3133-86fd-d83a68dd15aa}, hash: 8D97F9785F9AD6A897CE33F605FA7288
    @Disabled()
    @Test()
    void saveBenCancerScreeningDoctorDataWhenCsDocDataSaveSuccessFlagGreaterThan0() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (csDocDataSaveSuccessFlag != null) : true* (csDocDataSaveSuccessFlag > 0) : true*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1L).when(cSServiceImplMock).saveCancerScreeningDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenCancerScreeningDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data saved successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cSServiceImplMock).saveCancerScreeningDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${8df5c3a4-273e-348e-a16d-68781ca86a32}, hash: AA0E2457E527AD5B44B838B29E300547
    @Disabled()
    @Test()
    void saveBenCancerScreeningDoctorDataWhenCsDocDataSaveSuccessFlagNotGreaterThan0() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (csDocDataSaveSuccessFlag != null) : true* (csDocDataSaveSuccessFlag > 0) : false*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1L).when(cSServiceImplMock).saveCancerScreeningDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenCancerScreeningDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to save data\",\"status\":\"Unable to save data\"}"));
            verify(cSServiceImplMock).saveCancerScreeningDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${b63686ed-73d6-38d0-9b6d-d373092067a3}, hash: 40379E607202E97F646CC98E641AC4A2
    @Disabled()
    @Test()
    void saveBenCancerScreeningDoctorDataWhenCsDocDataSaveSuccessFlagGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (csDocDataSaveSuccessFlag != null) : true* (csDocDataSaveSuccessFlag > 0) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(cSServiceImplMock).saveCancerScreeningDoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.saveBenCancerScreeningDoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data saved successfully\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(cSServiceImplMock).saveCancerScreeningDoctorData((JsonObject) any(), eq("<value>"));
        });
    }

    //Sapient generated method id: ${8edbf2fa-a555-3328-80cf-12020b651740}, hash: D0EE74A88BE3CF233E91B145D975F95F
    @Disabled()
    @Test()
    void saveBenCancerScreeningDoctorDataWhenCsDocDataSaveSuccessFlagNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (csDocDataSaveSuccessFlag != null) : true* (csDocDataSaveSuccessFlag > 0) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(cSServiceImplMock).saveCancerScreeningDoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.saveBenCancerScreeningDoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(cSServiceImplMock).saveCancerScreeningDoctorData((JsonObject) any(), eq("<value>"));
        });
    }

    //Sapient generated method id: ${8b6f3113-83c4-3a7e-995d-f4560f8d05d3}, hash: 34C0663BDA76DE57B14F5F906299CCAC
    @Disabled()
    @Test()
    void getBenDataFrmNurseScrnToDocScrnVisitDetailsWhenObjLengthGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenDataFrmNurseToDocVisitDetailsScreen(1L, 1L);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnVisitDetails("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cSServiceImplMock).getBenDataFrmNurseToDocVisitDetailsScreen(1L, 1L);
        });
    }

    //Sapient generated method id: ${c016423c-0fc4-390c-b3ff-272e062ccc38}, hash: 834E9E23A10EFA44A92374BB54982FC0
    @Disabled()
    @Test()
    void getBenDataFrmNurseScrnToDocScrnVisitDetailsWhenObjLengthNotGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnVisitDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${363c1cdd-104e-3bf5-a2ac-f444d2151f21}, hash: B107800178239D5C612A16B0158E91E4
    @Disabled()
    @Test()
    void getBenDataFrmNurseScrnToDocScrnVisitDetailsWhenCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenDataFrmNurseToDocVisitDetailsScreen(1L, 1L);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnVisitDetails("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary visit data\",\"status\":\"Error while getting beneficiary visit data\"}"));
            verify(cSServiceImplMock).getBenDataFrmNurseToDocVisitDetailsScreen(1L, 1L);
        });
    }

    //Sapient generated method id: ${83e21c94-065e-3766-8025-0235a7eee03b}, hash: E3E853FF2311B19B52D43BF34AD5316E
    @Test()
    void getBenDataFrmNurseScrnToDocScrnVisitDetailsWhenObjLengthNotGreaterThan1AndCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnVisitDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary visit data\",\"status\":\"Error while getting beneficiary visit data\"}")));
    }

    //Sapient generated method id: ${b62e57ab-de0d-3894-8539-fff44359f86d}, hash: 7464E7EA5CEA5903DB8594C29B25FA2D
    @Disabled()
    @Test()
    void getBenDataFrmNurseScrnToDocScrnHistoryWhenObjLengthGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenDataFrmNurseToDocHistoryScreen(1L, 1L);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cSServiceImplMock).getBenDataFrmNurseToDocHistoryScreen(1L, 1L);
        });
    }

    //Sapient generated method id: ${ceb332f6-a1e8-36ed-b477-0a0a73a6c81d}, hash: 7A21C7F4B0AFA0A0B4F02759800E3E68
    @Disabled()
    @Test()
    void getBenDataFrmNurseScrnToDocScrnHistoryWhenObjLengthNotGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${b48317a7-2feb-36c2-ad97-36563a8bf108}, hash: E38F9DF3C46409AD1C12692AAB2492D2
    @Disabled()
    @Test()
    void getBenDataFrmNurseScrnToDocScrnHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenDataFrmNurseToDocHistoryScreen(1L, 1L);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnHistory("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary history data\",\"status\":\"Error while getting beneficiary history data\"}"));
            verify(cSServiceImplMock).getBenDataFrmNurseToDocHistoryScreen(1L, 1L);
        });
    }

    //Sapient generated method id: ${22c6f780-5b05-3633-9e31-9d4ecee5f690}, hash: 58810BDD8DCF0285C670945C1BBEBFF0
    @Test()
    void getBenDataFrmNurseScrnToDocScrnHistoryWhenObjLengthNotGreaterThan1AndCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary history data\",\"status\":\"Error while getting beneficiary history data\"}")));
    }

    //Sapient generated method id: ${cce376e6-2fb9-356d-b9cb-5a06d4988688}, hash: 68A48FFA15CE081B851DD86F546D92A5
    @Disabled()
    @Test()
    void getBenDataFrmNurseScrnToDocScrnVitalWhenObjLengthGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenDataFrmNurseToDocVitalScreen(1L, 1L);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnVital("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cSServiceImplMock).getBenDataFrmNurseToDocVitalScreen(1L, 1L);
        });
    }

   

    

    //Sapient generated method id: ${2c51bdfd-6475-37c7-91e8-ab20cad5ba2c}, hash: AC44E446EEF2A970177542138BCA9552
    @Test()
    void getBenDataFrmNurseScrnToDocScrnVitalWhenObjLengthNotGreaterThan1AndCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnVital("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary vital data\",\"status\":\"Error while getting beneficiary vital data\"}")));
    }

    //Sapient generated method id: ${590fc039-3240-310f-9efb-6abb8f8bbaf8}, hash: D124E1099D8ACCD7E0F0B58B460615DC
    @Disabled()
    @Test()
    void getBenDataFrmNurseScrnToDocScrnExaminationWhenObjLengthGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenDataFrmNurseToDocExaminationScreen(1L, 1L);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnExamination("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cSServiceImplMock).getBenDataFrmNurseToDocExaminationScreen(1L, 1L);
        });
    }

    //Sapient generated method id: ${345535b5-bec6-3cd4-b947-cb19aaed5693}, hash: B5BAB44001A2A74C5F9DC8A775BD4BD0
    @Disabled()
    @Test()
    void getBenDataFrmNurseScrnToDocScrnExaminationWhenObjLengthNotGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnExamination("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${2b1ca9a9-3b9a-3c7b-9c5e-80fad6d76885}, hash: 5DBD41F2913EA52EFD4F6BC1663276B1
    @Disabled()
    @Test()
    void getBenDataFrmNurseScrnToDocScrnExaminationWhenCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenDataFrmNurseToDocExaminationScreen(1L, 1L);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnExamination("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary examination data\",\"status\":\"Error while getting beneficiary examination data\"}"));
            verify(cSServiceImplMock).getBenDataFrmNurseToDocExaminationScreen(1L, 1L);
        });
    }

    //Sapient generated method id: ${71a0f218-b8df-39e0-bfe2-1de93473f174}, hash: 59F80BA760B5EEA60DC0F6E3FA71CE4D
    @Test()
    void getBenDataFrmNurseScrnToDocScrnExaminationWhenObjLengthNotGreaterThan1AndCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnExamination("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary examination data\",\"status\":\"Error while getting beneficiary examination data\"}")));
    }

    //Sapient generated method id: ${9318d8c8-ef65-346c-9311-91a6e6e92807}, hash: C67611522E1D0072E54274264A0FCF96
    @Disabled()
    @Test()
    void getBenCancerFamilyHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenFamilyHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenCancerFamilyHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cSServiceImplMock).getBenFamilyHistoryData(0L);
        });
    }

    //Sapient generated method id: ${59136d02-76fe-37b7-a2eb-1d341db37871}, hash: C6DA4F6253F050883F442D2FD3DED302
    @Disabled()
    @Test()
    void getBenCancerFamilyHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCancerFamilyHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${4ab9927c-fe41-30d0-8e14-b997045702a3}, hash: 9A02E6A2FB9743D8554890DE22A59F14
    @Disabled()
    @Test()
    void getBenCancerFamilyHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenFamilyHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenCancerFamilyHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary family history data\",\"status\":\"Error while getting beneficiary family history data\"}"));
            verify(cSServiceImplMock).getBenFamilyHistoryData(0L);
        });
    }

    //Sapient generated method id: ${5bb6d720-9917-37e5-9fca-cf09e87fd29d}, hash: A5FF7C084ACCE52AE4E1000A650C5D34
    @Test()
    void getBenCancerFamilyHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCancerFamilyHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary family history data\",\"status\":\"Error while getting beneficiary family history data\"}")));
    }

    //Sapient generated method id: ${a3425c23-9343-3bf8-b2aa-6b00f039a243}, hash: ED6401669456DC5541D08C23B897D5A0
    @Disabled()
    @Test()
    void getBenCancerPersonalHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenPersonalHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenCancerPersonalHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cSServiceImplMock).getBenPersonalHistoryData(0L);
        });
    }

    //Sapient generated method id: ${92c5d001-b736-359a-b9c5-a9656cd6a487}, hash: CFDA5C52C1A094E6CA9E4C899D904A63
    @Disabled()
    @Test()
    void getBenCancerPersonalHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCancerPersonalHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${53d8d026-3515-35f8-8c7e-57d1226a2585}, hash: F5C83A3D5406DFA3128EC4682FFCEAE1
    @Disabled()
    @Test()
    void getBenCancerPersonalHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenPersonalHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenCancerPersonalHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary personal history data\",\"status\":\"Error while getting beneficiary personal history data\"}"));
            verify(cSServiceImplMock).getBenPersonalHistoryData(0L);
        });
    }

    //Sapient generated method id: ${6500c232-3d3e-367f-9d68-ed342e0ff27c}, hash: B3006653402F97969B98C88B6DC51A5A
    @Test()
    void getBenCancerPersonalHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCancerPersonalHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary personal history data\",\"status\":\"Error while getting beneficiary personal history data\"}")));
    }

    //Sapient generated method id: ${7dc5d67c-0c07-3e7f-b17c-8c080c74c2a9}, hash: 22A750AB5BF34C019B521CDB9C75C4FA
    @Disabled()
    @Test()
    void getBenCancerPersonalDietHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenPersonalDietHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenCancerPersonalDietHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cSServiceImplMock).getBenPersonalDietHistoryData(0L);
        });
    }

    //Sapient generated method id: ${2c9b6d81-2650-347c-9ae8-f4e147e9eaa7}, hash: 58AC888E94DD9530B8283E380EE88D17
    @Disabled()
    @Test()
    void getBenCancerPersonalDietHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCancerPersonalDietHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${76746ea9-8e39-350c-8e03-54dedddd304b}, hash: C7D36494EAD17C94A31D4E061AA34209
    @Disabled()
    @Test()
    void getBenCancerPersonalDietHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenPersonalDietHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenCancerPersonalDietHistory("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary personal diet history data\",\"status\":\"Error while getting beneficiary personal diet history data\"}"));
            verify(cSServiceImplMock).getBenPersonalDietHistoryData(0L);
        });
    }

    //Sapient generated method id: ${2c8278e2-b625-332c-b659-b9b6d1d9b8b5}, hash: 792F1509541BBB1E889D3EF2A5D800AA
    @Test()
    void getBenCancerPersonalDietHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCancerPersonalDietHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary personal diet history data\",\"status\":\"Error while getting beneficiary personal diet history data\"}")));
    }

    //Sapient generated method id: ${5c4fcd1e-181e-3680-8689-6cc78916131a}, hash: 5B24782BECEE5426810C565F5A3AB6A8
    @Disabled()
    @Test()
    void getBenCancerObstetricHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenObstetricHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenCancerObstetricHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cSServiceImplMock).getBenObstetricHistoryData(0L);
        });
    }

    //Sapient generated method id: ${14e889e8-2edd-30d1-b700-fd95d57f2451}, hash: E06A3011AE1526964D2301F6CADFA3E4
    @Disabled()
    @Test()
    void getBenCancerObstetricHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCancerObstetricHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${268a9476-5220-3ad8-8b67-4040e0c1aaf7}, hash: 0F6C5CE44AEAC65394FAEDF934E3B9EE
    @Disabled()
    @Test()
    void getBenCancerObstetricHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenObstetricHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenCancerObstetricHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary obstetric history data\",\"status\":\"Error while getting beneficiary obstetric history data\"}"));
            verify(cSServiceImplMock).getBenObstetricHistoryData(0L);
        });
    }

    //Sapient generated method id: ${e93cefc6-c924-3ff5-81c1-a6384d419f9e}, hash: 225502F67BEA13DBC51076E6FD4883FC
    @Test()
    void getBenCancerObstetricHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCancerObstetricHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary obstetric history data\",\"status\":\"Error while getting beneficiary obstetric history data\"}")));
    }

    //Sapient generated method id: ${a1bc3cfb-fc9c-3514-ad35-4c8fc25abeed}, hash: 2B43945F5476B3524942D013CB85E0CC
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorCSWhenObjHasVisitCode() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenCaseRecordFromDoctorCS(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorCS("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cSServiceImplMock).getBenCaseRecordFromDoctorCS(1L, 1L);
        });
    }

    //Sapient generated method id: ${f20b98f0-782b-3650-a2c7-bddb12c0b0b9}, hash: 5F16DC370B53C9A28D8ECBFEF2B97DD3
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorCSWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorCS("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${4e13d45a-37e2-3ec8-839d-fad6653498a1}, hash: 341932F865A5723EF87CA20E6750B82A
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorCSWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(cSServiceImplMock).getBenCaseRecordFromDoctorCS(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorCS("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary doctor data\",\"status\":\"Error while getting beneficiary doctor data\"}"));
            verify(cSServiceImplMock).getBenCaseRecordFromDoctorCS(1L, 1L);
        });
    }

    //Sapient generated method id: ${ae39d6ec-6f6d-3b59-96d0-38faf8bd913d}, hash: 1B4F69608443467114D8B8BBF3F7B248
    @Test()
    void getBenCaseRecordFromDoctorCSWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorCS("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary doctor data\",\"status\":\"Error while getting beneficiary doctor data\"}")));
    }

    //Sapient generated method id: ${bc0b8c00-abad-31a1-875c-abd233bb7ba0}, hash: B908D99E465F607A5DC53F540013AE8C
    @Disabled()
    @Test()
    void updateCSHistoryNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(cSServiceImplMock).UpdateCSHistoryNurseData((JsonObject) any());
        //Act Statement(s)
        String result = target.updateCSHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cSServiceImplMock).UpdateCSHistoryNurseData((JsonObject) any());
        });
    }

    //Sapient generated method id: ${8c9423e1-15e5-3b9a-b622-52522a2e3ab3}, hash: 266E361A610533F38FD8B64FA96BDD08
    @Disabled()
    @Test()
    void updateCSHistoryNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(cSServiceImplMock).UpdateCSHistoryNurseData((JsonObject) any());
        //Act Statement(s)
        String result = target.updateCSHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(cSServiceImplMock).UpdateCSHistoryNurseData((JsonObject) any());
        });
    }

    //Sapient generated method id: ${824e5769-37e1-3782-ade9-e1f8648236f5}, hash: 46D32BC77F5BABC64A0EE219653B324A
    @Disabled()
    @Test()
    void updateCSHistoryNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(cSServiceImplMock).UpdateCSHistoryNurseData((JsonObject) any());
        //Act Statement(s)
        String result = target.updateCSHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(cSServiceImplMock).UpdateCSHistoryNurseData((JsonObject) any());
        });
    }

    //Sapient generated method id: ${c596437c-e17b-3eb9-b626-791e238e0771}, hash: 458E716267A1D1ED3670B4D31CA0EC20
    @Disabled()
    @Test()
    void updateCSHistoryNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(cSServiceImplMock).UpdateCSHistoryNurseData((JsonObject) any());
        //Act Statement(s)
        String result = target.updateCSHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(cSServiceImplMock).UpdateCSHistoryNurseData((JsonObject) any());
        });
    }

    //Sapient generated method id: ${35bb10cd-8f36-3de1-918b-540ce6cab02a}, hash: B722EE6A03694B021E4733367B066B06
    @Test()
    void upodateBenVitalDetailWhenResponseObjGreaterThan0() throws Exception {
        /* Branches:* (responseObj > 0) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BenCancerVitalDetail benCancerVitalDetailMock = mock(BenCancerVitalDetail.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(benCancerVitalDetailMock).when(inputMapperMock).fromJson("A", BenCancerVitalDetail.class);
            target = new CancerScreeningController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1).when(cSServiceImplMock).updateBenVitalDetail(benCancerVitalDetailMock);
            //Act Statement(s)
            String result = target.upodateBenVitalDetail("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("A", BenCancerVitalDetail.class);
                verify(cSServiceImplMock).updateBenVitalDetail(benCancerVitalDetailMock);
            });
        }
    }

    //Sapient generated method id: ${ba089264-37c9-33af-9d69-c31906dc976f}, hash: F71A1D37EDA2B1BA56825BF28BDC1D2E
    @Test()
    void upodateBenVitalDetailWhenResponseObjNotGreaterThan0() throws Exception {
        /* Branches:* (responseObj > 0) : false*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BenCancerVitalDetail benCancerVitalDetailMock = mock(BenCancerVitalDetail.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(benCancerVitalDetailMock).when(inputMapperMock).fromJson("A", BenCancerVitalDetail.class);
            target = new CancerScreeningController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(cSServiceImplMock).updateBenVitalDetail(benCancerVitalDetailMock);
            //Act Statement(s)
            String result = target.upodateBenVitalDetail("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("A", BenCancerVitalDetail.class);
                verify(cSServiceImplMock).updateBenVitalDetail(benCancerVitalDetailMock);
            });
        }
    }

    //Sapient generated method id: ${e1ded6de-c944-3c0b-b33f-dbd7e24bcc8b}, hash: E7C6DA9317D890C1F10C8A3CF18B5DB9
    @Disabled()
    @Test()
    void upodateBenVitalDetailWhenCaughtException() throws Exception {
        /* Branches:* (responseObj > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BenCancerVitalDetail benCancerVitalDetailMock = mock(BenCancerVitalDetail.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(benCancerVitalDetailMock).when(inputMapperMock).fromJson("A", BenCancerVitalDetail.class);
            target = new CancerScreeningController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1).when(cSServiceImplMock).updateBenVitalDetail(benCancerVitalDetailMock);
            //Act Statement(s)
            String result = target.upodateBenVitalDetail("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("A", BenCancerVitalDetail.class);
                verify(cSServiceImplMock).updateBenVitalDetail(benCancerVitalDetailMock);
            });
        }
    }

    //Sapient generated method id: ${8d5050f6-99fb-3b3b-80d7-5b8172348b59}, hash: C821E6D55E7D91205047587578D82B78
    @Disabled()
    @Test()
    void upodateBenVitalDetailWhenResponseObjNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (responseObj > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BenCancerVitalDetail benCancerVitalDetailMock = mock(BenCancerVitalDetail.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(benCancerVitalDetailMock).when(inputMapperMock).fromJson("A", BenCancerVitalDetail.class);
            target = new CancerScreeningController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(cSServiceImplMock).updateBenVitalDetail(benCancerVitalDetailMock);
            //Act Statement(s)
            String result = target.upodateBenVitalDetail("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("A", BenCancerVitalDetail.class);
                verify(cSServiceImplMock).updateBenVitalDetail(benCancerVitalDetailMock);
            });
        }
    }

    //Sapient generated method id: ${51d4afc3-a9ec-3a9c-8a2d-9b50e357db09}, hash: 16A9B8FAA0B32E525FDAD3E07152CD64
    @Disabled()
    @Test()
    void upodateBenExaminationDetailWhenResponseObjGreaterThan0() throws Exception {
        /* Branches:* (responseObj > 0) : true*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(cSServiceImplMock).updateBenExaminationDetail((JsonObject) any());
        //Act Statement(s)
        String result = target.upodateBenExaminationDetail("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cSServiceImplMock).updateBenExaminationDetail((JsonObject) any());
        });
    }

    //Sapient generated method id: ${1c6f08fe-cb25-30d3-88e9-6af5878b8f58}, hash: 1E3C1090DA70402951C19C7440BFDCA5
    @Disabled()
    @Test()
    void upodateBenExaminationDetailWhenResponseObjNotGreaterThan0() throws Exception {
        /* Branches:* (responseObj > 0) : false*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(cSServiceImplMock).updateBenExaminationDetail((JsonObject) any());
        //Act Statement(s)
        String result = target.upodateBenExaminationDetail("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(cSServiceImplMock).updateBenExaminationDetail((JsonObject) any());
        });
    }

    //Sapient generated method id: ${dd3aff83-ef19-392b-8dda-a5ae5cdd04f8}, hash: B6F4B0A58066DA1306D57EEB04935100
    @Disabled()
    @Test()
    void upodateBenExaminationDetailWhenCaughtException() throws Exception {
        /* Branches:* (responseObj > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(cSServiceImplMock).updateBenExaminationDetail((JsonObject) any());
        //Act Statement(s)
        String result = target.upodateBenExaminationDetail("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(cSServiceImplMock).updateBenExaminationDetail((JsonObject) any());
        });
    }

    //Sapient generated method id: ${4104d4e7-ac7c-3dca-825d-4843d8aef7ff}, hash: 4F1AC46F15C2DA5059429A5754173CAE
    @Disabled()
    @Test()
    void upodateBenExaminationDetailWhenResponseObjNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (responseObj > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(cSServiceImplMock).updateBenExaminationDetail((JsonObject) any());
        //Act Statement(s)
        String result = target.upodateBenExaminationDetail("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(cSServiceImplMock).updateBenExaminationDetail((JsonObject) any());
        });
    }

    //Sapient generated method id: ${77e6b98f-f433-3086-a16a-289257305457}, hash: B4A5FFCFAE93470DBC0E25AF70A07206
    @Test()
    void updateCancerDiagnosisDetailsByOncologistWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        CancerDiagnosis cancerDiagnosisMock = mock(CancerDiagnosis.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(cancerDiagnosisMock).when(inputMapperMock).fromJson("A", CancerDiagnosis.class);
            target = new CancerScreeningController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1).when(cSServiceImplMock).updateCancerDiagnosisDetailsByOncologist(cancerDiagnosisMock);
            //Act Statement(s)
            String result = target.updateCancerDiagnosisDetailsByOncologist("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("A", CancerDiagnosis.class);
                verify(cSServiceImplMock).updateCancerDiagnosisDetailsByOncologist(cancerDiagnosisMock);
            });
        }
    }

    //Sapient generated method id: ${a0107577-e0ce-32fe-83e9-9cbb87348c29}, hash: 1F1CF0757964614DED2CA95807A123FB
    @Test()
    void updateCancerDiagnosisDetailsByOncologistWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        CancerDiagnosis cancerDiagnosisMock = mock(CancerDiagnosis.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(cancerDiagnosisMock).when(inputMapperMock).fromJson("A", CancerDiagnosis.class);
            target = new CancerScreeningController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(cSServiceImplMock).updateCancerDiagnosisDetailsByOncologist(cancerDiagnosisMock);
            //Act Statement(s)
            String result = target.updateCancerDiagnosisDetailsByOncologist("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("A", CancerDiagnosis.class);
                verify(cSServiceImplMock).updateCancerDiagnosisDetailsByOncologist(cancerDiagnosisMock);
            });
        }
    }

    //Sapient generated method id: ${7582b0f1-abe5-3b4b-8720-12e237854bf4}, hash: E39C5FCDB446F775C35195E6BD780A37
    @Disabled()
    @Test()
    void updateCancerDiagnosisDetailsByOncologistWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        CancerDiagnosis cancerDiagnosisMock = mock(CancerDiagnosis.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(cancerDiagnosisMock).when(inputMapperMock).fromJson("A", CancerDiagnosis.class);
            target = new CancerScreeningController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1).when(cSServiceImplMock).updateCancerDiagnosisDetailsByOncologist(cancerDiagnosisMock);
            //Act Statement(s)
            String result = target.updateCancerDiagnosisDetailsByOncologist("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("A", CancerDiagnosis.class);
                verify(cSServiceImplMock).updateCancerDiagnosisDetailsByOncologist(cancerDiagnosisMock);
            });
        }
    }

    //Sapient generated method id: ${6d3d99f7-288f-31d6-9a9e-07ef082a8391}, hash: 8A0760A4B68850F1562C36B07DFEC790
    @Test()
    void updateCancerDiagnosisDetailsByOncologistWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        CancerDiagnosis cancerDiagnosisMock = mock(CancerDiagnosis.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(cancerDiagnosisMock).when(inputMapperMock).fromJson("A", CancerDiagnosis.class);
            target = new CancerScreeningController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(cSServiceImplMock).updateCancerDiagnosisDetailsByOncologist(cancerDiagnosisMock);
            //Act Statement(s)
            String result = target.updateCancerDiagnosisDetailsByOncologist("A");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("A", CancerDiagnosis.class);
                verify(cSServiceImplMock).updateCancerDiagnosisDetailsByOncologist(cancerDiagnosisMock);
            });
        }
    }

    //Sapient generated method id: ${5f327027-95ba-3351-90fe-8fb933fb8d13}, hash: CDB6D655108C20055E4358FC66288432
    @Disabled()
    @Test()
    void updateCancerScreeningDoctorDataWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(cSServiceImplMock).updateCancerScreeningDoctorData((JsonObject) any());
        //Act Statement(s)
        String result = target.updateCancerScreeningDoctorData("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(cSServiceImplMock).updateCancerScreeningDoctorData((JsonObject) any());
        });
    }

    //Sapient generated method id: ${eba4e7b3-af22-37bc-af23-8786798a8595}, hash: 1F028ACC17625FF2DC4704F55732EA15
    @Disabled()
    @Test()
    void updateCancerScreeningDoctorDataWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(cSServiceImplMock).updateCancerScreeningDoctorData((JsonObject) any());
        //Act Statement(s)
        String result = target.updateCancerScreeningDoctorData("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(cSServiceImplMock).updateCancerScreeningDoctorData((JsonObject) any());
        });
    }

    //Sapient generated method id: ${ed9d58e9-9be4-3bb7-8f12-a079abc8fc5d}, hash: 775497B1F749A88A9DCFD55895ACF5EE
    @Disabled()
    @Test()
    void updateCancerScreeningDoctorDataWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(cSServiceImplMock).updateCancerScreeningDoctorData((JsonObject) any());
        //Act Statement(s)
        String result = target.updateCancerScreeningDoctorData("<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(cSServiceImplMock).updateCancerScreeningDoctorData((JsonObject) any());
        });
    }

    //Sapient generated method id: ${237ba374-084c-3f41-adaa-a6a10615954f}, hash: 2BC3007C5EEEBD4D347370E5C52DC5FB
    @Disabled()
    @Test()
    void updateCancerScreeningDoctorDataWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new CancerScreeningController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(cSServiceImplMock).updateCancerScreeningDoctorData((JsonObject) any());
        //Act Statement(s)
        String result = target.updateCancerScreeningDoctorData("<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(cSServiceImplMock).updateCancerScreeningDoctorData((JsonObject) any());
        });
    }
}
