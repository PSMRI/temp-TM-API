package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DeliveryComplicationTypesDiffblueTest {
    /**
     * Method under test:
     * {@link DeliveryComplicationTypes#getDeliveryComplicationTypes(ArrayList)}
     */
    @Test
    void testGetDeliveryComplicationTypes() {
        // Arrange and Act
        ArrayList<DeliveryComplicationTypes> actualDeliveryComplicationTypes = DeliveryComplicationTypes
                .getDeliveryComplicationTypes(new ArrayList<>());

        // Assert
        assertTrue(actualDeliveryComplicationTypes.isEmpty());
    }

    /**
     * Method under test:
     * {@link DeliveryComplicationTypes#DeliveryComplicationTypes(Short, String)}
     */
    @Test
    void testNewDeliveryComplicationTypes() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     DeliveryComplicationTypes.createdBy
        //     DeliveryComplicationTypes.createdDate
        //     DeliveryComplicationTypes.deleted
        //     DeliveryComplicationTypes.deliveryComplicationID
        //     DeliveryComplicationTypes.deliveryComplicationType
        //     DeliveryComplicationTypes.lastModDate
        //     DeliveryComplicationTypes.modifiedBy
        //     DeliveryComplicationTypes.processed

        // Arrange and Act
        new DeliveryComplicationTypes((short) 1, "Delivery Complication Type");

    }
}
