package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class SurgeryTypesDiffblueTest {
    /**
     * Method under test: {@link SurgeryTypes#getSurgeryTypes(ArrayList)}
     */
    @Test
    void testGetSurgeryTypes() {
        // Arrange and Act
        ArrayList<SurgeryTypes> actualSurgeryTypes = SurgeryTypes.getSurgeryTypes(new ArrayList<>());

        // Assert
        assertTrue(actualSurgeryTypes.isEmpty());
    }

    /**
     * Method under test: {@link SurgeryTypes#SurgeryTypes(Integer, String)}
     */
    @Test
    void testNewSurgeryTypes() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     SurgeryTypes.age
        //     SurgeryTypes.createdBy
        //     SurgeryTypes.createdDate
        //     SurgeryTypes.deleted
        //     SurgeryTypes.gender
        //     SurgeryTypes.lastModDate
        //     SurgeryTypes.modifiedBy
        //     SurgeryTypes.processed
        //     SurgeryTypes.surgeryID
        //     SurgeryTypes.surgeryType
        //     SurgeryTypes.visitCategoryID

        // Arrange and Act
        new SurgeryTypes(1, "Surgery Type");

    }
}
