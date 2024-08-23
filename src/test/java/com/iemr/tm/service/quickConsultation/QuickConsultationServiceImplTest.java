package com.iemr.tm.service.quickConsultation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
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

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.OptimisticLockingFailureException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.JsonObject;
import com.iemr.tm.data.labModule.LabResultEntry;
import com.iemr.tm.data.nurse.BeneficiaryVisitDetail;
import com.iemr.tm.data.nurse.CommonUtilityClass;
import com.iemr.tm.data.quickConsultation.BenChiefComplaint;
import com.iemr.tm.data.quickConsultation.BenClinicalObservations;
import com.iemr.tm.data.quickConsultation.ExternalLabTestOrder;
import com.iemr.tm.data.quickConsultation.PrescribedDrugDetail;
import com.iemr.tm.data.quickConsultation.PrescriptionDetail;
import com.iemr.tm.data.tele_consultation.TeleconsultationRequestOBJ;
import com.iemr.tm.repo.nurse.BenPhysicalVitalRepo;
import com.iemr.tm.repo.nurse.BenVisitDetailRepo;
import com.iemr.tm.repo.nurse.anc.BenAdherenceRepo;
import com.iemr.tm.repo.quickConsultation.BenChiefComplaintRepo;
import com.iemr.tm.repo.quickConsultation.BenClinicalObservationsRepo;
import com.iemr.tm.repo.quickConsultation.ExternalTestOrderRepo;
import com.iemr.tm.repo.quickConsultation.PrescriptionDetailRepo;
import com.iemr.tm.service.benFlowStatus.CommonBenStatusFlowServiceImpl;
import com.iemr.tm.service.common.transaction.CommonDoctorServiceImpl;
import com.iemr.tm.service.common.transaction.CommonNurseServiceImpl;
import com.iemr.tm.service.common.transaction.CommonServiceImpl;
import com.iemr.tm.service.generalOPD.GeneralOPDDoctorServiceImpl;
import com.iemr.tm.service.labtechnician.LabTechnicianServiceImpl;
import com.iemr.tm.service.tele_consultation.SMSGatewayServiceImpl;
import com.iemr.tm.service.tele_consultation.TeleConsultationServiceImpl;

@ExtendWith(MockitoExtension.class)
class QuickConsultationServiceImplTest {

	@Mock
	private BenChiefComplaintRepo mockBenChiefComplaintRepo;
	@Mock
	private BenClinicalObservationsRepo mockBenClinicalObservationsRepo;
	@Mock
	private PrescriptionDetailRepo mockPrescriptionDetailRepo;
	@Mock
	private ExternalTestOrderRepo mockExternalTestOrderRepo;
	@Mock
	private CommonNurseServiceImpl mockCommonNurseServiceImpl;
	@Mock
	private CommonBenStatusFlowServiceImpl mockCommonBenStatusFlowServiceImpl;
	@Mock
	private LabTechnicianServiceImpl mockLabTechnicianServiceImpl;
	@Mock
	private CommonDoctorServiceImpl mockCommonDoctorServiceImpl;
	@Mock
	private GeneralOPDDoctorServiceImpl mockGeneralOPDDoctorServiceImpl;
	@Mock
	private CommonServiceImpl mockCommonServiceImpl;
	@Mock
	private TeleConsultationServiceImpl mockTeleConsultationServiceImpl;
	@Mock
	private SMSGatewayServiceImpl mockSMSGatewayServiceImpl;
	@Mock
	private BenPhysicalVitalRepo mockBenPhysicalVitalRepo;
	@Mock
	private BenVisitDetailRepo mockBenVisitDetailRepo;
	@Mock
	private BenAdherenceRepo mockBenAdherenceRepo;

	@InjectMocks
	private QuickConsultationServiceImpl quickConsultationServiceImplUnderTest;

