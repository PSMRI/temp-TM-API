package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class NewBornComplicationDiffblueTest {
    /**
     * Method under test:
     * {@link NewBornComplication#getNewBornComplications(ArrayList)}
     */
    @Test
    void testGetNewBornComplications() {
        // Arrange and Act
        ArrayList<NewBornComplication> actualNewBornComplications = NewBornComplication
                .getNewBornComplications(new ArrayList<>());

        // Assert
        assertTrue(actualNewBornComplications.isEmpty());
    }

    /**
     * Method under test:
     * {@link NewBornComplication#NewBornComplication(Short, String)}
     */
    @Test
    void testNewNewBornComplication() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     NewBornComplication.createdBy
        //     NewBornComplication.createdDate
        //     NewBornComplication.deleted
        //     NewBornComplication.lastModDate
        //     NewBornComplication.modifiedBy
        //     NewBornComplication.newBornComplication
        //     NewBornComplication.newBornComplicationDesc
        //     NewBornComplication.newBornComplicationID
        //     NewBornComplication.processed

        // Arrange and Act
        new NewBornComplication((short) 1, "New Born Complication");

    }
}
