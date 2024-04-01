package com.iemr.tm.controller.anc;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.google.gson.JsonObject;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.service.anc.ANCServiceImpl;

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
class AntenatalCareControllerSapientGeneratedTest {

    private final ANCServiceImpl ancServiceImplMock = mock(ANCServiceImpl.class, "ancServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private AntenatalCareController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${9c28a328-293e-3798-aceb-92821c97dfd7}, hash: 4BF3649FD9AF1222AC48B9D6199729A1
    @Disabled()
    @Test()
    void saveBenANCNurseDataWhenJsnOBJIsNotNull() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : true*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(ancServiceImplMock).saveANCNurseData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenANCNurseData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ancServiceImplMock).saveANCNurseData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${8b51fb2f-dd7a-33e6-96ab-f9321a9eb0a2}, hash: 7D68B229FB6DC91ACBB50D9553B64768
    @Disabled()
    @Test()
    void saveBenANCNurseDataWhenJsnOBJIsNull() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenANCNurseData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${387eeeac-3ac2-3f7a-891c-b6700d5233ef}, hash: 4240EF3D8314718FF4F0E23CDABED053
    @Disabled()
    @Test()
    void saveBenANCNurseDataWhenCaughtException() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(ancServiceImplMock).saveANCNurseData((JsonObject) any(), eq("some_value"));
        doNothing().when(ancServiceImplMock).deleteVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.saveBenANCNurseData("some_value", "some_value");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"D\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(ancServiceImplMock).saveANCNurseData((JsonObject) any(), eq("some_value"));
            verify(ancServiceImplMock).deleteVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${c289d28a-9e55-3f56-8e0f-f09248945048}, hash: B49DE35B4F438FC2C1ED94F5ECA09E34
    @Disabled()
    @Test()
    void saveBenANCNurseDataWhenJsnOBJIsNullAndCaughtException() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(ancServiceImplMock).saveANCNurseData((JsonObject) any(), eq("valid_authorization"));
        doNothing().when(ancServiceImplMock).deleteVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.saveBenANCNurseData("valid_request", "valid_authorization");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"B\",\"status\":\"B\"}"));
            verify(ancServiceImplMock).saveANCNurseData((JsonObject) any(), eq("valid_authorization"));
            verify(ancServiceImplMock).deleteVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${42672f67-5159-33f0-a07f-557bca7de62a}, hash: 6B44C0B738B4D63A728ECB37251D7772
    @Disabled()
    @Test()
    void saveBenANCDoctorDataWhenJsnOBJIsNull() throws Exception {
        /* Branches:* (jsnOBJ != null) : false*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenANCDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${e33e47c7-cfe4-3670-8041-7bf42207d9f4}, hash: BE80C02EACF1901C7041D79D7FED53F7
    @Disabled()
    @Test()
    void saveBenANCDoctorDataWhenCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenANCDoctorData("valid_request", "valid_token");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}")));
    }

    //Sapient generated method id: ${37a48fd0-b282-34de-8e0a-093785b94326}, hash: B561424D22423149BA69414AED1D84C0
    @Disabled()
    @Test()
    void saveBenANCDoctorDataWhenRGreaterThan0() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (r != null) : true* (r > 0) : true*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1L).when(ancServiceImplMock).saveANCDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenANCDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data saved successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ancServiceImplMock).saveANCDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${71a24303-4c4c-366a-8802-abd744175eb7}, hash: D19584BAF776F39ACD7FE4DCA1A390B5
    @Disabled()
    @Test()
    void saveBenANCDoctorDataWhenRNotGreaterThan0() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (r != null) : true* (r > 0) : false*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1L).when(ancServiceImplMock).saveANCDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenANCDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to save data\",\"status\":\"Unable to save data\"}"));
            verify(ancServiceImplMock).saveANCDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${88c20f54-c58a-3e9c-bd86-7ce6e1a9d71d}, hash: D23BA8CD3C864547E717BF6654448557
    @Disabled()
    @Test()
    void saveBenANCDoctorDataWhenRGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (r != null) : true* (r > 0) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(ancServiceImplMock).saveANCDoctorData((JsonObject) any(), eq("Bearer token"));
        //Act Statement(s)
        String result = target.saveBenANCDoctorData("{\"key1\":\"value1\",\"key2\":\"value2\"}", "Bearer token");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data saved successfully\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(ancServiceImplMock).saveANCDoctorData((JsonObject) any(), eq("Bearer token"));
        });
    }

    //Sapient generated method id: ${e3b30047-709f-31f0-a886-059490a9fd50}, hash: 56E11EC3CB49CD816AA8F626A808E4B6
    @Disabled()
    @Test()
    void saveBenANCDoctorDataWhenRNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (r != null) : true* (r > 0) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(ancServiceImplMock).saveANCDoctorData((JsonObject) any(), eq("Bearer token"));
        //Act Statement(s)
        String result = target.saveBenANCDoctorData("{\"key1\": \"value1\", \"key2\": \"value2\"}", "Bearer token");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(ancServiceImplMock).saveANCDoctorData((JsonObject) any(), eq("Bearer token"));
        });
    }

    //Sapient generated method id: ${b51916a9-aa2a-39b9-8b0e-1a5d8479e0f6}, hash: 0A66A0A769574BC570429413B69A71A3
    @Disabled()
    @Test()
    void getBenVisitDetailsFrmNurseANCWhenObjLengthGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ancServiceImplMock).getBenVisitDetailsFrmNurseANC(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseANC("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ancServiceImplMock).getBenVisitDetailsFrmNurseANC(1L, 1L);
        });
    }

    //Sapient generated method id: ${c9f1e1c9-81a0-3fd1-a78b-e39559660a99}, hash: 738468B73DC681A0AEC148049E31432F
    @Disabled()
    @Test()
    void getBenVisitDetailsFrmNurseANCWhenObjLengthNotGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseANC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${410cb986-b6a5-3e30-9878-d8e6744d858b}, hash: 1C15094FC2AFD94BEECE07438D1D6B58
    @Disabled()
    @Test()
    void getBenVisitDetailsFrmNurseANCWhenCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ancServiceImplMock).getBenVisitDetailsFrmNurseANC(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseANC("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary visit data\",\"status\":\"Error while getting beneficiary visit data\"}"));
            verify(ancServiceImplMock).getBenVisitDetailsFrmNurseANC(1L, 1L);
        });
    }

    //Sapient generated method id: ${ec8d45df-5931-3eb2-8309-287069053900}, hash: A39821796549EF2270938F184660C828
    @Test()
    void getBenVisitDetailsFrmNurseANCWhenObjLengthNotGreaterThan1AndCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNurseANC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary visit data\",\"status\":\"Error while getting beneficiary visit data\"}")));
    }

    //Sapient generated method id: ${7bd3b79f-a6e3-3729-8055-bd0ca6f5717d}, hash: 834BC5C34CD12F8D8BD4B5FB39A57F40
    @Disabled()
    @Test()
    void getBenANCDetailsFrmNurseANCWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ancServiceImplMock).getBenANCDetailsFrmNurseANC(1L, 1L);
        //Act Statement(s)
        String result = target.getBenANCDetailsFrmNurseANC("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ancServiceImplMock).getBenANCDetailsFrmNurseANC(1L, 1L);
        });
    }

    //Sapient generated method id: ${169599d6-3cd1-301d-b9f4-e34858563a57}, hash: DE7E1A173268B39C13D01216C7B1893C
    @Disabled()
    @Test()
    void getBenANCDetailsFrmNurseANCWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenANCDetailsFrmNurseANC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${42aa7a38-c2e9-3932-a30c-fc4e14e71476}, hash: 01CBB32AEFD61254FE7A770966D07D6D
    @Disabled()
    @Test()
    void getBenANCDetailsFrmNurseANCWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ancServiceImplMock).getBenANCDetailsFrmNurseANC(1L, 1L);
        //Act Statement(s)
        String result = target.getBenANCDetailsFrmNurseANC("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary ANC care data\",\"status\":\"Error while getting beneficiary ANC care data\"}"));
            verify(ancServiceImplMock).getBenANCDetailsFrmNurseANC(1L, 1L);
        });
    }

    //Sapient generated method id: ${878ce233-2aa6-33aa-8cb2-e12534646764}, hash: 5C0D4DFC4B666676E27958FAC7C4C379
    @Test()
    void getBenANCDetailsFrmNurseANCWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenANCDetailsFrmNurseANC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary ANC care data\",\"status\":\"Error while getting beneficiary ANC care data\"}")));
    }

    //Sapient generated method id: ${d4e71be6-3463-3f29-be26-9c30d15d4902}, hash: DFD25019D7E340E5C06F60A0CE891271
    @Disabled()
    @Test()
    void getBenANCHistoryDetailsWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ancServiceImplMock).getBenANCHistoryDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenANCHistoryDetails("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ancServiceImplMock).getBenANCHistoryDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${5b7e3da4-ae25-3b32-85a5-6bd3aab223ce}, hash: 2DABAB34DBDF3DC569A59709EE56F720
    @Disabled()
    @Test()
    void getBenANCHistoryDetailsWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenANCHistoryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${272a2d91-4d76-3c25-ad95-2a85f997a513}, hash: 35E548A24D2773F48C43086DD3448582
    @Disabled()
    @Test()
    void getBenANCHistoryDetailsWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ancServiceImplMock).getBenANCHistoryDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenANCHistoryDetails("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary history data\",\"status\":\"Error while getting beneficiary history data\"}"));
            verify(ancServiceImplMock).getBenANCHistoryDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${74092550-7992-3ed5-be93-0ad6c4b655f2}, hash: 93240BAFA262366BFA5337ADA8150633
    @Test()
    void getBenANCHistoryDetailsWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenANCHistoryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary history data\",\"status\":\"Error while getting beneficiary history data\"}")));
    }

    //Sapient generated method id: ${440dc855-fac0-349b-92bd-1cbf2f653c0c}, hash: B7FCB7756B71E557007D1AC823FDCC99
    @Disabled()
    @Test()
    void getBenANCVitalDetailsFrmNurseANCWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ancServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenANCVitalDetailsFrmNurseANC("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ancServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${2098394b-b846-3eae-8a8e-32eaa593c8a8}, hash: 160398AEB1C143F4121242BF429C0D95
    @Disabled()
    @Test()
    void getBenANCVitalDetailsFrmNurseANCWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenANCVitalDetailsFrmNurseANC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${15fcda1d-aa23-3878-9564-4f0b02b291b1}, hash: CD5D1049711278F2F41A0B6BAFFFFBA3
    @Disabled()
    @Test()
    void getBenANCVitalDetailsFrmNurseANCWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ancServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenANCVitalDetailsFrmNurseANC("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary vital data\",\"status\":\"Error while getting beneficiary vital data\"}"));
            verify(ancServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${9e59ad1b-563b-3427-92f3-19fb22d9452a}, hash: 696945ABB265BD8EF5B12227086E6280
    @Test()
    void getBenANCVitalDetailsFrmNurseANCWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenANCVitalDetailsFrmNurseANC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary vital data\",\"status\":\"Error while getting beneficiary vital data\"}")));
    }

    //Sapient generated method id: ${8b02f9f9-ee1c-3a8e-ae0e-f10549d68b69}, hash: 895402D1B9E5962A5013FAEAB6B49AB7
    @Disabled()
    @Test()
    void getBenExaminationDetailsANCWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ancServiceImplMock).getANCExaminationDetailsData(1L, 1L);
        //Act Statement(s)
        String result = target.getBenExaminationDetailsANC("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ancServiceImplMock).getANCExaminationDetailsData(1L, 1L);
        });
    }

    //Sapient generated method id: ${ec527912-f4f6-3381-8439-fcf1df0ab442}, hash: EC135947B48969EB68EF44D6DBFED375
    @Disabled()
    @Test()
    void getBenExaminationDetailsANCWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenExaminationDetailsANC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${0a86c68e-79e7-3dd4-8908-06c416fef734}, hash: FFC3A3DA8D4B9885F23D02C584CEC256
    @Disabled()
    @Test()
    void getBenExaminationDetailsANCWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ancServiceImplMock).getANCExaminationDetailsData(1L, 1L);
        //Act Statement(s)
        String result = target.getBenExaminationDetailsANC("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary examination data\",\"status\":\"Error while getting beneficiary examination data\"}"));
            verify(ancServiceImplMock).getANCExaminationDetailsData(1L, 1L);
        });
    }

    //Sapient generated method id: ${6df50f60-05b4-3d81-a4eb-7d4c2ad57e62}, hash: 4BBC4FFA9B44A28D88C8BD5B679BF1DD
    @Test()
    void getBenExaminationDetailsANCWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenExaminationDetailsANC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary examination data\",\"status\":\"Error while getting beneficiary examination data\"}")));
    }

    //Sapient generated method id: ${424b4f77-c874-3434-a957-523a8c72ba73}, hash: 47CBA6CFFE6EB3B3B4D0AADB47B706D8
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorANCWhenObjHasVisitCode() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ancServiceImplMock).getBenCaseRecordFromDoctorANC(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorANC("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ancServiceImplMock).getBenCaseRecordFromDoctorANC(1L, 1L);
        });
    }

    //Sapient generated method id: ${f6397758-a755-37bc-ad8f-7ff882a1a84e}, hash: 754A9BCCCFC3D3806BFDA3F3F422236A
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorANCWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorANC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${a8ea1546-d8a7-37d9-98b5-e403bceff5bb}, hash: 45FA58958CB0543060116B8D50B0B1D2
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorANCWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ancServiceImplMock).getBenCaseRecordFromDoctorANC(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorANC("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary doctor data\",\"status\":\"Error while getting beneficiary doctor data\"}"));
            verify(ancServiceImplMock).getBenCaseRecordFromDoctorANC(1L, 1L);
        });
    }

    //Sapient generated method id: ${1955a448-d9fa-32ce-a47e-0792586b9ad8}, hash: 7199FF415DB058114632B8174C8004ED
    @Test()
    void getBenCaseRecordFromDoctorANCWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorANC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary doctor data\",\"status\":\"Error while getting beneficiary doctor data\"}")));
    }

    //Sapient generated method id: ${3fc572d2-0dcc-397e-9860-8481c1f40bfe}, hash: 82285C55C3048FABA56B9120C7EC6EF9
    @Disabled()
    @Test()
    void getHRPStatusWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getHRPStatus("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${439faa95-083f-36b4-b629-d361cfae8aa2}, hash: D01D7DFF8AAAD055C3B7398409861186
    @Disabled()
    @Test()
    void getHRPStatusWhenResIsNotNull() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (res != null) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ancServiceImplMock).getHRPStatus(1L, 1L);
        //Act Statement(s)
        String result = target.getHRPStatus("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ancServiceImplMock).getHRPStatus(1L, 1L);
        });
    }

    //Sapient generated method id: ${c753768d-2aa0-3330-a982-5dbaf565309c}, hash: 7796116B90A01E8E8C21C4F12655F426
    @Disabled()
    @Test()
    void getHRPStatusWhenResIsNull() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (res != null) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(ancServiceImplMock).getHRPStatus(2L, 2L);
        //Act Statement(s)
        String result = target.getHRPStatus("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error in getting HRP status\",\"status\":\"error in getting HRP status\"}"));
            verify(ancServiceImplMock).getHRPStatus(2L, 2L);
        });
    }

    //Sapient generated method id: ${e0f62fc0-2954-3559-b1ea-193a11301f7f}, hash: 3C9935CD8CB5A1376367758933DD1199
    @Test()
    void getHRPStatusWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getHRPStatus("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error in getting HRP status\",\"status\":\"error in getting HRP status\"}")));
    }

    //Sapient generated method id: ${62c7e868-94b4-3d9e-85c6-9cc9ad28880a}, hash: A83634B36925F8ABB7009DDA0D2C5111
    @Disabled()
    @Test()
    void getHRPStatusWhenResIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (res != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(ancServiceImplMock).getHRPStatus(1L, 1L);
        //Act Statement(s)
        String result = target.getHRPStatus("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"error in getting HRP status\",\"status\":\"error in getting HRP status\"}"));
            verify(ancServiceImplMock).getHRPStatus(1L, 1L);
        });
    }

    //Sapient generated method id: ${77185a3c-d9c9-3dc0-a6ae-c32753091272}, hash: 387C0966542BDECE2AF41828A96C0398
    @Disabled()
    @Test()
    void getHRPStatusWhenResIsNullAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (res != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(ancServiceImplMock).getHRPStatus(2L, 2L);
        //Act Statement(s)
        String result = target.getHRPStatus("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error in getting HRP status\",\"status\":\"error in getting HRP status\"}"));
            verify(ancServiceImplMock).getHRPStatus(2L, 2L);
        });
    }

    //Sapient generated method id: ${a3de3526-dd68-3700-abf8-392dbc3b47d0}, hash: 5A792EFFC4239760A4D1A1DD48EA5F97
    @Disabled()
    @Test()
    void updateANCCareNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(ancServiceImplMock).updateBenANCDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCCareNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ancServiceImplMock).updateBenANCDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${e1a3f89c-24e6-3f92-ac69-436377dfa51b}, hash: F517E93733BB9569819C42CD94EEA0D6
    @Disabled()
    @Test()
    void updateANCCareNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(ancServiceImplMock).updateBenANCDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCCareNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ancServiceImplMock).updateBenANCDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${6fdd4525-37d6-3707-808c-d9a0e85b47e7}, hash: D2465BCDFE2FFCEEE9254A790EE9FF5B
    @Disabled()
    @Test()
    void updateANCCareNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(ancServiceImplMock).updateBenANCDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCCareNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ancServiceImplMock).updateBenANCDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${989d0b16-28e1-3d6a-bf0f-f09210a26e76}, hash: D272D9EEC9B28AC304D0476F616F9538
    @Disabled()
    @Test()
    void updateANCCareNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(ancServiceImplMock).updateBenANCDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCCareNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ancServiceImplMock).updateBenANCDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${d96262b2-3cc8-3915-afa9-0ef95a29f876}, hash: 830237D249811A700D47F13029F1C701
    @Disabled()
    @Test()
    void updateANCHistoryNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(ancServiceImplMock).updateBenANCHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ancServiceImplMock).updateBenANCHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${eb1f6bfe-a278-332f-95e6-0b621eb67db8}, hash: C49BA3606DE6A68E58E8A52C467D4219
    @Disabled()
    @Test()
    void updateANCHistoryNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(ancServiceImplMock).updateBenANCHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ancServiceImplMock).updateBenANCHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${f58a061a-9590-32da-bcd1-1409d033b13c}, hash: 743217E3AADE7D26CFE188F1CAD610C8
    @Disabled()
    @Test()
    void updateANCHistoryNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(ancServiceImplMock).updateBenANCHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ancServiceImplMock).updateBenANCHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${32f3ea7d-67bb-3ca4-9c9b-95ceff041537}, hash: E2E7BE6F7C2F9C65842C3E318BE2A7C5
    @Disabled()
    @Test()
    void updateANCHistoryNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(ancServiceImplMock).updateBenANCHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ancServiceImplMock).updateBenANCHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${a5ab945b-30fd-319f-b8fd-3578ee854ac4}, hash: 57AF7F22BF3BCD429F3F7DD4AF5D98C6
    @Disabled()
    @Test()
    void updateANCVitalNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(ancServiceImplMock).updateBenANCVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ancServiceImplMock).updateBenANCVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${0fe71a24-e3f4-3276-a9f4-42edaaca3395}, hash: 1DD779A1B08AEBC3358B46610AF96C46
    @Disabled()
    @Test()
    void updateANCVitalNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(ancServiceImplMock).updateBenANCVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ancServiceImplMock).updateBenANCVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${d51d732f-6ba5-338f-a5b3-6f8017e55db2}, hash: 8A3ECB5BC063730CB7C207A7D2EFA707
    @Disabled()
    @Test()
    void updateANCVitalNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(ancServiceImplMock).updateBenANCVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ancServiceImplMock).updateBenANCVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${4e117e5d-7edb-3e29-997e-d7e20fae7a66}, hash: A3B8C958DDDEABA5002CEA5E64165168
    @Disabled()
    @Test()
    void updateANCVitalNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(ancServiceImplMock).updateBenANCVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ancServiceImplMock).updateBenANCVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${579ed7f1-e18f-34ff-b56b-b180eab0da24}, hash: 30B259A8193E8F03DED2B1010DAB7770
    @Disabled()
    @Test()
    void updateANCExaminationNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(ancServiceImplMock).updateBenANCExaminationDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCExaminationNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ancServiceImplMock).updateBenANCExaminationDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${c470f40b-c300-30e6-ac8b-e0709d234c8c}, hash: F56E2F37B17FB9597D6482B50A8A5FAE
    @Disabled()
    @Test()
    void updateANCExaminationNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(ancServiceImplMock).updateBenANCExaminationDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCExaminationNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ancServiceImplMock).updateBenANCExaminationDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${42ce423c-8915-3788-bfd0-c1fba46ac071}, hash: 157C69FE6F1003318EDE7EEF034ED127
    @Disabled()
    @Test()
    void updateANCExaminationNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(ancServiceImplMock).updateBenANCExaminationDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCExaminationNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ancServiceImplMock).updateBenANCExaminationDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${4f9e170c-038b-3175-b45c-7ab52143e674}, hash: CDED89728F02FB9C6BFCD25655DDBBF2
    @Disabled()
    @Test()
    void updateANCExaminationNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(ancServiceImplMock).updateBenANCExaminationDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateANCExaminationNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ancServiceImplMock).updateBenANCExaminationDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${7aaeba4d-0e43-36c6-bfff-f598f85a0530}, hash: E4054071D8FF17C218D9AFED53667CE6
    @Disabled()
    @Test()
    void updateANCDoctorDataWhenResultGreaterThan0() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : true*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1L).when(ancServiceImplMock).updateANCDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.updateANCDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(ancServiceImplMock).updateANCDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${222e0723-df0a-35af-a07a-0d09182db392}, hash: C39EA3081047BF4D33EDCA31493ACA1A
    @Disabled()
    @Test()
    void updateANCDoctorDataWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : false*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1L).when(ancServiceImplMock).updateANCDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.updateANCDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(ancServiceImplMock).updateANCDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${800c3a0d-d258-3675-8418-8bdaeb4eb6a8}, hash: 07C043DBAF5AA74B3DCA732EB9D65642
    @Disabled()
    @Test()
    void updateANCDoctorDataWhenCaughtException() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(ancServiceImplMock).updateANCDoctorData((JsonObject) any(), eq("Bearer token"));
        //Act Statement(s)
        String result = target.updateANCDoctorData("{\"key1\": \"value1\", \"key2\": \"value2\"}", "Bearer token");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(ancServiceImplMock).updateANCDoctorData((JsonObject) any(), eq("Bearer token"));
        });
    }

    //Sapient generated method id: ${b316e2ef-be1a-3f09-9675-a719ef4b93fe}, hash: 235B9C68EC90130C078D7AD79778E551
    @Disabled()
    @Test()
    void updateANCDoctorDataWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new AntenatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(ancServiceImplMock).updateANCDoctorData((JsonObject) any(), eq("Bearer token"));
        //Act Statement(s)
        String result = target.updateANCDoctorData("{\"key1\": \"value1\", \"key2\": \"value2\"}", "Bearer token");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(ancServiceImplMock).updateANCDoctorData((JsonObject) any(), eq("Bearer token"));
        });
    }
}
