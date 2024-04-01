package com.iemr.tm.service.covid19;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.OptimisticLockingFailureException;

import com.google.gson.JsonObject;
import com.iemr.tm.data.covid19.Covid19BenFeedback;
import com.iemr.tm.data.nurse.BenAnthropometryDetail;
import com.iemr.tm.data.nurse.BenPhysicalVitalDetail;
import com.iemr.tm.data.nurse.CommonUtilityClass;
import com.iemr.tm.data.quickConsultation.PrescribedDrugDetail;
import com.iemr.tm.data.tele_consultation.TeleconsultationRequestOBJ;
import com.iemr.tm.repo.nurse.BenVisitDetailRepo;
import com.iemr.tm.repo.nurse.covid19.Covid19BenFeedbackRepo;
import com.iemr.tm.repo.quickConsultation.PrescriptionDetailRepo;
import com.iemr.tm.service.benFlowStatus.CommonBenStatusFlowServiceImpl;
import com.iemr.tm.service.common.transaction.CommonDoctorServiceImpl;
import com.iemr.tm.service.common.transaction.CommonNurseServiceImpl;
import com.iemr.tm.service.common.transaction.CommonServiceImpl;
import com.iemr.tm.service.labtechnician.LabTechnicianServiceImpl;
import com.iemr.tm.service.tele_consultation.SMSGatewayServiceImpl;
import com.iemr.tm.service.tele_consultation.TeleConsultationServiceImpl;

@ExtendWith(MockitoExtension.class)
class Covid19ServiceImplTest {

	@Mock
	private CommonNurseServiceImpl mockCommonNurseServiceImpl;
	@Mock
	private CommonDoctorServiceImpl mockCommonDoctorServiceImpl;
	@Mock
	private CommonBenStatusFlowServiceImpl mockCommonBenStatusFlowServiceImpl;
	@Mock
	private LabTechnicianServiceImpl mockLabTechnicianServiceImpl;
	@Mock
	private CommonServiceImpl mockCommonServiceImpl;
	@Mock
	private TeleConsultationServiceImpl mockTeleConsultationServiceImpl;
	@Mock
	private SMSGatewayServiceImpl mockSMSGatewayServiceImpl;
	@Mock
	private Covid19BenFeedbackRepo mockCovid19BenFeedbackRepo;
	@Mock
	private PrescriptionDetailRepo mockPrescriptionDetailRepo;
	@Mock
	private BenVisitDetailRepo mockBenVisitDetailRepo;

	@InjectMocks
	private Covid19ServiceImpl covid19ServiceImplUnderTest;

	@Test
	void testSaveCovid19NurseData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Configure Covid19BenFeedbackRepo.save(...).
		final Covid19BenFeedback covid19BenFeedback = new Covid19BenFeedback();
		covid19BenFeedback.setcOVID19ID(0L);
		covid19BenFeedback.setTravelType("travelType");
		covid19BenFeedback.setSymptoms_db("symptoms_db");
		covid19BenFeedback.setcOVID19_contact_history("cOVID19_contact_history");
		covid19BenFeedback.setSuspectedStatus(false);
		covid19BenFeedback.setRecommendation_db("recommendation_db");
		covid19BenFeedback.setVisitCode(0L);
		covid19BenFeedback.setSymptoms(new String[] { "symptoms" });
		covid19BenFeedback.setContactStatus(new String[] { "contactStatus" });
		covid19BenFeedback.setTravelList(new String[] { "travelList" });
		covid19BenFeedback.setSuspectedStatusUI("suspectedStatusUI");
		
		covid19BenFeedback.toString();

		// Run the test
		assertThatThrownBy(() -> covid19ServiceImplUnderTest.saveCovid19NurseData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testDeleteVisitDetails_BenVisitDetailRepoGetVisitCodeReturnsNull() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Run the test
		covid19ServiceImplUnderTest.deleteVisitDetails(requestOBJ);

		// Verify the results
	}

