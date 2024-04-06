package com.iemr.tm.data.location;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import com.iemr.tm.repo.location.ZoneDistrictMapping;

import java.sql.Timestamp;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

class DistrictsDiffblueTest {
    /**
     * Method under test: {@link Districts#setDeleted(boolean)}
     */
    @Test
    void testSetDeleted() {
        // Arrange
        Districts districts = new Districts();

        // Act
        districts.setDeleted(true);

        // Assert
        assertTrue(districts.getDeleted());
    }

    /**
     * Method under test: {@link Districts#setDeleted(boolean)}
     */
    @Test
    void testSetDeleted2() {
        // Arrange
        States states = new States();
        states.setCountryID(1);
        states.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        states.setCreatedDate(mock(Timestamp.class));
        states.setDeleted(true);
        states.setLastModDate(mock(Timestamp.class));
        states.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        states.setStateCode("MD");
        states.setStateID(1);
        states.setStateIName("MD");
        states.setStateName("MD");

        ZoneDistrictMapping zoneDistrictMapping = new ZoneDistrictMapping();
        zoneDistrictMapping.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        zoneDistrictMapping.setCreatedDate(mock(Timestamp.class));
        zoneDistrictMapping.setDeleted(true);
        zoneDistrictMapping.setDistrictID(1);
        zoneDistrictMapping.setDistrictsSet(new HashSet<>());
        zoneDistrictMapping.setLastModDate(mock(Timestamp.class));
        zoneDistrictMapping.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        zoneDistrictMapping.setProcessed("Processed");
        zoneDistrictMapping.setProviderServiceMapID(1);
        zoneDistrictMapping.setZoneDistrictMapID(1);
        zoneDistrictMapping.setZoneID(1);

        Districts districts = new Districts();
        districts.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        districts.setCreatedDate(mock(Timestamp.class));
        districts.setDeleted(true);
        districts.setDistrictID(1);
        districts.setDistrictName("District Name");
        districts.setLastModDate(mock(Timestamp.class));
        districts.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        districts.setStateID(1);
        districts.setStates(states);
        districts.setZoneDistrictMapping(zoneDistrictMapping);

        // Act
        districts.setDeleted(true);

        // Assert
        assertTrue(districts.getDeleted());
    }

    /**
     * Method under test: {@link Districts#setDistrictID(int)}
     */
    @Test
    void testSetDistrictID() {
        // Arrange
        Districts districts = new Districts();

        // Act
        districts.setDistrictID(1);

        // Assert
        assertEquals(1, districts.getDistrictID());
    }

    /**
     * Method under test: {@link Districts#setDistrictID(int)}
     */
    @Test
    void testSetDistrictID2() {
        // Arrange
        States states = new States();
        states.setCountryID(1);
        states.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        states.setCreatedDate(mock(Timestamp.class));
        states.setDeleted(true);
        states.setLastModDate(mock(Timestamp.class));
        states.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        states.setStateCode("MD");
        states.setStateID(1);
        states.setStateIName("MD");
        states.setStateName("MD");

        ZoneDistrictMapping zoneDistrictMapping = new ZoneDistrictMapping();
        zoneDistrictMapping.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        zoneDistrictMapping.setCreatedDate(mock(Timestamp.class));
        zoneDistrictMapping.setDeleted(true);
        zoneDistrictMapping.setDistrictID(1);
        zoneDistrictMapping.setDistrictsSet(new HashSet<>());
        zoneDistrictMapping.setLastModDate(mock(Timestamp.class));
        zoneDistrictMapping.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        zoneDistrictMapping.setProcessed("Processed");
        zoneDistrictMapping.setProviderServiceMapID(1);
        zoneDistrictMapping.setZoneDistrictMapID(1);
        zoneDistrictMapping.setZoneID(1);

        Districts districts = new Districts();
        districts.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        districts.setCreatedDate(mock(Timestamp.class));
        districts.setDeleted(true);
        districts.setDistrictID(1);
        districts.setDistrictName("District Name");
        districts.setLastModDate(mock(Timestamp.class));
        districts.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        districts.setStateID(1);
        districts.setStates(states);
        districts.setZoneDistrictMapping(zoneDistrictMapping);

        // Act
        districts.setDistrictID(1);

        // Assert
        assertEquals(1, districts.getDistrictID());
    }

