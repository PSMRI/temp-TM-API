package com.iemr.tm.service.pnc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.OptimisticLockingFailureException;

import com.iemr.tm.data.pnc.PNCCare;
import com.iemr.tm.repo.nurse.pnc.PNCCareRepo;

@ExtendWith(MockitoExtension.class)
class PNCNurseServiceImplTest {

	@Mock
	private PNCCareRepo mockPncCareRepo;

	private PNCNurseServiceImpl pncNurseServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		pncNurseServiceImplUnderTest = new PNCNurseServiceImpl();
		pncNurseServiceImplUnderTest.setPncCareRepo(mockPncCareRepo);
	}

	@Test
	void testSaveBenPncCareDetails() throws Exception {
		// Setup
		final PNCCare pncCareOBJ = new PNCCare(0L, 0L, 0L, 0, (short) 0, (short) 0, "deliveryType", (short) 0,
				"deliveryPlace", "otherDeliveryPlace", Date.valueOf(LocalDate.of(2020, 1, 1)), (short) 0,
				"deliveryComplication", "otherDeliveryComplication", (short) 0, "pregOutcome", (short) 0,
				"postNatalComplication", "otherPostNatalComplication", (short) 0, "gestationName", 0.0, 0,
				"newBornHealthStatus", 0L);
		
		pncCareOBJ.toString();

		// Configure PNCCareRepo.save(...).
		final PNCCare pncCare = new PNCCare(0L, 0L, 0L, 0, (short) 0, (short) 0, "deliveryType", (short) 0,
				"deliveryPlace", "otherDeliveryPlace", Date.valueOf(LocalDate.of(2020, 1, 1)), (short) 0,
				"deliveryComplication", "otherDeliveryComplication", (short) 0, "pregOutcome", (short) 0,
				"postNatalComplication", "otherPostNatalComplication", (short) 0, "gestationName", 0.0, 0,
				"newBornHealthStatus", 0L);
		when(mockPncCareRepo.save(any(PNCCare.class))).thenReturn(pncCare);

		// Run the test
		final Long result = pncNurseServiceImplUnderTest.saveBenPncCareDetails(pncCareOBJ);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testSaveBenPncCareDetails_PNCCareRepoReturnsNull() throws Exception {
		// Setup
		final PNCCare pncCareOBJ = new PNCCare(0L, 0L, 0L, 0, (short) 0, (short) 0, "deliveryType", (short) 0,
				"deliveryPlace", "otherDeliveryPlace", Date.valueOf(LocalDate.of(2020, 1, 1)), (short) 0,
				"deliveryComplication", "otherDeliveryComplication", (short) 0, "pregOutcome", (short) 0,
				"postNatalComplication", "otherPostNatalComplication", (short) 0, "gestationName", 0.0, 0,
				"newBornHealthStatus", 0L);
		when(mockPncCareRepo.save(any(PNCCare.class))).thenReturn(null);

		// Run the test
		final Long result = pncNurseServiceImplUnderTest.saveBenPncCareDetails(pncCareOBJ);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testSaveBenPncCareDetails_PNCCareRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final PNCCare pncCareOBJ = new PNCCare(0L, 0L, 0L, 0, (short) 0, (short) 0, "deliveryType", (short) 0,
				"deliveryPlace", "otherDeliveryPlace", Date.valueOf(LocalDate.of(2020, 1, 1)), (short) 0,
				"deliveryComplication", "otherDeliveryComplication", (short) 0, "pregOutcome", (short) 0,
				"postNatalComplication", "otherPostNatalComplication", (short) 0, "gestationName", 0.0, 0,
				"newBornHealthStatus", 0L);
		when(mockPncCareRepo.save(any(PNCCare.class))).thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> pncNurseServiceImplUnderTest.saveBenPncCareDetails(pncCareOBJ))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testGetPNCCareDetails() {

		// Run the test
		final String result = pncNurseServiceImplUnderTest.getPNCCareDetails(0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo("null");
	}

	@Test
	void testGetPNCCareDetails_PNCCareRepoReturnsNoItems() {
		// Setup
		when(mockPncCareRepo.getPNCCareDetails(0L, 0L)).thenReturn(new ArrayList<>());

		// Run the test
		final String result = pncNurseServiceImplUnderTest.getPNCCareDetails(0L, 0L);

		// Verify the results
		assertThat(result).isEqualTo("null");
	}

	@Test
	void testUpdateBenPNCCareDetails_PNCCareRepoGetBenPNCCareDetailsStatusReturnsNull() throws Exception {
		// Setup
		final PNCCare pncCareDetailsOBJ = new PNCCare(0L, 0L, 0L, 0, (short) 0, (short) 0, "deliveryType", (short) 0,
				"deliveryPlace", "otherDeliveryPlace", Date.valueOf(LocalDate.of(2020, 1, 1)), (short) 0,
				"deliveryComplication", "otherDeliveryComplication", (short) 0, "pregOutcome", (short) 0,
				"postNatalComplication", "otherPostNatalComplication", (short) 0, "gestationName", 0.0, 0,
				"newBornHealthStatus", 0L);

		// Configure PNCCareRepo.save(...).
		final PNCCare pncCare = new PNCCare(0L, 0L, 0L, 0, (short) 0, (short) 0, "deliveryType", (short) 0,
				"deliveryPlace", "otherDeliveryPlace", Date.valueOf(LocalDate.of(2020, 1, 1)), (short) 0,
				"deliveryComplication", "otherDeliveryComplication", (short) 0, "pregOutcome", (short) 0,
				"postNatalComplication", "otherPostNatalComplication", (short) 0, "gestationName", 0.0, 0,
				"newBornHealthStatus", 0L);
		when(mockPncCareRepo.save(any(PNCCare.class))).thenReturn(pncCare);

		// Run the test
		final int result = pncNurseServiceImplUnderTest.updateBenPNCCareDetails(pncCareDetailsOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBenPNCCareDetails_PNCCareRepoSaveReturnsNull() throws Exception {
		// Setup
		final PNCCare pncCareDetailsOBJ = new PNCCare(0L, 0L, 0L, 0, (short) 0, (short) 0, "deliveryType", (short) 0,
				"deliveryPlace", "otherDeliveryPlace", Date.valueOf(LocalDate.of(2020, 1, 1)), (short) 0,
				"deliveryComplication", "otherDeliveryComplication", (short) 0, "pregOutcome", (short) 0,
				"postNatalComplication", "otherPostNatalComplication", (short) 0, "gestationName", 0.0, 0,
				"newBornHealthStatus", 0L);
		
		pncCareDetailsOBJ.toString();
		
		when(mockPncCareRepo.getBenPNCCareDetailsStatus(0L, 0L)).thenReturn("result");

		// Run the test
		final int result = pncNurseServiceImplUnderTest.updateBenPNCCareDetails(pncCareDetailsOBJ);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

}
