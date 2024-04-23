package com.iemr.tm.data.masterdata.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class V_DrugPrescriptionDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link V_DrugPrescription#V_DrugPrescription()}
     *   <li>{@link V_DrugPrescription#setFacilityID(Integer)}
     *   <li>{@link V_DrugPrescription#setId(Integer)}
     *   <li>{@link V_DrugPrescription#setIsEDL(Boolean)}
     *   <li>{@link V_DrugPrescription#setItemFormID(Integer)}
     *   <li>{@link V_DrugPrescription#setItemID(Integer)}
     *   <li>{@link V_DrugPrescription#setItemName(String)}
     *   <li>{@link V_DrugPrescription#setQuantityInHand(Long)}
     *   <li>{@link V_DrugPrescription#setRouteID(Integer)}
     *   <li>{@link V_DrugPrescription#setSctCode(String)}
     *   <li>{@link V_DrugPrescription#setSctTerm(String)}
     *   <li>{@link V_DrugPrescription#setStrength(String)}
     *   <li>{@link V_DrugPrescription#setUnitOfMeasurement(String)}
     *   <li>{@link V_DrugPrescription#getFacilityID()}
     *   <li>{@link V_DrugPrescription#getId()}
     *   <li>{@link V_DrugPrescription#getIsEDL()}
     *   <li>{@link V_DrugPrescription#getItemFormID()}
     *   <li>{@link V_DrugPrescription#getItemID()}
     *   <li>{@link V_DrugPrescription#getItemName()}
     *   <li>{@link V_DrugPrescription#getQuantityInHand()}
     *   <li>{@link V_DrugPrescription#getRouteID()}
     *   <li>{@link V_DrugPrescription#getSctCode()}
     *   <li>{@link V_DrugPrescription#getSctTerm()}
     *   <li>{@link V_DrugPrescription#getStrength()}
     *   <li>{@link V_DrugPrescription#getUnitOfMeasurement()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        V_DrugPrescription actualV_DrugPrescription = new V_DrugPrescription();
        actualV_DrugPrescription.setFacilityID(1);
        actualV_DrugPrescription.setId(1);
        actualV_DrugPrescription.setIsEDL(true);
        actualV_DrugPrescription.setItemFormID(1);
        actualV_DrugPrescription.setItemID(1);
        actualV_DrugPrescription.setItemName("Item Name");
        actualV_DrugPrescription.setQuantityInHand(1L);
        actualV_DrugPrescription.setRouteID(1);
        actualV_DrugPrescription.setSctCode("Sct Code");
        actualV_DrugPrescription.setSctTerm("Sct Term");
        actualV_DrugPrescription.setStrength("Strength");
        actualV_DrugPrescription.setUnitOfMeasurement("Unit Of Measurement");
        Integer actualFacilityID = actualV_DrugPrescription.getFacilityID();
        Integer actualId = actualV_DrugPrescription.getId();
        Boolean actualIsEDL = actualV_DrugPrescription.getIsEDL();
        Integer actualItemFormID = actualV_DrugPrescription.getItemFormID();
        Integer actualItemID = actualV_DrugPrescription.getItemID();
        String actualItemName = actualV_DrugPrescription.getItemName();
        Long actualQuantityInHand = actualV_DrugPrescription.getQuantityInHand();
        Integer actualRouteID = actualV_DrugPrescription.getRouteID();
        String actualSctCode = actualV_DrugPrescription.getSctCode();
        String actualSctTerm = actualV_DrugPrescription.getSctTerm();
        String actualStrength = actualV_DrugPrescription.getStrength();

        // Assert that nothing has changed
        assertEquals("Item Name", actualItemName);
        assertEquals("Sct Code", actualSctCode);
        assertEquals("Sct Term", actualSctTerm);
        assertEquals("Strength", actualStrength);
        assertEquals("Unit Of Measurement", actualV_DrugPrescription.getUnitOfMeasurement());
        assertEquals(1, actualFacilityID.intValue());
        assertEquals(1, actualId.intValue());
        assertEquals(1, actualItemFormID.intValue());
        assertEquals(1, actualItemID.intValue());
        assertEquals(1, actualRouteID.intValue());
        assertEquals(1L, actualQuantityInHand.longValue());
        assertTrue(actualIsEDL);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link V_DrugPrescription#V_DrugPrescription(Integer, Integer, String, String, String, Long, Integer, Integer, Integer)}
     *   <li>{@link V_DrugPrescription#setFacilityID(Integer)}
     *   <li>{@link V_DrugPrescription#setId(Integer)}
     *   <li>{@link V_DrugPrescription#setIsEDL(Boolean)}
     *   <li>{@link V_DrugPrescription#setItemFormID(Integer)}
     *   <li>{@link V_DrugPrescription#setItemID(Integer)}
     *   <li>{@link V_DrugPrescription#setItemName(String)}
     *   <li>{@link V_DrugPrescription#setQuantityInHand(Long)}
     *   <li>{@link V_DrugPrescription#setRouteID(Integer)}
     *   <li>{@link V_DrugPrescription#setSctCode(String)}
     *   <li>{@link V_DrugPrescription#setSctTerm(String)}
     *   <li>{@link V_DrugPrescription#setStrength(String)}
     *   <li>{@link V_DrugPrescription#setUnitOfMeasurement(String)}
     *   <li>{@link V_DrugPrescription#getFacilityID()}
     *   <li>{@link V_DrugPrescription#getId()}
     *   <li>{@link V_DrugPrescription#getIsEDL()}
     *   <li>{@link V_DrugPrescription#getItemFormID()}
     *   <li>{@link V_DrugPrescription#getItemID()}
     *   <li>{@link V_DrugPrescription#getItemName()}
     *   <li>{@link V_DrugPrescription#getQuantityInHand()}
     *   <li>{@link V_DrugPrescription#getRouteID()}
     *   <li>{@link V_DrugPrescription#getSctCode()}
     *   <li>{@link V_DrugPrescription#getSctTerm()}
     *   <li>{@link V_DrugPrescription#getStrength()}
     *   <li>{@link V_DrugPrescription#getUnitOfMeasurement()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        V_DrugPrescription actualV_DrugPrescription = new V_DrugPrescription(1, 1, "Item Name", "Strength",
                "Unit Of Measurement", 1L, 1, 1, 1);
        actualV_DrugPrescription.setFacilityID(1);
        actualV_DrugPrescription.setId(1);
        actualV_DrugPrescription.setIsEDL(true);
        actualV_DrugPrescription.setItemFormID(1);
        actualV_DrugPrescription.setItemID(1);
        actualV_DrugPrescription.setItemName("Item Name");
        actualV_DrugPrescription.setQuantityInHand(1L);
        actualV_DrugPrescription.setRouteID(1);
        actualV_DrugPrescription.setSctCode("Sct Code");
        actualV_DrugPrescription.setSctTerm("Sct Term");
        actualV_DrugPrescription.setStrength("Strength");
        actualV_DrugPrescription.setUnitOfMeasurement("Unit Of Measurement");
        Integer actualFacilityID = actualV_DrugPrescription.getFacilityID();
        Integer actualId = actualV_DrugPrescription.getId();
        Boolean actualIsEDL = actualV_DrugPrescription.getIsEDL();
        Integer actualItemFormID = actualV_DrugPrescription.getItemFormID();
        Integer actualItemID = actualV_DrugPrescription.getItemID();
        String actualItemName = actualV_DrugPrescription.getItemName();
        Long actualQuantityInHand = actualV_DrugPrescription.getQuantityInHand();
        Integer actualRouteID = actualV_DrugPrescription.getRouteID();
        String actualSctCode = actualV_DrugPrescription.getSctCode();
        String actualSctTerm = actualV_DrugPrescription.getSctTerm();
        String actualStrength = actualV_DrugPrescription.getStrength();

        // Assert that nothing has changed
        assertEquals("Item Name", actualItemName);
        assertEquals("Sct Code", actualSctCode);
        assertEquals("Sct Term", actualSctTerm);
        assertEquals("Strength", actualStrength);
        assertEquals("Unit Of Measurement", actualV_DrugPrescription.getUnitOfMeasurement());
        assertEquals(1, actualFacilityID.intValue());
        assertEquals(1, actualId.intValue());
        assertEquals(1, actualItemFormID.intValue());
        assertEquals(1, actualItemID.intValue());
        assertEquals(1, actualRouteID.intValue());
        assertEquals(1L, actualQuantityInHand.longValue());
        assertTrue(actualIsEDL);
    }
}
