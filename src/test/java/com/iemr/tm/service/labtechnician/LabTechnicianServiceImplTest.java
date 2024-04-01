package com.iemr.tm.service.labtechnician;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.google.gson.JsonObject;
import com.iemr.tm.data.labModule.LabResultEntry;
import com.iemr.tm.data.labModule.ProcedureData;
import com.iemr.tm.data.labModule.TestComponentMaster;
import com.iemr.tm.data.labModule.WrapperLabResultEntry;
import com.iemr.tm.repo.labModule.LabResultEntryRepo;
import com.iemr.tm.repo.labtechnician.V_benLabTestOrderedDetailsRepo;
import com.iemr.tm.service.benFlowStatus.CommonBenStatusFlowServiceImpl;

@ExtendWith(MockitoExtension.class)
class LabTechnicianServiceImplTest {

	@Mock
	private V_benLabTestOrderedDetailsRepo mockV_benLabTestOrderedDetailsRepo;
	@Mock
	private LabResultEntryRepo mockLabResultEntryRepo;
	@Mock
	private CommonBenStatusFlowServiceImpl mockCommonBenStatusFlowServiceImpl;

	private LabTechnicianServiceImpl labTechnicianServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		labTechnicianServiceImplUnderTest = new LabTechnicianServiceImpl();
		labTechnicianServiceImplUnderTest.setV_benLabTestOrderedDetailsRepo(mockV_benLabTestOrderedDetailsRepo);
		labTechnicianServiceImplUnderTest.setLabResultEntryRepo(mockLabResultEntryRepo);
		labTechnicianServiceImplUnderTest.setCommonBenStatusFlowServiceImpl(mockCommonBenStatusFlowServiceImpl);
	}

	@Test
	void testGetLabResultDataForBen_LabResultEntryRepoReturnsNoItems() {
		// Setup
		when(mockLabResultEntryRepo.findByBeneficiaryRegIDAndVisitCodeOrderByProcedureIDAsc(0L, 0L))
				.thenReturn(new ArrayList<>());

		// Run the test
		final ArrayList<LabResultEntry> result = labTechnicianServiceImplUnderTest.getLabResultDataForBen(0L, 0L);

		// Verify the results
	}

	@Test
	void testSaveLabTestResult1() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Configure LabResultEntryRepo.saveAll(...).
		final Iterable<LabResultEntry> labResultEntries = List
				.of(new LabResultEntry(0L, Date.valueOf(LocalDate.of(2020, 1, 1))));

		// Run the test
		final Integer result = labTechnicianServiceImplUnderTest.saveLabTestResult(requestOBJ);

		// Verify the results
		assertThat(result).isEqualTo(1);
	}

	@Test
	void testSaveLabTestResult1_LabResultEntryRepoReturnsNull() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Run the test
		final Integer result = labTechnicianServiceImplUnderTest.saveLabTestResult(requestOBJ);

		// Verify the results
		assertThat(result).isEqualTo(1);
	}

	@Test
	void testSaveLabTestResult1_LabResultEntryRepoReturnsNoItems() throws Exception {
		// Setup
		final JsonObject requestOBJ = new JsonObject();

		// Run the test
		final Integer result = labTechnicianServiceImplUnderTest.saveLabTestResult(requestOBJ);

		// Verify the results
		assertThat(result).isEqualTo(1);
	}

	@Test
	void testSaveLabTestResult2() {
		// Setup
		final WrapperLabResultEntry wrapperLabResults = new WrapperLabResultEntry();
		wrapperLabResults.setSpecialist_flag((short) 0);
		wrapperLabResults.setVanID(0);
		wrapperLabResults.setParkingPlaceID(0);
		wrapperLabResults.setNurseFlag((short) 0);
		wrapperLabResults.setDoctorFlag((short) 0);
		wrapperLabResults.setBenFlowID(0L);
		wrapperLabResults.setLabCompleted(false);
		wrapperLabResults.setBeneficiaryRegID(0L);
		wrapperLabResults.setVisitID(0L);
		wrapperLabResults.setVisitCode(0L);
		wrapperLabResults.setProviderServiceMapID(0);
		wrapperLabResults.setCreatedBy("createdBy");
		
		wrapperLabResults.toString();
		
		final LabResultEntry labResultEntry = new LabResultEntry();
		labResultEntry.setStripsNotAvailable(false);
		labResultEntry.setDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		labResultEntry.setComponentList(new ArrayList<>(List.of(Map.ofEntries(Map.entry("value", "value")))));
		labResultEntry.setProcedureType("procedureType");
		labResultEntry.setProcedureName("procedureName");
		
		labResultEntry.toString();
		
		final TestComponentMaster testComponentMaster = new TestComponentMaster();
		testComponentMaster.setLionicTerm("lionicTerm");
		testComponentMaster.setTestComponentName("testComponentName");
		testComponentMaster.setLionicNum("lionicNum");
		labResultEntry.setTestComponentMaster(testComponentMaster);
		
		labResultEntry.toString();
		
		final ProcedureData procedureData = new ProcedureData();
		procedureData.setProcedureName("procedureName");
		procedureData.setProcedureType("procedureType");
		labResultEntry.setProcedureData(procedureData);
		labResultEntry.setBeneficiaryRegID(0L);
		labResultEntry.setBenVisitID(0L);
		labResultEntry.setProviderServiceMapID(0);
		labResultEntry.setVisitCode(0L);
		labResultEntry.setPrescriptionID(0L);
		labResultEntry.setProcedureID(0);
		labResultEntry.setTestComponentID(0);
		labResultEntry.setTestResultValue("testResultValue");
		labResultEntry.setTestResultUnit("testResultUnit");
		labResultEntry.setTestReportFilePath("testReportFilePath");
		labResultEntry.setRemarks("remarks");
		labResultEntry.setCreatedBy("createdBy");
		labResultEntry.setCreatedDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		labResultEntry.setParkingPlaceID(0);
		labResultEntry.setCompList(List.of(Map.ofEntries(Map.entry("value", "value"))));
		labResultEntry.setVanID(0);
		labResultEntry.setFileIDs(new Integer[] { 0 });
		labResultEntry.toString();
		wrapperLabResults.setLabTestResults(List.of(labResultEntry));
		
		wrapperLabResults.toString();
		
		final LabResultEntry labResultEntry1 = new LabResultEntry();
		labResultEntry1.setStripsNotAvailable(false);
		labResultEntry1.setDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		labResultEntry1.setComponentList(new ArrayList<>(List.of(Map.ofEntries(Map.entry("value", "value")))));
		labResultEntry1.setProcedureType("procedureType");
		labResultEntry1.setProcedureName("procedureName");
		final TestComponentMaster testComponentMaster1 = new TestComponentMaster();
		testComponentMaster1.setLionicTerm("lionicTerm");
		testComponentMaster1.setTestComponentName("testComponentName");
		testComponentMaster1.setLionicNum("lionicNum");
		labResultEntry1.setTestComponentMaster(testComponentMaster1);
		final ProcedureData procedureData1 = new ProcedureData();
		procedureData1.setProcedureName("procedureName");
		procedureData1.setProcedureType("procedureType");
		labResultEntry1.setProcedureData(procedureData1);
		labResultEntry1.setBeneficiaryRegID(0L);
		labResultEntry1.setBenVisitID(0L);
		labResultEntry1.setProviderServiceMapID(0);
		labResultEntry1.setVisitCode(0L);
		labResultEntry1.setPrescriptionID(0L);
		labResultEntry1.setProcedureID(0);
		labResultEntry1.setTestComponentID(0);
		labResultEntry1.setTestResultValue("testResultValue");
		labResultEntry1.setTestResultUnit("testResultUnit");
		labResultEntry1.setTestReportFilePath("testReportFilePath");
		labResultEntry1.setRemarks("remarks");
		labResultEntry1.setCreatedBy("createdBy");
		labResultEntry1.setCreatedDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		labResultEntry1.setParkingPlaceID(0);
		labResultEntry1.setCompList(List.of(Map.ofEntries(Map.entry("value", "value"))));
		wrapperLabResults.setRadiologyTestResults(List.of(labResultEntry1));

		// Configure LabResultEntryRepo.saveAll(...).
		final Iterable<LabResultEntry> labResultEntries = List
				.of(new LabResultEntry(0L, Date.valueOf(LocalDate.of(2020, 1, 1))));
		// Run the test
		final Integer result = labTechnicianServiceImplUnderTest.saveLabTestResult(wrapperLabResults);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveLabTestResult2_LabResultEntryRepoReturnsNull() {
		// Setup
		final WrapperLabResultEntry wrapperLabResults = new WrapperLabResultEntry();
		wrapperLabResults.setSpecialist_flag((short) 0);
		wrapperLabResults.setVanID(0);
		wrapperLabResults.setParkingPlaceID(0);
		wrapperLabResults.setNurseFlag((short) 0);
		wrapperLabResults.setDoctorFlag((short) 0);
		wrapperLabResults.setBenFlowID(0L);
		wrapperLabResults.setLabCompleted(false);
		wrapperLabResults.setBeneficiaryRegID(0L);
		wrapperLabResults.setVisitID(0L);
		wrapperLabResults.setVisitCode(0L);
		wrapperLabResults.setProviderServiceMapID(0);
		wrapperLabResults.setCreatedBy("createdBy");
		final LabResultEntry labResultEntry = new LabResultEntry();
		labResultEntry.setStripsNotAvailable(false);
		labResultEntry.setDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		labResultEntry.setComponentList(new ArrayList<>(List.of(Map.ofEntries(Map.entry("value", "value")))));
		labResultEntry.setProcedureType("procedureType");
		labResultEntry.setProcedureName("procedureName");
		final TestComponentMaster testComponentMaster = new TestComponentMaster();
		testComponentMaster.setLionicTerm("lionicTerm");
		testComponentMaster.setTestComponentName("testComponentName");
		testComponentMaster.setLionicNum("lionicNum");
		
		testComponentMaster.toString();
		
		labResultEntry.setTestComponentMaster(testComponentMaster);
		final ProcedureData procedureData = new ProcedureData();
		procedureData.setProcedureName("procedureName");
		procedureData.setProcedureType("procedureType");
		labResultEntry.setProcedureData(procedureData);
		labResultEntry.setBeneficiaryRegID(0L);
		labResultEntry.setBenVisitID(0L);
		labResultEntry.setProviderServiceMapID(0);
		labResultEntry.setVisitCode(0L);
		labResultEntry.setPrescriptionID(0L);
		labResultEntry.setProcedureID(0);
		labResultEntry.setTestComponentID(0);
		labResultEntry.setTestResultValue("testResultValue");
		labResultEntry.setTestResultUnit("testResultUnit");
		labResultEntry.setTestReportFilePath("testReportFilePath");
		labResultEntry.setRemarks("remarks");
		labResultEntry.setCreatedBy("createdBy");
		labResultEntry.setCreatedDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		labResultEntry.setParkingPlaceID(0);
		labResultEntry.setCompList(List.of(Map.ofEntries(Map.entry("value", "value"))));
		labResultEntry.setVanID(0);
		labResultEntry.setFileIDs(new Integer[] { 0 });
		wrapperLabResults.setLabTestResults(List.of(labResultEntry));
		final LabResultEntry labResultEntry1 = new LabResultEntry();
		labResultEntry1.setStripsNotAvailable(false);
		labResultEntry1.setDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		labResultEntry1.setComponentList(new ArrayList<>(List.of(Map.ofEntries(Map.entry("value", "value")))));
		labResultEntry1.setProcedureType("procedureType");
		labResultEntry1.setProcedureName("procedureName");
		final TestComponentMaster testComponentMaster1 = new TestComponentMaster();
		testComponentMaster1.setLionicTerm("lionicTerm");
		testComponentMaster1.setTestComponentName("testComponentName");
		testComponentMaster1.setLionicNum("lionicNum");
		labResultEntry1.setTestComponentMaster(testComponentMaster1);
		final ProcedureData procedureData1 = new ProcedureData();
		procedureData1.setProcedureName("procedureName");
		procedureData1.setProcedureType("procedureType");
		labResultEntry1.setProcedureData(procedureData1);
		labResultEntry1.setBeneficiaryRegID(0L);
		labResultEntry1.setBenVisitID(0L);
		labResultEntry1.setProviderServiceMapID(0);
		labResultEntry1.setVisitCode(0L);
		labResultEntry1.setPrescriptionID(0L);
		labResultEntry1.setProcedureID(0);
		labResultEntry1.setTestComponentID(0);
		labResultEntry1.setTestResultValue("testResultValue");
		labResultEntry1.setTestResultUnit("testResultUnit");
		labResultEntry1.setTestReportFilePath("testReportFilePath");
		labResultEntry1.setRemarks("remarks");
		labResultEntry1.setCreatedBy("createdBy");
		labResultEntry1.setCreatedDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		labResultEntry1.setParkingPlaceID(0);
		labResultEntry1.setCompList(List.of(Map.ofEntries(Map.entry("value", "value"))));
		wrapperLabResults.setRadiologyTestResults(List.of(labResultEntry1));

		// Run the test
		final Integer result = labTechnicianServiceImplUnderTest.saveLabTestResult(wrapperLabResults);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveLabTestResult2_LabResultEntryRepoReturnsNoItems() {
		// Setup
		final WrapperLabResultEntry wrapperLabResults = new WrapperLabResultEntry();
		wrapperLabResults.setSpecialist_flag((short) 0);
		wrapperLabResults.setVanID(0);
		wrapperLabResults.setParkingPlaceID(0);
		wrapperLabResults.setNurseFlag((short) 0);
		wrapperLabResults.setDoctorFlag((short) 0);
		wrapperLabResults.setBenFlowID(0L);
		wrapperLabResults.setLabCompleted(false);
		wrapperLabResults.setBeneficiaryRegID(0L);
		wrapperLabResults.setVisitID(0L);
		wrapperLabResults.setVisitCode(0L);
		wrapperLabResults.setProviderServiceMapID(0);
		wrapperLabResults.setCreatedBy("createdBy");
		final LabResultEntry labResultEntry = new LabResultEntry();
		labResultEntry.setStripsNotAvailable(false);
		labResultEntry.setDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		labResultEntry.setComponentList(new ArrayList<>(List.of(Map.ofEntries(Map.entry("value", "value")))));
		labResultEntry.setProcedureType("procedureType");
		labResultEntry.setProcedureName("procedureName");
		final TestComponentMaster testComponentMaster = new TestComponentMaster();
		testComponentMaster.setLionicTerm("lionicTerm");
		testComponentMaster.setTestComponentName("testComponentName");
		testComponentMaster.setLionicNum("lionicNum");
		labResultEntry.setTestComponentMaster(testComponentMaster);
		final ProcedureData procedureData = new ProcedureData();
		procedureData.setProcedureName("procedureName");
		procedureData.setProcedureType("procedureType");
		labResultEntry.setProcedureData(procedureData);
		labResultEntry.setBeneficiaryRegID(0L);
		labResultEntry.setBenVisitID(0L);
		labResultEntry.setProviderServiceMapID(0);
		labResultEntry.setVisitCode(0L);
		labResultEntry.setPrescriptionID(0L);
		labResultEntry.setProcedureID(0);
		labResultEntry.setTestComponentID(0);
		labResultEntry.setTestResultValue("testResultValue");
		labResultEntry.setTestResultUnit("testResultUnit");
		labResultEntry.setTestReportFilePath("testReportFilePath");
		labResultEntry.setRemarks("remarks");
		labResultEntry.setCreatedBy("createdBy");
		labResultEntry.setCreatedDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		labResultEntry.setParkingPlaceID(0);
		labResultEntry.setCompList(List.of(Map.ofEntries(Map.entry("value", "value"))));
		labResultEntry.setVanID(0);
		labResultEntry.setFileIDs(new Integer[] { 0 });
		wrapperLabResults.setLabTestResults(List.of(labResultEntry));
		final LabResultEntry labResultEntry1 = new LabResultEntry();
		labResultEntry1.setStripsNotAvailable(false);
		labResultEntry1.setDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		labResultEntry1.setComponentList(new ArrayList<>(List.of(Map.ofEntries(Map.entry("value", "value")))));
		labResultEntry1.setProcedureType("procedureType");
		labResultEntry1.setProcedureName("procedureName");
		final TestComponentMaster testComponentMaster1 = new TestComponentMaster();
		testComponentMaster1.setLionicTerm("lionicTerm");
		testComponentMaster1.setTestComponentName("testComponentName");
		testComponentMaster1.setLionicNum("lionicNum");
		labResultEntry1.setTestComponentMaster(testComponentMaster1);
		final ProcedureData procedureData1 = new ProcedureData();
		procedureData1.setProcedureName("procedureName");
		procedureData1.setProcedureType("procedureType");
		labResultEntry1.setProcedureData(procedureData1);
		labResultEntry1.setBeneficiaryRegID(0L);
		labResultEntry1.setBenVisitID(0L);
		labResultEntry1.setProviderServiceMapID(0);
		labResultEntry1.setVisitCode(0L);
		labResultEntry1.setPrescriptionID(0L);
		labResultEntry1.setProcedureID(0);
		labResultEntry1.setTestComponentID(0);
		labResultEntry1.setTestResultValue("testResultValue");
		labResultEntry1.setTestResultUnit("testResultUnit");
		labResultEntry1.setTestReportFilePath("testReportFilePath");
		labResultEntry1.setRemarks("remarks");
		labResultEntry1.setCreatedBy("createdBy");
		labResultEntry1.setCreatedDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		labResultEntry1.setParkingPlaceID(0);
		labResultEntry1.setCompList(List.of(Map.ofEntries(Map.entry("value", "value"))));
		wrapperLabResults.setRadiologyTestResults(List.of(labResultEntry1));

		// Run the test
		final Integer result = labTechnicianServiceImplUnderTest.saveLabTestResult(wrapperLabResults);

		// Verify the results
		assertNull(result);
	}

}
