package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ComorbidConditionDiffblueTest {
    /**
     * Method under test: {@link ComorbidCondition#getComorbidConditions(ArrayList)}
     */
    @Test
    void testGetComorbidConditions() {
        // Arrange and Act
        ArrayList<ComorbidCondition> actualComorbidConditions = ComorbidCondition.getComorbidConditions(new ArrayList<>());

        // Assert
        assertTrue(actualComorbidConditions.isEmpty());
    }

    /**
     * Method under test: {@link ComorbidCondition#ComorbidCondition(Short, String)}
     */
    @Test
    void testNewComorbidCondition() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ComorbidCondition.comorbidCondition
        //     ComorbidCondition.comorbidConditionDesc
        //     ComorbidCondition.comorbidConditionID
        //     ComorbidCondition.createdBy
        //     ComorbidCondition.createdDate
        //     ComorbidCondition.deleted
        //     ComorbidCondition.lastModDate
        //     ComorbidCondition.modifiedBy
        //     ComorbidCondition.processed
        //     ComorbidCondition.visitCategoryID

        // Arrange and Act
        new ComorbidCondition((short) 1, "Comorbid Condition");

    }
}
