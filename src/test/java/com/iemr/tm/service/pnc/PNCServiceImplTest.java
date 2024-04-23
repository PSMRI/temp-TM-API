package com.iemr.tm.service.pnc;

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
import com.iemr.tm.data.anc.BenChildDevelopmentHistory;
import com.iemr.tm.data.anc.BenFamilyHistory;
import com.iemr.tm.data.anc.BenMedHistory;
import com.iemr.tm.data.anc.BenMedicationHistory;
import com.iemr.tm.data.anc.BenMenstrualDetails;
import com.iemr.tm.data.anc.BenPersonalHabit;
import com.iemr.tm.data.anc.BencomrbidityCondDetails;
import com.iemr.tm.data.anc.ChildFeedingDetails;
import com.iemr.tm.data.anc.ChildVaccineDetail1;
import com.iemr.tm.data.anc.FemaleObstetricHistory;
import com.iemr.tm.data.anc.PerinatalHistory;
import com.iemr.tm.data.anc.PhyGeneralExamination;
import com.iemr.tm.data.anc.PhyHeadToToeExamination;
import com.iemr.tm.data.anc.SysCardiovascularExamination;
import com.iemr.tm.data.anc.SysCentralNervousExamination;
import com.iemr.tm.data.anc.SysGastrointestinalExamination;
import com.iemr.tm.data.anc.SysGenitourinarySystemExamination;
import com.iemr.tm.data.anc.SysMusculoskeletalSystemExamination;
import com.iemr.tm.data.anc.SysRespiratoryExamination;
import com.iemr.tm.data.anc.WrapperAncFindings;
import com.iemr.tm.data.anc.WrapperBenInvestigationANC;
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
import com.iemr.tm.data.pnc.PNCDiagnosis;
import com.iemr.tm.data.quickConsultation.BenChiefComplaint;
import com.iemr.tm.data.quickConsultation.PrescribedDrugDetail;
import com.iemr.tm.data.quickConsultation.PrescriptionDetail;
import com.iemr.tm.data.tele_consultation.TeleconsultationRequestOBJ;
import com.iemr.tm.repo.nurse.BenVisitDetailRepo;
import com.iemr.tm.repo.nurse.anc.BenAdherenceRepo;
import com.iemr.tm.repo.quickConsultation.BenChiefComplaintRepo;
import com.iemr.tm.service.benFlowStatus.CommonBenStatusFlowServiceImpl;
import com.iemr.tm.service.common.transaction.CommonDoctorServiceImpl;
import com.iemr.tm.service.common.transaction.CommonNurseServiceImpl;
import com.iemr.tm.service.common.transaction.CommonServiceImpl;
import com.iemr.tm.service.labtechnician.LabTechnicianServiceImpl;
import com.iemr.tm.service.tele_consultation.SMSGatewayServiceImpl;
import com.iemr.tm.service.tele_consultation.TeleConsultationServiceImpl;

@ExtendWith(MockitoExtension.class)
class PNCServiceImplTest {

	@Mock
	private CommonNurseServiceImpl mockCommonNurseServiceImpl;
	@Mock
	private CommonDoctorServiceImpl mockCommonDoctorServiceImpl;
	@Mock
	private PNCNurseServiceImpl mockPncNurseServiceImpl;
	@Mock
	private PNCDoctorServiceImpl mockPncDoctorServiceImpl;
	@Mock
	private CommonBenStatusFlowServiceImpl mockCommonBenStatusFlowServiceImpl;
	@Mock
	private LabTechnicianServiceImpl mockLabTechnicianServiceImpl;
	@Mock
	private TeleConsultationServiceImpl mockTeleConsultationServiceImpl;
	@Mock
	private CommonServiceImpl mockCommonServiceImpl;
	@Mock
	private BenVisitDetailRepo mockBenVisitDetailRepo;
	@Mock
	private BenChiefComplaintRepo mockBenChiefComplaintRepo;
	@Mock
	private BenAdherenceRepo mockBenAdherenceRepo;
	@Mock
	private SMSGatewayServiceImpl mockSMSGatewayServiceImpl;

