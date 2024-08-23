package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DiseaseTypeDiffblueTest {
    /**
     * Method under test: {@link DiseaseType#getDiseaseTypes(ArrayList)}
     */
    @Test
    void testGetDiseaseTypes() {
        // Arrange and Act
        ArrayList<DiseaseType> actualDiseaseTypes = DiseaseType.getDiseaseTypes(new ArrayList<>());

        // Assert
        assertTrue(actualDiseaseTypes.isEmpty());
    }

    /**
     * Method under test:
     * {@link DiseaseType#DiseaseType(Short, String, String, String)}
     */
    @Test
    void testNewDiseaseType() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     DiseaseType.createdBy
        //     DiseaseType.createdDate
        //     DiseaseType.deleted
        //     DiseaseType.diseaseType
        //     DiseaseType.diseaseTypeDesc
        //     DiseaseType.diseaseTypeID
        //     DiseaseType.gender
        //     DiseaseType.lastModDate
        //     DiseaseType.modifiedBy
        //     DiseaseType.processed
        //     DiseaseType.snomedCode
        //     DiseaseType.snomedTerm

        // Arrange and Act
        new DiseaseType((short) 1, "Disease Type", "Snomed Code", "Snomed Term");

    }
}
