package com.iemr.tm.service.anc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.gson.Gson;
import com.iemr.tm.data.anc.ANCCareDetails;
import com.iemr.tm.data.anc.ANCWomenVaccineDetail;
import com.iemr.tm.data.anc.BenAdherence;
import com.iemr.tm.data.anc.SysObstetricExamination;
import com.iemr.tm.data.anc.WrapperAncImmunization;
import com.iemr.tm.data.anc.WrapperBenInvestigationANC;
import com.iemr.tm.data.quickConsultation.LabTestOrderDetail;
import com.iemr.tm.repo.nurse.anc.ANCCareRepo;
import com.iemr.tm.repo.nurse.anc.ANCWomenVaccineRepo;
import com.iemr.tm.repo.nurse.anc.BenAdherenceRepo;
import com.iemr.tm.repo.nurse.anc.SysObstetricExaminationRepo;
import com.iemr.tm.repo.quickConsultation.LabTestOrderDetailRepo;
import com.iemr.tm.service.anc.ANCNurseServiceImpl;

import jakarta.mail.internet.ParseException;

@ExtendWith(MockitoExtension.class)
class ANCNurseServiceImplTest {
	
	@InjectMocks
    private ANCNurseServiceImpl ancNurseServiceImpl;
	
    @Mock
    private ANCCareRepo ancCareRepo;
    
    @Mock
	private ANCWomenVaccineRepo ancWomenVaccineRepo;
    
    @Mock
	private BenAdherenceRepo benAdherenceRepo;
	
	
    @Mock
    private LabTestOrderDetailRepo labTestOrderDetailRepo;

    @Mock
    private SysObstetricExaminationRepo sysObstetricExaminationRepo;
    
    
    

    @Test
    void testSaveBeneficiaryANCDetails() {
        // Mock data
        ANCCareDetails ancCareDetails = new ANCCareDetails();
        
    	ancCareDetails.setID(666L);
    	ancCareDetails.setBeneficiaryRegID(Long.valueOf(111L));
        ancCareDetails.setBenVisitID(Long.valueOf(112L));
        ancCareDetails.setProviderServiceMapID(1);
        ancCareDetails.setVisitCode(111L);
        ancCareDetails.setVisitNo(Short.valueOf((short) 8));
        ancCareDetails.setComolaintType("Comolaint Type1");
        ancCareDetails.setDuration("3 HRS");
        ancCareDetails.setDescription("ANC Care Description");
        ancCareDetails.setLastMenstrualPeriod_LMP(Date.valueOf("2024-01-01"));
        ancCareDetails.setGestationalAgeOrPeriodofAmenorrhea_POA(Short.valueOf((short) 9));
        ancCareDetails.setTrimesterNumber(Short.valueOf((short) 10));
        ancCareDetails.setPretermDeliveries_P(Short.valueOf((short) 11));
        ancCareDetails.setTermDeliveries_T(Short.valueOf((short) 12));
        ancCareDetails.setExpectedDateofDelivery(Date.valueOf("2024-02-02"));
        ancCareDetails.setPrimiGravida(true);
        ancCareDetails.setGravida_G(Short.valueOf((short) 13));
        ancCareDetails.setAbortions_A(Short.valueOf((short) 14));
        ancCareDetails.setLivebirths_L(Short.valueOf((short) 15));
        ancCareDetails.setBloodGroup("B Positive");
        ancCareDetails.setStillBirth(1);
        
        
        when(ancCareRepo.save(ancCareDetails)).thenReturn(ancCareDetails);
        
        // Assertions
        Assertions.assertNotNull(ancCareDetails);
        
        Assertions.assertNotEquals(0, ancCareDetails.getID());
        
        Assertions.assertEquals(ancCareDetails.getID(),ancNurseServiceImpl.saveBeneficiaryANCDetails(ancCareDetails));
    }
    
    
	@Test
    void testSaveANCWomenVaccineDetails() {
    	
    	ANCWomenVaccineDetail ancWomenVaccineDetails=new ANCWomenVaccineDetail();
    	
    	List<ANCWomenVaccineDetail> ancWomenVaccineDetail = new ArrayList<ANCWomenVaccineDetail>();
    	 	
    	ancWomenVaccineDetails.setID(1L);
    	ancWomenVaccineDetails.setBeneficiaryRegID(888L);
    	ancWomenVaccineDetails.setBenVisitID(38L);
    	ancWomenVaccineDetails.setProviderServiceMapID(6);
    	ancWomenVaccineDetails.setVaccineName("Covid 19 Booster Vaccine");
    	ancWomenVaccineDetails.setStatus("Ready to use");
    	ancWomenVaccineDetails.setReceivedDate(Date.valueOf("2024-09-01"));
    	ancWomenVaccineDetails.setReceivedFacilityName("Kolkata");
    	ancWomenVaccineDetails.setCreatedBy("Deepika Mondal");
    	ancWomenVaccineDetails.setCreatedDate(Timestamp.valueOf("2018-09-01 09:01:15"));
    	ancWomenVaccineDetails.setDeleted(false);
    	ancWomenVaccineDetails.setLastModDate(Timestamp.valueOf("2018-08-01 08:01:15"));
    	ancWomenVaccineDetails.setModifiedBy("Ankita Mondal");
    	ancWomenVaccineDetails.setParkingPlaceID(40);
    	ancWomenVaccineDetails.setProcessed("Processed");
    	ancWomenVaccineDetails.setReservedForChange("Yes");
    	ancWomenVaccineDetails.setStatus("Good");
    	ancWomenVaccineDetails.setSyncedBy("Geek");
    	ancWomenVaccineDetails.setSyncedDate(Timestamp.valueOf("2018-09-01 09:01:15"));
    	ancWomenVaccineDetails.setVanID(2);
    	ancWomenVaccineDetails.setVanSerialNo(4555L);
    	ancWomenVaccineDetails.setVehicalNo("KOL 231");
    	
    	ancWomenVaccineDetail.add(ancWomenVaccineDetails);
			      
        when(ancWomenVaccineRepo.saveAll(ancWomenVaccineDetail)).thenReturn(ancWomenVaccineDetail);
        
        // Assertions
        Assertions.assertNotNull(ancWomenVaccineDetail);
        
        Assertions.assertNotEquals(0, ancWomenVaccineDetail.size());
        
        Assertions.assertEquals(ancWomenVaccineDetails.getID(),ancNurseServiceImpl.saveANCWomenVaccineDetails(ancWomenVaccineDetail));
        
    }

