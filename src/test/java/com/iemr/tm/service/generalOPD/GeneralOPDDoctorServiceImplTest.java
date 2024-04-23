package com.iemr.tm.service.generalOPD;

import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.google.gson.Gson;
import com.iemr.tm.data.quickConsultation.PrescribedDrugDetail;
import com.iemr.tm.data.quickConsultation.PrescriptionDetail;
import com.iemr.tm.data.snomedct.SCTDescription;
import com.iemr.tm.repo.quickConsultation.PrescriptionDetailRepo;

@ExtendWith(MockitoExtension.class)
class GeneralOPDDoctorServiceImplTest {

	@InjectMocks
	GeneralOPDDoctorServiceImpl generalOPDDoctorServiceImpl;

	@Mock
	private PrescriptionDetailRepo prescriptionDetailRepo;

	@Test
	void getGeneralOPDDiagnosisDetailsTest() {

		Long beneficiaryRegID = 123L;
		Long visitCode = 234L;

		PrescribedDrugDetail prescribedDrugDetail = new PrescribedDrugDetail();
		prescribedDrugDetail.setBeneficiaryRegID(123L);

		ArrayList<PrescribedDrugDetail> prescriptionDetailList = new ArrayList<>();
		prescriptionDetailList.add(prescribedDrugDetail);

		SCTDescription provisionalDiagnosis = new SCTDescription();
		provisionalDiagnosis.setConceptID("D63547367");
		provisionalDiagnosis.setTerm("Yes");

		provisionalDiagnosis.toString();

		ArrayList<SCTDescription> provisionalDiagnosisList = new ArrayList<>();
		provisionalDiagnosisList.add(provisionalDiagnosis);

		PrescriptionDetail obj = new PrescriptionDetail();

		obj.setPrescriptionID(345L);
		obj.setBeneficiaryRegID(456L);
		obj.setBenVisitID(567L);
		obj.setProviderServiceMapID(1);
		obj.setVisitCode(678L);
		obj.setDiagnosisProvided("Yes");
		obj.setDiagnosisProvided_SCTCode("D63547367");
		obj.setDiagnosisProvided_SCTTerm("Liver");
		obj.setDeleted(false);
		obj.setInstruction("Do it perfectly");
		obj.setConfirmatoryDiagnosis("Confirmed");
		obj.setExternalInvestigation("Spandan");
		obj.setRemarks("Good");
		obj.setProcessed("U");
		obj.setCreatedBy("AK");
		obj.setCreatedDate(Timestamp.valueOf("2020-09-09 09:09:09"));
		obj.setModifiedBy("BK");
		obj.setLastModDate(Timestamp.valueOf("2020-09-09 09:09:09"));
		obj.setVanID(12);
		obj.setVanSerialNo(12L);
		obj.setVehicalNo("WB23456gdhgd");
		obj.setSyncedBy("AK");
		obj.setSyncedDate(Timestamp.valueOf("2020-09-09 09:09:09"));
		obj.setPrescribedDrugs(prescriptionDetailList);
		obj.setProvisionalDiagnosisList(provisionalDiagnosisList);

		obj.toString();

		ArrayList<PrescriptionDetail> prescriptionDetailRS = new ArrayList<>();
		prescriptionDetailRS.add(obj);

		when(prescriptionDetailRepo.findByBeneficiaryRegIDAndVisitCode(beneficiaryRegID, visitCode))
				.thenReturn(prescriptionDetailRS);

		SCTDescription sctOBJ = new SCTDescription();

		sctOBJ.setActive("active");
		sctOBJ.setCaseSignificanceID("wyggfsdjh");
		sctOBJ.setConceptID("dsghjgdshjh");
		sctOBJ.setTerm("term");
		sctOBJ.setSctDesID(123L);
		sctOBJ.setCaseSignificanceID("caseSignificanceID");
		sctOBJ.setPageNo(123);

		sctOBJ.toString();

		ArrayList<SCTDescription> sctOBJList = new ArrayList<>();
		sctOBJList.add(sctOBJ);

		Assertions.assertNotNull(prescriptionDetailRS);
		Assertions.assertNotNull(obj);
		Assertions.assertNotNull(obj.getDiagnosisProvided_SCTCode());
		Assertions.assertNotNull(obj.getDiagnosisProvided());
		Assertions.assertNotEquals(0, prescriptionDetailRS.size());

		Assertions.assertEquals(new Gson().toJson(obj),
				generalOPDDoctorServiceImpl.getGeneralOPDDiagnosisDetails(beneficiaryRegID, visitCode));

	}

	@Test
	void getGeneralOPDDiagnosisDetailsTest_ElsePart() {

		Long beneficiaryRegID = 123L;
		Long visitCode = 234L;

		PrescriptionDetail obj = new PrescriptionDetail();

		Assertions.assertEquals(new Gson().toJson(obj),
				generalOPDDoctorServiceImpl.getGeneralOPDDiagnosisDetails(beneficiaryRegID, visitCode));

	}

}
