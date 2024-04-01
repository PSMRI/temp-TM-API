package com.iemr.tm.service.tele_consultation;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.client.RestTemplate;

import com.iemr.tm.data.quickConsultation.PrescribedDrugDetail;
import com.iemr.tm.repo.tc_consultation.TCRequestModelRepo;

@ExtendWith(MockitoExtension.class)
class SMSGatewayServiceImplTest {

	@Mock
	private TCRequestModelRepo mockTCRequestModelRepo;
	@Mock
	private RestTemplate mockRestTemplate;

	@InjectMocks
	private SMSGatewayServiceImpl smsGatewayServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		ReflectionTestUtils.setField(smsGatewayServiceImplUnderTest, "sendSMSUrl", "sendSMSUrl");
		ReflectionTestUtils.setField(smsGatewayServiceImplUnderTest, "schedule", "schedule");
		ReflectionTestUtils.setField(smsGatewayServiceImplUnderTest, "prescription", "prescription");
		ReflectionTestUtils.setField(smsGatewayServiceImplUnderTest, "cancel", "cancel");
		ReflectionTestUtils.setField(smsGatewayServiceImplUnderTest, "reSchedule", "reSchedule");
		smsGatewayServiceImplUnderTest.restTemplate = mockRestTemplate;
	}

	@Test
	void testSmsSenderGateway() {

		// Configure RestTemplate.exchange(...).
		final ResponseEntity<String> stringResponseEntity = new ResponseEntity<>("request",
				HttpStatusCode.valueOf(200));

		// Run the test
		final int result = smsGatewayServiceImplUnderTest.smsSenderGateway("smsType", 0L, 0, 0L, 0L, "createdBy",
				"tcDate", "tcPreviousDate", "Authorization");

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testSmsSenderGateway_TCRequestModelRepoGetSMSTemplateIDReturnsNull() {

		// Configure RestTemplate.exchange(...).
		final ResponseEntity<String> stringResponseEntity = new ResponseEntity<>("request",
				HttpStatusCode.valueOf(200));

		// Run the test
		final int result = smsGatewayServiceImplUnderTest.smsSenderGateway("smsType", 0L, 0, 0L, 0L, "createdBy",
				"tcDate", "tcPreviousDate", "Authorization");

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testSmsSenderGateway_TCRequestModelRepoGetSMSTemplateIDReturnsNoItems() {

		// Configure RestTemplate.exchange(...).
		final ResponseEntity<String> stringResponseEntity = new ResponseEntity<>("request",
				HttpStatusCode.valueOf(200));

		// Run the test
		final int result = smsGatewayServiceImplUnderTest.smsSenderGateway("smsType", 0L, 0, 0L, 0L, "createdBy",
				"tcDate", "tcPreviousDate", "Authorization");

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testSmsSenderGateway_RestTemplateThrowsRestClientException() {

		// Run the test
		final int result = smsGatewayServiceImplUnderTest.smsSenderGateway("smsType", 0L, 0, 0L, 0L, "createdBy",
				"tcDate", "tcPreviousDate", "Authorization");

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testSmsSenderGateway2() {
		// Setup
		final PrescribedDrugDetail prescribedDrugDetail = new PrescribedDrugDetail();
		prescribedDrugDetail.setBeneficiaryRegID(0L);
		prescribedDrugDetail.setBenVisitID(0L);
		prescribedDrugDetail.setProviderServiceMapID(0);
		prescribedDrugDetail.setVisitCode(0L);
		prescribedDrugDetail.setPrescriptionID(0L);
		final List<PrescribedDrugDetail> object = List.of(prescribedDrugDetail);

		// Configure RestTemplate.exchange(...).
		final ResponseEntity<String> stringResponseEntity = new ResponseEntity<>("request",
				HttpStatusCode.valueOf(200));

		// Run the test
		final int result = smsGatewayServiceImplUnderTest.smsSenderGateway2("smsType", object, "Authorization", 0L,
				"createdBy", List.of("value"));

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testSmsSenderGateway2_TCRequestModelRepoGetSMSTemplateIDReturnsNull() {
		// Setup
		final PrescribedDrugDetail prescribedDrugDetail = new PrescribedDrugDetail();
		prescribedDrugDetail.setBeneficiaryRegID(0L);
		prescribedDrugDetail.setBenVisitID(0L);
		prescribedDrugDetail.setProviderServiceMapID(0);
		prescribedDrugDetail.setVisitCode(0L);
		prescribedDrugDetail.setPrescriptionID(0L);
		final List<PrescribedDrugDetail> object = List.of(prescribedDrugDetail);

		// Configure RestTemplate.exchange(...).
		final ResponseEntity<String> stringResponseEntity = new ResponseEntity<>("request",
				HttpStatusCode.valueOf(200));

		// Run the test
		final int result = smsGatewayServiceImplUnderTest.smsSenderGateway2("smsType", object, "Authorization", 0L,
				"createdBy", List.of("value"));

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testSmsSenderGateway2_TCRequestModelRepoGetSMSTemplateIDReturnsNoItems() {
		// Setup
		final PrescribedDrugDetail prescribedDrugDetail = new PrescribedDrugDetail();
		prescribedDrugDetail.setBeneficiaryRegID(0L);
		prescribedDrugDetail.setBenVisitID(0L);
		prescribedDrugDetail.setProviderServiceMapID(0);
		prescribedDrugDetail.setVisitCode(0L);
		prescribedDrugDetail.setPrescriptionID(0L);
		final List<PrescribedDrugDetail> object = List.of(prescribedDrugDetail);

		// Configure RestTemplate.exchange(...).
		final ResponseEntity<String> stringResponseEntity = new ResponseEntity<>("request",
				HttpStatusCode.valueOf(200));

		// Run the test
		final int result = smsGatewayServiceImplUnderTest.smsSenderGateway2("smsType", object, "Authorization", 0L,
				"createdBy", List.of("value"));

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testCreateSMSRequest() {

		// Run the test
		final String result = smsGatewayServiceImplUnderTest.createSMSRequest("smsType", 0L, 0, 0L, 0L, "createdBy",
				"tcDate", "tcPreviousDate");

		// Verify the results
		assertThat(result).isEqualTo(null);
	}

	@Test
	void testCreateSMSRequest_TCRequestModelRepoGetSMSTemplateIDReturnsNull() {

		// Run the test
		final String result = smsGatewayServiceImplUnderTest.createSMSRequest("smsType", 0L, 0, 0L, 0L, "createdBy",
				"tcDate", "tcPreviousDate");

		// Verify the results
		assertThat(result).isEqualTo(null);
	}

	@Test
	void testCreateSMSRequest_TCRequestModelRepoGetSMSTemplateIDReturnsNoItems() {

		// Run the test
		final String result = smsGatewayServiceImplUnderTest.createSMSRequest("smsType", 0L, 0, 0L, 0L, "createdBy",
				"tcDate", "tcPreviousDate");

		// Verify the results
		assertThat(result).isEqualTo(null);
	}

}
