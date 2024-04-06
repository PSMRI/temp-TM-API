package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DeliveryPlaceDiffblueTest {
    /**
     * Method under test: {@link DeliveryPlace#getDeliveryPlace(ArrayList)}
     */
    @Test
    void testGetDeliveryPlace() {
        // Arrange and Act
        ArrayList<DeliveryPlace> actualDeliveryPlace = DeliveryPlace.getDeliveryPlace(new ArrayList<>());

        // Assert
        assertTrue(actualDeliveryPlace.isEmpty());
    }

    /**
     * Method under test: {@link DeliveryPlace#DeliveryPlace(Short, String)}
     */
    @Test
    void testNewDeliveryPlace() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     DeliveryPlace.createdBy
        //     DeliveryPlace.createdDate
        //     DeliveryPlace.deleted
        //     DeliveryPlace.deliveryPlace
        //     DeliveryPlace.deliveryPlaceID
        //     DeliveryPlace.lastModDate
        //     DeliveryPlace.modifiedBy
        //     DeliveryPlace.processed

        // Arrange and Act
        new DeliveryPlace((short) 1, "Delivery Place");

    }
}
