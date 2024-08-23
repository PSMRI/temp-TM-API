package com.iemr.tm.service.cancerScreening;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iemr.tm.data.doctor.CancerDiagnosis;
import com.iemr.tm.repo.doctor.CancerDiagnosisRepo;

@ExtendWith(MockitoExtension.class)
class CSOncologistServiceImplTest {
	
	@InjectMocks
	CSOncologistServiceImpl csOncologistServiceImpl;
	
	@Mock
	CancerDiagnosisRepo cancerDiagnosisRepo;
	
	
	@Test
	void updateCancerDiagnosisDetailsByOncologistTestASProcessed() {
		
		CancerDiagnosis cancerDiagnosis = new CancerDiagnosis();
		
		cancerDiagnosis.setID(1L);
		cancerDiagnosis.setBeneficiaryRegID(2L);
		cancerDiagnosis.setProviderServiceMapID(3);
		cancerDiagnosis.setProvisionalDiagnosisPrimaryDoctor("Dr. C Mallik");
		cancerDiagnosis.setProvisionalDiagnosisOncologist("Dr. C Mallik");
		cancerDiagnosis.setRemarks("Excellent Doctor");
		cancerDiagnosis.setReferredToInstituteID(123);
		cancerDiagnosis.setReferredToInstituteName("HCG");
		cancerDiagnosis.setRefrredToAdditionalService("Cancer Treatment");
		cancerDiagnosis.setReferralReason("Treatment");
		cancerDiagnosis.setVisitCode(12L);
		
		cancerDiagnosis.toString();
		
		int response = 0;
		int recordsAvailable = 0;
		
		String processed = "U";
		
		when(cancerDiagnosisRepo.getCancerDiagnosisStatuses(cancerDiagnosis.getBeneficiaryRegID(),
				cancerDiagnosis.getVisitCode())).thenReturn(processed);
		
		response = 1;
		recordsAvailable = 1;
		
		when(cancerDiagnosisRepo.updateDetailsByOncologist(
				cancerDiagnosis.getProvisionalDiagnosisOncologist(), cancerDiagnosis.getBeneficiaryRegID(),
				cancerDiagnosis.getVisitCode(), cancerDiagnosis.getModifiedBy(), processed)).thenReturn(response);
		
		//Assertions
		Assertions.assertNotNull(processed);
		Assertions.assertNotEquals(0, recordsAvailable);
		Assertions.assertEquals(response, csOncologistServiceImpl.updateCancerDiagnosisDetailsByOncologist(cancerDiagnosis));
	}
	
	
	@Test
	void updateCancerDiagnosisDetailsByOncologistTestAsNullProcessed() {
		
		CancerDiagnosis cancerDiagnosis = new CancerDiagnosis();
		
		cancerDiagnosis.setID(1L);
		cancerDiagnosis.setBeneficiaryRegID(2L);
		cancerDiagnosis.setProviderServiceMapID(3);
		cancerDiagnosis.setProvisionalDiagnosisPrimaryDoctor("Dr. C Mallik");
		cancerDiagnosis.setProvisionalDiagnosisOncologist("Dr. C Mallik");
		cancerDiagnosis.setRemarks("Excellent Doctor");
		cancerDiagnosis.setReferredToInstituteID(123);
		cancerDiagnosis.setReferredToInstituteName("HCG");
		cancerDiagnosis.setRefrredToAdditionalService("Cancer Treatment");
		cancerDiagnosis.setReferralReason("Treatment");
		cancerDiagnosis.setVisitCode(12L);
		cancerDiagnosis.setModifiedBy("A K");
		
		cancerDiagnosis.toString();
		
		int response = 0;
		int recordsAvailable = 0;
		
		String processed = "N";
		
		when(cancerDiagnosisRepo.getCancerDiagnosisStatuses(cancerDiagnosis.getBeneficiaryRegID(),
				cancerDiagnosis.getVisitCode())).thenReturn(processed);
		
		recordsAvailable = 0;
		
		cancerDiagnosis.setCreatedBy(cancerDiagnosis.getModifiedBy());
		
		CancerDiagnosis cancerDiagnosisRS = cancerDiagnosis;
				
		//Assertions
		Assertions.assertEquals("N",processed);
		Assertions.assertEquals(0, recordsAvailable);
		Assertions.assertNotNull(cancerDiagnosisRS);
		Assertions.assertEquals(response, csOncologistServiceImpl.updateCancerDiagnosisDetailsByOncologist(cancerDiagnosis));
	}

}
