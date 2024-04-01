package com.iemr.tm.service.cancerScreening;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import com.google.gson.JsonObject;
import com.iemr.tm.data.doctor.CancerDiagnosis;
import com.iemr.tm.data.doctor.CancerExaminationImageAnnotation;
import com.iemr.tm.data.doctor.CancerLymphNodeDetails;
import com.iemr.tm.data.doctor.WrapperCancerExamImgAnotasn;
import com.iemr.tm.data.nurse.BenCancerVitalDetail;
import com.iemr.tm.data.nurse.BenFamilyCancerHistory;
import com.iemr.tm.data.nurse.BeneficiaryVisitDetail;
import com.iemr.tm.data.nurse.CommonUtilityClass;
import com.iemr.tm.repo.benFlowStatus.BeneficiaryFlowStatusRepo;
import com.iemr.tm.repo.nurse.BenVisitDetailRepo;
import com.iemr.tm.repo.nurse.anc.BenAdherenceRepo;
import com.iemr.tm.repo.quickConsultation.BenChiefComplaintRepo;
import com.iemr.tm.repo.registrar.RegistrarRepoBenData;
import com.iemr.tm.repo.tc_consultation.TCRequestModelRepo;
import com.iemr.tm.service.benFlowStatus.CommonBenStatusFlowServiceImpl;
import com.iemr.tm.service.common.transaction.CommonDoctorServiceImpl;
import com.iemr.tm.service.common.transaction.CommonNurseServiceImpl;
import com.iemr.tm.service.common.transaction.CommonServiceImpl;
import com.iemr.tm.service.tele_consultation.SMSGatewayServiceImpl;
import com.iemr.tm.service.tele_consultation.TeleConsultationServiceImpl;
import com.iemr.tm.utils.exception.IEMRException;

@ExtendWith(MockitoExtension.class)
class CSServiceImplTest {

	@Mock
	private CSNurseServiceImpl mockCSNurseServiceImpl;
	@Mock
	private CSDoctorServiceImpl mockCSDoctorServiceImpl;
	@Mock
	private CSOncologistServiceImpl mockCsOncologistServiceImpl;
	@Mock
	private CommonNurseServiceImpl mockCommonNurseServiceImpl;
	@Mock
	private CSCarestreamServiceImpl mockCSCarestreamServiceImpl;
	@Mock
	private RegistrarRepoBenData mockRegistrarRepoBenData;
	@Mock
	private CommonBenStatusFlowServiceImpl mockCommonBenStatusFlowServiceImpl;
	@Mock
	private BeneficiaryFlowStatusRepo mockBeneficiaryFlowStatusRepo;
	@Mock
	private TeleConsultationServiceImpl mockTeleConsultationServiceImpl;
	@Mock
	private CommonDoctorServiceImpl mockCommonDoctorServiceImpl;
	@Mock
	private CommonServiceImpl mockCommonServiceImpl;
	@Mock
	private TCRequestModelRepo mockTCRequestModelRepo;
	@Mock
	private BenVisitDetailRepo mockBenVisitDetailRepo;
	@Mock
	private BenChiefComplaintRepo mockBenChiefComplaintRepo;
	@Mock
	private BenAdherenceRepo mockBenAdherenceRepo;
	@Mock
	private SMSGatewayServiceImpl mockSMSGatewayServiceImpl;

