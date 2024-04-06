package com.iemr.tm.data.masterdata.doctor;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ItemFormMasterDiffblueTest {
    /**
     * Method under test: {@link ItemFormMaster#getItemFormList(ArrayList)}
     */
    @Test
    void testGetItemFormList() {
        // Arrange and Act
        ArrayList<ItemFormMaster> actualItemFormList = ItemFormMaster.getItemFormList(new ArrayList<>());

        // Assert
        assertTrue(actualItemFormList.isEmpty());
    }

    /**
     * Method under test: {@link ItemFormMaster#ItemFormMaster()}
     */
    @Test
    void testNewItemFormMaster() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ItemFormMaster.createdBy
        //     ItemFormMaster.createdDate
        //     ItemFormMaster.deleted
        //     ItemFormMaster.itemFormCode
        //     ItemFormMaster.itemFormDesc
        //     ItemFormMaster.itemFormID
        //     ItemFormMaster.itemFormName
        //     ItemFormMaster.lastModDate
        //     ItemFormMaster.modifiedBy
        //     ItemFormMaster.processed
        //     ItemFormMaster.status

        // Arrange and Act
        new ItemFormMaster();
    }

    /**
     * Method under test: {@link ItemFormMaster#ItemFormMaster(Integer, String)}
     */
    @Test
    void testNewItemFormMaster2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     ItemFormMaster.createdBy
        //     ItemFormMaster.createdDate
        //     ItemFormMaster.deleted
        //     ItemFormMaster.itemFormCode
        //     ItemFormMaster.itemFormDesc
        //     ItemFormMaster.itemFormID
        //     ItemFormMaster.itemFormName
        //     ItemFormMaster.lastModDate
        //     ItemFormMaster.modifiedBy
        //     ItemFormMaster.processed
        //     ItemFormMaster.status

        // Arrange and Act
        new ItemFormMaster(1, "Item Form Name");

    }
}
