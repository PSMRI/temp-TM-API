package com.iemr.tm.service.cancerScreening;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.OptimisticLockingFailureException;

import com.iemr.tm.data.doctor.CancerAbdominalExamination;
import com.iemr.tm.data.doctor.CancerBreastExamination;
import com.iemr.tm.data.doctor.CancerExaminationImageAnnotation;
import com.iemr.tm.data.doctor.CancerGynecologicalExamination;
import com.iemr.tm.data.doctor.CancerLymphNodeDetails;
import com.iemr.tm.data.doctor.CancerOralExamination;
import com.iemr.tm.data.doctor.CancerSignAndSymptoms;
import com.iemr.tm.data.doctor.WrapperCancerExamImgAnotasn;
import com.iemr.tm.data.doctor.WrapperCancerSymptoms;
import com.iemr.tm.data.nurse.BenCancerVitalDetail;
import com.iemr.tm.data.nurse.BenFamilyCancerHistory;
import com.iemr.tm.data.nurse.BenObstetricCancerHistory;
import com.iemr.tm.data.nurse.BenPersonalCancerDietHistory;
import com.iemr.tm.data.nurse.BenPersonalCancerHistory;
import com.iemr.tm.data.nurse.BeneficiaryVisitDetail;
import com.iemr.tm.repo.doctor.CancerAbdominalExaminationRepo;
import com.iemr.tm.repo.doctor.CancerBreastExaminationRepo;
import com.iemr.tm.repo.doctor.CancerExaminationImageAnnotationRepo;
import com.iemr.tm.repo.doctor.CancerGynecologicalExaminationRepo;
import com.iemr.tm.repo.doctor.CancerLymphNodeExaminationRepo;
import com.iemr.tm.repo.doctor.CancerOralExaminationRepo;
import com.iemr.tm.repo.doctor.CancerSignAndSymptomsRepo;
import com.iemr.tm.repo.nurse.BenCancerVitalDetailRepo;
import com.iemr.tm.repo.nurse.BenFamilyCancerHistoryRepo;
import com.iemr.tm.repo.nurse.BenObstetricCancerHistoryRepo;
import com.iemr.tm.repo.nurse.BenPersonalCancerDietHistoryRepo;
import com.iemr.tm.repo.nurse.BenPersonalCancerHistoryRepo;
import com.iemr.tm.repo.nurse.BenVisitDetailRepo;

@ExtendWith(MockitoExtension.class)
class CSNurseServiceImplTest {

	@Mock
	private BenFamilyCancerHistoryRepo mockBenFamilyCancerHistoryRepo;
	@Mock
	private BenPersonalCancerHistoryRepo mockBenPersonalCancerHistoryRepo;
	@Mock
	private BenPersonalCancerDietHistoryRepo mockBenPersonalCancerDietHistoryRepo;
	@Mock
	private BenObstetricCancerHistoryRepo mockBenObstetricCancerHistoryRepo;
	@Mock
	private BenCancerVitalDetailRepo mockBenCancerVitalDetailRepo;
	@Mock
	private BenVisitDetailRepo mockBenVisitDetailRepo;
	@Mock
	private CancerAbdominalExaminationRepo mockCancerAbdominalExaminationRepo;
	@Mock
	private CancerBreastExaminationRepo mockCancerBreastExaminationRepo;
	@Mock
	private CancerGynecologicalExaminationRepo mockCancerGynecologicalExaminationRepo;
	@Mock
	private CancerSignAndSymptomsRepo mockCancerSignAndSymptomsRepo;
	@Mock
	private CancerLymphNodeExaminationRepo mockCancerLymphNodeExaminationRepo;
	@Mock
	private CancerOralExaminationRepo mockCancerOralExaminationRepo;
	@Mock
	private CancerExaminationImageAnnotationRepo mockCancerExaminationImageAnnotationRepo;

