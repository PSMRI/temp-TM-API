package com.iemr.tm.service.anc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.OptimisticLockingFailureException;

import com.iemr.tm.data.anc.ANCCareDetails;
import com.iemr.tm.data.anc.ANCWomenVaccineDetail;
import com.iemr.tm.data.anc.BenAdherence;
import com.iemr.tm.data.anc.SysObstetricExamination;
import com.iemr.tm.data.anc.WrapperBenInvestigationANC;
import com.iemr.tm.data.quickConsultation.LabTestOrderDetail;
import com.iemr.tm.repo.nurse.anc.ANCCareRepo;
import com.iemr.tm.repo.nurse.anc.ANCWomenVaccineRepo;
import com.iemr.tm.repo.nurse.anc.BenAdherenceRepo;
import com.iemr.tm.repo.nurse.anc.SysObstetricExaminationRepo;
import com.iemr.tm.repo.quickConsultation.LabTestOrderDetailRepo;

@ExtendWith(MockitoExtension.class)
class ANCNurseServiceImplTest {

	@Mock
	private ANCCareRepo mockAncCareRepo;
	@Mock
	private ANCWomenVaccineRepo mockAncWomenVaccineRepo;
	@Mock
	private BenAdherenceRepo mockBenAdherenceRepo;
	@Mock
	private SysObstetricExaminationRepo mockSysObstetricExaminationRepo;
	@Mock
	private LabTestOrderDetailRepo mockLabTestOrderDetailRepo;