		@Test
        void testSaveBenInvestigationFromDoc() {
        	
        	ArrayList<LabTestOrderDetail> LabTestOrderDetailList = new ArrayList<>();
    		
    		WrapperBenInvestigationANC wrapperBenInvestigationANC=new WrapperBenInvestigationANC();
    		
    		LabTestOrderDetail testData=new LabTestOrderDetail();
    		
    		
    		testData.setBeneficiaryRegID(111L);
    		testData.setBenVisitID(2L);
			testData.setProviderServiceMapID(10);
			testData.setCreatedBy("Amit Mondal");
			testData.setPrescriptionID(4444L);
			
			LabTestOrderDetailList.add(testData);
    		
			wrapperBenInvestigationANC.setBeneficiaryRegID(111L);
    		wrapperBenInvestigationANC.setBenVisitID(2L);
    		wrapperBenInvestigationANC.setProviderServiceMapID(10);
    		wrapperBenInvestigationANC.setPrescriptionID(4444L);
    		wrapperBenInvestigationANC.setCreatedBy("Amit Mondal");
    		wrapperBenInvestigationANC.setLaboratoryList(LabTestOrderDetailList);
			
			
			when(labTestOrderDetailRepo.saveAll(LabTestOrderDetailList)).thenReturn(LabTestOrderDetailList);
			
			Assertions.assertNotNull(LabTestOrderDetailList);
			
			Assertions.assertEquals(1,ancNurseServiceImpl.saveBenInvestigationFromDoc(wrapperBenInvestigationANC));
    	
        }
        
        
        @Test
        void testSaveBenAncCareDetails() throws java.text.ParseException{
        	
        	ANCCareDetails ancCareDetailsOBJ=new ANCCareDetails();
        	
        	ancCareDetailsOBJ.setID(124L);
        	ancCareDetailsOBJ.setLmpDate("2023-09-09");
        	ancCareDetailsOBJ.setExpDelDt("2025-10-10");
        	ancCareDetailsOBJ.setLastMenstrualPeriod_LMP(Date.valueOf("2024-09-09"));
        	ancCareDetailsOBJ.setExpectedDateofDelivery(Date.valueOf("2024-08-07"));
        	
        	
    		
    		
    		when(ancCareRepo.save(ancCareDetailsOBJ)).thenReturn(ancCareDetailsOBJ);
    		
    		Assertions.assertNotNull(ancCareRepo.save(ancCareDetailsOBJ));
    		
    		Assertions.assertNotNull(ancCareDetailsOBJ.getLmpDate());
        	Assertions.assertNotNull(ancCareDetailsOBJ.getExpDelDt());
        	
        	Assertions.assertEquals(10, ancCareDetailsOBJ.getLmpDate().length());
        	Assertions.assertEquals(10, ancCareDetailsOBJ.getExpDelDt().length());
    		
    		
    		Assertions.assertEquals(ancCareDetailsOBJ.getID(),ancNurseServiceImpl.saveBenAncCareDetails(ancCareDetailsOBJ));
        } 
        
        
        /*public static List<ANCWomenVaccineDetail> getANCWomenVaccineDetail(WrapperAncImmunization wrapperAncImmunizationOBJ)
    			throws ParseException {
    		List<ANCWomenVaccineDetail> ancWomenVaccineDetailList = new ArrayList<ANCWomenVaccineDetail>();
    		ANCWomenVaccineDetail ancWomenVaccineDetail=new ANCWomenVaccineDetail();
    		if (wrapperAncImmunizationOBJ != null) {

    			// TT-1 details
    			ancWomenVaccineDetail = new ANCWomenVaccineDetail();
    			ancWomenVaccineDetail.setID(2L);
    			ancWomenVaccineDetail.setBeneficiaryRegID(1L);
    			ancWomenVaccineDetail.setBenVisitID(2L);
    			ancWomenVaccineDetail.setVisitCode(3L);
    			ancWomenVaccineDetail.setProviderServiceMapID(3);
    			ancWomenVaccineDetail.setVanID(4);
    			ancWomenVaccineDetail.setParkingPlaceID(5);
    			ancWomenVaccineDetail.setCreatedBy("B Saha");
    			ancWomenVaccineDetail.setID(2L);
    			ancWomenVaccineDetail.setVaccineName("TT-1");
    			ancWomenVaccineDetail.setStatus("Approved and Ready to use");
    			ancWomenVaccineDetail.setReceivedDate(Date.valueOf("2020-09-09"));
    			}
    		
    			ancWomenVaccineDetail.setReceivedFacilityName("KDC");
    			ancWomenVaccineDetail.setModifiedBy("BK Saha");
    			
    			ancWomenVaccineDetailList.add(ancWomenVaccineDetail);

    			
    		return ancWomenVaccineDetailList;
    	}

        
        
		@Test
        public void testSaveAncImmunizationDetails() throws ParseException, java.text.ParseException {
			
			WrapperAncImmunization wrapperAncImmunizationOBJ=new WrapperAncImmunization();
	    	
	    	List<ANCWomenVaccineDetail> ancWomenVaccineDetailList = getANCWomenVaccineDetail(wrapperAncImmunizationOBJ);    	
	    			
			when(ancWomenVaccineRepo.saveAll((List<ANCWomenVaccineDetail>) ancWomenVaccineDetailList)).thenReturn((List<ANCWomenVaccineDetail>) ancWomenVaccineDetailList);
			
			Assertions.assertNotNull(ancWomenVaccineDetailList);
					
			Assertions.assertNotEquals(0, ancWomenVaccineDetailList.size());
			
			Assertions.assertEquals(ancWomenVaccineDetailList.get(0).getID(),ancNurseServiceImpl.saveAncImmunizationDetails(wrapperAncImmunizationOBJ));
			
        }*/
		