	@Test
	void testSaveBeneficiaryChiefComplaint() {
		// Setup
		final JsonObject caseSheet = new JsonObject();

		// Configure BenChiefComplaintRepo.saveAll(...).
		final BenChiefComplaint benChiefComplaint = new BenChiefComplaint();
		benChiefComplaint.setBeneficiaryRegID(0L);
		benChiefComplaint.setBenVisitID(0L);
		benChiefComplaint.setProviderServiceMapID(0);
		benChiefComplaint.setChiefComplaintID(0);
		benChiefComplaint.setChiefComplaint("chiefComplaint");
		benChiefComplaint.setDuration(0);
		benChiefComplaint.setUnitOfDuration("unitOfDuration");
		benChiefComplaint.setDescription("description");
		benChiefComplaint.setCreatedBy("createdBy");
		benChiefComplaint.setParkingPlaceID(0);
		benChiefComplaint.setConceptID("conceptID");
		benChiefComplaint.setVisitCode(0L);
		benChiefComplaint.setVanID(0);
		final Iterable<BenChiefComplaint> benChiefComplaints = List.of(benChiefComplaint);
		final BenChiefComplaint benChiefComplaint1 = new BenChiefComplaint();
		benChiefComplaint1.setBeneficiaryRegID(0L);
		benChiefComplaint1.setBenVisitID(0L);
		benChiefComplaint1.setProviderServiceMapID(0);
		benChiefComplaint1.setChiefComplaintID(0);
		benChiefComplaint1.setChiefComplaint("chiefComplaint");
		benChiefComplaint1.setDuration(0);
		benChiefComplaint1.setUnitOfDuration("unitOfDuration");
		benChiefComplaint1.setDescription("description");
		benChiefComplaint1.setCreatedBy("createdBy");
		benChiefComplaint1.setParkingPlaceID(0);
		benChiefComplaint1.setConceptID("conceptID");
		benChiefComplaint1.setVisitCode(0L);
		benChiefComplaint1.setVanID(0);
		final ArrayList<BenChiefComplaint> entities = new ArrayList<>(List.of(benChiefComplaint1));

		// Run the test
		final Long result = quickConsultationServiceImplUnderTest.saveBeneficiaryChiefComplaint(caseSheet);

		// Verify the results
		assertThat(result).isEqualTo(1L);
	}

	@Test
	void testSaveBeneficiaryChiefComplaint_BenChiefComplaintRepoReturnsNoItems() {
		// Setup
		final JsonObject caseSheet = new JsonObject();

		// Configure BenChiefComplaintRepo.saveAll(...).
		final BenChiefComplaint benChiefComplaint = new BenChiefComplaint();
		benChiefComplaint.setBeneficiaryRegID(0L);
		benChiefComplaint.setBenVisitID(0L);
		benChiefComplaint.setProviderServiceMapID(0);
		benChiefComplaint.setChiefComplaintID(0);
		benChiefComplaint.setChiefComplaint("chiefComplaint");
		benChiefComplaint.setDuration(0);
		benChiefComplaint.setUnitOfDuration("unitOfDuration");
		benChiefComplaint.setDescription("description");
		benChiefComplaint.setCreatedBy("createdBy");
		benChiefComplaint.setParkingPlaceID(0);
		benChiefComplaint.setConceptID("conceptID");
		benChiefComplaint.setVisitCode(0L);
		benChiefComplaint.setVanID(0);
		
		benChiefComplaint.toString();
		
		final ArrayList<BenChiefComplaint> entities = new ArrayList<>(List.of(benChiefComplaint));

		// Run the test
		final Long result = quickConsultationServiceImplUnderTest.saveBeneficiaryChiefComplaint(caseSheet);

		// Verify the results
		assertThat(result).isEqualTo(1L);
	}

