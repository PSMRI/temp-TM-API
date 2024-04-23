package com.iemr.tm.service.tele_consultation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.test.util.ReflectionTestUtils;

import com.google.gson.JsonObject;
import com.iemr.tm.data.benFlowStatus.BeneficiaryFlowStatus;
import com.iemr.tm.data.nurse.CommonUtilityClass;
import com.iemr.tm.data.tele_consultation.TCRequestModel;
import com.iemr.tm.data.tele_consultation.TeleconsultationStats;
import com.iemr.tm.repo.benFlowStatus.BeneficiaryFlowStatusRepo;
import com.iemr.tm.repo.tc_consultation.TCRequestModelRepo;
import com.iemr.tm.repo.tc_consultation.TeleconsultationStatsRepo;
import com.iemr.tm.service.common.transaction.CommonServiceImpl;

@ExtendWith(MockitoExtension.class)
class TeleConsultationServiceImplTest {

	@Mock
	private TCRequestModelRepo mockTCRequestModelRepo;
	@Mock
	private BeneficiaryFlowStatusRepo mockBeneficiaryFlowStatusRepo;
	@Mock
	private CommonServiceImpl mockCommonServiceImpl;
	@Mock
	private SMSGatewayServiceImpl mockSMSGatewayServiceImpl;
	@Mock
	private TeleconsultationStatsRepo mockTeleconsultationStatsRepo;

	@InjectMocks
	private TeleConsultationServiceImpl teleConsultationServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		ReflectionTestUtils.setField(teleConsultationServiceImplUnderTest, "tcSpecialistSlotCancel",
				"tcSpecialistSlotCancel");
	}

	@Test
	void testCreateTCRequest() {
		// Setup
		final TCRequestModel tCRequestModel = new TCRequestModel();
		tCRequestModel.settMRequestID(0L);
		tCRequestModel.setUserID(0);
		tCRequestModel.setRequestDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		tCRequestModel.setDuration_minute(0L);
		tCRequestModel.setSpecializationID(0);

		tCRequestModel.toString();

		// Configure TCRequestModelRepo.save(...).
		final TCRequestModel tcRequestModel = new TCRequestModel();
		tcRequestModel.settMRequestID(0L);
		tcRequestModel.setUserID(0);
		tcRequestModel.setRequestDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		tcRequestModel.setDuration_minute(0L);
		tcRequestModel.setSpecializationID(0);
		when(mockTCRequestModelRepo.save(any(TCRequestModel.class))).thenReturn(tcRequestModel);

		// Run the test
		final Long result = teleConsultationServiceImplUnderTest.createTCRequest(tCRequestModel);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testCreateTCRequest_TCRequestModelRepoReturnsNull() {
		// Setup
		final TCRequestModel tCRequestModel = new TCRequestModel();
		tCRequestModel.settMRequestID(0L);
		tCRequestModel.setUserID(0);
		tCRequestModel.setRequestDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		tCRequestModel.setDuration_minute(0L);
		tCRequestModel.setSpecializationID(0);

		when(mockTCRequestModelRepo.save(any(TCRequestModel.class))).thenReturn(null);

		// Run the test
		final Long result = teleConsultationServiceImplUnderTest.createTCRequest(tCRequestModel);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testCreateTCRequest_TCRequestModelRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final TCRequestModel tCRequestModel = new TCRequestModel();
		tCRequestModel.settMRequestID(0L);
		tCRequestModel.setUserID(0);
		tCRequestModel.setRequestDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		tCRequestModel.setDuration_minute(0L);
		tCRequestModel.setSpecializationID(0);

		when(mockTCRequestModelRepo.save(any(TCRequestModel.class))).thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> teleConsultationServiceImplUnderTest.createTCRequest(tCRequestModel))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testCheckBeneficiaryStatusForSpecialistTransaction_BeneficiaryFlowStatusRepoReturnsNull() {
		// Setup

		// Run the test
		assertThatThrownBy(
				() -> teleConsultationServiceImplUnderTest.checkBeneficiaryStatusForSpecialistTransaction("requestOBJ"))
				.isInstanceOf(RuntimeException.class);
	}

	@Test
	void testCheckBeneficiaryStatusForSpecialistTransaction_TCRequestModelRepoReturnsNull() {
		// Setup
		// Configure BeneficiaryFlowStatusRepo.checkBeneficiaryArrivalStatus(...).
		final BeneficiaryFlowStatus beneficiaryFlowStatus = new BeneficiaryFlowStatus();
		beneficiaryFlowStatus.setConsultantID(0);
		beneficiaryFlowStatus.setConsultantName("consultantName");
		beneficiaryFlowStatus.setBenVisitDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		beneficiaryFlowStatus.setConsultationDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		beneficiaryFlowStatus.setBenArrivedFlag(false);

		beneficiaryFlowStatus.toString();

		final ArrayList<BeneficiaryFlowStatus> beneficiaryFlowStatuses = new ArrayList<>(
				List.of(beneficiaryFlowStatus));

		// Run the test
		assertThatThrownBy(
				() -> teleConsultationServiceImplUnderTest.checkBeneficiaryStatusForSpecialistTransaction("requestOBJ"))
				.isInstanceOf(RuntimeException.class);
	}

	@Test
	void testCreateTCRequestFromWorkList_CommonServiceImplReturnsNull() throws Exception {
		// Setup
		final JsonObject tcRequestOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenReturn(null);

		// Run the test
		assertThatThrownBy(
				() -> teleConsultationServiceImplUnderTest.createTCRequestFromWorkList(tcRequestOBJ, "Authorization"))
				.isInstanceOf(RuntimeException.class);
	}

	@Test
	void testCreateTCRequestFromWorkList_CommonServiceImplThrowsException() throws Exception {
		// Setup
		final JsonObject tcRequestOBJ = new JsonObject();
		when(mockCommonServiceImpl.createTcRequest(eq(new JsonObject()), any(CommonUtilityClass.class),
				eq("Authorization"))).thenThrow(Exception.class);

		// Run the test
		assertThatThrownBy(
				() -> teleConsultationServiceImplUnderTest.createTCRequestFromWorkList(tcRequestOBJ, "Authorization"))
				.isInstanceOf(Exception.class);
	}

	@Test
	void testStartconsultation() {
		// Setup
		when(mockTCRequestModelRepo.updateStartConsultationTime(0L, 0L)).thenReturn(0);

		// Run the test
		final Integer result = teleConsultationServiceImplUnderTest.startconsultation(0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo(0);
		verify(mockTeleconsultationStatsRepo).save(any(TeleconsultationStats.class));
	}

	@Test
	void testStartconsultation_TeleconsultationStatsRepoThrowsOptimisticLockingFailureException() {
		// Setup
		when(mockTeleconsultationStatsRepo.save(any(TeleconsultationStats.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> teleConsultationServiceImplUnderTest.startconsultation(0L, 0L))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}
}
