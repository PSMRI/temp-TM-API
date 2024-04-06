package com.iemr.tm.data.benFlowStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BenPhoneMapsDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link BenPhoneMaps#setPhoneNo(String)}
     *   <li>{@link BenPhoneMaps#getPhoneNo()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        BenPhoneMaps benPhoneMaps = new BenPhoneMaps();

        // Act
        benPhoneMaps.setPhoneNo("6625550144");

        // Assert that nothing has changed
        assertEquals("6625550144", benPhoneMaps.getPhoneNo());
    }
}
