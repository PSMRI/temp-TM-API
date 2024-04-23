package com.iemr.tm.data.masterdata.registrar;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MaritalStatusMasterDiffblueTest {
    /**
     * Method under test:
     * {@link MaritalStatusMaster#getMaritalStatusMasterData(ArrayList)}
     */
    @Test
    void testGetMaritalStatusMasterData() {
        // Arrange and Act
        ArrayList<MaritalStatusMaster> actualMaritalStatusMasterData = MaritalStatusMaster
                .getMaritalStatusMasterData(new ArrayList<>());

        // Assert
        assertTrue(actualMaritalStatusMasterData.isEmpty());
    }

    /**
     * Method under test: {@link MaritalStatusMaster#MaritalStatusMaster()}
     */
    @Test
    void testNewMaritalStatusMaster() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     MaritalStatusMaster.deleted
        //     MaritalStatusMaster.maritalStatusID
        //     MaritalStatusMaster.status

        // Arrange and Act
        new MaritalStatusMaster();
    }

    /**
     * Method under test:
     * {@link MaritalStatusMaster#MaritalStatusMaster(Short, String)}
     */
    @Test
    void testNewMaritalStatusMaster2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     MaritalStatusMaster.deleted
        //     MaritalStatusMaster.maritalStatusID
        //     MaritalStatusMaster.status

        // Arrange and Act
        new MaritalStatusMaster((short) 1, "Status");

    }
}
