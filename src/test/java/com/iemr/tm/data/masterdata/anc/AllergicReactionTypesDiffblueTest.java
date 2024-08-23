package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AllergicReactionTypesDiffblueTest {
    /**
     * Method under test:
     * {@link AllergicReactionTypes#getAllergicReactionTypes(ArrayList)}
     */
    @Test
    void testGetAllergicReactionTypes() {
        // Arrange and Act
        ArrayList<AllergicReactionTypes> actualAllergicReactionTypes = AllergicReactionTypes
                .getAllergicReactionTypes(new ArrayList<>());

        // Assert
        assertTrue(actualAllergicReactionTypes.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link AllergicReactionTypes#AllergicReactionTypes()}
     *   <li>{@link AllergicReactionTypes#setAllergicReactionTypeDesc(String)}
     *   <li>{@link AllergicReactionTypes#setCreatedBy(String)}
     *   <li>{@link AllergicReactionTypes#setCreatedDate(Timestamp)}
     *   <li>{@link AllergicReactionTypes#setDeleted(Boolean)}
     *   <li>{@link AllergicReactionTypes#setLastModDate(Timestamp)}
     *   <li>{@link AllergicReactionTypes#setModifiedBy(String)}
     *   <li>{@link AllergicReactionTypes#setName(String)}
     *   <li>{@link AllergicReactionTypes#setProcessed(String)}
     *   <li>{@link AllergicReactionTypes#getAllergicReactionTypeDesc()}
     *   <li>{@link AllergicReactionTypes#getAllergicReactionTypeID()}
     *   <li>{@link AllergicReactionTypes#getCreatedBy()}
     *   <li>{@link AllergicReactionTypes#getCreatedDate()}
     *   <li>{@link AllergicReactionTypes#getDeleted()}
     *   <li>{@link AllergicReactionTypes#getLastModDate()}
     *   <li>{@link AllergicReactionTypes#getModifiedBy()}
     *   <li>{@link AllergicReactionTypes#getName()}
     *   <li>{@link AllergicReactionTypes#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        AllergicReactionTypes actualAllergicReactionTypes = new AllergicReactionTypes();
        actualAllergicReactionTypes.setAllergicReactionTypeDesc("Allergic Reaction Type Desc");
        actualAllergicReactionTypes.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualAllergicReactionTypes.setCreatedDate(createdDate);
        actualAllergicReactionTypes.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualAllergicReactionTypes.setLastModDate(lastModDate);
        actualAllergicReactionTypes.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualAllergicReactionTypes.setName("Name");
        actualAllergicReactionTypes.setProcessed("Processed");
        String actualAllergicReactionTypeDesc = actualAllergicReactionTypes.getAllergicReactionTypeDesc();
        actualAllergicReactionTypes.getAllergicReactionTypeID();
        String actualCreatedBy = actualAllergicReactionTypes.getCreatedBy();
        Timestamp actualCreatedDate = actualAllergicReactionTypes.getCreatedDate();
        Boolean actualDeleted = actualAllergicReactionTypes.getDeleted();
        Timestamp actualLastModDate = actualAllergicReactionTypes.getLastModDate();
        String actualModifiedBy = actualAllergicReactionTypes.getModifiedBy();
        String actualName = actualAllergicReactionTypes.getName();

        // Assert that nothing has changed
        assertEquals("Allergic Reaction Type Desc", actualAllergicReactionTypeDesc);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Name", actualName);
        assertEquals("Processed", actualAllergicReactionTypes.getProcessed());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link AllergicReactionTypes#AllergicReactionTypes(Short, String, String)}
     *   <li>{@link AllergicReactionTypes#setAllergicReactionTypeDesc(String)}
     *   <li>{@link AllergicReactionTypes#setCreatedBy(String)}
     *   <li>{@link AllergicReactionTypes#setCreatedDate(Timestamp)}
     *   <li>{@link AllergicReactionTypes#setDeleted(Boolean)}
     *   <li>{@link AllergicReactionTypes#setLastModDate(Timestamp)}
     *   <li>{@link AllergicReactionTypes#setModifiedBy(String)}
     *   <li>{@link AllergicReactionTypes#setName(String)}
     *   <li>{@link AllergicReactionTypes#setProcessed(String)}
     *   <li>{@link AllergicReactionTypes#getAllergicReactionTypeDesc()}
     *   <li>{@link AllergicReactionTypes#getAllergicReactionTypeID()}
     *   <li>{@link AllergicReactionTypes#getCreatedBy()}
     *   <li>{@link AllergicReactionTypes#getCreatedDate()}
     *   <li>{@link AllergicReactionTypes#getDeleted()}
     *   <li>{@link AllergicReactionTypes#getLastModDate()}
     *   <li>{@link AllergicReactionTypes#getModifiedBy()}
     *   <li>{@link AllergicReactionTypes#getName()}
     *   <li>{@link AllergicReactionTypes#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        AllergicReactionTypes actualAllergicReactionTypes = new AllergicReactionTypes((short) 1, "Name",
                "Allergic Reaction Type Desc");
        actualAllergicReactionTypes.setAllergicReactionTypeDesc("Allergic Reaction Type Desc");
        actualAllergicReactionTypes.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualAllergicReactionTypes.setCreatedDate(createdDate);
        actualAllergicReactionTypes.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualAllergicReactionTypes.setLastModDate(lastModDate);
        actualAllergicReactionTypes.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualAllergicReactionTypes.setName("Name");
        actualAllergicReactionTypes.setProcessed("Processed");
        String actualAllergicReactionTypeDesc = actualAllergicReactionTypes.getAllergicReactionTypeDesc();
        Short actualAllergicReactionTypeID = actualAllergicReactionTypes.getAllergicReactionTypeID();
        String actualCreatedBy = actualAllergicReactionTypes.getCreatedBy();
        Timestamp actualCreatedDate = actualAllergicReactionTypes.getCreatedDate();
        Boolean actualDeleted = actualAllergicReactionTypes.getDeleted();
        Timestamp actualLastModDate = actualAllergicReactionTypes.getLastModDate();
        String actualModifiedBy = actualAllergicReactionTypes.getModifiedBy();
        String actualName = actualAllergicReactionTypes.getName();

        // Assert that nothing has changed
        assertEquals("Allergic Reaction Type Desc", actualAllergicReactionTypeDesc);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Name", actualName);
        assertEquals("Processed", actualAllergicReactionTypes.getProcessed());
        assertEquals((short) 1, actualAllergicReactionTypeID.shortValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
