package com.iemr.tm.data.masterdata.registrar;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ReligionMasterDiffblueTest {
    /**
     * Method under test: {@link ReligionMaster#getReligionMasterData(ArrayList)}
     */
    @Test
    void testGetReligionMasterData() {
        // Arrange and Act
        ArrayList<ReligionMaster> actualReligionMasterData = ReligionMaster.getReligionMasterData(new ArrayList<>());

        // Assert
        assertTrue(actualReligionMasterData.isEmpty());
    }

    /**
     * Method under test: {@link ReligionMaster#ReligionMaster()}
     */
    @Test
    void testNewReligionMaster() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ReligionMaster.deleted
        //     ReligionMaster.religionDesc
        //     ReligionMaster.religionID
        //     ReligionMaster.religionType

        // Arrange and Act
        new ReligionMaster();
    }

    /**
     * Method under test: {@link ReligionMaster#ReligionMaster(Short, String)}
     */
    @Test
    void testNewReligionMaster2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ReligionMaster.deleted
        //     ReligionMaster.religionDesc
        //     ReligionMaster.religionID
        //     ReligionMaster.religionType

        // Arrange and Act
        new ReligionMaster((short) 1, "Religion Type");

    }
}
