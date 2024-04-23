package com.iemr.tm.data.labModule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class TestComponentMasterDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link TestComponentMaster#setCreatedBy(String)}
     *   <li>{@link TestComponentMaster#setCreatedDate(Timestamp)}
     *   <li>{@link TestComponentMaster#setDeleted(Boolean)}
     *   <li>{@link TestComponentMaster#setInputType(String)}
     *   <li>{@link TestComponentMaster#setLabResultEntry(Set)}
     *   <li>{@link TestComponentMaster#setLastModDate(Timestamp)}
     *   <li>{@link TestComponentMaster#setLionicNum(String)}
     *   <li>{@link TestComponentMaster#setLionicTerm(String)}
     *   <li>{@link TestComponentMaster#setMeasurementUnit(String)}
     *   <li>{@link TestComponentMaster#setModifiedBy(String)}
     *   <li>{@link TestComponentMaster#setProcessed(String)}
     *   <li>{@link TestComponentMaster#setProviderServiceMapID(Integer)}
     *   <li>{@link TestComponentMaster#setRange_max(Integer)}
     *   <li>{@link TestComponentMaster#setRange_min(Integer)}
     *   <li>{@link TestComponentMaster#setRange_normal_max(Integer)}
     *   <li>{@link TestComponentMaster#setRange_normal_min(Integer)}
     *   <li>{@link TestComponentMaster#setTestComponentDesc(String)}
     *   <li>{@link TestComponentMaster#setTestComponentID(Integer)}
     *   <li>{@link TestComponentMaster#setTestComponentName(String)}
     *   <li>{@link TestComponentMaster#getCreatedBy()}
     *   <li>{@link TestComponentMaster#getCreatedDate()}
     *   <li>{@link TestComponentMaster#getDeleted()}
     *   <li>{@link TestComponentMaster#getInputType()}
     *   <li>{@link TestComponentMaster#getLabResultEntry()}
     *   <li>{@link TestComponentMaster#getLastModDate()}
     *   <li>{@link TestComponentMaster#getLionicNum()}
     *   <li>{@link TestComponentMaster#getLionicTerm()}
     *   <li>{@link TestComponentMaster#getMeasurementUnit()}
     *   <li>{@link TestComponentMaster#getModifiedBy()}
     *   <li>{@link TestComponentMaster#getProcessed()}
     *   <li>{@link TestComponentMaster#getProviderServiceMapID()}
     *   <li>{@link TestComponentMaster#getRange_max()}
     *   <li>{@link TestComponentMaster#getRange_min()}
     *   <li>{@link TestComponentMaster#getRange_normal_max()}
     *   <li>{@link TestComponentMaster#getRange_normal_min()}
     *   <li>{@link TestComponentMaster#getTestComponentDesc()}
     *   <li>{@link TestComponentMaster#getTestComponentName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        TestComponentMaster testComponentMaster = new TestComponentMaster();

        // Act
        testComponentMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        testComponentMaster.setCreatedDate(createdDate);
        testComponentMaster.setDeleted(true);
        testComponentMaster.setInputType("Input Type");
        HashSet<LabResultEntry> labResultEntry = new HashSet<>();
        testComponentMaster.setLabResultEntry(labResultEntry);
        Timestamp lastModDate = mock(Timestamp.class);
        testComponentMaster.setLastModDate(lastModDate);
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
        String actualCreatedBy = testComponentMaster.getCreatedBy();
        Timestamp actualCreatedDate = testComponentMaster.getCreatedDate();
        Boolean actualDeleted = testComponentMaster.getDeleted();
        String actualInputType = testComponentMaster.getInputType();
        Set<LabResultEntry> actualLabResultEntry = testComponentMaster.getLabResultEntry();
        Timestamp actualLastModDate = testComponentMaster.getLastModDate();
        String actualLionicNum = testComponentMaster.getLionicNum();
        String actualLionicTerm = testComponentMaster.getLionicTerm();
        String actualMeasurementUnit = testComponentMaster.getMeasurementUnit();
        String actualModifiedBy = testComponentMaster.getModifiedBy();
        String actualProcessed = testComponentMaster.getProcessed();
        Integer actualProviderServiceMapID = testComponentMaster.getProviderServiceMapID();
        Integer actualRange_max = testComponentMaster.getRange_max();
        Integer actualRange_min = testComponentMaster.getRange_min();
        Integer actualRange_normal_max = testComponentMaster.getRange_normal_max();
        Integer actualRange_normal_min = testComponentMaster.getRange_normal_min();
        String actualTestComponentDesc = testComponentMaster.getTestComponentDesc();

        // Assert that nothing has changed
        assertEquals("Input Type", actualInputType);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Lionic Num", actualLionicNum);
        assertEquals("Lionic Term", actualLionicTerm);
        assertEquals("Measurement Unit", actualMeasurementUnit);
        assertEquals("Processed", actualProcessed);
        assertEquals("Test Component Desc", actualTestComponentDesc);
        assertEquals("Test Component Name", testComponentMaster.getTestComponentName());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualRange_min.intValue());
        assertEquals(1, actualRange_normal_min.intValue());
        assertEquals(3, actualRange_max.intValue());
        assertEquals(3, actualRange_normal_max.intValue());
        assertTrue(actualDeleted);
        assertSame(labResultEntry, actualLabResultEntry);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
