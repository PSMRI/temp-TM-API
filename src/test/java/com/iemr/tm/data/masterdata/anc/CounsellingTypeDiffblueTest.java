package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CounsellingTypeDiffblueTest {
    /**
     * Method under test: {@link CounsellingType#getCounsellingType(ArrayList)}
     */
    @Test
    void testGetCounsellingType() {
        // Arrange and Act
        ArrayList<CounsellingType> actualCounsellingType = CounsellingType.getCounsellingType(new ArrayList<>());

        // Assert
        assertTrue(actualCounsellingType.isEmpty());
    }

    /**
     * Method under test:
     * {@link CounsellingType#CounsellingType(Short, String, String)}
     */
    @Test
    void testNewCounsellingType() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     CounsellingType.counsellingType
        //     CounsellingType.counsellingTypeDesc
        //     CounsellingType.counsellingTypeID
        //     CounsellingType.createdBy
        //     CounsellingType.createdDate
        //     CounsellingType.deleted
        //     CounsellingType.lastModDate
        //     CounsellingType.modifiedBy
        //     CounsellingType.processed

        // Arrange and Act
        new CounsellingType((short) 1, "Counselling Type", "Counselling Type Desc");

    }
}
