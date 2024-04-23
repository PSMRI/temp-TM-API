package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DrugDoseMasterDiffblueTest {
    /**
     * Method under test: {@link DrugDoseMaster#getDrugDoseMasters(ArrayList)}
     */
    @Test
    void testGetDrugDoseMasters() {
        // Arrange and Act
        ArrayList<DrugDoseMaster> actualDrugDoseMasters = DrugDoseMaster.getDrugDoseMasters(new ArrayList<>());

        // Assert
        assertTrue(actualDrugDoseMasters.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DrugDoseMaster#DrugDoseMaster()}
     *   <li>{@link DrugDoseMaster#setCreatedBy(String)}
     *   <li>{@link DrugDoseMaster#setCreatedDate(Timestamp)}
     *   <li>{@link DrugDoseMaster#setDeleted(Boolean)}
     *   <li>{@link DrugDoseMaster#setDrugDose(String)}
     *   <li>{@link DrugDoseMaster#setDrugDoseDesc(String)}
     *   <li>{@link DrugDoseMaster#setDrugDoseID(Integer)}
     *   <li>{@link DrugDoseMaster#setDrugFormID(Integer)}
     *   <li>{@link DrugDoseMaster#setLastModDate(Timestamp)}
     *   <li>{@link DrugDoseMaster#setModifiedBy(String)}
     *   <li>{@link DrugDoseMaster#setProcessed(Character)}
     *   <li>{@link DrugDoseMaster#getCreatedBy()}
     *   <li>{@link DrugDoseMaster#getCreatedDate()}
     *   <li>{@link DrugDoseMaster#getDeleted()}
     *   <li>{@link DrugDoseMaster#getDrugDose()}
     *   <li>{@link DrugDoseMaster#getDrugDoseDesc()}
     *   <li>{@link DrugDoseMaster#getDrugDoseID()}
     *   <li>{@link DrugDoseMaster#getDrugFormID()}
     *   <li>{@link DrugDoseMaster#getLastModDate()}
     *   <li>{@link DrugDoseMaster#getModifiedBy()}
     *   <li>{@link DrugDoseMaster#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        DrugDoseMaster actualDrugDoseMaster = new DrugDoseMaster();
        actualDrugDoseMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualDrugDoseMaster.setCreatedDate(createdDate);
        actualDrugDoseMaster.setDeleted(true);
        actualDrugDoseMaster.setDrugDose("Drug Dose");
        actualDrugDoseMaster.setDrugDoseDesc("Drug Dose Desc");
        actualDrugDoseMaster.setDrugDoseID(1);
        actualDrugDoseMaster.setDrugFormID(1);
        Timestamp lastModDate = mock(Timestamp.class);
        actualDrugDoseMaster.setLastModDate(lastModDate);
        actualDrugDoseMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualDrugDoseMaster.setProcessed('A');
        String actualCreatedBy = actualDrugDoseMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualDrugDoseMaster.getCreatedDate();
        Boolean actualDeleted = actualDrugDoseMaster.getDeleted();
        String actualDrugDose = actualDrugDoseMaster.getDrugDose();
        String actualDrugDoseDesc = actualDrugDoseMaster.getDrugDoseDesc();
        Integer actualDrugDoseID = actualDrugDoseMaster.getDrugDoseID();
        Integer actualDrugFormID = actualDrugDoseMaster.getDrugFormID();
        Timestamp actualLastModDate = actualDrugDoseMaster.getLastModDate();
        String actualModifiedBy = actualDrugDoseMaster.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Drug Dose Desc", actualDrugDoseDesc);
        assertEquals("Drug Dose", actualDrugDose);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals('A', actualDrugDoseMaster.getProcessed().charValue());
        assertEquals(1, actualDrugDoseID.intValue());
        assertEquals(1, actualDrugFormID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DrugDoseMaster#DrugDoseMaster(Integer, String, Integer)}
     *   <li>{@link DrugDoseMaster#setCreatedBy(String)}
     *   <li>{@link DrugDoseMaster#setCreatedDate(Timestamp)}
     *   <li>{@link DrugDoseMaster#setDeleted(Boolean)}
     *   <li>{@link DrugDoseMaster#setDrugDose(String)}
     *   <li>{@link DrugDoseMaster#setDrugDoseDesc(String)}
     *   <li>{@link DrugDoseMaster#setDrugDoseID(Integer)}
     *   <li>{@link DrugDoseMaster#setDrugFormID(Integer)}
     *   <li>{@link DrugDoseMaster#setLastModDate(Timestamp)}
     *   <li>{@link DrugDoseMaster#setModifiedBy(String)}
     *   <li>{@link DrugDoseMaster#setProcessed(Character)}
     *   <li>{@link DrugDoseMaster#getCreatedBy()}
     *   <li>{@link DrugDoseMaster#getCreatedDate()}
     *   <li>{@link DrugDoseMaster#getDeleted()}
     *   <li>{@link DrugDoseMaster#getDrugDose()}
     *   <li>{@link DrugDoseMaster#getDrugDoseDesc()}
     *   <li>{@link DrugDoseMaster#getDrugDoseID()}
     *   <li>{@link DrugDoseMaster#getDrugFormID()}
     *   <li>{@link DrugDoseMaster#getLastModDate()}
     *   <li>{@link DrugDoseMaster#getModifiedBy()}
     *   <li>{@link DrugDoseMaster#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        DrugDoseMaster actualDrugDoseMaster = new DrugDoseMaster(1, "Drug Dose", 1);
        actualDrugDoseMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualDrugDoseMaster.setCreatedDate(createdDate);
        actualDrugDoseMaster.setDeleted(true);
        actualDrugDoseMaster.setDrugDose("Drug Dose");
        actualDrugDoseMaster.setDrugDoseDesc("Drug Dose Desc");
        actualDrugDoseMaster.setDrugDoseID(1);
        actualDrugDoseMaster.setDrugFormID(1);
        Timestamp lastModDate = mock(Timestamp.class);
        actualDrugDoseMaster.setLastModDate(lastModDate);
        actualDrugDoseMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualDrugDoseMaster.setProcessed('A');
        String actualCreatedBy = actualDrugDoseMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualDrugDoseMaster.getCreatedDate();
        Boolean actualDeleted = actualDrugDoseMaster.getDeleted();
        String actualDrugDose = actualDrugDoseMaster.getDrugDose();
        String actualDrugDoseDesc = actualDrugDoseMaster.getDrugDoseDesc();
        Integer actualDrugDoseID = actualDrugDoseMaster.getDrugDoseID();
        Integer actualDrugFormID = actualDrugDoseMaster.getDrugFormID();
        Timestamp actualLastModDate = actualDrugDoseMaster.getLastModDate();
        String actualModifiedBy = actualDrugDoseMaster.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Drug Dose Desc", actualDrugDoseDesc);
        assertEquals("Drug Dose", actualDrugDose);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals('A', actualDrugDoseMaster.getProcessed().charValue());
        assertEquals(1, actualDrugDoseID.intValue());
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
     * {@link DrugDoseMaster#DrugDoseMaster(Integer, String, String, Integer, Boolean, Character, String, Timestamp, String, Timestamp)}
     *   <li>{@link DrugDoseMaster#setCreatedBy(String)}
     *   <li>{@link DrugDoseMaster#setCreatedDate(Timestamp)}
     *   <li>{@link DrugDoseMaster#setDeleted(Boolean)}
     *   <li>{@link DrugDoseMaster#setDrugDose(String)}
     *   <li>{@link DrugDoseMaster#setDrugDoseDesc(String)}
     *   <li>{@link DrugDoseMaster#setDrugDoseID(Integer)}
     *   <li>{@link DrugDoseMaster#setDrugFormID(Integer)}
     *   <li>{@link DrugDoseMaster#setLastModDate(Timestamp)}
     *   <li>{@link DrugDoseMaster#setModifiedBy(String)}
     *   <li>{@link DrugDoseMaster#setProcessed(Character)}
     *   <li>{@link DrugDoseMaster#getCreatedBy()}
     *   <li>{@link DrugDoseMaster#getCreatedDate()}
     *   <li>{@link DrugDoseMaster#getDeleted()}
     *   <li>{@link DrugDoseMaster#getDrugDose()}
     *   <li>{@link DrugDoseMaster#getDrugDoseDesc()}
     *   <li>{@link DrugDoseMaster#getDrugDoseID()}
     *   <li>{@link DrugDoseMaster#getDrugFormID()}
     *   <li>{@link DrugDoseMaster#getLastModDate()}
     *   <li>{@link DrugDoseMaster#getModifiedBy()}
     *   <li>{@link DrugDoseMaster#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters3() {
        // Arrange and Act
        DrugDoseMaster actualDrugDoseMaster = new DrugDoseMaster(1, "Drug Dose", "Drug Dose Desc", 1, true, 'A',
                "Jan 1, 2020 8:00am GMT+0100", mock(Timestamp.class), "Jan 1, 2020 9:00am GMT+0100", mock(Timestamp.class));
        actualDrugDoseMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualDrugDoseMaster.setCreatedDate(createdDate);
        actualDrugDoseMaster.setDeleted(true);
        actualDrugDoseMaster.setDrugDose("Drug Dose");
        actualDrugDoseMaster.setDrugDoseDesc("Drug Dose Desc");
        actualDrugDoseMaster.setDrugDoseID(1);
        actualDrugDoseMaster.setDrugFormID(1);
        Timestamp lastModDate = mock(Timestamp.class);
        actualDrugDoseMaster.setLastModDate(lastModDate);
        actualDrugDoseMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualDrugDoseMaster.setProcessed('A');
        String actualCreatedBy = actualDrugDoseMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualDrugDoseMaster.getCreatedDate();
        Boolean actualDeleted = actualDrugDoseMaster.getDeleted();
        String actualDrugDose = actualDrugDoseMaster.getDrugDose();
        String actualDrugDoseDesc = actualDrugDoseMaster.getDrugDoseDesc();
        Integer actualDrugDoseID = actualDrugDoseMaster.getDrugDoseID();
        Integer actualDrugFormID = actualDrugDoseMaster.getDrugFormID();
        Timestamp actualLastModDate = actualDrugDoseMaster.getLastModDate();
        String actualModifiedBy = actualDrugDoseMaster.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Drug Dose Desc", actualDrugDoseDesc);
        assertEquals("Drug Dose", actualDrugDose);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals('A', actualDrugDoseMaster.getProcessed().charValue());
        assertEquals(1, actualDrugDoseID.intValue());
        assertEquals(1, actualDrugFormID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
