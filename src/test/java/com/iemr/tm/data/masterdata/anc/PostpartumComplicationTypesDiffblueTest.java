package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PostpartumComplicationTypesDiffblueTest {
    /**
     * Method under test:
     * {@link PostpartumComplicationTypes#getPostpartumComplicationTypes(ArrayList)}
     */
    @Test
    void testGetPostpartumComplicationTypes() {
        // Arrange and Act
        ArrayList<PostpartumComplicationTypes> actualPostpartumComplicationTypes = PostpartumComplicationTypes
                .getPostpartumComplicationTypes(new ArrayList<>());

        // Assert
        assertTrue(actualPostpartumComplicationTypes.isEmpty());
    }

    /**
     * Method under test:
     * {@link PostpartumComplicationTypes#PostpartumComplicationTypes(Short, String)}
     */
    @Test
    void testNewPostpartumComplicationTypes() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     PostpartumComplicationTypes.createdBy
        //     PostpartumComplicationTypes.createdDate
        //     PostpartumComplicationTypes.deleted
        //     PostpartumComplicationTypes.lastModDate
        //     PostpartumComplicationTypes.modifiedBy
        //     PostpartumComplicationTypes.postpartumComplicationID
        //     PostpartumComplicationTypes.postpartumComplicationType
        //     PostpartumComplicationTypes.processed

        // Arrange and Act
        new PostpartumComplicationTypes((short) 1, "Postpartum Complication Type");

    }
}
