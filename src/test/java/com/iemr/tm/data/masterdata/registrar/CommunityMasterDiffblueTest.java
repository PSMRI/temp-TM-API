package com.iemr.tm.data.masterdata.registrar;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CommunityMasterDiffblueTest {
    /**
     * Method under test: {@link CommunityMaster#getCommunityMasterData(ArrayList)}
     */
    @Test
    void testGetCommunityMasterData() {
        // Arrange and Act
        ArrayList<CommunityMaster> actualCommunityMasterData = CommunityMaster.getCommunityMasterData(new ArrayList<>());

        // Assert
        assertTrue(actualCommunityMasterData.isEmpty());
    }

    /**
     * Method under test: {@link CommunityMaster#CommunityMaster()}
     */
    @Test
    void testNewCommunityMaster() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     CommunityMaster.communityDesc
        //     CommunityMaster.communityID
        //     CommunityMaster.communityType
        //     CommunityMaster.deleted

        // Arrange and Act
        new CommunityMaster();
    }

    /**
     * Method under test: {@link CommunityMaster#CommunityMaster(Short, String)}
     */
    @Test
    void testNewCommunityMaster2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     CommunityMaster.communityDesc
        //     CommunityMaster.communityID
        //     CommunityMaster.communityType
        //     CommunityMaster.deleted

        // Arrange and Act
        new CommunityMaster((short) 1, "Community Type");

    }
}
