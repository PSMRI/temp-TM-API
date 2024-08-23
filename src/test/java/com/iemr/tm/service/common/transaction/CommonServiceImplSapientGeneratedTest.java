package com.iemr.tm.service.common.transaction;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.utils.exception.IEMRException;

import java.text.ParseException;

import org.json.JSONException;
import org.springframework.web.client.RestClientException;

import java.util.List;

import com.iemr.tm.service.quickConsultation.QuickConsultationServiceImpl;
import com.iemr.tm.repo.benFlowStatus.BeneficiaryFlowStatusRepo;
import com.iemr.tm.data.benFlowStatus.BeneficiaryFlowStatus;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.service.generalOPD.GeneralOPDServiceImpl;
import com.iemr.tm.data.tele_consultation.TCRequestModel;
import com.iemr.tm.service.anc.Utility;
import com.iemr.tm.service.cancerScreening.CSNurseServiceImpl;
import com.iemr.tm.repo.provider.ProviderServiceMappingRepo;

import java.util.ArrayList;

import com.iemr.tm.service.anc.ANCServiceImpl;
import com.iemr.tm.service.ncdscreening.NCDScreeningServiceImpl;
import com.iemr.tm.repo.nurse.BenVisitDetailRepo;
import com.iemr.tm.data.tele_consultation.TeleconsultationRequestOBJ;
import com.iemr.tm.service.tele_consultation.TeleConsultationServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.iemr.tm.service.cancerScreening.CSServiceImpl;
import com.iemr.tm.data.nurse.CommonUtilityClass;
import com.iemr.tm.service.covid19.Covid19ServiceImpl;
import com.iemr.tm.data.doctor.WrapperCancerExamImgAnotasn;
import com.iemr.tm.data.tele_consultation.TcSpecialistSlotBookingRequestOBJ;
import org.mockito.MockedStatic;

import java.sql.Timestamp;

