package com.iemr.tm.data.masterdata.nurse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CancerPersonalHabitTypeDiffblueTest {
    /**
     * Method under test:
     * {@link CancerPersonalHabitType#getCancerPersonalHabitTypeMasterData(ArrayList)}
     */
    @Test
    void testGetCancerPersonalHabitTypeMasterData() {
        // Arrange and Act
        ArrayList<CancerPersonalHabitType> actualCancerPersonalHabitTypeMasterData = CancerPersonalHabitType
                .getCancerPersonalHabitTypeMasterData(new ArrayList<>());

        // Assert
        assertTrue(actualCancerPersonalHabitTypeMasterData.isEmpty());
    }

    /**
     * Method under test:
     * {@link CancerPersonalHabitType#CancerPersonalHabitType(Short, String, String)}
     */
    @Test
    void testNewCancerPersonalHabitType() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     CancerPersonalHabitType.cancerPersonalHabitID
        //     CancerPersonalHabitType.deleted
        //     CancerPersonalHabitType.habitType
        //     CancerPersonalHabitType.habitValue

        // Arrange and Act
        new CancerPersonalHabitType((short) 1, "Habit Type", "42");

    }
}
