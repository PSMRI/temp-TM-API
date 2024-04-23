package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CancerOralExaminationDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CancerOralExamination#CancerOralExamination()}
     *   <li>{@link CancerOralExamination#setBenVisitID(Long)}
     *   <li>{@link CancerOralExamination#setBeneficiaryRegID(Long)}
     *   <li>{@link CancerOralExamination#setChronicBurningSensation(Boolean)}
     *   <li>{@link CancerOralExamination#setCreatedBy(String)}
     *   <li>{@link CancerOralExamination#setCreatedDate(Timestamp)}
     *   <li>{@link CancerOralExamination#setDeleted(Boolean)}
     *   <li>{@link CancerOralExamination#setID(Long)}
     *   <li>{@link CancerOralExamination#setLastModDate(Timestamp)}
     *   <li>{@link CancerOralExamination#setLimitedMouthOpening(String)}
     *   <li>{@link CancerOralExamination#setModifiedBy(String)}
     *   <li>{@link CancerOralExamination#setObservation(String)}
     *   <li>{@link CancerOralExamination#setParkingPlaceID(Integer)}
     *   <li>{@link CancerOralExamination#setPreMalignantLesionType(String)}
     *   <li>{@link CancerOralExamination#setPreMalignantLesionTypeList(List)}
     *   <li>{@link CancerOralExamination#setPremalignantLesions(Boolean)}
     *   <li>{@link CancerOralExamination#setProcessed(String)}
     *   <li>{@link CancerOralExamination#setProlongedIrritation(Boolean)}
     *   <li>{@link CancerOralExamination#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerOralExamination#setReservedForChange(String)}
     *   <li>{@link CancerOralExamination#setSyncedBy(String)}
     *   <li>{@link CancerOralExamination#setSyncedDate(Timestamp)}
     *   <li>{@link CancerOralExamination#setVanID(Integer)}
     *   <li>{@link CancerOralExamination#setVanSerialNo(Long)}
     *   <li>{@link CancerOralExamination#setVehicalNo(String)}
     *   <li>{@link CancerOralExamination#setVisitCode(Long)}
     *   <li>{@link CancerOralExamination#getBenVisitID()}
     *   <li>{@link CancerOralExamination#getBeneficiaryRegID()}
     *   <li>{@link CancerOralExamination#getChronicBurningSensation()}
     *   <li>{@link CancerOralExamination#getCreatedBy()}
     *   <li>{@link CancerOralExamination#getCreatedDate()}
     *   <li>{@link CancerOralExamination#getDeleted()}
     *   <li>{@link CancerOralExamination#getID()}
     *   <li>{@link CancerOralExamination#getLastModDate()}
     *   <li>{@link CancerOralExamination#getLimitedMouthOpening()}
     *   <li>{@link CancerOralExamination#getModifiedBy()}
     *   <li>{@link CancerOralExamination#getObservation()}
     *   <li>{@link CancerOralExamination#getParkingPlaceID()}
     *   <li>{@link CancerOralExamination#getPreMalignantLesionType()}
     *   <li>{@link CancerOralExamination#getPreMalignantLesionTypeList()}
     *   <li>{@link CancerOralExamination#getPremalignantLesions()}
     *   <li>{@link CancerOralExamination#getProcessed()}
     *   <li>{@link CancerOralExamination#getProlongedIrritation()}
     *   <li>{@link CancerOralExamination#getProviderServiceMapID()}
     *   <li>{@link CancerOralExamination#getReservedForChange()}
     *   <li>{@link CancerOralExamination#getSyncedBy()}
     *   <li>{@link CancerOralExamination#getSyncedDate()}
     *   <li>{@link CancerOralExamination#getVanID()}
     *   <li>{@link CancerOralExamination#getVanSerialNo()}
     *   <li>{@link CancerOralExamination#getVehicalNo()}
     *   <li>{@link CancerOralExamination#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        CancerOralExamination actualCancerOralExamination = new CancerOralExamination();
        actualCancerOralExamination.setBenVisitID(1L);
        actualCancerOralExamination.setBeneficiaryRegID(1L);
        actualCancerOralExamination.setChronicBurningSensation(true);
        actualCancerOralExamination.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerOralExamination.setCreatedDate(createdDate);
        actualCancerOralExamination.setDeleted(true);
        actualCancerOralExamination.setID(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerOralExamination.setLastModDate(lastModDate);
        actualCancerOralExamination.setLimitedMouthOpening("Limited Mouth Opening");
        actualCancerOralExamination.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerOralExamination.setObservation("Observation");
        actualCancerOralExamination.setParkingPlaceID(1);
        actualCancerOralExamination.setPreMalignantLesionType("Pre Malignant Lesion Type");
        ArrayList<String> preMalignantLesionTypeList = new ArrayList<>();
        actualCancerOralExamination.setPreMalignantLesionTypeList(preMalignantLesionTypeList);
        actualCancerOralExamination.setPremalignantLesions(true);
        actualCancerOralExamination.setProcessed("Processed");
        actualCancerOralExamination.setProlongedIrritation(true);
        actualCancerOralExamination.setProviderServiceMapID(1);
        actualCancerOralExamination.setReservedForChange("Reserved For Change");
        actualCancerOralExamination.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerOralExamination.setSyncedDate(syncedDate);
        actualCancerOralExamination.setVanID(1);
        actualCancerOralExamination.setVanSerialNo(1L);
        actualCancerOralExamination.setVehicalNo("Vehical No");
        actualCancerOralExamination.setVisitCode(1L);
        Long actualBenVisitID = actualCancerOralExamination.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerOralExamination.getBeneficiaryRegID();
        Boolean actualChronicBurningSensation = actualCancerOralExamination.getChronicBurningSensation();
        String actualCreatedBy = actualCancerOralExamination.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerOralExamination.getCreatedDate();
        Boolean actualDeleted = actualCancerOralExamination.getDeleted();
        Long actualID = actualCancerOralExamination.getID();
        Timestamp actualLastModDate = actualCancerOralExamination.getLastModDate();
        String actualLimitedMouthOpening = actualCancerOralExamination.getLimitedMouthOpening();
        String actualModifiedBy = actualCancerOralExamination.getModifiedBy();
        String actualObservation = actualCancerOralExamination.getObservation();
        Integer actualParkingPlaceID = actualCancerOralExamination.getParkingPlaceID();
        String actualPreMalignantLesionType = actualCancerOralExamination.getPreMalignantLesionType();
        List<String> actualPreMalignantLesionTypeList = actualCancerOralExamination.getPreMalignantLesionTypeList();
        Boolean actualPremalignantLesions = actualCancerOralExamination.getPremalignantLesions();
        String actualProcessed = actualCancerOralExamination.getProcessed();
        Boolean actualProlongedIrritation = actualCancerOralExamination.getProlongedIrritation();
        Integer actualProviderServiceMapID = actualCancerOralExamination.getProviderServiceMapID();
        String actualReservedForChange = actualCancerOralExamination.getReservedForChange();
        String actualSyncedBy = actualCancerOralExamination.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerOralExamination.getSyncedDate();
        Integer actualVanID = actualCancerOralExamination.getVanID();
        Long actualVanSerialNo = actualCancerOralExamination.getVanSerialNo();
        String actualVehicalNo = actualCancerOralExamination.getVehicalNo();
        Long actualVisitCode = actualCancerOralExamination.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Limited Mouth Opening", actualLimitedMouthOpening);
        assertEquals("Observation", actualObservation);
        assertEquals("Pre Malignant Lesion Type", actualPreMalignantLesionType);
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
        assertTrue(actualChronicBurningSensation);
        assertTrue(actualDeleted);
        assertTrue(actualPremalignantLesions);
        assertTrue(actualProlongedIrritation);
        assertSame(preMalignantLesionTypeList, actualPreMalignantLesionTypeList);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link CancerOralExamination#CancerOralExamination(Long, Long, Long, Integer, String, Boolean, String, List, Boolean, Boolean, String, Boolean, String, String, Timestamp, String, Timestamp)}
     *   <li>{@link CancerOralExamination#setBenVisitID(Long)}
     *   <li>{@link CancerOralExamination#setBeneficiaryRegID(Long)}
     *   <li>{@link CancerOralExamination#setChronicBurningSensation(Boolean)}
     *   <li>{@link CancerOralExamination#setCreatedBy(String)}
     *   <li>{@link CancerOralExamination#setCreatedDate(Timestamp)}
     *   <li>{@link CancerOralExamination#setDeleted(Boolean)}
     *   <li>{@link CancerOralExamination#setID(Long)}
     *   <li>{@link CancerOralExamination#setLastModDate(Timestamp)}
     *   <li>{@link CancerOralExamination#setLimitedMouthOpening(String)}
     *   <li>{@link CancerOralExamination#setModifiedBy(String)}
     *   <li>{@link CancerOralExamination#setObservation(String)}
     *   <li>{@link CancerOralExamination#setParkingPlaceID(Integer)}
     *   <li>{@link CancerOralExamination#setPreMalignantLesionType(String)}
     *   <li>{@link CancerOralExamination#setPreMalignantLesionTypeList(List)}
     *   <li>{@link CancerOralExamination#setPremalignantLesions(Boolean)}
     *   <li>{@link CancerOralExamination#setProcessed(String)}
     *   <li>{@link CancerOralExamination#setProlongedIrritation(Boolean)}
     *   <li>{@link CancerOralExamination#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerOralExamination#setReservedForChange(String)}
     *   <li>{@link CancerOralExamination#setSyncedBy(String)}
     *   <li>{@link CancerOralExamination#setSyncedDate(Timestamp)}
     *   <li>{@link CancerOralExamination#setVanID(Integer)}
     *   <li>{@link CancerOralExamination#setVanSerialNo(Long)}
     *   <li>{@link CancerOralExamination#setVehicalNo(String)}
     *   <li>{@link CancerOralExamination#setVisitCode(Long)}
     *   <li>{@link CancerOralExamination#getBenVisitID()}
     *   <li>{@link CancerOralExamination#getBeneficiaryRegID()}
     *   <li>{@link CancerOralExamination#getChronicBurningSensation()}
     *   <li>{@link CancerOralExamination#getCreatedBy()}
     *   <li>{@link CancerOralExamination#getCreatedDate()}
     *   <li>{@link CancerOralExamination#getDeleted()}
     *   <li>{@link CancerOralExamination#getID()}
     *   <li>{@link CancerOralExamination#getLastModDate()}
     *   <li>{@link CancerOralExamination#getLimitedMouthOpening()}
     *   <li>{@link CancerOralExamination#getModifiedBy()}
     *   <li>{@link CancerOralExamination#getObservation()}
     *   <li>{@link CancerOralExamination#getParkingPlaceID()}
     *   <li>{@link CancerOralExamination#getPreMalignantLesionType()}
     *   <li>{@link CancerOralExamination#getPreMalignantLesionTypeList()}
     *   <li>{@link CancerOralExamination#getPremalignantLesions()}
     *   <li>{@link CancerOralExamination#getProcessed()}
     *   <li>{@link CancerOralExamination#getProlongedIrritation()}
     *   <li>{@link CancerOralExamination#getProviderServiceMapID()}
     *   <li>{@link CancerOralExamination#getReservedForChange()}
     *   <li>{@link CancerOralExamination#getSyncedBy()}
     *   <li>{@link CancerOralExamination#getSyncedDate()}
     *   <li>{@link CancerOralExamination#getVanID()}
     *   <li>{@link CancerOralExamination#getVanSerialNo()}
     *   <li>{@link CancerOralExamination#getVehicalNo()}
     *   <li>{@link CancerOralExamination#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange
        ArrayList<String> preMalignantLesionTypeList = new ArrayList<>();

        // Act
        CancerOralExamination actualCancerOralExamination = new CancerOralExamination(1L, 1L, 1L, 1,
                "Limited Mouth Opening", true, "Pre Malignant Lesion Type", preMalignantLesionTypeList, true, true,
                "Observation", true, "Processed", "Jan 1, 2020 8:00am GMT+0100", mock(Timestamp.class),
                "Jan 1, 2020 9:00am GMT+0100", mock(Timestamp.class));
        actualCancerOralExamination.setBenVisitID(1L);
        actualCancerOralExamination.setBeneficiaryRegID(1L);
        actualCancerOralExamination.setChronicBurningSensation(true);
        actualCancerOralExamination.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerOralExamination.setCreatedDate(createdDate);
        actualCancerOralExamination.setDeleted(true);
        actualCancerOralExamination.setID(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerOralExamination.setLastModDate(lastModDate);
        actualCancerOralExamination.setLimitedMouthOpening("Limited Mouth Opening");
        actualCancerOralExamination.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerOralExamination.setObservation("Observation");
        actualCancerOralExamination.setParkingPlaceID(1);
        actualCancerOralExamination.setPreMalignantLesionType("Pre Malignant Lesion Type");
        ArrayList<String> preMalignantLesionTypeList2 = new ArrayList<>();
        actualCancerOralExamination.setPreMalignantLesionTypeList(preMalignantLesionTypeList2);
        actualCancerOralExamination.setPremalignantLesions(true);
        actualCancerOralExamination.setProcessed("Processed");
        actualCancerOralExamination.setProlongedIrritation(true);
        actualCancerOralExamination.setProviderServiceMapID(1);
        actualCancerOralExamination.setReservedForChange("Reserved For Change");
        actualCancerOralExamination.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerOralExamination.setSyncedDate(syncedDate);
        actualCancerOralExamination.setVanID(1);
        actualCancerOralExamination.setVanSerialNo(1L);
        actualCancerOralExamination.setVehicalNo("Vehical No");
        actualCancerOralExamination.setVisitCode(1L);
        Long actualBenVisitID = actualCancerOralExamination.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerOralExamination.getBeneficiaryRegID();
        Boolean actualChronicBurningSensation = actualCancerOralExamination.getChronicBurningSensation();
        String actualCreatedBy = actualCancerOralExamination.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerOralExamination.getCreatedDate();
        Boolean actualDeleted = actualCancerOralExamination.getDeleted();
        Long actualID = actualCancerOralExamination.getID();
        Timestamp actualLastModDate = actualCancerOralExamination.getLastModDate();
        String actualLimitedMouthOpening = actualCancerOralExamination.getLimitedMouthOpening();
        String actualModifiedBy = actualCancerOralExamination.getModifiedBy();
        String actualObservation = actualCancerOralExamination.getObservation();
        Integer actualParkingPlaceID = actualCancerOralExamination.getParkingPlaceID();
        String actualPreMalignantLesionType = actualCancerOralExamination.getPreMalignantLesionType();
        List<String> actualPreMalignantLesionTypeList = actualCancerOralExamination.getPreMalignantLesionTypeList();
        Boolean actualPremalignantLesions = actualCancerOralExamination.getPremalignantLesions();
        String actualProcessed = actualCancerOralExamination.getProcessed();
        Boolean actualProlongedIrritation = actualCancerOralExamination.getProlongedIrritation();
        Integer actualProviderServiceMapID = actualCancerOralExamination.getProviderServiceMapID();
        String actualReservedForChange = actualCancerOralExamination.getReservedForChange();
        String actualSyncedBy = actualCancerOralExamination.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerOralExamination.getSyncedDate();
        Integer actualVanID = actualCancerOralExamination.getVanID();
        Long actualVanSerialNo = actualCancerOralExamination.getVanSerialNo();
        String actualVehicalNo = actualCancerOralExamination.getVehicalNo();
        Long actualVisitCode = actualCancerOralExamination.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Limited Mouth Opening", actualLimitedMouthOpening);
        assertEquals("Observation", actualObservation);
        assertEquals("Pre Malignant Lesion Type", actualPreMalignantLesionType);
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
        assertTrue(actualChronicBurningSensation);
        assertTrue(actualDeleted);
        assertTrue(actualPremalignantLesions);
        assertTrue(actualProlongedIrritation);
        assertEquals(preMalignantLesionTypeList, actualPreMalignantLesionTypeList);
        assertSame(preMalignantLesionTypeList2, actualPreMalignantLesionTypeList);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }
}
