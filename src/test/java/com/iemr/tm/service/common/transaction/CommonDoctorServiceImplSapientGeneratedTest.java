package com.iemr.tm.service.common.transaction;

import org.junit.jupiter.api.Timeout;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.iemr.tm.utils.exception.IEMRException;
import org.json.JSONException;
import org.springframework.web.client.RestClientException;
import com.iemr.tm.data.masterdata.anc.ServiceMaster;
import com.iemr.tm.data.anc.WrapperAncFindings;
import org.mockito.MockitoAnnotations;
import com.iemr.tm.repo.foetalmonitor.FoetalMonitorRepo;
import com.iemr.tm.data.quickConsultation.LabTestOrderDetail;

import java.util.ArrayList;

import com.iemr.tm.utils.mapper.OutputMapper;
import com.iemr.tm.data.tele_consultation.TeleconsultationRequestOBJ;
import com.google.gson.JsonObject;
import com.iemr.tm.service.benFlowStatus.CommonBenStatusFlowServiceImpl;
import com.iemr.tm.data.nurse.CommonUtilityClass;
import com.iemr.tm.repo.quickConsultation.BenChiefComplaintRepo;
import com.iemr.tm.data.snomedct.SCTDescription;
import com.iemr.tm.repo.doctor.DocWorkListRepo;
import com.iemr.tm.repo.quickConsultation.BenClinicalObservationsRepo;

import java.sql.Timestamp;

import com.iemr.tm.data.anc.WrapperBenInvestigationANC;

import java.util.List;

import com.iemr.tm.repo.tc_consultation.TeleconsultationStatsRepo;
import com.iemr.tm.repo.benFlowStatus.BeneficiaryFlowStatusRepo;
import com.iemr.tm.data.doctor.BenReferDetails;
import com.iemr.tm.data.benFlowStatus.BeneficiaryFlowStatus;
import com.iemr.tm.repo.nurse.ncdcare.NCDCareDiagnosisRepo;
import com.google.gson.Gson;
import com.iemr.tm.data.tele_consultation.TeleconsultationStats;
import com.iemr.tm.data.registrar.WrapperRegWorklist;
import com.iemr.tm.data.quickConsultation.BenChiefComplaint;
import com.iemr.tm.repo.quickConsultation.LabTestOrderDetailRepo;

import java.sql.Date;

import com.iemr.tm.repo.quickConsultation.PrescriptionDetailRepo;
import com.iemr.tm.repo.nurse.pnc.PNCDiagnosisRepo;
import com.iemr.tm.data.quickConsultation.BenClinicalObservations;
import com.iemr.tm.repo.tc_consultation.TCRequestModelRepo;
import org.json.JSONObject;
import com.iemr.tm.service.snomedct.SnomedServiceImpl;
import com.iemr.tm.service.tele_consultation.SMSGatewayServiceImpl;
import com.iemr.tm.data.tele_consultation.TcSpecialistSlotBookingRequestOBJ;
import org.mockito.MockedStatic;
import com.iemr.tm.data.quickConsultation.PrescribedDrugDetail;
import com.iemr.tm.repo.doctor.BenReferDetailsRepo;
import com.iemr.tm.utils.mapper.InputMapper;
import com.iemr.tm.repo.quickConsultation.PrescribedDrugDetailRepo;
import com.iemr.tm.data.foetalmonitor.FoetalMonitor;

import static org.mockito.Mockito.doNothing;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.Mockito.verify;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.atLeast;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Disabled;

