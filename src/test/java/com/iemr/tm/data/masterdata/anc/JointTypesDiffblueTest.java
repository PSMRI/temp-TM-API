package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class JointTypesDiffblueTest {
    /**
     * Method under test: {@link JointTypes#getJointTypes(ArrayList)}
     */
    @Test
    void testGetJointTypes() {
        // Arrange and Act
        ArrayList<JointTypes> actualJointTypes = JointTypes.getJointTypes(new ArrayList<>());

        // Assert
        assertTrue(actualJointTypes.isEmpty());
    }

    /**
     * Method under test: {@link JointTypes#JointTypes(Short, String, String)}
     */
    @Test
    void testNewJointTypes() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     JointTypes.createdBy
        //     JointTypes.createdDate
        //     JointTypes.deleted
        //     JointTypes.jointID
        //     JointTypes.jointType
        //     JointTypes.jointTypeDesc
        //     JointTypes.lastModDate
        //     JointTypes.modifiedBy
        //     JointTypes.processed

        // Arrange and Act
        new JointTypes((short) 1, "Joint Type", "Joint Type Desc");

    }
}
