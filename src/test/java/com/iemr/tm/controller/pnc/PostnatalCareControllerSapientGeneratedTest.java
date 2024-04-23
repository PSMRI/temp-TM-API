package com.iemr.tm.controller.pnc;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.google.gson.JsonObject;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.service.pnc.PNCServiceImpl;

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
class PostnatalCareControllerSapientGeneratedTest {

    private final PNCServiceImpl pncServiceImplMock = mock(PNCServiceImpl.class, "pncServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private PostnatalCareController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${03dc67eb-5c73-33e7-a9c5-69428e3c5522}, hash: 866D4F9690514D358088FA08EA1EA5AC
    @Disabled()
    @Test()
    void saveBenPNCNurseDataWhenJsnOBJIsNotNull() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : true*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(pncServiceImplMock).savePNCNurseData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenPNCNurseData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(pncServiceImplMock).savePNCNurseData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${085db768-873e-3399-b298-d5f3845cc4e3}, hash: 6812C4E77C9DC19F104C0992D1F94BFB
    @Disabled()
    @Test()
    void saveBenPNCNurseDataWhenJsnOBJIsNull() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenPNCNurseData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${77a1b9d1-426e-33a5-95bf-b5b62f29910b}, hash: F343CBF1C0BF154C1AB86081DA48F722
    @Disabled()
    @Test()
    void saveBenPNCNurseDataWhenCaughtException() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(pncServiceImplMock).savePNCNurseData((JsonObject) any(), eq("<valid_authorization>"));
        doNothing().when(pncServiceImplMock).deleteVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.saveBenPNCNurseData("<valid_request_object>", "<valid_authorization>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"D\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(pncServiceImplMock).savePNCNurseData((JsonObject) any(), eq("<valid_authorization>"));
            verify(pncServiceImplMock).deleteVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${fe48c7dc-91b5-3d8b-927f-8f9eb0253e79}, hash: CA3E67E98856C454855E37FBA4C5746B
    @Disabled()
    @Test()
    void saveBenPNCNurseDataWhenJsnOBJIsNullAndCaughtException() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(pncServiceImplMock).savePNCNurseData((JsonObject) any(), eq("<value>"));
        doNothing().when(pncServiceImplMock).deleteVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.saveBenPNCNurseData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"B\",\"status\":\"B\"}"));
            verify(pncServiceImplMock).savePNCNurseData((JsonObject) any(), eq("<value>"));
            verify(pncServiceImplMock).deleteVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${56aa1cb7-c8b7-3d20-b852-11397a0f7746}, hash: 50671F11D48D5A9D573C945610259AF5
    @Disabled()
    @Test()
    void saveBenPNCDoctorDataWhenJsnOBJIsNull() throws Exception {
        /* Branches:* (jsnOBJ != null) : false*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenPNCDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${ed581f4b-63fd-3976-b130-aa70d3018f4b}, hash: F1BF442EF5C9ACBECD34309F444F7CA9
    @Disabled()
    @Test()
    void saveBenPNCDoctorDataWhenCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenPNCDoctorData("<valid_request_object>", "<valid_authorization>");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}")));
    }

    //Sapient generated method id: ${8f087465-e189-34d5-8fa2-c048628d23df}, hash: 5AF661D62B6DD18F809EA32CADD039A0
    @Disabled()
    @Test()
    void saveBenPNCDoctorDataWhenRGreaterThan0() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (r != null) : true* (r > 0) : true*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1L).when(pncServiceImplMock).savePNCDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenPNCDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data saved successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(pncServiceImplMock).savePNCDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${1092298c-bd00-34fa-9e40-e76253eb9a64}, hash: 490ED12032E69581A022C81CAD9095E8
    @Disabled()
    @Test()
    void saveBenPNCDoctorDataWhenRNotGreaterThan0() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (r != null) : true* (r > 0) : false*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1L).when(pncServiceImplMock).savePNCDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenPNCDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to save data\",\"status\":\"Unable to save data\"}"));
            verify(pncServiceImplMock).savePNCDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${2bb595ae-77ec-388e-a504-c3550d4f2514}, hash: C94F2C1D61AC2C7E74076A07AB28F02E
    @Disabled()
    @Test()
    void saveBenPNCDoctorDataWhenRGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (r != null) : true* (r > 0) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(pncServiceImplMock).savePNCDoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.saveBenPNCDoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data saved successfully\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(pncServiceImplMock).savePNCDoctorData((JsonObject) any(), eq("<value>"));
        });
    }

    //Sapient generated method id: ${7f4598d6-166a-37e4-ab35-e38c729f5154}, hash: 328A44D0476DF2951D76BBBC41A19ABE
    @Disabled()
    @Test()
    void saveBenPNCDoctorDataWhenRNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (jsnOBJ != null) : true* (r != null) : true* (r > 0) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(pncServiceImplMock).savePNCDoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.saveBenPNCDoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(pncServiceImplMock).savePNCDoctorData((JsonObject) any(), eq("<value>"));
        });
    }

    //Sapient generated method id: ${9fe784d7-b457-32e3-8793-a4199d774be8}, hash: 04D5B1D62FD0D06C370AD61714118AD7
    @Disabled()
    @Test()
    void getBenVisitDetailsFrmNursePNCWhenObjLengthGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(pncServiceImplMock).getBenVisitDetailsFrmNursePNC(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNursePNC("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(pncServiceImplMock).getBenVisitDetailsFrmNursePNC(1L, 1L);
        });
    }

    //Sapient generated method id: ${92bb80fd-3b7a-39b4-8f08-53c79be699c9}, hash: 376DBDFD2DB4DEE57F500893D1E9A96F
    @Disabled()
    @Test()
    void getBenVisitDetailsFrmNursePNCWhenObjLengthNotGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNursePNC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${9ee2b8ec-a445-38bd-a688-e4d03a0db6af}, hash: F338011EC6ED74B40BA215C33782F6BC
    @Disabled()
    @Test()
    void getBenVisitDetailsFrmNursePNCWhenCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(pncServiceImplMock).getBenVisitDetailsFrmNursePNC(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNursePNC("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary visit data\",\"status\":\"Error while getting beneficiary visit data\"}"));
            verify(pncServiceImplMock).getBenVisitDetailsFrmNursePNC(1L, 1L);
        });
    }

    //Sapient generated method id: ${1b4f2e94-79c3-33d8-a290-1e0553903707}, hash: 9DBC062850924232433ED1939339E337
    @Test()
    void getBenVisitDetailsFrmNursePNCWhenObjLengthNotGreaterThan1AndCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVisitDetailsFrmNursePNC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary visit data\",\"status\":\"Error while getting beneficiary visit data\"}")));
    }

    //Sapient generated method id: ${15fbdc65-96b0-3cb4-a808-3b984292f541}, hash: 022115331E0174EA52B0990BAB4C5648
    @Disabled()
    @Test()
    void getBenPNCDetailsFrmNursePNCWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(pncServiceImplMock).getBenPNCDetailsFrmNursePNC(1L, 1L);
        //Act Statement(s)
        String result = target.getBenPNCDetailsFrmNursePNC("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(pncServiceImplMock).getBenPNCDetailsFrmNursePNC(1L, 1L);
        });
    }

    //Sapient generated method id: ${d280f922-80d1-326d-9d4a-5b62ce4fdccb}, hash: F5A7AB284F0D71F8C2C83F595F7D8CF4
    @Disabled()
    @Test()
    void getBenPNCDetailsFrmNursePNCWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenPNCDetailsFrmNursePNC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${4bf0e105-fce7-3f7c-b788-c367cad57728}, hash: 66F7EB8F83BD08D20A05C85001E676A1
    @Disabled()
    @Test()
    void getBenPNCDetailsFrmNursePNCWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(pncServiceImplMock).getBenPNCDetailsFrmNursePNC(1L, 1L);
        //Act Statement(s)
        String result = target.getBenPNCDetailsFrmNursePNC("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary PNC Care data\",\"status\":\"Error while getting beneficiary PNC Care data\"}"));
            verify(pncServiceImplMock).getBenPNCDetailsFrmNursePNC(1L, 1L);
        });
    }

    //Sapient generated method id: ${09d5b2f7-63dc-3d25-b44c-c4864787032a}, hash: 4CBB33D8C19E4B88DA8CB2BE6472C200
    @Test()
    void getBenPNCDetailsFrmNursePNCWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenPNCDetailsFrmNursePNC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary PNC Care data\",\"status\":\"Error while getting beneficiary PNC Care data\"}")));
    }

    //Sapient generated method id: ${2352a000-0ee7-3db2-975e-560d38c37d38}, hash: D2007B497874AA7FB80EFD3ACA7D058B
    @Disabled()
    @Test()
    void getBenHistoryDetailsWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(pncServiceImplMock).getBenHistoryDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenHistoryDetails("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(pncServiceImplMock).getBenHistoryDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${15f67d1d-aff9-3f55-87f7-cccad2091f59}, hash: A20A765340B71B634E46780A72AA493C
    @Disabled()
    @Test()
    void getBenHistoryDetailsWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenHistoryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${a0c26d5a-f2ae-3d2d-8a55-abdec4fea3b8}, hash: E12DCD2BC385744A63FB789F1CFA4AF3
    @Disabled()
    @Test()
    void getBenHistoryDetailsWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(pncServiceImplMock).getBenHistoryDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenHistoryDetails("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary history data\",\"status\":\"Error while getting beneficiary history data\"}"));
            verify(pncServiceImplMock).getBenHistoryDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${4405402d-d6c2-3385-87bc-6b48c235b719}, hash: 1187E181DFED2E5A7A84166A4BE4FABC
    @Test()
    void getBenHistoryDetailsWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenHistoryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary history data\",\"status\":\"Error while getting beneficiary history data\"}")));
    }

    //Sapient generated method id: ${43e7fff8-5475-3700-9146-0b37da1e368b}, hash: CA02D220D176975048B4B55FD06B451E
    @Disabled()
    @Test()
    void getBenVitalDetailsFrmNurseWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(pncServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurse("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(pncServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${698cdd40-4a71-3843-a184-25491843d701}, hash: C14420F8125F0B6EC889C9673C70A4BC
    @Disabled()
    @Test()
    void getBenVitalDetailsFrmNurseWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurse("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${2c14f69e-4b5e-3780-8680-738c9b548474}, hash: E8DA68AC56942AC3F05C06B44A19B1D2
    @Disabled()
    @Test()
    void getBenVitalDetailsFrmNurseWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(pncServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurse("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary vital data\",\"status\":\"Error while getting beneficiary vital data\"}"));
            verify(pncServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${b21536a5-d988-3228-b7cb-d7c9e7bbe482}, hash: CADAFF9B25558A1D587875F44F8EEA2A
    @Test()
    void getBenVitalDetailsFrmNurseWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurse("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary vital data\",\"status\":\"Error while getting beneficiary vital data\"}")));
    }

    //Sapient generated method id: ${e56b3937-0c20-3fc9-9e17-1bbb92dbb413}, hash: A27D6B4ED7FA012D03D6A4ECE674339B
    @Disabled()
    @Test()
    void getBenExaminationDetailsPNCWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(pncServiceImplMock).getPNCExaminationDetailsData(1L, 1L);
        //Act Statement(s)
        String result = target.getBenExaminationDetailsPNC("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(pncServiceImplMock).getPNCExaminationDetailsData(1L, 1L);
        });
    }

    //Sapient generated method id: ${877ccb1a-3e4c-392f-9e9c-9ee0bcd142bf}, hash: DCA86EE126B3EBEEE93FD1D384A40A2A
    @Disabled()
    @Test()
    void getBenExaminationDetailsPNCWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenExaminationDetailsPNC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${8d88ca56-05b6-3e75-a91d-2960e261322d}, hash: 62CD57795020B14E95A7D3462EA8983A
    @Disabled()
    @Test()
    void getBenExaminationDetailsPNCWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(pncServiceImplMock).getPNCExaminationDetailsData(1L, 1L);
        //Act Statement(s)
        String result = target.getBenExaminationDetailsPNC("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary examination data\",\"status\":\"Error while getting beneficiary examination data\"}"));
            verify(pncServiceImplMock).getPNCExaminationDetailsData(1L, 1L);
        });
    }

    //Sapient generated method id: ${5730d60a-e7f4-38f2-802c-41ad6c8a32e4}, hash: 97322A2F38B8171DCFD428745C0F003A
    @Test()
    void getBenExaminationDetailsPNCWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenExaminationDetailsPNC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary examination data\",\"status\":\"Error while getting beneficiary examination data\"}")));
    }

    //Sapient generated method id: ${4a5a4f54-f5cc-3dd8-bafb-e44bf0020099}, hash: 78A577402C94C0DB9DCABFD156AA363C
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorPNCWhenObjHasVisitCode() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(pncServiceImplMock).getBenCaseRecordFromDoctorPNC(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorPNC("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(pncServiceImplMock).getBenCaseRecordFromDoctorPNC(1L, 1L);
        });
    }

    //Sapient generated method id: ${7217c33d-effa-3f2a-b455-c8898f7b6f6d}, hash: 398E46155FEC28E34F95498091B945D7
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorPNCWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorPNC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${3017f4d6-9cd9-3f9f-902f-270fd99ace69}, hash: FA468B4B3656981712126A424A408BCB
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorPNCWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(pncServiceImplMock).getBenCaseRecordFromDoctorPNC(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorPNC("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary doctor data\",\"status\":\"Error while getting beneficiary doctor data\"}"));
            verify(pncServiceImplMock).getBenCaseRecordFromDoctorPNC(1L, 1L);
        });
    }

    //Sapient generated method id: ${5c63b23c-df73-32fa-8337-1223fc5040bf}, hash: B64237678B33E1DC6F59AFBAB56B737F
    @Test()
    void getBenCaseRecordFromDoctorPNCWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorPNC("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary doctor data\",\"status\":\"Error while getting beneficiary doctor data\"}")));
    }

    //Sapient generated method id: ${85ad5dbf-8997-3f59-9196-71df2297f969}, hash: 5CB38DDE25E3E434A31C2E032DB4C58C
    @Disabled()
    @Test()
    void updatePNCCareNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(pncServiceImplMock).updateBenPNCDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updatePNCCareNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(pncServiceImplMock).updateBenPNCDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${43f6b551-ecfe-3cbe-8c96-f27a0d75a80b}, hash: 2FC3AF4FAFEEBCB46A21E9C201DC3F97
    @Disabled()
    @Test()
    void updatePNCCareNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(pncServiceImplMock).updateBenPNCDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updatePNCCareNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(pncServiceImplMock).updateBenPNCDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${2ce19c2f-0fcd-37f6-8f90-086aa7d4ceaf}, hash: A0A31A09F08A5415A65E8A646EA19489
    @Disabled()
    @Test()
    void updatePNCCareNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(pncServiceImplMock).updateBenPNCDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updatePNCCareNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(pncServiceImplMock).updateBenPNCDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${a28424af-18cd-350c-941d-8aeaf27824c5}, hash: 9915971AD5F875B26A07A109F85018A6
    @Disabled()
    @Test()
    void updatePNCCareNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(pncServiceImplMock).updateBenPNCDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updatePNCCareNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(pncServiceImplMock).updateBenPNCDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${fde89bde-3fdb-30d7-8379-3744b518545e}, hash: F655D734EFCB285E4A295646BB72696D
    @Disabled()
    @Test()
    void updateHistoryNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(pncServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(pncServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${67f6c3dc-fb90-3f6d-b452-6d925ed0118c}, hash: 6AD6A81FA74498BF89C2843BD4C47E7C
    @Disabled()
    @Test()
    void updateHistoryNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(pncServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(pncServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${5a58c2ce-8dea-39fc-9583-19be45a14aa5}, hash: E6AD599A340AB2BD3CB74238981BB1A8
    @Disabled()
    @Test()
    void updateHistoryNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(pncServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(pncServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${b72d41d2-b3eb-3369-8b5e-b4c82b438381}, hash: 9BB6369DA3821413656AA9969D1E4A44
    @Disabled()
    @Test()
    void updateHistoryNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(pncServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateHistoryNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(pncServiceImplMock).updateBenHistoryDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${c08c7ced-363f-30e2-9153-a015daa1fb13}, hash: DA2A69EEADC25043383A9280AEED8792
    @Disabled()
    @Test()
    void updateVitalNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(pncServiceImplMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(pncServiceImplMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${3d31ac92-1575-3b5a-8866-a9569579c1e7}, hash: D05B6FE4BB6834DBC7ECBE94AC72533E
    @Disabled()
    @Test()
    void updateVitalNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(pncServiceImplMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(pncServiceImplMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${d996a484-7d33-3c31-b4de-388c54dae395}, hash: FAF97F6E85520F227341236CFE6A72AD
    @Disabled()
    @Test()
    void updateVitalNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(pncServiceImplMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(pncServiceImplMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${ec1b2b7c-0f51-3eab-b499-6f651c0c3daa}, hash: 2AC084431533B4F66197203DF715DB2A
    @Disabled()
    @Test()
    void updateVitalNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(pncServiceImplMock).updateBenVitalDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateVitalNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(pncServiceImplMock).updateBenVitalDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${1b1debc9-c0a1-389e-a479-65046de0a3cf}, hash: E4F03033139671C2E42A74BA9D428870
    @Disabled()
    @Test()
    void updateGeneralOPDExaminationNurseWhenResultGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : true*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(pncServiceImplMock).updateBenExaminationDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateGeneralOPDExaminationNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(pncServiceImplMock).updateBenExaminationDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${31662414-107b-3171-ab88-232e835d7976}, hash: E2DD2008A9FCB5DF9AF60D6E3E058104
    @Disabled()
    @Test()
    void updateGeneralOPDExaminationNurseWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (result > 0) : false*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(pncServiceImplMock).updateBenExaminationDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateGeneralOPDExaminationNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(pncServiceImplMock).updateBenExaminationDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${f5bf22ae-60aa-3de2-9e54-323404458606}, hash: 38D91E34F6B68D57954FA5CBB9FEBA97
    @Disabled()
    @Test()
    void updateGeneralOPDExaminationNurseWhenCaughtException() throws Exception {
        /* Branches:* (result > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(pncServiceImplMock).updateBenExaminationDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateGeneralOPDExaminationNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(pncServiceImplMock).updateBenExaminationDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${bacb4c54-f15c-3fb0-b5f3-c5f7d8866745}, hash: 6C46B3F49E37782D7926A00E1424A12C
    @Disabled()
    @Test()
    void updateGeneralOPDExaminationNurseWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (result > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(pncServiceImplMock).updateBenExaminationDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.updateGeneralOPDExaminationNurse("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(pncServiceImplMock).updateBenExaminationDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${64eb4714-71fe-3425-95d1-f08d17487baa}, hash: 6132C5BC83C340C31301744F0EAD9066
    @Disabled()
    @Test()
    void updatePNCDoctorDataWhenResultGreaterThan0() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : true*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1L).when(pncServiceImplMock).updatePNCDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.updatePNCDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(pncServiceImplMock).updatePNCDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${1cc10da5-a7e2-3ad8-991f-44475654746e}, hash: 5F7B11F7E67341A93CDB65C60AEB00E0
    @Disabled()
    @Test()
    void updatePNCDoctorDataWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : false*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1L).when(pncServiceImplMock).updatePNCDoctorData((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.updatePNCDoctorData("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
            verify(pncServiceImplMock).updatePNCDoctorData((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${bf9ad3b6-0ed8-3080-bc1d-cf5c18d93b46}, hash: F22F54039924BAC1838EFFBCF9C201D0
    @Disabled()
    @Test()
    void updatePNCDoctorDataWhenCaughtException() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(pncServiceImplMock).updatePNCDoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.updatePNCDoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(pncServiceImplMock).updatePNCDoctorData((JsonObject) any(), eq("<value>"));
        });
    }

    //Sapient generated method id: ${89c29544-a595-3646-9dbc-802de1e55fec}, hash: F53739681BA43D0B4E74031D6830A72A
    @Disabled()
    @Test()
    void updatePNCDoctorDataWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new PostnatalCareController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(pncServiceImplMock).updatePNCDoctorData((JsonObject) any(), eq("<value>"));
        //Act Statement(s)
        String result = target.updatePNCDoctorData("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(pncServiceImplMock).updatePNCDoctorData((JsonObject) any(), eq("<value>"));
        });
    }
}
