package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DeliveryTypeDiffblueTest {
    /**
     * Method under test: {@link DeliveryType#getDeliveryType(ArrayList)}
     */
    @Test
    void testGetDeliveryType() {
        // Arrange and Act
        ArrayList<DeliveryType> actualDeliveryType = DeliveryType.getDeliveryType(new ArrayList<>());

        // Assert
        assertTrue(actualDeliveryType.isEmpty());
    }

    /**
     * Method under test: {@link DeliveryType#DeliveryType(Short, String)}
     */
    @Test
    void testNewDeliveryType() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     DeliveryType.createdBy
        //     DeliveryType.createdDate
        //     DeliveryType.deleted
        //     DeliveryType.deliveryType
        //     DeliveryType.deliveryTypeID
        //     DeliveryType.lastModDate
        //     DeliveryType.modifiedBy
        //     DeliveryType.processed

        // Arrange and Act
        new DeliveryType((short) 1, "Delivery Type");

    }
}