    /**
     * Method under test: {@link Districts#getDistrictID()}
     */
    @Test
    void testGetDistrictID() {
        // Arrange
        States states = new States();
        states.setCountryID(1);
        states.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        states.setCreatedDate(mock(Timestamp.class));
        states.setDeleted(true);
        states.setLastModDate(mock(Timestamp.class));
        states.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        states.setStateCode("MD");
        states.setStateID(1);
        states.setStateIName("MD");
        states.setStateName("MD");

        ZoneDistrictMapping zoneDistrictMapping = new ZoneDistrictMapping();
        zoneDistrictMapping.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        zoneDistrictMapping.setCreatedDate(mock(Timestamp.class));
        zoneDistrictMapping.setDeleted(true);
        zoneDistrictMapping.setDistrictID(1);
        zoneDistrictMapping.setDistrictsSet(new HashSet<>());
        zoneDistrictMapping.setLastModDate(mock(Timestamp.class));
        zoneDistrictMapping.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        zoneDistrictMapping.setProcessed("Processed");
        zoneDistrictMapping.setProviderServiceMapID(1);
        zoneDistrictMapping.setZoneDistrictMapID(1);
        zoneDistrictMapping.setZoneID(1);

        Districts districts = new Districts();
        districts.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        districts.setCreatedDate(mock(Timestamp.class));
        districts.setDeleted(true);
        districts.setDistrictID(1);
        districts.setDistrictName("District Name");
        districts.setLastModDate(mock(Timestamp.class));
        districts.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        districts.setStateID(1);
        districts.setStates(states);
        districts.setZoneDistrictMapping(zoneDistrictMapping);

        // Act and Assert
        assertEquals(1, districts.getDistrictID());
    }

    /**
     * Method under test: {@link Districts#isDeleted()}
     */
    @Test
    void testIsDeleted() {
        // Arrange
        States states = new States();
        states.setCountryID(1);
        states.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        states.setCreatedDate(mock(Timestamp.class));
        states.setDeleted(true);
        states.setLastModDate(mock(Timestamp.class));
        states.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        states.setStateCode("MD");
        states.setStateID(1);
        states.setStateIName("MD");
        states.setStateName("MD");

        ZoneDistrictMapping zoneDistrictMapping = new ZoneDistrictMapping();
        zoneDistrictMapping.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        zoneDistrictMapping.setCreatedDate(mock(Timestamp.class));
        zoneDistrictMapping.setDeleted(true);
        zoneDistrictMapping.setDistrictID(1);
        zoneDistrictMapping.setDistrictsSet(new HashSet<>());
        zoneDistrictMapping.setLastModDate(mock(Timestamp.class));
        zoneDistrictMapping.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        zoneDistrictMapping.setProcessed("Processed");
        zoneDistrictMapping.setProviderServiceMapID(1);
        zoneDistrictMapping.setZoneDistrictMapID(1);
        zoneDistrictMapping.setZoneID(1);

        Districts districts = new Districts();
        districts.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        districts.setCreatedDate(mock(Timestamp.class));
        districts.setDeleted(true);
        districts.setDistrictID(1);
        districts.setDistrictName("District Name");
        districts.setLastModDate(mock(Timestamp.class));
        districts.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        districts.setStateID(1);
        districts.setStates(states);
        districts.setZoneDistrictMapping(zoneDistrictMapping);

        // Act and Assert
        assertTrue(districts.isDeleted());
    }

