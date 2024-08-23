package com.iemr.tm.data.institution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class InstituteDiffblueTest {
    /**
     * Method under test: {@link Institute#getinstituteDetails(ArrayList)}
     */
    @Test
    void testGetinstituteDetails() {
        // Arrange and Act
        ArrayList<Institute> actualGetinstituteDetailsResult = Institute.getinstituteDetails(new ArrayList<>());

        // Assert
        assertTrue(actualGetinstituteDetailsResult.isEmpty());
    }

    /**
     * Method under test: {@link Institute#getinstituteDetails(ArrayList)}
     */
    @Test
    void testGetinstituteDetails2() {
        // Arrange and Act
        ArrayList<Institute> actualGetinstituteDetailsResult = Institute.getinstituteDetails(null);

        // Assert
        assertTrue(actualGetinstituteDetailsResult.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Institute#Institute()}
     *   <li>{@link Institute#setBlockID(Integer)}
     *   <li>{@link Institute#setCreatedBy(String)}
     *   <li>{@link Institute#setCreatedDate(Timestamp)}
     *   <li>{@link Institute#setDeleted(Boolean)}
     *   <li>{@link Institute#setDistrictBranchMappingID(Integer)}
     *   <li>{@link Institute#setDistrictID(Integer)}
     *   <li>{@link Institute#setInstitutionID(Integer)}
     *   <li>{@link Institute#setInstitutionName(String)}
     *   <li>{@link Institute#setLastModDate(Timestamp)}
     *   <li>{@link Institute#setModifiedBy(String)}
     *   <li>{@link Institute#setProcessed(String)}
     *   <li>{@link Institute#setProviderServiceMapID(Integer)}
     *   <li>{@link Institute#setStateID(Integer)}
     *   <li>{@link Institute#getBlockID()}
     *   <li>{@link Institute#getCreatedBy()}
     *   <li>{@link Institute#getCreatedDate()}
     *   <li>{@link Institute#getDeleted()}
     *   <li>{@link Institute#getDistrictBranchMappingID()}
     *   <li>{@link Institute#getDistrictID()}
     *   <li>{@link Institute#getInstitutionID()}
     *   <li>{@link Institute#getInstitutionName()}
     *   <li>{@link Institute#getLastModDate()}
     *   <li>{@link Institute#getModifiedBy()}
     *   <li>{@link Institute#getProcessed()}
     *   <li>{@link Institute#getProviderServiceMapID()}
     *   <li>{@link Institute#getStateID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        Institute actualInstitute = new Institute();
        actualInstitute.setBlockID(1);
        actualInstitute.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualInstitute.setCreatedDate(createdDate);
        actualInstitute.setDeleted(true);
        actualInstitute.setDistrictBranchMappingID(1);
        actualInstitute.setDistrictID(1);
        actualInstitute.setInstitutionID(1);
        actualInstitute.setInstitutionName("Institution Name");
        Timestamp lastModDate = mock(Timestamp.class);
        actualInstitute.setLastModDate(lastModDate);
        actualInstitute.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualInstitute.setProcessed("Processed");
        actualInstitute.setProviderServiceMapID(1);
        actualInstitute.setStateID(1);
        Integer actualBlockID = actualInstitute.getBlockID();
        String actualCreatedBy = actualInstitute.getCreatedBy();
        Timestamp actualCreatedDate = actualInstitute.getCreatedDate();
        Boolean actualDeleted = actualInstitute.getDeleted();
        Integer actualDistrictBranchMappingID = actualInstitute.getDistrictBranchMappingID();
        Integer actualDistrictID = actualInstitute.getDistrictID();
        Integer actualInstitutionID = actualInstitute.getInstitutionID();
        String actualInstitutionName = actualInstitute.getInstitutionName();
        Timestamp actualLastModDate = actualInstitute.getLastModDate();
        String actualModifiedBy = actualInstitute.getModifiedBy();
        String actualProcessed = actualInstitute.getProcessed();
        Integer actualProviderServiceMapID = actualInstitute.getProviderServiceMapID();
        Integer actualStateID = actualInstitute.getStateID();

        // Assert that nothing has changed
        assertEquals("Institution Name", actualInstitutionName);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualProcessed);
        assertEquals(1, actualBlockID.intValue());
        assertEquals(1, actualDistrictBranchMappingID.intValue());
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualInstitutionID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualStateID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Institute#Institute(Integer, String)}
     *   <li>{@link Institute#setBlockID(Integer)}
     *   <li>{@link Institute#setCreatedBy(String)}
     *   <li>{@link Institute#setCreatedDate(Timestamp)}
     *   <li>{@link Institute#setDeleted(Boolean)}
     *   <li>{@link Institute#setDistrictBranchMappingID(Integer)}
     *   <li>{@link Institute#setDistrictID(Integer)}
     *   <li>{@link Institute#setInstitutionID(Integer)}
     *   <li>{@link Institute#setInstitutionName(String)}
     *   <li>{@link Institute#setLastModDate(Timestamp)}
     *   <li>{@link Institute#setModifiedBy(String)}
     *   <li>{@link Institute#setProcessed(String)}
     *   <li>{@link Institute#setProviderServiceMapID(Integer)}
     *   <li>{@link Institute#setStateID(Integer)}
     *   <li>{@link Institute#getBlockID()}
     *   <li>{@link Institute#getCreatedBy()}
     *   <li>{@link Institute#getCreatedDate()}
     *   <li>{@link Institute#getDeleted()}
     *   <li>{@link Institute#getDistrictBranchMappingID()}
     *   <li>{@link Institute#getDistrictID()}
     *   <li>{@link Institute#getInstitutionID()}
     *   <li>{@link Institute#getInstitutionName()}
     *   <li>{@link Institute#getLastModDate()}
     *   <li>{@link Institute#getModifiedBy()}
     *   <li>{@link Institute#getProcessed()}
     *   <li>{@link Institute#getProviderServiceMapID()}
     *   <li>{@link Institute#getStateID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        Institute actualInstitute = new Institute(1, "Institution Name");
        actualInstitute.setBlockID(1);
        actualInstitute.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualInstitute.setCreatedDate(createdDate);
        actualInstitute.setDeleted(true);
        actualInstitute.setDistrictBranchMappingID(1);
        actualInstitute.setDistrictID(1);
        actualInstitute.setInstitutionID(1);
        actualInstitute.setInstitutionName("Institution Name");
        Timestamp lastModDate = mock(Timestamp.class);
        actualInstitute.setLastModDate(lastModDate);
        actualInstitute.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualInstitute.setProcessed("Processed");
        actualInstitute.setProviderServiceMapID(1);
        actualInstitute.setStateID(1);
        Integer actualBlockID = actualInstitute.getBlockID();
        String actualCreatedBy = actualInstitute.getCreatedBy();
        Timestamp actualCreatedDate = actualInstitute.getCreatedDate();
        Boolean actualDeleted = actualInstitute.getDeleted();
        Integer actualDistrictBranchMappingID = actualInstitute.getDistrictBranchMappingID();
        Integer actualDistrictID = actualInstitute.getDistrictID();
        Integer actualInstitutionID = actualInstitute.getInstitutionID();
        String actualInstitutionName = actualInstitute.getInstitutionName();
        Timestamp actualLastModDate = actualInstitute.getLastModDate();
        String actualModifiedBy = actualInstitute.getModifiedBy();
        String actualProcessed = actualInstitute.getProcessed();
        Integer actualProviderServiceMapID = actualInstitute.getProviderServiceMapID();
        Integer actualStateID = actualInstitute.getStateID();

        // Assert that nothing has changed
        assertEquals("Institution Name", actualInstitutionName);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualProcessed);
        assertEquals(1, actualBlockID.intValue());
        assertEquals(1, actualDistrictBranchMappingID.intValue());
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualInstitutionID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualStateID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link Institute#Institute(Integer, String, Integer, Integer, Integer, Integer, Boolean, String, String, Timestamp, String, Timestamp, Integer)}
     *   <li>{@link Institute#setBlockID(Integer)}
     *   <li>{@link Institute#setCreatedBy(String)}
     *   <li>{@link Institute#setCreatedDate(Timestamp)}
     *   <li>{@link Institute#setDeleted(Boolean)}
     *   <li>{@link Institute#setDistrictBranchMappingID(Integer)}
     *   <li>{@link Institute#setDistrictID(Integer)}
     *   <li>{@link Institute#setInstitutionID(Integer)}
     *   <li>{@link Institute#setInstitutionName(String)}
     *   <li>{@link Institute#setLastModDate(Timestamp)}
     *   <li>{@link Institute#setModifiedBy(String)}
     *   <li>{@link Institute#setProcessed(String)}
     *   <li>{@link Institute#setProviderServiceMapID(Integer)}
     *   <li>{@link Institute#setStateID(Integer)}
     *   <li>{@link Institute#getBlockID()}
     *   <li>{@link Institute#getCreatedBy()}
     *   <li>{@link Institute#getCreatedDate()}
     *   <li>{@link Institute#getDeleted()}
     *   <li>{@link Institute#getDistrictBranchMappingID()}
     *   <li>{@link Institute#getDistrictID()}
     *   <li>{@link Institute#getInstitutionID()}
     *   <li>{@link Institute#getInstitutionName()}
     *   <li>{@link Institute#getLastModDate()}
     *   <li>{@link Institute#getModifiedBy()}
     *   <li>{@link Institute#getProcessed()}
     *   <li>{@link Institute#getProviderServiceMapID()}
     *   <li>{@link Institute#getStateID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters3() {
        // Arrange and Act
        Institute actualInstitute = new Institute(1, "Institution Name", 1, 1, 1, 1, true, "Processed",
                "Jan 1, 2020 8:00am GMT+0100", mock(Timestamp.class), "Jan 1, 2020 9:00am GMT+0100", mock(Timestamp.class), 1);
        actualInstitute.setBlockID(1);
        actualInstitute.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualInstitute.setCreatedDate(createdDate);
        actualInstitute.setDeleted(true);
        actualInstitute.setDistrictBranchMappingID(1);
        actualInstitute.setDistrictID(1);
        actualInstitute.setInstitutionID(1);
        actualInstitute.setInstitutionName("Institution Name");
        Timestamp lastModDate = mock(Timestamp.class);
        actualInstitute.setLastModDate(lastModDate);
        actualInstitute.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualInstitute.setProcessed("Processed");
        actualInstitute.setProviderServiceMapID(1);
        actualInstitute.setStateID(1);
        Integer actualBlockID = actualInstitute.getBlockID();
        String actualCreatedBy = actualInstitute.getCreatedBy();
        Timestamp actualCreatedDate = actualInstitute.getCreatedDate();
        Boolean actualDeleted = actualInstitute.getDeleted();
        Integer actualDistrictBranchMappingID = actualInstitute.getDistrictBranchMappingID();
        Integer actualDistrictID = actualInstitute.getDistrictID();
        Integer actualInstitutionID = actualInstitute.getInstitutionID();
        String actualInstitutionName = actualInstitute.getInstitutionName();
        Timestamp actualLastModDate = actualInstitute.getLastModDate();
        String actualModifiedBy = actualInstitute.getModifiedBy();
        String actualProcessed = actualInstitute.getProcessed();
        Integer actualProviderServiceMapID = actualInstitute.getProviderServiceMapID();
        Integer actualStateID = actualInstitute.getStateID();

        // Assert that nothing has changed
        assertEquals("Institution Name", actualInstitutionName);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualProcessed);
        assertEquals(1, actualBlockID.intValue());
        assertEquals(1, actualDistrictBranchMappingID.intValue());
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualInstitutionID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualStateID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
