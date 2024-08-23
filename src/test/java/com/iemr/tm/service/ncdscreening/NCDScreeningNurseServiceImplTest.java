package com.iemr.tm.service.ncdscreening;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.OptimisticLockingFailureException;

import com.iemr.tm.data.ncdScreening.NCDScreening;
import com.iemr.tm.repo.nurse.ncdscreening.NCDScreeningRepo;

@ExtendWith(MockitoExtension.class)
class NCDScreeningNurseServiceImplTest {

	@Mock
	private NCDScreeningRepo mockNcdScreeningRepo;

	private NCDScreeningNurseServiceImpl ncdScreeningNurseServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		ncdScreeningNurseServiceImplUnderTest = new NCDScreeningNurseServiceImpl();
		ncdScreeningNurseServiceImplUnderTest.setNcdScreeningRepo(mockNcdScreeningRepo);
	}

	@Test
	void testSaveNCDScreeningDetails() {
		// Setup
		final NCDScreening ncdScreening = new NCDScreening();
		ncdScreening.setID(0L);
		ncdScreening.setBeneficiaryRegID(0L);
		ncdScreening.setVisitCode(0L);
		ncdScreening.setNcdScreeningConditionID("ncdScreeningConditionID");
		ncdScreening.setScreeningCondition("screeningCondition");
		ncdScreening.setNcdScreeningReasonID(0);
		ncdScreening.setReasonForScreening("reasonForScreening");
		ncdScreening.setNextScreeningDateDB(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		ncdScreening.setNextScreeningDate("nextScreeningDate");
		ncdScreening.setActionForScreenPositive("actionForScreenPositive");
		ncdScreening.setIsScreeningComplete(false);
		ncdScreening.setIsBPPrescribed(false);
		ncdScreening.setIsBloodGlucosePrescribed(false);
		ncdScreening.setModifiedBy("modifiedBy");
		ncdScreening.setNcdScreeningConditionList(new ArrayList<>(List.of(Map.ofEntries(Map.entry("value", "value")))));

		// Configure NCDScreeningRepo.save(...).
		final NCDScreening ncdScreening1 = new NCDScreening();
		ncdScreening1.setID(0L);
		ncdScreening1.setBeneficiaryRegID(0L);
		ncdScreening1.setVisitCode(0L);
		ncdScreening1.setNcdScreeningConditionID("ncdScreeningConditionID");
		ncdScreening1.setScreeningCondition("screeningCondition");
		ncdScreening1.setNcdScreeningReasonID(0);
		ncdScreening1.setReasonForScreening("reasonForScreening");
		ncdScreening1.setNextScreeningDateDB(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		ncdScreening1.setNextScreeningDate("nextScreeningDate");
		ncdScreening1.setActionForScreenPositive("actionForScreenPositive");
		ncdScreening1.setIsScreeningComplete(false);
		ncdScreening1.setIsBPPrescribed(false);
		ncdScreening1.setIsBloodGlucosePrescribed(false);
		ncdScreening1.setModifiedBy("modifiedBy");
		ncdScreening1
				.setNcdScreeningConditionList(new ArrayList<>(List.of(Map.ofEntries(Map.entry("value", "value")))));
		when(mockNcdScreeningRepo.save(any(NCDScreening.class))).thenReturn(ncdScreening1);

		// Run the test
		final Long result = ncdScreeningNurseServiceImplUnderTest.saveNCDScreeningDetails(ncdScreening);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSaveNCDScreeningDetails_NCDScreeningRepoReturnsNull() {
		// Setup
		final NCDScreening ncdScreening = new NCDScreening();
		ncdScreening.setID(0L);
		ncdScreening.setBeneficiaryRegID(0L);
		ncdScreening.setVisitCode(0L);
		ncdScreening.setNcdScreeningConditionID("ncdScreeningConditionID");
		ncdScreening.setScreeningCondition("screeningCondition");
		ncdScreening.setNcdScreeningReasonID(0);
		ncdScreening.setReasonForScreening("reasonForScreening");
		ncdScreening.setNextScreeningDateDB(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		ncdScreening.setNextScreeningDate("nextScreeningDate");
		ncdScreening.setActionForScreenPositive("actionForScreenPositive");
		ncdScreening.setIsScreeningComplete(false);
		ncdScreening.setIsBPPrescribed(false);
		ncdScreening.setIsBloodGlucosePrescribed(false);
		ncdScreening.setModifiedBy("modifiedBy");
		ncdScreening.setNcdScreeningConditionList(new ArrayList<>(List.of(Map.ofEntries(Map.entry("value", "value")))));

		when(mockNcdScreeningRepo.save(any(NCDScreening.class))).thenReturn(null);

		// Run the test
		final Long result = ncdScreeningNurseServiceImplUnderTest.saveNCDScreeningDetails(ncdScreening);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveNCDScreeningDetails_NCDScreeningRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final NCDScreening ncdScreening = new NCDScreening();
		ncdScreening.setID(0L);
		ncdScreening.setBeneficiaryRegID(0L);
		ncdScreening.setVisitCode(0L);
		ncdScreening.setNcdScreeningConditionID("ncdScreeningConditionID");
		ncdScreening.setScreeningCondition("screeningCondition");
		ncdScreening.setNcdScreeningReasonID(0);
		ncdScreening.setReasonForScreening("reasonForScreening");
		ncdScreening.setNextScreeningDateDB(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		ncdScreening.setNextScreeningDate("nextScreeningDate");
		ncdScreening.setActionForScreenPositive("actionForScreenPositive");
		ncdScreening.setIsScreeningComplete(false);
		ncdScreening.setIsBPPrescribed(false);
		ncdScreening.setIsBloodGlucosePrescribed(false);
		ncdScreening.setModifiedBy("modifiedBy");
		ncdScreening.setNcdScreeningConditionList(new ArrayList<>(List.of(Map.ofEntries(Map.entry("value", "value")))));

		when(mockNcdScreeningRepo.save(any(NCDScreening.class))).thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> ncdScreeningNurseServiceImplUnderTest.saveNCDScreeningDetails(ncdScreening))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testGetNCDScreeningDetails() {
		// Setup
		// Configure NCDScreeningRepo.getNCDScreeningDetails(...).
		final NCDScreening ncdScreening = new NCDScreening();
		ncdScreening.setID(0L);
		ncdScreening.setBeneficiaryRegID(0L);
		ncdScreening.setVisitCode(0L);
		ncdScreening.setNcdScreeningConditionID("ncdScreeningConditionID");
		ncdScreening.setScreeningCondition("screeningCondition");
		ncdScreening.setNcdScreeningReasonID(0);
		ncdScreening.setReasonForScreening("reasonForScreening");
		ncdScreening.setNextScreeningDateDB(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		ncdScreening.setNextScreeningDate("nextScreeningDate");
		ncdScreening.setActionForScreenPositive("actionForScreenPositive");
		ncdScreening.setIsScreeningComplete(false);
		ncdScreening.setIsBPPrescribed(false);
		ncdScreening.setIsBloodGlucosePrescribed(false);
		ncdScreening.setModifiedBy("modifiedBy");
		ncdScreening.setNcdScreeningConditionList(new ArrayList<>(List.of(Map.ofEntries(Map.entry("value", "value")))));
		when(mockNcdScreeningRepo.getNCDScreeningDetails(0L, 0L)).thenReturn(ncdScreening);

		// Run the test
		final String result = ncdScreeningNurseServiceImplUnderTest.getNCDScreeningDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetNCDScreeningDetails_NCDScreeningRepoReturnsNull() {
		// Setup
		when(mockNcdScreeningRepo.getNCDScreeningDetails(0L, 0L)).thenReturn(null);

		// Run the test
		final String result = ncdScreeningNurseServiceImplUnderTest.getNCDScreeningDetails(0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo("null");
	}

}
