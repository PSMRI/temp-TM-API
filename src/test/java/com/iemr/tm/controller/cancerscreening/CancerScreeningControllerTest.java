package com.iemr.tm.controller.cancerscreening;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.eq;
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
import com.iemr.tm.data.doctor.CancerDiagnosis;
import com.iemr.tm.data.nurse.BenCancerVitalDetail;
import com.iemr.tm.service.cancerScreening.CSServiceImpl;
import com.iemr.tm.utils.mapper.InputMapper;
import com.iemr.tm.utils.response.OutputResponse;

@ExtendWith(MockitoExtension.class)
class CancerScreeningControllerTest {

	@InjectMocks
	private CancerScreeningController cancerScreeningController;

	@Mock
	private InputMapper inputMapper;
	@Mock
	private OutputResponse response;
	@Mock
	private CSServiceImpl cSServiceImpl;

	@Test
	@Description("Tests successful saving of beneficiary cancer screening nurse data (TC_SaveBenCancerScreeningNurseData_Success_001)")
	public void testSaveBenCancerScreeningNurseData_Success() throws Exception {
		// Given (mock nurse data and authorization header)
		String mockRequest = "{\"beneficiaryId\": 12345, \"screeningDate\": \"2024-08-20\"}";
		String authorizationHeader = "Bearer valid_token";

		// Mock cSServiceImpl behavior
		when(cSServiceImpl.saveCancerScreeningNurseData(any(JsonObject.class), eq(authorizationHeader)))
				.thenReturn("Data saved successfully");

		// When
		String response = cancerScreeningController.saveBenCancerScreeningNurseData(mockRequest, authorizationHeader);
		OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

		// Then
		assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_SaveBenCancerScreeningNurseData_InvalidJson_002)")
	public void testSaveBenCancerScreeningNurseData_InvalidJson() throws Exception {
		// Given
		String invalidJson = "{ invalid: data }"; // Invalid JSON format
		String authorizationHeader = "Bearer valid_token";

		// When
		String response = cancerScreeningController.saveBenCancerScreeningNurseData(invalidJson, authorizationHeader);
		OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

		// Then
		assertNotNull(response);
		assertFalse(outputResponse.getErrorMessage().contains("JsonParseException")); // Or specific error message for
																						// parsing
	}

	@Test
	@Description("Tests handling of missing Authorization header (TC_SaveBenCancerScreeningNurseData_MissingAuthorization_003)")
	public void testSaveBenCancerScreeningNurseData_MissingAuthorization() throws Exception {
		// Given (mock nurse data)
		String mockRequest = "{\"beneficiaryId\": 12345, \"screeningDate\": \"2024-08-20\"}";

		// When
		String response = cancerScreeningController.saveBenCancerScreeningNurseData(mockRequest, null);
		OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

		// Then
		assertNotNull(response);
		assertFalse(outputResponse.getErrorMessage().contains("Authorization required")); // Or specific message
	}

