package com.iemr.tm.service.generalOPD;

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

import com.google.gson.JsonObject;
import com.iemr.tm.data.anc.WrapperAncFindings;
import com.iemr.tm.data.anc.WrapperBenInvestigationANC;
import com.iemr.tm.data.nurse.BenAnthropometryDetail;
import com.iemr.tm.data.nurse.BenPhysicalVitalDetail;
import com.iemr.tm.data.nurse.CommonUtilityClass;
import com.iemr.tm.data.quickConsultation.BenChiefComplaint;
import com.iemr.tm.data.quickConsultation.PrescribedDrugDetail;
import com.iemr.tm.data.quickConsultation.PrescriptionDetail;
import com.iemr.tm.data.tele_consultation.TeleconsultationRequestOBJ;
import com.iemr.tm.repo.nurse.BenVisitDetailRepo;
import com.iemr.tm.repo.nurse.anc.BenAdherenceRepo;
import com.iemr.tm.repo.quickConsultation.BenChiefComplaintRepo;
import com.iemr.tm.service.benFlowStatus.CommonBenStatusFlowServiceImpl;
import com.iemr.tm.service.common.transaction.CommonDoctorServiceImpl;
import com.iemr.tm.service.common.transaction.CommonNurseServiceImpl;
import com.iemr.tm.service.common.transaction.CommonServiceImpl;
import com.iemr.tm.service.labtechnician.LabTechnicianServiceImpl;
import com.iemr.tm.service.tele_consultation.SMSGatewayServiceImpl;

@ExtendWith(MockitoExtension.class)
class GeneralOPDServiceImplTest {

	@Mock
	private CommonNurseServiceImpl mockCommonNurseServiceImpl;
	@Mock
	private CommonDoctorServiceImpl mockCommonDoctorServiceImpl;
	@Mock
	private CommonBenStatusFlowServiceImpl mockCommonBenStatusFlowServiceImpl;
	@Mock
	private GeneralOPDDoctorServiceImpl mockGeneralOPDDoctorServiceImpl;
	@Mock
	private LabTechnicianServiceImpl mockLabTechnicianServiceImpl;
	@Mock
	private CommonServiceImpl mockCommonServiceImpl;
	@Mock
	private SMSGatewayServiceImpl mockSMSGatewayServiceImpl;
	@Mock
	private BenVisitDetailRepo mockBenVisitDetailRepo;
	@Mock
	private BenChiefComplaintRepo mockBenChiefComplaintRepo;
	@Mock
	private BenAdherenceRepo mockBenAdherenceRepo;

	@InjectMocks
	private GeneralOPDServiceImpl generalOPDServiceImplUnderTest;

	@Test
	void testDeleteVisitDetails_BenVisitDetailRepoGetVisitCodeReturnsNull() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Run the test
		generalOPDServiceImplUnderTest.deleteVisitDetails(requestOBJ);

		// Verify the results
	}

	@Test
	void testSaveBenGeneralOPDHistoryDetails() throws Exception {
		// Setup
		final JsonObject generalOPDHistoryOBJ = new JsonObject();

		// Run the test
		final Long result = generalOPDServiceImplUnderTest.saveBenGeneralOPDHistoryDetails(generalOPDHistoryOBJ, 0L,
				0L);

		// Verify the results
		assertThat(result).isEqualTo(1L);
	}

	@Test
	void testSaveBenExaminationDetails() throws Exception {
		// Setup
		final JsonObject examinationDetailsOBJ = new JsonObject();

		// Run the test
		final Long result = generalOPDServiceImplUnderTest.saveBenExaminationDetails(examinationDetailsOBJ, 0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo(1L);
	}

	@Test
	void testSaveDoctorData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> generalOPDServiceImplUnderTest.saveDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testSaveDoctorData_CommonNurseServiceImplSaveBenPrescriptionReturnsNull() throws Exception {
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

		// Run the test
		assertThatThrownBy(() -> generalOPDServiceImplUnderTest.saveDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(RuntimeException.class);
	}

	@Test
	void testUpdateVisitDetails() throws Exception {
		// Setup
		final JsonObject jsnOBJ = new JsonObject();

		// Configure CommonNurseServiceImpl.updateBenChiefComplaints(...).
		final BenChiefComplaint benChiefComplaint = new BenChiefComplaint();
		benChiefComplaint.setBeneficiaryRegID(0L);
		benChiefComplaint.setBenVisitID(0L);
		benChiefComplaint.setProviderServiceMapID(0);
		benChiefComplaint.setChiefComplaintID(0);
		benChiefComplaint.setVisitCode(0L);
		
		benChiefComplaint.toString();
		
		final List<BenChiefComplaint> benChiefComplaintList = List.of(benChiefComplaint);

		// Run the test
		final int result = generalOPDServiceImplUnderTest.UpdateVisitDetails(jsnOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenHistoryDetails() throws Exception {
		// Setup
		final JsonObject historyOBJ = new JsonObject();
		// Run the test
		final int result = generalOPDServiceImplUnderTest.updateBenHistoryDetails(historyOBJ);

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
		final int result = generalOPDServiceImplUnderTest.updateBenVitalDetails(vitalDetailsOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenExaminationDetails() throws Exception {
		// Setup
		final JsonObject examinationDetailsOBJ = new JsonObject();

		// Run the test
		final int result = generalOPDServiceImplUnderTest.updateBenExaminationDetails(examinationDetailsOBJ);

		// Verify the results
		assertThat(result).isEqualTo(1);
	}

	@Test
	void testUpdateGeneralOPDDoctorData_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> generalOPDServiceImplUnderTest.updateGeneralOPDDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testUpdateGeneralOPDDoctorData_CommonDoctorServiceImplUpdateBenFlowtableAfterDocDataUpdateThrowsException()
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
		
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenReturn(teleconsultationRequestOBJ);

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
		
		prescribedDrugDetail.toString();
	
		final List<PrescribedDrugDetail> prescribedDrugDetailList = List.of(prescribedDrugDetail);

		when(mockCommonDoctorServiceImpl.updateBenReferDetails(new JsonObject())).thenReturn(0L);
		when(mockCommonDoctorServiceImpl.updateBenFlowtableAfterDocDataUpdate(any(CommonUtilityClass.class), eq(false),
				eq(false), any(TeleconsultationRequestOBJ.class))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(() -> generalOPDServiceImplUnderTest.updateGeneralOPDDoctorData(requestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}
}
