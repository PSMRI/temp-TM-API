package com.iemr.tm.data.login;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class MasterVanDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MasterVan#MasterVan()}
     *   <li>{@link MasterVan#setDeleted(Boolean)}
     *   <li>{@link MasterVan#setFacilityID(Integer)}
     *   <li>{@link MasterVan#setIsFacility(Boolean)}
     *   <li>{@link MasterVan#setParkingPlaceID(Integer)}
     *   <li>{@link MasterVan#setProviderServiceMapID(Integer)}
     *   <li>{@link MasterVan#setVanID(Integer)}
     *   <li>{@link MasterVan#setVanName(String)}
     *   <li>{@link MasterVan#setVehicalNo(String)}
     *   <li>{@link MasterVan#setVideoConsultationEmailID(String)}
     *   <li>{@link MasterVan#getDeleted()}
     *   <li>{@link MasterVan#getFacilityID()}
     *   <li>{@link MasterVan#getIsFacility()}
     *   <li>{@link MasterVan#getParkingPlaceID()}
     *   <li>{@link MasterVan#getProviderServiceMapID()}
     *   <li>{@link MasterVan#getVanID()}
     *   <li>{@link MasterVan#getVanName()}
     *   <li>{@link MasterVan#getVehicalNo()}
     *   <li>{@link MasterVan#getVideoConsultationEmailID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        MasterVan actualMasterVan = new MasterVan();
        actualMasterVan.setDeleted(true);
        actualMasterVan.setFacilityID(1);
        actualMasterVan.setIsFacility(true);
        actualMasterVan.setParkingPlaceID(1);
        actualMasterVan.setProviderServiceMapID(1);
        actualMasterVan.setVanID(1);
        actualMasterVan.setVanName("Van Name");
        actualMasterVan.setVehicalNo("Vehical No");
        actualMasterVan.setVideoConsultationEmailID("jane.doe@example.org");
        Boolean actualDeleted = actualMasterVan.getDeleted();
        Integer actualFacilityID = actualMasterVan.getFacilityID();
        Boolean actualIsFacility = actualMasterVan.getIsFacility();
        Integer actualParkingPlaceID = actualMasterVan.getParkingPlaceID();
        Integer actualProviderServiceMapID = actualMasterVan.getProviderServiceMapID();
        Integer actualVanID = actualMasterVan.getVanID();
        String actualVanName = actualMasterVan.getVanName();
        String actualVehicalNo = actualMasterVan.getVehicalNo();

        // Assert that nothing has changed
        assertEquals("Van Name", actualVanName);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals("jane.doe@example.org", actualMasterVan.getVideoConsultationEmailID());
        assertEquals(1, actualFacilityID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertTrue(actualDeleted);
        assertTrue(actualIsFacility);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MasterVan#MasterVan(Integer, String)}
     *   <li>{@link MasterVan#setDeleted(Boolean)}
     *   <li>{@link MasterVan#setFacilityID(Integer)}
     *   <li>{@link MasterVan#setIsFacility(Boolean)}
     *   <li>{@link MasterVan#setParkingPlaceID(Integer)}
     *   <li>{@link MasterVan#setProviderServiceMapID(Integer)}
     *   <li>{@link MasterVan#setVanID(Integer)}
     *   <li>{@link MasterVan#setVanName(String)}
     *   <li>{@link MasterVan#setVehicalNo(String)}
     *   <li>{@link MasterVan#setVideoConsultationEmailID(String)}
     *   <li>{@link MasterVan#getDeleted()}
     *   <li>{@link MasterVan#getFacilityID()}
     *   <li>{@link MasterVan#getIsFacility()}
     *   <li>{@link MasterVan#getParkingPlaceID()}
     *   <li>{@link MasterVan#getProviderServiceMapID()}
     *   <li>{@link MasterVan#getVanID()}
     *   <li>{@link MasterVan#getVanName()}
     *   <li>{@link MasterVan#getVehicalNo()}
     *   <li>{@link MasterVan#getVideoConsultationEmailID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        MasterVan actualMasterVan = new MasterVan(1, "Vehical No");
        actualMasterVan.setDeleted(true);
        actualMasterVan.setFacilityID(1);
        actualMasterVan.setIsFacility(true);
        actualMasterVan.setParkingPlaceID(1);
        actualMasterVan.setProviderServiceMapID(1);
        actualMasterVan.setVanID(1);
        actualMasterVan.setVanName("Van Name");
        actualMasterVan.setVehicalNo("Vehical No");
        actualMasterVan.setVideoConsultationEmailID("jane.doe@example.org");
        Boolean actualDeleted = actualMasterVan.getDeleted();
        Integer actualFacilityID = actualMasterVan.getFacilityID();
        Boolean actualIsFacility = actualMasterVan.getIsFacility();
        Integer actualParkingPlaceID = actualMasterVan.getParkingPlaceID();
        Integer actualProviderServiceMapID = actualMasterVan.getProviderServiceMapID();
        Integer actualVanID = actualMasterVan.getVanID();
        String actualVanName = actualMasterVan.getVanName();
        String actualVehicalNo = actualMasterVan.getVehicalNo();

        // Assert that nothing has changed
        assertEquals("Van Name", actualVanName);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals("jane.doe@example.org", actualMasterVan.getVideoConsultationEmailID());
        assertEquals(1, actualFacilityID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertTrue(actualDeleted);
        assertTrue(actualIsFacility);
    }
}
