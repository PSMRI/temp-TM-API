package com.iemr.tm.data.masterdata.pnc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class NewbornHealthStatusDiffblueTest {
    /**
     * Method under test:
     * {@link NewbornHealthStatus#getNewbornHealthStatuses(ArrayList)}
     */
    @Test
    void testGetNewbornHealthStatuses() {
        // Arrange and Act
        ArrayList<NewbornHealthStatus> actualNewbornHealthStatuses = NewbornHealthStatus
                .getNewbornHealthStatuses(new ArrayList<>());

        // Assert
        assertTrue(actualNewbornHealthStatuses.isEmpty());
    }

    /**
     * Method under test:
     * {@link NewbornHealthStatus#NewbornHealthStatus(Integer, String, String)}
     */
    @Test
    void testNewNewbornHealthStatus() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     NewbornHealthStatus.createdBy
        //     NewbornHealthStatus.createdDate
        //     NewbornHealthStatus.deleted
        //     NewbornHealthStatus.lastModDate
        //     NewbornHealthStatus.modifiedBy
        //     NewbornHealthStatus.newBornHealthStatus
        //     NewbornHealthStatus.newBornHealthStatusDesc
        //     NewbornHealthStatus.newBornHealthStatusID
        //     NewbornHealthStatus.processed

        // Arrange and Act
        new NewbornHealthStatus(1, "New Born Health Status", "New Born Health Status Desc");

    }
}
