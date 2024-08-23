package com.iemr.tm.service.ncdscreening;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.google.gson.JsonObject;
import com.iemr.tm.data.anc.WrapperAncFindings;
import com.iemr.tm.data.anc.WrapperBenInvestigationANC;
import com.iemr.tm.data.nurse.CommonUtilityClass;
import com.iemr.tm.data.quickConsultation.PrescribedDrugDetail;
import com.iemr.tm.data.quickConsultation.PrescriptionDetail;
import com.iemr.tm.data.snomedct.SCTDescription;
import com.iemr.tm.data.tele_consultation.TeleconsultationRequestOBJ;
import com.iemr.tm.repo.quickConsultation.PrescriptionDetailRepo;
import com.iemr.tm.service.common.transaction.CommonDoctorServiceImpl;
import com.iemr.tm.service.common.transaction.CommonNurseServiceImpl;
import com.iemr.tm.service.common.transaction.CommonServiceImpl;
import com.iemr.tm.service.tele_consultation.SMSGatewayServiceImpl;
import com.iemr.tm.service.tele_consultation.TeleConsultationServiceImpl;

@ExtendWith(MockitoExtension.class)
class NCDSCreeningDoctorServiceImplTest {

	@Mock
	private PrescriptionDetailRepo mockPrescriptionDetailRepo;
	@Mock
	private CommonDoctorServiceImpl mockCommonDoctorServiceImpl;
	@Mock
	private TeleConsultationServiceImpl mockTeleConsultationServiceImpl;
	@Mock
	private CommonNurseServiceImpl mockCommonNurseServiceImpl;
	@Mock
	private CommonServiceImpl mockCommonServiceImpl;
	@Mock
	private SMSGatewayServiceImpl mockSMSGatewayServiceImpl;

	@InjectMocks
	private NCDSCreeningDoctorServiceImpl ncdsCreeningDoctorServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		ncdsCreeningDoctorServiceImplUnderTest.setPrescriptionDetailRepo(mockPrescriptionDetailRepo);
	}

	@Test
	void testUpdateDoctorData_ThrowsRuntimeException() throws Exception {
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
		
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenReturn(teleconsultationRequestOBJ);

		// Run the test
		assertThatThrownBy(() -> ncdsCreeningDoctorServiceImplUnderTest.updateDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(RuntimeException.class);
	}

	@Test
	void testUpdateDoctorData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> ncdsCreeningDoctorServiceImplUnderTest.updateDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testUpdateDoctorData_CommonDoctorServiceImplUpdateBenFlowtableAfterDocDataUpdateThrowsException()
			throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenReturn(null);
		when(mockCommonDoctorServiceImpl.updateDocFindings(any(WrapperAncFindings.class))).thenReturn(0);
		when(mockCommonNurseServiceImpl.updatePrescription(any(PrescriptionDetail.class))).thenReturn(0);
		when(mockCommonNurseServiceImpl.saveBenInvestigation(any(WrapperBenInvestigationANC.class))).thenReturn(0L);

		// Configure CommonNurseServiceImpl.saveBenPrescribedDrugsList(...).
		final PrescribedDrugDetail prescribedDrugDetail = new PrescribedDrugDetail();
		prescribedDrugDetail.setBeneficiaryRegID(0L);
		prescribedDrugDetail.setBenVisitID(0L);
		prescribedDrugDetail.setProviderServiceMapID(0);
		prescribedDrugDetail.setVisitCode(0L);
		prescribedDrugDetail.setPrescriptionID(0L);
		final List<PrescribedDrugDetail> prescribedDrugDetailList = List.of(prescribedDrugDetail);
		when(mockCommonNurseServiceImpl.saveBenPrescribedDrugsList(prescribedDrugDetailList)).thenReturn(0);

		when(mockCommonDoctorServiceImpl.updateBenReferDetails(new JsonObject())).thenReturn(0L);
		when(mockCommonDoctorServiceImpl.updateBenFlowtableAfterDocDataUpdate(any(CommonUtilityClass.class), eq(false),
				eq(false), any(TeleconsultationRequestOBJ.class))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> ncdsCreeningDoctorServiceImplUnderTest.updateDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testGetNCDDiagnosisData() {
		// Setup
		// Configure PrescriptionDetailRepo.findByBeneficiaryRegIDAndVisitCode(...).
		final PrescriptionDetail prescriptionDetail = new PrescriptionDetail();
		prescriptionDetail.setDiagnosisProvided_SCTCode("diagnosisProvided_SCTCode");
		prescriptionDetail.setDiagnosisProvided("diagnosisProvided");
		prescriptionDetail.setPrescriptionID(0L);
		prescriptionDetail.setExternalInvestigation("externalInvestigation");
		final SCTDescription sctDescription = new SCTDescription();
		sctDescription.setTerm("term");
		sctDescription.setConceptID("conceptID");
		prescriptionDetail.setProvisionalDiagnosisList(new ArrayList<>(List.of(sctDescription)));
		final ArrayList<PrescriptionDetail> prescriptionDetails = new ArrayList<>(List.of(prescriptionDetail));
		when(mockPrescriptionDetailRepo.findByBeneficiaryRegIDAndVisitCode(0L, 0L)).thenReturn(prescriptionDetails);

		// Run the test
		final String result = ncdsCreeningDoctorServiceImplUnderTest.getNCDDiagnosisData(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetNCDDiagnosisData_PrescriptionDetailRepoReturnsNull() {
		// Setup
		when(mockPrescriptionDetailRepo.findByBeneficiaryRegIDAndVisitCode(0L, 0L)).thenReturn(null);

		// Run the test
		final String result = ncdsCreeningDoctorServiceImplUnderTest.getNCDDiagnosisData(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetNCDDiagnosisData_PrescriptionDetailRepoReturnsNoItems() {
		// Setup
		when(mockPrescriptionDetailRepo.findByBeneficiaryRegIDAndVisitCode(0L, 0L)).thenReturn(new ArrayList<>());

		// Run the test
		final String result = ncdsCreeningDoctorServiceImplUnderTest.getNCDDiagnosisData(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}
}
