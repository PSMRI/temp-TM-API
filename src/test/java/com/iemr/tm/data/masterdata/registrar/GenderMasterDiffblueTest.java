package com.iemr.tm.data.masterdata.registrar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class GenderMasterDiffblueTest {
    /**
     * Method under test: {@link GenderMaster#getGenderMasterData(ArrayList)}
     */
    @Test
    void testGetGenderMasterData() {
        // Arrange and Act
        ArrayList<GenderMaster> actualGenderMasterData = GenderMaster.getGenderMasterData(new ArrayList<>());

        // Assert
        assertTrue(actualGenderMasterData.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GenderMaster#GenderMaster()}
     *   <li>{@link GenderMaster#setDeleted(Boolean)}
     *   <li>{@link GenderMaster#setGenderID(Short)}
     *   <li>{@link GenderMaster#setGenderName(String)}
     *   <li>{@link GenderMaster#getDeleted()}
     *   <li>{@link GenderMaster#getGenderID()}
     *   <li>{@link GenderMaster#getGenderName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        GenderMaster actualGenderMaster = new GenderMaster();
        actualGenderMaster.setDeleted(true);
        actualGenderMaster.setGenderID((short) 1);
        actualGenderMaster.setGenderName("Gender Name");
        Boolean actualDeleted = actualGenderMaster.getDeleted();
        Short actualGenderID = actualGenderMaster.getGenderID();

        // Assert that nothing has changed
        assertEquals("Gender Name", actualGenderMaster.getGenderName());
        assertEquals((short) 1, actualGenderID.shortValue());
        assertTrue(actualDeleted);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GenderMaster#GenderMaster(Short, String)}
     *   <li>{@link GenderMaster#setDeleted(Boolean)}
     *   <li>{@link GenderMaster#setGenderID(Short)}
     *   <li>{@link GenderMaster#setGenderName(String)}
     *   <li>{@link GenderMaster#getDeleted()}
     *   <li>{@link GenderMaster#getGenderID()}
     *   <li>{@link GenderMaster#getGenderName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        GenderMaster actualGenderMaster = new GenderMaster((short) 1, "Gender Name");
        actualGenderMaster.setDeleted(true);
        actualGenderMaster.setGenderID((short) 1);
        actualGenderMaster.setGenderName("Gender Name");
        Boolean actualDeleted = actualGenderMaster.getDeleted();
        Short actualGenderID = actualGenderMaster.getGenderID();

        // Assert that nothing has changed
        assertEquals("Gender Name", actualGenderMaster.getGenderName());
        assertEquals((short) 1, actualGenderID.shortValue());
        assertTrue(actualDeleted);
    }
}
