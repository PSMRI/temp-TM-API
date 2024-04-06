package com.iemr.tm.data.login;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import com.iemr.tm.data.location.DistrictBranchMapping;

import java.sql.Date;
import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

class ServicePointVillageMappingDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ServicePointVillageMapping#ServicePointVillageMapping()}
     *   <li>{@link ServicePointVillageMapping#setCreatedBy(String)}
     *   <li>{@link ServicePointVillageMapping#setCreatedDate(Date)}
     *   <li>{@link ServicePointVillageMapping#setDeleted(Boolean)}
     *   <li>{@link ServicePointVillageMapping#setDistrictBranchID(Integer)}
     *   <li>
     * {@link ServicePointVillageMapping#setDistrictBranchMapping(DistrictBranchMapping)}
     *   <li>{@link ServicePointVillageMapping#setLastModDate(Date)}
     *   <li>{@link ServicePointVillageMapping#setModifiedBy(String)}
     *   <li>{@link ServicePointVillageMapping#setProcessed(String)}
     *   <li>{@link ServicePointVillageMapping#setProviderServiceMapID(Integer)}
     *   <li>{@link ServicePointVillageMapping#setServicePointID(Integer)}
     *   <li>{@link ServicePointVillageMapping#setVillageName(String)}
     *   <li>{@link ServicePointVillageMapping#getCreatedBy()}
     *   <li>{@link ServicePointVillageMapping#getCreatedDate()}
     *   <li>{@link ServicePointVillageMapping#getDeleted()}
     *   <li>{@link ServicePointVillageMapping#getDistrictBranchID()}
     *   <li>{@link ServicePointVillageMapping#getDistrictBranchMapping()}
     *   <li>{@link ServicePointVillageMapping#getLastModDate()}
     *   <li>{@link ServicePointVillageMapping#getModifiedBy()}
     *   <li>{@link ServicePointVillageMapping#getProcessed()}
     *   <li>{@link ServicePointVillageMapping#getProviderServiceMapID()}
     *   <li>{@link ServicePointVillageMapping#getServicePointID()}
     *   <li>{@link ServicePointVillageMapping#getServicePointVillageMapID()}
     *   <li>{@link ServicePointVillageMapping#getVillageName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        ServicePointVillageMapping actualServicePointVillageMapping = new ServicePointVillageMapping();
        actualServicePointVillageMapping.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Date createdDate = mock(Date.class);
        actualServicePointVillageMapping.setCreatedDate(createdDate);
        actualServicePointVillageMapping.setDeleted(true);
        actualServicePointVillageMapping.setDistrictBranchID(1);
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
        actualServicePointVillageMapping.setDistrictBranchMapping(districtBranchMapping);
        Date lastModDate = mock(Date.class);
        actualServicePointVillageMapping.setLastModDate(lastModDate);
        actualServicePointVillageMapping.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualServicePointVillageMapping.setProcessed("Processed");
        actualServicePointVillageMapping.setProviderServiceMapID(1);
        actualServicePointVillageMapping.setServicePointID(1);
        actualServicePointVillageMapping.setVillageName("Village Name");
        String actualCreatedBy = actualServicePointVillageMapping.getCreatedBy();
        Date actualCreatedDate = actualServicePointVillageMapping.getCreatedDate();
        Boolean actualDeleted = actualServicePointVillageMapping.getDeleted();
        Integer actualDistrictBranchID = actualServicePointVillageMapping.getDistrictBranchID();
        DistrictBranchMapping actualDistrictBranchMapping = actualServicePointVillageMapping.getDistrictBranchMapping();
        Date actualLastModDate = actualServicePointVillageMapping.getLastModDate();
        String actualModifiedBy = actualServicePointVillageMapping.getModifiedBy();
        String actualProcessed = actualServicePointVillageMapping.getProcessed();
        Integer actualProviderServiceMapID = actualServicePointVillageMapping.getProviderServiceMapID();
        Integer actualServicePointID = actualServicePointVillageMapping.getServicePointID();
        actualServicePointVillageMapping.getServicePointVillageMapID();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualProcessed);
        assertEquals("Village Name", actualServicePointVillageMapping.getVillageName());
        assertEquals(1, actualDistrictBranchID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualServicePointID.intValue());
        assertTrue(actualDeleted);
        assertSame(districtBranchMapping, actualDistrictBranchMapping);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link ServicePointVillageMapping#ServicePointVillageMapping(Integer, String)}
     *   <li>{@link ServicePointVillageMapping#setCreatedBy(String)}
     *   <li>{@link ServicePointVillageMapping#setCreatedDate(Date)}
     *   <li>{@link ServicePointVillageMapping#setDeleted(Boolean)}
     *   <li>{@link ServicePointVillageMapping#setDistrictBranchID(Integer)}
     *   <li>
     * {@link ServicePointVillageMapping#setDistrictBranchMapping(DistrictBranchMapping)}
     *   <li>{@link ServicePointVillageMapping#setLastModDate(Date)}
     *   <li>{@link ServicePointVillageMapping#setModifiedBy(String)}
     *   <li>{@link ServicePointVillageMapping#setProcessed(String)}
     *   <li>{@link ServicePointVillageMapping#setProviderServiceMapID(Integer)}
     *   <li>{@link ServicePointVillageMapping#setServicePointID(Integer)}
     *   <li>{@link ServicePointVillageMapping#setVillageName(String)}
     *   <li>{@link ServicePointVillageMapping#getCreatedBy()}
     *   <li>{@link ServicePointVillageMapping#getCreatedDate()}
     *   <li>{@link ServicePointVillageMapping#getDeleted()}
     *   <li>{@link ServicePointVillageMapping#getDistrictBranchID()}
     *   <li>{@link ServicePointVillageMapping#getDistrictBranchMapping()}
     *   <li>{@link ServicePointVillageMapping#getLastModDate()}
     *   <li>{@link ServicePointVillageMapping#getModifiedBy()}
     *   <li>{@link ServicePointVillageMapping#getProcessed()}
     *   <li>{@link ServicePointVillageMapping#getProviderServiceMapID()}
     *   <li>{@link ServicePointVillageMapping#getServicePointID()}
     *   <li>{@link ServicePointVillageMapping#getServicePointVillageMapID()}
     *   <li>{@link ServicePointVillageMapping#getVillageName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        ServicePointVillageMapping actualServicePointVillageMapping = new ServicePointVillageMapping(1, "Village Name");
        actualServicePointVillageMapping.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Date createdDate = mock(Date.class);
        actualServicePointVillageMapping.setCreatedDate(createdDate);
        actualServicePointVillageMapping.setDeleted(true);
        actualServicePointVillageMapping.setDistrictBranchID(1);
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
        actualServicePointVillageMapping.setDistrictBranchMapping(districtBranchMapping);
        Date lastModDate = mock(Date.class);
        actualServicePointVillageMapping.setLastModDate(lastModDate);
        actualServicePointVillageMapping.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualServicePointVillageMapping.setProcessed("Processed");
        actualServicePointVillageMapping.setProviderServiceMapID(1);
        actualServicePointVillageMapping.setServicePointID(1);
        actualServicePointVillageMapping.setVillageName("Village Name");
        String actualCreatedBy = actualServicePointVillageMapping.getCreatedBy();
        Date actualCreatedDate = actualServicePointVillageMapping.getCreatedDate();
        Boolean actualDeleted = actualServicePointVillageMapping.getDeleted();
        Integer actualDistrictBranchID = actualServicePointVillageMapping.getDistrictBranchID();
        DistrictBranchMapping actualDistrictBranchMapping = actualServicePointVillageMapping.getDistrictBranchMapping();
        Date actualLastModDate = actualServicePointVillageMapping.getLastModDate();
        String actualModifiedBy = actualServicePointVillageMapping.getModifiedBy();
        String actualProcessed = actualServicePointVillageMapping.getProcessed();
        Integer actualProviderServiceMapID = actualServicePointVillageMapping.getProviderServiceMapID();
        Integer actualServicePointID = actualServicePointVillageMapping.getServicePointID();
        actualServicePointVillageMapping.getServicePointVillageMapID();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualProcessed);
        assertEquals("Village Name", actualServicePointVillageMapping.getVillageName());
        assertEquals(1, actualDistrictBranchID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualServicePointID.intValue());
        assertTrue(actualDeleted);
        assertSame(districtBranchMapping, actualDistrictBranchMapping);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
