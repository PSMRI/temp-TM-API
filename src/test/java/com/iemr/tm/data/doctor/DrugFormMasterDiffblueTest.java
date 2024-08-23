package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DrugFormMasterDiffblueTest {
    /**
     * Method under test: {@link DrugFormMaster#getDrugFormMaster(ArrayList)}
     */
    @Test
    void testGetDrugFormMaster() {
        // Arrange and Act
        ArrayList<DrugFormMaster> actualDrugFormMaster = DrugFormMaster.getDrugFormMaster(new ArrayList<>());

        // Assert
        assertTrue(actualDrugFormMaster.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DrugFormMaster#DrugFormMaster()}
     *   <li>{@link DrugFormMaster#setCreatedBy(String)}
     *   <li>{@link DrugFormMaster#setCreatedDate(Timestamp)}
     *   <li>{@link DrugFormMaster#setDeleted(Boolean)}
     *   <li>{@link DrugFormMaster#setDrugForm(String)}
     *   <li>{@link DrugFormMaster#setDrugFormDecs(String)}
     *   <li>{@link DrugFormMaster#setDrugFormID(Integer)}
     *   <li>{@link DrugFormMaster#setLastModDate(Timestamp)}
     *   <li>{@link DrugFormMaster#setModifiedBy(String)}
     *   <li>{@link DrugFormMaster#setProcessed(Character)}
     *   <li>{@link DrugFormMaster#getCreatedBy()}
     *   <li>{@link DrugFormMaster#getCreatedDate()}
     *   <li>{@link DrugFormMaster#getDeleted()}
     *   <li>{@link DrugFormMaster#getDrugForm()}
     *   <li>{@link DrugFormMaster#getDrugFormDecs()}
     *   <li>{@link DrugFormMaster#getDrugFormID()}
     *   <li>{@link DrugFormMaster#getLastModDate()}
     *   <li>{@link DrugFormMaster#getModifiedBy()}
     *   <li>{@link DrugFormMaster#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        DrugFormMaster actualDrugFormMaster = new DrugFormMaster();
        actualDrugFormMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualDrugFormMaster.setCreatedDate(createdDate);
        actualDrugFormMaster.setDeleted(true);
        actualDrugFormMaster.setDrugForm("Drug Form");
        actualDrugFormMaster.setDrugFormDecs("Drug Form Decs");
        actualDrugFormMaster.setDrugFormID(1);
        Timestamp lastModDate = mock(Timestamp.class);
        actualDrugFormMaster.setLastModDate(lastModDate);
        actualDrugFormMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualDrugFormMaster.setProcessed('A');
        String actualCreatedBy = actualDrugFormMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualDrugFormMaster.getCreatedDate();
        Boolean actualDeleted = actualDrugFormMaster.getDeleted();
        String actualDrugForm = actualDrugFormMaster.getDrugForm();
        String actualDrugFormDecs = actualDrugFormMaster.getDrugFormDecs();
        Integer actualDrugFormID = actualDrugFormMaster.getDrugFormID();
        Timestamp actualLastModDate = actualDrugFormMaster.getLastModDate();
        String actualModifiedBy = actualDrugFormMaster.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Drug Form Decs", actualDrugFormDecs);
        assertEquals("Drug Form", actualDrugForm);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals('A', actualDrugFormMaster.getProcessed().charValue());
        assertEquals(1, actualDrugFormID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DrugFormMaster#DrugFormMaster(Integer, String)}
     *   <li>{@link DrugFormMaster#setCreatedBy(String)}
     *   <li>{@link DrugFormMaster#setCreatedDate(Timestamp)}
     *   <li>{@link DrugFormMaster#setDeleted(Boolean)}
     *   <li>{@link DrugFormMaster#setDrugForm(String)}
     *   <li>{@link DrugFormMaster#setDrugFormDecs(String)}
     *   <li>{@link DrugFormMaster#setDrugFormID(Integer)}
     *   <li>{@link DrugFormMaster#setLastModDate(Timestamp)}
     *   <li>{@link DrugFormMaster#setModifiedBy(String)}
     *   <li>{@link DrugFormMaster#setProcessed(Character)}
     *   <li>{@link DrugFormMaster#getCreatedBy()}
     *   <li>{@link DrugFormMaster#getCreatedDate()}
     *   <li>{@link DrugFormMaster#getDeleted()}
     *   <li>{@link DrugFormMaster#getDrugForm()}
     *   <li>{@link DrugFormMaster#getDrugFormDecs()}
     *   <li>{@link DrugFormMaster#getDrugFormID()}
     *   <li>{@link DrugFormMaster#getLastModDate()}
     *   <li>{@link DrugFormMaster#getModifiedBy()}
     *   <li>{@link DrugFormMaster#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        DrugFormMaster actualDrugFormMaster = new DrugFormMaster(1, "Drug Form");
        actualDrugFormMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualDrugFormMaster.setCreatedDate(createdDate);
        actualDrugFormMaster.setDeleted(true);
        actualDrugFormMaster.setDrugForm("Drug Form");
        actualDrugFormMaster.setDrugFormDecs("Drug Form Decs");
        actualDrugFormMaster.setDrugFormID(1);
        Timestamp lastModDate = mock(Timestamp.class);
        actualDrugFormMaster.setLastModDate(lastModDate);
        actualDrugFormMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualDrugFormMaster.setProcessed('A');
        String actualCreatedBy = actualDrugFormMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualDrugFormMaster.getCreatedDate();
        Boolean actualDeleted = actualDrugFormMaster.getDeleted();
        String actualDrugForm = actualDrugFormMaster.getDrugForm();
        String actualDrugFormDecs = actualDrugFormMaster.getDrugFormDecs();
        Integer actualDrugFormID = actualDrugFormMaster.getDrugFormID();
        Timestamp actualLastModDate = actualDrugFormMaster.getLastModDate();
        String actualModifiedBy = actualDrugFormMaster.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Drug Form Decs", actualDrugFormDecs);
        assertEquals("Drug Form", actualDrugForm);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals('A', actualDrugFormMaster.getProcessed().charValue());
        assertEquals(1, actualDrugFormID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link DrugFormMaster#DrugFormMaster(Integer, String, String, Boolean, Character, String, Timestamp, String, Timestamp)}
     *   <li>{@link DrugFormMaster#setCreatedBy(String)}
     *   <li>{@link DrugFormMaster#setCreatedDate(Timestamp)}
     *   <li>{@link DrugFormMaster#setDeleted(Boolean)}
     *   <li>{@link DrugFormMaster#setDrugForm(String)}
     *   <li>{@link DrugFormMaster#setDrugFormDecs(String)}
     *   <li>{@link DrugFormMaster#setDrugFormID(Integer)}
     *   <li>{@link DrugFormMaster#setLastModDate(Timestamp)}
     *   <li>{@link DrugFormMaster#setModifiedBy(String)}
     *   <li>{@link DrugFormMaster#setProcessed(Character)}
     *   <li>{@link DrugFormMaster#getCreatedBy()}
     *   <li>{@link DrugFormMaster#getCreatedDate()}
     *   <li>{@link DrugFormMaster#getDeleted()}
     *   <li>{@link DrugFormMaster#getDrugForm()}
     *   <li>{@link DrugFormMaster#getDrugFormDecs()}
     *   <li>{@link DrugFormMaster#getDrugFormID()}
     *   <li>{@link DrugFormMaster#getLastModDate()}
     *   <li>{@link DrugFormMaster#getModifiedBy()}
     *   <li>{@link DrugFormMaster#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters3() {
        // Arrange and Act
        DrugFormMaster actualDrugFormMaster = new DrugFormMaster(1, "Drug Form", "Drug Form Decs", true, 'A',
                "Jan 1, 2020 8:00am GMT+0100", mock(Timestamp.class), "Jan 1, 2020 9:00am GMT+0100", mock(Timestamp.class));
        actualDrugFormMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualDrugFormMaster.setCreatedDate(createdDate);
        actualDrugFormMaster.setDeleted(true);
        actualDrugFormMaster.setDrugForm("Drug Form");
        actualDrugFormMaster.setDrugFormDecs("Drug Form Decs");
        actualDrugFormMaster.setDrugFormID(1);
        Timestamp lastModDate = mock(Timestamp.class);
        actualDrugFormMaster.setLastModDate(lastModDate);
        actualDrugFormMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualDrugFormMaster.setProcessed('A');
        String actualCreatedBy = actualDrugFormMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualDrugFormMaster.getCreatedDate();
        Boolean actualDeleted = actualDrugFormMaster.getDeleted();
        String actualDrugForm = actualDrugFormMaster.getDrugForm();
        String actualDrugFormDecs = actualDrugFormMaster.getDrugFormDecs();
        Integer actualDrugFormID = actualDrugFormMaster.getDrugFormID();
        Timestamp actualLastModDate = actualDrugFormMaster.getLastModDate();
        String actualModifiedBy = actualDrugFormMaster.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Drug Form Decs", actualDrugFormDecs);
        assertEquals("Drug Form", actualDrugForm);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals('A', actualDrugFormMaster.getProcessed().charValue());
        assertEquals(1, actualDrugFormID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
