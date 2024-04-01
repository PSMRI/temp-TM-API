package com.iemr.tm.service.anc;

import static org.mockito.Mockito.when;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.iemr.tm.data.anc.ANCDiagnosis;
import com.iemr.tm.repo.nurse.anc.ANCDiagnosisRepo;
import com.iemr.tm.repo.quickConsultation.PrescriptionDetailRepo;
import com.iemr.tm.utils.exception.IEMRException;

@ExtendWith(MockitoExtension.class)
public class ANCDoctorServiceImplTest {

	@InjectMocks
	private ANCDoctorServiceImpl ancDoctorServiceImpl;

	@Mock
	ANCDiagnosisRepo ancDiagnosisRepo;

	@Mock
	private PrescriptionDetailRepo prescriptionDetailRepo;

	@Test
	public void testSaveBenANCDiagnosis() throws IEMRException {
		
		Long prescriptionID = 123L;

		// Mock complicationOfCurrentPregnancyList
		List<Map<String, String>> complicationList = new ArrayList<>();
		Map<String, String> complicationMap = new HashMap<>();

		complicationMap.put("Ectopic Pregnancy Type", "Ectopic Pregnancy");

		complicationMap.put("Ectopic Pregnancy Type2", "Ectopic Pregnancy2");

		complicationMap.toString();

		complicationList.add(complicationMap);

		// Create ANCDiagnosis instance
		ANCDiagnosis ancDiagnosis = new ANCDiagnosis();

		ancDiagnosis.setBeneficiaryRegID(1L);
		ancDiagnosis.setVisitCode(2L);
		ancDiagnosis.setCauseOfDeath("Strock");
		ancDiagnosis.setComplicationOfCurrentPregnancy("Complicated");
		ancDiagnosis.setCreatedBy("AK");
		ancDiagnosis.setCreatedDate(Timestamp.valueOf("2020-09-09 09:09:46"));
		ancDiagnosis.setDateOfDeath(Date.valueOf("2021-01-01"));
		ancDiagnosis.setDeleted(true);
		ancDiagnosis.setExternalInvestigation("CBI");
		ancDiagnosis.setHighRiskCondition("High");
		ancDiagnosis.setHighRiskStatus("A grade");
		ancDiagnosis.setIsMaternalDeath(true);
		ancDiagnosis.setLastModDate(Timestamp.valueOf("2020-09-09 09:09:46"));
		ancDiagnosis.setModifiedBy("PK");
		ancDiagnosis.setOtherCurrPregComplication("Diabates");
		ancDiagnosis.setPlaceOfDeath("Mumbai");
		ancDiagnosis.setPrescriptionID(2345L);
		ancDiagnosis.setProcessed("Yes");
		ancDiagnosis.setProviderServiceMapID(123);
		ancDiagnosis.setReservedForChange("No");
		ancDiagnosis.setSpecialistDiagnosis("Yes");
		ancDiagnosis.setSyncedBy("AK");
		ancDiagnosis.setSyncedDate(Timestamp.valueOf("2020-09-12 09:09:46"));
		ancDiagnosis.setVanID(2);
		ancDiagnosis.setVanSerialNo(2L);
		ancDiagnosis.setVehicalNo("MH123456");
		ancDiagnosis.setComplicationOfCurrentPregnancyList((ArrayList<Map<String, String>>) complicationList);
		ancDiagnosis.setComplicationOfCurrentPregnancy(complicationList.toString());

		ancDiagnosis.toString();
		
		when(ancDiagnosisRepo.save(ancDiagnosis)).thenReturn(ancDiagnosis);

		ANCDiagnosis res = ancDiagnosisRepo.save(ancDiagnosis);
		
		Long ID = res.getID();

		// Assertions
		Assertions.assertNotNull(ancDiagnosis);
		Assertions.assertNotEquals(0, ancDiagnosis.getComplicationOfCurrentPregnancyList());
		Assertions.assertNotNull(res);
		Assertions.assertNotEquals(0, res.getID());
		Assertions.assertNotEquals(0, ancDiagnosis.getComplicationOfCurrentPregnancyList().size());
		Assertions.assertEquals(ID, ancDoctorServiceImpl.saveBenANCDiagnosis(new JsonObject(), prescriptionID));

	}

