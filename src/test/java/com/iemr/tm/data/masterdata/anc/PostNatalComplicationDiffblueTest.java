package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PostNatalComplicationDiffblueTest {
    /**
     * Method under test:
     * {@link PostNatalComplication#getPostNatalComplications(ArrayList)}
     */
    @Test
    void testGetPostNatalComplications() {
        // Arrange and Act
        ArrayList<PostNatalComplication> actualPostNatalComplications = PostNatalComplication
                .getPostNatalComplications(new ArrayList<>());

        // Assert
        assertTrue(actualPostNatalComplications.isEmpty());
    }

    /**
     * Method under test:
     * {@link PostNatalComplication#PostNatalComplication(Short, String)}
     */
    @Test
    void testNewPostNatalComplication() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     PostNatalComplication.createdBy
        //     PostNatalComplication.createdDate
        //     PostNatalComplication.deleted
        //     PostNatalComplication.lastModDate
        //     PostNatalComplication.modifiedBy
        //     PostNatalComplication.postNatalCompDesc
        //     PostNatalComplication.postNatalComplication
        //     PostNatalComplication.postNatalComplicationID
        //     PostNatalComplication.processed

        // Arrange and Act
        new PostNatalComplication((short) 1, "Post Natal Complication");

    }
}
