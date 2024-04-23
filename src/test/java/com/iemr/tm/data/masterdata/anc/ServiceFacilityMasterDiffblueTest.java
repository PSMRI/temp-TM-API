package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ServiceFacilityMasterDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ServiceFacilityMaster#setDeleted(Boolean)}
     *   <li>{@link ServiceFacilityMaster#setFacilityName(String)}
     *   <li>{@link ServiceFacilityMaster#setServiceFacilityID(Integer)}
     *   <li>{@link ServiceFacilityMaster#getDeleted()}
     *   <li>{@link ServiceFacilityMaster#getFacilityName()}
     *   <li>{@link ServiceFacilityMaster#getServiceFacilityID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        ServiceFacilityMaster serviceFacilityMaster = new ServiceFacilityMaster();

        // Act
        serviceFacilityMaster.setDeleted(true);
        serviceFacilityMaster.setFacilityName("Facility Name");
        serviceFacilityMaster.setServiceFacilityID(1);
        Boolean actualDeleted = serviceFacilityMaster.getDeleted();
        String actualFacilityName = serviceFacilityMaster.getFacilityName();

        // Assert that nothing has changed
        assertEquals("Facility Name", actualFacilityName);
        assertEquals(1, serviceFacilityMaster.getServiceFacilityID().intValue());
        assertTrue(actualDeleted);
    }
}