	@Test
	void testGetANCDiagnosisDetails() {
		// Mock data
		Long beneficiaryRegID = 1L;
		Long visitCode = 2L;
		ArrayList<Object[]> prescriptionData = new ArrayList<>();
		prescriptionData.add(new Object[] { "ExternalInvestigationData", "InstructionData" });

		when(prescriptionDetailRepo.getExternalinvestigationForVisitCode(beneficiaryRegID, visitCode))
				.thenReturn(prescriptionData);

		String externalInvestigation = null;
		String instruction = null;

		externalInvestigation = String.valueOf(prescriptionData.get(0)[0]);
		instruction = String.valueOf(prescriptionData.get(0)[1]);

		Map<String, String> complicationMap = new HashMap<>();

		complicationMap.put("Ectopic Pregnancy Type", "Ectopic Pregnancy");

		complicationMap.put("Ectopic Pregnancy Type2", "Ectopic Pregnancy2");

		complicationMap.toString();

		ArrayList<Map<String, String>> complicationList = new ArrayList<>();

		complicationList.add(complicationMap);

		ANCDiagnosis ancDiagnosisDetails = new ANCDiagnosis();

		ancDiagnosisDetails.setBeneficiaryRegID(1L);
		ancDiagnosisDetails.setVisitCode(2L);
		ancDiagnosisDetails.setCauseOfDeath("Strock");
		ancDiagnosisDetails.setComplicationOfCurrentPregnancy("Complicated");
		ancDiagnosisDetails.setCreatedBy("AK");
		ancDiagnosisDetails.setCreatedDate(Timestamp.valueOf("2020-09-09 09:09:46"));
		ancDiagnosisDetails.setDateOfDeath(Date.valueOf("2021-01-01"));
		ancDiagnosisDetails.setDeleted(true);
		ancDiagnosisDetails.setExternalInvestigation("CBI");
		ancDiagnosisDetails.setHighRiskCondition("High");
		ancDiagnosisDetails.setHighRiskStatus("A grade");
		ancDiagnosisDetails.setID(123L);
		ancDiagnosisDetails.setIsMaternalDeath(true);
		ancDiagnosisDetails.setLastModDate(Timestamp.valueOf("2020-09-09 09:09:46"));
		ancDiagnosisDetails.setModifiedBy("PK");
		ancDiagnosisDetails.setOtherCurrPregComplication("Diabates");
		ancDiagnosisDetails.setPlaceOfDeath("Mumbai");
		ancDiagnosisDetails.setPrescriptionID(2345L);
		ancDiagnosisDetails.setProcessed("Yes");
		ancDiagnosisDetails.setProviderServiceMapID(123);
		ancDiagnosisDetails.setReservedForChange("No");
		ancDiagnosisDetails.setSpecialistDiagnosis("Yes");
		ancDiagnosisDetails.setSyncedBy("AK");
		ancDiagnosisDetails.setSyncedDate(Timestamp.valueOf("2020-09-12 09:09:46"));
		ancDiagnosisDetails.setVanID(2);
		ancDiagnosisDetails.setVanSerialNo(2L);
		ancDiagnosisDetails.setVehicalNo("MH123456");
		ancDiagnosisDetails.setComplicationOfCurrentPregnancyList(complicationList);

		ancDiagnosisDetails.toString();

		ArrayList<ANCDiagnosis> ancDiagnosisList = new ArrayList<>();
		ancDiagnosisList.add(ancDiagnosisDetails);

		when(ancDiagnosisRepo.findByBeneficiaryRegIDAndVisitCode(beneficiaryRegID, visitCode))
				.thenReturn(ancDiagnosisList);

		ancDiagnosisDetails = ancDiagnosisList.get(0);

		ArrayList<Map<String, String>> pregCompList = complicationList;
		Map<String, String> pregCompMap = complicationMap;

		ancDiagnosisDetails.setComplicationOfCurrentPregnancy(ancDiagnosisDetails.getComplicationOfCurrentPregnancy()
				+ " , Other-complications : " + ancDiagnosisDetails.getOtherCurrPregComplication());
		ancDiagnosisDetails.setComplicationOfCurrentPregnancyList(pregCompList);

		ancDiagnosisDetails.setExternalInvestigation(externalInvestigation);
		ancDiagnosisDetails.setSpecialistDiagnosis(instruction);

		// Test
		String result = ancDoctorServiceImpl.getANCDiagnosisDetails(beneficiaryRegID, visitCode);

		// Assertions
		Assertions.assertNotNull(prescriptionData);
		Assertions.assertNotEquals(0, prescriptionData.size());
		Assertions.assertNotNull(ancDiagnosisList);
		Assertions.assertNotEquals(0, ancDiagnosisList.size());
		Assertions.assertNotNull(externalInvestigation);
		Assertions.assertNotNull(instruction);
		Assertions.assertEquals(new Gson().toJson(ancDiagnosisDetails), result);
	}

