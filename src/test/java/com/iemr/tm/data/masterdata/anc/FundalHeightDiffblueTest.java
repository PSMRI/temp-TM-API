package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class FundalHeightDiffblueTest {
    /**
     * Method under test: {@link FundalHeight#getFundalHeights(ArrayList)}
     */
    @Test
    void testGetFundalHeights() {
        // Arrange and Act
        ArrayList<FundalHeight> actualFundalHeights = FundalHeight.getFundalHeights(new ArrayList<>());

        // Assert
        assertTrue(actualFundalHeights.isEmpty());
    }

    /**
     * Method under test: {@link FundalHeight#FundalHeight(Short, String, String)}
     */
    @Test
    void testNewFundalHeight() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     FundalHeight.createdBy
        //     FundalHeight.createdDate
        //     FundalHeight.deleted
        //     FundalHeight.fundalHeight
        //     FundalHeight.fundalHeightDesc
        //     FundalHeight.fundalHeightID
        //     FundalHeight.lastModDate
        //     FundalHeight.modifiedBy
        //     FundalHeight.processed

        // Arrange and Act
        new FundalHeight((short) 1, "Fundal Height", "Fundal Height Desc");

    }
}
