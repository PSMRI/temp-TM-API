package com.iemr.tm.data.location;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

class ZoneMasterDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ZoneMaster#ZoneMaster()}
     *   <li>{@link ZoneMaster#setCountryID(Integer)}
     *   <li>{@link ZoneMaster#setCreatedBy(String)}
     *   <li>{@link ZoneMaster#setCreatedDate(Timestamp)}
     *   <li>{@link ZoneMaster#setDeleted(Boolean)}
     *   <li>{@link ZoneMaster#setDistrictBlockID(Integer)}
     *   <li>{@link ZoneMaster#setDistrictBranchID(Integer)}
     *   <li>{@link ZoneMaster#setDistrictID(Integer)}
     *   <li>{@link ZoneMaster#setLastModDate(Timestamp)}
     *   <li>{@link ZoneMaster#setModifiedBy(String)}
     *   <li>{@link ZoneMaster#setProcessed(String)}
     *   <li>{@link ZoneMaster#setProviderServiceMapID(Integer)}
     *   <li>{@link ZoneMaster#setStateID(Integer)}
     *   <li>{@link ZoneMaster#setZoneDesc(String)}
     *   <li>{@link ZoneMaster#setZoneHQAddress(String)}
     *   <li>{@link ZoneMaster#setZoneID(Integer)}
     *   <li>{@link ZoneMaster#setZoneName(String)}
     *   <li>{@link ZoneMaster#getCountryID()}
     *   <li>{@link ZoneMaster#getCreatedBy()}
     *   <li>{@link ZoneMaster#getCreatedDate()}
     *   <li>{@link ZoneMaster#getDeleted()}
     *   <li>{@link ZoneMaster#getDistrictBlockID()}
     *   <li>{@link ZoneMaster#getDistrictBranchID()}
     *   <li>{@link ZoneMaster#getDistrictID()}
     *   <li>{@link ZoneMaster#getLastModDate()}
     *   <li>{@link ZoneMaster#getModifiedBy()}
     *   <li>{@link ZoneMaster#getProcessed()}
     *   <li>{@link ZoneMaster#getProviderServiceMapID()}
     *   <li>{@link ZoneMaster#getStateID()}
     *   <li>{@link ZoneMaster#getZoneDesc()}
     *   <li>{@link ZoneMaster#getZoneHQAddress()}
     *   <li>{@link ZoneMaster#getZoneID()}
     *   <li>{@link ZoneMaster#getZoneName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        ZoneMaster actualZoneMaster = new ZoneMaster();
        actualZoneMaster.setCountryID(1);
        actualZoneMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualZoneMaster.setCreatedDate(createdDate);
        actualZoneMaster.setDeleted(true);
        actualZoneMaster.setDistrictBlockID(1);
        actualZoneMaster.setDistrictBranchID(1);
        actualZoneMaster.setDistrictID(1);
        Timestamp lastModDate = mock(Timestamp.class);
        actualZoneMaster.setLastModDate(lastModDate);
        actualZoneMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualZoneMaster.setProcessed("Processed");
        actualZoneMaster.setProviderServiceMapID(1);
        actualZoneMaster.setStateID(1);
        actualZoneMaster.setZoneDesc("Zone Desc");
        actualZoneMaster.setZoneHQAddress("42 Main St");
        actualZoneMaster.setZoneID(1);
        actualZoneMaster.setZoneName("Zone Name");
        Integer actualCountryID = actualZoneMaster.getCountryID();
        String actualCreatedBy = actualZoneMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualZoneMaster.getCreatedDate();
        Boolean actualDeleted = actualZoneMaster.getDeleted();
        Integer actualDistrictBlockID = actualZoneMaster.getDistrictBlockID();
        Integer actualDistrictBranchID = actualZoneMaster.getDistrictBranchID();
        Integer actualDistrictID = actualZoneMaster.getDistrictID();
        Timestamp actualLastModDate = actualZoneMaster.getLastModDate();
        String actualModifiedBy = actualZoneMaster.getModifiedBy();
        String actualProcessed = actualZoneMaster.getProcessed();
        Integer actualProviderServiceMapID = actualZoneMaster.getProviderServiceMapID();
        Integer actualStateID = actualZoneMaster.getStateID();
        String actualZoneDesc = actualZoneMaster.getZoneDesc();
        String actualZoneHQAddress = actualZoneMaster.getZoneHQAddress();
        Integer actualZoneID = actualZoneMaster.getZoneID();

        // Assert that nothing has changed
        assertEquals("42 Main St", actualZoneHQAddress);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualProcessed);
        assertEquals("Zone Desc", actualZoneDesc);
        assertEquals("Zone Name", actualZoneMaster.getZoneName());
        assertEquals(1, actualCountryID.intValue());
        assertEquals(1, actualDistrictBlockID.intValue());
        assertEquals(1, actualDistrictBranchID.intValue());
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualStateID.intValue());
        assertEquals(1, actualZoneID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ZoneMaster#ZoneMaster(Integer, String)}
     *   <li>{@link ZoneMaster#setCountryID(Integer)}
     *   <li>{@link ZoneMaster#setCreatedBy(String)}
     *   <li>{@link ZoneMaster#setCreatedDate(Timestamp)}
     *   <li>{@link ZoneMaster#setDeleted(Boolean)}
     *   <li>{@link ZoneMaster#setDistrictBlockID(Integer)}
     *   <li>{@link ZoneMaster#setDistrictBranchID(Integer)}
     *   <li>{@link ZoneMaster#setDistrictID(Integer)}
     *   <li>{@link ZoneMaster#setLastModDate(Timestamp)}
     *   <li>{@link ZoneMaster#setModifiedBy(String)}
     *   <li>{@link ZoneMaster#setProcessed(String)}
     *   <li>{@link ZoneMaster#setProviderServiceMapID(Integer)}
     *   <li>{@link ZoneMaster#setStateID(Integer)}
     *   <li>{@link ZoneMaster#setZoneDesc(String)}
     *   <li>{@link ZoneMaster#setZoneHQAddress(String)}
     *   <li>{@link ZoneMaster#setZoneID(Integer)}
     *   <li>{@link ZoneMaster#setZoneName(String)}
     *   <li>{@link ZoneMaster#getCountryID()}
     *   <li>{@link ZoneMaster#getCreatedBy()}
     *   <li>{@link ZoneMaster#getCreatedDate()}
     *   <li>{@link ZoneMaster#getDeleted()}
     *   <li>{@link ZoneMaster#getDistrictBlockID()}
     *   <li>{@link ZoneMaster#getDistrictBranchID()}
     *   <li>{@link ZoneMaster#getDistrictID()}
     *   <li>{@link ZoneMaster#getLastModDate()}
     *   <li>{@link ZoneMaster#getModifiedBy()}
     *   <li>{@link ZoneMaster#getProcessed()}
     *   <li>{@link ZoneMaster#getProviderServiceMapID()}
     *   <li>{@link ZoneMaster#getStateID()}
     *   <li>{@link ZoneMaster#getZoneDesc()}
     *   <li>{@link ZoneMaster#getZoneHQAddress()}
     *   <li>{@link ZoneMaster#getZoneID()}
     *   <li>{@link ZoneMaster#getZoneName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        ZoneMaster actualZoneMaster = new ZoneMaster(1, "Zone Name");
        actualZoneMaster.setCountryID(1);
        actualZoneMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualZoneMaster.setCreatedDate(createdDate);
        actualZoneMaster.setDeleted(true);
        actualZoneMaster.setDistrictBlockID(1);
        actualZoneMaster.setDistrictBranchID(1);
        actualZoneMaster.setDistrictID(1);
        Timestamp lastModDate = mock(Timestamp.class);
        actualZoneMaster.setLastModDate(lastModDate);
        actualZoneMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualZoneMaster.setProcessed("Processed");
        actualZoneMaster.setProviderServiceMapID(1);
        actualZoneMaster.setStateID(1);
        actualZoneMaster.setZoneDesc("Zone Desc");
        actualZoneMaster.setZoneHQAddress("42 Main St");
        actualZoneMaster.setZoneID(1);
        actualZoneMaster.setZoneName("Zone Name");
        Integer actualCountryID = actualZoneMaster.getCountryID();
        String actualCreatedBy = actualZoneMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualZoneMaster.getCreatedDate();
        Boolean actualDeleted = actualZoneMaster.getDeleted();
        Integer actualDistrictBlockID = actualZoneMaster.getDistrictBlockID();
        Integer actualDistrictBranchID = actualZoneMaster.getDistrictBranchID();
        Integer actualDistrictID = actualZoneMaster.getDistrictID();
        Timestamp actualLastModDate = actualZoneMaster.getLastModDate();
        String actualModifiedBy = actualZoneMaster.getModifiedBy();
        String actualProcessed = actualZoneMaster.getProcessed();
        Integer actualProviderServiceMapID = actualZoneMaster.getProviderServiceMapID();
        Integer actualStateID = actualZoneMaster.getStateID();
        String actualZoneDesc = actualZoneMaster.getZoneDesc();
        String actualZoneHQAddress = actualZoneMaster.getZoneHQAddress();
        Integer actualZoneID = actualZoneMaster.getZoneID();

        // Assert that nothing has changed
        assertEquals("42 Main St", actualZoneHQAddress);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualProcessed);
        assertEquals("Zone Desc", actualZoneDesc);
        assertEquals("Zone Name", actualZoneMaster.getZoneName());
        assertEquals(1, actualCountryID.intValue());
        assertEquals(1, actualDistrictBlockID.intValue());
        assertEquals(1, actualDistrictBranchID.intValue());
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualStateID.intValue());
        assertEquals(1, actualZoneID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link ZoneMaster#ZoneMaster(Integer, String, String, Integer, Integer, Integer, Integer, Integer, Integer, String, Boolean, String, String, Timestamp, String, Timestamp)}
     *   <li>{@link ZoneMaster#setCountryID(Integer)}
     *   <li>{@link ZoneMaster#setCreatedBy(String)}
     *   <li>{@link ZoneMaster#setCreatedDate(Timestamp)}
     *   <li>{@link ZoneMaster#setDeleted(Boolean)}
     *   <li>{@link ZoneMaster#setDistrictBlockID(Integer)}
     *   <li>{@link ZoneMaster#setDistrictBranchID(Integer)}
     *   <li>{@link ZoneMaster#setDistrictID(Integer)}
     *   <li>{@link ZoneMaster#setLastModDate(Timestamp)}
     *   <li>{@link ZoneMaster#setModifiedBy(String)}
     *   <li>{@link ZoneMaster#setProcessed(String)}
     *   <li>{@link ZoneMaster#setProviderServiceMapID(Integer)}
     *   <li>{@link ZoneMaster#setStateID(Integer)}
     *   <li>{@link ZoneMaster#setZoneDesc(String)}
     *   <li>{@link ZoneMaster#setZoneHQAddress(String)}
     *   <li>{@link ZoneMaster#setZoneID(Integer)}
     *   <li>{@link ZoneMaster#setZoneName(String)}
     *   <li>{@link ZoneMaster#getCountryID()}
     *   <li>{@link ZoneMaster#getCreatedBy()}
     *   <li>{@link ZoneMaster#getCreatedDate()}
     *   <li>{@link ZoneMaster#getDeleted()}
     *   <li>{@link ZoneMaster#getDistrictBlockID()}
     *   <li>{@link ZoneMaster#getDistrictBranchID()}
     *   <li>{@link ZoneMaster#getDistrictID()}
     *   <li>{@link ZoneMaster#getLastModDate()}
     *   <li>{@link ZoneMaster#getModifiedBy()}
     *   <li>{@link ZoneMaster#getProcessed()}
     *   <li>{@link ZoneMaster#getProviderServiceMapID()}
     *   <li>{@link ZoneMaster#getStateID()}
     *   <li>{@link ZoneMaster#getZoneDesc()}
     *   <li>{@link ZoneMaster#getZoneHQAddress()}
     *   <li>{@link ZoneMaster#getZoneID()}
     *   <li>{@link ZoneMaster#getZoneName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters3() {
        // Arrange and Act
        ZoneMaster actualZoneMaster = new ZoneMaster(1, "Zone Name", "Zone Desc", 1, 1, 1, 1, 1, 1, "42 Main St", true,
                "Processed", "Jan 1, 2020 8:00am GMT+0100", mock(Timestamp.class), "Jan 1, 2020 9:00am GMT+0100",
                mock(Timestamp.class));
        actualZoneMaster.setCountryID(1);
        actualZoneMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualZoneMaster.setCreatedDate(createdDate);
        actualZoneMaster.setDeleted(true);
        actualZoneMaster.setDistrictBlockID(1);
        actualZoneMaster.setDistrictBranchID(1);
        actualZoneMaster.setDistrictID(1);
        Timestamp lastModDate = mock(Timestamp.class);
        actualZoneMaster.setLastModDate(lastModDate);
        actualZoneMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualZoneMaster.setProcessed("Processed");
        actualZoneMaster.setProviderServiceMapID(1);
        actualZoneMaster.setStateID(1);
        actualZoneMaster.setZoneDesc("Zone Desc");
        actualZoneMaster.setZoneHQAddress("42 Main St");
        actualZoneMaster.setZoneID(1);
        actualZoneMaster.setZoneName("Zone Name");
        Integer actualCountryID = actualZoneMaster.getCountryID();
        String actualCreatedBy = actualZoneMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualZoneMaster.getCreatedDate();
        Boolean actualDeleted = actualZoneMaster.getDeleted();
        Integer actualDistrictBlockID = actualZoneMaster.getDistrictBlockID();
        Integer actualDistrictBranchID = actualZoneMaster.getDistrictBranchID();
        Integer actualDistrictID = actualZoneMaster.getDistrictID();
        Timestamp actualLastModDate = actualZoneMaster.getLastModDate();
        String actualModifiedBy = actualZoneMaster.getModifiedBy();
        String actualProcessed = actualZoneMaster.getProcessed();
        Integer actualProviderServiceMapID = actualZoneMaster.getProviderServiceMapID();
        Integer actualStateID = actualZoneMaster.getStateID();
        String actualZoneDesc = actualZoneMaster.getZoneDesc();
        String actualZoneHQAddress = actualZoneMaster.getZoneHQAddress();
        Integer actualZoneID = actualZoneMaster.getZoneID();

        // Assert that nothing has changed
        assertEquals("42 Main St", actualZoneHQAddress);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualProcessed);
        assertEquals("Zone Desc", actualZoneDesc);
        assertEquals("Zone Name", actualZoneMaster.getZoneName());
        assertEquals(1, actualCountryID.intValue());
        assertEquals(1, actualDistrictBlockID.intValue());
        assertEquals(1, actualDistrictBranchID.intValue());
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualStateID.intValue());
        assertEquals(1, actualZoneID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
