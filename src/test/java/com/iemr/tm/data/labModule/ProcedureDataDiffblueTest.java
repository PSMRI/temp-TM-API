package com.iemr.tm.data.labModule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class ProcedureDataDiffblueTest {
    /**
     * Method under test: {@link ProcedureData#getProcedures(ArrayList)}
     */
    @Test
    void testGetProcedures() {
        // Arrange and Act
        ArrayList<ProcedureData> actualProcedures = ProcedureData.getProcedures(new ArrayList<>());

        // Assert
        assertTrue(actualProcedures.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ProcedureData#ProcedureData()}
     *   <li>{@link ProcedureData#setCreatedBy(String)}
     *   <li>{@link ProcedureData#setCreatedDate(Timestamp)}
     *   <li>{@link ProcedureData#setDeleted(Boolean)}
     *   <li>{@link ProcedureData#setGender(String)}
     *   <li>{@link ProcedureData#setLabResultEntry(Set)}
     *   <li>{@link ProcedureData#setLastModDate(Timestamp)}
     *   <li>{@link ProcedureData#setModifiedBy(String)}
     *   <li>{@link ProcedureData#setProcedureDesc(String)}
     *   <li>{@link ProcedureData#setProcedureID(Integer)}
     *   <li>{@link ProcedureData#setProcedureName(String)}
     *   <li>{@link ProcedureData#setProcedureType(String)}
     *   <li>{@link ProcedureData#setProcessed(String)}
     *   <li>{@link ProcedureData#setProviderServiceMapID(Integer)}
     *   <li>{@link ProcedureData#getCreatedBy()}
     *   <li>{@link ProcedureData#getCreatedDate()}
     *   <li>{@link ProcedureData#getDeleted()}
     *   <li>{@link ProcedureData#getGender()}
     *   <li>{@link ProcedureData#getLabResultEntry()}
     *   <li>{@link ProcedureData#getLastModDate()}
     *   <li>{@link ProcedureData#getModifiedBy()}
     *   <li>{@link ProcedureData#getProcedureDesc()}
     *   <li>{@link ProcedureData#getProcedureID()}
     *   <li>{@link ProcedureData#getProcedureName()}
     *   <li>{@link ProcedureData#getProcedureType()}
     *   <li>{@link ProcedureData#getProcessed()}
     *   <li>{@link ProcedureData#getProviderServiceMapID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        ProcedureData actualProcedureData = new ProcedureData();
        actualProcedureData.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualProcedureData.setCreatedDate(createdDate);
        actualProcedureData.setDeleted(true);
        actualProcedureData.setGender("Gender");
        HashSet<LabResultEntry> labResultEntry = new HashSet<>();
        actualProcedureData.setLabResultEntry(labResultEntry);
        Timestamp lastModDate = mock(Timestamp.class);
        actualProcedureData.setLastModDate(lastModDate);
        actualProcedureData.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualProcedureData.setProcedureDesc("Procedure Desc");
        actualProcedureData.setProcedureID(1);
        actualProcedureData.setProcedureName("Procedure Name");
        actualProcedureData.setProcedureType("Procedure Type");
        actualProcedureData.setProcessed("Processed");
        actualProcedureData.setProviderServiceMapID(1);
        String actualCreatedBy = actualProcedureData.getCreatedBy();
        Timestamp actualCreatedDate = actualProcedureData.getCreatedDate();
        Boolean actualDeleted = actualProcedureData.getDeleted();
        String actualGender = actualProcedureData.getGender();
        Set<LabResultEntry> actualLabResultEntry = actualProcedureData.getLabResultEntry();
        Timestamp actualLastModDate = actualProcedureData.getLastModDate();
        String actualModifiedBy = actualProcedureData.getModifiedBy();
        String actualProcedureDesc = actualProcedureData.getProcedureDesc();
        Integer actualProcedureID = actualProcedureData.getProcedureID();
        String actualProcedureName = actualProcedureData.getProcedureName();
        String actualProcedureType = actualProcedureData.getProcedureType();
        String actualProcessed = actualProcedureData.getProcessed();
        Integer actualProviderServiceMapID = actualProcedureData.getProviderServiceMapID();

        // Assert that nothing has changed
        assertEquals("Gender", actualGender);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Procedure Desc", actualProcedureDesc);
        assertEquals("Procedure Name", actualProcedureName);
        assertEquals("Procedure Type", actualProcedureType);
        assertEquals("Processed", actualProcessed);
        assertEquals(1, actualProcedureID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertTrue(actualDeleted);
        assertSame(labResultEntry, actualLabResultEntry);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link ProcedureData#ProcedureData(Integer, String, String, String, String, Integer)}
     *   <li>{@link ProcedureData#setCreatedBy(String)}
     *   <li>{@link ProcedureData#setCreatedDate(Timestamp)}
     *   <li>{@link ProcedureData#setDeleted(Boolean)}
     *   <li>{@link ProcedureData#setGender(String)}
     *   <li>{@link ProcedureData#setLabResultEntry(Set)}
     *   <li>{@link ProcedureData#setLastModDate(Timestamp)}
     *   <li>{@link ProcedureData#setModifiedBy(String)}
     *   <li>{@link ProcedureData#setProcedureDesc(String)}
     *   <li>{@link ProcedureData#setProcedureID(Integer)}
     *   <li>{@link ProcedureData#setProcedureName(String)}
     *   <li>{@link ProcedureData#setProcedureType(String)}
     *   <li>{@link ProcedureData#setProcessed(String)}
     *   <li>{@link ProcedureData#setProviderServiceMapID(Integer)}
     *   <li>{@link ProcedureData#getCreatedBy()}
     *   <li>{@link ProcedureData#getCreatedDate()}
     *   <li>{@link ProcedureData#getDeleted()}
     *   <li>{@link ProcedureData#getGender()}
     *   <li>{@link ProcedureData#getLabResultEntry()}
     *   <li>{@link ProcedureData#getLastModDate()}
     *   <li>{@link ProcedureData#getModifiedBy()}
     *   <li>{@link ProcedureData#getProcedureDesc()}
     *   <li>{@link ProcedureData#getProcedureID()}
     *   <li>{@link ProcedureData#getProcedureName()}
     *   <li>{@link ProcedureData#getProcedureType()}
     *   <li>{@link ProcedureData#getProcessed()}
     *   <li>{@link ProcedureData#getProviderServiceMapID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        ProcedureData actualProcedureData = new ProcedureData(1, "Procedure Name", "Procedure Desc", "Procedure Type",
                "Gender", 1);
        actualProcedureData.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualProcedureData.setCreatedDate(createdDate);
        actualProcedureData.setDeleted(true);
        actualProcedureData.setGender("Gender");
        HashSet<LabResultEntry> labResultEntry = new HashSet<>();
        actualProcedureData.setLabResultEntry(labResultEntry);
        Timestamp lastModDate = mock(Timestamp.class);
        actualProcedureData.setLastModDate(lastModDate);
        actualProcedureData.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualProcedureData.setProcedureDesc("Procedure Desc");
        actualProcedureData.setProcedureID(1);
        actualProcedureData.setProcedureName("Procedure Name");
        actualProcedureData.setProcedureType("Procedure Type");
        actualProcedureData.setProcessed("Processed");
        actualProcedureData.setProviderServiceMapID(1);
        String actualCreatedBy = actualProcedureData.getCreatedBy();
        Timestamp actualCreatedDate = actualProcedureData.getCreatedDate();
        Boolean actualDeleted = actualProcedureData.getDeleted();
        String actualGender = actualProcedureData.getGender();
        Set<LabResultEntry> actualLabResultEntry = actualProcedureData.getLabResultEntry();
        Timestamp actualLastModDate = actualProcedureData.getLastModDate();
        String actualModifiedBy = actualProcedureData.getModifiedBy();
        String actualProcedureDesc = actualProcedureData.getProcedureDesc();
        Integer actualProcedureID = actualProcedureData.getProcedureID();
        String actualProcedureName = actualProcedureData.getProcedureName();
        String actualProcedureType = actualProcedureData.getProcedureType();
        String actualProcessed = actualProcedureData.getProcessed();
        Integer actualProviderServiceMapID = actualProcedureData.getProviderServiceMapID();

        // Assert that nothing has changed
        assertEquals("Gender", actualGender);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Procedure Desc", actualProcedureDesc);
        assertEquals("Procedure Name", actualProcedureName);
        assertEquals("Procedure Type", actualProcedureType);
        assertEquals("Processed", actualProcessed);
        assertEquals(1, actualProcedureID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertTrue(actualDeleted);
        assertSame(labResultEntry, actualLabResultEntry);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
