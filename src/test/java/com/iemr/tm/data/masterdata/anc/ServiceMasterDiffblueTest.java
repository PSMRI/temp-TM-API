package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ServiceMasterDiffblueTest {
    /**
     * Method under test: {@link ServiceMaster#getServiceMaster(ArrayList)}
     */
    @Test
    void testGetServiceMaster() {
        // Arrange and Act
        ArrayList<ServiceMaster> actualServiceMaster = ServiceMaster.getServiceMaster(new ArrayList<>());

        // Assert
        assertTrue(actualServiceMaster.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ServiceMaster#ServiceMaster(Short, String)}
     *   <li>{@link ServiceMaster#setCreatedBy(String)}
     *   <li>{@link ServiceMaster#setCreatedDate(Timestamp)}
     *   <li>{@link ServiceMaster#setDeleted(Boolean)}
     *   <li>{@link ServiceMaster#setLastModDate(Timestamp)}
     *   <li>{@link ServiceMaster#setModifiedBy(String)}
     *   <li>{@link ServiceMaster#setProcessed(String)}
     *   <li>{@link ServiceMaster#setProviderServiceMapID(Integer)}
     *   <li>{@link ServiceMaster#setServiceDesc(String)}
     *   <li>{@link ServiceMaster#setServiceID(Short)}
     *   <li>{@link ServiceMaster#setServiceName(String)}
     *   <li>{@link ServiceMaster#getCreatedBy()}
     *   <li>{@link ServiceMaster#getCreatedDate()}
     *   <li>{@link ServiceMaster#getDeleted()}
     *   <li>{@link ServiceMaster#getLastModDate()}
     *   <li>{@link ServiceMaster#getModifiedBy()}
     *   <li>{@link ServiceMaster#getProcessed()}
     *   <li>{@link ServiceMaster#getProviderServiceMapID()}
     *   <li>{@link ServiceMaster#getServiceDesc()}
     *   <li>{@link ServiceMaster#getServiceID()}
     *   <li>{@link ServiceMaster#getServiceName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        ServiceMaster actualServiceMaster = new ServiceMaster((short) 1, "Service Name");
        actualServiceMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualServiceMaster.setCreatedDate(createdDate);
        actualServiceMaster.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualServiceMaster.setLastModDate(lastModDate);
        actualServiceMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualServiceMaster.setProcessed("Processed");
        actualServiceMaster.setProviderServiceMapID(1);
        actualServiceMaster.setServiceDesc("Service Desc");
        actualServiceMaster.setServiceID((short) 1);
        actualServiceMaster.setServiceName("Service Name");
        String actualCreatedBy = actualServiceMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualServiceMaster.getCreatedDate();
        Boolean actualDeleted = actualServiceMaster.getDeleted();
        Timestamp actualLastModDate = actualServiceMaster.getLastModDate();
        String actualModifiedBy = actualServiceMaster.getModifiedBy();
        String actualProcessed = actualServiceMaster.getProcessed();
        Integer actualProviderServiceMapID = actualServiceMaster.getProviderServiceMapID();
        String actualServiceDesc = actualServiceMaster.getServiceDesc();
        Short actualServiceID = actualServiceMaster.getServiceID();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualProcessed);
        assertEquals("Service Desc", actualServiceDesc);
        assertEquals("Service Name", actualServiceMaster.getServiceName());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals((short) 1, actualServiceID.shortValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ServiceMaster#ServiceMaster(Short, String, String)}
     *   <li>{@link ServiceMaster#setCreatedBy(String)}
     *   <li>{@link ServiceMaster#setCreatedDate(Timestamp)}
     *   <li>{@link ServiceMaster#setDeleted(Boolean)}
     *   <li>{@link ServiceMaster#setLastModDate(Timestamp)}
     *   <li>{@link ServiceMaster#setModifiedBy(String)}
     *   <li>{@link ServiceMaster#setProcessed(String)}
     *   <li>{@link ServiceMaster#setProviderServiceMapID(Integer)}
     *   <li>{@link ServiceMaster#setServiceDesc(String)}
     *   <li>{@link ServiceMaster#setServiceID(Short)}
     *   <li>{@link ServiceMaster#setServiceName(String)}
     *   <li>{@link ServiceMaster#getCreatedBy()}
     *   <li>{@link ServiceMaster#getCreatedDate()}
     *   <li>{@link ServiceMaster#getDeleted()}
     *   <li>{@link ServiceMaster#getLastModDate()}
     *   <li>{@link ServiceMaster#getModifiedBy()}
     *   <li>{@link ServiceMaster#getProcessed()}
     *   <li>{@link ServiceMaster#getProviderServiceMapID()}
     *   <li>{@link ServiceMaster#getServiceDesc()}
     *   <li>{@link ServiceMaster#getServiceID()}
     *   <li>{@link ServiceMaster#getServiceName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        ServiceMaster actualServiceMaster = new ServiceMaster((short) 1, "Service Name", "Service Desc");
        actualServiceMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualServiceMaster.setCreatedDate(createdDate);
        actualServiceMaster.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualServiceMaster.setLastModDate(lastModDate);
        actualServiceMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualServiceMaster.setProcessed("Processed");
        actualServiceMaster.setProviderServiceMapID(1);
        actualServiceMaster.setServiceDesc("Service Desc");
        actualServiceMaster.setServiceID((short) 1);
        actualServiceMaster.setServiceName("Service Name");
        String actualCreatedBy = actualServiceMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualServiceMaster.getCreatedDate();
        Boolean actualDeleted = actualServiceMaster.getDeleted();
        Timestamp actualLastModDate = actualServiceMaster.getLastModDate();
        String actualModifiedBy = actualServiceMaster.getModifiedBy();
        String actualProcessed = actualServiceMaster.getProcessed();
        Integer actualProviderServiceMapID = actualServiceMaster.getProviderServiceMapID();
        String actualServiceDesc = actualServiceMaster.getServiceDesc();
        Short actualServiceID = actualServiceMaster.getServiceID();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualProcessed);
        assertEquals("Service Desc", actualServiceDesc);
        assertEquals("Service Name", actualServiceMaster.getServiceName());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals((short) 1, actualServiceID.shortValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
