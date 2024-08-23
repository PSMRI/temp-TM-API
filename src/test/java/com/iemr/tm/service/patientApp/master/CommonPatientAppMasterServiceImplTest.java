package com.iemr.tm.service.patientApp.master;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import com.iemr.tm.data.covid19.CovidContactHistoryMaster;
import com.iemr.tm.data.covid19.CovidRecommendationMaster;
import com.iemr.tm.data.covid19.CovidSymptomsMaster;
import com.iemr.tm.data.nurse.BeneficiaryVisitDetail;
import com.iemr.tm.repo.benFlowStatus.BeneficiaryFlowStatusRepo;
import com.iemr.tm.repo.doctor.ChiefComplaintMasterRepo;
import com.iemr.tm.repo.masterrepo.covid19.CovidContactHistoryMasterRepo;
import com.iemr.tm.repo.masterrepo.covid19.CovidRecommnedationMasterRepo;
import com.iemr.tm.repo.masterrepo.covid19.CovidSymptomsMasterRepo;
import com.iemr.tm.repo.nurse.BenVisitDetailRepo;
import com.iemr.tm.repo.quickBlox.QuickBloxRepo;
import com.iemr.tm.service.common.transaction.CommonNurseServiceImpl;
import com.iemr.tm.service.common.transaction.CommonServiceImpl;
import com.iemr.tm.service.covid19.Covid19ServiceImpl;
import com.iemr.tm.service.generalOPD.GeneralOPDDoctorServiceImpl;

@ExtendWith(MockitoExtension.class)
class CommonPatientAppMasterServiceImplTest {

	@Mock
	private CovidSymptomsMasterRepo mockCovidSymptomsMasterRepo;
	@Mock
	private CovidContactHistoryMasterRepo mockCovidContactHistoryMasterRepo;
	@Mock
	private CovidRecommnedationMasterRepo mockCovidRecommnedationMasterRepo;
	@Mock
	private ChiefComplaintMasterRepo mockChiefComplaintMasterRepo;
	@Mock
	private CommonNurseServiceImpl mockCommonNurseServiceImpl;
	@Mock
	private Covid19ServiceImpl mockCovid19ServiceImpl;
	@Mock
	private BenVisitDetailRepo mockBenVisitDetailRepo;
	@Mock
	private CommonServiceImpl mockCommonServiceImpl;
	@Mock
	private BeneficiaryFlowStatusRepo mockBeneficiaryFlowStatusRepo;
	@Mock
	private GeneralOPDDoctorServiceImpl mockGeneralOPDDoctorServiceImpl;
	@Mock
	private QuickBloxRepo mockQuickBloxRepo;

