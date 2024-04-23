package com.iemr.tm.controller.covid19;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.service.covid19.Covid19ServiceImpl;
import com.google.gson.JsonObject;
import org.mockito.MockitoAnnotations;

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
class CovidControllerSapientGeneratedTest {

    private final Covid19ServiceImpl covid19ServiceImplMock = mock(Covid19ServiceImpl.class, "covid19ServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private CovidController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${3cd22b1d-32f7-3789-868c-ccf52cdeafb3}, hash: 192F3C45B3FB7F33B49DF55F31342A2D
    @Disabled()
    @Test()
    void saveBenNCDCareNurseDataWhenJsnOBJIsNotNull() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : true*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(covid19ServiceImplMock).saveCovid19NurseData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenNCDCareNurseData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(covid19ServiceImplMock).saveCovid19NurseData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${274050fb-a0af-32c4-a7b5-74a0d55acaa6}, hash: E9BF6D64AD8462696D83BA0624063BEC
    @Disabled()
    @Test()
    void saveBenNCDCareNurseDataWhenJsnOBJIsNull() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenNCDCareNurseData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid Request !!!\",\"status\":\"Invalid Request !!!\"}")));
    }

    //Sapient generated method id: ${6958d2c9-9efd-32e0-9220-8a3b71a9f7e6}, hash: 1A1D6B9AC4330BF4C3B23FA280B22BCF
    @Disabled()
    @Test()
    void saveBenNCDCareNurseDataWhenCaughtException() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(covid19ServiceImplMock).saveCovid19NurseData((JsonObject) any(), eq("<value>"));
        doNothing().when(covid19ServiceImplMock).deleteVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.saveBenNCDCareNurseData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"C\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(covid19ServiceImplMock).saveCovid19NurseData((JsonObject) any(), eq("<value>"));
            verify(covid19ServiceImplMock).deleteVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${3b56e9b2-bfb4-35d5-b6d7-9964f5f219fb}, hash: 9B47976CA98C5418DA6ED722BCCD47D9
    @Disabled()
    @Test()
    void saveBenNCDCareNurseDataWhenJsnOBJIsNullAndCaughtException() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(covid19ServiceImplMock).saveCovid19NurseData((JsonObject) any(), eq("<value>"));
        doNothing().when(covid19ServiceImplMock).deleteVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.saveBenNCDCareNurseData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"B\",\"status\":\"B\"}"));
            verify(covid19ServiceImplMock).saveCovid19NurseData((JsonObject) any(), eq("<value>"));
            verify(covid19ServiceImplMock).deleteVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${15f711b4-0e8a-349a-a31a-5c77c51aecd2}, hash: 859AD3939666449CCA4FC297825FD7C7
    @Disabled()
    @Test()
    void saveBenCovidDoctorDataWhenJsnOBJIsNull() throws Exception {
        /* Branches:* (jsnOBJ != null) : false*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenCovidDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"Invalid request\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}")));
    }

    //Sapient generated method id: ${af2678e6-3911-37c2-93a3-9deb328e8ab7}, hash: 4D30B44FF2EEC7CA3403B491E195BF62
    @Disabled()
    @Test()
    void saveBenCovidDoctorDataWhenCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenCovidDoctorData("<valid_requestObj_value>", "<valid_Authorization_value>");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"Invalid request\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}")));
    }

    //Sapient generated method id: ${4bb06c71-a5af-3264-8404-9a680af91a28}, hash: 7BA08DB9E66572B4D811A0A4B0DBABF2
    @Disabled()
    @Test()
    void saveBenCovidDoctorDataWhenNcdCareResGreaterThan0() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != ncdCareRes) : true* (ncdCareRes > 0) : true*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1L).when(covid19ServiceImplMock).saveDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenCovidDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data saved successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(covid19ServiceImplMock).saveDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${ee06f740-c6da-3135-91c2-b6a5c11512f5}, hash: B01852FBA5E1EE56B35745D3278AE705
    @Disabled()
    @Test()
    void saveBenCovidDoctorDataWhenNcdCareResNotGreaterThan0() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != ncdCareRes) : true* (ncdCareRes > 0) : false*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1L).when(covid19ServiceImplMock).saveDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenCovidDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Unable to save data\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(covid19ServiceImplMock).saveDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${3b38be6c-9cd8-3737-ab03-c41c31fdd71a}, hash: E40C5C68A87939D1180427DB035CA141
    @Disabled()
    @Test()
    void saveBenCovidDoctorDataWhenNcdCareResGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != ncdCareRes) : true* (ncdCareRes > 0) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(covid19ServiceImplMock).saveDoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.saveBenCovidDoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data saved successfully\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(covid19ServiceImplMock).saveDoctorData((JsonObject) any(), eq("<value>"));
        });
    }

    //Sapient generated method id: ${935873ef-ed05-3692-87ad-f86854632c36}, hash: 259A02201F958DF84D96C1DB5689DEA9
    @Disabled()
    @Test()
    void saveBenCovidDoctorDataWhenNcdCareResNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != ncdCareRes) : true* (ncdCareRes > 0) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(covid19ServiceImplMock).saveDoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.saveBenCovidDoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Unable to save data\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(covid19ServiceImplMock).saveDoctorData((JsonObject) any(), eq("<value>"));
        });
    }

    //Sapient generated method id: ${2e8a5d55-bcef-39b6-a878-00c24671e4e8}, hash: 93FA1495A66354675CEE7ECD9C8EA770
    @Disabled()
    @Test()
    void getBenVisitDetailsFrmNurseCovid19WhenObjLengthGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(covid19ServiceImplMock).getBenVisitDetailsFrmNurseCovid19(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseCovid19("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(covid19ServiceImplMock).getBenVisitDetailsFrmNurseCovid19(1L, 1L);
        });
    }

    //Sapient generated method id: ${e8e9a19a-8af0-3d24-b1c3-7756962849e1}, hash: A253C3B1A87034F64D359DE2CD7F8F44
    @Disabled()
    @Test()
    void getBenVisitDetailsFrmNurseCovid19WhenObjLengthNotGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseCovid19("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${c3340d9b-01f9-3afe-8651-24775684d8e1}, hash: D9F4EBB6D4E4474A80CD1CB104B9D6FA
    @Disabled()
    @Test()
    void getBenVisitDetailsFrmNurseCovid19WhenCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(covid19ServiceImplMock).getBenVisitDetailsFrmNurseCovid19(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseCovid19("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary visit data\",\"status\":\"Error while getting beneficiary visit data\"}"));
            verify(covid19ServiceImplMock).getBenVisitDetailsFrmNurseCovid19(1L, 1L);
        });
    }

    //Sapient generated method id: ${bcc70f40-a826-3700-b07b-62758be401a7}, hash: 72649A8FAE3CD79D02EBC7B32CF543A5
    @Test()
    void getBenVisitDetailsFrmNurseCovid19WhenObjLengthNotGreaterThan1AndCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseCovid19("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary visit data\",\"status\":\"Error while getting beneficiary visit data\"}")));
    }

    //Sapient generated method id: ${1db54ee1-47b9-394d-8494-a18f972bd882}, hash: 812238C60A769872B0BAB5CDC0903EB5
    @Disabled()
    @Test()
    void getBenCovid19HistoryDetailsWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(covid19ServiceImplMock).getBenCovid19HistoryDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCovid19HistoryDetails("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(covid19ServiceImplMock).getBenCovid19HistoryDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${84418117-b8a4-3bd5-bf1a-1c24b26c1f0f}, hash: BF96D8D07FCB7AB46F0FF6A583D96769
    @Disabled()
    @Test()
    void getBenCovid19HistoryDetailsWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCovid19HistoryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${07db335b-b3ba-3458-aa6c-6d20b73b4216}, hash: EE30BE69CD8893D832C1EBED634987DE
    @Disabled()
    @Test()
    void getBenCovid19HistoryDetailsWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(covid19ServiceImplMock).getBenCovid19HistoryDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCovid19HistoryDetails("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary history data\",\"status\":\"Error while getting beneficiary history data\"}"));
            verify(covid19ServiceImplMock).getBenCovid19HistoryDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${1075a772-d502-34b6-bff2-dfbfa3436eda}, hash: 4EA97A356DBA41D39089A0FF267B360E
    @Test()
    void getBenCovid19HistoryDetailsWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCovid19HistoryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary history data\",\"status\":\"Error while getting beneficiary history data\"}")));
    }

    //Sapient generated method id: ${9f366ef8-b1be-3f96-9382-d692d2f91e16}, hash: B7E4322B384BE1E426032F030FBB459C
    @Disabled()
    @Test()
    void getBenVitalDetailsFrmNurseNCDCareWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(covid19ServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurseNCDCare("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(covid19ServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${6ef8bd29-6a8f-34e4-b33b-cd3ca9e60933}, hash: 26F932914DDE48AB19BE287C4FF72109
    @Disabled()
    @Test()
    void getBenVitalDetailsFrmNurseNCDCareWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurseNCDCare("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${7a7b1fe9-99f4-381f-834e-dd7f6f8623c5}, hash: D6C0B4801D70E31E967AF54E28A23C8C
    @Disabled()
    @Test()
    void getBenVitalDetailsFrmNurseNCDCareWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(covid19ServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurseNCDCare("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary vital data\",\"status\":\"Error while getting beneficiary vital data\"}"));
            verify(covid19ServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${f90e7cf1-8959-3d4c-bb92-323894ef74a2}, hash: 5DC088C7B0686FBB5B0EC4963C19BCD7
    @Test()
    void getBenVitalDetailsFrmNurseNCDCareWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurseNCDCare("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary vital data\",\"status\":\"Error while getting beneficiary vital data\"}")));
    }

    //Sapient generated method id: ${a29c8875-ed5e-3b94-aec2-37234ccee6b5}, hash: 30E417E21E72E6B79E105FD0B44480B1
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorCovid19WhenObjHasVisitCode() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(covid19ServiceImplMock).getBenCaseRecordFromDoctorCovid19(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorCovid19("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(covid19ServiceImplMock).getBenCaseRecordFromDoctorCovid19(1L, 1L);
        });
    }

    //Sapient generated method id: ${44e12683-b0d2-3e09-a9f7-e54443aa30ec}, hash: CF8728748AE6BA1B00E51B255C7088D5
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorCovid19WhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorCovid19("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${097e57b4-0719-3b3e-b321-e5156fee3fdc}, hash: F09970FD99C3567A973605F148D74F65
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorCovid19WhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(covid19ServiceImplMock).getBenCaseRecordFromDoctorCovid19(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorCovid19("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary doctor data\",\"status\":\"Error while getting beneficiary doctor data\"}"));
            verify(covid19ServiceImplMock).getBenCaseRecordFromDoctorCovid19(1L, 1L);
        });
    }

    //Sapient generated method id: ${cdb0e4d7-69fe-35f0-ade0-082495139d4b}, hash: 98FFF70F5E21489B7E47926A9C832D81
    @Test()
    void getBenCaseRecordFromDoctorCovid19WhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorCovid19("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary doctor data\",\"status\":\"Error while getting beneficiary doctor data\"}")));
    }

    //Sapient generated method id: ${fde89bde-3fdb-30d7-8379-3744b518545e}, hash: AE33E4113A517BEEF2B1FB75C0665674
    @Disabled()
    @Test()
    void updateHistoryNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(covid19ServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(covid19ServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${67f6c3dc-fb90-3f6d-b452-6d925ed0118c}, hash: E9E8AB3ECBFBA04B171B09DB910E4A33
    @Disabled()
    @Test()
    void updateHistoryNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(covid19ServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(covid19ServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${5a58c2ce-8dea-39fc-9583-19be45a14aa5}, hash: 18EA616664F58053AC9F1D15302BBD0E
    @Disabled()
    @Test()
    void updateHistoryNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(covid19ServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(covid19ServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${b72d41d2-b3eb-3369-8b5e-b4c82b438381}, hash: C9617FD68FC93992EE4586BC88B9F9AE
    @Disabled()
    @Test()
    void updateHistoryNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(covid19ServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(covid19ServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${c08c7ced-363f-30e2-9153-a015daa1fb13}, hash: B9A14D481D02FC75A1F17EE9149E18FF
    @Disabled()
    @Test()
    void updateVitalNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(covid19ServiceImplMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(covid19ServiceImplMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${3d31ac92-1575-3b5a-8866-a9569579c1e7}, hash: 7F6DC27F0CA3B82EB6CDB07C5DAC4B22
    @Disabled()
    @Test()
    void updateVitalNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(covid19ServiceImplMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(covid19ServiceImplMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${d996a484-7d33-3c31-b4de-388c54dae395}, hash: 22B923458DA5B5B0A00324E1E7714051
    @Disabled()
    @Test()
    void updateVitalNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(covid19ServiceImplMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(covid19ServiceImplMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${ec1b2b7c-0f51-3eab-b499-6f651c0c3daa}, hash: 96D7CF663D7047BCDD43419DF4930010
    @Disabled()
    @Test()
    void updateVitalNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(covid19ServiceImplMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(covid19ServiceImplMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${eb26bced-f4cd-3091-ac60-3685b9d70403}, hash: 739080C3B2F72ADCABA4CFD9E18EA00B
    @Disabled()
    @Test()
    void updateCovid19DoctorDataWhenResultGreaterThan0() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : true*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1L).when(covid19ServiceImplMock).updateCovid19DoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.updateCovid19DoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(covid19ServiceImplMock).updateCovid19DoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${55b9bc65-0609-32c4-89c0-1f43caefd294}, hash: DDA6D18A5F7377D8C0BB55E05FCFA037
    @Disabled()
    @Test()
    void updateCovid19DoctorDataWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : false*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1L).when(covid19ServiceImplMock).updateCovid19DoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.updateCovid19DoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(covid19ServiceImplMock).updateCovid19DoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${257ac2d6-56eb-3926-9909-f222d0deee32}, hash: 3499683A330FD4F9391F8BA02FEBF59B
    @Disabled()
    @Test()
    void updateCovid19DoctorDataWhenCaughtException() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(covid19ServiceImplMock).updateCovid19DoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.updateCovid19DoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(covid19ServiceImplMock).updateCovid19DoctorData((JsonObject) any(), eq("<value>"));
        });
    }

    //Sapient generated method id: ${fc48e617-c319-3314-814b-a7c147396fea}, hash: 8E1B4DCA1F39E05F7764EFDE22602F66
    @Disabled()
    @Test()
    void updateCovid19DoctorDataWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new CovidController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(covid19ServiceImplMock).updateCovid19DoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.updateCovid19DoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(covid19ServiceImplMock).updateCovid19DoctorData((JsonObject) any(), eq("<value>"));
        });
    }
}
