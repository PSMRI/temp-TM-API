package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TempMasterDrugDiffblueTest {
    /**
     * Method under test: {@link TempMasterDrug#getTempDrugMasterList(ArrayList)}
     */
    @Test
    void testGetTempDrugMasterList() {
        // Arrange and Act
        ArrayList<TempMasterDrug> actualTempDrugMasterList = TempMasterDrug.getTempDrugMasterList(new ArrayList<>());

        // Assert
        assertTrue(actualTempDrugMasterList.isEmpty());
    }

    /**
     * Method under test: {@link TempMasterDrug#getTempDrugMasterList(ArrayList)}
     */
    @Test
    void testGetTempDrugMasterList2() {
        // Arrange
        TempMasterDrug tempMasterDrug = new TempMasterDrug();
        tempMasterDrug.setDeleted(true);
        tempMasterDrug.setDrugDisplayName("Drug Display Name");
        tempMasterDrug.setDrugID(1);
        tempMasterDrug.setDrugName("Drug Name");

        ArrayList<TempMasterDrug> tempMasterDrugList = new ArrayList<>();
        tempMasterDrugList.add(tempMasterDrug);

        // Act
        ArrayList<TempMasterDrug> actualTempDrugMasterList = TempMasterDrug.getTempDrugMasterList(tempMasterDrugList);

        // Assert
        assertEquals(1, actualTempDrugMasterList.size());
        TempMasterDrug getResult = actualTempDrugMasterList.get(0);
        assertEquals("Drug Display Name", getResult.getDrugDisplayName());
        assertEquals(1, getResult.getDrugID().intValue());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link TempMasterDrug#TempMasterDrug()}
     *   <li>{@link TempMasterDrug#setDeleted(Boolean)}
     *   <li>{@link TempMasterDrug#setDrugDisplayName(String)}
     *   <li>{@link TempMasterDrug#setDrugID(Integer)}
     *   <li>{@link TempMasterDrug#setDrugName(String)}
     *   <li>{@link TempMasterDrug#getDeleted()}
     *   <li>{@link TempMasterDrug#getDrugDisplayName()}
     *   <li>{@link TempMasterDrug#getDrugID()}
     *   <li>{@link TempMasterDrug#getDrugName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        TempMasterDrug actualTempMasterDrug = new TempMasterDrug();
        actualTempMasterDrug.setDeleted(true);
        actualTempMasterDrug.setDrugDisplayName("Drug Display Name");
        actualTempMasterDrug.setDrugID(1);
        actualTempMasterDrug.setDrugName("Drug Name");
        Boolean actualDeleted = actualTempMasterDrug.getDeleted();
        String actualDrugDisplayName = actualTempMasterDrug.getDrugDisplayName();
        Integer actualDrugID = actualTempMasterDrug.getDrugID();

        // Assert that nothing has changed
        assertEquals("Drug Display Name", actualDrugDisplayName);
        assertEquals("Drug Name", actualTempMasterDrug.getDrugName());
        assertEquals(1, actualDrugID.intValue());
        assertTrue(actualDeleted);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link TempMasterDrug#TempMasterDrug(Integer, String)}
     *   <li>{@link TempMasterDrug#setDeleted(Boolean)}
     *   <li>{@link TempMasterDrug#setDrugDisplayName(String)}
     *   <li>{@link TempMasterDrug#setDrugID(Integer)}
     *   <li>{@link TempMasterDrug#setDrugName(String)}
     *   <li>{@link TempMasterDrug#getDeleted()}
     *   <li>{@link TempMasterDrug#getDrugDisplayName()}
     *   <li>{@link TempMasterDrug#getDrugID()}
     *   <li>{@link TempMasterDrug#getDrugName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        TempMasterDrug actualTempMasterDrug = new TempMasterDrug(1, "Drug Display Name");
        actualTempMasterDrug.setDeleted(true);
        actualTempMasterDrug.setDrugDisplayName("Drug Display Name");
        actualTempMasterDrug.setDrugID(1);
        actualTempMasterDrug.setDrugName("Drug Name");
        Boolean actualDeleted = actualTempMasterDrug.getDeleted();
        String actualDrugDisplayName = actualTempMasterDrug.getDrugDisplayName();
        Integer actualDrugID = actualTempMasterDrug.getDrugID();

        // Assert that nothing has changed
        assertEquals("Drug Display Name", actualDrugDisplayName);
        assertEquals("Drug Name", actualTempMasterDrug.getDrugName());
        assertEquals(1, actualDrugID.intValue());
        assertTrue(actualDeleted);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link TempMasterDrug#TempMasterDrug(Integer, String, String, Boolean)}
     *   <li>{@link TempMasterDrug#setDeleted(Boolean)}
     *   <li>{@link TempMasterDrug#setDrugDisplayName(String)}
     *   <li>{@link TempMasterDrug#setDrugID(Integer)}
     *   <li>{@link TempMasterDrug#setDrugName(String)}
     *   <li>{@link TempMasterDrug#getDeleted()}
     *   <li>{@link TempMasterDrug#getDrugDisplayName()}
     *   <li>{@link TempMasterDrug#getDrugID()}
     *   <li>{@link TempMasterDrug#getDrugName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters3() {
        // Arrange and Act
        TempMasterDrug actualTempMasterDrug = new TempMasterDrug(1, "Drug Name", "Drug Display Name", true);
        actualTempMasterDrug.setDeleted(true);
        actualTempMasterDrug.setDrugDisplayName("Drug Display Name");
        actualTempMasterDrug.setDrugID(1);
        actualTempMasterDrug.setDrugName("Drug Name");
        Boolean actualDeleted = actualTempMasterDrug.getDeleted();
        String actualDrugDisplayName = actualTempMasterDrug.getDrugDisplayName();
        Integer actualDrugID = actualTempMasterDrug.getDrugID();

        // Assert that nothing has changed
        assertEquals("Drug Display Name", actualDrugDisplayName);
        assertEquals("Drug Name", actualTempMasterDrug.getDrugName());
        assertEquals(1, actualDrugID.intValue());
        assertTrue(actualDeleted);
    }
}
