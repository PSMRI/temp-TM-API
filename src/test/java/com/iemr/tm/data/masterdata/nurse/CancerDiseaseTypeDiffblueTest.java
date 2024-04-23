package com.iemr.tm.data.masterdata.nurse;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CancerDiseaseTypeDiffblueTest {
    /**
     * Method under test:
     * {@link CancerDiseaseType#getCancerDiseaseTypeMasterData(ArrayList)}
     */
    @Test
    void testGetCancerDiseaseTypeMasterData() {
        // Arrange and Act
        ArrayList<CancerDiseaseType> actualCancerDiseaseTypeMasterData = CancerDiseaseType
                .getCancerDiseaseTypeMasterData(new ArrayList<>());

        // Assert
        assertTrue(actualCancerDiseaseTypeMasterData.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link CancerDiseaseType#CancerDiseaseType(Short, String, String, String, String)}
     *   <li>{@link CancerDiseaseType#setSnomedCode(String)}
     *   <li>{@link CancerDiseaseType#setSnomedTerm(String)}
     *   <li>{@link CancerDiseaseType#getSnomedCode()}
     *   <li>{@link CancerDiseaseType#getSnomedTerm()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        CancerDiseaseType actualCancerDiseaseType = new CancerDiseaseType((short) 1, "Cancer Disease Type", "Gender",
                "Snomed Code", "Snomed Term");
        actualCancerDiseaseType.setSnomedCode("Snomed Code");
        actualCancerDiseaseType.setSnomedTerm("Snomed Term");
        String actualSnomedCode = actualCancerDiseaseType.getSnomedCode();

        // Assert that nothing has changed
        assertEquals("Snomed Code", actualSnomedCode);
        assertEquals("Snomed Term", actualCancerDiseaseType.getSnomedTerm());
    }
}