	private ANCNurseServiceImpl ancNurseServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		ancNurseServiceImplUnderTest = new ANCNurseServiceImpl();
		ancNurseServiceImplUnderTest.setAncCareRepo(mockAncCareRepo);
		ancNurseServiceImplUnderTest.setAncWomenVaccineRepo(mockAncWomenVaccineRepo);
		ancNurseServiceImplUnderTest.setBenAdherenceRepo(mockBenAdherenceRepo);
		ancNurseServiceImplUnderTest.setSysObstetricExaminationRepo(mockSysObstetricExaminationRepo);
		ancNurseServiceImplUnderTest.setLabTestOrderDetailRepo(mockLabTestOrderDetailRepo);
	}

	@Test
	void testSaveBeneficiaryANCDetails() {
		// Setup
		final ANCCareDetails ancCareDetails = new ANCCareDetails();
		ancCareDetails.setID(0L);
		ancCareDetails.setBeneficiaryRegID(0L);
		ancCareDetails.setBenVisitID(0L);
		ancCareDetails.setProviderServiceMapID(0);
		ancCareDetails.setVisitCode(0L);
		ancCareDetails.setVisitNo((short) 0);
		ancCareDetails.setComolaintType("comolaintType");
		ancCareDetails.setDuration("duration");
		ancCareDetails.setDescription("description");
		ancCareDetails.setLastMenstrualPeriod_LMP(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetails.setGestationalAgeOrPeriodofAmenorrhea_POA((short) 0);
		ancCareDetails.setTrimesterNumber((short) 0);
		ancCareDetails.setExpectedDateofDelivery(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetails.setPrimiGravida(false);
		ancCareDetails.setGravida_G((short) 0);
		ancCareDetails.setTermDeliveries_T((short) 0);
		ancCareDetails.setPretermDeliveries_P((short) 0);
		ancCareDetails.setAbortions_A((short) 0);
		ancCareDetails.setLivebirths_L((short) 0);
		ancCareDetails.setBloodGroup("bloodGroup");
		ancCareDetails.setModifiedBy("modifiedBy");
		ancCareDetails.setLmpDate("lmpDate");
		ancCareDetails.setExpDelDt("expDelDt");
		ancCareDetails.setStillBirth(0);

		ancCareDetails.toString();

		// Configure ANCCareRepo.save(...).
		final ANCCareDetails ancCareDetails1 = new ANCCareDetails();
		ancCareDetails1.setID(0L);
		ancCareDetails1.setBeneficiaryRegID(0L);
		ancCareDetails1.setBenVisitID(0L);
		ancCareDetails1.setProviderServiceMapID(0);
		ancCareDetails1.setVisitCode(0L);
		ancCareDetails1.setVisitNo((short) 0);
		ancCareDetails1.setComolaintType("comolaintType");
		ancCareDetails1.setDuration("duration");
		ancCareDetails1.setDescription("description");
		ancCareDetails1.setLastMenstrualPeriod_LMP(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetails1.setGestationalAgeOrPeriodofAmenorrhea_POA((short) 0);
		ancCareDetails1.setTrimesterNumber((short) 0);
		ancCareDetails1.setExpectedDateofDelivery(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetails1.setPrimiGravida(false);
		ancCareDetails1.setGravida_G((short) 0);
		ancCareDetails1.setTermDeliveries_T((short) 0);
		ancCareDetails1.setPretermDeliveries_P((short) 0);
		ancCareDetails1.setAbortions_A((short) 0);
		ancCareDetails1.setLivebirths_L((short) 0);
		ancCareDetails1.setBloodGroup("bloodGroup");
		ancCareDetails1.setModifiedBy("modifiedBy");
		ancCareDetails1.setLmpDate("lmpDate");
		ancCareDetails1.setExpDelDt("expDelDt");
		ancCareDetails1.setStillBirth(0);
		when(mockAncCareRepo.save(any(ANCCareDetails.class))).thenReturn(ancCareDetails1);

		// Run the test
		final Long result = ancNurseServiceImplUnderTest.saveBeneficiaryANCDetails(ancCareDetails);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveBeneficiaryANCDetails_ANCCareRepoReturnsNull() {
		// Setup
		final ANCCareDetails ancCareDetails = new ANCCareDetails();
		ancCareDetails.setID(0L);
		ancCareDetails.setBeneficiaryRegID(0L);
		ancCareDetails.setBenVisitID(0L);
		ancCareDetails.setProviderServiceMapID(0);
		ancCareDetails.setVisitCode(0L);
		ancCareDetails.setVisitNo((short) 0);
		ancCareDetails.setComolaintType("comolaintType");
		ancCareDetails.setDuration("duration");
		ancCareDetails.setDescription("description");
		ancCareDetails.setLastMenstrualPeriod_LMP(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetails.setGestationalAgeOrPeriodofAmenorrhea_POA((short) 0);
		ancCareDetails.setTrimesterNumber((short) 0);
		ancCareDetails.setExpectedDateofDelivery(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetails.setPrimiGravida(false);
		ancCareDetails.setGravida_G((short) 0);
		ancCareDetails.setTermDeliveries_T((short) 0);
		ancCareDetails.setPretermDeliveries_P((short) 0);
		ancCareDetails.setAbortions_A((short) 0);
		ancCareDetails.setLivebirths_L((short) 0);
		ancCareDetails.setBloodGroup("bloodGroup");
		ancCareDetails.setModifiedBy("modifiedBy");
		ancCareDetails.setLmpDate("lmpDate");
		ancCareDetails.setExpDelDt("expDelDt");
		ancCareDetails.setStillBirth(0);

		when(mockAncCareRepo.save(any(ANCCareDetails.class))).thenReturn(null);

		// Run the test
		final Long result = ancNurseServiceImplUnderTest.saveBeneficiaryANCDetails(ancCareDetails);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveBeneficiaryANCDetails_ANCCareRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final ANCCareDetails ancCareDetails = new ANCCareDetails();
		ancCareDetails.setID(0L);
		ancCareDetails.setBeneficiaryRegID(0L);
		ancCareDetails.setBenVisitID(0L);
		ancCareDetails.setProviderServiceMapID(0);
		ancCareDetails.setVisitCode(0L);
		ancCareDetails.setVisitNo((short) 0);
		ancCareDetails.setComolaintType("comolaintType");
		ancCareDetails.setDuration("duration");
		ancCareDetails.setDescription("description");
		ancCareDetails.setLastMenstrualPeriod_LMP(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetails.setGestationalAgeOrPeriodofAmenorrhea_POA((short) 0);
		ancCareDetails.setTrimesterNumber((short) 0);
		ancCareDetails.setExpectedDateofDelivery(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetails.setPrimiGravida(false);
		ancCareDetails.setGravida_G((short) 0);
		ancCareDetails.setTermDeliveries_T((short) 0);
		ancCareDetails.setPretermDeliveries_P((short) 0);
		ancCareDetails.setAbortions_A((short) 0);
		ancCareDetails.setLivebirths_L((short) 0);
		ancCareDetails.setBloodGroup("bloodGroup");
		ancCareDetails.setModifiedBy("modifiedBy");
		ancCareDetails.setLmpDate("lmpDate");
		ancCareDetails.setExpDelDt("expDelDt");
		ancCareDetails.setStillBirth(0);

		when(mockAncCareRepo.save(any(ANCCareDetails.class))).thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> ancNurseServiceImplUnderTest.saveBeneficiaryANCDetails(ancCareDetails))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testSaveANCWomenVaccineDetails() {
		// Setup
		final ANCWomenVaccineDetail ancWomenVaccineDetail = new ANCWomenVaccineDetail();
		ancWomenVaccineDetail.setID(0L);
		ancWomenVaccineDetail.setBeneficiaryRegID(0L);
		ancWomenVaccineDetail.setBenVisitID(0L);
		ancWomenVaccineDetail.setProviderServiceMapID(0);
		ancWomenVaccineDetail.setVaccineName("vaccineName");
		ancWomenVaccineDetail.setStatus("status");
		ancWomenVaccineDetail.setReceivedDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancWomenVaccineDetail.setReceivedFacilityName("facilityNameOfTT_1");
		ancWomenVaccineDetail.setCreatedBy("createdBy");
		ancWomenVaccineDetail.setModifiedBy("modifiedBy");
		ancWomenVaccineDetail.setParkingPlaceID(0);
		ancWomenVaccineDetail.setVisitCode(0L);
		ancWomenVaccineDetail.setVanID(0);

		ancWomenVaccineDetail.toString();

		final List<ANCWomenVaccineDetail> ancWomenVaccineDetails = List.of(ancWomenVaccineDetail);

		// Configure ANCWomenVaccineRepo.saveAll(...).
		final ANCWomenVaccineDetail ancWomenVaccineDetail1 = new ANCWomenVaccineDetail();
		ancWomenVaccineDetail1.setID(0L);
		ancWomenVaccineDetail1.setBeneficiaryRegID(0L);
		ancWomenVaccineDetail1.setBenVisitID(0L);
		ancWomenVaccineDetail1.setProviderServiceMapID(0);
		ancWomenVaccineDetail1.setVaccineName("vaccineName");
		ancWomenVaccineDetail1.setStatus("status");
		ancWomenVaccineDetail1.setReceivedDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancWomenVaccineDetail1.setReceivedFacilityName("facilityNameOfTT_1");
		ancWomenVaccineDetail1.setCreatedBy("createdBy");
		ancWomenVaccineDetail1.setModifiedBy("modifiedBy");
		ancWomenVaccineDetail1.setParkingPlaceID(0);
		ancWomenVaccineDetail1.setVisitCode(0L);
		ancWomenVaccineDetail1.setVanID(0);
		final Iterable<ANCWomenVaccineDetail> ancWomenVaccineDetails1 = List.of(ancWomenVaccineDetail1);
		final ANCWomenVaccineDetail ancWomenVaccineDetail2 = new ANCWomenVaccineDetail();
		ancWomenVaccineDetail2.setID(0L);
		ancWomenVaccineDetail2.setBeneficiaryRegID(0L);
		ancWomenVaccineDetail2.setBenVisitID(0L);
		ancWomenVaccineDetail2.setProviderServiceMapID(0);
		ancWomenVaccineDetail2.setVaccineName("vaccineName");
		ancWomenVaccineDetail2.setStatus("status");
		ancWomenVaccineDetail2.setReceivedDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancWomenVaccineDetail2.setReceivedFacilityName("facilityNameOfTT_1");
		ancWomenVaccineDetail2.setCreatedBy("createdBy");
		ancWomenVaccineDetail2.setModifiedBy("modifiedBy");
		ancWomenVaccineDetail2.setParkingPlaceID(0);
		ancWomenVaccineDetail2.setVisitCode(0L);
		ancWomenVaccineDetail2.setVanID(0);
		final List<ANCWomenVaccineDetail> entities = List.of(ancWomenVaccineDetail2);

		// Run the test
		final Long result = ancNurseServiceImplUnderTest.saveANCWomenVaccineDetails(ancWomenVaccineDetails);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveANCWomenVaccineDetails_ANCWomenVaccineRepoReturnsNull() {
		// Setup
		final ANCWomenVaccineDetail ancWomenVaccineDetail = new ANCWomenVaccineDetail();
		ancWomenVaccineDetail.setID(0L);
		ancWomenVaccineDetail.setBeneficiaryRegID(0L);
		ancWomenVaccineDetail.setBenVisitID(0L);
		ancWomenVaccineDetail.setProviderServiceMapID(0);
		ancWomenVaccineDetail.setVaccineName("vaccineName");
		ancWomenVaccineDetail.setStatus("status");
		ancWomenVaccineDetail.setReceivedDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancWomenVaccineDetail.setReceivedFacilityName("facilityNameOfTT_1");
		ancWomenVaccineDetail.setCreatedBy("createdBy");
		ancWomenVaccineDetail.setModifiedBy("modifiedBy");
		ancWomenVaccineDetail.setParkingPlaceID(0);
		ancWomenVaccineDetail.setVisitCode(0L);
		ancWomenVaccineDetail.setVanID(0);
		final List<ANCWomenVaccineDetail> ancWomenVaccineDetails = List.of(ancWomenVaccineDetail);

		// Configure ANCWomenVaccineRepo.saveAll(...).
		final ANCWomenVaccineDetail ancWomenVaccineDetail1 = new ANCWomenVaccineDetail();
		ancWomenVaccineDetail1.setID(0L);
		ancWomenVaccineDetail1.setBeneficiaryRegID(0L);
		ancWomenVaccineDetail1.setBenVisitID(0L);
		ancWomenVaccineDetail1.setProviderServiceMapID(0);
		ancWomenVaccineDetail1.setVaccineName("vaccineName");
		ancWomenVaccineDetail1.setStatus("status");
		ancWomenVaccineDetail1.setReceivedDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancWomenVaccineDetail1.setReceivedFacilityName("facilityNameOfTT_1");
		ancWomenVaccineDetail1.setCreatedBy("createdBy");
		ancWomenVaccineDetail1.setModifiedBy("modifiedBy");
		ancWomenVaccineDetail1.setParkingPlaceID(0);
		ancWomenVaccineDetail1.setVisitCode(0L);
		ancWomenVaccineDetail1.setVanID(0);
		final List<ANCWomenVaccineDetail> entities = List.of(ancWomenVaccineDetail1);

		// Run the test
		final Long result = ancNurseServiceImplUnderTest.saveANCWomenVaccineDetails(ancWomenVaccineDetails);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveANCWomenVaccineDetails_ANCWomenVaccineRepoReturnsNoItems() {
		// Setup
		final ANCWomenVaccineDetail ancWomenVaccineDetail = new ANCWomenVaccineDetail();
		ancWomenVaccineDetail.setID(0L);
		ancWomenVaccineDetail.setBeneficiaryRegID(0L);
		ancWomenVaccineDetail.setBenVisitID(0L);
		ancWomenVaccineDetail.setProviderServiceMapID(0);
		ancWomenVaccineDetail.setVaccineName("vaccineName");
		ancWomenVaccineDetail.setStatus("status");
		ancWomenVaccineDetail.setReceivedDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancWomenVaccineDetail.setReceivedFacilityName("facilityNameOfTT_1");
		ancWomenVaccineDetail.setCreatedBy("createdBy");
		ancWomenVaccineDetail.setModifiedBy("modifiedBy");
		ancWomenVaccineDetail.setParkingPlaceID(0);
		ancWomenVaccineDetail.setVisitCode(0L);
		ancWomenVaccineDetail.setVanID(0);
		final List<ANCWomenVaccineDetail> ancWomenVaccineDetails = List.of(ancWomenVaccineDetail);

		// Configure ANCWomenVaccineRepo.saveAll(...).
		final ANCWomenVaccineDetail ancWomenVaccineDetail1 = new ANCWomenVaccineDetail();
		ancWomenVaccineDetail1.setID(0L);
		ancWomenVaccineDetail1.setBeneficiaryRegID(0L);
		ancWomenVaccineDetail1.setBenVisitID(0L);
		ancWomenVaccineDetail1.setProviderServiceMapID(0);
		ancWomenVaccineDetail1.setVaccineName("vaccineName");
		ancWomenVaccineDetail1.setStatus("status");
		ancWomenVaccineDetail1.setReceivedDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancWomenVaccineDetail1.setReceivedFacilityName("facilityNameOfTT_1");
		ancWomenVaccineDetail1.setCreatedBy("createdBy");
		ancWomenVaccineDetail1.setModifiedBy("modifiedBy");
		ancWomenVaccineDetail1.setParkingPlaceID(0);
		ancWomenVaccineDetail1.setVisitCode(0L);
		ancWomenVaccineDetail1.setVanID(0);
		final List<ANCWomenVaccineDetail> entities = List.of(ancWomenVaccineDetail1);

		// Run the test
		final Long result = ancNurseServiceImplUnderTest.saveANCWomenVaccineDetails(ancWomenVaccineDetails);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveBenInvestigationFromDoc() {
		// Setup
		final WrapperBenInvestigationANC wrapperBenInvestigationANC = new WrapperBenInvestigationANC();
		wrapperBenInvestigationANC.setBeneficiaryRegID(0L);
		wrapperBenInvestigationANC.setBenVisitID(0L);
		wrapperBenInvestigationANC.setProviderServiceMapID(0);
		wrapperBenInvestigationANC.setPrescriptionID(0L);
		wrapperBenInvestigationANC.setCreatedBy("createdBy");

		wrapperBenInvestigationANC.toString();

		final LabTestOrderDetail labTestOrderDetail = new LabTestOrderDetail();
		labTestOrderDetail.setBeneficiaryRegID(0L);
		labTestOrderDetail.setBenVisitID(0L);
		labTestOrderDetail.setProviderServiceMapID(0);
		labTestOrderDetail.setPrescriptionID(0L);
		labTestOrderDetail.setCreatedBy("createdBy");

		labTestOrderDetail.toString();

		wrapperBenInvestigationANC.setLaboratoryList(new ArrayList<>(List.of(labTestOrderDetail)));

		wrapperBenInvestigationANC.toString();

		// Configure LabTestOrderDetailRepo.saveAll(...).
		final Iterable<LabTestOrderDetail> labTestOrderDetails = List.of(new LabTestOrderDetail(0, "procedureName"));

		// Run the test
		final Integer result = ancNurseServiceImplUnderTest.saveBenInvestigationFromDoc(wrapperBenInvestigationANC);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testSaveBenInvestigationFromDoc_LabTestOrderDetailRepoReturnsNull() {
		// Setup
		final WrapperBenInvestigationANC wrapperBenInvestigationANC = new WrapperBenInvestigationANC();
		wrapperBenInvestigationANC.setBeneficiaryRegID(0L);
		wrapperBenInvestigationANC.setBenVisitID(0L);
		wrapperBenInvestigationANC.setProviderServiceMapID(0);
		wrapperBenInvestigationANC.setPrescriptionID(0L);
		wrapperBenInvestigationANC.setCreatedBy("createdBy");
		final LabTestOrderDetail labTestOrderDetail = new LabTestOrderDetail();
		labTestOrderDetail.setBeneficiaryRegID(0L);
		labTestOrderDetail.setBenVisitID(0L);
		labTestOrderDetail.setProviderServiceMapID(0);
		labTestOrderDetail.setPrescriptionID(0L);
		labTestOrderDetail.setCreatedBy("createdBy");
		wrapperBenInvestigationANC.setLaboratoryList(new ArrayList<>(List.of(labTestOrderDetail)));

		// Run the test
		final Integer result = ancNurseServiceImplUnderTest.saveBenInvestigationFromDoc(wrapperBenInvestigationANC);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testSaveBenInvestigationFromDoc_LabTestOrderDetailRepoReturnsNoItems() {
		// Setup
		final WrapperBenInvestigationANC wrapperBenInvestigationANC = new WrapperBenInvestigationANC();
		wrapperBenInvestigationANC.setBeneficiaryRegID(0L);
		wrapperBenInvestigationANC.setBenVisitID(0L);
		wrapperBenInvestigationANC.setProviderServiceMapID(0);
		wrapperBenInvestigationANC.setPrescriptionID(0L);
		wrapperBenInvestigationANC.setCreatedBy("createdBy");
		final LabTestOrderDetail labTestOrderDetail = new LabTestOrderDetail();
		labTestOrderDetail.setBeneficiaryRegID(0L);
		labTestOrderDetail.setBenVisitID(0L);
		labTestOrderDetail.setProviderServiceMapID(0);
		labTestOrderDetail.setPrescriptionID(0L);
		labTestOrderDetail.setCreatedBy("createdBy");
		wrapperBenInvestigationANC.setLaboratoryList(new ArrayList<>(List.of(labTestOrderDetail)));

		// Run the test
		final Integer result = ancNurseServiceImplUnderTest.saveBenInvestigationFromDoc(wrapperBenInvestigationANC);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testSaveBenAncCareDetails() throws Exception {
		// Setup
		final ANCCareDetails ancCareDetailsOBJ = new ANCCareDetails();
		ancCareDetailsOBJ.setID(0L);
		ancCareDetailsOBJ.setBeneficiaryRegID(0L);
		ancCareDetailsOBJ.setBenVisitID(0L);
		ancCareDetailsOBJ.setProviderServiceMapID(0);
		ancCareDetailsOBJ.setVisitCode(0L);
		ancCareDetailsOBJ.setVisitNo((short) 0);
		ancCareDetailsOBJ.setComolaintType("comolaintType");
		ancCareDetailsOBJ.setDuration("duration");
		ancCareDetailsOBJ.setDescription("description");
		ancCareDetailsOBJ.setLastMenstrualPeriod_LMP(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetailsOBJ.setGestationalAgeOrPeriodofAmenorrhea_POA((short) 0);
		ancCareDetailsOBJ.setTrimesterNumber((short) 0);
		ancCareDetailsOBJ.setExpectedDateofDelivery(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetailsOBJ.setPrimiGravida(false);
		ancCareDetailsOBJ.setGravida_G((short) 0);
		ancCareDetailsOBJ.setTermDeliveries_T((short) 0);
		ancCareDetailsOBJ.setPretermDeliveries_P((short) 0);
		ancCareDetailsOBJ.setAbortions_A((short) 0);
		ancCareDetailsOBJ.setLivebirths_L((short) 0);
		ancCareDetailsOBJ.setBloodGroup("bloodGroup");
		ancCareDetailsOBJ.setModifiedBy("modifiedBy");
		ancCareDetailsOBJ.setLmpDate("lmpDate");
		ancCareDetailsOBJ.setExpDelDt("expDelDt");
		ancCareDetailsOBJ.setStillBirth(0);
		
		ancCareDetailsOBJ.toString();

		// Configure ANCCareRepo.save(...).
		final ANCCareDetails ancCareDetails = new ANCCareDetails();
		ancCareDetails.setID(0L);
		ancCareDetails.setBeneficiaryRegID(0L);
		ancCareDetails.setBenVisitID(0L);
		ancCareDetails.setProviderServiceMapID(0);
		ancCareDetails.setVisitCode(0L);
		ancCareDetails.setVisitNo((short) 0);
		ancCareDetails.setComolaintType("comolaintType");
		ancCareDetails.setDuration("duration");
		ancCareDetails.setDescription("description");
		ancCareDetails.setLastMenstrualPeriod_LMP(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetails.setGestationalAgeOrPeriodofAmenorrhea_POA((short) 0);
		ancCareDetails.setTrimesterNumber((short) 0);
		ancCareDetails.setExpectedDateofDelivery(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetails.setPrimiGravida(false);
		ancCareDetails.setGravida_G((short) 0);
		ancCareDetails.setTermDeliveries_T((short) 0);
		ancCareDetails.setPretermDeliveries_P((short) 0);
		ancCareDetails.setAbortions_A((short) 0);
		ancCareDetails.setLivebirths_L((short) 0);
		ancCareDetails.setBloodGroup("bloodGroup");
		ancCareDetails.setModifiedBy("modifiedBy");
		ancCareDetails.setLmpDate("lmpDate");
		ancCareDetails.setExpDelDt("expDelDt");
		ancCareDetails.setStillBirth(0);
		when(mockAncCareRepo.save(any(ANCCareDetails.class))).thenReturn(ancCareDetails);

		// Run the test
		final Long result = ancNurseServiceImplUnderTest.saveBenAncCareDetails(ancCareDetailsOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSaveBenAncCareDetails_ANCCareRepoReturnsNull() throws Exception {
		// Setup
		final ANCCareDetails ancCareDetailsOBJ = new ANCCareDetails();
		ancCareDetailsOBJ.setID(0L);
		ancCareDetailsOBJ.setBeneficiaryRegID(0L);
		ancCareDetailsOBJ.setBenVisitID(0L);
		ancCareDetailsOBJ.setProviderServiceMapID(0);
		ancCareDetailsOBJ.setVisitCode(0L);
		ancCareDetailsOBJ.setVisitNo((short) 0);
		ancCareDetailsOBJ.setComolaintType("comolaintType");
		ancCareDetailsOBJ.setDuration("duration");
		ancCareDetailsOBJ.setDescription("description");
		ancCareDetailsOBJ.setLastMenstrualPeriod_LMP(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetailsOBJ.setGestationalAgeOrPeriodofAmenorrhea_POA((short) 0);
		ancCareDetailsOBJ.setTrimesterNumber((short) 0);
		ancCareDetailsOBJ.setExpectedDateofDelivery(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetailsOBJ.setPrimiGravida(false);
		ancCareDetailsOBJ.setGravida_G((short) 0);
		ancCareDetailsOBJ.setTermDeliveries_T((short) 0);
		ancCareDetailsOBJ.setPretermDeliveries_P((short) 0);
		ancCareDetailsOBJ.setAbortions_A((short) 0);
		ancCareDetailsOBJ.setLivebirths_L((short) 0);
		ancCareDetailsOBJ.setBloodGroup("bloodGroup");
		ancCareDetailsOBJ.setModifiedBy("modifiedBy");
		ancCareDetailsOBJ.setLmpDate("lmpDate");
		ancCareDetailsOBJ.setExpDelDt("expDelDt");
		ancCareDetailsOBJ.setStillBirth(0);

		when(mockAncCareRepo.save(any(ANCCareDetails.class))).thenReturn(null);

		// Run the test
		final Long result = ancNurseServiceImplUnderTest.saveBenAncCareDetails(ancCareDetailsOBJ);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveBenAncCareDetails_ANCCareRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final ANCCareDetails ancCareDetailsOBJ = new ANCCareDetails();
		ancCareDetailsOBJ.setID(0L);
		ancCareDetailsOBJ.setBeneficiaryRegID(0L);
		ancCareDetailsOBJ.setBenVisitID(0L);
		ancCareDetailsOBJ.setProviderServiceMapID(0);
		ancCareDetailsOBJ.setVisitCode(0L);
		ancCareDetailsOBJ.setVisitNo((short) 0);
		ancCareDetailsOBJ.setComolaintType("comolaintType");
		ancCareDetailsOBJ.setDuration("duration");
		ancCareDetailsOBJ.setDescription("description");
		ancCareDetailsOBJ.setLastMenstrualPeriod_LMP(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetailsOBJ.setGestationalAgeOrPeriodofAmenorrhea_POA((short) 0);
		ancCareDetailsOBJ.setTrimesterNumber((short) 0);
		ancCareDetailsOBJ.setExpectedDateofDelivery(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetailsOBJ.setPrimiGravida(false);
		ancCareDetailsOBJ.setGravida_G((short) 0);
		ancCareDetailsOBJ.setTermDeliveries_T((short) 0);
		ancCareDetailsOBJ.setPretermDeliveries_P((short) 0);
		ancCareDetailsOBJ.setAbortions_A((short) 0);
		ancCareDetailsOBJ.setLivebirths_L((short) 0);
		ancCareDetailsOBJ.setBloodGroup("bloodGroup");
		ancCareDetailsOBJ.setModifiedBy("modifiedBy");
		ancCareDetailsOBJ.setLmpDate("lmpDate");
		ancCareDetailsOBJ.setExpDelDt("expDelDt");
		ancCareDetailsOBJ.setStillBirth(0);

		when(mockAncCareRepo.save(any(ANCCareDetails.class))).thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> ancNurseServiceImplUnderTest.saveBenAncCareDetails(ancCareDetailsOBJ))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testSaveSysObstetricExamination() {
		// Setup
		final SysObstetricExamination obstetricExamination = new SysObstetricExamination();
		obstetricExamination.setBeneficiaryRegID(0L);
		obstetricExamination.setFundalHeight("fundalHeight");
		obstetricExamination.setfHAndPOA_Status("fHAndPOA_Status");
		obstetricExamination.setfHAndPOA_Interpretation("fHAndPOA_Interpretation");
		obstetricExamination.setFetalMovements("fetalMovements");
		obstetricExamination.setFetalHeartSounds("fetalHeartSounds");
		obstetricExamination.setFetalHeartRate_BeatsPerMinute("fetalHeartRate_BeatsPerMinute");
		obstetricExamination.setFetalPositionOrLie("fetalPositionOrLie");
		obstetricExamination.setFetalPresentation("fetalPresentation");
		obstetricExamination.setAbdominalScars("abdominalScars");
		obstetricExamination.setModifiedBy("modifiedBy");
		obstetricExamination.setID(0L);
		obstetricExamination.setVisitCode(0L);
		obstetricExamination.setSfh(0.0);
		
		obstetricExamination.toString();

		// Configure SysObstetricExaminationRepo.save(...).
		final SysObstetricExamination sysObstetricExamination = new SysObstetricExamination();
		sysObstetricExamination.setBeneficiaryRegID(0L);
		sysObstetricExamination.setFundalHeight("fundalHeight");
		sysObstetricExamination.setfHAndPOA_Status("fHAndPOA_Status");
		sysObstetricExamination.setfHAndPOA_Interpretation("fHAndPOA_Interpretation");
		sysObstetricExamination.setFetalMovements("fetalMovements");
		sysObstetricExamination.setFetalHeartSounds("fetalHeartSounds");
		sysObstetricExamination.setFetalHeartRate_BeatsPerMinute("fetalHeartRate_BeatsPerMinute");
		sysObstetricExamination.setFetalPositionOrLie("fetalPositionOrLie");
		sysObstetricExamination.setFetalPresentation("fetalPresentation");
		sysObstetricExamination.setAbdominalScars("abdominalScars");
		sysObstetricExamination.setModifiedBy("modifiedBy");
		sysObstetricExamination.setID(0L);
		sysObstetricExamination.setVisitCode(0L);
		sysObstetricExamination.setSfh(0.0);
		
		sysObstetricExamination.toString();
		
		when(mockSysObstetricExaminationRepo.save(any(SysObstetricExamination.class)))
				.thenReturn(sysObstetricExamination);

		// Run the test
		final Long result = ancNurseServiceImplUnderTest.saveSysObstetricExamination(obstetricExamination);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testSaveSysObstetricExamination_SysObstetricExaminationRepoReturnsNull() {
		// Setup
		final SysObstetricExamination obstetricExamination = new SysObstetricExamination();
		obstetricExamination.setBeneficiaryRegID(0L);
		obstetricExamination.setFundalHeight("fundalHeight");
		obstetricExamination.setfHAndPOA_Status("fHAndPOA_Status");
		obstetricExamination.setfHAndPOA_Interpretation("fHAndPOA_Interpretation");
		obstetricExamination.setFetalMovements("fetalMovements");
		obstetricExamination.setFetalHeartSounds("fetalHeartSounds");
		obstetricExamination.setFetalHeartRate_BeatsPerMinute("fetalHeartRate_BeatsPerMinute");
		obstetricExamination.setFetalPositionOrLie("fetalPositionOrLie");
		obstetricExamination.setFetalPresentation("fetalPresentation");
		obstetricExamination.setAbdominalScars("abdominalScars");
		obstetricExamination.setModifiedBy("modifiedBy");
		obstetricExamination.setID(0L);
		obstetricExamination.setVisitCode(0L);
		obstetricExamination.setSfh(0.0);

		when(mockSysObstetricExaminationRepo.save(any(SysObstetricExamination.class))).thenReturn(null);

		// Run the test
		final Long result = ancNurseServiceImplUnderTest.saveSysObstetricExamination(obstetricExamination);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveSysObstetricExamination_SysObstetricExaminationRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final SysObstetricExamination obstetricExamination = new SysObstetricExamination();
		obstetricExamination.setBeneficiaryRegID(0L);
		obstetricExamination.setFundalHeight("fundalHeight");
		obstetricExamination.setfHAndPOA_Status("fHAndPOA_Status");
		obstetricExamination.setfHAndPOA_Interpretation("fHAndPOA_Interpretation");
		obstetricExamination.setFetalMovements("fetalMovements");
		obstetricExamination.setFetalHeartSounds("fetalHeartSounds");
		obstetricExamination.setFetalHeartRate_BeatsPerMinute("fetalHeartRate_BeatsPerMinute");
		obstetricExamination.setFetalPositionOrLie("fetalPositionOrLie");
		obstetricExamination.setFetalPresentation("fetalPresentation");
		obstetricExamination.setAbdominalScars("abdominalScars");
		obstetricExamination.setModifiedBy("modifiedBy");
		obstetricExamination.setID(0L);
		obstetricExamination.setVisitCode(0L);
		obstetricExamination.setSfh(0.0);

		when(mockSysObstetricExaminationRepo.save(any(SysObstetricExamination.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> ancNurseServiceImplUnderTest.saveSysObstetricExamination(obstetricExamination))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testGetSysObstetricExamination() {
		// Setup
		// Configure SysObstetricExaminationRepo.getSysObstetricExaminationData(...).
		final SysObstetricExamination sysObstetricExamination = new SysObstetricExamination();
		sysObstetricExamination.setBeneficiaryRegID(0L);
		sysObstetricExamination.setFundalHeight("fundalHeight");
		sysObstetricExamination.setfHAndPOA_Status("fHAndPOA_Status");
		sysObstetricExamination.setfHAndPOA_Interpretation("fHAndPOA_Interpretation");
		sysObstetricExamination.setFetalMovements("fetalMovements");
		sysObstetricExamination.setFetalHeartSounds("fetalHeartSounds");
		sysObstetricExamination.setFetalHeartRate_BeatsPerMinute("fetalHeartRate_BeatsPerMinute");
		sysObstetricExamination.setFetalPositionOrLie("fetalPositionOrLie");
		sysObstetricExamination.setFetalPresentation("fetalPresentation");
		sysObstetricExamination.setAbdominalScars("abdominalScars");
		sysObstetricExamination.setModifiedBy("modifiedBy");
		sysObstetricExamination.setID(0L);
		sysObstetricExamination.setVisitCode(0L);
		sysObstetricExamination.setSfh(0.0);
		when(mockSysObstetricExaminationRepo.getSysObstetricExaminationData(0L, 0L))
				.thenReturn(sysObstetricExamination);

		// Run the test
		final SysObstetricExamination result = ancNurseServiceImplUnderTest.getSysObstetricExamination(0L, 0L);

		// Verify the results
	}

	@Test
	void testGetANCCareDetails() {

		// Run the test
		final String result = ancNurseServiceImplUnderTest.getANCCareDetails(0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo("null");
	}

	@Test
	void testGetANCCareDetails_ANCCareRepoReturnsNoItems() {
		// Setup
		when(mockAncCareRepo.getANCCareDetails(0L, 0L)).thenReturn(new ArrayList<>());

		// Run the test
		final String result = ancNurseServiceImplUnderTest.getANCCareDetails(0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo("null");
	}

	@Test
	void testGetANCWomenVaccineDetails_ANCWomenVaccineRepoReturnsNoItems() {
		// Setup
		when(mockAncWomenVaccineRepo.getANCWomenVaccineDetails(0L, 0L)).thenReturn(new ArrayList<>());

		// Run the test
		final String result = ancNurseServiceImplUnderTest.getANCWomenVaccineDetails(0L, 0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testUpdateBenAdherenceDetails_BenAdherenceRepoGetBenAdherenceDetailsStatusReturnsNull() {
		// Setup
		final BenAdherence benAdherence = new BenAdherence();
		benAdherence.setID(0L);
		benAdherence.setBeneficiaryRegID(0L);
		benAdherence.setBenVisitID(0L);
		benAdherence.setToDrugs(false);
		benAdherence.setDrugReason("drugReason");
		benAdherence.setToReferral(false);
		benAdherence.setReferralReason("referralReason");
		benAdherence.setProgress("progress");
		benAdherence.setModifiedBy("modifiedBy");
		
		benAdherence.toString();

		when(mockBenAdherenceRepo.getBenAdherenceDetailsStatus(0L, 0L, 0L)).thenReturn(null);
		when(mockBenAdherenceRepo.updateBenAdherence(false, "drugReason", false, "referralReason", "progress",
				"modifiedBy", "N", 0L, 0L, 0L)).thenReturn(0);

		// Run the test
		final int result = ancNurseServiceImplUnderTest.updateBenAdherenceDetails(benAdherence);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenAncCareDetails_ANCCareRepoGetBenANCCareDetailsStatusReturnsNull() throws Exception {
		// Setup
		final ANCCareDetails ancCareDetailsOBJ = new ANCCareDetails();
		ancCareDetailsOBJ.setID(0L);
		ancCareDetailsOBJ.setBeneficiaryRegID(0L);
		ancCareDetailsOBJ.setBenVisitID(0L);
		ancCareDetailsOBJ.setProviderServiceMapID(0);
		ancCareDetailsOBJ.setVisitCode(0L);
		ancCareDetailsOBJ.setVisitNo((short) 0);
		ancCareDetailsOBJ.setComolaintType("comolaintType");
		ancCareDetailsOBJ.setDuration("duration");
		ancCareDetailsOBJ.setDescription("description");
		ancCareDetailsOBJ.setLastMenstrualPeriod_LMP(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetailsOBJ.setGestationalAgeOrPeriodofAmenorrhea_POA((short) 0);
		ancCareDetailsOBJ.setTrimesterNumber((short) 0);
		ancCareDetailsOBJ.setExpectedDateofDelivery(Date.valueOf(LocalDate.of(2020, 1, 1)));
		ancCareDetailsOBJ.setPrimiGravida(false);
		ancCareDetailsOBJ.setGravida_G((short) 0);
		ancCareDetailsOBJ.setTermDeliveries_T((short) 0);
		ancCareDetailsOBJ.setPretermDeliveries_P((short) 0);
		ancCareDetailsOBJ.setAbortions_A((short) 0);
		ancCareDetailsOBJ.setLivebirths_L((short) 0);
		ancCareDetailsOBJ.setBloodGroup("bloodGroup");
		ancCareDetailsOBJ.setModifiedBy("modifiedBy");
		ancCareDetailsOBJ.setLmpDate("lmpDate");
		ancCareDetailsOBJ.setExpDelDt("expDelDt");
		ancCareDetailsOBJ.setStillBirth(0);

		when(mockAncCareRepo.getBenANCCareDetailsStatus(0L, 0L)).thenReturn(null);
		when(mockAncCareRepo.updateANCCareDetails("comolaintType", "duration", "description",
				Date.valueOf(LocalDate.of(2020, 1, 1)), (short) 0, (short) 0, Date.valueOf(LocalDate.of(2020, 1, 1)),
				false, (short) 0, (short) 0, (short) 0, (short) 0, (short) 0, "bloodGroup", "modifiedBy", "N", 0L, 0L,
				0)).thenReturn(0);

		// Run the test
		final int result = ancNurseServiceImplUnderTest.updateBenAncCareDetails(ancCareDetailsOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateSysObstetricExamination_SysObstetricExaminationRepoGetBenObstetricExaminationStatusReturnsNull() {
		// Setup
		final SysObstetricExamination obstetricExamination = new SysObstetricExamination();
		obstetricExamination.setBeneficiaryRegID(0L);
		obstetricExamination.setFundalHeight("fundalHeight");
		obstetricExamination.setfHAndPOA_Status("fHAndPOA_Status");
		obstetricExamination.setfHAndPOA_Interpretation("fHAndPOA_Interpretation");
		obstetricExamination.setFetalMovements("fetalMovements");
		obstetricExamination.setFetalHeartSounds("fetalHeartSounds");
		obstetricExamination.setFetalHeartRate_BeatsPerMinute("fetalHeartRate_BeatsPerMinute");
		obstetricExamination.setFetalPositionOrLie("fetalPositionOrLie");
		obstetricExamination.setFetalPresentation("fetalPresentation");
		obstetricExamination.setAbdominalScars("abdominalScars");
		obstetricExamination.setModifiedBy("modifiedBy");
		obstetricExamination.setID(0L);
		obstetricExamination.setVisitCode(0L);
		obstetricExamination.setSfh(0.0);
		
		obstetricExamination.toString();

		when(mockSysObstetricExaminationRepo.getBenObstetricExaminationStatus(0L, 0L)).thenReturn(null);
		when(mockSysObstetricExaminationRepo.updateSysObstetricExamination("fundalHeight", "fHAndPOA_Status",
				"fHAndPOA_Interpretation", "fetalMovements", "fetalHeartSounds", "fetalHeartRate_BeatsPerMinute",
				"fetalPositionOrLie", "fetalPresentation", "abdominalScars", 0.0, "modifiedBy", "N", 0L, 0L))
				.thenReturn(0);

		// Run the test
		final int result = ancNurseServiceImplUnderTest.updateSysObstetricExamination(obstetricExamination);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}
}
