package com.iemr.tm.data.masterdata.nurse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class VisitReasonDiffblueTest {
    /**
     * Method under test: {@link VisitReason#getVisitReasonMasterData(ArrayList)}
     */
    @Test
    void testGetVisitReasonMasterData() {
        // Arrange and Act
        ArrayList<VisitReason> actualVisitReasonMasterData = VisitReason.getVisitReasonMasterData(new ArrayList<>());

        // Assert
        assertTrue(actualVisitReasonMasterData.isEmpty());
    }

    /**
     * Method under test: {@link VisitReason#VisitReason(Short, String)}
     */
    @Test
    void testNewVisitReason() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     VisitReason.deleted
        //     VisitReason.visitReason
        //     VisitReason.visitReasonDesc
        //     VisitReason.visitReasonID

        // Arrange and Act
        new VisitReason((short) 1, "Just cause");

    }
}
