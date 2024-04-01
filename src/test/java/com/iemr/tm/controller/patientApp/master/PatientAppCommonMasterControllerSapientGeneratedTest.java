package com.iemr.tm.controller.patientApp.master;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.service.patientApp.master.CommonPatientAppMasterService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class PatientAppCommonMasterControllerSapientGeneratedTest {

    private final CommonPatientAppMasterService commonPatientAppMasterServiceMock = mock(CommonPatientAppMasterService.class, "commonPatientAppMasterService");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private PatientAppCommonMasterController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${d53e870b-09a5-349a-81ce-f74d0e3200f1}, hash: 9B0561DB677F76232B16747601636B31
    @Test()
    void patientAppChiefComplaintsMasterDataTest() {
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonPatientAppMasterServiceMock).getChiefComplaintsMaster(2, 2, "gender1");
        //Act Statement(s)
        String result = target.patientAppChiefComplaintsMasterData(2, 2, "gender1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonPatientAppMasterServiceMock).getChiefComplaintsMaster(2, 2, "gender1");
        });
    }

    //Sapient generated method id: ${d2c5ed83-9618-3543-8363-abdeb9eba7e3}, hash: 09CAD44B6C21FEBAF2ACECEE4BE574E3
    @Test()
    void patientAppCovidMasterDataTest() {
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonPatientAppMasterServiceMock).getCovidMaster(2, 2, "gender1");
        //Act Statement(s)
        String result = target.patientAppCovidMasterData(2, 2, "gender1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonPatientAppMasterServiceMock).getCovidMaster(2, 2, "gender1");
        });
    }

    //Sapient generated method id: ${94deea58-9322-3309-879c-37d728016900}, hash: 116C19AAC3DA61DC46F26642D199A4F6
    @Test()
    void saveBenCovidDoctorDataPatientAppTest() throws Exception {
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonPatientAppMasterServiceMock).saveCovidScreeningData("D");
        //Act Statement(s)
        String result = target.saveBenCovidDoctorDataPatientApp("D", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonPatientAppMasterServiceMock).saveCovidScreeningData("D");
        });
    }

    //Sapient generated method id: ${3b1d5db0-2cc1-379b-8483-7302aa19afd6}, hash: 1D5426DB9FBA7C5C28CF40B2DBEAF046
    @Disabled()
    @Test()
    void saveBenCovidDoctorDataPatientAppWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonPatientAppMasterServiceMock).saveCovidScreeningData("F");
        //Act Statement(s)
        String result = target.saveBenCovidDoctorDataPatientApp("F", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Unable to save data. G\",\"status\":\"Unable to save data. G\"}"));
            verify(commonPatientAppMasterServiceMock).saveCovidScreeningData("F");
        });
    }

    //Sapient generated method id: ${97586d58-edf1-3f8d-a278-a306d281e20c}, hash: 3BF85B19253D8FD193CB7D38EB76A733
    @Test()
    void saveBenChiefComplaintsDataPatientAppTest() throws Exception {
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonPatientAppMasterServiceMock).savechiefComplaintsData("D");
        //Act Statement(s)
        String result = target.saveBenChiefComplaintsDataPatientApp("D", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonPatientAppMasterServiceMock).savechiefComplaintsData("D");
        });
    }

    //Sapient generated method id: ${f91d2b45-7a11-32f4-a6c7-45f8d9f22544}, hash: 8BA3E39D9A5FCED09C6CE37A54E3E70A
    @Disabled()
    @Test()
    void saveBenChiefComplaintsDataPatientAppWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonPatientAppMasterServiceMock).savechiefComplaintsData("F");
        //Act Statement(s)
        String result = target.saveBenChiefComplaintsDataPatientApp("F", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Unable to save data. G\",\"status\":\"Unable to save data. G\"}"));
            verify(commonPatientAppMasterServiceMock).savechiefComplaintsData("F");
        });
    }

    //Sapient generated method id: ${ef5cf272-d3f8-3e60-9f22-9bdeaac93ba9}, hash: 3B57D231B037EA58B3FDE2FB803B0843
    @Test()
    void saveTCSlotDataPatientAppWhenIGreaterThan0() throws Exception {
        /* Branches:* (i > 0) : true*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(commonPatientAppMasterServiceMock).bookTCSlotData("A", "Authorization1");
        //Act Statement(s)
        String result = target.saveTCSlotDataPatientApp("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Teleconsultation slot booked successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonPatientAppMasterServiceMock).bookTCSlotData("A", "Authorization1");
        });
    }

    //Sapient generated method id: ${be096ced-aec4-3dfd-9505-d80449a4e9cf}, hash: 050FFDA5A028B9168880F51B2B3D7DBD
    @Test()
    void saveTCSlotDataPatientAppWhenINotGreaterThan0() throws Exception {
        /* Branches:* (i > 0) : false*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(commonPatientAppMasterServiceMock).bookTCSlotData("A", "Authorization1");
        //Act Statement(s)
        String result = target.saveTCSlotDataPatientApp("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error in slot booking\",\"status\":\"error in slot booking\"}"));
            verify(commonPatientAppMasterServiceMock).bookTCSlotData("A", "Authorization1");
        });
    }

    //Sapient generated method id: ${20418b17-2aac-353d-b994-ddafe595aa0c}, hash: 7163E367544B7E5DBE8FFC2CC9C57493
    @Disabled()
    @Test()
    void saveTCSlotDataPatientAppWhenCaughtException() throws Exception {
        /* Branches:* (i > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(commonPatientAppMasterServiceMock).bookTCSlotData("F", "Authorization1");
        //Act Statement(s)
        String result = target.saveTCSlotDataPatientApp("F", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Teleconsultation slot booked successfully\"},\"statusCode\":5000,\"errorMessage\":\"error in slot booking : B\",\"status\":\"error in slot booking : B\"}"));
            verify(commonPatientAppMasterServiceMock).bookTCSlotData("F", "Authorization1");
        });
    }

    //Sapient generated method id: ${6155c116-6c82-33bf-9d8d-4859ec6976dd}, hash: 8391C9E083F30AC301502D8E36FC6189
    @Disabled()
    @Test()
    void saveTCSlotDataPatientAppWhenINotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (i > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(commonPatientAppMasterServiceMock).bookTCSlotData("F", "Authorization1");
        //Act Statement(s)
        String result = target.saveTCSlotDataPatientApp("F", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error in slot booking : B\",\"status\":\"error in slot booking : B\"}"));
            verify(commonPatientAppMasterServiceMock).bookTCSlotData("F", "Authorization1");
        });
    }

    //Sapient generated method id: ${f27540da-b8f4-3ac2-b217-63ac280213e9}, hash: CE6DC70BEC0718292702A4805004147F
    @Test()
    void patientAppMasterDataTest() {
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonPatientAppMasterServiceMock).getMaster(0);
        //Act Statement(s)
        String result = target.patientAppMasterData(0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonPatientAppMasterServiceMock).getMaster(0);
        });
    }

    //Sapient generated method id: ${1296b217-8a10-393e-a838-0729092ffc6d}, hash: C2C41EE6BC8E23182ABF9D59BA4B0B1D
    @Test()
    void getPatientEpisodeDataMobileAppWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonPatientAppMasterServiceMock).getPatientEpisodeData("D");
        //Act Statement(s)
        String result = target.getPatientEpisodeDataMobileApp("D", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonPatientAppMasterServiceMock).getPatientEpisodeData("D");
        });
    }

    //Sapient generated method id: ${1c7cd2e8-3cb5-3d70-9e2e-60e0572f34fd}, hash: D089FDE42A8BE67BCCF99ABAC5A27592
    @Test()
    void getPatientEpisodeDataMobileAppWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonPatientAppMasterServiceMock).getPatientEpisodeData("A");
        //Act Statement(s)
        String result = target.getPatientEpisodeDataMobileApp("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error in getting beneficiary episode data\",\"status\":\"error in getting beneficiary episode data\"}"));
            verify(commonPatientAppMasterServiceMock).getPatientEpisodeData("A");
        });
    }

    //Sapient generated method id: ${01e90e10-1c73-34a4-80f3-65b8aee11ead}, hash: 93EB241CE73DEB55E8CCF10A2BFAFA3F
    @Disabled()
    @Test()
    void getPatientEpisodeDataMobileAppWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonPatientAppMasterServiceMock).getPatientEpisodeData("G");
        //Act Statement(s)
        String result = target.getPatientEpisodeDataMobileApp("G", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"error in getting beneficiary episode data : F\",\"status\":\"error in getting beneficiary episode data : F\"}"));
            verify(commonPatientAppMasterServiceMock).getPatientEpisodeData("G");
        });
    }

    //Sapient generated method id: ${f7736c41-7e11-330d-abcc-cd2014909804}, hash: F692E7B3622D065946D9FB7E9B95CFF1
    @Disabled()
    @Test()
    void getPatientEpisodeDataMobileAppWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonPatientAppMasterServiceMock).getPatientEpisodeData("F");
        //Act Statement(s)
        String result = target.getPatientEpisodeDataMobileApp("F", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error in getting beneficiary episode data : B\",\"status\":\"error in getting beneficiary episode data : B\"}"));
            verify(commonPatientAppMasterServiceMock).getPatientEpisodeData("F");
        });
    }

    //Sapient generated method id: ${352c5946-681e-317f-8037-83a5c20c427f}, hash: 980672DD07CC929AC7084664B0E70CA5
    @Test()
    void getPatientBookedSlotDetailsWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonPatientAppMasterServiceMock).getPatientBookedSlots("D");
        //Act Statement(s)
        String result = target.getPatientBookedSlotDetails("D", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonPatientAppMasterServiceMock).getPatientBookedSlots("D");
        });
    }

    //Sapient generated method id: ${3ef7dbf9-86e8-3997-84c7-a71e0d93e28f}, hash: 5727600E91EEAE0E1C4A81CD0A4DE701
    @Test()
    void getPatientBookedSlotDetailsWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonPatientAppMasterServiceMock).getPatientBookedSlots("A");
        //Act Statement(s)
        String result = target.getPatientBookedSlotDetails("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error in getting beneficiary booked slot data\",\"status\":\"error in getting beneficiary booked slot data\"}"));
            verify(commonPatientAppMasterServiceMock).getPatientBookedSlots("A");
        });
    }

    //Sapient generated method id: ${2ecf096c-6965-32ff-be49-db37d140b0af}, hash: CA23EE6E4F8A89A62DCFFD9B0810630B
    @Disabled()
    @Test()
    void getPatientBookedSlotDetailsWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonPatientAppMasterServiceMock).getPatientBookedSlots("F");
        //Act Statement(s)
        String result = target.getPatientBookedSlotDetails("F", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"error in getting beneficiary booked slot data : E\",\"status\":\"error in getting beneficiary booked slot data : E\"}"));
            verify(commonPatientAppMasterServiceMock).getPatientBookedSlots("F");
        });
    }

    //Sapient generated method id: ${10499ed6-c988-32a8-8b94-7ea97cb4f811}, hash: 625837553BB53ED77AEB10B50B775AF3
    @Disabled()
    @Test()
    void getPatientBookedSlotDetailsWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonPatientAppMasterServiceMock).getPatientBookedSlots("E");
        //Act Statement(s)
        String result = target.getPatientBookedSlotDetails("E", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error in getting beneficiary booked slot data : B\",\"status\":\"error in getting beneficiary booked slot data : B\"}"));
            verify(commonPatientAppMasterServiceMock).getPatientBookedSlots("E");
        });
    }

    //Sapient generated method id: ${eddb6c6c-0460-3ffb-9ebe-f3ab3a99dd65}, hash: 3D9A241660E60ED700A664441917CE34
    @Test()
    void saveSpecialistDiagnosisDataWhenPIDIsNotNull() throws Exception {
        /* Branches:* (pID != null) : true*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0L).when(commonPatientAppMasterServiceMock).saveSpecialistDiagnosisData("A");
        //Act Statement(s)
        String result = target.saveSpecialistDiagnosisData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"success\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonPatientAppMasterServiceMock).saveSpecialistDiagnosisData("A");
        });
    }

    //Sapient generated method id: ${662343fb-8fed-3e37-ba2d-1bcc05676f0a}, hash: EA76AA3B87A20ECC8FAC30CE4A4D2761
    @Test()
    void saveSpecialistDiagnosisDataWhenPIDIsNull() throws Exception {
        /* Branches:* (pID != null) : false*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonPatientAppMasterServiceMock).saveSpecialistDiagnosisData("A");
        //Act Statement(s)
        String result = target.saveSpecialistDiagnosisData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error in saving diagnosis data\",\"status\":\"error in saving diagnosis data\"}"));
            verify(commonPatientAppMasterServiceMock).saveSpecialistDiagnosisData("A");
        });
    }

    //Sapient generated method id: ${283d4fa1-a9eb-3f0e-ad4c-8bbda349f089}, hash: A5D77C7B77117F8A5E1D5259B0760861
    @Disabled()
    @Test()
    void saveSpecialistDiagnosisDataWhenCaughtException() throws Exception {
        /* Branches:* (pID != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0L).when(commonPatientAppMasterServiceMock).saveSpecialistDiagnosisData("E");
        //Act Statement(s)
        String result = target.saveSpecialistDiagnosisData("E", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"success\"},\"statusCode\":5000,\"errorMessage\":\"error in saving specialist diagnosis data : B\",\"status\":\"error in saving specialist diagnosis data : B\"}"));
            verify(commonPatientAppMasterServiceMock).saveSpecialistDiagnosisData("E");
        });
    }

    //Sapient generated method id: ${fb764c83-b123-3ffe-a133-c26b0eba24c1}, hash: 629E3C4FF6F33CF9B3246121671386A2
    @Disabled()
    @Test()
    void saveSpecialistDiagnosisDataWhenPIDIsNullAndCaughtException() throws Exception {
        /* Branches:* (pID != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonPatientAppMasterServiceMock).saveSpecialistDiagnosisData("E");
        //Act Statement(s)
        String result = target.saveSpecialistDiagnosisData("E", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error in saving specialist diagnosis data : B\",\"status\":\"error in saving specialist diagnosis data : B\"}"));
            verify(commonPatientAppMasterServiceMock).saveSpecialistDiagnosisData("E");
        });
    }

    //Sapient generated method id: ${e71ce380-73bc-3abf-9325-14072e50c05f}, hash: 85284DEB607F28CDBD2A5EEF2142D33A
    @Test()
    void getSpecialistDiagnosisDataWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonPatientAppMasterServiceMock).getSpecialistDiagnosisData("D");
        //Act Statement(s)
        String result = target.getSpecialistDiagnosisData("D", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonPatientAppMasterServiceMock).getSpecialistDiagnosisData("D");
        });
    }

    //Sapient generated method id: ${48773340-a8c4-31f9-af2c-a8c812af9c3e}, hash: 7F2A2AD7BC9A3F5F4EA8EF087041D4DC
    @Test()
    void getSpecialistDiagnosisDataWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonPatientAppMasterServiceMock).getSpecialistDiagnosisData("A");
        //Act Statement(s)
        String result = target.getSpecialistDiagnosisData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error in getting diagnosis data\",\"status\":\"error in getting diagnosis data\"}"));
            verify(commonPatientAppMasterServiceMock).getSpecialistDiagnosisData("A");
        });
    }

    //Sapient generated method id: ${e7a3c3c7-fe4c-38d4-85f1-5adde469354b}, hash: 2F6DDE1923FCE128AAA641A1638EAEF5
    @Disabled()
    @Test()
    void getSpecialistDiagnosisDataWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonPatientAppMasterServiceMock).getSpecialistDiagnosisData("F");
        //Act Statement(s)
        String result = target.getSpecialistDiagnosisData("F", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"error in getting specialist diagnosis data : E\",\"status\":\"error in getting specialist diagnosis data : E\"}"));
            verify(commonPatientAppMasterServiceMock).getSpecialistDiagnosisData("F");
        });
    }

    //Sapient generated method id: ${cabab428-43f0-3c4c-a8b5-be6d3e53440b}, hash: 3E7DF0F3C5688F036D37319903E32ADA
    @Disabled()
    @Test()
    void getSpecialistDiagnosisDataWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonPatientAppMasterServiceMock).getSpecialistDiagnosisData("E");
        //Act Statement(s)
        String result = target.getSpecialistDiagnosisData("E", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error in getting specialist diagnosis data : B\",\"status\":\"error in getting specialist diagnosis data : B\"}"));
            verify(commonPatientAppMasterServiceMock).getSpecialistDiagnosisData("E");
        });
    }

    //Sapient generated method id: ${f43c61d5-778a-3e2d-a029-eef42614444c}, hash: 5ECC349D0B6AEB1BA131FA696934147A
    @Test()
    void getPatientsLast_3_EpisodeWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonPatientAppMasterServiceMock).getPatientsLast_3_Episode("D");
        //Act Statement(s)
        String result = target.getPatientsLast_3_Episode("D", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonPatientAppMasterServiceMock).getPatientsLast_3_Episode("D");
        });
    }

    //Sapient generated method id: ${d14afa2d-c26f-3dc6-a51c-5ae54996d777}, hash: FF1EBEAA0016A4FB24EE7EFCF66F91F1
    @Test()
    void getPatientsLast_3_EpisodeWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonPatientAppMasterServiceMock).getPatientsLast_3_Episode("A");
        //Act Statement(s)
        String result = target.getPatientsLast_3_Episode("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error in getPatientsLast_3_Episode data\",\"status\":\"error in getPatientsLast_3_Episode data\"}"));
            verify(commonPatientAppMasterServiceMock).getPatientsLast_3_Episode("A");
        });
    }

    //Sapient generated method id: ${9d0c04f3-25dd-3868-a543-008f4eef5fe8}, hash: 5B5AC0EBD8396E6EAB46821B97BD557C
    @Disabled()
    @Test()
    void getPatientsLast_3_EpisodeWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonPatientAppMasterServiceMock).getPatientsLast_3_Episode("F");
        //Act Statement(s)
        String result = target.getPatientsLast_3_Episode("F", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"error in getPatientsLast_3_Episode data : D\",\"status\":\"error in getPatientsLast_3_Episode data : D\"}"));
            verify(commonPatientAppMasterServiceMock).getPatientsLast_3_Episode("F");
        });
    }

    //Sapient generated method id: ${4098973a-9b47-3dec-b575-0f07484d96c8}, hash: EE523B4129A24284609EAC8C77CFA9C5
    @Disabled()
    @Test()
    void getPatientsLast_3_EpisodeWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PatientAppCommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonPatientAppMasterServiceMock).getPatientsLast_3_Episode("D");
        //Act Statement(s)
        String result = target.getPatientsLast_3_Episode("D", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error in getPatientsLast_3_Episode data : B\",\"status\":\"error in getPatientsLast_3_Episode data : B\"}"));
            verify(commonPatientAppMasterServiceMock).getPatientsLast_3_Episode("D");
        });
    }
}
