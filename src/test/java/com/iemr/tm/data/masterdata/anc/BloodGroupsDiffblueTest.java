package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BloodGroupsDiffblueTest {
    /**
     * Method under test: {@link BloodGroups#getBloodGroups(ArrayList)}
     */
    @Test
    void testGetBloodGroups() {
        // Arrange and Act
        ArrayList<BloodGroups> actualBloodGroups = BloodGroups.getBloodGroups(new ArrayList<>());

        // Assert
        assertTrue(actualBloodGroups.isEmpty());
    }

    /**
     * Method under test: {@link BloodGroups#BloodGroups()}
     */
    @Test
    void testNewBloodGroups() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     BloodGroups.bloodGroup
        //     BloodGroups.bloodGroupDesc
        //     BloodGroups.bloodGroupID
        //     BloodGroups.createdBy
        //     BloodGroups.createdDate
        //     BloodGroups.deleted
        //     BloodGroups.lastModDate
        //     BloodGroups.modifiedBy
        //     BloodGroups.processed

        // Arrange and Act
        new BloodGroups();
    }

    /**
     * Method under test: {@link BloodGroups#BloodGroups(Integer, String, String)}
     */
    @Test
    void testNewBloodGroups2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     BloodGroups.bloodGroup
        //     BloodGroups.bloodGroupDesc
        //     BloodGroups.bloodGroupID
        //     BloodGroups.createdBy
        //     BloodGroups.createdDate
        //     BloodGroups.deleted
        //     BloodGroups.lastModDate
        //     BloodGroups.modifiedBy
        //     BloodGroups.processed

        // Arrange and Act
        new BloodGroups(1, "Blood Group", "Blood Group Desc");

    }
}
