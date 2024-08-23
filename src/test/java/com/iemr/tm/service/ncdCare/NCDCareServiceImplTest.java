package com.iemr.tm.service.ncdCare;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
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

import com.fasterxml.jackson.core.JsonProcessingException;
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
import com.iemr.tm.data.quickConsultation.PrescribedDrugDetail;
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
class NCDCareServiceImplTest {

	@Mock
	private CommonNurseServiceImpl mockCommonNurseServiceImpl;
	@Mock
	private CommonDoctorServiceImpl mockCommonDoctorServiceImpl;
	@Mock
	private NCDCareDoctorServiceImpl mockNcdCareDoctorServiceImpl;
	@Mock
	private CommonBenStatusFlowServiceImpl mockCommonBenStatusFlowServiceImpl;
	@Mock
	private LabTechnicianServiceImpl mockLabTechnicianServiceImpl;
	@Mock
	private CommonServiceImpl mockCommonServiceImpl;
	@Mock
	private TeleConsultationServiceImpl mockTeleConsultationServiceImpl;
	@Mock
	private BenVisitDetailRepo mockBenVisitDetailRepo;
	@Mock
	private BenChiefComplaintRepo mockBenChiefComplaintRepo;
	@Mock
	private BenAdherenceRepo mockBenAdherenceRepo;
	@Mock
	private SMSGatewayServiceImpl mockSMSGatewayServiceImpl;

