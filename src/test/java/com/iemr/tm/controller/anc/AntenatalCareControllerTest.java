package com.iemr.tm.controller.anc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.annotation.Description;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.iemr.tm.service.anc.ANCServiceImpl;
import com.iemr.tm.utils.response.OutputResponse;
@ExtendWith(MockitoExtension.class)
class AntenatalCareControllerTest {
	
	@InjectMocks
	private AntenatalCareController antenatalCareController;
	
	@Mock
	private ANCServiceImpl ancServiceImpl;
	
	@Test
	@Description("Tests successful saving of ANC nurse data (TC_SaveBenANCNurseData_Success_001)")
	public void testSaveBenANCNurseData_Success() throws Exception {
	    // Given
	    String validRequestJson = "{ \"valid\": \"data\" }"; // Replace with valid ANC nurse data

	    // Mock ancServiceImpl behavior
	    String mockAncResponse = "ANC data saved successfully";
	    when(ancServiceImpl.saveANCNurseData(any(JsonObject.class), anyString())).thenReturn(mockAncResponse);

	    // When
	    String response = antenatalCareController.saveBenANCNurseData(validRequestJson, "Authorization");
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}
	
	@Test
	@Description("Tests handling of invalid JSON request body (TC_SaveBenANCNurseData_InvalidJson_002)")
	public void testSaveBenANCNurseData_InvalidJson() throws Exception {
	    // Given
	    String invalidJson = "{ invalid: data }"; // Invalid JSON format

	    // When
	    String response = antenatalCareController.saveBenANCNurseData(invalidJson, "Authorization");
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertTrue(outputResponse.getErrorMessage().contains("Invalid request")); // Or specific error message
	}
	
	@Test
	@Description("Tests handling of exception during ANC data save (TC_SaveBenANCNurseData_Exception_003)")
	public void testSaveBenANCNurseData_Exception() throws Exception {
	    // Given
	    String validRequestJson = "{ \"valid\": \"data\" }"; // Replace with valid ANC nurse data

	    // Mock ancServiceImpl behavior to throw exception
	    when(ancServiceImpl.saveANCNurseData(any(JsonObject.class), anyString())).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = antenatalCareController.saveBenANCNurseData(validRequestJson, "Authorization");
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests successful saving of ANC doctor data (TC_SaveBenANCDoctorData_Success_001)")
	public void testSaveBenANCDoctorData_Success() throws Exception {
	    // Given
	    String validRequestJson = "{ \"valid\": \"data\" }"; // Replace with valid ANC doctor data

	    // Mock ancServiceImpl behavior
	    when(ancServiceImpl.saveANCDoctorData(any(JsonObject.class), anyString())).thenReturn(1L);

	    // When
	    String response = antenatalCareController.saveBenANCDoctorData(validRequestJson, "Authorization");
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}
	
	@Test
	@Description("Tests handling of empty request body (TC_SaveBenANCDoctorData_EmptyRequestBody_002)")
	public void testSaveBenANCDoctorData_EmptyRequestBody() throws Exception {
	    // Given
	    String emptyRequest = "";

	    // When
	    String response = antenatalCareController.saveBenANCDoctorData(emptyRequest, "Authorization");
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Not a JSON Object: null", outputResponse.getErrorMessage());
	}
	
	@Test
	@Description("Tests handling of invalid JSON request body (TC_SaveBenANCDoctorData_InvalidJson_003)")
	public void testSaveBenANCDoctorData_InvalidJson() throws Exception {
	    // Given
	    String invalidJson = "{ invalid: data }"; // Invalid JSON format

	    // When
	    String response = antenatalCareController.saveBenANCDoctorData(invalidJson, "Authorization");
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);

	    // Verify error message is not null
	    assertNotNull(outputResponse.getErrorMessage());
	}

	
	@Test
	@Description("Tests handling of failure during ANC doctor data save (TC_SaveBenANCDoctorData_SaveFailed_004)")
	public void testSaveBenANCDoctorData_SaveFailed() throws Exception {
	    // Given
	    String validRequestJson = "{ \"valid\": \"data\" }"; 

	    // Mock ancServiceImpl behavior to return null
	    when(ancServiceImpl.saveANCDoctorData(any(JsonObject.class), anyString())).thenReturn(null);

	    // When
	    String response = antenatalCareController.saveBenANCDoctorData(validRequestJson, "Authorization");
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Unable to save data", outputResponse.getErrorMessage());
	}
	
