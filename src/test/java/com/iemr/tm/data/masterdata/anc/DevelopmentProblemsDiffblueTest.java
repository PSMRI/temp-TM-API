package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DevelopmentProblemsDiffblueTest {
    /**
     * Method under test:
     * {@link DevelopmentProblems#getDevelopmentProblems(ArrayList)}
     */
    @Test
    void testGetDevelopmentProblems() {
        // Arrange and Act
        ArrayList<DevelopmentProblems> actualDevelopmentProblems = DevelopmentProblems
                .getDevelopmentProblems(new ArrayList<>());

        // Assert
        assertTrue(actualDevelopmentProblems.isEmpty());
    }

    /**
     * Method under test:
     * {@link DevelopmentProblems#DevelopmentProblems(Short, String, String)}
     */
    @Test
    void testNewDevelopmentProblems() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     DevelopmentProblems.ID
        //     DevelopmentProblems.createdBy
        //     DevelopmentProblems.createdDate
        //     DevelopmentProblems.deleted
        //     DevelopmentProblems.developmentProblem
        //     DevelopmentProblems.lastModDate
        //     DevelopmentProblems.modifiedBy
        //     DevelopmentProblems.problemDesc
        //     DevelopmentProblems.processed

        // Arrange and Act
        new DevelopmentProblems((short) 1, "Development Problem", "Problem Desc");

    }
}
