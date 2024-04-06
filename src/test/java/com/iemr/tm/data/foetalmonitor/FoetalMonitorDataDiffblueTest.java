package com.iemr.tm.data.foetalmonitor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FoetalMonitorDataDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link FoetalMonitorData#setBeneficiaryRegID(Long)}
     *   <li>{@link FoetalMonitorData#setDeviceID(String)}
     *   <li>{@link FoetalMonitorData#setMotherLMPDate(String)}
     *   <li>{@link FoetalMonitorData#setMotherName(String)}
     *   <li>{@link FoetalMonitorData#setPartnerFoetalMonitorID(Long)}
     *   <li>{@link FoetalMonitorData#setTestName(String)}
     *   <li>{@link FoetalMonitorData#getBeneficiaryRegID()}
     *   <li>{@link FoetalMonitorData#getDeviceID()}
     *   <li>{@link FoetalMonitorData#getMotherLMPDate()}
     *   <li>{@link FoetalMonitorData#getMotherName()}
     *   <li>{@link FoetalMonitorData#getPartnerFoetalMonitorID()}
     *   <li>{@link FoetalMonitorData#getTestName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        FoetalMonitorData foetalMonitorData = new FoetalMonitorData();

        // Act
        foetalMonitorData.setBeneficiaryRegID(1L);
        foetalMonitorData.setDeviceID("Device ID");
        foetalMonitorData.setMotherLMPDate("2020-03-01");
        foetalMonitorData.setMotherName("Mother Name");
        foetalMonitorData.setPartnerFoetalMonitorID(1L);
        foetalMonitorData.setTestName("Test Name");
        Long actualBeneficiaryRegID = foetalMonitorData.getBeneficiaryRegID();
        String actualDeviceID = foetalMonitorData.getDeviceID();
        String actualMotherLMPDate = foetalMonitorData.getMotherLMPDate();
        String actualMotherName = foetalMonitorData.getMotherName();
        Long actualPartnerFoetalMonitorID = foetalMonitorData.getPartnerFoetalMonitorID();

        // Assert that nothing has changed
        assertEquals("2020-03-01", actualMotherLMPDate);
        assertEquals("Device ID", actualDeviceID);
        assertEquals("Mother Name", actualMotherName);
        assertEquals("Test Name", foetalMonitorData.getTestName());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualPartnerFoetalMonitorID.longValue());
    }
}
