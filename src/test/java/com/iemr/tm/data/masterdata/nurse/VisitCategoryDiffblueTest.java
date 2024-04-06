package com.iemr.tm.data.masterdata.nurse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class VisitCategoryDiffblueTest {
    /**
     * Method under test:
     * {@link VisitCategory#getVisitCategoryMasterData(ArrayList)}
     */
    @Test
    void testGetVisitCategoryMasterData() {
        // Arrange and Act
        ArrayList<VisitCategory> actualVisitCategoryMasterData = VisitCategory
                .getVisitCategoryMasterData(new ArrayList<>());

        // Assert
        assertTrue(actualVisitCategoryMasterData.isEmpty());
    }

    /**
     * Method under test: {@link VisitCategory#VisitCategory(Short, String)}
     */
    @Test
    void testNewVisitCategory() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     VisitCategory.deleted
        //     VisitCategory.visitCategory
        //     VisitCategory.visitCategoryDesc
        //     VisitCategory.visitCategoryID

        // Arrange and Act
        new VisitCategory((short) 1, "Visit Category");

    }
}