	@Test
	void testUpdateBenANCDiagnosisIAs1() throws IEMRException {
		// Mock data
		ANCDiagnosis ancDiagnosis = new ANCDiagnosis();
		ancDiagnosis.setBeneficiaryRegID(Long.valueOf(987));
		ancDiagnosis.setVisitCode(Long.valueOf(654));
		ancDiagnosis.setPrescriptionID(Long.valueOf(543));

		// Mock complicationOfCurrentPregnancyList
		List<Map<String, String>> complicationOfCurrentPregnancyList = new ArrayList<>();
		Map<String, String> complicationOfCurrentPregnancyMap = new HashMap<>();

		complicationOfCurrentPregnancyMap.put("Complication type1", "High");

		complicationOfCurrentPregnancyMap.put("Complication type2", "Medium");

		complicationOfCurrentPregnancyMap.put("Complication type3", "Low");

		complicationOfCurrentPregnancyList.add(complicationOfCurrentPregnancyMap);

		String processed = "U";

		when(ancDiagnosisRepo.getANCDiagnosisStatus(ancDiagnosis.getBeneficiaryRegID(), ancDiagnosis.getVisitCode(),
				ancDiagnosis.getPrescriptionID())).thenReturn(processed);

		ancDiagnosis.setID(1L);
		ancDiagnosis.setHighRiskStatus("H");
		ancDiagnosis.setHighRiskCondition("Critical");
		ancDiagnosis.setComplicationOfCurrentPregnancy("");
		ancDiagnosis.setIsMaternalDeath(true);
		ancDiagnosis.setPlaceOfDeath("Kolkata");
		ancDiagnosis.setDateOfDeath(null);
		ancDiagnosis.setCauseOfDeath("Pregency");
		ancDiagnosis.setCreatedBy("Dr Sumit Mondal");
		ancDiagnosis.setProcessed(processed);
		ancDiagnosis.setOtherCurrPregComplication("L");
		ancDiagnosis.setComplicationOfCurrentPregnancyList(
				(ArrayList<Map<String, String>>) complicationOfCurrentPregnancyList);

		ancDiagnosis.toString();
		
		int i = 1;

		when(ancDiagnosisRepo.updateANCDiagnosis(ancDiagnosis.getHighRiskStatus(), ancDiagnosis.getHighRiskCondition(),
				ancDiagnosis.getComplicationOfCurrentPregnancy(), ancDiagnosis.getIsMaternalDeath(),
				ancDiagnosis.getPlaceOfDeath(), ancDiagnosis.getDateOfDeath(), ancDiagnosis.getCauseOfDeath(),
				ancDiagnosis.getCreatedBy(), ancDiagnosis.getProcessed(), ancDiagnosis.getBeneficiaryRegID(),
				ancDiagnosis.getVisitCode(), ancDiagnosis.getOtherCurrPregComplication())).thenReturn(i);

		when(ancDiagnosisRepo.save(ancDiagnosis)).thenReturn(ancDiagnosis);

		ANCDiagnosis res = ancDiagnosisRepo.save(ancDiagnosis);

		// Assertions
		Assertions.assertNotNull(processed);

		Assertions.assertNotEquals("N", processed);

		Assertions.assertNotEquals(0, ancDiagnosis.getComplicationOfCurrentPregnancyList().size());

		Assertions.assertNotNull(res);

		Assertions.assertNotNull(ancDiagnosis);

		Assertions.assertNotNull(ancDiagnosis.getComplicationOfCurrentPregnancyList());

		Assertions.assertNotNull(ancDiagnosisRepo.getANCDiagnosisStatus(ancDiagnosis.getBeneficiaryRegID(),
				ancDiagnosis.getVisitCode(), ancDiagnosis.getPrescriptionID()));
		
		Assertions.assertNotEquals(0, i);
		Assertions.assertEquals(i, ancDoctorServiceImpl.updateBenANCDiagnosis(ancDiagnosis));

	}
	
