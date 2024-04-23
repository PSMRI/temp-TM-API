package com.iemr.tm.controller.registrar.main;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.google.gson.JsonObject;
import com.iemr.tm.data.registrar.BeneficiaryData;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.service.registrar.RegistrarServiceImpl;
import com.iemr.tm.service.common.transaction.CommonNurseServiceImpl;
import org.mockito.MockedStatic;
import com.iemr.tm.data.registrar.V_BenAdvanceSearch;
import com.iemr.tm.data.registrar.WrapperBeneficiaryRegistration;
import com.iemr.tm.service.common.master.RegistrarServiceMasterDataImpl;
import com.iemr.tm.utils.mapper.InputMapper;

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
class RegistrarControllerSapientGeneratedTest {

    private final RegistrarServiceImpl registrarServiceImplMock = mock(RegistrarServiceImpl.class, "registrarServiceImpl");

    private final RegistrarServiceMasterDataImpl registrarServiceMasterDataImplMock = mock(RegistrarServiceMasterDataImpl.class, "registrarServiceMasterDataImpl");

    private final CommonNurseServiceImpl commonNurseServiceImplMock = mock(CommonNurseServiceImpl.class, "commonNurseServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private RegistrarController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${a59fb9ac-f688-3c28-868d-108cd6edd51f}, hash: 8219DD15328B2D99841710FB25F36ADE
    @Disabled()
    @Test()
    void getRegistrarWorkListTest() throws Exception {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(registrarServiceImplMock).getRegWorkList(0);
        //Act Statement(s)
        String result = target.getRegistrarWorkList("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceImplMock).getRegWorkList(0);
        });
    }