	@InjectMocks
	private PNCServiceImpl pncServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		pncServiceImplUnderTest.setCommonNurseServiceImpl(mockCommonNurseServiceImpl);
		pncServiceImplUnderTest.setCommonDoctorServiceImpl(mockCommonDoctorServiceImpl);
		pncServiceImplUnderTest.setPncNurseServiceImpl(mockPncNurseServiceImpl);
		pncServiceImplUnderTest.setPncDoctorServiceImpl(mockPncDoctorServiceImpl);
		pncServiceImplUnderTest.setCommonBenStatusFlowServiceImpl(mockCommonBenStatusFlowServiceImpl);
		pncServiceImplUnderTest.setLabTechnicianServiceImpl(mockLabTechnicianServiceImpl);
	}

	@Test
	void testDeleteVisitDetails_BenVisitDetailRepoGetVisitCodeReturnsNull() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Run the test
		pncServiceImplUnderTest.deleteVisitDetails(requestOBJ);

		// Verify the results
	}

	@Test
	void testSavePNCDoctorData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> pncServiceImplUnderTest.savePNCDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testSaveBenVisitDetails() throws Exception {
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

		final Map<String, Long> expectedResult = Map.ofEntries(Map.entry("value", 0L));

		// Run the test
		final Map<String, Long> result = pncServiceImplUnderTest.saveBenVisitDetails(visitDetailsOBJ,
				nurseUtilityClass);

		// Confirm CommonNurseServiceImpl.saveBenChiefComplaints(...).
		final BenChiefComplaint benChiefComplaint = new BenChiefComplaint();
		benChiefComplaint.setBeneficiaryRegID(0L);
		benChiefComplaint.setBenVisitID(0L);
		benChiefComplaint.setProviderServiceMapID(0);
		benChiefComplaint.setChiefComplaintID(0);
		benChiefComplaint.setVisitCode(0L);
		final List<BenChiefComplaint> benChiefComplaintList = List.of(benChiefComplaint);

		assertNotNull(result);
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

		final Map<String, Long> expectedResult = Map.ofEntries(Map.entry("value", 0L));

		// Run the test
		final Map<String, Long> result = pncServiceImplUnderTest.saveBenVisitDetails(visitDetailsOBJ,
				nurseUtilityClass);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testSaveBenPNCHistoryDetails() throws Exception {
		// Setup
		final JsonObject pncHistoryOBJ = new JsonObject();

		// Run the test
		final Long result = pncServiceImplUnderTest.saveBenPNCHistoryDetails(pncHistoryOBJ, 0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo(1L);
	}

	@Test
	void testSaveBenPNCDetails() throws Exception {
		// Setup
		final JsonObject pncDetailsOBJ = new JsonObject();

		// Run the test
		final Long result = pncServiceImplUnderTest.saveBenPNCDetails(pncDetailsOBJ, 0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo(1L);
	}

	@Test
	void testSaveBenPNCVitalDetails() throws Exception {
		// Setup
		final JsonObject vitalDetailsOBJ = new JsonObject();
		when(mockCommonNurseServiceImpl.saveBeneficiaryPhysicalAnthropometryDetails(any(BenAnthropometryDetail.class)))
				.thenReturn(0L);
		when(mockCommonNurseServiceImpl.saveBeneficiaryPhysicalVitalDetails(any(BenPhysicalVitalDetail.class)))
				.thenReturn(0L);

		// Run the test
		final Long result = pncServiceImplUnderTest.saveBenPNCVitalDetails(vitalDetailsOBJ, 0L, 0L);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveBenExaminationDetails() throws Exception {
		// Setup
		final JsonObject examinationDetailsOBJ = new JsonObject();

		// Run the test
		final Long result = pncServiceImplUnderTest.saveBenExaminationDetails(examinationDetailsOBJ, 0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo(1L);
	}

	@Test
	void testGetBenVisitDetailsFrmNursePNC() {
		// Setup
		// Configure CommonNurseServiceImpl.getCSVisitDetails(...).
		final BeneficiaryVisitDetail beneficiaryVisitDetail = new BeneficiaryVisitDetail();
		beneficiaryVisitDetail.setVisitCode(0L);
		beneficiaryVisitDetail.setServiceProviderName("serviceProviderName");
		beneficiaryVisitDetail.setBeneficiaryRegID(0L);
		beneficiaryVisitDetail.setVisitReason("visitReason");
		beneficiaryVisitDetail.setVisitCategory("visitCategory");
		when(mockCommonNurseServiceImpl.getCSVisitDetails(0L, 0L)).thenReturn(beneficiaryVisitDetail);

		when(mockCommonNurseServiceImpl.getBenChiefComplaints(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = pncServiceImplUnderTest.getBenVisitDetailsFrmNursePNC(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenPNCDetailsFrmNursePNC() {
		// Setup
		when(mockPncNurseServiceImpl.getPNCCareDetails(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = pncServiceImplUnderTest.getBenPNCDetailsFrmNursePNC(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenHistoryDetails() {
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
		when(mockCommonNurseServiceImpl.getPersonalHistory(0L, 0L)).thenReturn(benPersonalHabit);

		// Configure CommonNurseServiceImpl.getFamilyHistory(...).
		final BenFamilyHistory benFamilyHistory = new BenFamilyHistory();
		benFamilyHistory.setSnomedCode("snomedCode");
		benFamilyHistory.setSnomedTerm("snomedTerm");
		benFamilyHistory.setVanID(0);
		benFamilyHistory.setBenVisitID(0L);
		benFamilyHistory.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getFamilyHistory(0L, 0L)).thenReturn(benFamilyHistory);

		// Configure CommonNurseServiceImpl.getMenstrualHistory(...).
		final BenMenstrualDetails benMenstrualDetails = new BenMenstrualDetails();
		benMenstrualDetails.setVanID(0);
		benMenstrualDetails.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benMenstrualDetails.setLmp_date(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benMenstrualDetails.setBenVisitID(0L);
		benMenstrualDetails.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getMenstrualHistory(0L, 0L)).thenReturn(benMenstrualDetails);

		// Configure CommonNurseServiceImpl.getFemaleObstetricHistory(...).
		final WrapperFemaleObstetricHistory wrapperFemaleObstetricHistory = new WrapperFemaleObstetricHistory();
		wrapperFemaleObstetricHistory.setVanID(0);
		wrapperFemaleObstetricHistory.setParkingPlaceID(0);
		final FemaleObstetricHistory femaleObstetricHistory = new FemaleObstetricHistory();
		wrapperFemaleObstetricHistory.setFemaleObstetricHistoryList(new ArrayList<>(List.of(femaleObstetricHistory)));
		wrapperFemaleObstetricHistory.setBenVisitID(0L);
		wrapperFemaleObstetricHistory.setVisitCode(0L);
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

		// Configure CommonNurseServiceImpl.getDevelopmentHistory(...).
		final BenChildDevelopmentHistory benChildDevelopmentHistory = new BenChildDevelopmentHistory();
		benChildDevelopmentHistory.setBeneficiaryRegID(0L);
		benChildDevelopmentHistory.setBenVisitID(0L);
		benChildDevelopmentHistory.setProviderServiceMapID(0);
		benChildDevelopmentHistory.setGrossMotorMilestone("grossMotorMilestone");
		benChildDevelopmentHistory.setIsGMMAttained(false);

		benChildDevelopmentHistory.toString();

		when(mockCommonNurseServiceImpl.getDevelopmentHistory(0L, 0L)).thenReturn(benChildDevelopmentHistory);

		// Configure CommonNurseServiceImpl.getPerinatalHistory(...).
		final PerinatalHistory perinatalHistory = new PerinatalHistory();
		perinatalHistory.setBeneficiaryRegID(0L);
		perinatalHistory.setBenVisitID(0L);
		perinatalHistory.setProviderServiceMapID(0);
		perinatalHistory.setPlaceOfDelivery("placeOfDelivery");
		perinatalHistory.setTypeOfDelivery("typeOfDelivery");

		perinatalHistory.toString();

		when(mockCommonNurseServiceImpl.getPerinatalHistory(0L, 0L)).thenReturn(perinatalHistory);

		// Configure CommonNurseServiceImpl.getFeedingHistory(...).
		final ChildFeedingDetails childFeedingDetails = new ChildFeedingDetails();
		childFeedingDetails.setBeneficiaryRegID(0L);
		childFeedingDetails.setBenVisitID(0L);
		childFeedingDetails.setProviderServiceMapID(0);
		childFeedingDetails.setChildID(0L);
		childFeedingDetails.setBenMotherID(0L);

		childFeedingDetails.toString();

		when(mockCommonNurseServiceImpl.getFeedingHistory(0L, 0L)).thenReturn(childFeedingDetails);

		// Run the test
		final String result = pncServiceImplUnderTest.getBenHistoryDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBeneficiaryVitalDetails() {
		// Setup
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalAnthropometryDetails(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalVitalDetails(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = pncServiceImplUnderTest.getBeneficiaryVitalDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetPNCExaminationDetailsData() {
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

		// Configure CommonNurseServiceImpl.getSysGastrointestinalExamination(...).
		final SysGastrointestinalExamination sysGastrointestinalExamination = new SysGastrointestinalExamination();
		sysGastrointestinalExamination.setBeneficiaryRegID(0L);
		sysGastrointestinalExamination.setBenVisitID(0L);
		sysGastrointestinalExamination.setInspection("inspection");
		sysGastrointestinalExamination.setPalpation("palpation");
		sysGastrointestinalExamination.setVisitCode(0L);

		sysGastrointestinalExamination.toString();

		when(mockCommonNurseServiceImpl.getSysGastrointestinalExamination(0L, 0L))
				.thenReturn(sysGastrointestinalExamination);

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

		// Run the test
		final String result = pncServiceImplUnderTest.getPNCExaminationDetailsData(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testUpdateBenHistoryDetails() throws Exception {
		// Setup
		final JsonObject historyOBJ = new JsonObject();

		// Run the test
		final int result = pncServiceImplUnderTest.updateBenHistoryDetails(historyOBJ);

		// Verify the results
		assertThat(result).isEqualTo(1);
	}

	@Test
	void testUpdateBenVitalDetails() throws Exception {
		// Setup
		final JsonObject vitalDetailsOBJ = new JsonObject();
		when(mockCommonNurseServiceImpl.updateANCAnthropometryDetails(any(BenAnthropometryDetail.class))).thenReturn(0);
		when(mockCommonNurseServiceImpl.updateANCPhysicalVitalDetails(any(BenPhysicalVitalDetail.class))).thenReturn(0);

		// Run the test
		final int result = pncServiceImplUnderTest.updateBenVitalDetails(vitalDetailsOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenExaminationDetails() throws Exception {
		// Setup
		final JsonObject examinationDetailsOBJ = new JsonObject();

		// Run the test
		final int result = pncServiceImplUnderTest.updateBenExaminationDetails(examinationDetailsOBJ);

		// Verify the results
		assertThat(result).isEqualTo(1);
	}

	@Test
	void testUpdateBenPNCDetails() throws Exception {
		// Setup
		final JsonObject pncDetailsOBJ = new JsonObject();

		// Run the test
		final int result = pncServiceImplUnderTest.updateBenPNCDetails(pncDetailsOBJ);

		// Verify the results
		assertThat(result).isEqualTo(1);
	}

	@Test
	void testGetBenPNCNurseData() {
		// Setup
		when(mockPncNurseServiceImpl.getPNCCareDetails(0L, 0L)).thenReturn("result");

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
		when(mockCommonNurseServiceImpl.getPersonalHistory(0L, 0L)).thenReturn(benPersonalHabit);

		// Configure CommonNurseServiceImpl.getFamilyHistory(...).
		final BenFamilyHistory benFamilyHistory = new BenFamilyHistory();
		benFamilyHistory.setSnomedCode("snomedCode");
		benFamilyHistory.setSnomedTerm("snomedTerm");
		benFamilyHistory.setVanID(0);
		benFamilyHistory.setBenVisitID(0L);
		benFamilyHistory.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getFamilyHistory(0L, 0L)).thenReturn(benFamilyHistory);

		// Configure CommonNurseServiceImpl.getMenstrualHistory(...).
		final BenMenstrualDetails benMenstrualDetails = new BenMenstrualDetails();
		benMenstrualDetails.setVanID(0);
		benMenstrualDetails.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benMenstrualDetails.setLmp_date(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benMenstrualDetails.setBenVisitID(0L);
		benMenstrualDetails.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getMenstrualHistory(0L, 0L)).thenReturn(benMenstrualDetails);

		// Configure CommonNurseServiceImpl.getFemaleObstetricHistory(...).
		final WrapperFemaleObstetricHistory wrapperFemaleObstetricHistory = new WrapperFemaleObstetricHistory();
		wrapperFemaleObstetricHistory.setVanID(0);
		wrapperFemaleObstetricHistory.setParkingPlaceID(0);
		final FemaleObstetricHistory femaleObstetricHistory = new FemaleObstetricHistory();
		wrapperFemaleObstetricHistory.setFemaleObstetricHistoryList(new ArrayList<>(List.of(femaleObstetricHistory)));
		wrapperFemaleObstetricHistory.setBenVisitID(0L);
		wrapperFemaleObstetricHistory.setVisitCode(0L);
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
		when(mockCommonNurseServiceImpl.getChildOptionalVaccineHistory(0L, 0L))
				.thenReturn(wrapperChildOptionalVaccineDetail);

		// Configure CommonNurseServiceImpl.getDevelopmentHistory(...).
		final BenChildDevelopmentHistory benChildDevelopmentHistory = new BenChildDevelopmentHistory();
		benChildDevelopmentHistory.setBeneficiaryRegID(0L);
		benChildDevelopmentHistory.setBenVisitID(0L);
		benChildDevelopmentHistory.setProviderServiceMapID(0);
		benChildDevelopmentHistory.setGrossMotorMilestone("grossMotorMilestone");
		benChildDevelopmentHistory.setIsGMMAttained(false);
		when(mockCommonNurseServiceImpl.getDevelopmentHistory(0L, 0L)).thenReturn(benChildDevelopmentHistory);

		// Configure CommonNurseServiceImpl.getPerinatalHistory(...).
		final PerinatalHistory perinatalHistory = new PerinatalHistory();
		perinatalHistory.setBeneficiaryRegID(0L);
		perinatalHistory.setBenVisitID(0L);
		perinatalHistory.setProviderServiceMapID(0);
		perinatalHistory.setPlaceOfDelivery("placeOfDelivery");
		perinatalHistory.setTypeOfDelivery("typeOfDelivery");
		when(mockCommonNurseServiceImpl.getPerinatalHistory(0L, 0L)).thenReturn(perinatalHistory);

		// Configure CommonNurseServiceImpl.getFeedingHistory(...).
		final ChildFeedingDetails childFeedingDetails = new ChildFeedingDetails();
		childFeedingDetails.setBeneficiaryRegID(0L);
		childFeedingDetails.setBenVisitID(0L);
		childFeedingDetails.setProviderServiceMapID(0);
		childFeedingDetails.setChildID(0L);
		childFeedingDetails.setBenMotherID(0L);
		when(mockCommonNurseServiceImpl.getFeedingHistory(0L, 0L)).thenReturn(childFeedingDetails);

		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalAnthropometryDetails(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalVitalDetails(0L, 0L)).thenReturn("result");

		// Configure CommonNurseServiceImpl.getGeneralExaminationData(...).
		final PhyGeneralExamination phyGeneralExamination = new PhyGeneralExamination();
		phyGeneralExamination.setQuickening("quickening");
		phyGeneralExamination.setFoetalMovements("foetalMovements");
		phyGeneralExamination.setBeneficiaryRegID(0L);
		phyGeneralExamination.setBenVisitID(0L);
		phyGeneralExamination.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getGeneralExaminationData(0L, 0L)).thenReturn(phyGeneralExamination);

		// Configure CommonNurseServiceImpl.getHeadToToeExaminationData(...).
		final PhyHeadToToeExamination phyHeadToToeExamination = new PhyHeadToToeExamination();
		phyHeadToToeExamination.setBeneficiaryRegID(0L);
		phyHeadToToeExamination.setBenVisitID(0L);
		phyHeadToToeExamination.setHeadtoToeExam("headtoToeExam");
		phyHeadToToeExamination.setHead("head");
		phyHeadToToeExamination.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getHeadToToeExaminationData(0L, 0L)).thenReturn(phyHeadToToeExamination);

		// Configure CommonNurseServiceImpl.getSysGastrointestinalExamination(...).
		final SysGastrointestinalExamination sysGastrointestinalExamination = new SysGastrointestinalExamination();
		sysGastrointestinalExamination.setBeneficiaryRegID(0L);
		sysGastrointestinalExamination.setBenVisitID(0L);
		sysGastrointestinalExamination.setInspection("inspection");
		sysGastrointestinalExamination.setPalpation("palpation");
		sysGastrointestinalExamination.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getSysGastrointestinalExamination(0L, 0L))
				.thenReturn(sysGastrointestinalExamination);

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

		// Run the test
		final String result = pncServiceImplUnderTest.getBenPNCNurseData(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenCaseRecordFromDoctorPNC() {
		// Setup
		when(mockCommonDoctorServiceImpl.getFindingsDetails(0L, 0L)).thenReturn("result");
		when(mockPncDoctorServiceImpl.getPNCDiagnosisDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getInvestigationDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getPrescribedDrugs(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getReferralDetails(0L, 0L)).thenReturn("result");

		// Configure LabTechnicianServiceImpl.getLabResultDataForBen(...).
		final ArrayList<LabResultEntry> labResultEntries = new ArrayList<>(
				List.of(new LabResultEntry(0L, Date.valueOf(LocalDate.of(2020, 1, 1)))));
		when(mockLabTechnicianServiceImpl.getLabResultDataForBen(0L, 0L)).thenReturn(labResultEntries);

		// Configure CommonNurseServiceImpl.getGraphicalTrendData(...).
		final Map<String, Object> stringObjectMap = Map.ofEntries(Map.entry("value", "value"));
		when(mockCommonNurseServiceImpl.getGraphicalTrendData(0L, "pnc")).thenReturn(stringObjectMap);

		when(mockLabTechnicianServiceImpl.getLast_3_ArchivedTestVisitList(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = pncServiceImplUnderTest.getBenCaseRecordFromDoctorPNC(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenCaseRecordFromDoctorPNC_LabTechnicianServiceImplGetLabResultDataForBenReturnsNoItems() {
		// Setup
		when(mockCommonDoctorServiceImpl.getFindingsDetails(0L, 0L)).thenReturn("result");
		when(mockPncDoctorServiceImpl.getPNCDiagnosisDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getInvestigationDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getPrescribedDrugs(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getReferralDetails(0L, 0L)).thenReturn("result");
		when(mockLabTechnicianServiceImpl.getLabResultDataForBen(0L, 0L)).thenReturn(new ArrayList<>());

		// Configure CommonNurseServiceImpl.getGraphicalTrendData(...).
		final Map<String, Object> stringObjectMap = Map.ofEntries(Map.entry("value", "value"));
		when(mockCommonNurseServiceImpl.getGraphicalTrendData(0L, "pnc")).thenReturn(stringObjectMap);

		when(mockLabTechnicianServiceImpl.getLast_3_ArchivedTestVisitList(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = pncServiceImplUnderTest.getBenCaseRecordFromDoctorPNC(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testUpdatePNCDoctorData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> pncServiceImplUnderTest.updatePNCDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testUpdatePNCDoctorData_CommonDoctorServiceImplUpdateBenFlowtableAfterDocDataUpdateThrowsException()
			throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Configure CommonServiceImpl.createTcRequest(...).
		final TeleconsultationRequestOBJ teleconsultationRequestOBJ = new TeleconsultationRequestOBJ();
		teleconsultationRequestOBJ.setUserID(0);
		teleconsultationRequestOBJ.setAllocationDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		teleconsultationRequestOBJ.setSpecializationID(0);
		teleconsultationRequestOBJ.setTmRequestID(0L);
		teleconsultationRequestOBJ.setWalkIn(false);

		teleconsultationRequestOBJ.toString();

		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenReturn(teleconsultationRequestOBJ);

		when(mockCommonDoctorServiceImpl.updateDocFindings(any(WrapperAncFindings.class))).thenReturn(0);
		when(mockCommonNurseServiceImpl.updatePrescription(any(PrescriptionDetail.class))).thenReturn(0);
		when(mockPncDoctorServiceImpl.updateBenPNCDiagnosis(any(PNCDiagnosis.class))).thenReturn(0);
		when(mockCommonNurseServiceImpl.saveBenInvestigation(any(WrapperBenInvestigationANC.class))).thenReturn(0L);

		// Configure CommonNurseServiceImpl.saveBenPrescribedDrugsList(...).
		final PrescribedDrugDetail prescribedDrugDetail = new PrescribedDrugDetail();
		prescribedDrugDetail.setBeneficiaryRegID(0L);
		prescribedDrugDetail.setBenVisitID(0L);
		prescribedDrugDetail.setProviderServiceMapID(0);
		prescribedDrugDetail.setVisitCode(0L);
		prescribedDrugDetail.setPrescriptionID(0L);
		final List<PrescribedDrugDetail> prescribedDrugDetailList = List.of(prescribedDrugDetail);
		when(mockCommonNurseServiceImpl.saveBenPrescribedDrugsList(prescribedDrugDetailList)).thenReturn(0);

		when(mockCommonDoctorServiceImpl.updateBenReferDetails(new JsonObject())).thenReturn(0L);
		when(mockCommonDoctorServiceImpl.updateBenFlowtableAfterDocDataUpdate(any(CommonUtilityClass.class), eq(false),
				eq(false), any(TeleconsultationRequestOBJ.class))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> pncServiceImplUnderTest.updatePNCDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}
}