	@Test
	@Description("Tests successful retrieval of beneficiary visit details (TC_GetBenVisitDetailsFrmNurseANC_Success_001)")
	public void testGetBenVisitDetailsFrmNurseANC_Success() throws Exception {
	    // Given
	    Long validBenRegId = 123456L;
	    Long validVisitCode = 7890L;
	    String mockResponse = "{ \"visitDetails\": \"Details fetched successfully\" }"; // Replace with expected response

	    // Mock ancServiceImpl behavior
	    when(ancServiceImpl.getBenVisitDetailsFrmNurseANC(validBenRegId, validVisitCode)).thenReturn(mockResponse);

	    String requestBody = "{\"benRegID\":" + validBenRegId + ",\"visitCode\":" + validVisitCode + "}";

	    // When
	    String response = antenatalCareController.getBenVisitDetailsFrmNurseANC(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}
	
	@Test
	@Description("Tests handling of empty request body (TC_GetBenVisitDetailsFrmNurseANC_EmptyRequestBody_002)")
	public void testGetBenVisitDetailsFrmNurseANC_EmptyRequestBody() throws Exception {
	    // Given
	    String emptyRequest = "";

	    // When
	    String response = antenatalCareController.getBenVisitDetailsFrmNurseANC(emptyRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Error while getting beneficiary visit data", outputResponse.getErrorMessage());
	}
	
	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetBenVisitDetailsFrmNurseANC_InvalidJson_003)")
	public void testGetBenVisitDetailsFrmNurseANC_InvalidJson() throws Exception {
	    // Given
	    String invalidJson = "{ invalid: data }"; // Invalid JSON format

	    // When
	    String response = antenatalCareController.getBenVisitDetailsFrmNurseANC(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message
	}
	
	@Test
	@Description("Tests handling of request missing required fields (TC_GetBenVisitDetailsFrmNurseANC_MissingFields_004)")
	public void testGetBenVisitDetailsFrmNurseANC_MissingFields() throws Exception {
	    // Given
	    String missingFieldsJson = "{ \"benRegID\": 123456 }"; // Missing visitCode

	    // When
	    String response = antenatalCareController.getBenVisitDetailsFrmNurseANC(missingFieldsJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertTrue(outputResponse.getErrorMessage().contains("Invalid request")); 
	}
	
	@Test
	@Description("Tests handling of exception during visit details retrieval (TC_GetBenVisitDetailsFrmNurseANC_ServiceException_005)")
	public void testGetBenVisitDetailsFrmNurseANC_ServiceException() throws Exception {
	    // Given
	    Long validBenRegId = 123456L;
	    Long validVisitCode = 7890L;

	    // Mock ancServiceImpl behavior to throw exception
	    when(ancServiceImpl.getBenVisitDetailsFrmNurseANC(validBenRegId, validVisitCode)).thenThrow(new RuntimeException("Mocked exception"));

	    String requestBody = "{\"benRegID\":" + validBenRegId + ",\"visitCode\":" + validVisitCode + "}";

	    // When
	    String response = antenatalCareController.getBenVisitDetailsFrmNurseANC(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful retrieval of beneficiary ANC details (TC_GetBenANCDetailsFrmNurseANC_Success_001)")
	public void testGetBenANCDetailsFrmNurseANC_Success() throws Exception {
	    // Given
	    Long validBenRegId = 123456L;
	    Long validVisitCode = 7890L;
	    String mockResponse = "{ \"ancDetails\": \"Details fetched successfully\" }"; // Replace with expected response

	    // Mock ancServiceImpl behavior
	    when(ancServiceImpl.getBenANCDetailsFrmNurseANC(validBenRegId, validVisitCode)).thenReturn(mockResponse);

	    String requestBody = "{\"benRegID\":" + validBenRegId + ",\"visitCode\":" + validVisitCode + "}";

	    // When
	    String response = antenatalCareController.getBenANCDetailsFrmNurseANC(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}
	
	@Test
	@Description("Tests handling of empty request body (TC_GetBenANCDetailsFrmNurseANC_EmptyRequestBody_002)")
	public void testGetBenANCDetailsFrmNurseANC_EmptyRequestBody() throws Exception {
	    // Given
	    String emptyRequest = "";

	    // When
	    String response = antenatalCareController.getBenANCDetailsFrmNurseANC(emptyRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Error while getting beneficiary ANC care data", outputResponse.getErrorMessage());
	}
	
	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetBenANCDetailsFrmNurseANC_InvalidJson_003)")
	public void testGetBenANCDetailsFrmNurseANC_InvalidJson() throws Exception {
	    // Given
	    String invalidJson = "{ invalid: data }"; // Invalid JSON format

	    // When
	    String response = antenatalCareController.getBenANCDetailsFrmNurseANC(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message
	}
	
	@Test
	@Description("Tests handling of request missing required fields (TC_GetBenANCDetailsFrmNurseANC_MissingFields_004)")
	public void testGetBenANCDetailsFrmNurseANC_MissingFields() throws Exception {
	    // Given
	    String missingFieldsJson = "{ \"benRegID\": 123456 }"; // Missing visitCode

	    // When
	    String response = antenatalCareController.getBenANCDetailsFrmNurseANC(missingFieldsJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertTrue(outputResponse.getErrorMessage().contains("Invalid request")); // Or specific message indicating missing fields
	}
	
	@Test
	@Description("Tests handling of exception during ANC details retrieval (TC_GetBenANCDetailsFrmNurseANC_ServiceException_005)")
	public void testGetBenANCDetailsFrmNurseANC_ServiceException() throws Exception {
	    // Given
	    Long validBenRegId = 123456L;
	    Long validVisitCode = 7890L;

	    // Mock ancServiceImpl behavior to throw exception
	    when(ancServiceImpl.getBenANCDetailsFrmNurseANC(validBenRegId, validVisitCode)).thenThrow(new RuntimeException("Mocked exception"));

	    String requestBody = "{\"benRegID\":" + validBenRegId + ",\"visitCode\":" + validVisitCode + "}";

	    // When
	    String response = antenatalCareController.getBenANCDetailsFrmNurseANC(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful retrieval of beneficiary ANC history details (TC_GetBenANCHistoryDetails_Success_001)")
	public void testGetBenANCHistoryDetails_Success() throws Exception {
	    // Given
	    Long validBenRegId = 123456L;
	    Long validVisitCode = 7890L;
	    String mockResponse = "{ \"ancHistoryDetails\": \"Details fetched successfully\" }"; // Replace with expected response

	    // Mock ancServiceImpl behavior
	    when(ancServiceImpl.getBenANCHistoryDetails(validBenRegId, validVisitCode)).thenReturn(mockResponse);

	    String requestBody = "{\"benRegID\":" + validBenRegId + ",\"visitCode\":" + validVisitCode + "}";

	    // When
	    String response = antenatalCareController.getBenANCHistoryDetails(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}
	
	@Test
	@Description("Tests handling of empty request body (TC_GetBenANCHistoryDetails_EmptyRequestBody_002)")
	public void testGetBenANCHistoryDetails_EmptyRequestBody() throws Exception {
	    // Given
	    String emptyRequest = "";

	    // When
	    String response = antenatalCareController.getBenANCHistoryDetails(emptyRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Error while getting beneficiary history data", outputResponse.getErrorMessage());
	}
	
	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetBenANCHistoryDetails_InvalidJson_003)")
	public void testGetBenANCHistoryDetails_InvalidJson() throws Exception {
	    // Given
	    String invalidJson = "{ invalid: data }"; // Invalid JSON format

	    // When
	    String response = antenatalCareController.getBenANCHistoryDetails(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message
	}
	
	@Test
	@Description("Tests handling of request missing required fields (TC_GetBenANCHistoryDetails_MissingFields_004)")
	public void testGetBenANCHistoryDetails_MissingFields() throws Exception {
	    // Given
	    String missingFieldsJson = "{ \"benRegID\": 123456 }"; // Missing visitCode

	    // When
	    String response = antenatalCareController.getBenANCHistoryDetails(missingFieldsJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertTrue(outputResponse.getErrorMessage().contains("Invalid request")); // Or specific message indicating missing fields
	}
	
	@Test
	@Description("Tests handling of exception during ANC history retrieval (TC_GetBenANCHistoryDetails_ServiceException_006)")
	public void testGetBenANCHistoryDetails_ServiceException() throws Exception {
	    // Given
	    Long validBenRegId = 123456L;
	    Long validVisitCode = 7890L;

	    // Mock ancServiceImpl behavior to throw exception
	    when(ancServiceImpl.getBenANCHistoryDetails(validBenRegId, validVisitCode)).thenThrow(new RuntimeException("Mocked exception"));

	    String requestBody = "{\"benRegID\":" + validBenRegId + ",\"visitCode\":" + validVisitCode + "}";

	    // When
	    String response = antenatalCareController.getBenANCHistoryDetails(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful retrieval of beneficiary ANC vital details (TC_GetBenANCVitalDetailsFrmNurseANC_Success_001)")
	public void testGetBenANCVitalDetailsFrmNurseANC_Success() throws Exception {
	    // Given
	    Long validBenRegId = 123456L;
	    Long validVisitCode = 7890L;
	    String mockResponse = "{ \"ancVitalDetails\": \"Details fetched successfully\" }"; // Replace with expected response

	    // Mock ancServiceImpl behavior
	    when(ancServiceImpl.getBeneficiaryVitalDetails(validBenRegId, validVisitCode)).thenReturn(mockResponse);

	    String requestBody = "{\"benRegID\":" + validBenRegId + ",\"visitCode\":" + validVisitCode + "}";

	    // When
	    String response = antenatalCareController.getBenANCVitalDetailsFrmNurseANC(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}
	
	@Test
	@Description("Tests handling of empty request body (TC_GetBenANCVitalDetailsFrmNurseANC_EmptyRequestBody_002)")
	public void testGetBenANCVitalDetailsFrmNurseANC_EmptyRequestBody() throws Exception {
	    // Given
	    String emptyRequest = "";

	    // When
	    String response = antenatalCareController.getBenANCVitalDetailsFrmNurseANC(emptyRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Error while getting beneficiary vital data", outputResponse.getErrorMessage());
	}
	
	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetBenANCVitalDetailsFrmNurseANC_InvalidJson_003)")
	public void testGetBenANCVitalDetailsFrmNurseANC_InvalidJson() throws Exception {
	    // Given
	    String invalidJson = "{ invalid: data }"; // Invalid JSON format

	    // When
	    String response = antenatalCareController.getBenANCVitalDetailsFrmNurseANC(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message
	}
	
	@Test
	@Description("Tests handling of request missing required fields (TC_GetBenANCVitalDetailsFrmNurseANC_MissingFields_004)")
	public void testGetBenANCVitalDetailsFrmNurseANC_MissingFields() throws Exception {
	    // Given
	    String missingFieldsJson = "{ \"benRegID\": 123456 }"; // Missing visitCode

	    // When
	    String response = antenatalCareController.getBenANCVitalDetailsFrmNurseANC(missingFieldsJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertTrue(outputResponse.getErrorMessage().contains("Invalid request")); // Or specific message indicating missing fields
	}
	
	@Test
	@Description("Tests handling of exception during ANC vital details retrieval (TC_GetBenANCVitalDetailsFrmNurseANC_ServiceException_005)")
	public void testGetBenANCVitalDetailsFrmNurseANC_ServiceException() throws Exception {
	    // Given
	    Long validBenRegId = 123456L;
	    Long validVisitCode = 7890L;

	    // Mock ancServiceImpl behavior to throw exception
	    when(ancServiceImpl.getBeneficiaryVitalDetails(validBenRegId, validVisitCode)).thenThrow(new RuntimeException("Mocked exception"));

	    String requestBody = "{\"benRegID\":" + validBenRegId + ",\"visitCode\":" + validVisitCode + "}";

	    // When
	    String response = antenatalCareController.getBenANCVitalDetailsFrmNurseANC(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful retrieval of beneficiary ANC examination details (TC_GetBenExaminationDetailsANC_Success_001)")
	public void testGetBenExaminationDetailsANC_Success() throws Exception {
	    // Given (Test ID: 1)
	    Long validBenRegId = 123456L;
	    Long validVisitCode = 7890L;
	    String mockResponse = "{ \"examinationDetails\": \"Details fetched successfully\" }"; // Replace with expected response

	    // Mock ancServiceImpl behavior
	    when(ancServiceImpl.getANCExaminationDetailsData(validBenRegId, validVisitCode)).thenReturn(mockResponse);

	    String requestBody = "{\"benRegID\":" + validBenRegId + ",\"visitCode\":" + validVisitCode + "}";

	    // When
	    String response = antenatalCareController.getBenExaminationDetailsANC(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}
	
	@Test
	@Description("Tests handling of empty request body (TC_GetBenExaminationDetailsANC_EmptyRequestBody_002)")
	public void testGetBenExaminationDetailsANC_EmptyRequestBody() throws Exception {
	    // Given (Test ID: 2)
	    String emptyRequest = "";

	    // When
	    String response = antenatalCareController.getBenExaminationDetailsANC(emptyRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Error while getting beneficiary examination data", outputResponse.getErrorMessage());
	}
	
	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetBenExaminationDetailsANC_InvalidJson_003)")
	public void testGetBenExaminationDetailsANC_InvalidJson() throws Exception {
	    // Given (Test ID: 3)
	    String invalidJson = "{ invalid: data }"; // Invalid JSON format

	    // When
	    String response = antenatalCareController.getBenExaminationDetailsANC(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message
	}
	
	@Test
	@Description("Tests handling of request missing required fields (TC_GetBenExaminationDetailsANC_MissingFields_004)")
	public void testGetBenExaminationDetailsANC_MissingFields() throws Exception {
	    // Given (Test ID: 4)
	    String missingFieldsJson = "{ \"benRegID\": 123456 }"; // Missing visitCode

	    // When
	    String response = antenatalCareController.getBenExaminationDetailsANC(missingFieldsJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertTrue(outputResponse.getErrorMessage().contains("Invalid request")); // Or specific message indicating missing fields
	}
	
	@Test
	@Description("Tests handling of exception during ANC examination details retrieval (TC_GetBenExaminationDetailsANC_ServiceException_005)")
	public void testGetBenExaminationDetailsANC_ServiceException() throws Exception {
	    // Given (Test ID: 5)
	    Long validBenRegId = 123456L;
	    Long validVisitCode = 7890L;

	    // Mock ancServiceImpl behavior to throw exception
	    when(ancServiceImpl.getANCExaminationDetailsData(validBenRegId, validVisitCode)).thenThrow(new RuntimeException("Mocked exception"));

	    String requestBody = "{\"benRegID\":" + validBenRegId + ",\"visitCode\":" + validVisitCode + "}";

	    // When
	    String response = antenatalCareController.getBenExaminationDetailsANC(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful retrieval of beneficiary case record from doctor (TC_GetBenCaseRecordFromDoctorANC_Success_001)")
	public void testGetBenCaseRecordFromDoctorANC_Success() throws Exception {
	    // Given
	    Long validBenRegId = 123456L;
	    Long validVisitCode = 7890L;
	    String mockResponse = "{ \"caseRecordDetails\": \"Details fetched successfully\" }"; // Replace with expected response

	    // Mock ancServiceImpl behavior
	    when(ancServiceImpl.getBenCaseRecordFromDoctorANC(validBenRegId, validVisitCode)).thenReturn(mockResponse);

	    String requestBody = "{\"benRegID\":" + validBenRegId + ",\"visitCode\":" + validVisitCode + "}";

	    // When
	    String response = antenatalCareController.getBenCaseRecordFromDoctorANC(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}
	
	@Test
	@Description("Tests handling of empty request body (TC_GetBenCaseRecordFromDoctorANC_EmptyRequestBody_002)")
	public void testGetBenCaseRecordFromDoctorANC_EmptyRequestBody() throws Exception {
	    // Given
	    String emptyRequest = "";

	    // When
	    String response = antenatalCareController.getBenCaseRecordFromDoctorANC(emptyRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Error while getting beneficiary doctor data", outputResponse.getErrorMessage());
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetBenCaseRecordFromDoctorANC_InvalidJson_003)")
	public void testGetBenCaseRecordFromDoctorANC_InvalidJson() throws Exception {
	    // Given
	    String invalidJson = "{ invalid: data }"; // Invalid JSON format

	    // When
	    String response = antenatalCareController.getBenCaseRecordFromDoctorANC(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message
	}

	@Test
	@Description("Tests handling of request body with missing fields (TC_GetBenCaseRecordFromDoctorANC_IncompleteRequestBody_004)")
	public void testGetBenCaseRecordFromDoctorANC_IncompleteRequestBody() throws Exception {
	    // Given
	    String missingFieldsJson = "{ \"benRegID\": 123456 }"; // Missing visitCode

	    // When
	    String response = antenatalCareController.getBenCaseRecordFromDoctorANC(missingFieldsJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertTrue(outputResponse.getErrorMessage().contains("Invalid request")); // Or specific message indicating missing fields
	}

	@Test
	@Description("Tests handling of exception during case record retrieval (TC_GetBenCaseRecordFromDoctorANC_ServiceException_005)")
	public void testGetBenCaseRecordFromDoctorANC_ServiceException() throws Exception {
	    // Given
	    Long validBenRegId = 123456L;
	    Long validVisitCode = 7890L;

	    // Mock ancServiceImpl behavior to throw exception
	    when(ancServiceImpl.getBenCaseRecordFromDoctorANC(validBenRegId, validVisitCode)).thenThrow(new RuntimeException("Mocked exception"));

	    String requestBody = "{\"benRegID\":" + validBenRegId + ",\"visitCode\":" + validVisitCode + "}";

	    // When
	    String response = antenatalCareController.getBenCaseRecordFromDoctorANC(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful retrieval of HRP status (TC_GetHRPStatus_Success_001)")
	public void testGetHRPStatus_Success() throws Exception {
	    // Given
	    Long validBenRegId = 123456L;
	    Long validVisitCode = 7890L;
	    String mockResponse = "Positive"; // Replace with expected HRP status

	    // Mock ancServiceImpl behavior
	    when(ancServiceImpl.getHRPStatus(validBenRegId, validVisitCode)).thenReturn(mockResponse);

	    String requestBody = "{\"benRegID\":" + validBenRegId + ",\"visitCode\":" + validVisitCode + "}";

	    // When
	    String response = antenatalCareController.getHRPStatus(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of empty request body (TC_GetHRPStatus_EmptyRequestBody_002)")
	public void testGetHRPStatus_EmptyRequestBody() throws Exception {
	    // Given
	    String emptyRequest = "";

	    // When
	    String response = antenatalCareController.getHRPStatus(emptyRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("error in getting HRP status", outputResponse.getErrorMessage());
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetHRPStatus_InvalidJson_003)")
	public void testGetHRPStatus_InvalidJson() throws Exception {
	    // Given
	    String invalidJson = "{ invalid: data }"; // Invalid JSON format

	    // When
	    String response = antenatalCareController.getHRPStatus(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message
	}

	@Test
	@Description("Tests handling of request body with missing fields (TC_GetHRPStatus_IncompleteRequestBody_004)")
	public void testGetHRPStatus_IncompleteRequestBody() throws Exception {
	    // Given
	    String missingFieldsJson = "{ \"benRegID\": 123456 }"; // Missing visitCode

	    // When
	    String response = antenatalCareController.getHRPStatus(missingFieldsJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertTrue(outputResponse.getErrorMessage().contains("Invalid request")); // Or specific message indicating missing fields
	}

	@Test
	@Description("Tests handling of null response from service (TC_GetHRPStatus_ServiceReturnsNull_005)")
	public void testGetHRPStatus_ServiceReturnsNull() throws Exception {
	    // Given
	    Long validBenRegId = 123456L;
	    Long validVisitCode = 7890L;

	    // Mock ancServiceImpl behavior to return null
	    when(ancServiceImpl.getHRPStatus(validBenRegId, validVisitCode)).thenReturn(null);

	    String requestBody = "{\"benRegID\":" + validBenRegId + ",\"visitCode\":" + validVisitCode + "}";

	    // When
	    String response = antenatalCareController.getHRPStatus(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertTrue(outputResponse.getErrorMessage().contains("error in getting HRP status")); // Or specific error message
	}

	@Test
	@Description("Tests successful update of ANC care data (TC_UpdateANCCareNurse_Success_001)")
	public void testUpdateANCCareNurse_Success() throws Exception {
	    // Given (mock ANC care data)
	    String mockRequest = "{\"benRegID\": 123456, \"visitCode\": 7890, \"updatedField1\": \"value1\"}"; // Replace with your actual data structure

	    // Mock ancServiceImpl behavior
	    when(ancServiceImpl.updateBenANCDetails(any(JsonObject.class))).thenReturn(1); // Simulate successful update

	    // When
	    String response = antenatalCareController.updateANCCareNurse(mockRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of empty request body (TC_UpdateANCCareNurse_EmptyRequestBody_002)")
	public void testUpdateANCCareNurse_EmptyRequestBody() throws Exception {
	    // Given
	    String emptyRequest = "";

	    // When
	    String response = antenatalCareController.updateANCCareNurse(emptyRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNull(response);
	    assertEquals("Unable to modify data", outputResponse.getErrorMessage());
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_UpdateANCCareNurse_InvalidJson_003)")
	public void testUpdateANCCareNurse_InvalidJson() throws Exception {
	    // Given
	    String invalidJson = "{ invalid: data }"; // Invalid JSON format

	    // When
	    String response = antenatalCareController.updateANCCareNurse(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JsonParseException")); // Or specific error message for parsing
	}

	@Test
	@Description("Tests handling of update failure from service (TC_UpdateANCCareNurse_UpdateFailure_004)")
	public void testUpdateANCCareNurse_UpdateFailure() throws Exception {
	    // Given (mock ANC care data)
	    String mockRequest = "{\"benRegID\": 123456, \"visitCode\": 7890, \"updatedField1\": \"value1\"}"; // Replace with your actual data structure

	    // Mock ancServiceImpl behavior to simulate update failure
	    when(ancServiceImpl.updateBenANCDetails(any(JsonObject.class))).thenReturn(0);

	    // When
	    String response = antenatalCareController.updateANCCareNurse(mockRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Unable to modify data", outputResponse.getErrorMessage());
	}

	@Test
	@Description("Tests handling of exception during update (TC_UpdateANCCareNurse_ServiceException_005)")
	public void testUpdateANCCareNurse_ServiceException() throws Exception {
	    // Given (mock ANC care data)
	    String mockRequest = "{\"benRegID\": 123456, \"visitCode\": 7890, \"updatedField1\": \"value1\"}"; // Replace with your actual data structure

	    // Mock ancServiceImpl behavior to throw exception
	    when(ancServiceImpl.updateBenANCDetails(any(JsonObject.class))).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = antenatalCareController.updateANCCareNurse(mockRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful update of ANC history data (TC_UpdateANCHistoryNurse_Success_001)")
	public void testUpdateANCHistoryNurse_Success() throws Exception {
	    // Given (mock ANC history data)
	    String mockRequest = "{\"benRegID\": 123456, \"visitCode\": 7890, \"updatedField1\": \"value1\"}"; // Replace with your actual data structure

	    // Mock ancServiceImpl behavior
	    when(ancServiceImpl.updateBenANCHistoryDetails(any(JsonObject.class))).thenReturn(1); // Simulate successful update

	    // When
	    String response = antenatalCareController.updateANCHistoryNurse(mockRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}


	@Test
	@Description("Tests handling of invalid JSON request body (TC_UpdateANCHistoryNurse_InvalidJson_002)")
	public void testUpdateANCHistoryNurse_InvalidJson() throws Exception {
	    // Given
	    String invalidJson = "{ invalid: data }"; // Invalid JSON format

	    // When
	    String response = antenatalCareController.updateANCHistoryNurse(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JsonParseException")); // Or specific error message for parsing
	}

	@Test
	@Description("Tests handling of update failure from service (TC_UpdateANCHistoryNurse_UpdateFailure_003)")
	public void testUpdateANCHistoryNurse_UpdateFailure() throws Exception {
	    // Given (mock ANC history data)
	    String mockRequest = "{\"benRegID\": 123456, \"visitCode\": 7890, \"updatedField1\": \"value1\"}"; // Replace with your actual data structure

	    // Mock ancServiceImpl behavior to simulate update failure
	    when(ancServiceImpl.updateBenANCHistoryDetails(any(JsonObject.class))).thenReturn(0);

	    // When
	    String response = antenatalCareController.updateANCHistoryNurse(mockRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Unable to modify data", outputResponse.getErrorMessage());
	}

	@Test
	@Description("Tests handling of exception during update (TC_UpdateANCHistoryNurse_ServiceException_004)")
	public void testUpdateANCHistoryNurse_ServiceException() throws Exception {
	    // Given (mock ANC history data)
	    String mockRequest = "{\"benRegID\": 123456, \"visitCode\": 7890, \"updatedField1\": \"value1\"}"; // Replace with your actual data structure

	    // Mock ancServiceImpl behavior to throw exception
	    when(ancServiceImpl.updateBenANCHistoryDetails(any(JsonObject.class))).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = antenatalCareController.updateANCHistoryNurse(mockRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful update of ANC vital data (TC_UpdateANCVitalNurse_Success_001)")
	public void testUpdateANCVitalNurse_Success() throws Exception {
	    // Given (mock ANC vital data)
	    String mockRequest = "{\"benRegID\": 123456, \"visitCode\": 7890, \"updatedField1\": \"value1\"}"; // Replace with your actual data structure

	    // Mock ancServiceImpl behavior
	    when(ancServiceImpl.updateBenANCVitalDetails(any(JsonObject.class))).thenReturn(1); // Simulate successful update

	    // When
	    String response = antenatalCareController.updateANCVitalNurse(mockRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_UpdateANCVitalNurse_InvalidJson_002)")
	public void testUpdateANCVitalNurse_InvalidJson() throws Exception {
	    // Given
	    String invalidJson = "{ invalid: data }"; // Invalid JSON format

	    // When
	    String response = antenatalCareController.updateANCVitalNurse(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JsonParseException")); // Or specific error message for parsing
	}

	@Test
	@Description("Tests handling of update failure from service (TC_UpdateANCVitalNurse_UpdateFailure_003)")
	public void testUpdateANCVitalNurse_UpdateFailure() throws Exception {
	    // Given (mock ANC vital data)
	    String mockRequest = "{\"benRegID\": 123456, \"visitCode\": 7890, \"updatedField1\": \"value1\"}"; // Replace with your actual data structure

	    // Mock ancServiceImpl behavior to simulate update failure
	    when(ancServiceImpl.updateBenANCVitalDetails(any(JsonObject.class))).thenReturn(0);

	    // When
	    String response = antenatalCareController.updateANCVitalNurse(mockRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Unable to modify data", outputResponse.getErrorMessage());
	}

	@Test
	@Description("Tests handling of exception during update (TC_UpdateANCVitalNurse_ServiceException_004)")
	public void testUpdateANCVitalNurse_ServiceException() throws Exception {
	    // Given (mock ANC vital data)
	    String mockRequest = "{\"benRegID\": 123456, \"visitCode\": 7890, \"updatedField1\": \"value1\"}"; // Replace with your actual data structure

	    // Mock ancServiceImpl behavior to throw exception
	    when(ancServiceImpl.updateBenANCVitalDetails(any(JsonObject.class))).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = antenatalCareController.updateANCVitalNurse(mockRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful update of ANC examination data (TC_UpdateANCExaminationNurse_Success_001)")
	public void testUpdateANCExaminationNurse_Success() throws Exception {
	    // Given (mock ANC examination data)
	    String mockRequest = "{\"benRegID\": 123456, \"visitCode\": 7890, \"updatedField1\": \"value1\"}"; // Replace with your actual data structure

	    // Mock ancServiceImpl behavior
	    when(ancServiceImpl.updateBenANCExaminationDetails(any(JsonObject.class))).thenReturn(1); // Simulate successful update

	    // When
	    String response = antenatalCareController.updateANCExaminationNurse(mockRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_UpdateANCExaminationNurse_InvalidJson_002)")
	public void testUpdateANCExaminationNurse_InvalidJson() throws Exception {
	    // Given
	    String invalidJson = "{ invalid: data }"; // Invalid JSON format

	    // When
	    String response = antenatalCareController.updateANCExaminationNurse(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JsonParseException")); // Or specific error message for parsing
	}

	@Test
	@Description("Tests handling of update failure from service (TC_UpdateANCExaminationNurse_UpdateFailure_003)")
	public void testUpdateANCExaminationNurse_UpdateFailure() throws Exception {
	    // Given (mock ANC examination data)
	    String mockRequest = "{\"benRegID\": 123456, \"visitCode\": 7890, \"updatedField1\": \"value1\"}"; // Replace with your actual data structure

	    // Mock ancServiceImpl behavior to simulate update failure
	    when(ancServiceImpl.updateBenANCExaminationDetails(any(JsonObject.class))).thenReturn(0);

	    // When
	    String response = antenatalCareController.updateANCExaminationNurse(mockRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Unable to modify data", outputResponse.getErrorMessage());
	}

	@Test
	@Description("Tests handling of exception during update (TC_UpdateANCExaminationNurse_ServiceException_004)")
	public void testUpdateANCExaminationNurse_ServiceException() throws Exception {
	    // Given (mock ANC examination data)
	    String mockRequest = "{\"benRegID\": 123456, \"visitCode\": 7890, \"updatedField1\": \"value1\"}"; // Replace with your actual data structure

	    // Mock ancServiceImpl behavior to throw exception
	    when(ancServiceImpl.updateBenANCExaminationDetails(any(JsonObject.class))).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = antenatalCareController.updateANCExaminationNurse(mockRequest);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}
	
	@Test
	@Description("Tests successful update of ANC doctor data (TC_UpdateANCDoctorData_Success_001)")
	public void testUpdateANCDoctorData_Success() throws Exception {
	    // Given (mock ANC doctor data and authorization header)
	    String mockRequest = "{\"doctorName\": \"Dr. Test\"}"; 
	    String authorizationHeader = "Bearer valid_token"; 

	    // Mock ancServiceImpl behavior
	    when(ancServiceImpl.updateANCDoctorData(any(JsonObject.class), Mockito.eq(authorizationHeader))).thenReturn(1L);

	    // When
	    String response = antenatalCareController.updateANCDoctorData(mockRequest, authorizationHeader);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}
	
	@Test
	@Description("Tests handling of invalid JSON request body (TC_UpdateANCDoctorData_InvalidJson_002)")
	public void testUpdateANCDoctorData_InvalidJson() throws Exception {
	    // Given
	    String invalidJson = "{ invalid: data }"; // Invalid JSON format
	    String authorizationHeader = "Bearer valid_token";

	    // When
	    String response = antenatalCareController.updateANCDoctorData(invalidJson, authorizationHeader);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JsonParseException")); // Or specific error message for parsing
	}
	
	@Test
	@Description("Tests handling of missing Authorization header (TC_UpdateANCDoctorData_MissingAuthorization_003)")
	public void testUpdateANCDoctorData_MissingAuthorization() throws Exception {
	    // Given (mock ANC doctor data)
	    String mockRequest = "{\"doctorName\": \"Dr. Test\"}"; 

	    // When
	    String response = antenatalCareController.updateANCDoctorData(mockRequest, null);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Authorization required")); // Or specific message
	}

	@Test
	@Description("Tests handling of update failure from service (TC_UpdateANCDoctorData_UpdateFailure_004)")
	public void testUpdateANCDoctorData_UpdateFailure() throws Exception {
	    // Given (mock ANC doctor data and authorization header)
	    String mockRequest = "{\"doctorName\": \"Dr. Test\"}"; 
	    String authorizationHeader = "Bearer valid_token";

	    // Mock ancServiceImpl behavior to simulate update failure
	    when(ancServiceImpl.updateANCDoctorData(any(JsonObject.class), Mockito.eq(authorizationHeader))).thenReturn(null);

	    // When
	    String response = antenatalCareController.updateANCDoctorData(mockRequest, authorizationHeader);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Unable to modify data", outputResponse.getErrorMessage());
	}


	@Test
	@Description("Tests handling of exception during update (TC_UpdateANCDoctorData_ServiceException_005)")
	public void testUpdateANCDoctorData_ServiceException() throws Exception {
	    // Given (mock ANC doctor data and authorization header)
	    String mockRequest = "{\"doctorName\": \"Dr. Test\"}"; 
	    String authorizationHeader = "Bearer valid_token";

	    // Mock ancServiceImpl behavior to throw exception
	    when(ancServiceImpl.updateANCDoctorData(any(JsonObject.class), Mockito.eq(authorizationHeader))).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = antenatalCareController.updateANCDoctorData(mockRequest, authorizationHeader);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

}
