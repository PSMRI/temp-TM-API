package com.iemr.tm.data.labModule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class WrapperLabResultEntryDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link WrapperLabResultEntry#setBenFlowID(Long)}
     *   <li>{@link WrapperLabResultEntry#setBeneficiaryRegID(Long)}
     *   <li>{@link WrapperLabResultEntry#setCreatedBy(String)}
     *   <li>{@link WrapperLabResultEntry#setDoctorFlag(Short)}
     *   <li>{@link WrapperLabResultEntry#setLabCompleted(Boolean)}
     *   <li>{@link WrapperLabResultEntry#setLabTestResults(List)}
     *   <li>{@link WrapperLabResultEntry#setNurseFlag(Short)}
     *   <li>{@link WrapperLabResultEntry#setParkingPlaceID(Integer)}
     *   <li>{@link WrapperLabResultEntry#setProviderServiceMapID(Integer)}
     *   <li>{@link WrapperLabResultEntry#setRadiologyTestResults(List)}
     *   <li>{@link WrapperLabResultEntry#setSpecialist_flag(Short)}
     *   <li>{@link WrapperLabResultEntry#setVanID(Integer)}
     *   <li>{@link WrapperLabResultEntry#setVisitCode(Long)}
     *   <li>{@link WrapperLabResultEntry#setVisitID(Long)}
     *   <li>{@link WrapperLabResultEntry#getBenFlowID()}
     *   <li>{@link WrapperLabResultEntry#getBeneficiaryRegID()}
     *   <li>{@link WrapperLabResultEntry#getCreatedBy()}
     *   <li>{@link WrapperLabResultEntry#getDoctorFlag()}
     *   <li>{@link WrapperLabResultEntry#getLabCompleted()}
     *   <li>{@link WrapperLabResultEntry#getLabTestResults()}
     *   <li>{@link WrapperLabResultEntry#getNurseFlag()}
     *   <li>{@link WrapperLabResultEntry#getParkingPlaceID()}
     *   <li>{@link WrapperLabResultEntry#getProviderServiceMapID()}
     *   <li>{@link WrapperLabResultEntry#getRadiologyTestResults()}
     *   <li>{@link WrapperLabResultEntry#getSpecialist_flag()}
     *   <li>{@link WrapperLabResultEntry#getVanID()}
     *   <li>{@link WrapperLabResultEntry#getVisitCode()}
     *   <li>{@link WrapperLabResultEntry#getVisitID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        WrapperLabResultEntry wrapperLabResultEntry = new WrapperLabResultEntry();

        // Act
        wrapperLabResultEntry.setBenFlowID(1L);
        wrapperLabResultEntry.setBeneficiaryRegID(1L);
        wrapperLabResultEntry.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        wrapperLabResultEntry.setDoctorFlag((short) 1);
        wrapperLabResultEntry.setLabCompleted(true);
        ArrayList<LabResultEntry> labTestResults = new ArrayList<>();
        wrapperLabResultEntry.setLabTestResults(labTestResults);
        wrapperLabResultEntry.setNurseFlag((short) 1);
        wrapperLabResultEntry.setParkingPlaceID(1);
        wrapperLabResultEntry.setProviderServiceMapID(1);
        ArrayList<LabResultEntry> radiologyTestResults = new ArrayList<>();
        wrapperLabResultEntry.setRadiologyTestResults(radiologyTestResults);
        wrapperLabResultEntry.setSpecialist_flag((short) 1);
        wrapperLabResultEntry.setVanID(1);
        wrapperLabResultEntry.setVisitCode(1L);
        wrapperLabResultEntry.setVisitID(1L);
        Long actualBenFlowID = wrapperLabResultEntry.getBenFlowID();
        Long actualBeneficiaryRegID = wrapperLabResultEntry.getBeneficiaryRegID();
        String actualCreatedBy = wrapperLabResultEntry.getCreatedBy();
        Short actualDoctorFlag = wrapperLabResultEntry.getDoctorFlag();
        Boolean actualLabCompleted = wrapperLabResultEntry.getLabCompleted();
        List<LabResultEntry> actualLabTestResults = wrapperLabResultEntry.getLabTestResults();
        Short actualNurseFlag = wrapperLabResultEntry.getNurseFlag();
        Integer actualParkingPlaceID = wrapperLabResultEntry.getParkingPlaceID();
        Integer actualProviderServiceMapID = wrapperLabResultEntry.getProviderServiceMapID();
        List<LabResultEntry> actualRadiologyTestResults = wrapperLabResultEntry.getRadiologyTestResults();
        Short actualSpecialist_flag = wrapperLabResultEntry.getSpecialist_flag();
        Integer actualVanID = wrapperLabResultEntry.getVanID();
        Long actualVisitCode = wrapperLabResultEntry.getVisitCode();
        Long actualVisitID = wrapperLabResultEntry.getVisitID();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenFlowID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertEquals(1L, actualVisitID.longValue());
        assertEquals((short) 1, actualDoctorFlag.shortValue());
        assertEquals((short) 1, actualNurseFlag.shortValue());
        assertEquals((short) 1, actualSpecialist_flag.shortValue());
        assertTrue(actualLabCompleted);
        assertSame(labTestResults, actualLabTestResults);
        assertSame(radiologyTestResults, actualRadiologyTestResults);
    }
}
