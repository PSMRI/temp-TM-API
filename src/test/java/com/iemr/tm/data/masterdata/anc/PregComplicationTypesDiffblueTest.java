package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PregComplicationTypesDiffblueTest {
    /**
     * Method under test:
     * {@link PregComplicationTypes#getPregComplicationTypes(ArrayList)}
     */
    @Test
    void testGetPregComplicationTypes() {
        // Arrange and Act
        ArrayList<PregComplicationTypes> actualPregComplicationTypes = PregComplicationTypes
                .getPregComplicationTypes(new ArrayList<>());

        // Assert
        assertTrue(actualPregComplicationTypes.isEmpty());
    }

    /**
     * Method under test:
     * {@link PregComplicationTypes#PregComplicationTypes(Integer, String)}
     */
    @Test
    void testNewPregComplicationTypes() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     PregComplicationTypes.createdBy
        //     PregComplicationTypes.createdDate
        //     PregComplicationTypes.deleted
        //     PregComplicationTypes.lastModDate
        //     PregComplicationTypes.modifiedBy
        //     PregComplicationTypes.pregComplicationID
        //     PregComplicationTypes.pregComplicationType
        //     PregComplicationTypes.processed

        // Arrange and Act
        new PregComplicationTypes(1, "Preg Complication Type");

    }
}
