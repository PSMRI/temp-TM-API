package com.iemr.tm.service.nurse;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iemr.tm.data.nurse.BeneficiaryVisitDetail;
import com.iemr.tm.repo.nurse.BenVisitDetailRepo;

@ExtendWith(MockitoExtension.class)
class NurseServiceImplTest {

	@Mock
	private BenVisitDetailRepo mockBenVisitDetailRepo;

	private NurseServiceImpl nurseServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		nurseServiceImplUnderTest = new NurseServiceImpl();
		nurseServiceImplUnderTest.setBenVisitDetailRepo(mockBenVisitDetailRepo);
	}

	@Test
	void testGetBeneficiaryVisitHistory() {
		// Setup
		// Configure BenVisitDetailRepo.getBeneficiaryVisitHistory(...).
		final BeneficiaryVisitDetail beneficiaryVisitDetail = new BeneficiaryVisitDetail();
		beneficiaryVisitDetail.setVisitCode(0L);
		beneficiaryVisitDetail.setBenVisitID(0L);
		beneficiaryVisitDetail.setBeneficiaryRegID(0L);
		beneficiaryVisitDetail.setProviderServiceMapID(0);
		beneficiaryVisitDetail.setVisitDateTime(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		beneficiaryVisitDetail.setVisitNo((short) 0);
		beneficiaryVisitDetail.setVisitReasonID((short) 0);
		beneficiaryVisitDetail.setVisitReason("visitReason");
		beneficiaryVisitDetail.setVisitCategoryID(0);
		beneficiaryVisitDetail.setVisitCategory("visitCategory");
		beneficiaryVisitDetail.setPregnancyStatus("pregnancyStatus");
		beneficiaryVisitDetail.setrCHID("rCHID");
		beneficiaryVisitDetail.setHealthFacilityType("healthFacilityType");
		beneficiaryVisitDetail.setHealthFacilityLocation("healthFacilityLocation");
		beneficiaryVisitDetail.setReportFilePath("reportFilePath");
		beneficiaryVisitDetail.setDeleted(false);
		beneficiaryVisitDetail.setProcessed("processed");
		beneficiaryVisitDetail.setCreatedBy("createdBy");
		beneficiaryVisitDetail.setCreatedDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		beneficiaryVisitDetail.setModifiedBy("modifiedBy");
		beneficiaryVisitDetail.setLastModDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));

		beneficiaryVisitDetail.toString();

		final List<BeneficiaryVisitDetail> beneficiaryVisitDetails = List.of(beneficiaryVisitDetail);
		when(mockBenVisitDetailRepo.getBeneficiaryVisitHistory(0L)).thenReturn(beneficiaryVisitDetails);

		// Run the test
		final String result = nurseServiceImplUnderTest.getBeneficiaryVisitHistory(0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBeneficiaryVisitHistory_BenVisitDetailRepoReturnsNoItems() {
		// Setup
		when(mockBenVisitDetailRepo.getBeneficiaryVisitHistory(0L)).thenReturn(Collections.emptyList());

		// Run the test
		final String result = nurseServiceImplUnderTest.getBeneficiaryVisitHistory(0L);

		// Verify the results
		assertNotNull(result);
	}
}
