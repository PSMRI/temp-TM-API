package com.iemr.tm.data.masterdata.registrar;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class OccupationMasterDiffblueTest {
    /**
     * Method under test:
     * {@link OccupationMaster#getOccupationMasterData(ArrayList)}
     */
    @Test
    void testGetOccupationMasterData() {
        // Arrange and Act
        ArrayList<OccupationMaster> actualOccupationMasterData = OccupationMaster
                .getOccupationMasterData(new ArrayList<>());

        // Assert
        assertTrue(actualOccupationMasterData.isEmpty());
    }

    /**
     * Method under test: {@link OccupationMaster#OccupationMaster()}
     */
    @Test
    void testNewOccupationMaster() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     OccupationMaster.deleted
        //     OccupationMaster.occupationID
        //     OccupationMaster.occupationType

        // Arrange and Act
        new OccupationMaster();
    }

    /**
     * Method under test: {@link OccupationMaster#OccupationMaster(Short, String)}
     */
    @Test
    void testNewOccupationMaster2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     OccupationMaster.deleted
        //     OccupationMaster.occupationID
        //     OccupationMaster.occupationType

        // Arrange and Act
        new OccupationMaster((short) 1, "Occupation Type");

    }
}
