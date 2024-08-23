package com.iemr.tm.data.login;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class MasterServicePointDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MasterServicePoint#MasterServicePoint()}
     *   <li>{@link MasterServicePoint#setDeleted(Boolean)}
     *   <li>{@link MasterServicePoint#setParkingPlaceID(Integer)}
     *   <li>{@link MasterServicePoint#setProviderServiceMapID(Integer)}
     *   <li>{@link MasterServicePoint#setServicePointID(Integer)}
     *   <li>{@link MasterServicePoint#setServicePointName(String)}
     *   <li>{@link MasterServicePoint#setVanServicepointMapping(Set)}
     *   <li>{@link MasterServicePoint#getDeleted()}
     *   <li>{@link MasterServicePoint#getParkingPlaceID()}
     *   <li>{@link MasterServicePoint#getProviderServiceMapID()}
     *   <li>{@link MasterServicePoint#getServicePointID()}
     *   <li>{@link MasterServicePoint#getServicePointName()}
     *   <li>{@link MasterServicePoint#getVanServicepointMapping()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        MasterServicePoint actualMasterServicePoint = new MasterServicePoint();
        actualMasterServicePoint.setDeleted(true);
        actualMasterServicePoint.setParkingPlaceID(1);
        actualMasterServicePoint.setProviderServiceMapID(1);
        actualMasterServicePoint.setServicePointID(1);
        actualMasterServicePoint.setServicePointName("Service Point Name");
        HashSet<VanServicepointMapping> vanServicepointMapping = new HashSet<>();
        actualMasterServicePoint.setVanServicepointMapping(vanServicepointMapping);
        Boolean actualDeleted = actualMasterServicePoint.getDeleted();
        Integer actualParkingPlaceID = actualMasterServicePoint.getParkingPlaceID();
        Integer actualProviderServiceMapID = actualMasterServicePoint.getProviderServiceMapID();
        Integer actualServicePointID = actualMasterServicePoint.getServicePointID();
        String actualServicePointName = actualMasterServicePoint.getServicePointName();
        Set<VanServicepointMapping> actualVanServicepointMapping = actualMasterServicePoint.getVanServicepointMapping();

        // Assert that nothing has changed
        assertEquals("Service Point Name", actualServicePointName);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualServicePointID.intValue());
        assertTrue(actualDeleted);
        assertSame(vanServicepointMapping, actualVanServicepointMapping);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link MasterServicePoint#MasterServicePoint(Integer, String)}
     *   <li>{@link MasterServicePoint#setDeleted(Boolean)}
     *   <li>{@link MasterServicePoint#setParkingPlaceID(Integer)}
     *   <li>{@link MasterServicePoint#setProviderServiceMapID(Integer)}
     *   <li>{@link MasterServicePoint#setServicePointID(Integer)}
     *   <li>{@link MasterServicePoint#setServicePointName(String)}
     *   <li>{@link MasterServicePoint#setVanServicepointMapping(Set)}
     *   <li>{@link MasterServicePoint#getDeleted()}
     *   <li>{@link MasterServicePoint#getParkingPlaceID()}
     *   <li>{@link MasterServicePoint#getProviderServiceMapID()}
     *   <li>{@link MasterServicePoint#getServicePointID()}
     *   <li>{@link MasterServicePoint#getServicePointName()}
     *   <li>{@link MasterServicePoint#getVanServicepointMapping()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        MasterServicePoint actualMasterServicePoint = new MasterServicePoint(1, "Service Point Name");
        actualMasterServicePoint.setDeleted(true);
        actualMasterServicePoint.setParkingPlaceID(1);
        actualMasterServicePoint.setProviderServiceMapID(1);
        actualMasterServicePoint.setServicePointID(1);
        actualMasterServicePoint.setServicePointName("Service Point Name");
        HashSet<VanServicepointMapping> vanServicepointMapping = new HashSet<>();
        actualMasterServicePoint.setVanServicepointMapping(vanServicepointMapping);
        Boolean actualDeleted = actualMasterServicePoint.getDeleted();
        Integer actualParkingPlaceID = actualMasterServicePoint.getParkingPlaceID();
        Integer actualProviderServiceMapID = actualMasterServicePoint.getProviderServiceMapID();
        Integer actualServicePointID = actualMasterServicePoint.getServicePointID();
        String actualServicePointName = actualMasterServicePoint.getServicePointName();
        Set<VanServicepointMapping> actualVanServicepointMapping = actualMasterServicePoint.getVanServicepointMapping();

        // Assert that nothing has changed
        assertEquals("Service Point Name", actualServicePointName);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualServicePointID.intValue());
        assertTrue(actualDeleted);
        assertSame(vanServicepointMapping, actualVanServicepointMapping);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link MasterServicePoint#MasterServicePoint(Integer, String, Integer, Integer, Boolean, Set)}
     *   <li>{@link MasterServicePoint#setDeleted(Boolean)}
     *   <li>{@link MasterServicePoint#setParkingPlaceID(Integer)}
     *   <li>{@link MasterServicePoint#setProviderServiceMapID(Integer)}
     *   <li>{@link MasterServicePoint#setServicePointID(Integer)}
     *   <li>{@link MasterServicePoint#setServicePointName(String)}
     *   <li>{@link MasterServicePoint#setVanServicepointMapping(Set)}
     *   <li>{@link MasterServicePoint#getDeleted()}
     *   <li>{@link MasterServicePoint#getParkingPlaceID()}
     *   <li>{@link MasterServicePoint#getProviderServiceMapID()}
     *   <li>{@link MasterServicePoint#getServicePointID()}
     *   <li>{@link MasterServicePoint#getServicePointName()}
     *   <li>{@link MasterServicePoint#getVanServicepointMapping()}
     * </ul>
     */
    @Test
    void testGettersAndSetters3() {
        // Arrange and Act
        MasterServicePoint actualMasterServicePoint = new MasterServicePoint(1, "Service Point Name", 1, 1, true,
                new HashSet<>());
        actualMasterServicePoint.setDeleted(true);
        actualMasterServicePoint.setParkingPlaceID(1);
        actualMasterServicePoint.setProviderServiceMapID(1);
        actualMasterServicePoint.setServicePointID(1);
        actualMasterServicePoint.setServicePointName("Service Point Name");
        HashSet<VanServicepointMapping> vanServicepointMapping = new HashSet<>();
        actualMasterServicePoint.setVanServicepointMapping(vanServicepointMapping);
        Boolean actualDeleted = actualMasterServicePoint.getDeleted();
        Integer actualParkingPlaceID = actualMasterServicePoint.getParkingPlaceID();
        Integer actualProviderServiceMapID = actualMasterServicePoint.getProviderServiceMapID();
        Integer actualServicePointID = actualMasterServicePoint.getServicePointID();
        String actualServicePointName = actualMasterServicePoint.getServicePointName();
        Set<VanServicepointMapping> actualVanServicepointMapping = actualMasterServicePoint.getVanServicepointMapping();

        // Assert that nothing has changed
        assertEquals("Service Point Name", actualServicePointName);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualServicePointID.intValue());
        assertTrue(actualDeleted);
        assertSame(vanServicepointMapping, actualVanServicepointMapping);
    }
}
