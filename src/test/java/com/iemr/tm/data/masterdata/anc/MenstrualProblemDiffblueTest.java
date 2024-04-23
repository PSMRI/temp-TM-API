package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MenstrualProblemDiffblueTest {
    /**
     * Method under test: {@link MenstrualProblem#getMenstrualProblems(ArrayList)}
     */
    @Test
    void testGetMenstrualProblems() {
        // Arrange and Act
        ArrayList<MenstrualProblem> actualMenstrualProblems = MenstrualProblem.getMenstrualProblems(new ArrayList<>());

        // Assert
        assertTrue(actualMenstrualProblems.isEmpty());
    }

    /**
     * Method under test:
     * {@link MenstrualProblem#MenstrualProblem(Short, String, String)}
     */
    @Test
    void testNewMenstrualProblem() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     MenstrualProblem.createdBy
        //     MenstrualProblem.createdDate
        //     MenstrualProblem.deleted
        //     MenstrualProblem.lastModDate
        //     MenstrualProblem.menstrualProblemDesc
        //     MenstrualProblem.menstrualProblemID
        //     MenstrualProblem.modifiedBy
        //     MenstrualProblem.problemName
        //     MenstrualProblem.processed

        // Arrange and Act
        new MenstrualProblem((short) 1, "Problem Name", "Menstrual Problem Desc");

    }
}
