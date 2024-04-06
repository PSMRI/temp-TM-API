package com.iemr.tm.data.masterdata.registrar;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class GovIdEntityTypeDiffblueTest {
    /**
     * Method under test: {@link GovIdEntityType#getGovIdEntityTypeData(ArrayList)}
     */
    @Test
    void testGetGovIdEntityTypeData() {
        // Arrange and Act
        ArrayList<GovIdEntityType> actualGovIdEntityTypeData = GovIdEntityType.getGovIdEntityTypeData(new ArrayList<>());

        // Assert
        assertTrue(actualGovIdEntityTypeData.isEmpty());
    }

    /**
     * Method under test: {@link GovIdEntityType#GovIdEntityType()}
     */
    @Test
    void testNewGovIdEntityType() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     GovIdEntityType.deleted
        //     GovIdEntityType.govtIdentityTypeID
        //     GovIdEntityType.identityType
        //     GovIdEntityType.isGovtID

        // Arrange and Act
        new GovIdEntityType();
    }

    /**
     * Method under test: {@link GovIdEntityType#GovIdEntityType(Short, String)}
     */
    @Test
    void testNewGovIdEntityType2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     GovIdEntityType.deleted
        //     GovIdEntityType.govtIdentityTypeID
        //     GovIdEntityType.identityType
        //     GovIdEntityType.isGovtID

        // Arrange and Act
        new GovIdEntityType((short) 1, "Identity Type");

    }
}
