package com.iemr.tm.service.cancerScreening;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.OptimisticLockingFailureException;

import com.iemr.tm.data.doctor.CancerDiagnosis;
import com.iemr.tm.data.institution.Institute;
import com.iemr.tm.repo.doctor.CancerDiagnosisRepo;

@ExtendWith(MockitoExtension.class)
class CSDoctorServiceImplTest {

	@Mock
	private CancerDiagnosisRepo mockCancerDiagnosisRepo;

	private CSDoctorServiceImpl csDoctorServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		csDoctorServiceImplUnderTest = new CSDoctorServiceImpl();
		csDoctorServiceImplUnderTest.setCancerDiagnosisRepo(mockCancerDiagnosisRepo);
	}

	@Test
	void testSaveCancerDiagnosisData() {
		// Setup
		final CancerDiagnosis cancerDiagnosis = new CancerDiagnosis();
		cancerDiagnosis.setID(0L);
		cancerDiagnosis.setBeneficiaryRegID(0L);
		cancerDiagnosis.setProvisionalDiagnosisPrimaryDoctor("provisionalDiagnosisPrimaryDoctor");
		cancerDiagnosis.setRemarks("remarks");
		cancerDiagnosis.setReferredToInstituteID(0);
		cancerDiagnosis.setRefrredToAdditionalService("refrredToAdditionalService");
		cancerDiagnosis.setModifiedBy("modifiedBy");
		cancerDiagnosis.setReferredToInstituteName("institutionName");
		cancerDiagnosis.setRefrredToAdditionalServiceList(List.of("value"));

		cancerDiagnosis.toString();

		final Institute institute = new Institute();
		institute.setInstitutionName("institutionName");
		cancerDiagnosis.setInstitute(institute);
		cancerDiagnosis.setVisitCode(0L);
		cancerDiagnosis.setRevisitDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		cancerDiagnosis.setReferralReason("referralReason");

		// Configure CancerDiagnosisRepo.save(...).
		final CancerDiagnosis cancerDiagnosis1 = new CancerDiagnosis();
		cancerDiagnosis1.setID(0L);
		cancerDiagnosis1.setBeneficiaryRegID(0L);
		cancerDiagnosis1.setProvisionalDiagnosisPrimaryDoctor("provisionalDiagnosisPrimaryDoctor");
		cancerDiagnosis1.setRemarks("remarks");
		cancerDiagnosis1.setReferredToInstituteID(0);
		cancerDiagnosis1.setRefrredToAdditionalService("refrredToAdditionalService");
		cancerDiagnosis1.setModifiedBy("modifiedBy");
		cancerDiagnosis1.setReferredToInstituteName("institutionName");
		cancerDiagnosis1.setRefrredToAdditionalServiceList(List.of("value"));
		final Institute institute1 = new Institute();
		institute1.setInstitutionName("institutionName");
		cancerDiagnosis1.setInstitute(institute1);
		cancerDiagnosis1.setVisitCode(0L);
		cancerDiagnosis1.setRevisitDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		cancerDiagnosis1.setReferralReason("referralReason");
		when(mockCancerDiagnosisRepo.save(any(CancerDiagnosis.class))).thenReturn(cancerDiagnosis1);

		// Run the test
		final Long result = csDoctorServiceImplUnderTest.saveCancerDiagnosisData(cancerDiagnosis);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSaveCancerDiagnosisData_CancerDiagnosisRepoReturnsNull() {
		// Setup
		final CancerDiagnosis cancerDiagnosis = new CancerDiagnosis();
		cancerDiagnosis.setID(0L);
		cancerDiagnosis.setBeneficiaryRegID(0L);
		cancerDiagnosis.setProvisionalDiagnosisPrimaryDoctor("provisionalDiagnosisPrimaryDoctor");
		cancerDiagnosis.setRemarks("remarks");
		cancerDiagnosis.setReferredToInstituteID(0);
		cancerDiagnosis.setRefrredToAdditionalService("refrredToAdditionalService");
		cancerDiagnosis.setModifiedBy("modifiedBy");
		cancerDiagnosis.setReferredToInstituteName("institutionName");
		cancerDiagnosis.setRefrredToAdditionalServiceList(List.of("value"));
		final Institute institute = new Institute();
		institute.setInstitutionName("institutionName");
		cancerDiagnosis.setInstitute(institute);
		cancerDiagnosis.setVisitCode(0L);
		cancerDiagnosis.setRevisitDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		cancerDiagnosis.setReferralReason("referralReason");

		when(mockCancerDiagnosisRepo.save(any(CancerDiagnosis.class))).thenReturn(null);

		// Run the test
		final Long result = csDoctorServiceImplUnderTest.saveCancerDiagnosisData(cancerDiagnosis);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveCancerDiagnosisData_CancerDiagnosisRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final CancerDiagnosis cancerDiagnosis = new CancerDiagnosis();
		cancerDiagnosis.setID(0L);
		cancerDiagnosis.setBeneficiaryRegID(0L);
		cancerDiagnosis.setProvisionalDiagnosisPrimaryDoctor("provisionalDiagnosisPrimaryDoctor");
		cancerDiagnosis.setRemarks("remarks");
		cancerDiagnosis.setReferredToInstituteID(0);
		cancerDiagnosis.setRefrredToAdditionalService("refrredToAdditionalService");
		cancerDiagnosis.setModifiedBy("modifiedBy");
		cancerDiagnosis.setReferredToInstituteName("institutionName");
		cancerDiagnosis.setRefrredToAdditionalServiceList(List.of("value"));
		final Institute institute = new Institute();
		institute.setInstitutionName("institutionName");
		cancerDiagnosis.setInstitute(institute);
		cancerDiagnosis.setVisitCode(0L);
		cancerDiagnosis.setRevisitDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		cancerDiagnosis.setReferralReason("referralReason");

		when(mockCancerDiagnosisRepo.save(any(CancerDiagnosis.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> csDoctorServiceImplUnderTest.saveCancerDiagnosisData(cancerDiagnosis))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testGetCancerDiagnosisObj() {
		// Setup
		final CancerDiagnosis cancerDiagnosis = new CancerDiagnosis();
		cancerDiagnosis.setID(0L);
		cancerDiagnosis.setBeneficiaryRegID(0L);
		cancerDiagnosis.setProvisionalDiagnosisPrimaryDoctor("provisionalDiagnosisPrimaryDoctor");
		cancerDiagnosis.setRemarks("remarks");
		cancerDiagnosis.setReferredToInstituteID(0);
		cancerDiagnosis.setRefrredToAdditionalService("refrredToAdditionalService");
		cancerDiagnosis.setModifiedBy("modifiedBy");
		cancerDiagnosis.setReferredToInstituteName("institutionName");
		cancerDiagnosis.setRefrredToAdditionalServiceList(List.of("value"));
		final Institute institute = new Institute();
		institute.setInstitutionName("institutionName");
		cancerDiagnosis.setInstitute(institute);
		cancerDiagnosis.setVisitCode(0L);
		cancerDiagnosis.setRevisitDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		cancerDiagnosis.setReferralReason("referralReason");

		// Run the test
		final CancerDiagnosis result = csDoctorServiceImplUnderTest.getCancerDiagnosisObj(cancerDiagnosis);

		// Verify the results
	}

	@Test
	void testGetBenDoctorEnteredDataForCaseSheet() {
		// Setup
		// Configure CancerDiagnosisRepo.getBenCancerDiagnosisDetails(...).
		final CancerDiagnosis cancerDiagnosis = new CancerDiagnosis();
		cancerDiagnosis.setID(0L);
		cancerDiagnosis.setBeneficiaryRegID(0L);
		cancerDiagnosis.setProvisionalDiagnosisPrimaryDoctor("provisionalDiagnosisPrimaryDoctor");
		cancerDiagnosis.setRemarks("remarks");
		cancerDiagnosis.setReferredToInstituteID(0);
		cancerDiagnosis.setRefrredToAdditionalService("refrredToAdditionalService");
		cancerDiagnosis.setModifiedBy("modifiedBy");
		cancerDiagnosis.setReferredToInstituteName("institutionName");
		cancerDiagnosis.setRefrredToAdditionalServiceList(List.of("value"));
		final Institute institute = new Institute();
		institute.setInstitutionName("institutionName");
		cancerDiagnosis.setInstitute(institute);
		cancerDiagnosis.setVisitCode(0L);
		cancerDiagnosis.setRevisitDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		cancerDiagnosis.setReferralReason("referralReason");
		when(mockCancerDiagnosisRepo.getBenCancerDiagnosisDetails(0L, 0L)).thenReturn(cancerDiagnosis);

		// Run the test
		final Map<String, Object> result = csDoctorServiceImplUnderTest.getBenDoctorEnteredDataForCaseSheet(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenDoctorEnteredDataForCaseSheet_CancerDiagnosisRepoReturnsNull() {
		// Setup
		when(mockCancerDiagnosisRepo.getBenCancerDiagnosisDetails(0L, 0L)).thenReturn(null);

		// Run the test
		final Map<String, Object> result = csDoctorServiceImplUnderTest.getBenDoctorEnteredDataForCaseSheet(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenCancerDiagnosisData() {
		// Setup
		// Configure CancerDiagnosisRepo.getBenCancerDiagnosisDetails(...).
		final CancerDiagnosis cancerDiagnosis = new CancerDiagnosis();
		cancerDiagnosis.setID(0L);
		cancerDiagnosis.setBeneficiaryRegID(0L);
		cancerDiagnosis.setProvisionalDiagnosisPrimaryDoctor("provisionalDiagnosisPrimaryDoctor");
		cancerDiagnosis.setRemarks("remarks");
		cancerDiagnosis.setReferredToInstituteID(0);
		cancerDiagnosis.setRefrredToAdditionalService("refrredToAdditionalService");
		cancerDiagnosis.setModifiedBy("modifiedBy");
		cancerDiagnosis.setReferredToInstituteName("institutionName");
		cancerDiagnosis.setRefrredToAdditionalServiceList(List.of("value"));
		final Institute institute = new Institute();
		institute.setInstitutionName("institutionName");
		cancerDiagnosis.setInstitute(institute);
		cancerDiagnosis.setVisitCode(0L);
		cancerDiagnosis.setRevisitDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		cancerDiagnosis.setReferralReason("referralReason");
		when(mockCancerDiagnosisRepo.getBenCancerDiagnosisDetails(0L, 0L)).thenReturn(cancerDiagnosis);

		// Run the test
		final CancerDiagnosis result = csDoctorServiceImplUnderTest.getBenCancerDiagnosisData(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenCancerDiagnosisData_CancerDiagnosisRepoReturnsNull() {
		// Setup
		when(mockCancerDiagnosisRepo.getBenCancerDiagnosisDetails(0L, 0L)).thenReturn(null);

		// Run the test
		final CancerDiagnosis result = csDoctorServiceImplUnderTest.getBenCancerDiagnosisData(0L, 0L);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testUpdateCancerDiagnosisDetailsByDoctor_CancerDiagnosisRepoGetCancerDiagnosisStatusesReturnsNull() {
		// Setup
		final CancerDiagnosis cancerDiagnosis = new CancerDiagnosis();
		cancerDiagnosis.setID(0L);
		cancerDiagnosis.setBeneficiaryRegID(0L);
		cancerDiagnosis.setProvisionalDiagnosisPrimaryDoctor("provisionalDiagnosisPrimaryDoctor");
		cancerDiagnosis.setRemarks("remarks");
		cancerDiagnosis.setReferredToInstituteID(0);
		cancerDiagnosis.setRefrredToAdditionalService("refrredToAdditionalService");
		cancerDiagnosis.setModifiedBy("modifiedBy");
		cancerDiagnosis.setReferredToInstituteName("institutionName");
		cancerDiagnosis.setRefrredToAdditionalServiceList(List.of("value"));
		final Institute institute = new Institute();
		institute.setInstitutionName("institutionName");
		cancerDiagnosis.setInstitute(institute);
		cancerDiagnosis.setVisitCode(0L);
		cancerDiagnosis.setRevisitDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		cancerDiagnosis.setReferralReason("referralReason");

		when(mockCancerDiagnosisRepo.getCancerDiagnosisStatuses(0L, 0L)).thenReturn(null);

		// Configure CancerDiagnosisRepo.save(...).
		final CancerDiagnosis cancerDiagnosis1 = new CancerDiagnosis();
		cancerDiagnosis1.setID(0L);
		cancerDiagnosis1.setBeneficiaryRegID(0L);
		cancerDiagnosis1.setProvisionalDiagnosisPrimaryDoctor("provisionalDiagnosisPrimaryDoctor");
		cancerDiagnosis1.setRemarks("remarks");
		cancerDiagnosis1.setReferredToInstituteID(0);
		cancerDiagnosis1.setRefrredToAdditionalService("refrredToAdditionalService");
		cancerDiagnosis1.setModifiedBy("modifiedBy");
		cancerDiagnosis1.setReferredToInstituteName("institutionName");
		cancerDiagnosis1.setRefrredToAdditionalServiceList(List.of("value"));
		final Institute institute1 = new Institute();
		institute1.setInstitutionName("institutionName");
		cancerDiagnosis1.setInstitute(institute1);
		cancerDiagnosis1.setVisitCode(0L);
		cancerDiagnosis1.setRevisitDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		cancerDiagnosis1.setReferralReason("referralReason");
		when(mockCancerDiagnosisRepo.save(any(CancerDiagnosis.class))).thenReturn(cancerDiagnosis1);

		// Run the test
		final int result = csDoctorServiceImplUnderTest.updateCancerDiagnosisDetailsByDoctor(cancerDiagnosis);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerDiagnosisDetailsByDoctor_CancerDiagnosisRepoSaveReturnsNull() {
		// Setup
		final CancerDiagnosis cancerDiagnosis = new CancerDiagnosis();
		cancerDiagnosis.setID(0L);
		cancerDiagnosis.setBeneficiaryRegID(0L);
		cancerDiagnosis.setProvisionalDiagnosisPrimaryDoctor("provisionalDiagnosisPrimaryDoctor");
		cancerDiagnosis.setRemarks("remarks");
		cancerDiagnosis.setReferredToInstituteID(0);
		cancerDiagnosis.setRefrredToAdditionalService("refrredToAdditionalService");
		cancerDiagnosis.setModifiedBy("modifiedBy");
		cancerDiagnosis.setReferredToInstituteName("institutionName");
		cancerDiagnosis.setRefrredToAdditionalServiceList(List.of("value"));
		final Institute institute = new Institute();
		institute.setInstitutionName("institutionName");
		cancerDiagnosis.setInstitute(institute);
		cancerDiagnosis.setVisitCode(0L);
		cancerDiagnosis.setRevisitDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		cancerDiagnosis.setReferralReason("referralReason");

		when(mockCancerDiagnosisRepo.getCancerDiagnosisStatuses(0L, 0L)).thenReturn("result");

		// Run the test
		final int result = csDoctorServiceImplUnderTest.updateCancerDiagnosisDetailsByDoctor(cancerDiagnosis);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

}