	@Test
	void testSaveBenPrescriptionForANC() {
		// Setup
		final PrescriptionDetail prescription = new PrescriptionDetail();
		prescription.setDiagnosisProvided_SCTCode("diagnosisProvided_SCTCode");
		prescription.setDiagnosisProvided_SCTTerm("diagnosisProvided_SCTTerm");
		
		prescription.toString();
		
		final PrescribedDrugDetail prescribedDrugDetail = new PrescribedDrugDetail();
		prescribedDrugDetail.setBeneficiaryRegID(0L);
		prescription.setPrescribedDrugs(new ArrayList<>(List.of(prescribedDrugDetail)));
		prescription.setPrescriptionID(0L);

		// Configure PrescriptionDetailRepo.save(...).
		final PrescriptionDetail prescriptionDetail = new PrescriptionDetail();
		prescriptionDetail.setDiagnosisProvided_SCTCode("diagnosisProvided_SCTCode");
		prescriptionDetail.setDiagnosisProvided_SCTTerm("diagnosisProvided_SCTTerm");
		final PrescribedDrugDetail prescribedDrugDetail1 = new PrescribedDrugDetail();
		prescribedDrugDetail1.setBeneficiaryRegID(0L);
		prescriptionDetail.setPrescribedDrugs(new ArrayList<>(List.of(prescribedDrugDetail1)));
		prescriptionDetail.setPrescriptionID(0L);
		when(mockPrescriptionDetailRepo.save(any(PrescriptionDetail.class))).thenReturn(prescriptionDetail);

		// Run the test
		final Long result = quickConsultationServiceImplUnderTest.saveBenPrescriptionForANC(prescription);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveBenPrescriptionForANC_PrescriptionDetailRepoReturnsNull() {
		// Setup
		final PrescriptionDetail prescription = new PrescriptionDetail();
		prescription.setDiagnosisProvided_SCTCode("diagnosisProvided_SCTCode");
		prescription.setDiagnosisProvided_SCTTerm("diagnosisProvided_SCTTerm");
		final PrescribedDrugDetail prescribedDrugDetail = new PrescribedDrugDetail();
		prescribedDrugDetail.setBeneficiaryRegID(0L);
		prescription.setPrescribedDrugs(new ArrayList<>(List.of(prescribedDrugDetail)));
		prescription.setPrescriptionID(0L);

		when(mockPrescriptionDetailRepo.save(any(PrescriptionDetail.class))).thenReturn(null);

		// Run the test
		final Long result = quickConsultationServiceImplUnderTest.saveBenPrescriptionForANC(prescription);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveBenPrescriptionForANC_PrescriptionDetailRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final PrescriptionDetail prescription = new PrescriptionDetail();
		prescription.setDiagnosisProvided_SCTCode("diagnosisProvided_SCTCode");
		prescription.setDiagnosisProvided_SCTTerm("diagnosisProvided_SCTTerm");
		final PrescribedDrugDetail prescribedDrugDetail = new PrescribedDrugDetail();
		prescribedDrugDetail.setBeneficiaryRegID(0L);
		prescription.setPrescribedDrugs(new ArrayList<>(List.of(prescribedDrugDetail)));
		prescription.setPrescriptionID(0L);

		when(mockPrescriptionDetailRepo.save(any(PrescriptionDetail.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> quickConsultationServiceImplUnderTest.saveBenPrescriptionForANC(prescription))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testSaveBeneficiaryExternalLabTestOrderDetails_ExternalTestOrderRepoReturnsNull() {
		// Setup
		final JsonObject caseSheet = new JsonObject();
		when(mockExternalTestOrderRepo.save(any(ExternalLabTestOrder.class))).thenReturn(null);

		// Run the test
		final Long result = quickConsultationServiceImplUnderTest.saveBeneficiaryExternalLabTestOrderDetails(caseSheet);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveBeneficiaryExternalLabTestOrderDetails_ExternalTestOrderRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final JsonObject caseSheet = new JsonObject();
		when(mockExternalTestOrderRepo.save(any(ExternalLabTestOrder.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(
				() -> quickConsultationServiceImplUnderTest.saveBeneficiaryExternalLabTestOrderDetails(caseSheet))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testQuickConsultNurseDataInsert_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject jsnOBJ = new JsonObject();

		// Run the test
		assertThatThrownBy(
				() -> quickConsultationServiceImplUnderTest.quickConsultNurseDataInsert(jsnOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testDeleteVisitDetails_BenVisitDetailRepoGetVisitCodeReturnsNull() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Run the test
		quickConsultationServiceImplUnderTest.deleteVisitDetails(requestOBJ);

		// Verify the results
	}

	@Test
	void testQuickConsultDoctorDataInsert_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject quickConsultDoctorOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> quickConsultationServiceImplUnderTest
				.quickConsultDoctorDataInsert(quickConsultDoctorOBJ, "Authorization")).isInstanceOf(Exception.class);
	}

	@Test
	void testQuickConsultDoctorDataInsert_BenClinicalObservationsRepoReturnsNull() throws Exception {
		// Setup
		final JsonObject quickConsultDoctorOBJ = new JsonObject();

		// Configure CommonServiceImpl.createTcRequest(...).
		final TeleconsultationRequestOBJ teleconsultationRequestOBJ = new TeleconsultationRequestOBJ();
		teleconsultationRequestOBJ.setUserID(0);
		teleconsultationRequestOBJ.setAllocationDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		teleconsultationRequestOBJ.setSpecializationID(0);
		teleconsultationRequestOBJ.setTmRequestID(0L);
		teleconsultationRequestOBJ.setWalkIn(false);
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenReturn(teleconsultationRequestOBJ);

		// Configure BenChiefComplaintRepo.saveAll(...).
		final BenChiefComplaint benChiefComplaint = new BenChiefComplaint();
		benChiefComplaint.setBeneficiaryRegID(0L);
		benChiefComplaint.setBenVisitID(0L);
		benChiefComplaint.setProviderServiceMapID(0);
		benChiefComplaint.setChiefComplaintID(0);
		benChiefComplaint.setChiefComplaint("chiefComplaint");
		benChiefComplaint.setDuration(0);
		benChiefComplaint.setUnitOfDuration("unitOfDuration");
		benChiefComplaint.setDescription("description");
		benChiefComplaint.setCreatedBy("createdBy");
		benChiefComplaint.setParkingPlaceID(0);
		benChiefComplaint.setConceptID("conceptID");
		benChiefComplaint.setVisitCode(0L);
		benChiefComplaint.setVanID(0);
		final Iterable<BenChiefComplaint> benChiefComplaints = List.of(benChiefComplaint);
		final BenChiefComplaint benChiefComplaint1 = new BenChiefComplaint();
		benChiefComplaint1.setBeneficiaryRegID(0L);
		benChiefComplaint1.setBenVisitID(0L);
		benChiefComplaint1.setProviderServiceMapID(0);
		benChiefComplaint1.setChiefComplaintID(0);
		benChiefComplaint1.setChiefComplaint("chiefComplaint");
		benChiefComplaint1.setDuration(0);
		benChiefComplaint1.setUnitOfDuration("unitOfDuration");
		benChiefComplaint1.setDescription("description");
		benChiefComplaint1.setCreatedBy("createdBy");
		benChiefComplaint1.setParkingPlaceID(0);
		benChiefComplaint1.setConceptID("conceptID");
		benChiefComplaint1.setVisitCode(0L);
		benChiefComplaint1.setVanID(0);
		final ArrayList<BenChiefComplaint> entities = new ArrayList<>(List.of(benChiefComplaint1));
		when(mockBenChiefComplaintRepo.saveAll(entities)).thenReturn(benChiefComplaints);

		when(mockCommonDoctorServiceImpl.getSnomedCTcode("otherSymptoms")).thenReturn(new String[] { "result" });
		when(mockBenClinicalObservationsRepo.save(any(BenClinicalObservations.class))).thenReturn(null);
		when(mockCommonNurseServiceImpl.saveBeneficiaryPrescription(new JsonObject())).thenReturn(0L);

		// Configure CommonNurseServiceImpl.saveBenPrescribedDrugsList(...).
		final PrescribedDrugDetail prescribedDrugDetail = new PrescribedDrugDetail();
		prescribedDrugDetail.setBeneficiaryRegID(0L);
		prescribedDrugDetail.setBenVisitID(0L);
		prescribedDrugDetail.setProviderServiceMapID(0);
		prescribedDrugDetail.setVisitCode(0L);
		prescribedDrugDetail.setPrescriptionID(0L);
		final List<PrescribedDrugDetail> prescribedDrugDetailList = List.of(prescribedDrugDetail);
		when(mockCommonNurseServiceImpl.saveBenPrescribedDrugsList(prescribedDrugDetailList)).thenReturn(0);

		when(mockCommonNurseServiceImpl.saveBeneficiaryLabTestOrderDetails(new JsonObject(), 0L)).thenReturn(0L);
		when(mockBenPhysicalVitalRepo.updatePhysicalVitalDetailsQCDoctor("rbsTestResult", "rbsTestRemarks", 0L, 0L))
				.thenReturn(0);

		// Run the test
		assertThatThrownBy(() -> quickConsultationServiceImplUnderTest
				.quickConsultDoctorDataInsert(quickConsultDoctorOBJ, "Authorization"))
				.isInstanceOf(RuntimeException.class);
	}

	@Test
	void testQuickConsultDoctorDataInsert_CommonNurseServiceImplSaveBeneficiaryPrescriptionReturnsNull()
			throws Exception {
		// Setup
		final JsonObject quickConsultDoctorOBJ = new JsonObject();

		// Configure CommonServiceImpl.createTcRequest(...).
		final TeleconsultationRequestOBJ teleconsultationRequestOBJ = new TeleconsultationRequestOBJ();
		teleconsultationRequestOBJ.setUserID(0);
		teleconsultationRequestOBJ.setAllocationDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		teleconsultationRequestOBJ.setSpecializationID(0);
		teleconsultationRequestOBJ.setTmRequestID(0L);
		teleconsultationRequestOBJ.setWalkIn(false);
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenReturn(teleconsultationRequestOBJ);

		// Configure BenChiefComplaintRepo.saveAll(...).
		final BenChiefComplaint benChiefComplaint = new BenChiefComplaint();
		benChiefComplaint.setBeneficiaryRegID(0L);
		benChiefComplaint.setBenVisitID(0L);
		benChiefComplaint.setProviderServiceMapID(0);
		benChiefComplaint.setChiefComplaintID(0);
		benChiefComplaint.setChiefComplaint("chiefComplaint");
		benChiefComplaint.setDuration(0);
		benChiefComplaint.setUnitOfDuration("unitOfDuration");
		benChiefComplaint.setDescription("description");
		benChiefComplaint.setCreatedBy("createdBy");
		benChiefComplaint.setParkingPlaceID(0);
		benChiefComplaint.setConceptID("conceptID");
		benChiefComplaint.setVisitCode(0L);
		benChiefComplaint.setVanID(0);
		final Iterable<BenChiefComplaint> benChiefComplaints = List.of(benChiefComplaint);
		final BenChiefComplaint benChiefComplaint1 = new BenChiefComplaint();
		benChiefComplaint1.setBeneficiaryRegID(0L);
		benChiefComplaint1.setBenVisitID(0L);
		benChiefComplaint1.setProviderServiceMapID(0);
		benChiefComplaint1.setChiefComplaintID(0);
		benChiefComplaint1.setChiefComplaint("chiefComplaint");
		benChiefComplaint1.setDuration(0);
		benChiefComplaint1.setUnitOfDuration("unitOfDuration");
		benChiefComplaint1.setDescription("description");
		benChiefComplaint1.setCreatedBy("createdBy");
		benChiefComplaint1.setParkingPlaceID(0);
		benChiefComplaint1.setConceptID("conceptID");
		benChiefComplaint1.setVisitCode(0L);
		benChiefComplaint1.setVanID(0);
		final ArrayList<BenChiefComplaint> entities = new ArrayList<>(List.of(benChiefComplaint1));
		when(mockBenChiefComplaintRepo.saveAll(entities)).thenReturn(benChiefComplaints);

		when(mockCommonDoctorServiceImpl.getSnomedCTcode("otherSymptoms")).thenReturn(new String[] { "result" });

		// Configure BenClinicalObservationsRepo.save(...).
		final BenClinicalObservations benClinicalObservations = new BenClinicalObservations();
		benClinicalObservations.setBeneficiaryRegID(0L);
		benClinicalObservations.setOtherSymptoms("otherSymptoms");
		benClinicalObservations.setClinicalObservationID(0L);
		benClinicalObservations.setOtherSymptomsSCTCode("otherSymptomsSCTCode");
		benClinicalObservations.setOtherSymptomsSCTTerm("otherSymptomsSCTTerm");
		when(mockBenClinicalObservationsRepo.save(any(BenClinicalObservations.class)))
				.thenReturn(benClinicalObservations);

		when(mockCommonNurseServiceImpl.saveBeneficiaryPrescription(new JsonObject())).thenReturn(null);

		// Configure CommonNurseServiceImpl.saveBenPrescribedDrugsList(...).
		final PrescribedDrugDetail prescribedDrugDetail = new PrescribedDrugDetail();
		prescribedDrugDetail.setBeneficiaryRegID(0L);
		prescribedDrugDetail.setBenVisitID(0L);
		prescribedDrugDetail.setProviderServiceMapID(0);
		prescribedDrugDetail.setVisitCode(0L);
		prescribedDrugDetail.setPrescriptionID(0L);
		final List<PrescribedDrugDetail> prescribedDrugDetailList = List.of(prescribedDrugDetail);
		when(mockCommonNurseServiceImpl.saveBenPrescribedDrugsList(prescribedDrugDetailList)).thenReturn(0);

		when(mockCommonNurseServiceImpl.saveBeneficiaryLabTestOrderDetails(new JsonObject(), 0L)).thenReturn(0L);
		when(mockBenPhysicalVitalRepo.updatePhysicalVitalDetailsQCDoctor("rbsTestResult", "rbsTestRemarks", 0L, 0L))
				.thenReturn(0);

		// Run the test
		assertThatThrownBy(() -> quickConsultationServiceImplUnderTest
				.quickConsultDoctorDataInsert(quickConsultDoctorOBJ, "Authorization"))
				.isInstanceOf(RuntimeException.class);
	}

	@Test
	void testQuickConsultDoctorDataInsert_CommonNurseServiceImplSaveBeneficiaryPrescriptionThrowsException()
			throws Exception {
		// Setup
		final JsonObject quickConsultDoctorOBJ = new JsonObject();

		// Configure CommonServiceImpl.createTcRequest(...).
		final TeleconsultationRequestOBJ teleconsultationRequestOBJ = new TeleconsultationRequestOBJ();
		teleconsultationRequestOBJ.setUserID(0);
		teleconsultationRequestOBJ.setAllocationDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		teleconsultationRequestOBJ.setSpecializationID(0);
		teleconsultationRequestOBJ.setTmRequestID(0L);
		teleconsultationRequestOBJ.setWalkIn(false);
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenReturn(teleconsultationRequestOBJ);

		// Configure BenChiefComplaintRepo.saveAll(...).
		final BenChiefComplaint benChiefComplaint = new BenChiefComplaint();
		benChiefComplaint.setBeneficiaryRegID(0L);
		benChiefComplaint.setBenVisitID(0L);
		benChiefComplaint.setProviderServiceMapID(0);
		benChiefComplaint.setChiefComplaintID(0);
		benChiefComplaint.setChiefComplaint("chiefComplaint");
		benChiefComplaint.setDuration(0);
		benChiefComplaint.setUnitOfDuration("unitOfDuration");
		benChiefComplaint.setDescription("description");
		benChiefComplaint.setCreatedBy("createdBy");
		benChiefComplaint.setParkingPlaceID(0);
		benChiefComplaint.setConceptID("conceptID");
		benChiefComplaint.setVisitCode(0L);
		benChiefComplaint.setVanID(0);
		final Iterable<BenChiefComplaint> benChiefComplaints = List.of(benChiefComplaint);
		final BenChiefComplaint benChiefComplaint1 = new BenChiefComplaint();
		benChiefComplaint1.setBeneficiaryRegID(0L);
		benChiefComplaint1.setBenVisitID(0L);
		benChiefComplaint1.setProviderServiceMapID(0);
		benChiefComplaint1.setChiefComplaintID(0);
		benChiefComplaint1.setChiefComplaint("chiefComplaint");
		benChiefComplaint1.setDuration(0);
		benChiefComplaint1.setUnitOfDuration("unitOfDuration");
		benChiefComplaint1.setDescription("description");
		benChiefComplaint1.setCreatedBy("createdBy");
		benChiefComplaint1.setParkingPlaceID(0);
		benChiefComplaint1.setConceptID("conceptID");
		benChiefComplaint1.setVisitCode(0L);
		benChiefComplaint1.setVanID(0);
		final ArrayList<BenChiefComplaint> entities = new ArrayList<>(List.of(benChiefComplaint1));
		when(mockBenChiefComplaintRepo.saveAll(entities)).thenReturn(benChiefComplaints);

		when(mockCommonDoctorServiceImpl.getSnomedCTcode("otherSymptoms")).thenReturn(new String[] { "result" });

		// Configure BenClinicalObservationsRepo.save(...).
		final BenClinicalObservations benClinicalObservations = new BenClinicalObservations();
		benClinicalObservations.setBeneficiaryRegID(0L);
		benClinicalObservations.setOtherSymptoms("otherSymptoms");
		benClinicalObservations.setClinicalObservationID(0L);
		benClinicalObservations.setOtherSymptomsSCTCode("otherSymptomsSCTCode");
		benClinicalObservations.setOtherSymptomsSCTTerm("otherSymptomsSCTTerm");
		
		benClinicalObservations.toString();
		
		when(mockBenClinicalObservationsRepo.save(any(BenClinicalObservations.class)))
				.thenReturn(benClinicalObservations);

		when(mockCommonNurseServiceImpl.saveBeneficiaryPrescription(new JsonObject())).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> quickConsultationServiceImplUnderTest
				.quickConsultDoctorDataInsert(quickConsultDoctorOBJ, "Authorization")).isInstanceOf(Exception.class);
	}

	@Test
	void testGetBenDataFrmNurseToDocVisitDetailsScreen() {
		// Setup
		// Configure CommonNurseServiceImpl.getCSVisitDetails(...).
		final BeneficiaryVisitDetail beneficiaryVisitDetail = new BeneficiaryVisitDetail();
		beneficiaryVisitDetail.setVisitCode(0L);
		beneficiaryVisitDetail.setServiceProviderName("serviceProviderName");
		beneficiaryVisitDetail.setBeneficiaryRegID(0L);
		beneficiaryVisitDetail.setVisitReason("visitReason");
		beneficiaryVisitDetail.setVisitCategory("visitCategory");
		when(mockCommonNurseServiceImpl.getCSVisitDetails(0L, 0L)).thenReturn(beneficiaryVisitDetail);

		// Run the test
		final String result = quickConsultationServiceImplUnderTest.getBenDataFrmNurseToDocVisitDetailsScreen(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenDataFrmNurseToDocVisitDetailsScreen_CommonNurseServiceImplReturnsNull() {
		// Setup
		when(mockCommonNurseServiceImpl.getCSVisitDetails(0L, 0L)).thenReturn(null);

		// Run the test
		final String result = quickConsultationServiceImplUnderTest.getBenDataFrmNurseToDocVisitDetailsScreen(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBeneficiaryVitalDetails() {
		// Setup
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalAnthropometryDetails(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalVitalDetails(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = quickConsultationServiceImplUnderTest.getBeneficiaryVitalDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenQuickConsultNurseData() {
		// Setup
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalAnthropometryDetails(0L, 0L)).thenReturn("result");
		when(mockCommonNurseServiceImpl.getBeneficiaryPhysicalVitalDetails(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = quickConsultationServiceImplUnderTest.getBenQuickConsultNurseData(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenCaseRecordFromDoctorQuickConsult() throws JsonProcessingException, ParseException {
		// Setup
		when(mockCommonDoctorServiceImpl.getFindingsDetails(0L, 0L)).thenReturn("result");
		when(mockGeneralOPDDoctorServiceImpl.getGeneralOPDDiagnosisDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getInvestigationDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getPrescribedDrugs(0L, 0L)).thenReturn("result");

		// Configure LabTechnicianServiceImpl.getLabResultDataForBen(...).
		final ArrayList<LabResultEntry> labResultEntries = new ArrayList<>(
				List.of(new LabResultEntry(0L, Date.valueOf(LocalDate.of(2020, 1, 1)))));
		when(mockLabTechnicianServiceImpl.getLabResultDataForBen(0L, 0L)).thenReturn(labResultEntries);

		when(mockLabTechnicianServiceImpl.getLast_3_ArchivedTestVisitList(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = quickConsultationServiceImplUnderTest.getBenCaseRecordFromDoctorQuickConsult(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenCaseRecordFromDoctorQuickConsult_LabTechnicianServiceImplGetLabResultDataForBenReturnsNoItems() throws JsonProcessingException, ParseException {
		// Setup
		when(mockCommonDoctorServiceImpl.getFindingsDetails(0L, 0L)).thenReturn("result");
		when(mockGeneralOPDDoctorServiceImpl.getGeneralOPDDiagnosisDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getInvestigationDetails(0L, 0L)).thenReturn("result");
		when(mockCommonDoctorServiceImpl.getPrescribedDrugs(0L, 0L)).thenReturn("result");
		when(mockLabTechnicianServiceImpl.getLabResultDataForBen(0L, 0L)).thenReturn(new ArrayList<>());
		when(mockLabTechnicianServiceImpl.getLast_3_ArchivedTestVisitList(0L, 0L)).thenReturn("result");

		// Run the test
		final String result = quickConsultationServiceImplUnderTest.getBenCaseRecordFromDoctorQuickConsult(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testUpdateGeneralOPDQCDoctorData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject quickConsultDoctorOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> quickConsultationServiceImplUnderTest
				.updateGeneralOPDQCDoctorData(quickConsultDoctorOBJ, "Authorization")).isInstanceOf(Exception.class);
	}

	@Test
	void testUpdateGeneralOPDQCDoctorData_CommonDoctorServiceImplUpdateBenFlowtableAfterDocDataUpdateThrowsException()
			throws Exception {
		// Setup
		final JsonObject quickConsultDoctorOBJ = new JsonObject();

		// Configure CommonServiceImpl.createTcRequest(...).
		final TeleconsultationRequestOBJ teleconsultationRequestOBJ = new TeleconsultationRequestOBJ();
		teleconsultationRequestOBJ.setUserID(0);
		teleconsultationRequestOBJ.setAllocationDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		teleconsultationRequestOBJ.setSpecializationID(0);
		teleconsultationRequestOBJ.setTmRequestID(0L);
		teleconsultationRequestOBJ.setWalkIn(false);
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenReturn(teleconsultationRequestOBJ);

		// Configure BenChiefComplaintRepo.saveAll(...).
		final BenChiefComplaint benChiefComplaint = new BenChiefComplaint();
		benChiefComplaint.setBeneficiaryRegID(0L);
		benChiefComplaint.setBenVisitID(0L);
		benChiefComplaint.setProviderServiceMapID(0);
		benChiefComplaint.setChiefComplaintID(0);
		benChiefComplaint.setChiefComplaint("chiefComplaint");
		benChiefComplaint.setDuration(0);
		benChiefComplaint.setUnitOfDuration("unitOfDuration");
		benChiefComplaint.setDescription("description");
		benChiefComplaint.setCreatedBy("createdBy");
		benChiefComplaint.setParkingPlaceID(0);
		benChiefComplaint.setConceptID("conceptID");
		benChiefComplaint.setVisitCode(0L);
		benChiefComplaint.setVanID(0);
		final Iterable<BenChiefComplaint> benChiefComplaints = List.of(benChiefComplaint);
		final BenChiefComplaint benChiefComplaint1 = new BenChiefComplaint();
		benChiefComplaint1.setBeneficiaryRegID(0L);
		benChiefComplaint1.setBenVisitID(0L);
		benChiefComplaint1.setProviderServiceMapID(0);
		benChiefComplaint1.setChiefComplaintID(0);
		benChiefComplaint1.setChiefComplaint("chiefComplaint");
		benChiefComplaint1.setDuration(0);
		benChiefComplaint1.setUnitOfDuration("unitOfDuration");
		benChiefComplaint1.setDescription("description");
		benChiefComplaint1.setCreatedBy("createdBy");
		benChiefComplaint1.setParkingPlaceID(0);
		benChiefComplaint1.setConceptID("conceptID");
		benChiefComplaint1.setVisitCode(0L);
		benChiefComplaint1.setVanID(0);
		final ArrayList<BenChiefComplaint> entities = new ArrayList<>(List.of(benChiefComplaint1));
		when(mockBenChiefComplaintRepo.saveAll(entities)).thenReturn(benChiefComplaints);

		when(mockCommonDoctorServiceImpl.getSnomedCTcode("otherSymptoms")).thenReturn(new String[] { "result" });
		when(mockCommonDoctorServiceImpl.updateBenClinicalObservations(any(BenClinicalObservations.class)))
				.thenReturn(0);
		when(mockCommonNurseServiceImpl.updatePrescription(any(PrescriptionDetail.class))).thenReturn(0);

		// Configure CommonNurseServiceImpl.saveBenPrescribedDrugsList(...).
		final PrescribedDrugDetail prescribedDrugDetail = new PrescribedDrugDetail();
		prescribedDrugDetail.setBeneficiaryRegID(0L);
		prescribedDrugDetail.setBenVisitID(0L);
		prescribedDrugDetail.setProviderServiceMapID(0);
		prescribedDrugDetail.setVisitCode(0L);
		prescribedDrugDetail.setPrescriptionID(0L);
		final List<PrescribedDrugDetail> prescribedDrugDetailList = List.of(prescribedDrugDetail);
		when(mockCommonNurseServiceImpl.saveBenPrescribedDrugsList(prescribedDrugDetailList)).thenReturn(0);

		when(mockCommonNurseServiceImpl.saveBeneficiaryLabTestOrderDetails(new JsonObject(), 0L)).thenReturn(0L);
		when(mockBenPhysicalVitalRepo.updatePhysicalVitalDetailsQCDoctor("rbsTestResult", "rbsTestRemarks", 0L, 0L))
				.thenReturn(0);
		when(mockCommonDoctorServiceImpl.updateBenFlowtableAfterDocDataUpdate(any(CommonUtilityClass.class), eq(false),
				eq(false), any(TeleconsultationRequestOBJ.class))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> quickConsultationServiceImplUnderTest
				.updateGeneralOPDQCDoctorData(quickConsultDoctorOBJ, "Authorization")).isInstanceOf(Exception.class);
	}

}
