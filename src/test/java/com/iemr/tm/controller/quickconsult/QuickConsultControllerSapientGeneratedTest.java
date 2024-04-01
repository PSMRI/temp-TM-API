package com.iemr.tm.controller.quickconsult;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.service.quickConsultation.QuickConsultationServiceImpl;
import com.google.gson.JsonObject;
import org.mockito.MockitoAnnotations;
import org.mockito.MockedStatic;
import com.iemr.tm.data.quickConsultation.WrapperQuickConsultation;
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
class QuickConsultControllerSapientGeneratedTest {

    private final QuickConsultationServiceImpl quickConsultationServiceImplMock = mock(QuickConsultationServiceImpl.class, "quickConsultationServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private QuickConsultController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${aa0114b5-1b6a-3338-9442-723cf1f9e3c8}, hash: 33BE412CE69E95486FEA9B4DCA904D1A
    @Disabled()
    @Test()
    void saveBenQuickConsultDataNurseWhenJsnOBJIsNotNull() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : true*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(quickConsultationServiceImplMock).quickConsultNurseDataInsert((JsonObject) any(), eq("Authorization1"));
        //Act Statement(s)
        String result = target.saveBenQuickConsultDataNurse("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(quickConsultationServiceImplMock).quickConsultNurseDataInsert((JsonObject) any(), eq("Authorization1"));
        });
    }

    //Sapient generated method id: ${f13fdb28-b6e9-37b4-822b-04122fd4cee7}, hash: 3551EBD5EE1A0DEC98ACA87E412EDEAC
    @Disabled()
    @Test()
    void saveBenQuickConsultDataNurseWhenJsnOBJIsNull() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBenQuickConsultDataNurse("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${4e0072d5-a4a3-3f23-8dc7-9f0c719ba5df}, hash: 29396B31DA10974C49EAA194D704C3D8
    @Disabled()
    @Test()
    void saveBenQuickConsultDataNurseWhenCaughtException() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(quickConsultationServiceImplMock).quickConsultNurseDataInsert((JsonObject) any(), eq("<value>"));
        doNothing().when(quickConsultationServiceImplMock).deleteVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.saveBenQuickConsultDataNurse("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"C\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
            verify(quickConsultationServiceImplMock).quickConsultNurseDataInsert((JsonObject) any(), eq("<value>"));
            verify(quickConsultationServiceImplMock).deleteVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${9eca67c8-f2bb-3ecc-a5e4-56324da7eeed}, hash: FD10A1524BAEBF13F42AD1F829745DB3
    @Disabled()
    @Test()
    void saveBenQuickConsultDataNurseWhenJsnOBJIsNullAndCaughtException() throws Exception {
        /* Branches:* (null != requestObj) : true* (jsnOBJ != null) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exceptionMock = mock(Exception.class);
        doThrow(exceptionMock).when(quickConsultationServiceImplMock).quickConsultNurseDataInsert((JsonObject) any(), eq("<value>"));
        doNothing().when(quickConsultationServiceImplMock).deleteVisitDetails((JsonObject) any());
        //Act Statement(s)
        String result = target.saveBenQuickConsultDataNurse("<value>", "<value>");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"B\",\"status\":\"B\"}"));
            verify(quickConsultationServiceImplMock).quickConsultNurseDataInsert((JsonObject) any(), eq("<value>"));
            verify(quickConsultationServiceImplMock).deleteVisitDetails((JsonObject) any());
        });
    }

    //Sapient generated method id: ${d153b08a-b695-30c3-903a-c3b8410c01fe}, hash: 8EBE15B97A58CE8E195580B9F1535BBF
    @Test()
    void saveQuickConsultationDetailWhenIGreaterThan0() throws Exception {
        /* Branches:* (i != null) : true* (i > 0) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperQuickConsultation wrapperQuickConsultationMock = mock(WrapperQuickConsultation.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperQuickConsultationMock).when(inputMapperMock).fromJson("A", WrapperQuickConsultation.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperQuickConsultationMock).getQuickConsultation();
            target = new QuickConsultController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1).when(quickConsultationServiceImplMock).quickConsultDoctorDataInsert(jsonObject, "Authorization1");
            //Act Statement(s)
            String result = target.saveQuickConsultationDetail("A", "Authorization1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"Data saved successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("A", WrapperQuickConsultation.class);
                verify(wrapperQuickConsultationMock).getQuickConsultation();
                verify(quickConsultationServiceImplMock).quickConsultDoctorDataInsert(jsonObject, "Authorization1");
            });
        }
    }

    //Sapient generated method id: ${40ee27b3-aef4-3940-b872-c1dc4bc4b37d}, hash: 2907A1AF92D82C8D5B4D6FD6FE266688
    @Test()
    void saveQuickConsultationDetailWhenINotGreaterThan0() throws Exception {
        /* Branches:* (i != null) : true* (i > 0) : false*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperQuickConsultation wrapperQuickConsultationMock = mock(WrapperQuickConsultation.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperQuickConsultationMock).when(inputMapperMock).fromJson("A", WrapperQuickConsultation.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperQuickConsultationMock).getQuickConsultation();
            target = new QuickConsultController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(quickConsultationServiceImplMock).quickConsultDoctorDataInsert(jsonObject, "Authorization1");
            //Act Statement(s)
            String result = target.saveQuickConsultationDetail("A", "Authorization1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Unable to save data\",\"status\":\"Unable to save data\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("A", WrapperQuickConsultation.class);
                verify(wrapperQuickConsultationMock).getQuickConsultation();
                verify(quickConsultationServiceImplMock).quickConsultDoctorDataInsert(jsonObject, "Authorization1");
            });
        }
    }

    //Sapient generated method id: ${abedfcd0-7965-3848-9a23-1a1029b9630a}, hash: FF129FB0B6628BDE18AFB1BEEE6807C0
    @Test()
    void saveQuickConsultationDetailWhenCaughtException() throws Exception {
        /* Branches:* (i != null) : true* (i > 0) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperQuickConsultation wrapperQuickConsultationMock = mock(WrapperQuickConsultation.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperQuickConsultationMock).when(inputMapperMock).fromJson("A", WrapperQuickConsultation.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperQuickConsultationMock).getQuickConsultation();
            target = new QuickConsultController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Exception exception = new Exception("B");
            doThrow(exception).when(quickConsultationServiceImplMock).quickConsultDoctorDataInsert(jsonObject, "Authorization1");
            //Act Statement(s)
            String result = target.saveQuickConsultationDetail("A", "Authorization1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"B\",\"status\":\"B\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("A", WrapperQuickConsultation.class);
                verify(wrapperQuickConsultationMock).getQuickConsultation();
                verify(quickConsultationServiceImplMock).quickConsultDoctorDataInsert(jsonObject, "Authorization1");
            });
        }
    }

    //Sapient generated method id: ${8ff31133-1fa3-3511-be35-10c159b994ed}, hash: B55134F2DA972429DF3CF69212A15588
    @Test()
    void saveQuickConsultationDetailWhenINotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (i != null) : true* (i > 0) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperQuickConsultation wrapperQuickConsultationMock = mock(WrapperQuickConsultation.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperQuickConsultationMock).when(inputMapperMock).fromJson("A", WrapperQuickConsultation.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperQuickConsultationMock).getQuickConsultation();
            target = new QuickConsultController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Exception exception = new Exception("B");
            doThrow(exception).when(quickConsultationServiceImplMock).quickConsultDoctorDataInsert(jsonObject, "Authorization1");
            //Act Statement(s)
            String result = target.saveQuickConsultationDetail("A", "Authorization1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"B\",\"status\":\"B\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("A", WrapperQuickConsultation.class);
                verify(wrapperQuickConsultationMock).getQuickConsultation();
                verify(quickConsultationServiceImplMock).quickConsultDoctorDataInsert(jsonObject, "Authorization1");
            });
        }
    }

    //Sapient generated method id: ${8b6f3113-83c4-3a7e-995d-f4560f8d05d3}, hash: F2807F89826E57FEC771B2E3B2CD5CE6
    @Disabled()
    @Test()
    void getBenDataFrmNurseScrnToDocScrnVisitDetailsWhenObjLengthGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(quickConsultationServiceImplMock).getBenDataFrmNurseToDocVisitDetailsScreen(1L, 1L);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnVisitDetails("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(quickConsultationServiceImplMock).getBenDataFrmNurseToDocVisitDetailsScreen(1L, 1L);
        });
    }

    //Sapient generated method id: ${c016423c-0fc4-390c-b3ff-272e062ccc38}, hash: EBB226C07572C668140397DAC6F3FF60
    @Disabled()
    @Test()
    void getBenDataFrmNurseScrnToDocScrnVisitDetailsWhenObjLengthNotGreaterThan1() throws Exception {
        /* Branches:* (obj.length() > 1) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnVisitDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${363c1cdd-104e-3bf5-a2ac-f444d2151f21}, hash: 62E49156661E4804B47A64B2678043AD
    @Disabled()
    @Test()
    void getBenDataFrmNurseScrnToDocScrnVisitDetailsWhenCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(quickConsultationServiceImplMock).getBenDataFrmNurseToDocVisitDetailsScreen(1L, 1L);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnVisitDetails("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting visit data\",\"status\":\"Error while getting visit data\"}"));
            verify(quickConsultationServiceImplMock).getBenDataFrmNurseToDocVisitDetailsScreen(1L, 1L);
        });
    }

    //Sapient generated method id: ${83e21c94-065e-3766-8025-0235a7eee03b}, hash: 459E0608D560DE71C3DBCC2C5062B5AB
    @Test()
    void getBenDataFrmNurseScrnToDocScrnVisitDetailsWhenObjLengthNotGreaterThan1AndCaughtException() throws Exception {
        /* Branches:* (obj.length() > 1) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDataFrmNurseScrnToDocScrnVisitDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting visit data\",\"status\":\"Error while getting visit data\"}")));
    }

    //Sapient generated method id: ${43e7fff8-5475-3700-9146-0b37da1e368b}, hash: C7F18EE23FD49E0F049D4B25A36D4398
    @Disabled()
    @Test()
    void getBenVitalDetailsFrmNurseWhenObjHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(quickConsultationServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurse("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(quickConsultationServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${698cdd40-4a71-3843-a184-25491843d701}, hash: 63C0FA61A3A4DEA75379C5E6437AFEE7
    @Disabled()
    @Test()
    void getBenVitalDetailsFrmNurseWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurse("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${2c14f69e-4b5e-3780-8680-738c9b548474}, hash: 540FC51BDD52E692E8C1C99FAF9587F7
    @Disabled()
    @Test()
    void getBenVitalDetailsFrmNurseWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(quickConsultationServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurse("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting vital data\",\"status\":\"Error while getting vital data\"}"));
            verify(quickConsultationServiceImplMock).getBeneficiaryVitalDetails(1L, 1L);
        });
    }

    //Sapient generated method id: ${b21536a5-d988-3228-b7cb-d7c9e7bbe482}, hash: 5AD98DD616DA343A6143483373837AD5
    @Test()
    void getBenVitalDetailsFrmNurseWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenVitalDetailsFrmNurse("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting vital data\",\"status\":\"Error while getting vital data\"}")));
    }

    //Sapient generated method id: ${d2df157c-a5b8-3324-921e-843294c65b37}, hash: 7227A066B101C2C52C61E4B2D37AA200
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorQuickConsultWhenObjHasVisitCode() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(quickConsultationServiceImplMock).getBenCaseRecordFromDoctorQuickConsult(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorQuickConsult("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(quickConsultationServiceImplMock).getBenCaseRecordFromDoctorQuickConsult(1L, 1L);
        });
    }

    //Sapient generated method id: ${cb691038-cb43-37b9-a25b-054b0ae834c1}, hash: 17DC21CC83D71A400AFF5B81FFDEEFFD
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorQuickConsultWhenObjNotHasVisitCode() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorQuickConsult("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${fdd97d7e-40f2-310f-a13b-d32375eb18ba}, hash: FAD11FEEFF199C45AD5AD466BFC6041B
    @Disabled()
    @Test()
    void getBenCaseRecordFromDoctorQuickConsultWhenObjHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(quickConsultationServiceImplMock).getBenCaseRecordFromDoctorQuickConsult(1L, 1L);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorQuickConsult("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting doctor data\",\"status\":\"Error while getting doctor data\"}"));
            verify(quickConsultationServiceImplMock).getBenCaseRecordFromDoctorQuickConsult(1L, 1L);
        });
    }

    //Sapient generated method id: ${c9e39f8d-bd63-3b3e-99c9-84d15277fbaf}, hash: 8DF677D367744C1FF849AF3C039A80B1
    @Test()
    void getBenCaseRecordFromDoctorQuickConsultWhenObjNotHasVisitCodeAndCaughtException() throws Exception {
        /* Branches:* (null != obj) : true* (obj.length() > 1) : true* (obj.has("benRegID")) : true* (obj.has("visitCode")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new QuickConsultController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenCaseRecordFromDoctorQuickConsult("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting doctor data\",\"status\":\"Error while getting doctor data\"}")));
    }

    //Sapient generated method id: ${7522d79e-8693-33fb-a321-b55e1bb5da12}, hash: C1018873F3EE50324CF125A212E418B2
    @Disabled()
    @Test()
    void updateGeneralOPDQCDoctorDataWhenResultGreaterThan0() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperQuickConsultation wrapperQuickConsultationMock = mock(WrapperQuickConsultation.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperQuickConsultationMock).when(inputMapperMock).fromJson("A", WrapperQuickConsultation.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperQuickConsultationMock).getQuickConsultation();
            target = new QuickConsultController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1L).when(quickConsultationServiceImplMock).updateGeneralOPDQCDoctorData(jsonObject, "Authorization1");
            //Act Statement(s)
            String result = target.updateGeneralOPDQCDoctorData("A", "Authorization1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("A", WrapperQuickConsultation.class);
                verify(wrapperQuickConsultationMock).getQuickConsultation();
                verify(quickConsultationServiceImplMock).updateGeneralOPDQCDoctorData(jsonObject, "Authorization1");
            });
        }
    }

    //Sapient generated method id: ${c77a6c48-12a5-3d41-a85a-e84d063b3f53}, hash: 0188DEF08662FF43F2C570BE0FE8CAE5
    @Disabled()
    @Test()
    void updateGeneralOPDQCDoctorDataWhenResultNotGreaterThan0() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : false*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperQuickConsultation wrapperQuickConsultationMock = mock(WrapperQuickConsultation.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperQuickConsultationMock).when(inputMapperMock).fromJson("A", WrapperQuickConsultation.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperQuickConsultationMock).getQuickConsultation();
            target = new QuickConsultController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(-1L).when(quickConsultationServiceImplMock).updateGeneralOPDQCDoctorData(jsonObject, "Authorization1");
            //Act Statement(s)
            String result = target.updateGeneralOPDQCDoctorData("A", "Authorization1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Unable to modify data\",\"status\":\"Unable to modify data\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("A", WrapperQuickConsultation.class);
                verify(wrapperQuickConsultationMock).getQuickConsultation();
                verify(quickConsultationServiceImplMock).updateGeneralOPDQCDoctorData(jsonObject, "Authorization1");
            });
        }
    }

    //Sapient generated method id: ${f727075d-c085-341c-8490-bf9f994881d1}, hash: 8FEE595D4F10B05797761AF28FFF46AB
    @Disabled()
    @Test()
    void updateGeneralOPDQCDoctorDataWhenCaughtException() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperQuickConsultation wrapperQuickConsultationMock = mock(WrapperQuickConsultation.class);
        Exception exceptionMock = mock(Exception.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperQuickConsultationMock).when(inputMapperMock).fromJson("<value>", WrapperQuickConsultation.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperQuickConsultationMock).getQuickConsultation();
            target = new QuickConsultController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doThrow(exceptionMock).when(quickConsultationServiceImplMock).updateGeneralOPDQCDoctorData(jsonObject, "<value>");
            //Act Statement(s)
            String result = target.updateGeneralOPDQCDoctorData("<value>", "<value>");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"Data updated successfully\"},\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", WrapperQuickConsultation.class);
                verify(wrapperQuickConsultationMock).getQuickConsultation();
                verify(quickConsultationServiceImplMock).updateGeneralOPDQCDoctorData(jsonObject, "<value>");
            });
        }
    }

    //Sapient generated method id: ${61d133b5-3720-36ae-8303-0ce6c409cb4e}, hash: 19186400566464A4439BEC32EA7CE41F
    @Disabled()
    @Test()
    void updateGeneralOPDQCDoctorDataWhenResultNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (null != result) : true* (result > 0) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperQuickConsultation wrapperQuickConsultationMock = mock(WrapperQuickConsultation.class);
        Exception exceptionMock = mock(Exception.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperQuickConsultationMock).when(inputMapperMock).fromJson("<value>", WrapperQuickConsultation.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperQuickConsultationMock).getQuickConsultation();
            target = new QuickConsultController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doThrow(exceptionMock).when(quickConsultationServiceImplMock).updateGeneralOPDQCDoctorData(jsonObject, "<value>");
            //Act Statement(s)
            String result = target.updateGeneralOPDQCDoctorData("<value>", "<value>");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"A\",\"status\":\"A\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", WrapperQuickConsultation.class);
                verify(wrapperQuickConsultationMock).getQuickConsultation();
                verify(quickConsultationServiceImplMock).updateGeneralOPDQCDoctorData(jsonObject, "<value>");
            });
        }
    }
}
