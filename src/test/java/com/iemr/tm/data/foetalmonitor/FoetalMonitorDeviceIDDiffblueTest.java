package com.iemr.tm.data.foetalmonitor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

class FoetalMonitorDeviceIDDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link FoetalMonitorDeviceID#setCreatedBy(String)}
     *   <li>{@link FoetalMonitorDeviceID#setCreatedDate(Timestamp)}
     *   <li>{@link FoetalMonitorDeviceID#setDeactivated(Boolean)}
     *   <li>{@link FoetalMonitorDeviceID#setDeleted(Boolean)}
     *   <li>{@link FoetalMonitorDeviceID#setDeviceID(String)}
     *   <li>{@link FoetalMonitorDeviceID#setDeviceName(String)}
     *   <li>{@link FoetalMonitorDeviceID#setLastModDate(Timestamp)}
     *   <li>{@link FoetalMonitorDeviceID#setModifiedBy(String)}
     *   <li>{@link FoetalMonitorDeviceID#setParkingPlaceID(Integer)}
     *   <li>{@link FoetalMonitorDeviceID#setProcessed(String)}
     *   <li>{@link FoetalMonitorDeviceID#setProviderServiceMapID(Integer)}
     *   <li>{@link FoetalMonitorDeviceID#setVanID(Integer)}
     *   <li>{@link FoetalMonitorDeviceID#setVanName(String)}
     *   <li>{@link FoetalMonitorDeviceID#setVanTypeID(Integer)}
     *   <li>{@link FoetalMonitorDeviceID#setVfdID(Long)}
     *   <li>{@link FoetalMonitorDeviceID#getCreatedBy()}
     *   <li>{@link FoetalMonitorDeviceID#getCreatedDate()}
     *   <li>{@link FoetalMonitorDeviceID#getDeactivated()}
     *   <li>{@link FoetalMonitorDeviceID#getDeleted()}
     *   <li>{@link FoetalMonitorDeviceID#getDeviceID()}
     *   <li>{@link FoetalMonitorDeviceID#getDeviceName()}
     *   <li>{@link FoetalMonitorDeviceID#getLastModDate()}
     *   <li>{@link FoetalMonitorDeviceID#getModifiedBy()}
     *   <li>{@link FoetalMonitorDeviceID#getParkingPlaceID()}
     *   <li>{@link FoetalMonitorDeviceID#getProcessed()}
     *   <li>{@link FoetalMonitorDeviceID#getProviderServiceMapID()}
     *   <li>{@link FoetalMonitorDeviceID#getVanID()}
     *   <li>{@link FoetalMonitorDeviceID#getVanName()}
     *   <li>{@link FoetalMonitorDeviceID#getVanTypeID()}
     *   <li>{@link FoetalMonitorDeviceID#getVfdID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        FoetalMonitorDeviceID foetalMonitorDeviceID = new FoetalMonitorDeviceID();

        // Act
        foetalMonitorDeviceID.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        foetalMonitorDeviceID.setCreatedDate(createdDate);
        foetalMonitorDeviceID.setDeactivated(true);
        foetalMonitorDeviceID.setDeleted(true);
        foetalMonitorDeviceID.setDeviceID("Device ID");
        foetalMonitorDeviceID.setDeviceName("Device Name");
        Timestamp lastModDate = mock(Timestamp.class);
        foetalMonitorDeviceID.setLastModDate(lastModDate);
        foetalMonitorDeviceID.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        foetalMonitorDeviceID.setParkingPlaceID(1);
        foetalMonitorDeviceID.setProcessed("Processed");
        foetalMonitorDeviceID.setProviderServiceMapID(1);
        foetalMonitorDeviceID.setVanID(1);
        foetalMonitorDeviceID.setVanName("Van Name");
        foetalMonitorDeviceID.setVanTypeID(1);
        foetalMonitorDeviceID.setVfdID(1L);
        String actualCreatedBy = foetalMonitorDeviceID.getCreatedBy();
        Timestamp actualCreatedDate = foetalMonitorDeviceID.getCreatedDate();
        Boolean actualDeactivated = foetalMonitorDeviceID.getDeactivated();
        Boolean actualDeleted = foetalMonitorDeviceID.getDeleted();
        String actualDeviceID = foetalMonitorDeviceID.getDeviceID();
        String actualDeviceName = foetalMonitorDeviceID.getDeviceName();
        Timestamp actualLastModDate = foetalMonitorDeviceID.getLastModDate();
        String actualModifiedBy = foetalMonitorDeviceID.getModifiedBy();
        Integer actualParkingPlaceID = foetalMonitorDeviceID.getParkingPlaceID();
        String actualProcessed = foetalMonitorDeviceID.getProcessed();
        Integer actualProviderServiceMapID = foetalMonitorDeviceID.getProviderServiceMapID();
        Integer actualVanID = foetalMonitorDeviceID.getVanID();
        String actualVanName = foetalMonitorDeviceID.getVanName();
        Integer actualVanTypeID = foetalMonitorDeviceID.getVanTypeID();
        Long actualVfdID = foetalMonitorDeviceID.getVfdID();

        // Assert that nothing has changed
        assertEquals("Device ID", actualDeviceID);
        assertEquals("Device Name", actualDeviceName);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualProcessed);
        assertEquals("Van Name", actualVanName);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1, actualVanTypeID.intValue());
        assertEquals(1L, actualVfdID.longValue());
        assertTrue(actualDeactivated);
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
