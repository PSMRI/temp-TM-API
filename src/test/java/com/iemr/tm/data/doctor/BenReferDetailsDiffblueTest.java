package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import com.iemr.tm.data.masterdata.anc.ServiceMaster;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BenReferDetailsDiffblueTest {
    /**
     * Method under test: {@link BenReferDetails#getBenReferDetails(ArrayList)}
     */
    @Test
    void testGetBenReferDetails() {
        // Arrange, Act and Assert
        assertNull(BenReferDetails.getBenReferDetails(new ArrayList<>()));
        assertNull(BenReferDetails.getBenReferDetails(null));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link BenReferDetails#BenReferDetails()}
     *   <li>{@link BenReferDetails#setBenReferID(Long)}
     *   <li>{@link BenReferDetails#setBenVisitID(Long)}
     *   <li>{@link BenReferDetails#setBeneficiaryRegID(Long)}
     *   <li>{@link BenReferDetails#setCreatedBy(String)}
     *   <li>{@link BenReferDetails#setCreatedDate(Timestamp)}
     *   <li>{@link BenReferDetails#setDeleted(Boolean)}
     *   <li>{@link BenReferDetails#setLastModDate(Timestamp)}
     *   <li>{@link BenReferDetails#setModifiedBy(String)}
     *   <li>{@link BenReferDetails#setParkingPlaceID(Integer)}
     *   <li>{@link BenReferDetails#setProcessed(String)}
     *   <li>{@link BenReferDetails#setProviderServiceMapID(Integer)}
     *   <li>{@link BenReferDetails#setReferralReason(String)}
     *   <li>{@link BenReferDetails#setReferredToInstituteID(Integer)}
     *   <li>{@link BenReferDetails#setReferredToInstituteName(String)}
     *   <li>{@link BenReferDetails#setRefrredToAdditionalServiceList(ArrayList)}
     *   <li>{@link BenReferDetails#setReservedForChange(String)}
     *   <li>{@link BenReferDetails#setRevisitDate(Timestamp)}
     *   <li>{@link BenReferDetails#setServiceID(Short)}
     *   <li>{@link BenReferDetails#setServiceName(String)}
     *   <li>{@link BenReferDetails#setSyncedBy(String)}
     *   <li>{@link BenReferDetails#setSyncedDate(Timestamp)}
     *   <li>{@link BenReferDetails#setVanID(Integer)}
     *   <li>{@link BenReferDetails#setVanSerialNo(Long)}
     *   <li>{@link BenReferDetails#setVehicalNo(String)}
     *   <li>{@link BenReferDetails#setVisitCode(Long)}
     *   <li>{@link BenReferDetails#getBenReferID()}
     *   <li>{@link BenReferDetails#getBenVisitID()}
     *   <li>{@link BenReferDetails#getBeneficiaryRegID()}
     *   <li>{@link BenReferDetails#getCreatedBy()}
     *   <li>{@link BenReferDetails#getCreatedDate()}
     *   <li>{@link BenReferDetails#getDeleted()}
     *   <li>{@link BenReferDetails#getLastModDate()}
     *   <li>{@link BenReferDetails#getModifiedBy()}
     *   <li>{@link BenReferDetails#getParkingPlaceID()}
     *   <li>{@link BenReferDetails#getProcessed()}
     *   <li>{@link BenReferDetails#getProviderServiceMapID()}
     *   <li>{@link BenReferDetails#getReferralReason()}
     *   <li>{@link BenReferDetails#getReferredToInstituteID()}
     *   <li>{@link BenReferDetails#getReferredToInstituteName()}
     *   <li>{@link BenReferDetails#getRefrredToAdditionalServiceList()}
     *   <li>{@link BenReferDetails#getReservedForChange()}
     *   <li>{@link BenReferDetails#getRevisitDate()}
     *   <li>{@link BenReferDetails#getServiceID()}
     *   <li>{@link BenReferDetails#getServiceName()}
     *   <li>{@link BenReferDetails#getSyncedBy()}
     *   <li>{@link BenReferDetails#getSyncedDate()}
     *   <li>{@link BenReferDetails#getVanID()}
     *   <li>{@link BenReferDetails#getVanSerialNo()}
     *   <li>{@link BenReferDetails#getVehicalNo()}
     *   <li>{@link BenReferDetails#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        BenReferDetails actualBenReferDetails = new BenReferDetails();
        actualBenReferDetails.setBenReferID(1L);
        actualBenReferDetails.setBenVisitID(1L);
        actualBenReferDetails.setBeneficiaryRegID(1L);
        actualBenReferDetails.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualBenReferDetails.setCreatedDate(createdDate);
        actualBenReferDetails.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualBenReferDetails.setLastModDate(lastModDate);
        actualBenReferDetails.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualBenReferDetails.setParkingPlaceID(1);
        actualBenReferDetails.setProcessed("Processed");
        actualBenReferDetails.setProviderServiceMapID(1);
        actualBenReferDetails.setReferralReason("Just cause");
        actualBenReferDetails.setReferredToInstituteID(1);
        actualBenReferDetails.setReferredToInstituteName("Referred To Institute Name");
        ArrayList<ServiceMaster> refrredToAdditionalServiceList = new ArrayList<>();
        actualBenReferDetails.setRefrredToAdditionalServiceList(refrredToAdditionalServiceList);
        actualBenReferDetails.setReservedForChange("Reserved For Change");
        Timestamp revisitDate = mock(Timestamp.class);
        actualBenReferDetails.setRevisitDate(revisitDate);
        actualBenReferDetails.setServiceID((short) 1);
        actualBenReferDetails.setServiceName("Service Name");
        actualBenReferDetails.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualBenReferDetails.setSyncedDate(syncedDate);
        actualBenReferDetails.setVanID(1);
        actualBenReferDetails.setVanSerialNo(1L);
        actualBenReferDetails.setVehicalNo("Vehical No");
        actualBenReferDetails.setVisitCode(1L);
        Long actualBenReferID = actualBenReferDetails.getBenReferID();
        Long actualBenVisitID = actualBenReferDetails.getBenVisitID();
        Long actualBeneficiaryRegID = actualBenReferDetails.getBeneficiaryRegID();
        String actualCreatedBy = actualBenReferDetails.getCreatedBy();
        Timestamp actualCreatedDate = actualBenReferDetails.getCreatedDate();
        Boolean actualDeleted = actualBenReferDetails.getDeleted();
        Timestamp actualLastModDate = actualBenReferDetails.getLastModDate();
        String actualModifiedBy = actualBenReferDetails.getModifiedBy();
        Integer actualParkingPlaceID = actualBenReferDetails.getParkingPlaceID();
        String actualProcessed = actualBenReferDetails.getProcessed();
        Integer actualProviderServiceMapID = actualBenReferDetails.getProviderServiceMapID();
        String actualReferralReason = actualBenReferDetails.getReferralReason();
        Integer actualReferredToInstituteID = actualBenReferDetails.getReferredToInstituteID();
        String actualReferredToInstituteName = actualBenReferDetails.getReferredToInstituteName();
        ArrayList<ServiceMaster> actualRefrredToAdditionalServiceList = actualBenReferDetails
                .getRefrredToAdditionalServiceList();
        String actualReservedForChange = actualBenReferDetails.getReservedForChange();
        Timestamp actualRevisitDate = actualBenReferDetails.getRevisitDate();
        Short actualServiceID = actualBenReferDetails.getServiceID();
        String actualServiceName = actualBenReferDetails.getServiceName();
        String actualSyncedBy = actualBenReferDetails.getSyncedBy();
        Timestamp actualSyncedDate = actualBenReferDetails.getSyncedDate();
        Integer actualVanID = actualBenReferDetails.getVanID();
        Long actualVanSerialNo = actualBenReferDetails.getVanSerialNo();
        String actualVehicalNo = actualBenReferDetails.getVehicalNo();
        Long actualVisitCode = actualBenReferDetails.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Just cause", actualReferralReason);
        assertEquals("Processed", actualProcessed);
        assertEquals("Referred To Institute Name", actualReferredToInstituteName);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Service Name", actualServiceName);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualReferredToInstituteID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenReferID.longValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertEquals((short) 1, actualServiceID.shortValue());
        assertTrue(actualDeleted);
        assertSame(refrredToAdditionalServiceList, actualRefrredToAdditionalServiceList);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(revisitDate, actualRevisitDate);
        assertSame(syncedDate, actualSyncedDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link BenReferDetails#BenReferDetails(Long, Long, Long, Integer, Integer, String, Short, String, Long, Timestamp, String, Timestamp)}
     *   <li>{@link BenReferDetails#setBenReferID(Long)}
     *   <li>{@link BenReferDetails#setBenVisitID(Long)}
     *   <li>{@link BenReferDetails#setBeneficiaryRegID(Long)}
     *   <li>{@link BenReferDetails#setCreatedBy(String)}
     *   <li>{@link BenReferDetails#setCreatedDate(Timestamp)}
     *   <li>{@link BenReferDetails#setDeleted(Boolean)}
     *   <li>{@link BenReferDetails#setLastModDate(Timestamp)}
     *   <li>{@link BenReferDetails#setModifiedBy(String)}
     *   <li>{@link BenReferDetails#setParkingPlaceID(Integer)}
     *   <li>{@link BenReferDetails#setProcessed(String)}
     *   <li>{@link BenReferDetails#setProviderServiceMapID(Integer)}
     *   <li>{@link BenReferDetails#setReferralReason(String)}
     *   <li>{@link BenReferDetails#setReferredToInstituteID(Integer)}
     *   <li>{@link BenReferDetails#setReferredToInstituteName(String)}
     *   <li>{@link BenReferDetails#setRefrredToAdditionalServiceList(ArrayList)}
     *   <li>{@link BenReferDetails#setReservedForChange(String)}
     *   <li>{@link BenReferDetails#setRevisitDate(Timestamp)}
     *   <li>{@link BenReferDetails#setServiceID(Short)}
     *   <li>{@link BenReferDetails#setServiceName(String)}
     *   <li>{@link BenReferDetails#setSyncedBy(String)}
     *   <li>{@link BenReferDetails#setSyncedDate(Timestamp)}
     *   <li>{@link BenReferDetails#setVanID(Integer)}
     *   <li>{@link BenReferDetails#setVanSerialNo(Long)}
     *   <li>{@link BenReferDetails#setVehicalNo(String)}
     *   <li>{@link BenReferDetails#setVisitCode(Long)}
     *   <li>{@link BenReferDetails#getBenReferID()}
     *   <li>{@link BenReferDetails#getBenVisitID()}
     *   <li>{@link BenReferDetails#getBeneficiaryRegID()}
     *   <li>{@link BenReferDetails#getCreatedBy()}
     *   <li>{@link BenReferDetails#getCreatedDate()}
     *   <li>{@link BenReferDetails#getDeleted()}
     *   <li>{@link BenReferDetails#getLastModDate()}
     *   <li>{@link BenReferDetails#getModifiedBy()}
     *   <li>{@link BenReferDetails#getParkingPlaceID()}
     *   <li>{@link BenReferDetails#getProcessed()}
     *   <li>{@link BenReferDetails#getProviderServiceMapID()}
     *   <li>{@link BenReferDetails#getReferralReason()}
     *   <li>{@link BenReferDetails#getReferredToInstituteID()}
     *   <li>{@link BenReferDetails#getReferredToInstituteName()}
     *   <li>{@link BenReferDetails#getRefrredToAdditionalServiceList()}
     *   <li>{@link BenReferDetails#getReservedForChange()}
     *   <li>{@link BenReferDetails#getRevisitDate()}
     *   <li>{@link BenReferDetails#getServiceID()}
     *   <li>{@link BenReferDetails#getServiceName()}
     *   <li>{@link BenReferDetails#getSyncedBy()}
     *   <li>{@link BenReferDetails#getSyncedDate()}
     *   <li>{@link BenReferDetails#getVanID()}
     *   <li>{@link BenReferDetails#getVanSerialNo()}
     *   <li>{@link BenReferDetails#getVehicalNo()}
     *   <li>{@link BenReferDetails#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        BenReferDetails actualBenReferDetails = new BenReferDetails(1L, 1L, 1L, 1, 1, "Referred To Institute Name",
                (short) 1, "Service Name", 1L, mock(Timestamp.class), "Just cause", mock(Timestamp.class));
        actualBenReferDetails.setBenReferID(1L);
        actualBenReferDetails.setBenVisitID(1L);
        actualBenReferDetails.setBeneficiaryRegID(1L);
        actualBenReferDetails.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualBenReferDetails.setCreatedDate(createdDate);
        actualBenReferDetails.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualBenReferDetails.setLastModDate(lastModDate);
        actualBenReferDetails.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualBenReferDetails.setParkingPlaceID(1);
        actualBenReferDetails.setProcessed("Processed");
        actualBenReferDetails.setProviderServiceMapID(1);
        actualBenReferDetails.setReferralReason("Just cause");
        actualBenReferDetails.setReferredToInstituteID(1);
        actualBenReferDetails.setReferredToInstituteName("Referred To Institute Name");
        ArrayList<ServiceMaster> refrredToAdditionalServiceList = new ArrayList<>();
        actualBenReferDetails.setRefrredToAdditionalServiceList(refrredToAdditionalServiceList);
        actualBenReferDetails.setReservedForChange("Reserved For Change");
        Timestamp revisitDate = mock(Timestamp.class);
        actualBenReferDetails.setRevisitDate(revisitDate);
        actualBenReferDetails.setServiceID((short) 1);
        actualBenReferDetails.setServiceName("Service Name");
        actualBenReferDetails.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualBenReferDetails.setSyncedDate(syncedDate);
        actualBenReferDetails.setVanID(1);
        actualBenReferDetails.setVanSerialNo(1L);
        actualBenReferDetails.setVehicalNo("Vehical No");
        actualBenReferDetails.setVisitCode(1L);
        Long actualBenReferID = actualBenReferDetails.getBenReferID();
        Long actualBenVisitID = actualBenReferDetails.getBenVisitID();
        Long actualBeneficiaryRegID = actualBenReferDetails.getBeneficiaryRegID();
        String actualCreatedBy = actualBenReferDetails.getCreatedBy();
        Timestamp actualCreatedDate = actualBenReferDetails.getCreatedDate();
        Boolean actualDeleted = actualBenReferDetails.getDeleted();
        Timestamp actualLastModDate = actualBenReferDetails.getLastModDate();
        String actualModifiedBy = actualBenReferDetails.getModifiedBy();
        Integer actualParkingPlaceID = actualBenReferDetails.getParkingPlaceID();
        String actualProcessed = actualBenReferDetails.getProcessed();
        Integer actualProviderServiceMapID = actualBenReferDetails.getProviderServiceMapID();
        String actualReferralReason = actualBenReferDetails.getReferralReason();
        Integer actualReferredToInstituteID = actualBenReferDetails.getReferredToInstituteID();
        String actualReferredToInstituteName = actualBenReferDetails.getReferredToInstituteName();
        ArrayList<ServiceMaster> actualRefrredToAdditionalServiceList = actualBenReferDetails
                .getRefrredToAdditionalServiceList();
        String actualReservedForChange = actualBenReferDetails.getReservedForChange();
        Timestamp actualRevisitDate = actualBenReferDetails.getRevisitDate();
        Short actualServiceID = actualBenReferDetails.getServiceID();
        String actualServiceName = actualBenReferDetails.getServiceName();
        String actualSyncedBy = actualBenReferDetails.getSyncedBy();
        Timestamp actualSyncedDate = actualBenReferDetails.getSyncedDate();
        Integer actualVanID = actualBenReferDetails.getVanID();
        Long actualVanSerialNo = actualBenReferDetails.getVanSerialNo();
        String actualVehicalNo = actualBenReferDetails.getVehicalNo();
        Long actualVisitCode = actualBenReferDetails.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Just cause", actualReferralReason);
        assertEquals("Processed", actualProcessed);
        assertEquals("Referred To Institute Name", actualReferredToInstituteName);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Service Name", actualServiceName);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualReferredToInstituteID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenReferID.longValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertEquals((short) 1, actualServiceID.shortValue());
        assertTrue(actualDeleted);
        assertSame(refrredToAdditionalServiceList, actualRefrredToAdditionalServiceList);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(revisitDate, actualRevisitDate);
        assertSame(syncedDate, actualSyncedDate);
    }
}
