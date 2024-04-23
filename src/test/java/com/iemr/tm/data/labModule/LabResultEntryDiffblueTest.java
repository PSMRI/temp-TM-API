package com.iemr.tm.data.labModule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class LabResultEntryDiffblueTest {
    /**
     * Method under test: {@link LabResultEntry#getVisitCodeAndDate(ArrayList)}
     */
    @Test
    void testGetVisitCodeAndDate() {
        // Arrange and Act
        ArrayList<LabResultEntry> actualVisitCodeAndDate = LabResultEntry.getVisitCodeAndDate(new ArrayList<>());

        // Assert
        assertTrue(actualVisitCodeAndDate.isEmpty());
    }

    /**
     * Method under test: {@link LabResultEntry#getLabResultEntry(ArrayList)}
     */
    @Test
    void testGetLabResultEntry() {
        // Arrange and Act
        ArrayList<LabResultEntry> actualLabResultEntry = LabResultEntry.getLabResultEntry(new ArrayList<>());

        // Assert
        assertTrue(actualLabResultEntry.isEmpty());
    }

    /**
     * Method under test: {@link LabResultEntry#getLabResultEntry(ArrayList)}
     */
    @Test
    void testGetLabResultEntry2() {
        // Arrange and Act
        ArrayList<LabResultEntry> actualLabResultEntry = LabResultEntry.getLabResultEntry(null);

        // Assert
        assertTrue(actualLabResultEntry.isEmpty());
    }

    /**
     * Method under test: {@link LabResultEntry#getLabResultEntry(ArrayList)}
     */
    @Test
    void testGetLabResultEntry3() {
        // Arrange
        ProcedureData procedureData = new ProcedureData();
        procedureData.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        procedureData.setCreatedDate(mock(Timestamp.class));
        procedureData.setDeleted(true);
        procedureData.setGender("Gender");
        procedureData.setLabResultEntry(new HashSet<>());
        procedureData.setLastModDate(mock(Timestamp.class));
        procedureData.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        procedureData.setProcedureDesc("Procedure Desc");
        procedureData.setProcedureID(1);
        procedureData.setProcedureName("Procedure Name");
        procedureData.setProcedureType("Procedure Type");
        procedureData.setProcessed("Processed");
        procedureData.setProviderServiceMapID(1);

        TestComponentMaster testComponentMaster = new TestComponentMaster();
        testComponentMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        testComponentMaster.setCreatedDate(mock(Timestamp.class));
        testComponentMaster.setDeleted(true);
        testComponentMaster.setInputType("Input Type");
        testComponentMaster.setLabResultEntry(new HashSet<>());
        testComponentMaster.setLastModDate(mock(Timestamp.class));
        testComponentMaster.setLionicNum("Lionic Num");
        testComponentMaster.setLionicTerm("Lionic Term");
        testComponentMaster.setMeasurementUnit("Measurement Unit");
        testComponentMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        testComponentMaster.setProcessed("Processed");
        testComponentMaster.setProviderServiceMapID(1);
        testComponentMaster.setRange_max(3);
        testComponentMaster.setRange_min(1);
        testComponentMaster.setRange_normal_max(3);
        testComponentMaster.setRange_normal_min(1);
        testComponentMaster.setTestComponentDesc("Test Component Desc");
        testComponentMaster.setTestComponentID(1);
        testComponentMaster.setTestComponentName("Test Component Name");

        LabResultEntry labResultEntry = new LabResultEntry();
        labResultEntry.setBenVisitID(1L);
        labResultEntry.setBeneficiaryRegID(1L);
        labResultEntry.setCompList(new ArrayList<>());
        labResultEntry.setComponentList(new ArrayList<>());
        labResultEntry.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        labResultEntry.setCreatedDate(mock(Timestamp.class));
        labResultEntry.setDate(mock(Date.class));
        labResultEntry.setDeleted(true);
        labResultEntry.setFileIDs(new Integer[]{1});
        labResultEntry.setID(1L);
        labResultEntry.setLabCompleted(true);
        labResultEntry.setLastModDate(mock(Timestamp.class));
        labResultEntry.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        labResultEntry.setParkingPlaceID(1);
        labResultEntry.setPrescriptionID(1L);
        labResultEntry.setProcedureData(procedureData);
        labResultEntry.setProcedureName("Procedure Name");
        labResultEntry.setProcedureType("Procedure Type");
        labResultEntry.setProcessed("Processed");
        labResultEntry.setProviderServiceMapID(1);
        labResultEntry.setRemarks("Remarks");
        labResultEntry.setReservedForChange("Reserved For Change");
        labResultEntry.setStripsNotAvailable(true);
        labResultEntry.setSyncedBy("Synced By");
        labResultEntry.setSyncedDate(mock(Timestamp.class));
        labResultEntry.setTestComponentID(1);
        labResultEntry.setTestComponentMaster(testComponentMaster);
        labResultEntry.setTestResultUnit("Test Result Unit");
        labResultEntry.setTestResultValue("42");
        labResultEntry.setVanID(1);
        labResultEntry.setVanSerialNo(1L);
        labResultEntry.setVehicalNo("Vehical No");
        labResultEntry.setVisitCode(1L);
        labResultEntry.setTestReportFilePath(null);
        labResultEntry.setProcedureID(null);

        ArrayList<LabResultEntry> comingList = new ArrayList<>();
        comingList.add(labResultEntry);

        // Act
        ArrayList<LabResultEntry> actualLabResultEntry = LabResultEntry.getLabResultEntry(comingList);

        // Assert
        assertEquals(1, actualLabResultEntry.size());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link LabResultEntry#LabResultEntry()}
     *   <li>{@link LabResultEntry#setBenVisitID(Long)}
     *   <li>{@link LabResultEntry#setBeneficiaryRegID(Long)}
     *   <li>{@link LabResultEntry#setCompList(List)}
     *   <li>{@link LabResultEntry#setComponentList(ArrayList)}
     *   <li>{@link LabResultEntry#setCreatedBy(String)}
     *   <li>{@link LabResultEntry#setCreatedDate(Timestamp)}
     *   <li>{@link LabResultEntry#setDate(Date)}
     *   <li>{@link LabResultEntry#setDeleted(Boolean)}
     *   <li>{@link LabResultEntry#setFileIDs(Integer[])}
     *   <li>{@link LabResultEntry#setID(Long)}
     *   <li>{@link LabResultEntry#setLabCompleted(Boolean)}
     *   <li>{@link LabResultEntry#setLastModDate(Timestamp)}
     *   <li>{@link LabResultEntry#setModifiedBy(String)}
     *   <li>{@link LabResultEntry#setParkingPlaceID(Integer)}
     *   <li>{@link LabResultEntry#setPrescriptionID(Long)}
     *   <li>{@link LabResultEntry#setProcedureData(ProcedureData)}
     *   <li>{@link LabResultEntry#setProcedureID(Integer)}
     *   <li>{@link LabResultEntry#setProcedureName(String)}
     *   <li>{@link LabResultEntry#setProcedureType(String)}
     *   <li>{@link LabResultEntry#setProcessed(String)}
     *   <li>{@link LabResultEntry#setProviderServiceMapID(Integer)}
     *   <li>{@link LabResultEntry#setRemarks(String)}
     *   <li>{@link LabResultEntry#setReservedForChange(String)}
     *   <li>{@link LabResultEntry#setStripsNotAvailable(Boolean)}
     *   <li>{@link LabResultEntry#setSyncedBy(String)}
     *   <li>{@link LabResultEntry#setSyncedDate(Timestamp)}
     *   <li>{@link LabResultEntry#setTestComponentID(Integer)}
     *   <li>{@link LabResultEntry#setTestComponentMaster(TestComponentMaster)}
     *   <li>{@link LabResultEntry#setTestReportFilePath(String)}
     *   <li>{@link LabResultEntry#setTestResultUnit(String)}
     *   <li>{@link LabResultEntry#setTestResultValue(String)}
     *   <li>{@link LabResultEntry#setVanID(Integer)}
     *   <li>{@link LabResultEntry#setVanSerialNo(Long)}
     *   <li>{@link LabResultEntry#setVehicalNo(String)}
     *   <li>{@link LabResultEntry#setVisitCode(Long)}
     *   <li>{@link LabResultEntry#getBenVisitID()}
     *   <li>{@link LabResultEntry#getBeneficiaryRegID()}
     *   <li>{@link LabResultEntry#getCompList()}
     *   <li>{@link LabResultEntry#getComponentList()}
     *   <li>{@link LabResultEntry#getCreatedBy()}
     *   <li>{@link LabResultEntry#getCreatedDate()}
     *   <li>{@link LabResultEntry#getDate()}
     *   <li>{@link LabResultEntry#getDeleted()}
     *   <li>{@link LabResultEntry#getFileIDs()}
     *   <li>{@link LabResultEntry#getID()}
     *   <li>{@link LabResultEntry#getLabCompleted()}
     *   <li>{@link LabResultEntry#getLastModDate()}
     *   <li>{@link LabResultEntry#getModifiedBy()}
     *   <li>{@link LabResultEntry#getParkingPlaceID()}
     *   <li>{@link LabResultEntry#getPrescriptionID()}
     *   <li>{@link LabResultEntry#getProcedureData()}
     *   <li>{@link LabResultEntry#getProcedureID()}
     *   <li>{@link LabResultEntry#getProcedureName()}
     *   <li>{@link LabResultEntry#getProcedureType()}
     *   <li>{@link LabResultEntry#getProcessed()}
     *   <li>{@link LabResultEntry#getProviderServiceMapID()}
     *   <li>{@link LabResultEntry#getRemarks()}
     *   <li>{@link LabResultEntry#getReservedForChange()}
     *   <li>{@link LabResultEntry#getStripsNotAvailable()}
     *   <li>{@link LabResultEntry#getSyncedBy()}
     *   <li>{@link LabResultEntry#getSyncedDate()}
     *   <li>{@link LabResultEntry#getTestComponentID()}
     *   <li>{@link LabResultEntry#getTestComponentMaster()}
     *   <li>{@link LabResultEntry#getTestReportFilePath()}
     *   <li>{@link LabResultEntry#getTestResultUnit()}
     *   <li>{@link LabResultEntry#getTestResultValue()}
     *   <li>{@link LabResultEntry#getVanID()}
     *   <li>{@link LabResultEntry#getVanSerialNo()}
     *   <li>{@link LabResultEntry#getVehicalNo()}
     *   <li>{@link LabResultEntry#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        LabResultEntry actualLabResultEntry = new LabResultEntry();
        actualLabResultEntry.setBenVisitID(1L);
        actualLabResultEntry.setBeneficiaryRegID(1L);
        ArrayList<Map<String, String>> compList = new ArrayList<>();
        actualLabResultEntry.setCompList(compList);
        ArrayList<Map<String, Object>> componentList = new ArrayList<>();
        actualLabResultEntry.setComponentList(componentList);
        actualLabResultEntry.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualLabResultEntry.setCreatedDate(createdDate);
        Date date = mock(Date.class);
        actualLabResultEntry.setDate(date);
        actualLabResultEntry.setDeleted(true);
        Integer[] fileIDs = new Integer[]{1};
        actualLabResultEntry.setFileIDs(fileIDs);
        actualLabResultEntry.setID(1L);
        actualLabResultEntry.setLabCompleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualLabResultEntry.setLastModDate(lastModDate);
        actualLabResultEntry.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualLabResultEntry.setParkingPlaceID(1);
        actualLabResultEntry.setPrescriptionID(1L);
        ProcedureData procedureData = new ProcedureData();
        procedureData.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        procedureData.setCreatedDate(mock(Timestamp.class));
        procedureData.setDeleted(true);
        procedureData.setGender("Gender");
        procedureData.setLabResultEntry(new HashSet<>());
        procedureData.setLastModDate(mock(Timestamp.class));
        procedureData.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        procedureData.setProcedureDesc("Procedure Desc");
        procedureData.setProcedureID(1);
        procedureData.setProcedureName("Procedure Name");
        procedureData.setProcedureType("Procedure Type");
        procedureData.setProcessed("Processed");
        procedureData.setProviderServiceMapID(1);
        actualLabResultEntry.setProcedureData(procedureData);
        actualLabResultEntry.setProcedureID(1);
        actualLabResultEntry.setProcedureName("Procedure Name");
        actualLabResultEntry.setProcedureType("Procedure Type");
        actualLabResultEntry.setProcessed("Processed");
        actualLabResultEntry.setProviderServiceMapID(1);
        actualLabResultEntry.setRemarks("Remarks");
        actualLabResultEntry.setReservedForChange("Reserved For Change");
        actualLabResultEntry.setStripsNotAvailable(true);
        actualLabResultEntry.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualLabResultEntry.setSyncedDate(syncedDate);
        actualLabResultEntry.setTestComponentID(1);
        TestComponentMaster testComponentMaster = new TestComponentMaster();
        testComponentMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        testComponentMaster.setCreatedDate(mock(Timestamp.class));
        testComponentMaster.setDeleted(true);
        testComponentMaster.setInputType("Input Type");
        testComponentMaster.setLabResultEntry(new HashSet<>());
        testComponentMaster.setLastModDate(mock(Timestamp.class));
        testComponentMaster.setLionicNum("Lionic Num");
        testComponentMaster.setLionicTerm("Lionic Term");
        testComponentMaster.setMeasurementUnit("Measurement Unit");
        testComponentMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        testComponentMaster.setProcessed("Processed");
        testComponentMaster.setProviderServiceMapID(1);
        testComponentMaster.setRange_max(3);
        testComponentMaster.setRange_min(1);
        testComponentMaster.setRange_normal_max(3);
        testComponentMaster.setRange_normal_min(1);
        testComponentMaster.setTestComponentDesc("Test Component Desc");
        testComponentMaster.setTestComponentID(1);
        testComponentMaster.setTestComponentName("Test Component Name");
        actualLabResultEntry.setTestComponentMaster(testComponentMaster);
        actualLabResultEntry.setTestReportFilePath("/directory/foo.txt");
        actualLabResultEntry.setTestResultUnit("Test Result Unit");
        actualLabResultEntry.setTestResultValue("42");
        actualLabResultEntry.setVanID(1);
        actualLabResultEntry.setVanSerialNo(1L);
        actualLabResultEntry.setVehicalNo("Vehical No");
        actualLabResultEntry.setVisitCode(1L);
        Long actualBenVisitID = actualLabResultEntry.getBenVisitID();
        Long actualBeneficiaryRegID = actualLabResultEntry.getBeneficiaryRegID();
        List<Map<String, String>> actualCompList = actualLabResultEntry.getCompList();
        ArrayList<Map<String, Object>> actualComponentList = actualLabResultEntry.getComponentList();
        String actualCreatedBy = actualLabResultEntry.getCreatedBy();
        Timestamp actualCreatedDate = actualLabResultEntry.getCreatedDate();
        Date actualDate = actualLabResultEntry.getDate();
        Boolean actualDeleted = actualLabResultEntry.getDeleted();
        Integer[] actualFileIDs = actualLabResultEntry.getFileIDs();
        Long actualID = actualLabResultEntry.getID();
        Boolean actualLabCompleted = actualLabResultEntry.getLabCompleted();
        Timestamp actualLastModDate = actualLabResultEntry.getLastModDate();
        String actualModifiedBy = actualLabResultEntry.getModifiedBy();
        Integer actualParkingPlaceID = actualLabResultEntry.getParkingPlaceID();
        Long actualPrescriptionID = actualLabResultEntry.getPrescriptionID();
        ProcedureData actualProcedureData = actualLabResultEntry.getProcedureData();
        Integer actualProcedureID = actualLabResultEntry.getProcedureID();
        String actualProcedureName = actualLabResultEntry.getProcedureName();
        String actualProcedureType = actualLabResultEntry.getProcedureType();
        String actualProcessed = actualLabResultEntry.getProcessed();
        Integer actualProviderServiceMapID = actualLabResultEntry.getProviderServiceMapID();
        String actualRemarks = actualLabResultEntry.getRemarks();
        String actualReservedForChange = actualLabResultEntry.getReservedForChange();
        Boolean actualStripsNotAvailable = actualLabResultEntry.getStripsNotAvailable();
        String actualSyncedBy = actualLabResultEntry.getSyncedBy();
        Timestamp actualSyncedDate = actualLabResultEntry.getSyncedDate();
        Integer actualTestComponentID = actualLabResultEntry.getTestComponentID();
        TestComponentMaster actualTestComponentMaster = actualLabResultEntry.getTestComponentMaster();
        String actualTestReportFilePath = actualLabResultEntry.getTestReportFilePath();
        String actualTestResultUnit = actualLabResultEntry.getTestResultUnit();
        String actualTestResultValue = actualLabResultEntry.getTestResultValue();
        Integer actualVanID = actualLabResultEntry.getVanID();
        Long actualVanSerialNo = actualLabResultEntry.getVanSerialNo();
        String actualVehicalNo = actualLabResultEntry.getVehicalNo();
        Long actualVisitCode = actualLabResultEntry.getVisitCode();

        // Assert that nothing has changed
        assertEquals("/directory/foo.txt", actualTestReportFilePath);
        assertEquals("42", actualTestResultValue);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Procedure Name", actualProcedureName);
        assertEquals("Procedure Type", actualProcedureType);
        assertEquals("Processed", actualProcessed);
        assertEquals("Remarks", actualRemarks);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Test Result Unit", actualTestResultUnit);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProcedureID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualTestComponentID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualID.longValue());
        assertEquals(1L, actualPrescriptionID.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertTrue(actualDeleted);
        assertTrue(actualLabCompleted);
        assertTrue(actualStripsNotAvailable);
        assertSame(procedureData, actualProcedureData);
        assertSame(testComponentMaster, actualTestComponentMaster);
        assertSame(compList, actualCompList);
        assertSame(componentList, actualComponentList);
        assertSame(fileIDs, actualFileIDs);
        assertSame(date, actualDate);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link LabResultEntry#LabResultEntry(Long, Date)}
     *   <li>{@link LabResultEntry#setBenVisitID(Long)}
     *   <li>{@link LabResultEntry#setBeneficiaryRegID(Long)}
     *   <li>{@link LabResultEntry#setCompList(List)}
     *   <li>{@link LabResultEntry#setComponentList(ArrayList)}
     *   <li>{@link LabResultEntry#setCreatedBy(String)}
     *   <li>{@link LabResultEntry#setCreatedDate(Timestamp)}
     *   <li>{@link LabResultEntry#setDate(Date)}
     *   <li>{@link LabResultEntry#setDeleted(Boolean)}
     *   <li>{@link LabResultEntry#setFileIDs(Integer[])}
     *   <li>{@link LabResultEntry#setID(Long)}
     *   <li>{@link LabResultEntry#setLabCompleted(Boolean)}
     *   <li>{@link LabResultEntry#setLastModDate(Timestamp)}
     *   <li>{@link LabResultEntry#setModifiedBy(String)}
     *   <li>{@link LabResultEntry#setParkingPlaceID(Integer)}
     *   <li>{@link LabResultEntry#setPrescriptionID(Long)}
     *   <li>{@link LabResultEntry#setProcedureData(ProcedureData)}
     *   <li>{@link LabResultEntry#setProcedureID(Integer)}
     *   <li>{@link LabResultEntry#setProcedureName(String)}
     *   <li>{@link LabResultEntry#setProcedureType(String)}
     *   <li>{@link LabResultEntry#setProcessed(String)}
     *   <li>{@link LabResultEntry#setProviderServiceMapID(Integer)}
     *   <li>{@link LabResultEntry#setRemarks(String)}
     *   <li>{@link LabResultEntry#setReservedForChange(String)}
     *   <li>{@link LabResultEntry#setStripsNotAvailable(Boolean)}
     *   <li>{@link LabResultEntry#setSyncedBy(String)}
     *   <li>{@link LabResultEntry#setSyncedDate(Timestamp)}
     *   <li>{@link LabResultEntry#setTestComponentID(Integer)}
     *   <li>{@link LabResultEntry#setTestComponentMaster(TestComponentMaster)}
     *   <li>{@link LabResultEntry#setTestReportFilePath(String)}
     *   <li>{@link LabResultEntry#setTestResultUnit(String)}
     *   <li>{@link LabResultEntry#setTestResultValue(String)}
     *   <li>{@link LabResultEntry#setVanID(Integer)}
     *   <li>{@link LabResultEntry#setVanSerialNo(Long)}
     *   <li>{@link LabResultEntry#setVehicalNo(String)}
     *   <li>{@link LabResultEntry#setVisitCode(Long)}
     *   <li>{@link LabResultEntry#getBenVisitID()}
     *   <li>{@link LabResultEntry#getBeneficiaryRegID()}
     *   <li>{@link LabResultEntry#getCompList()}
     *   <li>{@link LabResultEntry#getComponentList()}
     *   <li>{@link LabResultEntry#getCreatedBy()}
     *   <li>{@link LabResultEntry#getCreatedDate()}
     *   <li>{@link LabResultEntry#getDate()}
     *   <li>{@link LabResultEntry#getDeleted()}
     *   <li>{@link LabResultEntry#getFileIDs()}
     *   <li>{@link LabResultEntry#getID()}
     *   <li>{@link LabResultEntry#getLabCompleted()}
     *   <li>{@link LabResultEntry#getLastModDate()}
     *   <li>{@link LabResultEntry#getModifiedBy()}
     *   <li>{@link LabResultEntry#getParkingPlaceID()}
     *   <li>{@link LabResultEntry#getPrescriptionID()}
     *   <li>{@link LabResultEntry#getProcedureData()}
     *   <li>{@link LabResultEntry#getProcedureID()}
     *   <li>{@link LabResultEntry#getProcedureName()}
     *   <li>{@link LabResultEntry#getProcedureType()}
     *   <li>{@link LabResultEntry#getProcessed()}
     *   <li>{@link LabResultEntry#getProviderServiceMapID()}
     *   <li>{@link LabResultEntry#getRemarks()}
     *   <li>{@link LabResultEntry#getReservedForChange()}
     *   <li>{@link LabResultEntry#getStripsNotAvailable()}
     *   <li>{@link LabResultEntry#getSyncedBy()}
     *   <li>{@link LabResultEntry#getSyncedDate()}
     *   <li>{@link LabResultEntry#getTestComponentID()}
     *   <li>{@link LabResultEntry#getTestComponentMaster()}
     *   <li>{@link LabResultEntry#getTestReportFilePath()}
     *   <li>{@link LabResultEntry#getTestResultUnit()}
     *   <li>{@link LabResultEntry#getTestResultValue()}
     *   <li>{@link LabResultEntry#getVanID()}
     *   <li>{@link LabResultEntry#getVanSerialNo()}
     *   <li>{@link LabResultEntry#getVehicalNo()}
     *   <li>{@link LabResultEntry#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        LabResultEntry actualLabResultEntry = new LabResultEntry(1L, mock(Date.class));
        actualLabResultEntry.setBenVisitID(1L);
        actualLabResultEntry.setBeneficiaryRegID(1L);
        ArrayList<Map<String, String>> compList = new ArrayList<>();
        actualLabResultEntry.setCompList(compList);
        ArrayList<Map<String, Object>> componentList = new ArrayList<>();
        actualLabResultEntry.setComponentList(componentList);
        actualLabResultEntry.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualLabResultEntry.setCreatedDate(createdDate);
        Date date = mock(Date.class);
        actualLabResultEntry.setDate(date);
        actualLabResultEntry.setDeleted(true);
        Integer[] fileIDs = new Integer[]{1};
        actualLabResultEntry.setFileIDs(fileIDs);
        actualLabResultEntry.setID(1L);
        actualLabResultEntry.setLabCompleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualLabResultEntry.setLastModDate(lastModDate);
        actualLabResultEntry.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualLabResultEntry.setParkingPlaceID(1);
        actualLabResultEntry.setPrescriptionID(1L);
        ProcedureData procedureData = new ProcedureData();
        procedureData.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        procedureData.setCreatedDate(mock(Timestamp.class));
        procedureData.setDeleted(true);
        procedureData.setGender("Gender");
        procedureData.setLabResultEntry(new HashSet<>());
        procedureData.setLastModDate(mock(Timestamp.class));
        procedureData.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        procedureData.setProcedureDesc("Procedure Desc");
        procedureData.setProcedureID(1);
        procedureData.setProcedureName("Procedure Name");
        procedureData.setProcedureType("Procedure Type");
        procedureData.setProcessed("Processed");
        procedureData.setProviderServiceMapID(1);
        actualLabResultEntry.setProcedureData(procedureData);
        actualLabResultEntry.setProcedureID(1);
        actualLabResultEntry.setProcedureName("Procedure Name");
        actualLabResultEntry.setProcedureType("Procedure Type");
        actualLabResultEntry.setProcessed("Processed");
        actualLabResultEntry.setProviderServiceMapID(1);
        actualLabResultEntry.setRemarks("Remarks");
        actualLabResultEntry.setReservedForChange("Reserved For Change");
        actualLabResultEntry.setStripsNotAvailable(true);
        actualLabResultEntry.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualLabResultEntry.setSyncedDate(syncedDate);
        actualLabResultEntry.setTestComponentID(1);
        TestComponentMaster testComponentMaster = new TestComponentMaster();
        testComponentMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        testComponentMaster.setCreatedDate(mock(Timestamp.class));
        testComponentMaster.setDeleted(true);
        testComponentMaster.setInputType("Input Type");
        testComponentMaster.setLabResultEntry(new HashSet<>());
        testComponentMaster.setLastModDate(mock(Timestamp.class));
        testComponentMaster.setLionicNum("Lionic Num");
        testComponentMaster.setLionicTerm("Lionic Term");
        testComponentMaster.setMeasurementUnit("Measurement Unit");
        testComponentMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        testComponentMaster.setProcessed("Processed");
        testComponentMaster.setProviderServiceMapID(1);
        testComponentMaster.setRange_max(3);
        testComponentMaster.setRange_min(1);
        testComponentMaster.setRange_normal_max(3);
        testComponentMaster.setRange_normal_min(1);
        testComponentMaster.setTestComponentDesc("Test Component Desc");
        testComponentMaster.setTestComponentID(1);
        testComponentMaster.setTestComponentName("Test Component Name");
        actualLabResultEntry.setTestComponentMaster(testComponentMaster);
        actualLabResultEntry.setTestReportFilePath("/directory/foo.txt");
        actualLabResultEntry.setTestResultUnit("Test Result Unit");
        actualLabResultEntry.setTestResultValue("42");
        actualLabResultEntry.setVanID(1);
        actualLabResultEntry.setVanSerialNo(1L);
        actualLabResultEntry.setVehicalNo("Vehical No");
        actualLabResultEntry.setVisitCode(1L);
        Long actualBenVisitID = actualLabResultEntry.getBenVisitID();
        Long actualBeneficiaryRegID = actualLabResultEntry.getBeneficiaryRegID();
        List<Map<String, String>> actualCompList = actualLabResultEntry.getCompList();
        ArrayList<Map<String, Object>> actualComponentList = actualLabResultEntry.getComponentList();
        String actualCreatedBy = actualLabResultEntry.getCreatedBy();
        Timestamp actualCreatedDate = actualLabResultEntry.getCreatedDate();
        Date actualDate = actualLabResultEntry.getDate();
        Boolean actualDeleted = actualLabResultEntry.getDeleted();
        Integer[] actualFileIDs = actualLabResultEntry.getFileIDs();
        Long actualID = actualLabResultEntry.getID();
        Boolean actualLabCompleted = actualLabResultEntry.getLabCompleted();
        Timestamp actualLastModDate = actualLabResultEntry.getLastModDate();
        String actualModifiedBy = actualLabResultEntry.getModifiedBy();
        Integer actualParkingPlaceID = actualLabResultEntry.getParkingPlaceID();
        Long actualPrescriptionID = actualLabResultEntry.getPrescriptionID();
        ProcedureData actualProcedureData = actualLabResultEntry.getProcedureData();
        Integer actualProcedureID = actualLabResultEntry.getProcedureID();
        String actualProcedureName = actualLabResultEntry.getProcedureName();
        String actualProcedureType = actualLabResultEntry.getProcedureType();
        String actualProcessed = actualLabResultEntry.getProcessed();
        Integer actualProviderServiceMapID = actualLabResultEntry.getProviderServiceMapID();
        String actualRemarks = actualLabResultEntry.getRemarks();
        String actualReservedForChange = actualLabResultEntry.getReservedForChange();
        Boolean actualStripsNotAvailable = actualLabResultEntry.getStripsNotAvailable();
        String actualSyncedBy = actualLabResultEntry.getSyncedBy();
        Timestamp actualSyncedDate = actualLabResultEntry.getSyncedDate();
        Integer actualTestComponentID = actualLabResultEntry.getTestComponentID();
        TestComponentMaster actualTestComponentMaster = actualLabResultEntry.getTestComponentMaster();
        String actualTestReportFilePath = actualLabResultEntry.getTestReportFilePath();
        String actualTestResultUnit = actualLabResultEntry.getTestResultUnit();
        String actualTestResultValue = actualLabResultEntry.getTestResultValue();
        Integer actualVanID = actualLabResultEntry.getVanID();
        Long actualVanSerialNo = actualLabResultEntry.getVanSerialNo();
        String actualVehicalNo = actualLabResultEntry.getVehicalNo();
        Long actualVisitCode = actualLabResultEntry.getVisitCode();

        // Assert that nothing has changed
        assertEquals("/directory/foo.txt", actualTestReportFilePath);
        assertEquals("42", actualTestResultValue);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Procedure Name", actualProcedureName);
        assertEquals("Procedure Type", actualProcedureType);
        assertEquals("Processed", actualProcessed);
        assertEquals("Remarks", actualRemarks);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Test Result Unit", actualTestResultUnit);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProcedureID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualTestComponentID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualID.longValue());
        assertEquals(1L, actualPrescriptionID.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertTrue(actualDeleted);
        assertTrue(actualLabCompleted);
        assertTrue(actualStripsNotAvailable);
        assertSame(procedureData, actualProcedureData);
        assertSame(testComponentMaster, actualTestComponentMaster);
        assertSame(compList, actualCompList);
        assertSame(componentList, actualComponentList);
        assertSame(fileIDs, actualFileIDs);
        assertSame(date, actualDate);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }
}