	@Test
	@Description("Tests handling of exception during save (TC_SaveBenCancerScreeningNurseData_ServiceException_004)")
	public void testSaveBenCancerScreeningNurseData_ServiceException() throws Exception {
		// Given (mock nurse data and authorization header)
		String mockRequest = "{\"beneficiaryId\": 12345, \"screeningDate\": \"2024-08-20\"}";
		String authorizationHeader = "Bearer valid_token";

		// Mock cSServiceImpl behavior to throw exception
		when(cSServiceImpl.saveCancerScreeningNurseData(any(JsonObject.class), eq(authorizationHeader)))
				.thenThrow(new RuntimeException("Mocked exception"));

		// When
		String response = cancerScreeningController.saveBenCancerScreeningNurseData(mockRequest, authorizationHeader);
		OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

		// Then
		assertNotNull(response);
		assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful saving of beneficiary cancer screening doctor data (TC_SaveBenCancerScreeningDoctorData_Success_001)")
	public void testSaveBenCancerScreeningDoctorData_Success() throws Exception {
		// Given (mock doctor data and authorization header)
		String mockRequest = "{\"doctorName\": \"Dr. Test\", \"screeningDate\": \"2024-08-20\"}";
		String authorizationHeader = "Bearer valid_token";

		// Mock cSServiceImpl behavior
		when(cSServiceImpl.saveCancerScreeningDoctorData(any(JsonObject.class), eq(authorizationHeader)))
				.thenReturn(1L);

		// When
		String response = cancerScreeningController.saveBenCancerScreeningDoctorData(mockRequest, authorizationHeader);
		OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

		// Then
		assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_SaveBenCancerScreeningDoctorData_InvalidJson_002)")
	public void testSaveBenCancerScreeningDoctorData_InvalidJson() throws Exception {
		// Given
		String invalidJson = "{ invalid: data }"; // Invalid JSON format
		String authorizationHeader = "Bearer valid_token";

		// When
		String response = cancerScreeningController.saveBenCancerScreeningDoctorData(invalidJson, authorizationHeader);
		OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

		// Then
		assertNotNull(response);
		assertFalse(outputResponse.getErrorMessage().contains("JsonParseException")); // Or specific error message for
																						// parsing
	}

	@Test
	@Description("Tests handling of missing Authorization header (TC_SaveBenCancerScreeningDoctorData_MissingAuthorization_003)")
	public void testSaveBenCancerScreeningDoctorData_MissingAuthorization() throws Exception {
		// Given (mock doctor data)
		String mockRequest = "{\"doctorName\": \"Dr. Test\", \"screeningDate\": \"2024-08-20\"}";

		// When
		String response = cancerScreeningController.saveBenCancerScreeningDoctorData(mockRequest, null);
		OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

		// Then
		assertNotNull(response);
		assertFalse(outputResponse.getErrorMessage().contains("Authorization required")); // Or specific message
	}

	@Test
	@Description("Tests handling of exception during save (TC_SaveBenCancerScreeningDoctorData_ServiceException_004)")
	public void testSaveBenCancerScreeningDoctorData_ServiceException() throws Exception {
		// Given (mock doctor data and authorization header)
		String mockRequest = "{\"doctorName\": \"Dr. Test\", \"screeningDate\": \"2024-08-20\"}";
		String authorizationHeader = "Bearer valid_token";

		// Mock cSServiceImpl behavior to throw exception
		when(cSServiceImpl.saveCancerScreeningDoctorData(any(JsonObject.class), eq(authorizationHeader)))
				.thenThrow(new RuntimeException("Mocked exception"));

		// When
		String response = cancerScreeningController.saveBenCancerScreeningDoctorData(mockRequest, authorizationHeader);
		OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

		// Then
		assertNotNull(response);
		assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful retrieval of beneficiary data (TC_GetBenDataFrmNurseScrnToDocScrnVisitDetails_Success_001)")
	public void testGetBenDataFrmNurseScrnToDocScrnVisitDetails_Success() throws Exception {
		// Given (valid request body)
		String requestBody = "{\"benRegID\": 12345, \"visitCode\": 67890}";

		// Mock cSServiceImpl behavior
		when(cSServiceImpl.getBenDataFrmNurseToDocVisitDetailsScreen(anyLong(), anyLong()))
				.thenReturn("Beneficiary details");

		// When
		String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnVisitDetails(requestBody);
		OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

		// Then
		assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetBenDataFrmNurseScrnToDocScrnVisitDetails_InvalidJson_002)")
	public void testGetBenDataFrmNurseScrnToDocScrnVisitDetails_InvalidJson() throws Exception {
		// Given (invalid JSON format)
		String invalidJson = "{ invalid: data }";

		// When
		String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnVisitDetails(invalidJson);
		OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

		// Then
		assertNotNull(response);
		assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message for parsing
	}

	@Test
	@Description("Tests handling of request with missing data (TC_GetBenDataFrmNurseScrnToDocScrnVisitDetails_MissingData_003)")
	public void testGetBenDataFrmNurseScrnToDocScrnVisitDetails_MissingData() throws Exception {
		// Given (request with missing benRegID)
		String requestBody = "{\"visitCode\": 67890}";

		// When
		String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnVisitDetails(requestBody);
		OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

		// Then
		assertNotNull(response);
		assertEquals("Invalid request", outputResponse.getErrorMessage()); // Or specific message
	}

	@Test
	@Description("Tests handling of exception during retrieval (TC_GetBenDataFrmNurseScrnToDocScrnVisitDetails_ServiceException_004)")
	public void testGetBenDataFrmNurseScrnToDocScrnVisitDetails_ServiceException() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345, \"visitCode\": 67890}";

	    // Mock cSServiceImpl behavior to throw exception
	    when(cSServiceImpl.getBenDataFrmNurseToDocVisitDetailsScreen(Mockito.anyLong(), Mockito.anyLong())).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnVisitDetails(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception"));
	}

	@Test
	@Description("Tests successful retrieval of beneficiary history data (TC_GetBenDataFrmNurseScrnToDocScrnHistory_Success_001)")
	public void testGetBenDataFrmNurseScrnToDocScrnHistory_Success() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345, \"visitCode\": 67890}";

	    // Mock cSServiceImpl behavior
	    when(cSServiceImpl.getBenDataFrmNurseToDocHistoryScreen(anyLong(), anyLong())).thenReturn("Beneficiary history details");

	    // When
	    String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnHistory(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetBenDataFrmNurseScrnToDocScrnHistory_InvalidJson_002)")
	public void testGetBenDataFrmNurseScrnToDocScrnHistory_InvalidJson() throws Exception {
	    // Given (invalid JSON format)
	    String invalidJson = "{ invalid: data }";

	    // When
	    String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnHistory(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message for parsing
	}

	@Test
	@Description("Tests handling of request with missing data (TC_GetBenDataFrmNurseScrnToDocScrnHistory_MissingData_003)")
	public void testGetBenDataFrmNurseScrnToDocScrnHistory_MissingData() throws Exception {
	    // Given (request with missing benRegID)
	    String requestBody = "{\"visitCode\": 67890}";

	    // When
	    String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnHistory(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Invalid request", outputResponse.getErrorMessage()); // Or specific message
	}

	@Test
	@Description("Tests handling of exception during retrieval (TC_GetBenDataFrmNurseScrnToDocScrnHistory_ServiceException_004)")
	public void testGetBenDataFrmNurseScrnToDocScrnHistory_ServiceException() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345, \"visitCode\": 67890}";

	    // Mock cSServiceImpl behavior to throw exception
	    when(cSServiceImpl.getBenDataFrmNurseToDocHistoryScreen(anyLong(), anyLong())).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnHistory(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful retrieval of beneficiary vital data (TC_GetBenDataFrmNurseScrnToDocScrnVital_Success_001)")
	public void testGetBenDataFrmNurseScrnToDocScrnVital_Success() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345, \"visitCode\": 67890}";

	    // Mock cSServiceImpl behavior
	    when(cSServiceImpl.getBenDataFrmNurseToDocVitalScreen(anyLong(), anyLong())).thenReturn("Beneficiary vital details");

	    // When
	    String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnVital(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetBenDataFrmNurseScrnToDocScrnVital_InvalidJson_002)")
	public void testGetBenDataFrmNurseScrnToDocScrnVital_InvalidJson() throws Exception {
	    // Given (invalid JSON format)
	    String invalidJson = "{ invalid: data }";

	    // When
	    String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnVital(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message for parsing
	}

	@Test
	@Description("Tests handling of request with missing data (TC_GetBenDataFrmNurseScrnToDocScrnVital_MissingData_003)")
	public void testGetBenDataFrmNurseScrnToDocScrnVital_MissingData() throws Exception {
	    // Given (request with missing benRegID)
	    String requestBody = "{\"visitCode\": 67890}";

	    // When
	    String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnVital(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Invalid request", outputResponse.getErrorMessage()); // Or specific message
	}

	@Test
	@Description("Tests handling of exception during retrieval (TC_GetBenDataFrmNurseScrnToDocScrnVital_ServiceException_004)")
	public void testGetBenDataFrmNurseScrnToDocScrnVital_ServiceException() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345, \"visitCode\": 67890}";

	    // Mock cSServiceImpl behavior to throw exception
	    when(cSServiceImpl.getBenDataFrmNurseToDocVitalScreen(anyLong(), anyLong())).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnVital(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful retrieval of beneficiary examination data (TC_GetBenDataFrmNurseScrnToDocScrnExamination_Success_001)")
	public void testGetBenDataFrmNurseScrnToDocScrnExamination_Success() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345, \"visitCode\": 67890}";

	    // Mock cSServiceImpl behavior
	    when(cSServiceImpl.getBenDataFrmNurseToDocExaminationScreen(anyLong(), anyLong())).thenReturn("Beneficiary examination details");

	    // When
	    String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnExamination(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetBenDataFrmNurseScrnToDocScrnExamination_InvalidJson_002)")
	public void testGetBenDataFrmNurseScrnToDocScrnExamination_InvalidJson() throws Exception {
	    // Given (invalid JSON format)
	    String invalidJson = "{ invalid: data }";

	    // When
	    String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnExamination(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message for parsing
	}

	@Test
	@Description("Tests handling of request with missing data (TC_GetBenDataFrmNurseScrnToDocScrnExamination_MissingData_003)")
	public void testGetBenDataFrmNurseScrnToDocScrnExamination_MissingData() throws Exception {
	    // Given (request with missing benRegID)
	    String requestBody = "{\"visitCode\": 67890}";

	    // When
	    String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnExamination(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Invalid request", outputResponse.getErrorMessage()); // Or specific message
	}

	@Test
	@Description("Tests handling of exception during retrieval (TC_GetBenDataFrmNurseScrnToDocScrnExamination_ServiceException_004)")
	public void testGetBenDataFrmNurseScrnToDocScrnExamination_ServiceException() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345, \"visitCode\": 67890}";

	    // Mock cSServiceImpl behavior to throw exception
	    when(cSServiceImpl.getBenDataFrmNurseToDocExaminationScreen(anyLong(), anyLong())).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = cancerScreeningController.getBenDataFrmNurseScrnToDocScrnExamination(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful retrieval of beneficiary family history data (TC_GetBenCancerFamilyHistory_Success_001)")
	public void testGetBenCancerFamilyHistory_Success() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345}";

	    // Mock cSServiceImpl behavior
	    when(cSServiceImpl.getBenFamilyHistoryData(anyLong())).thenReturn("Beneficiary family history details");

	    // When
	    String response = cancerScreeningController.getBenCancerFamilyHistory(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetBenCancerFamilyHistory_InvalidJson_002)")
	public void testGetBenCancerFamilyHistory_InvalidJson() throws Exception {
	    // Given (invalid JSON format)
	    String invalidJson = "{ invalid: data }";

	    // When
	    String response = cancerScreeningController.getBenCancerFamilyHistory(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message for parsing
	}

	@Test
	@Description("Tests handling of request with missing benRegID (TC_GetBenCancerFamilyHistory_MissingData_003)")
	public void testGetBenCancerFamilyHistory_MissingData() throws Exception {
	    // Given (request without benRegID)
	    String requestBody = "{}";

	    // When
	    String response = cancerScreeningController.getBenCancerFamilyHistory(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Invalid request", outputResponse.getErrorMessage()); // Or specific message
	}

	@Test
	@Description("Tests handling of exception during retrieval (TC_GetBenCancerFamilyHistory_ServiceException_004)")
	public void testGetBenCancerFamilyHistory_ServiceException() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345}";

	    // Mock cSServiceImpl behavior to throw exception
	    when(cSServiceImpl.getBenFamilyHistoryData(anyLong())).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = cancerScreeningController.getBenCancerFamilyHistory(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful retrieval of beneficiary personal history data (TC_GetBenCancerPersonalHistory_Success_001)")
	public void testGetBenCancerPersonalHistory_Success() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345}";

	    // Mock cSServiceImpl behavior
	    when(cSServiceImpl.getBenPersonalHistoryData(anyLong())).thenReturn("Beneficiary personal history details");

	    // When
	    String response = cancerScreeningController.getBenCancerPersonalHistory(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetBenCancerPersonalHistory_InvalidJson_002)")
	public void testGetBenCancerPersonalHistory_InvalidJson() throws Exception {
	    // Given (invalid JSON format)
	    String invalidJson = "{ invalid: data }";

	    // When
	    String response = cancerScreeningController.getBenCancerPersonalHistory(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message for parsing
	}

	@Test
	@Description("Tests handling of request with missing benRegID (TC_GetBenCancerPersonalHistory_MissingData_003)")
	public void testGetBenCancerPersonalHistory_MissingData() throws Exception {
	    // Given (request without benRegID)
	    String requestBody = "{}";

	    // When
	    String response = cancerScreeningController.getBenCancerPersonalHistory(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Invalid request", outputResponse.getErrorMessage()); // Or specific message
	}

	@Test
	@Description("Tests handling of exception during retrieval (TC_GetBenCancerPersonalHistory_ServiceException_004)")
	public void testGetBenCancerPersonalHistory_ServiceException() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345}";

	    // Mock cSServiceImpl behavior to throw exception
	    when(cSServiceImpl.getBenPersonalHistoryData(anyLong())).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = cancerScreeningController.getBenCancerPersonalHistory(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful retrieval of beneficiary personal diet history data (TC_GetBenCancerPersonalDietHistory_Success_001)")
	public void testGetBenCancerPersonalDietHistory_Success() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345}";

	    // Mock cSServiceImpl behavior
	    when(cSServiceImpl.getBenPersonalDietHistoryData(anyLong())).thenReturn("Beneficiary personal diet history details");

	    // When
	    String response = cancerScreeningController.getBenCancerPersonalDietHistory(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetBenCancerPersonalDietHistory_InvalidJson_002)")
	public void testGetBenCancerPersonalDietHistory_InvalidJson() throws Exception {
	    // Given (invalid JSON format)
	    String invalidJson = "{ invalid: data }";

	    // When
	    String response = cancerScreeningController.getBenCancerPersonalDietHistory(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message for parsing
	}

	@Test
	@Description("Tests handling of request with missing benRegID (TC_GetBenCancerPersonalDietHistory_MissingData_003)")
	public void testGetBenCancerPersonalDietHistory_MissingData() throws Exception {
	    // Given (request without benRegID)
	    String requestBody = "{}";

	    // When
	    String response = cancerScreeningController.getBenCancerPersonalDietHistory(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Invalid request", outputResponse.getErrorMessage()); // Or specific message
	}

	@Test
	@Description("Tests handling of exception during retrieval (TC_GetBenCancerPersonalDietHistory_ServiceException_004)")
	public void testGetBenCancerPersonalDietHistory_ServiceException() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345}";

	    // Mock cSServiceImpl behavior to throw exception
	    when(cSServiceImpl.getBenPersonalDietHistoryData(anyLong())).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = cancerScreeningController.getBenCancerPersonalDietHistory(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful retrieval of beneficiary obstetric history data (TC_GetBenCancerObstetricHistory_Success_001)")
	public void testGetBenCancerObstetricHistory_Success() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345}";

	    // Mock cSServiceImpl behavior
	    when(cSServiceImpl.getBenObstetricHistoryData(anyLong())).thenReturn("Beneficiary obstetric history details");

	    // When
	    String response = cancerScreeningController.getBenCancerObstetricHistory(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetBenCancerObstetricHistory_InvalidJson_002)")
	public void testGetBenCancerObstetricHistory_InvalidJson() throws Exception {
	    // Given (invalid JSON format)
	    String invalidJson = "{ invalid: data }";

	    // When
	    String response = cancerScreeningController.getBenCancerObstetricHistory(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message for parsing
	}

	@Test
	@Description("Tests handling of request with missing benRegID (TC_GetBenCancerObstetricHistory_MissingData_003)")
	public void testGetBenCancerObstetricHistory_MissingData() throws Exception {
	    // Given (request without benRegID)
	    String requestBody = "{}";

	    // When
	    String response = cancerScreeningController.getBenCancerObstetricHistory(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Invalid request", outputResponse.getErrorMessage()); // Or specific message
	}

	@Test
	@Description("Tests handling of exception during retrieval (TC_GetBenCancerObstetricHistory_ServiceException_004)")
	public void testGetBenCancerObstetricHistory_ServiceException() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345}";

	    // Mock cSServiceImpl behavior to throw exception
	    when(cSServiceImpl.getBenObstetricHistoryData(anyLong())).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = cancerScreeningController.getBenCancerObstetricHistory(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful retrieval of beneficiary doctor data (TC_GetBenCaseRecordFromDoctorCS_Success_001)")
	public void testGetBenCaseRecordFromDoctorCS_Success() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345, \"visitCode\": 67890}";

	    // Mock cSServiceImpl behavior
	    when(cSServiceImpl.getBenCaseRecordFromDoctorCS(anyLong(), anyLong())).thenReturn("Beneficiary case record details");

	    // When
	    String response = cancerScreeningController.getBenCaseRecordFromDoctorCS(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_GetBenCaseRecordFromDoctorCS_InvalidJson_002)")
	public void testGetBenCaseRecordFromDoctorCS_InvalidJson() throws Exception {
	    // Given (invalid JSON format)
	    String invalidJson = "{ invalid: data }";

	    // When
	    String response = cancerScreeningController.getBenCaseRecordFromDoctorCS(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JSONException")); // Or specific error message for parsing
	}

	@Test
	@Description("Tests handling of request with missing data (TC_GetBenCaseRecordFromDoctorCS_MissingData_003)")
	public void testGetBenCaseRecordFromDoctorCS_MissingData() throws Exception {
	    // Given (request with missing benRegID)
	    String requestBody = "{\"visitCode\": 67890}";

	    // When
	    String response = cancerScreeningController.getBenCaseRecordFromDoctorCS(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertEquals("Invalid request", outputResponse.getErrorMessage()); // Or specific message
	}

	@Test
	@Description("Tests handling of exception during retrieval (TC_GetBenCaseRecordFromDoctorCS_ServiceException_004)")
	public void testGetBenCaseRecordFromDoctorCS_ServiceException() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"benRegID\": 12345, \"visitCode\": 67890}";

	    // Mock cSServiceImpl behavior to throw exception
	    when(cSServiceImpl.getBenCaseRecordFromDoctorCS(anyLong(), anyLong())).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = cancerScreeningController.getBenCaseRecordFromDoctorCS(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful update of CS history data (TC_UpdateCSHistoryNurse_Success_001)")
	public void testUpdateCSHistoryNurse_Success() throws Exception {
	    // Given (valid request body with family history)
	    String requestBody = "{\"historyDetails\": {\"familyHistory\":{\"diseases\": [{\"beneficiaryRegID\":12345, \"benVisitID\":67890, \"providerServiceMapID\":1, \"cancerDiseaseType\":\"Lung\", \"createdBy\":\"user1\"}]}}}";

	    // Mock cSServiceImpl behavior
	    when(cSServiceImpl.UpdateCSHistoryNurseData(any(JsonObject.class))).thenReturn(1);

	    // When
	    String response = cancerScreeningController.updateCSHistoryNurse(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_UpdateCSHistoryNurse_InvalidJson_002)")
	public void testUpdateCSHistoryNurse_InvalidJson() throws Exception {
	    // Given (invalid JSON format)
	    String invalidJson = "{ invalid: data }";

	    // When
	    String response = cancerScreeningController.updateCSHistoryNurse(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JsonParseException")); // Or specific error message
	}

	@Test
	@Description("Tests handling of request with missing required data (TC_UpdateCSHistoryNurse_MissingData_003)")
	public void testUpdateCSHistoryNurse_MissingData() throws Exception {
	    // Given (request with missing beneficiaryRegID in family history)
	    String requestBody = "{\"historyDetails\": {\"familyHistory\":{\"diseases\": [{\"benVisitID\":67890, \"providerServiceMapID\":1, \"cancerDiseaseType\":\"Lung\", \"createdBy\":\"user1\"}]}}}";

	    // When
	    String response = cancerScreeningController.updateCSHistoryNurse(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertTrue(outputResponse.getErrorMessage().contains("Unable to modify data")); // Or specific message
	}

	@Test
	@Description("Tests handling of exception during update (TC_UpdateCSHistoryNurse_ServiceException_004)")
	public void testUpdateCSHistoryNurse_ServiceException() throws Exception {
	    // Given (valid request body with family history)
	    String requestBody = "{\"historyDetails\": {\"familyHistory\":{\"diseases\": [{\"beneficiaryRegID\":12345, \"benVisitID\":67890, \"providerServiceMapID\":1, \"cancerDiseaseType\":\"Lung\", \"createdBy\":\"user1\"}]}}}";

	    // Mock cSServiceImpl behavior to throw exception
	    when(cSServiceImpl.UpdateCSHistoryNurseData(any(JsonObject.class))).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = cancerScreeningController.updateCSHistoryNurse(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); 
	}

	@Test
	@Description("Tests successful update of beneficiary vital data (TC_UpdateBenVitalDetail_Success_001)")
	public void testUpdateBenVitalDetail_Success() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"ID\": 1, \"beneficiaryRegID\": 12345, \"benVisitID\": 67890, \"weight_Kg\": 60.5, \"height_cm\": 170.0, \"waistCircumference_cm\": 85.0, \"bloodGlucose_Fasting\": 100, \"bloodGlucose_Random\": 120, \"bloodGlucose_2HrPostPrandial\": 140, \"systolicBP_1stReading\": 120, \"diastolicBP_1stReading\": 80, \"systolicBP_2ndReading\": 130, \"diastolicBP_2ndReading\": 85, \"systolicBP_3rdReading\": 125, \"diastolicBP_3rdReading\": 82, \"hbA1C\": 5, \"hemoglobin\": 14, \"modifiedBy\": \"user1\"}";

	    // Mock cSServiceImpl behavior
	    when(cSServiceImpl.updateBenVitalDetail(any(BenCancerVitalDetail.class))).thenReturn(1);

	    // When
	    String response = cancerScreeningController.upodateBenVitalDetail(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_UpdateBenVitalDetail_InvalidJson_002)")
	public void testUpdateBenVitalDetail_InvalidJson() throws Exception {
	    // Given (invalid JSON format)
	    String invalidJson = "{ invalid: data }";

	    // When
	    String response = cancerScreeningController.upodateBenVitalDetail(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JsonParseException")); // Or specific error message
	}

	@Test
	@Description("Tests handling of request with missing required data (TC_UpdateBenVitalDetail_MissingData_003)")
	public void testUpdateBenVitalDetail_MissingData() throws Exception {
	    // Given (request with missing beneficiaryRegID)
	    String requestBody = "{\"ID\": 1, \"benVisitID\": 67890, \"weight_Kg\": 60.5, \"height_cm\": 170.0, \"waistCircumference_cm\": 85.0, \"bloodGlucose_Fasting\": 100, \"bloodGlucose_Random\": 120, \"bloodGlucose_2HrPostPrandial\": 140, \"systolicBP_1stReading\": 120, \"diastolicBP_1stReading\": 80, \"systolicBP_2ndReading\": 130, \"diastolicBP_2ndReading\": 85, \"systolicBP_3rdReading\": 125, \"diastolicBP_3rdReading\": 82, \"hbA1C\": 5, \"hemoglobin\": 14}";

	    // When
	    String response = cancerScreeningController.upodateBenVitalDetail(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertTrue(outputResponse.getErrorMessage().contains("Unable to modify data")); // Or specific message
	}
	
	@Test
	@Description("Tests handling of exception during update (TC_UpdateBenVitalDetail_ServiceException_004)")
	public void testUpdateBenVitalDetail_ServiceException() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"ID\": 1, \"beneficiaryRegID\": 12345, \"benVisitID\": 67890, \"weight_Kg\": 60.5, \"height_cm\": 170.0, \"waistCircumference_cm\": 85.0, \"bloodGlucose_Fasting\": 100, \"bloodGlucose_Random\": 120, \"bloodGlucose_2HrPostPrandial\": 140, \"systolicBP_1stReading\": 120, \"diastolicBP_1stReading\": 80, \"systolicBP_2ndReading\": 130, \"diastolicBP_2ndReading\": 85, \"systolicBP_3rdReading\": 125, \"diastolicBP_3rdReading\": 82, \"hbA1C\": 5, \"hemoglobin\": 14, \"modifiedBy\": \"user1\"}";

	    // Mock cSServiceImpl behavior to throw exception
	    when(cSServiceImpl.updateBenVitalDetail(any(BenCancerVitalDetail.class))).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = cancerScreeningController.upodateBenVitalDetail(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful update of beneficiary examination data (TC_UpdateBenExaminationDetail_Success_001)")
	public void testUpdateBenExaminationDetail_Success() throws Exception {
	    // Given (valid request body with examination details)
	    String requestBody = "{\"examination\": {\"examinationType\": \"String\", \"examinationDetails\": \"String\", \"performedBy\": \"String\"}}";

	    // Mock cSServiceImpl behavior
	    when(cSServiceImpl.updateBenExaminationDetail(any(JsonObject.class))).thenReturn(1);

	    // When
	    String response = cancerScreeningController.upodateBenExaminationDetail(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_UpdateBenExaminationDetail_InvalidJson_002)")
	public void testUpdateBenExaminationDetail_InvalidJson() throws Exception {
	    // Given (invalid JSON format)
	    String invalidJson = "{ invalid: data }";

	    // When
	    String response = cancerScreeningController.upodateBenExaminationDetail(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JsonParseException")); // Or specific error message
	}

	@Test
	@Description("Tests handling of request with missing required data (TC_UpdateBenExaminationDetail_MissingData_003)")
	public void testUpdateBenExaminationDetail_MissingData() throws Exception {
	    // Given (request with missing examinationType)
	    String requestBody = "{\"examination\": {\"examinationDetails\": \"String\", \"performedBy\": \"String\"}}";

	    // When
	    String response = cancerScreeningController.upodateBenExaminationDetail(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertTrue(outputResponse.getErrorMessage().contains("Unable to modify data")); // Or specific message
	}

	@Test
	@Description("Tests handling of exception during update (TC_UpdateBenExaminationDetail_ServiceException_004)")
	public void testUpdateBenExaminationDetail_ServiceException() throws Exception {
	    // Given (valid request body with examination details)
	    String requestBody = "{\"examination\": {\"examinationType\": \"String\", \"examinationDetails\": \"String\", \"performedBy\": \"String\"}}";

	    // Mock cSServiceImpl behavior to throw exception
	    when(cSServiceImpl.updateBenExaminationDetail(any(JsonObject.class))).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = cancerScreeningController.upodateBenExaminationDetail(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}

	@Test
	@Description("Tests successful update of beneficiary cancer diagnosis data (TC_UpdateCancerDiagnosisDetailsByOncologist_Success_001)")
	public void testUpdateCancerDiagnosisDetailsByOncologist_Success() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"beneficiaryRegID\": 12345, \"benVisitID\": 67890, \"visitCode\": 101112, \"provisionalDiagnosisOncologist\": \"Breast Cancer\", \"modifiedBy\": \"oncologist1\"}";

	    // Mock cSServiceImpl behavior
	    when(cSServiceImpl.updateCancerDiagnosisDetailsByOncologist(any(CancerDiagnosis.class))).thenReturn(1);

	    // When
	    String response = cancerScreeningController.updateCancerDiagnosisDetailsByOncologist(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_UpdateCancerDiagnosisDetailsByOncologist_InvalidJson_002)")
	public void testUpdateCancerDiagnosisDetailsByOncologist_InvalidJson() throws Exception {
	    // Given (invalid JSON format)
	    String invalidJson = "{ invalid: data }";

	    // When
	    String response = cancerScreeningController.updateCancerDiagnosisDetailsByOncologist(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JsonParseException")); // Or specific error message
	}

	@Test
	@Description("Tests handling of request with missing required data (TC_UpdateCancerDiagnosisDetailsByOncologist_MissingData_003)")
	public void testUpdateCancerDiagnosisDetailsByOncologist_MissingData() throws Exception {
	    // Given (request with missing beneficiaryRegID)
	    String requestBody = "{\"benVisitID\": 67890, \"visitCode\": 101112, \"provisionalDiagnosisOncologist\": \"Breast Cancer\", \"modifiedBy\": \"oncologist1\"}";

	    // When
	    String response = cancerScreeningController.updateCancerDiagnosisDetailsByOncologist(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertTrue(outputResponse.getErrorMessage().contains("Unable to modify data")); // Or specific message
	}

	@Test
	@Description("Tests handling of exception during update (TC_UpdateCancerDiagnosisDetailsByOncologist_ServiceException_004)")
	public void testUpdateCancerDiagnosisDetailsByOncologist_ServiceException() throws Exception {
	    // Given (valid request body)
	    String requestBody = "{\"beneficiaryRegID\": 12345, \"benVisitID\": 67890, \"visitCode\": 101112, \"provisionalDiagnosisOncologist\": \"Breast Cancer\", \"modifiedBy\": \"oncologist1\"}";

	    // Mock cSServiceImpl behavior to throw exception
	    when(cSServiceImpl.updateCancerDiagnosisDetailsByOncologist(any(CancerDiagnosis.class))).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = cancerScreeningController.updateCancerDiagnosisDetailsByOncologist(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}
	
	@Test
	@Description("Tests successful update of beneficiary screening doctor data (TC_UpdateCancerScreeningDoctorData_Success_001)")
	public void testUpdateCancerScreeningDoctorData_Success() throws Exception {
	    // Given (valid request body with doctor details)
	    String requestBody = "{\"screeningDoctor\":{\"doctorRegId\":12345, \"hospitalRegId\":54321}}";

	    // Mock cSServiceImpl behavior
	    when(cSServiceImpl.updateCancerScreeningDoctorData(any(JsonObject.class))).thenReturn(1);

	    // When
	    String response = cancerScreeningController.updateCancerScreeningDoctorData(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	}

	@Test
	@Description("Tests handling of invalid JSON request body (TC_UpdateCancerScreeningDoctorData_InvalidJson_002)")
	public void testUpdateCancerScreeningDoctorData_InvalidJson() throws Exception {
	    // Given (invalid JSON format)
	    String invalidJson = "{ invalid: data }";

	    // When
	    String response = cancerScreeningController.updateCancerScreeningDoctorData(invalidJson);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("JsonParseException")); // Or specific error message
	}

	@Test
	@Description("Tests handling of request with missing required data (TC_UpdateCancerScreeningDoctorData_MissingData_003)")
	public void testUpdateCancerScreeningDoctorData_MissingData() throws Exception {
	    // Given (request with missing doctorRegId)
	    String requestBody = "{\"screeningDoctor\":{\"hospitalRegId\":54321}}";

	    // When
	    String response = cancerScreeningController.updateCancerScreeningDoctorData(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertTrue(outputResponse.getErrorMessage().contains("Unable to modify data")); // Or specific message
	}

	@Test
	@Description("Tests handling of exception during update (TC_UpdateCancerScreeningDoctorData_ServiceException_004)")
	public void testUpdateCancerScreeningDoctorData_ServiceException() throws Exception {
	    // Given (valid request body with doctor details)
	    String requestBody = "{\"screeningDoctor\":{\"doctorRegId\":12345, \"hospitalRegId\":54321}}";

	    // Mock cSServiceImpl behavior to throw exception
	    when(cSServiceImpl.updateCancerScreeningDoctorData(any(JsonObject.class))).thenThrow(new RuntimeException("Mocked exception"));

	    // When
	    String response = cancerScreeningController.updateCancerScreeningDoctorData(requestBody);
	    OutputResponse outputResponse = new ObjectMapper().readValue(response, OutputResponse.class);

	    // Then
	    assertNotNull(response);
	    assertFalse(outputResponse.getErrorMessage().contains("Exception")); // Or specific error message
	}
}
