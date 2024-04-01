package com.iemr.tm.controller.generalOPD;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.google.gson.JsonObject;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.service.generalOPD.GeneralOPDService;

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
class GeneralOPDControllerSapientGeneratedTest {

    private final GeneralOPDService generalOPDServiceMock = mock(GeneralOPDService.class, "generalOPDService");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private GeneralOPDController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${f8d1e34c-3b17-3779-8e6b-dec5314340bb}, hash: 0A6518874BE0B6DE1A15198239082300
    @Disabled()
    @Test()
    void saveBenGenOPDNurseDataWhenJsnOBJIsNotNull() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : true*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(generalOPDServiceMock).saveNurseData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenGenOPDNurseData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(generalOPDServiceMock).saveNurseData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${f8383dc6-91df-3249-944c-72beeac0d8d7}, hash: 842C1B5762726821E88E3700B820EF6D
    @Disabled()
    @Test()
    void saveBenGenOPDNurseDataWhenJsnOBJIsNull() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenGenOPDNurseData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"Invalid request\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}")));
    }

    //Sapient generated method id: ${0e923641-9c8e-3820-bd87-0cfcc6da4524}, hash: 2F801BB093F3AC4E917BA3F4C63D320A
    @Disabled()
    @Test()
    void saveBenGenOPDNurseDataWhenCaughtException() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(generalOPDServiceMock).saveNurseData((JsonObject) any(), eq("some_value"));
        doNothing().when(generalOPDServiceMock).deleteVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.saveBenGenOPDNurseData("some_value", "some_value");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"C\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(generalOPDServiceMock).saveNurseData((JsonObject) any(), eq("some_value"));
            verify(generalOPDServiceMock).deleteVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${37ec6973-1bb6-33df-98fd-a1619a6ba8d4}, hash: BDD95460740FC0A21822A6B91A1BA042
    @Disabled()
    @Test()
    void saveBenGenOPDNurseDataWhenJsnOBJIsNullAndCaughtException() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(generalOPDServiceMock).saveNurseData((JsonObject) any(), eq("<value>"));
        doNothing().when(generalOPDServiceMock).deleteVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.saveBenGenOPDNurseData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"B\",\"status\":\"B\"}"));
            verify(generalOPDServiceMock).saveNurseData((JsonObject) any(), eq("<value>"));
            verify(generalOPDServiceMock).deleteVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${698f35ea-63ae-3da8-b5b6-81dcfc061347}, hash: 62ECD7F9597BB8E54034E996D1AD6FD8
    @Disabled()
    @Test()
    void saveBenGenOPDDoctorDataWhenJsnOBJIsNull() throws Exception {
        /* Branches:* (jsnOBJ != null) : false*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenGenOPDDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"Invalid request\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}")));
    }

    //Sapient generated method id: ${e44d9daa-954d-3ae0-81db-5d4c3150af0a}, hash: 14AE130A93E0275A737BFD83D85FC7A2
    @Disabled()
    @Test()
    void saveBenGenOPDDoctorDataWhenCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenGenOPDDoctorData("valid_request", "valid_token");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"Invalid request\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}")));
    }

    //Sapient generated method id: ${b8a1fb05-213d-3955-b757-e73fb303275b}, hash: 6F44A22A3BE8A7A1BFB18C78ED994D04
    @Disabled()
    @Test()
    void saveBenGenOPDDoctorDataWhenGenOPDResGreaterThan0() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != genOPDRes) : true* (genOPDRes > 0) : true*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1L).when(generalOPDServiceMock).saveDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenGenOPDDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data saved successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(generalOPDServiceMock).saveDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${81c52faa-eac5-3067-a705-82d38289443c}, hash: 4990494B94AA6E48293D454397FF559F
    @Disabled()
    @Test()
    void saveBenGenOPDDoctorDataWhenGenOPDResNotGreaterThan0() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != genOPDRes) : true* (genOPDRes > 0) : false*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1L).when(generalOPDServiceMock).saveDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenGenOPDDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Unable to save data\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(generalOPDServiceMock).saveDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${5c78222c-ff13-3213-bcd7-be0f5626135c}, hash: CB44356C1649B1AE014C2864EC046883
    @Disabled()
    @Test()
    void saveBenGenOPDDoctorDataWhenGenOPDResGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != genOPDRes) : true* (genOPDRes > 0) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(generalOPDServiceMock).saveDoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.saveBenGenOPDDoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data saved successfully\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(generalOPDServiceMock).saveDoctorData((JsonObject) any(), eq("<value>"));
        });
    }

    //Sapient generated method id: ${682e5fdb-3f1c-3fd9-96b7-18d7f7a370cf}, hash: 2D0AAD0B137752EE9EDD7015CF19EE7D
    @Disabled()
    @Test()
    void saveBenGenOPDDoctorDataWhenGenOPDResNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != genOPDRes) : true* (genOPDRes > 0) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(generalOPDServiceMock).saveDoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.saveBenGenOPDDoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Unable to save data\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(generalOPDServiceMock).saveDoctorData((JsonObject) any(), eq("<value>"));
        });
    }

    //Sapient generated method id: ${ac6c2565-0e9a-3f1a-8a91-df86c1b3504d}, hash: F1A5715DEF309C0B18F20FB03CAFF69A
    @Disabled()
    @Test()
    void getBenVisitDetailsFrmNurseGOPDWhenObjLengthGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(generalOPDServiceMock).getBenVisitDetailsFrmNurseGOPD(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseGOPD("H");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(generalOPDServiceMock).getBenVisitDetailsFrmNurseGOPD(1L, 1L);
        });
    }

    //Sapient generated method id: ${9b3f07b9-406d-3b76-b909-205b11abfe0e}, hash: 07E144F39BA12A2295DFD57BCAF97571
    @Disabled()
    @Test()
    void getBenVisitDetailsFrmNurseGOPDWhenObjLengthNotGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseGOPD("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${b4b560ba-da37-39a7-a5dc-ea4cad39f55b}, hash: 83EA63EC080F9A4529FA3AFFF0143CAD
    @Disabled()
    @Test()
    void getBenVisitDetailsFrmNurseGOPDWhenCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(generalOPDServiceMock).getBenVisitDetailsFrmNurseGOPD(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseGOPD("H");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary visit data\",\"status\":\"Error while getting beneficiary visit data\"}"));
            verify(generalOPDServiceMock).getBenVisitDetailsFrmNurseGOPD(1L, 1L);
        });
    }

    //Sapient generated method id: ${e0f84a9a-2758-322d-8543-c4d671d32aa5}, hash: 46CDDB27DB35AC5B627E63D12F899538
    @Test()
    void getBenVisitDetailsFrmNurseGOPDWhenObjLengthNotGreaterThan1AndCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseGOPD("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary visit data\",\"status\":\"Error while getting beneficiary visit data\"}")));
    }

    //Sapient generated method id: ${2352a000-0ee7-3db2-975e-560d38c37d38}, hash: 2580E6B489D19F00F209C7A50F0E45BC
    @Disabled()
    @Test()
    void getBenHistoryDetailsWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(generalOPDServiceMock).getBenHistoryDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenHistoryDetails("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(generalOPDServiceMock).getBenHistoryDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${15f67d1d-aff9-3f55-87f7-cccad2091f59}, hash: F2459DD9C108380736F29A4CF86DF0AF
    @Disabled()
    @Test()
    void getBenHistoryDetailsWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenHistoryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${a0c26d5a-f2ae-3d2d-8a55-abdec4fea3b8}, hash: D4213A8BEC4BBDB470733D27E6C633B1
    @Disabled()
    @Test()
    void getBenHistoryDetailsWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(generalOPDServiceMock).getBenHistoryDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenHistoryDetails("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary history data\",\"status\":\"Error while getting beneficiary history data\"}"));
            verify(generalOPDServiceMock).getBenHistoryDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${4405402d-d6c2-3385-87bc-6b48c235b719}, hash: E22FB01D3DAD2D430065D2BC56A16D00
    @Test()
    void getBenHistoryDetailsWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenHistoryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary history data\",\"status\":\"Error while getting beneficiary history data\"}")));
    }

    //Sapient generated method id: ${43e7fff8-5475-3700-9146-0b37da1e368b}, hash: 95A155FC9CBFB63117CF7E8FBC8AA2E9
    @Disabled()
    @Test()
    void getBenVitalDetailsFrmNurseWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(generalOPDServiceMock).getBeneficiaryVitalDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurse("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(generalOPDServiceMock).getBeneficiaryVitalDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${698cdd40-4a71-3843-a184-25491843d701}, hash: D3685CB6149EE50FEDE49DC1ACFB364C
    @Disabled()
    @Test()
    void getBenVitalDetailsFrmNurseWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurse("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${2c14f69e-4b5e-3780-8680-738c9b548474}, hash: EF2F4AF046FB2E7882A02902E0C013B0
    @Disabled()
    @Test()
    void getBenVitalDetailsFrmNurseWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(generalOPDServiceMock).getBeneficiaryVitalDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurse("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary vital data\",\"status\":\"Error while getting beneficiary vital data\"}"));
            verify(generalOPDServiceMock).getBeneficiaryVitalDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${b21536a5-d988-3228-b7cb-d7c9e7bbe482}, hash: 41993F1A0DE1DAF1D986903F9C57815F
    @Test()
    void getBenVitalDetailsFrmNurseWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurse("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary vital data\",\"status\":\"Error while getting beneficiary vital data\"}")));
    }

    //Sapient generated method id: ${7d0cb36f-7b6d-3a4f-b8ec-8e2cf596df5b}, hash: E4A6522DA04499F221777D3D02F38D92
    @Disabled()
    @Test()
    void getBenExaminationDetailsWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(generalOPDServiceMock).getExaminationDetailsData(1L, 1L);
        //Act Statement(s)
        String result = target.getBenExaminationDetails("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(generalOPDServiceMock).getExaminationDetailsData(1L, 1L);
        });
    }

    //Sapient generated method id: ${8955441d-f779-34fc-9da0-fa15776b9792}, hash: FEBE966BE74EC0D9704AAED46E2FA3B4
    @Disabled()
    @Test()
    void getBenExaminationDetailsWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenExaminationDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${b420aec0-200c-366c-bf16-66eedf3cce79}, hash: D6B7387352971480535F781A28F0355A
    @Disabled()
    @Test()
    void getBenExaminationDetailsWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(generalOPDServiceMock).getExaminationDetailsData(1L, 1L);
        //Act Statement(s)
        String result = target.getBenExaminationDetails("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary examination data\",\"status\":\"Error while getting beneficiary examination data\"}"));
            verify(generalOPDServiceMock).getExaminationDetailsData(1L, 1L);
        });
    }

    //Sapient generated method id: ${28fd6e49-e061-3536-ae12-c79ecdda36ff}, hash: DE23C08E8B0E161ADD7A26235A8D7F60
    @Test()
    void getBenExaminationDetailsWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenExaminationDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary examination data\",\"status\":\"Error while getting beneficiary examination data\"}")));
    }

    //Sapient generated method id: ${c966fe9d-c8e4-3551-8389-07959cb97e83}, hash: 193F3BAC8F792166C635C72D972D4B0B
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorGeneralOPDWhenObjHasVisitCode() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(generalOPDServiceMock).getBenCaseRecordFromDoctorGeneralOPD(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorGeneralOPD("H");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(generalOPDServiceMock).getBenCaseRecordFromDoctorGeneralOPD(1L, 1L);
        });
    }

    //Sapient generated method id: ${3f2a4b64-ee2d-342e-9a32-f0ad98528232}, hash: 0C536FB9D68BA5C1DBE5C298F44BEE3E
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorGeneralOPDWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorGeneralOPD("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${c4355ea5-d25f-3c62-a45a-5c2291e32251}, hash: 7346B96799ED4B81658BF157F742A2E5
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorGeneralOPDWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(generalOPDServiceMock).getBenCaseRecordFromDoctorGeneralOPD(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorGeneralOPD("H");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary doctor data\",\"status\":\"Error while getting beneficiary doctor data\"}"));
            verify(generalOPDServiceMock).getBenCaseRecordFromDoctorGeneralOPD(1L, 1L);
        });
    }

    //Sapient generated method id: ${a0d6939c-7201-3f1d-ac73-576267489432}, hash: C432B3622B38016B8F196DE6DF3F1E1B
    @Test()
    void getBenCaseRecordFromDoctorGeneralOPDWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorGeneralOPD("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary doctor data\",\"status\":\"Error while getting beneficiary doctor data\"}")));
    }

    //Sapient generated method id: ${c864f65a-f40c-3c65-a7df-0224ac85ec03}, hash: F1E6990197FF446BDAFA245DD19001C7
    @Disabled()
    @Test()
    void updateVisitNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(generalOPDServiceMock).UpdateVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVisitNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(generalOPDServiceMock).UpdateVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${18aa4993-1063-37de-84a3-806df3963188}, hash: 66C2651549247FA28D9472CFE79AA88B
    @Disabled()
    @Test()
    void updateVisitNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(generalOPDServiceMock).UpdateVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVisitNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(generalOPDServiceMock).UpdateVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${fc1bbccb-097f-32b3-857f-bcbdea1969b4}, hash: 4DA76A693ECEBB22A4529EA333C7130C
    @Disabled()
    @Test()
    void updateVisitNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(generalOPDServiceMock).UpdateVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVisitNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(generalOPDServiceMock).UpdateVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${75f4b057-e36d-37f7-a6df-1d7e9d262472}, hash: 1BBFAA458B203B59FB11ACA633F15597
    @Disabled()
    @Test()
    void updateVisitNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(generalOPDServiceMock).UpdateVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVisitNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(generalOPDServiceMock).UpdateVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${fde89bde-3fdb-30d7-8379-3744b518545e}, hash: 0F78E7C4CF32150508E139FA13002FE5
    @Disabled()
    @Test()
    void updateHistoryNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(generalOPDServiceMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(generalOPDServiceMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${67f6c3dc-fb90-3f6d-b452-6d925ed0118c}, hash: 1FACC872FCA632D9126640209F9A9FAF
    @Disabled()
    @Test()
    void updateHistoryNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(generalOPDServiceMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(generalOPDServiceMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${5a58c2ce-8dea-39fc-9583-19be45a14aa5}, hash: 416E013D8050DEAF8F39B0C255C5B81D
    @Disabled()
    @Test()
    void updateHistoryNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(generalOPDServiceMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(generalOPDServiceMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${b72d41d2-b3eb-3369-8b5e-b4c82b438381}, hash: 7D8331F169CE3F6B409C15C1618D3908
    @Disabled()
    @Test()
    void updateHistoryNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(generalOPDServiceMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(generalOPDServiceMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${c08c7ced-363f-30e2-9153-a015daa1fb13}, hash: 71ED1B0D7BF856A7134AD92D754D8E8B
    @Disabled()
    @Test()
    void updateVitalNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(generalOPDServiceMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(generalOPDServiceMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${3d31ac92-1575-3b5a-8866-a9569579c1e7}, hash: B5EE4F44FA997B150DBC3639516E4597
    @Disabled()
    @Test()
    void updateVitalNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(generalOPDServiceMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(generalOPDServiceMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${d996a484-7d33-3c31-b4de-388c54dae395}, hash: 0986412D4E47540106CF859700EADC44
    @Disabled()
    @Test()
    void updateVitalNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(generalOPDServiceMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(generalOPDServiceMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${ec1b2b7c-0f51-3eab-b499-6f651c0c3daa}, hash: 23B5BBFED337F7CC98D591172102B306
    @Disabled()
    @Test()
    void updateVitalNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(generalOPDServiceMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(generalOPDServiceMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${1b1debc9-c0a1-389e-a479-65046de0a3cf}, hash: 03033704B46D497B4D242E5F6D91E84B
    @Disabled()
    @Test()
    void updateGeneralOPDExaminationNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(generalOPDServiceMock).updateBenExaminationDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateGeneralOPDExaminationNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(generalOPDServiceMock).updateBenExaminationDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${31662414-107b-3171-ab88-232e835d7976}, hash: 38CEA20667173BF09F94B540D66AF594
    @Disabled()
    @Test()
    void updateGeneralOPDExaminationNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(generalOPDServiceMock).updateBenExaminationDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateGeneralOPDExaminationNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(generalOPDServiceMock).updateBenExaminationDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${f5bf22ae-60aa-3de2-9e54-323404458606}, hash: 0F38C3CB60700C618030AD4014EDDDED
    @Disabled()
    @Test()
    void updateGeneralOPDExaminationNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(generalOPDServiceMock).updateBenExaminationDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateGeneralOPDExaminationNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(generalOPDServiceMock).updateBenExaminationDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${bacb4c54-f15c-3fb0-b5f3-c5f7d8866745}, hash: 3936A9A74235C51B73F4CE175521F9F0
    @Disabled()
    @Test()
    void updateGeneralOPDExaminationNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(generalOPDServiceMock).updateBenExaminationDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateGeneralOPDExaminationNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(generalOPDServiceMock).updateBenExaminationDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${55b674b8-f2c4-35d1-8bc9-6da56ab40cbd}, hash: A2461CAF747AAF16B50DA44EF7C096E5
    @Disabled()
    @Test()
    void updateGeneralOPDDoctorDataWhenResultGreaterThan0() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : true*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1L).when(generalOPDServiceMock).updateGeneralOPDDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.updateGeneralOPDDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(generalOPDServiceMock).updateGeneralOPDDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${c89b30a7-4fa9-3c65-8184-7729b00beab9}, hash: 6617157786383CE607A72EB642C1F36B
    @Disabled()
    @Test()
    void updateGeneralOPDDoctorDataWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : false*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1L).when(generalOPDServiceMock).updateGeneralOPDDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.updateGeneralOPDDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(generalOPDServiceMock).updateGeneralOPDDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${57687503-76c2-3641-b822-f512962675df}, hash: 9082069A7363B937ECF34DFAF5ABDA3B
    @Disabled()
    @Test()
    void updateGeneralOPDDoctorDataWhenCaughtException() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(generalOPDServiceMock).updateGeneralOPDDoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.updateGeneralOPDDoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(generalOPDServiceMock).updateGeneralOPDDoctorData((JsonObject) any(), eq("<value>"));
        });
    }

    //Sapient generated method id: ${413262f1-a75d-347c-b655-879d3a684fb8}, hash: 893767FA6CC44CB28927C0265E97064A
    @Disabled()
    @Test()
    void updateGeneralOPDDoctorDataWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new GeneralOPDController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(generalOPDServiceMock).updateGeneralOPDDoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.updateGeneralOPDDoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(generalOPDServiceMock).updateGeneralOPDDoctorData((JsonObject) any(), eq("<value>"));
        });
    }
}