import com.iemr.tm.service.pnc.PNCServiceImpl;
import com.iemr.tm.utils.mapper.InputMapper;
import com.iemr.tm.service.ncdCare.NCDCareServiceImpl;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CommonServiceImplSapientGeneratedTest {

    private final Covid19ServiceImpl covid19ServiceImplMock = mock(Covid19ServiceImpl.class, "covid19ServiceImpl");

    private final CommonDoctorServiceImpl commonDoctorServiceImplMock = mock(CommonDoctorServiceImpl.class, "commonDoctorServiceImpl");

    private final TeleConsultationServiceImpl teleConsultationServiceImplMock = mock(TeleConsultationServiceImpl.class, "teleConsultationServiceImpl");

    private final ProviderServiceMappingRepo providerServiceMappingRepoMock = mock(ProviderServiceMappingRepo.class, "providerServiceMappingRepo");

    private final BenVisitDetailRepo benVisitDetailRepoMock = mock(BenVisitDetailRepo.class, "benVisitDetailRepo");

    private final ANCServiceImpl ancServiceImplMock = mock(ANCServiceImpl.class, "ancServiceImpl");

    private final BeneficiaryFlowStatusRepo beneficiaryFlowStatusRepoMock = mock(BeneficiaryFlowStatusRepo.class, "beneficiaryFlowStatusRepo");

    private final CSServiceImpl csServiceImplMock = mock(CSServiceImpl.class, "csServiceImpl");

    private final CSNurseServiceImpl cSNurseServiceImplMock = mock(CSNurseServiceImpl.class, "cSNurseServiceImpl");

    private final QuickConsultationServiceImpl quickConsultationServiceImplMock = mock(QuickConsultationServiceImpl.class, "quickConsultationServiceImpl");

    private final GeneralOPDServiceImpl generalOPDServiceImplMock = mock(GeneralOPDServiceImpl.class, "generalOPDServiceImpl");

    private final NCDCareServiceImpl ncdCareServiceImplMock = mock(NCDCareServiceImpl.class, "ncdCareServiceImpl");

    private final NCDScreeningServiceImpl ncdScreeningServiceImplMock = mock(NCDScreeningServiceImpl.class, "ncdScreeningServiceImpl");

    private final PNCServiceImpl pncServiceImplMock = mock(PNCServiceImpl.class, "pncServiceImpl");

    private final CommonNurseServiceImpl commonNurseServiceImplMock = mock(CommonNurseServiceImpl.class, "commonNurseServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private CommonServiceImpl target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${3e265d72-ce05-3222-8e08-70192cd7ce0d}, hash: B9B964D45D58AD5D6A551111794A47F5
    @Disabled()
    @Test()
    void getCaseSheetPrintDataForBeneficiaryWhenSwitchVisitCategoryCaseDefault() throws JsonProcessingException, ParseException {
        /* Branches:* (null != visitCategory) : true* (visitCategory.length() > 0) : true* (switch(visitCategory) = default) : true*/
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        BeneficiaryFlowStatus beneficiaryFlowStatus = new BeneficiaryFlowStatus();
        //Act Statement(s)
        String result = target.getCaseSheetPrintDataForBeneficiary(beneficiaryFlowStatus, "Some Authorization");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo("Invalid VisitCategory")));
    }

    //Sapient generated method id: ${1f0f1b85-a024-3ecb-94c3-32857a485781}, hash: 7ACEDF594FF0B8AE7874E228A2560576
    @Test()
    void getCaseSheetPrintDataForBeneficiaryWhenTcspIDGreaterThan0() {
        /* Branches:* (null != visitCategory) : true* (visitCategory.length() > 0) : true* (switch(visitCategory) = "ANC") : true* (tcspID != null) : true  #  inside getBenDetails method* (tcspID > 0) : true  #  inside getBenDetails method** TODO: Help needed! This method is not unit testable!*  A variable could not be isolated or mocked when calling a method - Variable name: object of type Gson - Method: toJson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        //BeneficiaryFlowStatus benFlowOBJMock = mock(BeneficiaryFlowStatus.class);
        /*try (MockedStatic<BeneficiaryFlowStatus> beneficiaryFlowStatus = mockStatic(BeneficiaryFlowStatus.class)) {
    doReturn("ANC").when(benFlowOBJMock).getVisitCategory();
    doReturn(0L).when(benFlowOBJMock).getBeneficiaryRegID();
    doReturn(0L).when(benFlowOBJMock).getBenVisitCode();
    doReturn(0L).when(benFlowOBJMock).getBenFlowID();
    BeneficiaryFlowStatus beneficiaryFlowStatus2 = new BeneficiaryFlowStatus();
    beneficiaryFlowStatus2.setTCSpecialistUserID(1);
    beneficiaryFlowStatus.when(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any())).thenReturn(beneficiaryFlowStatus2);
    target = new CommonServiceImpl();
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    doReturn("return_of_getBenANCNurseData1").when(ancServiceImplMock).getBenANCNurseData(0L, 0L);
    doReturn("return_of_getBenCaseRecordFromDoctorANC1").when(ancServiceImplMock).getBenCaseRecordFromDoctorANC(0L, 0L);
    ArrayList<Object[]> objectList = new ArrayList<>();
    doReturn(objectList).when(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
    doReturn(1).when(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
    //Act Statement(s)
    String result = target.getCaseSheetPrintDataForBeneficiary(benFlowOBJMock, "Authorization1");
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo("{nurseData=null, doctorData=null, BeneficiaryData=null, serviceID=4}"));
        verify(benFlowOBJMock).getVisitCategory();
        verify(benFlowOBJMock, times(3)).getBeneficiaryRegID();
        verify(benFlowOBJMock, times(2)).getBenVisitCode();
        verify(benFlowOBJMock).getBenFlowID();
        beneficiaryFlowStatus.verify(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any()));
        verify(ancServiceImplMock).getBenANCNurseData(0L, 0L);
        verify(ancServiceImplMock).getBenCaseRecordFromDoctorANC(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
    });
}*/
    }

    //Sapient generated method id: ${b5767c2c-cf87-3bcb-8a1b-a0173d934129}, hash: E6AE102053C80F14AD0EEEB9245A224B
    @Test()
    void getCaseSheetPrintDataForBeneficiaryWhenTcspIDIsNotNullAndTcspIDGreaterThan0() {
        /* Branches:* (null != visitCategory) : true* (visitCategory.length() > 0) : true* (switch(visitCategory) = "COVID-19 Screening") : true* (tcspID != null) : true  #  inside getBenDetails method* (tcspID > 0) : true  #  inside getBenDetails method** TODO: Help needed! This method is not unit testable!*  A variable could not be isolated or mocked when calling a method - Variable name: object of type Gson - Method: toJson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        //BeneficiaryFlowStatus benFlowOBJMock = mock(BeneficiaryFlowStatus.class);
        /*try (MockedStatic<BeneficiaryFlowStatus> beneficiaryFlowStatus = mockStatic(BeneficiaryFlowStatus.class)) {
    doReturn("COVID-19 Screening").when(benFlowOBJMock).getVisitCategory();
    doReturn(0L).when(benFlowOBJMock).getBeneficiaryRegID();
    doReturn(0L).when(benFlowOBJMock).getBenVisitCode();
    doReturn(0L).when(benFlowOBJMock).getBenFlowID();
    BeneficiaryFlowStatus beneficiaryFlowStatus2 = new BeneficiaryFlowStatus();
    beneficiaryFlowStatus2.setTCSpecialistUserID(1);
    beneficiaryFlowStatus.when(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any())).thenReturn(beneficiaryFlowStatus2);
    target = new CommonServiceImpl();
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    doReturn("return_of_getBenCovidNurseData1").when(covid19ServiceImplMock).getBenCovidNurseData(0L, 0L);
    doReturn("return_of_getBenCaseRecordFromDoctorCovid19").when(covid19ServiceImplMock).getBenCaseRecordFromDoctorCovid19(0L, 0L);
    ArrayList<Object[]> objectList = new ArrayList<>();
    doReturn(objectList).when(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
    doReturn(1).when(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
    //Act Statement(s)
    String result = target.getCaseSheetPrintDataForBeneficiary(benFlowOBJMock, "Authorization1");
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo("{nurseData=null, doctorData=null, BeneficiaryData=null, serviceID=4}"));
        verify(benFlowOBJMock).getVisitCategory();
        verify(benFlowOBJMock, times(3)).getBeneficiaryRegID();
        verify(benFlowOBJMock, times(2)).getBenVisitCode();
        verify(benFlowOBJMock).getBenFlowID();
        beneficiaryFlowStatus.verify(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any()));
        verify(covid19ServiceImplMock).getBenCovidNurseData(0L, 0L);
        verify(covid19ServiceImplMock).getBenCaseRecordFromDoctorCovid19(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
    });
}*/
    }

    //Sapient generated method id: ${711cb2a6-4437-3d92-970e-bd17f174f2dd}, hash: A7A14D664DCAD26D120637F3DF4F6D51
    @Test()
    void getCaseSheetPrintDataForBeneficiaryWhenSwitchVisitCategoryCaseCancer_ScreeningAndTcspIDIsNotNullAndTcspIDGreaterThan0() {
        /* Branches:* (null != visitCategory) : true* (visitCategory.length() > 0) : true* (switch(visitCategory) = "Cancer Screening") : true* (tcspID != null) : true  #  inside getBenDetails method* (tcspID > 0) : true  #  inside getBenDetails method** TODO: Help needed! This method is not unit testable!*  A variable could not be isolated or mocked when calling a method - Variable name: object of type Gson - Method: toJson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        //BeneficiaryFlowStatus benFlowOBJMock = mock(BeneficiaryFlowStatus.class);
        /*try (MockedStatic<BeneficiaryFlowStatus> beneficiaryFlowStatus = mockStatic(BeneficiaryFlowStatus.class)) {
    doReturn("Cancer Screening").when(benFlowOBJMock).getVisitCategory();
    doReturn(0L).when(benFlowOBJMock).getBeneficiaryRegID();
    doReturn(0L).when(benFlowOBJMock).getBenVisitCode();
    doReturn(0L).when(benFlowOBJMock).getBenFlowID();
    BeneficiaryFlowStatus beneficiaryFlowStatus2 = new BeneficiaryFlowStatus();
    beneficiaryFlowStatus2.setTCSpecialistUserID(1);
    beneficiaryFlowStatus.when(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any())).thenReturn(beneficiaryFlowStatus2);
    target = new CommonServiceImpl();
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    doReturn("return_of_getBenNurseDataForCaseSheet1").when(csServiceImplMock).getBenNurseDataForCaseSheet(0L, 0L);
    doReturn("return_of_getBenCaseRecordFromDoctorCS1").when(csServiceImplMock).getBenCaseRecordFromDoctorCS(0L, 0L);
    ArrayList<Object[]> objectList = new ArrayList<>();
    doReturn(objectList).when(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
    doReturn(1).when(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
    ArrayList<WrapperCancerExamImgAnotasn> wrapperCancerExamImgAnotasnList = new ArrayList<>();
    doReturn(wrapperCancerExamImgAnotasnList).when(cSNurseServiceImplMock).getCancerExaminationImageAnnotationCasesheet(0L, 0L);
    //Act Statement(s)
    String result = target.getCaseSheetPrintDataForBeneficiary(benFlowOBJMock, "Authorization1");
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo("{nurseData=null, doctorData=null, BeneficiaryData=null, ImageAnnotatedData=null, serviceID=4}"));
        verify(benFlowOBJMock).getVisitCategory();
        verify(benFlowOBJMock, times(4)).getBeneficiaryRegID();
        verify(benFlowOBJMock, times(3)).getBenVisitCode();
        verify(benFlowOBJMock).getBenFlowID();
        beneficiaryFlowStatus.verify(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any()));
        verify(csServiceImplMock).getBenNurseDataForCaseSheet(0L, 0L);
        verify(csServiceImplMock).getBenCaseRecordFromDoctorCS(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
        verify(cSNurseServiceImplMock).getCancerExaminationImageAnnotationCasesheet(0L, 0L);
    });
}*/
    }

    //Sapient generated method id: ${6c7cde93-3e1e-36c8-bd4a-fa95fcb5c124}, hash: FA8766342A12FBE52A1E5A9442F1FB4B
    @Test()
    void getCaseSheetPrintDataForBeneficiaryWhenSwitchVisitCategoryCaseGeneral_OPD__QC_AndTcspIDIsNotNullAndTcspIDGreaterThan0() {
        /* Branches:* (null != visitCategory) : true* (visitCategory.length() > 0) : true* (switch(visitCategory) = "General OPD (QC)") : true* (tcspID != null) : true  #  inside getBenDetails method* (tcspID > 0) : true  #  inside getBenDetails method** TODO: Help needed! This method is not unit testable!*  A variable could not be isolated or mocked when calling a method - Variable name: object of type Gson - Method: toJson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        //BeneficiaryFlowStatus benFlowOBJMock = mock(BeneficiaryFlowStatus.class);
        /*try (MockedStatic<BeneficiaryFlowStatus> beneficiaryFlowStatus = mockStatic(BeneficiaryFlowStatus.class)) {
    doReturn("General OPD (QC)").when(benFlowOBJMock).getVisitCategory();
    doReturn(0L).when(benFlowOBJMock).getBeneficiaryRegID();
    doReturn(0L).when(benFlowOBJMock).getBenVisitCode();
    doReturn(0L).when(benFlowOBJMock).getBenFlowID();
    BeneficiaryFlowStatus beneficiaryFlowStatus2 = new BeneficiaryFlowStatus();
    beneficiaryFlowStatus2.setTCSpecialistUserID(1);
    beneficiaryFlowStatus.when(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any())).thenReturn(beneficiaryFlowStatus2);
    target = new CommonServiceImpl();
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    doReturn("return_of_getBenQuickConsultNurseData1").when(quickConsultationServiceImplMock).getBenQuickConsultNurseData(0L, 0L);
    doReturn("return_of_getBenCaseRecordFromDoctorQuickConsult1").when(quickConsultationServiceImplMock).getBenCaseRecordFromDoctorQuickConsult(0L, 0L);
    ArrayList<Object[]> objectList = new ArrayList<>();
    doReturn(objectList).when(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
    doReturn(1).when(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
    //Act Statement(s)
    String result = target.getCaseSheetPrintDataForBeneficiary(benFlowOBJMock, "Authorization1");
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo("{nurseData=null, doctorData=null, BeneficiaryData=null, serviceID=4}"));
        verify(benFlowOBJMock).getVisitCategory();
        verify(benFlowOBJMock, times(3)).getBeneficiaryRegID();
        verify(benFlowOBJMock, times(2)).getBenVisitCode();
        verify(benFlowOBJMock).getBenFlowID();
        beneficiaryFlowStatus.verify(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any()));
        verify(quickConsultationServiceImplMock).getBenQuickConsultNurseData(0L, 0L);
        verify(quickConsultationServiceImplMock).getBenCaseRecordFromDoctorQuickConsult(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
    });
}*/
    }

    //Sapient generated method id: ${2e1ae6bc-ad25-3ea7-bfe7-2ac2123e451f}, hash: 8CDAA650F7EF4EB8C20EA2DB6A975200
    @Test()
    void getCaseSheetPrintDataForBeneficiaryWhenSwitchVisitCategoryCaseGeneral_OPDAndTcspIDIsNotNullAndTcspIDGreaterThan0() {
        /* Branches:* (null != visitCategory) : true* (visitCategory.length() > 0) : true* (switch(visitCategory) = "General OPD") : true* (tcspID != null) : true  #  inside getBenDetails method* (tcspID > 0) : true  #  inside getBenDetails method** TODO: Help needed! This method is not unit testable!*  A variable could not be isolated or mocked when calling a method - Variable name: object of type Gson - Method: toJson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        //BeneficiaryFlowStatus benFlowOBJMock = mock(BeneficiaryFlowStatus.class);
        /*try (MockedStatic<BeneficiaryFlowStatus> beneficiaryFlowStatus = mockStatic(BeneficiaryFlowStatus.class)) {
    doReturn("General OPD").when(benFlowOBJMock).getVisitCategory();
    doReturn(0L).when(benFlowOBJMock).getBeneficiaryRegID();
    doReturn(0L).when(benFlowOBJMock).getBenVisitCode();
    doReturn(0L).when(benFlowOBJMock).getBenFlowID();
    BeneficiaryFlowStatus beneficiaryFlowStatus2 = new BeneficiaryFlowStatus();
    beneficiaryFlowStatus2.setTCSpecialistUserID(1);
    beneficiaryFlowStatus.when(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any())).thenReturn(beneficiaryFlowStatus2);
    target = new CommonServiceImpl();
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    doReturn("return_of_getBenGeneralOPDNurseData1").when(generalOPDServiceImplMock).getBenGeneralOPDNurseData(0L, 0L);
    doReturn("return_of_getBenCaseRecordFromDoctorGeneralOPD1").when(generalOPDServiceImplMock).getBenCaseRecordFromDoctorGeneralOPD(0L, 0L);
    ArrayList<Object[]> objectList = new ArrayList<>();
    doReturn(objectList).when(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
    doReturn(1).when(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
    //Act Statement(s)
    String result = target.getCaseSheetPrintDataForBeneficiary(benFlowOBJMock, "Authorization1");
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo("{nurseData=null, doctorData=null, BeneficiaryData=null, serviceID=4}"));
        verify(benFlowOBJMock).getVisitCategory();
        verify(benFlowOBJMock, times(3)).getBeneficiaryRegID();
        verify(benFlowOBJMock, times(2)).getBenVisitCode();
        verify(benFlowOBJMock).getBenFlowID();
        beneficiaryFlowStatus.verify(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any()));
        verify(generalOPDServiceImplMock).getBenGeneralOPDNurseData(0L, 0L);
        verify(generalOPDServiceImplMock).getBenCaseRecordFromDoctorGeneralOPD(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
    });
}*/
    }

    //Sapient generated method id: ${acf75bb9-f45b-357a-b048-1d37bbafcc0f}, hash: 8616B89DB8D8801CAE2B97A4845F1B03
    @Test()
    void getCaseSheetPrintDataForBeneficiaryWhenSwitchVisitCategoryCaseNCD_careAndTcspIDIsNotNullAndTcspIDGreaterThan0() {
        /* Branches:* (null != visitCategory) : true* (visitCategory.length() > 0) : true* (switch(visitCategory) = "NCD care") : true* (tcspID != null) : true  #  inside getBenDetails method* (tcspID > 0) : true  #  inside getBenDetails method** TODO: Help needed! This method is not unit testable!*  A variable could not be isolated or mocked when calling a method - Variable name: object of type Gson - Method: toJson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        //BeneficiaryFlowStatus benFlowOBJMock = mock(BeneficiaryFlowStatus.class);
        /*try (MockedStatic<BeneficiaryFlowStatus> beneficiaryFlowStatus = mockStatic(BeneficiaryFlowStatus.class)) {
    doReturn("NCD care").when(benFlowOBJMock).getVisitCategory();
    doReturn(0L).when(benFlowOBJMock).getBeneficiaryRegID();
    doReturn(0L).when(benFlowOBJMock).getBenVisitCode();
    doReturn(0L).when(benFlowOBJMock).getBenFlowID();
    BeneficiaryFlowStatus beneficiaryFlowStatus2 = new BeneficiaryFlowStatus();
    beneficiaryFlowStatus2.setTCSpecialistUserID(1);
    beneficiaryFlowStatus.when(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any())).thenReturn(beneficiaryFlowStatus2);
    target = new CommonServiceImpl();
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    doReturn("return_of_getBenNCDCareNurseData1").when(ncdCareServiceImplMock).getBenNCDCareNurseData(0L, 0L);
    doReturn("return_of_getBenCaseRecordFromDoctorNCDCare1").when(ncdCareServiceImplMock).getBenCaseRecordFromDoctorNCDCare(0L, 0L);
    ArrayList<Object[]> objectList = new ArrayList<>();
    doReturn(objectList).when(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
    doReturn(1).when(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
    //Act Statement(s)
    String result = target.getCaseSheetPrintDataForBeneficiary(benFlowOBJMock, "Authorization1");
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo("{nurseData=null, doctorData=null, BeneficiaryData=null, serviceID=4}"));
        verify(benFlowOBJMock).getVisitCategory();
        verify(benFlowOBJMock, times(3)).getBeneficiaryRegID();
        verify(benFlowOBJMock, times(2)).getBenVisitCode();
        verify(benFlowOBJMock).getBenFlowID();
        beneficiaryFlowStatus.verify(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any()));
        verify(ncdCareServiceImplMock).getBenNCDCareNurseData(0L, 0L);
        verify(ncdCareServiceImplMock).getBenCaseRecordFromDoctorNCDCare(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
    });
}*/
    }

    //Sapient generated method id: ${d54338c3-ed34-3080-8c4d-16d5fa04c971}, hash: 93A2BA9AC47ECF47104CDC34BF6F9AFC
    @Test()
    void getCaseSheetPrintDataForBeneficiaryWhenSwitchVisitCategoryCaseNCD_screeningAndTcspIDIsNotNullAndTcspIDGreaterThan0() {
        /* Branches:* (null != visitCategory) : true* (visitCategory.length() > 0) : true* (switch(visitCategory) = "NCD screening") : true* (tcspID != null) : true  #  inside getBenDetails method* (tcspID > 0) : true  #  inside getBenDetails method** TODO: Help needed! This method is not unit testable!*  A variable could not be isolated or mocked when calling a method - Variable name: object of type Gson - Method: toJson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        //BeneficiaryFlowStatus benFlowOBJMock = mock(BeneficiaryFlowStatus.class);
        /*try (MockedStatic<BeneficiaryFlowStatus> beneficiaryFlowStatus = mockStatic(BeneficiaryFlowStatus.class)) {
    doReturn("NCD screening").when(benFlowOBJMock).getVisitCategory();
    doReturn(0L).when(benFlowOBJMock).getBeneficiaryRegID();
    doReturn(0L).when(benFlowOBJMock).getBenVisitCode();
    doReturn(0L).when(benFlowOBJMock).getBenFlowID();
    BeneficiaryFlowStatus beneficiaryFlowStatus2 = new BeneficiaryFlowStatus();
    beneficiaryFlowStatus2.setTCSpecialistUserID(1);
    beneficiaryFlowStatus.when(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any())).thenReturn(beneficiaryFlowStatus2);
    target = new CommonServiceImpl();
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    doReturn("return_of_getBenNCDScreeningNurseData1").when(ncdScreeningServiceImplMock).getBenNCDScreeningNurseData(0L, 0L);
    doReturn("return_of_getBenCaseRecordFromDoctorNCDScreening1").when(ncdScreeningServiceImplMock).getBenCaseRecordFromDoctorNCDScreening(0L, 0L);
    ArrayList<Object[]> objectList = new ArrayList<>();
    doReturn(objectList).when(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
    doReturn(1).when(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
    //Act Statement(s)
    String result = target.getCaseSheetPrintDataForBeneficiary(benFlowOBJMock, "Authorization1");
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo("{nurseData=null, doctorData=null, BeneficiaryData=null, serviceID=4}"));
        verify(benFlowOBJMock).getVisitCategory();
        verify(benFlowOBJMock, times(3)).getBeneficiaryRegID();
        verify(benFlowOBJMock, times(2)).getBenVisitCode();
        verify(benFlowOBJMock).getBenFlowID();
        beneficiaryFlowStatus.verify(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any()));
        verify(ncdScreeningServiceImplMock).getBenNCDScreeningNurseData(0L, 0L);
        verify(ncdScreeningServiceImplMock).getBenCaseRecordFromDoctorNCDScreening(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
    });
}*/
    }

    //Sapient generated method id: ${aa340d2f-3f52-3b18-8a9e-4860604191d0}, hash: DB43609E627F578BAA6D97A0E5033B1D
    @Test()
    void getCaseSheetPrintDataForBeneficiaryWhenSwitchVisitCategoryCasePNCAndTcspIDIsNotNullAndTcspIDGreaterThan0() {
        /* Branches:* (null != visitCategory) : true* (visitCategory.length() > 0) : true* (switch(visitCategory) = "PNC") : true* (tcspID != null) : true  #  inside getBenDetails method* (tcspID > 0) : true  #  inside getBenDetails method** TODO: Help needed! This method is not unit testable!*  A variable could not be isolated or mocked when calling a method - Variable name: object of type Gson - Method: toJson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        //BeneficiaryFlowStatus benFlowOBJMock = mock(BeneficiaryFlowStatus.class);
        /*try (MockedStatic<BeneficiaryFlowStatus> beneficiaryFlowStatus = mockStatic(BeneficiaryFlowStatus.class)) {
    doReturn("PNC").when(benFlowOBJMock).getVisitCategory();
    doReturn(0L).when(benFlowOBJMock).getBeneficiaryRegID();
    doReturn(0L).when(benFlowOBJMock).getBenVisitCode();
    doReturn(0L).when(benFlowOBJMock).getBenFlowID();
    BeneficiaryFlowStatus beneficiaryFlowStatus2 = new BeneficiaryFlowStatus();
    beneficiaryFlowStatus2.setTCSpecialistUserID(1);
    beneficiaryFlowStatus.when(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any())).thenReturn(beneficiaryFlowStatus2);
    target = new CommonServiceImpl();
    autoCloseableMocks = MockitoAnnotations.openMocks(this);
    doReturn("return_of_getBenPNCNurseData1").when(pncServiceImplMock).getBenPNCNurseData(0L, 0L);
    doReturn("return_of_getBenCaseRecordFromDoctorPNC1").when(pncServiceImplMock).getBenCaseRecordFromDoctorPNC(0L, 0L);
    ArrayList<Object[]> objectList = new ArrayList<>();
    doReturn(objectList).when(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
    doReturn(1).when(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
    //Act Statement(s)
    String result = target.getCaseSheetPrintDataForBeneficiary(benFlowOBJMock, "Authorization1");
    //Assert statement(s)
    assertAll("result", () -> {
        assertThat(result, equalTo("{nurseData=null, doctorData=null, BeneficiaryData=null, serviceID=4}"));
        verify(benFlowOBJMock).getVisitCategory();
        verify(benFlowOBJMock, times(3)).getBeneficiaryRegID();
        verify(benFlowOBJMock, times(2)).getBenVisitCode();
        verify(benFlowOBJMock).getBenFlowID();
        beneficiaryFlowStatus.verify(() -> BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel((ArrayList) any()));
        verify(pncServiceImplMock).getBenPNCNurseData(0L, 0L);
        verify(pncServiceImplMock).getBenCaseRecordFromDoctorPNC(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getBenDetailsForLeftSidePanel(0L, 0L);
        verify(beneficiaryFlowStatusRepoMock).getTCspecialistID(0L, 0L);
    });
}*/
    }

    //Sapient generated method id: ${7ed84e86-4078-392b-b55d-7058d72096a2}, hash: 1239C591C4F7AC91EA25C24B6549CB83
    @Test()
    void getBenPastHistoryDataTest() {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchBenPastMedicalHistory1").when(commonNurseServiceImplMock).fetchBenPastMedicalHistory(0L);
        //Act Statement(s)
        String result = target.getBenPastHistoryData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchBenPastMedicalHistory1"));
            verify(commonNurseServiceImplMock).fetchBenPastMedicalHistory(0L);
        });
    }

    //Sapient generated method id: ${04247f57-b2a0-3512-a0be-d9ce67a855a3}, hash: 38AE6CD684B66F4DC33902F08B15C46A
    @Test()
    void getComorbidHistoryDataTest() {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchBenComorbidityHistory1").when(commonNurseServiceImplMock).fetchBenComorbidityHistory(0L);
        //Act Statement(s)
        String result = target.getComorbidHistoryData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchBenComorbidityHistory1"));
            verify(commonNurseServiceImplMock).fetchBenComorbidityHistory(0L);
        });
    }

    //Sapient generated method id: ${b3b9bc0c-5880-3ea6-b096-5004e52888c1}, hash: 636EF3E0449E48A2403FD17B36F72D38
    @Test()
    void getMedicationHistoryDataTest() {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchBenPersonalMedicationHistory1").when(commonNurseServiceImplMock).fetchBenPersonalMedicationHistory(0L);
        //Act Statement(s)
        String result = target.getMedicationHistoryData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchBenPersonalMedicationHistory1"));
            verify(commonNurseServiceImplMock).fetchBenPersonalMedicationHistory(0L);
        });
    }

    //Sapient generated method id: ${b0b8a8e1-aa32-386a-a57a-3c8317252c57}, hash: 23D108E09208B758BE5BB3F1A3C87222
    @Test()
    void getPersonalTobaccoHistoryDataTest() {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchBenPersonalTobaccoHistory1").when(commonNurseServiceImplMock).fetchBenPersonalTobaccoHistory(0L);
        //Act Statement(s)
        String result = target.getPersonalTobaccoHistoryData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchBenPersonalTobaccoHistory1"));
            verify(commonNurseServiceImplMock).fetchBenPersonalTobaccoHistory(0L);
        });
    }

    //Sapient generated method id: ${ee225e1d-1223-3555-9320-738aa248edb2}, hash: 27D3C0529EC29C1FE36BF1951267360E
    @Test()
    void getPersonalAlcoholHistoryDataTest() {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchBenPersonalAlcoholHistory1").when(commonNurseServiceImplMock).fetchBenPersonalAlcoholHistory(0L);
        //Act Statement(s)
        String result = target.getPersonalAlcoholHistoryData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchBenPersonalAlcoholHistory1"));
            verify(commonNurseServiceImplMock).fetchBenPersonalAlcoholHistory(0L);
        });
    }

    //Sapient generated method id: ${305f08ef-5f58-36a0-9854-490620c3461c}, hash: 21455EE59979A7CC35BFCF83948C9276
    @Test()
    void getPersonalAllergyHistoryDataTest() {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchBenPersonalAllergyHistory1").when(commonNurseServiceImplMock).fetchBenPersonalAllergyHistory(0L);
        //Act Statement(s)
        String result = target.getPersonalAllergyHistoryData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchBenPersonalAllergyHistory1"));
            verify(commonNurseServiceImplMock).fetchBenPersonalAllergyHistory(0L);
        });
    }

    //Sapient generated method id: ${cc538a84-8f14-3b53-8f27-6a7cc15e9526}, hash: 42B86319C43BC2052B996A459BD387F7
    @Test()
    void getFamilyHistoryDataTest() {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchBenPersonalFamilyHistory1").when(commonNurseServiceImplMock).fetchBenPersonalFamilyHistory(0L);
        //Act Statement(s)
        String result = target.getFamilyHistoryData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchBenPersonalFamilyHistory1"));
            verify(commonNurseServiceImplMock).fetchBenPersonalFamilyHistory(0L);
        });
    }

    //Sapient generated method id: ${a1b3238c-3524-3b3b-a3cd-ea5bbe55024a}, hash: B7646C35F2CB827B06C5FEE1F36CF802
    @Test()
    void getProviderSpecificDataTest() throws IEMRException {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchProviderSpecificdata1").when(commonNurseServiceImplMock).fetchProviderSpecificdata("request1");
        //Act Statement(s)
        String result = target.getProviderSpecificData("request1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchProviderSpecificdata1"));
            verify(commonNurseServiceImplMock).fetchProviderSpecificdata("request1");
        });
    }

    //Sapient generated method id: ${2ac03fda-6638-367b-bea5-f5ef60ec51e0}, hash: DB212F0E25D0CC6E2673070D64D74978
    @Test()
    void getBenPhysicalHistoryTest() {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchBenPhysicalHistory1").when(commonNurseServiceImplMock).fetchBenPhysicalHistory(0L);
        //Act Statement(s)
        String result = target.getBenPhysicalHistory(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchBenPhysicalHistory1"));
            verify(commonNurseServiceImplMock).fetchBenPhysicalHistory(0L);
        });
    }

    //Sapient generated method id: ${179029d6-7e0f-3016-932b-6d84b1e53615}, hash: 8AE7731E109C1364AD4BCDFEBA8E341A
    @Test()
    void getMenstrualHistoryDataTest() {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchBenMenstrualHistory1").when(commonNurseServiceImplMock).fetchBenMenstrualHistory(0L);
        //Act Statement(s)
        String result = target.getMenstrualHistoryData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchBenMenstrualHistory1"));
            verify(commonNurseServiceImplMock).fetchBenMenstrualHistory(0L);
        });
    }

    //Sapient generated method id: ${c4f2598d-f2c2-3971-9fd1-d346ae1ef8f1}, hash: 39752EA1663F9F5CA15D72B1D6DFFE82
    @Test()
    void getObstetricHistoryDataTest() {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchBenPastObstetricHistory1").when(commonNurseServiceImplMock).fetchBenPastObstetricHistory(0L);
        //Act Statement(s)
        String result = target.getObstetricHistoryData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchBenPastObstetricHistory1"));
            verify(commonNurseServiceImplMock).fetchBenPastObstetricHistory(0L);
        });
    }

    //Sapient generated method id: ${8825bf23-7d41-3c93-bf9c-7fc47ca73df4}, hash: A94BE435D4A496EE83704856817DC7F1
    @Test()
    void getImmunizationHistoryDataTest() {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchBenImmunizationHistory1").when(commonNurseServiceImplMock).fetchBenImmunizationHistory(0L);
        //Act Statement(s)
        String result = target.getImmunizationHistoryData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchBenImmunizationHistory1"));
            verify(commonNurseServiceImplMock).fetchBenImmunizationHistory(0L);
        });
    }

    //Sapient generated method id: ${e83360c5-df23-32d0-8094-b40285a6b732}, hash: 933581910F080B965D220B23035FD305
    @Test()
    void getChildVaccineHistoryDataTest() {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchBenOptionalVaccineHistory1").when(commonNurseServiceImplMock).fetchBenOptionalVaccineHistory(0L);
        //Act Statement(s)
        String result = target.getChildVaccineHistoryData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchBenOptionalVaccineHistory1"));
            verify(commonNurseServiceImplMock).fetchBenOptionalVaccineHistory(0L);
        });
    }

    //Sapient generated method id: ${1e7840ee-6820-396d-957e-d94ccd47e965}, hash: 6B5AE241FC3B84D44A27A2B6A80963C7
    @Test()
    void getBenPerinatalHistoryDataTest() {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchBenPerinatalHistory1").when(commonNurseServiceImplMock).fetchBenPerinatalHistory(0L);
        //Act Statement(s)
        String result = target.getBenPerinatalHistoryData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchBenPerinatalHistory1"));
            verify(commonNurseServiceImplMock).fetchBenPerinatalHistory(0L);
        });
    }

    //Sapient generated method id: ${169e7285-8f6d-3e67-ba42-0edd9e1a7ec7}, hash: 566772C48F975BB33BE5973B682428AD
    @Test()
    void getBenFeedingHistoryDataTest() {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchBenFeedingHistory1").when(commonNurseServiceImplMock).fetchBenFeedingHistory(0L);
        //Act Statement(s)
        String result = target.getBenFeedingHistoryData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchBenFeedingHistory1"));
            verify(commonNurseServiceImplMock).fetchBenFeedingHistory(0L);
        });
    }

    //Sapient generated method id: ${181f1b82-f80a-3ebe-a8f7-15c98d2e2fc8}, hash: 97C791F5242180C64F242E9D95F402A5
    @Test()
    void getBenDevelopmentHistoryDataTest() {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_fetchBenDevelopmentHistory1").when(commonNurseServiceImplMock).fetchBenDevelopmentHistory(0L);
        //Act Statement(s)
        String result = target.getBenDevelopmentHistoryData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_fetchBenDevelopmentHistory1"));
            verify(commonNurseServiceImplMock).fetchBenDevelopmentHistory(0L);
        });
    }

    //Sapient generated method id: ${74f89a01-50dc-362c-ab9b-1a9badb54c30}, hash: CFB034DCBEDB9B2898230A9EDA54CE0B
    @Disabled()
    @Test()
    void getBenPreviousVisitDataForCaseRecordTest() throws IEMRException {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        CommonUtilityClass commonUtilityClassMock = mock(CommonUtilityClass.class);
        try (MockedStatic<BeneficiaryFlowStatus> beneficiaryFlowStatus = mockStatic(BeneficiaryFlowStatus.class);
             MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            doReturn(commonUtilityClassMock).when(inputMapperMock).fromJson("comingRequest1", CommonUtilityClass.class);
            doReturn(0L).when(commonUtilityClassMock).getBeneficiaryRegID();
            ArrayList<BeneficiaryFlowStatus> beneficiaryFlowStatusList = new ArrayList<>();
            beneficiaryFlowStatus.when(() -> BeneficiaryFlowStatus.getBeneficiaryPastVisitHistory((ArrayList) any())).thenReturn(beneficiaryFlowStatusList);
            target = new CommonServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Integer> integerList = new ArrayList<>();
            doReturn(integerList).when(providerServiceMappingRepoMock).getProviderServiceMapIdForServiceID((short) 4);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(beneficiaryFlowStatusRepoMock).getBenPreviousHistory(0L, integerList);
            //Act Statement(s)
            String result = target.getBenPreviousVisitDataForCaseRecord("comingRequest1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson("comingRequest1", CommonUtilityClass.class);
                verify(commonUtilityClassMock).getBeneficiaryRegID();
                beneficiaryFlowStatus.verify(() -> BeneficiaryFlowStatus.getBeneficiaryPastVisitHistory((ArrayList) any()));
                verify(providerServiceMappingRepoMock).getProviderServiceMapIdForServiceID((short) 4);
                verify(beneficiaryFlowStatusRepoMock).getBenPreviousHistory(0L, integerList);
            });
        }
    }

    //Sapient generated method id: ${c048c15a-214b-335d-8c3f-755fa41b7626}, hash: 1644DD21CA1EAA9C1B37F17546F97105
    @Disabled()
    @Test()
    void createTcRequestWhenJNotGreaterThan0ThrowsRuntimeException() throws Exception, IEMRException, ParseException {
        /* Branches:* (commonUtilityClass != null) : true* (requestOBJ != null) : true* (requestOBJ.has("tcRequest")) : true* (requestOBJ.get("tcRequest") != null) : true* (tcRequestOBJ != null) : true* (tcRequestOBJ.getUserID() != null) : true* (tcRequestOBJ.getUserID() > 0) : true* (tcRequestOBJ.getAllocationDate() != null) : true* (commonUtilityClass.getBenVisitID() != null) : true* (j > 0) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        TeleconsultationRequestOBJ teleconsultationRequestOBJMock = mock(TeleconsultationRequestOBJ.class);
        InputMapper inputMapperMock2 = mock(InputMapper.class);
        TCRequestModel tCRequestModelMock = mock(TCRequestModel.class);
        try (MockedStatic<Utility> utility = mockStatic(Utility.class);
             MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            JsonNull jsonNull = new JsonNull();
            doReturn(teleconsultationRequestOBJMock).when(inputMapperMock).fromJson(jsonNull, TeleconsultationRequestOBJ.class);
            doReturn(0, 1, 0).when(teleconsultationRequestOBJMock).getUserID();
            Timestamp timestamp = new Timestamp(0L);
            Timestamp timestamp2 = new Timestamp(0L);
            Timestamp timestamp3 = new Timestamp(0L);
            doNothing().when(teleconsultationRequestOBJMock).setAllocationDate(timestamp3);
            doReturn(0).when(teleconsultationRequestOBJMock).getSpecializationID();
            Timestamp timestamp4 = new Timestamp(0L);
            doReturn(timestamp, timestamp2, timestamp4).when(teleconsultationRequestOBJMock).getAllocationDate();
            doReturn("A", "B", "return_of_getFromTime1").when(teleconsultationRequestOBJMock).getFromTime();
            doReturn("C", "return_of_getToTime1").when(teleconsultationRequestOBJMock).getToTime();
            utility.when(() -> Utility.combineDateAndTimeToDateTime("createTcRequest_timestamp2", "A")).thenReturn(timestamp3);
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock).thenReturn(inputMapperMock2);
            JsonObject jsonObject = new JsonObject();
            doReturn(tCRequestModelMock).when(inputMapperMock2).fromJson(jsonObject, TCRequestModel.class);
            doNothing().when(tCRequestModelMock).setBeneficiaryRegID(0L);
            doNothing().when(tCRequestModelMock).setProviderServiceMapID(0);
            doNothing().when(tCRequestModelMock).setVisitCode(0L);
            doNothing().when(tCRequestModelMock).setBenVisitID(0L);
            doNothing().when(tCRequestModelMock).setUserID(0);
            doNothing().when(tCRequestModelMock).setSpecializationID(0);
            doNothing().when(tCRequestModelMock).setRequestDate(timestamp4);
            doNothing().when(tCRequestModelMock).setDuration_minute(0L);
            doNothing().when(tCRequestModelMock).setVanID(0);
            doReturn(0).when(tCRequestModelMock).getUserID();
            Timestamp timestamp5 = new Timestamp(0L);
            doReturn(timestamp5).when(tCRequestModelMock).getRequestDate();
            utility.when(() -> Utility.timeDiff("B", "C")).thenReturn(0L);
            target = new CommonServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(0).when(commonDoctorServiceImplMock).callTmForSpecialistSlotBook((TcSpecialistSlotBookingRequestOBJ) any(), eq("Authorization1"));
            CommonUtilityClass commonUtilityClass = new CommonUtilityClass();
            commonUtilityClass.setBenVisitID(0L);
            commonUtilityClass.setVanID(0);
            commonUtilityClass.setBeneficiaryRegID(0L);
            commonUtilityClass.setCreatedBy("createdBy1");
            commonUtilityClass.setVisitCode(0L);
            commonUtilityClass.setProviderServiceMapID(0);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                target.createTcRequest(jsonObject, commonUtilityClass, "Authorization1");
            });
            RuntimeException runtimeException = new RuntimeException("Already Booked Slot, Please choose another slot");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(runtimeException.getMessage()));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(2));
                verify(inputMapperMock).fromJson(jsonNull, TeleconsultationRequestOBJ.class);
                verify(teleconsultationRequestOBJMock, times(3)).getUserID();
                verify(teleconsultationRequestOBJMock, times(3)).getAllocationDate();
                verify(teleconsultationRequestOBJMock, times(3)).getFromTime();
                verify(teleconsultationRequestOBJMock).setAllocationDate(timestamp3);
                verify(teleconsultationRequestOBJMock).getSpecializationID();
                verify(teleconsultationRequestOBJMock, times(2)).getToTime();
                utility.verify(() -> Utility.combineDateAndTimeToDateTime("createTcRequest_timestamp2", "A"), atLeast(1));
                verify(inputMapperMock2).fromJson(jsonObject, TCRequestModel.class);
                verify(tCRequestModelMock).setBeneficiaryRegID(0L);
                verify(tCRequestModelMock).setProviderServiceMapID(0);
                verify(tCRequestModelMock).setVisitCode(0L);
                verify(tCRequestModelMock).setBenVisitID(0L);
                verify(tCRequestModelMock).setUserID(0);
                verify(tCRequestModelMock).setSpecializationID(0);
                verify(tCRequestModelMock).setRequestDate(timestamp4);
                verify(tCRequestModelMock).setDuration_minute(0L);
                verify(tCRequestModelMock).setVanID(0);
                verify(tCRequestModelMock).getUserID();
                verify(tCRequestModelMock).getRequestDate();
                utility.verify(() -> Utility.timeDiff("B", "C"), atLeast(1));
                verify(commonDoctorServiceImplMock).callTmForSpecialistSlotBook((TcSpecialistSlotBookingRequestOBJ) any(), eq("Authorization1"));
            });
        }
    }

    //Sapient generated method id: ${562bfdc8-2097-335a-9e0a-eac26f9799f9}, hash: 81D49BE6ED168C7291AEC67BF342A45D
    @Disabled()
    @Test()
    void createTcRequestWhenTcRequestStatusFlagGreaterThan0() throws Exception, IEMRException, ParseException {
        /* Branches:* (commonUtilityClass != null) : true* (requestOBJ != null) : true* (requestOBJ.has("tcRequest")) : true* (requestOBJ.get("tcRequest") != null) : true* (tcRequestOBJ != null) : true* (tcRequestOBJ.getUserID() != null) : true* (tcRequestOBJ.getUserID() > 0) : true* (tcRequestOBJ.getAllocationDate() != null) : true* (commonUtilityClass.getBenVisitID() != null) : true* (j > 0) : true* (tcRequestStatusFlag != null) : true* (tcRequestStatusFlag > 0) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        TeleconsultationRequestOBJ teleconsultationRequestOBJMock = mock(TeleconsultationRequestOBJ.class);
        InputMapper inputMapperMock2 = mock(InputMapper.class);
        TCRequestModel tCRequestModelMock = mock(TCRequestModel.class);
        try (MockedStatic<Utility> utility = mockStatic(Utility.class);
             MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            JsonNull jsonNull = new JsonNull();
            doReturn(teleconsultationRequestOBJMock).when(inputMapperMock).fromJson(jsonNull, TeleconsultationRequestOBJ.class);
            doReturn(0, 1, 0).when(teleconsultationRequestOBJMock).getUserID();
            Timestamp timestamp = new Timestamp(0L);
            Timestamp timestamp2 = new Timestamp(0L);
            Timestamp timestamp3 = new Timestamp(0L);
            doNothing().when(teleconsultationRequestOBJMock).setAllocationDate(timestamp3);
            doReturn(0).when(teleconsultationRequestOBJMock).getSpecializationID();
            Timestamp timestamp4 = new Timestamp(0L);
            doReturn(timestamp, timestamp2, timestamp4).when(teleconsultationRequestOBJMock).getAllocationDate();
            doReturn("A", "B", "return_of_getFromTime1").when(teleconsultationRequestOBJMock).getFromTime();
            doReturn("C", "return_of_getToTime1").when(teleconsultationRequestOBJMock).getToTime();
            doNothing().when(teleconsultationRequestOBJMock).setTmRequestID(1L);
            utility.when(() -> Utility.combineDateAndTimeToDateTime("createTcRequest_timestamp2", "A")).thenReturn(timestamp3);
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock).thenReturn(inputMapperMock2);
            JsonObject jsonObject = new JsonObject();
            doReturn(tCRequestModelMock).when(inputMapperMock2).fromJson(jsonObject, TCRequestModel.class);
            doNothing().when(tCRequestModelMock).setBeneficiaryRegID(0L);
            doNothing().when(tCRequestModelMock).setProviderServiceMapID(0);
            doNothing().when(tCRequestModelMock).setVisitCode(0L);
            doNothing().when(tCRequestModelMock).setBenVisitID(0L);
            doNothing().when(tCRequestModelMock).setUserID(0);
            doNothing().when(tCRequestModelMock).setSpecializationID(0);
            doNothing().when(tCRequestModelMock).setRequestDate(timestamp4);
            doNothing().when(tCRequestModelMock).setDuration_minute(1L);
            doNothing().when(tCRequestModelMock).setVanID(0);
            doReturn(0).when(tCRequestModelMock).getUserID();
            Timestamp timestamp5 = new Timestamp(0L);
            doReturn(timestamp5).when(tCRequestModelMock).getRequestDate();
            utility.when(() -> Utility.timeDiff("B", "C")).thenReturn(1L);
            target = new CommonServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1).when(commonDoctorServiceImplMock).callTmForSpecialistSlotBook((TcSpecialistSlotBookingRequestOBJ) any(), eq("Authorization1"));
            doReturn(1L).when(teleConsultationServiceImplMock).createTCRequest(tCRequestModelMock);
            CommonUtilityClass commonUtilityClass = new CommonUtilityClass();
            commonUtilityClass.setBenVisitID(0L);
            commonUtilityClass.setVanID(0);
            commonUtilityClass.setBeneficiaryRegID(0L);
            commonUtilityClass.setCreatedBy("createdBy1");
            commonUtilityClass.setVisitCode(0L);
            commonUtilityClass.setProviderServiceMapID(0);
            //Act Statement(s)
            TeleconsultationRequestOBJ result = target.createTcRequest(jsonObject, commonUtilityClass, "Authorization1");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(teleconsultationRequestOBJMock));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(2));
                verify(inputMapperMock).fromJson(jsonNull, TeleconsultationRequestOBJ.class);
                verify(teleconsultationRequestOBJMock, atLeast(3)).getUserID();
                verify(teleconsultationRequestOBJMock, atLeast(3)).getAllocationDate();
                verify(teleconsultationRequestOBJMock, atLeast(3)).getFromTime();
                verify(teleconsultationRequestOBJMock, atLeast(1)).setAllocationDate(timestamp3);
                verify(teleconsultationRequestOBJMock, atLeast(1)).getSpecializationID();
                verify(teleconsultationRequestOBJMock, atLeast(2)).getToTime();
                verify(teleconsultationRequestOBJMock, atLeast(1)).setTmRequestID(1L);
                utility.verify(() -> Utility.combineDateAndTimeToDateTime("createTcRequest_timestamp2", "A"), atLeast(1));
                verify(inputMapperMock2).fromJson(jsonObject, TCRequestModel.class);
                verify(tCRequestModelMock).setBeneficiaryRegID(0L);
                verify(tCRequestModelMock).setProviderServiceMapID(0);
                verify(tCRequestModelMock).setVisitCode(0L);
                verify(tCRequestModelMock).setBenVisitID(0L);
                verify(tCRequestModelMock).setUserID(0);
                verify(tCRequestModelMock).setSpecializationID(0);
                verify(tCRequestModelMock).setRequestDate(timestamp4);
                verify(tCRequestModelMock).setDuration_minute(1L);
                verify(tCRequestModelMock).setVanID(0);
                verify(tCRequestModelMock).getUserID();
                verify(tCRequestModelMock).getRequestDate();
                utility.verify(() -> Utility.timeDiff("B", "C"), atLeast(1));
                verify(commonDoctorServiceImplMock).callTmForSpecialistSlotBook((TcSpecialistSlotBookingRequestOBJ) any(), eq("Authorization1"));
                verify(teleConsultationServiceImplMock).createTCRequest(tCRequestModelMock);
            });
        }
    }

    //Sapient generated method id: ${3a3e1ea0-0705-3687-b934-4ac3195bb578}, hash: 3F81A124BE206294FAE9437540829213
    @Disabled()
    @Test()
    void createTcRequestWhenTcRequestStatusFlagNotGreaterThan0ThrowsRuntimeException() throws Exception, IEMRException, ParseException {
        /* Branches:* (commonUtilityClass != null) : true* (requestOBJ != null) : true* (requestOBJ.has("tcRequest")) : true* (requestOBJ.get("tcRequest") != null) : true* (tcRequestOBJ != null) : true* (tcRequestOBJ.getUserID() != null) : true* (tcRequestOBJ.getUserID() > 0) : true* (tcRequestOBJ.getAllocationDate() != null) : true* (commonUtilityClass.getBenVisitID() != null) : true* (j > 0) : true* (tcRequestStatusFlag != null) : true* (tcRequestStatusFlag > 0) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        TeleconsultationRequestOBJ teleconsultationRequestOBJMock = mock(TeleconsultationRequestOBJ.class);
        InputMapper inputMapperMock2 = mock(InputMapper.class);
        TCRequestModel tCRequestModelMock = mock(TCRequestModel.class);
        try (MockedStatic<Utility> utility = mockStatic(Utility.class);
             MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            JsonNull jsonNull = new JsonNull();
            doReturn(teleconsultationRequestOBJMock).when(inputMapperMock).fromJson(jsonNull, TeleconsultationRequestOBJ.class);
            doReturn(0, 1, 0).when(teleconsultationRequestOBJMock).getUserID();
            Timestamp timestamp = new Timestamp(0L);
            Timestamp timestamp2 = new Timestamp(0L);
            Timestamp timestamp3 = new Timestamp(0L);
            doNothing().when(teleconsultationRequestOBJMock).setAllocationDate(timestamp3);
            doReturn(0).when(teleconsultationRequestOBJMock).getSpecializationID();
            Timestamp timestamp4 = new Timestamp(0L);
            doReturn(timestamp, timestamp2, timestamp4).when(teleconsultationRequestOBJMock).getAllocationDate();
            doReturn("A", "B", "return_of_getFromTime1").when(teleconsultationRequestOBJMock).getFromTime();
            doReturn("C", "return_of_getToTime1").when(teleconsultationRequestOBJMock).getToTime();
            utility.when(() -> Utility.combineDateAndTimeToDateTime("createTcRequest_timestamp2", "A")).thenReturn(timestamp3);
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock).thenReturn(inputMapperMock2);
            JsonObject jsonObject = new JsonObject();
            doReturn(tCRequestModelMock).when(inputMapperMock2).fromJson(jsonObject, TCRequestModel.class);
            doNothing().when(tCRequestModelMock).setBeneficiaryRegID(0L);
            doNothing().when(tCRequestModelMock).setProviderServiceMapID(0);
            doNothing().when(tCRequestModelMock).setVisitCode(0L);
            doNothing().when(tCRequestModelMock).setBenVisitID(0L);
            doNothing().when(tCRequestModelMock).setUserID(0);
            doNothing().when(tCRequestModelMock).setSpecializationID(0);
            doNothing().when(tCRequestModelMock).setRequestDate(timestamp4);
            doNothing().when(tCRequestModelMock).setDuration_minute(-1L);
            doNothing().when(tCRequestModelMock).setVanID(0);
            doReturn(0).when(tCRequestModelMock).getUserID();
            Timestamp timestamp5 = new Timestamp(0L);
            doReturn(timestamp5).when(tCRequestModelMock).getRequestDate();
            utility.when(() -> Utility.timeDiff("B", "C")).thenReturn(-1L);
            target = new CommonServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(1).when(commonDoctorServiceImplMock).callTmForSpecialistSlotBook((TcSpecialistSlotBookingRequestOBJ) any(), eq("Authorization1"));
            doReturn(-1L).when(teleConsultationServiceImplMock).createTCRequest(tCRequestModelMock);
            CommonUtilityClass commonUtilityClass = new CommonUtilityClass();
            commonUtilityClass.setBenVisitID(0L);
            commonUtilityClass.setVanID(0);
            commonUtilityClass.setBeneficiaryRegID(0L);
            commonUtilityClass.setCreatedBy("createdBy1");
            commonUtilityClass.setVisitCode(0L);
            commonUtilityClass.setProviderServiceMapID(0);
            //Act Statement(s)
            final RuntimeException result = assertThrows(RuntimeException.class, () -> {
                target.createTcRequest(jsonObject, commonUtilityClass, "Authorization1");
            });
            RuntimeException runtimeException = new RuntimeException("Error while creating TC request.");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, is(notNullValue()));
                assertThat(result.getMessage(), equalTo(runtimeException.getMessage()));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(2));
                verify(inputMapperMock).fromJson(jsonNull, TeleconsultationRequestOBJ.class);
                verify(teleconsultationRequestOBJMock, times(3)).getUserID();
                verify(teleconsultationRequestOBJMock, times(3)).getAllocationDate();
                verify(teleconsultationRequestOBJMock, times(3)).getFromTime();
                verify(teleconsultationRequestOBJMock).setAllocationDate(timestamp3);
                verify(teleconsultationRequestOBJMock).getSpecializationID();
                verify(teleconsultationRequestOBJMock, times(2)).getToTime();
                utility.verify(() -> Utility.combineDateAndTimeToDateTime("createTcRequest_timestamp2", "A"), atLeast(1));
                verify(inputMapperMock2).fromJson(jsonObject, TCRequestModel.class);
                verify(tCRequestModelMock).setBeneficiaryRegID(0L);
                verify(tCRequestModelMock).setProviderServiceMapID(0);
                verify(tCRequestModelMock).setVisitCode(0L);
                verify(tCRequestModelMock).setBenVisitID(0L);
                verify(tCRequestModelMock).setUserID(0);
                verify(tCRequestModelMock).setSpecializationID(0);
                verify(tCRequestModelMock).setRequestDate(timestamp4);
                verify(tCRequestModelMock).setDuration_minute(-1L);
                verify(tCRequestModelMock).setVanID(0);
                verify(tCRequestModelMock).getUserID();
                verify(tCRequestModelMock).getRequestDate();
                utility.verify(() -> Utility.timeDiff("B", "C"), atLeast(1));
                verify(commonDoctorServiceImplMock).callTmForSpecialistSlotBook((TcSpecialistSlotBookingRequestOBJ) any(), eq("Authorization1"));
                verify(teleConsultationServiceImplMock).createTCRequest(tCRequestModelMock);
            });
        }
    }

    //Sapient generated method id: ${0cbd137c-78c5-38d7-b334-8019dcc6c31e}, hash: 67C85AFFB2485FC65E55337FF4A313DF
    @Disabled()
    @Test()
    void getOpenKMDocURLWhenObjNotHasFileID() throws JSONException {
        /* Branches:* (obj.has("fileID")) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.getOpenKMDocURL("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, is(nullValue())));
    }

    //Sapient generated method id: ${eadec2a9-8325-3e4d-962a-1ddc181fad4b}, hash: 94D256D667CAF4E10D18A87455A477B1
    @Disabled()
    @Test()
    void getOpenKMDocURLWhenFileUUIDIsNotNull() throws JSONException, RestClientException {
        /* Branches:* (obj.has("fileID")) : true* (fileUUID != null) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: restTemplate, obj, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getFileUUID1").when(benVisitDetailRepoMock).getFileUUID(0);
        //Act Statement(s)
        String result = target.getOpenKMDocURL("requestOBJ1", "A");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("null"));
            verify(benVisitDetailRepoMock).getFileUUID(0);
        });
    }

    //Sapient generated method id: ${ad3b1f80-b272-383b-b6a2-df96ffba2a8d}, hash: AFFDB27CC7D96D17DD5D974D6D510B6E
    @Disabled()
    @Test()
    void getOpenKMDocURLWhenFileUUIDIsNull() throws JSONException {
        /* Branches:* (obj.has("fileID")) : true* (fileUUID != null) : false** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: obj*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(benVisitDetailRepoMock).getFileUUID(0);
        //Act Statement(s)
        String result = target.getOpenKMDocURL("requestOBJ1", "Authorization1");
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(benVisitDetailRepoMock).getFileUUID(0);
        });
    }

    //Sapient generated method id: ${54e6dd0d-e241-34f8-9f9b-bd589953963c}, hash: C6B64156F3BA28B5FA921D77E97ABD6C
    @Test()
    void getBenSymptomaticQuestionnaireDetailsDataTest() throws Exception {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getBenSymptomaticData1").when(commonNurseServiceImplMock).getBenSymptomaticData(0L);
        //Act Statement(s)
        String result = target.getBenSymptomaticQuestionnaireDetailsData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getBenSymptomaticData1"));
            verify(commonNurseServiceImplMock).getBenSymptomaticData(0L);
        });
    }

    //Sapient generated method id: ${ff762fc2-4396-34a4-b10f-2e98e5f07bda}, hash: 3937C8F719F878FB28E16C875EC8B3C8
    @Test()
    void getBenPreviousDiabetesDataTest() throws Exception {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getBenPreviousDiabetesData1").when(commonNurseServiceImplMock).getBenPreviousDiabetesData(0L);
        //Act Statement(s)
        String result = target.getBenPreviousDiabetesData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getBenPreviousDiabetesData1"));
            verify(commonNurseServiceImplMock).getBenPreviousDiabetesData(0L);
        });
    }

    //Sapient generated method id: ${2126066f-d969-376b-b255-eb5aac016db2}, hash: D63DA2648F05197B396F70846F4A4EF5
    @Test()
    void getBenPreviousReferralDataTest() throws Exception {
        //Arrange Statement(s)
        target = new CommonServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("return_of_getBenPreviousReferralData1").when(commonNurseServiceImplMock).getBenPreviousReferralData(0L);
        //Act Statement(s)
        String result = target.getBenPreviousReferralData(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("return_of_getBenPreviousReferralData1"));
            verify(commonNurseServiceImplMock).getBenPreviousReferralData(0L);
        });
    }
}
