package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CompFeedsDiffblueTest {
    /**
     * Method under test: {@link CompFeeds#getCompFeeds(ArrayList)}
     */
    @Test
    void testGetCompFeeds() {
        // Arrange and Act
        ArrayList<CompFeeds> actualCompFeeds = CompFeeds.getCompFeeds(new ArrayList<>());

        // Assert
        assertTrue(actualCompFeeds.isEmpty());
    }

    /**
     * Method under test: {@link CompFeeds#CompFeeds(Integer, String, String)}
     */
    @Test
    void testNewCompFeeds() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     CompFeeds.createdBy
        //     CompFeeds.createdDate
        //     CompFeeds.deleted
        //     CompFeeds.feedID
        //     CompFeeds.lastModDate
        //     CompFeeds.modifiedBy
        //     CompFeeds.processed
        //     CompFeeds.type
        //     CompFeeds.value

        // Arrange and Act
        new CompFeeds(1, "Type", "42");

    }
}
