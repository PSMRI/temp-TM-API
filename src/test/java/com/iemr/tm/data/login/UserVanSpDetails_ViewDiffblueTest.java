package com.iemr.tm.data.login;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class UserVanSpDetails_ViewDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link UserVanSpDetails_View#UserVanSpDetails_View()}
     *   <li>{@link UserVanSpDetails_View#setFacilityID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setID(long)}
     *   <li>{@link UserVanSpDetails_View#setIsFacility(Boolean)}
     *   <li>{@link UserVanSpDetails_View#setParkingPlaceID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setProviderServiceMapID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setServicePointID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setServicePointName(String)}
     *   <li>{@link UserVanSpDetails_View#setUserID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setVanID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setVanNoAndType(String)}
     *   <li>{@link UserVanSpDetails_View#setVanSession(Short)}
     *   <li>{@link UserVanSpDetails_View#getFacilityID()}
     *   <li>{@link UserVanSpDetails_View#getID()}
     *   <li>{@link UserVanSpDetails_View#getIsFacility()}
     *   <li>{@link UserVanSpDetails_View#getParkingPlaceID()}
     *   <li>{@link UserVanSpDetails_View#getProviderServiceMapID()}
     *   <li>{@link UserVanSpDetails_View#getServicePointID()}
     *   <li>{@link UserVanSpDetails_View#getServicePointName()}
     *   <li>{@link UserVanSpDetails_View#getUserID()}
     *   <li>{@link UserVanSpDetails_View#getVanID()}
     *   <li>{@link UserVanSpDetails_View#getVanNoAndType()}
     *   <li>{@link UserVanSpDetails_View#getVanSession()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        UserVanSpDetails_View actualUserVanSpDetails_View = new UserVanSpDetails_View();
        actualUserVanSpDetails_View.setFacilityID(1);
        actualUserVanSpDetails_View.setID(1L);
        actualUserVanSpDetails_View.setIsFacility(true);
        actualUserVanSpDetails_View.setParkingPlaceID(1);
        actualUserVanSpDetails_View.setProviderServiceMapID(1);
        actualUserVanSpDetails_View.setServicePointID(1);
        actualUserVanSpDetails_View.setServicePointName("Service Point Name");
        actualUserVanSpDetails_View.setUserID(1);
        actualUserVanSpDetails_View.setVanID(1);
        actualUserVanSpDetails_View.setVanNoAndType("Van No And Type");
        actualUserVanSpDetails_View.setVanSession((short) 1);
        Integer actualFacilityID = actualUserVanSpDetails_View.getFacilityID();
        long actualID = actualUserVanSpDetails_View.getID();
        Boolean actualIsFacility = actualUserVanSpDetails_View.getIsFacility();
        Integer actualParkingPlaceID = actualUserVanSpDetails_View.getParkingPlaceID();
        Integer actualProviderServiceMapID = actualUserVanSpDetails_View.getProviderServiceMapID();
        Integer actualServicePointID = actualUserVanSpDetails_View.getServicePointID();
        String actualServicePointName = actualUserVanSpDetails_View.getServicePointName();
        Integer actualUserID = actualUserVanSpDetails_View.getUserID();
        Integer actualVanID = actualUserVanSpDetails_View.getVanID();
        String actualVanNoAndType = actualUserVanSpDetails_View.getVanNoAndType();
        Short actualVanSession = actualUserVanSpDetails_View.getVanSession();

        // Assert that nothing has changed
        assertEquals("Service Point Name", actualServicePointName);
        assertEquals("Van No And Type", actualVanNoAndType);
        assertEquals(1, actualFacilityID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualServicePointID.intValue());
        assertEquals(1, actualUserID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualID);
        assertEquals((short) 1, actualVanSession.shortValue());
        assertTrue(actualIsFacility);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link UserVanSpDetails_View#UserVanSpDetails_View(Integer, Integer, String, Short, Integer, String, Integer, Integer)}
     *   <li>{@link UserVanSpDetails_View#setFacilityID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setID(long)}
     *   <li>{@link UserVanSpDetails_View#setIsFacility(Boolean)}
     *   <li>{@link UserVanSpDetails_View#setParkingPlaceID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setProviderServiceMapID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setServicePointID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setServicePointName(String)}
     *   <li>{@link UserVanSpDetails_View#setUserID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setVanID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setVanNoAndType(String)}
     *   <li>{@link UserVanSpDetails_View#setVanSession(Short)}
     *   <li>{@link UserVanSpDetails_View#getFacilityID()}
     *   <li>{@link UserVanSpDetails_View#getID()}
     *   <li>{@link UserVanSpDetails_View#getIsFacility()}
     *   <li>{@link UserVanSpDetails_View#getParkingPlaceID()}
     *   <li>{@link UserVanSpDetails_View#getProviderServiceMapID()}
     *   <li>{@link UserVanSpDetails_View#getServicePointID()}
     *   <li>{@link UserVanSpDetails_View#getServicePointName()}
     *   <li>{@link UserVanSpDetails_View#getUserID()}
     *   <li>{@link UserVanSpDetails_View#getVanID()}
     *   <li>{@link UserVanSpDetails_View#getVanNoAndType()}
     *   <li>{@link UserVanSpDetails_View#getVanSession()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        UserVanSpDetails_View actualUserVanSpDetails_View = new UserVanSpDetails_View(1, 1, "Van No And Type", (short) 1, 1,
                "Service Point Name", 1, 1);
        actualUserVanSpDetails_View.setFacilityID(1);
        actualUserVanSpDetails_View.setID(1L);
        actualUserVanSpDetails_View.setIsFacility(true);
        actualUserVanSpDetails_View.setParkingPlaceID(1);
        actualUserVanSpDetails_View.setProviderServiceMapID(1);
        actualUserVanSpDetails_View.setServicePointID(1);
        actualUserVanSpDetails_View.setServicePointName("Service Point Name");
        actualUserVanSpDetails_View.setUserID(1);
        actualUserVanSpDetails_View.setVanID(1);
        actualUserVanSpDetails_View.setVanNoAndType("Van No And Type");
        actualUserVanSpDetails_View.setVanSession((short) 1);
        Integer actualFacilityID = actualUserVanSpDetails_View.getFacilityID();
        long actualID = actualUserVanSpDetails_View.getID();
        Boolean actualIsFacility = actualUserVanSpDetails_View.getIsFacility();
        Integer actualParkingPlaceID = actualUserVanSpDetails_View.getParkingPlaceID();
        Integer actualProviderServiceMapID = actualUserVanSpDetails_View.getProviderServiceMapID();
        Integer actualServicePointID = actualUserVanSpDetails_View.getServicePointID();
        String actualServicePointName = actualUserVanSpDetails_View.getServicePointName();
        Integer actualUserID = actualUserVanSpDetails_View.getUserID();
        Integer actualVanID = actualUserVanSpDetails_View.getVanID();
        String actualVanNoAndType = actualUserVanSpDetails_View.getVanNoAndType();
        Short actualVanSession = actualUserVanSpDetails_View.getVanSession();

        // Assert that nothing has changed
        assertEquals("Service Point Name", actualServicePointName);
        assertEquals("Van No And Type", actualVanNoAndType);
        assertEquals(1, actualFacilityID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualServicePointID.intValue());
        assertEquals(1, actualUserID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualID);
        assertEquals((short) 1, actualVanSession.shortValue());
        assertTrue(actualIsFacility);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link UserVanSpDetails_View#UserVanSpDetails_View(Integer, Integer, String, Short, Integer, String, Integer, Integer, int)}
     *   <li>{@link UserVanSpDetails_View#setFacilityID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setID(long)}
     *   <li>{@link UserVanSpDetails_View#setIsFacility(Boolean)}
     *   <li>{@link UserVanSpDetails_View#setParkingPlaceID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setProviderServiceMapID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setServicePointID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setServicePointName(String)}
     *   <li>{@link UserVanSpDetails_View#setUserID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setVanID(Integer)}
     *   <li>{@link UserVanSpDetails_View#setVanNoAndType(String)}
     *   <li>{@link UserVanSpDetails_View#setVanSession(Short)}
     *   <li>{@link UserVanSpDetails_View#getFacilityID()}
     *   <li>{@link UserVanSpDetails_View#getID()}
     *   <li>{@link UserVanSpDetails_View#getIsFacility()}
     *   <li>{@link UserVanSpDetails_View#getParkingPlaceID()}
     *   <li>{@link UserVanSpDetails_View#getProviderServiceMapID()}
     *   <li>{@link UserVanSpDetails_View#getServicePointID()}
     *   <li>{@link UserVanSpDetails_View#getServicePointName()}
     *   <li>{@link UserVanSpDetails_View#getUserID()}
     *   <li>{@link UserVanSpDetails_View#getVanID()}
     *   <li>{@link UserVanSpDetails_View#getVanNoAndType()}
     *   <li>{@link UserVanSpDetails_View#getVanSession()}
     * </ul>
     */
    @Test
    void testGettersAndSetters3() {
        // Arrange and Act
        UserVanSpDetails_View actualUserVanSpDetails_View = new UserVanSpDetails_View(1, 1, "Van No And Type", (short) 1, 1,
                "Service Point Name", 1, 1, 1);
        actualUserVanSpDetails_View.setFacilityID(1);
        actualUserVanSpDetails_View.setID(1L);
        actualUserVanSpDetails_View.setIsFacility(true);
        actualUserVanSpDetails_View.setParkingPlaceID(1);
        actualUserVanSpDetails_View.setProviderServiceMapID(1);
        actualUserVanSpDetails_View.setServicePointID(1);
        actualUserVanSpDetails_View.setServicePointName("Service Point Name");
        actualUserVanSpDetails_View.setUserID(1);
        actualUserVanSpDetails_View.setVanID(1);
        actualUserVanSpDetails_View.setVanNoAndType("Van No And Type");
        actualUserVanSpDetails_View.setVanSession((short) 1);
        Integer actualFacilityID = actualUserVanSpDetails_View.getFacilityID();
        long actualID = actualUserVanSpDetails_View.getID();
        Boolean actualIsFacility = actualUserVanSpDetails_View.getIsFacility();
        Integer actualParkingPlaceID = actualUserVanSpDetails_View.getParkingPlaceID();
        Integer actualProviderServiceMapID = actualUserVanSpDetails_View.getProviderServiceMapID();
        Integer actualServicePointID = actualUserVanSpDetails_View.getServicePointID();
        String actualServicePointName = actualUserVanSpDetails_View.getServicePointName();
        Integer actualUserID = actualUserVanSpDetails_View.getUserID();
        Integer actualVanID = actualUserVanSpDetails_View.getVanID();
        String actualVanNoAndType = actualUserVanSpDetails_View.getVanNoAndType();
        Short actualVanSession = actualUserVanSpDetails_View.getVanSession();

        // Assert that nothing has changed
        assertEquals("Service Point Name", actualServicePointName);
        assertEquals("Van No And Type", actualVanNoAndType);
        assertEquals(1, actualFacilityID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualServicePointID.intValue());
        assertEquals(1, actualUserID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualID);
        assertEquals((short) 1, actualVanSession.shortValue());
        assertTrue(actualIsFacility);
    }
}
