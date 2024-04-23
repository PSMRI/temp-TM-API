package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PregDurationDiffblueTest {
    /**
     * Method under test: {@link PregDuration#getPregDurationValues(ArrayList)}
     */
    @Test
    void testGetPregDurationValues() {
        // Arrange and Act
        ArrayList<PregDuration> actualPregDurationValues = PregDuration.getPregDurationValues(new ArrayList<>());

        // Assert
        assertTrue(actualPregDurationValues.isEmpty());
    }

    /**
     * Method under test: {@link PregDuration#PregDuration(Short, String)}
     */
    @Test
    void testNewPregDuration() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     PregDuration.createdBy
        //     PregDuration.createdDate
        //     PregDuration.deleted
        //     PregDuration.durationType
        //     PregDuration.lastModDate
        //     PregDuration.modifiedBy
        //     PregDuration.pregDurationID
        //     PregDuration.processed

        // Arrange and Act
        new PregDuration((short) 1, "Duration Type");

    }
}
