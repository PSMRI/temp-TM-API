package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BirthComplicationDiffblueTest {
    /**
     * Method under test:
     * {@link BirthComplication#getBirthComplicationTypes(ArrayList)}
     */
    @Test
    void testGetBirthComplicationTypes() {
        // Arrange and Act
        ArrayList<BirthComplication> actualBirthComplicationTypes = BirthComplication
                .getBirthComplicationTypes(new ArrayList<>());

        // Assert
        assertTrue(actualBirthComplicationTypes.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link BirthComplication#BirthComplication()}
     *   <li>{@link BirthComplication#setBirthComplicationDesc(String)}
     *   <li>{@link BirthComplication#setCreatedBy(String)}
     *   <li>{@link BirthComplication#setCreatedDate(Timestamp)}
     *   <li>{@link BirthComplication#setDeleted(Boolean)}
     *   <li>{@link BirthComplication#setLastModDate(Timestamp)}
     *   <li>{@link BirthComplication#setModifiedBy(String)}
     *   <li>{@link BirthComplication#setName(String)}
     *   <li>{@link BirthComplication#setProcessed(String)}
     *   <li>{@link BirthComplication#getBirthComplicationDesc()}
     *   <li>{@link BirthComplication#getBirthComplicationID()}
     *   <li>{@link BirthComplication#getCreatedBy()}
     *   <li>{@link BirthComplication#getCreatedDate()}
     *   <li>{@link BirthComplication#getDeleted()}
     *   <li>{@link BirthComplication#getLastModDate()}
     *   <li>{@link BirthComplication#getModifiedBy()}
     *   <li>{@link BirthComplication#getName()}
     *   <li>{@link BirthComplication#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        BirthComplication actualBirthComplication = new BirthComplication();
        actualBirthComplication.setBirthComplicationDesc("Birth Complication Desc");
        actualBirthComplication.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualBirthComplication.setCreatedDate(createdDate);
        actualBirthComplication.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualBirthComplication.setLastModDate(lastModDate);
        actualBirthComplication.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualBirthComplication.setName("Name");
        actualBirthComplication.setProcessed("Processed");
        String actualBirthComplicationDesc = actualBirthComplication.getBirthComplicationDesc();
        actualBirthComplication.getBirthComplicationID();
        String actualCreatedBy = actualBirthComplication.getCreatedBy();
        Timestamp actualCreatedDate = actualBirthComplication.getCreatedDate();
        Boolean actualDeleted = actualBirthComplication.getDeleted();
        Timestamp actualLastModDate = actualBirthComplication.getLastModDate();
        String actualModifiedBy = actualBirthComplication.getModifiedBy();
        String actualName = actualBirthComplication.getName();

        // Assert that nothing has changed
        assertEquals("Birth Complication Desc", actualBirthComplicationDesc);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Name", actualName);
        assertEquals("Processed", actualBirthComplication.getProcessed());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link BirthComplication#BirthComplication(Short, String, String)}
     *   <li>{@link BirthComplication#setBirthComplicationDesc(String)}
     *   <li>{@link BirthComplication#setCreatedBy(String)}
     *   <li>{@link BirthComplication#setCreatedDate(Timestamp)}
     *   <li>{@link BirthComplication#setDeleted(Boolean)}
     *   <li>{@link BirthComplication#setLastModDate(Timestamp)}
     *   <li>{@link BirthComplication#setModifiedBy(String)}
     *   <li>{@link BirthComplication#setName(String)}
     *   <li>{@link BirthComplication#setProcessed(String)}
     *   <li>{@link BirthComplication#getBirthComplicationDesc()}
     *   <li>{@link BirthComplication#getBirthComplicationID()}
     *   <li>{@link BirthComplication#getCreatedBy()}
     *   <li>{@link BirthComplication#getCreatedDate()}
     *   <li>{@link BirthComplication#getDeleted()}
     *   <li>{@link BirthComplication#getLastModDate()}
     *   <li>{@link BirthComplication#getModifiedBy()}
     *   <li>{@link BirthComplication#getName()}
     *   <li>{@link BirthComplication#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        BirthComplication actualBirthComplication = new BirthComplication((short) 1, "Name", "Birth Complication Desc");
        actualBirthComplication.setBirthComplicationDesc("Birth Complication Desc");
        actualBirthComplication.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualBirthComplication.setCreatedDate(createdDate);
        actualBirthComplication.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualBirthComplication.setLastModDate(lastModDate);
        actualBirthComplication.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualBirthComplication.setName("Name");
        actualBirthComplication.setProcessed("Processed");
        String actualBirthComplicationDesc = actualBirthComplication.getBirthComplicationDesc();
        Short actualBirthComplicationID = actualBirthComplication.getBirthComplicationID();
        String actualCreatedBy = actualBirthComplication.getCreatedBy();
        Timestamp actualCreatedDate = actualBirthComplication.getCreatedDate();
        Boolean actualDeleted = actualBirthComplication.getDeleted();
        Timestamp actualLastModDate = actualBirthComplication.getLastModDate();
        String actualModifiedBy = actualBirthComplication.getModifiedBy();
        String actualName = actualBirthComplication.getName();

        // Assert that nothing has changed
        assertEquals("Birth Complication Desc", actualBirthComplicationDesc);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Name", actualName);
        assertEquals("Processed", actualBirthComplication.getProcessed());
        assertEquals((short) 1, actualBirthComplicationID.shortValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