@Timeout(value = 5, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
class CommonDoctorServiceImplSapientGeneratedTest {

    private final BenClinicalObservationsRepo benClinicalObservationsRepoMock = mock(BenClinicalObservationsRepo.class, "benClinicalObservationsRepo");

    private final TCRequestModelRepo tCRequestModelRepoMock = mock(TCRequestModelRepo.class, "tCRequestModelRepo");

    private final PNCDiagnosisRepo pNCDiagnosisRepoMock = mock(PNCDiagnosisRepo.class, "pNCDiagnosisRepo");

    private final PrescriptionDetailRepo prescriptionDetailRepoMock = mock(PrescriptionDetailRepo.class, "prescriptionDetailRepo");

    private final NCDCareDiagnosisRepo NCDCareDiagnosisRepoMock = mock(NCDCareDiagnosisRepo.class, "NCDCareDiagnosisRepo");

    private final SMSGatewayServiceImpl sMSGatewayServiceImplMock = mock(SMSGatewayServiceImpl.class, "sMSGatewayServiceImpl");

    private final FoetalMonitorRepo foetalMonitorRepoMock = mock(FoetalMonitorRepo.class, "foetalMonitorRepo");

    private final TeleconsultationStatsRepo teleconsultationStatsRepoMock = mock(TeleconsultationStatsRepo.class, "teleconsultationStatsRepo");

    private final BenChiefComplaintRepo benChiefComplaintRepoMock = mock(BenChiefComplaintRepo.class, "benChiefComplaintRepo");

    private final SnomedServiceImpl snomedServiceImplMock = mock(SnomedServiceImpl.class, "snomedServiceImpl");

    private final DocWorkListRepo docWorkListRepoMock = mock(DocWorkListRepo.class, "docWorkListRepo");

    private final BeneficiaryFlowStatusRepo beneficiaryFlowStatusRepoMock = mock(BeneficiaryFlowStatusRepo.class, "beneficiaryFlowStatusRepo");

    private final BenReferDetailsRepo benReferDetailsRepoMock = mock(BenReferDetailsRepo.class, "benReferDetailsRepo");

    private final LabTestOrderDetailRepo labTestOrderDetailRepoMock = mock(LabTestOrderDetailRepo.class, "labTestOrderDetailRepo");

    private final PrescribedDrugDetailRepo prescribedDrugDetailRepoMock = mock(PrescribedDrugDetailRepo.class, "prescribedDrugDetailRepo");

    private final CommonBenStatusFlowServiceImpl commonBenStatusFlowServiceImplMock = mock(CommonBenStatusFlowServiceImpl.class, "commonBenStatusFlowServiceImpl");

    private AutoCloseable autoCloseableMocks;

    @InjectMocks()
    private CommonDoctorServiceImpl target;

    @AfterEach()
    public void afterTest() throws Exception {
        if (autoCloseableMocks != null)
            autoCloseableMocks.close();
    }

    //Sapient generated method id: ${1bf659b6-563e-32ca-a0e2-86c2b4a46be2}, hash: DC75DC924EBA0EB222F5858EB5FF5BB9
    @Test()
    void saveFindingsWhenBenClinicalObservationsRSIsNotNull() throws Exception, IEMRException {
        /* Branches:* (benClinicalObservationsRS != null) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BenClinicalObservations benClinicalObservationsMock = mock(BenClinicalObservations.class);
        BenClinicalObservations benClinicalObservationsMock2 = mock(BenClinicalObservations.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            JsonObject jsonObject = new JsonObject();
            doReturn(benClinicalObservationsMock).when(inputMapperMock).fromJson(jsonObject, BenClinicalObservations.class);
            target = new CommonDoctorServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            doReturn(benClinicalObservationsMock2).when(benClinicalObservationsRepoMock).save(benClinicalObservationsMock);
            //Act Statement(s)
            Integer result = target.saveFindings(jsonObject);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(1));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson(jsonObject, BenClinicalObservations.class);
                verify(benClinicalObservationsRepoMock).save(benClinicalObservationsMock);
            });
        }
    }

    //Sapient generated method id: ${44a75911-3c21-3277-93f8-afde48d9634f}, hash: 2730955DE6E97C1E5D7A7D2DB93ACE1F
    @Test()
    void saveDocFindingsWhenTmpBenCHiefComplaintsTMPSizeNotGreaterThan0AndClinicalObservationFlagGreaterThan0AndChiefComFlagGrea() {
        /* Branches:* (responseString != null) : true  #  inside getBenClinicalObservations method* (responseString.length > 1) : true  #  inside getBenClinicalObservations method* (benClinicalObservationsRS != null) : true* (tmpBenCHiefComplaints.size() > 0) : true* (for-each(tmpBenCHiefComplaints)) : true* (benChiefComplaint.getChiefComplaint() != null) : false* (tmpBenCHiefComplaintsTMP.size() > 0) : false* (clinicalObservationFlag > 0) : true* (chiefComFlag > 0) : true*/
        //Arrange Statement(s)
        target = spy(new CommonDoctorServiceImpl());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        String[] stringArray = new String[]{"return_of_getSnomedCTcodeItem1", "return_of_getSnomedCTcodeItem1"};
        doReturn(stringArray).when(target).getSnomedCTcode("otherSymptoms1");
        BenClinicalObservations benClinicalObservationsMock = mock(BenClinicalObservations.class);
        doReturn(benClinicalObservationsMock).when(benClinicalObservationsRepoMock).save((BenClinicalObservations) any());
        BenChiefComplaint benChiefComplaint = new BenChiefComplaint();
        benChiefComplaint.setChiefComplaint((String) null);
        ArrayList<BenChiefComplaint> benChiefComplaintList = new ArrayList<>();
        benChiefComplaintList.add(benChiefComplaint);
        WrapperAncFindings wrapperAncFindings = new WrapperAncFindings(0L, 0L, 0, "createdBy1", "clinicalObservation1", "otherSymptoms1", "significantFindings1", benChiefComplaintList);
        wrapperAncFindings.setVanID(0);
        wrapperAncFindings.setParkingPlaceID(0);
        wrapperAncFindings.setVisitCode(0L);
        wrapperAncFindings.setModifiedBy("modifiedBy1");
        wrapperAncFindings.setIsForHistory(false);
        //Act Statement(s)
        Integer result = target.saveDocFindings(wrapperAncFindings);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(1));
            verify(target).getSnomedCTcode("otherSymptoms1");
            verify(benClinicalObservationsRepoMock).save((BenClinicalObservations) any());
        });
    }

    //Sapient generated method id: ${56ae99ba-5d53-3ff3-b6e7-8fa30f2331b0}, hash: D2DDC03D39F354BC2487EA4F49D1F74C
    @Test()
    void saveDocFindingsWhenTmpBenCHiefComplaintsTMPSizeEqualsBenChiefComplaintListRSSizeAndClinicalObservationFlagGreaterThan0A() {
        /* Branches:* (responseString != null) : true  #  inside getBenClinicalObservations method* (responseString.length > 1) : true  #  inside getBenClinicalObservations method* (benClinicalObservationsRS != null) : true* (tmpBenCHiefComplaints.size() > 0) : true* (for-each(tmpBenCHiefComplaints)) : true* (benChiefComplaint.getChiefComplaint() != null) : true* (tmpBenCHiefComplaintsTMP.size() > 0) : true* (tmpBenCHiefComplaintsTMP.size() == benChiefComplaintListRS.size()) : true* (clinicalObservationFlag > 0) : true* (chiefComFlag > 0) : true*/
        //Arrange Statement(s)
        target = spy(new CommonDoctorServiceImpl());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        String[] stringArray = new String[]{"return_of_getSnomedCTcodeItem1", "return_of_getSnomedCTcodeItem1"};
        doReturn(stringArray).when(target).getSnomedCTcode("otherSymptoms1");
        BenClinicalObservations benClinicalObservationsMock = mock(BenClinicalObservations.class);
        doReturn(benClinicalObservationsMock).when(benClinicalObservationsRepoMock).save((BenClinicalObservations) any());
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(null);
        BenChiefComplaint benChiefComplaint = new BenChiefComplaint();
        benChiefComplaint.setBenVisitID(0L);
        benChiefComplaint.setVanID(0);
        benChiefComplaint.setBeneficiaryRegID(0L);
        benChiefComplaint.setCreatedBy("createdBy1");
        benChiefComplaint.setParkingPlaceID(0);
        benChiefComplaint.setVisitCode(0L);
        benChiefComplaint.setProviderServiceMapID(0);
        benChiefComplaint.setChiefComplaint("chiefComplaint1");
        ArrayList<BenChiefComplaint> benChiefComplaintList = new ArrayList<>();
        benChiefComplaintList.add(benChiefComplaint);
        doReturn(arrayList).when(benChiefComplaintRepoMock).saveAll(benChiefComplaintList);
        ArrayList<BenChiefComplaint> benChiefComplaintList2 = new ArrayList<>();
        benChiefComplaintList2.add(benChiefComplaint);
        WrapperAncFindings wrapperAncFindings = new WrapperAncFindings(0L, 0L, 0, "createdBy1", "clinicalObservation1", "otherSymptoms1", "significantFindings1", benChiefComplaintList2);
        wrapperAncFindings.setVanID(0);
        wrapperAncFindings.setParkingPlaceID(0);
        wrapperAncFindings.setVisitCode(0L);
        wrapperAncFindings.setModifiedBy("modifiedBy1");
        wrapperAncFindings.setIsForHistory(false);
        //Act Statement(s)
        Integer result = target.saveDocFindings(wrapperAncFindings);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(1));
            verify(target).getSnomedCTcode("otherSymptoms1");
            verify(benClinicalObservationsRepoMock).save((BenClinicalObservations) any());
            verify(benChiefComplaintRepoMock).saveAll(benChiefComplaintList);
        });
    }

    //Sapient generated method id: ${edab9e94-67b1-3fcf-9298-26d27e1ca7ec}, hash: A4B2EA5FF649992803CDA1DAF572274C
    @Test()
    void getSnomedCTcodeWhenPointerEqualsSymptomArrLengthMinus1() {
        /* Branches:* (requestString != null) : true* (requestString.length() > 0) : true* (for-each(symptomArr)) : true* (obj != null) : true* (pointer == symptomArr.length - 1) : true*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        SCTDescription sCTDescription = new SCTDescription();
        sCTDescription.setConceptID("A");
        sCTDescription.setTerm("B");
        doReturn(sCTDescription).when(snomedServiceImplMock).findSnomedCTRecordFromTerm("B");
        //Act Statement(s)
        String[] result = target.getSnomedCTcode("B ");
        String[] stringResultArray = new String[]{"A", "B"};
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(stringResultArray));
            verify(snomedServiceImplMock).findSnomedCTRecordFromTerm("B");
        });
    }

    //Sapient generated method id: ${0b0d92cc-4701-3bed-ab73-87ddee3cbf88}, hash: B0DCB1AAD81D329DEABD45B16EB35070
    @Disabled()
    @Test()
    void getSnomedCTcodeWhenPointerNotEqualsSymptomArrLengthMinus1() {
        /* Branches:* (requestString != null) : true* (requestString.length() > 0) : true* (for-each(symptomArr)) : true* (obj != null) : true* (pointer == symptomArr.length - 1) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        SCTDescription sCTDescription = new SCTDescription();
        sCTDescription.setConceptID("");
        sCTDescription.setTerm("CD");
        doReturn(sCTDescription).when(snomedServiceImplMock).findSnomedCTRecordFromTerm("B");
        //Act Statement(s)
        String[] result = target.getSnomedCTcode("B ,");
        String[] stringResultArray = new String[]{",", "CD,"};
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(stringResultArray));
            verify(snomedServiceImplMock).findSnomedCTRecordFromTerm("B");
        });
    }

    //Sapient generated method id: ${d762e6d5-b865-328b-9d13-092f8fc49538}, hash: C23FAA7586F1450C8A9FE2F0411A9CE5
    @Test()
    void getSnomedCTcodeWhenObjIsNullAndPointerEqualsSymptomArrLengthMinus1() {
        /* Branches:* (requestString != null) : true* (requestString.length() > 0) : true* (for-each(symptomArr)) : true* (obj != null) : false* (pointer == symptomArr.length - 1) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(snomedServiceImplMock).findSnomedCTRecordFromTerm("B");
        //Act Statement(s)
        String[] result = target.getSnomedCTcode("B ");
        String[] stringResultArray = new String[]{"N/A", "N/A"};
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(stringResultArray));
            verify(snomedServiceImplMock).findSnomedCTRecordFromTerm("B");
        });
    }

    //Sapient generated method id: ${58ca55f1-c76e-39f8-b2c6-81982df9606b}, hash: A01DF2FD827ECDA76FC1C2E7EC6883CA
    @Disabled()
    @Test()
    void getSnomedCTcodeWhenObjIsNullAndPointerNotEqualsSymptomArrLengthMinus1() {
        /* Branches:* (requestString != null) : true* (requestString.length() > 0) : true* (for-each(symptomArr)) : true* (obj != null) : false* (pointer == symptomArr.length - 1) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(snomedServiceImplMock).findSnomedCTRecordFromTerm("B");
        //Act Statement(s)
        String[] result = target.getSnomedCTcode("B ,A");
        String[] stringResultArray = new String[]{"N/A,", "N/A,"};
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(stringResultArray));
            verify(snomedServiceImplMock).findSnomedCTRecordFromTerm("B");
        });
    }

    //Sapient generated method id: ${74bb8193-5da9-3774-977a-a5fb1ac853a0}, hash: E40FD4F1584FF9A60EDCA82C0D24224D
    @Test()
    void getDocWorkListTest() {
        //Arrange Statement(s)
        try (MockedStatic<WrapperRegWorklist> wrapperRegWorklist = mockStatic(WrapperRegWorklist.class)) {
            wrapperRegWorklist.when(() -> WrapperRegWorklist.getDocWorkListData(anyList())).thenReturn("return_of_getDocWorkListData1");
            target = new CommonDoctorServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            List<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(docWorkListRepoMock).getDocWorkList();
            //Act Statement(s)
            String result = target.getDocWorkList();
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("return_of_getDocWorkListData1"));
                wrapperRegWorklist.verify(() -> WrapperRegWorklist.getDocWorkListData(anyList()));
                verify(docWorkListRepoMock).getDocWorkList();
            });
        }
    }

    //Sapient generated method id: ${02fee22a-f59b-3743-83af-272ae8e3d360}, hash: 76A092C76702A7936D89D45E7C75D2EC
    @Disabled()
    @Test()
    void getDocWorkListNewWhenServiceIDEquals2() {
        /* Branches:* (docWL != null) : false* (serviceID != null) : true* (serviceID == 2) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<BeneficiaryFlowStatus> beneficiaryFlowStatusList = new ArrayList<>();
        doReturn(beneficiaryFlowStatusList).when(beneficiaryFlowStatusRepoMock).getDocWorkListNew(0);
        //Act Statement(s)
        String result = target.getDocWorkListNew(0, 2, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(beneficiaryFlowStatusRepoMock).getDocWorkListNew(0);
        });
    }

    //Sapient generated method id: ${859090d0-927d-3df7-b7e1-f5c5ea2f58cf}, hash: D24DF0EE061BB0DE3A4CB16041B7DC1E
    @Disabled()
    @Test()
    void getDocWorkListNewWhenServiceIDEquals4() {
        /* Branches:* (docWL != null) : false* (serviceID != null) : true* (serviceID == 2) : false* (serviceID != null) : true* (serviceID == 4) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<BeneficiaryFlowStatus> beneficiaryFlowStatusList = new ArrayList<>();
        doReturn(beneficiaryFlowStatusList).when(beneficiaryFlowStatusRepoMock).getDocWorkListNewTC(eq(0), (Timestamp) any(), eq(0));
        //Act Statement(s)
        String result = target.getDocWorkListNew(0, 4, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(beneficiaryFlowStatusRepoMock).getDocWorkListNewTC(eq(0), (Timestamp) any(), eq(0));
        });
    }

    //Sapient generated method id: ${4491ed2e-4ede-3d4f-909a-67688566f281}, hash: F635FBB84A2832B04424A92DEA03F4F4
    @Disabled()
    @Test()
    void getDocWorkListNewFutureScheduledForTMWhenServiceIDEquals4() {
        /* Branches:* (serviceID != null) : true* (serviceID == 4) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<BeneficiaryFlowStatus> beneficiaryFlowStatusList = new ArrayList<>();
        doReturn(beneficiaryFlowStatusList).when(beneficiaryFlowStatusRepoMock).getDocWorkListNewFutureScheduledTC(0, 0);
        //Act Statement(s)
        String result = target.getDocWorkListNewFutureScheduledForTM(0, 4, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(beneficiaryFlowStatusRepoMock).getDocWorkListNewFutureScheduledTC(0, 0);
        });
    }

    //Sapient generated method id: ${92632676-4731-32a5-8058-20fa3eee949a}, hash: 00FAD4BD3EF33753A1E5866E4673A511
    @Disabled()
    @Test()
    void getTCSpecialistWorkListNewForTMPatientAppWhenServiceIDEquals4() {
        /* Branches:* (tcSpeclistWL != null) : false* (serviceID != null) : true* (serviceID == 4) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<BeneficiaryFlowStatus> beneficiaryFlowStatusList = new ArrayList<>();
        doReturn(beneficiaryFlowStatusList).when(beneficiaryFlowStatusRepoMock).getTCSpecialistWorkListNewPatientApp(eq(0), eq(0), (Timestamp) any(), eq(0));
        //Act Statement(s)
        String result = target.getTCSpecialistWorkListNewForTMPatientApp(0, 0, 4, 0);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(beneficiaryFlowStatusRepoMock).getTCSpecialistWorkListNewPatientApp(eq(0), eq(0), (Timestamp) any(), eq(0));
        });
    }

    //Sapient generated method id: ${4f36306d-4791-3765-8b98-9b3777d62fd5}, hash: 2E24BAB61225A7006AD2F654DD75F65B
    @Disabled()
    @Test()
    void getTCSpecialistWorkListNewForTMWhenServiceIDEquals4() {
        /* Branches:* (tcSpeclistWL != null) : false* (serviceID != null) : true* (serviceID == 4) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<BeneficiaryFlowStatus> beneficiaryFlowStatusList = new ArrayList<>();
        doReturn(beneficiaryFlowStatusList).when(beneficiaryFlowStatusRepoMock).getTCSpecialistWorkListNew(eq(0), eq(0), (Timestamp) any());
        //Act Statement(s)
        String result = target.getTCSpecialistWorkListNewForTM(0, 0, 4);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(beneficiaryFlowStatusRepoMock).getTCSpecialistWorkListNew(eq(0), eq(0), (Timestamp) any());
        });
    }

    //Sapient generated method id: ${f0decd09-1f29-3c16-a554-3483ab4ba06b}, hash: 7637BDB4FF4F89921F6BD3C26DD0413A
    @Disabled()
    @Test()
    void getTCSpecialistWorkListNewFutureScheduledForTMWhenServiceIDEquals4() {
        /* Branches:* (serviceID != null) : true* (serviceID == 4) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<BeneficiaryFlowStatus> beneficiaryFlowStatusList = new ArrayList<>();
        doReturn(beneficiaryFlowStatusList).when(beneficiaryFlowStatusRepoMock).getTCSpecialistWorkListNewFutureScheduled(0, 0);
        //Act Statement(s)
        String result = target.getTCSpecialistWorkListNewFutureScheduledForTM(0, 0, 4);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(beneficiaryFlowStatusRepoMock).getTCSpecialistWorkListNewFutureScheduled(0, 0);
        });
    }

    //Sapient generated method id: ${d427140f-661e-3351-b356-87dee8f9f0cb}, hash: 1257DF35698797C1A1EF2B125D7E8160
    @Disabled()
    @Test()
    void fetchBenPreviousSignificantFindingsWhenPreviousSignificantFindingsIsNotEmpty() {
        /* Branches:* (null != clinicalObservations) : true* (for-each(previousSignificantFindings)) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        Date date = new Date(0L);
        Object[] objectArray = new Object[]{date, "return_of_getPreviousSignificantFindingsItem1Item1"};
        ArrayList<Object[]> objectList = new ArrayList<>();
        objectList.add(objectArray);
        doReturn(objectList).when(benClinicalObservationsRepoMock).getPreviousSignificantFindings(0L);
        //Act Statement(s)
        String result = target.fetchBenPreviousSignificantFindings(0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(benClinicalObservationsRepoMock).getPreviousSignificantFindings(0L);
        });
    }

    //Sapient generated method id: ${2acd3d5a-e484-3bae-ad2b-809742591b7f}, hash: C76BBC056A98DA3F4918ACF246666BBC
    @Test()
    void saveBenReferDetailsWhenReferDetailsGetRevisitDateIsNullAndReferDetailsGetReferralReasonIsNotNullAndReferDetailsListSize() throws IEMRException {
        /* Branches:* (referDetails.getRefrredToAdditionalServiceList() != null) : true* (referDetails.getRefrredToAdditionalServiceList().size() > 0) : false* (referDetails.getReferredToInstituteName() != null) : false* (referDetails.getRevisitDate() != null) : false* (referDetails.getReferralReason() != null) : true* (referDetailsList.size() == res.size()) : true*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BenReferDetails benReferDetailsMock = mock(BenReferDetails.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            JsonObject jsonObject = new JsonObject();
            doReturn(benReferDetailsMock).when(inputMapperMock).fromJson(jsonObject, BenReferDetails.class);
            ArrayList<ServiceMaster> serviceMasterList = new ArrayList<>();
            ArrayList<ServiceMaster> serviceMasterList2 = new ArrayList<>();
            doReturn(serviceMasterList, serviceMasterList2).when(benReferDetailsMock).getRefrredToAdditionalServiceList();
            doReturn(null).when(benReferDetailsMock).getReferredToInstituteName();
            doReturn(null).when(benReferDetailsMock).getRevisitDate();
            doReturn("return_of_getReferralReason1").when(benReferDetailsMock).getReferralReason();
            target = new CommonDoctorServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList arrayList = new ArrayList<>();
            arrayList.add(null);
            List<BenReferDetails> benReferDetailsList = new ArrayList<>();
            benReferDetailsList.add(benReferDetailsMock);
            doReturn(arrayList).when(benReferDetailsRepoMock).saveAll(benReferDetailsList);
            //Act Statement(s)
            Long result = target.saveBenReferDetails(jsonObject);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(1L));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson(jsonObject, BenReferDetails.class);
                verify(benReferDetailsMock, times(2)).getRefrredToAdditionalServiceList();
                verify(benReferDetailsMock).getReferredToInstituteName();
                verify(benReferDetailsMock).getRevisitDate();
                verify(benReferDetailsMock).getReferralReason();
                verify(benReferDetailsRepoMock).saveAll(benReferDetailsList);
            });
        }
    }

    //Sapient generated method id: ${35e4a9ec-8129-3164-b325-21db47ba1cf5}, hash: D5CDB7F37CB56019621E9EB69B919D22
    @Disabled()
    @Test()
    void saveBenReferDetailsWhenReferDetailsGetReferralReasonIsNotNullAndReferDetailsListSizeEqualsResSize3() throws IEMRException {
        /* Branches:* (referDetails.getRefrredToAdditionalServiceList() != null) : true* (referDetails.getRefrredToAdditionalServiceList().size() > 0) : true* (for-each(referDetails.getRefrredToAdditionalServiceList())) : true* (sm.getServiceName() != null) : true* (referDetails.getReferredToInstituteID() != null) : true* (referDetails.getReferredToInstituteName() != null) : true* (referDetails.getRevisitDate() != null) : true* (referDetails.getReferralReason() != null) : true* (referDetailsList.size() == res.size()) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BenReferDetails benReferDetailsMock = mock(BenReferDetails.class);
        ServiceMaster serviceMasterMock = mock(ServiceMaster.class);
        ServiceMaster serviceMasterMock2 = mock(ServiceMaster.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            JsonObject jsonObject = new JsonObject();
            doReturn(benReferDetailsMock).when(inputMapperMock).fromJson(jsonObject, BenReferDetails.class);
            ArrayList<ServiceMaster> serviceMasterList = new ArrayList<>();
            ArrayList<ServiceMaster> serviceMasterList2 = new ArrayList<>();
            serviceMasterList2.add(serviceMasterMock);
            ArrayList<ServiceMaster> serviceMasterList3 = new ArrayList<>();
            serviceMasterList3.add(serviceMasterMock2);
            doReturn(serviceMasterList, serviceMasterList2, serviceMasterList3).when(benReferDetailsMock).getRefrredToAdditionalServiceList();
            doReturn("return_of_getServiceName1").when(serviceMasterMock2).getServiceName();
            doReturn((short) 0).when(serviceMasterMock2).getServiceID();
            doReturn(0L).when(benReferDetailsMock).getBeneficiaryRegID();
            doReturn(0L).when(benReferDetailsMock).getBenVisitID();
            doReturn(0L).when(benReferDetailsMock).getVisitCode();
            doReturn(0).when(benReferDetailsMock).getProviderServiceMapID();
            doReturn("return_of_getCreatedBy1").when(benReferDetailsMock).getCreatedBy();
            doReturn(0).when(benReferDetailsMock).getVanID();
            doReturn(0).when(benReferDetailsMock).getParkingPlaceID();
            doReturn(0).when(benReferDetailsMock).getReferredToInstituteID();
            doReturn("return_of_getReferredToInstituteName1").when(benReferDetailsMock).getReferredToInstituteName();
            Timestamp timestamp = new Timestamp(0L);
            Timestamp timestamp2 = new Timestamp(0L);
            doReturn(timestamp, timestamp2).when(benReferDetailsMock).getRevisitDate();
            doReturn("return_of_getReferralReason1").when(benReferDetailsMock).getReferralReason();
            target = new CommonDoctorServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList arrayList = new ArrayList<>();
            arrayList.add(null);
            BenReferDetails benReferDetails = new BenReferDetails();
            benReferDetails.setReferralReason("return_of_getReferralReason1");
            benReferDetails.setReferredToInstituteName("return_of_getReferredToInstituteName1");
            benReferDetails.setParkingPlaceID(0);
            benReferDetails.setReferredToInstituteID(0);
            benReferDetails.setProviderServiceMapID(0);
            benReferDetails.setServiceName("return_of_getServiceName1");
            benReferDetails.setBenVisitID(0L);
            benReferDetails.setVanID(0);
            benReferDetails.setRevisitDate(timestamp2);
            benReferDetails.setBeneficiaryRegID(0L);
            benReferDetails.setCreatedBy("return_of_getCreatedBy1");
            benReferDetails.setVisitCode(0L);
            benReferDetails.setServiceID((short) 0);
            List<BenReferDetails> benReferDetailsList = new ArrayList<>();
            benReferDetailsList.add(benReferDetails);
            doReturn(arrayList).when(benReferDetailsRepoMock).saveAll(benReferDetailsList);
            //Act Statement(s)
            Long result = target.saveBenReferDetails(jsonObject);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(1L));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson(jsonObject, BenReferDetails.class);
                verify(benReferDetailsMock, times(3)).getRefrredToAdditionalServiceList();
                verify(serviceMasterMock2, times(2)).getServiceName();
                verify(serviceMasterMock2).getServiceID();
                verify(benReferDetailsMock).getBeneficiaryRegID();
                verify(benReferDetailsMock).getBenVisitID();
                verify(benReferDetailsMock, times(2)).getVisitCode();
                verify(benReferDetailsMock).getProviderServiceMapID();
                verify(benReferDetailsMock).getCreatedBy();
                verify(benReferDetailsMock).getVanID();
                verify(benReferDetailsMock).getParkingPlaceID();
                verify(benReferDetailsMock, times(2)).getReferredToInstituteID();
                verify(benReferDetailsMock, times(2)).getReferredToInstituteName();
                verify(benReferDetailsMock, times(2)).getRevisitDate();
                verify(benReferDetailsMock, times(2)).getReferralReason();
                verify(benReferDetailsRepoMock).saveAll(benReferDetailsList);
            });
        }
    }

    //Sapient generated method id: ${1a7a1b59-ddb3-32fc-b03a-2e233eeddb3c}, hash: 360554E190B474FA36A015BC3D5BA698
    @Disabled()
    @Test()
    void getFindingsDetailsTest() {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        WrapperAncFindings wrapperAncFindingsMock = mock(WrapperAncFindings.class);
        try (MockedStatic<WrapperAncFindings> wrapperAncFindings = mockStatic(WrapperAncFindings.class)) {
            wrapperAncFindings.when(() -> WrapperAncFindings.getFindingsData((ArrayList) any(), (ArrayList) any())).thenReturn(wrapperAncFindingsMock);
            target = new CommonDoctorServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(benClinicalObservationsRepoMock).getFindingsData(0L, 0L);
            ArrayList<Object[]> objectList2 = new ArrayList<>();
            doReturn(objectList2).when(benChiefComplaintRepoMock).getBenChiefComplaints(0L, 0L);
            //Act Statement(s)
            String result = target.getFindingsDetails(0L, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                wrapperAncFindings.verify(() -> WrapperAncFindings.getFindingsData((ArrayList) any(), (ArrayList) any()));
                verify(benClinicalObservationsRepoMock).getFindingsData(0L, 0L);
                verify(benChiefComplaintRepoMock).getBenChiefComplaints(0L, 0L);
            });
        }
    }

    //Sapient generated method id: ${8a43ff31-4a61-3331-abed-efbfc0d4fbdd}, hash: E85D82838F73BECF04DFFFB5CC4BD65E
    @Disabled()
    @Test()
    void getInvestigationDetailsTest() {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        WrapperBenInvestigationANC wrapperBenInvestigationANCMock = mock(WrapperBenInvestigationANC.class);
        try (MockedStatic<LabTestOrderDetail> labTestOrderDetail = mockStatic(LabTestOrderDetail.class)) {
            labTestOrderDetail.when(() -> LabTestOrderDetail.getLabTestOrderDetails((ArrayList) any())).thenReturn(wrapperBenInvestigationANCMock);
            target = new CommonDoctorServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(labTestOrderDetailRepoMock).getLabTestOrderDetails(0L, 0L);
            //Act Statement(s)
            String result = target.getInvestigationDetails(0L, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                labTestOrderDetail.verify(() -> LabTestOrderDetail.getLabTestOrderDetails((ArrayList) any()));
                verify(labTestOrderDetailRepoMock).getLabTestOrderDetails(0L, 0L);
            });
        }
    }

    //Sapient generated method id: ${abce3148-c28f-3b89-a472-e88e2322a847}, hash: CEDD00AC0A85F189943A4A5AEE6F540C
    @Disabled()
    @Test()
    void getPrescribedDrugsTest() {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        try (MockedStatic<PrescribedDrugDetail> prescribedDrugDetail = mockStatic(PrescribedDrugDetail.class)) {
            ArrayList<PrescribedDrugDetail> prescribedDrugDetailList = new ArrayList<>();
            prescribedDrugDetail.when(() -> PrescribedDrugDetail.getprescribedDrugs((ArrayList) any())).thenReturn(prescribedDrugDetailList);
            target = new CommonDoctorServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(prescribedDrugDetailRepoMock).getBenPrescribedDrugDetails(0L, 0L);
            //Act Statement(s)
            String result = target.getPrescribedDrugs(0L, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                prescribedDrugDetail.verify(() -> PrescribedDrugDetail.getprescribedDrugs((ArrayList) any()));
                verify(prescribedDrugDetailRepoMock).getBenPrescribedDrugDetails(0L, 0L);
            });
        }
    }

    //Sapient generated method id: ${c71bcf11-9819-338f-9709-6cd480aa0ecd}, hash: 83CD75006B334E411E5CD006F88B5E01
    @Disabled()
    @Test()
    void getReferralDetailsTest() {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        BenReferDetails benReferDetailsMock = mock(BenReferDetails.class);
        try (MockedStatic<BenReferDetails> benReferDetails = mockStatic(BenReferDetails.class)) {
            benReferDetails.when(() -> BenReferDetails.getBenReferDetails((ArrayList) any())).thenReturn(benReferDetailsMock);
            target = new CommonDoctorServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            ArrayList<Object[]> objectList = new ArrayList<>();
            doReturn(objectList).when(benReferDetailsRepoMock).getBenReferDetails(0L, 0L);
            //Act Statement(s)
            String result = target.getReferralDetails(0L, 0L);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo("result1"));
                benReferDetails.verify(() -> BenReferDetails.getBenReferDetails((ArrayList) any()));
                verify(benReferDetailsRepoMock).getBenReferDetails(0L, 0L);
            });
        }
    }

    //Sapient generated method id: ${55096367-61cc-3950-9c07-682db2dc2ae1}, hash: A17FD8E71C766ED8275F75B780D69FA9
    @Test()
    void updateDocFindingsWhenChiefCmpltsResGreaterThan0() {
        /* Branches:* (responseString != null) : true  #  inside getBenClinicalObservations method* (responseString.length > 1) : true  #  inside getBenClinicalObservations method* (tmpBenCHiefComplaints.size() > 0) : false* (clinObsrvtnsRes > 0) : true* (chiefCmpltsRes > 0) : true*/
        //Arrange Statement(s)
        target = spy(new CommonDoctorServiceImpl());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        String[] stringArray = new String[]{"return_of_getSnomedCTcodeItem1", "return_of_getSnomedCTcodeItem1"};
        doReturn(stringArray).when(target).getSnomedCTcode("otherSymptoms1");
        doReturn(1).when(target).updateBenClinicalObservations((BenClinicalObservations) any());
        ArrayList<BenChiefComplaint> benChiefComplaintList = new ArrayList<>();
        WrapperAncFindings wrapperAncFindings = new WrapperAncFindings(0L, 0L, 0, "createdBy1", "clinicalObservation1", "otherSymptoms1", "significantFindings1", benChiefComplaintList);
        wrapperAncFindings.setVanID(0);
        wrapperAncFindings.setParkingPlaceID(0);
        wrapperAncFindings.setVisitCode(0L);
        wrapperAncFindings.setModifiedBy("modifiedBy1");
        wrapperAncFindings.setIsForHistory(false);
        //Act Statement(s)
        Integer result = target.updateDocFindings(wrapperAncFindings);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(1));
            verify(target).getSnomedCTcode("otherSymptoms1");
            verify(target).updateBenClinicalObservations((BenClinicalObservations) any());
        });
    }

    //Sapient generated method id: ${7129caff-9934-3352-bb12-17fc17bc8fb8}, hash: AD61A3C82C242CD9CCB0448DCF22023C
    @Test()
    void updateDocFindingsWhenBenChiefComplaintGetChiefComplaintIsNotNullAndClinObsrvtnsResGreaterThan0AndChiefCmpltsResGreaterT() {
        /* Branches:* (responseString != null) : true  #  inside getBenClinicalObservations method* (responseString.length > 1) : true  #  inside getBenClinicalObservations method* (tmpBenCHiefComplaints.size() > 0) : true* (for-each(tmpBenCHiefComplaints)) : true* (benChiefComplaint.getChiefComplaint() != null) : true* (clinObsrvtnsRes > 0) : true* (chiefCmpltsRes > 0) : true*/
        //Arrange Statement(s)
        target = spy(new CommonDoctorServiceImpl());
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        String[] stringArray = new String[]{"return_of_getSnomedCTcodeItem1", "return_of_getSnomedCTcodeItem1"};
        doReturn(stringArray).when(target).getSnomedCTcode("otherSymptoms1");
        doReturn(1).when(target).updateBenClinicalObservations((BenClinicalObservations) any());
        BenChiefComplaint benChiefComplaint = new BenChiefComplaint();
        benChiefComplaint.setBenVisitID(0L);
        benChiefComplaint.setBeneficiaryRegID(0L);
        benChiefComplaint.setCreatedBy("createdBy1");
        benChiefComplaint.setVisitCode(0L);
        benChiefComplaint.setProviderServiceMapID(0);
        benChiefComplaint.setChiefComplaint("chiefComplaint1");
        ArrayList<BenChiefComplaint> benChiefComplaintList = new ArrayList<>();
        benChiefComplaintList.add(benChiefComplaint);
        doReturn(1).when(target).updateDoctorBenChiefComplaints(benChiefComplaintList);
        ArrayList<BenChiefComplaint> benChiefComplaintList2 = new ArrayList<>();
        benChiefComplaintList2.add(benChiefComplaint);
        WrapperAncFindings wrapperAncFindings = new WrapperAncFindings(0L, 0L, 0, "createdBy1", "clinicalObservation1", "otherSymptoms1", "significantFindings1", benChiefComplaintList2);
        wrapperAncFindings.setVanID(0);
        wrapperAncFindings.setParkingPlaceID(0);
        wrapperAncFindings.setVisitCode(0L);
        wrapperAncFindings.setModifiedBy("modifiedBy1");
        wrapperAncFindings.setIsForHistory(false);
        //Act Statement(s)
        Integer result = target.updateDocFindings(wrapperAncFindings);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(1));
            verify(target).getSnomedCTcode("otherSymptoms1");
            verify(target).updateBenClinicalObservations((BenClinicalObservations) any());
            verify(target).updateDoctorBenChiefComplaints(benChiefComplaintList);
        });
    }

    //Sapient generated method id: ${fd8a2f5f-c165-3185-b078-d97548701d26}, hash: 672F0ABB7D95E446604C922F685F4A37
    @Test()
    void updateDoctorBenChiefComplaintsWhenBenChiefComplaintListSizeNotGreaterThan0() {
        /* Branches:* (null != benChiefComplaintList) : true* (benChiefComplaintList.size() > 0) : false*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        List<BenChiefComplaint> benChiefComplaintList = new ArrayList<>();
        //Act Statement(s)
        int result = target.updateDoctorBenChiefComplaints(benChiefComplaintList);
        //Assert statement(s)
        assertAll("result", () -> assertThat(result, equalTo(1)));
    }

    //Sapient generated method id: ${0c5f6c81-609b-386c-ac4b-63ee13dd4d89}, hash: 636DE8F3A1E837695533953FBE956D4D
    @Test()
    void updateDoctorBenChiefComplaintsWhenBenChiefComplaintResultListSizeGreaterThan0() {
        /* Branches:* (null != benChiefComplaintList) : true* (benChiefComplaintList.size() > 0) : true* (benChiefComplaintResultList != null) : true* (benChiefComplaintResultList.size() > 0) : true*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        List list = new ArrayList<>();
        list.add(null);
        BenChiefComplaint benChiefComplaintMock = mock(BenChiefComplaint.class);
        List<BenChiefComplaint> benChiefComplaintList = new ArrayList<>();
        benChiefComplaintList.add(benChiefComplaintMock);
        doReturn(list).when(benChiefComplaintRepoMock).saveAll(benChiefComplaintList);
        //Act Statement(s)
        int result = target.updateDoctorBenChiefComplaints(benChiefComplaintList);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(1));
            verify(benChiefComplaintRepoMock).saveAll(benChiefComplaintList);
        });
    }

    //Sapient generated method id: ${2e57d4bb-ce33-31ad-b2a8-fcac824f2e4b}, hash: 503544FEACA7ABF32EA79EBC4764A251
    @Test()
    void updateBenClinicalObservationsWhenProcessedNotEqualsNAndRecordsAvailableGreaterThan0() {
        /* Branches:* (null != benClinicalObservations) : true* (null != processed) : true* (null != processed) : true* (!processed.equals("N")) : true* (recordsAvailable > 0) : true*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn("A").when(benClinicalObservationsRepoMock).getBenClinicalObservationStatus(0L, 0L);
        doReturn(1).when(benClinicalObservationsRepoMock).updateBenClinicalObservations("clinicalObservation1", "otherSymptoms1", "otherSymptomsSCTCode1", "otherSymptomsSCTTerm1", "significantFindings1", false, "createdBy1", "U", 0L, 0L);
        BenClinicalObservations benClinicalObservations = new BenClinicalObservations();
        benClinicalObservations.setBeneficiaryRegID(0L);
        benClinicalObservations.setOtherSymptomsSCTCode("otherSymptomsSCTCode1");
        benClinicalObservations.setOtherSymptoms("otherSymptoms1");
        benClinicalObservations.setCreatedBy("createdBy1");
        benClinicalObservations.setVisitCode(0L);
        benClinicalObservations.setOtherSymptomsSCTTerm("otherSymptomsSCTTerm1");
        benClinicalObservations.setIsForHistory(false);
        benClinicalObservations.setClinicalObservation("clinicalObservation1");
        benClinicalObservations.setSignificantFindings("significantFindings1");
        //Act Statement(s)
        int result = target.updateBenClinicalObservations(benClinicalObservations);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(1));
            verify(benClinicalObservationsRepoMock).getBenClinicalObservationStatus(0L, 0L);
            verify(benClinicalObservationsRepoMock).updateBenClinicalObservations("clinicalObservation1", "otherSymptoms1", "otherSymptomsSCTCode1", "otherSymptomsSCTTerm1", "significantFindings1", false, "createdBy1", "U", 0L, 0L);
        });
    }

    //Sapient generated method id: ${fde48e8c-2d38-36b0-946c-415159bb00a8}, hash: CCB8B4A3EF18FB42F6299ADB91280A96
    @Test()
    void updateBenClinicalObservationsWhenObservationsResGetClinicalObservationIDGreaterThan0() {
        /* Branches:* (null != benClinicalObservations) : true* (null != processed) : false* (null != processed) : false* (recordsAvailable > 0) : false* (null != observationsRes) : true* (observationsRes.getClinicalObservationID() > 0) : true*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(null).when(benClinicalObservationsRepoMock).getBenClinicalObservationStatus(0L, 0L);
        BenClinicalObservations benClinicalObservations = new BenClinicalObservations();
        benClinicalObservations.setClinicalObservationID(1L);
        BenClinicalObservations benClinicalObservations2 = new BenClinicalObservations();
        benClinicalObservations2.setBeneficiaryRegID(0L);
        benClinicalObservations2.setVisitCode(0L);
        doReturn(benClinicalObservations).when(benClinicalObservationsRepoMock).save(benClinicalObservations2);
        //Act Statement(s)
        int result = target.updateBenClinicalObservations(benClinicalObservations2);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(1));
            verify(benClinicalObservationsRepoMock).getBenClinicalObservationStatus(0L, 0L);
            verify(benClinicalObservationsRepoMock).save(benClinicalObservations2);
        });
    }

    //Sapient generated method id: ${1ddedfe3-6a95-38f8-888a-cb0705c78e09}, hash: B4F6507131B48A44DB46BAF33B248BB1
    @Test()
    void updateBenReferDetailsWhenReferDetailsGetRevisitDateIsNullAndReferDetailsGetReferralReasonIsNotNullAndReferDetailsListSi() throws IEMRException {
        /* Branches:* (for-each(benReferDetailsStatuses)) : true* (null != processed) : true* (!"N".equals(processed)) : true* (referDetails.getReferredToInstituteID() != null) : false* (referDetails.getReferredToInstituteName() != null) : false* (referDetails.getRevisitDate() != null) : false* (referDetails.getReferralReason() != null) : true* (referDetails.getRefrredToAdditionalServiceList() != null) : true* (referDetails.getRefrredToAdditionalServiceList().size() > 0) : false* (referDetails.getReferredToInstituteName() != null) : false* (referDetails.getRevisitDate() != null) : false* (referDetails.getReferralReason() != null) : true* (referDetailsList.size() == res.size()) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BenReferDetails benReferDetailsMock = mock(BenReferDetails.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            String string = null;
            Timestamp timestamp2 = null;
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            JsonObject jsonObject = new JsonObject();
            doReturn(benReferDetailsMock).when(inputMapperMock).fromJson(jsonObject, BenReferDetails.class);
            doReturn(0L).when(benReferDetailsMock).getBeneficiaryRegID();
            doReturn(0L).when(benReferDetailsMock).getVisitCode();
            doReturn("return_of_getReferralReason1").when(benReferDetailsMock).getReferralReason();
            doReturn(null, 0).when(benReferDetailsMock).getReferredToInstituteID();
            doReturn(null, "return_of_getReferredToInstituteName1", string).when(benReferDetailsMock).getReferredToInstituteName();
            Timestamp timestamp = new Timestamp(0L);
            doReturn(null, timestamp, timestamp2).when(benReferDetailsMock).getRevisitDate();
            ArrayList<ServiceMaster> serviceMasterList = new ArrayList<>();
            ArrayList<ServiceMaster> serviceMasterList2 = new ArrayList<>();
            doReturn(serviceMasterList, serviceMasterList2).when(benReferDetailsMock).getRefrredToAdditionalServiceList();
            target = new CommonDoctorServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Object[] objectArray = new Object[]{0L, "A"};
            ArrayList<Object[]> objectList = new ArrayList<>();
            objectList.add(objectArray);
            doReturn(objectList).when(benReferDetailsRepoMock).getBenReferDetailsStatus(0L, 0L);
            doReturn(0).when(benReferDetailsRepoMock).updateReferredInstituteName(0, "return_of_getReferredToInstituteName1", timestamp, "return_of_getReferralReason1", 0L, "U");
            ArrayList arrayList = new ArrayList<>();
            arrayList.add(null);
            List<BenReferDetails> benReferDetailsList = new ArrayList<>();
            benReferDetailsList.add(benReferDetailsMock);
            doReturn(arrayList).when(benReferDetailsRepoMock).saveAll(benReferDetailsList);
            //Act Statement(s)
            Long result = target.updateBenReferDetails(jsonObject);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(1L));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson(jsonObject, BenReferDetails.class);
                verify(benReferDetailsMock).getBeneficiaryRegID();
                verify(benReferDetailsMock).getVisitCode();
                verify(benReferDetailsMock, times(2)).getReferredToInstituteID();
                verify(benReferDetailsMock, times(3)).getReferredToInstituteName();
                verify(benReferDetailsMock, times(3)).getRevisitDate();
                verify(benReferDetailsMock, times(3)).getReferralReason();
                verify(benReferDetailsMock, times(2)).getRefrredToAdditionalServiceList();
                verify(benReferDetailsRepoMock).getBenReferDetailsStatus(0L, 0L);
                verify(benReferDetailsRepoMock).updateReferredInstituteName(0, "return_of_getReferredToInstituteName1", timestamp, "return_of_getReferralReason1", 0L, "U");
                verify(benReferDetailsRepoMock).saveAll(benReferDetailsList);
            });
        }
    }

    //Sapient generated method id: ${be124cb8-e726-3981-99b9-47aab28533fd}, hash: F3422ED920ED5EC9B72A4A421F8CD4F4
    @Disabled()
    @Test()
    void updateBenReferDetailsWhenReferDetailsGetReferralReasonIsNotNullAndReferDetailsListSizeEqualsResSize3() throws IEMRException {
        /* Branches:* (for-each(benReferDetailsStatuses)) : true* (null != processed) : true* (!"N".equals(processed)) : true* (referDetails.getReferredToInstituteID() != null) : false* (referDetails.getReferredToInstituteName() != null) : false* (referDetails.getRevisitDate() != null) : false* (referDetails.getReferralReason() != null) : true* (referDetails.getRefrredToAdditionalServiceList() != null) : true* (referDetails.getRefrredToAdditionalServiceList().size() > 0) : true* (for-each(referDetails.getRefrredToAdditionalServiceList())) : true* (sm.getServiceName() != null) : true* (referDetails.getReferredToInstituteID() != null) : true* (referDetails.getReferredToInstituteName() != null) : true* (referDetails.getRevisitDate() != null) : true* (referDetails.getReferralReason() != null) : true* (referDetailsList.size() == res.size()) : true** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        InputMapper inputMapperMock = mock(InputMapper.class);
        BenReferDetails benReferDetailsMock = mock(BenReferDetails.class);
        ServiceMaster serviceMasterMock = mock(ServiceMaster.class);
        ServiceMaster serviceMasterMock2 = mock(ServiceMaster.class);
        try (MockedStatic<InputMapper> inputMapper = mockStatic(InputMapper.class)) {
            inputMapper.when(() -> InputMapper.gson()).thenReturn(inputMapperMock);
            JsonObject jsonObject = new JsonObject();
            doReturn(benReferDetailsMock).when(inputMapperMock).fromJson(jsonObject, BenReferDetails.class);
            doReturn(0L).when(benReferDetailsMock).getBeneficiaryRegID();
            doReturn(0L).when(benReferDetailsMock).getVisitCode();
            doReturn("return_of_getReferralReason1").when(benReferDetailsMock).getReferralReason();
            doReturn(null, 0, 0, 0).when(benReferDetailsMock).getReferredToInstituteID();
            doReturn(null, "return_of_getReferredToInstituteName1", "return_of_getReferredToInstituteName1", "return_of_getReferredToInstituteName1").when(benReferDetailsMock).getReferredToInstituteName();
            Timestamp timestamp = new Timestamp(0L);
            ArrayList<ServiceMaster> serviceMasterList = new ArrayList<>();
            ArrayList<ServiceMaster> serviceMasterList2 = new ArrayList<>();
            serviceMasterList2.add(serviceMasterMock);
            ArrayList<ServiceMaster> serviceMasterList3 = new ArrayList<>();
            serviceMasterList3.add(serviceMasterMock2);
            doReturn(serviceMasterList, serviceMasterList2, serviceMasterList3).when(benReferDetailsMock).getRefrredToAdditionalServiceList();
            doReturn("return_of_getServiceName1").when(serviceMasterMock2).getServiceName();
            doReturn((short) 0).when(serviceMasterMock2).getServiceID();
            doReturn(0L).when(benReferDetailsMock).getBenVisitID();
            doReturn(0).when(benReferDetailsMock).getProviderServiceMapID();
            doReturn("return_of_getCreatedBy1").when(benReferDetailsMock).getCreatedBy();
            doReturn(0).when(benReferDetailsMock).getVanID();
            doReturn(0).when(benReferDetailsMock).getParkingPlaceID();
            Timestamp timestamp2 = new Timestamp(0L);
            Timestamp timestamp3 = new Timestamp(0L);
            doReturn(null, timestamp, timestamp2, timestamp3).when(benReferDetailsMock).getRevisitDate();
            target = new CommonDoctorServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            Object[] objectArray = new Object[]{0L, "A"};
            ArrayList<Object[]> objectList = new ArrayList<>();
            objectList.add(objectArray);
            doReturn(objectList).when(benReferDetailsRepoMock).getBenReferDetailsStatus(0L, 0L);
            doReturn(0).when(benReferDetailsRepoMock).updateReferredInstituteName(0, "return_of_getReferredToInstituteName1", timestamp, "return_of_getReferralReason1", 0L, "U");
            ArrayList arrayList = new ArrayList<>();
            arrayList.add(null);
            BenReferDetails benReferDetails = new BenReferDetails();
            benReferDetails.setReferralReason("return_of_getReferralReason1");
            benReferDetails.setReferredToInstituteName("return_of_getReferredToInstituteName1");
            benReferDetails.setParkingPlaceID(0);
            benReferDetails.setReferredToInstituteID(0);
            benReferDetails.setProviderServiceMapID(0);
            benReferDetails.setServiceName("return_of_getServiceName1");
            benReferDetails.setBenVisitID(0L);
            benReferDetails.setVanID(0);
            benReferDetails.setRevisitDate(timestamp3);
            benReferDetails.setBeneficiaryRegID(0L);
            benReferDetails.setCreatedBy("return_of_getCreatedBy1");
            benReferDetails.setVisitCode(0L);
            benReferDetails.setServiceID((short) 0);
            List<BenReferDetails> benReferDetailsList = new ArrayList<>();
            benReferDetailsList.add(benReferDetails);
            doReturn(arrayList).when(benReferDetailsRepoMock).saveAll(benReferDetailsList);
            //Act Statement(s)
            Long result = target.updateBenReferDetails(jsonObject);
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(1L));
                inputMapper.verify(() -> InputMapper.gson(), atLeast(1));
                verify(inputMapperMock).fromJson(jsonObject, BenReferDetails.class);
                verify(benReferDetailsMock, times(2)).getBeneficiaryRegID();
                verify(benReferDetailsMock, times(2)).getVisitCode();
                verify(benReferDetailsMock, times(4)).getReferredToInstituteID();
                verify(benReferDetailsMock, times(4)).getReferredToInstituteName();
                verify(benReferDetailsMock, times(4)).getRevisitDate();
                verify(benReferDetailsMock, times(4)).getReferralReason();
                verify(benReferDetailsMock, times(3)).getRefrredToAdditionalServiceList();
                verify(serviceMasterMock2, times(2)).getServiceName();
                verify(serviceMasterMock2).getServiceID();
                verify(benReferDetailsMock).getBenVisitID();
                verify(benReferDetailsMock).getProviderServiceMapID();
                verify(benReferDetailsMock).getCreatedBy();
                verify(benReferDetailsMock).getVanID();
                verify(benReferDetailsMock).getParkingPlaceID();
                verify(benReferDetailsRepoMock).getBenReferDetailsStatus(0L, 0L);
                verify(benReferDetailsRepoMock).updateReferredInstituteName(0, "return_of_getReferredToInstituteName1", timestamp, "return_of_getReferralReason1", 0L, "U");
                verify(benReferDetailsRepoMock).saveAll(benReferDetailsList);
            });
        }
    }

    //Sapient generated method id: ${1ecac6b8-750d-3aa5-a2cb-b2b9aa706a0e}, hash: 557F6719ED76C13FB90EF7EB9EB64F8A
    @Disabled()
    @Test()
    void updateBenFlowtableAfterDocDataSaveWhenCommonUtilityClassGetIsSpecialistNotEqualsTrueAndCommonUtilityClassGetIsSpecialis() throws Exception {
        /* Branches:* (commonUtilityClass != null) : true* (commonUtilityClass.getVisitCategoryID() != null) : true* (commonUtilityClass.getVisitCategoryID() == 4) : true* (foetalMonitorData.size() > 0) : true* (for-each(foetalMonitorData)) : true* (data != null) : true* (!data.getResultState()) : true* (data != null) : true* (data.getVisitCode() == null) : true* (commonUtilityClass != null) : true* (commonUtilityClass.getIsSpecialist() != null) : true* (commonUtilityClass.getIsSpecialist() == true) : true* (isTestPrescribed) : true* (isMedicinePrescribed) : true* (tcRequestOBJ != null) : true* (tcRequestOBJ.getUserID() != null) : true* (tcRequestOBJ.getUserID() > 0) : true* (tcRequestOBJ.getAllocationDate() != null) : true* (commonUtilityClass != null) : true* (commonUtilityClass.getIsSpecialist() != null) : true* (commonUtilityClass.getIsSpecialist() == true) : false* (commonUtilityClass.getIsSpecialist() == true) : true* (tcSpecialistFlag == 9) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<FoetalMonitor> foetalMonitorList = new ArrayList<>();
        doReturn(foetalMonitorList).when(foetalMonitorRepoMock).getFoetalMonitorDetailsByFlowId(0L);
        doReturn(0).when(foetalMonitorRepoMock).updateVisitCode(0L, 0L);
        Timestamp timestamp = new Timestamp(0L);
        doReturn(0).when(commonBenStatusFlowServiceImplMock).updateBenFlowAfterDocData(0L, 0L, 0L, 0L, (short) 1, (short) 1, (short) 0, (short) 1, 0, timestamp, (short) 2);
        CommonUtilityClass commonUtilityClass = new CommonUtilityClass();
        commonUtilityClass.setBenVisitID(0L);
        commonUtilityClass.setBeneficiaryRegID(0L);
        commonUtilityClass.setBenFlowID(0L);
        commonUtilityClass.setIsSpecialist(false);
        commonUtilityClass.setVisitCategoryID(0);
        commonUtilityClass.setVisitCode(0L);
        commonUtilityClass.setBeneficiaryID(0L);
        TeleconsultationRequestOBJ teleconsultationRequestOBJ = new TeleconsultationRequestOBJ();
        teleconsultationRequestOBJ.setAllocationDate(timestamp);
        teleconsultationRequestOBJ.setUserID(0);
        //Act Statement(s)
        int result = target.updateBenFlowtableAfterDocDataSave(commonUtilityClass, false, false, teleconsultationRequestOBJ);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(foetalMonitorRepoMock).getFoetalMonitorDetailsByFlowId(0L);
            verify(foetalMonitorRepoMock).updateVisitCode(0L, 0L);
            verify(commonBenStatusFlowServiceImplMock).updateBenFlowAfterDocData(0L, 0L, 0L, 0L, (short) 1, (short) 1, (short) 0, (short) 1, 0, timestamp, (short) 2);
        });
    }

    //Sapient generated method id: ${9d37b542-df7b-3b69-92c4-87f22a13b531}, hash: 815B9608A971955A22F20218B52B5C41
    @Disabled()
    @Test()
    void updateBenFlowtableAfterDocDataSaveWhenCommonUtilityClassGetIsSpecialistEqualsTrueAndTcSpecialistFlagNotEquals99() throws Exception {
        /* Branches:* (commonUtilityClass != null) : true* (commonUtilityClass.getVisitCategoryID() != null) : true* (commonUtilityClass.getVisitCategoryID() == 4) : true* (foetalMonitorData.size() > 0) : true* (for-each(foetalMonitorData)) : true* (data != null) : true* (!data.getResultState()) : true* (data != null) : true* (data.getVisitCode() == null) : true* (commonUtilityClass != null) : true* (commonUtilityClass.getIsSpecialist() != null) : true* (commonUtilityClass.getIsSpecialist() == true) : true* (isTestPrescribed) : true* (isMedicinePrescribed) : true* (tcRequestOBJ != null) : true* (tcRequestOBJ.getUserID() != null) : true* (tcRequestOBJ.getUserID() > 0) : true* (tcRequestOBJ.getAllocationDate() != null) : true* (commonUtilityClass != null) : true* (commonUtilityClass.getIsSpecialist() != null) : true* (commonUtilityClass.getIsSpecialist() == true) : true* (tcSpecialistFlag == 9) : false* (teleconsultationStats != null) : true* (teleconsultationStats.getEndTime() == null) : true* (commonUtilityClass.getIsSpecialist() == true) : true* (tcSpecialistFlag == 9) : false** TODO: Help needed! This method is not unit testable!*  Method java.lang.System::currentTimeMillis has a unrepeatable behavior*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        FoetalMonitor foetalMonitor = new FoetalMonitor();
        foetalMonitor.setResultState(false);
        foetalMonitor.setVisitCode((Long) null);
        ArrayList<FoetalMonitor> foetalMonitorList = new ArrayList<>();
        foetalMonitorList.add(foetalMonitor);
        doReturn(foetalMonitorList).when(foetalMonitorRepoMock).getFoetalMonitorDetailsByFlowId(0L);
        doReturn(0).when(foetalMonitorRepoMock).updateVisitCode(0L, 0L);
        doReturn(0).when(commonBenStatusFlowServiceImplMock).updateBenFlowAfterDocDataFromSpecialist(0L, 0L, 0L, 0L, (short) 1, (short) 1, (short) 0, (short) 1, (short) 2);
        TeleconsultationStats teleconsultationStatsMock = mock(TeleconsultationStats.class);
        doReturn(teleconsultationStatsMock).when(teleconsultationStatsRepoMock).getLatestStartTime(0L, 0L);
        doReturn(null).when(teleconsultationStatsMock).getEndTime();
        doNothing().when(teleconsultationStatsMock).setEndTime((Timestamp) any());
        Object object = new Object();
        doReturn(object).when(teleconsultationStatsRepoMock).save(teleconsultationStatsMock);
        CommonUtilityClass commonUtilityClass = new CommonUtilityClass();
        commonUtilityClass.setBenVisitID(0L);
        commonUtilityClass.setBeneficiaryRegID(0L);
        commonUtilityClass.setBenFlowID(0L);
        commonUtilityClass.setIsSpecialist(true);
        commonUtilityClass.setVisitCategoryID(4);
        commonUtilityClass.setVisitCode(0L);
        commonUtilityClass.setBeneficiaryID(0L);
        Timestamp timestamp = new Timestamp(0L);
        TeleconsultationRequestOBJ teleconsultationRequestOBJ = new TeleconsultationRequestOBJ();
        teleconsultationRequestOBJ.setAllocationDate(timestamp);
        teleconsultationRequestOBJ.setUserID(1);
        //Act Statement(s)
        int result = target.updateBenFlowtableAfterDocDataSave(commonUtilityClass, true, true, teleconsultationRequestOBJ);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(foetalMonitorRepoMock).getFoetalMonitorDetailsByFlowId(0L);
            verify(foetalMonitorRepoMock).updateVisitCode(0L, 0L);
            verify(commonBenStatusFlowServiceImplMock).updateBenFlowAfterDocDataFromSpecialist(0L, 0L, 0L, 0L, (short) 1, (short) 1, (short) 0, (short) 1, (short) 2);
            verify(teleconsultationStatsRepoMock).getLatestStartTime(0L, 0L);
            verify(teleconsultationStatsMock).getEndTime();
            verify(teleconsultationStatsMock).setEndTime((Timestamp) any());
            verify(teleconsultationStatsRepoMock).save(teleconsultationStatsMock);
        });
    }

    //Sapient generated method id: ${d14c69b8-dc5a-3909-a20e-1c76de2811a7}, hash: C786A18038778B1F60B3479E11323007
    @Disabled()
    @Test()
    void updateBenFlowtableAfterDocDataSaveWhenCommonUtilityClassGetIsSpecialistEqualsFalseAndDocFlagNotEquals914() throws Exception {
        /* Branches:* (commonUtilityClass != null) : true* (commonUtilityClass.getVisitCategoryID() != null) : true* (commonUtilityClass.getVisitCategoryID() == 4) : true* (foetalMonitorData.size() > 0) : true* (for-each(foetalMonitorData)) : true* (data != null) : true* (!data.getResultState()) : true* (data != null) : true* (data.getVisitCode() == null) : true* (commonUtilityClass != null) : true* (commonUtilityClass.getIsSpecialist() != null) : true* (commonUtilityClass.getIsSpecialist() == true) : true* (isTestPrescribed) : true* (isMedicinePrescribed) : true* (tcRequestOBJ != null) : true* (tcRequestOBJ.getUserID() != null) : true* (tcRequestOBJ.getUserID() > 0) : true* (tcRequestOBJ.getAllocationDate() != null) : true* (commonUtilityClass != null) : true* (commonUtilityClass.getIsSpecialist() != null) : true* (commonUtilityClass.getIsSpecialist() == true) : true* (tcSpecialistFlag == 9) : false* (teleconsultationStats != null) : true* (teleconsultationStats.getEndTime() == null) : false* (commonUtilityClass.getIsSpecialist() == true) : false* (commonUtilityClass.getIsSpecialist() == false) : true* (docFlag == 9) : false** TODO: Help needed! This method is not unit testable!*  Method java.lang.System::currentTimeMillis has a unrepeatable behavior*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<FoetalMonitor> foetalMonitorList = new ArrayList<>();
        doReturn(foetalMonitorList).when(foetalMonitorRepoMock).getFoetalMonitorDetailsByFlowId(0L);
        doReturn(0).when(foetalMonitorRepoMock).updateVisitCode(0L, 0L);
        doReturn(0).when(commonBenStatusFlowServiceImplMock).updateBenFlowAfterDocDataFromSpecialist(0L, 0L, 0L, 0L, (short) 1, (short) 1, (short) 0, (short) 1, (short) 2);
        TeleconsultationStats teleconsultationStatsMock = mock(TeleconsultationStats.class);
        doReturn(teleconsultationStatsMock).when(teleconsultationStatsRepoMock).getLatestStartTime(0L, 0L);
        Timestamp timestamp = new Timestamp(0L);
        doReturn(timestamp).when(teleconsultationStatsMock).getEndTime();
        doNothing().when(teleconsultationStatsMock).settMStatsID(null);
        doNothing().when(teleconsultationStatsMock).setEndTime((Timestamp) any());
        Object object = new Object();
        doReturn(object).when(teleconsultationStatsRepoMock).save(teleconsultationStatsMock);
        CommonUtilityClass commonUtilityClass = new CommonUtilityClass();
        commonUtilityClass.setBenVisitID(0L);
        commonUtilityClass.setBeneficiaryRegID(0L);
        commonUtilityClass.setBenFlowID(0L);
        commonUtilityClass.setIsSpecialist(false);
        commonUtilityClass.setVisitCategoryID(0);
        commonUtilityClass.setVisitCode(0L);
        commonUtilityClass.setBeneficiaryID(0L);
        Timestamp timestamp2 = new Timestamp(0L);
        TeleconsultationRequestOBJ teleconsultationRequestOBJ = new TeleconsultationRequestOBJ();
        teleconsultationRequestOBJ.setAllocationDate(timestamp2);
        teleconsultationRequestOBJ.setUserID(0);
        //Act Statement(s)
        int result = target.updateBenFlowtableAfterDocDataSave(commonUtilityClass, false, false, teleconsultationRequestOBJ);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(foetalMonitorRepoMock).getFoetalMonitorDetailsByFlowId(0L);
            verify(foetalMonitorRepoMock).updateVisitCode(0L, 0L);
            verify(commonBenStatusFlowServiceImplMock).updateBenFlowAfterDocDataFromSpecialist(0L, 0L, 0L, 0L, (short) 1, (short) 1, (short) 0, (short) 1, (short) 2);
            verify(teleconsultationStatsRepoMock).getLatestStartTime(0L, 0L);
            verify(teleconsultationStatsMock).getEndTime();
            verify(teleconsultationStatsMock).settMStatsID(null);
            verify(teleconsultationStatsMock).setEndTime((Timestamp) any());
            verify(teleconsultationStatsRepoMock).save(teleconsultationStatsMock);
        });
    }

    //Sapient generated method id: ${486415e6-9db3-37ad-976a-dc248c2d3235}, hash: BEDD8E2DF8DC613E1F8D9551E89FB042
    @Disabled()
    @Test()
    void updateBenFlowtableAfterDocDataUpdateWhenCommonUtilityClassGetIsSpecialistEqualsTrueAndTcSpecialistFlagNotEquals92() throws Exception {
        /* Branches:* (commonUtilityClass != null) : true* (commonUtilityClass.getVisitCategoryID() != null) : true* (commonUtilityClass.getVisitCategoryID() == 4) : true* (foetalMonitorData.size() > 0) : true* (for-each(foetalMonitorData)) : true* (data != null) : true* (!data.getResultState()) : true* (data != null) : true* (data.getVisitCode() == null) : true* (commonUtilityClass.getIsSpecialist() != null) : true* (commonUtilityClass.getIsSpecialist() == true) : true* (isTestPrescribed) : true* (isMedicinePrescribed) : false* (tcSpecialistFlag == 9) : false* (teleconsultationStats != null) : true* (teleconsultationStats.getEndTime() == null) : true* (commonUtilityClass.getIsSpecialist() == true) : true* (tcSpecialistFlag == 9) : false** TODO: Help needed! This method is not unit testable!*  Method java.lang.System::currentTimeMillis has a unrepeatable behavior*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        FoetalMonitor foetalMonitor = new FoetalMonitor();
        foetalMonitor.setResultState(false);
        foetalMonitor.setVisitCode((Long) null);
        ArrayList<FoetalMonitor> foetalMonitorList = new ArrayList<>();
        foetalMonitorList.add(foetalMonitor);
        doReturn(foetalMonitorList).when(foetalMonitorRepoMock).getFoetalMonitorDetailsByFlowId(0L);
        doReturn(0).when(foetalMonitorRepoMock).updateVisitCode(0L, 0L);
        doReturn(0).when(commonBenStatusFlowServiceImplMock).updateBenFlowAfterDocDataUpdateTCSpecialist(0L, 0L, 0L, 0L, (short) 0, (short) 0, (short) 0, (short) 2, 0, (Timestamp) null, (short) 2);
        TeleconsultationStats teleconsultationStatsMock = mock(TeleconsultationStats.class);
        doReturn(teleconsultationStatsMock).when(teleconsultationStatsRepoMock).getLatestStartTime(0L, 0L);
        doReturn(null).when(teleconsultationStatsMock).getEndTime();
        doNothing().when(teleconsultationStatsMock).setEndTime((Timestamp) any());
        Object object = new Object();
        doReturn(object).when(teleconsultationStatsRepoMock).save(teleconsultationStatsMock);
        CommonUtilityClass commonUtilityClass = new CommonUtilityClass();
        commonUtilityClass.setBenVisitID(0L);
        commonUtilityClass.setBeneficiaryRegID(0L);
        commonUtilityClass.setBenFlowID(0L);
        commonUtilityClass.setIsSpecialist(true);
        commonUtilityClass.setVisitCategoryID(4);
        commonUtilityClass.setVisitCode(0L);
        commonUtilityClass.setBeneficiaryID(0L);
        TeleconsultationRequestOBJ teleconsultationRequestOBJMock = mock(TeleconsultationRequestOBJ.class);
        //Act Statement(s)
        int result = target.updateBenFlowtableAfterDocDataUpdate(commonUtilityClass, true, false, teleconsultationRequestOBJMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(foetalMonitorRepoMock).getFoetalMonitorDetailsByFlowId(0L);
            verify(foetalMonitorRepoMock).updateVisitCode(0L, 0L);
            verify(commonBenStatusFlowServiceImplMock).updateBenFlowAfterDocDataUpdateTCSpecialist(0L, 0L, 0L, 0L, (short) 0, (short) 0, (short) 0, (short) 2, 0, (Timestamp) null, (short) 2);
            verify(teleconsultationStatsRepoMock).getLatestStartTime(0L, 0L);
            verify(teleconsultationStatsMock).getEndTime();
            verify(teleconsultationStatsMock).setEndTime((Timestamp) any());
            verify(teleconsultationStatsRepoMock).save(teleconsultationStatsMock);
        });
    }

    //Sapient generated method id: ${8dd7417a-8889-3b60-90cb-1ccd951e3f74}, hash: 9AD8C2754F6279400D735101659C8A11
    @Disabled()
    @Test()
    void updateBenFlowtableAfterDocDataUpdateWhenTcRequestOBJGetAllocationDateIsNotNullAndCommonUtilityClassGetIsSpecialistEqual() throws Exception {
        /* Branches:* (commonUtilityClass != null) : true* (commonUtilityClass.getVisitCategoryID() != null) : true* (commonUtilityClass.getVisitCategoryID() == 4) : true* (foetalMonitorData.size() > 0) : true* (for-each(foetalMonitorData)) : true* (data != null) : true* (!data.getResultState()) : true* (data != null) : true* (data.getVisitCode() == null) : true* (commonUtilityClass.getIsSpecialist() != null) : true* (commonUtilityClass.getIsSpecialist() == true) : false* (isTestPrescribed) : true* (isMedicinePrescribed) : true* (tcRequestOBJ != null) : true* (tcRequestOBJ.getUserID() != null) : true* (tcRequestOBJ.getUserID() > 0) : true* (tcRequestOBJ.getAllocationDate() != null) : true* (commonUtilityClass.getIsSpecialist() == true) : true* (tcSpecialistFlag == 9) : false** TODO: Help needed! Please adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<FoetalMonitor> foetalMonitorList = new ArrayList<>();
        doReturn(foetalMonitorList).when(foetalMonitorRepoMock).getFoetalMonitorDetailsByFlowId(0L);
        doReturn(0).when(foetalMonitorRepoMock).updateVisitCode(0L, 0L);
        Timestamp timestamp = new Timestamp(0L);
        doReturn(0).when(commonBenStatusFlowServiceImplMock).updateBenFlowAfterDocDataUpdate(0L, 0L, 0L, 0L, (short) 2, (short) 1, (short) 0, (short) 1, 0, timestamp, (short) 2);
        CommonUtilityClass commonUtilityClass = new CommonUtilityClass();
        commonUtilityClass.setBenVisitID(0L);
        commonUtilityClass.setBeneficiaryRegID(0L);
        commonUtilityClass.setBenFlowID(0L);
        commonUtilityClass.setIsSpecialist(false);
        commonUtilityClass.setVisitCategoryID(0);
        commonUtilityClass.setVisitCode(0L);
        commonUtilityClass.setBeneficiaryID(0L);
        TeleconsultationRequestOBJ teleconsultationRequestOBJ = new TeleconsultationRequestOBJ();
        teleconsultationRequestOBJ.setAllocationDate(timestamp);
        teleconsultationRequestOBJ.setUserID(0);
        //Act Statement(s)
        int result = target.updateBenFlowtableAfterDocDataUpdate(commonUtilityClass, false, false, teleconsultationRequestOBJ);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(foetalMonitorRepoMock).getFoetalMonitorDetailsByFlowId(0L);
            verify(foetalMonitorRepoMock).updateVisitCode(0L, 0L);
            verify(commonBenStatusFlowServiceImplMock).updateBenFlowAfterDocDataUpdate(0L, 0L, 0L, 0L, (short) 2, (short) 1, (short) 0, (short) 1, 0, timestamp, (short) 2);
        });
    }

    //Sapient generated method id: ${887022bb-ef62-3a4b-b918-dc9ea8fee653}, hash: CF122A318A39D5F099CC9AE30B7C12FE
    @Disabled()
    @Test()
    void updateBenFlowtableAfterDocDataUpdateWhenCommonUtilityClassGetIsSpecialistEqualsFalseAndDocFlagNotEquals911() throws Exception {
        /* Branches:* (commonUtilityClass != null) : true* (commonUtilityClass.getVisitCategoryID() != null) : true* (commonUtilityClass.getVisitCategoryID() == 4) : true* (foetalMonitorData.size() > 0) : true* (for-each(foetalMonitorData)) : true* (data != null) : true* (!data.getResultState()) : true* (data != null) : true* (data.getVisitCode() == null) : true* (commonUtilityClass.getIsSpecialist() != null) : true* (commonUtilityClass.getIsSpecialist() == true) : true* (isTestPrescribed) : false* (labTechnicianFlag == 3) : false* (isMedicinePrescribed) : true* (tcSpecialistFlag == 9) : false* (teleconsultationStats != null) : true* (teleconsultationStats.getEndTime() == null) : false* (commonUtilityClass.getIsSpecialist() == true) : false* (commonUtilityClass.getIsSpecialist() == false) : true* (docFlag == 9) : false** TODO: Help needed! This method is not unit testable!*  Method java.lang.System::currentTimeMillis has a unrepeatable behavior*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<FoetalMonitor> foetalMonitorList = new ArrayList<>();
        doReturn(foetalMonitorList).when(foetalMonitorRepoMock).getFoetalMonitorDetailsByFlowId(0L);
        doReturn(0).when(foetalMonitorRepoMock).updateVisitCode(0L, 0L);
        doReturn(0).when(commonBenStatusFlowServiceImplMock).updateBenFlowAfterDocDataUpdateTCSpecialist(0L, 0L, 0L, 0L, (short) 0, (short) 1, (short) 0, (short) 9, 0, (Timestamp) null, (short) 2);
        TeleconsultationStats teleconsultationStatsMock = mock(TeleconsultationStats.class);
        doReturn(teleconsultationStatsMock).when(teleconsultationStatsRepoMock).getLatestStartTime(0L, 0L);
        Timestamp timestamp = new Timestamp(0L);
        doReturn(timestamp).when(teleconsultationStatsMock).getEndTime();
        doNothing().when(teleconsultationStatsMock).settMStatsID(null);
        doNothing().when(teleconsultationStatsMock).setEndTime((Timestamp) any());
        Object object = new Object();
        doReturn(object).when(teleconsultationStatsRepoMock).save(teleconsultationStatsMock);
        CommonUtilityClass commonUtilityClass = new CommonUtilityClass();
        commonUtilityClass.setBenVisitID(0L);
        commonUtilityClass.setBeneficiaryRegID(0L);
        commonUtilityClass.setBenFlowID(0L);
        commonUtilityClass.setIsSpecialist(false);
        commonUtilityClass.setVisitCategoryID(0);
        commonUtilityClass.setVisitCode(0L);
        commonUtilityClass.setBeneficiaryID(0L);
        TeleconsultationRequestOBJ teleconsultationRequestOBJMock = mock(TeleconsultationRequestOBJ.class);
        //Act Statement(s)
        int result = target.updateBenFlowtableAfterDocDataUpdate(commonUtilityClass, false, false, teleconsultationRequestOBJMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo(0));
            verify(foetalMonitorRepoMock).getFoetalMonitorDetailsByFlowId(0L);
            verify(foetalMonitorRepoMock).updateVisitCode(0L, 0L);
            verify(commonBenStatusFlowServiceImplMock).updateBenFlowAfterDocDataUpdateTCSpecialist(0L, 0L, 0L, 0L, (short) 0, (short) 1, (short) 0, (short) 9, 0, (Timestamp) null, (short) 2);
            verify(teleconsultationStatsRepoMock).getLatestStartTime(0L, 0L);
            verify(teleconsultationStatsMock).getEndTime();
            verify(teleconsultationStatsMock).settMStatsID(null);
            verify(teleconsultationStatsMock).setEndTime((Timestamp) any());
            verify(teleconsultationStatsRepoMock).save(teleconsultationStatsMock);
        });
    }

    //Sapient generated method id: ${31d11da3-5b9f-33e1-934b-aaf7c5b6ceb9}, hash: EA849B9787ACE6FB933AB98C4BDD5AC5
    @Test()
    void deletePrescribedMedicineWhenIGreaterThan0() throws JSONException {
        /* Branches:* (obj != null) : true* (obj.has("id")) : true* (i > 0) : true*/
        //Arrange Statement(s)
        JSONObject objMock = mock(JSONObject.class);
        doReturn(true).when(objMock).has("id");
        doReturn(1L).when(objMock).getLong("id");
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(1).when(prescribedDrugDetailRepoMock).deletePrescribedmedicine(1L);
        //Act Statement(s)
        String result = target.deletePrescribedMedicine(objMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("record deleted successfully"));
            verify(objMock).has("id");
            verify(objMock).getLong("id");
            verify(prescribedDrugDetailRepoMock).deletePrescribedmedicine(1L);
        });
    }

    //Sapient generated method id: ${97318e5f-2789-3b03-ba64-49e83a9a035d}, hash: D38049B04B1F65A8FB84DF963BB7012C
    @Test()
    void deletePrescribedMedicineWhenObjHasIdAndINotGreaterThan0() throws JSONException {
        /* Branches:* (obj != null) : true* (obj.has("id")) : true* (i > 0) : false*/
        //Arrange Statement(s)
        JSONObject objMock = mock(JSONObject.class);
        doReturn(true).when(objMock).has("id");
        doReturn(-1L).when(objMock).getLong("id");
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        doReturn(-1).when(prescribedDrugDetailRepoMock).deletePrescribedmedicine(-1L);
        //Act Statement(s)
        String result = target.deletePrescribedMedicine(objMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(objMock).has("id");
            verify(objMock).getLong("id");
            verify(prescribedDrugDetailRepoMock).deletePrescribedmedicine(-1L);
        });
    }

    //Sapient generated method id: ${36ddeb78-5ea6-31b7-9a77-a93fcb468cda}, hash: ACA27C8B68A09DCB0D2D81E7004D6B88
    @Test()
    void deletePrescribedMedicineWhenCaughtJSONExceptionAndIGreaterThan0() throws JSONException {
        /* Branches:* (obj != null) : true* (obj.has("id")) : true* (catch-exception (JSONException)) : true* (i > 0) : true*/
        //Arrange Statement(s)
        JSONObject objMock = mock(JSONObject.class);
        doReturn(true).when(objMock).has("id");
        JSONException jSONExceptionMock = mock(JSONException.class);
        doThrow(jSONExceptionMock).when(objMock).getLong("id");
        doNothing().when(jSONExceptionMock).printStackTrace();
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.deletePrescribedMedicine(objMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(objMock).has("id");
            verify(objMock).getLong("id");
            verify(jSONExceptionMock, atLeast(1)).printStackTrace();
        });
    }

    //Sapient generated method id: ${fedb2287-5582-3f33-a310-f2cf6ec0cba7}, hash: 48EC47FEE8C950CE5341078A8105841B
    @Test()
    void deletePrescribedMedicineWhenCaughtJSONExceptionAndINotGreaterThan0() throws JSONException {
        /* Branches:* (obj != null) : true* (obj.has("id")) : true* (catch-exception (JSONException)) : true* (i > 0) : false*/
        //Arrange Statement(s)
        JSONObject objMock = mock(JSONObject.class);
        doReturn(true).when(objMock).has("id");
        JSONException jSONExceptionMock = mock(JSONException.class);
        doThrow(jSONExceptionMock).when(objMock).getLong("id");
        doNothing().when(jSONExceptionMock).printStackTrace();
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        //Act Statement(s)
        String result = target.deletePrescribedMedicine(objMock);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, is(nullValue()));
            verify(objMock).has("id");
            verify(objMock).getLong("id");
            verify(jSONExceptionMock, atLeast(1)).printStackTrace();
        });
    }

    //Sapient generated method id: ${ca2821e7-4d1b-3913-beb9-36f051a676f5}, hash: B4EC18D2B2F97CC759F11D117F771768
    @Disabled()
    @Test()
    void callTmForSpecialistSlotBookWhenJsnOBJGetStatusCodeGetAsIntEquals200() throws RestClientException {
        /* Branches:* (response.getStatusCodeValue() == 200) : true* (response.hasBody()) : true* (jsnOBJ.has("statusCode")) : true* (jsnOBJ.get("statusCode").getAsInt() == 200) : true** TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: restTemplate, response*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.*/
        //Arrange Statement(s)
        try (MockedStatic<OutputMapper> outputMapper = mockStatic(OutputMapper.class)) {
            Gson gson = new Gson();
            outputMapper.when(() -> OutputMapper.gson()).thenReturn(gson);
            target = new CommonDoctorServiceImpl();
            autoCloseableMocks = MockitoAnnotations.openMocks(this);
            TcSpecialistSlotBookingRequestOBJ tcSpecialistSlotBookingRequestOBJ = new TcSpecialistSlotBookingRequestOBJ();
            //Act Statement(s)
            int result = target.callTmForSpecialistSlotBook(tcSpecialistSlotBookingRequestOBJ, "someAuthorizationValue");
            //Assert statement(s)
            assertAll("result", () -> {
                assertThat(result, equalTo(1));
                outputMapper.verify(() -> OutputMapper.gson(), atLeast(1));
            });
        }
    }

    //Sapient generated method id: ${7ba8f2a2-b18b-36cf-b100-8c0edbd0477d}, hash: B001884858F02002112463D9F70377F8
    @Test()
    void createTMPrescriptionSmsWhenCommonUtilityClassGetVisitCategoryIDEquals8AndPrescriptionDetailsIsNotNullAndKEquals0() throws Exception {
        /* Branches:* (prescriptionDetails != null) : true* (prescriptionDetails.size() > 0) : true* (commonUtilityClass.getVisitCategoryID() == 6) : false* (commonUtilityClass.getVisitCategoryID() == 7) : false* (commonUtilityClass.getVisitCategoryID() == 8) : true* (prescriptionDetails != null) : true* (k != 0) : false*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        PrescribedDrugDetail prescribedDrugDetailMock = mock(PrescribedDrugDetail.class);
        List<PrescribedDrugDetail> prescribedDrugDetailList = new ArrayList<>();
        prescribedDrugDetailList.add(prescribedDrugDetailMock);
        doReturn(prescribedDrugDetailList).when(prescribedDrugDetailRepoMock).getPrescriptionDetails(0L);
        List<Object> objectList = new ArrayList<>();
        doReturn(objectList).when(prescriptionDetailRepoMock).getProvisionalDiagnosis(0L, 0L);
        doReturn(0).when(sMSGatewayServiceImplMock).smsSenderGateway2("prescription", prescribedDrugDetailList, "authorization1", 0L, "createdBy1", objectList);
        CommonUtilityClass commonUtilityClass = new CommonUtilityClass();
        commonUtilityClass.setAuthorization("authorization1");
        commonUtilityClass.setPrescriptionID(0L);
        commonUtilityClass.setBeneficiaryRegID(0L);
        commonUtilityClass.setCreatedBy("createdBy1");
        commonUtilityClass.setVisitCategoryID(8);
        commonUtilityClass.setVisitCode(0L);
        //Act Statement(s)
        target.createTMPrescriptionSms(commonUtilityClass);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(prescribedDrugDetailRepoMock).getPrescriptionDetails(0L);
            verify(prescriptionDetailRepoMock).getProvisionalDiagnosis(0L, 0L);
            verify(sMSGatewayServiceImplMock).smsSenderGateway2("prescription", prescribedDrugDetailList, "authorization1", 0L, "createdBy1", objectList);
        });
    }

    //Sapient generated method id: ${b9a82977-e2bf-3294-bffb-9b042abac7b7}, hash: 8FDBAB2AF30DE012C638F0C246A0E78A
    @Test()
    void createTMPrescriptionSmsWhenCommonUtilityClassGetVisitCategoryIDEquals8AndPrescriptionDetailsIsNotNullAndCaughtException() throws Exception {
        /* Branches:* (prescriptionDetails != null) : true* (prescriptionDetails.size() > 0) : true* (commonUtilityClass.getVisitCategoryID() == 6) : false* (commonUtilityClass.getVisitCategoryID() == 7) : false* (commonUtilityClass.getVisitCategoryID() == 8) : true* (prescriptionDetails != null) : true* (catch-exception (Exception)) : true* (k != 0) : true*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        PrescribedDrugDetail prescribedDrugDetailMock = mock(PrescribedDrugDetail.class);
        List<PrescribedDrugDetail> prescribedDrugDetailList = new ArrayList<>();
        prescribedDrugDetailList.add(prescribedDrugDetailMock);
        doReturn(prescribedDrugDetailList).when(prescribedDrugDetailRepoMock).getPrescriptionDetails(0L);
        List<Object> objectList = new ArrayList<>();
        doReturn(objectList).when(prescriptionDetailRepoMock).getProvisionalDiagnosis(0L, 0L);
        RuntimeException runtimeException = new RuntimeException("A");
        doThrow(runtimeException).when(sMSGatewayServiceImplMock).smsSenderGateway2("prescription", prescribedDrugDetailList, "authorization1", 0L, "createdBy1", objectList);
        CommonUtilityClass commonUtilityClass = new CommonUtilityClass();
        commonUtilityClass.setAuthorization("authorization1");
        commonUtilityClass.setPrescriptionID(0L);
        commonUtilityClass.setBeneficiaryRegID(0L);
        commonUtilityClass.setCreatedBy("createdBy1");
        commonUtilityClass.setVisitCategoryID(8);
        commonUtilityClass.setVisitCode(0L);
        //Act Statement(s)
        target.createTMPrescriptionSms(commonUtilityClass);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(prescribedDrugDetailRepoMock).getPrescriptionDetails(0L);
            verify(prescriptionDetailRepoMock).getProvisionalDiagnosis(0L, 0L);
            verify(sMSGatewayServiceImplMock).smsSenderGateway2("prescription", prescribedDrugDetailList, "authorization1", 0L, "createdBy1", objectList);
        });
    }

    //Sapient generated method id: ${d164e9a9-12a6-3f32-b78d-bc057d53cc87}, hash: 6A52DC45EBB7CC647CE7FE52D7436E5B
    @Test()
    void createTMPrescriptionSmsWhenCommonUtilityClassGetVisitCategoryIDEquals3AndPrescriptionDetailsIsNotNullAndKNotEquals0() throws Exception {
        /* Branches:* (prescriptionDetails != null) : true* (prescriptionDetails.size() > 0) : true* (commonUtilityClass.getVisitCategoryID() == 6) : false* (commonUtilityClass.getVisitCategoryID() == 7) : false* (commonUtilityClass.getVisitCategoryID() == 8) : false* (commonUtilityClass.getVisitCategoryID() == 3) : true* (prescriptionDetails != null) : true* (k != 0) : true*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        PrescribedDrugDetail prescribedDrugDetailMock = mock(PrescribedDrugDetail.class);
        List<PrescribedDrugDetail> prescribedDrugDetailList = new ArrayList<>();
        prescribedDrugDetailList.add(prescribedDrugDetailMock);
        doReturn(prescribedDrugDetailList).when(prescribedDrugDetailRepoMock).getPrescriptionDetails(0L);
        List<Object> objectList = new ArrayList<>();
        doReturn(objectList).when(NCDCareDiagnosisRepoMock).getNCDcondition(0L, 0L);
        doReturn(1).when(sMSGatewayServiceImplMock).smsSenderGateway2("prescription", prescribedDrugDetailList, "authorization1", 0L, "createdBy1", objectList);
        CommonUtilityClass commonUtilityClass = new CommonUtilityClass();
        commonUtilityClass.setAuthorization("authorization1");
        commonUtilityClass.setPrescriptionID(0L);
        commonUtilityClass.setBeneficiaryRegID(0L);
        commonUtilityClass.setCreatedBy("createdBy1");
        commonUtilityClass.setVisitCategoryID(3);
        commonUtilityClass.setVisitCode(0L);
        //Act Statement(s)
        target.createTMPrescriptionSms(commonUtilityClass);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(prescribedDrugDetailRepoMock).getPrescriptionDetails(0L);
            verify(NCDCareDiagnosisRepoMock).getNCDcondition(0L, 0L);
            verify(sMSGatewayServiceImplMock).smsSenderGateway2("prescription", prescribedDrugDetailList, "authorization1", 0L, "createdBy1", objectList);
        });
    }

    //Sapient generated method id: ${61b45606-336c-3e6d-9b9a-5d653b0832ef}, hash: 724E1B54F10CB59C0E5BC1B4BF3C7141
    @Test()
    void createTMPrescriptionSmsWhenCommonUtilityClassGetVisitCategoryIDEquals3AndCaughtExceptionAndPrescriptionDetailsIsNotNull() throws Exception {
        /* Branches:* (prescriptionDetails != null) : true* (prescriptionDetails.size() > 0) : true* (commonUtilityClass.getVisitCategoryID() == 6) : false* (commonUtilityClass.getVisitCategoryID() == 7) : false* (commonUtilityClass.getVisitCategoryID() == 8) : false* (commonUtilityClass.getVisitCategoryID() == 3) : true* (catch-exception (Exception)) : true* (prescriptionDetails != null) : true* (k != 0) : true*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        PrescribedDrugDetail prescribedDrugDetailMock = mock(PrescribedDrugDetail.class);
        List<PrescribedDrugDetail> prescribedDrugDetailList = new ArrayList<>();
        prescribedDrugDetailList.add(prescribedDrugDetailMock);
        doReturn(prescribedDrugDetailList).when(prescribedDrugDetailRepoMock).getPrescriptionDetails(0L);
        RuntimeException runtimeException = new RuntimeException("A");
        doThrow(runtimeException).when(NCDCareDiagnosisRepoMock).getNCDcondition(0L, 0L);
        doReturn(1).when(sMSGatewayServiceImplMock).smsSenderGateway2("prescription", prescribedDrugDetailList, "authorization1", 0L, "createdBy1", (List) null);
        CommonUtilityClass commonUtilityClass = new CommonUtilityClass();
        commonUtilityClass.setAuthorization("authorization1");
        commonUtilityClass.setPrescriptionID(0L);
        commonUtilityClass.setBeneficiaryRegID(0L);
        commonUtilityClass.setCreatedBy("createdBy1");
        commonUtilityClass.setVisitCategoryID(3);
        commonUtilityClass.setVisitCode(0L);
        //Act Statement(s)
        target.createTMPrescriptionSms(commonUtilityClass);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(prescribedDrugDetailRepoMock).getPrescriptionDetails(0L);
            verify(NCDCareDiagnosisRepoMock).getNCDcondition(0L, 0L);
            verify(sMSGatewayServiceImplMock).smsSenderGateway2("prescription", prescribedDrugDetailList, "authorization1", 0L, "createdBy1", (List) null);
        });
    }

    //Sapient generated method id: ${ab991b33-d6d5-3347-b496-8b0b8006afb2}, hash: 87036BEC1F86AD6E0882D66658666987
    @Test()
    void createTMPrescriptionSmsWhenCommonUtilityClassGetVisitCategoryIDEquals5AndPrescriptionDetailsIsNotNullAndKNotEquals0() throws Exception {
        /* Branches:* (prescriptionDetails != null) : true* (prescriptionDetails.size() > 0) : true* (commonUtilityClass.getVisitCategoryID() == 6) : false* (commonUtilityClass.getVisitCategoryID() == 7) : false* (commonUtilityClass.getVisitCategoryID() == 8) : false* (commonUtilityClass.getVisitCategoryID() == 3) : false* (commonUtilityClass.getVisitCategoryID() == 5) : true* (prescriptionDetails != null) : true* (k != 0) : true*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        PrescribedDrugDetail prescribedDrugDetailMock = mock(PrescribedDrugDetail.class);
        List<PrescribedDrugDetail> prescribedDrugDetailList = new ArrayList<>();
        prescribedDrugDetailList.add(prescribedDrugDetailMock);
        doReturn(prescribedDrugDetailList).when(prescribedDrugDetailRepoMock).getPrescriptionDetails(0L);
        List<Object> objectList = new ArrayList<>();
        doReturn(objectList).when(pNCDiagnosisRepoMock).getProvisionalDiagnosis(0L, 0L);
        doReturn(1).when(sMSGatewayServiceImplMock).smsSenderGateway2("prescription", prescribedDrugDetailList, "authorization1", 0L, "createdBy1", objectList);
        CommonUtilityClass commonUtilityClass = new CommonUtilityClass();
        commonUtilityClass.setAuthorization("authorization1");
        commonUtilityClass.setPrescriptionID(0L);
        commonUtilityClass.setBeneficiaryRegID(0L);
        commonUtilityClass.setCreatedBy("createdBy1");
        commonUtilityClass.setVisitCategoryID(5);
        commonUtilityClass.setVisitCode(0L);
        //Act Statement(s)
        target.createTMPrescriptionSms(commonUtilityClass);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(prescribedDrugDetailRepoMock).getPrescriptionDetails(0L);
            verify(pNCDiagnosisRepoMock).getProvisionalDiagnosis(0L, 0L);
            verify(sMSGatewayServiceImplMock).smsSenderGateway2("prescription", prescribedDrugDetailList, "authorization1", 0L, "createdBy1", objectList);
        });
    }

    //Sapient generated method id: ${93e5f845-925d-34d4-8dd1-f8ecea3338d6}, hash: 8D046EA6CAD494399FA4D3D01C2CE685
    @Test()
    void createTMPrescriptionSmsWhenCommonUtilityClassGetVisitCategoryIDEquals5AndCaughtExceptionAndPrescriptionDetailsIsNotNull() throws Exception {
        /* Branches:* (prescriptionDetails != null) : true* (prescriptionDetails.size() > 0) : true* (commonUtilityClass.getVisitCategoryID() == 6) : false* (commonUtilityClass.getVisitCategoryID() == 7) : false* (commonUtilityClass.getVisitCategoryID() == 8) : false* (commonUtilityClass.getVisitCategoryID() == 3) : false* (commonUtilityClass.getVisitCategoryID() == 5) : true* (catch-exception (Exception)) : true* (prescriptionDetails != null) : true* (k != 0) : true*/
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        PrescribedDrugDetail prescribedDrugDetailMock = mock(PrescribedDrugDetail.class);
        List<PrescribedDrugDetail> prescribedDrugDetailList = new ArrayList<>();
        prescribedDrugDetailList.add(prescribedDrugDetailMock);
        doReturn(prescribedDrugDetailList).when(prescribedDrugDetailRepoMock).getPrescriptionDetails(0L);
        RuntimeException runtimeException = new RuntimeException("A");
        doThrow(runtimeException).when(pNCDiagnosisRepoMock).getProvisionalDiagnosis(0L, 0L);
        doReturn(1).when(sMSGatewayServiceImplMock).smsSenderGateway2("prescription", prescribedDrugDetailList, "authorization1", 0L, "createdBy1", (List) null);
        CommonUtilityClass commonUtilityClass = new CommonUtilityClass();
        commonUtilityClass.setAuthorization("authorization1");
        commonUtilityClass.setPrescriptionID(0L);
        commonUtilityClass.setBeneficiaryRegID(0L);
        commonUtilityClass.setCreatedBy("createdBy1");
        commonUtilityClass.setVisitCategoryID(5);
        commonUtilityClass.setVisitCode(0L);
        //Act Statement(s)
        target.createTMPrescriptionSms(commonUtilityClass);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(prescribedDrugDetailRepoMock).getPrescriptionDetails(0L);
            verify(pNCDiagnosisRepoMock).getProvisionalDiagnosis(0L, 0L);
            verify(sMSGatewayServiceImplMock).smsSenderGateway2("prescription", prescribedDrugDetailList, "authorization1", 0L, "createdBy1", (List) null);
        });
    }

    //Sapient generated method id: ${f7af14c1-a55c-35fc-b03d-94b5fd910a5d}, hash: 7B399B06D56E5478592286E970348EC8
    @Test()
    void createTMPrescriptionSmsWhenCaughtExceptionAndPrescriptionDetailsIsNotNullAndKEquals0() throws Exception {
        /* Branches:* (prescriptionDetails != null) : true* (prescriptionDetails.size() > 0) : true* (commonUtilityClass.getVisitCategoryID() == 6) : false* (commonUtilityClass.getVisitCategoryID() == 7) : false* (commonUtilityClass.getVisitCategoryID() == 8) : false* (commonUtilityClass.getVisitCategoryID() == 3) : false* (commonUtilityClass.getVisitCategoryID() == 5) : false* (catch-exception (Exception)) : true* (prescriptionDetails != null) : true* (k != 0) : false*/
        //Arrange Statement(s)
        CommonUtilityClass commonUtilityClassMock = mock(CommonUtilityClass.class);
        doReturn(0L).when(commonUtilityClassMock).getPrescriptionID();
        RuntimeException runtimeException = new RuntimeException("A");
        doThrow(runtimeException).when(commonUtilityClassMock).getVisitCategoryID();
        doReturn("authorization1").when(commonUtilityClassMock).getAuthorization();
        doReturn(0L).when(commonUtilityClassMock).getBeneficiaryRegID();
        doReturn("createdBy1").when(commonUtilityClassMock).getCreatedBy();
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        PrescribedDrugDetail prescribedDrugDetailMock = mock(PrescribedDrugDetail.class);
        List<PrescribedDrugDetail> prescribedDrugDetailList = new ArrayList<>();
        prescribedDrugDetailList.add(prescribedDrugDetailMock);
        doReturn(prescribedDrugDetailList).when(prescribedDrugDetailRepoMock).getPrescriptionDetails(0L);
        doReturn(1).when(sMSGatewayServiceImplMock).smsSenderGateway2("prescription", prescribedDrugDetailList, "authorization1", 0L, "createdBy1", (List) null);
        //Act Statement(s)
        target.createTMPrescriptionSms(commonUtilityClassMock);
        //Assert statement(s)
        assertAll("result", () -> {
            verify(commonUtilityClassMock).getPrescriptionID();
            verify(commonUtilityClassMock).getVisitCategoryID();
            verify(commonUtilityClassMock).getAuthorization();
            verify(commonUtilityClassMock).getBeneficiaryRegID();
            verify(commonUtilityClassMock).getCreatedBy();
            verify(prescribedDrugDetailRepoMock).getPrescriptionDetails(0L);
            verify(sMSGatewayServiceImplMock).smsSenderGateway2("prescription", prescribedDrugDetailList, "authorization1", 0L, "createdBy1", (List) null);
        });
    }

    //Sapient generated method id: ${09044b5b-ffa0-30f0-967c-c2a1c995020f}, hash: D45532C986D8CC6146A8225E77606743
    @Disabled()
    @Test()
    void getFoetalMonitorDataTest() {
        /**
         * TODO: Help needed! This method is not unit testable!*  Following variables could not be isolated/mocked: object of type Gson*  Suggestions:*  You can pass them as constructor arguments or create a setter for them (avoid new operator)*  or adjust the input/test parameter values manually to satisfy the requirements of the given test scenario.*  The test code, including the assertion statements, has been successfully generated.
         */
        //Arrange Statement(s)
        target = new CommonDoctorServiceImpl();
        autoCloseableMocks = MockitoAnnotations.openMocks(this);
        ArrayList<FoetalMonitor> foetalMonitorList = new ArrayList<>();
        doReturn(foetalMonitorList).when(foetalMonitorRepoMock).getFoetalMonitorDetailsForCaseRecord(0L, 0L);
        //Act Statement(s)
        String result = target.getFoetalMonitorData(0L, 0L);
        //Assert statement(s)
        assertAll("result", () -> {
            assertThat(result, equalTo("result1"));
            verify(foetalMonitorRepoMock).getFoetalMonitorDetailsForCaseRecord(0L, 0L);
        });
    }
}
