package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class WrapperCancerSymptomsDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link WrapperCancerSymptoms#setCancerLymphNodeDetails(List)}
     *   <li>
     * {@link WrapperCancerSymptoms#setCancerSignAndSymptoms(CancerSignAndSymptoms)}
     *   <li>{@link WrapperCancerSymptoms#getCancerLymphNodeDetails()}
     *   <li>{@link WrapperCancerSymptoms#getCancerSignAndSymptoms()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        WrapperCancerSymptoms wrapperCancerSymptoms = new WrapperCancerSymptoms();
        ArrayList<CancerLymphNodeDetails> cancerLymphNodeDetails = new ArrayList<>();

        // Act
        wrapperCancerSymptoms.setCancerLymphNodeDetails(cancerLymphNodeDetails);
        CancerSignAndSymptoms cancerSignAndSymptoms = new CancerSignAndSymptoms();
        cancerSignAndSymptoms.setBenVisitID(1L);
        cancerSignAndSymptoms.setBeneficiaryRegID(1L);
        cancerSignAndSymptoms.setBloodInSputum(true);
        cancerSignAndSymptoms.setBloodStainedDischargeFromNipple(true);
        cancerSignAndSymptoms.setBreastEnlargement(true);
        cancerSignAndSymptoms.setBriefHistory("Observation");
        cancerSignAndSymptoms.setChangeInShapeAndSizeOfBreasts(true);
        cancerSignAndSymptoms.setChangeInTheToneOfVoice(true);
        cancerSignAndSymptoms.setCoughGTE2Weeks(true);
        cancerSignAndSymptoms.setCoughgt2Weeks(true);
        cancerSignAndSymptoms.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        cancerSignAndSymptoms.setCreatedDate(mock(Timestamp.class));
        cancerSignAndSymptoms.setDeleted(true);
        cancerSignAndSymptoms.setDifficultyInOpeningMouth(true);
        cancerSignAndSymptoms.setFoulSmellingVaginalDischarge(true);
        cancerSignAndSymptoms.setID(1L);
        cancerSignAndSymptoms.setLastModDate(mock(Timestamp.class));
        cancerSignAndSymptoms.setLumpInTheBreast(true);
        cancerSignAndSymptoms.setLymphNode_Enlarged(true);
        cancerSignAndSymptoms.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        cancerSignAndSymptoms.setNonHealingUlcerOrPatchOrGrowth(true);
        cancerSignAndSymptoms.setObservation("Observation");
        cancerSignAndSymptoms.setParkingPlaceID(1);
        cancerSignAndSymptoms.setProcessed("Processed");
        cancerSignAndSymptoms.setProviderServiceMapID(1);
        cancerSignAndSymptoms.setReservedForChange("Reserved For Change");
        cancerSignAndSymptoms.setShortnessOfBreath(true);
        cancerSignAndSymptoms.setSyncedBy("Synced By");
        cancerSignAndSymptoms.setSyncedDate(mock(Timestamp.class));
        cancerSignAndSymptoms.setVaginalBleedingAfterIntercourse(true);
        cancerSignAndSymptoms.setVaginalBleedingAfterMenopause(true);
        cancerSignAndSymptoms.setVaginalBleedingBetweenPeriods(true);
        cancerSignAndSymptoms.setVanID(1);
        cancerSignAndSymptoms.setVanSerialNo(1L);
        cancerSignAndSymptoms.setVehicalNo("Vehical No");
        cancerSignAndSymptoms.setVisitCode(1L);
        wrapperCancerSymptoms.setCancerSignAndSymptoms(cancerSignAndSymptoms);
        List<CancerLymphNodeDetails> actualCancerLymphNodeDetails = wrapperCancerSymptoms.getCancerLymphNodeDetails();

        // Assert that nothing has changed
        assertSame(cancerSignAndSymptoms, wrapperCancerSymptoms.getCancerSignAndSymptoms());
        assertSame(cancerLymphNodeDetails, actualCancerLymphNodeDetails);
    }
}
