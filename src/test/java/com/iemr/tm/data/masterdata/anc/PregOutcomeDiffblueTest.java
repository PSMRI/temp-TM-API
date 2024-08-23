package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PregOutcomeDiffblueTest {
    /**
     * Method under test: {@link PregOutcome#getPregOutcomes(ArrayList)}
     */
    @Test
    void testGetPregOutcomes() {
        // Arrange and Act
        ArrayList<PregOutcome> actualPregOutcomes = PregOutcome.getPregOutcomes(new ArrayList<>());

        // Assert
        assertTrue(actualPregOutcomes.isEmpty());
    }

    /**
     * Method under test: {@link PregOutcome#PregOutcome(Short, String)}
     */
    @Test
    void testNewPregOutcome() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     PregOutcome.createdBy
        //     PregOutcome.createdDate
        //     PregOutcome.deleted
        //     PregOutcome.lastModDate
        //     PregOutcome.modifiedBy
        //     PregOutcome.pregOutcome
        //     PregOutcome.pregOutcomeID
        //     PregOutcome.processed

        // Arrange and Act
        new PregOutcome((short) 1, "Preg Outcome");

    }
}
