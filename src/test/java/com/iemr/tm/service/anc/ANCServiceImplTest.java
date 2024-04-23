package com.iemr.tm.service.anc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.google.gson.JsonObject;
import com.iemr.tm.data.anc.ANCCareDetails;
import com.iemr.tm.data.anc.BenFamilyHistory;
import com.iemr.tm.data.anc.BenMedHistory;
import com.iemr.tm.data.anc.BenMedicationHistory;
import com.iemr.tm.data.anc.BenMenstrualDetails;
import com.iemr.tm.data.anc.BenPersonalHabit;
import com.iemr.tm.data.anc.BencomrbidityCondDetails;
import com.iemr.tm.data.anc.ChildVaccineDetail1;
import com.iemr.tm.data.anc.FemaleObstetricHistory;
import com.iemr.tm.data.anc.PhyGeneralExamination;
import com.iemr.tm.data.anc.PhyHeadToToeExamination;
import com.iemr.tm.data.anc.SysCardiovascularExamination;
import com.iemr.tm.data.anc.SysCentralNervousExamination;
import com.iemr.tm.data.anc.SysGenitourinarySystemExamination;
import com.iemr.tm.data.anc.SysMusculoskeletalSystemExamination;
import com.iemr.tm.data.anc.SysObstetricExamination;
import com.iemr.tm.data.anc.SysRespiratoryExamination;
import com.iemr.tm.data.anc.WrapperChildOptionalVaccineDetail;
import com.iemr.tm.data.anc.WrapperComorbidCondDetails;
import com.iemr.tm.data.anc.WrapperFemaleObstetricHistory;
import com.iemr.tm.data.anc.WrapperImmunizationHistory;
import com.iemr.tm.data.anc.WrapperMedicationHistory;
import com.iemr.tm.data.labModule.LabResultEntry;
import com.iemr.tm.data.nurse.BenAnthropometryDetail;
import com.iemr.tm.data.nurse.BenPhysicalVitalDetail;
import com.iemr.tm.data.nurse.BeneficiaryVisitDetail;
import com.iemr.tm.data.nurse.CommonUtilityClass;
import com.iemr.tm.data.quickConsultation.BenChiefComplaint;
import com.iemr.tm.repo.benFlowStatus.BeneficiaryFlowStatusRepo;
import com.iemr.tm.repo.foetalmonitor.FoetalMonitorRepo;
import com.iemr.tm.repo.nurse.BenAnthropometryRepo;
import com.iemr.tm.repo.nurse.BenVisitDetailRepo;
import com.iemr.tm.repo.nurse.anc.ANCCareRepo;
import com.iemr.tm.repo.nurse.anc.ANCDiagnosisRepo;
import com.iemr.tm.repo.nurse.anc.BenAdherenceRepo;
import com.iemr.tm.repo.nurse.anc.BenMedHistoryRepo;
import com.iemr.tm.repo.nurse.anc.BenMenstrualDetailsRepo;
import com.iemr.tm.repo.nurse.anc.BencomrbidityCondRepo;
import com.iemr.tm.repo.nurse.anc.FemaleObstetricHistoryRepo;
import com.iemr.tm.repo.quickConsultation.BenChiefComplaintRepo;
import com.iemr.tm.service.benFlowStatus.CommonBenStatusFlowServiceImpl;
import com.iemr.tm.service.common.transaction.CommonDoctorServiceImpl;
import com.iemr.tm.service.common.transaction.CommonNurseServiceImpl;
import com.iemr.tm.service.common.transaction.CommonServiceImpl;
import com.iemr.tm.service.labtechnician.LabTechnicianServiceImpl;
import com.iemr.tm.service.tele_consultation.SMSGatewayServiceImpl;
import com.iemr.tm.service.tele_consultation.TeleConsultationServiceImpl;

@ExtendWith(MockitoExtension.class)
class ANCServiceImplTest {

	@Mock
	private ANCNurseServiceImpl mockAncNurseServiceImpl;
	@Mock
	private ANCDoctorServiceImpl mockAncDoctorServiceImpl;
	@Mock
	private CommonNurseServiceImpl mockCommonNurseServiceImpl;
	@Mock
	private CommonDoctorServiceImpl mockCommonDoctorServiceImpl;
	@Mock
	private CommonBenStatusFlowServiceImpl mockCommonBenStatusFlowServiceImpl;
	@Mock
	private LabTechnicianServiceImpl mockLabTechnicianServiceImpl;
	@Mock
	private TeleConsultationServiceImpl mockTeleConsultationServiceImpl;
	@Mock
	private CommonServiceImpl mockCommonServiceImpl;
	@Mock
	private ANCCareRepo mockAncCareRepo;
	@Mock
	private FemaleObstetricHistoryRepo mockFemaleObstetricHistoryRepo;
	@Mock
	private ANCDiagnosisRepo mockANCDiagnosisRepo;
	@Mock
	private FoetalMonitorRepo mockFoetalMonitorRepo;
	@Mock
	private BenVisitDetailRepo mockBenVisitDetailRepo;
	@Mock
	private BenChiefComplaintRepo mockBenChiefComplaintRepo;
	@Mock
	private BenAdherenceRepo mockBenAdherenceRepo;
	@Mock
	private BenMenstrualDetailsRepo mockBenMenstrualDetailsRepo;
	@Mock
	private SMSGatewayServiceImpl mockSMSGatewayServiceImpl;
	@Mock
	private BeneficiaryFlowStatusRepo mockBeneficiaryFlowStatusRepo;
	@Mock
	private BenAnthropometryRepo mockBenAnthropometryRepo;
	@Mock
	private BenMedHistoryRepo mockBenMedHistoryRepo;
	@Mock
	private BencomrbidityCondRepo mockBencomrbidityCondRepo;

