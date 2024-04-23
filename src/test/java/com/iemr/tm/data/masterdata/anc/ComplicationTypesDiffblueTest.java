package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ComplicationTypesDiffblueTest {
    /**
     * Method under test:
     * {@link ComplicationTypes#getComplicationTypes(ArrayList, int)}
     */
    @Test
    void testGetComplicationTypes() {
        // Arrange and Act
        ArrayList<ComplicationTypes> actualComplicationTypes = ComplicationTypes.getComplicationTypes(new ArrayList<>(), 1);

        // Assert
        assertTrue(actualComplicationTypes.isEmpty());
    }

    /**
     * Method under test: {@link ComplicationTypes#ComplicationTypes(Short, String)}
     */
    @Test
    void testNewComplicationTypes() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ComplicationTypes.complicationDesc
        //     ComplicationTypes.complicationID
        //     ComplicationTypes.complicationType
        //     ComplicationTypes.complicationValue
        //     ComplicationTypes.createdBy
        //     ComplicationTypes.createdDate
        //     ComplicationTypes.deleted
        //     ComplicationTypes.deliveryComplicationID
        //     ComplicationTypes.deliveryComplicationType
        //     ComplicationTypes.lastModDate
        //     ComplicationTypes.modifiedBy
        //     ComplicationTypes.postpartumComplicationID
        //     ComplicationTypes.postpartumComplicationType
        //     ComplicationTypes.pregComplicationID
        //     ComplicationTypes.pregComplicationType
        //     ComplicationTypes.processed

        // Arrange and Act
        new ComplicationTypes((short) 1, "42");

    }

    /**
     * Method under test:
     * {@link ComplicationTypes#ComplicationTypes(Short, String, int)}
     */
    @Test
    void testNewComplicationTypes2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ComplicationTypes.complicationDesc
        //     ComplicationTypes.complicationID
        //     ComplicationTypes.complicationType
        //     ComplicationTypes.complicationValue
        //     ComplicationTypes.createdBy
        //     ComplicationTypes.createdDate
        //     ComplicationTypes.deleted
        //     ComplicationTypes.deliveryComplicationID
        //     ComplicationTypes.deliveryComplicationType
        //     ComplicationTypes.lastModDate
        //     ComplicationTypes.modifiedBy
        //     ComplicationTypes.postpartumComplicationID
        //     ComplicationTypes.postpartumComplicationType
        //     ComplicationTypes.pregComplicationID
        //     ComplicationTypes.pregComplicationType
        //     ComplicationTypes.processed

        // Arrange and Act
        new ComplicationTypes((short) 1, "42", 1);

    }

    /**
     * Method under test:
     * {@link ComplicationTypes#ComplicationTypes(Short, String, int, int)}
     */
    @Test
    void testNewComplicationTypes3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ComplicationTypes.complicationDesc
        //     ComplicationTypes.complicationID
        //     ComplicationTypes.complicationType
        //     ComplicationTypes.complicationValue
        //     ComplicationTypes.createdBy
        //     ComplicationTypes.createdDate
        //     ComplicationTypes.deleted
        //     ComplicationTypes.deliveryComplicationID
        //     ComplicationTypes.deliveryComplicationType
        //     ComplicationTypes.lastModDate
        //     ComplicationTypes.modifiedBy
        //     ComplicationTypes.postpartumComplicationID
        //     ComplicationTypes.postpartumComplicationType
        //     ComplicationTypes.pregComplicationID
        //     ComplicationTypes.pregComplicationType
        //     ComplicationTypes.processed

        // Arrange and Act
        new ComplicationTypes((short) 1, "42", 1, 1);

    }

    /**
     * Method under test:
     * {@link ComplicationTypes#ComplicationTypes(Short, String, int, int, int)}
     */
    @Test
    void testNewComplicationTypes4() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ComplicationTypes.complicationDesc
        //     ComplicationTypes.complicationID
        //     ComplicationTypes.complicationType
        //     ComplicationTypes.complicationValue
        //     ComplicationTypes.createdBy
        //     ComplicationTypes.createdDate
        //     ComplicationTypes.deleted
        //     ComplicationTypes.deliveryComplicationID
        //     ComplicationTypes.deliveryComplicationType
        //     ComplicationTypes.lastModDate
        //     ComplicationTypes.modifiedBy
        //     ComplicationTypes.postpartumComplicationID
        //     ComplicationTypes.postpartumComplicationType
        //     ComplicationTypes.pregComplicationID
        //     ComplicationTypes.pregComplicationType
        //     ComplicationTypes.processed

        // Arrange and Act
        new ComplicationTypes((short) 1, "42", 1, 1, 1);

    }
}
