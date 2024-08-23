package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class DrugDurationUnitMasterDiffblueTest {
    /**
     * Method under test:
     * {@link DrugDurationUnitMaster#getDrugDurationUnitMaster(ArrayList)}
     */
    @Test
    void testGetDrugDurationUnitMaster() {
        // Arrange and Act
        ArrayList<DrugDurationUnitMaster> actualDrugDurationUnitMaster = DrugDurationUnitMaster
                .getDrugDurationUnitMaster(new ArrayList<>());

        // Assert
        assertTrue(actualDrugDurationUnitMaster.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DrugDurationUnitMaster#DrugDurationUnitMaster()}
     *   <li>{@link DrugDurationUnitMaster#setCreatedBy(String)}
     *   <li>{@link DrugDurationUnitMaster#setCreatedDate(Timestamp)}
     *   <li>{@link DrugDurationUnitMaster#setDeleted(Boolean)}
     *   <li>{@link DrugDurationUnitMaster#setDrugDuration(String)}
     *   <li>{@link DrugDurationUnitMaster#setDrugDurationDesc(String)}
     *   <li>{@link DrugDurationUnitMaster#setDrugDurationID(Integer)}
     *   <li>{@link DrugDurationUnitMaster#setLastModDate(Timestamp)}
     *   <li>{@link DrugDurationUnitMaster#setModifiedBy(String)}
     *   <li>{@link DrugDurationUnitMaster#setProcessed(Character)}
     *   <li>{@link DrugDurationUnitMaster#getCreatedBy()}
     *   <li>{@link DrugDurationUnitMaster#getCreatedDate()}
     *   <li>{@link DrugDurationUnitMaster#getDeleted()}
     *   <li>{@link DrugDurationUnitMaster#getDrugDuration()}
     *   <li>{@link DrugDurationUnitMaster#getDrugDurationDesc()}
     *   <li>{@link DrugDurationUnitMaster#getDrugDurationID()}
     *   <li>{@link DrugDurationUnitMaster#getLastModDate()}
     *   <li>{@link DrugDurationUnitMaster#getModifiedBy()}
     *   <li>{@link DrugDurationUnitMaster#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        DrugDurationUnitMaster actualDrugDurationUnitMaster = new DrugDurationUnitMaster();
        actualDrugDurationUnitMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualDrugDurationUnitMaster.setCreatedDate(createdDate);
        actualDrugDurationUnitMaster.setDeleted(true);
        actualDrugDurationUnitMaster.setDrugDuration("Drug Duration");
        actualDrugDurationUnitMaster.setDrugDurationDesc("Drug Duration Desc");
        actualDrugDurationUnitMaster.setDrugDurationID(1);
        Timestamp lastModDate = mock(Timestamp.class);
        actualDrugDurationUnitMaster.setLastModDate(lastModDate);
        actualDrugDurationUnitMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualDrugDurationUnitMaster.setProcessed('A');
        String actualCreatedBy = actualDrugDurationUnitMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualDrugDurationUnitMaster.getCreatedDate();
        Boolean actualDeleted = actualDrugDurationUnitMaster.getDeleted();
        String actualDrugDuration = actualDrugDurationUnitMaster.getDrugDuration();
        String actualDrugDurationDesc = actualDrugDurationUnitMaster.getDrugDurationDesc();
        Integer actualDrugDurationID = actualDrugDurationUnitMaster.getDrugDurationID();
        Timestamp actualLastModDate = actualDrugDurationUnitMaster.getLastModDate();
        String actualModifiedBy = actualDrugDurationUnitMaster.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Drug Duration Desc", actualDrugDurationDesc);
        assertEquals("Drug Duration", actualDrugDuration);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals('A', actualDrugDurationUnitMaster.getProcessed().charValue());
        assertEquals(1, actualDrugDurationID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DrugDurationUnitMaster#DrugDurationUnitMaster(Integer, String)}
     *   <li>{@link DrugDurationUnitMaster#setCreatedBy(String)}
     *   <li>{@link DrugDurationUnitMaster#setCreatedDate(Timestamp)}
     *   <li>{@link DrugDurationUnitMaster#setDeleted(Boolean)}
     *   <li>{@link DrugDurationUnitMaster#setDrugDuration(String)}
     *   <li>{@link DrugDurationUnitMaster#setDrugDurationDesc(String)}
     *   <li>{@link DrugDurationUnitMaster#setDrugDurationID(Integer)}
     *   <li>{@link DrugDurationUnitMaster#setLastModDate(Timestamp)}
     *   <li>{@link DrugDurationUnitMaster#setModifiedBy(String)}
     *   <li>{@link DrugDurationUnitMaster#setProcessed(Character)}
     *   <li>{@link DrugDurationUnitMaster#getCreatedBy()}
     *   <li>{@link DrugDurationUnitMaster#getCreatedDate()}
     *   <li>{@link DrugDurationUnitMaster#getDeleted()}
     *   <li>{@link DrugDurationUnitMaster#getDrugDuration()}
     *   <li>{@link DrugDurationUnitMaster#getDrugDurationDesc()}
     *   <li>{@link DrugDurationUnitMaster#getDrugDurationID()}
     *   <li>{@link DrugDurationUnitMaster#getLastModDate()}
     *   <li>{@link DrugDurationUnitMaster#getModifiedBy()}
     *   <li>{@link DrugDurationUnitMaster#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        DrugDurationUnitMaster actualDrugDurationUnitMaster = new DrugDurationUnitMaster(1, "Drug Duration");
        actualDrugDurationUnitMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualDrugDurationUnitMaster.setCreatedDate(createdDate);
        actualDrugDurationUnitMaster.setDeleted(true);
        actualDrugDurationUnitMaster.setDrugDuration("Drug Duration");
        actualDrugDurationUnitMaster.setDrugDurationDesc("Drug Duration Desc");
        actualDrugDurationUnitMaster.setDrugDurationID(1);
        Timestamp lastModDate = mock(Timestamp.class);
        actualDrugDurationUnitMaster.setLastModDate(lastModDate);
        actualDrugDurationUnitMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualDrugDurationUnitMaster.setProcessed('A');
        String actualCreatedBy = actualDrugDurationUnitMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualDrugDurationUnitMaster.getCreatedDate();
        Boolean actualDeleted = actualDrugDurationUnitMaster.getDeleted();
        String actualDrugDuration = actualDrugDurationUnitMaster.getDrugDuration();
        String actualDrugDurationDesc = actualDrugDurationUnitMaster.getDrugDurationDesc();
        Integer actualDrugDurationID = actualDrugDurationUnitMaster.getDrugDurationID();
        Timestamp actualLastModDate = actualDrugDurationUnitMaster.getLastModDate();
        String actualModifiedBy = actualDrugDurationUnitMaster.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Drug Duration Desc", actualDrugDurationDesc);
        assertEquals("Drug Duration", actualDrugDuration);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals('A', actualDrugDurationUnitMaster.getProcessed().charValue());
        assertEquals(1, actualDrugDurationID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link DrugDurationUnitMaster#DrugDurationUnitMaster(Integer, String, String, Boolean, Character, String, Timestamp, String, Timestamp)}
     *   <li>{@link DrugDurationUnitMaster#setCreatedBy(String)}
     *   <li>{@link DrugDurationUnitMaster#setCreatedDate(Timestamp)}
     *   <li>{@link DrugDurationUnitMaster#setDeleted(Boolean)}
     *   <li>{@link DrugDurationUnitMaster#setDrugDuration(String)}
     *   <li>{@link DrugDurationUnitMaster#setDrugDurationDesc(String)}
     *   <li>{@link DrugDurationUnitMaster#setDrugDurationID(Integer)}
     *   <li>{@link DrugDurationUnitMaster#setLastModDate(Timestamp)}
     *   <li>{@link DrugDurationUnitMaster#setModifiedBy(String)}
     *   <li>{@link DrugDurationUnitMaster#setProcessed(Character)}
     *   <li>{@link DrugDurationUnitMaster#getCreatedBy()}
     *   <li>{@link DrugDurationUnitMaster#getCreatedDate()}
     *   <li>{@link DrugDurationUnitMaster#getDeleted()}
     *   <li>{@link DrugDurationUnitMaster#getDrugDuration()}
     *   <li>{@link DrugDurationUnitMaster#getDrugDurationDesc()}
     *   <li>{@link DrugDurationUnitMaster#getDrugDurationID()}
     *   <li>{@link DrugDurationUnitMaster#getLastModDate()}
     *   <li>{@link DrugDurationUnitMaster#getModifiedBy()}
     *   <li>{@link DrugDurationUnitMaster#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters3() {
        // Arrange and Act
        DrugDurationUnitMaster actualDrugDurationUnitMaster = new DrugDurationUnitMaster(1, "Drug Duration",
                "Drug Duration Desc", true, 'A', "Jan 1, 2020 8:00am GMT+0100", mock(Timestamp.class),
                "Jan 1, 2020 9:00am GMT+0100", mock(Timestamp.class));
        actualDrugDurationUnitMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualDrugDurationUnitMaster.setCreatedDate(createdDate);
        actualDrugDurationUnitMaster.setDeleted(true);
        actualDrugDurationUnitMaster.setDrugDuration("Drug Duration");
        actualDrugDurationUnitMaster.setDrugDurationDesc("Drug Duration Desc");
        actualDrugDurationUnitMaster.setDrugDurationID(1);
        Timestamp lastModDate = mock(Timestamp.class);
        actualDrugDurationUnitMaster.setLastModDate(lastModDate);
        actualDrugDurationUnitMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualDrugDurationUnitMaster.setProcessed('A');
        String actualCreatedBy = actualDrugDurationUnitMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualDrugDurationUnitMaster.getCreatedDate();
        Boolean actualDeleted = actualDrugDurationUnitMaster.getDeleted();
        String actualDrugDuration = actualDrugDurationUnitMaster.getDrugDuration();
        String actualDrugDurationDesc = actualDrugDurationUnitMaster.getDrugDurationDesc();
        Integer actualDrugDurationID = actualDrugDurationUnitMaster.getDrugDurationID();
        Timestamp actualLastModDate = actualDrugDurationUnitMaster.getLastModDate();
        String actualModifiedBy = actualDrugDurationUnitMaster.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Drug Duration Desc", actualDrugDurationDesc);
        assertEquals("Drug Duration", actualDrugDuration);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals('A', actualDrugDurationUnitMaster.getProcessed().charValue());
        assertEquals(1, actualDrugDurationID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
