package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

class CancerSignAndSymptomsDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CancerSignAndSymptoms#CancerSignAndSymptoms()}
     *   <li>{@link CancerSignAndSymptoms#setBenVisitID(Long)}
     *   <li>{@link CancerSignAndSymptoms#setBeneficiaryRegID(Long)}
     *   <li>{@link CancerSignAndSymptoms#setBloodInSputum(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setBloodStainedDischargeFromNipple(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setBreastEnlargement(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setBriefHistory(String)}
     *   <li>{@link CancerSignAndSymptoms#setChangeInShapeAndSizeOfBreasts(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setChangeInTheToneOfVoice(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setCoughGTE2Weeks(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setCoughgt2Weeks(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setCreatedBy(String)}
     *   <li>{@link CancerSignAndSymptoms#setCreatedDate(Timestamp)}
     *   <li>{@link CancerSignAndSymptoms#setDeleted(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setDifficultyInOpeningMouth(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setFoulSmellingVaginalDischarge(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setID(Long)}
     *   <li>{@link CancerSignAndSymptoms#setLastModDate(Timestamp)}
     *   <li>{@link CancerSignAndSymptoms#setLumpInTheBreast(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setLymphNode_Enlarged(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setModifiedBy(String)}
     *   <li>{@link CancerSignAndSymptoms#setNonHealingUlcerOrPatchOrGrowth(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setObservation(String)}
     *   <li>{@link CancerSignAndSymptoms#setParkingPlaceID(Integer)}
     *   <li>{@link CancerSignAndSymptoms#setProcessed(String)}
     *   <li>{@link CancerSignAndSymptoms#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerSignAndSymptoms#setReservedForChange(String)}
     *   <li>{@link CancerSignAndSymptoms#setShortnessOfBreath(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setSyncedBy(String)}
     *   <li>{@link CancerSignAndSymptoms#setSyncedDate(Timestamp)}
     *   <li>{@link CancerSignAndSymptoms#setVaginalBleedingAfterIntercourse(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setVaginalBleedingAfterMenopause(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setVaginalBleedingBetweenPeriods(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setVanID(Integer)}
     *   <li>{@link CancerSignAndSymptoms#setVanSerialNo(Long)}
     *   <li>{@link CancerSignAndSymptoms#setVehicalNo(String)}
     *   <li>{@link CancerSignAndSymptoms#setVisitCode(Long)}
     *   <li>{@link CancerSignAndSymptoms#getBenVisitID()}
     *   <li>{@link CancerSignAndSymptoms#getBeneficiaryRegID()}
     *   <li>{@link CancerSignAndSymptoms#getBloodInSputum()}
     *   <li>{@link CancerSignAndSymptoms#getBloodStainedDischargeFromNipple()}
     *   <li>{@link CancerSignAndSymptoms#getBreastEnlargement()}
     *   <li>{@link CancerSignAndSymptoms#getBriefHistory()}
     *   <li>{@link CancerSignAndSymptoms#getChangeInShapeAndSizeOfBreasts()}
     *   <li>{@link CancerSignAndSymptoms#getChangeInTheToneOfVoice()}
     *   <li>{@link CancerSignAndSymptoms#getCoughGTE2Weeks()}
     *   <li>{@link CancerSignAndSymptoms#getCoughgt2Weeks()}
     *   <li>{@link CancerSignAndSymptoms#getCreatedBy()}
     *   <li>{@link CancerSignAndSymptoms#getCreatedDate()}
     *   <li>{@link CancerSignAndSymptoms#getDeleted()}
     *   <li>{@link CancerSignAndSymptoms#getDifficultyInOpeningMouth()}
     *   <li>{@link CancerSignAndSymptoms#getFoulSmellingVaginalDischarge()}
     *   <li>{@link CancerSignAndSymptoms#getID()}
     *   <li>{@link CancerSignAndSymptoms#getLastModDate()}
     *   <li>{@link CancerSignAndSymptoms#getLumpInTheBreast()}
     *   <li>{@link CancerSignAndSymptoms#getLymphNode_Enlarged()}
     *   <li>{@link CancerSignAndSymptoms#getModifiedBy()}
     *   <li>{@link CancerSignAndSymptoms#getNonHealingUlcerOrPatchOrGrowth()}
     *   <li>{@link CancerSignAndSymptoms#getObservation()}
     *   <li>{@link CancerSignAndSymptoms#getParkingPlaceID()}
     *   <li>{@link CancerSignAndSymptoms#getProcessed()}
     *   <li>{@link CancerSignAndSymptoms#getProviderServiceMapID()}
     *   <li>{@link CancerSignAndSymptoms#getReservedForChange()}
     *   <li>{@link CancerSignAndSymptoms#getShortnessOfBreath()}
     *   <li>{@link CancerSignAndSymptoms#getSyncedBy()}
     *   <li>{@link CancerSignAndSymptoms#getSyncedDate()}
     *   <li>{@link CancerSignAndSymptoms#getVaginalBleedingAfterIntercourse()}
     *   <li>{@link CancerSignAndSymptoms#getVaginalBleedingAfterMenopause()}
     *   <li>{@link CancerSignAndSymptoms#getVaginalBleedingBetweenPeriods()}
     *   <li>{@link CancerSignAndSymptoms#getVanID()}
     *   <li>{@link CancerSignAndSymptoms#getVanSerialNo()}
     *   <li>{@link CancerSignAndSymptoms#getVehicalNo()}
     *   <li>{@link CancerSignAndSymptoms#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        CancerSignAndSymptoms actualCancerSignAndSymptoms = new CancerSignAndSymptoms();
        actualCancerSignAndSymptoms.setBenVisitID(1L);
        actualCancerSignAndSymptoms.setBeneficiaryRegID(1L);
        actualCancerSignAndSymptoms.setBloodInSputum(true);
        actualCancerSignAndSymptoms.setBloodStainedDischargeFromNipple(true);
        actualCancerSignAndSymptoms.setBreastEnlargement(true);
        actualCancerSignAndSymptoms.setBriefHistory("Observation");
        actualCancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(true);
        actualCancerSignAndSymptoms.setChangeInTheToneOfVoice(true);
        actualCancerSignAndSymptoms.setCoughGTE2Weeks(true);
        actualCancerSignAndSymptoms.setCoughgt2Weeks(true);
        actualCancerSignAndSymptoms.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerSignAndSymptoms.setCreatedDate(createdDate);
        actualCancerSignAndSymptoms.setDeleted(true);
        actualCancerSignAndSymptoms.setDifficultyInOpeningMouth(true);
        actualCancerSignAndSymptoms.setFoulSmellingVaginalDischarge(true);
        actualCancerSignAndSymptoms.setID(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerSignAndSymptoms.setLastModDate(lastModDate);
        actualCancerSignAndSymptoms.setLumpInTheBreast(true);
        actualCancerSignAndSymptoms.setLymphNode_Enlarged(true);
        actualCancerSignAndSymptoms.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(true);
        actualCancerSignAndSymptoms.setObservation("Observation");
        actualCancerSignAndSymptoms.setParkingPlaceID(1);
        actualCancerSignAndSymptoms.setProcessed("Processed");
        actualCancerSignAndSymptoms.setProviderServiceMapID(1);
        actualCancerSignAndSymptoms.setReservedForChange("Reserved For Change");
        actualCancerSignAndSymptoms.setShortnessOfBreath(true);
        actualCancerSignAndSymptoms.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerSignAndSymptoms.setSyncedDate(syncedDate);
        actualCancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(true);
        actualCancerSignAndSymptoms.setVaginalBleedingAfterMenopause(true);
        actualCancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(true);
        actualCancerSignAndSymptoms.setVanID(1);
        actualCancerSignAndSymptoms.setVanSerialNo(1L);
        actualCancerSignAndSymptoms.setVehicalNo("Vehical No");
        actualCancerSignAndSymptoms.setVisitCode(1L);
        Long actualBenVisitID = actualCancerSignAndSymptoms.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerSignAndSymptoms.getBeneficiaryRegID();
        Boolean actualBloodInSputum = actualCancerSignAndSymptoms.getBloodInSputum();
        Boolean actualBloodStainedDischargeFromNipple = actualCancerSignAndSymptoms.getBloodStainedDischargeFromNipple();
        Boolean actualBreastEnlargement = actualCancerSignAndSymptoms.getBreastEnlargement();
        String actualBriefHistory = actualCancerSignAndSymptoms.getBriefHistory();
        Boolean actualChangeInShapeAndSizeOfBreasts = actualCancerSignAndSymptoms.getChangeInShapeAndSizeOfBreasts();
        Boolean actualChangeInTheToneOfVoice = actualCancerSignAndSymptoms.getChangeInTheToneOfVoice();
        Boolean actualCoughGTE2Weeks = actualCancerSignAndSymptoms.getCoughGTE2Weeks();
        Boolean actualCoughgt2Weeks = actualCancerSignAndSymptoms.getCoughgt2Weeks();
        String actualCreatedBy = actualCancerSignAndSymptoms.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerSignAndSymptoms.getCreatedDate();
        Boolean actualDeleted = actualCancerSignAndSymptoms.getDeleted();
        Boolean actualDifficultyInOpeningMouth = actualCancerSignAndSymptoms.getDifficultyInOpeningMouth();
        Boolean actualFoulSmellingVaginalDischarge = actualCancerSignAndSymptoms.getFoulSmellingVaginalDischarge();
        Long actualID = actualCancerSignAndSymptoms.getID();
        Timestamp actualLastModDate = actualCancerSignAndSymptoms.getLastModDate();
        Boolean actualLumpInTheBreast = actualCancerSignAndSymptoms.getLumpInTheBreast();
        Boolean actualLymphNode_Enlarged = actualCancerSignAndSymptoms.getLymphNode_Enlarged();
        String actualModifiedBy = actualCancerSignAndSymptoms.getModifiedBy();
        Boolean actualNonHealingUlcerOrPatchOrGrowth = actualCancerSignAndSymptoms.getNonHealingUlcerOrPatchOrGrowth();
        String actualObservation = actualCancerSignAndSymptoms.getObservation();
        Integer actualParkingPlaceID = actualCancerSignAndSymptoms.getParkingPlaceID();
        String actualProcessed = actualCancerSignAndSymptoms.getProcessed();
        Integer actualProviderServiceMapID = actualCancerSignAndSymptoms.getProviderServiceMapID();
        String actualReservedForChange = actualCancerSignAndSymptoms.getReservedForChange();
        Boolean actualShortnessOfBreath = actualCancerSignAndSymptoms.getShortnessOfBreath();
        String actualSyncedBy = actualCancerSignAndSymptoms.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerSignAndSymptoms.getSyncedDate();
        Boolean actualVaginalBleedingAfterIntercourse = actualCancerSignAndSymptoms.getVaginalBleedingAfterIntercourse();
        Boolean actualVaginalBleedingAfterMenopause = actualCancerSignAndSymptoms.getVaginalBleedingAfterMenopause();
        Boolean actualVaginalBleedingBetweenPeriods = actualCancerSignAndSymptoms.getVaginalBleedingBetweenPeriods();
        Integer actualVanID = actualCancerSignAndSymptoms.getVanID();
        Long actualVanSerialNo = actualCancerSignAndSymptoms.getVanSerialNo();
        String actualVehicalNo = actualCancerSignAndSymptoms.getVehicalNo();
        Long actualVisitCode = actualCancerSignAndSymptoms.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Observation", actualBriefHistory);
        assertEquals("Observation", actualObservation);
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
        assertTrue(actualBloodInSputum);
        assertTrue(actualBloodStainedDischargeFromNipple);
        assertTrue(actualBreastEnlargement);
        assertTrue(actualChangeInShapeAndSizeOfBreasts);
        assertTrue(actualChangeInTheToneOfVoice);
        assertTrue(actualCoughGTE2Weeks);
        assertTrue(actualCoughgt2Weeks);
        assertTrue(actualDeleted);
        assertTrue(actualDifficultyInOpeningMouth);
        assertTrue(actualFoulSmellingVaginalDischarge);
        assertTrue(actualLumpInTheBreast);
        assertTrue(actualLymphNode_Enlarged);
        assertTrue(actualNonHealingUlcerOrPatchOrGrowth);
        assertTrue(actualShortnessOfBreath);
        assertTrue(actualVaginalBleedingAfterIntercourse);
        assertTrue(actualVaginalBleedingAfterMenopause);
        assertTrue(actualVaginalBleedingBetweenPeriods);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link CancerSignAndSymptoms#CancerSignAndSymptoms(Long, Long, Long, Integer, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, Boolean, String, String, Timestamp, String, Timestamp)}
     *   <li>{@link CancerSignAndSymptoms#setBenVisitID(Long)}
     *   <li>{@link CancerSignAndSymptoms#setBeneficiaryRegID(Long)}
     *   <li>{@link CancerSignAndSymptoms#setBloodInSputum(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setBloodStainedDischargeFromNipple(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setBreastEnlargement(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setBriefHistory(String)}
     *   <li>{@link CancerSignAndSymptoms#setChangeInShapeAndSizeOfBreasts(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setChangeInTheToneOfVoice(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setCoughGTE2Weeks(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setCoughgt2Weeks(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setCreatedBy(String)}
     *   <li>{@link CancerSignAndSymptoms#setCreatedDate(Timestamp)}
     *   <li>{@link CancerSignAndSymptoms#setDeleted(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setDifficultyInOpeningMouth(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setFoulSmellingVaginalDischarge(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setID(Long)}
     *   <li>{@link CancerSignAndSymptoms#setLastModDate(Timestamp)}
     *   <li>{@link CancerSignAndSymptoms#setLumpInTheBreast(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setLymphNode_Enlarged(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setModifiedBy(String)}
     *   <li>{@link CancerSignAndSymptoms#setNonHealingUlcerOrPatchOrGrowth(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setObservation(String)}
     *   <li>{@link CancerSignAndSymptoms#setParkingPlaceID(Integer)}
     *   <li>{@link CancerSignAndSymptoms#setProcessed(String)}
     *   <li>{@link CancerSignAndSymptoms#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerSignAndSymptoms#setReservedForChange(String)}
     *   <li>{@link CancerSignAndSymptoms#setShortnessOfBreath(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setSyncedBy(String)}
     *   <li>{@link CancerSignAndSymptoms#setSyncedDate(Timestamp)}
     *   <li>{@link CancerSignAndSymptoms#setVaginalBleedingAfterIntercourse(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setVaginalBleedingAfterMenopause(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setVaginalBleedingBetweenPeriods(Boolean)}
     *   <li>{@link CancerSignAndSymptoms#setVanID(Integer)}
     *   <li>{@link CancerSignAndSymptoms#setVanSerialNo(Long)}
     *   <li>{@link CancerSignAndSymptoms#setVehicalNo(String)}
     *   <li>{@link CancerSignAndSymptoms#setVisitCode(Long)}
     *   <li>{@link CancerSignAndSymptoms#getBenVisitID()}
     *   <li>{@link CancerSignAndSymptoms#getBeneficiaryRegID()}
     *   <li>{@link CancerSignAndSymptoms#getBloodInSputum()}
     *   <li>{@link CancerSignAndSymptoms#getBloodStainedDischargeFromNipple()}
     *   <li>{@link CancerSignAndSymptoms#getBreastEnlargement()}
     *   <li>{@link CancerSignAndSymptoms#getBriefHistory()}
     *   <li>{@link CancerSignAndSymptoms#getChangeInShapeAndSizeOfBreasts()}
     *   <li>{@link CancerSignAndSymptoms#getChangeInTheToneOfVoice()}
     *   <li>{@link CancerSignAndSymptoms#getCoughGTE2Weeks()}
     *   <li>{@link CancerSignAndSymptoms#getCoughgt2Weeks()}
     *   <li>{@link CancerSignAndSymptoms#getCreatedBy()}
     *   <li>{@link CancerSignAndSymptoms#getCreatedDate()}
     *   <li>{@link CancerSignAndSymptoms#getDeleted()}
     *   <li>{@link CancerSignAndSymptoms#getDifficultyInOpeningMouth()}
     *   <li>{@link CancerSignAndSymptoms#getFoulSmellingVaginalDischarge()}
     *   <li>{@link CancerSignAndSymptoms#getID()}
     *   <li>{@link CancerSignAndSymptoms#getLastModDate()}
     *   <li>{@link CancerSignAndSymptoms#getLumpInTheBreast()}
     *   <li>{@link CancerSignAndSymptoms#getLymphNode_Enlarged()}
     *   <li>{@link CancerSignAndSymptoms#getModifiedBy()}
     *   <li>{@link CancerSignAndSymptoms#getNonHealingUlcerOrPatchOrGrowth()}
     *   <li>{@link CancerSignAndSymptoms#getObservation()}
     *   <li>{@link CancerSignAndSymptoms#getParkingPlaceID()}
     *   <li>{@link CancerSignAndSymptoms#getProcessed()}
     *   <li>{@link CancerSignAndSymptoms#getProviderServiceMapID()}
     *   <li>{@link CancerSignAndSymptoms#getReservedForChange()}
     *   <li>{@link CancerSignAndSymptoms#getShortnessOfBreath()}
     *   <li>{@link CancerSignAndSymptoms#getSyncedBy()}
     *   <li>{@link CancerSignAndSymptoms#getSyncedDate()}
     *   <li>{@link CancerSignAndSymptoms#getVaginalBleedingAfterIntercourse()}
     *   <li>{@link CancerSignAndSymptoms#getVaginalBleedingAfterMenopause()}
     *   <li>{@link CancerSignAndSymptoms#getVaginalBleedingBetweenPeriods()}
     *   <li>{@link CancerSignAndSymptoms#getVanID()}
     *   <li>{@link CancerSignAndSymptoms#getVanSerialNo()}
     *   <li>{@link CancerSignAndSymptoms#getVehicalNo()}
     *   <li>{@link CancerSignAndSymptoms#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        CancerSignAndSymptoms actualCancerSignAndSymptoms = new CancerSignAndSymptoms(1L, 1L, 1L, 1, true, true, true, true,
                true, true, true, true, true, true, true, true, true, true, true, "Observation", true, "Processed",
                "Jan 1, 2020 8:00am GMT+0100", mock(Timestamp.class), "Jan 1, 2020 9:00am GMT+0100", mock(Timestamp.class));
        actualCancerSignAndSymptoms.setBenVisitID(1L);
        actualCancerSignAndSymptoms.setBeneficiaryRegID(1L);
        actualCancerSignAndSymptoms.setBloodInSputum(true);
        actualCancerSignAndSymptoms.setBloodStainedDischargeFromNipple(true);
        actualCancerSignAndSymptoms.setBreastEnlargement(true);
        actualCancerSignAndSymptoms.setBriefHistory("Observation");
        actualCancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(true);
        actualCancerSignAndSymptoms.setChangeInTheToneOfVoice(true);
        actualCancerSignAndSymptoms.setCoughGTE2Weeks(true);
        actualCancerSignAndSymptoms.setCoughgt2Weeks(true);
        actualCancerSignAndSymptoms.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerSignAndSymptoms.setCreatedDate(createdDate);
        actualCancerSignAndSymptoms.setDeleted(true);
        actualCancerSignAndSymptoms.setDifficultyInOpeningMouth(true);
        actualCancerSignAndSymptoms.setFoulSmellingVaginalDischarge(true);
        actualCancerSignAndSymptoms.setID(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerSignAndSymptoms.setLastModDate(lastModDate);
        actualCancerSignAndSymptoms.setLumpInTheBreast(true);
        actualCancerSignAndSymptoms.setLymphNode_Enlarged(true);
        actualCancerSignAndSymptoms.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(true);
        actualCancerSignAndSymptoms.setObservation("Observation");
        actualCancerSignAndSymptoms.setParkingPlaceID(1);
        actualCancerSignAndSymptoms.setProcessed("Processed");
        actualCancerSignAndSymptoms.setProviderServiceMapID(1);
        actualCancerSignAndSymptoms.setReservedForChange("Reserved For Change");
        actualCancerSignAndSymptoms.setShortnessOfBreath(true);
        actualCancerSignAndSymptoms.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerSignAndSymptoms.setSyncedDate(syncedDate);
        actualCancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(true);
        actualCancerSignAndSymptoms.setVaginalBleedingAfterMenopause(true);
        actualCancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(true);
        actualCancerSignAndSymptoms.setVanID(1);
        actualCancerSignAndSymptoms.setVanSerialNo(1L);
        actualCancerSignAndSymptoms.setVehicalNo("Vehical No");
        actualCancerSignAndSymptoms.setVisitCode(1L);
        Long actualBenVisitID = actualCancerSignAndSymptoms.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerSignAndSymptoms.getBeneficiaryRegID();
        Boolean actualBloodInSputum = actualCancerSignAndSymptoms.getBloodInSputum();
        Boolean actualBloodStainedDischargeFromNipple = actualCancerSignAndSymptoms.getBloodStainedDischargeFromNipple();
        Boolean actualBreastEnlargement = actualCancerSignAndSymptoms.getBreastEnlargement();
        String actualBriefHistory = actualCancerSignAndSymptoms.getBriefHistory();
        Boolean actualChangeInShapeAndSizeOfBreasts = actualCancerSignAndSymptoms.getChangeInShapeAndSizeOfBreasts();
        Boolean actualChangeInTheToneOfVoice = actualCancerSignAndSymptoms.getChangeInTheToneOfVoice();
        Boolean actualCoughGTE2Weeks = actualCancerSignAndSymptoms.getCoughGTE2Weeks();
        Boolean actualCoughgt2Weeks = actualCancerSignAndSymptoms.getCoughgt2Weeks();
        String actualCreatedBy = actualCancerSignAndSymptoms.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerSignAndSymptoms.getCreatedDate();
        Boolean actualDeleted = actualCancerSignAndSymptoms.getDeleted();
        Boolean actualDifficultyInOpeningMouth = actualCancerSignAndSymptoms.getDifficultyInOpeningMouth();
        Boolean actualFoulSmellingVaginalDischarge = actualCancerSignAndSymptoms.getFoulSmellingVaginalDischarge();
        Long actualID = actualCancerSignAndSymptoms.getID();
        Timestamp actualLastModDate = actualCancerSignAndSymptoms.getLastModDate();
        Boolean actualLumpInTheBreast = actualCancerSignAndSymptoms.getLumpInTheBreast();
        Boolean actualLymphNode_Enlarged = actualCancerSignAndSymptoms.getLymphNode_Enlarged();
        String actualModifiedBy = actualCancerSignAndSymptoms.getModifiedBy();
        Boolean actualNonHealingUlcerOrPatchOrGrowth = actualCancerSignAndSymptoms.getNonHealingUlcerOrPatchOrGrowth();
        String actualObservation = actualCancerSignAndSymptoms.getObservation();
        Integer actualParkingPlaceID = actualCancerSignAndSymptoms.getParkingPlaceID();
        String actualProcessed = actualCancerSignAndSymptoms.getProcessed();
        Integer actualProviderServiceMapID = actualCancerSignAndSymptoms.getProviderServiceMapID();
        String actualReservedForChange = actualCancerSignAndSymptoms.getReservedForChange();
        Boolean actualShortnessOfBreath = actualCancerSignAndSymptoms.getShortnessOfBreath();
        String actualSyncedBy = actualCancerSignAndSymptoms.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerSignAndSymptoms.getSyncedDate();
        Boolean actualVaginalBleedingAfterIntercourse = actualCancerSignAndSymptoms.getVaginalBleedingAfterIntercourse();
        Boolean actualVaginalBleedingAfterMenopause = actualCancerSignAndSymptoms.getVaginalBleedingAfterMenopause();
        Boolean actualVaginalBleedingBetweenPeriods = actualCancerSignAndSymptoms.getVaginalBleedingBetweenPeriods();
        Integer actualVanID = actualCancerSignAndSymptoms.getVanID();
        Long actualVanSerialNo = actualCancerSignAndSymptoms.getVanSerialNo();
        String actualVehicalNo = actualCancerSignAndSymptoms.getVehicalNo();
        Long actualVisitCode = actualCancerSignAndSymptoms.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Observation", actualBriefHistory);
        assertEquals("Observation", actualObservation);
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
        assertTrue(actualBloodInSputum);
        assertTrue(actualBloodStainedDischargeFromNipple);
        assertTrue(actualBreastEnlargement);
        assertTrue(actualChangeInShapeAndSizeOfBreasts);
        assertTrue(actualChangeInTheToneOfVoice);
        assertTrue(actualCoughGTE2Weeks);
        assertTrue(actualCoughgt2Weeks);
        assertTrue(actualDeleted);
        assertTrue(actualDifficultyInOpeningMouth);
        assertTrue(actualFoulSmellingVaginalDischarge);
        assertTrue(actualLumpInTheBreast);
        assertTrue(actualLymphNode_Enlarged);
        assertTrue(actualNonHealingUlcerOrPatchOrGrowth);
        assertTrue(actualShortnessOfBreath);
        assertTrue(actualVaginalBleedingAfterIntercourse);
        assertTrue(actualVaginalBleedingAfterMenopause);
        assertTrue(actualVaginalBleedingBetweenPeriods);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }
}