	@InjectMocks
	private ANCServiceImpl ancServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		ancServiceImplUnderTest.setAncNurseServiceImpl(mockAncNurseServiceImpl);
		ancServiceImplUnderTest.setANCDoctorServiceImpl(mockAncDoctorServiceImpl);
		ancServiceImplUnderTest.setCommonNurseServiceImpl(mockCommonNurseServiceImpl);
		ancServiceImplUnderTest.setCommonDoctorServiceImpl(mockCommonDoctorServiceImpl);
		ancServiceImplUnderTest.setCommonBenStatusFlowServiceImpl(mockCommonBenStatusFlowServiceImpl);
		ancServiceImplUnderTest.setLabTechnicianServiceImpl(mockLabTechnicianServiceImpl);
	}

	@Test
	void testSaveANCNurseData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Configure CommonNurseServiceImpl.saveBenChiefComplaints(...).
		final BenChiefComplaint benChiefComplaint = new BenChiefComplaint();
		benChiefComplaint.setBeneficiaryRegID(0L);
		benChiefComplaint.setBenVisitID(0L);
		benChiefComplaint.setProviderServiceMapID(0);
		benChiefComplaint.setChiefComplaintID(0);
		benChiefComplaint.setVisitCode(0L);

		benChiefComplaint.toString();

		final List<BenChiefComplaint> benChiefComplaintList = List.of(benChiefComplaint);

		// Run the test
		assertThatThrownBy(() -> ancServiceImplUnderTest.saveANCNurseData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testSaveANCDoctorData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> ancServiceImplUnderTest.saveANCDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testSaveBenVisitDetails_CommonNurseServiceImplSaveBeneficiaryVisitDetailsReturnsNull() throws Exception {
		// Setup
		final JsonObject visitDetailsOBJ = new JsonObject();
		final CommonUtilityClass nurseUtilityClass = new CommonUtilityClass();
		nurseUtilityClass.setAuthorization("Authorization");
		nurseUtilityClass.setPrescriptionID(0L);
		nurseUtilityClass.setVisitCategoryID(0);
		nurseUtilityClass.setBenFlowID(0L);
		nurseUtilityClass.setSessionID(0);
		nurseUtilityClass.setVanID(0);
		nurseUtilityClass.setBeneficiaryRegID(0L);
		nurseUtilityClass.setProviderServiceMapID(0);
		nurseUtilityClass.setBenVisitID(0L);
		nurseUtilityClass.setVisitCode(0L);
		nurseUtilityClass.setCreatedBy("createdBy");

		nurseUtilityClass.toString();

		final Map<String, Long> expectedResult = Map.ofEntries(Map.entry("value", 0L));

		// Run the test
		final Map<String, Long> result = ancServiceImplUnderTest.saveBenVisitDetails(visitDetailsOBJ,
				nurseUtilityClass);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testSaveBenANCDetails() throws Exception {
		// Setup
		final JsonObject ancDetailsOBJ = new JsonObject();

		// Run the test
		final Long result = ancServiceImplUnderTest.saveBenANCDetails(ancDetailsOBJ, 0L, 0L);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveBenANCDetails_ANCNurseServiceImplSaveBenAncCareDetailsReturnsNull() throws Exception {
		// Setup
		final JsonObject ancDetailsOBJ = new JsonObject();

		// Run the test
		final Long result = ancServiceImplUnderTest.saveBenANCDetails(ancDetailsOBJ, 0L, 0L);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveBenANCHistoryDetails() throws Exception {
		// Setup
		final JsonObject ancHistoryOBJ = new JsonObject();

		// Run the test
		final Long result = ancServiceImplUnderTest.saveBenANCHistoryDetails(ancHistoryOBJ, 0L, 0L);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveBenANCVitalDetails() throws Exception {
		// Setup
		final JsonObject vitalDetailsOBJ = new JsonObject();
		when(mockCommonNurseServiceImpl.saveBeneficiaryPhysicalAnthropometryDetails(any(BenAnthropometryDetail.class)))
				.thenReturn(0L);
		when(mockCommonNurseServiceImpl.saveBeneficiaryPhysicalVitalDetails(any(BenPhysicalVitalDetail.class)))
				.thenReturn(0L);

		// Run the test
		final Long result = ancServiceImplUnderTest.saveBenANCVitalDetails(vitalDetailsOBJ, 0L, 0L);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveBenANCExaminationDetails() throws Exception {
		// Setup
		final JsonObject examinationDetailsOBJ = new JsonObject();

		// Run the test
		final Long result = ancServiceImplUnderTest.saveBenANCExaminationDetails(examinationDetailsOBJ, 0L, 0L);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testGetBenVisitDetailsFrmNurseANC() {
		// Setup
		// Configure CommonNurseServiceImpl.getCSVisitDetails(...).
		final BeneficiaryVisitDetail beneficiaryVisitDetail = new BeneficiaryVisitDetail();
		beneficiaryVisitDetail.setVisitCode(0L);
		beneficiaryVisitDetail.setServiceProviderName("serviceProviderName");
		beneficiaryVisitDetail.setBeneficiaryRegID(0L);
		beneficiaryVisitDetail.setVisitReason("visitReason");
		beneficiaryVisitDetail.setVisitCategory("visitCategory");
		when(mockCommonNurseServiceImpl.getCSVisitDetails(0L, 0L)).thenReturn(beneficiaryVisitDetail);

		when(mockCommonNurseServiceImpl.getBenAdherence(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBenChiefComplaints(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getLabTestOrders(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = ancServiceImplUnderTest.getBenVisitDetailsFrmNurseANC(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenANCDetailsFrmNurseANC() {
		// Setup
		when(mockAncNurseServiceImpl.getANCCareDetails(0L, 0L)).thenReturn("result");
		when(mockAncNurseServiceImpl.getANCWomenVaccineDetails(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = ancServiceImplUnderTest.getBenANCDetailsFrmNurseANC(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenANCHistoryDetails() {
		// Setup
		// Configure CommonNurseServiceImpl.getPastHistoryData(...).
		final BenMedHistory benMedHistory = new BenMedHistory();
		benMedHistory.setBeneficiaryRegID(0L);
		benMedHistory.setBenVisitID(0L);
		benMedHistory.setProviderServiceMapID(0);
		benMedHistory.setYearofIllness(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		benMedHistory.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getPastHistoryData(0L, 0L)).thenReturn(benMedHistory);

		// Configure CommonNurseServiceImpl.getComorbidityConditionsHistory(...).
		final WrapperComorbidCondDetails wrapperComorbidCondDetails = new WrapperComorbidCondDetails();
		wrapperComorbidCondDetails.setVanID(0);
		wrapperComorbidCondDetails.setParkingPlaceID(0);
		final BencomrbidityCondDetails bencomrbidityCondDetails = new BencomrbidityCondDetails();
		wrapperComorbidCondDetails
				.setComorbidityConcurrentConditionsList(new ArrayList<>(List.of(bencomrbidityCondDetails)));
		wrapperComorbidCondDetails.setBenVisitID(0L);
		wrapperComorbidCondDetails.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getComorbidityConditionsHistory(0L, 0L)).thenReturn(wrapperComorbidCondDetails);

		// Configure CommonNurseServiceImpl.getMedicationHistory(...).
		final WrapperMedicationHistory wrapperMedicationHistory = new WrapperMedicationHistory();
		wrapperMedicationHistory.setVanID(0);
		wrapperMedicationHistory.setParkingPlaceID(0);
		final BenMedicationHistory benMedicationHistory = new BenMedicationHistory();
		wrapperMedicationHistory.setMedicationHistoryList(new ArrayList<>(List.of(benMedicationHistory)));
		wrapperMedicationHistory.setBenVisitID(0L);
		wrapperMedicationHistory.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getMedicationHistory(0L, 0L)).thenReturn(wrapperMedicationHistory);

		// Configure CommonNurseServiceImpl.getPersonalHistory(...).
		final BenPersonalHabit benPersonalHabit = new BenPersonalHabit();
		benPersonalHabit.setVanID(0);
		benPersonalHabit.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalHabit.setTobacco_use_duration(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalHabit.setBenVisitID(0L);
		benPersonalHabit.setVisitCode(0L);

		benPersonalHabit.toString();

		when(mockCommonNurseServiceImpl.getPersonalHistory(0L, 0L)).thenReturn(benPersonalHabit);

		// Configure CommonNurseServiceImpl.getFamilyHistory(...).
		final BenFamilyHistory benFamilyHistory = new BenFamilyHistory();
		benFamilyHistory.setSnomedCode("snomedCode");
		benFamilyHistory.setSnomedTerm("snomedTerm");
		benFamilyHistory.setVanID(0);
		benFamilyHistory.setBenVisitID(0L);
		benFamilyHistory.setVisitCode(0L);

		benFamilyHistory.toString();

		when(mockCommonNurseServiceImpl.getFamilyHistory(0L, 0L)).thenReturn(benFamilyHistory);

		// Configure CommonNurseServiceImpl.getMenstrualHistory(...).
		final BenMenstrualDetails benMenstrualDetails = new BenMenstrualDetails();
		benMenstrualDetails.setVanID(0);
		benMenstrualDetails.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benMenstrualDetails.setLmp_date(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benMenstrualDetails.setBenVisitID(0L);
		benMenstrualDetails.setVisitCode(0L);

		benMenstrualDetails.toString();

		when(mockCommonNurseServiceImpl.getMenstrualHistory(0L, 0L)).thenReturn(benMenstrualDetails);

		// Configure CommonNurseServiceImpl.getFemaleObstetricHistory(...).
		final WrapperFemaleObstetricHistory wrapperFemaleObstetricHistory = new WrapperFemaleObstetricHistory();
		wrapperFemaleObstetricHistory.setVanID(0);
		wrapperFemaleObstetricHistory.setParkingPlaceID(0);
		final FemaleObstetricHistory femaleObstetricHistory = new FemaleObstetricHistory();
		wrapperFemaleObstetricHistory.setFemaleObstetricHistoryList(new ArrayList<>(List.of(femaleObstetricHistory)));
		wrapperFemaleObstetricHistory.setBenVisitID(0L);
		wrapperFemaleObstetricHistory.setVisitCode(0L);

		wrapperFemaleObstetricHistory.toString();

		when(mockCommonNurseServiceImpl.getFemaleObstetricHistory(0L, 0L)).thenReturn(wrapperFemaleObstetricHistory);

		// Configure CommonNurseServiceImpl.getImmunizationHistory(...).
		final WrapperImmunizationHistory wrapperImmunizationHistory = new WrapperImmunizationHistory();
		wrapperImmunizationHistory.setVanID(0);
		wrapperImmunizationHistory.setParkingPlaceID(0);
		final ChildVaccineDetail1 childVaccineDetail1 = new ChildVaccineDetail1();
		wrapperImmunizationHistory.setImmunizationList(new ArrayList<>(List.of(childVaccineDetail1)));
		wrapperImmunizationHistory.setBenVisitID(0L);
		wrapperImmunizationHistory.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getImmunizationHistory(0L, 0L)).thenReturn(wrapperImmunizationHistory);

		// Configure CommonNurseServiceImpl.getChildOptionalVaccineHistory(...).
		final WrapperChildOptionalVaccineDetail wrapperChildOptionalVaccineDetail = new WrapperChildOptionalVaccineDetail();
		wrapperChildOptionalVaccineDetail.setVanID(0);
		wrapperChildOptionalVaccineDetail.setParkingPlaceID(0);
		wrapperChildOptionalVaccineDetail.setBeneficiaryRegID(0L);
		wrapperChildOptionalVaccineDetail.setBenVisitID(0L);
		wrapperChildOptionalVaccineDetail.setVisitCode(0L);

		wrapperChildOptionalVaccineDetail.toString();

		when(mockCommonNurseServiceImpl.getChildOptionalVaccineHistory(0L, 0L))
				.thenReturn(wrapperChildOptionalVaccineDetail);

		// Run the test
		final String result = ancServiceImplUnderTest.getBenANCHistoryDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBeneficiaryVitalDetails() {
		// Setup
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalAnthropometryDetails(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalVitalDetails(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = ancServiceImplUnderTest.getBeneficiaryVitalDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetANCExaminationDetailsData() {
		// Setup
		// Configure CommonNurseServiceImpl.getGeneralExaminationData(...).
		final PhyGeneralExamination phyGeneralExamination = new PhyGeneralExamination();
		phyGeneralExamination.setQuickening("quickening");
		phyGeneralExamination.setFoetalMovements("foetalMovements");
		phyGeneralExamination.setBeneficiaryRegID(0L);
		phyGeneralExamination.setBenVisitID(0L);
		phyGeneralExamination.setVisitCode(0L);

		phyGeneralExamination.toString();

		when(mockCommonNurseServiceImpl.getGeneralExaminationData(0L, 0L)).thenReturn(phyGeneralExamination);

		// Configure CommonNurseServiceImpl.getHeadToToeExaminationData(...).
		final PhyHeadToToeExamination phyHeadToToeExamination = new PhyHeadToToeExamination();
		phyHeadToToeExamination.setBeneficiaryRegID(0L);
		phyHeadToToeExamination.setBenVisitID(0L);
		phyHeadToToeExamination.setHeadtoToeExam("headtoToeExam");
		phyHeadToToeExamination.setHead("head");
		phyHeadToToeExamination.setVisitCode(0L);

		phyHeadToToeExamination.toString();

		when(mockCommonNurseServiceImpl.getHeadToToeExaminationData(0L, 0L)).thenReturn(phyHeadToToeExamination);

		// Configure CommonNurseServiceImpl.getCardiovascularExamination(...).
		final SysCardiovascularExamination sysCardiovascularExamination = new SysCardiovascularExamination();
		sysCardiovascularExamination.setBeneficiaryRegID(0L);
		sysCardiovascularExamination.setBenVisitID(0L);
		sysCardiovascularExamination.setJugularVenousPulse_JVP("jugularVenousPulse_JVP");
		sysCardiovascularExamination.setApexbeatLocation("apexbeatLocation");
		sysCardiovascularExamination.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getCardiovascularExamination(0L, 0L)).thenReturn(sysCardiovascularExamination);

		// Configure CommonNurseServiceImpl.getRespiratoryExamination(...).
		final SysRespiratoryExamination sysRespiratoryExamination = new SysRespiratoryExamination();
		sysRespiratoryExamination.setBeneficiaryRegID(0L);
		sysRespiratoryExamination.setBenVisitID(0L);
		sysRespiratoryExamination.setTrachea("trachea");
		sysRespiratoryExamination.setInspection("inspection");
		sysRespiratoryExamination.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getRespiratoryExamination(0L, 0L)).thenReturn(sysRespiratoryExamination);

		// Configure CommonNurseServiceImpl.getSysCentralNervousExamination(...).
		final SysCentralNervousExamination sysCentralNervousExamination = new SysCentralNervousExamination();
		sysCentralNervousExamination.setBeneficiaryRegID(0L);
		sysCentralNervousExamination.setBenVisitID(0L);
		sysCentralNervousExamination.setHandedness("handedness");
		sysCentralNervousExamination.setCranialNervesExamination("cranialNervesExamination");
		sysCentralNervousExamination.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getSysCentralNervousExamination(0L, 0L))
				.thenReturn(sysCentralNervousExamination);

		// Configure CommonNurseServiceImpl.getMusculoskeletalExamination(...).
		final SysMusculoskeletalSystemExamination sysMusculoskeletalSystemExamination = new SysMusculoskeletalSystemExamination();
		sysMusculoskeletalSystemExamination.setID(0L);
		sysMusculoskeletalSystemExamination.setBeneficiaryRegID(0L);
		sysMusculoskeletalSystemExamination.setBenVisitID(0L);
		sysMusculoskeletalSystemExamination.setJoint_TypeOfJoint("joint_TypeOfJoint");
		sysMusculoskeletalSystemExamination.setVisitCode(0L);

		sysMusculoskeletalSystemExamination.toString();

		when(mockCommonNurseServiceImpl.getMusculoskeletalExamination(0L, 0L))
				.thenReturn(sysMusculoskeletalSystemExamination);

		// Configure CommonNurseServiceImpl.getGenitourinaryExamination(...).
		final SysGenitourinarySystemExamination sysGenitourinarySystemExamination = new SysGenitourinarySystemExamination();
		sysGenitourinarySystemExamination.setBeneficiaryRegID(0L);
		sysGenitourinarySystemExamination.setBenVisitID(0L);
		sysGenitourinarySystemExamination.setRenalAngle("renalAngle");
		sysGenitourinarySystemExamination.setSuprapubicRegion("suprapubicRegion");
		sysGenitourinarySystemExamination.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getGenitourinaryExamination(0L, 0L))
				.thenReturn(sysGenitourinarySystemExamination);

		// Configure ANCNurseServiceImpl.getSysObstetricExamination(...).
		final SysObstetricExamination sysObstetricExamination = new SysObstetricExamination();
		sysObstetricExamination.setBeneficiaryRegID(0L);
		sysObstetricExamination.setBenVisitID(0L);
		sysObstetricExamination.setFundalHeight("fundalHeight");
		sysObstetricExamination.setfHAndPOA_Status("fHAndPOA_Status");
		sysObstetricExamination.setVisitCode(0L);
		when(mockAncNurseServiceImpl.getSysObstetricExamination(0L, 0L)).thenReturn(sysObstetricExamination);

		// Run the test
		final String result = ancServiceImplUnderTest.getANCExaminationDetailsData(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testUpdateBenANCDetails() throws Exception {
		// Setup
		final JsonObject ancDetailsOBJ = new JsonObject();

		// Run the test
		final int result = ancServiceImplUnderTest.updateBenANCDetails(ancDetailsOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenANCHistoryDetails() throws Exception {
		// Setup
		final JsonObject ancHistoryOBJ = new JsonObject();

		// Run the test
		final int result = ancServiceImplUnderTest.updateBenANCHistoryDetails(ancHistoryOBJ);

		// Verify the results
		assertThat(result).isEqualTo(1);
	}

	@Test
	void testUpdateBenANCVitalDetails() throws Exception {
		// Setup
		final JsonObject vitalDetailsOBJ = new JsonObject();
		when(mockCommonNurseServiceImpl.updateANCAnthropometryDetails(any(BenAnthropometryDetail.class))).thenReturn(0);
		when(mockCommonNurseServiceImpl.updateANCPhysicalVitalDetails(any(BenPhysicalVitalDetail.class))).thenReturn(0);

		// Run the test
		final int result = ancServiceImplUnderTest.updateBenANCVitalDetails(vitalDetailsOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenANCExaminationDetails() throws Exception {
		// Setup
		final JsonObject examinationDetailsOBJ = new JsonObject();

		// Run the test
		final int result = ancServiceImplUnderTest.updateBenANCExaminationDetails(examinationDetailsOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testGetBenANCNurseData() {
		// Setup
		when(mockAncNurseServiceImpl.getANCCareDetails(0L, 0L)).thenReturn("result");
		when(mockAncNurseServiceImpl.getANCWomenVaccineDetails(0L, 0L)).thenReturn("result");

		// Configure CommonNurseServiceImpl.getPastHistoryData(...).
		final BenMedHistory benMedHistory = new BenMedHistory();
		benMedHistory.setBeneficiaryRegID(0L);
		benMedHistory.setBenVisitID(0L);
		benMedHistory.setProviderServiceMapID(0);
		benMedHistory.setYearofIllness(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		benMedHistory.setVisitCode(0L);

		benMedHistory.toString();

		when(mockCommonNurseServiceImpl.getPastHistoryData(0L, 0L)).thenReturn(benMedHistory);

		// Configure CommonNurseServiceImpl.getComorbidityConditionsHistory(...).
		final WrapperComorbidCondDetails wrapperComorbidCondDetails = new WrapperComorbidCondDetails();
		wrapperComorbidCondDetails.setVanID(0);
		wrapperComorbidCondDetails.setParkingPlaceID(0);
		final BencomrbidityCondDetails bencomrbidityCondDetails = new BencomrbidityCondDetails();
		wrapperComorbidCondDetails
				.setComorbidityConcurrentConditionsList(new ArrayList<>(List.of(bencomrbidityCondDetails)));
		wrapperComorbidCondDetails.setBenVisitID(0L);
		wrapperComorbidCondDetails.setVisitCode(0L);

		wrapperComorbidCondDetails.toString();

		when(mockCommonNurseServiceImpl.getComorbidityConditionsHistory(0L, 0L)).thenReturn(wrapperComorbidCondDetails);

		// Configure CommonNurseServiceImpl.getMedicationHistory(...).
		final WrapperMedicationHistory wrapperMedicationHistory = new WrapperMedicationHistory();
		wrapperMedicationHistory.setVanID(0);
		wrapperMedicationHistory.setParkingPlaceID(0);
		final BenMedicationHistory benMedicationHistory = new BenMedicationHistory();
		wrapperMedicationHistory.setMedicationHistoryList(new ArrayList<>(List.of(benMedicationHistory)));
		wrapperMedicationHistory.setBenVisitID(0L);
		wrapperMedicationHistory.setVisitCode(0L);

		wrapperMedicationHistory.toString();

		when(mockCommonNurseServiceImpl.getMedicationHistory(0L, 0L)).thenReturn(wrapperMedicationHistory);

		// Configure CommonNurseServiceImpl.getPersonalHistory(...).
		final BenPersonalHabit benPersonalHabit = new BenPersonalHabit();
		benPersonalHabit.setVanID(0);
		benPersonalHabit.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalHabit.setTobacco_use_duration(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalHabit.setBenVisitID(0L);
		benPersonalHabit.setVisitCode(0L);

		benPersonalHabit.toString();

		when(mockCommonNurseServiceImpl.getPersonalHistory(0L, 0L)).thenReturn(benPersonalHabit);

		// Configure CommonNurseServiceImpl.getFamilyHistory(...).
		final BenFamilyHistory benFamilyHistory = new BenFamilyHistory();
		benFamilyHistory.setSnomedCode("snomedCode");
		benFamilyHistory.setSnomedTerm("snomedTerm");
		benFamilyHistory.setVanID(0);
		benFamilyHistory.setBenVisitID(0L);
		benFamilyHistory.setVisitCode(0L);

		benFamilyHistory.toString();

		when(mockCommonNurseServiceImpl.getFamilyHistory(0L, 0L)).thenReturn(benFamilyHistory);

		// Configure CommonNurseServiceImpl.getMenstrualHistory(...).
		final BenMenstrualDetails benMenstrualDetails = new BenMenstrualDetails();
		benMenstrualDetails.setVanID(0);
		benMenstrualDetails.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benMenstrualDetails.setLmp_date(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benMenstrualDetails.setBenVisitID(0L);
		benMenstrualDetails.setVisitCode(0L);

		benMenstrualDetails.toString();

		when(mockCommonNurseServiceImpl.getMenstrualHistory(0L, 0L)).thenReturn(benMenstrualDetails);

		// Configure CommonNurseServiceImpl.getFemaleObstetricHistory(...).
		final WrapperFemaleObstetricHistory wrapperFemaleObstetricHistory = new WrapperFemaleObstetricHistory();
		wrapperFemaleObstetricHistory.setVanID(0);
		wrapperFemaleObstetricHistory.setParkingPlaceID(0);
		final FemaleObstetricHistory femaleObstetricHistory = new FemaleObstetricHistory();
		wrapperFemaleObstetricHistory.setFemaleObstetricHistoryList(new ArrayList<>(List.of(femaleObstetricHistory)));
		wrapperFemaleObstetricHistory.setBenVisitID(0L);
		wrapperFemaleObstetricHistory.setVisitCode(0L);

		wrapperFemaleObstetricHistory.toString();

		when(mockCommonNurseServiceImpl.getFemaleObstetricHistory(0L, 0L)).thenReturn(wrapperFemaleObstetricHistory);

		// Configure CommonNurseServiceImpl.getImmunizationHistory(...).
		final WrapperImmunizationHistory wrapperImmunizationHistory = new WrapperImmunizationHistory();
		wrapperImmunizationHistory.setVanID(0);
		wrapperImmunizationHistory.setParkingPlaceID(0);
		final ChildVaccineDetail1 childVaccineDetail1 = new ChildVaccineDetail1();
		wrapperImmunizationHistory.setImmunizationList(new ArrayList<>(List.of(childVaccineDetail1)));
		wrapperImmunizationHistory.setBenVisitID(0L);
		wrapperImmunizationHistory.setVisitCode(0L);

		wrapperImmunizationHistory.toString();

		when(mockCommonNurseServiceImpl.getImmunizationHistory(0L, 0L)).thenReturn(wrapperImmunizationHistory);

		// Configure CommonNurseServiceImpl.getChildOptionalVaccineHistory(...).
		final WrapperChildOptionalVaccineDetail wrapperChildOptionalVaccineDetail = new WrapperChildOptionalVaccineDetail();
		wrapperChildOptionalVaccineDetail.setVanID(0);
		wrapperChildOptionalVaccineDetail.setParkingPlaceID(0);
		wrapperChildOptionalVaccineDetail.setBeneficiaryRegID(0L);
		wrapperChildOptionalVaccineDetail.setBenVisitID(0L);
		wrapperChildOptionalVaccineDetail.setVisitCode(0L);

		wrapperChildOptionalVaccineDetail.toString();

		when(mockCommonNurseServiceImpl.getChildOptionalVaccineHistory(0L, 0L))
				.thenReturn(wrapperChildOptionalVaccineDetail);

		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalAnthropometryDetails(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalVitalDetails(0L, 0L)).thenReturn("result");

		// Configure CommonNurseServiceImpl.getGeneralExaminationData(...).
		final PhyGeneralExamination phyGeneralExamination = new PhyGeneralExamination();
		phyGeneralExamination.setQuickening("quickening");
		phyGeneralExamination.setFoetalMovements("foetalMovements");
		phyGeneralExamination.setBeneficiaryRegID(0L);
		phyGeneralExamination.setBenVisitID(0L);
		phyGeneralExamination.setVisitCode(0L);

		phyGeneralExamination.toString();

		when(mockCommonNurseServiceImpl.getGeneralExaminationData(0L, 0L)).thenReturn(phyGeneralExamination);

		// Configure CommonNurseServiceImpl.getHeadToToeExaminationData(...).
		final PhyHeadToToeExamination phyHeadToToeExamination = new PhyHeadToToeExamination();
		phyHeadToToeExamination.setBeneficiaryRegID(0L);
		phyHeadToToeExamination.setBenVisitID(0L);
		phyHeadToToeExamination.setHeadtoToeExam("headtoToeExam");
		phyHeadToToeExamination.setHead("head");
		phyHeadToToeExamination.setVisitCode(0L);

		phyHeadToToeExamination.toString();

		when(mockCommonNurseServiceImpl.getHeadToToeExaminationData(0L, 0L)).thenReturn(phyHeadToToeExamination);

		// Configure CommonNurseServiceImpl.getCardiovascularExamination(...).
		final SysCardiovascularExamination sysCardiovascularExamination = new SysCardiovascularExamination();
		sysCardiovascularExamination.setBeneficiaryRegID(0L);
		sysCardiovascularExamination.setBenVisitID(0L);
		sysCardiovascularExamination.setJugularVenousPulse_JVP("jugularVenousPulse_JVP");
		sysCardiovascularExamination.setApexbeatLocation("apexbeatLocation");
		sysCardiovascularExamination.setVisitCode(0L);

		sysCardiovascularExamination.toString();

		when(mockCommonNurseServiceImpl.getCardiovascularExamination(0L, 0L)).thenReturn(sysCardiovascularExamination);

		// Configure CommonNurseServiceImpl.getRespiratoryExamination(...).
		final SysRespiratoryExamination sysRespiratoryExamination = new SysRespiratoryExamination();
		sysRespiratoryExamination.setBeneficiaryRegID(0L);
		sysRespiratoryExamination.setBenVisitID(0L);
		sysRespiratoryExamination.setTrachea("trachea");
		sysRespiratoryExamination.setInspection("inspection");
		sysRespiratoryExamination.setVisitCode(0L);

		sysRespiratoryExamination.toString();

		when(mockCommonNurseServiceImpl.getRespiratoryExamination(0L, 0L)).thenReturn(sysRespiratoryExamination);

		// Configure CommonNurseServiceImpl.getSysCentralNervousExamination(...).
		final SysCentralNervousExamination sysCentralNervousExamination = new SysCentralNervousExamination();
		sysCentralNervousExamination.setBeneficiaryRegID(0L);
		sysCentralNervousExamination.setBenVisitID(0L);
		sysCentralNervousExamination.setHandedness("handedness");
		sysCentralNervousExamination.setCranialNervesExamination("cranialNervesExamination");
		sysCentralNervousExamination.setVisitCode(0L);

		sysCentralNervousExamination.toString();

		when(mockCommonNurseServiceImpl.getSysCentralNervousExamination(0L, 0L))
				.thenReturn(sysCentralNervousExamination);

		// Configure CommonNurseServiceImpl.getMusculoskeletalExamination(...).
		final SysMusculoskeletalSystemExamination sysMusculoskeletalSystemExamination = new SysMusculoskeletalSystemExamination();
		sysMusculoskeletalSystemExamination.setID(0L);
		sysMusculoskeletalSystemExamination.setBeneficiaryRegID(0L);
		sysMusculoskeletalSystemExamination.setBenVisitID(0L);
		sysMusculoskeletalSystemExamination.setJoint_TypeOfJoint("joint_TypeOfJoint");
		sysMusculoskeletalSystemExamination.setVisitCode(0L);

		sysMusculoskeletalSystemExamination.toString();

		when(mockCommonNurseServiceImpl.getMusculoskeletalExamination(0L, 0L))
				.thenReturn(sysMusculoskeletalSystemExamination);

		// Configure CommonNurseServiceImpl.getGenitourinaryExamination(...).
		final SysGenitourinarySystemExamination sysGenitourinarySystemExamination = new SysGenitourinarySystemExamination();
		sysGenitourinarySystemExamination.setBeneficiaryRegID(0L);
		sysGenitourinarySystemExamination.setBenVisitID(0L);
		sysGenitourinarySystemExamination.setRenalAngle("renalAngle");
		sysGenitourinarySystemExamination.setSuprapubicRegion("suprapubicRegion");
		sysGenitourinarySystemExamination.setVisitCode(0L);

		sysGenitourinarySystemExamination.toString();

		when(mockCommonNurseServiceImpl.getGenitourinaryExamination(0L, 0L))
				.thenReturn(sysGenitourinarySystemExamination);

		// Configure ANCNurseServiceImpl.getSysObstetricExamination(...).
		final SysObstetricExamination sysObstetricExamination = new SysObstetricExamination();
		sysObstetricExamination.setBeneficiaryRegID(0L);
		sysObstetricExamination.setBenVisitID(0L);
		sysObstetricExamination.setFundalHeight("fundalHeight");
		sysObstetricExamination.setfHAndPOA_Status("fHAndPOA_Status");
		sysObstetricExamination.setVisitCode(0L);
		when(mockAncNurseServiceImpl.getSysObstetricExamination(0L, 0L)).thenReturn(sysObstetricExamination);

		// Run the test
		final String result = ancServiceImplUnderTest.getBenANCNurseData(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenCaseRecordFromDoctorANC() {
		// Setup
		when(mockCommonDoctorServiceImpl.getFindingsDetails(0L, 0L)).thenReturn("result");
		when(mockAncDoctorServiceImpl.getANCDiagnosisDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getInvestigationDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getPrescribedDrugs(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getReferralDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getFoetalMonitorData(0L, 0L)).thenReturn("result");

		// Configure LabTechnicianServiceImpl.getLabResultDataForBen(...).
		final ArrayList<LabResultEntry> labResultEntries = new ArrayList<>(
				List.of(new LabResultEntry(0L, Date.valueOf(LocalDate.of(2020, 1, 1)))));
		when(mockLabTechnicianServiceImpl.getLabResultDataForBen(0L, 0L)).thenReturn(labResultEntries);

		// Configure CommonNurseServiceImpl.getGraphicalTrendData(...).
		final Map<String, Object> stringObjectMap = Map.ofEntries(Map.entry("value", "value"));
		when(mockCommonNurseServiceImpl.getGraphicalTrendData(0L, "anc")).thenReturn(stringObjectMap);

		when(mockLabTechnicianServiceImpl.getLast_3_ArchivedTestVisitList(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = ancServiceImplUnderTest.getBenCaseRecordFromDoctorANC(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenCaseRecordFromDoctorANC_LabTechnicianServiceImplGetLabResultDataForBenReturnsNoItems() {
		// Setup
		when(mockCommonDoctorServiceImpl.getFindingsDetails(0L, 0L)).thenReturn("result");
		when(mockAncDoctorServiceImpl.getANCDiagnosisDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getInvestigationDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getPrescribedDrugs(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getReferralDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getFoetalMonitorData(0L, 0L)).thenReturn("result");
		when(mockLabTechnicianServiceImpl.getLabResultDataForBen(0L, 0L)).thenReturn(new ArrayList<>());

		// Configure CommonNurseServiceImpl.getGraphicalTrendData(...).
		final Map<String, Object> stringObjectMap = Map.ofEntries(Map.entry("value", "value"));
		when(mockCommonNurseServiceImpl.getGraphicalTrendData(0L, "anc")).thenReturn(stringObjectMap);

		when(mockLabTechnicianServiceImpl.getLast_3_ArchivedTestVisitList(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = ancServiceImplUnderTest.getBenCaseRecordFromDoctorANC(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testUpdateANCDoctorData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> ancServiceImplUnderTest.updateANCDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testGetHRPStatus() throws Exception {
		// Setup
		// Configure BeneficiaryFlowStatusRepo.getBenAgeVal(...).
		final Timestamp timestamp = Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0));
		when(mockBeneficiaryFlowStatusRepo.getBenAgeVal(0L)).thenReturn(timestamp);

		// Run the test
		final String result = ancServiceImplUnderTest.getHRPStatus(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetHRPStatus_BeneficiaryFlowStatusRepoReturnsNull() throws Exception {
		// Setup
		when(mockBeneficiaryFlowStatusRepo.getBenAgeVal(0L)).thenReturn(null);
		when(mockBenAnthropometryRepo.getBenLatestHeight(0L)).thenReturn(0.0);

		// Run the test
		final String result = ancServiceImplUnderTest.getHRPStatus(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetHRPStatus_BenAnthropometryRepoReturnsNull() throws Exception {
		// Setup
		// Configure BeneficiaryFlowStatusRepo.getBenAgeVal(...).
		final Timestamp timestamp = Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0));
		when(mockBeneficiaryFlowStatusRepo.getBenAgeVal(0L)).thenReturn(timestamp);

		// Configure ANCCareRepo.getANCCareDataForHRP(...).
		final ANCCareDetails ancCareDetails1 = new ANCCareDetails();
		ancCareDetails1.setBeneficiaryRegID(0L);
		ancCareDetails1.setBenVisitID(0L);
		ancCareDetails1.setVisitCode(0L);
		ancCareDetails1.setModifiedBy("modifiedBy");
		ancCareDetails1.setLmpDate("lmpDate");
		final ArrayList<ANCCareDetails> ancCareDetails = new ArrayList<>(List.of(ancCareDetails1));

		// Run the test
		final String result = ancServiceImplUnderTest.getHRPStatus(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetHRPStatus_ANCCareRepoReturnsNull() throws Exception {
		// Setup
		// Configure BeneficiaryFlowStatusRepo.getBenAgeVal(...).
		final Timestamp timestamp = Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0));
		when(mockBeneficiaryFlowStatusRepo.getBenAgeVal(0L)).thenReturn(timestamp);

		// Run the test
		final String result = ancServiceImplUnderTest.getHRPStatus(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetHRPStatus_ANCCareRepoReturnsNoItems() throws Exception {
		// Setup
		// Configure BeneficiaryFlowStatusRepo.getBenAgeVal(...).
		final Timestamp timestamp = Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0));

		// Run the test
		final String result = ancServiceImplUnderTest.getHRPStatus(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetHRPStatus_BenMedHistoryRepoReturnsNull() throws Exception {
		// Setup
		// Configure BeneficiaryFlowStatusRepo.getBenAgeVal(...).
		final Timestamp timestamp = Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0));
		when(mockBeneficiaryFlowStatusRepo.getBenAgeVal(0L)).thenReturn(timestamp);

		// Run the test
		final String result = ancServiceImplUnderTest.getHRPStatus(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetHRPStatus_BenMedHistoryRepoReturnsNoItems() throws Exception {
		// Setup
		// Configure BeneficiaryFlowStatusRepo.getBenAgeVal(...).
		final Timestamp timestamp = Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0));

		// Run the test
		final String result = ancServiceImplUnderTest.getHRPStatus(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetHRPStatus_BencomrbidityCondRepoReturnsNull() throws Exception {
		// Setup
		// Configure BeneficiaryFlowStatusRepo.getBenAgeVal(...).
		final Timestamp timestamp = Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0));
		when(mockBeneficiaryFlowStatusRepo.getBenAgeVal(0L)).thenReturn(timestamp);

		// Configure FemaleObstetricHistoryRepo.getPastObestetricDataForHRP(...).
		final FemaleObstetricHistory femaleObstetricHistory = new FemaleObstetricHistory();
		femaleObstetricHistory.setTypeOfAbortionValue("typeOfAbortionValue");
		femaleObstetricHistory.setServiceFacilityValue("serviceFacilityValue");
		femaleObstetricHistory.setAbortionType(Map.ofEntries(Map.entry("value", "value")));
		femaleObstetricHistory.setTypeofFacility(Map.ofEntries(Map.entry("value", "value")));
		femaleObstetricHistory.setPostAbortionComplicationsValues("postAbortionComplicationsValues");

		femaleObstetricHistory.toString();

		final ArrayList<FemaleObstetricHistory> femaleObstetricHistories = new ArrayList<>(
				List.of(femaleObstetricHistory));

		// Run the test
		final String result = ancServiceImplUnderTest.getHRPStatus(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetHRPStatus_BencomrbidityCondRepoReturnsNoItems() throws Exception {
		// Setup
		// Configure BeneficiaryFlowStatusRepo.getBenAgeVal(...).
		final Timestamp timestamp = Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0));

		// Run the test
		final String result = ancServiceImplUnderTest.getHRPStatus(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetHRPStatus_FemaleObstetricHistoryRepoReturnsNull() throws Exception {
		// Setup
		// Configure BeneficiaryFlowStatusRepo.getBenAgeVal(...).
		final Timestamp timestamp = Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0));

		// Run the test
		final String result = ancServiceImplUnderTest.getHRPStatus(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetHRPStatus_FemaleObstetricHistoryRepoReturnsNoItems() throws Exception {
		// Setup
		// Configure BeneficiaryFlowStatusRepo.getBenAgeVal(...).
		final Timestamp timestamp = Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0));

		// Run the test
		final String result = ancServiceImplUnderTest.getHRPStatus(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetHRPStatus_ANCDiagnosisRepoReturnsNull() throws Exception {
		// Setup
		// Configure BeneficiaryFlowStatusRepo.getBenAgeVal(...).
		final Timestamp timestamp = Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0));
		when(mockBeneficiaryFlowStatusRepo.getBenAgeVal(0L)).thenReturn(timestamp);

		// Run the test
		final String result = ancServiceImplUnderTest.getHRPStatus(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetHRPStatus_ANCDiagnosisRepoReturnsNoItems() throws Exception {
		// Setup
		// Configure BeneficiaryFlowStatusRepo.getBenAgeVal(...).
		final Timestamp timestamp = Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0));

		// Run the test
		final String result = ancServiceImplUnderTest.getHRPStatus(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}
}
