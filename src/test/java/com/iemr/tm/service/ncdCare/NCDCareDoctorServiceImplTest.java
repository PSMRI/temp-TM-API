package com.iemr.tm.service.ncdCare;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.OptimisticLockingFailureException;

import com.iemr.tm.data.ncdcare.NCDCareDiagnosis;
import com.iemr.tm.repo.nurse.ncdcare.NCDCareDiagnosisRepo;
import com.iemr.tm.repo.quickConsultation.PrescriptionDetailRepo;

@ExtendWith(MockitoExtension.class)
class NCDCareDoctorServiceImplTest {

	@Mock
	private NCDCareDiagnosisRepo mockNcdCareDiagnosisRepo;
	@Mock
	private PrescriptionDetailRepo mockPrescriptionDetailRepo;

	private NCDCareDoctorServiceImpl ncdCareDoctorServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		ncdCareDoctorServiceImplUnderTest = new NCDCareDoctorServiceImpl();
		ncdCareDoctorServiceImplUnderTest.setNcdCareDiagnosisRepo(mockNcdCareDiagnosisRepo);
		ncdCareDoctorServiceImplUnderTest.setPrescriptionDetailRepo(mockPrescriptionDetailRepo);
	}

	@Test
	void testSaveNCDDiagnosisData_NCDCareDiagnosisRepoReturnsNull() throws Exception {
		// Setup
		final NCDCareDiagnosis ncdDiagnosis = new NCDCareDiagnosis(0L, 0L, 0, 0L, "ncdCareCondition", "ncdComplication",
				"ncdCareType", 0L, "externalInvestigation", "ncdCareConditionOther");
		when(mockNcdCareDiagnosisRepo.save(any(NCDCareDiagnosis.class))).thenReturn(null);

		// Run the test
		final long result = ncdCareDoctorServiceImplUnderTest.saveNCDDiagnosisData(ncdDiagnosis);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSaveNCDDiagnosisData_NCDCareDiagnosisRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final NCDCareDiagnosis ncdDiagnosis = new NCDCareDiagnosis(0L, 0L, 0, 0L, "ncdCareCondition", "ncdComplication",
				"ncdCareType", 0L, "externalInvestigation", "ncdCareConditionOther");
		when(mockNcdCareDiagnosisRepo.save(any(NCDCareDiagnosis.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> ncdCareDoctorServiceImplUnderTest.saveNCDDiagnosisData(ncdDiagnosis))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testGetNCDCareDiagnosisDetails_PrescriptionDetailRepoFindByBeneficiaryRegIDAndVisitCodeOrderByPrescriptionIDDescReturnsNull() {

		when(mockPrescriptionDetailRepo.findByBeneficiaryRegIDAndVisitCodeOrderByPrescriptionIDDesc(0L, 0L))
				.thenReturn(null);

		// Run the test
		final String result = ncdCareDoctorServiceImplUnderTest.getNCDCareDiagnosisDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetNCDCareDiagnosisDetails_PrescriptionDetailRepoFindByBeneficiaryRegIDAndVisitCodeOrderByPrescriptionIDDescReturnsNoItems() {

		when(mockPrescriptionDetailRepo.findByBeneficiaryRegIDAndVisitCodeOrderByPrescriptionIDDesc(0L, 0L))
				.thenReturn(new ArrayList<>());

		// Run the test
		final String result = ncdCareDoctorServiceImplUnderTest.getNCDCareDiagnosisDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testUpdateBenNCDCareDiagnosis_NCDCareDiagnosisRepoSaveReturnsNull() throws Exception {
		// Setup
		final NCDCareDiagnosis ncdCareDiagnosis = new NCDCareDiagnosis(0L, 0L, 0, 0L, "ncdCareCondition",
				"ncdComplication", "ncdCareType", 0L, "externalInvestigation", "ncdCareConditionOther");
		when(mockNcdCareDiagnosisRepo.getNCDCareDiagnosisStatus(0L, 0L, 0L)).thenReturn(null);
		when(mockNcdCareDiagnosisRepo.save(any(NCDCareDiagnosis.class))).thenReturn(null);

		// Run the test
		final int result = ncdCareDoctorServiceImplUnderTest.updateBenNCDCareDiagnosis(ncdCareDiagnosis);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenNCDCareDiagnosis_NCDCareDiagnosisRepoSaveThrowsOptimisticLockingFailureException() {
		// Setup
		final NCDCareDiagnosis ncdCareDiagnosis = new NCDCareDiagnosis(0L, 0L, 0, 0L, "ncdCareCondition",
				"ncdComplication", "ncdCareType", 0L, "externalInvestigation", "ncdCareConditionOther");
		when(mockNcdCareDiagnosisRepo.getNCDCareDiagnosisStatus(0L, 0L, 0L)).thenReturn(null);
		when(mockNcdCareDiagnosisRepo.save(any(NCDCareDiagnosis.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> ncdCareDoctorServiceImplUnderTest.updateBenNCDCareDiagnosis(ncdCareDiagnosis))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}
}