	@InjectMocks
	private NCDCareServiceImpl ncdCareServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		ncdCareServiceImplUnderTest.setCommonNurseServiceImpl(mockCommonNurseServiceImpl);
		ncdCareServiceImplUnderTest.setCommonDoctorServiceImpl(mockCommonDoctorServiceImpl);
		ncdCareServiceImplUnderTest.setNcdCareDoctorServiceImpl(mockNcdCareDoctorServiceImpl);
		ncdCareServiceImplUnderTest.setCommonBenStatusFlowServiceImpl(mockCommonBenStatusFlowServiceImpl);
		ncdCareServiceImplUnderTest.setLabTechnicianServiceImpl(mockLabTechnicianServiceImpl);
	}

	@Test
	void testSaveNCDCareNurseData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Run the test
		assertThatThrownBy(() -> ncdCareServiceImplUnderTest.saveNCDCareNurseData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testDeleteVisitDetails_BenVisitDetailRepoGetVisitCodeReturnsNull() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Run the test
		ncdCareServiceImplUnderTest.deleteVisitDetails(requestOBJ);

		// Verify the results
	}

	@Test
	void testSaveBenNCDCareHistoryDetails() throws Exception {
		// Setup
		final JsonObject ncdCareHistoryOBJ = new JsonObject();

		// Run the test
		final Long result = ncdCareServiceImplUnderTest.saveBenNCDCareHistoryDetails(ncdCareHistoryOBJ, 0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo(1L);
	}

	@Test
	void testGetBenVisitDetailsFrmNurseNCDCare() {
		// Setup
		// Configure CommonNurseServiceImpl.getCSVisitDetails(...).
		final BeneficiaryVisitDetail beneficiaryVisitDetail = new BeneficiaryVisitDetail();
		beneficiaryVisitDetail.setVisitCode(0L);
		beneficiaryVisitDetail.setServiceProviderName("serviceProviderName");
		beneficiaryVisitDetail.setBeneficiaryRegID(0L);
		beneficiaryVisitDetail.setVisitReason("visitReason");
		beneficiaryVisitDetail.setVisitCategory("visitCategory");

		beneficiaryVisitDetail.toString();

		when(mockCommonNurseServiceImpl.getCSVisitDetails(0L, 0L)).thenReturn(beneficiaryVisitDetail);

		when(mockCommonNurseServiceImpl.getBenAdherence(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getLabTestOrders(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = ncdCareServiceImplUnderTest.getBenVisitDetailsFrmNurseNCDCare(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenNCDCareHistoryDetails() {
		// Setup
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

		// Configure CommonNurseServiceImpl.getDevelopmentHistory(...).
		final BenChildDevelopmentHistory benChildDevelopmentHistory = new BenChildDevelopmentHistory();
		benChildDevelopmentHistory.setBeneficiaryRegID(0L);
		benChildDevelopmentHistory.setBenVisitID(0L);
		benChildDevelopmentHistory.setProviderServiceMapID(0);
		benChildDevelopmentHistory.setGrossMotorMilestone("grossMotorMilestone");
		benChildDevelopmentHistory.setVisitCode(0L);

		benChildDevelopmentHistory.toString();

		when(mockCommonNurseServiceImpl.getDevelopmentHistory(0L, 0L)).thenReturn(benChildDevelopmentHistory);

		// Configure CommonNurseServiceImpl.getPerinatalHistory(...).
		final PerinatalHistory perinatalHistory = new PerinatalHistory();
		perinatalHistory.setBeneficiaryRegID(0L);
		perinatalHistory.setBenVisitID(0L);
		perinatalHistory.setProviderServiceMapID(0);
		perinatalHistory.setPlaceOfDelivery("placeOfDelivery");
		perinatalHistory.setVisitCode(0L);

		perinatalHistory.toString();

		when(mockCommonNurseServiceImpl.getPerinatalHistory(0L, 0L)).thenReturn(perinatalHistory);

		// Configure CommonNurseServiceImpl.getFeedingHistory(...).
		final ChildFeedingDetails childFeedingDetails = new ChildFeedingDetails();
		childFeedingDetails.setBeneficiaryRegID(0L);
		childFeedingDetails.setBenVisitID(0L);
		childFeedingDetails.setProviderServiceMapID(0);
		childFeedingDetails.setChildID(0L);
		childFeedingDetails.setVisitCode(0L);

		childFeedingDetails.toString();

		when(mockCommonNurseServiceImpl.getFeedingHistory(0L, 0L)).thenReturn(childFeedingDetails);

		// Run the test
		final String result = ncdCareServiceImplUnderTest.getBenNCDCareHistoryDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBeneficiaryVitalDetails() {
		// Setup
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalAnthropometryDetails(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalVitalDetails(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = ncdCareServiceImplUnderTest.getBeneficiaryVitalDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testSaveDoctorData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> ncdCareServiceImplUnderTest.saveDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testSaveDoctorData_NCDCareDoctorServiceImplThrowsException() throws Exception {
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

		// Run the test
		assertThatThrownBy(() -> ncdCareServiceImplUnderTest.saveDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testUpdateBenHistoryDetails() throws Exception {
		// Setup
		final JsonObject historyOBJ = new JsonObject();

		// Run the test
		final int result = ncdCareServiceImplUnderTest.updateBenHistoryDetails(historyOBJ);

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
		final int result = ncdCareServiceImplUnderTest.updateBenVitalDetails(vitalDetailsOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testGetBenNCDCareNurseData() {
		// Setup
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalAnthropometryDetails(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalVitalDetails(0L, 0L)).thenReturn("result");

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
		benChildDevelopmentHistory.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getDevelopmentHistory(0L, 0L)).thenReturn(benChildDevelopmentHistory);

		// Configure CommonNurseServiceImpl.getPerinatalHistory(...).
		final PerinatalHistory perinatalHistory = new PerinatalHistory();
		perinatalHistory.setBeneficiaryRegID(0L);
		perinatalHistory.setBenVisitID(0L);
		perinatalHistory.setProviderServiceMapID(0);
		perinatalHistory.setPlaceOfDelivery("placeOfDelivery");
		perinatalHistory.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getPerinatalHistory(0L, 0L)).thenReturn(perinatalHistory);

		// Configure CommonNurseServiceImpl.getFeedingHistory(...).
		final ChildFeedingDetails childFeedingDetails = new ChildFeedingDetails();
		childFeedingDetails.setBeneficiaryRegID(0L);
		childFeedingDetails.setBenVisitID(0L);
		childFeedingDetails.setProviderServiceMapID(0);
		childFeedingDetails.setChildID(0L);
		childFeedingDetails.setVisitCode(0L);
		when(mockCommonNurseServiceImpl.getFeedingHistory(0L, 0L)).thenReturn(childFeedingDetails);

		// Run the test
		final String result = ncdCareServiceImplUnderTest.getBenNCDCareNurseData(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenCaseRecordFromDoctorNCDCare() throws JsonProcessingException, ParseException {
		// Setup
		when(mockCommonDoctorServiceImpl.getFindingsDetails(0L, 0L)).thenReturn("result");
		when(mockNcdCareDoctorServiceImpl.getNCDCareDiagnosisDetails(0L, 0L)).thenReturn("result");
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
		final String result = ncdCareServiceImplUnderTest.getBenCaseRecordFromDoctorNCDCare(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenCaseRecordFromDoctorNCDCare_LabTechnicianServiceImplGetLabResultDataForBenReturnsNoItems() throws JsonProcessingException, ParseException {
		// Setup
		when(mockCommonDoctorServiceImpl.getFindingsDetails(0L, 0L)).thenReturn("result");
		when(mockNcdCareDoctorServiceImpl.getNCDCareDiagnosisDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getInvestigationDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getPrescribedDrugs(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getReferralDetails(0L, 0L)).thenReturn("result");
		when(mockLabTechnicianServiceImpl.getLabResultDataForBen(0L, 0L)).thenReturn(new ArrayList<>());

		// Configure CommonNurseServiceImpl.getGraphicalTrendData(...).
		final Map<String, Object> stringObjectMap = Map.ofEntries(Map.entry("value", "value"));
		when(mockCommonNurseServiceImpl.getGraphicalTrendData(0L, "ncdCare")).thenReturn(stringObjectMap);

		when(mockLabTechnicianServiceImpl.getLast_3_ArchivedTestVisitList(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = ncdCareServiceImplUnderTest.getBenCaseRecordFromDoctorNCDCare(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testUpdateNCDCareDoctorData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> ncdCareServiceImplUnderTest.updateNCDCareDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testUpdateNCDCareDoctorData_CommonDoctorServiceImplUpdateBenFlowtableAfterDocDataUpdateThrowsException()
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

		// Configure CommonNurseServiceImpl.saveBenPrescribedDrugsList(...).
		final PrescribedDrugDetail prescribedDrugDetail = new PrescribedDrugDetail();
		prescribedDrugDetail.setBeneficiaryRegID(0L);
		prescribedDrugDetail.setBenVisitID(0L);
		prescribedDrugDetail.setProviderServiceMapID(0);
		prescribedDrugDetail.setVisitCode(0L);
		prescribedDrugDetail.setPrescriptionID(0L);

		prescribedDrugDetail.toString();

		final List<PrescribedDrugDetail> prescribedDrugDetailList = List.of(prescribedDrugDetail);

		// Run the test
		assertThatThrownBy(() -> ncdCareServiceImplUnderTest.updateNCDCareDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}
}
