package com.iemr.tm.controller.labtechnician;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.google.gson.JsonObject;
import com.iemr.tm.service.labtechnician.LabTechnicianServiceImpl;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
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
class LabtechnicianControllerSapientGeneratedTest {

    private final LabTechnicianServiceImpl labTechnicianServiceImplMock = mock(LabTechnicianServiceImpl.class, "labTechnicianServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private LabtechnicianController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${b463b4dd-6149-3d38-8d7d-bfbdcf8ff83d}, hash: 4788F78F6EB3DFCC92729CD6C6B20643
    @Disabled()
    @Test()
    void saveLabTestResultWhenJsnOBJIsNull() throws Exception {
        /* Branches:* (jsnOBJ != null) : false*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveLabTestResult("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"Invalid request\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}")));
    }

    //Sapient generated method id: ${264226ee-2286-3bf5-b6fd-8f87569de1ec}, hash: 4DAE092CD796C90DAAC7AFA9711679B7
    @Disabled()
    @Test()
    void saveLabTestResultWhenCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveLabTestResult("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"Invalid request\"},\"statusCode\":5000,\"errorMessage\":\"Unable to save data\",\"status\":\"Unable to save data\"}")));
    }

    //Sapient generated method id: ${26bf8f2d-5b79-3982-998a-664a7d69e03f}, hash: 9F269E9135CB9B5C2F68BBECAFC6939C
    @Disabled()
    @Test()
    void saveLabTestResultWhenLabResultSaveResGreaterThan0() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != labResultSaveRes) : true* (labResultSaveRes > 0) : true*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(labTechnicianServiceImplMock).saveLabTestResult((JsonObject) any());
        //Act Statement(s)
        String result = target.saveLabTestResult("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data saved successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(labTechnicianServiceImplMock).saveLabTestResult((JsonObject) any());
        });
    }

    //Sapient generated method id: ${41546bfa-ab1b-3ddd-a97e-795c407fed62}, hash: 43504BF2A3FCE61BAE232C65D823F59C
    @Disabled()
    @Test()
    void saveLabTestResultWhenLabResultSaveResNotGreaterThan0() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != labResultSaveRes) : true* (labResultSaveRes > 0) : false*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1).when(labTechnicianServiceImplMock).saveLabTestResult((JsonObject) any());
        //Act Statement(s)
        String result = target.saveLabTestResult("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Unable to save data\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(labTechnicianServiceImplMock).saveLabTestResult((JsonObject) any());
        });
    }

    //Sapient generated method id: ${3a2836ae-900c-3f9b-aad0-84eaf23d95e8}, hash: 2CF9D99A78FBF82ED146C26E7BA5512A
    @Disabled()
    @Test()
    void saveLabTestResultWhenLabResultSaveResGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != labResultSaveRes) : true* (labResultSaveRes > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(labTechnicianServiceImplMock).saveLabTestResult((JsonObject) any());
        //Act Statement(s)
        String result = target.saveLabTestResult("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data saved successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to save data\",\"status\":\"Unable to save data\"}"));
            verify(labTechnicianServiceImplMock).saveLabTestResult((JsonObject) any());
        });
    }

    //Sapient generated method id: ${5ef4094e-297b-3d85-ac8e-00247fcaa1b9}, hash: 62751E1CFA338177E12031E9E047EC9A
    @Disabled()
    @Test()
    void saveLabTestResultWhenLabResultSaveResNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (null != labResultSaveRes) : true* (labResultSaveRes > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(labTechnicianServiceImplMock).saveLabTestResult((JsonObject) any());
        //Act Statement(s)
        String result = target.saveLabTestResult("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Unable to save data\"},\"statusCode\":5000,\"errorMessage\":\"Unable to save data\",\"status\":\"Unable to save data\"}"));
            verify(labTechnicianServiceImplMock).saveLabTestResult((JsonObject) any());
        });
    }

    //Sapient generated method id: ${898253c7-c35e-3c2f-88cf-71f0437ff2cc}, hash: 2A3E8D3EBF52FD94E730A3871BBC9B8E
    @Test()
    void getBeneficiaryPrescribedProcedureWhenJsnOBJNotHasVisitCode() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (!jsnOBJ.isJsonNull()) : true* (jsnOBJ.has("beneficiaryRegID")) : true* (jsnOBJ.has("visitCode")) : false*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBeneficiaryPrescribedProcedure("{\"beneficiaryRegID\": \"12345\"}");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${bb1477bc-4999-3d6b-9d63-66246da9a098}, hash: F348E22855B648E851CCA4BAA1169F4F
    @Disabled()
    @Test()
    void getBeneficiaryPrescribedProcedureWhenSIsNotNull() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (!jsnOBJ.isJsonNull()) : true* (jsnOBJ.has("beneficiaryRegID")) : true* (jsnOBJ.has("visitCode")) : true* (s != null) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: jsnOBJ, object of type JsonElement*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getBenePrescribedProcedureDetails1").when(labTechnicianServiceImplMock).getBenePrescribedProcedureDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBeneficiaryPrescribedProcedure("<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"return_of_getBenePrescribedProcedureDetails1\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(labTechnicianServiceImplMock).getBenePrescribedProcedureDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${f1744f19-0efc-3d6d-af76-68b8564f10f7}, hash: 32B59CF111D98EBCB66EF1C12C10A991
    @Disabled()
    @Test()
    void getBeneficiaryPrescribedProcedureWhenSIsNull() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (!jsnOBJ.isJsonNull()) : true* (jsnOBJ.has("beneficiaryRegID")) : true* (jsnOBJ.has("visitCode")) : true* (s != null) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: jsnOBJ, object of type JsonElement*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(labTechnicianServiceImplMock).getBenePrescribedProcedureDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBeneficiaryPrescribedProcedure("<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error in prescribed procedure details\",\"status\":\"Error in prescribed procedure details\"}"));
            verify(labTechnicianServiceImplMock).getBenePrescribedProcedureDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${aeca9c23-48d4-37e3-9fd3-67021d021a99}, hash: F24DC813A7F0780BE27950B19A74E8F5
    @Test()
    void getBeneficiaryPrescribedProcedureWhenJsnOBJNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (!jsnOBJ.isJsonNull()) : true* (jsnOBJ.has("beneficiaryRegID")) : true* (jsnOBJ.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBeneficiaryPrescribedProcedure("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting prescribed procedure data\",\"status\":\"Error while getting prescribed procedure data\"}")));
    }

    //Sapient generated method id: ${87cde392-e227-3e8b-ba4d-ff5091d4e5ce}, hash: 94C8E752AFACAB352379E801F119EB97
    @Disabled()
    @Test()
    void getBeneficiaryPrescribedProcedureWhenSIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (!jsnOBJ.isJsonNull()) : true* (jsnOBJ.has("beneficiaryRegID")) : true* (jsnOBJ.has("visitCode")) : true* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getBenePrescribedProcedureDetails1").when(labTechnicianServiceImplMock).getBenePrescribedProcedureDetails(0L, 0L);
        //Act Statement(s)
        String result = target.getBeneficiaryPrescribedProcedure("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(labTechnicianServiceImplMock).getBenePrescribedProcedureDetails(0L, 0L);
        });
    }

    //Sapient generated method id: ${40fb04b9-cdf9-37d5-8e93-3fa7b88f442e}, hash: 79C76DD6F96A991092784AE670B3236D
    @Disabled()
    @Test()
    void getBeneficiaryPrescribedProcedureWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (!jsnOBJ.isJsonNull()) : true* (jsnOBJ.has("beneficiaryRegID")) : true* (jsnOBJ.has("visitCode")) : true* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(labTechnicianServiceImplMock).getBenePrescribedProcedureDetails(0L, 0L);
        //Act Statement(s)
        String result = target.getBeneficiaryPrescribedProcedure("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting prescribed procedure data\",\"status\":\"Error while getting prescribed procedure data\"}"));
            verify(labTechnicianServiceImplMock).getBenePrescribedProcedureDetails(0L, 0L);
        });
    }

    //Sapient generated method id: ${ffd722e6-089f-3dae-aa6b-f0538b4e2e86}, hash: 5E36D323505ED413DCCED64049840144
    @Disabled()
    @Test()
    void getLabResultForVisitCodeWhenJsnOBJNotHasVisitCode() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (!jsnOBJ.isJsonNull()) : true* (jsnOBJ.has("beneficiaryRegID")) : true* (jsnOBJ.has("visitCode")) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getLabResultForVisitCode("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${4d933417-a9c5-3946-a322-111af5254c64}, hash: 8786F7AD0C7470C3B843542EF2F5577A
    @Test()
    void getLabResultForVisitCodeWhenSIsNotNull() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (!jsnOBJ.isJsonNull()) : true* (jsnOBJ.has("beneficiaryRegID")) : true* (jsnOBJ.has("visitCode")) : true* (s != null) : true*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getLabResultForVisitcode1").when(labTechnicianServiceImplMock).getLabResultForVisitcode(1234567890L, 9876543210L);
        //Act Statement(s)
        String result = target.getLabResultForVisitCode("{\"beneficiaryRegID\": 1234567890, \"visitCode\": 9876543210}");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"return_of_getLabResultForVisitcode1\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(labTechnicianServiceImplMock).getLabResultForVisitcode(1234567890L, 9876543210L);
        });
    }

    //Sapient generated method id: ${3211e068-ed31-3bb8-a3ab-0ba129a6a331}, hash: E3A4CEBB9CBE9B05A701F71AD7BA3618
    @Disabled()
    @Test()
    void getLabResultForVisitCodeWhenSIsNull() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (!jsnOBJ.isJsonNull()) : true* (jsnOBJ.has("beneficiaryRegID")) : true* (jsnOBJ.has("visitCode")) : true* (s != null) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(labTechnicianServiceImplMock).getLabResultForVisitcode(0L, 0L);
        //Act Statement(s)
        String result = target.getLabResultForVisitCode("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting lab report\",\"status\":\"Error while getting lab report\"}"));
            verify(labTechnicianServiceImplMock).getLabResultForVisitcode(0L, 0L);
        });
    }

    //Sapient generated method id: ${2c059a00-33ae-3c0e-bfe9-88d2885cf517}, hash: 6E4B51FFF171658A216C4A358A5ADF9C
    @Disabled()
    @Test()
    void getLabResultForVisitCodeWhenJsnOBJNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (!jsnOBJ.isJsonNull()) : true* (jsnOBJ.has("beneficiaryRegID")) : true* (jsnOBJ.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getLabResultForVisitCode("{\"beneficiaryRegID\": \"12345\"}");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting lab report\",\"status\":\"Error while getting lab report\"}")));
    }

    //Sapient generated method id: ${2514f88f-12f7-32b8-8ed5-694c5c10f1a5}, hash: DF5D8D97C75D84BE65EBECCBBEC8EF38
    @Disabled()
    @Test()
    void getLabResultForVisitCodeWhenSIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (!jsnOBJ.isJsonNull()) : true* (jsnOBJ.has("beneficiaryRegID")) : true* (jsnOBJ.has("visitCode")) : true* (s != null) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        RuntimeException runtimeExceptionMock = mock(RuntimeException.class);
        doThrow(runtimeExceptionMock).when(labTechnicianServiceImplMock).getLabResultForVisitcode(1234567890L, 9876543210L);
        //Act Statement(s)
        String result = target.getLabResultForVisitCode("{\"beneficiaryRegID\": 1234567890, \"visitCode\": 9876543210}");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"return_of_getLabResultForVisitcode1\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting lab report\",\"status\":\"Error while getting lab report\"}"));
            verify(labTechnicianServiceImplMock).getLabResultForVisitcode(1234567890L, 9876543210L);
        });
    }

    //Sapient generated method id: ${17327af7-5488-3471-bb60-74b3fd9ab15b}, hash: 708DA1F2548606D466FCB50D756796FF
    @Disabled()
    @Test()
    void getLabResultForVisitCodeWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (!jsnOBJ.isJsonNull()) : true* (jsnOBJ.has("beneficiaryRegID")) : true* (jsnOBJ.has("visitCode")) : true* (s != null) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new LabtechnicianController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        RuntimeException runtimeExceptionMock = mock(RuntimeException.class);
        doThrow(runtimeExceptionMock).when(labTechnicianServiceImplMock).getLabResultForVisitcode(1234567890L, 9876543210L);
        //Act Statement(s)
        String result = target.getLabResultForVisitCode("{\"beneficiaryRegID\": 1234567890, \"visitCode\": 9876543210}");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting lab report\",\"status\":\"Error while getting lab report\"}"));
            verify(labTechnicianServiceImplMock).getLabResultForVisitcode(1234567890L, 9876543210L);
        });
    }
}
