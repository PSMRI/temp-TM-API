package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MusculoskeletalDiffblueTest {
    /**
     * Method under test: {@link Musculoskeletal#getMusculoskeletals(ArrayList)}
     */
    @Test
    void testGetMusculoskeletals() {
        // Arrange and Act
        ArrayList<Musculoskeletal> actualMusculoskeletals = Musculoskeletal.getMusculoskeletals(new ArrayList<>());

        // Assert
        assertTrue(actualMusculoskeletals.isEmpty());
    }

    /**
     * Method under test:
     * {@link Musculoskeletal#Musculoskeletal(Short, String, String)}
     */
    @Test
    void testNewMusculoskeletal() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     Musculoskeletal.ID
        //     Musculoskeletal.createdBy
        //     Musculoskeletal.createdDate
        //     Musculoskeletal.deleted
        //     Musculoskeletal.lastModDate
        //     Musculoskeletal.modifiedBy
        //     Musculoskeletal.processed
        //     Musculoskeletal.type
        //     Musculoskeletal.value

        // Arrange and Act
        new Musculoskeletal((short) 1, "Type", "42");

    }
}
