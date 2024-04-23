package com.iemr.tm.service.ncdscreening;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.time.LocalDate;
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
import com.iemr.tm.data.anc.BenFamilyHistory;
import com.iemr.tm.data.anc.BenPersonalHabit;
import com.iemr.tm.data.labModule.LabResultEntry;
import com.iemr.tm.data.ncdScreening.IDRSData;
import com.iemr.tm.data.ncdScreening.PhysicalActivityType;
import com.iemr.tm.data.nurse.BenAnthropometryDetail;
import com.iemr.tm.data.nurse.BenPhysicalVitalDetail;
import com.iemr.tm.data.nurse.BeneficiaryVisitDetail;
import com.iemr.tm.data.nurse.CommonUtilityClass;
import com.iemr.tm.data.quickConsultation.BenChiefComplaint;
import com.iemr.tm.repo.benFlowStatus.BeneficiaryFlowStatusRepo;
import com.iemr.tm.repo.nurse.BenVisitDetailRepo;
import com.iemr.tm.repo.nurse.anc.BenAdherenceRepo;
import com.iemr.tm.repo.nurse.ncdscreening.IDRSDataRepo;
import com.iemr.tm.repo.quickConsultation.BenChiefComplaintRepo;
import com.iemr.tm.repo.quickConsultation.PrescriptionDetailRepo;
import com.iemr.tm.service.benFlowStatus.CommonBenStatusFlowServiceImpl;
import com.iemr.tm.service.common.transaction.CommonDoctorServiceImpl;
import com.iemr.tm.service.common.transaction.CommonNurseServiceImpl;
import com.iemr.tm.service.common.transaction.CommonServiceImpl;
import com.iemr.tm.service.labtechnician.LabTechnicianServiceImpl;
import com.iemr.tm.service.tele_consultation.SMSGatewayServiceImpl;
import com.iemr.tm.service.tele_consultation.TeleConsultationServiceImpl;

@ExtendWith(MockitoExtension.class)
class NCDScreeningServiceImplTest {

	@Mock
	private NCDScreeningNurseServiceImpl mockNcdScreeningNurseServiceImpl;
	@Mock
	private CommonNurseServiceImpl mockCommonNurseServiceImpl;
	@Mock
	private CommonBenStatusFlowServiceImpl mockCommonBenStatusFlowServiceImpl;
	@Mock
	private BeneficiaryFlowStatusRepo mockBeneficiaryFlowStatusRepo;
	@Mock
	private LabTechnicianServiceImpl mockLabTechnicianServiceImpl;
	@Mock
	private CommonDoctorServiceImpl mockCommonDoctorServiceImpl;
	@Mock
	private CommonServiceImpl mockCommonServiceImpl;
	@Mock
	private TeleConsultationServiceImpl mockTeleConsultationServiceImpl;
	@Mock
	private BenVisitDetailRepo mockBenVisitDetailRepo;
	@Mock
	private SMSGatewayServiceImpl mockSMSGatewayServiceImpl;
	@Mock
	private PrescriptionDetailRepo mockPrescriptionDetailRepo;
	@Mock
	private NCDSCreeningDoctorServiceImpl mockNcdSCreeningDoctorServiceImpl;
	@Mock
	private IDRSDataRepo mockIDrsDataRepo;
	@Mock
	private BenChiefComplaintRepo mockBenChiefComplaintRepo;
	@Mock
	private BenAdherenceRepo mockBenAdherenceRepo;

