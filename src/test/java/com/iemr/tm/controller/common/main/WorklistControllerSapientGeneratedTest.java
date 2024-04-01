package com.iemr.tm.controller.common.main;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.data.benFlowStatus.BeneficiaryFlowStatus;
import org.mockito.MockitoAnnotations;
import org.json.JSONObject;
import com.iemr.tm.service.common.transaction.CommonDoctorServiceImpl;
import com.iemr.tm.service.common.transaction.CommonServiceImpl;
import com.iemr.tm.service.common.transaction.CommonNurseServiceImpl;
import org.mockito.MockedStatic;
import com.iemr.tm.utils.mapper.InputMapper;

import static org.mockito.ArgumentMatchers.any;
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
class WorklistControllerSapientGeneratedTest {

    private final CommonDoctorServiceImpl commonDoctorServiceImplMock = mock(CommonDoctorServiceImpl.class, "commonDoctorServiceImpl");

    private final CommonNurseServiceImpl commonNurseServiceImplMock = mock(CommonNurseServiceImpl.class, "commonNurseServiceImpl");

    private final CommonServiceImpl commonServiceImplMock = mock(CommonServiceImpl.class, "commonServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private WorklistController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${90ddc488-46fc-3818-b43d-0272a7928204}, hash: 5476A394F2363E57AF92D85F5B114C15
    @Test()
    void getDocWorkListNewWhenServiceIDIsNull() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (serviceID != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getDocWorkListNew((Integer) 2, (Integer) null, (Integer) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request, either ProviderServiceMapID or ServiceID is invalid\",\"status\":\"Invalid request, either ProviderServiceMapID or ServiceID is invalid\"}")));
    }

    //Sapient generated method id: ${0d137627-f385-32bc-981b-2e21a1ec4141}, hash: 967973B96D05014B81AEFBC861354EF1
    @Test()
    void getDocWorkListNewWhenSIsNotNull() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (serviceID != null) : true* (s != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonDoctorServiceImplMock).getDocWorkListNew(0, 0, 0);
        //Act Statement(s)
        String result = target.getDocWorkListNew(0, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonDoctorServiceImplMock).getDocWorkListNew(0, 0, 0);
        });
    }

    //Sapient generated method id: ${89203f7d-8bba-3d6f-a400-8539ebad1d11}, hash: B6F14D0A24DF80D95F83FE56C681B5F7
    @Disabled()
    @Test()
    void getDocWorkListNewWhenServiceIDIsNullAndCaughtException() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (serviceID != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getDocWorkListNew((Integer) 2, (Integer) null, (Integer) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting doctor worklist\",\"status\":\"Error while getting doctor worklist\"}")));
    }

    //Sapient generated method id: ${b4b6a86d-3b2b-323b-ae68-dd718576048c}, hash: 3AB3C9E40EC2D684934B259BAB5447BE
    @Disabled()
    @Test()
    void getDocWorkListNewWhenSIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (serviceID != null) : true* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonDoctorServiceImplMock).getDocWorkListNew(0, 0, 0);
        //Act Statement(s)
        String result = target.getDocWorkListNew(0, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting doctor worklist\",\"status\":\"Error while getting doctor worklist\"}"));
            verify(commonDoctorServiceImplMock).getDocWorkListNew(0, 0, 0);
        });
    }

    //Sapient generated method id: ${3297a0ea-8a6f-323a-9bb3-ad03d8e5d592}, hash: 66B380A1223D78AB35AF541940BA3C7C
    @Test()
    void getDocWorkListNewFutureScheduledForTMWhenServiceIDIsNull() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (serviceID != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getDocWorkListNewFutureScheduledForTM((Integer) 2, (Integer) null, (Integer) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request, either ProviderServiceMapID or ServiceID is invalid\",\"status\":\"Invalid request, either ProviderServiceMapID or ServiceID is invalid\"}")));
    }

    //Sapient generated method id: ${43be2b68-e1b6-33f1-90bb-5d2f5bdfa2fa}, hash: F212B36E2C9D7CA04DFE1CC3EE0DCC51
    @Test()
    void getDocWorkListNewFutureScheduledForTMWhenSIsNotNull() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (serviceID != null) : true* (s != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonDoctorServiceImplMock).getDocWorkListNewFutureScheduledForTM(0, 0, 0);
        //Act Statement(s)
        String result = target.getDocWorkListNewFutureScheduledForTM(0, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonDoctorServiceImplMock).getDocWorkListNewFutureScheduledForTM(0, 0, 0);
        });
    }

    //Sapient generated method id: ${76c49e85-21fb-3f8c-b5de-ee22ef5ca24c}, hash: E412AB9C5BF90874EC136DE5D71BB749
    @Disabled()
    @Test()
    void getDocWorkListNewFutureScheduledForTMWhenServiceIDIsNullAndCaughtException() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (serviceID != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getDocWorkListNewFutureScheduledForTM((Integer) 2, (Integer) null, (Integer) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting doctor worklist for future scheduled beneficiay\",\"status\":\"Error while getting doctor worklist for future scheduled beneficiay\"}")));
    }

    //Sapient generated method id: ${dc40a7fa-bc7f-38a1-b2b5-5b88f1e731fd}, hash: 8C3FA0FAFD5D2E4C04AC66782D5344E3
    @Disabled()
    @Test()
    void getDocWorkListNewFutureScheduledForTMWhenSIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (serviceID != null) : true* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonDoctorServiceImplMock).getDocWorkListNewFutureScheduledForTM(0, 0, 0);
        //Act Statement(s)
        String result = target.getDocWorkListNewFutureScheduledForTM(0, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting doctor worklist for future scheduled beneficiay\",\"status\":\"Error while getting doctor worklist for future scheduled beneficiay\"}"));
            verify(commonDoctorServiceImplMock).getDocWorkListNewFutureScheduledForTM(0, 0, 0);
        });
    }

    //Sapient generated method id: ${6cb28b9b-dcf1-3462-945b-551ef5ef9423}, hash: 30D793D3C41E46CE160DB5FB119336AD
    @Test()
    void getNurseWorkListNewWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getNurseWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getNurseWorkListNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonNurseServiceImplMock).getNurseWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${7a6623d1-100f-3661-967e-8ac0e83c8aa0}, hash: C217A7AB56C61EFF8C081748D4D5C4BF
    @Test()
    void getNurseWorkListNewWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getNurseWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getNurseWorkListNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting nurse worklist\",\"status\":\"Error while getting nurse worklist\"}"));
            verify(commonNurseServiceImplMock).getNurseWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${b0272ff1-79da-365e-a6f8-2f6002efaeda}, hash: 5D7E1E784A58FDFC996109D66FDFDB06
    @Disabled()
    @Test()
    void getNurseWorkListNewWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getNurseWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getNurseWorkListNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting nurse worklist\",\"status\":\"Error while getting nurse worklist\"}"));
            verify(commonNurseServiceImplMock).getNurseWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${eb10138c-0c7b-33c1-8b68-35d598c36f1d}, hash: 2AF43466A90CC768C7EA258D35623F22
    @Test()
    void getNurseWorkListNewWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getNurseWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getNurseWorkListNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting nurse worklist\",\"status\":\"Error while getting nurse worklist\"}"));
            verify(commonNurseServiceImplMock).getNurseWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${474ecec4-0164-322e-9b62-b8364597002d}, hash: 7214D52EF6357C6370E7C6FBEB585143
    @Test()
    void getNurseWorkListTcCurrentDateNewWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getNurseWorkListTcCurrentDate(0, 0);
        //Act Statement(s)
        String result = target.getNurseWorkListTcCurrentDateNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonNurseServiceImplMock).getNurseWorkListTcCurrentDate(0, 0);
        });
    }

    //Sapient generated method id: ${28cfdcf9-b4b3-3219-9faf-b378de57967b}, hash: 11751B239DD2D51222685246D7D2CACF
    @Test()
    void getNurseWorkListTcCurrentDateNewWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getNurseWorkListTcCurrentDate(0, 0);
        //Act Statement(s)
        String result = target.getNurseWorkListTcCurrentDateNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting nurse worklist\",\"status\":\"Error while getting nurse worklist\"}"));
            verify(commonNurseServiceImplMock).getNurseWorkListTcCurrentDate(0, 0);
        });
    }

    //Sapient generated method id: ${a33860ff-07f6-3c2d-be84-2d0b11e576e2}, hash: 2A74AF8107391215B1704312A99560DA
    @Disabled()
    @Test()
    void getNurseWorkListTcCurrentDateNewWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getNurseWorkListTcCurrentDate(0, 0);
        //Act Statement(s)
        String result = target.getNurseWorkListTcCurrentDateNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting nurse worklist\",\"status\":\"Error while getting nurse worklist\"}"));
            verify(commonNurseServiceImplMock).getNurseWorkListTcCurrentDate(0, 0);
        });
    }

    //Sapient generated method id: ${ed08650e-01a0-3716-975b-bc27928a70cc}, hash: 2B5CE8F4101F802EB8C73458E611EE05
    @Test()
    void getNurseWorkListTcCurrentDateNewWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getNurseWorkListTcCurrentDate(0, 0);
        //Act Statement(s)
        String result = target.getNurseWorkListTcCurrentDateNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting nurse worklist\",\"status\":\"Error while getting nurse worklist\"}"));
            verify(commonNurseServiceImplMock).getNurseWorkListTcCurrentDate(0, 0);
        });
    }

    //Sapient generated method id: ${4821abd0-a4e8-34ab-bc23-b5b3a0abf0e3}, hash: 0EC5356B6786B1C643BDF9EC8DA8C244
    @Test()
    void getNurseWorkListTcFutureDateNewWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getNurseWorkListTcFutureDate(0, 0);
        //Act Statement(s)
        String result = target.getNurseWorkListTcFutureDateNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonNurseServiceImplMock).getNurseWorkListTcFutureDate(0, 0);
        });
    }

    //Sapient generated method id: ${f50f7d83-b856-345b-9e54-735d5037bd4b}, hash: 7426CF21BE1F59F87AE65995379636F9
    @Test()
    void getNurseWorkListTcFutureDateNewWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getNurseWorkListTcFutureDate(0, 0);
        //Act Statement(s)
        String result = target.getNurseWorkListTcFutureDateNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting nurse worklist\",\"status\":\"Error while getting nurse worklist\"}"));
            verify(commonNurseServiceImplMock).getNurseWorkListTcFutureDate(0, 0);
        });
    }

    //Sapient generated method id: ${c24f7d6a-0b7d-3ca5-8db5-c37e9b562028}, hash: 5FBF2CE7B42B7A9E33E6F292CD70F57F
    @Disabled()
    @Test()
    void getNurseWorkListTcFutureDateNewWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getNurseWorkListTcFutureDate(0, 0);
        //Act Statement(s)
        String result = target.getNurseWorkListTcFutureDateNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting nurse worklist\",\"status\":\"Error while getting nurse worklist\"}"));
            verify(commonNurseServiceImplMock).getNurseWorkListTcFutureDate(0, 0);
        });
    }

    //Sapient generated method id: ${5efa7d65-c3ce-37ae-aca0-0b0782021dd5}, hash: D74690F179B41D9DE4248C599E68DBFA
    @Test()
    void getNurseWorkListTcFutureDateNewWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getNurseWorkListTcFutureDate(0, 0);
        //Act Statement(s)
        String result = target.getNurseWorkListTcFutureDateNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting nurse worklist\",\"status\":\"Error while getting nurse worklist\"}"));
            verify(commonNurseServiceImplMock).getNurseWorkListTcFutureDate(0, 0);
        });
    }

    //Sapient generated method id: ${c8c95a73-c66e-3619-b326-b881fd00c4ec}, hash: DEDFA19EF5FE011B2FA595099F086B23
    @Disabled()
    @Test()
    void getDoctorPreviousSignificantFindingsWhenObjGetBeneficiaryRegIDIsNull() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("beneficiaryRegID")) : true* (obj.get("beneficiaryRegID") != null) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getDoctorPreviousSignificantFindings("comingRequest1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid data!\",\"status\":\"Invalid data!\"}")));
    }

    //Sapient generated method id: ${b50bf7e5-6679-3127-ac86-515a08795312}, hash: 741AC99CB2C6BA50AC33BB3844867C99
    @Disabled()
    @Test()
    void getDoctorPreviousSignificantFindingsWhenSIsNotNull() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("beneficiaryRegID")) : true* (obj.get("beneficiaryRegID") != null) : true* (s != null) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonDoctorServiceImplMock).fetchBenPreviousSignificantFindings(0L);
        //Act Statement(s)
        String result = target.getDoctorPreviousSignificantFindings("comingRequest1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonDoctorServiceImplMock).fetchBenPreviousSignificantFindings(0L);
        });
    }

    //Sapient generated method id: ${1c95d1b7-fe7b-3b1b-926e-9de0cb1eda1c}, hash: 6DC3D90FB7D8F0E4E6CF740557885F22
    @Disabled()
    @Test()
    void getDoctorPreviousSignificantFindingsWhenSIsNull() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("beneficiaryRegID")) : true* (obj.get("beneficiaryRegID") != null) : true* (s != null) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonDoctorServiceImplMock).fetchBenPreviousSignificantFindings(1L);
        //Act Statement(s)
        String result = target.getDoctorPreviousSignificantFindings("comingRequest1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting previous significant findings\",\"status\":\"Error while getting previous significant findings\"}"));
            verify(commonDoctorServiceImplMock).fetchBenPreviousSignificantFindings(1L);
        });
    }

    //Sapient generated method id: ${fd4900f1-651e-388c-90e1-3511c9e8c432}, hash: 6FDC3D1927B0F3B32203D1D60071A938
    @Test()
    void getDoctorPreviousSignificantFindingsWhenObjGetBeneficiaryRegIDIsNullAndCaughtException() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("beneficiaryRegID")) : true* (obj.get("beneficiaryRegID") != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getDoctorPreviousSignificantFindings("comingRequest1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting previous significant findings\",\"status\":\"Error while getting previous significant findings\"}")));
    }

    //Sapient generated method id: ${a940fdfa-f07d-3f44-a8d7-b3c637f34cf2}, hash: E7D824208ED6831F5ACD7223027B8565
    @Disabled()
    @Test()
    void getDoctorPreviousSignificantFindingsWhenSIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("beneficiaryRegID")) : true* (obj.get("beneficiaryRegID") != null) : true* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonDoctorServiceImplMock).fetchBenPreviousSignificantFindings(0L);
        //Act Statement(s)
        String result = target.getDoctorPreviousSignificantFindings("comingRequest1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting previous significant findings\",\"status\":\"Error while getting previous significant findings\"}"));
            verify(commonDoctorServiceImplMock).fetchBenPreviousSignificantFindings(0L);
        });
    }

    //Sapient generated method id: ${5db959a3-3fbf-34f5-837c-8fafff4a857b}, hash: BA0C6CFA3FD503AB092DB4C34CA0593F
    @Disabled()
    @Test()
    void getDoctorPreviousSignificantFindingsWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (obj != null) : true* (obj.has("beneficiaryRegID")) : true* (obj.get("beneficiaryRegID") != null) : true* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonDoctorServiceImplMock).fetchBenPreviousSignificantFindings(1L);
        //Act Statement(s)
        String result = target.getDoctorPreviousSignificantFindings("comingRequest1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting previous significant findings\",\"status\":\"Error while getting previous significant findings\"}"));
            verify(commonDoctorServiceImplMock).fetchBenPreviousSignificantFindings(1L);
        });
    }

    //Sapient generated method id: ${077780e0-be3b-3b3a-99d7-f8744c26469c}, hash: 24CB938AF477D388134D1AC38FED4D51
    @Test()
    void getLabWorkListNewWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getLabWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getLabWorkListNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonNurseServiceImplMock).getLabWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${b024cfc3-f622-3e30-b87a-963f1010548d}, hash: 89F4740635F275829F5D09B995B70E0D
    @Test()
    void getLabWorkListNewWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getLabWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getLabWorkListNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting lab technician worklist\",\"status\":\"Error while getting lab technician worklist\"}"));
            verify(commonNurseServiceImplMock).getLabWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${ff8f108a-df5d-38ec-a34f-3377c985531f}, hash: 7A804AF273C506BDC0B546FBF746B47F
    @Disabled()
    @Test()
    void getLabWorkListNewWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getLabWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getLabWorkListNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting lab technician worklist\",\"status\":\"Error while getting lab technician worklist\"}"));
            verify(commonNurseServiceImplMock).getLabWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${f2b5a5b3-4c96-351d-9f4d-ba99dc6fccd1}, hash: 4A35974CFE1C63013D8FEAA36E7DC898
    @Test()
    void getLabWorkListNewWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getLabWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getLabWorkListNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting lab technician worklist\",\"status\":\"Error while getting lab technician worklist\"}"));
            verify(commonNurseServiceImplMock).getLabWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${aa7c87aa-e640-380b-a81f-e1459502601c}, hash: 7F1BC0180BB6C7A4961DE136C0D26AD0
    @Test()
    void getRadiologistWorklistNewWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getRadiologistWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getRadiologistWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonNurseServiceImplMock).getRadiologistWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${2b05050d-9e0c-3d7c-8fef-ed93b38d0929}, hash: 312C0CCB1548C66C6441DE987CF0570D
    @Test()
    void getRadiologistWorklistNewWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getRadiologistWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getRadiologistWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting radiologist worklist\",\"status\":\"Error while getting radiologist worklist\"}"));
            verify(commonNurseServiceImplMock).getRadiologistWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${94a8295d-1a10-3ca2-b925-ebc64967b0f1}, hash: 973C3531D9E90007F376E63F3163CAA4
    @Disabled()
    @Test()
    void getRadiologistWorklistNewWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getRadiologistWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getRadiologistWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting radiologist worklist\",\"status\":\"Error while getting radiologist worklist\"}"));
            verify(commonNurseServiceImplMock).getRadiologistWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${c849a53d-79d3-391a-9c41-369ca49a70dc}, hash: 756B5C97F17834A855A38B84C72E16E0
    @Test()
    void getRadiologistWorklistNewWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getRadiologistWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getRadiologistWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting radiologist worklist\",\"status\":\"Error while getting radiologist worklist\"}"));
            verify(commonNurseServiceImplMock).getRadiologistWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${57eb5f44-4686-3e57-966d-6f33839dae1e}, hash: 5971DF45B06439322126C2A337974437
    @Test()
    void getOncologistWorklistNewWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getOncologistWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getOncologistWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonNurseServiceImplMock).getOncologistWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${ac28f727-1b9d-3fbd-a54f-0030c7772d7e}, hash: 4B2E74BB4BF0F159164AA66A23F5E837
    @Test()
    void getOncologistWorklistNewWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getOncologistWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getOncologistWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting oncologist worklist\",\"status\":\"Error while getting oncologist worklist\"}"));
            verify(commonNurseServiceImplMock).getOncologistWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${f7ad5cbc-0ad0-3c4d-9132-4b96c7e2d204}, hash: 816180C3DF0D98376C8C51B0EC419A2D
    @Disabled()
    @Test()
    void getOncologistWorklistNewWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getOncologistWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getOncologistWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting oncologist worklist\",\"status\":\"Error while getting oncologist worklist\"}"));
            verify(commonNurseServiceImplMock).getOncologistWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${713f1be1-24cc-3e4c-b38f-922bf8dc55fa}, hash: 753DABE89401547AB755F04FE46F6F7B
    @Test()
    void getOncologistWorklistNewWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getOncologistWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getOncologistWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting oncologist worklist\",\"status\":\"Error while getting oncologist worklist\"}"));
            verify(commonNurseServiceImplMock).getOncologistWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${79614d2b-cf6b-34c7-83a7-da00d3e25d00}, hash: 10167D2208D0D2DDFA2BE714EB916D22
    @Test()
    void getPharmaWorklistNewWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getPharmaWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getPharmaWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonNurseServiceImplMock).getPharmaWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${eb02e889-e1ea-36dc-a332-53e85540ac5d}, hash: BACAEEBBC29287174B754E9360C8EBC3
    @Test()
    void getPharmaWorklistNewWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getPharmaWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getPharmaWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting pharma worklist\",\"status\":\"Error while getting pharma worklist\"}"));
            verify(commonNurseServiceImplMock).getPharmaWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${80b51742-06b7-3999-808c-f01fa5d2639c}, hash: A8921506DB2AA97136DA3AEB597F2D00
    @Disabled()
    @Test()
    void getPharmaWorklistNewWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getPharmaWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getPharmaWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting pharma worklist\",\"status\":\"Error while getting pharma worklist\"}"));
            verify(commonNurseServiceImplMock).getPharmaWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${6551174c-dea9-30ab-8666-d356ec919f08}, hash: 34547D0C753E54167C3BDC98AD7DF398
    @Test()
    void getPharmaWorklistNewWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getPharmaWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getPharmaWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting pharma worklist\",\"status\":\"Error while getting pharma worklist\"}"));
            verify(commonNurseServiceImplMock).getPharmaWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${0026db0f-f476-3020-b136-56ba4ba3ebfa}, hash: 4AA504CBDEC31D3DFD066944C13C2E0F
    @Test()
    void getCasesheetPrintDataWhenComingReqIsNotNull() throws Exception {
        /* Branches:* (comingReq != null) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BeneficiaryFlowStatus beneficiaryFlowStatusMock = mock(BeneficiaryFlowStatus.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(beneficiaryFlowStatusMock).when(inputMapperMock).fromJson("comingReq1", BeneficiaryFlowStatus.class);
            target = new WorklistController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("A").when(commonServiceImplMock).getCaseSheetPrintDataForBeneficiary(beneficiaryFlowStatusMock, "Authorization1");
            //Act Statement(s)
            String result = target.getCasesheetPrintData("comingReq1", "Authorization1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("comingReq1", BeneficiaryFlowStatus.class);
                verify(commonServiceImplMock).getCaseSheetPrintDataForBeneficiary(beneficiaryFlowStatusMock, "Authorization1");
            });
        }
    }

    //Sapient generated method id: ${2583f4ba-9abd-3ac5-a82d-90ff13bfc19d}, hash: 030CAC3BB08289A3B36A412D38183C03
    @Test()
    void getCasesheetPrintDataWhenComingReqIsNull() throws Exception {
        /* Branches:* (comingReq != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getCasesheetPrintData((String) null, "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${9c354bc4-c904-3c6f-a186-91cc925ad910}, hash: 8303B53E8C5DDFA10547EAECFBB7DE27
    @Test()
    void getCasesheetPrintDataWhenCaughtException() throws Exception {
        /* Branches:* (comingReq != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BeneficiaryFlowStatus beneficiaryFlowStatusMock = mock(BeneficiaryFlowStatus.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(beneficiaryFlowStatusMock).when(inputMapperMock).fromJson("comingReq1", BeneficiaryFlowStatus.class);
            target = new WorklistController();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn("A").when(commonServiceImplMock).getCaseSheetPrintDataForBeneficiary(beneficiaryFlowStatusMock, "Authorization1");
            //Act Statement(s)
            String result = target.getCasesheetPrintData("comingReq1", "Authorization1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("comingReq1", BeneficiaryFlowStatus.class);
                verify(commonServiceImplMock).getCaseSheetPrintDataForBeneficiary(beneficiaryFlowStatusMock, "Authorization1");
            });
        }
    }

    //Sapient generated method id: ${2c74de57-9bcd-312d-afab-c32c4c99b083}, hash: BDB7B2BA55CF72B57238D60593A99A5E
    @Test()
    void getCasesheetPrintDataWhenComingReqIsNullAndCaughtException() throws Exception {
        /* Branches:* (comingReq != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getCasesheetPrintData((String) null, "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${ad13b8d9-cc14-3b6d-9d1c-d0877b97062e}, hash: BEEF9620618AEA58D9BD438389ED9BFD
    @Disabled()
    @Test()
    void getBenPastHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenPastHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenPastHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getBenPastHistoryData(0L);
        });
    }

    //Sapient generated method id: ${bdcd5e75-e155-3756-8551-ff2acc21d304}, hash: 2A41A78DA160F61D2474C4147550A24F
    @Disabled()
    @Test()
    void getBenPastHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenPastHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${66a5bee3-f685-315a-90b6-0dadb0c153f7}, hash: 69E1AAF2DA102DE20CFBB2569AD2BA5E
    @Disabled()
    @Test()
    void getBenPastHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenPastHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenPastHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting illness and surgery history\",\"status\":\"Error while getting illness and surgery history\"}"));
            verify(commonServiceImplMock).getBenPastHistoryData(0L);
        });
    }

    //Sapient generated method id: ${87a6438d-4454-3379-bbaf-5754abf2776a}, hash: 0DCAE13FA60FC2E691452015636A18C9
    @Test()
    void getBenPastHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenPastHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting illness and surgery history\",\"status\":\"Error while getting illness and surgery history\"}")));
    }

    //Sapient generated method id: ${f68c7030-5e7e-3d98-a7e3-8b1021fb5782}, hash: 440710B3C8CE5CD5662269071E9EC31A
    @Disabled()
    @Test()
    void getBenTobaccoHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getPersonalTobaccoHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenTobaccoHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getPersonalTobaccoHistoryData(0L);
        });
    }

    //Sapient generated method id: ${e1559666-f254-3095-bc98-74125e4a4231}, hash: 562A53CB7A9F1CC48A577877E14E7A76
    @Disabled()
    @Test()
    void getBenTobaccoHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenTobaccoHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${61ac5f77-4fb6-3f22-9492-ce98fd568d11}, hash: 85FB3C280DD6A2837DDE31CB4E48D108
    @Disabled()
    @Test()
    void getBenTobaccoHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getPersonalTobaccoHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenTobaccoHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting tobacco history\",\"status\":\"Error while getting tobacco history\"}"));
            verify(commonServiceImplMock).getPersonalTobaccoHistoryData(0L);
        });
    }

    //Sapient generated method id: ${63f76010-2252-3382-a178-229027f17781}, hash: 91F1A47481F121C18445A9F5C2362B6D
    @Test()
    void getBenTobaccoHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenTobaccoHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting tobacco history\",\"status\":\"Error while getting tobacco history\"}")));
    }

    //Sapient generated method id: ${388036c3-fff1-38c4-ad50-6877f4214e48}, hash: F94A1421E7F8E36AE9F3E15C316DBE1E
    @Disabled()
    @Test()
    void getBenAlcoholHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getPersonalAlcoholHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenAlcoholHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getPersonalAlcoholHistoryData(0L);
        });
    }

    //Sapient generated method id: ${2faf545b-2a4c-3e0e-b3f0-20713ae6e0e4}, hash: 097CFEA77D2A01F9C1EB6D7D22F00232
    @Disabled()
    @Test()
    void getBenAlcoholHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenAlcoholHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${8d2f879b-b59a-3fc1-a76b-81dc67ad6d33}, hash: 238CC8BA883FD34EE6F95B6AF2C8ECCA
    @Disabled()
    @Test()
    void getBenAlcoholHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getPersonalAlcoholHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenAlcoholHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting alcohol history\",\"status\":\"Error while getting alcohol history\"}"));
            verify(commonServiceImplMock).getPersonalAlcoholHistoryData(0L);
        });
    }

    //Sapient generated method id: ${cfb9a41a-df39-38a4-b0bc-e2e9dd48f295}, hash: 5200B4E4F8E76FD31BE75A538A32EB46
    @Test()
    void getBenAlcoholHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenAlcoholHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting alcohol history\",\"status\":\"Error while getting alcohol history\"}")));
    }

    //Sapient generated method id: ${62e59dda-cb48-3a17-ba04-cca177363c11}, hash: 14058C47EAF88CAA63ABC7B16FB8D6FA
    @Disabled()
    @Test()
    void getBenANCAllergyHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getPersonalAllergyHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenANCAllergyHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getPersonalAllergyHistoryData(0L);
        });
    }

    //Sapient generated method id: ${198402ff-ca44-37b1-8e6e-fd9f99d58950}, hash: B94CCEF50DF2A9298F1C0DC0BC37A4FD
    @Disabled()
    @Test()
    void getBenANCAllergyHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenANCAllergyHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${975b888a-777a-3dbf-b2fd-6d35ed1ddb71}, hash: C19631EFA766054E9748E2B5403E3E08
    @Disabled()
    @Test()
    void getBenANCAllergyHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getPersonalAllergyHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenANCAllergyHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting allergy history\",\"status\":\"Error while getting allergy history\"}"));
            verify(commonServiceImplMock).getPersonalAllergyHistoryData(0L);
        });
    }

    //Sapient generated method id: ${4fc9cec8-b080-3406-b903-bb3b48edcc06}, hash: 6FDB292D7FEC7CB5FEB975758DF9997F
    @Test()
    void getBenANCAllergyHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenANCAllergyHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting allergy history\",\"status\":\"Error while getting allergy history\"}")));
    }

    //Sapient generated method id: ${272ef5b5-fd4a-37c6-8b1d-08ac00dfb70d}, hash: 45351BF508B782EA17F9217D0ABD6724
    @Disabled()
    @Test()
    void getBenMedicationHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getMedicationHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenMedicationHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getMedicationHistoryData(0L);
        });
    }

    //Sapient generated method id: ${f4dc2f03-f936-36fd-90b4-8968ac203fb4}, hash: 65B70AB9ECFFE3464F5CD9041184D6BE
    @Disabled()
    @Test()
    void getBenMedicationHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenMedicationHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${0896865a-5304-3600-9da1-56dc9fcaeb05}, hash: 5DF4AFAEF2D49B534521CD022AEFF7C2
    @Disabled()
    @Test()
    void getBenMedicationHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getMedicationHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenMedicationHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting medication history\",\"status\":\"Error while getting medication history\"}"));
            verify(commonServiceImplMock).getMedicationHistoryData(0L);
        });
    }

    //Sapient generated method id: ${a0c345d1-a513-3a6e-a560-67380e4206e0}, hash: E54C8EA5F3CE3526A1BBCC7209470272
    @Test()
    void getBenMedicationHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenMedicationHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting medication history\",\"status\":\"Error while getting medication history\"}")));
    }

    //Sapient generated method id: ${2443c0ee-10b7-3f47-98c5-cea2d2b7e4f8}, hash: 9C68052E2F2923A82279B7A1369D193D
    @Disabled()
    @Test()
    void getBenFamilyHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getFamilyHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenFamilyHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getFamilyHistoryData(0L);
        });
    }

    //Sapient generated method id: ${930ef167-75d7-3589-ab7a-eee116e44081}, hash: 84057A6ABAA02711A3F77F42C5C7188A
    @Disabled()
    @Test()
    void getBenFamilyHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenFamilyHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${30c01996-109f-30e2-b9b2-619d42953dd2}, hash: 245AFF62500B61B4F9B9E3F4FB72E908
    @Disabled()
    @Test()
    void getBenFamilyHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getFamilyHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenFamilyHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting family history\",\"status\":\"Error while getting family history\"}"));
            verify(commonServiceImplMock).getFamilyHistoryData(0L);
        });
    }

    //Sapient generated method id: ${c5d50bee-2e79-3ae9-8133-32a83ff0cdc2}, hash: 9FB395DE57675E07EE9B62E9989B3719
    @Test()
    void getBenFamilyHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenFamilyHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting family history\",\"status\":\"Error while getting family history\"}")));
    }

    //Sapient generated method id: ${c0b5130f-b68b-305b-b8e1-f4517a276aea}, hash: B969465A34B3AD8CAC91AAFF451B71DF
    @Disabled()
    @Test()
    void getBenMenstrualHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getMenstrualHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenMenstrualHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getMenstrualHistoryData(0L);
        });
    }

    //Sapient generated method id: ${36239193-fde5-313d-9b86-7d5274eec61f}, hash: 439B480BA0B3D8A3AB2CE58395DDD5FB
    @Disabled()
    @Test()
    void getBenMenstrualHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenMenstrualHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${e643cdf2-15c9-3bc8-9417-fdaeed8a3c4c}, hash: CAC06C237FB4CE60D5FF18E40B27A39F
    @Disabled()
    @Test()
    void getBenMenstrualHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getMenstrualHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenMenstrualHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting menstrual history\",\"status\":\"Error while getting menstrual history\"}"));
            verify(commonServiceImplMock).getMenstrualHistoryData(0L);
        });
    }

    //Sapient generated method id: ${5589d803-f73a-3dd4-8477-03c8a97b6ce9}, hash: 705AF9F7492023D52967BF2D90415210
    @Test()
    void getBenMenstrualHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenMenstrualHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting menstrual history\",\"status\":\"Error while getting menstrual history\"}")));
    }

    //Sapient generated method id: ${f25b1658-9d1f-37d5-a6e3-f99e3d6e8613}, hash: 0A8EA600BEA36608A04F51C3AE25A8D0
    @Disabled()
    @Test()
    void getBenPastObstetricHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getObstetricHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenPastObstetricHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getObstetricHistoryData(0L);
        });
    }

    //Sapient generated method id: ${724dd55f-f387-30e2-bf44-b1c4670024ad}, hash: 40332F06E9179F44FEB333EDADFF4C7D
    @Disabled()
    @Test()
    void getBenPastObstetricHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenPastObstetricHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${c1396acd-ec79-3f8c-a234-a43df275a72e}, hash: 6EC48EF3F5621DAEE04605B93DD6BF09
    @Disabled()
    @Test()
    void getBenPastObstetricHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getObstetricHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenPastObstetricHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting obstetric history\",\"status\":\"Error while getting obstetric history\"}"));
            verify(commonServiceImplMock).getObstetricHistoryData(0L);
        });
    }

    //Sapient generated method id: ${3c3a5645-4c7a-36d0-b56f-4b6817bfe8c8}, hash: 605F8C583D35C80DDCAFE7D6EE8974C6
    @Test()
    void getBenPastObstetricHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenPastObstetricHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting obstetric history\",\"status\":\"Error while getting obstetric history\"}")));
    }

    //Sapient generated method id: ${2418d27f-84c8-3972-94bf-e07fb3dd9ca9}, hash: 7BCEA1FE510AE46F5279679B3E5E6D9B
    @Disabled()
    @Test()
    void getBenANCComorbidityConditionHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getComorbidHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenANCComorbidityConditionHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getComorbidHistoryData(0L);
        });
    }

    //Sapient generated method id: ${cc012057-7d5e-37a9-8f38-aea5f75b8d97}, hash: 865494C223AE6DB52EF26C751FB7B0FB
    @Disabled()
    @Test()
    void getBenANCComorbidityConditionHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenANCComorbidityConditionHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${c3dc82f9-4ab8-3db9-80fe-b62e299536a9}, hash: 57E417B45463F3CAE389940FEF3C6D71
    @Disabled()
    @Test()
    void getBenANCComorbidityConditionHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getComorbidHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenANCComorbidityConditionHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting comodbidity history\",\"status\":\"Error while getting comodbidity history\"}"));
            verify(commonServiceImplMock).getComorbidHistoryData(0L);
        });
    }

    //Sapient generated method id: ${2a3b42c5-2f94-3040-bcf8-349000d9e3f4}, hash: 3EBA750BC4BFE2976204176FEC03490D
    @Test()
    void getBenANCComorbidityConditionHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenANCComorbidityConditionHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting comodbidity history\",\"status\":\"Error while getting comodbidity history\"}")));
    }

    //Sapient generated method id: ${8b6de3e0-c173-3a39-925b-aebb7e48041f}, hash: 003EF636652D71EE1478DA6EE9A76892
    @Disabled()
    @Test()
    void getBenOptionalVaccineHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getChildVaccineHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenOptionalVaccineHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getChildVaccineHistoryData(0L);
        });
    }

    //Sapient generated method id: ${92748ce1-2ff5-34a2-b0b7-e3a9785f3bc9}, hash: 48245EDF9B569B6CD81B8C23177BD4E5
    @Disabled()
    @Test()
    void getBenOptionalVaccineHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenOptionalVaccineHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${2dd40d1f-fa99-3d44-b24d-cb77ac5f0bd1}, hash: E69864E7ADA63363535D7CF13087B8AE
    @Disabled()
    @Test()
    void getBenOptionalVaccineHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getChildVaccineHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenOptionalVaccineHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting optional vaccination history\",\"status\":\"Error while getting optional vaccination history\"}"));
            verify(commonServiceImplMock).getChildVaccineHistoryData(0L);
        });
    }

    //Sapient generated method id: ${539b2f7d-4fd9-3562-99fe-b379963e3947}, hash: 5F41A29F6723C01103EACECF206D5422
    @Test()
    void getBenOptionalVaccineHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenOptionalVaccineHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting optional vaccination history\",\"status\":\"Error while getting optional vaccination history\"}")));
    }

    //Sapient generated method id: ${a7c86b48-b6d8-3464-8c5c-2f6c7e51134d}, hash: EB73B75BE231B5DAD46EA1E41C1D86E6
    @Disabled()
    @Test()
    void getBenImmunizationHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getImmunizationHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenImmunizationHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getImmunizationHistoryData(0L);
        });
    }

    //Sapient generated method id: ${ffd3f591-69fe-31e6-bad1-2a960ac025aa}, hash: B46410F05B18759845E080411B96ABB0
    @Disabled()
    @Test()
    void getBenImmunizationHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenImmunizationHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${747b4d96-4c6e-37a6-a80e-43c3defa39ad}, hash: B3E9D1DC0EF81456605C23E40E7A6E35
    @Disabled()
    @Test()
    void getBenImmunizationHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getImmunizationHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenImmunizationHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting child vaccine(immunization) history\",\"status\":\"Error while getting child vaccine(immunization) history\"}"));
            verify(commonServiceImplMock).getImmunizationHistoryData(0L);
        });
    }

    //Sapient generated method id: ${d3681003-43dd-3fe1-95c3-c718b42765b7}, hash: A6DA1C68E177C1FFD7FB4A595AF7B8C1
    @Test()
    void getBenImmunizationHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenImmunizationHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting child vaccine(immunization) history\",\"status\":\"Error while getting child vaccine(immunization) history\"}")));
    }

    //Sapient generated method id: ${1b20653d-b87b-3455-9250-a5777004712d}, hash: DB0767497DCED9828F7CB0AD6D593C21
    @Disabled()
    @Test()
    void getBenPerinatalHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenPerinatalHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenPerinatalHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getBenPerinatalHistoryData(0L);
        });
    }

    //Sapient generated method id: ${cc0ee344-176e-3163-b83b-24fd991fadd8}, hash: A0AB4E4393DF453393F0F6C87B3D27CE
    @Disabled()
    @Test()
    void getBenPerinatalHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenPerinatalHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${95f0f35e-bd8f-3e00-b66f-9eb48e351861}, hash: 9829E008DD6AA9C7A44BD5363390CFFC
    @Disabled()
    @Test()
    void getBenPerinatalHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenPerinatalHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenPerinatalHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting perinatal history\",\"status\":\"Error while getting perinatal history\"}"));
            verify(commonServiceImplMock).getBenPerinatalHistoryData(0L);
        });
    }

    //Sapient generated method id: ${2ec4f795-1541-34a5-9a8e-51b3a257920d}, hash: 3A91E0DE1DB79F589E3C2B521217F84E
    @Test()
    void getBenPerinatalHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenPerinatalHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting perinatal history\",\"status\":\"Error while getting perinatal history\"}")));
    }

    //Sapient generated method id: ${cc4a84f4-342a-3a31-8757-ad051c6ddc2a}, hash: A1042E4FE06BEBF5246437004D7A4B0F
    @Disabled()
    @Test()
    void getBenFeedingHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenFeedingHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenFeedingHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getBenFeedingHistoryData(0L);
        });
    }

    //Sapient generated method id: ${9c26536d-9ece-336d-bccf-876e10ace25a}, hash: B450B5A885679FC1B1FC2E50EC9191E8
    @Disabled()
    @Test()
    void getBenFeedingHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenFeedingHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${da3858c7-8574-3a46-8d27-30c161a50ab0}, hash: A66C28A86BF9939E972E3E8061F90674
    @Disabled()
    @Test()
    void getBenFeedingHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenFeedingHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenFeedingHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting child feeding history\",\"status\":\"Error while getting child feeding history\"}"));
            verify(commonServiceImplMock).getBenFeedingHistoryData(0L);
        });
    }

    //Sapient generated method id: ${81aa8fa5-9e69-31df-8f81-23934db0440e}, hash: A2B36A4A0A1E73CF3A58F0B95AEF1641
    @Test()
    void getBenFeedingHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenFeedingHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting child feeding history\",\"status\":\"Error while getting child feeding history\"}")));
    }

    //Sapient generated method id: ${ecb2c5a3-c335-3f19-b426-63b682edaffb}, hash: 2A67E1E212C3274BDA2603D135CA82AD
    @Disabled()
    @Test()
    void getBenDevelopmentHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenDevelopmentHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenDevelopmentHistory("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getBenDevelopmentHistoryData(0L);
        });
    }

    //Sapient generated method id: ${25e865af-86d7-3a1b-a0c2-1d1893243dfc}, hash: 248CBF16EA30BF027F1B7608B560416F
    @Disabled()
    @Test()
    void getBenDevelopmentHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDevelopmentHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${779d9d6c-089d-380b-9f38-29fa92daa059}, hash: 84E145626A0242F18576040324A424BE
    @Disabled()
    @Test()
    void getBenDevelopmentHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenDevelopmentHistoryData(0L);
        //Act Statement(s)
        String result = target.getBenDevelopmentHistory("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting child development history\",\"status\":\"Error while getting child development history\"}"));
            verify(commonServiceImplMock).getBenDevelopmentHistoryData(0L);
        });
    }

    //Sapient generated method id: ${cf6c943a-ff36-3675-9386-2627efd2b09a}, hash: 5D12DF7E41698B77E3F45181EDE700E3
    @Test()
    void getBenDevelopmentHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenDevelopmentHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting child development history\",\"status\":\"Error while getting child development history\"}")));
    }

    //Sapient generated method id: ${da9bdc6c-280d-3d42-abdf-651af1c28831}, hash: 781FFEB34115E329791C8A01862B682E
    @Test()
    void getBeneficiaryCaseSheetHistoryWhenResponseDataIsNotNull() throws Exception {
        /* Branches:* (responseData != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenPreviousVisitDataForCaseRecord("A");
        //Act Statement(s)
        String result = target.getBeneficiaryCaseSheetHistory("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getBenPreviousVisitDataForCaseRecord("A");
        });
    }

    //Sapient generated method id: ${34bf937b-ab2d-3056-add9-f8ebfbafaed1}, hash: 69A80938518883CEDAC8660B30EDD073
    @Test()
    void getBeneficiaryCaseSheetHistoryWhenResponseDataIsNull() throws Exception {
        /* Branches:* (responseData != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonServiceImplMock).getBenPreviousVisitDataForCaseRecord("A");
        //Act Statement(s)
        String result = target.getBeneficiaryCaseSheetHistory("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while fetching beneficiary previous visit history details\",\"status\":\"Error while fetching beneficiary previous visit history details\"}"));
            verify(commonServiceImplMock).getBenPreviousVisitDataForCaseRecord("A");
        });
    }

    //Sapient generated method id: ${dd056abb-53fa-329c-b424-f93ba7f43e4a}, hash: 8D220D5B836E20B8DBBC97EAE3D88CB8
    @Disabled()
    @Test()
    void getBeneficiaryCaseSheetHistoryWhenCaughtException() throws Exception {
        /* Branches:* (responseData != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenPreviousVisitDataForCaseRecord("A");
        //Act Statement(s)
        String result = target.getBeneficiaryCaseSheetHistory("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while fetching beneficiary previous visit history details\",\"status\":\"Error while fetching beneficiary previous visit history details\"}"));
            verify(commonServiceImplMock).getBenPreviousVisitDataForCaseRecord("A");
        });
    }

    //Sapient generated method id: ${4d1b5114-10f7-3196-9f64-8651a92d342d}, hash: 420E71F225C2425B4BC406C4A97B0CCB
    @Test()
    void getBeneficiaryCaseSheetHistoryWhenResponseDataIsNullAndCaughtException() throws Exception {
        /* Branches:* (responseData != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonServiceImplMock).getBenPreviousVisitDataForCaseRecord("A");
        //Act Statement(s)
        String result = target.getBeneficiaryCaseSheetHistory("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while fetching beneficiary previous visit history details\",\"status\":\"Error while fetching beneficiary previous visit history details\"}"));
            verify(commonServiceImplMock).getBenPreviousVisitDataForCaseRecord("A");
        });
    }

    //Sapient generated method id: ${d38e51f9-c3c5-339e-97f6-0d62c22fb101}, hash: 1C938861D917BCE7A2FFC601020B4BC3
    @Test()
    void getTCSpecialistWorkListNewWhenUserIDIsNull() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (userID != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getTCSpecialistWorkListNew((Integer) 2, (Integer) null, (Integer) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request, either ProviderServiceMapID or userID is invalid\",\"status\":\"Invalid request, either ProviderServiceMapID or userID is invalid\"}")));
    }

    //Sapient generated method id: ${09020688-6f7b-360b-b948-f3c1c92d6049}, hash: 64EEAA40389554004559CD57FB9C4B23
    @Test()
    void getTCSpecialistWorkListNewWhenSIsNotNull() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (userID != null) : true* (s != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonDoctorServiceImplMock).getTCSpecialistWorkListNewForTM(0, 0, 0);
        //Act Statement(s)
        String result = target.getTCSpecialistWorkListNew(0, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonDoctorServiceImplMock).getTCSpecialistWorkListNewForTM(0, 0, 0);
        });
    }

    //Sapient generated method id: ${c5f5303c-6bcf-3b18-a6f9-221f3467e254}, hash: 92DB7559CB242F1A7332D6B18F1F8140
    @Disabled()
    @Test()
    void getTCSpecialistWorkListNewWhenUserIDIsNullAndCaughtException() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (userID != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getTCSpecialistWorkListNew((Integer) 2, (Integer) null, (Integer) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting TC specialist worklist\",\"status\":\"Error while getting TC specialist worklist\"}")));
    }

    //Sapient generated method id: ${6d60bfde-d00c-3c5c-9229-1b4b16fc017d}, hash: 53C7E163FFBB11E687791B2267D627EB
    @Disabled()
    @Test()
    void getTCSpecialistWorkListNewWhenSIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (userID != null) : true* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonDoctorServiceImplMock).getTCSpecialistWorkListNewForTM(0, 0, 0);
        //Act Statement(s)
        String result = target.getTCSpecialistWorkListNew(0, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting TC specialist worklist\",\"status\":\"Error while getting TC specialist worklist\"}"));
            verify(commonDoctorServiceImplMock).getTCSpecialistWorkListNewForTM(0, 0, 0);
        });
    }

    //Sapient generated method id: ${3970cdb2-45fe-3340-b5e7-c65183cdf46c}, hash: C47E684064B935037BB1EB52D1B47EBC
    @Test()
    void getTCSpecialistWorkListNewPatientAppWhenUserIDIsNull() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (userID != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getTCSpecialistWorkListNewPatientApp((Integer) 2, (Integer) null, (Integer) 0, (Integer) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request, either ProviderServiceMapID or userID is invalid\",\"status\":\"Invalid request, either ProviderServiceMapID or userID is invalid\"}")));
    }

    //Sapient generated method id: ${a128fa4b-5162-3b35-922f-db8116c77f97}, hash: 289279603AA2C0EA591AA3759A6A8B8D
    @Test()
    void getTCSpecialistWorkListNewPatientAppWhenSIsNotNull() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (userID != null) : true* (s != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonDoctorServiceImplMock).getTCSpecialistWorkListNewForTMPatientApp(0, 0, 0, 0);
        //Act Statement(s)
        String result = target.getTCSpecialistWorkListNewPatientApp(0, 0, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonDoctorServiceImplMock).getTCSpecialistWorkListNewForTMPatientApp(0, 0, 0, 0);
        });
    }

    //Sapient generated method id: ${9ef2f0a3-3668-3ad3-bdd0-5845deee07c1}, hash: 009B475B94CB5EA2FADB9EFC0193C0CB
    @Disabled()
    @Test()
    void getTCSpecialistWorkListNewPatientAppWhenUserIDIsNullAndCaughtException() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (userID != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getTCSpecialistWorkListNewPatientApp((Integer) 2, (Integer) null, (Integer) 0, (Integer) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting TC specialist worklist\",\"status\":\"Error while getting TC specialist worklist\"}")));
    }

    //Sapient generated method id: ${0457d1d0-0784-3827-bef7-9f3afaf647de}, hash: 4A3EE473FA6613785DBD5AC8C24C84B2
    @Disabled()
    @Test()
    void getTCSpecialistWorkListNewPatientAppWhenSIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (userID != null) : true* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonDoctorServiceImplMock).getTCSpecialistWorkListNewForTMPatientApp(0, 0, 0, 0);
        //Act Statement(s)
        String result = target.getTCSpecialistWorkListNewPatientApp(0, 0, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting TC specialist worklist\",\"status\":\"Error while getting TC specialist worklist\"}"));
            verify(commonDoctorServiceImplMock).getTCSpecialistWorkListNewForTMPatientApp(0, 0, 0, 0);
        });
    }

    //Sapient generated method id: ${c0425744-f88a-3db0-90b7-d0de55eafe8f}, hash: C6B2E77B13F1DDA7007F2993E9ABDAF8
    @Test()
    void getTCSpecialistWorklistFutureScheduledWhenUserIDIsNull() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (userID != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getTCSpecialistWorklistFutureScheduled((Integer) 2, (Integer) null, (Integer) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request, either ProviderServiceMapID or userID is invalid\",\"status\":\"Invalid request, either ProviderServiceMapID or userID is invalid\"}")));
    }

    //Sapient generated method id: ${da0d2131-197d-3b11-92d6-2c954c68b3c0}, hash: 1869648E40303A57402EE15446349827
    @Test()
    void getTCSpecialistWorklistFutureScheduledWhenSIsNotNull() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (userID != null) : true* (s != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonDoctorServiceImplMock).getTCSpecialistWorkListNewFutureScheduledForTM(0, 0, 0);
        //Act Statement(s)
        String result = target.getTCSpecialistWorklistFutureScheduled(0, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonDoctorServiceImplMock).getTCSpecialistWorkListNewFutureScheduledForTM(0, 0, 0);
        });
    }

    //Sapient generated method id: ${3b6fad9a-dd08-346d-b5e5-372ebbb638b7}, hash: 1EE702AA1900DD21BE76A78EA5179245
    @Disabled()
    @Test()
    void getTCSpecialistWorklistFutureScheduledWhenUserIDIsNullAndCaughtException() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (userID != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getTCSpecialistWorklistFutureScheduled((Integer) 2, (Integer) null, (Integer) 0);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting TC specialist future scheduled worklist\",\"status\":\"Error while getting TC specialist future scheduled worklist\"}")));
    }

    //Sapient generated method id: ${1a8b805c-8ce5-3f0c-b042-2f27d6dd6fc5}, hash: 011D4B6C13055BA3B67A1A8BAF7664C2
    @Disabled()
    @Test()
    void getTCSpecialistWorklistFutureScheduledWhenSIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (providerServiceMapID != null) : true* (userID != null) : true* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonDoctorServiceImplMock).getTCSpecialistWorkListNewFutureScheduledForTM(0, 0, 0);
        //Act Statement(s)
        String result = target.getTCSpecialistWorklistFutureScheduled(0, 0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting TC specialist future scheduled worklist\",\"status\":\"Error while getting TC specialist future scheduled worklist\"}"));
            verify(commonDoctorServiceImplMock).getTCSpecialistWorkListNewFutureScheduledForTM(0, 0, 0);
        });
    }

    //Sapient generated method id: ${9b599db1-8110-35ca-9bb5-0dcae5efc9f3}, hash: 07C89BE333E05D9C6AAAFEBB924E5B57
    @Test()
    void getKMFileWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getOpenKMDocURL("A", "Authorization1");
        //Act Statement(s)
        String result = target.getKMFile("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getOpenKMDocURL("A", "Authorization1");
        });
    }

    //Sapient generated method id: ${96a611ae-4fa5-3e6a-8588-700bb3fbf456}, hash: 233C3B3E2485E5F375C6A6DA67D80637
    @Test()
    void getKMFileWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonServiceImplMock).getOpenKMDocURL("A", "Authorization1");
        //Act Statement(s)
        String result = target.getKMFile("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"file not available, please contact administrator\",\"status\":\"file not available, please contact administrator\"}"));
            verify(commonServiceImplMock).getOpenKMDocURL("A", "Authorization1");
        });
    }

    //Sapient generated method id: ${c9f23e2b-56d6-3053-a1a3-3fa8e40f81f0}, hash: 4341B487AC5CD728CCD63EA06F8409B2
    @Test()
    void getKMFileWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getOpenKMDocURL("A", "Authorization1");
        //Act Statement(s)
        String result = target.getKMFile("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getOpenKMDocURL("A", "Authorization1");
        });
    }

    //Sapient generated method id: ${fb7fc3c9-0339-34e5-99e9-ab9e4230f886}, hash: 0306F8C8374FEFF97D555CE7B6494B66
    @Test()
    void getKMFileWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonServiceImplMock).getOpenKMDocURL("A", "Authorization1");
        //Act Statement(s)
        String result = target.getKMFile("A", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"file not available, please contact administrator\",\"status\":\"file not available, please contact administrator\"}"));
            verify(commonServiceImplMock).getOpenKMDocURL("A", "Authorization1");
        });
    }

    //Sapient generated method id: ${459a08d0-263e-332b-bf27-f62fcd27b5d8}, hash: 1629BBDC68DC77A5034972DA2064A8DD
    @Disabled()
    @Test()
    void getBenPhysicalHistoryWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenPhysicalHistory(0L);
        //Act Statement(s)
        String result = target.getBenPhysicalHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getBenPhysicalHistory(0L);
        });
    }

    //Sapient generated method id: ${2bbe55ac-0d4d-356f-a375-3db800590d39}, hash: 7EAC2D338E38E962697346193F5444B8
    @Disabled()
    @Test()
    void getBenPhysicalHistoryWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenPhysicalHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${b2da9976-ce41-3035-9a6c-9f8ef28e51d4}, hash: C09BC6DEFEAE5208612254E90C6324EC
    @Disabled()
    @Test()
    void getBenPhysicalHistoryWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenPhysicalHistory(0L);
        //Act Statement(s)
        String result = target.getBenPhysicalHistory("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting Physical history\",\"status\":\"Error while getting Physical history\"}"));
            verify(commonServiceImplMock).getBenPhysicalHistory(0L);
        });
    }

    //Sapient generated method id: ${dc4448c8-0ce3-38e1-b9be-d16e661508b4}, hash: B70BE70375FF29945F9CE55FCBC86E24
    @Test()
    void getBenPhysicalHistoryWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenPhysicalHistory("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting Physical history\",\"status\":\"Error while getting Physical history\"}")));
    }

    //Sapient generated method id: ${09f64a64-c812-34cb-9d60-28ea912db2cc}, hash: 0D0BCFA0DF841D5522F83ECEF5503A5C
    @Disabled()
    @Test()
    void getBenSymptomaticQuestionnaireDetailsWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenSymptomaticQuestionnaireDetailsData(0L);
        //Act Statement(s)
        String result = target.getBenSymptomaticQuestionnaireDetails("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getBenSymptomaticQuestionnaireDetailsData(0L);
        });
    }

    //Sapient generated method id: ${91604f51-d54e-3c2b-8f00-10b85a93580c}, hash: AA71CBE23840E1B04BDCED417233DFC1
    @Disabled()
    @Test()
    void getBenSymptomaticQuestionnaireDetailsWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenSymptomaticQuestionnaireDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${064d072a-8e17-337b-92f8-504ac58cccc3}, hash: B7A02A5655C5CA537048B6218B03332A
    @Disabled()
    @Test()
    void getBenSymptomaticQuestionnaireDetailsWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenSymptomaticQuestionnaireDetailsData(0L);
        //Act Statement(s)
        String result = target.getBenSymptomaticQuestionnaireDetails("H");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting details\",\"status\":\"Error while getting details\"}"));
            verify(commonServiceImplMock).getBenSymptomaticQuestionnaireDetailsData(0L);
        });
    }

    //Sapient generated method id: ${1b3cc146-ed29-3017-bc2e-08140cd3611a}, hash: 5EE1BFCAA57C47A1AD3442AB95C60030
    @Test()
    void getBenSymptomaticQuestionnaireDetailsWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenSymptomaticQuestionnaireDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting details\",\"status\":\"Error while getting details\"}")));
    }

    //Sapient generated method id: ${aaa13046-be41-3a53-b34c-4edbdb9419ef}, hash: F22B27A44A9AD191AE5BD222550EE08D
    @Disabled()
    @Test()
    void getBenPreviousDiabetesHistoryDetailsWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenPreviousDiabetesData(0L);
        //Act Statement(s)
        String result = target.getBenPreviousDiabetesHistoryDetails("H");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getBenPreviousDiabetesData(0L);
        });
    }

    //Sapient generated method id: ${dba07df0-0097-3c7f-bbd0-709c3538269c}, hash: 29D6E1BD231C42DA0832CC367D6B31CF
    @Disabled()
    @Test()
    void getBenPreviousDiabetesHistoryDetailsWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenPreviousDiabetesHistoryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${e0af801b-724a-395e-8256-69d03dbeca2d}, hash: D6DB1DA9E2C878AAB77BF12D7B3952DF
    @Disabled()
    @Test()
    void getBenPreviousDiabetesHistoryDetailsWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenPreviousDiabetesData(0L);
        //Act Statement(s)
        String result = target.getBenPreviousDiabetesHistoryDetails("J");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting details\",\"status\":\"Error while getting details\"}"));
            verify(commonServiceImplMock).getBenPreviousDiabetesData(0L);
        });
    }

    //Sapient generated method id: ${78b7c486-2678-3033-934d-77105641f5d2}, hash: 12D81F16DFEA02353CC4E80342AF569B
    @Test()
    void getBenPreviousDiabetesHistoryDetailsWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenPreviousDiabetesHistoryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting details\",\"status\":\"Error while getting details\"}")));
    }

    //Sapient generated method id: ${83014f1e-8af0-3423-a2f8-8887dce0b583}, hash: 8660545E7D40120C5C00EA9EEF771599
    @Test()
    void getMmuNurseWorklistNewWhenSIsNotNull() throws Exception {
        /* Branches:* (s != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getMmuNurseWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getMmuNurseWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonNurseServiceImplMock).getMmuNurseWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${832970cc-bfd7-3c06-bf0c-2200e0ac986f}, hash: 618B465AA4FC5BBBCE33950162CAB4E5
    @Test()
    void getMmuNurseWorklistNewWhenSIsNull() throws Exception {
        /* Branches:* (s != null) : false*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getMmuNurseWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getMmuNurseWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting MMU Nurse Worklist\",\"status\":\"Error while getting MMU Nurse Worklist\"}"));
            verify(commonNurseServiceImplMock).getMmuNurseWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${ffb3f74e-b6ac-34b0-af52-b9fcb722f40b}, hash: 4EE2257798724658E27DF22F939A4A85
    @Disabled()
    @Test()
    void getMmuNurseWorklistNewWhenCaughtException() throws Exception {
        /* Branches:* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonNurseServiceImplMock).getMmuNurseWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getMmuNurseWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting MMU Nurse Worklist\",\"status\":\"Error while getting MMU Nurse Worklist\"}"));
            verify(commonNurseServiceImplMock).getMmuNurseWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${667d8948-dccf-3458-985b-9c8ad9e8c496}, hash: 14BAB1FDD1196D443A4D60B88292DAF6
    @Test()
    void getMmuNurseWorklistNewWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonNurseServiceImplMock).getMmuNurseWorkListNew(0, 0);
        //Act Statement(s)
        String result = target.getMmuNurseWorklistNew(0, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting MMU Nurse Worklist\",\"status\":\"Error while getting MMU Nurse Worklist\"}"));
            verify(commonNurseServiceImplMock).getMmuNurseWorkListNew(0, 0);
        });
    }

    //Sapient generated method id: ${904e2642-bc3e-365e-b80f-9088a62ec1ff}, hash: 60F73671EA132481E50E833C59DB14C2
    @Disabled()
    @Test()
    void getBenPreviousReferralHistoryDetailsWhenObjHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenPreviousReferralData(0L);
        //Act Statement(s)
        String result = target.getBenPreviousReferralHistoryDetails("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getBenPreviousReferralData(0L);
        });
    }

    //Sapient generated method id: ${4cbeeff0-a3c0-32c8-9f6b-6153a0930dcc}, hash: 58CCCC3D17C602980FE062D405CDC4F4
    @Disabled()
    @Test()
    void getBenPreviousReferralHistoryDetailsWhenObjNotHasBenRegID() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenPreviousReferralHistoryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Invalid request\",\"status\":\"Invalid request\"}")));
    }

    //Sapient generated method id: ${f0a82d55-ec62-3d65-961e-1af010411d4a}, hash: 2A080D97DE9CF5CDF38D55EDFE67C433
    @Disabled()
    @Test()
    void getBenPreviousReferralHistoryDetailsWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getBenPreviousReferralData(0L);
        //Act Statement(s)
        String result = target.getBenPreviousReferralHistoryDetails("J");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"Error while getting details\",\"status\":\"Error while getting details\"}"));
            verify(commonServiceImplMock).getBenPreviousReferralData(0L);
        });
    }

    //Sapient generated method id: ${c0d3fa8a-8afc-35bd-9747-e070dcae153a}, hash: 21886AEDA2FA476C2E05D64F5DAD033F
    @Test()
    void getBenPreviousReferralHistoryDetailsWhenObjNotHasBenRegIDAndCaughtException() throws Exception {
        /* Branches:* (obj.has("benRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getBenPreviousReferralHistoryDetails("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"Error while getting details\",\"status\":\"Error while getting details\"}")));
    }

    //Sapient generated method id: ${a1b3238c-3524-3b3b-a3cd-ea5bbe55024a}, hash: CE265BE0757BEECC55250DD444C25BBD
    @Test()
    void getProviderSpecificDataTest() throws Exception {
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getProviderSpecificData("G");
        //Act Statement(s)
        String result = target.getProviderSpecificData("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonServiceImplMock).getProviderSpecificData("G");
        });
    }

    //Sapient generated method id: ${95846204-b661-3df6-b0e4-c4ad354a3c65}, hash: 164D7DBC1062499F5FC2BF8A2E39F35A
    @Disabled()
    @Test()
    void getProviderSpecificDataWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonServiceImplMock).getProviderSpecificData("G");
        //Act Statement(s)
        String result = target.getProviderSpecificData("G");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":5000,\"errorMessage\":\"H\",\"status\":\"H\"}"));
            verify(commonServiceImplMock).getProviderSpecificData("G");
        });
    }

    //Sapient generated method id: ${35637a19-f0a1-3a93-ba39-8bfaf91099ee}, hash: 3C3F63368F2DA7C8D6351A9091DA1B5B
    @Test()
    void calculateBMIStatusTest() throws Exception {
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("B").when(commonNurseServiceImplMock).calculateBMIStatus("D");
        //Act Statement(s)
        String result = target.calculateBMIStatus("D");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"B\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonNurseServiceImplMock).calculateBMIStatus("D");
        });
    }

    //Sapient generated method id: ${24ee135a-1c26-3e1a-a412-1463e40d6ba6}, hash: 7D330CA30165BAEFFAF145105780EDA1
    @Test()
    void calculateBMIStatusWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        RuntimeException runtimeException = new RuntimeException("B");
        doThrow(runtimeException).when(commonNurseServiceImplMock).calculateBMIStatus("A");
        //Act Statement(s)
        String result = target.calculateBMIStatus("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"B\",\"status\":\"B\"}"));
            verify(commonNurseServiceImplMock).calculateBMIStatus("A");
        });
    }

    //Sapient generated method id: ${77ea9330-7c25-352e-a5bb-1c1e42e687f9}, hash: AEE43371851D5FE0E340D5A8E644E77D
    @Disabled()
    @Test()
    void saveBeneficiaryVisitDetailWhenObjNotHasBeneficiaryRegID() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBeneficiaryVisitDetail("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Beneficiary Registration ID is Not valid !!!\",\"status\":\"Beneficiary Registration ID is Not valid !!!\"}")));
    }

    //Sapient generated method id: ${761eebed-43be-3b35-b324-6462701d1855}, hash: E6729D96CA9BC284BEDD3F992435F642
    @Disabled()
    @Test()
    void saveBeneficiaryVisitDetailWhenObjGetLongBeneficiaryRegIDNotGreaterThan0() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBeneficiaryVisitDetail("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Beneficiary Registration ID is Not valid !!!\",\"status\":\"Beneficiary Registration ID is Not valid !!!\"}")));
    }

    //Sapient generated method id: ${505c7d9d-26a2-3936-8aa9-e8ff4fdd275c}, hash: 4CF3F797B221FA4BD9468073848A95E9
    @Disabled()
    @Test()
    void saveBeneficiaryVisitDetailWhenCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBeneficiaryVisitDetail("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Beneficiary Registration ID is Not valid !!!\",\"status\":\"Beneficiary Registration ID is Not valid !!!\"}")));
    }

    //Sapient generated method id: ${239d7625-b311-3ffc-a63e-fec010510daf}, hash: 3989AA19AC5CD91F1A8AAECEA985D699
    @Disabled()
    @Test()
    void saveBeneficiaryVisitDetailWhenObjGetLongBeneficiaryRegIDNotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.saveBeneficiaryVisitDetail("A");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Beneficiary Registration ID is Not valid !!!\",\"status\":\"Beneficiary Registration ID is Not valid !!!\"}")));
    }

    //Sapient generated method id: ${9c85bdca-8b7e-3b4f-ba76-24cbf557881f}, hash: 74158B5BF114FB2405F7E32CFB2408B2
    @Disabled()
    @Test()
    void saveBeneficiaryVisitDetailWhenIGreaterThan0() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true* (i != null) : true* (i > 0) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(commonNurseServiceImplMock).updateBeneficiaryStatus('R', 1L);
        //Act Statement(s)
        String result = target.saveBeneficiaryVisitDetail("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Beneficiary Successfully Submitted to Nurse Work-List.\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonNurseServiceImplMock).updateBeneficiaryStatus('R', 1L);
        });
    }

    //Sapient generated method id: ${3265fcaa-ea6b-3776-9bb5-ff2144d83112}, hash: F0B29A2C1DBAEE7608B761978FF3A4F7
    @Disabled()
    @Test()
    void saveBeneficiaryVisitDetailWhenINotGreaterThan0() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true* (i != null) : true* (i > 0) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(commonNurseServiceImplMock).updateBeneficiaryStatus('R', 0L);
        //Act Statement(s)
        String result = target.saveBeneficiaryVisitDetail("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Something went Wrong please try after Some Time !!!\",\"status\":\"Something went Wrong please try after Some Time !!!\"}"));
            verify(commonNurseServiceImplMock).updateBeneficiaryStatus('R', 0L);
        });
    }

    //Sapient generated method id: ${d929c470-4690-31f3-996e-5c6b0faff966}, hash: 9F52BA6C3B7FA66B8D3704396ED4A9C8
    @Disabled()
    @Test()
    void saveBeneficiaryVisitDetailWhenIGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true* (i != null) : true* (i > 0) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(commonNurseServiceImplMock).updateBeneficiaryStatus('R', 1L);
        //Act Statement(s)
        String result = target.saveBeneficiaryVisitDetail("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"Beneficiary Successfully Submitted to Nurse Work-List.\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonNurseServiceImplMock).updateBeneficiaryStatus('R', 1L);
        });
    }

    //Sapient generated method id: ${c05035d9-929f-334f-8683-2faa1f2b1e7c}, hash: 57C1F8065B708FB11D0A1755D03ED9FA
    @Disabled()
    @Test()
    void saveBeneficiaryVisitDetailWhenINotGreaterThan0AndCaughtException() throws Exception {
        /* Branches:* (obj.has("beneficiaryRegID")) : true* (obj.getLong("beneficiaryRegID") > 0) : true* (i != null) : true* (i > 0) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(0).when(commonNurseServiceImplMock).updateBeneficiaryStatus('R', 0L);
        //Act Statement(s)
        String result = target.saveBeneficiaryVisitDetail("A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":500,\"errorMessage\":\"Something went Wrong please try after Some Time !!!\",\"status\":\"Something went Wrong please try after Some Time !!!\"}"));
            verify(commonNurseServiceImplMock).updateBeneficiaryStatus('R', 0L);
        });
    }

    //Sapient generated method id: ${c2d9b8b1-c41b-35ee-ae62-d1ef75977383}, hash: D1C09A963095803AD1DC500AD0E7FB55
    @Test()
    void extendRedisSessionTest() throws Exception {
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.extendRedisSession();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"Session extended for 30 mins\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}")));
    }

    //Sapient generated method id: ${97d66c17-10c8-3b74-a2d2-250c4e46807e}, hash: 62CD4BEFE8A361510F6A0A2C1A6FBD27
    @Test()
    void extendRedisSessionWhenCaughtException() throws Exception {
        /* Branches:* (catch-exception (Exception)) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.extendRedisSession();
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("{\"data\":{\"response\":\"Session extended for 30 mins\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}")));
    }

    //Sapient generated method id: ${127a5a50-635d-3f5e-9d64-f4d554b7dd07}, hash: E8AD6B306A9B7B96245EE077A7E23CA6
    @Disabled()
    @Test()
    void deletePrescribedMedicineWhenSIsNotNull() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (s != null) : true*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonDoctorServiceImplMock).deletePrescribedMedicine((JSONObject) any());
        //Act Statement(s)
        String result = target.deletePrescribedMedicine("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonDoctorServiceImplMock).deletePrescribedMedicine((JSONObject) any());
        });
    }

    //Sapient generated method id: ${43dc6c19-bdc4-3f85-91ea-70d70c5a155d}, hash: CD9F1A01C954DA3FE8299885CF27CE73
    @Disabled()
    @Test()
    void deletePrescribedMedicineWhenSIsNull() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (s != null) : false** TODO: Help needed! This method is not unit testable!*  No constructor found to create an object without any exception for class org.json.JSONObject*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonDoctorServiceImplMock).deletePrescribedMedicine((JSONObject) any());
        //Act Statement(s)
        String result = target.deletePrescribedMedicine("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error while deleting record\",\"status\":\"error while deleting record\"}"));
            verify(commonDoctorServiceImplMock).deletePrescribedMedicine((JSONObject) any());
        });
    }

    //Sapient generated method id: ${d432bcd1-7417-3009-8cb6-2e3a96b34673}, hash: 9533BA0F61AAB517719F64212039AF74
    @Disabled()
    @Test()
    void deletePrescribedMedicineWhenSIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (s != null) : true* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonDoctorServiceImplMock).deletePrescribedMedicine((JSONObject) any());
        //Act Statement(s)
        String result = target.deletePrescribedMedicine("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonDoctorServiceImplMock).deletePrescribedMedicine((JSONObject) any());
        });
    }

    //Sapient generated method id: ${1f0d4487-ac98-3840-8a28-987e38bbc553}, hash: 0CCDFD798AAF12A157CB4FF3EE94465B
    @Disabled()
    @Test()
    void deletePrescribedMedicineWhenSIsNullAndCaughtException() throws Exception {
        /* Branches:* (requestOBJ != null) : true* (s != null) : false* (catch-exception (Exception)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new WorklistController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(commonDoctorServiceImplMock).deletePrescribedMedicine((JSONObject) any());
        //Act Statement(s)
        String result = target.deletePrescribedMedicine("requestOBJ1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"statusCode\":5000,\"errorMessage\":\"error while deleting record\",\"status\":\"error while deleting record\"}"));
            verify(commonDoctorServiceImplMock).deletePrescribedMedicine((JSONObject) any());
        });
    }
}
