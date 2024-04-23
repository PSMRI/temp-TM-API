package com.iemr.tm.data.masterdata.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class RouteOfAdminDiffblueTest {
    /**
     * Method under test: {@link RouteOfAdmin#getRouteOfAdminList(ArrayList)}
     */
    @Test
    void testGetRouteOfAdminList() {
        // Arrange and Act
        ArrayList<RouteOfAdmin> actualRouteOfAdminList = RouteOfAdmin.getRouteOfAdminList(new ArrayList<>());

        // Assert
        assertTrue(actualRouteOfAdminList.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link RouteOfAdmin#RouteOfAdmin()}
     *   <li>{@link RouteOfAdmin#setCreatedBy(String)}
     *   <li>{@link RouteOfAdmin#setCreatedDate(Timestamp)}
     *   <li>{@link RouteOfAdmin#setDeleted(Boolean)}
     *   <li>{@link RouteOfAdmin#setLastModDate(Timestamp)}
     *   <li>{@link RouteOfAdmin#setModifiedBy(String)}
     *   <li>{@link RouteOfAdmin#setProcessed(String)}
     *   <li>{@link RouteOfAdmin#setProviderServiceMapID(Integer)}
     *   <li>{@link RouteOfAdmin#setRouteCode(String)}
     *   <li>{@link RouteOfAdmin#setRouteDesc(String)}
     *   <li>{@link RouteOfAdmin#setRouteID(Integer)}
     *   <li>{@link RouteOfAdmin#setRouteName(String)}
     *   <li>{@link RouteOfAdmin#setStatus(String)}
     *   <li>{@link RouteOfAdmin#getCreatedBy()}
     *   <li>{@link RouteOfAdmin#getCreatedDate()}
     *   <li>{@link RouteOfAdmin#getDeleted()}
     *   <li>{@link RouteOfAdmin#getLastModDate()}
     *   <li>{@link RouteOfAdmin#getModifiedBy()}
     *   <li>{@link RouteOfAdmin#getProcessed()}
     *   <li>{@link RouteOfAdmin#getProviderServiceMapID()}
     *   <li>{@link RouteOfAdmin#getRouteCode()}
     *   <li>{@link RouteOfAdmin#getRouteDesc()}
     *   <li>{@link RouteOfAdmin#getRouteID()}
     *   <li>{@link RouteOfAdmin#getRouteName()}
     *   <li>{@link RouteOfAdmin#getStatus()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        RouteOfAdmin actualRouteOfAdmin = new RouteOfAdmin();
        actualRouteOfAdmin.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualRouteOfAdmin.setCreatedDate(createdDate);
        actualRouteOfAdmin.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualRouteOfAdmin.setLastModDate(lastModDate);
        actualRouteOfAdmin.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualRouteOfAdmin.setProcessed("Processed");
        actualRouteOfAdmin.setProviderServiceMapID(1);
        actualRouteOfAdmin.setRouteCode("Route Code");
        actualRouteOfAdmin.setRouteDesc("Route Desc");
        actualRouteOfAdmin.setRouteID(1);
        actualRouteOfAdmin.setRouteName("Route Name");
        actualRouteOfAdmin.setStatus("Status");
        String actualCreatedBy = actualRouteOfAdmin.getCreatedBy();
        Timestamp actualCreatedDate = actualRouteOfAdmin.getCreatedDate();
        Boolean actualDeleted = actualRouteOfAdmin.getDeleted();
        Timestamp actualLastModDate = actualRouteOfAdmin.getLastModDate();
        String actualModifiedBy = actualRouteOfAdmin.getModifiedBy();
        String actualProcessed = actualRouteOfAdmin.getProcessed();
        Integer actualProviderServiceMapID = actualRouteOfAdmin.getProviderServiceMapID();
        String actualRouteCode = actualRouteOfAdmin.getRouteCode();
        String actualRouteDesc = actualRouteOfAdmin.getRouteDesc();
        Integer actualRouteID = actualRouteOfAdmin.getRouteID();
        String actualRouteName = actualRouteOfAdmin.getRouteName();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualProcessed);
        assertEquals("Route Code", actualRouteCode);
        assertEquals("Route Desc", actualRouteDesc);
        assertEquals("Route Name", actualRouteName);
        assertEquals("Status", actualRouteOfAdmin.getStatus());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualRouteID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link RouteOfAdmin#RouteOfAdmin(Integer, String)}
     *   <li>{@link RouteOfAdmin#setCreatedBy(String)}
     *   <li>{@link RouteOfAdmin#setCreatedDate(Timestamp)}
     *   <li>{@link RouteOfAdmin#setDeleted(Boolean)}
     *   <li>{@link RouteOfAdmin#setLastModDate(Timestamp)}
     *   <li>{@link RouteOfAdmin#setModifiedBy(String)}
     *   <li>{@link RouteOfAdmin#setProcessed(String)}
     *   <li>{@link RouteOfAdmin#setProviderServiceMapID(Integer)}
     *   <li>{@link RouteOfAdmin#setRouteCode(String)}
     *   <li>{@link RouteOfAdmin#setRouteDesc(String)}
     *   <li>{@link RouteOfAdmin#setRouteID(Integer)}
     *   <li>{@link RouteOfAdmin#setRouteName(String)}
     *   <li>{@link RouteOfAdmin#setStatus(String)}
     *   <li>{@link RouteOfAdmin#getCreatedBy()}
     *   <li>{@link RouteOfAdmin#getCreatedDate()}
     *   <li>{@link RouteOfAdmin#getDeleted()}
     *   <li>{@link RouteOfAdmin#getLastModDate()}
     *   <li>{@link RouteOfAdmin#getModifiedBy()}
     *   <li>{@link RouteOfAdmin#getProcessed()}
     *   <li>{@link RouteOfAdmin#getProviderServiceMapID()}
     *   <li>{@link RouteOfAdmin#getRouteCode()}
     *   <li>{@link RouteOfAdmin#getRouteDesc()}
     *   <li>{@link RouteOfAdmin#getRouteID()}
     *   <li>{@link RouteOfAdmin#getRouteName()}
     *   <li>{@link RouteOfAdmin#getStatus()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        RouteOfAdmin actualRouteOfAdmin = new RouteOfAdmin(1, "Route Name");
        actualRouteOfAdmin.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualRouteOfAdmin.setCreatedDate(createdDate);
        actualRouteOfAdmin.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualRouteOfAdmin.setLastModDate(lastModDate);
        actualRouteOfAdmin.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualRouteOfAdmin.setProcessed("Processed");
        actualRouteOfAdmin.setProviderServiceMapID(1);
        actualRouteOfAdmin.setRouteCode("Route Code");
        actualRouteOfAdmin.setRouteDesc("Route Desc");
        actualRouteOfAdmin.setRouteID(1);
        actualRouteOfAdmin.setRouteName("Route Name");
        actualRouteOfAdmin.setStatus("Status");
        String actualCreatedBy = actualRouteOfAdmin.getCreatedBy();
        Timestamp actualCreatedDate = actualRouteOfAdmin.getCreatedDate();
        Boolean actualDeleted = actualRouteOfAdmin.getDeleted();
        Timestamp actualLastModDate = actualRouteOfAdmin.getLastModDate();
        String actualModifiedBy = actualRouteOfAdmin.getModifiedBy();
        String actualProcessed = actualRouteOfAdmin.getProcessed();
        Integer actualProviderServiceMapID = actualRouteOfAdmin.getProviderServiceMapID();
        String actualRouteCode = actualRouteOfAdmin.getRouteCode();
        String actualRouteDesc = actualRouteOfAdmin.getRouteDesc();
        Integer actualRouteID = actualRouteOfAdmin.getRouteID();
        String actualRouteName = actualRouteOfAdmin.getRouteName();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualProcessed);
        assertEquals("Route Code", actualRouteCode);
        assertEquals("Route Desc", actualRouteDesc);
        assertEquals("Route Name", actualRouteName);
        assertEquals("Status", actualRouteOfAdmin.getStatus());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualRouteID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
