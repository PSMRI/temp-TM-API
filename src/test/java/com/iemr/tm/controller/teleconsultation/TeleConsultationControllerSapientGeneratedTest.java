package com.iemr.tm.controller.teleconsultation;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.service.tele_consultation.TeleConsultationServiceImpl;
import com.google.gson.JsonObject;
import org.mockito.MockitoAnnotations;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class TeleConsultationControllerSapientGeneratedTest {

    private final TeleConsultationServiceImpl teleConsultationServiceImplMock = mock(TeleConsultationServiceImpl.class, "teleConsultationServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private TeleConsultationController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${2a7187e5-cd55-3a5d-8a9c-143d3935d5c6}, hash: DBEF9D59CE63B08CDEDF84C6AE9EAB8B
    @Test()
    void benArrivalStatusUpdaterWhenRequestOBJIsNull() throws Exception {
        /* Branches:* (requestOBJ != null) : false*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.benArrivalStatusUpdater((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${cde19d26-4ec3-3956-995c-d38dcf9eace0}, hash: DFC5306356965AA0482C9CEDF81C74FA
    @Test()
    void benArrivalStatusUpdaterWhenIGreaterThan0() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : true*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(teleConsultationServiceImplMock).updateBeneficiaryArrivalStatus("requestOBJ1");
        //Act Statement(s)
        String result = target.benArrivalStatusUpdater("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Beneficiary arrival status updated successfully.\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(teleConsultationServiceImplMock).updateBeneficiaryArrivalStatus("requestOBJ1");
        });
    }

    //Sapient generated method id: ${f87e0ced-deba-3200-ad97-421c01b9120d}, hash: 30A7865294F03BA6E808A25170B48815
    @Test()
    void benArrivalStatusUpdaterWhenINotGreaterThan0() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : false*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1).when(teleConsultationServiceImplMock).updateBeneficiaryArrivalStatus("requestOBJ1");
        //Act Statement(s)
        String result = target.benArrivalStatusUpdater("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error in updating beneficiary arrival status.\",\"status\":\"Error in updating beneficiary arrival status.\"}"));
            verify(teleConsultationServiceImplMock).updateBeneficiaryArrivalStatus("requestOBJ1");
        });
    }

    //Sapient generated method id: ${7bc0c9f1-32bd-38dd-9440-15f2b2b37699}, hash: 0E37A4D3A6E2B94338BA1D3ED1AD9B2B
    @Disabled()
    @Test()
    void benArrivalStatusUpdaterWhenCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.benArrivalStatusUpdater((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while updating beneficiary arrival status.benArrivalStatusUpdater_exception1\",\"status\":\"Error while updating beneficiary arrival status.benArrivalStatusUpdater_exception1\"}")));
    }

    //Sapient generated method id: ${d509ce64-4a6f-3650-925e-7900f2d67ca7}, hash: D61FE49F7A8229BB156EEF52DE94E228
    @Disabled()
    @Test()
    void benArrivalStatusUpdaterWhenIGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(teleConsultationServiceImplMock).updateBeneficiaryArrivalStatus("requestOBJ1");
        //Act Statement(s)
        String result = target.benArrivalStatusUpdater("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Beneficiary arrival status updated successfully.\"},\"statusCode\":5000,\"errorMessage\":\"Error while updating beneficiary arrival status.benArrivalStatusUpdater_exception1\",\"status\":\"Error while updating beneficiary arrival status.benArrivalStatusUpdater_exception1\"}"));
            verify(teleConsultationServiceImplMock).updateBeneficiaryArrivalStatus("requestOBJ1");
        });
    }

    //Sapient generated method id: ${f391b9f6-0b4c-3d9c-b90a-dd43670cfd02}, hash: 59E63F445E2BD7533509499C498F9889
    @Disabled()
    @Test()
    void benArrivalStatusUpdaterWhenINotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(teleConsultationServiceImplMock).updateBeneficiaryArrivalStatus("requestOBJ1");
        //Act Statement(s)
        String result = target.benArrivalStatusUpdater("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while updating beneficiary arrival status.benArrivalStatusUpdater_exception1\",\"status\":\"Error while updating beneficiary arrival status.benArrivalStatusUpdater_exception1\"}"));
            verify(teleConsultationServiceImplMock).updateBeneficiaryArrivalStatus("requestOBJ1");
        });
    }

    //Sapient generated method id: ${2751f42a-a870-392e-8ce4-d968168bf8df}, hash: 52260DF9896D1CE7D34CC4BBBFEF0F4E
    @Test()
    void updateBeneficiaryStatusToCancelTCRequestWhenRequestOBJIsNull() throws Exception {
        /* Branches:* (requestOBJ != null) : false*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.updateBeneficiaryStatusToCancelTCRequest((String) null, "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${55f28e9a-93e7-3137-9217-64a9fff38454}, hash: 9CEC926CD46777CC6D145A329F3EA320
    @Test()
    void updateBeneficiaryStatusToCancelTCRequestWhenIGreaterThan0() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : true*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(teleConsultationServiceImplMock).updateBeneficiaryStatusToCancelTCRequest("requestOBJ1", "Authorization1");
        //Act Statement(s)
        String result = target.updateBeneficiaryStatusToCancelTCRequest("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Beneficiary TC request cancelled successfully.\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(teleConsultationServiceImplMock).updateBeneficiaryStatusToCancelTCRequest("requestOBJ1", "Authorization1");
        });
    }

    //Sapient generated method id: ${9879e484-1ef6-3446-96de-98a2eb13cb74}, hash: 784837E3546AE6BA6BFE444F7CF818EB
    @Test()
    void updateBeneficiaryStatusToCancelTCRequestWhenINotGreaterThan0() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : false*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1).when(teleConsultationServiceImplMock).updateBeneficiaryStatusToCancelTCRequest("requestOBJ1", "Authorization1");
        //Act Statement(s)
        String result = target.updateBeneficiaryStatusToCancelTCRequest("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Teleconsultation cancel request failed.\",\"status\":\"Teleconsultation cancel request failed.\"}"));
            verify(teleConsultationServiceImplMock).updateBeneficiaryStatusToCancelTCRequest("requestOBJ1", "Authorization1");
        });
    }

    //Sapient generated method id: ${3e3cd3ee-466b-3ed5-b9b3-a7b47b0607a2}, hash: 25B38B4E4963EBDD888E6AEBC0A2BB35
    @Disabled()
    @Test()
    void updateBeneficiaryStatusToCancelTCRequestWhenCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.updateBeneficiaryStatusToCancelTCRequest((String) null, "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while updating beneficiary status for Teleconsultation cancel request \\u003d updateBeneficiaryStatusToCancelTCRequest_exception1\",\"status\":\"Error while updating beneficiary status for Teleconsultation cancel request \\u003d updateBeneficiaryStatusToCancelTCRequest_exception1\"}")));
    }

    //Sapient generated method id: ${752a3cbf-b712-3cfb-9df9-8a4f81c615ab}, hash: ABE643499A389F3181DE6D1A449B2CC1
    @Disabled()
    @Test()
    void updateBeneficiaryStatusToCancelTCRequestWhenIGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(teleConsultationServiceImplMock).updateBeneficiaryStatusToCancelTCRequest("requestOBJ1", "Authorization1");
        //Act Statement(s)
        String result = target.updateBeneficiaryStatusToCancelTCRequest("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Beneficiary TC request cancelled successfully.\"},\"statusCode\":5000,\"errorMessage\":\"Error while updating beneficiary status for Teleconsultation cancel request \\u003d updateBeneficiaryStatusToCancelTCRequest_exception1\",\"status\":\"Error while updating beneficiary status for Teleconsultation cancel request \\u003d updateBeneficiaryStatusToCancelTCRequest_exception1\"}"));
            verify(teleConsultationServiceImplMock).updateBeneficiaryStatusToCancelTCRequest("requestOBJ1", "Authorization1");
        });
    }

    //Sapient generated method id: ${6a676c2f-873a-391f-b023-d82bf1b4f9a1}, hash: 76AE91C82842FB8F235573D6BCB19D28
    @Disabled()
    @Test()
    void updateBeneficiaryStatusToCancelTCRequestWhenINotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(teleConsultationServiceImplMock).updateBeneficiaryStatusToCancelTCRequest("requestOBJ1", "Authorization1");
        //Act Statement(s)
        String result = target.updateBeneficiaryStatusToCancelTCRequest("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while updating beneficiary status for Teleconsultation cancel request \\u003d updateBeneficiaryStatusToCancelTCRequest_exception1\",\"status\":\"Error while updating beneficiary status for Teleconsultation cancel request \\u003d updateBeneficiaryStatusToCancelTCRequest_exception1\"}"));
            verify(teleConsultationServiceImplMock).updateBeneficiaryStatusToCancelTCRequest("requestOBJ1", "Authorization1");
        });
    }

    //Sapient generated method id: ${dbf6b206-f9dc-3877-9701-5e1d8af5581f}, hash: 4577897028225E32FE4F7CC967203CA6
    @Test()
    void checkBeneficiaryStatusToProceedWithSpecialistWhenRequestOBJIsNull() throws Exception {
        /* Branches:* (requestOBJ != null) : false*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.checkBeneficiaryStatusToProceedWithSpecialist((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${f17c51c0-2b37-30d4-b7cc-72f9e1816373}, hash: E6328F72C2240B8B6175528AC5CD77D4
    @Test()
    void checkBeneficiaryStatusToProceedWithSpecialistWhenIGreaterThan0() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : true*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(teleConsultationServiceImplMock).checkBeneficiaryStatusForSpecialistTransaction("requestOBJ1");
        //Act Statement(s)
        String result = target.checkBeneficiaryStatusToProceedWithSpecialist("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Specialist can proceed with beneficiary TM session.\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(teleConsultationServiceImplMock).checkBeneficiaryStatusForSpecialistTransaction("requestOBJ1");
        });
    }

    //Sapient generated method id: ${f6ea8df3-6bf0-3ecb-82fe-6bed11b9bffa}, hash: DAC9019E513C31232075E7833A9AAE89
    @Test()
    void checkBeneficiaryStatusToProceedWithSpecialistWhenINotGreaterThan0() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : false*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1).when(teleConsultationServiceImplMock).checkBeneficiaryStatusForSpecialistTransaction("requestOBJ1");
        //Act Statement(s)
        String result = target.checkBeneficiaryStatusToProceedWithSpecialist("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Issue while fetching beneficiary status.\",\"status\":\"Issue while fetching beneficiary status.\"}"));
            verify(teleConsultationServiceImplMock).checkBeneficiaryStatusForSpecialistTransaction("requestOBJ1");
        });
    }

    //Sapient generated method id: ${729e3d87-5427-30f3-b2ce-1c5d94f83455}, hash: AA015CEE1A4656449551062A96393A5C
    @Disabled()
    @Test()
    void checkBeneficiaryStatusToProceedWithSpecialistWhenCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.checkBeneficiaryStatusToProceedWithSpecialist((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Issue while fetching beneficiary status \\u003d checkBeneficiaryStatusToProceedWithSpecialist_exception1\",\"status\":\"Issue while fetching beneficiary status \\u003d checkBeneficiaryStatusToProceedWithSpecialist_exception1\"}")));
    }

    //Sapient generated method id: ${a4394940-d636-3633-bd77-aaf67c2d2689}, hash: 4C497EE16B2CBB1C99F6845CB88D7074
    @Disabled()
    @Test()
    void checkBeneficiaryStatusToProceedWithSpecialistWhenIGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(teleConsultationServiceImplMock).checkBeneficiaryStatusForSpecialistTransaction("requestOBJ1");
        //Act Statement(s)
        String result = target.checkBeneficiaryStatusToProceedWithSpecialist("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Specialist can proceed with beneficiary TM session.\"},\"statusCode\":5000,\"errorMessage\":\"Issue while fetching beneficiary status \\u003d checkBeneficiaryStatusToProceedWithSpecialist_exception1\",\"status\":\"Issue while fetching beneficiary status \\u003d checkBeneficiaryStatusToProceedWithSpecialist_exception1\"}"));
            verify(teleConsultationServiceImplMock).checkBeneficiaryStatusForSpecialistTransaction("requestOBJ1");
        });
    }

    //Sapient generated method id: ${d386f756-fa42-312a-98e1-1771060f9a60}, hash: 6E67DFD72C097BDF25E184E831D47B68
    @Disabled()
    @Test()
    void checkBeneficiaryStatusToProceedWithSpecialistWhenINotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(teleConsultationServiceImplMock).checkBeneficiaryStatusForSpecialistTransaction("requestOBJ1");
        //Act Statement(s)
        String result = target.checkBeneficiaryStatusToProceedWithSpecialist("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Issue while fetching beneficiary status \\u003d checkBeneficiaryStatusToProceedWithSpecialist_exception1\",\"status\":\"Issue while fetching beneficiary status \\u003d checkBeneficiaryStatusToProceedWithSpecialist_exception1\"}"));
            verify(teleConsultationServiceImplMock).checkBeneficiaryStatusForSpecialistTransaction("requestOBJ1");
        });
    }

    //Sapient generated method id: ${bff048d8-d060-372e-bea3-76940c60877b}, hash: 0F3C690FF1123899D0D494122DDE58E8
    @Test()
    void createTCRequestForBeneficiaryWhenRequestOBJIsNull() throws Exception {
        /* Branches:* (requestOBJ != null) : false*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.createTCRequestForBeneficiary((String) null, "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${a167cd66-e051-3aad-957a-14a90c9524f7}, hash: E28A010F45C112D3F844D04460F7957B
    @Disabled()
    @Test()
    void createTCRequestForBeneficiaryWhenIGreaterThan0() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : true*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(teleConsultationServiceImplMock).createTCRequestFromWorkList((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.createTCRequestForBeneficiary("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Teleconsultation request created successfully.\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(teleConsultationServiceImplMock).createTCRequestFromWorkList((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${f84bb4b2-bf10-307f-bc56-bba27f98213e}, hash: E2F2C3DDB3FF6E1762E049019BA21149
    @Disabled()
    @Test()
    void createTCRequestForBeneficiaryWhenINotGreaterThan0() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(teleConsultationServiceImplMock).createTCRequestFromWorkList((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.createTCRequestForBeneficiary("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Issue while creating Teleconsultation request.\",\"status\":\"Issue while creating Teleconsultation request.\"}"));
            verify(teleConsultationServiceImplMock).createTCRequestFromWorkList((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${d2f86f11-be17-372f-ba5c-086145d49638}, hash: 47422C23519F022410C7D6595BB171AF
    @Disabled()
    @Test()
    void createTCRequestForBeneficiaryWhenCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.createTCRequestForBeneficiary((String) null, "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Issue while creating Teleconsultation request \\u003d createTCRequestForBeneficiary_exception1\",\"status\":\"Issue while creating Teleconsultation request \\u003d createTCRequestForBeneficiary_exception1\"}")));
    }

    //Sapient generated method id: ${0ccd01aa-c053-32e1-8a4f-55e859da15da}, hash: 91B6292DF822161D140F0D08DC32BA79
    @Disabled()
    @Test()
    void createTCRequestForBeneficiaryWhenIGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(teleConsultationServiceImplMock).createTCRequestFromWorkList((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.createTCRequestForBeneficiary("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Teleconsultation request created successfully.\"},\"statusCode\":5000,\"errorMessage\":\"Issue while creating Teleconsultation request \\u003d createTCRequestForBeneficiary_exception1\",\"status\":\"Issue while creating Teleconsultation request \\u003d createTCRequestForBeneficiary_exception1\"}"));
            verify(teleConsultationServiceImplMock).createTCRequestFromWorkList((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${aec26c90-a408-3bee-b568-642c2de2cb49}, hash: D67432A5F7C675083D142597072E59FF
    @Disabled()
    @Test()
    void createTCRequestForBeneficiaryWhenINotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (i > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(teleConsultationServiceImplMock).createTCRequestFromWorkList((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.createTCRequestForBeneficiary("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Issue while creating Teleconsultation request \\u003d createTCRequestForBeneficiary_exception1\",\"status\":\"Issue while creating Teleconsultation request \\u003d createTCRequestForBeneficiary_exception1\"}"));
            verify(teleConsultationServiceImplMock).createTCRequestFromWorkList((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${41732c11-ca36-3d01-8860-c8576862b37a}, hash: 31F94F282D3EA979E70F0418B2327C96
    @Test()
    void getTCSpecialistWorkListNewWhenRequestOBJIsNull() throws Exception {
        /* Branches:* (requestOBJ != null) : false*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getTCSpecialistWorkListNew((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request, either ProviderServiceMapID or UserID or RequestDate is invalid\",\"status\":\"Invalid request, either ProviderServiceMapID or UserID or RequestDate is invalid\"}")));
    }

    //Sapient generated method id: ${09020688-6f7b-360b-b948-f3c1c92d6049}, hash: 920FCA1023BCE86631BCF7B3C0846881
    @Test()
    void getTCSpecialistWorkListNewWhenSIsNotNull() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (s != null) : true*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(teleConsultationServiceImplMock).getTCRequestListBySpecialistIdAndDate(123, 456, "2022-01-01");
        //Act Statement(s)
        String result = target.getTCSpecialistWorkListNew("{\"psmID\": 123, \"userID\": 456, \"date\": \"2022-01-01\"}");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(teleConsultationServiceImplMock).getTCRequestListBySpecialistIdAndDate(123, 456, "2022-01-01");
        });
    }

    //Sapient generated method id: ${9103b19f-7dc0-3cc9-833d-d91fa720be1e}, hash: 8D69D00CDB0D5FC277C410B7E497FACE
    @Disabled()
    @Test()
    void getTCSpecialistWorkListNewWhenCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getTCSpecialistWorkListNew((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting TC requestList\",\"status\":\"Error while getting TC requestList\"}")));
    }

    //Sapient generated method id: ${6d60bfde-d00c-3c5c-9229-1b4b16fc017d}, hash: 09576F80DE826EABD13E945D51CC2A03
    @Disabled()
    @Test()
    void getTCSpecialistWorkListNewWhenSIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(teleConsultationServiceImplMock).getTCRequestListBySpecialistIdAndDate(1, 1, "reqDate1");
        //Act Statement(s)
        String result = target.getTCSpecialistWorkListNew("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting TC requestList\",\"status\":\"Error while getting TC requestList\"}"));
            verify(teleConsultationServiceImplMock).getTCRequestListBySpecialistIdAndDate(1, 1, "reqDate1");
        });
    }

    //Sapient generated method id: ${19bde01f-7f64-3d82-98a3-22f1f0b9284b}, hash: 9767AD00B82CADDB8F338079E4135D1B
    @Test()
    void startconsultationWhenRequestOBJIsNull() throws Exception {
        /* Branches:* (requestOBJ != null) : false*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.startconsultation((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request, either ProviderServiceMapID or UserID or RequestDate is invalid\",\"status\":\"Invalid request, either ProviderServiceMapID or UserID or RequestDate is invalid\"}")));
    }

    //Sapient generated method id: ${1d7fa986-3cfd-3fc5-b2dc-e5646658f58f}, hash: F3E8F0752B2CDA2466DE002A2F93E8B2
    @Test()
    void startconsultationWhenSIsNotNull() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (s != null) : true*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(123).when(teleConsultationServiceImplMock).startconsultation(1234567890L, 9876543210L);
        //Act Statement(s)
        String result = target.startconsultation("{\"benRegID\": 1234567890, \"visitCode\": 9876543210}");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"123\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(teleConsultationServiceImplMock).startconsultation(1234567890L, 9876543210L);
        });
    }

    //Sapient generated method id: ${674447a6-df88-33fb-81b2-262725986c1a}, hash: D37A58D3DBBA2700AFEFD0C71751C9DE
    @Disabled()
    @Test()
    void startconsultationWhenCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.startconsultation((String) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting TC requestList\",\"status\":\"Error while getting TC requestList\"}")));
    }

    //Sapient generated method id: ${d1238ead-f1b5-3fc9-b569-687114438af4}, hash: EAE07E8B524625022264BA646C37D253
    @Disabled()
    @Test()
    void startconsultationWhenSIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new TeleConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(2).when(teleConsultationServiceImplMock).startconsultation(1L, 1L);
        //Act Statement(s)
        String result = target.startconsultation("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"2\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting TC requestList\",\"status\":\"Error while getting TC requestList\"}"));
            verify(teleConsultationServiceImplMock).startconsultation(1L, 1L);
        });
    }
}
