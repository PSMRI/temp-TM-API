package com.iemr.tm.service.common.master;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CommonMasterServiceImplSapientGeneratedTest {

    private final NurseMasterDataServiceImpl nurseMasterDataServiceImplMock = mock(NurseMasterDataServiceImpl.class, "nurseMasterDataServiceImpl");

    private final ANCMasterDataServiceImpl ancMasterDataServiceImplMock = mock(ANCMasterDataServiceImpl.class, "ancMasterDataServiceImpl");

    private final NCDScreeningMasterServiceImpl ncdScreeningServiceImplMock = mock(NCDScreeningMasterServiceImpl.class, "ncdScreeningServiceImpl");

    private final DoctorMasterDataServiceImpl doctorMasterDataServiceImplMock = mock(DoctorMasterDataServiceImpl.class, "doctorMasterDataServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private CommonMasterServiceImpl target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${fedd8583-ece4-3772-b5a7-b8655b58b2ec}, hash: 47636FD01286974166EF3BBFCEF90946
    @Test()
    void getVisitReasonAndCategoriesTest() {
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_GetVisitReasonAndCategories1").when(nurseMasterDataServiceImplMock).GetVisitReasonAndCategories();

        //Act Statement(s)
        String result = target.getVisitReasonAndCategories();

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_GetVisitReasonAndCategories1"));
            verify(nurseMasterDataServiceImplMock).GetVisitReasonAndCategories();
        });
    }

    //Sapient generated method id: ${9a047d10-fcc6-3211-a25e-11f2a5a96102}, hash: FA2B9566949A1F3A26725223E939253B
    @Test()
    void getMasterDataForNurseWhenVisitCategoryIDIsNull() {
        /* Branches:* (null != visitCategoryID) : false*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        String result = target.getMasterDataForNurse(null, 0, "gender1");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("Invalid VisitCategoryID")));
    }

    //Sapient generated method id: ${0db316a5-70a7-32ad-9ad4-ea0dfdbd2ab7}, hash: CAAAF6E69B84E9D1F66E997F6A0482B8
    @Test()
    void getMasterDataForNurseWhenSwitchVisitCategoryIDCase8() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = (8)) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getCommonNurseMasterDataForGenopdAncNcdcarePnc1").when(ancMasterDataServiceImplMock).getCommonNurseMasterDataForGenopdAncNcdcarePnc(8, 0, "gender1");

        //Act Statement(s)
        String result = target.getMasterDataForNurse(8, 0, "gender1");

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getCommonNurseMasterDataForGenopdAncNcdcarePnc1"));
            verify(ancMasterDataServiceImplMock, times(2)).getCommonNurseMasterDataForGenopdAncNcdcarePnc(8, 0, "gender1");
        });
    }

    //Sapient generated method id: ${0df7dc8f-02e5-34bd-ae51-8f7d2d03f387}, hash: BE797B2B7D4E757F9D83DFE4675BE416
    @Test()
    void getMasterDataForNurseWhenSwitchVisitCategoryIDCase1() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 1) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getCancerScreeningMasterDataForNurse1").when(nurseMasterDataServiceImplMock).getCancerScreeningMasterDataForNurse();

        //Act Statement(s)
        String result = target.getMasterDataForNurse(1, 0, "gender1");

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getCancerScreeningMasterDataForNurse1"));
            verify(nurseMasterDataServiceImplMock).getCancerScreeningMasterDataForNurse();
        });
    }

    //Sapient generated method id: ${3a0b8fab-7637-3b7e-9bfa-778d586c8140}, hash: 2DE3332389EA0013FC41FD5A62B55D4A
    @Test()
    void getMasterDataForNurseWhenSwitchVisitCategoryIDCase2() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 2) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getNCDScreeningMasterData1").when(ncdScreeningServiceImplMock).getNCDScreeningMasterData(2, 0, "gender1");

        //Act Statement(s)
        String result = target.getMasterDataForNurse(2, 0, "gender1");

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getNCDScreeningMasterData1"));
            verify(ncdScreeningServiceImplMock).getNCDScreeningMasterData(2, 0, "gender1");
        });
    }

    //Sapient generated method id: ${febbdefc-1bbe-34c0-afe1-0a8a19f4d0b7}, hash: A37DB9F44E717DDEEE791DDC5DECFF95
    @Test()
    void getMasterDataForNurseWhenSwitchVisitCategoryIDCase3() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 3) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getCommonNurseMasterDataForGenopdAncNcdcarePnc1").when(ancMasterDataServiceImplMock).getCommonNurseMasterDataForGenopdAncNcdcarePnc(3, 0, "gender1");

        //Act Statement(s)
        String result = target.getMasterDataForNurse(3, 0, "gender1");

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getCommonNurseMasterDataForGenopdAncNcdcarePnc1"));
            verify(ancMasterDataServiceImplMock).getCommonNurseMasterDataForGenopdAncNcdcarePnc(3, 0, "gender1");
        });
    }

    //Sapient generated method id: ${b46a7d66-30d6-3977-9e99-11268008db30}, hash: 0A2499D1E8DB9E3A3F189CAB6038AE32
    @Test()
    void getMasterDataForNurseWhenSwitchVisitCategoryIDCase4() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 4) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getCommonNurseMasterDataForGenopdAncNcdcarePnc1").when(ancMasterDataServiceImplMock).getCommonNurseMasterDataForGenopdAncNcdcarePnc(4, 0, "gender1");

        //Act Statement(s)
        String result = target.getMasterDataForNurse(4, 0, "gender1");

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getCommonNurseMasterDataForGenopdAncNcdcarePnc1"));
            verify(ancMasterDataServiceImplMock).getCommonNurseMasterDataForGenopdAncNcdcarePnc(4, 0, "gender1");
        });
    }

    //Sapient generated method id: ${e109af0a-7b87-3c86-a996-20e5855f8ce9}, hash: 3DD24698724E52E0B216956F2500A7DC
    @Test()
    void getMasterDataForNurseWhenSwitchVisitCategoryIDCase5() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 5) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getCommonNurseMasterDataForGenopdAncNcdcarePnc1").when(ancMasterDataServiceImplMock).getCommonNurseMasterDataForGenopdAncNcdcarePnc(5, 0, "gender1");

        //Act Statement(s)
        String result = target.getMasterDataForNurse(5, 0, "gender1");

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getCommonNurseMasterDataForGenopdAncNcdcarePnc1"));
            verify(ancMasterDataServiceImplMock).getCommonNurseMasterDataForGenopdAncNcdcarePnc(5, 0, "gender1");
        });
    }

    //Sapient generated method id: ${4caadfb8-73e5-3292-bebc-5897d1c6eeee}, hash: 9BF5739A0AD0ABC73763426AA29D2391
    @Test()
    void getMasterDataForNurseWhenSwitchVisitCategoryIDCase6() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 6) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getCommonNurseMasterDataForGenopdAncNcdcarePnc1").when(ancMasterDataServiceImplMock).getCommonNurseMasterDataForGenopdAncNcdcarePnc(6, 0, "gender1");

        //Act Statement(s)
        String result = target.getMasterDataForNurse(6, 0, "gender1");

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getCommonNurseMasterDataForGenopdAncNcdcarePnc1"));
            verify(ancMasterDataServiceImplMock).getCommonNurseMasterDataForGenopdAncNcdcarePnc(6, 0, "gender1");
        });
    }

    //Sapient generated method id: ${b8567d70-d94d-3682-b8e3-fc8d35b80b8c}, hash: 3052F69E87AB41487B4A84FF0AD6F68F
    @Test()
    void getMasterDataForNurseWhenSwitchVisitCategoryIDCase7() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 7) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        String result = target.getMasterDataForNurse(7, 0, "gender1");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("No Master Data found for QuickConsultation")));
    }

    //Sapient generated method id: ${b816d57f-6dcf-39fc-a869-9ee614d3e415}, hash: EE5C1997F312406E4BB387FD851E3575
    @Test()
    void getMasterDataForNurseWhenSwitchVisitCategoryIDCaseDefault() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = default) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        String result = target.getMasterDataForNurse(9, 123, "male");

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("Invalid VisitCategoryID")));
    }

    //Sapient generated method id: ${45235ad0-950f-3e9c-b4ac-13a54ec4c957}, hash: FC2FAB0CDEC3610CEAD9C5EC88E7CB38
    @Test()
    void getMasterDataForDoctorWhenVisitCategoryIDIsNull() {
        /* Branches:* (null != visitCategoryID) : false*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        String result = target.getMasterDataForDoctor(null, 0, "gender1", 0, 0);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("Invalid VisitCategoryID")));
    }

    //Sapient generated method id: ${eab6788e-2d19-39a9-825f-7d71eb63cfb0}, hash: AEFACF730A2EB356909EDB8D57BD0029
    @Test()
    void getMasterDataForDoctorWhenSwitchVisitCategoryIDCase1() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 1) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getCancerScreeningMasterDataForDoctor1").when(doctorMasterDataServiceImplMock).getCancerScreeningMasterDataForDoctor(1);

        //Act Statement(s)
        String result = target.getMasterDataForDoctor(1, 1, "gender1", 0, 0);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getCancerScreeningMasterDataForDoctor1"));
            verify(doctorMasterDataServiceImplMock).getCancerScreeningMasterDataForDoctor(1);
        });
    }

    //Sapient generated method id: ${cb8fa013-784a-37dd-8d04-e319761de818}, hash: 3B626FE6A8C67B98BA8CC9A3B731817F
    @Test()
    void getMasterDataForDoctorWhenSwitchVisitCategoryIDCase10() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 10) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1").when(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(10, 10, "gender1", 0, 0);

        //Act Statement(s)
        String result = target.getMasterDataForDoctor(10, 10, "gender1", 0, 0);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1"));
            verify(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(10, 10, "gender1", 0, 0);
        });
    }

    //Sapient generated method id: ${e8a568e0-2d91-3905-94a6-772cbc78bd28}, hash: 06298F1C22A1A859C3FDF9A4D9FF2283
    @Test()
    void getMasterDataForDoctorWhenSwitchVisitCategoryIDCase2() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 2) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1").when(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(2, 2, "gender1", 0, 0);

        //Act Statement(s)
        String result = target.getMasterDataForDoctor(2, 2, "gender1", 0, 0);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1"));
            verify(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(2, 2, "gender1", 0, 0);
        });
    }

    //Sapient generated method id: ${ba6c9fc0-cee6-36df-af30-1115221cd3ca}, hash: 732F319B6A0A31A9DF5121F343770E05
    @Test()
    void getMasterDataForDoctorWhenSwitchVisitCategoryIDCase3() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 3) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1").when(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(3, 3, "gender1", 0, 0);

        //Act Statement(s)
        String result = target.getMasterDataForDoctor(3, 3, "gender1", 0, 0);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1"));
            verify(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(3, 3, "gender1", 0, 0);
        });
    }

    //Sapient generated method id: ${0cf8efe3-3ad9-3899-a0aa-d73806e234ac}, hash: 7E694B7F0F136E9B4115F817DCB668CC
    @Test()
    void getMasterDataForDoctorWhenSwitchVisitCategoryIDCase4() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 4) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1").when(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(4, 4, "gender1", 0, 0);

        //Act Statement(s)
        String result = target.getMasterDataForDoctor(4, 4, "gender1", 0, 0);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1"));
            verify(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(4, 4, "gender1", 0, 0);
        });
    }

    //Sapient generated method id: ${130820db-a0b6-3b1a-b85a-dad5065ecbb9}, hash: A6488DF041A9C4ADDD5F43DF029518FA
    @Test()
    void getMasterDataForDoctorWhenSwitchVisitCategoryIDCase5() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 5) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1").when(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(5, 5, "gender1", 0, 0);

        //Act Statement(s)
        String result = target.getMasterDataForDoctor(5, 5, "gender1", 0, 0);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1"));
            verify(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(5, 5, "gender1", 0, 0);
        });
    }

    //Sapient generated method id: ${01d23e5e-c206-3c01-82b1-5e7253ee5ce3}, hash: 8FFE51EA8F369ACE9AA9DE600CAB2BB3
    @Test()
    void getMasterDataForDoctorWhenSwitchVisitCategoryIDCase6() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 6) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1").when(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(6, 6, "gender1", 0, 0);

        //Act Statement(s)
        String result = target.getMasterDataForDoctor(6, 6, "gender1", 0, 0);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1"));
            verify(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(6, 6, "gender1", 0, 0);
        });
    }

    //Sapient generated method id: ${8d614025-3580-3180-88c5-ca9adf63babb}, hash: CBD489A87163CCE8D9BBE46EB00C8A15
    @Test()
    void getMasterDataForDoctorWhenSwitchVisitCategoryIDCase7() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 7) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1").when(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(7, 7, "gender1", 0, 0);

        //Act Statement(s)
        String result = target.getMasterDataForDoctor(7, 7, "gender1", 0, 0);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1"));
            verify(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(7, 7, "gender1", 0, 0);
        });
    }

    //Sapient generated method id: ${475f586a-5e7d-3949-b23a-42f58c559485}, hash: 1745585584A3E0E3D374CFF7F0A50CF1
    @Test()
    void getMasterDataForDoctorWhenSwitchVisitCategoryIDCase8() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = 8) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1").when(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(8, 8, "gender1", 0, 0);

        //Act Statement(s)
        String result = target.getMasterDataForDoctor(8, 8, "gender1", 0, 0);

        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getCommonDoctorMasterDataForGenopdAncNcdcarePnc1"));
            verify(ancMasterDataServiceImplMock).getCommonDoctorMasterDataForGenopdAncNcdcarePnc(8, 8, "gender1", 0, 0);
        });
    }

    //Sapient generated method id: ${24598fa2-2607-3de1-b40c-c474e5de9617}, hash: FD24C850CF835BF6891187804E74038B
    @Test()
    void getMasterDataForDoctorWhenSwitchVisitCategoryIDCaseDefault() {
        /* Branches:* (null != visitCategoryID) : true* (switch(visitCategoryID) = default) : true*/
        //Arrange Statement(s)
        target = new CommonMasterServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);

        //Act Statement(s)
        String result = target.getMasterDataForDoctor(9, 123, "Male", 456, 789);

        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("Invalid VisitCategoryID")));
    }
}
