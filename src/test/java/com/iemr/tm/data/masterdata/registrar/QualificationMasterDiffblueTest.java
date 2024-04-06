package com.iemr.tm.data.masterdata.registrar;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class QualificationMasterDiffblueTest {
    /**
     * Method under test:
     * {@link QualificationMaster#getQualificationMasterData(ArrayList)}
     */
    @Test
    void testGetQualificationMasterData() {
        // Arrange and Act
        ArrayList<QualificationMaster> actualQualificationMasterData = QualificationMaster
                .getQualificationMasterData(new ArrayList<>());

        // Assert
        assertTrue(actualQualificationMasterData.isEmpty());
    }

    /**
     * Method under test: {@link QualificationMaster#QualificationMaster()}
     */
    @Test
    void testNewQualificationMaster() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     QualificationMaster.deleted
        //     QualificationMaster.educationID
        //     QualificationMaster.educationType

        // Arrange and Act
        new QualificationMaster();
    }

    /**
     * Method under test:
     * {@link QualificationMaster#QualificationMaster(Short, String)}
     */
    @Test
    void testNewQualificationMaster2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     QualificationMaster.deleted
        //     QualificationMaster.educationID
        //     QualificationMaster.educationType

        // Arrange and Act
        new QualificationMaster((short) 1, "Education Type");

    }
}
