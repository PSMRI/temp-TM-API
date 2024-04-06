package com.iemr.tm.data.foetalmonitor;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class FoetalMonitorTestMasterDiffblueTest {
    /**
     * Method under test:
     * {@link FoetalMonitorTestMaster#getFoetalMonitorMasters(ArrayList)}
     */
    @Test
    void testGetFoetalMonitorMasters() {
        // Arrange and Act
        ArrayList<FoetalMonitorTestMaster> actualFoetalMonitorMasters = FoetalMonitorTestMaster
                .getFoetalMonitorMasters(new ArrayList<>());

        // Assert
        assertTrue(actualFoetalMonitorMasters.isEmpty());
    }

    /**
     * Method under test:
     * {@link FoetalMonitorTestMaster#FoetalMonitorTestMaster(Integer, String)}
     */
    @Test
    void testNewFoetalMonitorTestMaster() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     FoetalMonitorTestMaster.createdBy
        //     FoetalMonitorTestMaster.createdDate
        //     FoetalMonitorTestMaster.deleted
        //     FoetalMonitorTestMaster.foetalMonitorTestId
        //     FoetalMonitorTestMaster.lastModDate
        //     FoetalMonitorTestMaster.modifiedBy
        //     FoetalMonitorTestMaster.processed
        //     FoetalMonitorTestMaster.providerServiceMapID
        //     FoetalMonitorTestMaster.testDesc
        //     FoetalMonitorTestMaster.testName

        // Arrange and Act
        new FoetalMonitorTestMaster(1, "Test Name");

    }
}
