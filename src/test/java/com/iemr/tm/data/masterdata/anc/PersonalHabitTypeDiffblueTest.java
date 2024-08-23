package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PersonalHabitTypeDiffblueTest {
    /**
     * Method under test:
     * {@link PersonalHabitType#getPersonalHabitTypeMasterData(ArrayList)}
     */
    @Test
    void testGetPersonalHabitTypeMasterData() {
        // Arrange and Act
        ArrayList<PersonalHabitType> actualPersonalHabitTypeMasterData = PersonalHabitType
                .getPersonalHabitTypeMasterData(new ArrayList<>());

        // Assert
        assertTrue(actualPersonalHabitTypeMasterData.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PersonalHabitType#PersonalHabitType(Short, String, String)}
     *   <li>{@link PersonalHabitType#setCreatedBy(String)}
     *   <li>{@link PersonalHabitType#setCreatedDate(Timestamp)}
     *   <li>{@link PersonalHabitType#setDeleted(Boolean)}
     *   <li>{@link PersonalHabitType#setHabitType(String)}
     *   <li>{@link PersonalHabitType#setHabitValue(String)}
     *   <li>{@link PersonalHabitType#setLastModDate(Timestamp)}
     *   <li>{@link PersonalHabitType#setModifiedBy(String)}
     *   <li>{@link PersonalHabitType#setPersonalHabitTypeID(Short)}
     *   <li>{@link PersonalHabitType#setProcessed(String)}
     *   <li>{@link PersonalHabitType#getCreatedBy()}
     *   <li>{@link PersonalHabitType#getCreatedDate()}
     *   <li>{@link PersonalHabitType#getDeleted()}
     *   <li>{@link PersonalHabitType#getHabitType()}
     *   <li>{@link PersonalHabitType#getHabitValue()}
     *   <li>{@link PersonalHabitType#getLastModDate()}
     *   <li>{@link PersonalHabitType#getModifiedBy()}
     *   <li>{@link PersonalHabitType#getPersonalHabitTypeID()}
     *   <li>{@link PersonalHabitType#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        PersonalHabitType actualPersonalHabitType = new PersonalHabitType((short) 1, "Habit Type", "42");
        actualPersonalHabitType.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualPersonalHabitType.setCreatedDate(createdDate);
        actualPersonalHabitType.setDeleted(true);
        actualPersonalHabitType.setHabitType("Habit Type");
        actualPersonalHabitType.setHabitValue("42");
        Timestamp lastModDate = mock(Timestamp.class);
        actualPersonalHabitType.setLastModDate(lastModDate);
        actualPersonalHabitType.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualPersonalHabitType.setPersonalHabitTypeID((short) 1);
        actualPersonalHabitType.setProcessed("Processed");
        String actualCreatedBy = actualPersonalHabitType.getCreatedBy();
        Timestamp actualCreatedDate = actualPersonalHabitType.getCreatedDate();
        Boolean actualDeleted = actualPersonalHabitType.getDeleted();
        String actualHabitType = actualPersonalHabitType.getHabitType();
        String actualHabitValue = actualPersonalHabitType.getHabitValue();
        Timestamp actualLastModDate = actualPersonalHabitType.getLastModDate();
        String actualModifiedBy = actualPersonalHabitType.getModifiedBy();
        Short actualPersonalHabitTypeID = actualPersonalHabitType.getPersonalHabitTypeID();

        // Assert that nothing has changed
        assertEquals("42", actualHabitValue);
        assertEquals("Habit Type", actualHabitType);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualPersonalHabitType.getProcessed());
        assertEquals((short) 1, actualPersonalHabitTypeID.shortValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
