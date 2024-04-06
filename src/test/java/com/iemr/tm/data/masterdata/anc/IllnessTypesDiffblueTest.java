package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class IllnessTypesDiffblueTest {
    /**
     * Method under test: {@link IllnessTypes#getIllnessTypes(ArrayList)}
     */
    @Test
    void testGetIllnessTypes() {
        // Arrange and Act
        ArrayList<IllnessTypes> actualIllnessTypes = IllnessTypes.getIllnessTypes(new ArrayList<>());

        // Assert
        assertTrue(actualIllnessTypes.isEmpty());
    }

    /**
     * Method under test: {@link IllnessTypes#IllnessTypes(Integer, String)}
     */
    @Test
    void testNewIllnessTypes() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     IllnessTypes.createdBy
        //     IllnessTypes.createdDate
        //     IllnessTypes.deleted
        //     IllnessTypes.illnessID
        //     IllnessTypes.illnessType
        //     IllnessTypes.isAcute
        //     IllnessTypes.isChronic
        //     IllnessTypes.lastModDate
        //     IllnessTypes.modifiedBy
        //     IllnessTypes.processed
        //     IllnessTypes.visitCategoryID

        // Arrange and Act
        new IllnessTypes(1, "Illness Type");

    }
}
