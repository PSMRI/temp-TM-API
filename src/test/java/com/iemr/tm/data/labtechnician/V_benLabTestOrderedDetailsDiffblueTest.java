package com.iemr.tm.data.labtechnician;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class V_benLabTestOrderedDetailsDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link V_benLabTestOrderedDetails#setBenVisitID(Long)}
     *   <li>{@link V_benLabTestOrderedDetails#setBeneficiaryRegID(Long)}
     *   <li>{@link V_benLabTestOrderedDetails#setCalibrationEndAPI(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setCalibrationStartAPI(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setCalibrationStatusAPI(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setComponentCode(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setComponentUnit(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setDiscoveryCode(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setIOTComponentName(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setIOTProcedureID(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setId(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setInputType(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setIotProcedureName(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setIsDecimal(Boolean)}
     *   <li>{@link V_benLabTestOrderedDetails#setIsLabProcedure(Boolean)}
     *   <li>{@link V_benLabTestOrderedDetails#setIsMandatory(Boolean)}
     *   <li>{@link V_benLabTestOrderedDetails#setMeasurementUnit(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setPrescriptionID(Long)}
     *   <li>{@link V_benLabTestOrderedDetails#setProcedureCode(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setProcedureDesc(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setProcedureEndAPI(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setProcedureID(Integer)}
     *   <li>{@link V_benLabTestOrderedDetails#setProcedureName(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setProcedureStartAPI(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setProcedureStatusAPI(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setProcedureType(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setRange_max(Integer)}
     *   <li>{@link V_benLabTestOrderedDetails#setRange_min(Integer)}
     *   <li>{@link V_benLabTestOrderedDetails#setRange_normal_max(Integer)}
     *   <li>{@link V_benLabTestOrderedDetails#setRange_normal_min(Integer)}
     *   <li>{@link V_benLabTestOrderedDetails#setResultValue(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setTestComponentDesc(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setTestComponentID(Integer)}
     *   <li>{@link V_benLabTestOrderedDetails#setTestComponentName(String)}
     *   <li>{@link V_benLabTestOrderedDetails#setVisitCode(Long)}
     *   <li>{@link V_benLabTestOrderedDetails#getBenVisitID()}
     *   <li>{@link V_benLabTestOrderedDetails#getBeneficiaryRegID()}
     *   <li>{@link V_benLabTestOrderedDetails#getCalibrationEndAPI()}
     *   <li>{@link V_benLabTestOrderedDetails#getCalibrationStartAPI()}
     *   <li>{@link V_benLabTestOrderedDetails#getCalibrationStatusAPI()}
     *   <li>{@link V_benLabTestOrderedDetails#getComponentCode()}
     *   <li>{@link V_benLabTestOrderedDetails#getComponentUnit()}
     *   <li>{@link V_benLabTestOrderedDetails#getDiscoveryCode()}
     *   <li>{@link V_benLabTestOrderedDetails#getIOTComponentName()}
     *   <li>{@link V_benLabTestOrderedDetails#getIOTProcedureID()}
     *   <li>{@link V_benLabTestOrderedDetails#getId()}
     *   <li>{@link V_benLabTestOrderedDetails#getInputType()}
     *   <li>{@link V_benLabTestOrderedDetails#getIotProcedureName()}
     *   <li>{@link V_benLabTestOrderedDetails#getIsDecimal()}
     *   <li>{@link V_benLabTestOrderedDetails#getIsLabProcedure()}
     *   <li>{@link V_benLabTestOrderedDetails#getIsMandatory()}
     *   <li>{@link V_benLabTestOrderedDetails#getMeasurementUnit()}
     *   <li>{@link V_benLabTestOrderedDetails#getPrescriptionID()}
     *   <li>{@link V_benLabTestOrderedDetails#getProcedureCode()}
     *   <li>{@link V_benLabTestOrderedDetails#getProcedureDesc()}
     *   <li>{@link V_benLabTestOrderedDetails#getProcedureEndAPI()}
     *   <li>{@link V_benLabTestOrderedDetails#getProcedureID()}
     *   <li>{@link V_benLabTestOrderedDetails#getProcedureName()}
     *   <li>{@link V_benLabTestOrderedDetails#getProcedureStartAPI()}
     *   <li>{@link V_benLabTestOrderedDetails#getProcedureStatusAPI()}
     *   <li>{@link V_benLabTestOrderedDetails#getProcedureType()}
     *   <li>{@link V_benLabTestOrderedDetails#getRange_max()}
     *   <li>{@link V_benLabTestOrderedDetails#getRange_min()}
     *   <li>{@link V_benLabTestOrderedDetails#getRange_normal_max()}
     *   <li>{@link V_benLabTestOrderedDetails#getRange_normal_min()}
     *   <li>{@link V_benLabTestOrderedDetails#getResultValue()}
     *   <li>{@link V_benLabTestOrderedDetails#getTestComponentDesc()}
     *   <li>{@link V_benLabTestOrderedDetails#getTestComponentID()}
     *   <li>{@link V_benLabTestOrderedDetails#getTestComponentName()}
     *   <li>{@link V_benLabTestOrderedDetails#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        V_benLabTestOrderedDetails v_benLabTestOrderedDetails = new V_benLabTestOrderedDetails();

        // Act
        v_benLabTestOrderedDetails.setBenVisitID(1L);
        v_benLabTestOrderedDetails.setBeneficiaryRegID(1L);
        v_benLabTestOrderedDetails.setCalibrationEndAPI("Calibration End API");
        v_benLabTestOrderedDetails.setCalibrationStartAPI("Calibration Start API");
        v_benLabTestOrderedDetails.setCalibrationStatusAPI("Calibration Status API");
        v_benLabTestOrderedDetails.setComponentCode("Component Code");
        v_benLabTestOrderedDetails.setComponentUnit("Component Unit");
        v_benLabTestOrderedDetails.setDiscoveryCode("Discovery Code");
        v_benLabTestOrderedDetails.setIOTComponentName("I OTComponent Name");
        v_benLabTestOrderedDetails.setIOTProcedureID("I OTProcedure ID");
        v_benLabTestOrderedDetails.setId("42");
        v_benLabTestOrderedDetails.setInputType("Input Type");
        v_benLabTestOrderedDetails.setIotProcedureName("Iot Procedure Name");
        v_benLabTestOrderedDetails.setIsDecimal(true);
        v_benLabTestOrderedDetails.setIsLabProcedure(true);
        v_benLabTestOrderedDetails.setIsMandatory(true);
        v_benLabTestOrderedDetails.setMeasurementUnit("Measurement Unit");
        v_benLabTestOrderedDetails.setPrescriptionID(1L);
        v_benLabTestOrderedDetails.setProcedureCode("Procedure Code");
        v_benLabTestOrderedDetails.setProcedureDesc("Procedure Desc");
        v_benLabTestOrderedDetails.setProcedureEndAPI("Procedure End API");
        v_benLabTestOrderedDetails.setProcedureID(1);
        v_benLabTestOrderedDetails.setProcedureName("Procedure Name");
        v_benLabTestOrderedDetails.setProcedureStartAPI("Procedure Start API");
        v_benLabTestOrderedDetails.setProcedureStatusAPI("Procedure Status API");
        v_benLabTestOrderedDetails.setProcedureType("Procedure Type");
        v_benLabTestOrderedDetails.setRange_max(3);
        v_benLabTestOrderedDetails.setRange_min(1);
        v_benLabTestOrderedDetails.setRange_normal_max(3);
        v_benLabTestOrderedDetails.setRange_normal_min(1);
        v_benLabTestOrderedDetails.setResultValue("42");
        v_benLabTestOrderedDetails.setTestComponentDesc("Test Component Desc");
        v_benLabTestOrderedDetails.setTestComponentID(1);
        v_benLabTestOrderedDetails.setTestComponentName("Test Component Name");
        v_benLabTestOrderedDetails.setVisitCode(1L);
        Long actualBenVisitID = v_benLabTestOrderedDetails.getBenVisitID();
        Long actualBeneficiaryRegID = v_benLabTestOrderedDetails.getBeneficiaryRegID();
        String actualCalibrationEndAPI = v_benLabTestOrderedDetails.getCalibrationEndAPI();
        String actualCalibrationStartAPI = v_benLabTestOrderedDetails.getCalibrationStartAPI();
        String actualCalibrationStatusAPI = v_benLabTestOrderedDetails.getCalibrationStatusAPI();
        String actualComponentCode = v_benLabTestOrderedDetails.getComponentCode();
        String actualComponentUnit = v_benLabTestOrderedDetails.getComponentUnit();
        String actualDiscoveryCode = v_benLabTestOrderedDetails.getDiscoveryCode();
        String actualIOTComponentName = v_benLabTestOrderedDetails.getIOTComponentName();
        String actualIOTProcedureID = v_benLabTestOrderedDetails.getIOTProcedureID();
        String actualId = v_benLabTestOrderedDetails.getId();
        String actualInputType = v_benLabTestOrderedDetails.getInputType();
        String actualIotProcedureName = v_benLabTestOrderedDetails.getIotProcedureName();
        Boolean actualIsDecimal = v_benLabTestOrderedDetails.getIsDecimal();
        Boolean actualIsLabProcedure = v_benLabTestOrderedDetails.getIsLabProcedure();
        Boolean actualIsMandatory = v_benLabTestOrderedDetails.getIsMandatory();
        String actualMeasurementUnit = v_benLabTestOrderedDetails.getMeasurementUnit();
        Long actualPrescriptionID = v_benLabTestOrderedDetails.getPrescriptionID();
        String actualProcedureCode = v_benLabTestOrderedDetails.getProcedureCode();
        String actualProcedureDesc = v_benLabTestOrderedDetails.getProcedureDesc();
        String actualProcedureEndAPI = v_benLabTestOrderedDetails.getProcedureEndAPI();
        Integer actualProcedureID = v_benLabTestOrderedDetails.getProcedureID();
        String actualProcedureName = v_benLabTestOrderedDetails.getProcedureName();
        String actualProcedureStartAPI = v_benLabTestOrderedDetails.getProcedureStartAPI();
        String actualProcedureStatusAPI = v_benLabTestOrderedDetails.getProcedureStatusAPI();
        String actualProcedureType = v_benLabTestOrderedDetails.getProcedureType();
        Integer actualRange_max = v_benLabTestOrderedDetails.getRange_max();
        Integer actualRange_min = v_benLabTestOrderedDetails.getRange_min();
        Integer actualRange_normal_max = v_benLabTestOrderedDetails.getRange_normal_max();
        Integer actualRange_normal_min = v_benLabTestOrderedDetails.getRange_normal_min();
        String actualResultValue = v_benLabTestOrderedDetails.getResultValue();
        String actualTestComponentDesc = v_benLabTestOrderedDetails.getTestComponentDesc();
        Integer actualTestComponentID = v_benLabTestOrderedDetails.getTestComponentID();
        String actualTestComponentName = v_benLabTestOrderedDetails.getTestComponentName();
        Long actualVisitCode = v_benLabTestOrderedDetails.getVisitCode();

        // Assert that nothing has changed
        assertEquals("42", actualId);
        assertEquals("42", actualResultValue);
        assertEquals("Calibration End API", actualCalibrationEndAPI);
        assertEquals("Calibration Start API", actualCalibrationStartAPI);
        assertEquals("Calibration Status API", actualCalibrationStatusAPI);
        assertEquals("Component Code", actualComponentCode);
        assertEquals("Component Unit", actualComponentUnit);
        assertEquals("Discovery Code", actualDiscoveryCode);
        assertEquals("I OTComponent Name", actualIOTComponentName);
        assertEquals("I OTProcedure ID", actualIOTProcedureID);
        assertEquals("Input Type", actualInputType);
        assertEquals("Iot Procedure Name", actualIotProcedureName);
        assertEquals("Measurement Unit", actualMeasurementUnit);
        assertEquals("Procedure Code", actualProcedureCode);
        assertEquals("Procedure Desc", actualProcedureDesc);
        assertEquals("Procedure End API", actualProcedureEndAPI);
        assertEquals("Procedure Name", actualProcedureName);
        assertEquals("Procedure Start API", actualProcedureStartAPI);
        assertEquals("Procedure Status API", actualProcedureStatusAPI);
        assertEquals("Procedure Type", actualProcedureType);
        assertEquals("Test Component Desc", actualTestComponentDesc);
        assertEquals("Test Component Name", actualTestComponentName);
        assertEquals(1, actualProcedureID.intValue());
        assertEquals(1, actualRange_min.intValue());
        assertEquals(1, actualRange_normal_min.intValue());
        assertEquals(1, actualTestComponentID.intValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualPrescriptionID.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertEquals(3, actualRange_max.intValue());
        assertEquals(3, actualRange_normal_max.intValue());
        assertTrue(actualIsDecimal);
        assertTrue(actualIsLabProcedure);
        assertTrue(actualIsMandatory);
    }
}
