package com.iemr.tm.data.location;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class V_getVanLocDetailsDiffblueTest {
    /**
     * Method under test: {@link V_getVanLocDetails#getVanDetailsOBJ(ArrayList)}
     */
    @Test
    void testGetVanDetailsOBJ() {
        // Arrange
        V_getVanLocDetails v_getVanLocDetails = new V_getVanLocDetails();

        // Act and Assert
        assertNull(v_getVanLocDetails.getVanDetailsOBJ(new ArrayList<>()));
    }

    /**
     * Method under test: {@link V_getVanLocDetails#getVanDetailsOBJ(ArrayList)}
     */
    @Test
    void testGetVanDetailsOBJ2() {
        // Arrange
        V_getVanLocDetails v_getVanLocDetails = new V_getVanLocDetails();

        ArrayList<Object[]> resultSet = new ArrayList<>();
        resultSet.add(new Object[]{"42"});

        // Act and Assert
        assertNull(v_getVanLocDetails.getVanDetailsOBJ(resultSet));
    }

    /**
     * Method under test: {@link V_getVanLocDetails#getVanDetailsOBJ(ArrayList)}
     */
    @Test
    void testGetVanDetailsOBJ3() {
        // Arrange
        V_getVanLocDetails v_getVanLocDetails = new V_getVanLocDetails();

        ArrayList<Object[]> resultSet = new ArrayList<>();
        resultSet.add(new Object[]{"42"});
        resultSet.add(new Object[]{"42"});

        // Act and Assert
        assertNull(v_getVanLocDetails.getVanDetailsOBJ(resultSet));
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link V_getVanLocDetails#setDistrictID(Integer)}
     *   <li>{@link V_getVanLocDetails#setDistrictName(String)}
     *   <li>{@link V_getVanLocDetails#setID(Integer)}
     *   <li>{@link V_getVanLocDetails#setParkingPlaceID(Integer)}
     *   <li>{@link V_getVanLocDetails#setStateID(Integer)}
     *   <li>{@link V_getVanLocDetails#setVanID(Integer)}
     *   <li>{@link V_getVanLocDetails#getDistrictID()}
     *   <li>{@link V_getVanLocDetails#getDistrictName()}
     *   <li>{@link V_getVanLocDetails#getID()}
     *   <li>{@link V_getVanLocDetails#getParkingPlaceID()}
     *   <li>{@link V_getVanLocDetails#getStateID()}
     *   <li>{@link V_getVanLocDetails#getVanID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        V_getVanLocDetails v_getVanLocDetails = new V_getVanLocDetails();

        // Act
        v_getVanLocDetails.setDistrictID(1);
        v_getVanLocDetails.setDistrictName("District Name");
        v_getVanLocDetails.setID(1);
        v_getVanLocDetails.setParkingPlaceID(1);
        v_getVanLocDetails.setStateID(1);
        v_getVanLocDetails.setVanID(1);
        Integer actualDistrictID = v_getVanLocDetails.getDistrictID();
        String actualDistrictName = v_getVanLocDetails.getDistrictName();
        Integer actualID = v_getVanLocDetails.getID();
        Integer actualParkingPlaceID = v_getVanLocDetails.getParkingPlaceID();
        Integer actualStateID = v_getVanLocDetails.getStateID();
        Integer actualVanID = v_getVanLocDetails.getVanID();

        // Assert that nothing has changed
        assertEquals("District Name", actualDistrictName);
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualStateID.intValue());
        assertEquals(1, actualVanID.intValue());
    }
}