	@InjectMocks
	private CSServiceImpl csServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		csServiceImplUnderTest.setcSNurseServiceImpl(mockCSNurseServiceImpl);
		csServiceImplUnderTest.setcSDoctorServiceImpl(mockCSDoctorServiceImpl);
		csServiceImplUnderTest.setCsOncologistServiceImpl(mockCsOncologistServiceImpl);
		csServiceImplUnderTest.setCommonNurseServiceImpl(mockCommonNurseServiceImpl);
		csServiceImplUnderTest.setcSCarestreamServiceImpl(mockCSCarestreamServiceImpl);
		csServiceImplUnderTest.setRegistrarRepoBenData(mockRegistrarRepoBenData);
		csServiceImplUnderTest.setCommonBenStatusFlowServiceImpl(mockCommonBenStatusFlowServiceImpl);
		csServiceImplUnderTest.setBeneficiaryFlowStatusRepo(mockBeneficiaryFlowStatusRepo);
		ReflectionTestUtils.setField(csServiceImplUnderTest, "registrarQuickSearchByIdUrl",
				"registrarQuickSearchByIdUrl");
	}

	@Test
	void testSaveCancerScreeningNurseData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Run the test
		assertThatThrownBy(() -> csServiceImplUnderTest.saveCancerScreeningNurseData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testDeleteVisitDetails_BenVisitDetailRepoGetVisitCodeReturnsNull() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Run the test
		csServiceImplUnderTest.deleteVisitDetails(requestOBJ);

		// Verify the results
	}

	@Test
	void testSaveBenVisitDetails_CommonNurseServiceImplGetMaxCurrentdateThrowsIEMRException() throws Exception {
		// Setup
		final BeneficiaryVisitDetail benVisitDetailsOBJ = new BeneficiaryVisitDetail();
		benVisitDetailsOBJ.setVisitCode(0L);
		benVisitDetailsOBJ.setServiceProviderName("serviceProviderName");
		benVisitDetailsOBJ.setBeneficiaryRegID(0L);
		benVisitDetailsOBJ.setVisitReason("visitReason");
		benVisitDetailsOBJ.setVisitCategory("visitCategory");
		
		benVisitDetailsOBJ.toString();

		final CommonUtilityClass nurseUtilityClass = new CommonUtilityClass();
		nurseUtilityClass.setBenFlowID(0L);
		nurseUtilityClass.setBeneficiaryID(0L);
		nurseUtilityClass.setSessionID(0);
		nurseUtilityClass.setVanID(0);
		nurseUtilityClass.setBeneficiaryRegID(0L);
		nurseUtilityClass.setProviderServiceMapID(0);
		nurseUtilityClass.setBenVisitID(0L);
		nurseUtilityClass.setVisitCode(0L);
		nurseUtilityClass.setServiceID((short) 0);
		nurseUtilityClass.setIsSpecialist(false);
		nurseUtilityClass.setCreatedBy("createdBy");
		
		nurseUtilityClass.toString();

		when(mockCommonNurseServiceImpl.getMaxCurrentdate(0L, "visitReason", "visitCategory"))
				.thenThrow(IEMRException.class);

		// Run the test
		assertThatThrownBy(() -> csServiceImplUnderTest.saveBenVisitDetails(benVisitDetailsOBJ, nurseUtilityClass))
				.isInstanceOf(IEMRException.class);
	}

	@Test
	void testSaveBenHistoryDetails() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Configure CSNurseServiceImpl.saveBenFamilyCancerHistory(...).
		final BenFamilyCancerHistory benFamilyCancerHistory = new BenFamilyCancerHistory();
		benFamilyCancerHistory.setSnomedCode("snomedCode");
		benFamilyCancerHistory.setSnomedTerm("snomedTerm");
		benFamilyCancerHistory.setVanID(0);
		benFamilyCancerHistory.setBenVisitID(0L);
		benFamilyCancerHistory.setVisitCode(0L);
		benFamilyCancerHistory.toString();
		final List<BenFamilyCancerHistory> benFamilyCancerHistoryList = List.of(benFamilyCancerHistory);

		// Run the test
		final Long result = csServiceImplUnderTest.saveBenHistoryDetails(requestOBJ, 0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo(1L);
	}

	@Test
	void testSaveBenFamilyHistoryDetails() {
		assertThat(csServiceImplUnderTest.saveBenFamilyHistoryDetails()).isNull();
	}

	@Test
	void testUpdateBenExaminationDetail() throws Exception {
		// Setup
		final JsonObject jsnOBJ = new JsonObject();

		// Configure CSNurseServiceImpl.getCancerExaminationImageAnnotationList(...).
		final CancerExaminationImageAnnotation cancerExaminationImageAnnotation = new CancerExaminationImageAnnotation();
		cancerExaminationImageAnnotation.setVanID(0);
		cancerExaminationImageAnnotation.setID(0L);
		cancerExaminationImageAnnotation.setBeneficiaryRegID(0L);
		cancerExaminationImageAnnotation.setBenVisitID(0L);
		cancerExaminationImageAnnotation.setProviderServiceMapID(0);
		cancerExaminationImageAnnotation.toString();
		final List<CancerExaminationImageAnnotation> cancerExaminationImageAnnotations = List
				.of(cancerExaminationImageAnnotation);
		final WrapperCancerExamImgAnotasn wrapperCancerExamImgAnotasn = new WrapperCancerExamImgAnotasn();
		wrapperCancerExamImgAnotasn.setVanID(0);
		wrapperCancerExamImgAnotasn.setParkingPlaceID(0);
		wrapperCancerExamImgAnotasn.setVisitCode(0L);
		wrapperCancerExamImgAnotasn.setBeneficiaryRegID(0L);
		wrapperCancerExamImgAnotasn.setVisitID(0L);
		wrapperCancerExamImgAnotasn.toString();
		final List<WrapperCancerExamImgAnotasn> wrapperCancerExamImgAnotasnList = List.of(wrapperCancerExamImgAnotasn);

		// Configure CSNurseServiceImpl.updateCancerExamImgAnotasnDetails(...).
		final CancerExaminationImageAnnotation cancerExaminationImageAnnotation1 = new CancerExaminationImageAnnotation();
		cancerExaminationImageAnnotation1.setVanID(0);
		cancerExaminationImageAnnotation1.setID(0L);
		cancerExaminationImageAnnotation1.setBeneficiaryRegID(0L);
		cancerExaminationImageAnnotation1.setBenVisitID(0L);
		cancerExaminationImageAnnotation1.setProviderServiceMapID(0);
		final List<CancerExaminationImageAnnotation> cancerExaminationImageAnnotationList = List
				.of(cancerExaminationImageAnnotation1);

		// Run the test
		final int result = csServiceImplUnderTest.updateBenExaminationDetail(jsnOBJ);

		// Verify the results
		assertThat(result).isEqualTo(1);
	}

	@Test
	void testUpdateBenExaminationDetail_CSNurseServiceImplGetCancerExaminationImageAnnotationListReturnsNoItems()
			throws Exception {
		// Setup
		final JsonObject jsnOBJ = new JsonObject();

		// Configure CSNurseServiceImpl.getCancerExaminationImageAnnotationList(...).
		final WrapperCancerExamImgAnotasn wrapperCancerExamImgAnotasn = new WrapperCancerExamImgAnotasn();
		wrapperCancerExamImgAnotasn.setVanID(0);
		wrapperCancerExamImgAnotasn.setParkingPlaceID(0);
		wrapperCancerExamImgAnotasn.setVisitCode(0L);
		wrapperCancerExamImgAnotasn.setBeneficiaryRegID(0L);
		wrapperCancerExamImgAnotasn.setVisitID(0L);
		final List<WrapperCancerExamImgAnotasn> wrapperCancerExamImgAnotasnList = List.of(wrapperCancerExamImgAnotasn);

		// Configure CSNurseServiceImpl.updateCancerExamImgAnotasnDetails(...).
		final CancerExaminationImageAnnotation cancerExaminationImageAnnotation = new CancerExaminationImageAnnotation();
		cancerExaminationImageAnnotation.setVanID(0);
		cancerExaminationImageAnnotation.setID(0L);
		cancerExaminationImageAnnotation.setBeneficiaryRegID(0L);
		cancerExaminationImageAnnotation.setBenVisitID(0L);
		cancerExaminationImageAnnotation.setProviderServiceMapID(0);
		final List<CancerExaminationImageAnnotation> cancerExaminationImageAnnotationList = List
				.of(cancerExaminationImageAnnotation);

		// Run the test
		final int result = csServiceImplUnderTest.updateBenExaminationDetail(jsnOBJ);

		// Verify the results
		assertThat(result).isEqualTo(1);
	}

	@Test
	void testUpdateBenVitalDetail() {
		// Setup
		final BenCancerVitalDetail benCancerVitalDetail = new BenCancerVitalDetail();
		benCancerVitalDetail.setVanID(0);
		benCancerVitalDetail.setID(0L);
		benCancerVitalDetail.setBeneficiaryRegID(0L);
		benCancerVitalDetail.setBenVisitID(0L);
		benCancerVitalDetail.setVisitCode(0L);
		
		benCancerVitalDetail.toString();

		when(mockCSNurseServiceImpl.updateBenVitalDetail(any(BenCancerVitalDetail.class))).thenReturn(0);

		// Run the test
		final int result = csServiceImplUnderTest.updateBenVitalDetail(benCancerVitalDetail);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testSaveBenExaminationDetails_CSNurseServiceImplSaveCancerAbdominalExaminationDataReturnsNull()
			throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Configure CSNurseServiceImpl.saveLymphNodeDetails(...).
		final CancerLymphNodeDetails cancerLymphNodeDetails1 = new CancerLymphNodeDetails();
		cancerLymphNodeDetails1.setVanID(0);
		cancerLymphNodeDetails1.setID(0L);
		cancerLymphNodeDetails1.setBeneficiaryRegID(0L);
		cancerLymphNodeDetails1.setBenVisitID(0L);
		cancerLymphNodeDetails1.setProviderServiceMapID(0);
		cancerLymphNodeDetails1.toString();
		final List<CancerLymphNodeDetails> cancerLymphNodeDetails = List.of(cancerLymphNodeDetails1);

		// Configure CSNurseServiceImpl.saveDocExaminationImageAnnotation(...).
		final WrapperCancerExamImgAnotasn wrapperCancerExamImgAnotasn = new WrapperCancerExamImgAnotasn();
		wrapperCancerExamImgAnotasn.setVanID(0);
		wrapperCancerExamImgAnotasn.setParkingPlaceID(0);
		wrapperCancerExamImgAnotasn.setVisitCode(0L);
		wrapperCancerExamImgAnotasn.setBeneficiaryRegID(0L);
		wrapperCancerExamImgAnotasn.setVisitID(0L);
		wrapperCancerExamImgAnotasn.toString();
		final List<WrapperCancerExamImgAnotasn> wrapperCancerExamImgAnotasnList = List.of(wrapperCancerExamImgAnotasn);

		// Run the test
		final Long result = csServiceImplUnderTest.saveBenExaminationDetails(requestOBJ, 0L, "Authorization", 0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo(1L);
	}

	@Test
	void testSaveBenDiagnosisDetails_CSDoctorServiceImplReturnsNull() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Run the test
		final Long result = csServiceImplUnderTest.saveBenDiagnosisDetails(requestOBJ);

		// Verify the results
		assertThat(result).isEqualTo(1L);
	}

	@Test
	void testGetBenFamilyHistoryData() {
		// Setup
		when(mockCSNurseServiceImpl.getBenCancerFamilyHistory(0L)).thenReturn("result");

		// Run the test
		final String result = csServiceImplUnderTest.getBenFamilyHistoryData(0L);

		// Verify the results
		assertThat(result).isEqualTo("result");
	}

	@Test
	void testGetBenPersonalHistoryData() {
		// Setup
		when(mockCSNurseServiceImpl.getBenCancerPersonalHistory(0L)).thenReturn("result");

		// Run the test
		final String result = csServiceImplUnderTest.getBenPersonalHistoryData(0L);

		// Verify the results
		assertThat(result).isEqualTo("result");
	}

	@Test
	void testGetBenPersonalDietHistoryData() {
		// Setup
		when(mockCSNurseServiceImpl.getBenCancerPersonalDietHistory(0L)).thenReturn("result");

		// Run the test
		final String result = csServiceImplUnderTest.getBenPersonalDietHistoryData(0L);

		// Verify the results
		assertThat(result).isEqualTo("result");
	}

	@Test
	void testGetBenObstetricHistoryData() {
		// Setup
		when(mockCSNurseServiceImpl.getBenCancerObstetricHistory(0L)).thenReturn("result");

		// Run the test
		final String result = csServiceImplUnderTest.getBenObstetricHistoryData(0L);

		// Verify the results
		assertThat(result).isEqualTo("result");
	}

	@Test
	void testUpdateCancerDiagnosisDetailsByOncologist() {
		// Setup
		final CancerDiagnosis cancerDiagnosis = new CancerDiagnosis();
		cancerDiagnosis.setID(0L);
		cancerDiagnosis.setBeneficiaryRegID(0L);
		cancerDiagnosis.setBenVisitID(0L);
		cancerDiagnosis.setProviderServiceMapID(0);
		cancerDiagnosis.setProvisionalDiagnosisPrimaryDoctor("provisionalDiagnosisPrimaryDoctor");
		
		cancerDiagnosis.toString();

		when(mockCsOncologistServiceImpl.updateCancerDiagnosisDetailsByOncologist(any(CancerDiagnosis.class)))
				.thenReturn(0);

		// Run the test
		final int result = csServiceImplUnderTest.updateCancerDiagnosisDetailsByOncologist(cancerDiagnosis);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

}