	private CSNurseServiceImpl csNurseServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		csNurseServiceImplUnderTest = new CSNurseServiceImpl();
		csNurseServiceImplUnderTest.setBenFamilyCancerHistoryRepo(mockBenFamilyCancerHistoryRepo);
		csNurseServiceImplUnderTest.setBenPersonalCancerHistoryRepo(mockBenPersonalCancerHistoryRepo);
		csNurseServiceImplUnderTest.setBenPersonalCancerDietHistoryRepo(mockBenPersonalCancerDietHistoryRepo);
		csNurseServiceImplUnderTest.setBenObstetricCancerHistoryRepo(mockBenObstetricCancerHistoryRepo);
		csNurseServiceImplUnderTest.setBenCancerVitalDetailRepo(mockBenCancerVitalDetailRepo);
		csNurseServiceImplUnderTest.setBenVisitDetailRepo(mockBenVisitDetailRepo);
		csNurseServiceImplUnderTest.setCancerAbdominalExaminationRepo(mockCancerAbdominalExaminationRepo);
		csNurseServiceImplUnderTest.setCancerBreastExaminationRepo(mockCancerBreastExaminationRepo);
		csNurseServiceImplUnderTest.setCancerGynecologicalExaminationRepo(mockCancerGynecologicalExaminationRepo);
		csNurseServiceImplUnderTest.setCancerSignAndSymptomsRepo(mockCancerSignAndSymptomsRepo);
		csNurseServiceImplUnderTest.setCancerLymphNodeExaminationRepo(mockCancerLymphNodeExaminationRepo);
		csNurseServiceImplUnderTest.setCancerOralExaminationRepo(mockCancerOralExaminationRepo);
		csNurseServiceImplUnderTest.setCancerExaminationImageAnnotationRepo(mockCancerExaminationImageAnnotationRepo);
	}

	@Test
	void testSaveBenFamilyCancerHistory_BenFamilyCancerHistoryRepoReturnsNoItems() {
		// Setup
		final BenFamilyCancerHistory benFamilyCancerHistory = new BenFamilyCancerHistory();
		benFamilyCancerHistory.setBeneficiaryRegID(0L);
		benFamilyCancerHistory.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory.setFamilyMember("familyMember");
		benFamilyCancerHistory.setCreatedBy("createdBy");
		benFamilyCancerHistory.setModifiedBy("createdBy");
		benFamilyCancerHistory.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory.setVisitCode(0L);
		final List<BenFamilyCancerHistory> benFamilyCancerHistoryList = List.of(benFamilyCancerHistory);
		
		benFamilyCancerHistory.toString();

		// Configure BenFamilyCancerHistoryRepo.saveAll(...).
		final BenFamilyCancerHistory benFamilyCancerHistory1 = new BenFamilyCancerHistory();
		benFamilyCancerHistory1.setBeneficiaryRegID(0L);
		benFamilyCancerHistory1.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory1.setFamilyMember("familyMember");
		benFamilyCancerHistory1.setCreatedBy("createdBy");
		benFamilyCancerHistory1.setModifiedBy("createdBy");
		benFamilyCancerHistory1.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory1.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory1.setVisitCode(0L);
		final List<BenFamilyCancerHistory> entities = List.of(benFamilyCancerHistory1);

		// Run the test
		final int result = csNurseServiceImplUnderTest.saveBenFamilyCancerHistory(benFamilyCancerHistoryList);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testSaveBenPersonalCancerHistory() {
		// Setup
		final BenPersonalCancerHistory benPersonalCancerHistory = new BenPersonalCancerHistory();
		benPersonalCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory.setID(0L);
		benPersonalCancerHistory.setBeneficiaryRegID(0L);
		benPersonalCancerHistory.setProviderServiceMapID(0);
		benPersonalCancerHistory.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory.setStartAge_year(0);
		benPersonalCancerHistory.setEndAge_year(0);
		benPersonalCancerHistory.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory.setQuantityPerDay(1);
		benPersonalCancerHistory.setIsFilteredCigaerette(false);
		benPersonalCancerHistory.setIsCigaretteExposure(false);
		benPersonalCancerHistory.setIsBetelNutChewing(false);
		benPersonalCancerHistory.setDurationOfBetelQuid(0);
		benPersonalCancerHistory.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory.setSsAlcoholUsed(false);
		benPersonalCancerHistory.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory.setProcessed("processed");
		benPersonalCancerHistory.setCreatedBy("createdBy");
		benPersonalCancerHistory.setModifiedBy("createdBy");
		benPersonalCancerHistory.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory.setVisitCode(0L);
		
		benPersonalCancerHistory.toString();

		// Configure BenPersonalCancerHistoryRepo.save(...).
		final BenPersonalCancerHistory benPersonalCancerHistory1 = new BenPersonalCancerHistory();
		benPersonalCancerHistory1.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory1.setID(0L);
		benPersonalCancerHistory1.setBeneficiaryRegID(0L);
		benPersonalCancerHistory1.setProviderServiceMapID(0);
		benPersonalCancerHistory1.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory1.setStartAge_year(0);
		benPersonalCancerHistory1.setEndAge_year(0);
		benPersonalCancerHistory1.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory1.setQuantityPerDay(1);
		benPersonalCancerHistory1.setIsFilteredCigaerette(false);
		benPersonalCancerHistory1.setIsCigaretteExposure(false);
		benPersonalCancerHistory1.setIsBetelNutChewing(false);
		benPersonalCancerHistory1.setDurationOfBetelQuid(0);
		benPersonalCancerHistory1.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory1.setSsAlcoholUsed(false);
		benPersonalCancerHistory1.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory1.setProcessed("processed");
		benPersonalCancerHistory1.setCreatedBy("createdBy");
		benPersonalCancerHistory1.setModifiedBy("createdBy");
		benPersonalCancerHistory1.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory1.setVisitCode(0L);
		when(mockBenPersonalCancerHistoryRepo.save(any(BenPersonalCancerHistory.class)))
				.thenReturn(benPersonalCancerHistory1);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveBenPersonalCancerHistory(benPersonalCancerHistory);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSaveBenPersonalCancerHistory_BenPersonalCancerHistoryRepoReturnsNull() {
		// Setup
		final BenPersonalCancerHistory benPersonalCancerHistory = new BenPersonalCancerHistory();
		benPersonalCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory.setID(0L);
		benPersonalCancerHistory.setBeneficiaryRegID(0L);
		benPersonalCancerHistory.setProviderServiceMapID(0);
		benPersonalCancerHistory.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory.setStartAge_year(0);
		benPersonalCancerHistory.setEndAge_year(0);
		benPersonalCancerHistory.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory.setQuantityPerDay(1);
		benPersonalCancerHistory.setIsFilteredCigaerette(false);
		benPersonalCancerHistory.setIsCigaretteExposure(false);
		benPersonalCancerHistory.setIsBetelNutChewing(false);
		benPersonalCancerHistory.setDurationOfBetelQuid(0);
		benPersonalCancerHistory.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory.setSsAlcoholUsed(false);
		benPersonalCancerHistory.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory.setProcessed("processed");
		benPersonalCancerHistory.setCreatedBy("createdBy");
		benPersonalCancerHistory.setModifiedBy("createdBy");
		benPersonalCancerHistory.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory.setVisitCode(0L);

		when(mockBenPersonalCancerHistoryRepo.save(any(BenPersonalCancerHistory.class))).thenReturn(null);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveBenPersonalCancerHistory(benPersonalCancerHistory);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveBenPersonalCancerHistory_BenPersonalCancerHistoryRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final BenPersonalCancerHistory benPersonalCancerHistory = new BenPersonalCancerHistory();
		benPersonalCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory.setID(0L);
		benPersonalCancerHistory.setBeneficiaryRegID(0L);
		benPersonalCancerHistory.setProviderServiceMapID(0);
		benPersonalCancerHistory.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory.setStartAge_year(0);
		benPersonalCancerHistory.setEndAge_year(0);
		benPersonalCancerHistory.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory.setQuantityPerDay(1);
		benPersonalCancerHistory.setIsFilteredCigaerette(false);
		benPersonalCancerHistory.setIsCigaretteExposure(false);
		benPersonalCancerHistory.setIsBetelNutChewing(false);
		benPersonalCancerHistory.setDurationOfBetelQuid(0);
		benPersonalCancerHistory.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory.setSsAlcoholUsed(false);
		benPersonalCancerHistory.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory.setProcessed("processed");
		benPersonalCancerHistory.setCreatedBy("createdBy");
		benPersonalCancerHistory.setModifiedBy("createdBy");
		benPersonalCancerHistory.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory.setVisitCode(0L);

		when(mockBenPersonalCancerHistoryRepo.save(any(BenPersonalCancerHistory.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> csNurseServiceImplUnderTest.saveBenPersonalCancerHistory(benPersonalCancerHistory))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testGetBenPersonalHistoryOBJ() {
		// Setup
		final BenPersonalCancerHistory benPersonalCancerHistory = new BenPersonalCancerHistory();
		benPersonalCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory.setID(0L);
		benPersonalCancerHistory.setBeneficiaryRegID(0L);
		benPersonalCancerHistory.setProviderServiceMapID(0);
		benPersonalCancerHistory.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory.setStartAge_year(0);
		benPersonalCancerHistory.setEndAge_year(0);
		benPersonalCancerHistory.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory.setQuantityPerDay(1);
		benPersonalCancerHistory.setIsFilteredCigaerette(false);
		benPersonalCancerHistory.setIsCigaretteExposure(false);
		benPersonalCancerHistory.setIsBetelNutChewing(false);
		benPersonalCancerHistory.setDurationOfBetelQuid(0);
		benPersonalCancerHistory.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory.setSsAlcoholUsed(false);
		benPersonalCancerHistory.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory.setProcessed("processed");
		benPersonalCancerHistory.setCreatedBy("createdBy");
		benPersonalCancerHistory.setModifiedBy("createdBy");
		benPersonalCancerHistory.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory.setVisitCode(0L);

		// Run the test
		final BenPersonalCancerHistory result = csNurseServiceImplUnderTest
				.getBenPersonalHistoryOBJ(benPersonalCancerHistory);

		// Verify the results
	}

	@Test
	void testSaveBenPersonalCancerDietHistory() {
		// Setup
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory.setID(0L);
		benPersonalCancerDietHistory.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory.setProviderServiceMapID(0);
		benPersonalCancerDietHistory.setDietType("dietType");
		benPersonalCancerDietHistory.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory.setSsRadiationExposure(false);
		benPersonalCancerDietHistory.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory.setProcessed("processed");
		benPersonalCancerDietHistory.setCreatedBy("createdBy");
		benPersonalCancerDietHistory.setModifiedBy("createdBy");
		benPersonalCancerDietHistory.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory.setVisitCode(0L);

		// Configure BenPersonalCancerDietHistoryRepo.save(...).
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory1 = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory1.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory1.setID(0L);
		benPersonalCancerDietHistory1.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory1.setProviderServiceMapID(0);
		benPersonalCancerDietHistory1.setDietType("dietType");
		benPersonalCancerDietHistory1.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory1.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory1.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory1.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory1.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory1.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory1.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory1.setSsRadiationExposure(false);
		benPersonalCancerDietHistory1.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory1.setProcessed("processed");
		benPersonalCancerDietHistory1.setCreatedBy("createdBy");
		benPersonalCancerDietHistory1.setModifiedBy("createdBy");
		benPersonalCancerDietHistory1.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory1.setVisitCode(0L);
		when(mockBenPersonalCancerDietHistoryRepo.save(any(BenPersonalCancerDietHistory.class)))
				.thenReturn(benPersonalCancerDietHistory1);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveBenPersonalCancerDietHistory(benPersonalCancerDietHistory);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSaveBenPersonalCancerDietHistory_BenPersonalCancerDietHistoryRepoReturnsNull() {
		// Setup
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory.setID(0L);
		benPersonalCancerDietHistory.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory.setProviderServiceMapID(0);
		benPersonalCancerDietHistory.setDietType("dietType");
		benPersonalCancerDietHistory.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory.setSsRadiationExposure(false);
		benPersonalCancerDietHistory.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory.setProcessed("processed");
		benPersonalCancerDietHistory.setCreatedBy("createdBy");
		benPersonalCancerDietHistory.setModifiedBy("createdBy");
		benPersonalCancerDietHistory.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory.setVisitCode(0L);

		when(mockBenPersonalCancerDietHistoryRepo.save(any(BenPersonalCancerDietHistory.class))).thenReturn(null);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveBenPersonalCancerDietHistory(benPersonalCancerDietHistory);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveBenPersonalCancerDietHistory_BenPersonalCancerDietHistoryRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory.setID(0L);
		benPersonalCancerDietHistory.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory.setProviderServiceMapID(0);
		benPersonalCancerDietHistory.setDietType("dietType");
		benPersonalCancerDietHistory.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory.setSsRadiationExposure(false);
		benPersonalCancerDietHistory.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory.setProcessed("processed");
		benPersonalCancerDietHistory.setCreatedBy("createdBy");
		benPersonalCancerDietHistory.setModifiedBy("createdBy");
		benPersonalCancerDietHistory.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory.setVisitCode(0L);

		when(mockBenPersonalCancerDietHistoryRepo.save(any(BenPersonalCancerDietHistory.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(
				() -> csNurseServiceImplUnderTest.saveBenPersonalCancerDietHistory(benPersonalCancerDietHistory))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testGetBenPersonalCancerDietOBJ() {
		// Setup
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory.setID(0L);
		benPersonalCancerDietHistory.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory.setProviderServiceMapID(0);
		benPersonalCancerDietHistory.setDietType("dietType");
		benPersonalCancerDietHistory.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory.setSsRadiationExposure(false);
		benPersonalCancerDietHistory.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory.setProcessed("processed");
		benPersonalCancerDietHistory.setCreatedBy("createdBy");
		benPersonalCancerDietHistory.setModifiedBy("createdBy");
		benPersonalCancerDietHistory.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory.setVisitCode(0L);

		// Run the test
		final BenPersonalCancerDietHistory result = csNurseServiceImplUnderTest
				.getBenPersonalCancerDietOBJ(benPersonalCancerDietHistory);

		// Verify the results
	}

	@Test
	void testSaveBenObstetricCancerHistory() {
		// Setup
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);
		
		benObstetricCancerHistory.toString();

		// Configure BenObstetricCancerHistoryRepo.save(...).
		final BenObstetricCancerHistory benObstetricCancerHistory1 = new BenObstetricCancerHistory();
		benObstetricCancerHistory1.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory1.setID(0L);
		benObstetricCancerHistory1.setBeneficiaryRegID(0L);
		benObstetricCancerHistory1.setProviderServiceMapID(0);
		benObstetricCancerHistory1.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory1.setIsUrinePregTest(false);
		benObstetricCancerHistory1.setPregnant_No("pregnant_No");
		benObstetricCancerHistory1.setNoOfLivingChild(0);
		benObstetricCancerHistory1.setIsAbortion(false);
		benObstetricCancerHistory1.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory1.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory1.setMenarche_Age(0);
		benObstetricCancerHistory1.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory1.setMenstrualCycleLength(0);
		benObstetricCancerHistory1.setMenstrualFlowDuration(0);
		benObstetricCancerHistory1.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory1.setIsDysmenorrhea(false);
		benObstetricCancerHistory1.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory1.setMenopauseAge(0);
		benObstetricCancerHistory1.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory1.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory1.setProcessed("processed");
		benObstetricCancerHistory1.setCreatedBy("createdBy");
		benObstetricCancerHistory1.setModifiedBy("createdBy");
		benObstetricCancerHistory1.setVisitCode(0L);
		when(mockBenObstetricCancerHistoryRepo.save(any(BenObstetricCancerHistory.class)))
				.thenReturn(benObstetricCancerHistory1);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveBenObstetricCancerHistory(benObstetricCancerHistory);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSaveBenObstetricCancerHistory_BenObstetricCancerHistoryRepoReturnsNull() {
		// Setup
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);

		when(mockBenObstetricCancerHistoryRepo.save(any(BenObstetricCancerHistory.class))).thenReturn(null);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveBenObstetricCancerHistory(benObstetricCancerHistory);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveBenObstetricCancerHistory_BenObstetricCancerHistoryRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);

		when(mockBenObstetricCancerHistoryRepo.save(any(BenObstetricCancerHistory.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> csNurseServiceImplUnderTest.saveBenObstetricCancerHistory(benObstetricCancerHistory))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testSaveBenVitalDetail() {
		// Setup
		final BenCancerVitalDetail benCancerVitalDetail = new BenCancerVitalDetail();
		benCancerVitalDetail.setID(0L);
		benCancerVitalDetail.setBeneficiaryRegID(0L);
		benCancerVitalDetail.setProviderServiceMapID(0);
		benCancerVitalDetail.setWeight_Kg(0.0);
		benCancerVitalDetail.setHeight_cm(0.0);
		benCancerVitalDetail.setWaistCircumference_cm(0.0);
		benCancerVitalDetail.setBloodGlucose_Fasting((short) 0);
		benCancerVitalDetail.setBloodGlucose_Random((short) 0);
		benCancerVitalDetail.setBloodGlucose_2HrPostPrandial((short) 0);
		benCancerVitalDetail.setSystolicBP_1stReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_1stReading((short) 0);
		benCancerVitalDetail.setSystolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setSystolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setHbA1C((short) 0);
		benCancerVitalDetail.setHemoglobin(0.0);
		benCancerVitalDetail.setCreatedBy("createdBy");
		benCancerVitalDetail.setModifiedBy("createdBy");
		benCancerVitalDetail.setVisitCode(0L);
		benCancerVitalDetail.setRbsTestResult("rbsTestResult");
		benCancerVitalDetail.setRbsTestRemarks("rbsTestRemarks");
		benCancerVitalDetail.setsPO2("sPO2");
		
		benCancerVitalDetail.toString();

		// Configure BenCancerVitalDetailRepo.save(...).
		final BenCancerVitalDetail benCancerVitalDetail1 = new BenCancerVitalDetail();
		benCancerVitalDetail1.setID(0L);
		benCancerVitalDetail1.setBeneficiaryRegID(0L);
		benCancerVitalDetail1.setProviderServiceMapID(0);
		benCancerVitalDetail1.setWeight_Kg(0.0);
		benCancerVitalDetail1.setHeight_cm(0.0);
		benCancerVitalDetail1.setWaistCircumference_cm(0.0);
		benCancerVitalDetail1.setBloodGlucose_Fasting((short) 0);
		benCancerVitalDetail1.setBloodGlucose_Random((short) 0);
		benCancerVitalDetail1.setBloodGlucose_2HrPostPrandial((short) 0);
		benCancerVitalDetail1.setSystolicBP_1stReading((short) 0);
		benCancerVitalDetail1.setDiastolicBP_1stReading((short) 0);
		benCancerVitalDetail1.setSystolicBP_2ndReading((short) 0);
		benCancerVitalDetail1.setDiastolicBP_2ndReading((short) 0);
		benCancerVitalDetail1.setSystolicBP_3rdReading((short) 0);
		benCancerVitalDetail1.setDiastolicBP_3rdReading((short) 0);
		benCancerVitalDetail1.setHbA1C((short) 0);
		benCancerVitalDetail1.setHemoglobin(0.0);
		benCancerVitalDetail1.setCreatedBy("createdBy");
		benCancerVitalDetail1.setModifiedBy("createdBy");
		benCancerVitalDetail1.setVisitCode(0L);
		benCancerVitalDetail1.setRbsTestResult("rbsTestResult");
		benCancerVitalDetail1.setRbsTestRemarks("rbsTestRemarks");
		benCancerVitalDetail1.setsPO2("sPO2");
		when(mockBenCancerVitalDetailRepo.save(any(BenCancerVitalDetail.class))).thenReturn(benCancerVitalDetail1);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveBenVitalDetail(benCancerVitalDetail);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSaveBenVitalDetail_BenCancerVitalDetailRepoReturnsNull() {
		// Setup
		final BenCancerVitalDetail benCancerVitalDetail = new BenCancerVitalDetail();
		benCancerVitalDetail.setID(0L);
		benCancerVitalDetail.setBeneficiaryRegID(0L);
		benCancerVitalDetail.setProviderServiceMapID(0);
		benCancerVitalDetail.setWeight_Kg(0.0);
		benCancerVitalDetail.setHeight_cm(0.0);
		benCancerVitalDetail.setWaistCircumference_cm(0.0);
		benCancerVitalDetail.setBloodGlucose_Fasting((short) 0);
		benCancerVitalDetail.setBloodGlucose_Random((short) 0);
		benCancerVitalDetail.setBloodGlucose_2HrPostPrandial((short) 0);
		benCancerVitalDetail.setSystolicBP_1stReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_1stReading((short) 0);
		benCancerVitalDetail.setSystolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setSystolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setHbA1C((short) 0);
		benCancerVitalDetail.setHemoglobin(0.0);
		benCancerVitalDetail.setCreatedBy("createdBy");
		benCancerVitalDetail.setModifiedBy("createdBy");
		benCancerVitalDetail.setVisitCode(0L);
		benCancerVitalDetail.setRbsTestResult("rbsTestResult");
		benCancerVitalDetail.setRbsTestRemarks("rbsTestRemarks");
		benCancerVitalDetail.setsPO2("sPO2");

		when(mockBenCancerVitalDetailRepo.save(any(BenCancerVitalDetail.class))).thenReturn(null);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveBenVitalDetail(benCancerVitalDetail);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveBenVitalDetail_BenCancerVitalDetailRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final BenCancerVitalDetail benCancerVitalDetail = new BenCancerVitalDetail();
		benCancerVitalDetail.setID(0L);
		benCancerVitalDetail.setBeneficiaryRegID(0L);
		benCancerVitalDetail.setProviderServiceMapID(0);
		benCancerVitalDetail.setWeight_Kg(0.0);
		benCancerVitalDetail.setHeight_cm(0.0);
		benCancerVitalDetail.setWaistCircumference_cm(0.0);
		benCancerVitalDetail.setBloodGlucose_Fasting((short) 0);
		benCancerVitalDetail.setBloodGlucose_Random((short) 0);
		benCancerVitalDetail.setBloodGlucose_2HrPostPrandial((short) 0);
		benCancerVitalDetail.setSystolicBP_1stReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_1stReading((short) 0);
		benCancerVitalDetail.setSystolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setSystolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setHbA1C((short) 0);
		benCancerVitalDetail.setHemoglobin(0.0);
		benCancerVitalDetail.setCreatedBy("createdBy");
		benCancerVitalDetail.setModifiedBy("createdBy");
		benCancerVitalDetail.setVisitCode(0L);
		benCancerVitalDetail.setRbsTestResult("rbsTestResult");
		benCancerVitalDetail.setRbsTestRemarks("rbsTestRemarks");
		benCancerVitalDetail.setsPO2("sPO2");

		when(mockBenCancerVitalDetailRepo.save(any(BenCancerVitalDetail.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> csNurseServiceImplUnderTest.saveBenVitalDetail(benCancerVitalDetail))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testUpdateBeneficiaryFamilyCancerHistory() {
		// Setup
		final BenFamilyCancerHistory benFamilyCancerHistory = new BenFamilyCancerHistory();
		benFamilyCancerHistory.setBeneficiaryRegID(0L);
		benFamilyCancerHistory.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory.setFamilyMember("familyMember");
		benFamilyCancerHistory.setCreatedBy("createdBy");
		benFamilyCancerHistory.setModifiedBy("createdBy");
		benFamilyCancerHistory.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory.setVisitCode(0L);
		benFamilyCancerHistory.toString();
		
		final List<BenFamilyCancerHistory> benFamilyCancerHistoryList = List.of(benFamilyCancerHistory);

		when(mockBenFamilyCancerHistoryRepo.deleteExistingFamilyRecord(0L, "N")).thenReturn(0);

		// Configure BenFamilyCancerHistoryRepo.saveAll(...).
		final BenFamilyCancerHistory benFamilyCancerHistory1 = new BenFamilyCancerHistory();
		benFamilyCancerHistory1.setBeneficiaryRegID(0L);
		benFamilyCancerHistory1.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory1.setFamilyMember("familyMember");
		benFamilyCancerHistory1.setCreatedBy("createdBy");
		benFamilyCancerHistory1.setModifiedBy("createdBy");
		benFamilyCancerHistory1.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory1.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory1.setVisitCode(0L);
		final Iterable<BenFamilyCancerHistory> benFamilyCancerHistories = List.of(benFamilyCancerHistory1);
		final BenFamilyCancerHistory benFamilyCancerHistory2 = new BenFamilyCancerHistory();
		benFamilyCancerHistory2.setBeneficiaryRegID(0L);
		benFamilyCancerHistory2.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory2.setFamilyMember("familyMember");
		benFamilyCancerHistory2.setCreatedBy("createdBy");
		benFamilyCancerHistory2.setModifiedBy("createdBy");
		benFamilyCancerHistory2.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory2.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory2.setVisitCode(0L);
		final ArrayList<BenFamilyCancerHistory> entities = new ArrayList<>(List.of(benFamilyCancerHistory2));
		when(mockBenFamilyCancerHistoryRepo.saveAll(entities)).thenReturn(benFamilyCancerHistories);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBeneficiaryFamilyCancerHistory(benFamilyCancerHistoryList);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBeneficiaryFamilyCancerHistory_BenFamilyCancerHistoryRepoGetFamilyCancerHistoryStatusReturnsNull() {
		// Setup
		final BenFamilyCancerHistory benFamilyCancerHistory = new BenFamilyCancerHistory();
		benFamilyCancerHistory.setBeneficiaryRegID(0L);
		benFamilyCancerHistory.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory.setFamilyMember("familyMember");
		benFamilyCancerHistory.setCreatedBy("createdBy");
		benFamilyCancerHistory.setModifiedBy("createdBy");
		benFamilyCancerHistory.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory.setVisitCode(0L);
		final List<BenFamilyCancerHistory> benFamilyCancerHistoryList = List.of(benFamilyCancerHistory);
		when(mockBenFamilyCancerHistoryRepo.getFamilyCancerHistoryStatus(0L, 0L)).thenReturn(null);

		// Configure BenFamilyCancerHistoryRepo.saveAll(...).
		final BenFamilyCancerHistory benFamilyCancerHistory1 = new BenFamilyCancerHistory();
		benFamilyCancerHistory1.setBeneficiaryRegID(0L);
		benFamilyCancerHistory1.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory1.setFamilyMember("familyMember");
		benFamilyCancerHistory1.setCreatedBy("createdBy");
		benFamilyCancerHistory1.setModifiedBy("createdBy");
		benFamilyCancerHistory1.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory1.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory1.setVisitCode(0L);
		final Iterable<BenFamilyCancerHistory> benFamilyCancerHistories = List.of(benFamilyCancerHistory1);
		final BenFamilyCancerHistory benFamilyCancerHistory2 = new BenFamilyCancerHistory();
		benFamilyCancerHistory2.setBeneficiaryRegID(0L);
		benFamilyCancerHistory2.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory2.setFamilyMember("familyMember");
		benFamilyCancerHistory2.setCreatedBy("createdBy");
		benFamilyCancerHistory2.setModifiedBy("createdBy");
		benFamilyCancerHistory2.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory2.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory2.setVisitCode(0L);
		final ArrayList<BenFamilyCancerHistory> entities = new ArrayList<>(List.of(benFamilyCancerHistory2));
		when(mockBenFamilyCancerHistoryRepo.saveAll(entities)).thenReturn(benFamilyCancerHistories);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBeneficiaryFamilyCancerHistory(benFamilyCancerHistoryList);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBeneficiaryFamilyCancerHistory_BenFamilyCancerHistoryRepoGetFamilyCancerHistoryStatusReturnsNoItems() {
		// Setup
		final BenFamilyCancerHistory benFamilyCancerHistory = new BenFamilyCancerHistory();
		benFamilyCancerHistory.setBeneficiaryRegID(0L);
		benFamilyCancerHistory.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory.setFamilyMember("familyMember");
		benFamilyCancerHistory.setCreatedBy("createdBy");
		benFamilyCancerHistory.setModifiedBy("createdBy");
		benFamilyCancerHistory.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory.setVisitCode(0L);
		final List<BenFamilyCancerHistory> benFamilyCancerHistoryList = List.of(benFamilyCancerHistory);
		when(mockBenFamilyCancerHistoryRepo.getFamilyCancerHistoryStatus(0L, 0L)).thenReturn(new ArrayList<>());

		// Configure BenFamilyCancerHistoryRepo.saveAll(...).
		final BenFamilyCancerHistory benFamilyCancerHistory1 = new BenFamilyCancerHistory();
		benFamilyCancerHistory1.setBeneficiaryRegID(0L);
		benFamilyCancerHistory1.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory1.setFamilyMember("familyMember");
		benFamilyCancerHistory1.setCreatedBy("createdBy");
		benFamilyCancerHistory1.setModifiedBy("createdBy");
		benFamilyCancerHistory1.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory1.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory1.setVisitCode(0L);
		final Iterable<BenFamilyCancerHistory> benFamilyCancerHistories = List.of(benFamilyCancerHistory1);
		final BenFamilyCancerHistory benFamilyCancerHistory2 = new BenFamilyCancerHistory();
		benFamilyCancerHistory2.setBeneficiaryRegID(0L);
		benFamilyCancerHistory2.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory2.setFamilyMember("familyMember");
		benFamilyCancerHistory2.setCreatedBy("createdBy");
		benFamilyCancerHistory2.setModifiedBy("createdBy");
		benFamilyCancerHistory2.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory2.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory2.setVisitCode(0L);
		final ArrayList<BenFamilyCancerHistory> entities = new ArrayList<>(List.of(benFamilyCancerHistory2));
		when(mockBenFamilyCancerHistoryRepo.saveAll(entities)).thenReturn(benFamilyCancerHistories);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBeneficiaryFamilyCancerHistory(benFamilyCancerHistoryList);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBeneficiaryFamilyCancerHistory_BenFamilyCancerHistoryRepoSaveAllReturnsNoItems() {
		// Setup
		final BenFamilyCancerHistory benFamilyCancerHistory = new BenFamilyCancerHistory();
		benFamilyCancerHistory.setBeneficiaryRegID(0L);
		benFamilyCancerHistory.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory.setFamilyMember("familyMember");
		benFamilyCancerHistory.setCreatedBy("createdBy");
		benFamilyCancerHistory.setModifiedBy("createdBy");
		benFamilyCancerHistory.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory.setVisitCode(0L);
		final List<BenFamilyCancerHistory> benFamilyCancerHistoryList = List.of(benFamilyCancerHistory);

		// Configure BenFamilyCancerHistoryRepo.getFamilyCancerHistoryStatus(...).

		when(mockBenFamilyCancerHistoryRepo.deleteExistingFamilyRecord(0L, "N")).thenReturn(0);

		// Configure BenFamilyCancerHistoryRepo.saveAll(...).
		final BenFamilyCancerHistory benFamilyCancerHistory1 = new BenFamilyCancerHistory();
		benFamilyCancerHistory1.setBeneficiaryRegID(0L);
		benFamilyCancerHistory1.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory1.setFamilyMember("familyMember");
		benFamilyCancerHistory1.setCreatedBy("createdBy");
		benFamilyCancerHistory1.setModifiedBy("createdBy");
		benFamilyCancerHistory1.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory1.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory1.setVisitCode(0L);
		final ArrayList<BenFamilyCancerHistory> entities = new ArrayList<>(List.of(benFamilyCancerHistory1));
		when(mockBenFamilyCancerHistoryRepo.saveAll(entities)).thenReturn(Collections.emptyList());

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBeneficiaryFamilyCancerHistory(benFamilyCancerHistoryList);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBeneficiaryFamilyCancerHistory_BenFamilyCancerHistoryRepoSaveAllThrowsOptimisticLockingFailureException() {
		// Setup
		final BenFamilyCancerHistory benFamilyCancerHistory = new BenFamilyCancerHistory();
		benFamilyCancerHistory.setBeneficiaryRegID(0L);
		benFamilyCancerHistory.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory.setFamilyMember("familyMember");
		benFamilyCancerHistory.setCreatedBy("createdBy");
		benFamilyCancerHistory.setModifiedBy("createdBy");
		benFamilyCancerHistory.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory.setVisitCode(0L);
		final List<BenFamilyCancerHistory> benFamilyCancerHistoryList = List.of(benFamilyCancerHistory);

		// Configure BenFamilyCancerHistoryRepo.getFamilyCancerHistoryStatus(...).

		when(mockBenFamilyCancerHistoryRepo.deleteExistingFamilyRecord(0L, "N")).thenReturn(0);

		// Configure BenFamilyCancerHistoryRepo.saveAll(...).
		final BenFamilyCancerHistory benFamilyCancerHistory1 = new BenFamilyCancerHistory();
		benFamilyCancerHistory1.setBeneficiaryRegID(0L);
		benFamilyCancerHistory1.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory1.setFamilyMember("familyMember");
		benFamilyCancerHistory1.setCreatedBy("createdBy");
		benFamilyCancerHistory1.setModifiedBy("createdBy");
		benFamilyCancerHistory1.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory1.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory1.setVisitCode(0L);
		final ArrayList<BenFamilyCancerHistory> entities = new ArrayList<>(List.of(benFamilyCancerHistory1));
		when(mockBenFamilyCancerHistoryRepo.saveAll(entities)).thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBeneficiaryFamilyCancerHistory(benFamilyCancerHistoryList);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenObstetricCancerHistory() {
		// Setup
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);

		when(mockBenObstetricCancerHistoryRepo.getObstetricCancerHistoryStatus(0L, 0L)).thenReturn("result");
		when(mockBenObstetricCancerHistoryRepo.updateBenObstetricCancerHistory(0, "pregnancyStatus", false,
				"pregnant_No", 0, false, false, false, 0, false, 0, 0, "menstrualFlowType", false, false, 0, false,
				false, "createdBy", 0L, 0L, "processed")).thenReturn(0);

		// Configure BenObstetricCancerHistoryRepo.save(...).
		final BenObstetricCancerHistory benObstetricCancerHistory1 = new BenObstetricCancerHistory();
		benObstetricCancerHistory1.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory1.setID(0L);
		benObstetricCancerHistory1.setBeneficiaryRegID(0L);
		benObstetricCancerHistory1.setProviderServiceMapID(0);
		benObstetricCancerHistory1.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory1.setIsUrinePregTest(false);
		benObstetricCancerHistory1.setPregnant_No("pregnant_No");
		benObstetricCancerHistory1.setNoOfLivingChild(0);
		benObstetricCancerHistory1.setIsAbortion(false);
		benObstetricCancerHistory1.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory1.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory1.setMenarche_Age(0);
		benObstetricCancerHistory1.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory1.setMenstrualCycleLength(0);
		benObstetricCancerHistory1.setMenstrualFlowDuration(0);
		benObstetricCancerHistory1.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory1.setIsDysmenorrhea(false);
		benObstetricCancerHistory1.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory1.setMenopauseAge(0);
		benObstetricCancerHistory1.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory1.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory1.setProcessed("processed");
		benObstetricCancerHistory1.setCreatedBy("createdBy");
		benObstetricCancerHistory1.setModifiedBy("createdBy");
		benObstetricCancerHistory1.setVisitCode(0L);
		when(mockBenObstetricCancerHistoryRepo.save(any(BenObstetricCancerHistory.class)))
				.thenReturn(benObstetricCancerHistory1);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBenObstetricCancerHistory(benObstetricCancerHistory);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenObstetricCancerHistory_BenObstetricCancerHistoryRepoGetObstetricCancerHistoryStatusReturnsNull() {
		// Setup
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);

		// Configure BenObstetricCancerHistoryRepo.save(...).
		final BenObstetricCancerHistory benObstetricCancerHistory1 = new BenObstetricCancerHistory();
		benObstetricCancerHistory1.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory1.setID(0L);
		benObstetricCancerHistory1.setBeneficiaryRegID(0L);
		benObstetricCancerHistory1.setProviderServiceMapID(0);
		benObstetricCancerHistory1.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory1.setIsUrinePregTest(false);
		benObstetricCancerHistory1.setPregnant_No("pregnant_No");
		benObstetricCancerHistory1.setNoOfLivingChild(0);
		benObstetricCancerHistory1.setIsAbortion(false);
		benObstetricCancerHistory1.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory1.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory1.setMenarche_Age(0);
		benObstetricCancerHistory1.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory1.setMenstrualCycleLength(0);
		benObstetricCancerHistory1.setMenstrualFlowDuration(0);
		benObstetricCancerHistory1.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory1.setIsDysmenorrhea(false);
		benObstetricCancerHistory1.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory1.setMenopauseAge(0);
		benObstetricCancerHistory1.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory1.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory1.setProcessed("processed");
		benObstetricCancerHistory1.setCreatedBy("createdBy");
		benObstetricCancerHistory1.setModifiedBy("createdBy");
		benObstetricCancerHistory1.setVisitCode(0L);
		when(mockBenObstetricCancerHistoryRepo.save(any(BenObstetricCancerHistory.class)))
				.thenReturn(benObstetricCancerHistory1);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBenObstetricCancerHistory(benObstetricCancerHistory);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenObstetricCancerHistory_BenObstetricCancerHistoryRepoSaveReturnsNull() {
		// Setup
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);

		when(mockBenObstetricCancerHistoryRepo.getObstetricCancerHistoryStatus(0L, 0L)).thenReturn("result");

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBenObstetricCancerHistory(benObstetricCancerHistory);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenObstetricCancerHistory_BenObstetricCancerHistoryRepoSaveThrowsOptimisticLockingFailureException() {
		// Setup
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBenObstetricCancerHistory(benObstetricCancerHistory);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenObstetricHistory() {
		// Setup
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);

		when(mockBenObstetricCancerHistoryRepo.updateBenObstetricCancerHistory(0, "pregnancyStatus", false,
				"pregnant_No", 0, false, false, false, 0, false, 0, 0, "menstrualFlowType", false, false, 0, false,
				false, "createdBy", 0L, 0L, "processed")).thenReturn(0);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBenObstetricHistory(benObstetricCancerHistory);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenPersonalCancerHistory() {
		// Setup
		final BenPersonalCancerHistory benPersonalCancerHistory = new BenPersonalCancerHistory();
		benPersonalCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory.setID(0L);
		benPersonalCancerHistory.setBeneficiaryRegID(0L);
		benPersonalCancerHistory.setProviderServiceMapID(0);
		benPersonalCancerHistory.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory.setStartAge_year(0);
		benPersonalCancerHistory.setEndAge_year(0);
		benPersonalCancerHistory.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory.setQuantityPerDay(1);
		benPersonalCancerHistory.setIsFilteredCigaerette(false);
		benPersonalCancerHistory.setIsCigaretteExposure(false);
		benPersonalCancerHistory.setIsBetelNutChewing(false);
		benPersonalCancerHistory.setDurationOfBetelQuid(0);
		benPersonalCancerHistory.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory.setSsAlcoholUsed(false);
		benPersonalCancerHistory.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory.setProcessed("processed");
		benPersonalCancerHistory.setCreatedBy("createdBy");
		benPersonalCancerHistory.setModifiedBy("createdBy");
		benPersonalCancerHistory.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory.setVisitCode(0L);

		when(mockBenPersonalCancerHistoryRepo.getPersonalCancerHistoryStatus(0L, 0L)).thenReturn("result");
		when(mockBenPersonalCancerHistoryRepo.updateBenPersonalCancerHistory(0, "tobaccoUse", 0, 0,
				"typeOfTobaccoProduct", 1, false, false, false, 0, "alcoholUse", false, "frequencyOfAlcoholUsed",
				"createdBy", 0L, 0L, "processed")).thenReturn(0);

		// Configure BenPersonalCancerHistoryRepo.save(...).
		final BenPersonalCancerHistory benPersonalCancerHistory1 = new BenPersonalCancerHistory();
		benPersonalCancerHistory1.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory1.setID(0L);
		benPersonalCancerHistory1.setBeneficiaryRegID(0L);
		benPersonalCancerHistory1.setProviderServiceMapID(0);
		benPersonalCancerHistory1.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory1.setStartAge_year(0);
		benPersonalCancerHistory1.setEndAge_year(0);
		benPersonalCancerHistory1.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory1.setQuantityPerDay(1);
		benPersonalCancerHistory1.setIsFilteredCigaerette(false);
		benPersonalCancerHistory1.setIsCigaretteExposure(false);
		benPersonalCancerHistory1.setIsBetelNutChewing(false);
		benPersonalCancerHistory1.setDurationOfBetelQuid(0);
		benPersonalCancerHistory1.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory1.setSsAlcoholUsed(false);
		benPersonalCancerHistory1.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory1.setProcessed("processed");
		benPersonalCancerHistory1.setCreatedBy("createdBy");
		benPersonalCancerHistory1.setModifiedBy("createdBy");
		benPersonalCancerHistory1.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory1.setVisitCode(0L);
		when(mockBenPersonalCancerHistoryRepo.save(any(BenPersonalCancerHistory.class)))
				.thenReturn(benPersonalCancerHistory1);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBenPersonalCancerHistory(benPersonalCancerHistory);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenPersonalCancerHistory_BenPersonalCancerHistoryRepoGetPersonalCancerHistoryStatusReturnsNull() {
		// Setup
		final BenPersonalCancerHistory benPersonalCancerHistory = new BenPersonalCancerHistory();
		benPersonalCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory.setID(0L);
		benPersonalCancerHistory.setBeneficiaryRegID(0L);
		benPersonalCancerHistory.setProviderServiceMapID(0);
		benPersonalCancerHistory.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory.setStartAge_year(0);
		benPersonalCancerHistory.setEndAge_year(0);
		benPersonalCancerHistory.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory.setQuantityPerDay(1);
		benPersonalCancerHistory.setIsFilteredCigaerette(false);
		benPersonalCancerHistory.setIsCigaretteExposure(false);
		benPersonalCancerHistory.setIsBetelNutChewing(false);
		benPersonalCancerHistory.setDurationOfBetelQuid(0);
		benPersonalCancerHistory.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory.setSsAlcoholUsed(false);
		benPersonalCancerHistory.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory.setProcessed("processed");
		benPersonalCancerHistory.setCreatedBy("createdBy");
		benPersonalCancerHistory.setModifiedBy("createdBy");
		benPersonalCancerHistory.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory.setVisitCode(0L);

		// Configure BenPersonalCancerHistoryRepo.save(...).
		final BenPersonalCancerHistory benPersonalCancerHistory1 = new BenPersonalCancerHistory();
		benPersonalCancerHistory1.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory1.setID(0L);
		benPersonalCancerHistory1.setBeneficiaryRegID(0L);
		benPersonalCancerHistory1.setProviderServiceMapID(0);
		benPersonalCancerHistory1.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory1.setStartAge_year(0);
		benPersonalCancerHistory1.setEndAge_year(0);
		benPersonalCancerHistory1.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory1.setQuantityPerDay(1);
		benPersonalCancerHistory1.setIsFilteredCigaerette(false);
		benPersonalCancerHistory1.setIsCigaretteExposure(false);
		benPersonalCancerHistory1.setIsBetelNutChewing(false);
		benPersonalCancerHistory1.setDurationOfBetelQuid(0);
		benPersonalCancerHistory1.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory1.setSsAlcoholUsed(false);
		benPersonalCancerHistory1.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory1.setProcessed("processed");
		benPersonalCancerHistory1.setCreatedBy("createdBy");
		benPersonalCancerHistory1.setModifiedBy("createdBy");
		benPersonalCancerHistory1.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory1.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBenPersonalCancerHistory(benPersonalCancerHistory);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenPersonalCancerHistory_BenPersonalCancerHistoryRepoSaveReturnsNull() {
		// Setup
		final BenPersonalCancerHistory benPersonalCancerHistory = new BenPersonalCancerHistory();
		benPersonalCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory.setID(0L);
		benPersonalCancerHistory.setBeneficiaryRegID(0L);
		benPersonalCancerHistory.setProviderServiceMapID(0);
		benPersonalCancerHistory.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory.setStartAge_year(0);
		benPersonalCancerHistory.setEndAge_year(0);
		benPersonalCancerHistory.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory.setQuantityPerDay(1);
		benPersonalCancerHistory.setIsFilteredCigaerette(false);
		benPersonalCancerHistory.setIsCigaretteExposure(false);
		benPersonalCancerHistory.setIsBetelNutChewing(false);
		benPersonalCancerHistory.setDurationOfBetelQuid(0);
		benPersonalCancerHistory.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory.setSsAlcoholUsed(false);
		benPersonalCancerHistory.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory.setProcessed("processed");
		benPersonalCancerHistory.setCreatedBy("createdBy");
		benPersonalCancerHistory.setModifiedBy("createdBy");
		benPersonalCancerHistory.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory.setVisitCode(0L);

		when(mockBenPersonalCancerHistoryRepo.getPersonalCancerHistoryStatus(0L, 0L)).thenReturn("result");

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBenPersonalCancerHistory(benPersonalCancerHistory);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenPersonalCancerHistory_BenPersonalCancerHistoryRepoSaveThrowsOptimisticLockingFailureException() {
		// Setup
		final BenPersonalCancerHistory benPersonalCancerHistory = new BenPersonalCancerHistory();
		benPersonalCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory.setID(0L);
		benPersonalCancerHistory.setBeneficiaryRegID(0L);
		benPersonalCancerHistory.setProviderServiceMapID(0);
		benPersonalCancerHistory.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory.setStartAge_year(0);
		benPersonalCancerHistory.setEndAge_year(0);
		benPersonalCancerHistory.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory.setQuantityPerDay(1);
		benPersonalCancerHistory.setIsFilteredCigaerette(false);
		benPersonalCancerHistory.setIsCigaretteExposure(false);
		benPersonalCancerHistory.setIsBetelNutChewing(false);
		benPersonalCancerHistory.setDurationOfBetelQuid(0);
		benPersonalCancerHistory.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory.setSsAlcoholUsed(false);
		benPersonalCancerHistory.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory.setProcessed("processed");
		benPersonalCancerHistory.setCreatedBy("createdBy");
		benPersonalCancerHistory.setModifiedBy("createdBy");
		benPersonalCancerHistory.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBenPersonalCancerHistory(benPersonalCancerHistory);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenPersonalCancerDietHistory() {
		// Setup
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory.setID(0L);
		benPersonalCancerDietHistory.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory.setProviderServiceMapID(0);
		benPersonalCancerDietHistory.setDietType("dietType");
		benPersonalCancerDietHistory.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory.setSsRadiationExposure(false);
		benPersonalCancerDietHistory.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory.setProcessed("processed");
		benPersonalCancerDietHistory.setCreatedBy("createdBy");
		benPersonalCancerDietHistory.setModifiedBy("createdBy");
		benPersonalCancerDietHistory.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory.setVisitCode(0L);

		when(mockBenPersonalCancerDietHistoryRepo.getPersonalCancerDietHistoryStatus(0L, 0L)).thenReturn("result");
		when(mockBenPersonalCancerDietHistoryRepo.updateBenPersonalCancerDietHistory(0, "dietType", 0, 1, 0, 1, 0,
				"typeOfOilConsumed", "physicalActivityType", false, false, "createdBy", 0L, 0L, "processed"))
				.thenReturn(0);

		// Configure BenPersonalCancerDietHistoryRepo.save(...).
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory1 = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory1.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory1.setID(0L);
		benPersonalCancerDietHistory1.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory1.setProviderServiceMapID(0);
		benPersonalCancerDietHistory1.setDietType("dietType");
		benPersonalCancerDietHistory1.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory1.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory1.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory1.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory1.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory1.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory1.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory1.setSsRadiationExposure(false);
		benPersonalCancerDietHistory1.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory1.setProcessed("processed");
		benPersonalCancerDietHistory1.setCreatedBy("createdBy");
		benPersonalCancerDietHistory1.setModifiedBy("createdBy");
		benPersonalCancerDietHistory1.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory1.setVisitCode(0L);
		when(mockBenPersonalCancerDietHistoryRepo.save(any(BenPersonalCancerDietHistory.class)))
				.thenReturn(benPersonalCancerDietHistory1);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBenPersonalCancerDietHistory(benPersonalCancerDietHistory);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenPersonalCancerDietHistory_BenPersonalCancerDietHistoryRepoGetPersonalCancerDietHistoryStatusReturnsNull() {
		// Setup
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory.setID(0L);
		benPersonalCancerDietHistory.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory.setProviderServiceMapID(0);
		benPersonalCancerDietHistory.setDietType("dietType");
		benPersonalCancerDietHistory.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory.setSsRadiationExposure(false);
		benPersonalCancerDietHistory.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory.setProcessed("processed");
		benPersonalCancerDietHistory.setCreatedBy("createdBy");
		benPersonalCancerDietHistory.setModifiedBy("createdBy");
		benPersonalCancerDietHistory.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory.setVisitCode(0L);

		when(mockBenPersonalCancerDietHistoryRepo.getPersonalCancerDietHistoryStatus(0L, 0L)).thenReturn(null);

		// Configure BenPersonalCancerDietHistoryRepo.save(...).
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory1 = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory1.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory1.setID(0L);
		benPersonalCancerDietHistory1.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory1.setProviderServiceMapID(0);
		benPersonalCancerDietHistory1.setDietType("dietType");
		benPersonalCancerDietHistory1.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory1.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory1.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory1.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory1.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory1.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory1.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory1.setSsRadiationExposure(false);
		benPersonalCancerDietHistory1.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory1.setProcessed("processed");
		benPersonalCancerDietHistory1.setCreatedBy("createdBy");
		benPersonalCancerDietHistory1.setModifiedBy("createdBy");
		benPersonalCancerDietHistory1.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory1.setVisitCode(0L);
		when(mockBenPersonalCancerDietHistoryRepo.save(any(BenPersonalCancerDietHistory.class)))
				.thenReturn(benPersonalCancerDietHistory1);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBenPersonalCancerDietHistory(benPersonalCancerDietHistory);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenPersonalCancerDietHistory_BenPersonalCancerDietHistoryRepoSaveReturnsNull() {
		// Setup
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory.setID(0L);
		benPersonalCancerDietHistory.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory.setProviderServiceMapID(0);
		benPersonalCancerDietHistory.setDietType("dietType");
		benPersonalCancerDietHistory.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory.setSsRadiationExposure(false);
		benPersonalCancerDietHistory.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory.setProcessed("processed");
		benPersonalCancerDietHistory.setCreatedBy("createdBy");
		benPersonalCancerDietHistory.setModifiedBy("createdBy");
		benPersonalCancerDietHistory.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBenPersonalCancerDietHistory(benPersonalCancerDietHistory);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenPersonalCancerDietHistory_BenPersonalCancerDietHistoryRepoSaveThrowsOptimisticLockingFailureException() {
		// Setup
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory.setID(0L);
		benPersonalCancerDietHistory.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory.setProviderServiceMapID(0);
		benPersonalCancerDietHistory.setDietType("dietType");
		benPersonalCancerDietHistory.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory.setSsRadiationExposure(false);
		benPersonalCancerDietHistory.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory.setProcessed("processed");
		benPersonalCancerDietHistory.setCreatedBy("createdBy");
		benPersonalCancerDietHistory.setModifiedBy("createdBy");
		benPersonalCancerDietHistory.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory.setVisitCode(0L);

		when(mockBenPersonalCancerDietHistoryRepo.getPersonalCancerDietHistoryStatus(0L, 0L)).thenReturn("result");

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBenPersonalCancerDietHistory(benPersonalCancerDietHistory);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenVitalDetail() {
		// Setup
		final BenCancerVitalDetail benCancerVitalDetail = new BenCancerVitalDetail();
		benCancerVitalDetail.setID(0L);
		benCancerVitalDetail.setBeneficiaryRegID(0L);
		benCancerVitalDetail.setProviderServiceMapID(0);
		benCancerVitalDetail.setWeight_Kg(0.0);
		benCancerVitalDetail.setHeight_cm(0.0);
		benCancerVitalDetail.setWaistCircumference_cm(0.0);
		benCancerVitalDetail.setBloodGlucose_Fasting((short) 0);
		benCancerVitalDetail.setBloodGlucose_Random((short) 0);
		benCancerVitalDetail.setBloodGlucose_2HrPostPrandial((short) 0);
		benCancerVitalDetail.setSystolicBP_1stReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_1stReading((short) 0);
		benCancerVitalDetail.setSystolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setSystolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setHbA1C((short) 0);
		benCancerVitalDetail.setHemoglobin(0.0);
		benCancerVitalDetail.setCreatedBy("createdBy");
		benCancerVitalDetail.setModifiedBy("createdBy");
		benCancerVitalDetail.setVisitCode(0L);
		benCancerVitalDetail.setRbsTestResult("rbsTestResult");
		benCancerVitalDetail.setRbsTestRemarks("rbsTestRemarks");
		benCancerVitalDetail.setsPO2("sPO2");

		when(mockBenCancerVitalDetailRepo.getCancerVitalStatus(0L, 0L)).thenReturn("result");

		// Configure BenCancerVitalDetailRepo.save(...).
		final BenCancerVitalDetail benCancerVitalDetail1 = new BenCancerVitalDetail();
		benCancerVitalDetail1.setID(0L);
		benCancerVitalDetail1.setBeneficiaryRegID(0L);
		benCancerVitalDetail1.setProviderServiceMapID(0);
		benCancerVitalDetail1.setWeight_Kg(0.0);
		benCancerVitalDetail1.setHeight_cm(0.0);
		benCancerVitalDetail1.setWaistCircumference_cm(0.0);
		benCancerVitalDetail1.setBloodGlucose_Fasting((short) 0);
		benCancerVitalDetail1.setBloodGlucose_Random((short) 0);
		benCancerVitalDetail1.setBloodGlucose_2HrPostPrandial((short) 0);
		benCancerVitalDetail1.setSystolicBP_1stReading((short) 0);
		benCancerVitalDetail1.setDiastolicBP_1stReading((short) 0);
		benCancerVitalDetail1.setSystolicBP_2ndReading((short) 0);
		benCancerVitalDetail1.setDiastolicBP_2ndReading((short) 0);
		benCancerVitalDetail1.setSystolicBP_3rdReading((short) 0);
		benCancerVitalDetail1.setDiastolicBP_3rdReading((short) 0);
		benCancerVitalDetail1.setHbA1C((short) 0);
		benCancerVitalDetail1.setHemoglobin(0.0);
		benCancerVitalDetail1.setCreatedBy("createdBy");
		benCancerVitalDetail1.setModifiedBy("createdBy");
		benCancerVitalDetail1.setVisitCode(0L);
		benCancerVitalDetail1.setRbsTestResult("rbsTestResult");
		benCancerVitalDetail1.setRbsTestRemarks("rbsTestRemarks");
		benCancerVitalDetail1.setsPO2("sPO2");

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBenVitalDetail(benCancerVitalDetail);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenVitalDetail_BenCancerVitalDetailRepoSaveReturnsNull() {
		// Setup
		final BenCancerVitalDetail benCancerVitalDetail = new BenCancerVitalDetail();
		benCancerVitalDetail.setID(0L);
		benCancerVitalDetail.setBeneficiaryRegID(0L);
		benCancerVitalDetail.setProviderServiceMapID(0);
		benCancerVitalDetail.setWeight_Kg(0.0);
		benCancerVitalDetail.setHeight_cm(0.0);
		benCancerVitalDetail.setWaistCircumference_cm(0.0);
		benCancerVitalDetail.setBloodGlucose_Fasting((short) 0);
		benCancerVitalDetail.setBloodGlucose_Random((short) 0);
		benCancerVitalDetail.setBloodGlucose_2HrPostPrandial((short) 0);
		benCancerVitalDetail.setSystolicBP_1stReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_1stReading((short) 0);
		benCancerVitalDetail.setSystolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setSystolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setHbA1C((short) 0);
		benCancerVitalDetail.setHemoglobin(0.0);
		benCancerVitalDetail.setCreatedBy("createdBy");
		benCancerVitalDetail.setModifiedBy("createdBy");
		benCancerVitalDetail.setVisitCode(0L);
		benCancerVitalDetail.setRbsTestResult("rbsTestResult");
		benCancerVitalDetail.setRbsTestRemarks("rbsTestRemarks");
		benCancerVitalDetail.setsPO2("sPO2");

		when(mockBenCancerVitalDetailRepo.getCancerVitalStatus(0L, 0L)).thenReturn("result");

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateBenVitalDetail(benCancerVitalDetail);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testGetBenFamilyHisData() {
		// Setup
		// Configure BenFamilyCancerHistoryRepo.getBenFamilyHistory(...).
		final BenFamilyCancerHistory benFamilyCancerHistory = new BenFamilyCancerHistory();
		benFamilyCancerHistory.setBeneficiaryRegID(0L);
		benFamilyCancerHistory.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory.setFamilyMember("familyMember");
		benFamilyCancerHistory.setCreatedBy("createdBy");
		benFamilyCancerHistory.setModifiedBy("createdBy");
		benFamilyCancerHistory.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory.setVisitCode(0L);
		final List<BenFamilyCancerHistory> benFamilyCancerHistories = List.of(benFamilyCancerHistory);

		// Run the test
		final List<BenFamilyCancerHistory> result = csNurseServiceImplUnderTest.getBenFamilyHisData(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenFamilyHisData_BenFamilyCancerHistoryRepoReturnsNoItems() {
		// Setup
		when(mockBenFamilyCancerHistoryRepo.getBenFamilyHistory(0L, 0L)).thenReturn(Collections.emptyList());

		// Run the test
		final List<BenFamilyCancerHistory> result = csNurseServiceImplUnderTest.getBenFamilyHisData(0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo(Collections.emptyList());
	}

	@Test
	void testGetBenObstetricDetailsData() {
		// Setup
		// Configure BenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(...).
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);
		when(mockBenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(0L, 0L))
				.thenReturn(benObstetricCancerHistory);

		// Run the test
		final BenObstetricCancerHistory result = csNurseServiceImplUnderTest.getBenObstetricDetailsData(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenPersonalCancerHistoryData() {
		// Setup
		// Configure BenPersonalCancerHistoryRepo.getBenPersonalHistory(...).
		final BenPersonalCancerHistory benPersonalCancerHistory = new BenPersonalCancerHistory();
		benPersonalCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory.setID(0L);
		benPersonalCancerHistory.setBeneficiaryRegID(0L);
		benPersonalCancerHistory.setProviderServiceMapID(0);
		benPersonalCancerHistory.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory.setStartAge_year(0);
		benPersonalCancerHistory.setEndAge_year(0);
		benPersonalCancerHistory.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory.setQuantityPerDay(1);
		benPersonalCancerHistory.setIsFilteredCigaerette(false);
		benPersonalCancerHistory.setIsCigaretteExposure(false);
		benPersonalCancerHistory.setIsBetelNutChewing(false);
		benPersonalCancerHistory.setDurationOfBetelQuid(0);
		benPersonalCancerHistory.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory.setSsAlcoholUsed(false);
		benPersonalCancerHistory.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory.setProcessed("processed");
		benPersonalCancerHistory.setCreatedBy("createdBy");
		benPersonalCancerHistory.setModifiedBy("createdBy");
		benPersonalCancerHistory.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory.setVisitCode(0L);

		// Run the test
		final BenPersonalCancerHistory result = csNurseServiceImplUnderTest.getBenPersonalCancerHistoryData(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenPersonalCancerHistoryData_BenPersonalCancerHistoryRepoReturnsNull() {
		// Setup
		when(mockBenPersonalCancerHistoryRepo.getBenPersonalHistory(0L, 0L)).thenReturn(null);

		// Run the test
		final BenPersonalCancerHistory result = csNurseServiceImplUnderTest.getBenPersonalCancerHistoryData(0L, 0L);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testGetBenPersonalCancerDietHistoryData() {
		// Setup
		// Configure BenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(...).
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory.setID(0L);
		benPersonalCancerDietHistory.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory.setProviderServiceMapID(0);
		benPersonalCancerDietHistory.setDietType("dietType");
		benPersonalCancerDietHistory.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory.setSsRadiationExposure(false);
		benPersonalCancerDietHistory.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory.setProcessed("processed");
		benPersonalCancerDietHistory.setCreatedBy("createdBy");
		benPersonalCancerDietHistory.setModifiedBy("createdBy");
		benPersonalCancerDietHistory.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory.setVisitCode(0L);
		when(mockBenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(0L, 0L))
				.thenReturn(benPersonalCancerDietHistory);

		// Run the test
		final BenPersonalCancerDietHistory result = csNurseServiceImplUnderTest.getBenPersonalCancerDietHistoryData(0L,
				0L);

		// Verify the results
	}

	@Test
	void testGetBenPersonalCancerDietHistoryData_BenPersonalCancerDietHistoryRepoReturnsNull() {
		// Setup
		when(mockBenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(0L, 0L)).thenReturn(null);

		// Run the test
		final BenPersonalCancerDietHistory result = csNurseServiceImplUnderTest.getBenPersonalCancerDietHistoryData(0L,
				0L);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testGetBenCancerVitalDetailData() {
		// Setup
		// Configure BenCancerVitalDetailRepo.getBenCancerVitalDetail(...).
		final BenCancerVitalDetail benCancerVitalDetail = new BenCancerVitalDetail();
		benCancerVitalDetail.setID(0L);
		benCancerVitalDetail.setBeneficiaryRegID(0L);
		benCancerVitalDetail.setProviderServiceMapID(0);
		benCancerVitalDetail.setWeight_Kg(0.0);
		benCancerVitalDetail.setHeight_cm(0.0);
		benCancerVitalDetail.setWaistCircumference_cm(0.0);
		benCancerVitalDetail.setBloodGlucose_Fasting((short) 0);
		benCancerVitalDetail.setBloodGlucose_Random((short) 0);
		benCancerVitalDetail.setBloodGlucose_2HrPostPrandial((short) 0);
		benCancerVitalDetail.setSystolicBP_1stReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_1stReading((short) 0);
		benCancerVitalDetail.setSystolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setSystolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setHbA1C((short) 0);
		benCancerVitalDetail.setHemoglobin(0.0);
		benCancerVitalDetail.setCreatedBy("createdBy");
		benCancerVitalDetail.setModifiedBy("createdBy");
		benCancerVitalDetail.setVisitCode(0L);
		benCancerVitalDetail.setRbsTestResult("rbsTestResult");
		benCancerVitalDetail.setRbsTestRemarks("rbsTestRemarks");
		benCancerVitalDetail.setsPO2("sPO2");
		when(mockBenCancerVitalDetailRepo.getBenCancerVitalDetail(0L, 0L)).thenReturn(benCancerVitalDetail);

		// Run the test
		final BenCancerVitalDetail result = csNurseServiceImplUnderTest.getBenCancerVitalDetailData(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenCancerAbdominalExaminationData() {
		// Setup
		// Configure
		// CancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(...).
		final CancerAbdominalExamination cancerAbdominalExamination = new CancerAbdominalExamination();
		cancerAbdominalExamination.setID(0L);
		cancerAbdominalExamination.setBeneficiaryRegID(0L);
		cancerAbdominalExamination.setProviderServiceMapID(0);
		cancerAbdominalExamination.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination.setLiver("liver");
		cancerAbdominalExamination.setAscites_Present(false);
		cancerAbdominalExamination.setAnyOtherMass_Present(false);
		cancerAbdominalExamination.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination.setObservation("observation");
		cancerAbdominalExamination.setProcessed("processed");
		cancerAbdominalExamination.setCreatedBy("createdBy");
		cancerAbdominalExamination.setModifiedBy("createdBy");
		cancerAbdominalExamination.setVisitCode(0L);
		cancerAbdominalExamination.toString();
		
		when(mockCancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(0L, 0L))
				.thenReturn(cancerAbdominalExamination);

		// Run the test
		final CancerAbdominalExamination result = csNurseServiceImplUnderTest.getBenCancerAbdominalExaminationData(0L,
				0L);

		// Verify the results
	}

	@Test
	void testGetBenCancerBreastExaminationData() {
		// Setup
		// Configure
		// CancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(...).
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);
		cancerBreastExamination.toString();
		
		when(mockCancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(0L, 0L))
				.thenReturn(cancerBreastExamination);

		// Run the test
		final CancerBreastExamination result = csNurseServiceImplUnderTest.getBenCancerBreastExaminationData(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenCancerGynecologicalExaminationData() {
		// Setup
		// Configure
		// CancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(...).
		final CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
		cancerGynecologicalExamination.setID(0L);
		cancerGynecologicalExamination.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination.setProviderServiceMapID(0);
		cancerGynecologicalExamination.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination.setVulvalInvolvement(false);
		cancerGynecologicalExamination.setVaginalInvolvement(false);
		cancerGynecologicalExamination.setUterus_Normal(false);
		cancerGynecologicalExamination.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination.setFilePath("filePath");
		cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination.setObservation("observation");
		cancerGynecologicalExamination.setProcessed("processed");
		cancerGynecologicalExamination.setCreatedBy("createdBy");
		cancerGynecologicalExamination.setModifiedBy("createdBy");
		cancerGynecologicalExamination.setVisitCode(0L);
		cancerGynecologicalExamination.toString();
		when(mockCancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(0L, 0L))
				.thenReturn(cancerGynecologicalExamination);

		// Run the test
		final CancerGynecologicalExamination result = csNurseServiceImplUnderTest
				.getBenCancerGynecologicalExaminationData(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenCancerSignAndSymptomsData() {
		// Setup
		// Configure CancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(...).
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		cancerSignAndSymptoms.toString();
		when(mockCancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(0L, 0L))
				.thenReturn(cancerSignAndSymptoms);

		// Run the test
		final CancerSignAndSymptoms result = csNurseServiceImplUnderTest.getBenCancerSignAndSymptomsData(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenCancerLymphNodeDetailsData() {
		// Setup
		// Configure CancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(...).
		final CancerLymphNodeDetails cancerLymphNodeDetails1 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails1.setID(0L);
		cancerLymphNodeDetails1.setBenVisitID(0L);
		cancerLymphNodeDetails1.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails1.setMobility_Left(false);
		cancerLymphNodeDetails1.setSize_Left("size_Left");
		cancerLymphNodeDetails1.setMobility_Right(false);
		cancerLymphNodeDetails1.setSize_Right("size_Right");
		cancerLymphNodeDetails1.setVisitCode(0L);
		cancerLymphNodeDetails1.toString();
		
		final List<CancerLymphNodeDetails> cancerLymphNodeDetails = List.of(cancerLymphNodeDetails1);
		when(mockCancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(0L, 0L))
				.thenReturn(cancerLymphNodeDetails);

		// Run the test
		final List<CancerLymphNodeDetails> result = csNurseServiceImplUnderTest.getBenCancerLymphNodeDetailsData(0L,
				0L);

		// Verify the results
	}

	@Test
	void testGetBenCancerLymphNodeDetailsData_CancerLymphNodeExaminationRepoReturnsNoItems() {
		// Setup
		when(mockCancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(0L, 0L))
				.thenReturn(Collections.emptyList());

		// Run the test
		final List<CancerLymphNodeDetails> result = csNurseServiceImplUnderTest.getBenCancerLymphNodeDetailsData(0L,
				0L);

		// Verify the results
		assertThat(result).isEqualTo(Collections.emptyList());
	}

	@Test
	void testGetBenCancerOralExaminationData() {
		// Setup
		// Configure CancerOralExaminationRepo.getBenCancerOralExaminationDetails(...).
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);
		
		cancerOralExamination.toString();
		
		when(mockCancerOralExaminationRepo.getBenCancerOralExaminationDetails(0L, 0L))
				.thenReturn(cancerOralExamination);

		// Run the test
		final CancerOralExamination result = csNurseServiceImplUnderTest.getBenCancerOralExaminationData(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetCancerExaminationImageAnnotationCasesheet() {
		// Setup
		// Configure
		// CancerExaminationImageAnnotationRepo.getCancerExaminationImageAnnotationList(...).
		final CancerExaminationImageAnnotation cancerExaminationImageAnnotation = new CancerExaminationImageAnnotation();
		cancerExaminationImageAnnotation.setVanID(0);
		cancerExaminationImageAnnotation.setBeneficiaryRegID(0L);
		cancerExaminationImageAnnotation.setBenVisitID(0L);
		cancerExaminationImageAnnotation.setProviderServiceMapID(0);
		cancerExaminationImageAnnotation.setCancerImageID(0);
		cancerExaminationImageAnnotation.setxCoordinate(0);
		cancerExaminationImageAnnotation.setyCoordinate(0);
		cancerExaminationImageAnnotation.setPoint(0);
		cancerExaminationImageAnnotation.setPointDesc("pointDesc");
		cancerExaminationImageAnnotation.setCreatedBy("createdBy");
		cancerExaminationImageAnnotation.setModifiedBy("createdBy");
		cancerExaminationImageAnnotation.setParkingPlaceID(0);
		cancerExaminationImageAnnotation.setVisitCode(0L);
		cancerExaminationImageAnnotation.toString();
		
		final List<CancerExaminationImageAnnotation> cancerExaminationImageAnnotations = List
				.of(cancerExaminationImageAnnotation);
		when(mockCancerExaminationImageAnnotationRepo.getCancerExaminationImageAnnotationList(0L, 0L))
				.thenReturn(cancerExaminationImageAnnotations);

		// Run the test
		final ArrayList<WrapperCancerExamImgAnotasn> result = csNurseServiceImplUnderTest
				.getCancerExaminationImageAnnotationCasesheet(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetCancerExaminationImageAnnotationCasesheet_CancerExaminationImageAnnotationRepoReturnsNoItems() {
		// Setup
		when(mockCancerExaminationImageAnnotationRepo.getCancerExaminationImageAnnotationList(0L, 0L))
				.thenReturn(Collections.emptyList());

		// Run the test
		final ArrayList<WrapperCancerExamImgAnotasn> result = csNurseServiceImplUnderTest
				.getCancerExaminationImageAnnotationCasesheet(0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo(new ArrayList<>());
	}

	@Test
	void testGetBenNurseDataForCaseSheet() {

		// Configure BenFamilyCancerHistoryRepo.getBenFamilyHistory(...).
		final BenFamilyCancerHistory benFamilyCancerHistory = new BenFamilyCancerHistory();
		benFamilyCancerHistory.setBeneficiaryRegID(0L);
		benFamilyCancerHistory.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory.setFamilyMember("familyMember");
		benFamilyCancerHistory.setCreatedBy("createdBy");
		benFamilyCancerHistory.setModifiedBy("createdBy");
		benFamilyCancerHistory.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory.setVisitCode(0L);
		final List<BenFamilyCancerHistory> benFamilyCancerHistories = List.of(benFamilyCancerHistory);
		when(mockBenFamilyCancerHistoryRepo.getBenFamilyHistory(0L, 0L)).thenReturn(benFamilyCancerHistories);

		// Configure BenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(...).
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);
		when(mockBenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(0L, 0L))
				.thenReturn(benObstetricCancerHistory);

		// Configure BenPersonalCancerHistoryRepo.getBenPersonalHistory(...).
		final BenPersonalCancerHistory benPersonalCancerHistory = new BenPersonalCancerHistory();
		benPersonalCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory.setID(0L);
		benPersonalCancerHistory.setBeneficiaryRegID(0L);
		benPersonalCancerHistory.setProviderServiceMapID(0);
		benPersonalCancerHistory.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory.setStartAge_year(0);
		benPersonalCancerHistory.setEndAge_year(0);
		benPersonalCancerHistory.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory.setQuantityPerDay(1);
		benPersonalCancerHistory.setIsFilteredCigaerette(false);
		benPersonalCancerHistory.setIsCigaretteExposure(false);
		benPersonalCancerHistory.setIsBetelNutChewing(false);
		benPersonalCancerHistory.setDurationOfBetelQuid(0);
		benPersonalCancerHistory.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory.setSsAlcoholUsed(false);
		benPersonalCancerHistory.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory.setProcessed("processed");
		benPersonalCancerHistory.setCreatedBy("createdBy");
		benPersonalCancerHistory.setModifiedBy("createdBy");
		benPersonalCancerHistory.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory.setVisitCode(0L);
		when(mockBenPersonalCancerHistoryRepo.getBenPersonalHistory(0L, 0L)).thenReturn(benPersonalCancerHistory);

		// Configure BenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(...).
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory.setID(0L);
		benPersonalCancerDietHistory.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory.setProviderServiceMapID(0);
		benPersonalCancerDietHistory.setDietType("dietType");
		benPersonalCancerDietHistory.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory.setSsRadiationExposure(false);
		benPersonalCancerDietHistory.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory.setProcessed("processed");
		benPersonalCancerDietHistory.setCreatedBy("createdBy");
		benPersonalCancerDietHistory.setModifiedBy("createdBy");
		benPersonalCancerDietHistory.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory.setVisitCode(0L);
		when(mockBenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(0L, 0L))
				.thenReturn(benPersonalCancerDietHistory);

		// Configure BenCancerVitalDetailRepo.getBenCancerVitalDetail(...).
		final BenCancerVitalDetail benCancerVitalDetail = new BenCancerVitalDetail();
		benCancerVitalDetail.setID(0L);
		benCancerVitalDetail.setBeneficiaryRegID(0L);
		benCancerVitalDetail.setProviderServiceMapID(0);
		benCancerVitalDetail.setWeight_Kg(0.0);
		benCancerVitalDetail.setHeight_cm(0.0);
		benCancerVitalDetail.setWaistCircumference_cm(0.0);
		benCancerVitalDetail.setBloodGlucose_Fasting((short) 0);
		benCancerVitalDetail.setBloodGlucose_Random((short) 0);
		benCancerVitalDetail.setBloodGlucose_2HrPostPrandial((short) 0);
		benCancerVitalDetail.setSystolicBP_1stReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_1stReading((short) 0);
		benCancerVitalDetail.setSystolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setSystolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setHbA1C((short) 0);
		benCancerVitalDetail.setHemoglobin(0.0);
		benCancerVitalDetail.setCreatedBy("createdBy");
		benCancerVitalDetail.setModifiedBy("createdBy");
		benCancerVitalDetail.setVisitCode(0L);
		benCancerVitalDetail.setRbsTestResult("rbsTestResult");
		benCancerVitalDetail.setRbsTestRemarks("rbsTestRemarks");
		benCancerVitalDetail.setsPO2("sPO2");
		when(mockBenCancerVitalDetailRepo.getBenCancerVitalDetail(0L, 0L)).thenReturn(benCancerVitalDetail);

		// Configure
		// CancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(...).
		final CancerAbdominalExamination cancerAbdominalExamination = new CancerAbdominalExamination();
		cancerAbdominalExamination.setID(0L);
		cancerAbdominalExamination.setBeneficiaryRegID(0L);
		cancerAbdominalExamination.setProviderServiceMapID(0);
		cancerAbdominalExamination.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination.setLiver("liver");
		cancerAbdominalExamination.setAscites_Present(false);
		cancerAbdominalExamination.setAnyOtherMass_Present(false);
		cancerAbdominalExamination.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination.setObservation("observation");
		cancerAbdominalExamination.setProcessed("processed");
		cancerAbdominalExamination.setCreatedBy("createdBy");
		cancerAbdominalExamination.setModifiedBy("createdBy");
		cancerAbdominalExamination.setVisitCode(0L);
		when(mockCancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(0L, 0L))
				.thenReturn(cancerAbdominalExamination);

		// Configure
		// CancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(...).
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);
		when(mockCancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(0L, 0L))
				.thenReturn(cancerBreastExamination);

		// Configure
		// CancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(...).
		final CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
		cancerGynecologicalExamination.setID(0L);
		cancerGynecologicalExamination.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination.setProviderServiceMapID(0);
		cancerGynecologicalExamination.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination.setVulvalInvolvement(false);
		cancerGynecologicalExamination.setVaginalInvolvement(false);
		cancerGynecologicalExamination.setUterus_Normal(false);
		cancerGynecologicalExamination.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination.setFilePath("filePath");
		cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination.setObservation("observation");
		cancerGynecologicalExamination.setProcessed("processed");
		cancerGynecologicalExamination.setCreatedBy("createdBy");
		cancerGynecologicalExamination.setModifiedBy("createdBy");
		cancerGynecologicalExamination.setVisitCode(0L);
		when(mockCancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(0L, 0L))
				.thenReturn(cancerGynecologicalExamination);

		// Configure CancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(...).
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		when(mockCancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(0L, 0L))
				.thenReturn(cancerSignAndSymptoms);
		
		cancerSignAndSymptoms.toString();

		// Configure CancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(...).
		final CancerLymphNodeDetails cancerLymphNodeDetails1 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails1.setID(0L);
		cancerLymphNodeDetails1.setBenVisitID(0L);
		cancerLymphNodeDetails1.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails1.setMobility_Left(false);
		cancerLymphNodeDetails1.setSize_Left("size_Left");
		cancerLymphNodeDetails1.setMobility_Right(false);
		cancerLymphNodeDetails1.setSize_Right("size_Right");
		cancerLymphNodeDetails1.setVisitCode(0L);
		final List<CancerLymphNodeDetails> cancerLymphNodeDetails = List.of(cancerLymphNodeDetails1);
		when(mockCancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(0L, 0L))
				.thenReturn(cancerLymphNodeDetails);

		// Configure CancerOralExaminationRepo.getBenCancerOralExaminationDetails(...).
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);
		when(mockCancerOralExaminationRepo.getBenCancerOralExaminationDetails(0L, 0L))
				.thenReturn(cancerOralExamination);

		// Run the test
		final Map<String, Object> result = csNurseServiceImplUnderTest.getBenNurseDataForCaseSheet(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenNurseDataForCaseSheet_BenVisitDetailRepoReturnsNull() {
		// Setup
		when(mockBenVisitDetailRepo.getBeneficiaryVisitDetails(0L, 0L)).thenReturn(null);

		// Configure BenFamilyCancerHistoryRepo.getBenFamilyHistory(...).
		final BenFamilyCancerHistory benFamilyCancerHistory = new BenFamilyCancerHistory();
		benFamilyCancerHistory.setBeneficiaryRegID(0L);
		benFamilyCancerHistory.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory.setFamilyMember("familyMember");
		benFamilyCancerHistory.setCreatedBy("createdBy");
		benFamilyCancerHistory.setModifiedBy("createdBy");
		benFamilyCancerHistory.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory.setVisitCode(0L);
		final List<BenFamilyCancerHistory> benFamilyCancerHistories = List.of(benFamilyCancerHistory);
		when(mockBenFamilyCancerHistoryRepo.getBenFamilyHistory(0L, 0L)).thenReturn(benFamilyCancerHistories);

		// Configure BenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(...).
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);
		when(mockBenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(0L, 0L))
				.thenReturn(benObstetricCancerHistory);

		// Configure BenPersonalCancerHistoryRepo.getBenPersonalHistory(...).
		final BenPersonalCancerHistory benPersonalCancerHistory = new BenPersonalCancerHistory();
		benPersonalCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory.setID(0L);
		benPersonalCancerHistory.setBeneficiaryRegID(0L);
		benPersonalCancerHistory.setProviderServiceMapID(0);
		benPersonalCancerHistory.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory.setStartAge_year(0);
		benPersonalCancerHistory.setEndAge_year(0);
		benPersonalCancerHistory.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory.setQuantityPerDay(1);
		benPersonalCancerHistory.setIsFilteredCigaerette(false);
		benPersonalCancerHistory.setIsCigaretteExposure(false);
		benPersonalCancerHistory.setIsBetelNutChewing(false);
		benPersonalCancerHistory.setDurationOfBetelQuid(0);
		benPersonalCancerHistory.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory.setSsAlcoholUsed(false);
		benPersonalCancerHistory.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory.setProcessed("processed");
		benPersonalCancerHistory.setCreatedBy("createdBy");
		benPersonalCancerHistory.setModifiedBy("createdBy");
		benPersonalCancerHistory.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory.setVisitCode(0L);
		when(mockBenPersonalCancerHistoryRepo.getBenPersonalHistory(0L, 0L)).thenReturn(benPersonalCancerHistory);

		// Configure BenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(...).
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory.setID(0L);
		benPersonalCancerDietHistory.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory.setProviderServiceMapID(0);
		benPersonalCancerDietHistory.setDietType("dietType");
		benPersonalCancerDietHistory.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory.setSsRadiationExposure(false);
		benPersonalCancerDietHistory.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory.setProcessed("processed");
		benPersonalCancerDietHistory.setCreatedBy("createdBy");
		benPersonalCancerDietHistory.setModifiedBy("createdBy");
		benPersonalCancerDietHistory.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory.setVisitCode(0L);
		when(mockBenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(0L, 0L))
				.thenReturn(benPersonalCancerDietHistory);

		// Configure BenCancerVitalDetailRepo.getBenCancerVitalDetail(...).
		final BenCancerVitalDetail benCancerVitalDetail = new BenCancerVitalDetail();
		benCancerVitalDetail.setID(0L);
		benCancerVitalDetail.setBeneficiaryRegID(0L);
		benCancerVitalDetail.setProviderServiceMapID(0);
		benCancerVitalDetail.setWeight_Kg(0.0);
		benCancerVitalDetail.setHeight_cm(0.0);
		benCancerVitalDetail.setWaistCircumference_cm(0.0);
		benCancerVitalDetail.setBloodGlucose_Fasting((short) 0);
		benCancerVitalDetail.setBloodGlucose_Random((short) 0);
		benCancerVitalDetail.setBloodGlucose_2HrPostPrandial((short) 0);
		benCancerVitalDetail.setSystolicBP_1stReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_1stReading((short) 0);
		benCancerVitalDetail.setSystolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setSystolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setHbA1C((short) 0);
		benCancerVitalDetail.setHemoglobin(0.0);
		benCancerVitalDetail.setCreatedBy("createdBy");
		benCancerVitalDetail.setModifiedBy("createdBy");
		benCancerVitalDetail.setVisitCode(0L);
		benCancerVitalDetail.setRbsTestResult("rbsTestResult");
		benCancerVitalDetail.setRbsTestRemarks("rbsTestRemarks");
		benCancerVitalDetail.setsPO2("sPO2");
		when(mockBenCancerVitalDetailRepo.getBenCancerVitalDetail(0L, 0L)).thenReturn(benCancerVitalDetail);

		// Configure
		// CancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(...).
		final CancerAbdominalExamination cancerAbdominalExamination = new CancerAbdominalExamination();
		cancerAbdominalExamination.setID(0L);
		cancerAbdominalExamination.setBeneficiaryRegID(0L);
		cancerAbdominalExamination.setProviderServiceMapID(0);
		cancerAbdominalExamination.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination.setLiver("liver");
		cancerAbdominalExamination.setAscites_Present(false);
		cancerAbdominalExamination.setAnyOtherMass_Present(false);
		cancerAbdominalExamination.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination.setObservation("observation");
		cancerAbdominalExamination.setProcessed("processed");
		cancerAbdominalExamination.setCreatedBy("createdBy");
		cancerAbdominalExamination.setModifiedBy("createdBy");
		cancerAbdominalExamination.setVisitCode(0L);
		when(mockCancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(0L, 0L))
				.thenReturn(cancerAbdominalExamination);

		// Configure
		// CancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(...).
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);
		when(mockCancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(0L, 0L))
				.thenReturn(cancerBreastExamination);

		// Configure
		// CancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(...).
		final CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
		cancerGynecologicalExamination.setID(0L);
		cancerGynecologicalExamination.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination.setProviderServiceMapID(0);
		cancerGynecologicalExamination.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination.setVulvalInvolvement(false);
		cancerGynecologicalExamination.setVaginalInvolvement(false);
		cancerGynecologicalExamination.setUterus_Normal(false);
		cancerGynecologicalExamination.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination.setFilePath("filePath");
		cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination.setObservation("observation");
		cancerGynecologicalExamination.setProcessed("processed");
		cancerGynecologicalExamination.setCreatedBy("createdBy");
		cancerGynecologicalExamination.setModifiedBy("createdBy");
		cancerGynecologicalExamination.setVisitCode(0L);
		when(mockCancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(0L, 0L))
				.thenReturn(cancerGynecologicalExamination);

		// Configure CancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(...).
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		when(mockCancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(0L, 0L))
				.thenReturn(cancerSignAndSymptoms);

		// Configure CancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(...).
		final CancerLymphNodeDetails cancerLymphNodeDetails1 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails1.setID(0L);
		cancerLymphNodeDetails1.setBenVisitID(0L);
		cancerLymphNodeDetails1.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails1.setMobility_Left(false);
		cancerLymphNodeDetails1.setSize_Left("size_Left");
		cancerLymphNodeDetails1.setMobility_Right(false);
		cancerLymphNodeDetails1.setSize_Right("size_Right");
		cancerLymphNodeDetails1.setVisitCode(0L);
		final List<CancerLymphNodeDetails> cancerLymphNodeDetails = List.of(cancerLymphNodeDetails1);
		when(mockCancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(0L, 0L))
				.thenReturn(cancerLymphNodeDetails);

		// Configure CancerOralExaminationRepo.getBenCancerOralExaminationDetails(...).
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);
		when(mockCancerOralExaminationRepo.getBenCancerOralExaminationDetails(0L, 0L))
				.thenReturn(cancerOralExamination);

		// Run the test
		final Map<String, Object> result = csNurseServiceImplUnderTest.getBenNurseDataForCaseSheet(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenNurseDataForCaseSheet_BenVisitDetailRepoReturnsNoItems() {
		// Setup
		when(mockBenVisitDetailRepo.getBeneficiaryVisitDetails(0L, 0L)).thenReturn(Collections.emptyList());

		// Configure BenFamilyCancerHistoryRepo.getBenFamilyHistory(...).
		final BenFamilyCancerHistory benFamilyCancerHistory = new BenFamilyCancerHistory();
		benFamilyCancerHistory.setBeneficiaryRegID(0L);
		benFamilyCancerHistory.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory.setFamilyMember("familyMember");
		benFamilyCancerHistory.setCreatedBy("createdBy");
		benFamilyCancerHistory.setModifiedBy("createdBy");
		benFamilyCancerHistory.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory.setVisitCode(0L);
		final List<BenFamilyCancerHistory> benFamilyCancerHistories = List.of(benFamilyCancerHistory);
		when(mockBenFamilyCancerHistoryRepo.getBenFamilyHistory(0L, 0L)).thenReturn(benFamilyCancerHistories);

		// Configure BenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(...).
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);
		when(mockBenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(0L, 0L))
				.thenReturn(benObstetricCancerHistory);

		// Configure BenPersonalCancerHistoryRepo.getBenPersonalHistory(...).
		final BenPersonalCancerHistory benPersonalCancerHistory = new BenPersonalCancerHistory();
		benPersonalCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory.setID(0L);
		benPersonalCancerHistory.setBeneficiaryRegID(0L);
		benPersonalCancerHistory.setProviderServiceMapID(0);
		benPersonalCancerHistory.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory.setStartAge_year(0);
		benPersonalCancerHistory.setEndAge_year(0);
		benPersonalCancerHistory.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory.setQuantityPerDay(1);
		benPersonalCancerHistory.setIsFilteredCigaerette(false);
		benPersonalCancerHistory.setIsCigaretteExposure(false);
		benPersonalCancerHistory.setIsBetelNutChewing(false);
		benPersonalCancerHistory.setDurationOfBetelQuid(0);
		benPersonalCancerHistory.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory.setSsAlcoholUsed(false);
		benPersonalCancerHistory.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory.setProcessed("processed");
		benPersonalCancerHistory.setCreatedBy("createdBy");
		benPersonalCancerHistory.setModifiedBy("createdBy");
		benPersonalCancerHistory.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory.setVisitCode(0L);
		when(mockBenPersonalCancerHistoryRepo.getBenPersonalHistory(0L, 0L)).thenReturn(benPersonalCancerHistory);

		// Configure BenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(...).
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory.setID(0L);
		benPersonalCancerDietHistory.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory.setProviderServiceMapID(0);
		benPersonalCancerDietHistory.setDietType("dietType");
		benPersonalCancerDietHistory.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory.setSsRadiationExposure(false);
		benPersonalCancerDietHistory.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory.setProcessed("processed");
		benPersonalCancerDietHistory.setCreatedBy("createdBy");
		benPersonalCancerDietHistory.setModifiedBy("createdBy");
		benPersonalCancerDietHistory.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory.setVisitCode(0L);
		when(mockBenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(0L, 0L))
				.thenReturn(benPersonalCancerDietHistory);

		// Configure BenCancerVitalDetailRepo.getBenCancerVitalDetail(...).
		final BenCancerVitalDetail benCancerVitalDetail = new BenCancerVitalDetail();
		benCancerVitalDetail.setID(0L);
		benCancerVitalDetail.setBeneficiaryRegID(0L);
		benCancerVitalDetail.setProviderServiceMapID(0);
		benCancerVitalDetail.setWeight_Kg(0.0);
		benCancerVitalDetail.setHeight_cm(0.0);
		benCancerVitalDetail.setWaistCircumference_cm(0.0);
		benCancerVitalDetail.setBloodGlucose_Fasting((short) 0);
		benCancerVitalDetail.setBloodGlucose_Random((short) 0);
		benCancerVitalDetail.setBloodGlucose_2HrPostPrandial((short) 0);
		benCancerVitalDetail.setSystolicBP_1stReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_1stReading((short) 0);
		benCancerVitalDetail.setSystolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setSystolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setHbA1C((short) 0);
		benCancerVitalDetail.setHemoglobin(0.0);
		benCancerVitalDetail.setCreatedBy("createdBy");
		benCancerVitalDetail.setModifiedBy("createdBy");
		benCancerVitalDetail.setVisitCode(0L);
		benCancerVitalDetail.setRbsTestResult("rbsTestResult");
		benCancerVitalDetail.setRbsTestRemarks("rbsTestRemarks");
		benCancerVitalDetail.setsPO2("sPO2");
		when(mockBenCancerVitalDetailRepo.getBenCancerVitalDetail(0L, 0L)).thenReturn(benCancerVitalDetail);

		// Configure
		// CancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(...).
		final CancerAbdominalExamination cancerAbdominalExamination = new CancerAbdominalExamination();
		cancerAbdominalExamination.setID(0L);
		cancerAbdominalExamination.setBeneficiaryRegID(0L);
		cancerAbdominalExamination.setProviderServiceMapID(0);
		cancerAbdominalExamination.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination.setLiver("liver");
		cancerAbdominalExamination.setAscites_Present(false);
		cancerAbdominalExamination.setAnyOtherMass_Present(false);
		cancerAbdominalExamination.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination.setObservation("observation");
		cancerAbdominalExamination.setProcessed("processed");
		cancerAbdominalExamination.setCreatedBy("createdBy");
		cancerAbdominalExamination.setModifiedBy("createdBy");
		cancerAbdominalExamination.setVisitCode(0L);
		when(mockCancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(0L, 0L))
				.thenReturn(cancerAbdominalExamination);

		// Configure
		// CancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(...).
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);
		when(mockCancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(0L, 0L))
				.thenReturn(cancerBreastExamination);

		// Configure
		// CancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(...).
		final CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
		cancerGynecologicalExamination.setID(0L);
		cancerGynecologicalExamination.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination.setProviderServiceMapID(0);
		cancerGynecologicalExamination.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination.setVulvalInvolvement(false);
		cancerGynecologicalExamination.setVaginalInvolvement(false);
		cancerGynecologicalExamination.setUterus_Normal(false);
		cancerGynecologicalExamination.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination.setFilePath("filePath");
		cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination.setObservation("observation");
		cancerGynecologicalExamination.setProcessed("processed");
		cancerGynecologicalExamination.setCreatedBy("createdBy");
		cancerGynecologicalExamination.setModifiedBy("createdBy");
		cancerGynecologicalExamination.setVisitCode(0L);
		when(mockCancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(0L, 0L))
				.thenReturn(cancerGynecologicalExamination);

		// Configure CancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(...).
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		when(mockCancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(0L, 0L))
				.thenReturn(cancerSignAndSymptoms);

		// Configure CancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(...).
		final CancerLymphNodeDetails cancerLymphNodeDetails1 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails1.setID(0L);
		cancerLymphNodeDetails1.setBenVisitID(0L);
		cancerLymphNodeDetails1.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails1.setMobility_Left(false);
		cancerLymphNodeDetails1.setSize_Left("size_Left");
		cancerLymphNodeDetails1.setMobility_Right(false);
		cancerLymphNodeDetails1.setSize_Right("size_Right");
		cancerLymphNodeDetails1.setVisitCode(0L);
		final List<CancerLymphNodeDetails> cancerLymphNodeDetails = List.of(cancerLymphNodeDetails1);
		when(mockCancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(0L, 0L))
				.thenReturn(cancerLymphNodeDetails);

		// Configure CancerOralExaminationRepo.getBenCancerOralExaminationDetails(...).
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);
		when(mockCancerOralExaminationRepo.getBenCancerOralExaminationDetails(0L, 0L))
				.thenReturn(cancerOralExamination);

		// Run the test
		final Map<String, Object> result = csNurseServiceImplUnderTest.getBenNurseDataForCaseSheet(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenNurseDataForCaseSheet_BenFamilyCancerHistoryRepoReturnsNoItems() {
		// Setup

		when(mockBenFamilyCancerHistoryRepo.getBenFamilyHistory(0L, 0L)).thenReturn(Collections.emptyList());

		// Configure BenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(...).
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);
		when(mockBenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(0L, 0L))
				.thenReturn(benObstetricCancerHistory);

		// Configure BenPersonalCancerHistoryRepo.getBenPersonalHistory(...).
		final BenPersonalCancerHistory benPersonalCancerHistory = new BenPersonalCancerHistory();
		benPersonalCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory.setID(0L);
		benPersonalCancerHistory.setBeneficiaryRegID(0L);
		benPersonalCancerHistory.setProviderServiceMapID(0);
		benPersonalCancerHistory.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory.setStartAge_year(0);
		benPersonalCancerHistory.setEndAge_year(0);
		benPersonalCancerHistory.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory.setQuantityPerDay(1);
		benPersonalCancerHistory.setIsFilteredCigaerette(false);
		benPersonalCancerHistory.setIsCigaretteExposure(false);
		benPersonalCancerHistory.setIsBetelNutChewing(false);
		benPersonalCancerHistory.setDurationOfBetelQuid(0);
		benPersonalCancerHistory.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory.setSsAlcoholUsed(false);
		benPersonalCancerHistory.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory.setProcessed("processed");
		benPersonalCancerHistory.setCreatedBy("createdBy");
		benPersonalCancerHistory.setModifiedBy("createdBy");
		benPersonalCancerHistory.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory.setVisitCode(0L);
		when(mockBenPersonalCancerHistoryRepo.getBenPersonalHistory(0L, 0L)).thenReturn(benPersonalCancerHistory);

		// Configure BenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(...).
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory.setID(0L);
		benPersonalCancerDietHistory.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory.setProviderServiceMapID(0);
		benPersonalCancerDietHistory.setDietType("dietType");
		benPersonalCancerDietHistory.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory.setSsRadiationExposure(false);
		benPersonalCancerDietHistory.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory.setProcessed("processed");
		benPersonalCancerDietHistory.setCreatedBy("createdBy");
		benPersonalCancerDietHistory.setModifiedBy("createdBy");
		benPersonalCancerDietHistory.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory.setVisitCode(0L);
		when(mockBenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(0L, 0L))
				.thenReturn(benPersonalCancerDietHistory);

		// Configure BenCancerVitalDetailRepo.getBenCancerVitalDetail(...).
		final BenCancerVitalDetail benCancerVitalDetail = new BenCancerVitalDetail();
		benCancerVitalDetail.setID(0L);
		benCancerVitalDetail.setBeneficiaryRegID(0L);
		benCancerVitalDetail.setProviderServiceMapID(0);
		benCancerVitalDetail.setWeight_Kg(0.0);
		benCancerVitalDetail.setHeight_cm(0.0);
		benCancerVitalDetail.setWaistCircumference_cm(0.0);
		benCancerVitalDetail.setBloodGlucose_Fasting((short) 0);
		benCancerVitalDetail.setBloodGlucose_Random((short) 0);
		benCancerVitalDetail.setBloodGlucose_2HrPostPrandial((short) 0);
		benCancerVitalDetail.setSystolicBP_1stReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_1stReading((short) 0);
		benCancerVitalDetail.setSystolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setSystolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setHbA1C((short) 0);
		benCancerVitalDetail.setHemoglobin(0.0);
		benCancerVitalDetail.setCreatedBy("createdBy");
		benCancerVitalDetail.setModifiedBy("createdBy");
		benCancerVitalDetail.setVisitCode(0L);
		benCancerVitalDetail.setRbsTestResult("rbsTestResult");
		benCancerVitalDetail.setRbsTestRemarks("rbsTestRemarks");
		benCancerVitalDetail.setsPO2("sPO2");
		when(mockBenCancerVitalDetailRepo.getBenCancerVitalDetail(0L, 0L)).thenReturn(benCancerVitalDetail);

		// Configure
		// CancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(...).
		final CancerAbdominalExamination cancerAbdominalExamination = new CancerAbdominalExamination();
		cancerAbdominalExamination.setID(0L);
		cancerAbdominalExamination.setBeneficiaryRegID(0L);
		cancerAbdominalExamination.setProviderServiceMapID(0);
		cancerAbdominalExamination.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination.setLiver("liver");
		cancerAbdominalExamination.setAscites_Present(false);
		cancerAbdominalExamination.setAnyOtherMass_Present(false);
		cancerAbdominalExamination.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination.setObservation("observation");
		cancerAbdominalExamination.setProcessed("processed");
		cancerAbdominalExamination.setCreatedBy("createdBy");
		cancerAbdominalExamination.setModifiedBy("createdBy");
		cancerAbdominalExamination.setVisitCode(0L);
		when(mockCancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(0L, 0L))
				.thenReturn(cancerAbdominalExamination);

		// Configure
		// CancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(...).
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);
		when(mockCancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(0L, 0L))
				.thenReturn(cancerBreastExamination);

		// Configure
		// CancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(...).
		final CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
		cancerGynecologicalExamination.setID(0L);
		cancerGynecologicalExamination.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination.setProviderServiceMapID(0);
		cancerGynecologicalExamination.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination.setVulvalInvolvement(false);
		cancerGynecologicalExamination.setVaginalInvolvement(false);
		cancerGynecologicalExamination.setUterus_Normal(false);
		cancerGynecologicalExamination.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination.setFilePath("filePath");
		cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination.setObservation("observation");
		cancerGynecologicalExamination.setProcessed("processed");
		cancerGynecologicalExamination.setCreatedBy("createdBy");
		cancerGynecologicalExamination.setModifiedBy("createdBy");
		cancerGynecologicalExamination.setVisitCode(0L);
		when(mockCancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(0L, 0L))
				.thenReturn(cancerGynecologicalExamination);

		// Configure CancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(...).
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		when(mockCancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(0L, 0L))
				.thenReturn(cancerSignAndSymptoms);

		// Configure CancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(...).
		final CancerLymphNodeDetails cancerLymphNodeDetails1 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails1.setID(0L);
		cancerLymphNodeDetails1.setBenVisitID(0L);
		cancerLymphNodeDetails1.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails1.setMobility_Left(false);
		cancerLymphNodeDetails1.setSize_Left("size_Left");
		cancerLymphNodeDetails1.setMobility_Right(false);
		cancerLymphNodeDetails1.setSize_Right("size_Right");
		cancerLymphNodeDetails1.setVisitCode(0L);
		final List<CancerLymphNodeDetails> cancerLymphNodeDetails = List.of(cancerLymphNodeDetails1);
		when(mockCancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(0L, 0L))
				.thenReturn(cancerLymphNodeDetails);

		// Configure CancerOralExaminationRepo.getBenCancerOralExaminationDetails(...).
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);
		when(mockCancerOralExaminationRepo.getBenCancerOralExaminationDetails(0L, 0L))
				.thenReturn(cancerOralExamination);

		// Run the test
		final Map<String, Object> result = csNurseServiceImplUnderTest.getBenNurseDataForCaseSheet(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenNurseDataForCaseSheet_BenPersonalCancerHistoryRepoReturnsNull() {
		// Setup

		// Configure BenFamilyCancerHistoryRepo.getBenFamilyHistory(...).
		final BenFamilyCancerHistory benFamilyCancerHistory = new BenFamilyCancerHistory();
		benFamilyCancerHistory.setBeneficiaryRegID(0L);
		benFamilyCancerHistory.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory.setFamilyMember("familyMember");
		benFamilyCancerHistory.setCreatedBy("createdBy");
		benFamilyCancerHistory.setModifiedBy("createdBy");
		benFamilyCancerHistory.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory.setVisitCode(0L);
		final List<BenFamilyCancerHistory> benFamilyCancerHistories = List.of(benFamilyCancerHistory);
		when(mockBenFamilyCancerHistoryRepo.getBenFamilyHistory(0L, 0L)).thenReturn(benFamilyCancerHistories);

		// Configure BenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(...).
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);
		when(mockBenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(0L, 0L))
				.thenReturn(benObstetricCancerHistory);

		when(mockBenPersonalCancerHistoryRepo.getBenPersonalHistory(0L, 0L)).thenReturn(null);

		// Configure BenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(...).
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory.setID(0L);
		benPersonalCancerDietHistory.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory.setProviderServiceMapID(0);
		benPersonalCancerDietHistory.setDietType("dietType");
		benPersonalCancerDietHistory.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory.setSsRadiationExposure(false);
		benPersonalCancerDietHistory.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory.setProcessed("processed");
		benPersonalCancerDietHistory.setCreatedBy("createdBy");
		benPersonalCancerDietHistory.setModifiedBy("createdBy");
		benPersonalCancerDietHistory.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory.setVisitCode(0L);
		when(mockBenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(0L, 0L))
				.thenReturn(benPersonalCancerDietHistory);

		// Configure BenCancerVitalDetailRepo.getBenCancerVitalDetail(...).
		final BenCancerVitalDetail benCancerVitalDetail = new BenCancerVitalDetail();
		benCancerVitalDetail.setID(0L);
		benCancerVitalDetail.setBeneficiaryRegID(0L);
		benCancerVitalDetail.setProviderServiceMapID(0);
		benCancerVitalDetail.setWeight_Kg(0.0);
		benCancerVitalDetail.setHeight_cm(0.0);
		benCancerVitalDetail.setWaistCircumference_cm(0.0);
		benCancerVitalDetail.setBloodGlucose_Fasting((short) 0);
		benCancerVitalDetail.setBloodGlucose_Random((short) 0);
		benCancerVitalDetail.setBloodGlucose_2HrPostPrandial((short) 0);
		benCancerVitalDetail.setSystolicBP_1stReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_1stReading((short) 0);
		benCancerVitalDetail.setSystolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setSystolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setHbA1C((short) 0);
		benCancerVitalDetail.setHemoglobin(0.0);
		benCancerVitalDetail.setCreatedBy("createdBy");
		benCancerVitalDetail.setModifiedBy("createdBy");
		benCancerVitalDetail.setVisitCode(0L);
		benCancerVitalDetail.setRbsTestResult("rbsTestResult");
		benCancerVitalDetail.setRbsTestRemarks("rbsTestRemarks");
		benCancerVitalDetail.setsPO2("sPO2");
		when(mockBenCancerVitalDetailRepo.getBenCancerVitalDetail(0L, 0L)).thenReturn(benCancerVitalDetail);

		// Configure
		// CancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(...).
		final CancerAbdominalExamination cancerAbdominalExamination = new CancerAbdominalExamination();
		cancerAbdominalExamination.setID(0L);
		cancerAbdominalExamination.setBeneficiaryRegID(0L);
		cancerAbdominalExamination.setProviderServiceMapID(0);
		cancerAbdominalExamination.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination.setLiver("liver");
		cancerAbdominalExamination.setAscites_Present(false);
		cancerAbdominalExamination.setAnyOtherMass_Present(false);
		cancerAbdominalExamination.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination.setObservation("observation");
		cancerAbdominalExamination.setProcessed("processed");
		cancerAbdominalExamination.setCreatedBy("createdBy");
		cancerAbdominalExamination.setModifiedBy("createdBy");
		cancerAbdominalExamination.setVisitCode(0L);
		when(mockCancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(0L, 0L))
				.thenReturn(cancerAbdominalExamination);

		// Configure
		// CancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(...).
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);
		when(mockCancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(0L, 0L))
				.thenReturn(cancerBreastExamination);

		// Configure
		// CancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(...).
		final CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
		cancerGynecologicalExamination.setID(0L);
		cancerGynecologicalExamination.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination.setProviderServiceMapID(0);
		cancerGynecologicalExamination.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination.setVulvalInvolvement(false);
		cancerGynecologicalExamination.setVaginalInvolvement(false);
		cancerGynecologicalExamination.setUterus_Normal(false);
		cancerGynecologicalExamination.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination.setFilePath("filePath");
		cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination.setObservation("observation");
		cancerGynecologicalExamination.setProcessed("processed");
		cancerGynecologicalExamination.setCreatedBy("createdBy");
		cancerGynecologicalExamination.setModifiedBy("createdBy");
		cancerGynecologicalExamination.setVisitCode(0L);
		when(mockCancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(0L, 0L))
				.thenReturn(cancerGynecologicalExamination);

		// Configure CancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(...).
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		when(mockCancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(0L, 0L))
				.thenReturn(cancerSignAndSymptoms);

		// Configure CancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(...).
		final CancerLymphNodeDetails cancerLymphNodeDetails1 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails1.setID(0L);
		cancerLymphNodeDetails1.setBenVisitID(0L);
		cancerLymphNodeDetails1.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails1.setMobility_Left(false);
		cancerLymphNodeDetails1.setSize_Left("size_Left");
		cancerLymphNodeDetails1.setMobility_Right(false);
		cancerLymphNodeDetails1.setSize_Right("size_Right");
		cancerLymphNodeDetails1.setVisitCode(0L);
		final List<CancerLymphNodeDetails> cancerLymphNodeDetails = List.of(cancerLymphNodeDetails1);
		when(mockCancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(0L, 0L))
				.thenReturn(cancerLymphNodeDetails);

		// Configure CancerOralExaminationRepo.getBenCancerOralExaminationDetails(...).
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);
		when(mockCancerOralExaminationRepo.getBenCancerOralExaminationDetails(0L, 0L))
				.thenReturn(cancerOralExamination);

		// Run the test
		final Map<String, Object> result = csNurseServiceImplUnderTest.getBenNurseDataForCaseSheet(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenNurseDataForCaseSheet_BenPersonalCancerDietHistoryRepoReturnsNull() {
		// Setup

		// Configure BenFamilyCancerHistoryRepo.getBenFamilyHistory(...).
		final BenFamilyCancerHistory benFamilyCancerHistory = new BenFamilyCancerHistory();
		benFamilyCancerHistory.setBeneficiaryRegID(0L);
		benFamilyCancerHistory.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory.setFamilyMember("familyMember");
		benFamilyCancerHistory.setCreatedBy("createdBy");
		benFamilyCancerHistory.setModifiedBy("createdBy");
		benFamilyCancerHistory.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory.setVisitCode(0L);
		final List<BenFamilyCancerHistory> benFamilyCancerHistories = List.of(benFamilyCancerHistory);
		when(mockBenFamilyCancerHistoryRepo.getBenFamilyHistory(0L, 0L)).thenReturn(benFamilyCancerHistories);

		// Configure BenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(...).
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);
		when(mockBenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(0L, 0L))
				.thenReturn(benObstetricCancerHistory);

		// Configure BenPersonalCancerHistoryRepo.getBenPersonalHistory(...).
		final BenPersonalCancerHistory benPersonalCancerHistory = new BenPersonalCancerHistory();
		benPersonalCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory.setID(0L);
		benPersonalCancerHistory.setBeneficiaryRegID(0L);
		benPersonalCancerHistory.setProviderServiceMapID(0);
		benPersonalCancerHistory.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory.setStartAge_year(0);
		benPersonalCancerHistory.setEndAge_year(0);
		benPersonalCancerHistory.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory.setQuantityPerDay(1);
		benPersonalCancerHistory.setIsFilteredCigaerette(false);
		benPersonalCancerHistory.setIsCigaretteExposure(false);
		benPersonalCancerHistory.setIsBetelNutChewing(false);
		benPersonalCancerHistory.setDurationOfBetelQuid(0);
		benPersonalCancerHistory.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory.setSsAlcoholUsed(false);
		benPersonalCancerHistory.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory.setProcessed("processed");
		benPersonalCancerHistory.setCreatedBy("createdBy");
		benPersonalCancerHistory.setModifiedBy("createdBy");
		benPersonalCancerHistory.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory.setVisitCode(0L);
		when(mockBenPersonalCancerHistoryRepo.getBenPersonalHistory(0L, 0L)).thenReturn(benPersonalCancerHistory);

		when(mockBenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(0L, 0L)).thenReturn(null);

		// Configure BenCancerVitalDetailRepo.getBenCancerVitalDetail(...).
		final BenCancerVitalDetail benCancerVitalDetail = new BenCancerVitalDetail();
		benCancerVitalDetail.setID(0L);
		benCancerVitalDetail.setBeneficiaryRegID(0L);
		benCancerVitalDetail.setProviderServiceMapID(0);
		benCancerVitalDetail.setWeight_Kg(0.0);
		benCancerVitalDetail.setHeight_cm(0.0);
		benCancerVitalDetail.setWaistCircumference_cm(0.0);
		benCancerVitalDetail.setBloodGlucose_Fasting((short) 0);
		benCancerVitalDetail.setBloodGlucose_Random((short) 0);
		benCancerVitalDetail.setBloodGlucose_2HrPostPrandial((short) 0);
		benCancerVitalDetail.setSystolicBP_1stReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_1stReading((short) 0);
		benCancerVitalDetail.setSystolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setSystolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setHbA1C((short) 0);
		benCancerVitalDetail.setHemoglobin(0.0);
		benCancerVitalDetail.setCreatedBy("createdBy");
		benCancerVitalDetail.setModifiedBy("createdBy");
		benCancerVitalDetail.setVisitCode(0L);
		benCancerVitalDetail.setRbsTestResult("rbsTestResult");
		benCancerVitalDetail.setRbsTestRemarks("rbsTestRemarks");
		benCancerVitalDetail.setsPO2("sPO2");
		when(mockBenCancerVitalDetailRepo.getBenCancerVitalDetail(0L, 0L)).thenReturn(benCancerVitalDetail);

		// Configure
		// CancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(...).
		final CancerAbdominalExamination cancerAbdominalExamination = new CancerAbdominalExamination();
		cancerAbdominalExamination.setID(0L);
		cancerAbdominalExamination.setBeneficiaryRegID(0L);
		cancerAbdominalExamination.setProviderServiceMapID(0);
		cancerAbdominalExamination.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination.setLiver("liver");
		cancerAbdominalExamination.setAscites_Present(false);
		cancerAbdominalExamination.setAnyOtherMass_Present(false);
		cancerAbdominalExamination.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination.setObservation("observation");
		cancerAbdominalExamination.setProcessed("processed");
		cancerAbdominalExamination.setCreatedBy("createdBy");
		cancerAbdominalExamination.setModifiedBy("createdBy");
		cancerAbdominalExamination.setVisitCode(0L);
		when(mockCancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(0L, 0L))
				.thenReturn(cancerAbdominalExamination);

		// Configure
		// CancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(...).
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);
		when(mockCancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(0L, 0L))
				.thenReturn(cancerBreastExamination);

		// Configure
		// CancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(...).
		final CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
		cancerGynecologicalExamination.setID(0L);
		cancerGynecologicalExamination.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination.setProviderServiceMapID(0);
		cancerGynecologicalExamination.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination.setVulvalInvolvement(false);
		cancerGynecologicalExamination.setVaginalInvolvement(false);
		cancerGynecologicalExamination.setUterus_Normal(false);
		cancerGynecologicalExamination.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination.setFilePath("filePath");
		cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination.setObservation("observation");
		cancerGynecologicalExamination.setProcessed("processed");
		cancerGynecologicalExamination.setCreatedBy("createdBy");
		cancerGynecologicalExamination.setModifiedBy("createdBy");
		cancerGynecologicalExamination.setVisitCode(0L);
		when(mockCancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(0L, 0L))
				.thenReturn(cancerGynecologicalExamination);

		// Configure CancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(...).
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		when(mockCancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(0L, 0L))
				.thenReturn(cancerSignAndSymptoms);

		// Configure CancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(...).
		final CancerLymphNodeDetails cancerLymphNodeDetails1 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails1.setID(0L);
		cancerLymphNodeDetails1.setBenVisitID(0L);
		cancerLymphNodeDetails1.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails1.setMobility_Left(false);
		cancerLymphNodeDetails1.setSize_Left("size_Left");
		cancerLymphNodeDetails1.setMobility_Right(false);
		cancerLymphNodeDetails1.setSize_Right("size_Right");
		cancerLymphNodeDetails1.setVisitCode(0L);
		final List<CancerLymphNodeDetails> cancerLymphNodeDetails = List.of(cancerLymphNodeDetails1);
		when(mockCancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(0L, 0L))
				.thenReturn(cancerLymphNodeDetails);

		// Configure CancerOralExaminationRepo.getBenCancerOralExaminationDetails(...).
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);
		when(mockCancerOralExaminationRepo.getBenCancerOralExaminationDetails(0L, 0L))
				.thenReturn(cancerOralExamination);

		// Run the test
		final Map<String, Object> result = csNurseServiceImplUnderTest.getBenNurseDataForCaseSheet(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBenNurseDataForCaseSheet_CancerLymphNodeExaminationRepoReturnsNoItems() {

		// Configure BenFamilyCancerHistoryRepo.getBenFamilyHistory(...).
		final BenFamilyCancerHistory benFamilyCancerHistory = new BenFamilyCancerHistory();
		benFamilyCancerHistory.setBeneficiaryRegID(0L);
		benFamilyCancerHistory.setCancerDiseaseType("cancerDiseaseType");
		benFamilyCancerHistory.setFamilyMember("familyMember");
		benFamilyCancerHistory.setCreatedBy("createdBy");
		benFamilyCancerHistory.setModifiedBy("createdBy");
		benFamilyCancerHistory.setFamilyMemberList(List.of("value"));
		benFamilyCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benFamilyCancerHistory.setVisitCode(0L);
		final List<BenFamilyCancerHistory> benFamilyCancerHistories = List.of(benFamilyCancerHistory);
		when(mockBenFamilyCancerHistoryRepo.getBenFamilyHistory(0L, 0L)).thenReturn(benFamilyCancerHistories);

		// Configure BenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(...).
		final BenObstetricCancerHistory benObstetricCancerHistory = new BenObstetricCancerHistory();
		benObstetricCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benObstetricCancerHistory.setID(0L);
		benObstetricCancerHistory.setBeneficiaryRegID(0L);
		benObstetricCancerHistory.setProviderServiceMapID(0);
		benObstetricCancerHistory.setPregnancyStatus("pregnancyStatus");
		benObstetricCancerHistory.setIsUrinePregTest(false);
		benObstetricCancerHistory.setPregnant_No("pregnant_No");
		benObstetricCancerHistory.setNoOfLivingChild(0);
		benObstetricCancerHistory.setIsAbortion(false);
		benObstetricCancerHistory.setIsOralContraceptiveUsed(false);
		benObstetricCancerHistory.setIsHormoneReplacementTherapy(false);
		benObstetricCancerHistory.setMenarche_Age(0);
		benObstetricCancerHistory.setIsMenstrualCycleRegular(false);
		benObstetricCancerHistory.setMenstrualCycleLength(0);
		benObstetricCancerHistory.setMenstrualFlowDuration(0);
		benObstetricCancerHistory.setMenstrualFlowType("menstrualFlowType");
		benObstetricCancerHistory.setIsDysmenorrhea(false);
		benObstetricCancerHistory.setIsInterMenstrualBleeding(false);
		benObstetricCancerHistory.setMenopauseAge(0);
		benObstetricCancerHistory.setIsPostMenopauseBleeding(false);
		benObstetricCancerHistory.setIsFoulSmellingDischarge(false);
		benObstetricCancerHistory.setProcessed("processed");
		benObstetricCancerHistory.setCreatedBy("createdBy");
		benObstetricCancerHistory.setModifiedBy("createdBy");
		benObstetricCancerHistory.setVisitCode(0L);
		when(mockBenObstetricCancerHistoryRepo.getBenObstetricCancerHistory(0L, 0L))
				.thenReturn(benObstetricCancerHistory);

		// Configure BenPersonalCancerHistoryRepo.getBenPersonalHistory(...).
		final BenPersonalCancerHistory benPersonalCancerHistory = new BenPersonalCancerHistory();
		benPersonalCancerHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerHistory.setID(0L);
		benPersonalCancerHistory.setBeneficiaryRegID(0L);
		benPersonalCancerHistory.setProviderServiceMapID(0);
		benPersonalCancerHistory.setTobaccoUse("tobaccoUse");
		benPersonalCancerHistory.setStartAge_year(0);
		benPersonalCancerHistory.setEndAge_year(0);
		benPersonalCancerHistory.setTypeOfTobaccoProduct("typeOfTobaccoProduct");
		benPersonalCancerHistory.setQuantityPerDay(1);
		benPersonalCancerHistory.setIsFilteredCigaerette(false);
		benPersonalCancerHistory.setIsCigaretteExposure(false);
		benPersonalCancerHistory.setIsBetelNutChewing(false);
		benPersonalCancerHistory.setDurationOfBetelQuid(0);
		benPersonalCancerHistory.setAlcoholUse("alcoholUse");
		benPersonalCancerHistory.setSsAlcoholUsed(false);
		benPersonalCancerHistory.setFrequencyOfAlcoholUsed("frequencyOfAlcoholUsed");
		benPersonalCancerHistory.setProcessed("processed");
		benPersonalCancerHistory.setCreatedBy("createdBy");
		benPersonalCancerHistory.setModifiedBy("createdBy");
		benPersonalCancerHistory.setTypeOfTobaccoProductList(List.of("value"));
		benPersonalCancerHistory.setVisitCode(0L);
		when(mockBenPersonalCancerHistoryRepo.getBenPersonalHistory(0L, 0L)).thenReturn(benPersonalCancerHistory);

		// Configure BenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(...).
		final BenPersonalCancerDietHistory benPersonalCancerDietHistory = new BenPersonalCancerDietHistory();
		benPersonalCancerDietHistory.setCaptureDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		benPersonalCancerDietHistory.setID(0L);
		benPersonalCancerDietHistory.setBeneficiaryRegID(0L);
		benPersonalCancerDietHistory.setProviderServiceMapID(0);
		benPersonalCancerDietHistory.setDietType("dietType");
		benPersonalCancerDietHistory.setFruitConsumptionDays(0);
		benPersonalCancerDietHistory.setFruitQuantityPerDay(1);
		benPersonalCancerDietHistory.setVegetableConsumptionDays(0);
		benPersonalCancerDietHistory.setVegetableQuantityPerDay(1);
		benPersonalCancerDietHistory.setIntakeOfOutsidePreparedMeal(0);
		benPersonalCancerDietHistory.setTypeOfOilConsumed("typeOfOilConsumed");
		benPersonalCancerDietHistory.setPhysicalActivityType("physicalActivityType");
		benPersonalCancerDietHistory.setSsRadiationExposure(false);
		benPersonalCancerDietHistory.setIsThyroidDisorder(false);
		benPersonalCancerDietHistory.setProcessed("processed");
		benPersonalCancerDietHistory.setCreatedBy("createdBy");
		benPersonalCancerDietHistory.setModifiedBy("createdBy");
		benPersonalCancerDietHistory.setTypeOfOilConsumedList(List.of("value"));
		benPersonalCancerDietHistory.setVisitCode(0L);
		when(mockBenPersonalCancerDietHistoryRepo.getBenPersonaDietHistory(0L, 0L))
				.thenReturn(benPersonalCancerDietHistory);

		// Configure BenCancerVitalDetailRepo.getBenCancerVitalDetail(...).
		final BenCancerVitalDetail benCancerVitalDetail = new BenCancerVitalDetail();
		benCancerVitalDetail.setID(0L);
		benCancerVitalDetail.setBeneficiaryRegID(0L);
		benCancerVitalDetail.setProviderServiceMapID(0);
		benCancerVitalDetail.setWeight_Kg(0.0);
		benCancerVitalDetail.setHeight_cm(0.0);
		benCancerVitalDetail.setWaistCircumference_cm(0.0);
		benCancerVitalDetail.setBloodGlucose_Fasting((short) 0);
		benCancerVitalDetail.setBloodGlucose_Random((short) 0);
		benCancerVitalDetail.setBloodGlucose_2HrPostPrandial((short) 0);
		benCancerVitalDetail.setSystolicBP_1stReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_1stReading((short) 0);
		benCancerVitalDetail.setSystolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_2ndReading((short) 0);
		benCancerVitalDetail.setSystolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setDiastolicBP_3rdReading((short) 0);
		benCancerVitalDetail.setHbA1C((short) 0);
		benCancerVitalDetail.setHemoglobin(0.0);
		benCancerVitalDetail.setCreatedBy("createdBy");
		benCancerVitalDetail.setModifiedBy("createdBy");
		benCancerVitalDetail.setVisitCode(0L);
		benCancerVitalDetail.setRbsTestResult("rbsTestResult");
		benCancerVitalDetail.setRbsTestRemarks("rbsTestRemarks");
		benCancerVitalDetail.setsPO2("sPO2");
		when(mockBenCancerVitalDetailRepo.getBenCancerVitalDetail(0L, 0L)).thenReturn(benCancerVitalDetail);

		// Configure
		// CancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(...).
		final CancerAbdominalExamination cancerAbdominalExamination = new CancerAbdominalExamination();
		cancerAbdominalExamination.setID(0L);
		cancerAbdominalExamination.setBeneficiaryRegID(0L);
		cancerAbdominalExamination.setProviderServiceMapID(0);
		cancerAbdominalExamination.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination.setLiver("liver");
		cancerAbdominalExamination.setAscites_Present(false);
		cancerAbdominalExamination.setAnyOtherMass_Present(false);
		cancerAbdominalExamination.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination.setObservation("observation");
		cancerAbdominalExamination.setProcessed("processed");
		cancerAbdominalExamination.setCreatedBy("createdBy");
		cancerAbdominalExamination.setModifiedBy("createdBy");
		cancerAbdominalExamination.setVisitCode(0L);
		when(mockCancerAbdominalExaminationRepo.getBenCancerAbdominalExaminationDetails(0L, 0L))
				.thenReturn(cancerAbdominalExamination);

		// Configure
		// CancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(...).
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);
		when(mockCancerBreastExaminationRepo.getBenCancerBreastExaminationDetails(0L, 0L))
				.thenReturn(cancerBreastExamination);

		// Configure
		// CancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(...).
		final CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
		cancerGynecologicalExamination.setID(0L);
		cancerGynecologicalExamination.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination.setProviderServiceMapID(0);
		cancerGynecologicalExamination.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination.setVulvalInvolvement(false);
		cancerGynecologicalExamination.setVaginalInvolvement(false);
		cancerGynecologicalExamination.setUterus_Normal(false);
		cancerGynecologicalExamination.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination.setFilePath("filePath");
		cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination.setObservation("observation");
		cancerGynecologicalExamination.setProcessed("processed");
		cancerGynecologicalExamination.setCreatedBy("createdBy");
		cancerGynecologicalExamination.setModifiedBy("createdBy");
		cancerGynecologicalExamination.setVisitCode(0L);
		when(mockCancerGynecologicalExaminationRepo.getBenCancerGynecologicalExaminationDetails(0L, 0L))
				.thenReturn(cancerGynecologicalExamination);

		// Configure CancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(...).
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		when(mockCancerSignAndSymptomsRepo.getBenCancerSignAndSymptomsDetails(0L, 0L))
				.thenReturn(cancerSignAndSymptoms);

		when(mockCancerLymphNodeExaminationRepo.getBenCancerLymphNodeDetails(0L, 0L))
				.thenReturn(Collections.emptyList());

		// Configure CancerOralExaminationRepo.getBenCancerOralExaminationDetails(...).
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);
		when(mockCancerOralExaminationRepo.getBenCancerOralExaminationDetails(0L, 0L))
				.thenReturn(cancerOralExamination);

		// Run the test
		final Map<String, Object> result = csNurseServiceImplUnderTest.getBenNurseDataForCaseSheet(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBeneficiaryVisitDetails() {

		// Run the test
		final BeneficiaryVisitDetail result = csNurseServiceImplUnderTest.getBeneficiaryVisitDetails(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetBeneficiaryVisitDetails_BenVisitDetailRepoReturnsNull() {
		// Setup
		when(mockBenVisitDetailRepo.getBeneficiaryVisitDetails(0L, 0L)).thenReturn(null);

		// Run the test
		final BeneficiaryVisitDetail result = csNurseServiceImplUnderTest.getBeneficiaryVisitDetails(0L, 0L);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testGetBeneficiaryVisitDetails_BenVisitDetailRepoReturnsNoItems() {
		// Setup
		when(mockBenVisitDetailRepo.getBeneficiaryVisitDetails(0L, 0L)).thenReturn(Collections.emptyList());

		// Run the test
		final BeneficiaryVisitDetail result = csNurseServiceImplUnderTest.getBeneficiaryVisitDetails(0L, 0L);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveCancerSignAndSymptomsData1() {
		// Setup
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);

		// Configure CancerSignAndSymptomsRepo.save(...).
		final CancerSignAndSymptoms cancerSignAndSymptoms1 = new CancerSignAndSymptoms();
		cancerSignAndSymptoms1.setID(0L);
		cancerSignAndSymptoms1.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms1.setBenVisitID(0L);
		cancerSignAndSymptoms1.setProviderServiceMapID(0);
		cancerSignAndSymptoms1.setShortnessOfBreath(false);
		cancerSignAndSymptoms1.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms1.setBloodInSputum(false);
		cancerSignAndSymptoms1.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms1.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms1.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms1.setLumpInTheBreast(false);
		cancerSignAndSymptoms1.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms1.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms1.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms1.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms1.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms1.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms1.setBreastEnlargement(false);
		cancerSignAndSymptoms1.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms1.setBriefHistory("observation");
		cancerSignAndSymptoms1.setProcessed("processed");
		cancerSignAndSymptoms1.setCreatedBy("createdBy");
		cancerSignAndSymptoms1.setModifiedBy("createdBy");
		cancerSignAndSymptoms1.setVisitCode(0L);
		when(mockCancerSignAndSymptomsRepo.save(any(CancerSignAndSymptoms.class))).thenReturn(cancerSignAndSymptoms1);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveCancerSignAndSymptomsData(cancerSignAndSymptoms, 0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSaveCancerSignAndSymptomsData1_CancerSignAndSymptomsRepoReturnsNull() {
		// Setup
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);

		when(mockCancerSignAndSymptomsRepo.save(any(CancerSignAndSymptoms.class))).thenReturn(null);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveCancerSignAndSymptomsData(cancerSignAndSymptoms, 0L, 0L);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveCancerSignAndSymptomsData1_CancerSignAndSymptomsRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);

		when(mockCancerSignAndSymptomsRepo.save(any(CancerSignAndSymptoms.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(
				() -> csNurseServiceImplUnderTest.saveCancerSignAndSymptomsData(cancerSignAndSymptoms, 0L, 0L))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testSaveCancerSignAndSymptomsData2_CancerSignAndSymptomsRepoReturnsNull() {
		// Setup
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);

		when(mockCancerSignAndSymptomsRepo.save(any(CancerSignAndSymptoms.class))).thenReturn(null);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveCancerSignAndSymptomsData(cancerSignAndSymptoms);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveCancerSignAndSymptomsData2_CancerSignAndSymptomsRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		
		cancerSignAndSymptoms.toString();

		when(mockCancerSignAndSymptomsRepo.save(any(CancerSignAndSymptoms.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> csNurseServiceImplUnderTest.saveCancerSignAndSymptomsData(cancerSignAndSymptoms))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testSaveCancerOralExaminationData() {
		// Setup
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);

		// Configure CancerOralExaminationRepo.save(...).
		final CancerOralExamination cancerOralExamination1 = new CancerOralExamination();
		cancerOralExamination1.setID(0L);
		cancerOralExamination1.setBeneficiaryRegID(0L);
		cancerOralExamination1.setProviderServiceMapID(0);
		cancerOralExamination1.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination1.setPremalignantLesions(false);
		cancerOralExamination1.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination1.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination1.setProlongedIrritation(false);
		cancerOralExamination1.setChronicBurningSensation(false);
		cancerOralExamination1.setObservation("observation");
		cancerOralExamination1.setProcessed("processed");
		cancerOralExamination1.setCreatedBy("createdBy");
		cancerOralExamination1.setModifiedBy("createdBy");
		cancerOralExamination1.setVisitCode(0L);
		when(mockCancerOralExaminationRepo.save(any(CancerOralExamination.class))).thenReturn(cancerOralExamination1);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveCancerOralExaminationData(cancerOralExamination);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSaveCancerOralExaminationData_CancerOralExaminationRepoReturnsNull() {
		// Setup
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);

		when(mockCancerOralExaminationRepo.save(any(CancerOralExamination.class))).thenReturn(null);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveCancerOralExaminationData(cancerOralExamination);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveCancerOralExaminationData_CancerOralExaminationRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);

		when(mockCancerOralExaminationRepo.save(any(CancerOralExamination.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> csNurseServiceImplUnderTest.saveCancerOralExaminationData(cancerOralExamination))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testGetCancerOralExaminationDetails() {
		// Setup
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);

		// Run the test
		final CancerOralExamination result = csNurseServiceImplUnderTest
				.getCancerOralExaminationDetails(cancerOralExamination);

		// Verify the results
	}

	@Test
	void testSaveCancerBreastExaminationData() {
		// Setup
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);

		// Configure CancerBreastExaminationRepo.save(...).
		final CancerBreastExamination cancerBreastExamination1 = new CancerBreastExamination();
		cancerBreastExamination1.setID(0L);
		cancerBreastExamination1.setBeneficiaryRegID(0L);
		cancerBreastExamination1.setProviderServiceMapID(0);
		cancerBreastExamination1.setEverBreastFed(false);
		cancerBreastExamination1.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination1.setBreastsAppear_Normal(false);
		cancerBreastExamination1.setRashOnBreast(false);
		cancerBreastExamination1.setDimplingSkinOnBreast(false);
		cancerBreastExamination1.setDischargeFromNipple(false);
		cancerBreastExamination1.setPeaudOrange(false);
		cancerBreastExamination1.setLumpInBreast(false);
		cancerBreastExamination1.setLumpSize("lumpSize");
		cancerBreastExamination1.setLumpShape("lumpShape");
		cancerBreastExamination1.setLumpTexture("lumpTexture");
		cancerBreastExamination1.setReferredToMammogram(false);
		cancerBreastExamination1.setMamogramReport("mamogramReport");
		cancerBreastExamination1.setProcessed("processed");
		cancerBreastExamination1.setCreatedBy("createdBy");
		cancerBreastExamination1.setModifiedBy("createdBy");
		cancerBreastExamination1.setVisitCode(0L);
		when(mockCancerBreastExaminationRepo.save(any(CancerBreastExamination.class)))
				.thenReturn(cancerBreastExamination1);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveCancerBreastExaminationData(cancerBreastExamination);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSaveCancerBreastExaminationData_CancerBreastExaminationRepoReturnsNull() {
		// Setup
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);

		when(mockCancerBreastExaminationRepo.save(any(CancerBreastExamination.class))).thenReturn(null);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveCancerBreastExaminationData(cancerBreastExamination);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveCancerBreastExaminationData_CancerBreastExaminationRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);

		when(mockCancerBreastExaminationRepo.save(any(CancerBreastExamination.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> csNurseServiceImplUnderTest.saveCancerBreastExaminationData(cancerBreastExamination))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testSaveCancerAbdominalExaminationData() {
		// Setup
		final CancerAbdominalExamination cancerAbdominalExamination = new CancerAbdominalExamination();
		cancerAbdominalExamination.setID(0L);
		cancerAbdominalExamination.setBeneficiaryRegID(0L);
		cancerAbdominalExamination.setProviderServiceMapID(0);
		cancerAbdominalExamination.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination.setLiver("liver");
		cancerAbdominalExamination.setAscites_Present(false);
		cancerAbdominalExamination.setAnyOtherMass_Present(false);
		cancerAbdominalExamination.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination.setObservation("observation");
		cancerAbdominalExamination.setProcessed("processed");
		cancerAbdominalExamination.setCreatedBy("createdBy");
		cancerAbdominalExamination.setModifiedBy("createdBy");
		cancerAbdominalExamination.setVisitCode(0L);

		// Configure CancerAbdominalExaminationRepo.save(...).
		final CancerAbdominalExamination cancerAbdominalExamination1 = new CancerAbdominalExamination();
		cancerAbdominalExamination1.setID(0L);
		cancerAbdominalExamination1.setBeneficiaryRegID(0L);
		cancerAbdominalExamination1.setProviderServiceMapID(0);
		cancerAbdominalExamination1.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination1.setLiver("liver");
		cancerAbdominalExamination1.setAscites_Present(false);
		cancerAbdominalExamination1.setAnyOtherMass_Present(false);
		cancerAbdominalExamination1.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination1.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination1.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination1.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination1.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination1.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination1.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination1.setObservation("observation");
		cancerAbdominalExamination1.setProcessed("processed");
		cancerAbdominalExamination1.setCreatedBy("createdBy");
		cancerAbdominalExamination1.setModifiedBy("createdBy");
		cancerAbdominalExamination1.setVisitCode(0L);
		when(mockCancerAbdominalExaminationRepo.save(any(CancerAbdominalExamination.class)))
				.thenReturn(cancerAbdominalExamination1);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveCancerAbdominalExaminationData(cancerAbdominalExamination);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSaveCancerAbdominalExaminationData_CancerAbdominalExaminationRepoReturnsNull() {
		// Setup
		final CancerAbdominalExamination cancerAbdominalExamination = new CancerAbdominalExamination();
		cancerAbdominalExamination.setID(0L);
		cancerAbdominalExamination.setBeneficiaryRegID(0L);
		cancerAbdominalExamination.setProviderServiceMapID(0);
		cancerAbdominalExamination.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination.setLiver("liver");
		cancerAbdominalExamination.setAscites_Present(false);
		cancerAbdominalExamination.setAnyOtherMass_Present(false);
		cancerAbdominalExamination.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination.setObservation("observation");
		cancerAbdominalExamination.setProcessed("processed");
		cancerAbdominalExamination.setCreatedBy("createdBy");
		cancerAbdominalExamination.setModifiedBy("createdBy");
		cancerAbdominalExamination.setVisitCode(0L);

		when(mockCancerAbdominalExaminationRepo.save(any(CancerAbdominalExamination.class))).thenReturn(null);

		// Run the test
		final Long result = csNurseServiceImplUnderTest.saveCancerAbdominalExaminationData(cancerAbdominalExamination);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveCancerAbdominalExaminationData_CancerAbdominalExaminationRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final CancerAbdominalExamination cancerAbdominalExamination = new CancerAbdominalExamination();
		cancerAbdominalExamination.setID(0L);
		cancerAbdominalExamination.setBeneficiaryRegID(0L);
		cancerAbdominalExamination.setProviderServiceMapID(0);
		cancerAbdominalExamination.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination.setLiver("liver");
		cancerAbdominalExamination.setAscites_Present(false);
		cancerAbdominalExamination.setAnyOtherMass_Present(false);
		cancerAbdominalExamination.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination.setObservation("observation");
		cancerAbdominalExamination.setProcessed("processed");
		cancerAbdominalExamination.setCreatedBy("createdBy");
		cancerAbdominalExamination.setModifiedBy("createdBy");
		cancerAbdominalExamination.setVisitCode(0L);

		when(mockCancerAbdominalExaminationRepo.save(any(CancerAbdominalExamination.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(
				() -> csNurseServiceImplUnderTest.saveCancerAbdominalExaminationData(cancerAbdominalExamination))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testSaveCancerGynecologicalExaminationData() {
		// Setup
		final CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
		cancerGynecologicalExamination.setID(0L);
		cancerGynecologicalExamination.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination.setProviderServiceMapID(0);
		cancerGynecologicalExamination.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination.setVulvalInvolvement(false);
		cancerGynecologicalExamination.setVaginalInvolvement(false);
		cancerGynecologicalExamination.setUterus_Normal(false);
		cancerGynecologicalExamination.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination.setFilePath("filePath");
		cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination.setObservation("observation");
		cancerGynecologicalExamination.setProcessed("processed");
		cancerGynecologicalExamination.setCreatedBy("createdBy");
		cancerGynecologicalExamination.setModifiedBy("createdBy");
		cancerGynecologicalExamination.setVisitCode(0L);

		// Configure CancerGynecologicalExaminationRepo.save(...).
		final CancerGynecologicalExamination cancerGynecologicalExamination1 = new CancerGynecologicalExamination();
		cancerGynecologicalExamination1.setID(0L);
		cancerGynecologicalExamination1.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination1.setProviderServiceMapID(0);
		cancerGynecologicalExamination1.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination1.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination1.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination1.setVulvalInvolvement(false);
		cancerGynecologicalExamination1.setVaginalInvolvement(false);
		cancerGynecologicalExamination1.setUterus_Normal(false);
		cancerGynecologicalExamination1.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination1.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination1.setFilePath("filePath");
		cancerGynecologicalExamination1.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination1.setObservation("observation");
		cancerGynecologicalExamination1.setProcessed("processed");
		cancerGynecologicalExamination1.setCreatedBy("createdBy");
		cancerGynecologicalExamination1.setModifiedBy("createdBy");
		cancerGynecologicalExamination1.setVisitCode(0L);
		when(mockCancerGynecologicalExaminationRepo.save(any(CancerGynecologicalExamination.class)))
				.thenReturn(cancerGynecologicalExamination1);

		// Run the test
		final Long result = csNurseServiceImplUnderTest
				.saveCancerGynecologicalExaminationData(cancerGynecologicalExamination);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSaveCancerGynecologicalExaminationData_CancerGynecologicalExaminationRepoReturnsNull() {
		// Setup
		final CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
		cancerGynecologicalExamination.setID(0L);
		cancerGynecologicalExamination.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination.setProviderServiceMapID(0);
		cancerGynecologicalExamination.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination.setVulvalInvolvement(false);
		cancerGynecologicalExamination.setVaginalInvolvement(false);
		cancerGynecologicalExamination.setUterus_Normal(false);
		cancerGynecologicalExamination.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination.setFilePath("filePath");
		cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination.setObservation("observation");
		cancerGynecologicalExamination.setProcessed("processed");
		cancerGynecologicalExamination.setCreatedBy("createdBy");
		cancerGynecologicalExamination.setModifiedBy("createdBy");
		cancerGynecologicalExamination.setVisitCode(0L);

		when(mockCancerGynecologicalExaminationRepo.save(any(CancerGynecologicalExamination.class))).thenReturn(null);

		// Run the test
		final Long result = csNurseServiceImplUnderTest
				.saveCancerGynecologicalExaminationData(cancerGynecologicalExamination);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveCancerGynecologicalExaminationData_CancerGynecologicalExaminationRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
		cancerGynecologicalExamination.setID(0L);
		cancerGynecologicalExamination.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination.setProviderServiceMapID(0);
		cancerGynecologicalExamination.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination.setVulvalInvolvement(false);
		cancerGynecologicalExamination.setVaginalInvolvement(false);
		cancerGynecologicalExamination.setUterus_Normal(false);
		cancerGynecologicalExamination.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination.setFilePath("filePath");
		cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination.setObservation("observation");
		cancerGynecologicalExamination.setProcessed("processed");
		cancerGynecologicalExamination.setCreatedBy("createdBy");
		cancerGynecologicalExamination.setModifiedBy("createdBy");
		cancerGynecologicalExamination.setVisitCode(0L);

		when(mockCancerGynecologicalExaminationRepo.save(any(CancerGynecologicalExamination.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> csNurseServiceImplUnderTest
				.saveCancerGynecologicalExaminationData(cancerGynecologicalExamination))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testUpdateSignAndSymptomsExaminationDetails() {
		// Setup
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);

		when(mockCancerSignAndSymptomsRepo.getCancerSignAndSymptomsStatus(0L, 0L)).thenReturn("result");
		when(mockCancerSignAndSymptomsRepo.updateCancerSignAndSymptoms(0, false, false, false, false, false, false,
				false, false, false, false, false, false, false, false, false, "observation", "createdBy", 0L, 0L,
				"processed")).thenReturn(0);

		// Configure CancerSignAndSymptomsRepo.save(...).
		final CancerSignAndSymptoms cancerSignAndSymptoms1 = new CancerSignAndSymptoms();
		cancerSignAndSymptoms1.setID(0L);
		cancerSignAndSymptoms1.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms1.setBenVisitID(0L);
		cancerSignAndSymptoms1.setProviderServiceMapID(0);
		cancerSignAndSymptoms1.setShortnessOfBreath(false);
		cancerSignAndSymptoms1.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms1.setBloodInSputum(false);
		cancerSignAndSymptoms1.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms1.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms1.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms1.setLumpInTheBreast(false);
		cancerSignAndSymptoms1.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms1.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms1.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms1.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms1.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms1.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms1.setBreastEnlargement(false);
		cancerSignAndSymptoms1.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms1.setBriefHistory("observation");
		cancerSignAndSymptoms1.setProcessed("processed");
		cancerSignAndSymptoms1.setCreatedBy("createdBy");
		cancerSignAndSymptoms1.setModifiedBy("createdBy");
		cancerSignAndSymptoms1.setVisitCode(0L);
		when(mockCancerSignAndSymptomsRepo.save(any(CancerSignAndSymptoms.class))).thenReturn(cancerSignAndSymptoms1);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateSignAndSymptomsExaminationDetails(cancerSignAndSymptoms);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateSignAndSymptomsExaminationDetails_CancerSignAndSymptomsRepoGetCancerSignAndSymptomsStatusReturnsNull() {
		// Setup
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);

		when(mockCancerSignAndSymptomsRepo.getCancerSignAndSymptomsStatus(0L, 0L)).thenReturn(null);

		// Configure CancerSignAndSymptomsRepo.save(...).
		final CancerSignAndSymptoms cancerSignAndSymptoms1 = new CancerSignAndSymptoms();
		cancerSignAndSymptoms1.setID(0L);
		cancerSignAndSymptoms1.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms1.setBenVisitID(0L);
		cancerSignAndSymptoms1.setProviderServiceMapID(0);
		cancerSignAndSymptoms1.setShortnessOfBreath(false);
		cancerSignAndSymptoms1.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms1.setBloodInSputum(false);
		cancerSignAndSymptoms1.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms1.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms1.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms1.setLumpInTheBreast(false);
		cancerSignAndSymptoms1.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms1.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms1.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms1.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms1.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms1.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms1.setBreastEnlargement(false);
		cancerSignAndSymptoms1.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms1.setBriefHistory("observation");
		cancerSignAndSymptoms1.setProcessed("processed");
		cancerSignAndSymptoms1.setCreatedBy("createdBy");
		cancerSignAndSymptoms1.setModifiedBy("createdBy");
		cancerSignAndSymptoms1.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateSignAndSymptomsExaminationDetails(cancerSignAndSymptoms);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateSignAndSymptomsExaminationDetails_CancerSignAndSymptomsRepoSaveReturnsNull() {
		// Setup
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);

		when(mockCancerSignAndSymptomsRepo.getCancerSignAndSymptomsStatus(0L, 0L)).thenReturn("result");

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateSignAndSymptomsExaminationDetails(cancerSignAndSymptoms);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateSignAndSymptomsExaminationDetails_CancerSignAndSymptomsRepoSaveThrowsOptimisticLockingFailureException() {
		// Setup
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateSignAndSymptomsExaminationDetails(cancerSignAndSymptoms);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateSignAndSymptomsExamination() {
		// Setup
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);

		when(mockCancerSignAndSymptomsRepo.updateCancerSignAndSymptoms(0, false, false, false, false, false, false,
				false, false, false, false, false, false, false, false, false, "observation", "createdBy", 0L, 0L,
				"processed")).thenReturn(0);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateSignAndSymptomsExamination(cancerSignAndSymptoms);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateLymphNodeExaminationDetails() {
		// Setup
		final WrapperCancerSymptoms wrapperOBJ = new WrapperCancerSymptoms();
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		wrapperOBJ.setCancerSignAndSymptoms(cancerSignAndSymptoms);
		final CancerLymphNodeDetails cancerLymphNodeDetails = new CancerLymphNodeDetails();
		cancerLymphNodeDetails.setID(0L);
		cancerLymphNodeDetails.setBenVisitID(0L);
		cancerLymphNodeDetails.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails.setMobility_Left(false);
		cancerLymphNodeDetails.setSize_Left("size_Left");
		cancerLymphNodeDetails.setMobility_Right(false);
		cancerLymphNodeDetails.setSize_Right("size_Right");
		cancerLymphNodeDetails.setVisitCode(0L);
		wrapperOBJ.setCancerLymphNodeDetails(List.of(cancerLymphNodeDetails));

		// Configure
		// CancerLymphNodeExaminationRepo.getCancerLymphNodeDetailsStatus(...).

		when(mockCancerLymphNodeExaminationRepo.deleteExistingLymphNodeDetails(0L, "N")).thenReturn(0);

		// Configure
		// CancerLymphNodeExaminationRepo.getCancerLymphNodeDetailsStatusForLymphnodeNameList(...).

		// Configure CancerLymphNodeExaminationRepo.saveAll(...).
		final CancerLymphNodeDetails cancerLymphNodeDetails2 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails2.setID(0L);
		cancerLymphNodeDetails2.setBenVisitID(0L);
		cancerLymphNodeDetails2.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails2.setMobility_Left(false);
		cancerLymphNodeDetails2.setSize_Left("size_Left");
		cancerLymphNodeDetails2.setMobility_Right(false);
		cancerLymphNodeDetails2.setSize_Right("size_Right");
		cancerLymphNodeDetails2.setVisitCode(0L);
		final Iterable<CancerLymphNodeDetails> cancerLymphNodeDetails1 = List.of(cancerLymphNodeDetails2);
		final CancerLymphNodeDetails cancerLymphNodeDetails3 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails3.setID(0L);
		cancerLymphNodeDetails3.setBenVisitID(0L);
		cancerLymphNodeDetails3.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails3.setMobility_Left(false);
		cancerLymphNodeDetails3.setSize_Left("size_Left");
		cancerLymphNodeDetails3.setMobility_Right(false);
		cancerLymphNodeDetails3.setSize_Right("size_Right");
		cancerLymphNodeDetails3.setVisitCode(0L);
		final List<CancerLymphNodeDetails> entities = List.of(cancerLymphNodeDetails3);
		when(mockCancerLymphNodeExaminationRepo.saveAll(entities)).thenReturn(cancerLymphNodeDetails1);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateLymphNodeExaminationDetails(wrapperOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateLymphNodeExaminationDetails_CancerLymphNodeExaminationRepoGetCancerLymphNodeDetailsStatusReturnsNull() {
		// Setup
		final WrapperCancerSymptoms wrapperOBJ = new WrapperCancerSymptoms();
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		wrapperOBJ.setCancerSignAndSymptoms(cancerSignAndSymptoms);
		final CancerLymphNodeDetails cancerLymphNodeDetails = new CancerLymphNodeDetails();
		cancerLymphNodeDetails.setID(0L);
		cancerLymphNodeDetails.setBenVisitID(0L);
		cancerLymphNodeDetails.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails.setMobility_Left(false);
		cancerLymphNodeDetails.setSize_Left("size_Left");
		cancerLymphNodeDetails.setMobility_Right(false);
		cancerLymphNodeDetails.setSize_Right("size_Right");
		cancerLymphNodeDetails.setVisitCode(0L);
		wrapperOBJ.setCancerLymphNodeDetails(List.of(cancerLymphNodeDetails));

		when(mockCancerLymphNodeExaminationRepo.getCancerLymphNodeDetailsStatus(0L, 0L)).thenReturn(null);

		// Configure CancerLymphNodeExaminationRepo.saveAll(...).
		final CancerLymphNodeDetails cancerLymphNodeDetails2 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails2.setID(0L);
		cancerLymphNodeDetails2.setBenVisitID(0L);
		cancerLymphNodeDetails2.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails2.setMobility_Left(false);
		cancerLymphNodeDetails2.setSize_Left("size_Left");
		cancerLymphNodeDetails2.setMobility_Right(false);
		cancerLymphNodeDetails2.setSize_Right("size_Right");
		cancerLymphNodeDetails2.setVisitCode(0L);
		final Iterable<CancerLymphNodeDetails> cancerLymphNodeDetails1 = List.of(cancerLymphNodeDetails2);
		final CancerLymphNodeDetails cancerLymphNodeDetails3 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails3.setID(0L);
		cancerLymphNodeDetails3.setBenVisitID(0L);
		cancerLymphNodeDetails3.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails3.setMobility_Left(false);
		cancerLymphNodeDetails3.setSize_Left("size_Left");
		cancerLymphNodeDetails3.setMobility_Right(false);
		cancerLymphNodeDetails3.setSize_Right("size_Right");
		cancerLymphNodeDetails3.setVisitCode(0L);
		final List<CancerLymphNodeDetails> entities = List.of(cancerLymphNodeDetails3);
		when(mockCancerLymphNodeExaminationRepo.saveAll(entities)).thenReturn(cancerLymphNodeDetails1);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateLymphNodeExaminationDetails(wrapperOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateLymphNodeExaminationDetails_CancerLymphNodeExaminationRepoGetCancerLymphNodeDetailsStatusReturnsNoItems() {
		// Setup
		final WrapperCancerSymptoms wrapperOBJ = new WrapperCancerSymptoms();
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		wrapperOBJ.setCancerSignAndSymptoms(cancerSignAndSymptoms);
		final CancerLymphNodeDetails cancerLymphNodeDetails = new CancerLymphNodeDetails();
		cancerLymphNodeDetails.setID(0L);
		cancerLymphNodeDetails.setBenVisitID(0L);
		cancerLymphNodeDetails.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails.setMobility_Left(false);
		cancerLymphNodeDetails.setSize_Left("size_Left");
		cancerLymphNodeDetails.setMobility_Right(false);
		cancerLymphNodeDetails.setSize_Right("size_Right");
		cancerLymphNodeDetails.setVisitCode(0L);
		wrapperOBJ.setCancerLymphNodeDetails(List.of(cancerLymphNodeDetails));

		when(mockCancerLymphNodeExaminationRepo.getCancerLymphNodeDetailsStatus(0L, 0L)).thenReturn(new ArrayList<>());

		// Configure CancerLymphNodeExaminationRepo.saveAll(...).
		final CancerLymphNodeDetails cancerLymphNodeDetails2 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails2.setID(0L);
		cancerLymphNodeDetails2.setBenVisitID(0L);
		cancerLymphNodeDetails2.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails2.setMobility_Left(false);
		cancerLymphNodeDetails2.setSize_Left("size_Left");
		cancerLymphNodeDetails2.setMobility_Right(false);
		cancerLymphNodeDetails2.setSize_Right("size_Right");
		cancerLymphNodeDetails2.setVisitCode(0L);
		final Iterable<CancerLymphNodeDetails> cancerLymphNodeDetails1 = List.of(cancerLymphNodeDetails2);
		final CancerLymphNodeDetails cancerLymphNodeDetails3 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails3.setID(0L);
		cancerLymphNodeDetails3.setBenVisitID(0L);
		cancerLymphNodeDetails3.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails3.setMobility_Left(false);
		cancerLymphNodeDetails3.setSize_Left("size_Left");
		cancerLymphNodeDetails3.setMobility_Right(false);
		cancerLymphNodeDetails3.setSize_Right("size_Right");
		cancerLymphNodeDetails3.setVisitCode(0L);
		final List<CancerLymphNodeDetails> entities = List.of(cancerLymphNodeDetails3);
		when(mockCancerLymphNodeExaminationRepo.saveAll(entities)).thenReturn(cancerLymphNodeDetails1);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateLymphNodeExaminationDetails(wrapperOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateLymphNodeExaminationDetails_CancerLymphNodeExaminationRepoGetCancerLymphNodeDetailsStatusForLymphnodeNameListReturnsNull() {
		// Setup
		final WrapperCancerSymptoms wrapperOBJ = new WrapperCancerSymptoms();
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		wrapperOBJ.setCancerSignAndSymptoms(cancerSignAndSymptoms);
		final CancerLymphNodeDetails cancerLymphNodeDetails = new CancerLymphNodeDetails();
		cancerLymphNodeDetails.setID(0L);
		cancerLymphNodeDetails.setBenVisitID(0L);
		cancerLymphNodeDetails.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails.setMobility_Left(false);
		cancerLymphNodeDetails.setSize_Left("size_Left");
		cancerLymphNodeDetails.setMobility_Right(false);
		cancerLymphNodeDetails.setSize_Right("size_Right");
		cancerLymphNodeDetails.setVisitCode(0L);
		wrapperOBJ.setCancerLymphNodeDetails(List.of(cancerLymphNodeDetails));

		// Configure CancerLymphNodeExaminationRepo.saveAll(...).
		final CancerLymphNodeDetails cancerLymphNodeDetails2 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails2.setID(0L);
		cancerLymphNodeDetails2.setBenVisitID(0L);
		cancerLymphNodeDetails2.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails2.setMobility_Left(false);
		cancerLymphNodeDetails2.setSize_Left("size_Left");
		cancerLymphNodeDetails2.setMobility_Right(false);
		cancerLymphNodeDetails2.setSize_Right("size_Right");
		cancerLymphNodeDetails2.setVisitCode(0L);
		final Iterable<CancerLymphNodeDetails> cancerLymphNodeDetails1 = List.of(cancerLymphNodeDetails2);
		final CancerLymphNodeDetails cancerLymphNodeDetails3 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails3.setID(0L);
		cancerLymphNodeDetails3.setBenVisitID(0L);
		cancerLymphNodeDetails3.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails3.setMobility_Left(false);
		cancerLymphNodeDetails3.setSize_Left("size_Left");
		cancerLymphNodeDetails3.setMobility_Right(false);
		cancerLymphNodeDetails3.setSize_Right("size_Right");
		cancerLymphNodeDetails3.setVisitCode(0L);
		final List<CancerLymphNodeDetails> entities = List.of(cancerLymphNodeDetails3);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateLymphNodeExaminationDetails(wrapperOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateLymphNodeExaminationDetails_CancerLymphNodeExaminationRepoGetCancerLymphNodeDetailsStatusForLymphnodeNameListReturnsNoItems() {
		// Setup
		final WrapperCancerSymptoms wrapperOBJ = new WrapperCancerSymptoms();
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		wrapperOBJ.setCancerSignAndSymptoms(cancerSignAndSymptoms);
		final CancerLymphNodeDetails cancerLymphNodeDetails = new CancerLymphNodeDetails();
		cancerLymphNodeDetails.setID(0L);
		cancerLymphNodeDetails.setBenVisitID(0L);
		cancerLymphNodeDetails.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails.setMobility_Left(false);
		cancerLymphNodeDetails.setSize_Left("size_Left");
		cancerLymphNodeDetails.setMobility_Right(false);
		cancerLymphNodeDetails.setSize_Right("size_Right");
		cancerLymphNodeDetails.setVisitCode(0L);
		wrapperOBJ.setCancerLymphNodeDetails(List.of(cancerLymphNodeDetails));

		when(mockCancerLymphNodeExaminationRepo.getCancerLymphNodeDetailsStatusForLymphnodeNameList(0L, 0L,
				List.of("value"))).thenReturn(new ArrayList<>());

		// Configure CancerLymphNodeExaminationRepo.saveAll(...).
		final CancerLymphNodeDetails cancerLymphNodeDetails2 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails2.setID(0L);
		cancerLymphNodeDetails2.setBenVisitID(0L);
		cancerLymphNodeDetails2.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails2.setMobility_Left(false);
		cancerLymphNodeDetails2.setSize_Left("size_Left");
		cancerLymphNodeDetails2.setMobility_Right(false);
		cancerLymphNodeDetails2.setSize_Right("size_Right");
		cancerLymphNodeDetails2.setVisitCode(0L);
		final Iterable<CancerLymphNodeDetails> cancerLymphNodeDetails1 = List.of(cancerLymphNodeDetails2);
		final CancerLymphNodeDetails cancerLymphNodeDetails3 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails3.setID(0L);
		cancerLymphNodeDetails3.setBenVisitID(0L);
		cancerLymphNodeDetails3.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails3.setMobility_Left(false);
		cancerLymphNodeDetails3.setSize_Left("size_Left");
		cancerLymphNodeDetails3.setMobility_Right(false);
		cancerLymphNodeDetails3.setSize_Right("size_Right");
		cancerLymphNodeDetails3.setVisitCode(0L);
		final List<CancerLymphNodeDetails> entities = List.of(cancerLymphNodeDetails3);
		when(mockCancerLymphNodeExaminationRepo.saveAll(entities)).thenReturn(cancerLymphNodeDetails1);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateLymphNodeExaminationDetails(wrapperOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateLymphNodeExaminationDetails_CancerLymphNodeExaminationRepoSaveAllReturnsNoItems() {
		// Setup
		final WrapperCancerSymptoms wrapperOBJ = new WrapperCancerSymptoms();
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		wrapperOBJ.setCancerSignAndSymptoms(cancerSignAndSymptoms);
		final CancerLymphNodeDetails cancerLymphNodeDetails = new CancerLymphNodeDetails();
		cancerLymphNodeDetails.setID(0L);
		cancerLymphNodeDetails.setBenVisitID(0L);
		cancerLymphNodeDetails.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails.setMobility_Left(false);
		cancerLymphNodeDetails.setSize_Left("size_Left");
		cancerLymphNodeDetails.setMobility_Right(false);
		cancerLymphNodeDetails.setSize_Right("size_Right");
		cancerLymphNodeDetails.setVisitCode(0L);
		wrapperOBJ.setCancerLymphNodeDetails(List.of(cancerLymphNodeDetails));

		when(mockCancerLymphNodeExaminationRepo.deleteExistingLymphNodeDetails(0L, "N")).thenReturn(0);

		// Configure CancerLymphNodeExaminationRepo.saveAll(...).
		final CancerLymphNodeDetails cancerLymphNodeDetails1 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails1.setID(0L);
		cancerLymphNodeDetails1.setBenVisitID(0L);
		cancerLymphNodeDetails1.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails1.setMobility_Left(false);
		cancerLymphNodeDetails1.setSize_Left("size_Left");
		cancerLymphNodeDetails1.setMobility_Right(false);
		cancerLymphNodeDetails1.setSize_Right("size_Right");
		cancerLymphNodeDetails1.setVisitCode(0L);
		final List<CancerLymphNodeDetails> entities = List.of(cancerLymphNodeDetails1);
		when(mockCancerLymphNodeExaminationRepo.saveAll(entities)).thenReturn(Collections.emptyList());

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateLymphNodeExaminationDetails(wrapperOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateLymphNodeExaminationDetails_CancerLymphNodeExaminationRepoSaveAllThrowsOptimisticLockingFailureException() {
		// Setup
		final WrapperCancerSymptoms wrapperOBJ = new WrapperCancerSymptoms();
		final CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
		cancerSignAndSymptoms.setID(0L);
		cancerSignAndSymptoms.setBeneficiaryRegID(0L);
		cancerSignAndSymptoms.setBenVisitID(0L);
		cancerSignAndSymptoms.setProviderServiceMapID(0);
		cancerSignAndSymptoms.setShortnessOfBreath(false);
		cancerSignAndSymptoms.setCoughGTE2Weeks(false);
		cancerSignAndSymptoms.setBloodInSputum(false);
		cancerSignAndSymptoms.setDifficultyInOpeningMouth(false);
		cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(false);
		cancerSignAndSymptoms.setChangeInTheToneOfVoice(false);
		cancerSignAndSymptoms.setLumpInTheBreast(false);
		cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(false);
		cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(false);
		cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(false);
		cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(false);
		cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(false);
		cancerSignAndSymptoms.setBreastEnlargement(false);
		cancerSignAndSymptoms.setLymphNode_Enlarged(false);
		cancerSignAndSymptoms.setBriefHistory("observation");
		cancerSignAndSymptoms.setProcessed("processed");
		cancerSignAndSymptoms.setCreatedBy("createdBy");
		cancerSignAndSymptoms.setModifiedBy("createdBy");
		cancerSignAndSymptoms.setVisitCode(0L);
		wrapperOBJ.setCancerSignAndSymptoms(cancerSignAndSymptoms);
		final CancerLymphNodeDetails cancerLymphNodeDetails = new CancerLymphNodeDetails();
		cancerLymphNodeDetails.setID(0L);
		cancerLymphNodeDetails.setBenVisitID(0L);
		cancerLymphNodeDetails.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails.setMobility_Left(false);
		cancerLymphNodeDetails.setSize_Left("size_Left");
		cancerLymphNodeDetails.setMobility_Right(false);
		cancerLymphNodeDetails.setSize_Right("size_Right");
		cancerLymphNodeDetails.setVisitCode(0L);
		wrapperOBJ.setCancerLymphNodeDetails(List.of(cancerLymphNodeDetails));

		when(mockCancerLymphNodeExaminationRepo.deleteExistingLymphNodeDetails(0L, "N")).thenReturn(0);

		// Configure CancerLymphNodeExaminationRepo.saveAll(...).
		final CancerLymphNodeDetails cancerLymphNodeDetails1 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails1.setID(0L);
		cancerLymphNodeDetails1.setBenVisitID(0L);
		cancerLymphNodeDetails1.setLymphNodeName("lymphNodeName");
		cancerLymphNodeDetails1.setMobility_Left(false);
		cancerLymphNodeDetails1.setSize_Left("size_Left");
		cancerLymphNodeDetails1.setMobility_Right(false);
		cancerLymphNodeDetails1.setSize_Right("size_Right");
		cancerLymphNodeDetails1.setVisitCode(0L);
		final List<CancerLymphNodeDetails> entities = List.of(cancerLymphNodeDetails1);
		when(mockCancerLymphNodeExaminationRepo.saveAll(entities)).thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateLymphNodeExaminationDetails(wrapperOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerOralDetails() {
		// Setup
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);

		when(mockCancerOralExaminationRepo.getCancerOralExaminationStatus(0L, 0L)).thenReturn("result");
		when(mockCancerOralExaminationRepo.updateCancerOralExaminationDetails(0, "limitedMouthOpening", false,
				"preMalignantLesionType", false, false, "observation", "createdBy", 0L, 0L, "processed")).thenReturn(0);

		// Configure CancerOralExaminationRepo.save(...).
		final CancerOralExamination cancerOralExamination1 = new CancerOralExamination();
		cancerOralExamination1.setID(0L);
		cancerOralExamination1.setBeneficiaryRegID(0L);
		cancerOralExamination1.setProviderServiceMapID(0);
		cancerOralExamination1.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination1.setPremalignantLesions(false);
		cancerOralExamination1.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination1.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination1.setProlongedIrritation(false);
		cancerOralExamination1.setChronicBurningSensation(false);
		cancerOralExamination1.setObservation("observation");
		cancerOralExamination1.setProcessed("processed");
		cancerOralExamination1.setCreatedBy("createdBy");
		cancerOralExamination1.setModifiedBy("createdBy");
		cancerOralExamination1.setVisitCode(0L);
		when(mockCancerOralExaminationRepo.save(any(CancerOralExamination.class))).thenReturn(cancerOralExamination1);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateCancerOralDetails(cancerOralExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerOralDetails_CancerOralExaminationRepoGetCancerOralExaminationStatusReturnsNull() {
		// Setup
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);

		// Configure CancerOralExaminationRepo.save(...).
		final CancerOralExamination cancerOralExamination1 = new CancerOralExamination();
		cancerOralExamination1.setID(0L);
		cancerOralExamination1.setBeneficiaryRegID(0L);
		cancerOralExamination1.setProviderServiceMapID(0);
		cancerOralExamination1.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination1.setPremalignantLesions(false);
		cancerOralExamination1.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination1.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination1.setProlongedIrritation(false);
		cancerOralExamination1.setChronicBurningSensation(false);
		cancerOralExamination1.setObservation("observation");
		cancerOralExamination1.setProcessed("processed");
		cancerOralExamination1.setCreatedBy("createdBy");
		cancerOralExamination1.setModifiedBy("createdBy");
		cancerOralExamination1.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateCancerOralDetails(cancerOralExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerOralDetails_CancerOralExaminationRepoSaveReturnsNull() {
		// Setup
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateCancerOralDetails(cancerOralExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerOralDetails_CancerOralExaminationRepoSaveThrowsOptimisticLockingFailureException() {
		// Setup
		final CancerOralExamination cancerOralExamination = new CancerOralExamination();
		cancerOralExamination.setID(0L);
		cancerOralExamination.setBeneficiaryRegID(0L);
		cancerOralExamination.setProviderServiceMapID(0);
		cancerOralExamination.setLimitedMouthOpening("limitedMouthOpening");
		cancerOralExamination.setPremalignantLesions(false);
		cancerOralExamination.setPreMalignantLesionType("preMalignantLesionType");
		cancerOralExamination.setPreMalignantLesionTypeList(List.of("value"));
		cancerOralExamination.setProlongedIrritation(false);
		cancerOralExamination.setChronicBurningSensation(false);
		cancerOralExamination.setObservation("observation");
		cancerOralExamination.setProcessed("processed");
		cancerOralExamination.setCreatedBy("createdBy");
		cancerOralExamination.setModifiedBy("createdBy");
		cancerOralExamination.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateCancerOralDetails(cancerOralExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerBreastDetails() {
		// Setup
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);

		when(mockCancerBreastExaminationRepo.getCancerBreastExaminationStatus(0L, 0L)).thenReturn("result");
		when(mockCancerBreastExaminationRepo.updateCancerBreastExaminatio(0, false, false, false, false, false, false,
				false, false, "lumpSize", "lumpShape", "lumpTexture", false, "mamogramReport", "createdBy", 0L, 0L,
				"processed")).thenReturn(0);

		// Configure CancerBreastExaminationRepo.save(...).
		final CancerBreastExamination cancerBreastExamination1 = new CancerBreastExamination();
		cancerBreastExamination1.setID(0L);
		cancerBreastExamination1.setBeneficiaryRegID(0L);
		cancerBreastExamination1.setProviderServiceMapID(0);
		cancerBreastExamination1.setEverBreastFed(false);
		cancerBreastExamination1.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination1.setBreastsAppear_Normal(false);
		cancerBreastExamination1.setRashOnBreast(false);
		cancerBreastExamination1.setDimplingSkinOnBreast(false);
		cancerBreastExamination1.setDischargeFromNipple(false);
		cancerBreastExamination1.setPeaudOrange(false);
		cancerBreastExamination1.setLumpInBreast(false);
		cancerBreastExamination1.setLumpSize("lumpSize");
		cancerBreastExamination1.setLumpShape("lumpShape");
		cancerBreastExamination1.setLumpTexture("lumpTexture");
		cancerBreastExamination1.setReferredToMammogram(false);
		cancerBreastExamination1.setMamogramReport("mamogramReport");
		cancerBreastExamination1.setProcessed("processed");
		cancerBreastExamination1.setCreatedBy("createdBy");
		cancerBreastExamination1.setModifiedBy("createdBy");
		cancerBreastExamination1.setVisitCode(0L);
		when(mockCancerBreastExaminationRepo.save(any(CancerBreastExamination.class)))
				.thenReturn(cancerBreastExamination1);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateCancerBreastDetails(cancerBreastExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerBreastDetails_CancerBreastExaminationRepoGetCancerBreastExaminationStatusReturnsNull() {
		// Setup
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);

		when(mockCancerBreastExaminationRepo.getCancerBreastExaminationStatus(0L, 0L)).thenReturn(null);

		// Configure CancerBreastExaminationRepo.save(...).
		final CancerBreastExamination cancerBreastExamination1 = new CancerBreastExamination();
		cancerBreastExamination1.setID(0L);
		cancerBreastExamination1.setBeneficiaryRegID(0L);
		cancerBreastExamination1.setProviderServiceMapID(0);
		cancerBreastExamination1.setEverBreastFed(false);
		cancerBreastExamination1.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination1.setBreastsAppear_Normal(false);
		cancerBreastExamination1.setRashOnBreast(false);
		cancerBreastExamination1.setDimplingSkinOnBreast(false);
		cancerBreastExamination1.setDischargeFromNipple(false);
		cancerBreastExamination1.setPeaudOrange(false);
		cancerBreastExamination1.setLumpInBreast(false);
		cancerBreastExamination1.setLumpSize("lumpSize");
		cancerBreastExamination1.setLumpShape("lumpShape");
		cancerBreastExamination1.setReferredToMammogram(false);
		cancerBreastExamination1.setMamogramReport("mamogramReport");
		cancerBreastExamination1.setProcessed("processed");
		cancerBreastExamination1.setCreatedBy("createdBy");
		cancerBreastExamination1.setModifiedBy("createdBy");
		cancerBreastExamination1.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateCancerBreastDetails(cancerBreastExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerBreastDetails_CancerBreastExaminationRepoSaveReturnsNull() {
		// Setup
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateCancerBreastDetails(cancerBreastExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerBreastDetails_CancerBreastExaminationRepoSaveThrowsOptimisticLockingFailureException() {
		// Setup
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateCancerBreastDetails(cancerBreastExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerBreastExamination() {
		// Setup
		final CancerBreastExamination cancerBreastExamination = new CancerBreastExamination();
		cancerBreastExamination.setID(0L);
		cancerBreastExamination.setBeneficiaryRegID(0L);
		cancerBreastExamination.setProviderServiceMapID(0);
		cancerBreastExamination.setEverBreastFed(false);
		cancerBreastExamination.setBreastFeedingDurationGTE6months(false);
		cancerBreastExamination.setBreastsAppear_Normal(false);
		cancerBreastExamination.setRashOnBreast(false);
		cancerBreastExamination.setDimplingSkinOnBreast(false);
		cancerBreastExamination.setDischargeFromNipple(false);
		cancerBreastExamination.setPeaudOrange(false);
		cancerBreastExamination.setLumpInBreast(false);
		cancerBreastExamination.setLumpSize("lumpSize");
		cancerBreastExamination.setLumpShape("lumpShape");
		cancerBreastExamination.setLumpTexture("lumpTexture");
		cancerBreastExamination.setReferredToMammogram(false);
		cancerBreastExamination.setMamogramReport("mamogramReport");
		cancerBreastExamination.setProcessed("processed");
		cancerBreastExamination.setCreatedBy("createdBy");
		cancerBreastExamination.setModifiedBy("createdBy");
		cancerBreastExamination.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateCancerBreastExamination(cancerBreastExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerAbdominalExaminationDetails() {
		// Setup
		final CancerAbdominalExamination cancerAbdominalExamination = new CancerAbdominalExamination();
		cancerAbdominalExamination.setID(0L);
		cancerAbdominalExamination.setBeneficiaryRegID(0L);
		cancerAbdominalExamination.setProviderServiceMapID(0);
		cancerAbdominalExamination.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination.setLiver("liver");
		cancerAbdominalExamination.setAscites_Present(false);
		cancerAbdominalExamination.setAnyOtherMass_Present(false);
		cancerAbdominalExamination.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination.setObservation("observation");
		cancerAbdominalExamination.setProcessed("processed");
		cancerAbdominalExamination.setCreatedBy("createdBy");
		cancerAbdominalExamination.setModifiedBy("createdBy");
		cancerAbdominalExamination.setVisitCode(0L);

		when(mockCancerAbdominalExaminationRepo.getCancerAbdominalExaminationStatus(0L, 0L)).thenReturn("result");
		when(mockCancerAbdominalExaminationRepo.updateCancerAbdominalExamination(0, false, "liver", false, false, false,
				false, false, false, false, false, false, "observation", "createdBy", 0L, 0L, "processed"))
				.thenReturn(0);

		// Configure CancerAbdominalExaminationRepo.save(...).
		final CancerAbdominalExamination cancerAbdominalExamination1 = new CancerAbdominalExamination();
		cancerAbdominalExamination1.setID(0L);
		cancerAbdominalExamination1.setBeneficiaryRegID(0L);
		cancerAbdominalExamination1.setProviderServiceMapID(0);
		cancerAbdominalExamination1.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination1.setLiver("liver");
		cancerAbdominalExamination1.setAscites_Present(false);
		cancerAbdominalExamination1.setAnyOtherMass_Present(false);
		cancerAbdominalExamination1.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination1.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination1.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination1.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination1.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination1.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination1.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination1.setObservation("observation");
		cancerAbdominalExamination1.setProcessed("processed");
		cancerAbdominalExamination1.setCreatedBy("createdBy");
		cancerAbdominalExamination1.setModifiedBy("createdBy");
		cancerAbdominalExamination1.setVisitCode(0L);
		when(mockCancerAbdominalExaminationRepo.save(any(CancerAbdominalExamination.class)))
				.thenReturn(cancerAbdominalExamination1);

		// Run the test
		final int result = csNurseServiceImplUnderTest
				.updateCancerAbdominalExaminationDetails(cancerAbdominalExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerAbdominalExaminationDetails_CancerAbdominalExaminationRepoSaveReturnsNull() {
		// Setup
		final CancerAbdominalExamination cancerAbdominalExamination = new CancerAbdominalExamination();
		cancerAbdominalExamination.setID(0L);
		cancerAbdominalExamination.setBeneficiaryRegID(0L);
		cancerAbdominalExamination.setProviderServiceMapID(0);
		cancerAbdominalExamination.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination.setLiver("liver");
		cancerAbdominalExamination.setAscites_Present(false);
		cancerAbdominalExamination.setAnyOtherMass_Present(false);
		cancerAbdominalExamination.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination.setObservation("observation");
		cancerAbdominalExamination.setProcessed("processed");
		cancerAbdominalExamination.setCreatedBy("createdBy");
		cancerAbdominalExamination.setModifiedBy("createdBy");
		cancerAbdominalExamination.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest
				.updateCancerAbdominalExaminationDetails(cancerAbdominalExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerAbdominalExaminationDetails_CancerAbdominalExaminationRepoSaveThrowsOptimisticLockingFailureException() {
		// Setup
		final CancerAbdominalExamination cancerAbdominalExamination = new CancerAbdominalExamination();
		cancerAbdominalExamination.setID(0L);
		cancerAbdominalExamination.setBeneficiaryRegID(0L);
		cancerAbdominalExamination.setProviderServiceMapID(0);
		cancerAbdominalExamination.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination.setLiver("liver");
		cancerAbdominalExamination.setAscites_Present(false);
		cancerAbdominalExamination.setAnyOtherMass_Present(false);
		cancerAbdominalExamination.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination.setObservation("observation");
		cancerAbdominalExamination.setProcessed("processed");
		cancerAbdominalExamination.setCreatedBy("createdBy");
		cancerAbdominalExamination.setModifiedBy("createdBy");
		cancerAbdominalExamination.setVisitCode(0L);

		when(mockCancerAbdominalExaminationRepo.getCancerAbdominalExaminationStatus(0L, 0L)).thenReturn("result");

		// Run the test
		final int result = csNurseServiceImplUnderTest
				.updateCancerAbdominalExaminationDetails(cancerAbdominalExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerAbdominalExamination() {
		// Setup
		final CancerAbdominalExamination cancerAbdominalExamination = new CancerAbdominalExamination();
		cancerAbdominalExamination.setID(0L);
		cancerAbdominalExamination.setBeneficiaryRegID(0L);
		cancerAbdominalExamination.setProviderServiceMapID(0);
		cancerAbdominalExamination.setAbdominalInspection_Normal(false);
		cancerAbdominalExamination.setLiver("liver");
		cancerAbdominalExamination.setAscites_Present(false);
		cancerAbdominalExamination.setAnyOtherMass_Present(false);
		cancerAbdominalExamination.setLymphNodes_Enlarged(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Left(false);
		cancerAbdominalExamination.setLymphNode_Inguinal_Right(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Left(false);
		cancerAbdominalExamination.setLymphNode_ExternalIliac_Right(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Left(false);
		cancerAbdominalExamination.setLymphNode_ParaAortic_Right(false);
		cancerAbdominalExamination.setObservation("observation");
		cancerAbdominalExamination.setProcessed("processed");
		cancerAbdominalExamination.setCreatedBy("createdBy");
		cancerAbdominalExamination.setModifiedBy("createdBy");
		cancerAbdominalExamination.setVisitCode(0L);

		when(mockCancerAbdominalExaminationRepo.updateCancerAbdominalExamination(0, false, "liver", false, false, false,
				false, false, false, false, false, false, "observation", "createdBy", 0L, 0L, "processed"))
				.thenReturn(0);

		// Run the test
		final int result = csNurseServiceImplUnderTest.updateCancerAbdominalExamination(cancerAbdominalExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerGynecologicalExaminationDetails() {
		// Setup
		final CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
		cancerGynecologicalExamination.setID(0L);
		cancerGynecologicalExamination.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination.setProviderServiceMapID(0);
		cancerGynecologicalExamination.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination.setVulvalInvolvement(false);
		cancerGynecologicalExamination.setVaginalInvolvement(false);
		cancerGynecologicalExamination.setUterus_Normal(false);
		cancerGynecologicalExamination.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination.setFilePath("filePath");
		cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination.setObservation("observation");
		cancerGynecologicalExamination.setProcessed("processed");
		cancerGynecologicalExamination.setCreatedBy("createdBy");
		cancerGynecologicalExamination.setModifiedBy("createdBy");
		cancerGynecologicalExamination.setVisitCode(0L);

		when(mockCancerGynecologicalExaminationRepo.getCancerGynecologicalExaminationStatus(0L, 0L))
				.thenReturn("result");
		when(mockCancerGynecologicalExaminationRepo.updateCancerGynecologicalExamination(0, "appearanceOfCervix",
				"typeOfLesion", false, false, false, false, "rTIOrSTIDetail", "filePath", false, "observation",
				"createdBy", 0L, 0L, "processed")).thenReturn(0);

		// Configure CancerGynecologicalExaminationRepo.save(...).
		final CancerGynecologicalExamination cancerGynecologicalExamination1 = new CancerGynecologicalExamination();
		cancerGynecologicalExamination1.setID(0L);
		cancerGynecologicalExamination1.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination1.setProviderServiceMapID(0);
		cancerGynecologicalExamination1.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination1.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination1.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination1.setVulvalInvolvement(false);
		cancerGynecologicalExamination1.setVaginalInvolvement(false);
		cancerGynecologicalExamination1.setUterus_Normal(false);
		cancerGynecologicalExamination1.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination1.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination1.setFilePath("filePath");
		cancerGynecologicalExamination1.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination1.setObservation("observation");
		cancerGynecologicalExamination1.setProcessed("processed");
		cancerGynecologicalExamination1.setCreatedBy("createdBy");
		cancerGynecologicalExamination1.setModifiedBy("createdBy");
		cancerGynecologicalExamination1.setVisitCode(0L);
		when(mockCancerGynecologicalExaminationRepo.save(any(CancerGynecologicalExamination.class)))
				.thenReturn(cancerGynecologicalExamination1);

		// Run the test
		final int result = csNurseServiceImplUnderTest
				.updateCancerGynecologicalExaminationDetails(cancerGynecologicalExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerGynecologicalExaminationDetails_CancerGynecologicalExaminationRepoGetCancerGynecologicalExaminationStatusReturnsNull() {
		// Setup
		final CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
		cancerGynecologicalExamination.setID(0L);
		cancerGynecologicalExamination.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination.setProviderServiceMapID(0);
		cancerGynecologicalExamination.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination.setVulvalInvolvement(false);
		cancerGynecologicalExamination.setVaginalInvolvement(false);
		cancerGynecologicalExamination.setUterus_Normal(false);
		cancerGynecologicalExamination.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination.setFilePath("filePath");
		cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination.setObservation("observation");
		cancerGynecologicalExamination.setProcessed("processed");
		cancerGynecologicalExamination.setCreatedBy("createdBy");
		cancerGynecologicalExamination.setModifiedBy("createdBy");
		cancerGynecologicalExamination.setVisitCode(0L);

		when(mockCancerGynecologicalExaminationRepo.getCancerGynecologicalExaminationStatus(0L, 0L)).thenReturn(null);

		// Configure CancerGynecologicalExaminationRepo.save(...).
		final CancerGynecologicalExamination cancerGynecologicalExamination1 = new CancerGynecologicalExamination();
		cancerGynecologicalExamination1.setID(0L);
		cancerGynecologicalExamination1.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination1.setProviderServiceMapID(0);
		cancerGynecologicalExamination1.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination1.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination1.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination1.setVulvalInvolvement(false);
		cancerGynecologicalExamination1.setVaginalInvolvement(false);
		cancerGynecologicalExamination1.setUterus_Normal(false);
		cancerGynecologicalExamination1.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination1.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination1.setFilePath("filePath");
		cancerGynecologicalExamination1.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination1.setObservation("observation");
		cancerGynecologicalExamination1.setProcessed("processed");
		cancerGynecologicalExamination1.setCreatedBy("createdBy");
		cancerGynecologicalExamination1.setModifiedBy("createdBy");
		cancerGynecologicalExamination1.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest
				.updateCancerGynecologicalExaminationDetails(cancerGynecologicalExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerGynecologicalExaminationDetails_CancerGynecologicalExaminationRepoSaveReturnsNull() {
		// Setup
		final CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
		cancerGynecologicalExamination.setID(0L);
		cancerGynecologicalExamination.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination.setProviderServiceMapID(0);
		cancerGynecologicalExamination.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination.setVulvalInvolvement(false);
		cancerGynecologicalExamination.setVaginalInvolvement(false);
		cancerGynecologicalExamination.setUterus_Normal(false);
		cancerGynecologicalExamination.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination.setFilePath("filePath");
		cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination.setObservation("observation");
		cancerGynecologicalExamination.setProcessed("processed");
		cancerGynecologicalExamination.setCreatedBy("createdBy");
		cancerGynecologicalExamination.setModifiedBy("createdBy");
		cancerGynecologicalExamination.setVisitCode(0L);

		when(mockCancerGynecologicalExaminationRepo.getCancerGynecologicalExaminationStatus(0L, 0L))
				.thenReturn("result");

		// Run the test
		final int result = csNurseServiceImplUnderTest
				.updateCancerGynecologicalExaminationDetails(cancerGynecologicalExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerGynecologicalExaminationDetails_CancerGynecologicalExaminationRepoSaveThrowsOptimisticLockingFailureException() {
		// Setup
		final CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
		cancerGynecologicalExamination.setID(0L);
		cancerGynecologicalExamination.setBeneficiaryRegID(0L);
		cancerGynecologicalExamination.setProviderServiceMapID(0);
		cancerGynecologicalExamination.setAppearanceOfCervix("appearanceOfCervix");
		cancerGynecologicalExamination.setTypeOfLesion("typeOfLesion");
		cancerGynecologicalExamination.setTypeOfLesionList(List.of("value"));
		cancerGynecologicalExamination.setVulvalInvolvement(false);
		cancerGynecologicalExamination.setVaginalInvolvement(false);
		cancerGynecologicalExamination.setUterus_Normal(false);
		cancerGynecologicalExamination.setSufferedFromRTIOrSTI(false);
		cancerGynecologicalExamination.setrTIOrSTIDetail("rTIOrSTIDetail");
		cancerGynecologicalExamination.setFilePath("filePath");
		cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(false);
		cancerGynecologicalExamination.setObservation("observation");
		cancerGynecologicalExamination.setProcessed("processed");
		cancerGynecologicalExamination.setCreatedBy("createdBy");
		cancerGynecologicalExamination.setModifiedBy("createdBy");
		cancerGynecologicalExamination.setVisitCode(0L);

		// Run the test
		final int result = csNurseServiceImplUnderTest
				.updateCancerGynecologicalExaminationDetails(cancerGynecologicalExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerExamImgAnotasnDetails() {
		// Setup
		final CancerExaminationImageAnnotation cancerExaminationImageAnnotation = new CancerExaminationImageAnnotation();
		cancerExaminationImageAnnotation.setVanID(0);
		cancerExaminationImageAnnotation.setBeneficiaryRegID(0L);
		cancerExaminationImageAnnotation.setBenVisitID(0L);
		cancerExaminationImageAnnotation.setProviderServiceMapID(0);
		cancerExaminationImageAnnotation.setCancerImageID(0);
		cancerExaminationImageAnnotation.setxCoordinate(0);
		cancerExaminationImageAnnotation.setyCoordinate(0);
		cancerExaminationImageAnnotation.setPoint(0);
		cancerExaminationImageAnnotation.setPointDesc("pointDesc");
		cancerExaminationImageAnnotation.setCreatedBy("createdBy");
		cancerExaminationImageAnnotation.setModifiedBy("createdBy");
		cancerExaminationImageAnnotation.setParkingPlaceID(0);
		cancerExaminationImageAnnotation.setVisitCode(0L);
		final List<CancerExaminationImageAnnotation> cancerExaminationImageAnnotationList = List
				.of(cancerExaminationImageAnnotation);

		when(mockCancerExaminationImageAnnotationRepo.deleteExistingImageAnnotationDetails(0L, "N")).thenReturn(0);

		// Configure CancerExaminationImageAnnotationRepo.saveAll(...).
		final CancerExaminationImageAnnotation cancerExaminationImageAnnotation1 = new CancerExaminationImageAnnotation();
		cancerExaminationImageAnnotation1.setVanID(0);
		cancerExaminationImageAnnotation1.setBeneficiaryRegID(0L);
		cancerExaminationImageAnnotation1.setBenVisitID(0L);
		cancerExaminationImageAnnotation1.setProviderServiceMapID(0);
		cancerExaminationImageAnnotation1.setCancerImageID(0);
		cancerExaminationImageAnnotation1.setxCoordinate(0);
		cancerExaminationImageAnnotation1.setyCoordinate(0);
		cancerExaminationImageAnnotation1.setPoint(0);
		cancerExaminationImageAnnotation1.setPointDesc("pointDesc");
		cancerExaminationImageAnnotation1.setCreatedBy("createdBy");
		cancerExaminationImageAnnotation1.setModifiedBy("createdBy");
		cancerExaminationImageAnnotation1.setParkingPlaceID(0);
		cancerExaminationImageAnnotation1.setVisitCode(0L);
		final Iterable<CancerExaminationImageAnnotation> cancerExaminationImageAnnotations = List
				.of(cancerExaminationImageAnnotation1);
		final CancerExaminationImageAnnotation cancerExaminationImageAnnotation2 = new CancerExaminationImageAnnotation();
		cancerExaminationImageAnnotation2.setVanID(0);
		cancerExaminationImageAnnotation2.setBeneficiaryRegID(0L);
		cancerExaminationImageAnnotation2.setBenVisitID(0L);
		cancerExaminationImageAnnotation2.setProviderServiceMapID(0);
		cancerExaminationImageAnnotation2.setCancerImageID(0);
		cancerExaminationImageAnnotation2.setxCoordinate(0);
		cancerExaminationImageAnnotation2.setyCoordinate(0);
		cancerExaminationImageAnnotation2.setPoint(0);
		cancerExaminationImageAnnotation2.setPointDesc("pointDesc");
		cancerExaminationImageAnnotation2.setCreatedBy("createdBy");
		cancerExaminationImageAnnotation2.setModifiedBy("createdBy");
		cancerExaminationImageAnnotation2.setParkingPlaceID(0);
		cancerExaminationImageAnnotation2.setVisitCode(0L);
		final ArrayList<CancerExaminationImageAnnotation> entities = new ArrayList<>(
				List.of(cancerExaminationImageAnnotation2));
		when(mockCancerExaminationImageAnnotationRepo.saveAll(entities)).thenReturn(cancerExaminationImageAnnotations);

		// Run the test
		final int result = csNurseServiceImplUnderTest
				.updateCancerExamImgAnotasnDetails(cancerExaminationImageAnnotationList);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerExamImgAnotasnDetails_CancerExaminationImageAnnotationRepoGetCancerExaminationImageAnnotationDetailsStatusReturnsNoItems() {
		// Setup
		final CancerExaminationImageAnnotation cancerExaminationImageAnnotation = new CancerExaminationImageAnnotation();
		cancerExaminationImageAnnotation.setVanID(0);
		cancerExaminationImageAnnotation.setBeneficiaryRegID(0L);
		cancerExaminationImageAnnotation.setBenVisitID(0L);
		cancerExaminationImageAnnotation.setProviderServiceMapID(0);
		cancerExaminationImageAnnotation.setCancerImageID(0);
		cancerExaminationImageAnnotation.setxCoordinate(0);
		cancerExaminationImageAnnotation.setyCoordinate(0);
		cancerExaminationImageAnnotation.setPoint(0);
		cancerExaminationImageAnnotation.setPointDesc("pointDesc");
		cancerExaminationImageAnnotation.setCreatedBy("createdBy");
		cancerExaminationImageAnnotation.setModifiedBy("createdBy");
		cancerExaminationImageAnnotation.setParkingPlaceID(0);
		cancerExaminationImageAnnotation.setVisitCode(0L);
		final List<CancerExaminationImageAnnotation> cancerExaminationImageAnnotationList = List
				.of(cancerExaminationImageAnnotation);
		when(mockCancerExaminationImageAnnotationRepo.getCancerExaminationImageAnnotationDetailsStatus(0L, 0L,
				List.of(0))).thenReturn(new ArrayList<>());

		// Configure CancerExaminationImageAnnotationRepo.saveAll(...).
		final CancerExaminationImageAnnotation cancerExaminationImageAnnotation1 = new CancerExaminationImageAnnotation();
		cancerExaminationImageAnnotation1.setVanID(0);
		cancerExaminationImageAnnotation1.setBeneficiaryRegID(0L);
		cancerExaminationImageAnnotation1.setBenVisitID(0L);
		cancerExaminationImageAnnotation1.setProviderServiceMapID(0);
		cancerExaminationImageAnnotation1.setCancerImageID(0);
		cancerExaminationImageAnnotation1.setxCoordinate(0);
		cancerExaminationImageAnnotation1.setyCoordinate(0);
		cancerExaminationImageAnnotation1.setPoint(0);
		cancerExaminationImageAnnotation1.setPointDesc("pointDesc");
		cancerExaminationImageAnnotation1.setCreatedBy("createdBy");
		cancerExaminationImageAnnotation1.setModifiedBy("createdBy");
		cancerExaminationImageAnnotation1.setParkingPlaceID(0);
		cancerExaminationImageAnnotation1.setVisitCode(0L);
		final Iterable<CancerExaminationImageAnnotation> cancerExaminationImageAnnotations = List
				.of(cancerExaminationImageAnnotation1);
		final CancerExaminationImageAnnotation cancerExaminationImageAnnotation2 = new CancerExaminationImageAnnotation();
		cancerExaminationImageAnnotation2.setVanID(0);
		cancerExaminationImageAnnotation2.setBeneficiaryRegID(0L);
		cancerExaminationImageAnnotation2.setBenVisitID(0L);
		cancerExaminationImageAnnotation2.setProviderServiceMapID(0);
		cancerExaminationImageAnnotation2.setCancerImageID(0);
		cancerExaminationImageAnnotation2.setxCoordinate(0);
		cancerExaminationImageAnnotation2.setyCoordinate(0);
		cancerExaminationImageAnnotation2.setPoint(0);
		cancerExaminationImageAnnotation2.setPointDesc("pointDesc");
		cancerExaminationImageAnnotation2.setCreatedBy("createdBy");
		cancerExaminationImageAnnotation2.setModifiedBy("createdBy");
		cancerExaminationImageAnnotation2.setParkingPlaceID(0);
		cancerExaminationImageAnnotation2.setVisitCode(0L);
		final ArrayList<CancerExaminationImageAnnotation> entities = new ArrayList<>(
				List.of(cancerExaminationImageAnnotation2));
		when(mockCancerExaminationImageAnnotationRepo.saveAll(entities)).thenReturn(cancerExaminationImageAnnotations);

		// Run the test
		final int result = csNurseServiceImplUnderTest
				.updateCancerExamImgAnotasnDetails(cancerExaminationImageAnnotationList);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerExamImgAnotasnDetails_CancerExaminationImageAnnotationRepoSaveAllReturnsNoItems() {
		// Setup
		final CancerExaminationImageAnnotation cancerExaminationImageAnnotation = new CancerExaminationImageAnnotation();
		cancerExaminationImageAnnotation.setVanID(0);
		cancerExaminationImageAnnotation.setBeneficiaryRegID(0L);
		cancerExaminationImageAnnotation.setBenVisitID(0L);
		cancerExaminationImageAnnotation.setProviderServiceMapID(0);
		cancerExaminationImageAnnotation.setCancerImageID(0);
		cancerExaminationImageAnnotation.setxCoordinate(0);
		cancerExaminationImageAnnotation.setyCoordinate(0);
		cancerExaminationImageAnnotation.setPoint(0);
		cancerExaminationImageAnnotation.setPointDesc("pointDesc");
		cancerExaminationImageAnnotation.setCreatedBy("createdBy");
		cancerExaminationImageAnnotation.setModifiedBy("createdBy");
		cancerExaminationImageAnnotation.setParkingPlaceID(0);
		cancerExaminationImageAnnotation.setVisitCode(0L);
		final List<CancerExaminationImageAnnotation> cancerExaminationImageAnnotationList = List
				.of(cancerExaminationImageAnnotation);

		// Configure CancerExaminationImageAnnotationRepo.saveAll(...).
		final CancerExaminationImageAnnotation cancerExaminationImageAnnotation1 = new CancerExaminationImageAnnotation();
		cancerExaminationImageAnnotation1.setVanID(0);
		cancerExaminationImageAnnotation1.setBeneficiaryRegID(0L);
		cancerExaminationImageAnnotation1.setBenVisitID(0L);
		cancerExaminationImageAnnotation1.setProviderServiceMapID(0);
		cancerExaminationImageAnnotation1.setCancerImageID(0);
		cancerExaminationImageAnnotation1.setxCoordinate(0);
		cancerExaminationImageAnnotation1.setyCoordinate(0);
		cancerExaminationImageAnnotation1.setPoint(0);
		cancerExaminationImageAnnotation1.setPointDesc("pointDesc");
		cancerExaminationImageAnnotation1.setCreatedBy("createdBy");
		cancerExaminationImageAnnotation1.setModifiedBy("createdBy");
		cancerExaminationImageAnnotation1.setParkingPlaceID(0);
		cancerExaminationImageAnnotation1.setVisitCode(0L);
		final ArrayList<CancerExaminationImageAnnotation> entities = new ArrayList<>(
				List.of(cancerExaminationImageAnnotation1));

		// Run the test
		final int result = csNurseServiceImplUnderTest
				.updateCancerExamImgAnotasnDetails(cancerExaminationImageAnnotationList);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateCancerExamImgAnotasnDetails_CancerExaminationImageAnnotationRepoSaveAllThrowsOptimisticLockingFailureException() {
		// Setup
		final CancerExaminationImageAnnotation cancerExaminationImageAnnotation = new CancerExaminationImageAnnotation();
		cancerExaminationImageAnnotation.setVanID(0);
		cancerExaminationImageAnnotation.setBeneficiaryRegID(0L);
		cancerExaminationImageAnnotation.setBenVisitID(0L);
		cancerExaminationImageAnnotation.setProviderServiceMapID(0);
		cancerExaminationImageAnnotation.setCancerImageID(0);
		cancerExaminationImageAnnotation.setxCoordinate(0);
		cancerExaminationImageAnnotation.setyCoordinate(0);
		cancerExaminationImageAnnotation.setPoint(0);
		cancerExaminationImageAnnotation.setPointDesc("pointDesc");
		cancerExaminationImageAnnotation.setCreatedBy("createdBy");
		cancerExaminationImageAnnotation.setModifiedBy("createdBy");
		cancerExaminationImageAnnotation.setParkingPlaceID(0);
		cancerExaminationImageAnnotation.setVisitCode(0L);
		final List<CancerExaminationImageAnnotation> cancerExaminationImageAnnotationList = List
				.of(cancerExaminationImageAnnotation);

		// Configure CancerExaminationImageAnnotationRepo.saveAll(...).
		final CancerExaminationImageAnnotation cancerExaminationImageAnnotation1 = new CancerExaminationImageAnnotation();
		cancerExaminationImageAnnotation1.setVanID(0);
		cancerExaminationImageAnnotation1.setBeneficiaryRegID(0L);
		cancerExaminationImageAnnotation1.setBenVisitID(0L);
		cancerExaminationImageAnnotation1.setProviderServiceMapID(0);
		cancerExaminationImageAnnotation1.setCancerImageID(0);
		cancerExaminationImageAnnotation1.setxCoordinate(0);
		cancerExaminationImageAnnotation1.setyCoordinate(0);
		cancerExaminationImageAnnotation1.setPoint(0);
		cancerExaminationImageAnnotation1.setPointDesc("pointDesc");
		cancerExaminationImageAnnotation1.setCreatedBy("createdBy");
		cancerExaminationImageAnnotation1.setModifiedBy("createdBy");
		cancerExaminationImageAnnotation1.setParkingPlaceID(0);
		cancerExaminationImageAnnotation1.setVisitCode(0L);
		final ArrayList<CancerExaminationImageAnnotation> entities = new ArrayList<>(
				List.of(cancerExaminationImageAnnotation1));

		// Run the test
		final int result = csNurseServiceImplUnderTest
				.updateCancerExamImgAnotasnDetails(cancerExaminationImageAnnotationList);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}
}
