package com.iemr.tm.data.login;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import com.iemr.tm.data.location.Country;
import com.iemr.tm.data.location.DistrictBlock;
import com.iemr.tm.data.location.DistrictBranchMapping;
import com.iemr.tm.data.location.Districts;
import com.iemr.tm.data.location.States;
import com.iemr.tm.repo.location.ZoneDistrictMapping;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

class ParkingPlaceDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ParkingPlace#setAreaHQAddress(String)}
     *   <li>{@link ParkingPlace#setBlockName(String)}
     *   <li>{@link ParkingPlace#setCountryID(Integer)}
     *   <li>{@link ParkingPlace#setCountryName(String)}
     *   <li>{@link ParkingPlace#setCreatedBy(String)}
     *   <li>{@link ParkingPlace#setCreatedDate(Date)}
     *   <li>{@link ParkingPlace#setDeleted(Boolean)}
     *   <li>{@link ParkingPlace#setDistrictBlock(DistrictBlock)}
     *   <li>{@link ParkingPlace#setDistrictBlockID(Integer)}
     *   <li>{@link ParkingPlace#setDistrictBranchID(Integer)}
     *   <li>{@link ParkingPlace#setDistrictBranchMapping(DistrictBranchMapping)}
     *   <li>{@link ParkingPlace#setDistrictID(Integer)}
     *   <li>{@link ParkingPlace#setDistrictName(String)}
     *   <li>{@link ParkingPlace#setLastModDate(Date)}
     *   <li>{@link ParkingPlace#setM_country(Country)}
     *   <li>{@link ParkingPlace#setM_district(Districts)}
     *   <li>{@link ParkingPlace#setModifiedBy(String)}
     *   <li>{@link ParkingPlace#setParkingPlaceDesc(String)}
     *   <li>{@link ParkingPlace#setParkingPlaceName(String)}
     *   <li>{@link ParkingPlace#setProcessed(String)}
     *   <li>{@link ParkingPlace#setProviderServiceMapID(Integer)}
     *   <li>{@link ParkingPlace#setState(States)}
     *   <li>{@link ParkingPlace#setStateID(Integer)}
     *   <li>{@link ParkingPlace#setStateName(String)}
     *   <li>{@link ParkingPlace#setVillageName(String)}
     *   <li>{@link ParkingPlace#toString()}
     *   <li>{@link ParkingPlace#getAreaHQAddress()}
     *   <li>{@link ParkingPlace#getBlockName()}
     *   <li>{@link ParkingPlace#getCountryID()}
     *   <li>{@link ParkingPlace#getCountryName()}
     *   <li>{@link ParkingPlace#getCreatedBy()}
     *   <li>{@link ParkingPlace#getCreatedDate()}
     *   <li>{@link ParkingPlace#getDeleted()}
     *   <li>{@link ParkingPlace#getDistrictBlock()}
     *   <li>{@link ParkingPlace#getDistrictBlockID()}
     *   <li>{@link ParkingPlace#getDistrictBranchID()}
     *   <li>{@link ParkingPlace#getDistrictBranchMapping()}
     *   <li>{@link ParkingPlace#getDistrictID()}
     *   <li>{@link ParkingPlace#getDistrictName()}
     *   <li>{@link ParkingPlace#getLastModDate()}
     *   <li>{@link ParkingPlace#getM_country()}
     *   <li>{@link ParkingPlace#getM_district()}
     *   <li>{@link ParkingPlace#getModifiedBy()}
     *   <li>{@link ParkingPlace#getParkingPlaceDesc()}
     *   <li>{@link ParkingPlace#getParkingPlaceID()}
     *   <li>{@link ParkingPlace#getParkingPlaceName()}
     *   <li>{@link ParkingPlace#getProcessed()}
     *   <li>{@link ParkingPlace#getProviderServiceMapID()}
     *   <li>{@link ParkingPlace#getState()}
     *   <li>{@link ParkingPlace#getStateID()}
     *   <li>{@link ParkingPlace#getStateName()}
     *   <li>{@link ParkingPlace#getVillageName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        ParkingPlace parkingPlace = new ParkingPlace();

        // Act
        parkingPlace.setAreaHQAddress("42 Main St");
        parkingPlace.setBlockName("Block Name");
        parkingPlace.setCountryID(1);
        parkingPlace.setCountryName("GB");
        parkingPlace.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Date createdDate = mock(Date.class);
        parkingPlace.setCreatedDate(createdDate);
        parkingPlace.setDeleted(true);
        DistrictBlock districtBlock = new DistrictBlock();
        districtBlock.setBlockID(1);
        districtBlock.setBlockName("Block Name");
        districtBlock.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        districtBlock.setCreatedDate(mock(Timestamp.class));
        districtBlock.setDeleted(true);
        districtBlock.setDistrictID(1);
        districtBlock.setLastModDate(mock(Timestamp.class));
        districtBlock.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        districtBlock.setStateID(1);
        parkingPlace.setDistrictBlock(districtBlock);
        parkingPlace.setDistrictBlockID(1);
        parkingPlace.setDistrictBranchID(1);
        DistrictBranchMapping districtBranchMapping = new DistrictBranchMapping();
        districtBranchMapping.setBlockID(1);
        districtBranchMapping.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        districtBranchMapping.setCreatedDate(mock(Timestamp.class));
        districtBranchMapping.setDeleted(true);
        districtBranchMapping.setDistrictBranchID(1);
        districtBranchMapping.setHabitat("Habitat");
        districtBranchMapping.setLastModDate(mock(Timestamp.class));
        districtBranchMapping.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        districtBranchMapping.setPanchayatName("Panchayat Name");
        districtBranchMapping.setPinCode("Pin Code");
        districtBranchMapping.setVillageName("Village Name");
        parkingPlace.setDistrictBranchMapping(districtBranchMapping);
        parkingPlace.setDistrictID(1);
        parkingPlace.setDistrictName("District Name");
        Date lastModDate = mock(Date.class);
        parkingPlace.setLastModDate(lastModDate);
        Country m_country = new Country();
        parkingPlace.setM_country(m_country);
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
        Districts m_district = new Districts();
        m_district.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        m_district.setCreatedDate(mock(Timestamp.class));
        m_district.setDeleted(true);
        m_district.setDistrictID(1);
        m_district.setDistrictName("District Name");
        m_district.setLastModDate(mock(Timestamp.class));
        m_district.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        m_district.setStateID(1);
        m_district.setStates(states);
        m_district.setZoneDistrictMapping(zoneDistrictMapping);
        parkingPlace.setM_district(m_district);
        parkingPlace.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        parkingPlace.setParkingPlaceDesc("Parking Place Desc");
        parkingPlace.setParkingPlaceName("Parking Place Name");
        parkingPlace.setProcessed("Processed");
        parkingPlace.setProviderServiceMapID(1);
        States state = new States();
        state.setCountryID(1);
        state.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        state.setCreatedDate(mock(Timestamp.class));
        state.setDeleted(true);
        state.setLastModDate(mock(Timestamp.class));
        state.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        state.setStateCode("MD");
        state.setStateID(1);
        state.setStateIName("MD");
        state.setStateName("MD");
        parkingPlace.setState(state);
        parkingPlace.setStateID(1);
        parkingPlace.setStateName("MD");
        parkingPlace.setVillageName("Village Name");
        parkingPlace.toString();
        String actualAreaHQAddress = parkingPlace.getAreaHQAddress();
        String actualBlockName = parkingPlace.getBlockName();
        Integer actualCountryID = parkingPlace.getCountryID();
        String actualCountryName = parkingPlace.getCountryName();
        String actualCreatedBy = parkingPlace.getCreatedBy();
        Date actualCreatedDate = parkingPlace.getCreatedDate();
        Boolean actualDeleted = parkingPlace.getDeleted();
        DistrictBlock actualDistrictBlock = parkingPlace.getDistrictBlock();
        Integer actualDistrictBlockID = parkingPlace.getDistrictBlockID();
        Integer actualDistrictBranchID = parkingPlace.getDistrictBranchID();
        DistrictBranchMapping actualDistrictBranchMapping = parkingPlace.getDistrictBranchMapping();
        Integer actualDistrictID = parkingPlace.getDistrictID();
        String actualDistrictName = parkingPlace.getDistrictName();
        Date actualLastModDate = parkingPlace.getLastModDate();
        Country actualM_country = parkingPlace.getM_country();
        Districts actualM_district = parkingPlace.getM_district();
        String actualModifiedBy = parkingPlace.getModifiedBy();
        String actualParkingPlaceDesc = parkingPlace.getParkingPlaceDesc();
        parkingPlace.getParkingPlaceID();
        String actualParkingPlaceName = parkingPlace.getParkingPlaceName();
        String actualProcessed = parkingPlace.getProcessed();
        Integer actualProviderServiceMapID = parkingPlace.getProviderServiceMapID();
        States actualState = parkingPlace.getState();
        Integer actualStateID = parkingPlace.getStateID();
        String actualStateName = parkingPlace.getStateName();

        // Assert that nothing has changed
        assertEquals("42 Main St", actualAreaHQAddress);
        assertEquals("Block Name", actualBlockName);
        assertEquals("District Name", actualDistrictName);
        assertEquals("GB", actualCountryName);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("MD", actualStateName);
        assertEquals("Parking Place Desc", actualParkingPlaceDesc);
        assertEquals("Parking Place Name", actualParkingPlaceName);
        assertEquals("Processed", actualProcessed);
        assertEquals("Village Name", parkingPlace.getVillageName());
        assertEquals(1, actualCountryID.intValue());
        assertEquals(1, actualDistrictBlockID.intValue());
        assertEquals(1, actualDistrictBranchID.intValue());
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualStateID.intValue());
        assertTrue(actualDeleted);
        assertSame(m_country, actualM_country);
        assertSame(districtBlock, actualDistrictBlock);
        assertSame(districtBranchMapping, actualDistrictBranchMapping);
        assertSame(m_district, actualM_district);
        assertSame(state, actualState);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Method under test: {@link ParkingPlace#ParkingPlace()}
     */
    @Test
    void testNewParkingPlace() {
        // Arrange and Act
        ParkingPlace actualParkingPlace = new ParkingPlace();

        // Assert
        assertNull(actualParkingPlace.getM_country());
        assertNull(actualParkingPlace.getDistrictBlock());
        assertNull(actualParkingPlace.getDistrictBranchMapping());
        assertNull(actualParkingPlace.getM_district());
        assertNull(actualParkingPlace.getState());
        assertNull(actualParkingPlace.getDeleted());
        assertNull(actualParkingPlace.getCountryID());
        assertNull(actualParkingPlace.getDistrictBlockID());
        assertNull(actualParkingPlace.getDistrictBranchID());
        assertNull(actualParkingPlace.getDistrictID());
        assertNull(actualParkingPlace.getParkingPlaceID());
        assertNull(actualParkingPlace.getProviderServiceMapID());
        assertNull(actualParkingPlace.getStateID());
        assertNull(actualParkingPlace.getAreaHQAddress());
        assertNull(actualParkingPlace.getBlockName());
        assertNull(actualParkingPlace.getCountryName());
        assertNull(actualParkingPlace.getCreatedBy());
        assertNull(actualParkingPlace.getDistrictName());
        assertNull(actualParkingPlace.getModifiedBy());
        assertNull(actualParkingPlace.getParkingPlaceDesc());
        assertNull(actualParkingPlace.getParkingPlaceName());
        assertNull(actualParkingPlace.getProcessed());
        assertNull(actualParkingPlace.getStateName());
        assertNull(actualParkingPlace.getVillageName());
        assertNull(actualParkingPlace.getCreatedDate());
        assertNull(actualParkingPlace.getLastModDate());
    }

    /**
     * Method under test: {@link ParkingPlace#ParkingPlace(Integer, String)}
     */
    @Test
    void testNewParkingPlace2() {
        // Arrange and Act
        ParkingPlace actualParkingPlace = new ParkingPlace(1, "Parking Place Name");

        // Assert
        assertEquals("Parking Place Name", actualParkingPlace.getParkingPlaceName());
        assertEquals(1, actualParkingPlace.getParkingPlaceID().intValue());
    }
}
