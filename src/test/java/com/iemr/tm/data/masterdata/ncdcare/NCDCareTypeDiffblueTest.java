package com.iemr.tm.data.masterdata.ncdcare;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class NCDCareTypeDiffblueTest {
    /**
     * Method under test: {@link NCDCareType#getNCDCareTypes(ArrayList)}
     */
    @Test
    void testGetNCDCareTypes() {
        // Arrange and Act
        ArrayList<NCDCareType> actualNCDCareTypes = NCDCareType.getNCDCareTypes(new ArrayList<>());

        // Assert
        assertTrue(actualNCDCareTypes.isEmpty());
    }

    /**
     * Method under test: {@link NCDCareType#NCDCareType(Integer, String)}
     */
    @Test
    void testNewNCDCareType() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     NCDCareType.createdBy
        //     NCDCareType.createdDate
        //     NCDCareType.deleted
        //     NCDCareType.lastModDate
        //     NCDCareType.modifiedBy
        //     NCDCareType.ncdCareType
        //     NCDCareType.ncdCareTypeDesc
        //     NCDCareType.ncdCareTypeID
        //     NCDCareType.processed

        // Arrange and Act
        new NCDCareType(1, "Ncd Care Type");

    }
}
