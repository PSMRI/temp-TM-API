package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MenstrualCycleRangeDiffblueTest {
    /**
     * Method under test:
     * {@link MenstrualCycleRange#getMenstrualCycleRanges(ArrayList)}
     */
    @Test
    void testGetMenstrualCycleRanges() {
        // Arrange and Act
        ArrayList<MenstrualCycleRange> actualMenstrualCycleRanges = MenstrualCycleRange
                .getMenstrualCycleRanges(new ArrayList<>());

        // Assert
        assertTrue(actualMenstrualCycleRanges.isEmpty());
    }

    /**
     * Method under test:
     * {@link MenstrualCycleRange#MenstrualCycleRange(Short, String, String, String)}
     */
    @Test
    void testNewMenstrualCycleRange() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     MenstrualCycleRange.createdBy
        //     MenstrualCycleRange.createdDate
        //     MenstrualCycleRange.deleted
        //     MenstrualCycleRange.lastModDate
        //     MenstrualCycleRange.menstrualCycleRange
        //     MenstrualCycleRange.menstrualCycleRangeDesc
        //     MenstrualCycleRange.menstrualRangeID
        //     MenstrualCycleRange.modifiedBy
        //     MenstrualCycleRange.processed
        //     MenstrualCycleRange.rangeType

        // Arrange and Act
        new MenstrualCycleRange((short) 1, "Range Type", "Menstrual Cycle Range", "Menstrual Cycle Range Desc");

    }
}
