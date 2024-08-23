package com.iemr.tm.data.benFlowStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class I_bendemographicsDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link I_bendemographics#setDistrictBranchID(Integer)}
     *   <li>{@link I_bendemographics#setDistrictBranchName(String)}
     *   <li>{@link I_bendemographics#setDistrictID(Integer)}
     *   <li>{@link I_bendemographics#setDistrictName(String)}
     *   <li>{@link I_bendemographics#setServicePointID(Integer)}
     *   <li>{@link I_bendemographics#setServicePointName(String)}
     *   <li>{@link I_bendemographics#getDistrictBranchID()}
     *   <li>{@link I_bendemographics#getDistrictBranchName()}
     *   <li>{@link I_bendemographics#getDistrictID()}
     *   <li>{@link I_bendemographics#getDistrictName()}
     *   <li>{@link I_bendemographics#getServicePointID()}
     *   <li>{@link I_bendemographics#getServicePointName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        I_bendemographics i_bendemographics = new I_bendemographics();

        // Act
        i_bendemographics.setDistrictBranchID(1);
        i_bendemographics.setDistrictBranchName("janedoe/featurebranch");
        i_bendemographics.setDistrictID(1);
        i_bendemographics.setDistrictName("District Name");
        i_bendemographics.setServicePointID(1);
        i_bendemographics.setServicePointName("Service Point Name");
        Integer actualDistrictBranchID = i_bendemographics.getDistrictBranchID();
        String actualDistrictBranchName = i_bendemographics.getDistrictBranchName();
        Integer actualDistrictID = i_bendemographics.getDistrictID();
        String actualDistrictName = i_bendemographics.getDistrictName();
        Integer actualServicePointID = i_bendemographics.getServicePointID();

        // Assert that nothing has changed
        assertEquals("District Name", actualDistrictName);
        assertEquals("Service Point Name", i_bendemographics.getServicePointName());
        assertEquals("janedoe/featurebranch", actualDistrictBranchName);
        assertEquals(1, actualDistrictBranchID.intValue());
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualServicePointID.intValue());
    }
}
