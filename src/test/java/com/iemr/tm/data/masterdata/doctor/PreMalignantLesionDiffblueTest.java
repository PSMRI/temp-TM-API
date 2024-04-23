package com.iemr.tm.data.masterdata.doctor;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PreMalignantLesionDiffblueTest {
    /**
     * Method under test:
     * {@link PreMalignantLesion#getPreMalignantLesionMasterData(ArrayList)}
     */
    @Test
    void testGetPreMalignantLesionMasterData() {
        // Arrange and Act
        ArrayList<PreMalignantLesion> actualPreMalignantLesionMasterData = PreMalignantLesion
                .getPreMalignantLesionMasterData(new ArrayList<>());

        // Assert
        assertTrue(actualPreMalignantLesionMasterData.isEmpty());
    }

    /**
     * Method under test:
     * {@link PreMalignantLesion#PreMalignantLesion(Integer, String)}
     */
    @Test
    void testNewPreMalignantLesion() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     PreMalignantLesion.deleted
        //     PreMalignantLesion.preMalignantLesionDesc
        //     PreMalignantLesion.preMalignantLesionID
        //     PreMalignantLesion.preMalignantLesionType

        // Arrange and Act
        new PreMalignantLesion(1, "Pre Malignant Lesion Type");

    }
}