    /**
     * Method under test: {@link Districts#isDeleted()}
     */
    @Test
    void testIsDeleted2() {
        // Arrange
        States states = new States();
        states.setCountryID(1);
        states.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        states.setCreatedDate(mock(Timestamp.class));
        states.setDeleted(true);
        states.setLastModDate(mock(Timestamp.class));
        states.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        states.setStateCode("MD");
        states.setStateID(1);
        states.setStateIName("MD");
        states.setStateName("MD");

        ZoneDistrictMapping zoneDistrictMapping = new ZoneDistrictMapping();
        zoneDistrictMapping.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        zoneDistrictMapping.setCreatedDate(mock(Timestamp.class));
        zoneDistrictMapping.setDeleted(true);
        zoneDistrictMapping.setDistrictID(1);
        zoneDistrictMapping.setDistrictsSet(new HashSet<>());
        zoneDistrictMapping.setLastModDate(mock(Timestamp.class));
        zoneDistrictMapping.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        zoneDistrictMapping.setProcessed("Processed");
        zoneDistrictMapping.setProviderServiceMapID(1);
        zoneDistrictMapping.setZoneDistrictMapID(1);
        zoneDistrictMapping.setZoneID(1);

        Districts districts = new Districts();
        districts.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        districts.setCreatedDate(mock(Timestamp.class));
        districts.setDeleted(false);
        districts.setDistrictID(1);
        districts.setDistrictName("District Name");
        districts.setLastModDate(mock(Timestamp.class));
        districts.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        districts.setStateID(1);
        districts.setStates(states);
        districts.setZoneDistrictMapping(zoneDistrictMapping);

        // Act and Assert
        assertFalse(districts.isDeleted());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Districts#Districts()}
     *   <li>{@link Districts#setCreatedBy(String)}
     *   <li>{@link Districts#setCreatedDate(Timestamp)}
     *   <li>{@link Districts#setDeleted(Boolean)}
     *   <li>{@link Districts#setDistrictID(Integer)}
     *   <li>{@link Districts#setDistrictName(String)}
     *   <li>{@link Districts#setLastModDate(Timestamp)}
     *   <li>{@link Districts#setModifiedBy(String)}
     *   <li>{@link Districts#setStateID(Integer)}
     *   <li>{@link Districts#setStates(States)}
     *   <li>{@link Districts#setZoneDistrictMapping(ZoneDistrictMapping)}
     *   <li>{@link Districts#getCreatedBy()}
     *   <li>{@link Districts#getCreatedDate()}
     *   <li>{@link Districts#getDeleted()}
     *   <li>{@link Districts#getDistrictName()}
     *   <li>{@link Districts#getLastModDate()}
     *   <li>{@link Districts#getModifiedBy()}
     *   <li>{@link Districts#getStateID()}
     *   <li>{@link Districts#getStates()}
     *   <li>{@link Districts#getZoneDistrictMapping()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        Districts actualDistricts = new Districts();
        actualDistricts.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualDistricts.setCreatedDate(createdDate);
        actualDistricts.setDeleted((Boolean) true);
        actualDistricts.setDistrictID((Integer) 1);
        actualDistricts.setDistrictName("District Name");
        Timestamp lastModDate = mock(Timestamp.class);
        actualDistricts.setLastModDate(lastModDate);
        actualDistricts.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualDistricts.setStateID(1);
        States states = new States();
        states.setCountryID(1);
        states.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        states.setCreatedDate(mock(Timestamp.class));
        states.setDeleted(true);
        states.setLastModDate(mock(Timestamp.class));
        states.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        states.setStateCode("MD");
        states.setStateID(1);
        states.setStateIName("MD");
        states.setStateName("MD");
        actualDistricts.setStates(states);
        ZoneDistrictMapping zoneDistrictMapping = new ZoneDistrictMapping();
        zoneDistrictMapping.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        zoneDistrictMapping.setCreatedDate(mock(Timestamp.class));
        zoneDistrictMapping.setDeleted(true);
        zoneDistrictMapping.setDistrictID(1);
        zoneDistrictMapping.setDistrictsSet(new HashSet<>());
        zoneDistrictMapping.setLastModDate(mock(Timestamp.class));
        zoneDistrictMapping.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        zoneDistrictMapping.setProcessed("Processed");
        zoneDistrictMapping.setProviderServiceMapID(1);
        zoneDistrictMapping.setZoneDistrictMapID(1);
        zoneDistrictMapping.setZoneID(1);
        actualDistricts.setZoneDistrictMapping(zoneDistrictMapping);
        String actualCreatedBy = actualDistricts.getCreatedBy();
        Timestamp actualCreatedDate = actualDistricts.getCreatedDate();
        Boolean actualDeleted = actualDistricts.getDeleted();
        String actualDistrictName = actualDistricts.getDistrictName();
        Timestamp actualLastModDate = actualDistricts.getLastModDate();
        String actualModifiedBy = actualDistricts.getModifiedBy();
        Integer actualStateID = actualDistricts.getStateID();
        States actualStates = actualDistricts.getStates();
        ZoneDistrictMapping actualZoneDistrictMapping = actualDistricts.getZoneDistrictMapping();

        // Assert that nothing has changed
        assertEquals("District Name", actualDistrictName);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals(1, actualStateID.intValue());
        assertTrue(actualDeleted);
        assertSame(states, actualStates);
        assertSame(zoneDistrictMapping, actualZoneDistrictMapping);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link Districts#Districts(Integer, Integer, String, Boolean, String, Timestamp, String, Timestamp, States, ZoneDistrictMapping)}
     *   <li>{@link Districts#setCreatedBy(String)}
     *   <li>{@link Districts#setCreatedDate(Timestamp)}
     *   <li>{@link Districts#setDeleted(Boolean)}
     *   <li>{@link Districts#setDistrictID(Integer)}
     *   <li>{@link Districts#setDistrictName(String)}
     *   <li>{@link Districts#setLastModDate(Timestamp)}
     *   <li>{@link Districts#setModifiedBy(String)}
     *   <li>{@link Districts#setStateID(Integer)}
     *   <li>{@link Districts#setStates(States)}
     *   <li>{@link Districts#setZoneDistrictMapping(ZoneDistrictMapping)}
     *   <li>{@link Districts#getCreatedBy()}
     *   <li>{@link Districts#getCreatedDate()}
     *   <li>{@link Districts#getDeleted()}
     *   <li>{@link Districts#getDistrictName()}
     *   <li>{@link Districts#getLastModDate()}
     *   <li>{@link Districts#getModifiedBy()}
     *   <li>{@link Districts#getStateID()}
     *   <li>{@link Districts#getStates()}
     *   <li>{@link Districts#getZoneDistrictMapping()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange
        Timestamp createdDate = mock(Timestamp.class);
        Timestamp lastModDate = mock(Timestamp.class);

        States states = new States();
        states.setCountryID(1);
        states.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        states.setCreatedDate(mock(Timestamp.class));
        states.setDeleted(true);
        states.setLastModDate(mock(Timestamp.class));
        states.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        states.setStateCode("MD");
        states.setStateID(1);
        states.setStateIName("MD");
        states.setStateName("MD");

        ZoneDistrictMapping zoneDistrictMapping = new ZoneDistrictMapping();
        zoneDistrictMapping.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        zoneDistrictMapping.setCreatedDate(mock(Timestamp.class));
        zoneDistrictMapping.setDeleted(true);
        zoneDistrictMapping.setDistrictID(1);
        zoneDistrictMapping.setDistrictsSet(new HashSet<>());
        zoneDistrictMapping.setLastModDate(mock(Timestamp.class));
        zoneDistrictMapping.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        zoneDistrictMapping.setProcessed("Processed");
        zoneDistrictMapping.setProviderServiceMapID(1);
        zoneDistrictMapping.setZoneDistrictMapID(1);
        zoneDistrictMapping.setZoneID(1);

        // Act
        Districts actualDistricts = new Districts(1, 1, "District Name", true, "Jan 1, 2020 8:00am GMT+0100", createdDate,
                "Jan 1, 2020 9:00am GMT+0100", lastModDate, states, zoneDistrictMapping);
        actualDistricts.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate2 = mock(Timestamp.class);
        actualDistricts.setCreatedDate(createdDate2);
        actualDistricts.setDeleted((Boolean) true);
        actualDistricts.setDistrictID((Integer) 1);
        actualDistricts.setDistrictName("District Name");
        Timestamp lastModDate2 = mock(Timestamp.class);
        actualDistricts.setLastModDate(lastModDate2);
        actualDistricts.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualDistricts.setStateID(1);
        States states2 = new States();
        states2.setCountryID(1);
        states2.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        states2.setCreatedDate(mock(Timestamp.class));
        states2.setDeleted(true);
        states2.setLastModDate(mock(Timestamp.class));
        states2.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        states2.setStateCode("MD");
        states2.setStateID(1);
        states2.setStateIName("MD");
        states2.setStateName("MD");
        actualDistricts.setStates(states2);
        ZoneDistrictMapping zoneDistrictMapping2 = new ZoneDistrictMapping();
        zoneDistrictMapping2.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        zoneDistrictMapping2.setCreatedDate(mock(Timestamp.class));
        zoneDistrictMapping2.setDeleted(true);
        zoneDistrictMapping2.setDistrictID(1);
        zoneDistrictMapping2.setDistrictsSet(new HashSet<>());
        zoneDistrictMapping2.setLastModDate(mock(Timestamp.class));
        zoneDistrictMapping2.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        zoneDistrictMapping2.setProcessed("Processed");
        zoneDistrictMapping2.setProviderServiceMapID(1);
        zoneDistrictMapping2.setZoneDistrictMapID(1);
        zoneDistrictMapping2.setZoneID(1);
        actualDistricts.setZoneDistrictMapping(zoneDistrictMapping2);
        String actualCreatedBy = actualDistricts.getCreatedBy();
        Timestamp actualCreatedDate = actualDistricts.getCreatedDate();
        Boolean actualDeleted = actualDistricts.getDeleted();
        String actualDistrictName = actualDistricts.getDistrictName();
        Timestamp actualLastModDate = actualDistricts.getLastModDate();
        String actualModifiedBy = actualDistricts.getModifiedBy();
        Integer actualStateID = actualDistricts.getStateID();
        States actualStates = actualDistricts.getStates();
        ZoneDistrictMapping actualZoneDistrictMapping = actualDistricts.getZoneDistrictMapping();

        // Assert that nothing has changed
        assertEquals("District Name", actualDistrictName);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals(1, actualStateID.intValue());
        assertTrue(actualDeleted);
        assertSame(states2, actualStates);
        assertSame(zoneDistrictMapping2, actualZoneDistrictMapping);
        assertSame(createdDate2, actualCreatedDate);
        assertSame(lastModDate2, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Districts#Districts(Integer, String)}
     *   <li>{@link Districts#setCreatedBy(String)}
     *   <li>{@link Districts#setCreatedDate(Timestamp)}
     *   <li>{@link Districts#setDeleted(Boolean)}
     *   <li>{@link Districts#setDistrictID(Integer)}
     *   <li>{@link Districts#setDistrictName(String)}
     *   <li>{@link Districts#setLastModDate(Timestamp)}
     *   <li>{@link Districts#setModifiedBy(String)}
     *   <li>{@link Districts#setStateID(Integer)}
     *   <li>{@link Districts#setStates(States)}
     *   <li>{@link Districts#setZoneDistrictMapping(ZoneDistrictMapping)}
     *   <li>{@link Districts#getCreatedBy()}
     *   <li>{@link Districts#getCreatedDate()}
     *   <li>{@link Districts#getDeleted()}
     *   <li>{@link Districts#getDistrictName()}
     *   <li>{@link Districts#getLastModDate()}
     *   <li>{@link Districts#getModifiedBy()}
     *   <li>{@link Districts#getStateID()}
     *   <li>{@link Districts#getStates()}
     *   <li>{@link Districts#getZoneDistrictMapping()}
     * </ul>
     */
    @Test
    void testGettersAndSetters3() {
        // Arrange and Act
        Districts actualDistricts = new Districts(1, "District Name");
        actualDistricts.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualDistricts.setCreatedDate(createdDate);
        actualDistricts.setDeleted((Boolean) true);
        actualDistricts.setDistrictID((Integer) 1);
        actualDistricts.setDistrictName("District Name");
        Timestamp lastModDate = mock(Timestamp.class);
        actualDistricts.setLastModDate(lastModDate);
        actualDistricts.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualDistricts.setStateID(1);
        States states = new States();
        states.setCountryID(1);
        states.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        states.setCreatedDate(mock(Timestamp.class));
        states.setDeleted(true);
        states.setLastModDate(mock(Timestamp.class));
        states.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        states.setStateCode("MD");
        states.setStateID(1);
        states.setStateIName("MD");
        states.setStateName("MD");
        actualDistricts.setStates(states);
        ZoneDistrictMapping zoneDistrictMapping = new ZoneDistrictMapping();
        zoneDistrictMapping.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        zoneDistrictMapping.setCreatedDate(mock(Timestamp.class));
        zoneDistrictMapping.setDeleted(true);
        zoneDistrictMapping.setDistrictID(1);
        zoneDistrictMapping.setDistrictsSet(new HashSet<>());
        zoneDistrictMapping.setLastModDate(mock(Timestamp.class));
        zoneDistrictMapping.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        zoneDistrictMapping.setProcessed("Processed");
        zoneDistrictMapping.setProviderServiceMapID(1);
        zoneDistrictMapping.setZoneDistrictMapID(1);
        zoneDistrictMapping.setZoneID(1);
        actualDistricts.setZoneDistrictMapping(zoneDistrictMapping);
        String actualCreatedBy = actualDistricts.getCreatedBy();
        Timestamp actualCreatedDate = actualDistricts.getCreatedDate();
        Boolean actualDeleted = actualDistricts.getDeleted();
        String actualDistrictName = actualDistricts.getDistrictName();
        Timestamp actualLastModDate = actualDistricts.getLastModDate();
        String actualModifiedBy = actualDistricts.getModifiedBy();
        Integer actualStateID = actualDistricts.getStateID();
        States actualStates = actualDistricts.getStates();
        ZoneDistrictMapping actualZoneDistrictMapping = actualDistricts.getZoneDistrictMapping();

        // Assert that nothing has changed
        assertEquals("District Name", actualDistrictName);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals(1, actualStateID.intValue());
        assertTrue(actualDeleted);
        assertSame(states, actualStates);
        assertSame(zoneDistrictMapping, actualZoneDistrictMapping);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Method under test:
     * {@link Districts#Districts(Integer, String, Integer, String)}
     */
    @Test
    void testNewDistricts() {
        // Arrange and Act
        Districts actualDistricts = new Districts(1, "District Name", 1, "MD");

        // Assert
        assertEquals("District Name", actualDistricts.getDistrictName());
        States states = actualDistricts.getStates();
        assertEquals("MD", states.getStateIName());
        assertNull(states.getCreatedBy());
        assertEquals(1, actualDistricts.getDistrictID());
        assertEquals(1, states.getStateID());
    }
}
