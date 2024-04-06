package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ChildVaccinationsDiffblueTest {
    /**
     * Method under test: {@link ChildVaccinations#getChildVaccinations(ArrayList)}
     */
    @Test
    void testGetChildVaccinations() {
        // Arrange and Act
        ArrayList<ChildVaccinations> actualChildVaccinations = ChildVaccinations.getChildVaccinations(new ArrayList<>());

        // Assert
        assertTrue(actualChildVaccinations.isEmpty());
    }

    /**
     * Method under test:
     * {@link ChildVaccinations#ChildVaccinations(Short, String, String, String, String)}
     */
    @Test
    void testNewChildVaccinations() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ChildVaccinations.createdBy
        //     ChildVaccinations.createdDate
        //     ChildVaccinations.deleted
        //     ChildVaccinations.lastModDate
        //     ChildVaccinations.modifiedBy
        //     ChildVaccinations.processed
        //     ChildVaccinations.sctCode
        //     ChildVaccinations.sctTerm
        //     ChildVaccinations.vaccinationID
        //     ChildVaccinations.vaccinationTime
        //     ChildVaccinations.vaccineName

        // Arrange and Act
        new ChildVaccinations((short) 1, "Vaccination Time", "Vaccine Name", "Sct Code", "Sct Term");

    }
}