	@Test
	void testUpdateBenANCDiagnosisIAsZero() throws IEMRException {
		// Mock data
		ANCDiagnosis ancDiagnosis = new ANCDiagnosis();
		ancDiagnosis.setBeneficiaryRegID(Long.valueOf(987));
		ancDiagnosis.setVisitCode(Long.valueOf(654));
		ancDiagnosis.setPrescriptionID(Long.valueOf(543));

		// Mock complicationOfCurrentPregnancyList
		List<Map<String, String>> complicationOfCurrentPregnancyList = new ArrayList<>();
		Map<String, String> complicationOfCurrentPregnancyMap = new HashMap<>();

		complicationOfCurrentPregnancyMap.put("Complication type1", "High");

		complicationOfCurrentPregnancyMap.put("Complication type2", "Medium");

		complicationOfCurrentPregnancyMap.put("Complication type3", "Low");

		complicationOfCurrentPregnancyList.add(complicationOfCurrentPregnancyMap);

		String processed = "U";

		when(ancDiagnosisRepo.getANCDiagnosisStatus(ancDiagnosis.getBeneficiaryRegID(), ancDiagnosis.getVisitCode(),
				ancDiagnosis.getPrescriptionID())).thenReturn(processed);

		ancDiagnosis.setID(1L);
		ancDiagnosis.setHighRiskStatus("H");
		ancDiagnosis.setHighRiskCondition("Critical");
		ancDiagnosis.setComplicationOfCurrentPregnancy("");
		ancDiagnosis.setIsMaternalDeath(true);
		ancDiagnosis.setPlaceOfDeath("Kolkata");
		ancDiagnosis.setDateOfDeath(null);
		ancDiagnosis.setCauseOfDeath("Pregency");
		ancDiagnosis.setCreatedBy("Dr Sumit Mondal");
		ancDiagnosis.setProcessed(processed);
		ancDiagnosis.setOtherCurrPregComplication("L");
		ancDiagnosis.setComplicationOfCurrentPregnancyList(
				(ArrayList<Map<String, String>>) complicationOfCurrentPregnancyList);

		ancDiagnosis.toString();
		
		int i = 0;

		ANCDiagnosis ancDiagnosisRS = ancDiagnosis;
		
		ANCDiagnosis res = ancDiagnosisRepo.save(ancDiagnosis);
		
		
		// Assertions
		Assertions.assertNotNull(processed);

		Assertions.assertNotEquals("N", processed);

		Assertions.assertNotEquals(0, ancDiagnosis.getComplicationOfCurrentPregnancyList().size());

		Assertions.assertNotNull(ancDiagnosisRS);
		Assertions.assertNotEquals(0, ancDiagnosisRS.getID());

		Assertions.assertNotNull(ancDiagnosis);

		Assertions.assertNotNull(ancDiagnosis.getComplicationOfCurrentPregnancyList());

		Assertions.assertNotNull(ancDiagnosisRepo.getANCDiagnosisStatus(ancDiagnosis.getBeneficiaryRegID(),
				ancDiagnosis.getVisitCode(), ancDiagnosis.getPrescriptionID()));
		
		Assertions.assertEquals(0, i);
		Assertions.assertEquals(i, ancDoctorServiceImpl.updateBenANCDiagnosis(ancDiagnosis));

	}

}
