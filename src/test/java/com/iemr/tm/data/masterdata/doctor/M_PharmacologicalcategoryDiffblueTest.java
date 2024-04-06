package com.iemr.tm.data.masterdata.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Date;

import org.junit.jupiter.api.Test;

class M_PharmacologicalcategoryDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link M_Pharmacologicalcategory}
     *   <li>{@link M_Pharmacologicalcategory#setCreatedBy(String)}
     *   <li>{@link M_Pharmacologicalcategory#setCreatedDate(Date)}
     *   <li>{@link M_Pharmacologicalcategory#setDeleted(Boolean)}
     *   <li>{@link M_Pharmacologicalcategory#setLastModDate(Date)}
     *   <li>{@link M_Pharmacologicalcategory#setModifiedBy(String)}
     *   <li>{@link M_Pharmacologicalcategory#setPharmCategoryCode(String)}
     *   <li>{@link M_Pharmacologicalcategory#setPharmCategoryDesc(String)}
     *   <li>{@link M_Pharmacologicalcategory#setPharmCategoryName(String)}
     *   <li>{@link M_Pharmacologicalcategory#setPharmacologyCategoryID(Integer)}
     *   <li>{@link M_Pharmacologicalcategory#setProviderServiceMapID(Integer)}
     *   <li>{@link M_Pharmacologicalcategory#setStatus(String)}
     *   <li>{@link M_Pharmacologicalcategory#getCreatedBy()}
     *   <li>{@link M_Pharmacologicalcategory#getCreatedDate()}
     *   <li>{@link M_Pharmacologicalcategory#getDeleted()}
     *   <li>{@link M_Pharmacologicalcategory#getLastModDate()}
     *   <li>{@link M_Pharmacologicalcategory#getModifiedBy()}
     *   <li>{@link M_Pharmacologicalcategory#getPharmCategoryCode()}
     *   <li>{@link M_Pharmacologicalcategory#getPharmCategoryDesc()}
     *   <li>{@link M_Pharmacologicalcategory#getPharmCategoryID()}
     *   <li>{@link M_Pharmacologicalcategory#getPharmCategoryName()}
     *   <li>{@link M_Pharmacologicalcategory#getPharmacologyCategoryID()}
     *   <li>{@link M_Pharmacologicalcategory#getProviderServiceMapID()}
     *   <li>{@link M_Pharmacologicalcategory#getStatus()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        M_Pharmacologicalcategory actualM_Pharmacologicalcategory = new M_Pharmacologicalcategory();
        actualM_Pharmacologicalcategory.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Date createdDate = mock(Date.class);
        actualM_Pharmacologicalcategory.setCreatedDate(createdDate);
        actualM_Pharmacologicalcategory.setDeleted(true);
        Date lastModDate = mock(Date.class);
        actualM_Pharmacologicalcategory.setLastModDate(lastModDate);
        actualM_Pharmacologicalcategory.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualM_Pharmacologicalcategory.setPharmCategoryCode("Pharm Category Code");
        actualM_Pharmacologicalcategory.setPharmCategoryDesc("Pharm Category Desc");
        actualM_Pharmacologicalcategory.setPharmCategoryName("Pharm Category Name");
        actualM_Pharmacologicalcategory.setPharmacologyCategoryID(1);
        actualM_Pharmacologicalcategory.setProviderServiceMapID(1);
        actualM_Pharmacologicalcategory.setStatus("Status");
        String actualCreatedBy = actualM_Pharmacologicalcategory.getCreatedBy();
        Date actualCreatedDate = actualM_Pharmacologicalcategory.getCreatedDate();
        Boolean actualDeleted = actualM_Pharmacologicalcategory.getDeleted();
        Date actualLastModDate = actualM_Pharmacologicalcategory.getLastModDate();
        String actualModifiedBy = actualM_Pharmacologicalcategory.getModifiedBy();
        String actualPharmCategoryCode = actualM_Pharmacologicalcategory.getPharmCategoryCode();
        String actualPharmCategoryDesc = actualM_Pharmacologicalcategory.getPharmCategoryDesc();
        Integer actualPharmCategoryID = actualM_Pharmacologicalcategory.getPharmCategoryID();
        String actualPharmCategoryName = actualM_Pharmacologicalcategory.getPharmCategoryName();
        Integer actualPharmacologyCategoryID = actualM_Pharmacologicalcategory.getPharmacologyCategoryID();
        Integer actualProviderServiceMapID = actualM_Pharmacologicalcategory.getProviderServiceMapID();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Pharm Category Code", actualPharmCategoryCode);
        assertEquals("Pharm Category Desc", actualPharmCategoryDesc);
        assertEquals("Pharm Category Name", actualPharmCategoryName);
        assertEquals("Status", actualM_Pharmacologicalcategory.getStatus());
        assertEquals(1, actualPharmCategoryID.intValue());
        assertEquals(1, actualPharmacologyCategoryID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
