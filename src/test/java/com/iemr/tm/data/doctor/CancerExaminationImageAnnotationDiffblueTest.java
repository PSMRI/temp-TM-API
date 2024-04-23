package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

class CancerExaminationImageAnnotationDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link CancerExaminationImageAnnotation#CancerExaminationImageAnnotation()}
     *   <li>{@link CancerExaminationImageAnnotation#setBenVisitID(Long)}
     *   <li>{@link CancerExaminationImageAnnotation#setBeneficiaryRegID(Long)}
     *   <li>{@link CancerExaminationImageAnnotation#setCancerImageID(Integer)}
     *   <li>{@link CancerExaminationImageAnnotation#setCreatedBy(String)}
     *   <li>{@link CancerExaminationImageAnnotation#setCreatedDate(Timestamp)}
     *   <li>{@link CancerExaminationImageAnnotation#setDeleted(Boolean)}
     *   <li>{@link CancerExaminationImageAnnotation#setID(Long)}
     *   <li>{@link CancerExaminationImageAnnotation#setLastModDate(Timestamp)}
     *   <li>{@link CancerExaminationImageAnnotation#setModifiedBy(String)}
     *   <li>{@link CancerExaminationImageAnnotation#setParkingPlaceID(Integer)}
     *   <li>{@link CancerExaminationImageAnnotation#setPoint(Integer)}
     *   <li>{@link CancerExaminationImageAnnotation#setPointDesc(String)}
     *   <li>{@link CancerExaminationImageAnnotation#setProcessed(String)}
     *   <li>{@link CancerExaminationImageAnnotation#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerExaminationImageAnnotation#setReservedForChange(String)}
     *   <li>{@link CancerExaminationImageAnnotation#setSyncedBy(String)}
     *   <li>{@link CancerExaminationImageAnnotation#setSyncedDate(Timestamp)}
     *   <li>{@link CancerExaminationImageAnnotation#setVanID(Integer)}
     *   <li>{@link CancerExaminationImageAnnotation#setVanSerialNo(Long)}
     *   <li>{@link CancerExaminationImageAnnotation#setVehicalNo(String)}
     *   <li>{@link CancerExaminationImageAnnotation#setVisitCode(Long)}
     *   <li>{@link CancerExaminationImageAnnotation#setxCoordinate(Integer)}
     *   <li>{@link CancerExaminationImageAnnotation#setyCoordinate(Integer)}
     *   <li>{@link CancerExaminationImageAnnotation#getBenVisitID()}
     *   <li>{@link CancerExaminationImageAnnotation#getBeneficiaryRegID()}
     *   <li>{@link CancerExaminationImageAnnotation#getCancerImageID()}
     *   <li>{@link CancerExaminationImageAnnotation#getCreatedBy()}
     *   <li>{@link CancerExaminationImageAnnotation#getCreatedDate()}
     *   <li>{@link CancerExaminationImageAnnotation#getDeleted()}
     *   <li>{@link CancerExaminationImageAnnotation#getID()}
     *   <li>{@link CancerExaminationImageAnnotation#getLastModDate()}
     *   <li>{@link CancerExaminationImageAnnotation#getModifiedBy()}
     *   <li>{@link CancerExaminationImageAnnotation#getParkingPlaceID()}
     *   <li>{@link CancerExaminationImageAnnotation#getPoint()}
     *   <li>{@link CancerExaminationImageAnnotation#getPointDesc()}
     *   <li>{@link CancerExaminationImageAnnotation#getProcessed()}
     *   <li>{@link CancerExaminationImageAnnotation#getProviderServiceMapID()}
     *   <li>{@link CancerExaminationImageAnnotation#getReservedForChange()}
     *   <li>{@link CancerExaminationImageAnnotation#getSyncedBy()}
     *   <li>{@link CancerExaminationImageAnnotation#getSyncedDate()}
     *   <li>{@link CancerExaminationImageAnnotation#getVanID()}
     *   <li>{@link CancerExaminationImageAnnotation#getVanSerialNo()}
     *   <li>{@link CancerExaminationImageAnnotation#getVehicalNo()}
     *   <li>{@link CancerExaminationImageAnnotation#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        CancerExaminationImageAnnotation actualCancerExaminationImageAnnotation = new CancerExaminationImageAnnotation();
        actualCancerExaminationImageAnnotation.setBenVisitID(1L);
        actualCancerExaminationImageAnnotation.setBeneficiaryRegID(1L);
        actualCancerExaminationImageAnnotation.setCancerImageID(1);
        actualCancerExaminationImageAnnotation.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerExaminationImageAnnotation.setCreatedDate(createdDate);
        actualCancerExaminationImageAnnotation.setDeleted(true);
        actualCancerExaminationImageAnnotation.setID(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerExaminationImageAnnotation.setLastModDate(lastModDate);
        actualCancerExaminationImageAnnotation.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerExaminationImageAnnotation.setParkingPlaceID(1);
        actualCancerExaminationImageAnnotation.setPoint(1);
        actualCancerExaminationImageAnnotation.setPointDesc("Point Desc");
        actualCancerExaminationImageAnnotation.setProcessed("Processed");
        actualCancerExaminationImageAnnotation.setProviderServiceMapID(1);
        actualCancerExaminationImageAnnotation.setReservedForChange("Reserved For Change");
        actualCancerExaminationImageAnnotation.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerExaminationImageAnnotation.setSyncedDate(syncedDate);
        actualCancerExaminationImageAnnotation.setVanID(1);
        actualCancerExaminationImageAnnotation.setVanSerialNo(1L);
        actualCancerExaminationImageAnnotation.setVehicalNo("Vehical No");
        actualCancerExaminationImageAnnotation.setVisitCode(1L);
        actualCancerExaminationImageAnnotation.setxCoordinate(1);
        actualCancerExaminationImageAnnotation.setyCoordinate(1);
        Long actualBenVisitID = actualCancerExaminationImageAnnotation.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerExaminationImageAnnotation.getBeneficiaryRegID();
        Integer actualCancerImageID = actualCancerExaminationImageAnnotation.getCancerImageID();
        String actualCreatedBy = actualCancerExaminationImageAnnotation.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerExaminationImageAnnotation.getCreatedDate();
        Boolean actualDeleted = actualCancerExaminationImageAnnotation.getDeleted();
        Long actualID = actualCancerExaminationImageAnnotation.getID();
        Timestamp actualLastModDate = actualCancerExaminationImageAnnotation.getLastModDate();
        String actualModifiedBy = actualCancerExaminationImageAnnotation.getModifiedBy();
        Integer actualParkingPlaceID = actualCancerExaminationImageAnnotation.getParkingPlaceID();
        Integer actualPoint = actualCancerExaminationImageAnnotation.getPoint();
        String actualPointDesc = actualCancerExaminationImageAnnotation.getPointDesc();
        String actualProcessed = actualCancerExaminationImageAnnotation.getProcessed();
        Integer actualProviderServiceMapID = actualCancerExaminationImageAnnotation.getProviderServiceMapID();
        String actualReservedForChange = actualCancerExaminationImageAnnotation.getReservedForChange();
        String actualSyncedBy = actualCancerExaminationImageAnnotation.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerExaminationImageAnnotation.getSyncedDate();
        Integer actualVanID = actualCancerExaminationImageAnnotation.getVanID();
        Long actualVanSerialNo = actualCancerExaminationImageAnnotation.getVanSerialNo();
        String actualVehicalNo = actualCancerExaminationImageAnnotation.getVehicalNo();
        Long actualVisitCode = actualCancerExaminationImageAnnotation.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Point Desc", actualPointDesc);
        assertEquals("Processed", actualProcessed);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals(1, actualCancerImageID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualPoint.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualID.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }

    /**
     * Method under test: {@link CancerExaminationImageAnnotation#getxCoordinate()}
     */
    @Test
    void testGetxCoordinate() {
        // Arrange, Act and Assert
        assertNull((new CancerExaminationImageAnnotation()).getxCoordinate());
    }

    /**
     * Method under test: {@link CancerExaminationImageAnnotation#getxCoordinate()}
     */
    @Test
    void testGetxCoordinate2() {
        // Arrange
        CancerExaminationImageAnnotation cancerExaminationImageAnnotation = new CancerExaminationImageAnnotation();
        cancerExaminationImageAnnotation.setBenVisitID(1L);
        cancerExaminationImageAnnotation.setBeneficiaryRegID(1L);
        cancerExaminationImageAnnotation.setCancerImageID(1);
        cancerExaminationImageAnnotation.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        cancerExaminationImageAnnotation.setCreatedDate(mock(Timestamp.class));
        cancerExaminationImageAnnotation.setDeleted(true);
        cancerExaminationImageAnnotation.setID(1L);
        cancerExaminationImageAnnotation.setLastModDate(mock(Timestamp.class));
        cancerExaminationImageAnnotation.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        cancerExaminationImageAnnotation.setParkingPlaceID(1);
        cancerExaminationImageAnnotation.setPoint(1);
        cancerExaminationImageAnnotation.setPointDesc("Point Desc");
        cancerExaminationImageAnnotation.setProcessed("Processed");
        cancerExaminationImageAnnotation.setProviderServiceMapID(1);
        cancerExaminationImageAnnotation.setReservedForChange("Reserved For Change");
        cancerExaminationImageAnnotation.setSyncedBy("Synced By");
        cancerExaminationImageAnnotation.setSyncedDate(mock(Timestamp.class));
        cancerExaminationImageAnnotation.setVanID(1);
        cancerExaminationImageAnnotation.setVanSerialNo(1L);
        cancerExaminationImageAnnotation.setVehicalNo("Vehical No");
        cancerExaminationImageAnnotation.setVisitCode(1L);
        cancerExaminationImageAnnotation.setxCoordinate(1);
        cancerExaminationImageAnnotation.setyCoordinate(1);

        // Act and Assert
        assertEquals(1, cancerExaminationImageAnnotation.getxCoordinate().intValue());
    }

    /**
     * Method under test: {@link CancerExaminationImageAnnotation#getyCoordinate()}
     */
    @Test
    void testGetyCoordinate() {
        // Arrange, Act and Assert
        assertNull((new CancerExaminationImageAnnotation()).getyCoordinate());
    }

    /**
     * Method under test: {@link CancerExaminationImageAnnotation#getyCoordinate()}
     */
    @Test
    void testGetyCoordinate2() {
        // Arrange
        CancerExaminationImageAnnotation cancerExaminationImageAnnotation = new CancerExaminationImageAnnotation();
        cancerExaminationImageAnnotation.setBenVisitID(1L);
        cancerExaminationImageAnnotation.setBeneficiaryRegID(1L);
        cancerExaminationImageAnnotation.setCancerImageID(1);
        cancerExaminationImageAnnotation.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        cancerExaminationImageAnnotation.setCreatedDate(mock(Timestamp.class));
        cancerExaminationImageAnnotation.setDeleted(true);
        cancerExaminationImageAnnotation.setID(1L);
        cancerExaminationImageAnnotation.setLastModDate(mock(Timestamp.class));
        cancerExaminationImageAnnotation.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        cancerExaminationImageAnnotation.setParkingPlaceID(1);
        cancerExaminationImageAnnotation.setPoint(1);
        cancerExaminationImageAnnotation.setPointDesc("Point Desc");
        cancerExaminationImageAnnotation.setProcessed("Processed");
        cancerExaminationImageAnnotation.setProviderServiceMapID(1);
        cancerExaminationImageAnnotation.setReservedForChange("Reserved For Change");
        cancerExaminationImageAnnotation.setSyncedBy("Synced By");
        cancerExaminationImageAnnotation.setSyncedDate(mock(Timestamp.class));
        cancerExaminationImageAnnotation.setVanID(1);
        cancerExaminationImageAnnotation.setVanSerialNo(1L);
        cancerExaminationImageAnnotation.setVehicalNo("Vehical No");
        cancerExaminationImageAnnotation.setVisitCode(1L);
        cancerExaminationImageAnnotation.setxCoordinate(1);
        cancerExaminationImageAnnotation.setyCoordinate(1);

        // Act and Assert
        assertEquals(1, cancerExaminationImageAnnotation.getyCoordinate().intValue());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link CancerExaminationImageAnnotation#CancerExaminationImageAnnotation(Long, Long, Long, Integer, Integer, Integer, Integer, Integer, String, Boolean, String, String, Timestamp, String, Timestamp)}
     *   <li>{@link CancerExaminationImageAnnotation#setBenVisitID(Long)}
     *   <li>{@link CancerExaminationImageAnnotation#setBeneficiaryRegID(Long)}
     *   <li>{@link CancerExaminationImageAnnotation#setCancerImageID(Integer)}
     *   <li>{@link CancerExaminationImageAnnotation#setCreatedBy(String)}
     *   <li>{@link CancerExaminationImageAnnotation#setCreatedDate(Timestamp)}
     *   <li>{@link CancerExaminationImageAnnotation#setDeleted(Boolean)}
     *   <li>{@link CancerExaminationImageAnnotation#setID(Long)}
     *   <li>{@link CancerExaminationImageAnnotation#setLastModDate(Timestamp)}
     *   <li>{@link CancerExaminationImageAnnotation#setModifiedBy(String)}
     *   <li>{@link CancerExaminationImageAnnotation#setParkingPlaceID(Integer)}
     *   <li>{@link CancerExaminationImageAnnotation#setPoint(Integer)}
     *   <li>{@link CancerExaminationImageAnnotation#setPointDesc(String)}
     *   <li>{@link CancerExaminationImageAnnotation#setProcessed(String)}
     *   <li>{@link CancerExaminationImageAnnotation#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerExaminationImageAnnotation#setReservedForChange(String)}
     *   <li>{@link CancerExaminationImageAnnotation#setSyncedBy(String)}
     *   <li>{@link CancerExaminationImageAnnotation#setSyncedDate(Timestamp)}
     *   <li>{@link CancerExaminationImageAnnotation#setVanID(Integer)}
     *   <li>{@link CancerExaminationImageAnnotation#setVanSerialNo(Long)}
     *   <li>{@link CancerExaminationImageAnnotation#setVehicalNo(String)}
     *   <li>{@link CancerExaminationImageAnnotation#setVisitCode(Long)}
     *   <li>{@link CancerExaminationImageAnnotation#setxCoordinate(Integer)}
     *   <li>{@link CancerExaminationImageAnnotation#setyCoordinate(Integer)}
     *   <li>{@link CancerExaminationImageAnnotation#getBenVisitID()}
     *   <li>{@link CancerExaminationImageAnnotation#getBeneficiaryRegID()}
     *   <li>{@link CancerExaminationImageAnnotation#getCancerImageID()}
     *   <li>{@link CancerExaminationImageAnnotation#getCreatedBy()}
     *   <li>{@link CancerExaminationImageAnnotation#getCreatedDate()}
     *   <li>{@link CancerExaminationImageAnnotation#getDeleted()}
     *   <li>{@link CancerExaminationImageAnnotation#getID()}
     *   <li>{@link CancerExaminationImageAnnotation#getLastModDate()}
     *   <li>{@link CancerExaminationImageAnnotation#getModifiedBy()}
     *   <li>{@link CancerExaminationImageAnnotation#getParkingPlaceID()}
     *   <li>{@link CancerExaminationImageAnnotation#getPoint()}
     *   <li>{@link CancerExaminationImageAnnotation#getPointDesc()}
     *   <li>{@link CancerExaminationImageAnnotation#getProcessed()}
     *   <li>{@link CancerExaminationImageAnnotation#getProviderServiceMapID()}
     *   <li>{@link CancerExaminationImageAnnotation#getReservedForChange()}
     *   <li>{@link CancerExaminationImageAnnotation#getSyncedBy()}
     *   <li>{@link CancerExaminationImageAnnotation#getSyncedDate()}
     *   <li>{@link CancerExaminationImageAnnotation#getVanID()}
     *   <li>{@link CancerExaminationImageAnnotation#getVanSerialNo()}
     *   <li>{@link CancerExaminationImageAnnotation#getVehicalNo()}
     *   <li>{@link CancerExaminationImageAnnotation#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        CancerExaminationImageAnnotation actualCancerExaminationImageAnnotation = new CancerExaminationImageAnnotation(1L,
                1L, 1L, 1, 1, 1, 1, 1, "Point Desc", true, "Processed", "Jan 1, 2020 8:00am GMT+0100", mock(Timestamp.class),
                "Jan 1, 2020 9:00am GMT+0100", mock(Timestamp.class));
        actualCancerExaminationImageAnnotation.setBenVisitID(1L);
        actualCancerExaminationImageAnnotation.setBeneficiaryRegID(1L);
        actualCancerExaminationImageAnnotation.setCancerImageID(1);
        actualCancerExaminationImageAnnotation.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerExaminationImageAnnotation.setCreatedDate(createdDate);
        actualCancerExaminationImageAnnotation.setDeleted(true);
        actualCancerExaminationImageAnnotation.setID(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerExaminationImageAnnotation.setLastModDate(lastModDate);
        actualCancerExaminationImageAnnotation.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerExaminationImageAnnotation.setParkingPlaceID(1);
        actualCancerExaminationImageAnnotation.setPoint(1);
        actualCancerExaminationImageAnnotation.setPointDesc("Point Desc");
        actualCancerExaminationImageAnnotation.setProcessed("Processed");
        actualCancerExaminationImageAnnotation.setProviderServiceMapID(1);
        actualCancerExaminationImageAnnotation.setReservedForChange("Reserved For Change");
        actualCancerExaminationImageAnnotation.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerExaminationImageAnnotation.setSyncedDate(syncedDate);
        actualCancerExaminationImageAnnotation.setVanID(1);
        actualCancerExaminationImageAnnotation.setVanSerialNo(1L);
        actualCancerExaminationImageAnnotation.setVehicalNo("Vehical No");
        actualCancerExaminationImageAnnotation.setVisitCode(1L);
        actualCancerExaminationImageAnnotation.setxCoordinate(1);
        actualCancerExaminationImageAnnotation.setyCoordinate(1);
        Long actualBenVisitID = actualCancerExaminationImageAnnotation.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerExaminationImageAnnotation.getBeneficiaryRegID();
        Integer actualCancerImageID = actualCancerExaminationImageAnnotation.getCancerImageID();
        String actualCreatedBy = actualCancerExaminationImageAnnotation.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerExaminationImageAnnotation.getCreatedDate();
        Boolean actualDeleted = actualCancerExaminationImageAnnotation.getDeleted();
        Long actualID = actualCancerExaminationImageAnnotation.getID();
        Timestamp actualLastModDate = actualCancerExaminationImageAnnotation.getLastModDate();
        String actualModifiedBy = actualCancerExaminationImageAnnotation.getModifiedBy();
        Integer actualParkingPlaceID = actualCancerExaminationImageAnnotation.getParkingPlaceID();
        Integer actualPoint = actualCancerExaminationImageAnnotation.getPoint();
        String actualPointDesc = actualCancerExaminationImageAnnotation.getPointDesc();
        String actualProcessed = actualCancerExaminationImageAnnotation.getProcessed();
        Integer actualProviderServiceMapID = actualCancerExaminationImageAnnotation.getProviderServiceMapID();
        String actualReservedForChange = actualCancerExaminationImageAnnotation.getReservedForChange();
        String actualSyncedBy = actualCancerExaminationImageAnnotation.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerExaminationImageAnnotation.getSyncedDate();
        Integer actualVanID = actualCancerExaminationImageAnnotation.getVanID();
        Long actualVanSerialNo = actualCancerExaminationImageAnnotation.getVanSerialNo();
        String actualVehicalNo = actualCancerExaminationImageAnnotation.getVehicalNo();
        Long actualVisitCode = actualCancerExaminationImageAnnotation.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Point Desc", actualPointDesc);
        assertEquals("Processed", actualProcessed);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals(1, actualCancerImageID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualPoint.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualID.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }
}
