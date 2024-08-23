package com.iemr.tm.data.foetalmonitor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class FoetalMonitorDiffblueTest {
    /**
     * Method under test: {@link FoetalMonitor#getaMRITFilePath()}
     */
    @Test
    void testGetaMRITFilePath() {
        // Arrange, Act and Assert
        assertNull((new FoetalMonitor()).getaMRITFilePath());
    }

    /**
     * Method under test: {@link FoetalMonitor#getaMRITFilePath()}
     */
    @Test
    void testGetaMRITFilePath2() {
        // Arrange
        FoetalMonitor foetalMonitor = new FoetalMonitor();
        foetalMonitor.setAccelerationsList(new ArrayList<>());
        foetalMonitor.setAccelerationsListDB("Accelerations List DB");
        foetalMonitor.setBasalHeartRate(1);
        foetalMonitor.setBenFlowID(1L);
        foetalMonitor.setBeneficiaryID(1L);
        foetalMonitor.setBeneficiaryRegID(1L);
        foetalMonitor.setCmMotherId("42");
        foetalMonitor.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        foetalMonitor.setCreatedDate(mock(Timestamp.class));
        foetalMonitor.setDecelerationsList(new ArrayList<>());
        foetalMonitor.setDecelerationsListDB("Decelerations List DB");
        foetalMonitor.setDeleted(true);
        foetalMonitor.setDeviceId("42");
        foetalMonitor.setFoetalMonitorID(1L);
        foetalMonitor.setFoetalMonitorMotherID("Foetal Monitor Mother ID");
        foetalMonitor.setFoetalMonitorPartnerID("Foetal Monitor Partner ID");
        foetalMonitor.setFoetalMonitorTestId(1L);
        foetalMonitor.setLastModDate(mock(Timestamp.class));
        foetalMonitor.setLengthOfTest(3);
        foetalMonitor.setLongTermVariation(1);
        foetalMonitor.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        foetalMonitor.setMother(new HashMap<>());
        foetalMonitor.setMotherLMPDate(mock(Timestamp.class));
        foetalMonitor.setMotherName("Mother Name");
        foetalMonitor.setMovementEntries(new ArrayList<>());
        foetalMonitor.setMovementEntriesDB("Movement Entries DB");
        foetalMonitor.setPartnerFoetalMonitorId(1L);
        foetalMonitor.setPartnerId("42");
        foetalMonitor.setPartnerName("Partner Name");
        foetalMonitor.setProcessed("Processed");
        foetalMonitor.setProviderServiceMapID(1);
        foetalMonitor.setReportPath("Report Path");
        foetalMonitor.setResultState(true);
        foetalMonitor.setShortTermVariationBpm("Short Term Variation Bpm");
        foetalMonitor.setShortTermVariationMilli(1);
        foetalMonitor.setTestDoneAt("Test Done At");
        foetalMonitor.setTestId("42");
        foetalMonitor.setTestName("Test Name");
        foetalMonitor.setTestTime(mock(Timestamp.class));
        foetalMonitor.setVanID(1);
        foetalMonitor.setVisitCode(1L);
        foetalMonitor.setaMRITFilePath("/directory/foo.txt");

        // Act and Assert
        assertEquals("/directory/foo.txt", foetalMonitor.getaMRITFilePath());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link FoetalMonitor#FoetalMonitor()}
     *   <li>{@link FoetalMonitor#setAccelerationsList(ArrayList)}
     *   <li>{@link FoetalMonitor#setAccelerationsListDB(String)}
     *   <li>{@link FoetalMonitor#setBasalHeartRate(Integer)}
     *   <li>{@link FoetalMonitor#setBenFlowID(Long)}
     *   <li>{@link FoetalMonitor#setBeneficiaryID(Long)}
     *   <li>{@link FoetalMonitor#setBeneficiaryRegID(Long)}
     *   <li>{@link FoetalMonitor#setCmMotherId(String)}
     *   <li>{@link FoetalMonitor#setCreatedBy(String)}
     *   <li>{@link FoetalMonitor#setCreatedDate(Timestamp)}
     *   <li>{@link FoetalMonitor#setDecelerationsList(ArrayList)}
     *   <li>{@link FoetalMonitor#setDecelerationsListDB(String)}
     *   <li>{@link FoetalMonitor#setDeleted(Boolean)}
     *   <li>{@link FoetalMonitor#setDeviceId(String)}
     *   <li>{@link FoetalMonitor#setFoetalMonitorID(Long)}
     *   <li>{@link FoetalMonitor#setFoetalMonitorMotherID(String)}
     *   <li>{@link FoetalMonitor#setFoetalMonitorPartnerID(String)}
     *   <li>{@link FoetalMonitor#setFoetalMonitorTestId(Long)}
     *   <li>{@link FoetalMonitor#setLastModDate(Timestamp)}
     *   <li>{@link FoetalMonitor#setLengthOfTest(Integer)}
     *   <li>{@link FoetalMonitor#setLongTermVariation(Integer)}
     *   <li>{@link FoetalMonitor#setModifiedBy(String)}
     *   <li>{@link FoetalMonitor#setMother(Map)}
     *   <li>{@link FoetalMonitor#setMotherLMPDate(Timestamp)}
     *   <li>{@link FoetalMonitor#setMotherName(String)}
     *   <li>{@link FoetalMonitor#setMovementEntries(ArrayList)}
     *   <li>{@link FoetalMonitor#setMovementEntriesDB(String)}
     *   <li>{@link FoetalMonitor#setPartnerFoetalMonitorId(Long)}
     *   <li>{@link FoetalMonitor#setPartnerId(String)}
     *   <li>{@link FoetalMonitor#setPartnerName(String)}
     *   <li>{@link FoetalMonitor#setProcessed(String)}
     *   <li>{@link FoetalMonitor#setProviderServiceMapID(Integer)}
     *   <li>{@link FoetalMonitor#setReportPath(String)}
     *   <li>{@link FoetalMonitor#setResultState(Boolean)}
     *   <li>{@link FoetalMonitor#setShortTermVariationBpm(String)}
     *   <li>{@link FoetalMonitor#setShortTermVariationMilli(Integer)}
     *   <li>{@link FoetalMonitor#setTestDoneAt(String)}
     *   <li>{@link FoetalMonitor#setTestId(String)}
     *   <li>{@link FoetalMonitor#setTestName(String)}
     *   <li>{@link FoetalMonitor#setTestTime(Timestamp)}
     *   <li>{@link FoetalMonitor#setVanID(Integer)}
     *   <li>{@link FoetalMonitor#setVisitCode(Long)}
     *   <li>{@link FoetalMonitor#setaMRITFilePath(String)}
     *   <li>{@link FoetalMonitor#setAutoFetalMovement(ArrayList)}
     *   <li>{@link FoetalMonitor#setAutoFetalMovementDB(String)}
     *   <li>{@link FoetalMonitor#getAccelerationsList()}
     *   <li>{@link FoetalMonitor#getAccelerationsListDB()}
     *   <li>{@link FoetalMonitor#getAutoFetalMovement()}
     *   <li>{@link FoetalMonitor#getAutoFetalMovementDB()}
     *   <li>{@link FoetalMonitor#getBasalHeartRate()}
     *   <li>{@link FoetalMonitor#getBenFlowID()}
     *   <li>{@link FoetalMonitor#getBeneficiaryID()}
     *   <li>{@link FoetalMonitor#getBeneficiaryRegID()}
     *   <li>{@link FoetalMonitor#getCmMotherId()}
     *   <li>{@link FoetalMonitor#getCreatedBy()}
     *   <li>{@link FoetalMonitor#getCreatedDate()}
     *   <li>{@link FoetalMonitor#getDecelerationsList()}
     *   <li>{@link FoetalMonitor#getDecelerationsListDB()}
     *   <li>{@link FoetalMonitor#getDeleted()}
     *   <li>{@link FoetalMonitor#getDeviceId()}
     *   <li>{@link FoetalMonitor#getFoetalMonitorID()}
     *   <li>{@link FoetalMonitor#getFoetalMonitorMotherID()}
     *   <li>{@link FoetalMonitor#getFoetalMonitorPartnerID()}
     *   <li>{@link FoetalMonitor#getFoetalMonitorTestId()}
     *   <li>{@link FoetalMonitor#getLastModDate()}
     *   <li>{@link FoetalMonitor#getLengthOfTest()}
     *   <li>{@link FoetalMonitor#getLongTermVariation()}
     *   <li>{@link FoetalMonitor#getModifiedBy()}
     *   <li>{@link FoetalMonitor#getMother()}
     *   <li>{@link FoetalMonitor#getMotherLMPDate()}
     *   <li>{@link FoetalMonitor#getMotherName()}
     *   <li>{@link FoetalMonitor#getMovementEntries()}
     *   <li>{@link FoetalMonitor#getMovementEntriesDB()}
     *   <li>{@link FoetalMonitor#getPartnerFoetalMonitorId()}
     *   <li>{@link FoetalMonitor#getPartnerId()}
     *   <li>{@link FoetalMonitor#getPartnerName()}
     *   <li>{@link FoetalMonitor#getProcessed()}
     *   <li>{@link FoetalMonitor#getProviderServiceMapID()}
     *   <li>{@link FoetalMonitor#getReportPath()}
     *   <li>{@link FoetalMonitor#getResultState()}
     *   <li>{@link FoetalMonitor#getShortTermVariationBpm()}
     *   <li>{@link FoetalMonitor#getShortTermVariationMilli()}
     *   <li>{@link FoetalMonitor#getTestDoneAt()}
     *   <li>{@link FoetalMonitor#getTestId()}
     *   <li>{@link FoetalMonitor#getTestName()}
     *   <li>{@link FoetalMonitor#getTestTime()}
     *   <li>{@link FoetalMonitor#getVanID()}
     *   <li>{@link FoetalMonitor#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        FoetalMonitor actualFoetalMonitor = new FoetalMonitor();
        ArrayList<Object> accelerationsList = new ArrayList<>();
        actualFoetalMonitor.setAccelerationsList(accelerationsList);
        actualFoetalMonitor.setAccelerationsListDB("Accelerations List DB");
        actualFoetalMonitor.setBasalHeartRate(1);
        actualFoetalMonitor.setBenFlowID(1L);
        actualFoetalMonitor.setBeneficiaryID(1L);
        actualFoetalMonitor.setBeneficiaryRegID(1L);
        actualFoetalMonitor.setCmMotherId("42");
        actualFoetalMonitor.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualFoetalMonitor.setCreatedDate(createdDate);
        ArrayList<Object> decelerationsList = new ArrayList<>();
        actualFoetalMonitor.setDecelerationsList(decelerationsList);
        actualFoetalMonitor.setDecelerationsListDB("Decelerations List DB");
        actualFoetalMonitor.setDeleted(true);
        actualFoetalMonitor.setDeviceId("42");
        actualFoetalMonitor.setFoetalMonitorID(1L);
        actualFoetalMonitor.setFoetalMonitorMotherID("Foetal Monitor Mother ID");
        actualFoetalMonitor.setFoetalMonitorPartnerID("Foetal Monitor Partner ID");
        actualFoetalMonitor.setFoetalMonitorTestId(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualFoetalMonitor.setLastModDate(lastModDate);
        actualFoetalMonitor.setLengthOfTest(3);
        actualFoetalMonitor.setLongTermVariation(1);
        actualFoetalMonitor.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        HashMap<String, String> mother = new HashMap<>();
        actualFoetalMonitor.setMother(mother);
        Timestamp motherLMPDate = mock(Timestamp.class);
        actualFoetalMonitor.setMotherLMPDate(motherLMPDate);
        actualFoetalMonitor.setMotherName("Mother Name");
        ArrayList<Integer> movementEntries = new ArrayList<>();
        actualFoetalMonitor.setMovementEntries(movementEntries);
        actualFoetalMonitor.setMovementEntriesDB("Movement Entries DB");
        actualFoetalMonitor.setPartnerFoetalMonitorId(1L);
        actualFoetalMonitor.setPartnerId("42");
        actualFoetalMonitor.setPartnerName("Partner Name");
        actualFoetalMonitor.setProcessed("Processed");
        actualFoetalMonitor.setProviderServiceMapID(1);
        actualFoetalMonitor.setReportPath("Report Path");
        actualFoetalMonitor.setResultState(true);
        actualFoetalMonitor.setShortTermVariationBpm("Short Term Variation Bpm");
        actualFoetalMonitor.setShortTermVariationMilli(1);
        actualFoetalMonitor.setTestDoneAt("Test Done At");
        actualFoetalMonitor.setTestId("42");
        actualFoetalMonitor.setTestName("Test Name");
        Timestamp testTime = mock(Timestamp.class);
        actualFoetalMonitor.setTestTime(testTime);
        actualFoetalMonitor.setVanID(1);
        actualFoetalMonitor.setVisitCode(1L);
        actualFoetalMonitor.setaMRITFilePath("/directory/foo.txt");
        ArrayList<Integer> autoFetalMovement = new ArrayList<>();
        actualFoetalMonitor.setAutoFetalMovement(autoFetalMovement);
        actualFoetalMonitor.setAutoFetalMovementDB("Auto Fetal Movement DB");
        ArrayList<Object> actualAccelerationsList = actualFoetalMonitor.getAccelerationsList();
        String actualAccelerationsListDB = actualFoetalMonitor.getAccelerationsListDB();
        ArrayList<Integer> actualAutoFetalMovement = actualFoetalMonitor.getAutoFetalMovement();
        String actualAutoFetalMovementDB = actualFoetalMonitor.getAutoFetalMovementDB();
        Integer actualBasalHeartRate = actualFoetalMonitor.getBasalHeartRate();
        Long actualBenFlowID = actualFoetalMonitor.getBenFlowID();
        Long actualBeneficiaryID = actualFoetalMonitor.getBeneficiaryID();
        Long actualBeneficiaryRegID = actualFoetalMonitor.getBeneficiaryRegID();
        String actualCmMotherId = actualFoetalMonitor.getCmMotherId();
        String actualCreatedBy = actualFoetalMonitor.getCreatedBy();
        Timestamp actualCreatedDate = actualFoetalMonitor.getCreatedDate();
        ArrayList<Object> actualDecelerationsList = actualFoetalMonitor.getDecelerationsList();
        String actualDecelerationsListDB = actualFoetalMonitor.getDecelerationsListDB();
        Boolean actualDeleted = actualFoetalMonitor.getDeleted();
        String actualDeviceId = actualFoetalMonitor.getDeviceId();
        Long actualFoetalMonitorID = actualFoetalMonitor.getFoetalMonitorID();
        String actualFoetalMonitorMotherID = actualFoetalMonitor.getFoetalMonitorMotherID();
        String actualFoetalMonitorPartnerID = actualFoetalMonitor.getFoetalMonitorPartnerID();
        Long actualFoetalMonitorTestId = actualFoetalMonitor.getFoetalMonitorTestId();
        Timestamp actualLastModDate = actualFoetalMonitor.getLastModDate();
        Integer actualLengthOfTest = actualFoetalMonitor.getLengthOfTest();
        Integer actualLongTermVariation = actualFoetalMonitor.getLongTermVariation();
        String actualModifiedBy = actualFoetalMonitor.getModifiedBy();
        Map<String, String> actualMother = actualFoetalMonitor.getMother();
        Timestamp actualMotherLMPDate = actualFoetalMonitor.getMotherLMPDate();
        String actualMotherName = actualFoetalMonitor.getMotherName();
        ArrayList<Integer> actualMovementEntries = actualFoetalMonitor.getMovementEntries();
        String actualMovementEntriesDB = actualFoetalMonitor.getMovementEntriesDB();
        Long actualPartnerFoetalMonitorId = actualFoetalMonitor.getPartnerFoetalMonitorId();
        String actualPartnerId = actualFoetalMonitor.getPartnerId();
        String actualPartnerName = actualFoetalMonitor.getPartnerName();
        String actualProcessed = actualFoetalMonitor.getProcessed();
        Integer actualProviderServiceMapID = actualFoetalMonitor.getProviderServiceMapID();
        String actualReportPath = actualFoetalMonitor.getReportPath();
        Boolean actualResultState = actualFoetalMonitor.getResultState();
        String actualShortTermVariationBpm = actualFoetalMonitor.getShortTermVariationBpm();
        Integer actualShortTermVariationMilli = actualFoetalMonitor.getShortTermVariationMilli();
        String actualTestDoneAt = actualFoetalMonitor.getTestDoneAt();
        String actualTestId = actualFoetalMonitor.getTestId();
        String actualTestName = actualFoetalMonitor.getTestName();
        Timestamp actualTestTime = actualFoetalMonitor.getTestTime();
        Integer actualVanID = actualFoetalMonitor.getVanID();
        Long actualVisitCode = actualFoetalMonitor.getVisitCode();

        // Assert that nothing has changed
        assertEquals("42", actualDeviceId);
        assertEquals("42", actualFoetalMonitorPartnerID);
        assertEquals("42", actualPartnerId);
        assertEquals("42", actualTestId);
        assertEquals("Accelerations List DB", actualAccelerationsListDB);
        assertEquals("Auto Fetal Movement DB", actualAutoFetalMovementDB);
        assertEquals("Decelerations List DB", actualDecelerationsListDB);
        assertEquals("Foetal Monitor Mother ID", actualCmMotherId);
        assertEquals("Foetal Monitor Mother ID", actualFoetalMonitorMotherID);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Mother Name", actualMotherName);
        assertEquals("Movement Entries DB", actualMovementEntriesDB);
        assertEquals("Partner Name", actualPartnerName);
        assertEquals("Processed", actualProcessed);
        assertEquals("Report Path", actualReportPath);
        assertEquals("Short Term Variation Bpm", actualShortTermVariationBpm);
        assertEquals("Test Done At", actualTestDoneAt);
        assertEquals("Test Name", actualTestName);
        assertEquals(1, actualBasalHeartRate.intValue());
        assertEquals(1, actualLongTermVariation.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualShortTermVariationMilli.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenFlowID.longValue());
        assertEquals(1L, actualBeneficiaryID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualFoetalMonitorID.longValue());
        assertEquals(1L, actualFoetalMonitorTestId.longValue());
        assertEquals(1L, actualPartnerFoetalMonitorId.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertEquals(3, actualLengthOfTest.intValue());
        assertTrue(actualDeleted);
        assertTrue(actualResultState);
        assertSame(accelerationsList, actualAccelerationsList);
        assertSame(autoFetalMovement, actualAutoFetalMovement);
        assertSame(decelerationsList, actualDecelerationsList);
        assertSame(movementEntries, actualMovementEntries);
        assertSame(mother, actualMother);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(motherLMPDate, actualMotherLMPDate);
        assertSame(testTime, actualTestTime);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link FoetalMonitor#FoetalMonitor(Long, Long, Long, Long, Long, Boolean)}
     *   <li>{@link FoetalMonitor#setAccelerationsList(ArrayList)}
     *   <li>{@link FoetalMonitor#setAccelerationsListDB(String)}
     *   <li>{@link FoetalMonitor#setBasalHeartRate(Integer)}
     *   <li>{@link FoetalMonitor#setBenFlowID(Long)}
     *   <li>{@link FoetalMonitor#setBeneficiaryID(Long)}
     *   <li>{@link FoetalMonitor#setBeneficiaryRegID(Long)}
     *   <li>{@link FoetalMonitor#setCmMotherId(String)}
     *   <li>{@link FoetalMonitor#setCreatedBy(String)}
     *   <li>{@link FoetalMonitor#setCreatedDate(Timestamp)}
     *   <li>{@link FoetalMonitor#setDecelerationsList(ArrayList)}
     *   <li>{@link FoetalMonitor#setDecelerationsListDB(String)}
     *   <li>{@link FoetalMonitor#setDeleted(Boolean)}
     *   <li>{@link FoetalMonitor#setDeviceId(String)}
     *   <li>{@link FoetalMonitor#setFoetalMonitorID(Long)}
     *   <li>{@link FoetalMonitor#setFoetalMonitorMotherID(String)}
     *   <li>{@link FoetalMonitor#setFoetalMonitorPartnerID(String)}
     *   <li>{@link FoetalMonitor#setFoetalMonitorTestId(Long)}
     *   <li>{@link FoetalMonitor#setLastModDate(Timestamp)}
     *   <li>{@link FoetalMonitor#setLengthOfTest(Integer)}
     *   <li>{@link FoetalMonitor#setLongTermVariation(Integer)}
     *   <li>{@link FoetalMonitor#setModifiedBy(String)}
     *   <li>{@link FoetalMonitor#setMother(Map)}
     *   <li>{@link FoetalMonitor#setMotherLMPDate(Timestamp)}
     *   <li>{@link FoetalMonitor#setMotherName(String)}
     *   <li>{@link FoetalMonitor#setMovementEntries(ArrayList)}
     *   <li>{@link FoetalMonitor#setMovementEntriesDB(String)}
     *   <li>{@link FoetalMonitor#setPartnerFoetalMonitorId(Long)}
     *   <li>{@link FoetalMonitor#setPartnerId(String)}
     *   <li>{@link FoetalMonitor#setPartnerName(String)}
     *   <li>{@link FoetalMonitor#setProcessed(String)}
     *   <li>{@link FoetalMonitor#setProviderServiceMapID(Integer)}
     *   <li>{@link FoetalMonitor#setReportPath(String)}
     *   <li>{@link FoetalMonitor#setResultState(Boolean)}
     *   <li>{@link FoetalMonitor#setShortTermVariationBpm(String)}
     *   <li>{@link FoetalMonitor#setShortTermVariationMilli(Integer)}
     *   <li>{@link FoetalMonitor#setTestDoneAt(String)}
     *   <li>{@link FoetalMonitor#setTestId(String)}
     *   <li>{@link FoetalMonitor#setTestName(String)}
     *   <li>{@link FoetalMonitor#setTestTime(Timestamp)}
     *   <li>{@link FoetalMonitor#setVanID(Integer)}
     *   <li>{@link FoetalMonitor#setVisitCode(Long)}
     *   <li>{@link FoetalMonitor#setaMRITFilePath(String)}
     *   <li>{@link FoetalMonitor#setAutoFetalMovement(ArrayList)}
     *   <li>{@link FoetalMonitor#setAutoFetalMovementDB(String)}
     *   <li>{@link FoetalMonitor#getAccelerationsList()}
     *   <li>{@link FoetalMonitor#getAccelerationsListDB()}
     *   <li>{@link FoetalMonitor#getAutoFetalMovement()}
     *   <li>{@link FoetalMonitor#getAutoFetalMovementDB()}
     *   <li>{@link FoetalMonitor#getBasalHeartRate()}
     *   <li>{@link FoetalMonitor#getBenFlowID()}
     *   <li>{@link FoetalMonitor#getBeneficiaryID()}
     *   <li>{@link FoetalMonitor#getBeneficiaryRegID()}
     *   <li>{@link FoetalMonitor#getCmMotherId()}
     *   <li>{@link FoetalMonitor#getCreatedBy()}
     *   <li>{@link FoetalMonitor#getCreatedDate()}
     *   <li>{@link FoetalMonitor#getDecelerationsList()}
     *   <li>{@link FoetalMonitor#getDecelerationsListDB()}
     *   <li>{@link FoetalMonitor#getDeleted()}
     *   <li>{@link FoetalMonitor#getDeviceId()}
     *   <li>{@link FoetalMonitor#getFoetalMonitorID()}
     *   <li>{@link FoetalMonitor#getFoetalMonitorMotherID()}
     *   <li>{@link FoetalMonitor#getFoetalMonitorPartnerID()}
     *   <li>{@link FoetalMonitor#getFoetalMonitorTestId()}
     *   <li>{@link FoetalMonitor#getLastModDate()}
     *   <li>{@link FoetalMonitor#getLengthOfTest()}
     *   <li>{@link FoetalMonitor#getLongTermVariation()}
     *   <li>{@link FoetalMonitor#getModifiedBy()}
     *   <li>{@link FoetalMonitor#getMother()}
     *   <li>{@link FoetalMonitor#getMotherLMPDate()}
     *   <li>{@link FoetalMonitor#getMotherName()}
     *   <li>{@link FoetalMonitor#getMovementEntries()}
     *   <li>{@link FoetalMonitor#getMovementEntriesDB()}
     *   <li>{@link FoetalMonitor#getPartnerFoetalMonitorId()}
     *   <li>{@link FoetalMonitor#getPartnerId()}
     *   <li>{@link FoetalMonitor#getPartnerName()}
     *   <li>{@link FoetalMonitor#getProcessed()}
     *   <li>{@link FoetalMonitor#getProviderServiceMapID()}
     *   <li>{@link FoetalMonitor#getReportPath()}
     *   <li>{@link FoetalMonitor#getResultState()}
     *   <li>{@link FoetalMonitor#getShortTermVariationBpm()}
     *   <li>{@link FoetalMonitor#getShortTermVariationMilli()}
     *   <li>{@link FoetalMonitor#getTestDoneAt()}
     *   <li>{@link FoetalMonitor#getTestId()}
     *   <li>{@link FoetalMonitor#getTestName()}
     *   <li>{@link FoetalMonitor#getTestTime()}
     *   <li>{@link FoetalMonitor#getVanID()}
     *   <li>{@link FoetalMonitor#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        FoetalMonitor actualFoetalMonitor = new FoetalMonitor(1L, 1L, 1L, 1L, 1L, true);
        ArrayList<Object> accelerationsList = new ArrayList<>();
        actualFoetalMonitor.setAccelerationsList(accelerationsList);
        actualFoetalMonitor.setAccelerationsListDB("Accelerations List DB");
        actualFoetalMonitor.setBasalHeartRate(1);
        actualFoetalMonitor.setBenFlowID(1L);
        actualFoetalMonitor.setBeneficiaryID(1L);
        actualFoetalMonitor.setBeneficiaryRegID(1L);
        actualFoetalMonitor.setCmMotherId("42");
        actualFoetalMonitor.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualFoetalMonitor.setCreatedDate(createdDate);
        ArrayList<Object> decelerationsList = new ArrayList<>();
        actualFoetalMonitor.setDecelerationsList(decelerationsList);
        actualFoetalMonitor.setDecelerationsListDB("Decelerations List DB");
        actualFoetalMonitor.setDeleted(true);
        actualFoetalMonitor.setDeviceId("42");
        actualFoetalMonitor.setFoetalMonitorID(1L);
        actualFoetalMonitor.setFoetalMonitorMotherID("Foetal Monitor Mother ID");
        actualFoetalMonitor.setFoetalMonitorPartnerID("Foetal Monitor Partner ID");
        actualFoetalMonitor.setFoetalMonitorTestId(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualFoetalMonitor.setLastModDate(lastModDate);
        actualFoetalMonitor.setLengthOfTest(3);
        actualFoetalMonitor.setLongTermVariation(1);
        actualFoetalMonitor.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        HashMap<String, String> mother = new HashMap<>();
        actualFoetalMonitor.setMother(mother);
        Timestamp motherLMPDate = mock(Timestamp.class);
        actualFoetalMonitor.setMotherLMPDate(motherLMPDate);
        actualFoetalMonitor.setMotherName("Mother Name");
        ArrayList<Integer> movementEntries = new ArrayList<>();
        actualFoetalMonitor.setMovementEntries(movementEntries);
        actualFoetalMonitor.setMovementEntriesDB("Movement Entries DB");
        actualFoetalMonitor.setPartnerFoetalMonitorId(1L);
        actualFoetalMonitor.setPartnerId("42");
        actualFoetalMonitor.setPartnerName("Partner Name");
        actualFoetalMonitor.setProcessed("Processed");
        actualFoetalMonitor.setProviderServiceMapID(1);
        actualFoetalMonitor.setReportPath("Report Path");
        actualFoetalMonitor.setResultState(true);
        actualFoetalMonitor.setShortTermVariationBpm("Short Term Variation Bpm");
        actualFoetalMonitor.setShortTermVariationMilli(1);
        actualFoetalMonitor.setTestDoneAt("Test Done At");
        actualFoetalMonitor.setTestId("42");
        actualFoetalMonitor.setTestName("Test Name");
        Timestamp testTime = mock(Timestamp.class);
        actualFoetalMonitor.setTestTime(testTime);
        actualFoetalMonitor.setVanID(1);
        actualFoetalMonitor.setVisitCode(1L);
        actualFoetalMonitor.setaMRITFilePath("/directory/foo.txt");
        ArrayList<Integer> autoFetalMovement = new ArrayList<>();
        actualFoetalMonitor.setAutoFetalMovement(autoFetalMovement);
        actualFoetalMonitor.setAutoFetalMovementDB("Auto Fetal Movement DB");
        ArrayList<Object> actualAccelerationsList = actualFoetalMonitor.getAccelerationsList();
        String actualAccelerationsListDB = actualFoetalMonitor.getAccelerationsListDB();
        ArrayList<Integer> actualAutoFetalMovement = actualFoetalMonitor.getAutoFetalMovement();
        String actualAutoFetalMovementDB = actualFoetalMonitor.getAutoFetalMovementDB();
        Integer actualBasalHeartRate = actualFoetalMonitor.getBasalHeartRate();
        Long actualBenFlowID = actualFoetalMonitor.getBenFlowID();
        Long actualBeneficiaryID = actualFoetalMonitor.getBeneficiaryID();
        Long actualBeneficiaryRegID = actualFoetalMonitor.getBeneficiaryRegID();
        String actualCmMotherId = actualFoetalMonitor.getCmMotherId();
        String actualCreatedBy = actualFoetalMonitor.getCreatedBy();
        Timestamp actualCreatedDate = actualFoetalMonitor.getCreatedDate();
        ArrayList<Object> actualDecelerationsList = actualFoetalMonitor.getDecelerationsList();
        String actualDecelerationsListDB = actualFoetalMonitor.getDecelerationsListDB();
        Boolean actualDeleted = actualFoetalMonitor.getDeleted();
        String actualDeviceId = actualFoetalMonitor.getDeviceId();
        Long actualFoetalMonitorID = actualFoetalMonitor.getFoetalMonitorID();
        String actualFoetalMonitorMotherID = actualFoetalMonitor.getFoetalMonitorMotherID();
        String actualFoetalMonitorPartnerID = actualFoetalMonitor.getFoetalMonitorPartnerID();
        Long actualFoetalMonitorTestId = actualFoetalMonitor.getFoetalMonitorTestId();
        Timestamp actualLastModDate = actualFoetalMonitor.getLastModDate();
        Integer actualLengthOfTest = actualFoetalMonitor.getLengthOfTest();
        Integer actualLongTermVariation = actualFoetalMonitor.getLongTermVariation();
        String actualModifiedBy = actualFoetalMonitor.getModifiedBy();
        Map<String, String> actualMother = actualFoetalMonitor.getMother();
        Timestamp actualMotherLMPDate = actualFoetalMonitor.getMotherLMPDate();
        String actualMotherName = actualFoetalMonitor.getMotherName();
        ArrayList<Integer> actualMovementEntries = actualFoetalMonitor.getMovementEntries();
        String actualMovementEntriesDB = actualFoetalMonitor.getMovementEntriesDB();
        Long actualPartnerFoetalMonitorId = actualFoetalMonitor.getPartnerFoetalMonitorId();
        String actualPartnerId = actualFoetalMonitor.getPartnerId();
        String actualPartnerName = actualFoetalMonitor.getPartnerName();
        String actualProcessed = actualFoetalMonitor.getProcessed();
        Integer actualProviderServiceMapID = actualFoetalMonitor.getProviderServiceMapID();
        String actualReportPath = actualFoetalMonitor.getReportPath();
        Boolean actualResultState = actualFoetalMonitor.getResultState();
        String actualShortTermVariationBpm = actualFoetalMonitor.getShortTermVariationBpm();
        Integer actualShortTermVariationMilli = actualFoetalMonitor.getShortTermVariationMilli();
        String actualTestDoneAt = actualFoetalMonitor.getTestDoneAt();
        String actualTestId = actualFoetalMonitor.getTestId();
        String actualTestName = actualFoetalMonitor.getTestName();
        Timestamp actualTestTime = actualFoetalMonitor.getTestTime();
        Integer actualVanID = actualFoetalMonitor.getVanID();
        Long actualVisitCode = actualFoetalMonitor.getVisitCode();

        // Assert that nothing has changed
        assertEquals("42", actualDeviceId);
        assertEquals("42", actualFoetalMonitorPartnerID);
        assertEquals("42", actualPartnerId);
        assertEquals("42", actualTestId);
        assertEquals("Accelerations List DB", actualAccelerationsListDB);
        assertEquals("Auto Fetal Movement DB", actualAutoFetalMovementDB);
        assertEquals("Decelerations List DB", actualDecelerationsListDB);
        assertEquals("Foetal Monitor Mother ID", actualCmMotherId);
        assertEquals("Foetal Monitor Mother ID", actualFoetalMonitorMotherID);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Mother Name", actualMotherName);
        assertEquals("Movement Entries DB", actualMovementEntriesDB);
        assertEquals("Partner Name", actualPartnerName);
        assertEquals("Processed", actualProcessed);
        assertEquals("Report Path", actualReportPath);
        assertEquals("Short Term Variation Bpm", actualShortTermVariationBpm);
        assertEquals("Test Done At", actualTestDoneAt);
        assertEquals("Test Name", actualTestName);
        assertEquals(1, actualBasalHeartRate.intValue());
        assertEquals(1, actualLongTermVariation.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualShortTermVariationMilli.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenFlowID.longValue());
        assertEquals(1L, actualBeneficiaryID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualFoetalMonitorID.longValue());
        assertEquals(1L, actualFoetalMonitorTestId.longValue());
        assertEquals(1L, actualPartnerFoetalMonitorId.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertEquals(3, actualLengthOfTest.intValue());
        assertTrue(actualDeleted);
        assertTrue(actualResultState);
        assertSame(accelerationsList, actualAccelerationsList);
        assertSame(autoFetalMovement, actualAutoFetalMovement);
        assertSame(decelerationsList, actualDecelerationsList);
        assertSame(movementEntries, actualMovementEntries);
        assertSame(mother, actualMother);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(motherLMPDate, actualMotherLMPDate);
        assertSame(testTime, actualTestTime);
    }
}
