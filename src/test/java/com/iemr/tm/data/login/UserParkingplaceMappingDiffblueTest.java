package com.iemr.tm.data.login;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UserParkingplaceMappingDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link UserParkingplaceMapping}
     *   <li>{@link UserParkingplaceMapping#setDeleted(Integer)}
     *   <li>{@link UserParkingplaceMapping#setDistrictID(Integer)}
     *   <li>{@link UserParkingplaceMapping#setParkingPlaceID(Integer)}
     *   <li>{@link UserParkingplaceMapping#setProviderServiceMapId(Integer)}
     *   <li>{@link UserParkingplaceMapping#setStateID(Integer)}
     *   <li>{@link UserParkingplaceMapping#setUserID(Integer)}
     *   <li>{@link UserParkingplaceMapping#setUserParkingPlaceMapID(Integer)}
     *   <li>{@link UserParkingplaceMapping#getDeleted()}
     *   <li>{@link UserParkingplaceMapping#getDistrictID()}
     *   <li>{@link UserParkingplaceMapping#getParkingPlaceID()}
     *   <li>{@link UserParkingplaceMapping#getProviderServiceMapId()}
     *   <li>{@link UserParkingplaceMapping#getStateID()}
     *   <li>{@link UserParkingplaceMapping#getUserID()}
     *   <li>{@link UserParkingplaceMapping#getUserParkingPlaceMapID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        UserParkingplaceMapping actualUserParkingplaceMapping = new UserParkingplaceMapping();
        actualUserParkingplaceMapping.setDeleted(1);
        actualUserParkingplaceMapping.setDistrictID(1);
        actualUserParkingplaceMapping.setParkingPlaceID(1);
        actualUserParkingplaceMapping.setProviderServiceMapId(1);
        actualUserParkingplaceMapping.setStateID(1);
        actualUserParkingplaceMapping.setUserID(1);
        actualUserParkingplaceMapping.setUserParkingPlaceMapID(1);
        Integer actualDeleted = actualUserParkingplaceMapping.getDeleted();
        Integer actualDistrictID = actualUserParkingplaceMapping.getDistrictID();
        Integer actualParkingPlaceID = actualUserParkingplaceMapping.getParkingPlaceID();
        Integer actualProviderServiceMapId = actualUserParkingplaceMapping.getProviderServiceMapId();
        Integer actualStateID = actualUserParkingplaceMapping.getStateID();
        Integer actualUserID = actualUserParkingplaceMapping.getUserID();
        Integer actualUserParkingPlaceMapID = actualUserParkingplaceMapping.getUserParkingPlaceMapID();

        // Assert that nothing has changed
        assertEquals(1, actualDeleted.intValue());
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapId.intValue());
        assertEquals(1, actualStateID.intValue());
        assertEquals(1, actualUserID.intValue());
        assertEquals(1, actualUserParkingPlaceMapID.intValue());
    }
}
