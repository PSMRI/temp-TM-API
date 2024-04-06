package com.iemr.tm.data.location;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

class StatesDiffblueTest {
    /**
     * Method under test: {@link States#getStateID()}
     */
    @Test
    void testGetStateID() {
        // Arrange
        States states = new States();
        states.setCountryID(1);
        states.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        states.setCreatedDate(mock(Timestamp.class));
        states.setDeleted(true);
        states.setLastModDate(mock(Timestamp.class));
        states.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        states.setStateCode("MD");
        states.setStateID(1);
        states.setStateIName("MD");
        states.setStateName("MD");

        // Act and Assert
        assertEquals(1, states.getStateID());
    }

    /**
     * Method under test: {@link States#setStateID(int)}
     */
    @Test
    void testSetStateID() {
        // Arrange
        States states = new States();

        // Act
        states.setStateID(1);

        // Assert
        assertEquals(1, states.getStateID());
    }

    /**
     * Method under test: {@link States#setStateID(int)}
     */
    @Test
    void testSetStateID2() {
        // Arrange
        States states = new States();
        states.setCountryID(1);
        states.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        states.setCreatedDate(mock(Timestamp.class));
        states.setDeleted(true);
        states.setLastModDate(mock(Timestamp.class));
        states.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        states.setStateCode("MD");
        states.setStateID(1);
        states.setStateIName("MD");
        states.setStateName("MD");

        // Act
        states.setStateID(1);

        // Assert
        assertEquals(1, states.getStateID());
    }

    /**
     * Method under test: {@link States#getCountryID()}
     */
    @Test
    void testGetCountryID() {
        // Arrange
        States states = new States();
        states.setCountryID(1);
        states.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        states.setCreatedDate(mock(Timestamp.class));
        states.setDeleted(true);
        states.setLastModDate(mock(Timestamp.class));
        states.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        states.setStateCode("MD");
        states.setStateID(1);
        states.setStateIName("MD");
        states.setStateName("MD");

        // Act and Assert
        assertEquals(1, states.getCountryID());
    }

    /**
     * Method under test: {@link States#setCountryID(int)}
     */
    @Test
    void testSetCountryID() {
        // Arrange
        States states = new States();

        // Act
        states.setCountryID(1);

        // Assert
        assertEquals(1, states.getCountryID());
    }

    /**
     * Method under test: {@link States#setCountryID(int)}
     */
    @Test
    void testSetCountryID2() {
        // Arrange
        States states = new States();
        states.setCreatedDate(mock(Timestamp.class));

        // Act
        states.setCountryID(1);

        // Assert
        assertEquals(1, states.getCountryID());
    }

    /**
     * Method under test: {@link States#isDeleted()}
     */
    @Test
    void testIsDeleted() {
        // Arrange
        States states = new States();
        states.setCountryID(1);
        states.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        states.setCreatedDate(mock(Timestamp.class));
        states.setDeleted(true);
        states.setLastModDate(mock(Timestamp.class));
        states.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        states.setStateCode("MD");
        states.setStateID(1);
        states.setStateIName("MD");
        states.setStateName("MD");

        // Act and Assert
        assertTrue(states.isDeleted());
    }

    /**
     * Method under test: {@link States#isDeleted()}
     */
    @Test
    void testIsDeleted2() {
        // Arrange
        States states = new States();
        states.setCountryID(1);
        states.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        states.setCreatedDate(mock(Timestamp.class));
        states.setDeleted(false);
        states.setLastModDate(mock(Timestamp.class));
        states.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        states.setStateCode("MD");
        states.setStateID(1);
        states.setStateIName("MD");
        states.setStateName("MD");

        // Act and Assert
        assertFalse(states.isDeleted());
    }

    /**
     * Method under test: {@link States#setDeleted(boolean)}
     */
    @Test
    void testSetDeleted() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        (new States()).setDeleted(true);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link States#States()}
     *   <li>{@link States#setCreatedBy(String)}
     *   <li>{@link States#setCreatedDate(Timestamp)}
     *   <li>{@link States#setLastModDate(Timestamp)}
     *   <li>{@link States#setModifiedBy(String)}
     *   <li>{@link States#setStateCode(String)}
     *   <li>{@link States#setStateIName(String)}
     *   <li>{@link States#setStateName(String)}
     *   <li>{@link States#getCreatedBy()}
     *   <li>{@link States#getCreatedDate()}
     *   <li>{@link States#getLastModDate()}
     *   <li>{@link States#getModifiedBy()}
     *   <li>{@link States#getStateCode()}
     *   <li>{@link States#getStateIName()}
     *   <li>{@link States#getStateName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        States actualStates = new States();
        actualStates.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualStates.setCreatedDate(createdDate);
        Timestamp lastModDate = mock(Timestamp.class);
        actualStates.setLastModDate(lastModDate);
        actualStates.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualStates.setStateCode("MD");
        actualStates.setStateIName("MD");
        actualStates.setStateName("MD");
        String actualCreatedBy = actualStates.getCreatedBy();
        Timestamp actualCreatedDate = actualStates.getCreatedDate();
        Timestamp actualLastModDate = actualStates.getLastModDate();
        String actualModifiedBy = actualStates.getModifiedBy();
        String actualStateCode = actualStates.getStateCode();
        String actualStateIName = actualStates.getStateIName();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("MD", actualStateCode);
        assertEquals("MD", actualStateIName);
        assertEquals("MD", actualStates.getStateName());
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link States#States(int, String)}
     *   <li>{@link States#setCreatedBy(String)}
     *   <li>{@link States#setCreatedDate(Timestamp)}
     *   <li>{@link States#setLastModDate(Timestamp)}
     *   <li>{@link States#setModifiedBy(String)}
     *   <li>{@link States#setStateCode(String)}
     *   <li>{@link States#setStateIName(String)}
     *   <li>{@link States#setStateName(String)}
     *   <li>{@link States#getCreatedBy()}
     *   <li>{@link States#getCreatedDate()}
     *   <li>{@link States#getLastModDate()}
     *   <li>{@link States#getModifiedBy()}
     *   <li>{@link States#getStateCode()}
     *   <li>{@link States#getStateIName()}
     *   <li>{@link States#getStateName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        States actualStates = new States(1, "MD");
        actualStates.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualStates.setCreatedDate(createdDate);
        Timestamp lastModDate = mock(Timestamp.class);
        actualStates.setLastModDate(lastModDate);
        actualStates.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualStates.setStateCode("MD");
        actualStates.setStateIName("MD");
        actualStates.setStateName("MD");
        String actualCreatedBy = actualStates.getCreatedBy();
        Timestamp actualCreatedDate = actualStates.getCreatedDate();
        Timestamp actualLastModDate = actualStates.getLastModDate();
        String actualModifiedBy = actualStates.getModifiedBy();
        String actualStateCode = actualStates.getStateCode();
        String actualStateIName = actualStates.getStateIName();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("MD", actualStateCode);
        assertEquals("MD", actualStateIName);
        assertEquals("MD", actualStates.getStateName());
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
