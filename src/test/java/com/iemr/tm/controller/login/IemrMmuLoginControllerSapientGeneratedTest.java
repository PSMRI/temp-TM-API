package com.iemr.tm.controller.login;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.service.login.IemrMmuLoginServiceImpl;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class IemrMmuLoginControllerSapientGeneratedTest {

    private final IemrMmuLoginServiceImpl iemrMmuLoginServiceImplMock = mock(IemrMmuLoginServiceImpl.class, "iemrMmuLoginServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private IemrMmuLoginController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${4eeca5ef-3a02-3870-a29c-1fb5a0ded633}, hash: 50CD42250F0A641CF7ACCA0EA44BFD83
    @Disabled()
    @Test()
    void getUserServicePointVanDetailsTest() throws Exception {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new IemrMmuLoginController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(iemrMmuLoginServiceImplMock).getUserServicePointVanDetails(0);
        //Act Statement(s)
        String result = target.getUserServicePointVanDetails("");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(iemrMmuLoginServiceImplMock).getUserServicePointVanDetails(0);
        });
    }

    //Sapient generated method id: ${e62efa9d-8b7f-358e-8b78-1f2007649cf4}, hash: FA27B9C022871DCF1326E2153ADEDAB4
    @Disabled()
    @Test()
    void getUserServicePointVanDetailsWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new IemrMmuLoginController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(iemrMmuLoginServiceImplMock).getUserServicePointVanDetails(0);
        //Act Statement(s)
        String result = target.getUserServicePointVanDetails("F");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting service points and van data\",\"status\":\"Error while getting service points and van data\"}"));
            verify(iemrMmuLoginServiceImplMock).getUserServicePointVanDetails(0);
        });
    }

    //Sapient generated method id: ${a91d80d9-4fc7-3d02-8b89-9db7cfc177f1}, hash: A5C61AB204F406E5C3E3A6C0D16429D9
    @Disabled()
    @Test()
    void getServicepointVillagesTest() throws Exception {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new IemrMmuLoginController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(iemrMmuLoginServiceImplMock).getServicepointVillages(0);
        //Act Statement(s)
        String result = target.getServicepointVillages("");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(iemrMmuLoginServiceImplMock).getServicepointVillages(0);
        });
    }

    //Sapient generated method id: ${39cdf158-1320-3af7-b7b0-d8230854e032}, hash: 1D43B56B964EB7FF346370F1621D90D3
    @Disabled()
    @Test()
    void getServicepointVillagesWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new IemrMmuLoginController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(iemrMmuLoginServiceImplMock).getServicepointVillages(0);
        //Act Statement(s)
        String result = target.getServicepointVillages("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting service points and villages\",\"status\":\"Error while getting service points and villages\"}"));
            verify(iemrMmuLoginServiceImplMock).getServicepointVillages(0);
        });
    }

    //Sapient generated method id: ${b8784433-fff9-3c7b-aaa9-ed8ea88dce1d}, hash: 5C7FA73F792DF5FA9A14579BFC169E99
    @Disabled()
    @Test()
    void getUserVanSpDetailsWhenObjHasProviderServiceMapID() throws Exception {
        /* Branches:* (obj.has("userID")) : true* (obj.has("providerServiceMapID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new IemrMmuLoginController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(iemrMmuLoginServiceImplMock).getUserVanSpDetails(1, 1);
        //Act Statement(s)
        String result = target.getUserVanSpDetails("");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(iemrMmuLoginServiceImplMock).getUserVanSpDetails(1, 1);
        });
    }

    //Sapient generated method id: ${1c4c18b0-82ba-3eac-ac25-072b0a7414ff}, hash: 487230A05A00DD2487EE02E73BC66C73
    @Disabled()
    @Test()
    void getUserVanSpDetailsWhenObjNotHasProviderServiceMapID() throws Exception {
        /* Branches:* (obj.has("userID")) : true* (obj.has("providerServiceMapID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new IemrMmuLoginController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getUserVanSpDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${7e76e046-cb83-3c39-942a-970581474532}, hash: 73BF8A35E382853DE6B336AAD1B08B92
    @Disabled()
    @Test()
    void getUserVanSpDetailsWhenObjHasProviderServiceMapIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("userID")) : true* (obj.has("providerServiceMapID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new IemrMmuLoginController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(iemrMmuLoginServiceImplMock).getUserVanSpDetails(1, 1);
        //Act Statement(s)
        String result = target.getUserVanSpDetails("F");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting van and service points data\",\"status\":\"Error while getting van and service points data\"}"));
            verify(iemrMmuLoginServiceImplMock).getUserVanSpDetails(1, 1);
        });
    }

    //Sapient generated method id: ${9b931d41-789f-3421-838e-d3ced6eccca4}, hash: AB61FD854326641A113998DC7BA62E57
    @Test()
    void getUserVanSpDetailsWhenObjNotHasProviderServiceMapIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("userID")) : true* (obj.has("providerServiceMapID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new IemrMmuLoginController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getUserVanSpDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting van and service points data\",\"status\":\"Error while getting van and service points data\"}")));
    }

    //Sapient generated method id: ${7a80d81d-6b0b-379f-a955-418c10fc5610}, hash: 2E1C5CF07D3793FB30E2A2D3B97B65F2
    @Test()
    void getUserSpokeDetailsWhenPsmIdIsNotNull() throws Exception {
        /* Branches:* (psmId != null) : true*/
        //Arrange Statement(s)
        target = new IemrMmuLoginController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(iemrMmuLoginServiceImplMock).getUserSpokeDetails(0);
        //Act Statement(s)
        String result = target.getUserSpokeDetails(0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(iemrMmuLoginServiceImplMock).getUserSpokeDetails(0);
        });
    }

    //Sapient generated method id: ${367d55ee-6c75-36e1-9ac1-fd53780c8cf8}, hash: 5A6D93FFD7A80C2577E6553D63233EEC
    @Test()
    void getUserSpokeDetailsWhenPsmIdIsNull() throws Exception {
        /* Branches:* (psmId != null) : false*/
        //Arrange Statement(s)
        target = new IemrMmuLoginController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getUserSpokeDetails((Integer) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${11e3133c-dbc1-39ca-94a5-169eafe01ed2}, hash: 29794ED282D9815FD0FF01EE1540F177
    @Disabled()
    @Test()
    void getUserSpokeDetailsWhenCaughtException() throws Exception {
        /* Branches:* (psmId != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new IemrMmuLoginController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(iemrMmuLoginServiceImplMock).getUserSpokeDetails(0);
        //Act Statement(s)
        String result = target.getUserSpokeDetails(0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error occurred while fetching van master is  : getUserSpokeDetails_exception1\",\"status\":\"Error occurred while fetching van master is  : getUserSpokeDetails_exception1\"}"));
            verify(iemrMmuLoginServiceImplMock).getUserSpokeDetails(0);
        });
    }

    //Sapient generated method id: ${b4b9f4dc-5b2d-3092-bc0e-0520990689dc}, hash: 8D7F9DD3B7845A73982FBCB05FA37A1F
    @Disabled()
    @Test()
    void getUserSpokeDetailsWhenPsmIdIsNullAndCaughtException() throws Exception {
        /* Branches:* (psmId != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new IemrMmuLoginController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getUserSpokeDetails((Integer) null);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error occurred while fetching van master is  : getUserSpokeDetails_exception1\",\"status\":\"Error occurred while fetching van master is  : getUserSpokeDetails_exception1\"}")));
    }
}