	@Test
	void testSaveBenCovid19HistoryDetails() throws Exception {
		// Setup
		final JsonObject ncdCareHistoryOBJ = new JsonObject();

		// Run the test
		final Long result = covid19ServiceImplUnderTest.saveBenCovid19HistoryDetails(ncdCareHistoryOBJ, 0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo(1L);
	}

	@Test
	void testSaveCovidDetails_Covid19BenFeedbackRepoReturnsNull() {
		// Setup
		final Covid19BenFeedback covid19BenFeedbackOBJ = new Covid19BenFeedback();
		covid19BenFeedbackOBJ.setcOVID19ID(0L);
		covid19BenFeedbackOBJ.setTravelType("travelType");
		covid19BenFeedbackOBJ.setSymptoms_db("symptoms_db");
		covid19BenFeedbackOBJ.setcOVID19_contact_history("cOVID19_contact_history");
		covid19BenFeedbackOBJ.setSuspectedStatus(false);
		covid19BenFeedbackOBJ.setRecommendation_db("recommendation_db");
		covid19BenFeedbackOBJ.setVisitCode(0L);
		covid19BenFeedbackOBJ.setSymptoms(new String[] { "symptoms" });
		covid19BenFeedbackOBJ.setContactStatus(new String[] { "contactStatus" });
		covid19BenFeedbackOBJ.setTravelList(new String[] { "travelList" });
		covid19BenFeedbackOBJ.setSuspectedStatusUI("suspectedStatusUI");
		
		covid19BenFeedbackOBJ.toString();
		
		when(mockCovid19BenFeedbackRepo.save(any(Covid19BenFeedback.class))).thenReturn(null);

		// Run the test
		final Integer result = covid19ServiceImplUnderTest.saveCovidDetails(covid19BenFeedbackOBJ);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveCovidDetails_Covid19BenFeedbackRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final Covid19BenFeedback covid19BenFeedbackOBJ = new Covid19BenFeedback();
		covid19BenFeedbackOBJ.setcOVID19ID(0L);
		covid19BenFeedbackOBJ.setTravelType("travelType");
		covid19BenFeedbackOBJ.setSymptoms_db("symptoms_db");
		covid19BenFeedbackOBJ.setcOVID19_contact_history("cOVID19_contact_history");
		covid19BenFeedbackOBJ.setSuspectedStatus(false);
		covid19BenFeedbackOBJ.setRecommendation_db("recommendation_db");
		covid19BenFeedbackOBJ.setVisitCode(0L);
		covid19BenFeedbackOBJ.setSymptoms(new String[] { "symptoms" });
		covid19BenFeedbackOBJ.setContactStatus(new String[] { "contactStatus" });
		covid19BenFeedbackOBJ.setTravelList(new String[] { "travelList" });
		covid19BenFeedbackOBJ.setSuspectedStatusUI("suspectedStatusUI");

		when(mockCovid19BenFeedbackRepo.save(any(Covid19BenFeedback.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> covid19ServiceImplUnderTest.saveCovidDetails(covid19BenFeedbackOBJ))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testUpdateBenHistoryDetails() throws Exception {
		// Setup
		final JsonObject historyOBJ = new JsonObject();

		// Run the test
		final int result = covid19ServiceImplUnderTest.updateBenHistoryDetails(historyOBJ);

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
		final int result = covid19ServiceImplUnderTest.updateBenVitalDetails(vitalDetailsOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testSaveDoctorData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> covid19ServiceImplUnderTest.saveDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testUpdateCovid19DoctorData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> covid19ServiceImplUnderTest.updateCovid19DoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testUpdateCovid19DoctorData_CommonDoctorServiceImplUpdateBenFlowtableAfterDocDataUpdateThrowsException()
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

		// Configure CommonNurseServiceImpl.saveBenPrescribedDrugsList(...).
		final PrescribedDrugDetail prescribedDrugDetail = new PrescribedDrugDetail();
		prescribedDrugDetail.setBeneficiaryRegID(0L);
		prescribedDrugDetail.setBenVisitID(0L);
		prescribedDrugDetail.setProviderServiceMapID(0);
		prescribedDrugDetail.setVisitCode(0L);
		prescribedDrugDetail.setPrescriptionID(0L);
		prescribedDrugDetail.toString();
		
		final List<PrescribedDrugDetail> prescribedDrugDetailList = List.of(prescribedDrugDetail);
		when(mockCommonNurseServiceImpl.saveBenPrescribedDrugsList(prescribedDrugDetailList)).thenReturn(0);

		when(mockCommonDoctorServiceImpl.updateBenReferDetails(new JsonObject())).thenReturn(0L);
		when(mockCommonDoctorServiceImpl.updateBenFlowtableAfterDocDataUpdate(any(CommonUtilityClass.class), eq(false),
				eq(false), any(TeleconsultationRequestOBJ.class))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> covid19ServiceImplUnderTest.updateCovid19DoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}
}
