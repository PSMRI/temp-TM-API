package com.iemr.tm.service.anc;


import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Date;
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

import com.google.gson.JsonObject;
import com.iemr.tm.data.anc.ANCDiagnosis;
import com.iemr.tm.repo.nurse.anc.ANCDiagnosisRepo;
import com.iemr.tm.repo.quickConsultation.PrescriptionDetailRepo;
import com.iemr.tm.service.anc.ANCDoctorServiceImpl;
import com.iemr.tm.utils.exception.IEMRException;
import com.iemr.tm.utils.mapper.InputMapper;

@ExtendWith(MockitoExtension.class)
class ANCDoctorServiceImplTest {
	
	@InjectMocks
    private ANCDoctorServiceImpl ancDoctorServiceImpl;

    @Mock
    ANCDiagnosisRepo ancDiagnosisRepo;
    
    @Mock
    private PrescriptionDetailRepo prescriptionDetailRepo;

    
	@Test
    void testSaveBenANCDiagnosis() throws IEMRException {

        Long prescriptionID = 111L;

        ANCDiagnosis ancDiagnosis = new ANCDiagnosis();


        List<Map<String, String>> complicationList = new ArrayList<>();
        Map<String, String> complicationMap = new HashMap<>();

        complicationMap.put("Ectopic Pregnancy Type", "Ectopic Pregnancy");
        
        complicationMap.put("Ectopic Pregnancy Type2", "Ectopic Pregnancy2");

        complicationList.add(complicationMap);

        ancDiagnosis.setComplicationOfCurrentPregnancyList((ArrayList<Map<String, String>>) complicationList);
      
        
                
        when(ancDiagnosisRepo.save(ancDiagnosis)).thenReturn(ancDiagnosis);
        
        ANCDiagnosis res = ancDiagnosisRepo.save(ancDiagnosis); 
		
        Assertions.assertEquals(res.getID(),ancDoctorServiceImpl.saveBenANCDiagnosis(new JsonObject(), prescriptionID));
    
	}   
    
    	@Test
    	void testGetANCDiagnosisDetails() {
	        // Mock data
	        Long beneficiaryRegID = 1L;
	        Long visitCode = 2L;
	        ArrayList<Object[]> prescriptionData = new ArrayList<>();
	        prescriptionData.add(new Object[]{"ExternalInvestigationData", "InstructionData"});
	
	        when(prescriptionDetailRepo.getExternalinvestigationForVisitCode(beneficiaryRegID, visitCode))
	                .thenReturn(prescriptionData);
	        // Test
	        String result = ancDoctorServiceImpl.getANCDiagnosisDetails(beneficiaryRegID, visitCode);
	
	        // Assertions
	        Assertions.assertNotNull(result);
    }

    @Test
    void testUpdateBenANCDiagnosis() throws IEMRException {
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
        
        ancDiagnosis.setComplicationOfCurrentPregnancyList((ArrayList<Map<String, String>>) complicationOfCurrentPregnancyList);
        
        when(ancDiagnosisRepo.getANCDiagnosisStatus(ancDiagnosis.getBeneficiaryRegID(),
				ancDiagnosis.getVisitCode(), ancDiagnosis.getPrescriptionID())).thenReturn("U");
        
        Assertions.assertNotNull(ancDiagnosis);
        
        Assertions.assertNotNull(ancDiagnosis.getComplicationOfCurrentPregnancyList());
        
      
        
        Assertions.assertNotNull(ancDiagnosisRepo.getANCDiagnosisStatus(ancDiagnosis.getBeneficiaryRegID(),
				ancDiagnosis.getVisitCode(), ancDiagnosis.getPrescriptionID()));
        
        
        ancDiagnosis.setHighRiskStatus("H");
		ancDiagnosis.setHighRiskCondition("Critical");
		ancDiagnosis.setComplicationOfCurrentPregnancy("");
	    ancDiagnosis.setIsMaternalDeath(true);
	    ancDiagnosis.setPlaceOfDeath("Kolkata");
	    ancDiagnosis.setDateOfDeath(null);
		ancDiagnosis.setCauseOfDeath("Pregency");
		ancDiagnosis.setCreatedBy("Dr Sumit Mondal");
		ancDiagnosis.setProcessed("U");
		ancDiagnosis.setOtherCurrPregComplication("L");
		
		when(ancDiagnosisRepo.updateANCDiagnosis(ancDiagnosis.getHighRiskStatus(),
				ancDiagnosis.getHighRiskCondition(), ancDiagnosis.getComplicationOfCurrentPregnancy(),
				ancDiagnosis.getIsMaternalDeath(), ancDiagnosis.getPlaceOfDeath(), ancDiagnosis.getDateOfDeath(),
				ancDiagnosis.getCauseOfDeath(), ancDiagnosis.getCreatedBy(), ancDiagnosis.getProcessed(),
				ancDiagnosis.getBeneficiaryRegID(), ancDiagnosis.getVisitCode(),
				ancDiagnosis.getOtherCurrPregComplication())).thenReturn(1);
               
        when(ancDiagnosisRepo.save(ancDiagnosis)).thenReturn(ancDiagnosis);
        
        ANCDiagnosis res2 = ancDiagnosisRepo.save(ancDiagnosis); 
        
        Assertions.assertNotNull(res2);

        // Assertions
        Assertions.assertEquals(1,ancDoctorServiceImpl.updateBenANCDiagnosis(ancDiagnosis));
    

    }
    
}    
