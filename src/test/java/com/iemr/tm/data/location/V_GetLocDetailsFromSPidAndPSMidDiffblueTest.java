package com.iemr.tm.data.location;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class V_GetLocDetailsFromSPidAndPSMidDiffblueTest {
    /**
     * Method under test:
     * {@link V_GetLocDetailsFromSPidAndPSMid#getOtherLocDetails(ArrayList)}
     */
    @Test
    void testGetOtherLocDetails() {
        // Arrange, Act and Assert
        assertNull(V_GetLocDetailsFromSPidAndPSMid.getOtherLocDetails(new ArrayList<>()));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#V_GetLocDetailsFromSPidAndPSMid()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setBlockID(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setBlockName(String)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setDistrictID(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setDistrictName(String)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setParkingPlaceID(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setParkingPlaceName(String)}
     *   <li>
     * {@link V_GetLocDetailsFromSPidAndPSMid#setPpproviderservicemapid(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setServicepointid(Integer)}
     *   <li>
     * {@link V_GetLocDetailsFromSPidAndPSMid#setSpproviderservicemapid(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setStateID(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setStateName(String)}
     *   <li>
     * {@link V_GetLocDetailsFromSPidAndPSMid#setZdmproviderservicemapid(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setZoneID(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setZoneName(String)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getBlockID()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getBlockName()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getDistrictID()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getDistrictName()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getParkingPlaceID()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getParkingPlaceName()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getPpproviderservicemapid()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getServicepointid()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getSpproviderservicemapid()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getStateID()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getStateName()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getZdmproviderservicemapid()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getZoneID()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getZoneName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        V_GetLocDetailsFromSPidAndPSMid actualV_GetLocDetailsFromSPidAndPSMid = new V_GetLocDetailsFromSPidAndPSMid();
        actualV_GetLocDetailsFromSPidAndPSMid.setBlockID(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setBlockName("Block Name");
        actualV_GetLocDetailsFromSPidAndPSMid.setDistrictID(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setDistrictName("District Name");
        actualV_GetLocDetailsFromSPidAndPSMid.setParkingPlaceID(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setParkingPlaceName("Parking Place Name");
        actualV_GetLocDetailsFromSPidAndPSMid.setPpproviderservicemapid(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setServicepointid(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setSpproviderservicemapid(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setStateID(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setStateName("MD");
        actualV_GetLocDetailsFromSPidAndPSMid.setZdmproviderservicemapid(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setZoneID(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setZoneName("Zone Name");
        Integer actualBlockID = actualV_GetLocDetailsFromSPidAndPSMid.getBlockID();
        String actualBlockName = actualV_GetLocDetailsFromSPidAndPSMid.getBlockName();
        Integer actualDistrictID = actualV_GetLocDetailsFromSPidAndPSMid.getDistrictID();
        String actualDistrictName = actualV_GetLocDetailsFromSPidAndPSMid.getDistrictName();
        Integer actualParkingPlaceID = actualV_GetLocDetailsFromSPidAndPSMid.getParkingPlaceID();
        String actualParkingPlaceName = actualV_GetLocDetailsFromSPidAndPSMid.getParkingPlaceName();
        Integer actualPpproviderservicemapid = actualV_GetLocDetailsFromSPidAndPSMid.getPpproviderservicemapid();
        Integer actualServicepointid = actualV_GetLocDetailsFromSPidAndPSMid.getServicepointid();
        Integer actualSpproviderservicemapid = actualV_GetLocDetailsFromSPidAndPSMid.getSpproviderservicemapid();
        Integer actualStateID = actualV_GetLocDetailsFromSPidAndPSMid.getStateID();
        String actualStateName = actualV_GetLocDetailsFromSPidAndPSMid.getStateName();
        Integer actualZdmproviderservicemapid = actualV_GetLocDetailsFromSPidAndPSMid.getZdmproviderservicemapid();
        Integer actualZoneID = actualV_GetLocDetailsFromSPidAndPSMid.getZoneID();

        // Assert that nothing has changed
        assertEquals("Block Name", actualBlockName);
        assertEquals("District Name", actualDistrictName);
        assertEquals("MD", actualStateName);
        assertEquals("Parking Place Name", actualParkingPlaceName);
        assertEquals("Zone Name", actualV_GetLocDetailsFromSPidAndPSMid.getZoneName());
        assertEquals(1, actualBlockID.intValue());
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualPpproviderservicemapid.intValue());
        assertEquals(1, actualServicepointid.intValue());
        assertEquals(1, actualSpproviderservicemapid.intValue());
        assertEquals(1, actualStateID.intValue());
        assertEquals(1, actualZdmproviderservicemapid.intValue());
        assertEquals(1, actualZoneID.intValue());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link V_GetLocDetailsFromSPidAndPSMid#V_GetLocDetailsFromSPidAndPSMid(Integer, String, Integer, String, Integer, String, Integer, String, Integer, String)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setBlockID(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setBlockName(String)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setDistrictID(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setDistrictName(String)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setParkingPlaceID(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setParkingPlaceName(String)}
     *   <li>
     * {@link V_GetLocDetailsFromSPidAndPSMid#setPpproviderservicemapid(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setServicepointid(Integer)}
     *   <li>
     * {@link V_GetLocDetailsFromSPidAndPSMid#setSpproviderservicemapid(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setStateID(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setStateName(String)}
     *   <li>
     * {@link V_GetLocDetailsFromSPidAndPSMid#setZdmproviderservicemapid(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setZoneID(Integer)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#setZoneName(String)}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getBlockID()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getBlockName()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getDistrictID()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getDistrictName()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getParkingPlaceID()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getParkingPlaceName()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getPpproviderservicemapid()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getServicepointid()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getSpproviderservicemapid()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getStateID()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getStateName()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getZdmproviderservicemapid()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getZoneID()}
     *   <li>{@link V_GetLocDetailsFromSPidAndPSMid#getZoneName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        V_GetLocDetailsFromSPidAndPSMid actualV_GetLocDetailsFromSPidAndPSMid = new V_GetLocDetailsFromSPidAndPSMid(1,
                "Parking Place Name", 1, "Block Name", 1, "District Name", 1, "Zone Name", 1, "MD");
        actualV_GetLocDetailsFromSPidAndPSMid.setBlockID(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setBlockName("Block Name");
        actualV_GetLocDetailsFromSPidAndPSMid.setDistrictID(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setDistrictName("District Name");
        actualV_GetLocDetailsFromSPidAndPSMid.setParkingPlaceID(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setParkingPlaceName("Parking Place Name");
        actualV_GetLocDetailsFromSPidAndPSMid.setPpproviderservicemapid(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setServicepointid(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setSpproviderservicemapid(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setStateID(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setStateName("MD");
        actualV_GetLocDetailsFromSPidAndPSMid.setZdmproviderservicemapid(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setZoneID(1);
        actualV_GetLocDetailsFromSPidAndPSMid.setZoneName("Zone Name");
        Integer actualBlockID = actualV_GetLocDetailsFromSPidAndPSMid.getBlockID();
        String actualBlockName = actualV_GetLocDetailsFromSPidAndPSMid.getBlockName();
        Integer actualDistrictID = actualV_GetLocDetailsFromSPidAndPSMid.getDistrictID();
        String actualDistrictName = actualV_GetLocDetailsFromSPidAndPSMid.getDistrictName();
        Integer actualParkingPlaceID = actualV_GetLocDetailsFromSPidAndPSMid.getParkingPlaceID();
        String actualParkingPlaceName = actualV_GetLocDetailsFromSPidAndPSMid.getParkingPlaceName();
        Integer actualPpproviderservicemapid = actualV_GetLocDetailsFromSPidAndPSMid.getPpproviderservicemapid();
        Integer actualServicepointid = actualV_GetLocDetailsFromSPidAndPSMid.getServicepointid();
        Integer actualSpproviderservicemapid = actualV_GetLocDetailsFromSPidAndPSMid.getSpproviderservicemapid();
        Integer actualStateID = actualV_GetLocDetailsFromSPidAndPSMid.getStateID();
        String actualStateName = actualV_GetLocDetailsFromSPidAndPSMid.getStateName();
        Integer actualZdmproviderservicemapid = actualV_GetLocDetailsFromSPidAndPSMid.getZdmproviderservicemapid();
        Integer actualZoneID = actualV_GetLocDetailsFromSPidAndPSMid.getZoneID();

        // Assert that nothing has changed
        assertEquals("Block Name", actualBlockName);
        assertEquals("District Name", actualDistrictName);
        assertEquals("MD", actualStateName);
        assertEquals("Parking Place Name", actualParkingPlaceName);
        assertEquals("Zone Name", actualV_GetLocDetailsFromSPidAndPSMid.getZoneName());
        assertEquals(1, actualBlockID.intValue());
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualPpproviderservicemapid.intValue());
        assertEquals(1, actualServicepointid.intValue());
        assertEquals(1, actualSpproviderservicemapid.intValue());
        assertEquals(1, actualStateID.intValue());
        assertEquals(1, actualZdmproviderservicemapid.intValue());
        assertEquals(1, actualZoneID.intValue());
    }
}
