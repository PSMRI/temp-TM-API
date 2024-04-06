package com.iemr.tm.data.masterdata.ncdscreening;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PhysicalActivityDiffblueTest {
    /**
     * Method under test: {@link PhysicalActivity#getpAID()}
     */
    @Test
    void testGetpAID() {
        // Arrange, Act and Assert
        assertNull((new PhysicalActivity()).getpAID());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link PhysicalActivity#setActivityType(String)}
     *   <li>{@link PhysicalActivity#setDeleted(Boolean)}
     *   <li>{@link PhysicalActivity#setScore(Integer)}
     *   <li>{@link PhysicalActivity#setpAID(Integer)}
     *   <li>{@link PhysicalActivity#getActivityType()}
     *   <li>{@link PhysicalActivity#getDeleted()}
     *   <li>{@link PhysicalActivity#getScore()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        PhysicalActivity physicalActivity = new PhysicalActivity();

        // Act
        physicalActivity.setActivityType("Activity Type");
        physicalActivity.setDeleted(true);
        physicalActivity.setScore(3);
        physicalActivity.setpAID(1);
        String actualActivityType = physicalActivity.getActivityType();
        Boolean actualDeleted = physicalActivity.getDeleted();

        // Assert that nothing has changed
        assertEquals("Activity Type", actualActivityType);
        assertEquals(3, physicalActivity.getScore().intValue());
        assertTrue(actualDeleted);
    }
}