    //Sapient generated method id: ${5a88b073-7505-3d7c-bd2b-ed7083c7a090}, hash: 1085DCB4F5242D9B8044813E5F750CED
    @Disabled()
    @Test()
    void getRegistrarWorkListWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(registrarServiceImplMock).getRegWorkList(0);
        //Act Statement(s)
        String result = target.getRegistrarWorkList("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceImplMock).getRegWorkList(0);
        });
    }

    //Sapient generated method id: ${8f3c5fcf-f0e1-347b-b643-82bf26e519ea}, hash: 67761E6BB7C570D56A97A08D7E2CD7EF
    @Disabled()
    @Test()
    void quickSearchBeneficiaryTest() throws Exception {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(registrarServiceImplMock).getQuickSearchBenData("return_of_getString1");
        //Act Statement(s)
        String result = target.quickSearchBeneficiary("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceImplMock).getQuickSearchBenData("return_of_getString1");
        });
    }

    //Sapient generated method id: ${cdbcc774-78a7-3364-aea8-cfc0003f4bd8}, hash: EEDAA5D41467D3E48E0D5EC4E979263F
    @Disabled()
    @Test()
    void quickSearchBeneficiaryWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(registrarServiceImplMock).getQuickSearchBenData("return_of_getString1");
        //Act Statement(s)
        String result = target.quickSearchBeneficiary("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceImplMock).getQuickSearchBenData("return_of_getString1");
        });
    }

    //Sapient generated method id: ${401c8d75-2ebf-3999-b5b4-f299afff2b8e}, hash: 1E3A0F3DF939A66CF745E8C2F2882DF8
    @Test()
    void advanceSearchTest() throws Exception {
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        V_BenAdvanceSearch v_BenAdvanceSearchMock = mock(V_BenAdvanceSearch.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(v_BenAdvanceSearchMock).when(inputMapperMock).fromJson("D", V_BenAdvanceSearch.class);
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("B").when(registrarServiceImplMock).getAdvanceSearchBenData(v_BenAdvanceSearchMock);
            //Act Statement(s)
            String result = target.advanceSearch("D");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("D", V_BenAdvanceSearch.class);
                verify(registrarServiceImplMock).getAdvanceSearchBenData(v_BenAdvanceSearchMock);
            });
        }
    }

    //Sapient generated method id: ${14abbec5-969e-356a-bb40-db29ee76efb8}, hash: 44F14C27F90FD3EC2D06B2951E5CBFEC
    @Test()
    void advanceSearchWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        V_BenAdvanceSearch v_BenAdvanceSearchMock = mock(V_BenAdvanceSearch.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(v_BenAdvanceSearchMock).when(inputMapperMock).fromJson("D", V_BenAdvanceSearch.class);
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("B").when(registrarServiceImplMock).getAdvanceSearchBenData(v_BenAdvanceSearchMock);
            //Act Statement(s)
            String result = target.advanceSearch("D");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("D", V_BenAdvanceSearch.class);
                verify(registrarServiceImplMock).getAdvanceSearchBenData(v_BenAdvanceSearchMock);
            });
        }
    }

    //Sapient generated method id: ${0958fa38-ace4-3d3d-94a6-8f36adcdbd3c}, hash: 1D03C82E98B564805A163984C778F3F1
    @Disabled()
    @Test()
    void getBenDetailsByRegIDWhenObjNotHasBeneficiaryRegID() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDetailsByRegID("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Bad Request... beneficiaryRegID is not there in request\",\"status\":\"Bad Request... beneficiaryRegID is not there in request\"}")));
    }

    //Sapient generated method id: ${e1b48044-2d07-3a1a-8de7-946fcb4025b7}, hash: 6D6858C317E5A6B9CE9BF14029B2A27E
    @Disabled()
    @Test()
    void getBenDetailsByRegIDWhenObjGetLongBeneficiaryRegIDGreaterThan0() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(registrarServiceMasterDataImplMock).getBenDetailsByRegID(1L);
        //Act Statement(s)
        String result = target.getBenDetailsByRegID("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceMasterDataImplMock).getBenDetailsByRegID(1L);
        });
    }

    //Sapient generated method id: ${cd5a8848-14d3-30c2-864c-dc8e7fdefc27}, hash: 1ACAF8BFF562186A074537D72B273B89
    @Disabled()
    @Test()
    void getBenDetailsByRegIDWhenObjGetLongBeneficiaryRegIDNotGreaterThan0() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDetailsByRegID("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Please pass beneficiaryRegID\",\"status\":\"Please pass beneficiaryRegID\"}")));
    }

    //Sapient generated method id: ${999ddcba-900f-3035-b1bd-155ffd146c6e}, hash: 2B768E364AA3443D1EBEBC1A131CC0BD
    @Disabled()
    @Test()
    void getBenDetailsByRegIDWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDetailsByRegID("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Bad Request... beneficiaryRegID is not there in request\",\"status\":\"Bad Request... beneficiaryRegID is not there in request\"}")));
    }

    //Sapient generated method id: ${f17423b9-97d5-3dbc-85f8-bf65793bc92d}, hash: 1BAA904D819EF4E188BC46411A290149
    @Disabled()
    @Test()
    void getBenDetailsByRegIDWhenObjGetLongBeneficiaryRegIDGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(registrarServiceMasterDataImplMock).getBenDetailsByRegID(1L);
        //Act Statement(s)
        String result = target.getBenDetailsByRegID("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceMasterDataImplMock).getBenDetailsByRegID(1L);
        });
    }

    //Sapient generated method id: ${33b80e91-9ed4-35a6-8715-b17cf6f8541d}, hash: 0E717F6C522E4886C31A02B98BED49BA
    @Disabled()
    @Test()
    void getBenDetailsByRegIDWhenObjGetLongBeneficiaryRegIDNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDetailsByRegID("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Please pass beneficiaryRegID\",\"status\":\"Please pass beneficiaryRegID\"}")));
    }

    //Sapient generated method id: ${6e662493-05f1-3275-a651-05a864a59acf}, hash: A7ED3F04107AC56623CF4865D73886A1
    @Disabled()
    @Test()
    void getBeneficiaryDetailsWhenObjNotHasBeneficiaryRegID() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBeneficiaryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Bad Request... beneficiaryRegID is not there in request\",\"status\":\"Bad Request... beneficiaryRegID is not there in request\"}")));
    }

    //Sapient generated method id: ${4a14805c-188b-31b7-b354-eac73c7e047e}, hash: DE49EC20788095832EA01204C6C68E32
    @Disabled()
    @Test()
    void getBeneficiaryDetailsWhenObjGetLongBeneficiaryRegIDNotGreaterThan0() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBeneficiaryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Please pass beneficiaryRegID\",\"status\":\"Please pass beneficiaryRegID\"}")));
    }

    //Sapient generated method id: ${c3653fec-3cea-3912-9973-90165b91a1d6}, hash: 92C1544D66E2CB5FB72B60764409C7F6
    @Disabled()
    @Test()
    void getBeneficiaryDetailsWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBeneficiaryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Bad Request... beneficiaryRegID is not there in request\",\"status\":\"Bad Request... beneficiaryRegID is not there in request\"}")));
    }

    //Sapient generated method id: ${08c508d9-26e1-3b7e-ac46-d1000bb9bbdb}, hash: DAB3209207496E8C5E9B335787DF2ECE
    @Disabled()
    @Test()
    void getBeneficiaryDetailsWhenBeneficiaryDataIsNotNull() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true* (beneficiaryData != null) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(registrarServiceImplMock).getBeneficiaryDetails(1L);
        //Act Statement(s)
        String result = target.getBeneficiaryDetails("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceImplMock).getBeneficiaryDetails(1L);
        });
    }

    //Sapient generated method id: ${b6801a4f-a670-3b52-95ed-2b1a0b7dd079}, hash: 63A9FAA74CD6051E17E233FA6B0CC813
    @Disabled()
    @Test()
    void getBeneficiaryDetailsWhenBeneficiaryDataIsNull() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true* (beneficiaryData != null) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(registrarServiceImplMock).getBeneficiaryDetails(1L);
        //Act Statement(s)
        String result = target.getBeneficiaryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceImplMock).getBeneficiaryDetails(1L);
        });
    }

    //Sapient generated method id: ${44313797-ecb3-34dd-a065-d967bfd6d31a}, hash: 911A854F69AE0C962934DC9115284C97
    @Disabled()
    @Test()
    void getBeneficiaryDetailsWhenObjGetLongBeneficiaryRegIDNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBeneficiaryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Please pass beneficiaryRegID\",\"status\":\"Please pass beneficiaryRegID\"}")));
    }

    //Sapient generated method id: ${2b951840-a48d-3ab5-84d2-018c0a93c160}, hash: 82101B6171A27A1E2913362E89CDC9D8
    @Disabled()
    @Test()
    void getBeneficiaryDetailsWhenBeneficiaryDataIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true* (beneficiaryData != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(registrarServiceImplMock).getBeneficiaryDetails(1L);
        //Act Statement(s)
        String result = target.getBeneficiaryDetails("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceImplMock).getBeneficiaryDetails(1L);
        });
    }

    //Sapient generated method id: ${4d237c2e-68b3-379d-b972-cd9cceb1cbb3}, hash: 7E072CA9EBAD5B03C7088D468C6E7B2B
    @Disabled()
    @Test()
    void getBeneficiaryDetailsWhenBeneficiaryDataIsNullAndCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true* (beneficiaryData != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(registrarServiceImplMock).getBeneficiaryDetails(1L);
        //Act Statement(s)
        String result = target.getBeneficiaryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceImplMock).getBeneficiaryDetails(1L);
        });
    }

    //Sapient generated method id: ${3a022589-2508-3582-a4c2-53518f0629af}, hash: 3BA937405152C76813EF439FBCFC8F8F
    @Disabled()
    @Test()
    void getBeneficiaryImageWhenObjNotHasBeneficiaryRegID() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBeneficiaryImage("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Bad Request... beneficiaryRegID is not there in request\",\"status\":\"Bad Request... beneficiaryRegID is not there in request\"}")));
    }

    //Sapient generated method id: ${1e47f829-cad8-38d0-8f04-c44e6af571df}, hash: A2D3D965A7E555E6D366025D1524F605
    @Disabled()
    @Test()
    void getBeneficiaryImageWhenObjGetLongBeneficiaryRegIDGreaterThan0() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(registrarServiceImplMock).getBenImage(1L);
        //Act Statement(s)
        String result = target.getBeneficiaryImage("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceImplMock).getBenImage(1L);
        });
    }

    //Sapient generated method id: ${dce5435b-310d-3748-9517-77b254298e94}, hash: A169004B15CC930B86896F96EE0E9767
    @Disabled()
    @Test()
    void getBeneficiaryImageWhenObjGetLongBeneficiaryRegIDNotGreaterThan0() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBeneficiaryImage("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Please pass beneficiaryRegID\",\"status\":\"Please pass beneficiaryRegID\"}")));
    }

    //Sapient generated method id: ${b82ef6c3-248e-347e-bb22-b8da1e36698e}, hash: 251BC7CB20FCB3E4D638F3871F5BDAFA
    @Disabled()
    @Test()
    void getBeneficiaryImageWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBeneficiaryImage("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Bad Request... beneficiaryRegID is not there in request\",\"status\":\"Bad Request... beneficiaryRegID is not there in request\"}")));
    }

    //Sapient generated method id: ${42595e68-7669-391e-9795-fdc7841f5d12}, hash: 54BC935010EC11CE9A0921FE48569B66
    @Disabled()
    @Test()
    void getBeneficiaryImageWhenObjGetLongBeneficiaryRegIDGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(registrarServiceImplMock).getBenImage(1L);
        //Act Statement(s)
        String result = target.getBeneficiaryImage("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceImplMock).getBenImage(1L);
        });
    }

    //Sapient generated method id: ${491473d7-2298-3f3e-9216-04bf51d848cd}, hash: CFB82A7F324FEC86327FE12D2487EC6E
    @Disabled()
    @Test()
    void getBeneficiaryImageWhenObjGetLongBeneficiaryRegIDNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBeneficiaryImage("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Please pass beneficiaryRegID\",\"status\":\"Please pass beneficiaryRegID\"}")));
    }

    //Sapient generated method id: ${4e74eecc-299e-323a-b345-2def87618b7a}, hash: 5B7319EC9B4C6758EBBEEF1A80F05C24
    @Test()
    void quickSearchNewWhenSearchListIsNull() throws Exception {
        /* Branches:* (searchList == null) : true*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(registrarServiceImplMock).beneficiaryQuickSearch("requestObj1", "Authorization1");
        //Act Statement(s)
        String result = target.quickSearchNew("requestObj1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}"));
            verify(registrarServiceImplMock).beneficiaryQuickSearch("requestObj1", "Authorization1");
        });
    }

    //Sapient generated method id: ${e524ebc8-25f4-3b6d-9182-de5cfd8b68ad}, hash: 8273A59CDA9A3E532F21345405861186
    @Test()
    void quickSearchNewWhenSearchListIsNotNull() throws Exception {
        /* Branches:* (searchList == null) : false*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_beneficiaryQuickSearch1").when(registrarServiceImplMock).beneficiaryQuickSearch("requestObj1", "Authorization1");
        //Act Statement(s)
        String result = target.quickSearchNew("requestObj1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_beneficiaryQuickSearch1"));
            verify(registrarServiceImplMock).beneficiaryQuickSearch("requestObj1", "Authorization1");
        });
    }

    //Sapient generated method id: ${03f0e1cc-7f02-3f6e-b061-681b166bc74d}, hash: 38CC7AAEB86A09077CC32483F717825A
    @Disabled()
    @Test()
    void quickSearchNewWhenCaughtException() throws Exception {
        /* Branches:* (searchList == null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(registrarServiceImplMock).beneficiaryQuickSearch("requestObj1", "Authorization1");
        //Act Statement(s)
        String result = target.quickSearchNew("requestObj1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while searching beneficiary\",\"status\":\"Error while searching beneficiary\"}"));
            verify(registrarServiceImplMock).beneficiaryQuickSearch("requestObj1", "Authorization1");
        });
    }

    //Sapient generated method id: ${a7a0bd2b-1ad3-3ef1-b552-5c2d5d5cf9bd}, hash: FD071BEC621D46AE95F8924842DA5C26
    @Test()
    void advanceSearchNewWhenSearchListIsNull() throws Exception {
        /* Branches:* (searchList == null) : true*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(registrarServiceImplMock).beneficiaryAdvanceSearch("requestObj1", "Authorization1");
        //Act Statement(s)
        String result = target.advanceSearchNew("requestObj1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}"));
            verify(registrarServiceImplMock).beneficiaryAdvanceSearch("requestObj1", "Authorization1");
        });
    }

    //Sapient generated method id: ${69d7f392-bf00-34a9-a6c0-90d58f431c11}, hash: 2507416E49A5056799C2CBD50A39FF3D
    @Test()
    void advanceSearchNewWhenSearchListIsNotNull() throws Exception {
        /* Branches:* (searchList == null) : false*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_beneficiaryAdvanceSearch1").when(registrarServiceImplMock).beneficiaryAdvanceSearch("requestObj1", "Authorization1");
        //Act Statement(s)
        String result = target.advanceSearchNew("requestObj1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_beneficiaryAdvanceSearch1"));
            verify(registrarServiceImplMock).beneficiaryAdvanceSearch("requestObj1", "Authorization1");
        });
    }

    //Sapient generated method id: ${23998532-2d4a-3bce-9790-4c563745e821}, hash: 7117EA5F79C1D4FA14DB7EEBC8AF0180
    @Disabled()
    @Test()
    void advanceSearchNewWhenCaughtException() throws Exception {
        /* Branches:* (searchList == null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(registrarServiceImplMock).beneficiaryAdvanceSearch("requestObj1", "Authorization1");
        //Act Statement(s)
        String result = target.advanceSearchNew("requestObj1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while searching beneficiary\",\"status\":\"Error while searching beneficiary\"}"));
            verify(registrarServiceImplMock).beneficiaryAdvanceSearch("requestObj1", "Authorization1");
        });
    }

    //Sapient generated method id: ${60aa1fe3-6b23-34fb-8357-e6fbaefd80b7}, hash: EECA239B2B3503FAA2912E5D957F7847
    @Disabled()
    @Test()
    void getBenDetailsForLeftSidePanelByRegIDWhenObjNotHasBenFlowID() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.has("benFlowID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDetailsForLeftSidePanelByRegID("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${a2d676a9-76eb-35a9-aa32-a78c8c8f81be}, hash: F1B19EA5DCAA01A08708D891C0415AA9
    @Test()
    void getBenDetailsForLeftSidePanelByRegIDWhenObjNotHasBenFlowIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.has("benFlowID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDetailsForLeftSidePanelByRegID("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary details\",\"status\":\"Error while getting beneficiary details\"}")));
    }

    //Sapient generated method id: ${201431a8-ffd0-3f3e-877d-7ca6530fa9ed}, hash: 88549EBA28E517CD8F2DE4543885065B
    @Disabled()
    @Test()
    void getBenDetailsForLeftSidePanelByRegIDWhenObjGetLongBenFlowIDGreaterThan0() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.has("benFlowID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true* (obj.getLong("benFlowID") > 0) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(registrarServiceMasterDataImplMock).getBenDetailsForLeftSideByRegIDNew(1L, 1L, "Authorization1", "G");
        //Act Statement(s)
        String result = target.getBenDetailsForLeftSidePanelByRegID("G", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceMasterDataImplMock).getBenDetailsForLeftSideByRegIDNew(1L, 1L, "Authorization1", "G");
        });
    }

    //Sapient generated method id: ${f578871b-d5b9-3fe2-b1cc-7317b9a8399d}, hash: 06C6F543F9B94C7291F9C90F57CB6B8E
    @Disabled()
    @Test()
    void getBenDetailsForLeftSidePanelByRegIDWhenObjGetLongBenFlowIDNotGreaterThan0() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.has("benFlowID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true* (obj.getLong("benFlowID") > 0) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDetailsForLeftSidePanelByRegID("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Invalid Beneficiary ID\",\"status\":\"Invalid Beneficiary ID\"}")));
    }

    //Sapient generated method id: ${bda799cd-4724-31dd-966b-1b0595513d28}, hash: F87188D82F9EEB9E8F47499E6372ED8B
    @Disabled()
    @Test()
    void getBenDetailsForLeftSidePanelByRegIDWhenObjGetLongBenFlowIDGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.has("benFlowID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true* (obj.getLong("benFlowID") > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(registrarServiceMasterDataImplMock).getBenDetailsForLeftSideByRegIDNew(1L, 1L, "Authorization1", "G");
        //Act Statement(s)
        String result = target.getBenDetailsForLeftSidePanelByRegID("G", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary details\",\"status\":\"Error while getting beneficiary details\"}"));
            verify(registrarServiceMasterDataImplMock).getBenDetailsForLeftSideByRegIDNew(1L, 1L, "Authorization1", "G");
        });
    }

    //Sapient generated method id: ${c7da85fd-a7b0-3cfe-a452-3d6ad13b0d26}, hash: 00B40FADDCB4A1B544EBB2DD4E1BFD51
    @Test()
    void getBenDetailsForLeftSidePanelByRegIDWhenObjGetLongBenFlowIDNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.has("benFlowID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true* (obj.getLong("benFlowID") > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDetailsForLeftSidePanelByRegID("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary details\",\"status\":\"Error while getting beneficiary details\"}")));
    }

    //Sapient generated method id: ${d17e4ecd-9863-3200-8155-876d9c287049}, hash: 8FE15D9C64AC66D146FB11B46FD5280A
    @Test()
    void getBenImageTest() throws Exception {
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getBenImageFromIdentityAPI1").when(registrarServiceMasterDataImplMock).getBenImageFromIdentityAPI("Authorization1", "requestObj1");
        //Act Statement(s)
        String result = target.getBenImage("requestObj1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getBenImageFromIdentityAPI1"));
            verify(registrarServiceMasterDataImplMock).getBenImageFromIdentityAPI("Authorization1", "requestObj1");
        });
    }

    //Sapient generated method id: ${92b717ab-913d-3692-94df-11ed0086b7b6}, hash: 6E61DEDE94979AC960EB549BE58C156A
    @Disabled()
    @Test()
    void getBenImageWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getBenImageFromIdentityAPI1").when(registrarServiceMasterDataImplMock).getBenImageFromIdentityAPI("Authorization1", "requestObj1");
        //Act Statement(s)
        String result = target.getBenImage("requestObj1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting beneficiary image\",\"status\":\"Error while getting beneficiary image\"}"));
            verify(registrarServiceMasterDataImplMock).getBenImageFromIdentityAPI("Authorization1", "requestObj1");
        });
    }

    //Sapient generated method id: ${d1b8bb90-382c-3d1f-a3fc-8f0d06b813b5}, hash: 3D131A9682C3561EAFB9D75542CCC5E5
    @Disabled()
    @Test()
    void createBeneficiaryWhenBenDIsJsonNull() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperBeneficiaryRegistration wrapperBeneficiaryRegistrationMock = mock(WrapperBeneficiaryRegistration.class);
        JsonObject jsonObjectMock = mock(JsonObject.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperBeneficiaryRegistrationMock).when(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
            doReturn(jsonObjectMock).when(wrapperBeneficiaryRegistrationMock).getBenD();
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            String result = target.createBeneficiary("<value>", "<value>");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":0,\"errorMessage\":\"Invalid input data\",\"status\":\"Invalid input data\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
                verify(wrapperBeneficiaryRegistrationMock).getBenD();
            });
        }
    }

    //Sapient generated method id: ${92f6f076-aaf4-34a0-b664-474ea716acb5}, hash: 09F2119E685F82116115EE96C47837CB
    @Disabled()
    @Test()
    void createBeneficiaryWhenCaughtException() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperBeneficiaryRegistration wrapperBeneficiaryRegistrationMock = mock(WrapperBeneficiaryRegistration.class);
        JsonObject jsonObjectMock = mock(JsonObject.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperBeneficiaryRegistrationMock).when(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
            doReturn(jsonObjectMock).when(wrapperBeneficiaryRegistrationMock).getBenD();
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            String result = target.createBeneficiary("<value>", "<value>");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":5000,\"status\":\"Failed with null at Fri Mar 22 11:58:28 IST 2024.Please try after some time. If error is still seen, contact your administrator.\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
                verify(wrapperBeneficiaryRegistrationMock).getBenD();
            });
        }
    }

    //Sapient generated method id: ${868258c5-ac8e-3dbb-a048-f4bad056f00c}, hash: 8720CDD00EB0C560A251C9400B67A10C
    @Test()
    void createBeneficiaryWhenBenDataIsNull() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : false* (benData != null) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperBeneficiaryRegistration wrapperBeneficiaryRegistrationMock = mock(WrapperBeneficiaryRegistration.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperBeneficiaryRegistrationMock).when(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperBeneficiaryRegistrationMock).getBenD();
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(null).when(registrarServiceImplMock).createBeneficiary(jsonObject);
            //Act Statement(s)
            String result = target.createBeneficiary("<value>", "<value>");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Something Went-Wrong\",\"status\":\"Something Went-Wrong\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
                verify(wrapperBeneficiaryRegistrationMock).getBenD();
                verify(registrarServiceImplMock).createBeneficiary(jsonObject);
            });
        }
    }

    //Sapient generated method id: ${6e14b2e9-d64f-33a1-947d-50b516577484}, hash: C66C7239B2BDD6B1E40136AA3EFBD02F
    @Disabled()
    @Test()
    void createBeneficiaryWhenBenDataIsNullAndCaughtException() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : false* (benData != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperBeneficiaryRegistration wrapperBeneficiaryRegistrationMock = mock(WrapperBeneficiaryRegistration.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperBeneficiaryRegistrationMock).when(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperBeneficiaryRegistrationMock).getBenD();
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(null).when(registrarServiceImplMock).createBeneficiary(jsonObject);
            //Act Statement(s)
            String result = target.createBeneficiary("<value>", "<value>");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":5000,\"status\":\"Failed with null at Fri Mar 22 11:58:29 IST 2024.Please try after some time. If error is still seen, contact your administrator.\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
                verify(wrapperBeneficiaryRegistrationMock).getBenD();
                verify(registrarServiceImplMock).createBeneficiary(jsonObject);
            });
        }
    }

    //Sapient generated method id: ${14e47cc6-ef63-3b22-93ba-e038f0e4c1bf}, hash: 1D2E9B99BE422903E5CA8A3CC20D8B91
    @Disabled()
    @Test()
    void createBeneficiaryWhenBenImageIDNotGreaterThan0() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : false* (benData != null) : true* (benRegID > 0) : true* (benDemoID > 0) : true* (benPhonMapID > 0) : true* (benbenDemoOtherID > 0) : true* (benImageID > 0) : false*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        BeneficiaryData beneficiaryData = new BeneficiaryData();
        beneficiaryData.setBeneficiaryRegID(1L);
        JsonObject jsonObject = new JsonObject();
        doReturn(beneficiaryData).when(registrarServiceImplMock).createBeneficiary(jsonObject);
        doReturn(1L).when(registrarServiceImplMock).createBeneficiaryDemographic(jsonObject, 1L);
        doReturn(1L).when(registrarServiceImplMock).createBeneficiaryPhoneMapping(jsonObject, 1L);
        doReturn(0).when(registrarServiceImplMock).createBenGovIdMapping(jsonObject, 1L);
        doReturn(1L).when(registrarServiceImplMock).createBeneficiaryDemographicAdditional(jsonObject, 1L);
        doReturn(0L).when(registrarServiceImplMock).createBeneficiaryImage(jsonObject, 1L);
        //Act Statement(s)
        String result = target.createBeneficiary("{'createBeneficiary': 'BeneficiaryData', 'createBeneficiaryImage': 'Long', 'gson': 'InputMapper', 'getBeneficiaryRegID': 'Long', 'createBeneficiaryPhoneMapping': 'Long', 'createBeneficiaryDemographicAdditional': 'Long', 'createBeneficiaryDemographic': 'Long', 'fromJson': 'Object', 'getBenD': 'JsonObject', 'createBenGovIdMapping': 'int'}", "{'createBeneficiary': 'BeneficiaryData', 'createBeneficiaryImage': 'Long', 'gson': 'InputMapper', 'getBeneficiaryRegID': 'Long', 'createBeneficiaryPhoneMapping': 'Long', 'createBeneficiaryDemographicAdditional': 'Long', 'createBeneficiaryDemographic': 'Long', 'fromJson': 'Object', 'getBenD': 'JsonObject', 'createBenGovIdMapping': 'int'}");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Something Went-Wrong\",\"status\":\"Something Went-Wrong\"}"));
            verify(registrarServiceImplMock).createBeneficiary(jsonObject);
            verify(registrarServiceImplMock).createBeneficiaryDemographic(jsonObject, 1L);
            verify(registrarServiceImplMock).createBeneficiaryPhoneMapping(jsonObject, 1L);
            verify(registrarServiceImplMock).createBenGovIdMapping(jsonObject, 1L);
            verify(registrarServiceImplMock).createBeneficiaryDemographicAdditional(jsonObject, 1L);
            verify(registrarServiceImplMock).createBeneficiaryImage(jsonObject, 1L);
        });
    }

    //Sapient generated method id: ${8fe16a22-d93f-3fa3-9ed7-907fb3c436d8}, hash: A0B50500DD1C0D48857A4B199C7F9A58
    @Test()
    void createBeneficiaryWhenBenDataGetBeneficiaryIDIsNotNull() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : false* (benData != null) : true* (benRegID > 0) : true* (benDemoID > 0) : true* (benPhonMapID > 0) : true* (benbenDemoOtherID > 0) : true* (benImageID > 0) : true* (benData.getBeneficiaryID() != null) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperBeneficiaryRegistration wrapperBeneficiaryRegistrationMock = mock(WrapperBeneficiaryRegistration.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperBeneficiaryRegistrationMock).when(inputMapperMock).fromJson("D", WrapperBeneficiaryRegistration.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperBeneficiaryRegistrationMock).getBenD();
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            BeneficiaryData beneficiaryData = new BeneficiaryData();
            beneficiaryData.setBeneficiaryRegID(1L);
            beneficiaryData.setBeneficiaryID("B");
            doReturn(beneficiaryData).when(registrarServiceImplMock).createBeneficiary(jsonObject);
            doReturn(1L).when(registrarServiceImplMock).createBeneficiaryDemographic(jsonObject, 1L);
            doReturn(1L).when(registrarServiceImplMock).createBeneficiaryPhoneMapping(jsonObject, 1L);
            doReturn(0).when(registrarServiceImplMock).createBenGovIdMapping(jsonObject, 1L);
            doReturn(1L).when(registrarServiceImplMock).createBeneficiaryDemographicAdditional(jsonObject, 1L);
            doReturn(1L).when(registrarServiceImplMock).createBeneficiaryImage(jsonObject, 1L);
            doReturn(0).when(commonNurseServiceImplMock).updateBeneficiaryStatus('R', 1L);
            //Act Statement(s)
            String result = target.createBeneficiary("D", "Authorization1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("D", WrapperBeneficiaryRegistration.class);
                verify(wrapperBeneficiaryRegistrationMock).getBenD();
                verify(registrarServiceImplMock).createBeneficiary(jsonObject);
                verify(registrarServiceImplMock).createBeneficiaryDemographic(jsonObject, 1L);
                verify(registrarServiceImplMock).createBeneficiaryPhoneMapping(jsonObject, 1L);
                verify(registrarServiceImplMock).createBenGovIdMapping(jsonObject, 1L);
                verify(registrarServiceImplMock).createBeneficiaryDemographicAdditional(jsonObject, 1L);
                verify(registrarServiceImplMock).createBeneficiaryImage(jsonObject, 1L);
                verify(commonNurseServiceImplMock).updateBeneficiaryStatus('R', 1L);
            });
        }
    }

    //Sapient generated method id: ${087ea1a0-4324-34a4-92da-6c37a7243de9}, hash: 475458F9CCCEF5416D68355D40F89BA4
    @Disabled()
    @Test()
    void createBeneficiaryWhenBenImageIDNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : false* (benData != null) : true* (benRegID > 0) : true* (benDemoID > 0) : true* (benPhonMapID > 0) : true* (benbenDemoOtherID > 0) : true* (benImageID > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperBeneficiaryRegistration wrapperBeneficiaryRegistrationMock = mock(WrapperBeneficiaryRegistration.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperBeneficiaryRegistrationMock).when(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperBeneficiaryRegistrationMock).getBenD();
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            BeneficiaryData beneficiaryData = new BeneficiaryData();
            beneficiaryData.setBeneficiaryRegID(1L);
            doReturn(beneficiaryData).when(registrarServiceImplMock).createBeneficiary(jsonObject);
            doReturn(1L).when(registrarServiceImplMock).createBeneficiaryDemographic(jsonObject, 1L);
            doReturn(1L).when(registrarServiceImplMock).createBeneficiaryPhoneMapping(jsonObject, 1L);
            doReturn(0).when(registrarServiceImplMock).createBenGovIdMapping(jsonObject, 1L);
            doReturn(1L).when(registrarServiceImplMock).createBeneficiaryDemographicAdditional(jsonObject, 1L);
            doReturn(-1L).when(registrarServiceImplMock).createBeneficiaryImage(jsonObject, 1L);
            //Act Statement(s)
            String result = target.createBeneficiary("<value>", "<value>");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":5000,\"status\":\"Failed with null at Fri Mar 22 11:58:34 IST 2024.Please try after some time. If error is still seen, contact your administrator.\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
                verify(wrapperBeneficiaryRegistrationMock).getBenD();
                verify(registrarServiceImplMock).createBeneficiary(jsonObject);
                verify(registrarServiceImplMock).createBeneficiaryDemographic(jsonObject, 1L);
                verify(registrarServiceImplMock).createBeneficiaryPhoneMapping(jsonObject, 1L);
                verify(registrarServiceImplMock).createBenGovIdMapping(jsonObject, 1L);
                verify(registrarServiceImplMock).createBeneficiaryDemographicAdditional(jsonObject, 1L);
                verify(registrarServiceImplMock).createBeneficiaryImage(jsonObject, 1L);
            });
        }
    }

    //Sapient generated method id: ${b33fa750-0837-38eb-bbec-9d11961f6e75}, hash: 7AC2029751D249B20097C56AC1A7329B
    @Disabled()
    @Test()
    void createBeneficiaryWhenBenDataGetBeneficiaryIDIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : false* (benData != null) : true* (benRegID > 0) : true* (benDemoID > 0) : true* (benPhonMapID > 0) : true* (benbenDemoOtherID > 0) : true* (benImageID > 0) : true* (benData.getBeneficiaryID() != null) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.createBeneficiary("{'name': 'John', 'age': 25, 'gender': 'male'}", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"status\":\"Failed with null at Fri Mar 22 11:58:34 IST 2024.Please try after some time. If error is still seen, contact your administrator.\"}")));
    }

    //Sapient generated method id: ${0755ac2f-e3ae-3082-8224-05c115d9dc70}, hash: AAB7A215947E6E20E15602065989239C
    @Test()
    void registrarBeneficaryRegistrationNewTest() throws Exception {
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_registerBeneficiary1").when(registrarServiceImplMock).registerBeneficiary("comingReq1", "Authorization1");
        //Act Statement(s)
        String result = target.registrarBeneficaryRegistrationNew("comingReq1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_registerBeneficiary1"));
            verify(registrarServiceImplMock).registerBeneficiary("comingReq1", "Authorization1");
        });
    }

    //Sapient generated method id: ${e33c85e0-3c35-3fb5-a63f-1715d0f4dc9b}, hash: 85C48DD39341C19E521BDB98C6814BB2
    @Disabled()
    @Test()
    void registrarBeneficaryRegistrationNewWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_registerBeneficiary1").when(registrarServiceImplMock).registerBeneficiary("comingReq1", "Authorization1");
        //Act Statement(s)
        String result = target.registrarBeneficaryRegistrationNew("comingReq1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error in registration; please contact administrator\",\"status\":\"Error in registration; please contact administrator\"}"));
            verify(registrarServiceImplMock).registerBeneficiary("comingReq1", "Authorization1");
        });
    }

    //Sapient generated method id: ${f3de1d89-d135-3273-b2e4-fc6ca1797cb5}, hash: B60110C913759D08669E3E7641083FDA
    @Test()
    void updateBeneficiaryWhenBenDNotHasBeneficiaryRegID() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : false* (!benD.has("beneficiaryRegID")) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperBeneficiaryRegistration wrapperBeneficiaryRegistrationMock = mock(WrapperBeneficiaryRegistration.class);
        JsonObject jsonObjectMock = mock(JsonObject.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperBeneficiaryRegistrationMock).when(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
            doReturn(jsonObjectMock).when(wrapperBeneficiaryRegistrationMock).getBenD();
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            String result = target.updateBeneficiary("<value>");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":0,\"errorMessage\":\"Data Not Sufficient...\",\"status\":\"Data Not Sufficient...\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
                verify(wrapperBeneficiaryRegistrationMock).getBenD();
            });
        }
    }

    //Sapient generated method id: ${b104076a-8797-3ac7-a34c-32a156160dfe}, hash: 19BE603A1A719FF764C6DA01BF357801
    @Disabled()
    @Test()
    void updateBeneficiaryWhenCaughtException() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : false* (!benD.has("beneficiaryRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperBeneficiaryRegistration wrapperBeneficiaryRegistrationMock = mock(WrapperBeneficiaryRegistration.class);
        JsonObject jsonObjectMock = mock(JsonObject.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperBeneficiaryRegistrationMock).when(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
            doReturn(jsonObjectMock).when(wrapperBeneficiaryRegistrationMock).getBenD();
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            //Act Statement(s)
            String result = target.updateBeneficiary("<value>");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":5000,\"status\":\"Failed with null at Fri Mar 22 11:58:37 IST 2024.Please try after some time. If error is still seen, contact your administrator.\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
                verify(wrapperBeneficiaryRegistrationMock).getBenD();
            });
        }
    }

    //Sapient generated method id: ${37bf126b-dd97-3e11-a9e2-ea61eb895251}, hash: C86D748A1F9347CDF3D8AAD30F6318C7
    @Disabled()
    @Test()
    void updateBeneficiaryWhenBenDGetBeneficiaryRegIDIsJsonNull() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : false* (!benD.has("beneficiaryRegID")) : false* (benData != 0) : true* (!benD.get("beneficiaryRegID").isJsonNull()) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperBeneficiaryRegistration wrapperBeneficiaryRegistrationMock = mock(WrapperBeneficiaryRegistration.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperBeneficiaryRegistrationMock).when(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperBeneficiaryRegistrationMock).getBenD();
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1).when(registrarServiceImplMock).updateBeneficiary(jsonObject);
            //Act Statement(s)
            String result = target.updateBeneficiary("<value>");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Something Went-Wrong\",\"status\":\"Something Went-Wrong\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
                verify(wrapperBeneficiaryRegistrationMock).getBenD();
                verify(registrarServiceImplMock).updateBeneficiary(jsonObject);
            });
        }
    }

    //Sapient generated method id: ${92eb02f0-f359-3082-ab7c-81fc745f0cd4}, hash: 5B4B4B654A2108866BAEF333A2EB1365
    @Disabled()
    @Test()
    void updateBeneficiaryWhenBenDGetBeneficiaryRegIDIsJsonNullAndCaughtException() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : false* (!benD.has("beneficiaryRegID")) : false* (benData != 0) : true* (!benD.get("beneficiaryRegID").isJsonNull()) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperBeneficiaryRegistration wrapperBeneficiaryRegistrationMock = mock(WrapperBeneficiaryRegistration.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperBeneficiaryRegistrationMock).when(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperBeneficiaryRegistrationMock).getBenD();
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1).when(registrarServiceImplMock).updateBeneficiary(jsonObject);
            //Act Statement(s)
            String result = target.updateBeneficiary("<value>");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":5000,\"status\":\"Failed with null at Fri Mar 22 11:58:43 IST 2024.Please try after some time. If error is still seen, contact your administrator.\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
                verify(wrapperBeneficiaryRegistrationMock).getBenD();
                verify(registrarServiceImplMock).updateBeneficiary(jsonObject);
            });
        }
    }

    //Sapient generated method id: ${34c915b4-c1b9-32dc-b527-bdf196a776a5}, hash: FD3345423091AF7336EA2F6B4DE56B94
    @Disabled()
    @Test()
    void updateBeneficiaryWhenBenImageUpdateResGreaterThanOrEqualsTo0() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : false* (!benD.has("beneficiaryRegID")) : false* (benData != 0) : true* (!benD.get("beneficiaryRegID").isJsonNull()) : true* (benRegID >= 0) : true* (benDemoUpdateRes >= 0) : true* (benPhonMapUpdateRes >= 0) : true* (benbenDemoOtherUpdateRes >= 0) : true* (benImageUpdateRes >= 0) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperBeneficiaryRegistration wrapperBeneficiaryRegistrationMock = mock(WrapperBeneficiaryRegistration.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperBeneficiaryRegistrationMock).when(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperBeneficiaryRegistrationMock).getBenD();
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(-1).when(registrarServiceImplMock).updateBeneficiary(jsonObject);
            doReturn(0).when(registrarServiceImplMock).updateBeneficiaryDemographic(jsonObject, 1L);
            doReturn(0).when(registrarServiceImplMock).updateBeneficiaryPhoneMapping(jsonObject, 1L);
            doReturn(0).when(registrarServiceImplMock).updateBenGovIdMapping(jsonObject, 1L);
            doReturn(0).when(registrarServiceImplMock).updateBeneficiaryDemographicAdditional(jsonObject, 1L);
            doReturn(0).when(registrarServiceImplMock).updateBeneficiaryImage(jsonObject, 1L);
            doReturn(0).when(commonNurseServiceImplMock).updateBeneficiaryStatus('R', 1L);
            //Act Statement(s)
            String result = target.updateBeneficiary("<value>");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"Beneficiary Details updated successfully!!!\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
                verify(wrapperBeneficiaryRegistrationMock).getBenD();
                verify(registrarServiceImplMock).updateBeneficiary(jsonObject);
                verify(registrarServiceImplMock).updateBeneficiaryDemographic(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBeneficiaryPhoneMapping(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBenGovIdMapping(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBeneficiaryDemographicAdditional(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBeneficiaryImage(jsonObject, 1L);
                verify(commonNurseServiceImplMock).updateBeneficiaryStatus('R', 1L);
            });
        }
    }

    //Sapient generated method id: ${06ad870d-eab4-3f65-ba13-3958115de616}, hash: 35956CCB6E1A33A29A4E283611E30456
    @Disabled()
    @Test()
    void updateBeneficiaryWhenBenImageUpdateResLessThan0() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : false* (!benD.has("beneficiaryRegID")) : false* (benData != 0) : true* (!benD.get("beneficiaryRegID").isJsonNull()) : true* (benRegID >= 0) : true* (benDemoUpdateRes >= 0) : true* (benPhonMapUpdateRes >= 0) : true* (benbenDemoOtherUpdateRes >= 0) : true* (benImageUpdateRes >= 0) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperBeneficiaryRegistration wrapperBeneficiaryRegistrationMock = mock(WrapperBeneficiaryRegistration.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperBeneficiaryRegistrationMock).when(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperBeneficiaryRegistrationMock).getBenD();
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(-1).when(registrarServiceImplMock).updateBeneficiary(jsonObject);
            doReturn(0).when(registrarServiceImplMock).updateBeneficiaryDemographic(jsonObject, 1L);
            doReturn(0).when(registrarServiceImplMock).updateBeneficiaryPhoneMapping(jsonObject, 1L);
            doReturn(0).when(registrarServiceImplMock).updateBenGovIdMapping(jsonObject, 1L);
            doReturn(0).when(registrarServiceImplMock).updateBeneficiaryDemographicAdditional(jsonObject, 1L);
            doReturn(-1).when(registrarServiceImplMock).updateBeneficiaryImage(jsonObject, 1L);
            //Act Statement(s)
            String result = target.updateBeneficiary("<value>");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Something Went-Wrong\",\"status\":\"Something Went-Wrong\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
                verify(wrapperBeneficiaryRegistrationMock).getBenD();
                verify(registrarServiceImplMock).updateBeneficiary(jsonObject);
                verify(registrarServiceImplMock).updateBeneficiaryDemographic(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBeneficiaryPhoneMapping(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBenGovIdMapping(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBeneficiaryDemographicAdditional(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBeneficiaryImage(jsonObject, 1L);
            });
        }
    }

    //Sapient generated method id: ${6d8fbfa9-45e0-3083-a123-f340690eaab6}, hash: 3BA4541A8ADE81A1EEDF96DF6317E524
    @Disabled()
    @Test()
    void updateBeneficiaryWhenBenImageUpdateResGreaterThanOrEqualsTo0AndCaughtException() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : false* (!benD.has("beneficiaryRegID")) : false* (benData != 0) : true* (!benD.get("beneficiaryRegID").isJsonNull()) : true* (benRegID >= 0) : true* (benDemoUpdateRes >= 0) : true* (benPhonMapUpdateRes >= 0) : true* (benbenDemoOtherUpdateRes >= 0) : true* (benImageUpdateRes >= 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperBeneficiaryRegistration wrapperBeneficiaryRegistrationMock = mock(WrapperBeneficiaryRegistration.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperBeneficiaryRegistrationMock).when(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperBeneficiaryRegistrationMock).getBenD();
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1).when(registrarServiceImplMock).updateBeneficiary(jsonObject);
            doReturn(1).when(registrarServiceImplMock).updateBeneficiaryDemographic(jsonObject, 1L);
            doReturn(1).when(registrarServiceImplMock).updateBeneficiaryPhoneMapping(jsonObject, 1L);
            doReturn(0).when(registrarServiceImplMock).updateBenGovIdMapping(jsonObject, 1L);
            doReturn(1).when(registrarServiceImplMock).updateBeneficiaryDemographicAdditional(jsonObject, 1L);
            doReturn(1).when(registrarServiceImplMock).updateBeneficiaryImage(jsonObject, 1L);
            doReturn(0).when(commonNurseServiceImplMock).updateBeneficiaryStatus('R', 1L);
            //Act Statement(s)
            String result = target.updateBeneficiary("<value>");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"Beneficiary Details updated successfully!!!\"},\"statusCode\":5000,\"status\":\"Failed with null at Fri Mar 22 11:58:47 IST 2024.Please try after some time. If error is still seen, contact your administrator.\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
                verify(wrapperBeneficiaryRegistrationMock).getBenD();
                verify(registrarServiceImplMock).updateBeneficiary(jsonObject);
                verify(registrarServiceImplMock).updateBeneficiaryDemographic(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBeneficiaryPhoneMapping(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBenGovIdMapping(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBeneficiaryDemographicAdditional(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBeneficiaryImage(jsonObject, 1L);
                verify(commonNurseServiceImplMock).updateBeneficiaryStatus('R', 1L);
            });
        }
    }

    //Sapient generated method id: ${9f7aea70-db87-3747-acb0-c18e4c621a67}, hash: 3330E72661A0DA43DFF44BE7E6D75E38
    @Disabled()
    @Test()
    void updateBeneficiaryWhenBenImageUpdateResLessThan0AndCaughtException() throws Exception {
        /* Branches:* (benD == null) : false* (benD.isJsonNull()) : false* (!benD.has("beneficiaryRegID")) : false* (benData != 0) : true* (!benD.get("beneficiaryRegID").isJsonNull()) : true* (benRegID >= 0) : true* (benDemoUpdateRes >= 0) : true* (benPhonMapUpdateRes >= 0) : true* (benbenDemoOtherUpdateRes >= 0) : true* (benImageUpdateRes >= 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        WrapperBeneficiaryRegistration wrapperBeneficiaryRegistrationMock = mock(WrapperBeneficiaryRegistration.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(wrapperBeneficiaryRegistrationMock).when(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
            JsonObject jsonObject = new JsonObject();
            doReturn(jsonObject).when(wrapperBeneficiaryRegistrationMock).getBenD();
            target = new RegistrarController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(-1).when(registrarServiceImplMock).updateBeneficiary(jsonObject);
            doReturn(0).when(registrarServiceImplMock).updateBeneficiaryDemographic(jsonObject, 1L);
            doReturn(0).when(registrarServiceImplMock).updateBeneficiaryPhoneMapping(jsonObject, 1L);
            doReturn(0).when(registrarServiceImplMock).updateBenGovIdMapping(jsonObject, 1L);
            doReturn(0).when(registrarServiceImplMock).updateBeneficiaryDemographicAdditional(jsonObject, 1L);
            doReturn(-1).when(registrarServiceImplMock).updateBeneficiaryImage(jsonObject, 1L);
            //Act Statement(s)
            String result = target.updateBeneficiary("<value>");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"statusCode\":5000,\"status\":\"Failed with null at Fri Mar 22 11:58:47 IST 2024.Please try after some time. If error is still seen, contact your administrator.\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("<value>", WrapperBeneficiaryRegistration.class);
                verify(wrapperBeneficiaryRegistrationMock).getBenD();
                verify(registrarServiceImplMock).updateBeneficiary(jsonObject);
                verify(registrarServiceImplMock).updateBeneficiaryDemographic(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBeneficiaryPhoneMapping(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBenGovIdMapping(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBeneficiaryDemographicAdditional(jsonObject, 1L);
                verify(registrarServiceImplMock).updateBeneficiaryImage(jsonObject, 1L);
            });
        }
    }

    //Sapient generated method id: ${72c36817-fc59-39d9-9dd2-1661468e2a2b}, hash: 4CD8B10A36065F35E6935294ADA12C49
    @Test()
    void createReVisitForBenToNurseWhenINotGreaterThan0() throws Exception {
        /* Branches:* (i > 0) : false*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1).when(registrarServiceImplMock).searchAndSubmitBeneficiaryToNurse("requestOBJ1");
        //Act Statement(s)
        String result = target.createReVisitForBenToNurse("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while moving beneficiary to nurse worklist\",\"status\":\"Error while moving beneficiary to nurse worklist\"}"));
            verify(registrarServiceImplMock).searchAndSubmitBeneficiaryToNurse("requestOBJ1");
        });
    }

    //Sapient generated method id: ${9b13c009-c4b4-386f-bde8-b5fae5d5f591}, hash: EFBE8A94120937DE6B6D5BD830530010
    @Test()
    void createReVisitForBenToNurseWhenIEquals1() throws Exception {
        /* Branches:* (i > 0) : true* (i == 1) : true*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(registrarServiceImplMock).searchAndSubmitBeneficiaryToNurse("requestOBJ1");
        //Act Statement(s)
        String result = target.createReVisitForBenToNurse("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Beneficiary moved to nurse worklist\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceImplMock).searchAndSubmitBeneficiaryToNurse("requestOBJ1");
        });
    }

    //Sapient generated method id: ${0091ceb7-bb67-35ad-b831-283ba49c3c56}, hash: 93B596968DE433E0030916E6065C02F3
    @Test()
    void createReVisitForBenToNurseWhenINotEquals1() throws Exception {
        /* Branches:* (i > 0) : true* (i == 1) : false*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(2).when(registrarServiceImplMock).searchAndSubmitBeneficiaryToNurse("requestOBJ1");
        //Act Statement(s)
        String result = target.createReVisitForBenToNurse("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Beneficiary already present in nurse worklist\",\"status\":\"Beneficiary already present in nurse worklist\"}"));
            verify(registrarServiceImplMock).searchAndSubmitBeneficiaryToNurse("requestOBJ1");
        });
    }

    //Sapient generated method id: ${092dc6b9-58b1-3516-a93c-b71929780256}, hash: D662D9F17EE88A8F41E30E86365FBFDA
    @Disabled()
    @Test()
    void createReVisitForBenToNurseWhenCaughtException() throws Exception {
        /* Branches:* (i > 0) : true* (i == 1) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(registrarServiceImplMock).searchAndSubmitBeneficiaryToNurse("requestOBJ1");
        //Act Statement(s)
        String result = target.createReVisitForBenToNurse("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Beneficiary moved to nurse worklist\"},\"statusCode\":5000,\"errorMessage\":\"Error while moving beneficiary to nurse worklist\",\"status\":\"Error while moving beneficiary to nurse worklist\"}"));
            verify(registrarServiceImplMock).searchAndSubmitBeneficiaryToNurse("requestOBJ1");
        });
    }

    //Sapient generated method id: ${d65f6332-a3b1-3173-a5c0-353e9df650c5}, hash: A3D8A37AC6FCE82A8308036CB4695BD1
    @Disabled()
    @Test()
    void createReVisitForBenToNurseWhenINotEquals1AndCaughtException() throws Exception {
        /* Branches:* (i > 0) : true* (i == 1) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(2).when(registrarServiceImplMock).searchAndSubmitBeneficiaryToNurse("requestOBJ1");
        //Act Statement(s)
        String result = target.createReVisitForBenToNurse("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while moving beneficiary to nurse worklist\",\"status\":\"Error while moving beneficiary to nurse worklist\"}"));
            verify(registrarServiceImplMock).searchAndSubmitBeneficiaryToNurse("requestOBJ1");
        });
    }

    //Sapient generated method id: ${8c68bc45-42cc-347d-b17a-b8449dd1583c}, hash: EF822FA457950BEE0481FBCBD3C48B70
    @Test()
    void beneficiaryUpdateWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(registrarServiceImplMock).updateBeneficiary("requestOBJ1", "Authorization1");
        //Act Statement(s)
        String result = target.beneficiaryUpdate("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while updating beneficiary details\",\"status\":\"Error while updating beneficiary details\"}"));
            verify(registrarServiceImplMock).updateBeneficiary("requestOBJ1", "Authorization1");
        });
    }

    //Sapient generated method id: ${289d9cab-290c-36e9-85b6-036dcdb3fd45}, hash: 1B4C64E856426D066990B95088129CAA
    @Test()
    void beneficiaryUpdateWhenSEquals1() throws Exception {
        /* Branches:* (s != null) : true* (s == 1) : true*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(registrarServiceImplMock).updateBeneficiary("requestOBJ1", "Authorization1");
        //Act Statement(s)
        String result = target.beneficiaryUpdate("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Beneficiary details updated successfully\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceImplMock).updateBeneficiary("requestOBJ1", "Authorization1");
        });
    }

    //Sapient generated method id: ${7978a323-0f72-3859-bc40-13fefff7cd58}, hash: 9FB7849AF67783392F7A076513F4820B
    @Test()
    void beneficiaryUpdateWhenSNotEquals1() throws Exception {
        /* Branches:* (s != null) : true* (s == 1) : false*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(2).when(registrarServiceImplMock).updateBeneficiary("requestOBJ1", "Authorization1");
        //Act Statement(s)
        String result = target.beneficiaryUpdate("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Beneficiary details updated successfully but already present in nurse work list\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceImplMock).updateBeneficiary("requestOBJ1", "Authorization1");
        });
    }

    //Sapient generated method id: ${a0e1b516-5ffd-3c81-ac2a-cb6612709624}, hash: 027598DDF1E669C5ABFA6163ECF99C82
    @Test()
    void beneficiaryUpdateWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exception = new Exception();
        doThrow(exception).when(registrarServiceImplMock).updateBeneficiary("requestOBJ1", "Authorization1");
        //Act Statement(s)
        String result = target.beneficiaryUpdate("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error in beneficiary details update\",\"status\":\"Error in beneficiary details update\"}"));
            verify(registrarServiceImplMock).updateBeneficiary("requestOBJ1", "Authorization1");
        });
    }

    //Sapient generated method id: ${fa968b51-b3b6-352c-8169-1c1bb13b267c}, hash: CBF24455B623BDC679FD12C33B39B4BD
    @Test()
    void beneficiaryUpdateWhenSEquals1AndCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (s == 1) : true* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exception = new Exception();
        doThrow(exception).when(registrarServiceImplMock).updateBeneficiary("requestOBJ1", "Authorization1");
        //Act Statement(s)
        String result = target.beneficiaryUpdate("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error in beneficiary details update\",\"status\":\"Error in beneficiary details update\"}"));
            verify(registrarServiceImplMock).updateBeneficiary("requestOBJ1", "Authorization1");
        });
    }

    //Sapient generated method id: ${acd4a538-9971-3b6f-9f0e-f2ba786a181f}, hash: 9946BA1F4F1374E3A6A83C883F88E324
    @Test()
    void beneficiaryUpdateWhenSNotEquals1AndCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (s == 1) : false* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Exception exception = new Exception();
        doThrow(exception).when(registrarServiceImplMock).updateBeneficiary("requestOBJ1", "Authorization1");
        //Act Statement(s)
        String result = target.beneficiaryUpdate("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error in beneficiary details update\",\"status\":\"Error in beneficiary details update\"}"));
            verify(registrarServiceImplMock).updateBeneficiary("requestOBJ1", "Authorization1");
        });
    }

    //Sapient generated method id: ${6ec50561-0519-3809-85c0-faa732f75f01}, hash: 8432640F571A5947B9E1E30E304B755E
    @Disabled()
    @Test()
    void masterDataForRegistrationWhenObjNotHasSpID() throws Exception {
        /* Branches:* (obj.has("spID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.masterDataForRegistration("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${6e054f56-50ed-3489-a740-1f762482f80c}, hash: 2884573F31A54178AD47DBE255618DDA
    @Disabled()
    @Test()
    void masterDataForRegistrationWhenObjGetIntSpIDGreaterThan0() throws Exception {
        /* Branches:* (obj.has("spID")) : true* (obj.getInt("spID") > 0) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(registrarServiceMasterDataImplMock).getRegMasterData();
        //Act Statement(s)
        String result = target.masterDataForRegistration("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(registrarServiceMasterDataImplMock).getRegMasterData();
        });
    }

    //Sapient generated method id: ${343b1970-8d96-325d-beee-32ce8dcf8238}, hash: 2F4AC95C815055D6BE82F5BB7B08364D
    @Disabled()
    @Test()
    void masterDataForRegistrationWhenObjGetIntSpIDNotGreaterThan0() throws Exception {
        /* Branches:* (obj.has("spID")) : true* (obj.getInt("spID") > 0) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.masterDataForRegistration("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid service point\",\"status\":\"Invalid service point\"}")));
    }

    //Sapient generated method id: ${7845f042-25f7-33ec-8325-c7a44631de33}, hash: F55985743CF923ABBC0F8B2A463AC9A0
    @Test()
    void masterDataForRegistrationWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("spID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.masterDataForRegistration("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting master data for registration\",\"status\":\"Error while getting master data for registration\"}")));
    }

    //Sapient generated method id: ${365f8ceb-5c67-3786-a273-90db0c215c85}, hash: 315F0A4E7A744B2596036C69FD839317
    @Disabled()
    @Test()
    void masterDataForRegistrationWhenObjGetIntSpIDGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (obj.has("spID")) : true* (obj.getInt("spID") > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(registrarServiceMasterDataImplMock).getRegMasterData();
        //Act Statement(s)
        String result = target.masterDataForRegistration("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting master data for registration\",\"status\":\"Error while getting master data for registration\"}"));
            verify(registrarServiceMasterDataImplMock).getRegMasterData();
        });
    }

    //Sapient generated method id: ${1726e988-496d-3f13-958f-942a7b237fbb}, hash: C61C478056D0D5ADB59B25836388E010
    @Test()
    void masterDataForRegistrationWhenObjGetIntSpIDNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (obj.has("spID")) : true* (obj.getInt("spID") > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new RegistrarController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.masterDataForRegistration("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting master data for registration\",\"status\":\"Error while getting master data for registration\"}")));
    }
}
