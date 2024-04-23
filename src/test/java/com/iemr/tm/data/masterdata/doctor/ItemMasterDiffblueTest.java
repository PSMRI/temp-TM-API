package com.iemr.tm.data.masterdata.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Date;

import org.junit.jupiter.api.Test;

class ItemMasterDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ItemMaster#ItemMaster()}
     *   <li>{@link ItemMaster#setComposition(String)}
     *   <li>{@link ItemMaster#setCreatedBy(String)}
     *   <li>{@link ItemMaster#setCreatedDate(Date)}
     *   <li>{@link ItemMaster#setDeleted(Boolean)}
     *   <li>{@link ItemMaster#setDiscontinued(Boolean)}
     *   <li>{@link ItemMaster#setIsEDL(Boolean)}
     *   <li>{@link ItemMaster#setIsMedical(Boolean)}
     *   <li>{@link ItemMaster#setIsScheduledDrug(Boolean)}
     *   <li>{@link ItemMaster#setItemCategory(M_ItemCategory)}
     *   <li>{@link ItemMaster#setItemCategoryID(Integer)}
     *   <li>{@link ItemMaster#setItemCode(String)}
     *   <li>{@link ItemMaster#setItemDesc(String)}
     *   <li>{@link ItemMaster#setItemForm(M_ItemForm)}
     *   <li>{@link ItemMaster#setItemFormID(Integer)}
     *   <li>{@link ItemMaster#setItemID(Integer)}
     *   <li>{@link ItemMaster#setItemName(String)}
     *   <li>{@link ItemMaster#setLastModDate(Date)}
     *   <li>{@link ItemMaster#setManufacturer(M_Manufacturer)}
     *   <li>{@link ItemMaster#setManufacturerID(Integer)}
     *   <li>{@link ItemMaster#setModifiedBy(String)}
     *   <li>{@link ItemMaster#setPharmacologyCategory(M_Pharmacologicalcategory)}
     *   <li>{@link ItemMaster#setPharmacologyCategoryID(Integer)}
     *   <li>{@link ItemMaster#setProcessed(Character)}
     *   <li>{@link ItemMaster#setProviderServiceMapID(Integer)}
     *   <li>{@link ItemMaster#setQuantity(Integer)}
     *   <li>{@link ItemMaster#setRoute(M_Route)}
     *   <li>{@link ItemMaster#setRouteID(Integer)}
     *   <li>{@link ItemMaster#setSctCode(String)}
     *   <li>{@link ItemMaster#setSctTerm(String)}
     *   <li>{@link ItemMaster#setStatus(String)}
     *   <li>{@link ItemMaster#setStrength(String)}
     *   <li>{@link ItemMaster#setUnitOfMeasurement(String)}
     *   <li>{@link ItemMaster#setUom(M_Uom)}
     *   <li>{@link ItemMaster#setUomID(Integer)}
     *   <li>{@link ItemMaster#getComposition()}
     *   <li>{@link ItemMaster#getCreatedBy()}
     *   <li>{@link ItemMaster#getCreatedDate()}
     *   <li>{@link ItemMaster#getDeleted()}
     *   <li>{@link ItemMaster#getDiscontinued()}
     *   <li>{@link ItemMaster#getIsEDL()}
     *   <li>{@link ItemMaster#getIsMedical()}
     *   <li>{@link ItemMaster#getIsScheduledDrug()}
     *   <li>{@link ItemMaster#getItemCategory()}
     *   <li>{@link ItemMaster#getItemCategoryID()}
     *   <li>{@link ItemMaster#getItemCode()}
     *   <li>{@link ItemMaster#getItemDesc()}
     *   <li>{@link ItemMaster#getItemForm()}
     *   <li>{@link ItemMaster#getItemFormID()}
     *   <li>{@link ItemMaster#getItemID()}
     *   <li>{@link ItemMaster#getItemName()}
     *   <li>{@link ItemMaster#getLastModDate()}
     *   <li>{@link ItemMaster#getManufacturer()}
     *   <li>{@link ItemMaster#getManufacturerID()}
     *   <li>{@link ItemMaster#getModifiedBy()}
     *   <li>{@link ItemMaster#getPharmacologyCategory()}
     *   <li>{@link ItemMaster#getPharmacologyCategoryID()}
     *   <li>{@link ItemMaster#getProcessed()}
     *   <li>{@link ItemMaster#getProviderServiceMapID()}
     *   <li>{@link ItemMaster#getQuantity()}
     *   <li>{@link ItemMaster#getRoute()}
     *   <li>{@link ItemMaster#getRouteID()}
     *   <li>{@link ItemMaster#getSctCode()}
     *   <li>{@link ItemMaster#getSctTerm()}
     *   <li>{@link ItemMaster#getStatus()}
     *   <li>{@link ItemMaster#getStrength()}
     *   <li>{@link ItemMaster#getUnitOfMeasurement()}
     *   <li>{@link ItemMaster#getUom()}
     *   <li>{@link ItemMaster#getUomID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        ItemMaster actualItemMaster = new ItemMaster();
        actualItemMaster.setComposition("Composition");
        actualItemMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Date createdDate = mock(Date.class);
        actualItemMaster.setCreatedDate(createdDate);
        actualItemMaster.setDeleted(true);
        actualItemMaster.setDiscontinued(true);
        actualItemMaster.setIsEDL(true);
        actualItemMaster.setIsMedical(true);
        actualItemMaster.setIsScheduledDrug(true);
        M_ItemCategory itemCategory = new M_ItemCategory();
        itemCategory.setAlertBeforeDays(1);
        itemCategory.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        itemCategory.setCreatedDate(mock(Date.class));
        itemCategory.setDeleted(true);
        itemCategory.setIssueType("Issue Type");
        itemCategory.setItemCategoryCode("Item Category Code");
        itemCategory.setItemCategoryDesc("Item Category Desc");
        itemCategory.setItemCategoryID(1);
        itemCategory.setItemCategoryName("Item Category Name");
        itemCategory.setLastModDate(mock(Date.class));
        itemCategory.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        itemCategory.setProcessed('A');
        itemCategory.setProviderServiceMapID(1);
        itemCategory.setStatus("Status");
        actualItemMaster.setItemCategory(itemCategory);
        actualItemMaster.setItemCategoryID(1);
        actualItemMaster.setItemCode("Item Code");
        actualItemMaster.setItemDesc("Item Desc");
        M_ItemForm itemForm = new M_ItemForm();
        actualItemMaster.setItemForm(itemForm);
        actualItemMaster.setItemFormID(1);
        actualItemMaster.setItemID(1);
        actualItemMaster.setItemName("Item Name");
        Date lastModDate = mock(Date.class);
        actualItemMaster.setLastModDate(lastModDate);
        M_Manufacturer manufacturer = new M_Manufacturer();
        manufacturer.setContactPerson("Contact Person");
        manufacturer.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        manufacturer.setCreatedDate(mock(Date.class));
        manufacturer.setDeleted(true);
        manufacturer.setLastModDate(mock(Date.class));
        manufacturer.setManufacturerCode("Manufacturer Code");
        manufacturer.setManufacturerDesc("Manufacturer Desc");
        manufacturer.setManufacturerID(1);
        manufacturer.setManufacturerName("Manufacturer Name");
        manufacturer.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        manufacturer.setProviderServiceMapID(1);
        manufacturer.setStatus("Status");
        manufacturer.setcST_GST_No("C ST GST No");
        actualItemMaster.setManufacturer(manufacturer);
        actualItemMaster.setManufacturerID(1);
        actualItemMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        M_Pharmacologicalcategory pharmacologyCategory = new M_Pharmacologicalcategory();
        pharmacologyCategory.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        pharmacologyCategory.setCreatedDate(mock(Date.class));
        pharmacologyCategory.setDeleted(true);
        pharmacologyCategory.setLastModDate(mock(Date.class));
        pharmacologyCategory.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        pharmacologyCategory.setPharmCategoryCode("Pharm Category Code");
        pharmacologyCategory.setPharmCategoryDesc("Pharm Category Desc");
        pharmacologyCategory.setPharmCategoryName("Pharm Category Name");
        pharmacologyCategory.setPharmacologyCategoryID(1);
        pharmacologyCategory.setProviderServiceMapID(1);
        pharmacologyCategory.setStatus("Status");
        actualItemMaster.setPharmacologyCategory(pharmacologyCategory);
        actualItemMaster.setPharmacologyCategoryID(1);
        actualItemMaster.setProcessed('A');
        actualItemMaster.setProviderServiceMapID(1);
        actualItemMaster.setQuantity(1);
        M_Route route = new M_Route();
        actualItemMaster.setRoute(route);
        actualItemMaster.setRouteID(1);
        actualItemMaster.setSctCode("Sct Code");
        actualItemMaster.setSctTerm("Sct Term");
        actualItemMaster.setStatus("Status");
        actualItemMaster.setStrength("Strength");
        actualItemMaster.setUnitOfMeasurement("Unit Of Measurement");
        M_Uom uom = new M_Uom();
        uom.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        uom.setCreatedDate(mock(Date.class));
        uom.setDeleted(true);
        uom.setLastModDate(mock(Date.class));
        uom.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        uom.setProcessed('A');
        uom.setProviderServiceMapID(1);
        uom.setStatus("Status");
        uom.setuOMCode("U OMCode");
        uom.setuOMDesc("U OMDesc");
        uom.setuOMID(1);
        uom.setuOMName("U OMName");
        actualItemMaster.setUom(uom);
        actualItemMaster.setUomID(1);
        String actualComposition = actualItemMaster.getComposition();
        String actualCreatedBy = actualItemMaster.getCreatedBy();
        Date actualCreatedDate = actualItemMaster.getCreatedDate();
        Boolean actualDeleted = actualItemMaster.getDeleted();
        Boolean actualDiscontinued = actualItemMaster.getDiscontinued();
        Boolean actualIsEDL = actualItemMaster.getIsEDL();
        Boolean actualIsMedical = actualItemMaster.getIsMedical();
        Boolean actualIsScheduledDrug = actualItemMaster.getIsScheduledDrug();
        M_ItemCategory actualItemCategory = actualItemMaster.getItemCategory();
        Integer actualItemCategoryID = actualItemMaster.getItemCategoryID();
        String actualItemCode = actualItemMaster.getItemCode();
        String actualItemDesc = actualItemMaster.getItemDesc();
        M_ItemForm actualItemForm = actualItemMaster.getItemForm();
        Integer actualItemFormID = actualItemMaster.getItemFormID();
        Integer actualItemID = actualItemMaster.getItemID();
        String actualItemName = actualItemMaster.getItemName();
        Date actualLastModDate = actualItemMaster.getLastModDate();
        M_Manufacturer actualManufacturer = actualItemMaster.getManufacturer();
        Integer actualManufacturerID = actualItemMaster.getManufacturerID();
        String actualModifiedBy = actualItemMaster.getModifiedBy();
        M_Pharmacologicalcategory actualPharmacologyCategory = actualItemMaster.getPharmacologyCategory();
        Integer actualPharmacologyCategoryID = actualItemMaster.getPharmacologyCategoryID();
        Character actualProcessed = actualItemMaster.getProcessed();
        Integer actualProviderServiceMapID = actualItemMaster.getProviderServiceMapID();
        Integer actualQuantity = actualItemMaster.getQuantity();
        M_Route actualRoute = actualItemMaster.getRoute();
        Integer actualRouteID = actualItemMaster.getRouteID();
        String actualSctCode = actualItemMaster.getSctCode();
        String actualSctTerm = actualItemMaster.getSctTerm();
        String actualStatus = actualItemMaster.getStatus();
        String actualStrength = actualItemMaster.getStrength();
        String actualUnitOfMeasurement = actualItemMaster.getUnitOfMeasurement();
        M_Uom actualUom = actualItemMaster.getUom();
        Integer actualUomID = actualItemMaster.getUomID();

        // Assert that nothing has changed
        assertEquals("Composition", actualComposition);
        assertEquals("Item Code", actualItemCode);
        assertEquals("Item Desc", actualItemDesc);
        assertEquals("Item Name", actualItemName);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Sct Code", actualSctCode);
        assertEquals("Sct Term", actualSctTerm);
        assertEquals("Status", actualStatus);
        assertEquals("Strength", actualStrength);
        assertEquals("Unit Of Measurement", actualUnitOfMeasurement);
        assertEquals('A', actualProcessed.charValue());
        assertEquals(1, actualItemCategoryID.intValue());
        assertEquals(1, actualItemFormID.intValue());
        assertEquals(1, actualItemID.intValue());
        assertEquals(1, actualManufacturerID.intValue());
        assertEquals(1, actualPharmacologyCategoryID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualQuantity.intValue());
        assertEquals(1, actualRouteID.intValue());
        assertEquals(1, actualUomID.intValue());
        assertTrue(actualDeleted);
        assertTrue(actualDiscontinued);
        assertTrue(actualIsEDL);
        assertTrue(actualIsMedical);
        assertTrue(actualIsScheduledDrug);
        assertSame(itemCategory, actualItemCategory);
        assertSame(itemForm, actualItemForm);
        assertSame(manufacturer, actualManufacturer);
        assertSame(pharmacologyCategory, actualPharmacologyCategory);
        assertSame(route, actualRoute);
        assertSame(uom, actualUom);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ItemMaster#ItemMaster(Integer, String)}
     *   <li>{@link ItemMaster#setComposition(String)}
     *   <li>{@link ItemMaster#setCreatedBy(String)}
     *   <li>{@link ItemMaster#setCreatedDate(Date)}
     *   <li>{@link ItemMaster#setDeleted(Boolean)}
     *   <li>{@link ItemMaster#setDiscontinued(Boolean)}
     *   <li>{@link ItemMaster#setIsEDL(Boolean)}
     *   <li>{@link ItemMaster#setIsMedical(Boolean)}
     *   <li>{@link ItemMaster#setIsScheduledDrug(Boolean)}
     *   <li>{@link ItemMaster#setItemCategory(M_ItemCategory)}
     *   <li>{@link ItemMaster#setItemCategoryID(Integer)}
     *   <li>{@link ItemMaster#setItemCode(String)}
     *   <li>{@link ItemMaster#setItemDesc(String)}
     *   <li>{@link ItemMaster#setItemForm(M_ItemForm)}
     *   <li>{@link ItemMaster#setItemFormID(Integer)}
     *   <li>{@link ItemMaster#setItemID(Integer)}
     *   <li>{@link ItemMaster#setItemName(String)}
     *   <li>{@link ItemMaster#setLastModDate(Date)}
     *   <li>{@link ItemMaster#setManufacturer(M_Manufacturer)}
     *   <li>{@link ItemMaster#setManufacturerID(Integer)}
     *   <li>{@link ItemMaster#setModifiedBy(String)}
     *   <li>{@link ItemMaster#setPharmacologyCategory(M_Pharmacologicalcategory)}
     *   <li>{@link ItemMaster#setPharmacologyCategoryID(Integer)}
     *   <li>{@link ItemMaster#setProcessed(Character)}
     *   <li>{@link ItemMaster#setProviderServiceMapID(Integer)}
     *   <li>{@link ItemMaster#setQuantity(Integer)}
     *   <li>{@link ItemMaster#setRoute(M_Route)}
     *   <li>{@link ItemMaster#setRouteID(Integer)}
     *   <li>{@link ItemMaster#setSctCode(String)}
     *   <li>{@link ItemMaster#setSctTerm(String)}
     *   <li>{@link ItemMaster#setStatus(String)}
     *   <li>{@link ItemMaster#setStrength(String)}
     *   <li>{@link ItemMaster#setUnitOfMeasurement(String)}
     *   <li>{@link ItemMaster#setUom(M_Uom)}
     *   <li>{@link ItemMaster#setUomID(Integer)}
     *   <li>{@link ItemMaster#getComposition()}
     *   <li>{@link ItemMaster#getCreatedBy()}
     *   <li>{@link ItemMaster#getCreatedDate()}
     *   <li>{@link ItemMaster#getDeleted()}
     *   <li>{@link ItemMaster#getDiscontinued()}
     *   <li>{@link ItemMaster#getIsEDL()}
     *   <li>{@link ItemMaster#getIsMedical()}
     *   <li>{@link ItemMaster#getIsScheduledDrug()}
     *   <li>{@link ItemMaster#getItemCategory()}
     *   <li>{@link ItemMaster#getItemCategoryID()}
     *   <li>{@link ItemMaster#getItemCode()}
     *   <li>{@link ItemMaster#getItemDesc()}
     *   <li>{@link ItemMaster#getItemForm()}
     *   <li>{@link ItemMaster#getItemFormID()}
     *   <li>{@link ItemMaster#getItemID()}
     *   <li>{@link ItemMaster#getItemName()}
     *   <li>{@link ItemMaster#getLastModDate()}
     *   <li>{@link ItemMaster#getManufacturer()}
     *   <li>{@link ItemMaster#getManufacturerID()}
     *   <li>{@link ItemMaster#getModifiedBy()}
     *   <li>{@link ItemMaster#getPharmacologyCategory()}
     *   <li>{@link ItemMaster#getPharmacologyCategoryID()}
     *   <li>{@link ItemMaster#getProcessed()}
     *   <li>{@link ItemMaster#getProviderServiceMapID()}
     *   <li>{@link ItemMaster#getQuantity()}
     *   <li>{@link ItemMaster#getRoute()}
     *   <li>{@link ItemMaster#getRouteID()}
     *   <li>{@link ItemMaster#getSctCode()}
     *   <li>{@link ItemMaster#getSctTerm()}
     *   <li>{@link ItemMaster#getStatus()}
     *   <li>{@link ItemMaster#getStrength()}
     *   <li>{@link ItemMaster#getUnitOfMeasurement()}
     *   <li>{@link ItemMaster#getUom()}
     *   <li>{@link ItemMaster#getUomID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        ItemMaster actualItemMaster = new ItemMaster(1, "Item Name");
        actualItemMaster.setComposition("Composition");
        actualItemMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Date createdDate = mock(Date.class);
        actualItemMaster.setCreatedDate(createdDate);
        actualItemMaster.setDeleted(true);
        actualItemMaster.setDiscontinued(true);
        actualItemMaster.setIsEDL(true);
        actualItemMaster.setIsMedical(true);
        actualItemMaster.setIsScheduledDrug(true);
        M_ItemCategory itemCategory = new M_ItemCategory();
        itemCategory.setAlertBeforeDays(1);
        itemCategory.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        itemCategory.setCreatedDate(mock(Date.class));
        itemCategory.setDeleted(true);
        itemCategory.setIssueType("Issue Type");
        itemCategory.setItemCategoryCode("Item Category Code");
        itemCategory.setItemCategoryDesc("Item Category Desc");
        itemCategory.setItemCategoryID(1);
        itemCategory.setItemCategoryName("Item Category Name");
        itemCategory.setLastModDate(mock(Date.class));
        itemCategory.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        itemCategory.setProcessed('A');
        itemCategory.setProviderServiceMapID(1);
        itemCategory.setStatus("Status");
        actualItemMaster.setItemCategory(itemCategory);
        actualItemMaster.setItemCategoryID(1);
        actualItemMaster.setItemCode("Item Code");
        actualItemMaster.setItemDesc("Item Desc");
        M_ItemForm itemForm = new M_ItemForm();
        actualItemMaster.setItemForm(itemForm);
        actualItemMaster.setItemFormID(1);
        actualItemMaster.setItemID(1);
        actualItemMaster.setItemName("Item Name");
        Date lastModDate = mock(Date.class);
        actualItemMaster.setLastModDate(lastModDate);
        M_Manufacturer manufacturer = new M_Manufacturer();
        manufacturer.setContactPerson("Contact Person");
        manufacturer.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        manufacturer.setCreatedDate(mock(Date.class));
        manufacturer.setDeleted(true);
        manufacturer.setLastModDate(mock(Date.class));
        manufacturer.setManufacturerCode("Manufacturer Code");
        manufacturer.setManufacturerDesc("Manufacturer Desc");
        manufacturer.setManufacturerID(1);
        manufacturer.setManufacturerName("Manufacturer Name");
        manufacturer.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        manufacturer.setProviderServiceMapID(1);
        manufacturer.setStatus("Status");
        manufacturer.setcST_GST_No("C ST GST No");
        actualItemMaster.setManufacturer(manufacturer);
        actualItemMaster.setManufacturerID(1);
        actualItemMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        M_Pharmacologicalcategory pharmacologyCategory = new M_Pharmacologicalcategory();
        pharmacologyCategory.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        pharmacologyCategory.setCreatedDate(mock(Date.class));
        pharmacologyCategory.setDeleted(true);
        pharmacologyCategory.setLastModDate(mock(Date.class));
        pharmacologyCategory.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        pharmacologyCategory.setPharmCategoryCode("Pharm Category Code");
        pharmacologyCategory.setPharmCategoryDesc("Pharm Category Desc");
        pharmacologyCategory.setPharmCategoryName("Pharm Category Name");
        pharmacologyCategory.setPharmacologyCategoryID(1);
        pharmacologyCategory.setProviderServiceMapID(1);
        pharmacologyCategory.setStatus("Status");
        actualItemMaster.setPharmacologyCategory(pharmacologyCategory);
        actualItemMaster.setPharmacologyCategoryID(1);
        actualItemMaster.setProcessed('A');
        actualItemMaster.setProviderServiceMapID(1);
        actualItemMaster.setQuantity(1);
        M_Route route = new M_Route();
        actualItemMaster.setRoute(route);
        actualItemMaster.setRouteID(1);
        actualItemMaster.setSctCode("Sct Code");
        actualItemMaster.setSctTerm("Sct Term");
        actualItemMaster.setStatus("Status");
        actualItemMaster.setStrength("Strength");
        actualItemMaster.setUnitOfMeasurement("Unit Of Measurement");
        M_Uom uom = new M_Uom();
        uom.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        uom.setCreatedDate(mock(Date.class));
        uom.setDeleted(true);
        uom.setLastModDate(mock(Date.class));
        uom.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        uom.setProcessed('A');
        uom.setProviderServiceMapID(1);
        uom.setStatus("Status");
        uom.setuOMCode("U OMCode");
        uom.setuOMDesc("U OMDesc");
        uom.setuOMID(1);
        uom.setuOMName("U OMName");
        actualItemMaster.setUom(uom);
        actualItemMaster.setUomID(1);
        String actualComposition = actualItemMaster.getComposition();
        String actualCreatedBy = actualItemMaster.getCreatedBy();
        Date actualCreatedDate = actualItemMaster.getCreatedDate();
        Boolean actualDeleted = actualItemMaster.getDeleted();
        Boolean actualDiscontinued = actualItemMaster.getDiscontinued();
        Boolean actualIsEDL = actualItemMaster.getIsEDL();
        Boolean actualIsMedical = actualItemMaster.getIsMedical();
        Boolean actualIsScheduledDrug = actualItemMaster.getIsScheduledDrug();
        M_ItemCategory actualItemCategory = actualItemMaster.getItemCategory();
        Integer actualItemCategoryID = actualItemMaster.getItemCategoryID();
        String actualItemCode = actualItemMaster.getItemCode();
        String actualItemDesc = actualItemMaster.getItemDesc();
        M_ItemForm actualItemForm = actualItemMaster.getItemForm();
        Integer actualItemFormID = actualItemMaster.getItemFormID();
        Integer actualItemID = actualItemMaster.getItemID();
        String actualItemName = actualItemMaster.getItemName();
        Date actualLastModDate = actualItemMaster.getLastModDate();
        M_Manufacturer actualManufacturer = actualItemMaster.getManufacturer();
        Integer actualManufacturerID = actualItemMaster.getManufacturerID();
        String actualModifiedBy = actualItemMaster.getModifiedBy();
        M_Pharmacologicalcategory actualPharmacologyCategory = actualItemMaster.getPharmacologyCategory();
        Integer actualPharmacologyCategoryID = actualItemMaster.getPharmacologyCategoryID();
        Character actualProcessed = actualItemMaster.getProcessed();
        Integer actualProviderServiceMapID = actualItemMaster.getProviderServiceMapID();
        Integer actualQuantity = actualItemMaster.getQuantity();
        M_Route actualRoute = actualItemMaster.getRoute();
        Integer actualRouteID = actualItemMaster.getRouteID();
        String actualSctCode = actualItemMaster.getSctCode();
        String actualSctTerm = actualItemMaster.getSctTerm();
        String actualStatus = actualItemMaster.getStatus();
        String actualStrength = actualItemMaster.getStrength();
        String actualUnitOfMeasurement = actualItemMaster.getUnitOfMeasurement();
        M_Uom actualUom = actualItemMaster.getUom();
        Integer actualUomID = actualItemMaster.getUomID();

        // Assert that nothing has changed
        assertEquals("Composition", actualComposition);
        assertEquals("Item Code", actualItemCode);
        assertEquals("Item Desc", actualItemDesc);
        assertEquals("Item Name", actualItemName);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Sct Code", actualSctCode);
        assertEquals("Sct Term", actualSctTerm);
        assertEquals("Status", actualStatus);
        assertEquals("Strength", actualStrength);
        assertEquals("Unit Of Measurement", actualUnitOfMeasurement);
        assertEquals('A', actualProcessed.charValue());
        assertEquals(1, actualItemCategoryID.intValue());
        assertEquals(1, actualItemFormID.intValue());
        assertEquals(1, actualItemID.intValue());
        assertEquals(1, actualManufacturerID.intValue());
        assertEquals(1, actualPharmacologyCategoryID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualQuantity.intValue());
        assertEquals(1, actualRouteID.intValue());
        assertEquals(1, actualUomID.intValue());
        assertTrue(actualDeleted);
        assertTrue(actualDiscontinued);
        assertTrue(actualIsEDL);
        assertTrue(actualIsMedical);
        assertTrue(actualIsScheduledDrug);
        assertSame(itemCategory, actualItemCategory);
        assertSame(itemForm, actualItemForm);
        assertSame(manufacturer, actualManufacturer);
        assertSame(pharmacologyCategory, actualPharmacologyCategory);
        assertSame(route, actualRoute);
        assertSame(uom, actualUom);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
