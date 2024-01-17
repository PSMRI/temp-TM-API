package com.iemr.tm.anc;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.gson.JsonObject;
import com.iemr.tm.repo.nurse.anc.ANCDiagnosisRepo;
import com.iemr.tm.repo.quickConsultation.PrescriptionDetailRepo;
import com.iemr.tm.service.anc.ANCDoctorServiceImpl;
import com.iemr.tm.utils.exception.IEMRException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ANCDoctorServiceImplTests {
	
	@Autowired
	public ANCDoctorServiceImpl ancDoctorServiceImpl;
	
	@Mock
	private ANCDiagnosisRepo ancDiagnosisRepo;
	private PrescriptionDetailRepo prescriptionDetailRepo;
	
	public void saveBenANCDiagnosis(JsonObject obj, Long prescriptionID) throws IEMRException{
		
	}

}
