package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DrugFrequencyMasterDiffblueTest {
    /**
     * Method under test:
     * {@link DrugFrequencyMaster#getDrugFrequencyMaster(ArrayList)}
     */
    @Test
    void testGetDrugFrequencyMaster() {
        // Arrange and Act
        ArrayList<DrugFrequencyMaster> actualDrugFrequencyMaster = DrugFrequencyMaster
                .getDrugFrequencyMaster(new ArrayList<>());

        // Assert
        assertTrue(actualDrugFrequencyMaster.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DrugFrequencyMaster#DrugFrequencyMaster()}
     *   <li>{@link DrugFrequencyMaster#setCreatedBy(String)}
     *   <li>{@link DrugFrequencyMaster#setCreatedDate(Timestamp)}
     *   <li>{@link DrugFrequencyMaster#setDeleted(Boolean)}
     *   <li>{@link DrugFrequencyMaster#setDrugFrequencyID(Integer)}
     *   <li>{@link DrugFrequencyMaster#setFrequency(String)}
     *   <li>{@link DrugFrequencyMaster#setFrequencyDesc(String)}
     *   <li>{@link DrugFrequencyMaster#setLastModDate(Timestamp)}
     *   <li>{@link DrugFrequencyMaster#setModifiedBy(String)}
     *   <li>{@link DrugFrequencyMaster#setProcessed(Character)}
     *   <li>{@link DrugFrequencyMaster#getCreatedBy()}
     *   <li>{@link DrugFrequencyMaster#getCreatedDate()}
     *   <li>{@link DrugFrequencyMaster#getDeleted()}
     *   <li>{@link DrugFrequencyMaster#getDrugFrequencyID()}
     *   <li>{@link DrugFrequencyMaster#getFrequency()}
     *   <li>{@link DrugFrequencyMaster#getFrequencyDesc()}
     *   <li>{@link DrugFrequencyMaster#getLastModDate()}
     *   <li>{@link DrugFrequencyMaster#getModifiedBy()}
     *   <li>{@link DrugFrequencyMaster#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        DrugFrequencyMaster actualDrugFrequencyMaster = new DrugFrequencyMaster();
        actualDrugFrequencyMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualDrugFrequencyMaster.setCreatedDate(createdDate);
        actualDrugFrequencyMaster.setDeleted(true);
        actualDrugFrequencyMaster.setDrugFrequencyID(1);
        actualDrugFrequencyMaster.setFrequency("Frequency");
        actualDrugFrequencyMaster.setFrequencyDesc("Frequency Desc");
        Timestamp lastModDate = mock(Timestamp.class);
        actualDrugFrequencyMaster.setLastModDate(lastModDate);
        actualDrugFrequencyMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualDrugFrequencyMaster.setProcessed('A');
        String actualCreatedBy = actualDrugFrequencyMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualDrugFrequencyMaster.getCreatedDate();
        Boolean actualDeleted = actualDrugFrequencyMaster.getDeleted();
        Integer actualDrugFrequencyID = actualDrugFrequencyMaster.getDrugFrequencyID();
        String actualFrequency = actualDrugFrequencyMaster.getFrequency();
        String actualFrequencyDesc = actualDrugFrequencyMaster.getFrequencyDesc();
        Timestamp actualLastModDate = actualDrugFrequencyMaster.getLastModDate();
        String actualModifiedBy = actualDrugFrequencyMaster.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Frequency Desc", actualFrequencyDesc);
        assertEquals("Frequency", actualFrequency);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals('A', actualDrugFrequencyMaster.getProcessed().charValue());
        assertEquals(1, actualDrugFrequencyID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DrugFrequencyMaster#DrugFrequencyMaster(Integer, String)}
     *   <li>{@link DrugFrequencyMaster#setCreatedBy(String)}
     *   <li>{@link DrugFrequencyMaster#setCreatedDate(Timestamp)}
     *   <li>{@link DrugFrequencyMaster#setDeleted(Boolean)}
     *   <li>{@link DrugFrequencyMaster#setDrugFrequencyID(Integer)}
     *   <li>{@link DrugFrequencyMaster#setFrequency(String)}
     *   <li>{@link DrugFrequencyMaster#setFrequencyDesc(String)}
     *   <li>{@link DrugFrequencyMaster#setLastModDate(Timestamp)}
     *   <li>{@link DrugFrequencyMaster#setModifiedBy(String)}
     *   <li>{@link DrugFrequencyMaster#setProcessed(Character)}
     *   <li>{@link DrugFrequencyMaster#getCreatedBy()}
     *   <li>{@link DrugFrequencyMaster#getCreatedDate()}
     *   <li>{@link DrugFrequencyMaster#getDeleted()}
     *   <li>{@link DrugFrequencyMaster#getDrugFrequencyID()}
     *   <li>{@link DrugFrequencyMaster#getFrequency()}
     *   <li>{@link DrugFrequencyMaster#getFrequencyDesc()}
     *   <li>{@link DrugFrequencyMaster#getLastModDate()}
     *   <li>{@link DrugFrequencyMaster#getModifiedBy()}
     *   <li>{@link DrugFrequencyMaster#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        DrugFrequencyMaster actualDrugFrequencyMaster = new DrugFrequencyMaster(1, "Frequency");
        actualDrugFrequencyMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualDrugFrequencyMaster.setCreatedDate(createdDate);
        actualDrugFrequencyMaster.setDeleted(true);
        actualDrugFrequencyMaster.setDrugFrequencyID(1);
        actualDrugFrequencyMaster.setFrequency("Frequency");
        actualDrugFrequencyMaster.setFrequencyDesc("Frequency Desc");
        Timestamp lastModDate = mock(Timestamp.class);
        actualDrugFrequencyMaster.setLastModDate(lastModDate);
        actualDrugFrequencyMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualDrugFrequencyMaster.setProcessed('A');
        String actualCreatedBy = actualDrugFrequencyMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualDrugFrequencyMaster.getCreatedDate();
        Boolean actualDeleted = actualDrugFrequencyMaster.getDeleted();
        Integer actualDrugFrequencyID = actualDrugFrequencyMaster.getDrugFrequencyID();
        String actualFrequency = actualDrugFrequencyMaster.getFrequency();
        String actualFrequencyDesc = actualDrugFrequencyMaster.getFrequencyDesc();
        Timestamp actualLastModDate = actualDrugFrequencyMaster.getLastModDate();
        String actualModifiedBy = actualDrugFrequencyMaster.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Frequency Desc", actualFrequencyDesc);
        assertEquals("Frequency", actualFrequency);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals('A', actualDrugFrequencyMaster.getProcessed().charValue());
        assertEquals(1, actualDrugFrequencyID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link DrugFrequencyMaster#DrugFrequencyMaster(Integer, String, String, Boolean, Character, String, Timestamp, String, Timestamp)}
     *   <li>{@link DrugFrequencyMaster#setCreatedBy(String)}
     *   <li>{@link DrugFrequencyMaster#setCreatedDate(Timestamp)}
     *   <li>{@link DrugFrequencyMaster#setDeleted(Boolean)}
     *   <li>{@link DrugFrequencyMaster#setDrugFrequencyID(Integer)}
     *   <li>{@link DrugFrequencyMaster#setFrequency(String)}
     *   <li>{@link DrugFrequencyMaster#setFrequencyDesc(String)}
     *   <li>{@link DrugFrequencyMaster#setLastModDate(Timestamp)}
     *   <li>{@link DrugFrequencyMaster#setModifiedBy(String)}
     *   <li>{@link DrugFrequencyMaster#setProcessed(Character)}
     *   <li>{@link DrugFrequencyMaster#getCreatedBy()}
     *   <li>{@link DrugFrequencyMaster#getCreatedDate()}
     *   <li>{@link DrugFrequencyMaster#getDeleted()}
     *   <li>{@link DrugFrequencyMaster#getDrugFrequencyID()}
     *   <li>{@link DrugFrequencyMaster#getFrequency()}
     *   <li>{@link DrugFrequencyMaster#getFrequencyDesc()}
     *   <li>{@link DrugFrequencyMaster#getLastModDate()}
     *   <li>{@link DrugFrequencyMaster#getModifiedBy()}
     *   <li>{@link DrugFrequencyMaster#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters3() {
        // Arrange and Act
        DrugFrequencyMaster actualDrugFrequencyMaster = new DrugFrequencyMaster(1, "Frequency", "Frequency Desc", true, 'A',
                "Jan 1, 2020 8:00am GMT+0100", mock(Timestamp.class), "Jan 1, 2020 9:00am GMT+0100", mock(Timestamp.class));
        actualDrugFrequencyMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualDrugFrequencyMaster.setCreatedDate(createdDate);
        actualDrugFrequencyMaster.setDeleted(true);
        actualDrugFrequencyMaster.setDrugFrequencyID(1);
        actualDrugFrequencyMaster.setFrequency("Frequency");
        actualDrugFrequencyMaster.setFrequencyDesc("Frequency Desc");
        Timestamp lastModDate = mock(Timestamp.class);
        actualDrugFrequencyMaster.setLastModDate(lastModDate);
        actualDrugFrequencyMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualDrugFrequencyMaster.setProcessed('A');
        String actualCreatedBy = actualDrugFrequencyMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualDrugFrequencyMaster.getCreatedDate();
        Boolean actualDeleted = actualDrugFrequencyMaster.getDeleted();
        Integer actualDrugFrequencyID = actualDrugFrequencyMaster.getDrugFrequencyID();
        String actualFrequency = actualDrugFrequencyMaster.getFrequency();
        String actualFrequencyDesc = actualDrugFrequencyMaster.getFrequencyDesc();
        Timestamp actualLastModDate = actualDrugFrequencyMaster.getLastModDate();
        String actualModifiedBy = actualDrugFrequencyMaster.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Frequency Desc", actualFrequencyDesc);
        assertEquals("Frequency", actualFrequency);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals('A', actualDrugFrequencyMaster.getProcessed().charValue());
        assertEquals(1, actualDrugFrequencyID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