		@Test
        void testSaveSysObstetricExamination() {
			
			Long r = null;
			
			SysObstetricExamination obstetricExamination=new SysObstetricExamination();
			
			obstetricExamination.setID(12L);
			obstetricExamination.setBeneficiaryRegID(14L);
			obstetricExamination.setBenVisitID(23L);
			
			when(sysObstetricExaminationRepo.save(obstetricExamination)).thenReturn(obstetricExamination);
			
			
			r = obstetricExamination.getID();
			
			when(sysObstetricExaminationRepo.save(obstetricExamination)).thenReturn(obstetricExamination);
			
			Assertions.assertNotNull(sysObstetricExaminationRepo.save(obstetricExamination));
			
			Assertions.assertEquals(r,ancNurseServiceImpl.saveSysObstetricExamination(obstetricExamination));
			
        }
		
		
		@Test
		void testGetSysObstetricExamination() {
			SysObstetricExamination sysObstetricExaminationData = new SysObstetricExamination();
			
			sysObstetricExaminationData.setBeneficiaryRegID(1L);
			sysObstetricExaminationData.setBenVisitID(3L);
			
			Long benRegID=1L;
			Long visitCode=3L;
			
			when(sysObstetricExaminationRepo.getSysObstetricExaminationData(1L, 3L)).thenReturn(sysObstetricExaminationData);

			Assertions.assertEquals(sysObstetricExaminationData, ancNurseServiceImpl.getSysObstetricExamination(benRegID,visitCode));
		}
        
}        

	
    
