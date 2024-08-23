package com.iemr.tm.controller.common.master;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.service.common.master.CommonMasterServiceImpl;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CommonMasterControllerSapientGeneratedTest {

    private final CommonMasterServiceImpl commonMasterServiceImplMock = mock(CommonMasterServiceImpl.class, "commonMasterServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private CommonMasterController target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${fedd8583-ece4-3772-b5a7-b8655b58b2ec}, hash: 5B724F3B2DD21956A3A52982DD868098
    @Test()
    void getVisitReasonAndCategoriesTest() {
        //Arrange Statement(s)
        target = new CommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonMasterServiceImplMock).getVisitReasonAndCategories();

        //Act Statement(s)
        String result = target.getVisitReasonAndCategories();

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonMasterServiceImplMock).getVisitReasonAndCategories();
        });
    }

    //Sapient generated method id: ${cbe1d1ad-7608-3c39-878d-8e5ae963cc89}, hash: A4D74D13654F4C0468B120B4F98DEE01
    @Test()
    void NurseMasterDataTest() {
        //Arrange Statement(s)
        target = new CommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonMasterServiceImplMock).getMasterDataForNurse(2, 2, "gender1");

        //Act Statement(s)
        String result = target.NurseMasterData(2, 2, "gender1");

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonMasterServiceImplMock).getMasterDataForNurse(2, 2, "gender1");
        });
    }

    //Sapient generated method id: ${9ec9188e-96fb-3a96-a7e9-915f7174fefa}, hash: 8DA158C30CD152877669CE91741BEBBD
    @Test()
    void DoctorMasterDataTest() {
        //Arrange Statement(s)
        target = new CommonMasterController();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(commonMasterServiceImplMock).getMasterDataForDoctor(2, 2, "gender1", 0, 0);

        //Act Statement(s)
        String result = target.DoctorMasterData(2, 2, "gender1", 0, 0);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("{\"data\":{\"response\":\"A\"},\"statusCode\":200,\"errorMessage\":\"Success\",\"status\":\"Success\"}"));
            verify(commonMasterServiceImplMock).getMasterDataForDoctor(2, 2, "gender1", 0, 0);
        });
    }
}