	@InjectMocks
	private CommonPatientAppMasterServiceImpl commonPatientAppMasterServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		ReflectionTestUtils.setField(commonPatientAppMasterServiceImplUnderTest, "servicePointID", 0);
		ReflectionTestUtils.setField(commonPatientAppMasterServiceImplUnderTest, "parkingPlaceID", 0);
		ReflectionTestUtils.setField(commonPatientAppMasterServiceImplUnderTest, "providerServiceMapID", 0);
		ReflectionTestUtils.setField(commonPatientAppMasterServiceImplUnderTest, "vanID", 0);
		ReflectionTestUtils.setField(commonPatientAppMasterServiceImplUnderTest, "serviceID", 0);
		ReflectionTestUtils.setField(commonPatientAppMasterServiceImplUnderTest, "providerID", 0);
		ReflectionTestUtils.setField(commonPatientAppMasterServiceImplUnderTest, "appId", 0);
		ReflectionTestUtils.setField(commonPatientAppMasterServiceImplUnderTest, "authKey", "authKey");
		ReflectionTestUtils.setField(commonPatientAppMasterServiceImplUnderTest, "authSecret", "authSecret");
		ReflectionTestUtils.setField(commonPatientAppMasterServiceImplUnderTest, "schedulingSlotSize", 0);
	}

	@Test
	void testGetChiefComplaintsMaster() {

		// Run the test
		final String result = commonPatientAppMasterServiceImplUnderTest.getChiefComplaintsMaster(0, 0, "gender");

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetChiefComplaintsMaster_ChiefComplaintMasterRepoReturnsNoItems() {
		// Setup
		when(mockChiefComplaintMasterRepo.getChiefComplaintMaster()).thenReturn(new ArrayList<>());

		// Run the test
		final String result = commonPatientAppMasterServiceImplUnderTest.getChiefComplaintsMaster(0, 0, "gender");

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetCovidMaster() {
		// Setup
		// Configure CovidSymptomsMasterRepo.findByDeleted(...).
		final CovidSymptomsMaster covidSymptomsMaster = new CovidSymptomsMaster();

		covidSymptomsMaster.toString();

		final ArrayList<CovidSymptomsMaster> covidSymptomsMasters = new ArrayList<>(List.of(covidSymptomsMaster));
		when(mockCovidSymptomsMasterRepo.findByDeleted(false)).thenReturn(covidSymptomsMasters);

		// Configure CovidContactHistoryMasterRepo.findByDeleted(...).
		final CovidContactHistoryMaster covidContactHistoryMaster = new CovidContactHistoryMaster();

		covidContactHistoryMaster.toString();

		final ArrayList<CovidContactHistoryMaster> covidContactHistoryMasters = new ArrayList<>(
				List.of(covidContactHistoryMaster));
		when(mockCovidContactHistoryMasterRepo.findByDeleted(false)).thenReturn(covidContactHistoryMasters);

		// Configure CovidRecommnedationMasterRepo.findByDeleted(...).
		final CovidRecommendationMaster covidRecommendationMaster = new CovidRecommendationMaster();

		covidRecommendationMaster.toString();

		final ArrayList<CovidRecommendationMaster> covidRecommendationMasters = new ArrayList<>(
				List.of(covidRecommendationMaster));
		when(mockCovidRecommnedationMasterRepo.findByDeleted(false)).thenReturn(covidRecommendationMasters);

		// Run the test
		final String result = commonPatientAppMasterServiceImplUnderTest.getCovidMaster(0, 0, "gender");

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetCovidMaster_CovidSymptomsMasterRepoReturnsNoItems() {
		// Setup
		when(mockCovidSymptomsMasterRepo.findByDeleted(false)).thenReturn(new ArrayList<>());

		// Configure CovidContactHistoryMasterRepo.findByDeleted(...).
		final CovidContactHistoryMaster covidContactHistoryMaster = new CovidContactHistoryMaster();
		final ArrayList<CovidContactHistoryMaster> covidContactHistoryMasters = new ArrayList<>(
				List.of(covidContactHistoryMaster));
		when(mockCovidContactHistoryMasterRepo.findByDeleted(false)).thenReturn(covidContactHistoryMasters);

		// Configure CovidRecommnedationMasterRepo.findByDeleted(...).
		final CovidRecommendationMaster covidRecommendationMaster = new CovidRecommendationMaster();
		final ArrayList<CovidRecommendationMaster> covidRecommendationMasters = new ArrayList<>(
				List.of(covidRecommendationMaster));
		when(mockCovidRecommnedationMasterRepo.findByDeleted(false)).thenReturn(covidRecommendationMasters);

		// Run the test
		final String result = commonPatientAppMasterServiceImplUnderTest.getCovidMaster(0, 0, "gender");

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetCovidMaster_CovidContactHistoryMasterRepoReturnsNoItems() {
		// Setup
		// Configure CovidSymptomsMasterRepo.findByDeleted(...).
		final CovidSymptomsMaster covidSymptomsMaster = new CovidSymptomsMaster();
		final ArrayList<CovidSymptomsMaster> covidSymptomsMasters = new ArrayList<>(List.of(covidSymptomsMaster));
		when(mockCovidSymptomsMasterRepo.findByDeleted(false)).thenReturn(covidSymptomsMasters);

		when(mockCovidContactHistoryMasterRepo.findByDeleted(false)).thenReturn(new ArrayList<>());

		// Configure CovidRecommnedationMasterRepo.findByDeleted(...).
		final CovidRecommendationMaster covidRecommendationMaster = new CovidRecommendationMaster();
		final ArrayList<CovidRecommendationMaster> covidRecommendationMasters = new ArrayList<>(
				List.of(covidRecommendationMaster));
		when(mockCovidRecommnedationMasterRepo.findByDeleted(false)).thenReturn(covidRecommendationMasters);

		// Run the test
		final String result = commonPatientAppMasterServiceImplUnderTest.getCovidMaster(0, 0, "gender");

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetCovidMaster_CovidRecommnedationMasterRepoReturnsNoItems() {
		// Setup
		// Configure CovidSymptomsMasterRepo.findByDeleted(...).
		final CovidSymptomsMaster covidSymptomsMaster = new CovidSymptomsMaster();
		final ArrayList<CovidSymptomsMaster> covidSymptomsMasters = new ArrayList<>(List.of(covidSymptomsMaster));
		when(mockCovidSymptomsMasterRepo.findByDeleted(false)).thenReturn(covidSymptomsMasters);

		// Configure CovidContactHistoryMasterRepo.findByDeleted(...).
		final CovidContactHistoryMaster covidContactHistoryMaster = new CovidContactHistoryMaster();
		final ArrayList<CovidContactHistoryMaster> covidContactHistoryMasters = new ArrayList<>(
				List.of(covidContactHistoryMaster));
		when(mockCovidContactHistoryMasterRepo.findByDeleted(false)).thenReturn(covidContactHistoryMasters);

		when(mockCovidRecommnedationMasterRepo.findByDeleted(false)).thenReturn(new ArrayList<>());

		// Run the test
		final String result = commonPatientAppMasterServiceImplUnderTest.getCovidMaster(0, 0, "gender");

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testBookTCSlotData_BenVisitDetailRepoReturnsNull() {

		// Run the test
		assertThatThrownBy(
				() -> commonPatientAppMasterServiceImplUnderTest.bookTCSlotData("requestObj", "Authorization"))
				.isInstanceOf(RuntimeException.class);
	}

	@Test
	void testBookTCSlotData_CommonServiceImplReturnsNull() throws Exception {
		// Setup
		// Configure BenVisitDetailRepo.getVisitDetails(...).
		final BeneficiaryVisitDetail beneficiaryVisitDetail = new BeneficiaryVisitDetail();
		beneficiaryVisitDetail.setVisitCode(0L);
		beneficiaryVisitDetail.setBenVisitID(0L);
		beneficiaryVisitDetail.setBeneficiaryRegID(0L);
		beneficiaryVisitDetail.setProviderServiceMapID(0);
		beneficiaryVisitDetail.setVisitNo((short) 0);
		beneficiaryVisitDetail.setVanID(0);
		beneficiaryVisitDetail.setVisitReason("VisitReason");
		beneficiaryVisitDetail.setVisitCategory("visitCategory");

		beneficiaryVisitDetail.toString();

		// Run the test
		assertThatThrownBy(
				() -> commonPatientAppMasterServiceImplUnderTest.bookTCSlotData("requestObj", "Authorization"))
				.isInstanceOf(RuntimeException.class);
	}

	@Test
	void testBookTCSlotData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		// Configure BenVisitDetailRepo.getVisitDetails(...).
		final BeneficiaryVisitDetail beneficiaryVisitDetail = new BeneficiaryVisitDetail();
		beneficiaryVisitDetail.setVisitCode(0L);
		beneficiaryVisitDetail.setBenVisitID(0L);
		beneficiaryVisitDetail.setBeneficiaryRegID(0L);
		beneficiaryVisitDetail.setProviderServiceMapID(0);
		beneficiaryVisitDetail.setVisitNo((short) 0);
		beneficiaryVisitDetail.setVanID(0);
		beneficiaryVisitDetail.setVisitReason("VisitReason");
		beneficiaryVisitDetail.setVisitCategory("visitCategory");

		// Run the test
		assertThatThrownBy(
				() -> commonPatientAppMasterServiceImplUnderTest.bookTCSlotData("requestObj", "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testSaveSpecialistDiagnosisData_CommonNurseServiceImplReturnsNull() {
		// Setup

		// Run the test
		assertThatThrownBy(() -> commonPatientAppMasterServiceImplUnderTest.saveSpecialistDiagnosisData("requestObj"))
				.isInstanceOf(RuntimeException.class);
	}

	@Test
	void testGetSpecialistDiagnosisData_GeneralOPDDoctorServiceImplReturnsNull() {
		// Setup

		// Run the test
		assertThatThrownBy(() -> commonPatientAppMasterServiceImplUnderTest.getSpecialistDiagnosisData("requestObj"))
				.isInstanceOf(RuntimeException.class);
	}

	@Test
	void testGetPatientsLast_3_Episode_BeneficiaryFlowStatusRepoReturnsNull() {
		// Setup

		// Run the test
		assertThatThrownBy(() -> commonPatientAppMasterServiceImplUnderTest.getPatientsLast_3_Episode("requestObj"))
				.isInstanceOf(RuntimeException.class);
	}

}
