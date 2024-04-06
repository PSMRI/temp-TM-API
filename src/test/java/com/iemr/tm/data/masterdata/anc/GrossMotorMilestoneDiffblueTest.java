package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class GrossMotorMilestoneDiffblueTest {
    /**
     * Method under test:
     * {@link GrossMotorMilestone#getGrossMotorMilestone(ArrayList)}
     */
    @Test
    void testGetGrossMotorMilestone() {
        // Arrange and Act
        ArrayList<GrossMotorMilestone> actualGrossMotorMilestone = GrossMotorMilestone
                .getGrossMotorMilestone(new ArrayList<>());

        // Assert
        assertTrue(actualGrossMotorMilestone.isEmpty());
    }

    /**
     * Method under test:
     * {@link GrossMotorMilestone#GrossMotorMilestone(Short, String, String)}
     */
    @Test
    void testNewGrossMotorMilestone() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     GrossMotorMilestone.createdBy
        //     GrossMotorMilestone.createdDate
        //     GrossMotorMilestone.deleted
        //     GrossMotorMilestone.gMMilestone
        //     GrossMotorMilestone.gMMilestoneDesc
        //     GrossMotorMilestone.gMMilestoneID
        //     GrossMotorMilestone.lastModDate
        //     GrossMotorMilestone.modifiedBy
        //     GrossMotorMilestone.processed

        // Arrange and Act
        new GrossMotorMilestone((short) 1, "G MMilestone", "G MMilestone Desc");

    }
}
