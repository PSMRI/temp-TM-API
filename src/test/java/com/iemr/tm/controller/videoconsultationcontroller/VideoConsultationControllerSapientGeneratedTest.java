package com.iemr.tm.controller.videoconsultationcontroller;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.service.videoconsultation.VideoConsultationService;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class VideoConsultationControllerSapientGeneratedTest {

    private final VideoConsultationService videoConsultationServiceMock = mock(VideoConsultationService.class, "videoConsultationService");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private VideoConsultationController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${9365951f-9b6d-3411-9c29-dbd9783214e3}, hash: 07B07F1E44ED70CCB14031AB31735982
    @Test()
    void loginTest() throws Exception {
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(videoConsultationServiceMock).login(0L);
        //Act Statement(s)
        String result = target.login(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).login(0L);
        });
    }

    //Sapient generated method id: ${b428cc53-5730-3962-918c-951ebeca7de9}, hash: 09BD3D55979E613AFF1E98F81AF8B155
    @Test()
    void loginWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(videoConsultationServiceMock).login(0L);
        //Act Statement(s)
        String result = target.login(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).login(0L);
        });
    }

    //Sapient generated method id: ${7f46e9ea-9d9d-3f1a-9edc-cdb3cda2e6b0}, hash: EE4C25EE77C9FC6B1CAB8F6A5D919DCA
    @Test()
    void callTest() throws Exception {
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(videoConsultationServiceMock).callUser(0L, 0L);
        //Act Statement(s)
        String result = target.call(0L, 0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).callUser(0L, 0L);
        });
    }

    //Sapient generated method id: ${2fa30a93-0717-3643-aa92-1d3983a50f95}, hash: FF61E1E8E1FA6C0A9CDF034A28B95B8D
    @Test()
    void callWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(videoConsultationServiceMock).callUser(0L, 0L);
        //Act Statement(s)
        String result = target.call(0L, 0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).callUser(0L, 0L);
        });
    }

    //Sapient generated method id: ${af7c0582-e3e5-3cba-898f-05a926da531f}, hash: A4CB7B57935F46DD1EACE1BCE4D0778A
    @Test()
    void callSwymedAndJitsiWhenTypeEqualsIgnoreCaseVideoConsultation() throws Exception {
        /* Branches:* (Type.equalsIgnoreCase("VideoConsultation")) : true*/
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(videoConsultationServiceMock).callUser(0L, 0L);
        //Act Statement(s)
        String result = target.callSwymedAndJitsi(0L, 0L, "VIDEOCONSULTATION");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).callUser(0L, 0L);
        });
    }

    //Sapient generated method id: ${6ae92114-03cb-3ed7-9a1e-5cf27f6908be}, hash: 0B187B19800CDB0F50A53F9EA2695414
    @Test()
    void callSwymedAndJitsiWhenTypeNotEqualsIgnoreCaseVideoConsultation() throws Exception {
        /* Branches:* (Type.equalsIgnoreCase("VideoConsultation")) : false*/
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(videoConsultationServiceMock).callUserjitsi(0L, 0L);
        //Act Statement(s)
        String result = target.callSwymedAndJitsi(0L, 0L, "A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).callUserjitsi(0L, 0L);
        });
    }

    //Sapient generated method id: ${01a3a999-0f1a-34ed-b369-2932af0ce5f3}, hash: 1F63081F6BA7A05021E76CA1919351CF
    @Test()
    void callSwymedAndJitsiWhenCaughtException() throws Exception {
        /* Branches:* (Type.equalsIgnoreCase("VideoConsultation")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(videoConsultationServiceMock).callUser(0L, 0L);
        //Act Statement(s)
        String result = target.callSwymedAndJitsi(0L, 0L, "VIDEOCONSULTATION");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).callUser(0L, 0L);
        });
    }

    //Sapient generated method id: ${70fa04c3-2b1e-3081-ad73-2694505f8072}, hash: BF58B301AF5900291FC6786FE917746E
    @Test()
    void callSwymedAndJitsiWhenTypeNotEqualsIgnoreCaseVideoConsultationAndCaughtException() throws Exception {
        /* Branches:* (Type.equalsIgnoreCase("VideoConsultation")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(videoConsultationServiceMock).callUserjitsi(0L, 0L);
        //Act Statement(s)
        String result = target.callSwymedAndJitsi(0L, 0L, "A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).callUserjitsi(0L, 0L);
        });
    }

    //Sapient generated method id: ${d05828b7-d703-3319-89fa-ffaf80dde3a2}, hash: 862E98C1A7A4E630A9DFBB9491CD9497
    @Test()
    void callvanTest() throws Exception {
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(videoConsultationServiceMock).callVan(0L, 0);
        //Act Statement(s)
        String result = target.callvan(0L, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).callVan(0L, 0);
        });
    }

    //Sapient generated method id: ${6ecc1f59-145b-3f3f-9496-bdc27da070de}, hash: 99BE74B5C1A1D3761D90E573171399DC
    @Test()
    void callvanWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(videoConsultationServiceMock).callVan(0L, 0);
        //Act Statement(s)
        String result = target.callvan(0L, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).callVan(0L, 0);
        });
    }

    //Sapient generated method id: ${b7cef911-598d-3229-96e1-528bae41c183}, hash: 834DBED222BAB9DD8F10ABDABD86D4D4
    @Test()
    void callVanSwymedAndJitsiWhenTypeEqualsIgnoreCaseSwymed() throws Exception {
        /* Branches:* (Type.equalsIgnoreCase("Swymed")) : true*/
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(videoConsultationServiceMock).callVan(0L, 0);
        //Act Statement(s)
        String result = target.callVanSwymedAndJitsi(0L, 0, "SWYMED");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).callVan(0L, 0);
        });
    }

    //Sapient generated method id: ${f2c189d6-2191-3832-8871-8860c948e097}, hash: F3892DEFB6C297A6497E82849B133C7B
    @Test()
    void callVanSwymedAndJitsiWhenTypeNotEqualsIgnoreCaseSwymed() throws Exception {
        /* Branches:* (Type.equalsIgnoreCase("Swymed")) : false*/
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(videoConsultationServiceMock).callVanJitsi(0L, 0);
        //Act Statement(s)
        String result = target.callVanSwymedAndJitsi(0L, 0, "A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).callVanJitsi(0L, 0);
        });
    }

    //Sapient generated method id: ${68e23970-7ae3-3c97-9606-d22b2ffeacd1}, hash: 1816DE30505C45BF20B15BA482FAB112
    @Test()
    void callVanSwymedAndJitsiWhenCaughtException() throws Exception {
        /* Branches:* (Type.equalsIgnoreCase("Swymed")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(videoConsultationServiceMock).callVan(0L, 0);
        //Act Statement(s)
        String result = target.callVanSwymedAndJitsi(0L, 0, "SWYMED");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).callVan(0L, 0);
        });
    }

    //Sapient generated method id: ${a53f0ced-12d7-35e3-a8d5-79690cba2b59}, hash: 638E6980C8A222B4B23ABF66D3720E66
    @Test()
    void callVanSwymedAndJitsiWhenTypeNotEqualsIgnoreCaseSwymedAndCaughtException() throws Exception {
        /* Branches:* (Type.equalsIgnoreCase("Swymed")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(videoConsultationServiceMock).callVanJitsi(0L, 0);
        //Act Statement(s)
        String result = target.callVanSwymedAndJitsi(0L, 0, "A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).callVanJitsi(0L, 0);
        });
    }

    //Sapient generated method id: ${455590df-3249-3d86-b2fe-6376ccf2ca5e}, hash: 1278FA7A01885DC68FABA75250DBA828
    @Test()
    void logoutTest() throws Exception {
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(videoConsultationServiceMock).logout();
        //Act Statement(s)
        String result = target.logout();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).logout();
        });
    }

    //Sapient generated method id: ${8adeffbc-b442-3df8-8b7b-cf72ec9e1568}, hash: EDE87EF61AED7166E0C3B230F05516AA
    @Test()
    void logoutWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new VideoConsultationController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(videoConsultationServiceMock).logout();
        //Act Statement(s)
        String result = target.logout();
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(videoConsultationServiceMock).logout();
        });
    }
}
