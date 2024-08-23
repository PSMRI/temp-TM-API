package com.iemr.tm.data.masterdata.registrar;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class IncomeStatusMasterDiffblueTest {
    /**
     * Method under test:
     * {@link IncomeStatusMaster#getIncomeStatusMasterData(ArrayList)}
     */
    @Test
    void testGetIncomeStatusMasterData() {
        // Arrange and Act
        ArrayList<IncomeStatusMaster> actualIncomeStatusMasterData = IncomeStatusMaster
                .getIncomeStatusMasterData(new ArrayList<>());

        // Assert
        assertTrue(actualIncomeStatusMasterData.isEmpty());
    }

    /**
     * Method under test: {@link IncomeStatusMaster#IncomeStatusMaster()}
     */
    @Test
    void testNewIncomeStatusMaster() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     IncomeStatusMaster.deleted
        //     IncomeStatusMaster.incomeStatus
        //     IncomeStatusMaster.incomeStatusID

        // Arrange and Act
        new IncomeStatusMaster();
    }

    /**
     * Method under test:
     * {@link IncomeStatusMaster#IncomeStatusMaster(Short, String)}
     */
    @Test
    void testNewIncomeStatusMaster2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     IncomeStatusMaster.deleted
        //     IncomeStatusMaster.incomeStatus
        //     IncomeStatusMaster.incomeStatusID

        // Arrange and Act
        new IncomeStatusMaster((short) 1, "Income Status");

    }
}
