package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

class CancerLymphNodeDetailsDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CancerLymphNodeDetails#CancerLymphNodeDetails()}
     *   <li>{@link CancerLymphNodeDetails#setBenVisitID(Long)}
     *   <li>{@link CancerLymphNodeDetails#setBeneficiaryRegID(Long)}
     *   <li>{@link CancerLymphNodeDetails#setCreatedBy(String)}
     *   <li>{@link CancerLymphNodeDetails#setCreatedDate(Timestamp)}
     *   <li>{@link CancerLymphNodeDetails#setDeleted(Boolean)}
     *   <li>{@link CancerLymphNodeDetails#setID(Long)}
     *   <li>{@link CancerLymphNodeDetails#setLastModDate(Timestamp)}
     *   <li>{@link CancerLymphNodeDetails#setLymphNodeName(String)}
     *   <li>{@link CancerLymphNodeDetails#setMobility_Left(Boolean)}
     *   <li>{@link CancerLymphNodeDetails#setMobility_Right(Boolean)}
     *   <li>{@link CancerLymphNodeDetails#setModifiedBy(String)}
     *   <li>{@link CancerLymphNodeDetails#setParkingPlaceID(Integer)}
     *   <li>{@link CancerLymphNodeDetails#setProcessed(String)}
     *   <li>{@link CancerLymphNodeDetails#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerLymphNodeDetails#setReservedForChange(String)}
     *   <li>{@link CancerLymphNodeDetails#setSize_Left(String)}
     *   <li>{@link CancerLymphNodeDetails#setSize_Right(String)}
     *   <li>{@link CancerLymphNodeDetails#setSyncedBy(String)}
     *   <li>{@link CancerLymphNodeDetails#setSyncedDate(Timestamp)}
     *   <li>{@link CancerLymphNodeDetails#setVanID(Integer)}
     *   <li>{@link CancerLymphNodeDetails#setVanSerialNo(Long)}
     *   <li>{@link CancerLymphNodeDetails#setVehicalNo(String)}
     *   <li>{@link CancerLymphNodeDetails#setVisitCode(Long)}
     *   <li>{@link CancerLymphNodeDetails#getBenVisitID()}
     *   <li>{@link CancerLymphNodeDetails#getBeneficiaryRegID()}
     *   <li>{@link CancerLymphNodeDetails#getCreatedBy()}
     *   <li>{@link CancerLymphNodeDetails#getCreatedDate()}
     *   <li>{@link CancerLymphNodeDetails#getDeleted()}
     *   <li>{@link CancerLymphNodeDetails#getID()}
     *   <li>{@link CancerLymphNodeDetails#getLastModDate()}
     *   <li>{@link CancerLymphNodeDetails#getLymphNodeName()}
     *   <li>{@link CancerLymphNodeDetails#getMobility_Left()}
     *   <li>{@link CancerLymphNodeDetails#getMobility_Right()}
     *   <li>{@link CancerLymphNodeDetails#getModifiedBy()}
     *   <li>{@link CancerLymphNodeDetails#getParkingPlaceID()}
     *   <li>{@link CancerLymphNodeDetails#getProcessed()}
     *   <li>{@link CancerLymphNodeDetails#getProviderServiceMapID()}
     *   <li>{@link CancerLymphNodeDetails#getReservedForChange()}
     *   <li>{@link CancerLymphNodeDetails#getSize_Left()}
     *   <li>{@link CancerLymphNodeDetails#getSize_Right()}
     *   <li>{@link CancerLymphNodeDetails#getSyncedBy()}
     *   <li>{@link CancerLymphNodeDetails#getSyncedDate()}
     *   <li>{@link CancerLymphNodeDetails#getVanID()}
     *   <li>{@link CancerLymphNodeDetails#getVanSerialNo()}
     *   <li>{@link CancerLymphNodeDetails#getVehicalNo()}
     *   <li>{@link CancerLymphNodeDetails#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        CancerLymphNodeDetails actualCancerLymphNodeDetails = new CancerLymphNodeDetails();
        actualCancerLymphNodeDetails.setBenVisitID(1L);
        actualCancerLymphNodeDetails.setBeneficiaryRegID(1L);
        actualCancerLymphNodeDetails.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerLymphNodeDetails.setCreatedDate(createdDate);
        actualCancerLymphNodeDetails.setDeleted(true);
        actualCancerLymphNodeDetails.setID(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerLymphNodeDetails.setLastModDate(lastModDate);
        actualCancerLymphNodeDetails.setLymphNodeName("Lymph Node Name");
        actualCancerLymphNodeDetails.setMobility_Left(true);
        actualCancerLymphNodeDetails.setMobility_Right(true);
        actualCancerLymphNodeDetails.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerLymphNodeDetails.setParkingPlaceID(1);
        actualCancerLymphNodeDetails.setProcessed("Processed");
        actualCancerLymphNodeDetails.setProviderServiceMapID(1);
        actualCancerLymphNodeDetails.setReservedForChange("Reserved For Change");
        actualCancerLymphNodeDetails.setSize_Left("Size Left");
        actualCancerLymphNodeDetails.setSize_Right("Size Right");
        actualCancerLymphNodeDetails.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerLymphNodeDetails.setSyncedDate(syncedDate);
        actualCancerLymphNodeDetails.setVanID(1);
        actualCancerLymphNodeDetails.setVanSerialNo(1L);
        actualCancerLymphNodeDetails.setVehicalNo("Vehical No");
        actualCancerLymphNodeDetails.setVisitCode(1L);
        Long actualBenVisitID = actualCancerLymphNodeDetails.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerLymphNodeDetails.getBeneficiaryRegID();
        String actualCreatedBy = actualCancerLymphNodeDetails.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerLymphNodeDetails.getCreatedDate();
        Boolean actualDeleted = actualCancerLymphNodeDetails.getDeleted();
        Long actualID = actualCancerLymphNodeDetails.getID();
        Timestamp actualLastModDate = actualCancerLymphNodeDetails.getLastModDate();
        String actualLymphNodeName = actualCancerLymphNodeDetails.getLymphNodeName();
        Boolean actualMobility_Left = actualCancerLymphNodeDetails.getMobility_Left();
        Boolean actualMobility_Right = actualCancerLymphNodeDetails.getMobility_Right();
        String actualModifiedBy = actualCancerLymphNodeDetails.getModifiedBy();
        Integer actualParkingPlaceID = actualCancerLymphNodeDetails.getParkingPlaceID();
        String actualProcessed = actualCancerLymphNodeDetails.getProcessed();
        Integer actualProviderServiceMapID = actualCancerLymphNodeDetails.getProviderServiceMapID();
        String actualReservedForChange = actualCancerLymphNodeDetails.getReservedForChange();
        String actualSize_Left = actualCancerLymphNodeDetails.getSize_Left();
        String actualSize_Right = actualCancerLymphNodeDetails.getSize_Right();
        String actualSyncedBy = actualCancerLymphNodeDetails.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerLymphNodeDetails.getSyncedDate();
        Integer actualVanID = actualCancerLymphNodeDetails.getVanID();
        Long actualVanSerialNo = actualCancerLymphNodeDetails.getVanSerialNo();
        String actualVehicalNo = actualCancerLymphNodeDetails.getVehicalNo();
        Long actualVisitCode = actualCancerLymphNodeDetails.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Lymph Node Name", actualLymphNodeName);
        assertEquals("Processed", actualProcessed);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Size Left", actualSize_Left);
        assertEquals("Size Right", actualSize_Right);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualID.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertTrue(actualDeleted);
        assertTrue(actualMobility_Left);
        assertTrue(actualMobility_Right);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link CancerLymphNodeDetails#CancerLymphNodeDetails(Long, Long, Long, Integer, String, Boolean, String, Boolean, String, Boolean, String, String, Timestamp, String, Timestamp)}
     *   <li>{@link CancerLymphNodeDetails#setBenVisitID(Long)}
     *   <li>{@link CancerLymphNodeDetails#setBeneficiaryRegID(Long)}
     *   <li>{@link CancerLymphNodeDetails#setCreatedBy(String)}
     *   <li>{@link CancerLymphNodeDetails#setCreatedDate(Timestamp)}
     *   <li>{@link CancerLymphNodeDetails#setDeleted(Boolean)}
     *   <li>{@link CancerLymphNodeDetails#setID(Long)}
     *   <li>{@link CancerLymphNodeDetails#setLastModDate(Timestamp)}
     *   <li>{@link CancerLymphNodeDetails#setLymphNodeName(String)}
     *   <li>{@link CancerLymphNodeDetails#setMobility_Left(Boolean)}
     *   <li>{@link CancerLymphNodeDetails#setMobility_Right(Boolean)}
     *   <li>{@link CancerLymphNodeDetails#setModifiedBy(String)}
     *   <li>{@link CancerLymphNodeDetails#setParkingPlaceID(Integer)}
     *   <li>{@link CancerLymphNodeDetails#setProcessed(String)}
     *   <li>{@link CancerLymphNodeDetails#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerLymphNodeDetails#setReservedForChange(String)}
     *   <li>{@link CancerLymphNodeDetails#setSize_Left(String)}
     *   <li>{@link CancerLymphNodeDetails#setSize_Right(String)}
     *   <li>{@link CancerLymphNodeDetails#setSyncedBy(String)}
     *   <li>{@link CancerLymphNodeDetails#setSyncedDate(Timestamp)}
     *   <li>{@link CancerLymphNodeDetails#setVanID(Integer)}
     *   <li>{@link CancerLymphNodeDetails#setVanSerialNo(Long)}
     *   <li>{@link CancerLymphNodeDetails#setVehicalNo(String)}
     *   <li>{@link CancerLymphNodeDetails#setVisitCode(Long)}
     *   <li>{@link CancerLymphNodeDetails#getBenVisitID()}
     *   <li>{@link CancerLymphNodeDetails#getBeneficiaryRegID()}
     *   <li>{@link CancerLymphNodeDetails#getCreatedBy()}
     *   <li>{@link CancerLymphNodeDetails#getCreatedDate()}
     *   <li>{@link CancerLymphNodeDetails#getDeleted()}
     *   <li>{@link CancerLymphNodeDetails#getID()}
     *   <li>{@link CancerLymphNodeDetails#getLastModDate()}
     *   <li>{@link CancerLymphNodeDetails#getLymphNodeName()}
     *   <li>{@link CancerLymphNodeDetails#getMobility_Left()}
     *   <li>{@link CancerLymphNodeDetails#getMobility_Right()}
     *   <li>{@link CancerLymphNodeDetails#getModifiedBy()}
     *   <li>{@link CancerLymphNodeDetails#getParkingPlaceID()}
     *   <li>{@link CancerLymphNodeDetails#getProcessed()}
     *   <li>{@link CancerLymphNodeDetails#getProviderServiceMapID()}
     *   <li>{@link CancerLymphNodeDetails#getReservedForChange()}
     *   <li>{@link CancerLymphNodeDetails#getSize_Left()}
     *   <li>{@link CancerLymphNodeDetails#getSize_Right()}
     *   <li>{@link CancerLymphNodeDetails#getSyncedBy()}
     *   <li>{@link CancerLymphNodeDetails#getSyncedDate()}
     *   <li>{@link CancerLymphNodeDetails#getVanID()}
     *   <li>{@link CancerLymphNodeDetails#getVanSerialNo()}
     *   <li>{@link CancerLymphNodeDetails#getVehicalNo()}
     *   <li>{@link CancerLymphNodeDetails#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        CancerLymphNodeDetails actualCancerLymphNodeDetails = new CancerLymphNodeDetails(1L, 1L, 1L, 1, "Lymph Node Name",
                true, "Size Left", true, "Size Right", true, "Processed", "Jan 1, 2020 8:00am GMT+0100", mock(Timestamp.class),
                "Jan 1, 2020 9:00am GMT+0100", mock(Timestamp.class));
        actualCancerLymphNodeDetails.setBenVisitID(1L);
        actualCancerLymphNodeDetails.setBeneficiaryRegID(1L);
        actualCancerLymphNodeDetails.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerLymphNodeDetails.setCreatedDate(createdDate);
        actualCancerLymphNodeDetails.setDeleted(true);
        actualCancerLymphNodeDetails.setID(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerLymphNodeDetails.setLastModDate(lastModDate);
        actualCancerLymphNodeDetails.setLymphNodeName("Lymph Node Name");
        actualCancerLymphNodeDetails.setMobility_Left(true);
        actualCancerLymphNodeDetails.setMobility_Right(true);
        actualCancerLymphNodeDetails.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerLymphNodeDetails.setParkingPlaceID(1);
        actualCancerLymphNodeDetails.setProcessed("Processed");
        actualCancerLymphNodeDetails.setProviderServiceMapID(1);
        actualCancerLymphNodeDetails.setReservedForChange("Reserved For Change");
        actualCancerLymphNodeDetails.setSize_Left("Size Left");
        actualCancerLymphNodeDetails.setSize_Right("Size Right");
        actualCancerLymphNodeDetails.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerLymphNodeDetails.setSyncedDate(syncedDate);
        actualCancerLymphNodeDetails.setVanID(1);
        actualCancerLymphNodeDetails.setVanSerialNo(1L);
        actualCancerLymphNodeDetails.setVehicalNo("Vehical No");
        actualCancerLymphNodeDetails.setVisitCode(1L);
        Long actualBenVisitID = actualCancerLymphNodeDetails.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerLymphNodeDetails.getBeneficiaryRegID();
        String actualCreatedBy = actualCancerLymphNodeDetails.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerLymphNodeDetails.getCreatedDate();
        Boolean actualDeleted = actualCancerLymphNodeDetails.getDeleted();
        Long actualID = actualCancerLymphNodeDetails.getID();
        Timestamp actualLastModDate = actualCancerLymphNodeDetails.getLastModDate();
        String actualLymphNodeName = actualCancerLymphNodeDetails.getLymphNodeName();
        Boolean actualMobility_Left = actualCancerLymphNodeDetails.getMobility_Left();
        Boolean actualMobility_Right = actualCancerLymphNodeDetails.getMobility_Right();
        String actualModifiedBy = actualCancerLymphNodeDetails.getModifiedBy();
        Integer actualParkingPlaceID = actualCancerLymphNodeDetails.getParkingPlaceID();
        String actualProcessed = actualCancerLymphNodeDetails.getProcessed();
        Integer actualProviderServiceMapID = actualCancerLymphNodeDetails.getProviderServiceMapID();
        String actualReservedForChange = actualCancerLymphNodeDetails.getReservedForChange();
        String actualSize_Left = actualCancerLymphNodeDetails.getSize_Left();
        String actualSize_Right = actualCancerLymphNodeDetails.getSize_Right();
        String actualSyncedBy = actualCancerLymphNodeDetails.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerLymphNodeDetails.getSyncedDate();
        Integer actualVanID = actualCancerLymphNodeDetails.getVanID();
        Long actualVanSerialNo = actualCancerLymphNodeDetails.getVanSerialNo();
        String actualVehicalNo = actualCancerLymphNodeDetails.getVehicalNo();
        Long actualVisitCode = actualCancerLymphNodeDetails.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Lymph Node Name", actualLymphNodeName);
        assertEquals("Processed", actualProcessed);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Size Left", actualSize_Left);
        assertEquals("Size Right", actualSize_Right);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualID.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertTrue(actualDeleted);
        assertTrue(actualMobility_Left);
        assertTrue(actualMobility_Right);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }
}