	@InjectMocks
	private NCDScreeningServiceImpl ncdScreeningServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		ncdScreeningServiceImplUnderTest.setNcdScreeningNurseServiceImpl(mockNcdScreeningNurseServiceImpl);
		ncdScreeningServiceImplUnderTest.setCommonNurseServiceImpl(mockCommonNurseServiceImpl);
		ncdScreeningServiceImplUnderTest.setCommonBenStatusFlowServiceImpl(mockCommonBenStatusFlowServiceImpl);
		ncdScreeningServiceImplUnderTest.setBeneficiaryFlowStatusRepo(mockBeneficiaryFlowStatusRepo);
		ncdScreeningServiceImplUnderTest.setLabTechnicianServiceImpl(mockLabTechnicianServiceImpl);
		ncdScreeningServiceImplUnderTest.setCommonDoctorServiceImpl(mockCommonDoctorServiceImpl);
	}

	@Test
	void testDeleteVisitDetails_BenVisitDetailRepoGetVisitCodeReturnsNull() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Run the test
		ncdScreeningServiceImplUnderTest.deleteVisitDetails(requestOBJ);

		// Verify the results
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

		nurseUtilityClass.toString();

		final Map<String, Long> expectedResult = Map.ofEntries(Map.entry("value", 0L));

		// Run the test
		final Map<String, Long> result = ncdScreeningServiceImplUnderTest.saveBenVisitDetails(visitDetailsOBJ,
				nurseUtilityClass);

		// Confirm CommonNurseServiceImpl.saveBenChiefComplaints(...).
		final BenChiefComplaint benChiefComplaint = new BenChiefComplaint();
		benChiefComplaint.setBeneficiaryRegID(0L);
		benChiefComplaint.setBenVisitID(0L);
		benChiefComplaint.setProviderServiceMapID(0);
		benChiefComplaint.setChiefComplaintID(0);
		benChiefComplaint.setVisitCode(0L);

		benChiefComplaint.toString();

		final List<BenChiefComplaint> benChiefComplaintList = List.of(benChiefComplaint);

		// Verify the results
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
		final Map<String, Long> result = ncdScreeningServiceImplUnderTest.saveBenVisitDetails(visitDetailsOBJ,
				nurseUtilityClass);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testSaveBenVisitDetails_CommonNurseServiceImplGenerateVisitCodeReturnsNull() throws Exception {
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
		final Map<String, Long> result = ncdScreeningServiceImplUnderTest.saveBenVisitDetails(visitDetailsOBJ,
				nurseUtilityClass);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testSaveNCDScreeningVitalDetails() throws Exception {
		// Setup
		final JsonObject jsonObject = new JsonObject();

		// Run the test
		final Long result = ncdScreeningServiceImplUnderTest.saveNCDScreeningVitalDetails(jsonObject, 0L, 0L);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveBenNCDCareHistoryDetails() throws Exception {
		// Setup
		final JsonObject ncdCareHistoryOBJ = new JsonObject();

		// Run the test
		final Long result = ncdScreeningServiceImplUnderTest.saveBenNCDCareHistoryDetails(ncdCareHistoryOBJ, 0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo(1L);
	}

	@Test
	void testSaveidrsDetails() throws Exception {
		// Setup
		final JsonObject idrsDetailsOBJ = new JsonObject();
		when(mockCommonNurseServiceImpl.saveIDRS(any(IDRSData.class))).thenReturn(0L);

		// Run the test
		final Long result = ncdScreeningServiceImplUnderTest.saveidrsDetails(idrsDetailsOBJ, 0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSavePhysicalActivityDetails() throws Exception {
		// Setup
		final JsonObject physicalActivityDetailsOBJ = new JsonObject();
		when(mockCommonNurseServiceImpl.savePhysicalActivity(any(PhysicalActivityType.class))).thenReturn(0L);

		// Run the test
		final Long result = ncdScreeningServiceImplUnderTest.savePhysicalActivityDetails(physicalActivityDetailsOBJ, 0L,
				0L);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSaveBenNCDCareVitalDetails() throws Exception {
		// Setup
		final JsonObject vitalDetailsOBJ = new JsonObject();
		when(mockCommonNurseServiceImpl.saveBeneficiaryPhysicalAnthropometryDetails(any(BenAnthropometryDetail.class)))
				.thenReturn(0L);
		when(mockCommonNurseServiceImpl.saveBeneficiaryPhysicalVitalDetails(any(BenPhysicalVitalDetail.class)))
				.thenReturn(0L);

		// Run the test
		final Long result = ncdScreeningServiceImplUnderTest.saveBenNCDCareVitalDetails(vitalDetailsOBJ, 0L, 0L);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testUpdateBenVitalDetails() throws Exception {
		// Setup
		final JsonObject vitalDetailsOBJ = new JsonObject();
		when(mockCommonNurseServiceImpl.updateANCAnthropometryDetails(any(BenAnthropometryDetail.class))).thenReturn(0);
		when(mockCommonNurseServiceImpl.updateANCPhysicalVitalDetails(any(BenPhysicalVitalDetail.class))).thenReturn(0);

		// Run the test
		final int result = ncdScreeningServiceImplUnderTest.updateBenVitalDetails(vitalDetailsOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testGetNCDScreeningDetails() {
		// Setup
		when(mockNcdScreeningNurseServiceImpl.getNCDScreeningDetails(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalAnthropometryDetails(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalVitalDetails(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = ncdScreeningServiceImplUnderTest.getNCDScreeningDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetNCDScreeningDetails_CommonNurseServiceImplGetBeneficiaryPhysicalAnthropometryDetailsReturnsNull() {
		// Setup
		when(mockNcdScreeningNurseServiceImpl.getNCDScreeningDetails(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalAnthropometryDetails(0L, 0L)).thenReturn(null);
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalVitalDetails(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = ncdScreeningServiceImplUnderTest.getNCDScreeningDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetNCDScreeningDetails_CommonNurseServiceImplGetBeneficiaryPhysicalVitalDetailsReturnsNull() {
		// Setup
		when(mockNcdScreeningNurseServiceImpl.getNCDScreeningDetails(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalAnthropometryDetails(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalVitalDetails(0L, 0L)).thenReturn(null);

		// Run the test
		final String result = ncdScreeningServiceImplUnderTest.getNCDScreeningDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetNcdScreeningVisitCnt() {
		// Setup
		when(mockBeneficiaryFlowStatusRepo.getNcdScreeningVisitCount(0L)).thenReturn(0L);

		// Run the test
		final String result = ncdScreeningServiceImplUnderTest.getNcdScreeningVisitCnt(0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testUpdateIDRSScreen() throws Exception {
		// Setup
		final JsonObject idrsOBJ = new JsonObject();

		// Run the test
		final Long result = ncdScreeningServiceImplUnderTest.UpdateIDRSScreen(idrsOBJ);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveDoctorData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> ncdScreeningServiceImplUnderTest.saveDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testGetBenCaseRecordFromDoctorNCDScreening() {
		// Setup
		when(mockCommonDoctorServiceImpl.getFindingsDetails(0L, 0L)).thenReturn("result");
		when(mockNcdSCreeningDoctorServiceImpl.getNCDDiagnosisData(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getInvestigationDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getPrescribedDrugs(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getReferralDetails(0L, 0L)).thenReturn("result");

		// Configure LabTechnicianServiceImpl.getLabResultDataForBen(...).
		final ArrayList<LabResultEntry> labResultEntries = new ArrayList<>(
				List.of(new LabResultEntry(0L, Date.valueOf(LocalDate.of(2020, 1, 1)))));
		when(mockLabTechnicianServiceImpl.getLabResultDataForBen(0L, 0L)).thenReturn(labResultEntries);

		// Configure CommonNurseServiceImpl.getGraphicalTrendData(...).
		final Map<String, Object> stringObjectMap = Map.ofEntries(Map.entry("value", "value"));
		when(mockCommonNurseServiceImpl.getGraphicalTrendData(0L, "ncdCare")).thenReturn(stringObjectMap);

		when(mockLabTechnicianServiceImpl.getLast_3_ArchivedTestVisitList(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = ncdScreeningServiceImplUnderTest.getBenCaseRecordFromDoctorNCDScreening(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenCaseRecordFromDoctorNCDScreening_LabTechnicianServiceImplGetLabResultDataForBenReturnsNoItems() {
		// Setup
		when(mockCommonDoctorServiceImpl.getFindingsDetails(0L, 0L)).thenReturn("result");
		when(mockNcdSCreeningDoctorServiceImpl.getNCDDiagnosisData(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getInvestigationDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getPrescribedDrugs(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getReferralDetails(0L, 0L)).thenReturn("result");
		when(mockLabTechnicianServiceImpl.getLabResultDataForBen(0L, 0L)).thenReturn(new ArrayList<>());

		// Configure CommonNurseServiceImpl.getGraphicalTrendData(...).
		final Map<String, Object> stringObjectMap = Map.ofEntries(Map.entry("value", "value"));
		when(mockCommonNurseServiceImpl.getGraphicalTrendData(0L, "ncdCare")).thenReturn(stringObjectMap);

		when(mockLabTechnicianServiceImpl.getLast_3_ArchivedTestVisitList(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = ncdScreeningServiceImplUnderTest.getBenCaseRecordFromDoctorNCDScreening(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenVisitDetailsFrmNurseNCDScreening() {
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
		final String result = ncdScreeningServiceImplUnderTest.getBenVisitDetailsFrmNurseNCDScreening(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenHistoryDetails() {
		// Setup
		// Configure CommonNurseServiceImpl.getFamilyHistoryDetail(...).
		final BenFamilyHistory benFamilyHistory = new BenFamilyHistory();
		benFamilyHistory.setSnomedCode("snomedCode");
		benFamilyHistory.setSnomedTerm("snomedTerm");
		benFamilyHistory.setVanID(0);
		benFamilyHistory.setBenVisitID(0L);
		benFamilyHistory.setVisitCode(0L);

		benFamilyHistory.toString();

		when(mockCommonNurseServiceImpl.getFamilyHistoryDetail(0L, 0L)).thenReturn(benFamilyHistory);

		// Configure CommonNurseServiceImpl.getPhysicalActivityType(...).
		final PhysicalActivityType physicalActivityType = new PhysicalActivityType(
				Date.valueOf(LocalDate.of(2020, 1, 1)), "activityType", "physicalActivityType");
		when(mockCommonNurseServiceImpl.getPhysicalActivityType(0L, 0L)).thenReturn(physicalActivityType);

		// Configure CommonNurseServiceImpl.getPersonalHistory(...).
		final BenPersonalHabit benPersonalHabit = new BenPersonalHabit();
		benPersonalHabit.setVanID(0);
		benPersonalHabit.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalHabit.setTobacco_use_duration(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalHabit.setBenVisitID(0L);
		benPersonalHabit.setVisitCode(0L);

		benPersonalHabit.toString();
		when(mockCommonNurseServiceImpl.getPersonalHistory(0L, 0L)).thenReturn(benPersonalHabit);

		// Run the test
		final String result = ncdScreeningServiceImplUnderTest.getBenHistoryDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenIdrsDetailsFrmNurse() {
		// Setup
		// Configure CommonNurseServiceImpl.getBeneficiaryIdrsDetails(...).
		final IDRSData idrsData = new IDRSData();
		idrsData.setConfirmedDisease("confirmedDisease");
		idrsData.setConfirmArray(new String[] { "confirmArray" });
		idrsData.setId(0L);
		idrsData.setBeneficiaryRegID(0L);
		idrsData.setBenVisitID(0L);
		idrsData.setIdrsQuestionID(0);
		idrsData.setIdrsScore(0);
		idrsData.setSuspectedDisease("suspected");
		idrsData.setQuestion("question");
		idrsData.setDiseaseQuestionType("diseaseQuestionType");
		idrsData.setVisitCode(0L);
		idrsData.setQuestionArray(new IDRSData[] { new IDRSData() });
		idrsData.setSuspectArray(new String[] { "suspectArray" });
		idrsData.setAnswer("answer");

		idrsData.toString();

		when(mockCommonNurseServiceImpl.getBeneficiaryIdrsDetails(0L, 0L)).thenReturn(idrsData);

		// Run the test
		final String result = ncdScreeningServiceImplUnderTest.getBenIdrsDetailsFrmNurse(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBeneficiaryVitalDetails() {
		// Setup
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalAnthropometryDetails(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalVitalDetails(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = ncdScreeningServiceImplUnderTest.getBeneficiaryVitalDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenNCDScreeningNurseData() {
		// Setup
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalAnthropometryDetails(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalVitalDetails(0L, 0L)).thenReturn("result");

		// Configure CommonNurseServiceImpl.getFamilyHistoryDetail(...).
		final BenFamilyHistory benFamilyHistory = new BenFamilyHistory();
		benFamilyHistory.setSnomedCode("snomedCode");
		benFamilyHistory.setSnomedTerm("snomedTerm");
		benFamilyHistory.setVanID(0);
		benFamilyHistory.setBenVisitID(0L);
		benFamilyHistory.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getFamilyHistoryDetail(0L, 0L)).thenReturn(benFamilyHistory);

		// Configure CommonNurseServiceImpl.getPhysicalActivityType(...).
		final PhysicalActivityType physicalActivityType = new PhysicalActivityType(
				Date.valueOf(LocalDate.of(2020, 1, 1)), "activityType", "physicalActivityType");
		when(mockCommonNurseServiceImpl.getPhysicalActivityType(0L, 0L)).thenReturn(physicalActivityType);

		// Configure CommonNurseServiceImpl.getPersonalHistory(...).
		final BenPersonalHabit benPersonalHabit = new BenPersonalHabit();
		benPersonalHabit.setVanID(0);
		benPersonalHabit.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalHabit.setTobacco_use_duration(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalHabit.setBenVisitID(0L);
		benPersonalHabit.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getPersonalHistory(0L, 0L)).thenReturn(benPersonalHabit);

		// Configure CommonNurseServiceImpl.getBeneficiaryIdrsDetails(...).
		final IDRSData idrsData = new IDRSData();
		idrsData.setConfirmedDisease("confirmedDisease");
		idrsData.setConfirmArray(new String[] { "confirmArray" });
		idrsData.setId(0L);
		idrsData.setBeneficiaryRegID(0L);
		idrsData.setBenVisitID(0L);
		idrsData.setIdrsQuestionID(0);
		idrsData.setIdrsScore(0);
		idrsData.setSuspectedDisease("suspected");
		idrsData.setQuestion("question");
		idrsData.setDiseaseQuestionType("diseaseQuestionType");
		idrsData.setVisitCode(0L);
		idrsData.setQuestionArray(new IDRSData[] { new IDRSData() });
		idrsData.setSuspectArray(new String[] { "suspectArray" });
		idrsData.setAnswer("answer");
		when(mockCommonNurseServiceImpl.getBeneficiaryIdrsDetails(0L, 0L)).thenReturn(idrsData);

		// Run the test
		final String result = ncdScreeningServiceImplUnderTest.getBenNCDScreeningNurseData(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}
}
