package com.iemr.tm.data.masterdata.nurse;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class FamilyMemberTypeDiffblueTest {
    /**
     * Method under test:
     * {@link FamilyMemberType#getFamilyMemberTypeMasterData(ArrayList)}
     */
    @Test
    void testGetFamilyMemberTypeMasterData() {
        // Arrange and Act
        ArrayList<FamilyMemberType> actualFamilyMemberTypeMasterData = FamilyMemberType
                .getFamilyMemberTypeMasterData(new ArrayList<>());

        // Assert
        assertTrue(actualFamilyMemberTypeMasterData.isEmpty());
    }

    /**
     * Method under test: {@link FamilyMemberType#FamilyMemberType()}
     */
    @Test
    void testNewFamilyMemberType() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     FamilyMemberType.benRelationshipID
        //     FamilyMemberType.benRelationshipType
        //     FamilyMemberType.deleted
        //     FamilyMemberType.gender

        // Arrange and Act
        new FamilyMemberType();
    }

    /**
     * Method under test:
     * {@link FamilyMemberType#FamilyMemberType(Short, String, String)}
     */
    @Test
    void testNewFamilyMemberType2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     FamilyMemberType.benRelationshipID
        //     FamilyMemberType.benRelationshipType
        //     FamilyMemberType.deleted
        //     FamilyMemberType.gender

        // Arrange and Act
        new FamilyMemberType((short) 1, "Ben Relationship Type", "Gender");

    }
}
