package com.iemr.tm.service.pnc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.OptimisticLockingFailureException;

import com.google.gson.JsonObject;
import com.iemr.tm.data.pnc.PNCDiagnosis;
import com.iemr.tm.data.snomedct.SCTDescription;
import com.iemr.tm.repo.nurse.pnc.PNCDiagnosisRepo;
import com.iemr.tm.repo.quickConsultation.PrescriptionDetailRepo;
import com.iemr.tm.service.common.transaction.CommonDoctorServiceImpl;

@ExtendWith(MockitoExtension.class)
class PNCDoctorServiceImplTest {

	@Mock
	private PNCDiagnosisRepo mockPncDiagnosisRepo;
	@Mock
	private PrescriptionDetailRepo mockPrescriptionDetailRepo;
	@Mock
	private CommonDoctorServiceImpl mockCommonDoctorServiceImpl;

	private PNCDoctorServiceImpl pncDoctorServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		pncDoctorServiceImplUnderTest = new PNCDoctorServiceImpl();
		pncDoctorServiceImplUnderTest.setPncDiagnosisRepo(mockPncDiagnosisRepo);
		pncDoctorServiceImplUnderTest.setPrescriptionDetailRepo(mockPrescriptionDetailRepo);
		pncDoctorServiceImplUnderTest.setCommonDoctorServiceImpl(mockCommonDoctorServiceImpl);
	}

	@Test
	void testSaveBenPNCDiagnosis() throws Exception {
		// Setup
		final JsonObject obj = new JsonObject();

		// Configure PNCDiagnosisRepo.save(...).
		final PNCDiagnosis pncDiagnosis = new PNCDiagnosis();
		pncDiagnosis.setProvisionalDiagnosisSCTCode("provisionalDiagnosisSCTCode");
		pncDiagnosis.setProvisionalDiagnosisSCTTerm("provisionalDiagnosisSCTTerm");
		pncDiagnosis.setConfirmatoryDiagnosisSCTCode("confirmatoryDiagnosisSCTCode");
		pncDiagnosis.setConfirmatoryDiagnosisSCTTerm("confirmatoryDiagnosisSCTTerm");
		pncDiagnosis.setExternalInvestigation("externalInvestigation");
		pncDiagnosis.setID(0L);
		pncDiagnosis.setBeneficiaryRegID(0L);
		pncDiagnosis.setVisitCode(0L);
		pncDiagnosis.setPrescriptionID(0L);
		pncDiagnosis.setProvisionalDiagnosis("provisionalDiagnosis");
		pncDiagnosis.setConfirmatoryDiagnosis("confirmatoryDiagnosis");
		pncDiagnosis.setIsMaternalDeath(false);
		pncDiagnosis.setPlaceOfDeath("placeOfDeath");
		pncDiagnosis.setDateOfDeath(Date.valueOf(LocalDate.of(2020, 1, 1)));
		pncDiagnosis.setCauseOfDeath("causeOfDeath");
		pncDiagnosis.setCreatedBy("createdBy");
		
		pncDiagnosis.toString();
		
		final SCTDescription sctDescription = new SCTDescription();
		sctDescription.setTerm("term");
		sctDescription.setConceptID("conceptID");
		pncDiagnosis.setProvisionalDiagnosisList(new ArrayList<>(List.of(sctDescription)));
		
		sctDescription.toString();
		
		final SCTDescription sctDescription1 = new SCTDescription();
		sctDescription1.setTerm("term");
		sctDescription1.setConceptID("conceptID");
		pncDiagnosis.setConfirmatoryDiagnosisList(new ArrayList<>(List.of(sctDescription1)));
		pncDiagnosis.setSpecialistDiagnosis("specialistDiagnosis");
		when(mockPncDiagnosisRepo.save(any(PNCDiagnosis.class))).thenReturn(pncDiagnosis);

		// Run the test
		final Long result = pncDoctorServiceImplUnderTest.saveBenPNCDiagnosis(obj, 0L);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveBenPNCDiagnosis_PNCDiagnosisRepoReturnsNull() throws Exception {
		// Setup
		final JsonObject obj = new JsonObject();
		when(mockPncDiagnosisRepo.save(any(PNCDiagnosis.class))).thenReturn(null);

		// Run the test
		final Long result = pncDoctorServiceImplUnderTest.saveBenPNCDiagnosis(obj, 0L);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveBenPNCDiagnosis_PNCDiagnosisRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final JsonObject obj = new JsonObject();
		when(mockPncDiagnosisRepo.save(any(PNCDiagnosis.class))).thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> pncDoctorServiceImplUnderTest.saveBenPNCDiagnosis(obj, 0L))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testGetPNCDiagnosisDetails() {

		// Configure PNCDiagnosisRepo.findByBeneficiaryRegIDAndVisitCode(...).
		final PNCDiagnosis pncDiagnosis = new PNCDiagnosis();
		pncDiagnosis.setProvisionalDiagnosisSCTCode("provisionalDiagnosisSCTCode");
		pncDiagnosis.setProvisionalDiagnosisSCTTerm("provisionalDiagnosisSCTTerm");
		pncDiagnosis.setConfirmatoryDiagnosisSCTCode("confirmatoryDiagnosisSCTCode");
		pncDiagnosis.setConfirmatoryDiagnosisSCTTerm("confirmatoryDiagnosisSCTTerm");
		pncDiagnosis.setExternalInvestigation("externalInvestigation");
		pncDiagnosis.setID(0L);
		pncDiagnosis.setBeneficiaryRegID(0L);
		pncDiagnosis.setVisitCode(0L);
		pncDiagnosis.setPrescriptionID(0L);
		pncDiagnosis.setProvisionalDiagnosis("provisionalDiagnosis");
		pncDiagnosis.setConfirmatoryDiagnosis("confirmatoryDiagnosis");
		pncDiagnosis.setIsMaternalDeath(false);
		pncDiagnosis.setPlaceOfDeath("placeOfDeath");
		pncDiagnosis.setDateOfDeath(Date.valueOf(LocalDate.of(2020, 1, 1)));
		pncDiagnosis.setCauseOfDeath("causeOfDeath");
		pncDiagnosis.setCreatedBy("createdBy");
		final SCTDescription sctDescription = new SCTDescription();
		sctDescription.setTerm("term");
		sctDescription.setConceptID("conceptID");
		pncDiagnosis.setProvisionalDiagnosisList(new ArrayList<>(List.of(sctDescription)));
		final SCTDescription sctDescription1 = new SCTDescription();
		sctDescription1.setTerm("term");
		sctDescription1.setConceptID("conceptID");
		pncDiagnosis.setConfirmatoryDiagnosisList(new ArrayList<>(List.of(sctDescription1)));
		pncDiagnosis.setSpecialistDiagnosis("specialistDiagnosis");
		final ArrayList<PNCDiagnosis> pncDiagnoses = new ArrayList<>(List.of(pncDiagnosis));
		when(mockPncDiagnosisRepo.findByBeneficiaryRegIDAndVisitCode(0L, 0L)).thenReturn(pncDiagnoses);

		// Run the test
		final String result = pncDoctorServiceImplUnderTest.getPNCDiagnosisDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetPNCDiagnosisDetails_PrescriptionDetailRepoReturnsNull() {
		// Setup
		when(mockPrescriptionDetailRepo.getExternalinvestigationForVisitCode(0L, 0L)).thenReturn(null);

		// Configure PNCDiagnosisRepo.findByBeneficiaryRegIDAndVisitCode(...).
		final PNCDiagnosis pncDiagnosis = new PNCDiagnosis();
		pncDiagnosis.setProvisionalDiagnosisSCTCode("provisionalDiagnosisSCTCode");
		pncDiagnosis.setProvisionalDiagnosisSCTTerm("provisionalDiagnosisSCTTerm");
		pncDiagnosis.setConfirmatoryDiagnosisSCTCode("confirmatoryDiagnosisSCTCode");
		pncDiagnosis.setConfirmatoryDiagnosisSCTTerm("confirmatoryDiagnosisSCTTerm");
		pncDiagnosis.setExternalInvestigation("externalInvestigation");
		pncDiagnosis.setID(0L);
		pncDiagnosis.setBeneficiaryRegID(0L);
		pncDiagnosis.setVisitCode(0L);
		pncDiagnosis.setPrescriptionID(0L);
		pncDiagnosis.setProvisionalDiagnosis("provisionalDiagnosis");
		pncDiagnosis.setConfirmatoryDiagnosis("confirmatoryDiagnosis");
		pncDiagnosis.setIsMaternalDeath(false);
		pncDiagnosis.setPlaceOfDeath("placeOfDeath");
		pncDiagnosis.setDateOfDeath(Date.valueOf(LocalDate.of(2020, 1, 1)));
		pncDiagnosis.setCauseOfDeath("causeOfDeath");
		pncDiagnosis.setCreatedBy("createdBy");
		final SCTDescription sctDescription = new SCTDescription();
		sctDescription.setTerm("term");
		sctDescription.setConceptID("conceptID");
		pncDiagnosis.setProvisionalDiagnosisList(new ArrayList<>(List.of(sctDescription)));
		final SCTDescription sctDescription1 = new SCTDescription();
		sctDescription1.setTerm("term");
		sctDescription1.setConceptID("conceptID");
		pncDiagnosis.setConfirmatoryDiagnosisList(new ArrayList<>(List.of(sctDescription1)));
		pncDiagnosis.setSpecialistDiagnosis("specialistDiagnosis");
		final ArrayList<PNCDiagnosis> pncDiagnoses = new ArrayList<>(List.of(pncDiagnosis));
		when(mockPncDiagnosisRepo.findByBeneficiaryRegIDAndVisitCode(0L, 0L)).thenReturn(pncDiagnoses);

		// Run the test
		final String result = pncDoctorServiceImplUnderTest.getPNCDiagnosisDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetPNCDiagnosisDetails_PrescriptionDetailRepoReturnsNoItems() {
		// Setup
		when(mockPrescriptionDetailRepo.getExternalinvestigationForVisitCode(0L, 0L)).thenReturn(new ArrayList<>());

		// Configure PNCDiagnosisRepo.findByBeneficiaryRegIDAndVisitCode(...).
		final PNCDiagnosis pncDiagnosis = new PNCDiagnosis();
		pncDiagnosis.setProvisionalDiagnosisSCTCode("provisionalDiagnosisSCTCode");
		pncDiagnosis.setProvisionalDiagnosisSCTTerm("provisionalDiagnosisSCTTerm");
		pncDiagnosis.setConfirmatoryDiagnosisSCTCode("confirmatoryDiagnosisSCTCode");
		pncDiagnosis.setConfirmatoryDiagnosisSCTTerm("confirmatoryDiagnosisSCTTerm");
		pncDiagnosis.setExternalInvestigation("externalInvestigation");
		pncDiagnosis.setID(0L);
		pncDiagnosis.setBeneficiaryRegID(0L);
		pncDiagnosis.setVisitCode(0L);
		pncDiagnosis.setPrescriptionID(0L);
		pncDiagnosis.setProvisionalDiagnosis("provisionalDiagnosis");
		pncDiagnosis.setConfirmatoryDiagnosis("confirmatoryDiagnosis");
		pncDiagnosis.setIsMaternalDeath(false);
		pncDiagnosis.setPlaceOfDeath("placeOfDeath");
		pncDiagnosis.setDateOfDeath(Date.valueOf(LocalDate.of(2020, 1, 1)));
		pncDiagnosis.setCauseOfDeath("causeOfDeath");
		pncDiagnosis.setCreatedBy("createdBy");
		final SCTDescription sctDescription = new SCTDescription();
		sctDescription.setTerm("term");
		sctDescription.setConceptID("conceptID");
		pncDiagnosis.setProvisionalDiagnosisList(new ArrayList<>(List.of(sctDescription)));
		final SCTDescription sctDescription1 = new SCTDescription();
		sctDescription1.setTerm("term");
		sctDescription1.setConceptID("conceptID");
		pncDiagnosis.setConfirmatoryDiagnosisList(new ArrayList<>(List.of(sctDescription1)));
		pncDiagnosis.setSpecialistDiagnosis("specialistDiagnosis");
		final ArrayList<PNCDiagnosis> pncDiagnoses = new ArrayList<>(List.of(pncDiagnosis));
		when(mockPncDiagnosisRepo.findByBeneficiaryRegIDAndVisitCode(0L, 0L)).thenReturn(pncDiagnoses);

		// Run the test
		final String result = pncDoctorServiceImplUnderTest.getPNCDiagnosisDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetPNCDiagnosisDetails_PNCDiagnosisRepoReturnsNull() {

		when(mockPncDiagnosisRepo.findByBeneficiaryRegIDAndVisitCode(0L, 0L)).thenReturn(null);

		// Run the test
		final String result = pncDoctorServiceImplUnderTest.getPNCDiagnosisDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetPNCDiagnosisDetails_PNCDiagnosisRepoReturnsNoItems() {

		when(mockPncDiagnosisRepo.findByBeneficiaryRegIDAndVisitCode(0L, 0L)).thenReturn(new ArrayList<>());

		// Run the test
		final String result = pncDoctorServiceImplUnderTest.getPNCDiagnosisDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testUpdateBenPNCDiagnosis_PNCDiagnosisRepoGetPNCDiagnosisStatusReturnsNull() throws Exception {
		// Setup
		final PNCDiagnosis pncDiagnosis = new PNCDiagnosis();
		pncDiagnosis.setProvisionalDiagnosisSCTCode("provisionalDiagnosisSCTCode");
		pncDiagnosis.setProvisionalDiagnosisSCTTerm("provisionalDiagnosisSCTTerm");
		pncDiagnosis.setConfirmatoryDiagnosisSCTCode("confirmatoryDiagnosisSCTCode");
		pncDiagnosis.setConfirmatoryDiagnosisSCTTerm("confirmatoryDiagnosisSCTTerm");
		pncDiagnosis.setExternalInvestigation("externalInvestigation");
		pncDiagnosis.setID(0L);
		pncDiagnosis.setBeneficiaryRegID(0L);
		pncDiagnosis.setVisitCode(0L);
		pncDiagnosis.setPrescriptionID(0L);
		pncDiagnosis.setProvisionalDiagnosis("provisionalDiagnosis");
		pncDiagnosis.setConfirmatoryDiagnosis("confirmatoryDiagnosis");
		pncDiagnosis.setIsMaternalDeath(false);
		pncDiagnosis.setPlaceOfDeath("placeOfDeath");
		pncDiagnosis.setDateOfDeath(Date.valueOf(LocalDate.of(2020, 1, 1)));
		pncDiagnosis.setCauseOfDeath("causeOfDeath");
		pncDiagnosis.setCreatedBy("createdBy");
		final SCTDescription sctDescription = new SCTDescription();
		sctDescription.setTerm("term");
		sctDescription.setConceptID("conceptID");
		pncDiagnosis.setProvisionalDiagnosisList(new ArrayList<>(List.of(sctDescription)));
		final SCTDescription sctDescription1 = new SCTDescription();
		sctDescription1.setTerm("term");
		sctDescription1.setConceptID("conceptID");
		pncDiagnosis.setConfirmatoryDiagnosisList(new ArrayList<>(List.of(sctDescription1)));
		pncDiagnosis.setSpecialistDiagnosis("specialistDiagnosis");

		when(mockPncDiagnosisRepo.getPNCDiagnosisStatus(0L, 0L, 0L)).thenReturn(null);

		// Configure PNCDiagnosisRepo.save(...).
		final PNCDiagnosis pncDiagnosis1 = new PNCDiagnosis();
		pncDiagnosis1.setProvisionalDiagnosisSCTCode("provisionalDiagnosisSCTCode");
		pncDiagnosis1.setProvisionalDiagnosisSCTTerm("provisionalDiagnosisSCTTerm");
		pncDiagnosis1.setConfirmatoryDiagnosisSCTCode("confirmatoryDiagnosisSCTCode");
		pncDiagnosis1.setConfirmatoryDiagnosisSCTTerm("confirmatoryDiagnosisSCTTerm");
		pncDiagnosis1.setExternalInvestigation("externalInvestigation");
		pncDiagnosis1.setID(0L);
		pncDiagnosis1.setBeneficiaryRegID(0L);
		pncDiagnosis1.setVisitCode(0L);
		pncDiagnosis1.setPrescriptionID(0L);
		pncDiagnosis1.setProvisionalDiagnosis("provisionalDiagnosis");
		pncDiagnosis1.setConfirmatoryDiagnosis("confirmatoryDiagnosis");
		pncDiagnosis1.setIsMaternalDeath(false);
		pncDiagnosis1.setPlaceOfDeath("placeOfDeath");
		pncDiagnosis1.setDateOfDeath(Date.valueOf(LocalDate.of(2020, 1, 1)));
		pncDiagnosis1.setCauseOfDeath("causeOfDeath");
		pncDiagnosis1.setCreatedBy("createdBy");
		final SCTDescription sctDescription2 = new SCTDescription();
		sctDescription2.setTerm("term");
		sctDescription2.setConceptID("conceptID");
		pncDiagnosis1.setProvisionalDiagnosisList(new ArrayList<>(List.of(sctDescription2)));
		final SCTDescription sctDescription3 = new SCTDescription();
		sctDescription3.setTerm("term");
		sctDescription3.setConceptID("conceptID");
		pncDiagnosis1.setConfirmatoryDiagnosisList(new ArrayList<>(List.of(sctDescription3)));
		pncDiagnosis1.setSpecialistDiagnosis("specialistDiagnosis");
		when(mockPncDiagnosisRepo.save(any(PNCDiagnosis.class))).thenReturn(pncDiagnosis1);

		// Run the test
		final int result = pncDoctorServiceImplUnderTest.updateBenPNCDiagnosis(pncDiagnosis);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenPNCDiagnosis_PNCDiagnosisRepoSaveReturnsNull() throws Exception {
		// Setup
		final PNCDiagnosis pncDiagnosis = new PNCDiagnosis();
		pncDiagnosis.setProvisionalDiagnosisSCTCode("provisionalDiagnosisSCTCode");
		pncDiagnosis.setProvisionalDiagnosisSCTTerm("provisionalDiagnosisSCTTerm");
		pncDiagnosis.setConfirmatoryDiagnosisSCTCode("confirmatoryDiagnosisSCTCode");
		pncDiagnosis.setConfirmatoryDiagnosisSCTTerm("confirmatoryDiagnosisSCTTerm");
		pncDiagnosis.setExternalInvestigation("externalInvestigation");
		pncDiagnosis.setID(0L);
		pncDiagnosis.setBeneficiaryRegID(0L);
		pncDiagnosis.setVisitCode(0L);
		pncDiagnosis.setPrescriptionID(0L);
		pncDiagnosis.setProvisionalDiagnosis("provisionalDiagnosis");
		pncDiagnosis.setConfirmatoryDiagnosis("confirmatoryDiagnosis");
		pncDiagnosis.setIsMaternalDeath(false);
		pncDiagnosis.setPlaceOfDeath("placeOfDeath");
		pncDiagnosis.setDateOfDeath(Date.valueOf(LocalDate.of(2020, 1, 1)));
		pncDiagnosis.setCauseOfDeath("causeOfDeath");
		pncDiagnosis.setCreatedBy("createdBy");
		final SCTDescription sctDescription = new SCTDescription();
		sctDescription.setTerm("term");
		sctDescription.setConceptID("conceptID");
		pncDiagnosis.setProvisionalDiagnosisList(new ArrayList<>(List.of(sctDescription)));
		final SCTDescription sctDescription1 = new SCTDescription();
		sctDescription1.setTerm("term");
		sctDescription1.setConceptID("conceptID");
		pncDiagnosis.setConfirmatoryDiagnosisList(new ArrayList<>(List.of(sctDescription1)));
		pncDiagnosis.setSpecialistDiagnosis("specialistDiagnosis");

		when(mockPncDiagnosisRepo.getPNCDiagnosisStatus(0L, 0L, 0L)).thenReturn(null);
		when(mockPncDiagnosisRepo.save(any(PNCDiagnosis.class))).thenReturn(null);

		// Run the test
		final int result = pncDoctorServiceImplUnderTest.updateBenPNCDiagnosis(pncDiagnosis);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenPNCDiagnosis_PNCDiagnosisRepoSaveThrowsOptimisticLockingFailureException() {
		// Setup
		final PNCDiagnosis pncDiagnosis = new PNCDiagnosis();
		pncDiagnosis.setProvisionalDiagnosisSCTCode("provisionalDiagnosisSCTCode");
		pncDiagnosis.setProvisionalDiagnosisSCTTerm("provisionalDiagnosisSCTTerm");
		pncDiagnosis.setConfirmatoryDiagnosisSCTCode("confirmatoryDiagnosisSCTCode");
		pncDiagnosis.setConfirmatoryDiagnosisSCTTerm("confirmatoryDiagnosisSCTTerm");
		pncDiagnosis.setExternalInvestigation("externalInvestigation");
		pncDiagnosis.setID(0L);
		pncDiagnosis.setBeneficiaryRegID(0L);
		pncDiagnosis.setVisitCode(0L);
		pncDiagnosis.setPrescriptionID(0L);
		pncDiagnosis.setProvisionalDiagnosis("provisionalDiagnosis");
		pncDiagnosis.setConfirmatoryDiagnosis("confirmatoryDiagnosis");
		pncDiagnosis.setIsMaternalDeath(false);
		pncDiagnosis.setPlaceOfDeath("placeOfDeath");
		pncDiagnosis.setDateOfDeath(Date.valueOf(LocalDate.of(2020, 1, 1)));
		pncDiagnosis.setCauseOfDeath("causeOfDeath");
		pncDiagnosis.setCreatedBy("createdBy");
		final SCTDescription sctDescription = new SCTDescription();
		sctDescription.setTerm("term");
		sctDescription.setConceptID("conceptID");
		pncDiagnosis.setProvisionalDiagnosisList(new ArrayList<>(List.of(sctDescription)));
		final SCTDescription sctDescription1 = new SCTDescription();
		sctDescription1.setTerm("term");
		sctDescription1.setConceptID("conceptID");
		pncDiagnosis.setConfirmatoryDiagnosisList(new ArrayList<>(List.of(sctDescription1)));
		pncDiagnosis.setSpecialistDiagnosis("specialistDiagnosis");

		when(mockPncDiagnosisRepo.getPNCDiagnosisStatus(0L, 0L, 0L)).thenReturn(null);
		when(mockPncDiagnosisRepo.save(any(PNCDiagnosis.class))).thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> pncDoctorServiceImplUnderTest.updateBenPNCDiagnosis(pncDiagnosis))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}
}
