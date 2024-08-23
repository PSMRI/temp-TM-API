package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class GestationDiffblueTest {
    /**
     * Method under test: {@link Gestation#getGestations(ArrayList)}
     */
    @Test
    void testGetGestations() {
        // Arrange and Act
        ArrayList<Gestation> actualGestations = Gestation.getGestations(new ArrayList<>());

        // Assert
        assertTrue(actualGestations.isEmpty());
    }

    /**
     * Method under test: {@link Gestation#Gestation(Short, String, String)}
     */
    @Test
    void testNewGestation() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     Gestation.createdBy
        //     Gestation.createdDate
        //     Gestation.deleted
        //     Gestation.gestationDesc
        //     Gestation.gestationID
        //     Gestation.lastModDate
        //     Gestation.modifiedBy
        //     Gestation.name
        //     Gestation.processed

        // Arrange and Act
        new Gestation((short) 1, "Name", "Gestation Desc");

    }
}
