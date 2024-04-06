package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

class CancerBreastExaminationDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CancerBreastExamination#CancerBreastExamination()}
     *   <li>{@link CancerBreastExamination#setBenVisitID(Long)}
     *   <li>{@link CancerBreastExamination#setBeneficiaryRegID(Long)}
     *   <li>
     * {@link CancerBreastExamination#setBreastFeedingDurationGTE6months(Boolean)}
     *   <li>{@link CancerBreastExamination#setBreastsAppear_Normal(Boolean)}
     *   <li>{@link CancerBreastExamination#setCreatedBy(String)}
     *   <li>{@link CancerBreastExamination#setCreatedDate(Timestamp)}
     *   <li>{@link CancerBreastExamination#setDeleted(Boolean)}
     *   <li>{@link CancerBreastExamination#setDimplingSkinOnBreast(Boolean)}
     *   <li>{@link CancerBreastExamination#setDischargeFromNipple(Boolean)}
     *   <li>{@link CancerBreastExamination#setEverBreastFed(Boolean)}
     *   <li>{@link CancerBreastExamination#setID(Long)}
     *   <li>{@link CancerBreastExamination#setLastModDate(Timestamp)}
     *   <li>{@link CancerBreastExamination#setLumpInBreast(Boolean)}
     *   <li>{@link CancerBreastExamination#setLumpShape(String)}
     *   <li>{@link CancerBreastExamination#setLumpSize(String)}
     *   <li>{@link CancerBreastExamination#setLumpTexture(String)}
     *   <li>{@link CancerBreastExamination#setMamogramReport(String)}
     *   <li>{@link CancerBreastExamination#setModifiedBy(String)}
     *   <li>{@link CancerBreastExamination#setParkingPlaceID(Integer)}
     *   <li>{@link CancerBreastExamination#setPeaudOrange(Boolean)}
     *   <li>{@link CancerBreastExamination#setProcessed(String)}
     *   <li>{@link CancerBreastExamination#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerBreastExamination#setRashOnBreast(Boolean)}
     *   <li>{@link CancerBreastExamination#setReferredToMammogram(Boolean)}
     *   <li>{@link CancerBreastExamination#setReservedForChange(String)}
     *   <li>{@link CancerBreastExamination#setSyncedBy(String)}
     *   <li>{@link CancerBreastExamination#setSyncedDate(Timestamp)}
     *   <li>{@link CancerBreastExamination#setVanID(Integer)}
     *   <li>{@link CancerBreastExamination#setVanSerialNo(Long)}
     *   <li>{@link CancerBreastExamination#setVehicalNo(String)}
     *   <li>{@link CancerBreastExamination#setVisitCode(Long)}
     *   <li>{@link CancerBreastExamination#getBenVisitID()}
     *   <li>{@link CancerBreastExamination#getBeneficiaryRegID()}
     *   <li>{@link CancerBreastExamination#getBreastFeedingDurationGTE6months()}
     *   <li>{@link CancerBreastExamination#getBreastsAppear_Normal()}
     *   <li>{@link CancerBreastExamination#getCreatedBy()}
     *   <li>{@link CancerBreastExamination#getCreatedDate()}
     *   <li>{@link CancerBreastExamination#getDeleted()}
     *   <li>{@link CancerBreastExamination#getDimplingSkinOnBreast()}
     *   <li>{@link CancerBreastExamination#getDischargeFromNipple()}
     *   <li>{@link CancerBreastExamination#getEverBreastFed()}
     *   <li>{@link CancerBreastExamination#getID()}
     *   <li>{@link CancerBreastExamination#getLastModDate()}
     *   <li>{@link CancerBreastExamination#getLumpInBreast()}
     *   <li>{@link CancerBreastExamination#getLumpShape()}
     *   <li>{@link CancerBreastExamination#getLumpSize()}
     *   <li>{@link CancerBreastExamination#getLumpTexture()}
     *   <li>{@link CancerBreastExamination#getMamogramReport()}
     *   <li>{@link CancerBreastExamination#getModifiedBy()}
     *   <li>{@link CancerBreastExamination#getParkingPlaceID()}
     *   <li>{@link CancerBreastExamination#getPeaudOrange()}
     *   <li>{@link CancerBreastExamination#getProcessed()}
     *   <li>{@link CancerBreastExamination#getProviderServiceMapID()}
     *   <li>{@link CancerBreastExamination#getRashOnBreast()}
     *   <li>{@link CancerBreastExamination#getReferredToMammogram()}
     *   <li>{@link CancerBreastExamination#getReservedForChange()}
     *   <li>{@link CancerBreastExamination#getSyncedBy()}
     *   <li>{@link CancerBreastExamination#getSyncedDate()}
     *   <li>{@link CancerBreastExamination#getVanID()}
     *   <li>{@link CancerBreastExamination#getVanSerialNo()}
     *   <li>{@link CancerBreastExamination#getVehicalNo()}
     *   <li>{@link CancerBreastExamination#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        CancerBreastExamination actualCancerBreastExamination = new CancerBreastExamination();
        actualCancerBreastExamination.setBenVisitID(1L);
        actualCancerBreastExamination.setBeneficiaryRegID(1L);
        actualCancerBreastExamination.setBreastFeedingDurationGTE6months(true);
        actualCancerBreastExamination.setBreastsAppear_Normal(true);
        actualCancerBreastExamination.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerBreastExamination.setCreatedDate(createdDate);
        actualCancerBreastExamination.setDeleted(true);
        actualCancerBreastExamination.setDimplingSkinOnBreast(true);
        actualCancerBreastExamination.setDischargeFromNipple(true);
        actualCancerBreastExamination.setEverBreastFed(true);
        actualCancerBreastExamination.setID(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerBreastExamination.setLastModDate(lastModDate);
        actualCancerBreastExamination.setLumpInBreast(true);
        actualCancerBreastExamination.setLumpShape("Lump Shape");
        actualCancerBreastExamination.setLumpSize("Lump Size");
        actualCancerBreastExamination.setLumpTexture("Lump Texture");
        actualCancerBreastExamination.setMamogramReport("Mamogram Report");
        actualCancerBreastExamination.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerBreastExamination.setParkingPlaceID(1);
        actualCancerBreastExamination.setPeaudOrange(true);
        actualCancerBreastExamination.setProcessed("Processed");
        actualCancerBreastExamination.setProviderServiceMapID(1);
        actualCancerBreastExamination.setRashOnBreast(true);
        actualCancerBreastExamination.setReferredToMammogram(true);
        actualCancerBreastExamination.setReservedForChange("Reserved For Change");
        actualCancerBreastExamination.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerBreastExamination.setSyncedDate(syncedDate);
        actualCancerBreastExamination.setVanID(1);
        actualCancerBreastExamination.setVanSerialNo(1L);
        actualCancerBreastExamination.setVehicalNo("Vehical No");
        actualCancerBreastExamination.setVisitCode(1L);
        Long actualBenVisitID = actualCancerBreastExamination.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerBreastExamination.getBeneficiaryRegID();
        Boolean actualBreastFeedingDurationGTE6months = actualCancerBreastExamination.getBreastFeedingDurationGTE6months();
        Boolean actualBreastsAppear_Normal = actualCancerBreastExamination.getBreastsAppear_Normal();
        String actualCreatedBy = actualCancerBreastExamination.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerBreastExamination.getCreatedDate();
        Boolean actualDeleted = actualCancerBreastExamination.getDeleted();
        Boolean actualDimplingSkinOnBreast = actualCancerBreastExamination.getDimplingSkinOnBreast();
        Boolean actualDischargeFromNipple = actualCancerBreastExamination.getDischargeFromNipple();
        Boolean actualEverBreastFed = actualCancerBreastExamination.getEverBreastFed();
        Long actualID = actualCancerBreastExamination.getID();
        Timestamp actualLastModDate = actualCancerBreastExamination.getLastModDate();
        Boolean actualLumpInBreast = actualCancerBreastExamination.getLumpInBreast();
        String actualLumpShape = actualCancerBreastExamination.getLumpShape();
        String actualLumpSize = actualCancerBreastExamination.getLumpSize();
        String actualLumpTexture = actualCancerBreastExamination.getLumpTexture();
        String actualMamogramReport = actualCancerBreastExamination.getMamogramReport();
        String actualModifiedBy = actualCancerBreastExamination.getModifiedBy();
        Integer actualParkingPlaceID = actualCancerBreastExamination.getParkingPlaceID();
        Boolean actualPeaudOrange = actualCancerBreastExamination.getPeaudOrange();
        String actualProcessed = actualCancerBreastExamination.getProcessed();
        Integer actualProviderServiceMapID = actualCancerBreastExamination.getProviderServiceMapID();
        Boolean actualRashOnBreast = actualCancerBreastExamination.getRashOnBreast();
        Boolean actualReferredToMammogram = actualCancerBreastExamination.getReferredToMammogram();
        String actualReservedForChange = actualCancerBreastExamination.getReservedForChange();
        String actualSyncedBy = actualCancerBreastExamination.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerBreastExamination.getSyncedDate();
        Integer actualVanID = actualCancerBreastExamination.getVanID();
        Long actualVanSerialNo = actualCancerBreastExamination.getVanSerialNo();
        String actualVehicalNo = actualCancerBreastExamination.getVehicalNo();
        Long actualVisitCode = actualCancerBreastExamination.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Lump Shape", actualLumpShape);
        assertEquals("Lump Size", actualLumpSize);
        assertEquals("Lump Texture", actualLumpTexture);
        assertEquals("Mamogram Report", actualMamogramReport);
        assertEquals("Processed", actualProcessed);
        assertEquals("Reserved For Change", actualReservedForChange);
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
        assertTrue(actualBreastFeedingDurationGTE6months);
        assertTrue(actualBreastsAppear_Normal);
        assertTrue(actualDeleted);
        assertTrue(actualDimplingSkinOnBreast);
        assertTrue(actualDischargeFromNipple);
        assertTrue(actualEverBreastFed);
        assertTrue(actualLumpInBreast);
        assertTrue(actualPeaudOrange);
        assertTrue(actualRashOnBreast);
        assertTrue(actualReferredToMammogram);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link CancerBreastExamination#CancerBreastExamination(Long, Long, Long, Integer, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, String, String, Boolean, String, Boolean, String, String, Timestamp, String, Timestamp)}
     *   <li>{@link CancerBreastExamination#setBenVisitID(Long)}
     *   <li>{@link CancerBreastExamination#setBeneficiaryRegID(Long)}
     *   <li>
     * {@link CancerBreastExamination#setBreastFeedingDurationGTE6months(Boolean)}
     *   <li>{@link CancerBreastExamination#setBreastsAppear_Normal(Boolean)}
     *   <li>{@link CancerBreastExamination#setCreatedBy(String)}
     *   <li>{@link CancerBreastExamination#setCreatedDate(Timestamp)}
     *   <li>{@link CancerBreastExamination#setDeleted(Boolean)}
     *   <li>{@link CancerBreastExamination#setDimplingSkinOnBreast(Boolean)}
     *   <li>{@link CancerBreastExamination#setDischargeFromNipple(Boolean)}
     *   <li>{@link CancerBreastExamination#setEverBreastFed(Boolean)}
     *   <li>{@link CancerBreastExamination#setID(Long)}
     *   <li>{@link CancerBreastExamination#setLastModDate(Timestamp)}
     *   <li>{@link CancerBreastExamination#setLumpInBreast(Boolean)}
     *   <li>{@link CancerBreastExamination#setLumpShape(String)}
     *   <li>{@link CancerBreastExamination#setLumpSize(String)}
     *   <li>{@link CancerBreastExamination#setLumpTexture(String)}
     *   <li>{@link CancerBreastExamination#setMamogramReport(String)}
     *   <li>{@link CancerBreastExamination#setModifiedBy(String)}
     *   <li>{@link CancerBreastExamination#setParkingPlaceID(Integer)}
     *   <li>{@link CancerBreastExamination#setPeaudOrange(Boolean)}
     *   <li>{@link CancerBreastExamination#setProcessed(String)}
     *   <li>{@link CancerBreastExamination#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerBreastExamination#setRashOnBreast(Boolean)}
     *   <li>{@link CancerBreastExamination#setReferredToMammogram(Boolean)}
     *   <li>{@link CancerBreastExamination#setReservedForChange(String)}
     *   <li>{@link CancerBreastExamination#setSyncedBy(String)}
     *   <li>{@link CancerBreastExamination#setSyncedDate(Timestamp)}
     *   <li>{@link CancerBreastExamination#setVanID(Integer)}
     *   <li>{@link CancerBreastExamination#setVanSerialNo(Long)}
     *   <li>{@link CancerBreastExamination#setVehicalNo(String)}
     *   <li>{@link CancerBreastExamination#setVisitCode(Long)}
     *   <li>{@link CancerBreastExamination#getBenVisitID()}
     *   <li>{@link CancerBreastExamination#getBeneficiaryRegID()}
     *   <li>{@link CancerBreastExamination#getBreastFeedingDurationGTE6months()}
     *   <li>{@link CancerBreastExamination#getBreastsAppear_Normal()}
     *   <li>{@link CancerBreastExamination#getCreatedBy()}
     *   <li>{@link CancerBreastExamination#getCreatedDate()}
     *   <li>{@link CancerBreastExamination#getDeleted()}
     *   <li>{@link CancerBreastExamination#getDimplingSkinOnBreast()}
     *   <li>{@link CancerBreastExamination#getDischargeFromNipple()}
     *   <li>{@link CancerBreastExamination#getEverBreastFed()}
     *   <li>{@link CancerBreastExamination#getID()}
     *   <li>{@link CancerBreastExamination#getLastModDate()}
     *   <li>{@link CancerBreastExamination#getLumpInBreast()}
     *   <li>{@link CancerBreastExamination#getLumpShape()}
     *   <li>{@link CancerBreastExamination#getLumpSize()}
     *   <li>{@link CancerBreastExamination#getLumpTexture()}
     *   <li>{@link CancerBreastExamination#getMamogramReport()}
     *   <li>{@link CancerBreastExamination#getModifiedBy()}
     *   <li>{@link CancerBreastExamination#getParkingPlaceID()}
     *   <li>{@link CancerBreastExamination#getPeaudOrange()}
     *   <li>{@link CancerBreastExamination#getProcessed()}
     *   <li>{@link CancerBreastExamination#getProviderServiceMapID()}
     *   <li>{@link CancerBreastExamination#getRashOnBreast()}
     *   <li>{@link CancerBreastExamination#getReferredToMammogram()}
     *   <li>{@link CancerBreastExamination#getReservedForChange()}
     *   <li>{@link CancerBreastExamination#getSyncedBy()}
     *   <li>{@link CancerBreastExamination#getSyncedDate()}
     *   <li>{@link CancerBreastExamination#getVanID()}
     *   <li>{@link CancerBreastExamination#getVanSerialNo()}
     *   <li>{@link CancerBreastExamination#getVehicalNo()}
     *   <li>{@link CancerBreastExamination#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        CancerBreastExamination actualCancerBreastExamination = new CancerBreastExamination(1L, 1L, 1L, 1, true, true, true,
                true, true, true, true, true, "Lump Size", "Lump Shape", "Lump Texture", true, "Mamogram Report", true,
                "Processed", "Jan 1, 2020 8:00am GMT+0100", mock(Timestamp.class), "Jan 1, 2020 9:00am GMT+0100",
                mock(Timestamp.class));
        actualCancerBreastExamination.setBenVisitID(1L);
        actualCancerBreastExamination.setBeneficiaryRegID(1L);
        actualCancerBreastExamination.setBreastFeedingDurationGTE6months(true);
        actualCancerBreastExamination.setBreastsAppear_Normal(true);
        actualCancerBreastExamination.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerBreastExamination.setCreatedDate(createdDate);
        actualCancerBreastExamination.setDeleted(true);
        actualCancerBreastExamination.setDimplingSkinOnBreast(true);
        actualCancerBreastExamination.setDischargeFromNipple(true);
        actualCancerBreastExamination.setEverBreastFed(true);
        actualCancerBreastExamination.setID(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerBreastExamination.setLastModDate(lastModDate);
        actualCancerBreastExamination.setLumpInBreast(true);
        actualCancerBreastExamination.setLumpShape("Lump Shape");
        actualCancerBreastExamination.setLumpSize("Lump Size");
        actualCancerBreastExamination.setLumpTexture("Lump Texture");
        actualCancerBreastExamination.setMamogramReport("Mamogram Report");
        actualCancerBreastExamination.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerBreastExamination.setParkingPlaceID(1);
        actualCancerBreastExamination.setPeaudOrange(true);
        actualCancerBreastExamination.setProcessed("Processed");
        actualCancerBreastExamination.setProviderServiceMapID(1);
        actualCancerBreastExamination.setRashOnBreast(true);
        actualCancerBreastExamination.setReferredToMammogram(true);
        actualCancerBreastExamination.setReservedForChange("Reserved For Change");
        actualCancerBreastExamination.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerBreastExamination.setSyncedDate(syncedDate);
        actualCancerBreastExamination.setVanID(1);
        actualCancerBreastExamination.setVanSerialNo(1L);
        actualCancerBreastExamination.setVehicalNo("Vehical No");
        actualCancerBreastExamination.setVisitCode(1L);
        Long actualBenVisitID = actualCancerBreastExamination.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerBreastExamination.getBeneficiaryRegID();
        Boolean actualBreastFeedingDurationGTE6months = actualCancerBreastExamination.getBreastFeedingDurationGTE6months();
        Boolean actualBreastsAppear_Normal = actualCancerBreastExamination.getBreastsAppear_Normal();
        String actualCreatedBy = actualCancerBreastExamination.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerBreastExamination.getCreatedDate();
        Boolean actualDeleted = actualCancerBreastExamination.getDeleted();
        Boolean actualDimplingSkinOnBreast = actualCancerBreastExamination.getDimplingSkinOnBreast();
        Boolean actualDischargeFromNipple = actualCancerBreastExamination.getDischargeFromNipple();
        Boolean actualEverBreastFed = actualCancerBreastExamination.getEverBreastFed();
        Long actualID = actualCancerBreastExamination.getID();
        Timestamp actualLastModDate = actualCancerBreastExamination.getLastModDate();
        Boolean actualLumpInBreast = actualCancerBreastExamination.getLumpInBreast();
        String actualLumpShape = actualCancerBreastExamination.getLumpShape();
        String actualLumpSize = actualCancerBreastExamination.getLumpSize();
        String actualLumpTexture = actualCancerBreastExamination.getLumpTexture();
        String actualMamogramReport = actualCancerBreastExamination.getMamogramReport();
        String actualModifiedBy = actualCancerBreastExamination.getModifiedBy();
        Integer actualParkingPlaceID = actualCancerBreastExamination.getParkingPlaceID();
        Boolean actualPeaudOrange = actualCancerBreastExamination.getPeaudOrange();
        String actualProcessed = actualCancerBreastExamination.getProcessed();
        Integer actualProviderServiceMapID = actualCancerBreastExamination.getProviderServiceMapID();
        Boolean actualRashOnBreast = actualCancerBreastExamination.getRashOnBreast();
        Boolean actualReferredToMammogram = actualCancerBreastExamination.getReferredToMammogram();
        String actualReservedForChange = actualCancerBreastExamination.getReservedForChange();
        String actualSyncedBy = actualCancerBreastExamination.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerBreastExamination.getSyncedDate();
        Integer actualVanID = actualCancerBreastExamination.getVanID();
        Long actualVanSerialNo = actualCancerBreastExamination.getVanSerialNo();
        String actualVehicalNo = actualCancerBreastExamination.getVehicalNo();
        Long actualVisitCode = actualCancerBreastExamination.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Lump Shape", actualLumpShape);
        assertEquals("Lump Size", actualLumpSize);
        assertEquals("Lump Texture", actualLumpTexture);
        assertEquals("Mamogram Report", actualMamogramReport);
        assertEquals("Processed", actualProcessed);
        assertEquals("Reserved For Change", actualReservedForChange);
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
        assertTrue(actualBreastFeedingDurationGTE6months);
        assertTrue(actualBreastsAppear_Normal);
        assertTrue(actualDeleted);
        assertTrue(actualDimplingSkinOnBreast);
        assertTrue(actualDischargeFromNipple);
        assertTrue(actualEverBreastFed);
        assertTrue(actualLumpInBreast);
        assertTrue(actualPeaudOrange);
        assertTrue(actualRashOnBreast);
        assertTrue(actualReferredToMammogram);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }
}
