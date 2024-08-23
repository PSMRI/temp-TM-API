package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MenstrualCycleStatusDiffblueTest {
    /**
     * Method under test:
     * {@link MenstrualCycleStatus#getMenstrualCycleStatuses(ArrayList)}
     */
    @Test
    void testGetMenstrualCycleStatuses() {
        // Arrange and Act
        ArrayList<MenstrualCycleStatus> actualMenstrualCycleStatuses = MenstrualCycleStatus
                .getMenstrualCycleStatuses(new ArrayList<>());

        // Assert
        assertTrue(actualMenstrualCycleStatuses.isEmpty());
    }

    /**
     * Method under test:
     * {@link MenstrualCycleStatus#MenstrualCycleStatus(Short, String, String)}
     */
    @Test
    void testNewMenstrualCycleStatus() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     MenstrualCycleStatus.createdBy
        //     MenstrualCycleStatus.createdDate
        //     MenstrualCycleStatus.deleted
        //     MenstrualCycleStatus.lastModDate
        //     MenstrualCycleStatus.menstrualCycleStatusDesc
        //     MenstrualCycleStatus.menstrualCycleStatusID
        //     MenstrualCycleStatus.modifiedBy
        //     MenstrualCycleStatus.name
        //     MenstrualCycleStatus.processed
        //     MenstrualCycleStatus.visitCategoryID

        // Arrange and Act
        new MenstrualCycleStatus((short) 1, "Name", "Menstrual Cycle Status Desc");

    }
}
