package com.iemr.tm.service.report;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.math.BigInteger;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iemr.tm.data.login.UserParkingplaceMapping;
import com.iemr.tm.data.report.ChiefComplaintReport;
import com.iemr.tm.data.report.ConsultationReport;
import com.iemr.tm.data.report.ReportInput;
import com.iemr.tm.data.report.SpokeReport;
import com.iemr.tm.data.report.TMDailyReport;
import com.iemr.tm.repo.login.UserParkingplaceMappingRepo;
import com.iemr.tm.repo.report.BenChiefComplaintReportRepo;
import com.iemr.tm.utils.exception.TMException;

@ExtendWith(MockitoExtension.class)
class CRMReportServiceImplTest {

	@Mock
	private BenChiefComplaintReportRepo mockBenChiefComplaintReportRepo;
	@Mock
	private UserParkingplaceMappingRepo mockUserParkingplaceMappingRepo;

	@InjectMocks
	private CRMReportServiceImpl crmReportServiceImplUnderTest;

	@Test
	void testGetParkingplaceID() throws Exception {
		// Setup
		// Configure
		// UserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(...).
		final UserParkingplaceMapping userParkingplaceMapping = new UserParkingplaceMapping();
		userParkingplaceMapping.setUserParkingPlaceMapID(0);
		userParkingplaceMapping.setUserID(0);
		userParkingplaceMapping.setParkingPlaceID(0);
		userParkingplaceMapping.setStateID(0);
		userParkingplaceMapping.setDistrictID(0);
		
		userParkingplaceMapping.toString();
		
		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(userParkingplaceMapping);

		// Run the test
		final Integer result = crmReportServiceImplUnderTest.getParkingplaceID(0, 0);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testGetParkingplaceID_UserParkingplaceMappingRepoReturnsNull() {
		// Setup
		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(null);

		// Run the test
		assertThatThrownBy(() -> crmReportServiceImplUnderTest.getParkingplaceID(0, 0)).isInstanceOf(TMException.class);
	}

	@Test
	void testCalculateTime() {
		assertThat(CRMReportServiceImpl.calculateTime(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)),
				Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)))).isEqualTo("");
	}

	@Test
	void testGetChiefcomplaintreport() throws Exception {
		// Setup
		final ReportInput input = new ReportInput();
		input.setVanID(0);
		input.setFromDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setToDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setUserID(0);
		input.setProviderServiceMapID(0);
		
		input.toString();

		final SpokeReport spokeReport = new SpokeReport();
		spokeReport.setVanID(0);
		spokeReport.setVanName("vanName");
		
		spokeReport.toString();
		
		final ChiefComplaintReport chiefComplaintReport = new ChiefComplaintReport();
		chiefComplaintReport.setChiefComplaintID(0);
		chiefComplaintReport.setChiefComplaint("chiefComplaint");
		chiefComplaintReport.setMale(new BigInteger("100"));
		chiefComplaintReport.setFemale(new BigInteger("100"));
		chiefComplaintReport.setTransgender(new BigInteger("100"));
		chiefComplaintReport.setGrandTotal(new BigInteger("100"));
		
		chiefComplaintReport.toString();
		
		spokeReport.setChiefComplaintReport(List.of(chiefComplaintReport));
		
		spokeReport.toString();
		
		final Set<SpokeReport> expectedResult = Set.of(spokeReport);

		// Configure
		// UserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(...).
		final UserParkingplaceMapping userParkingplaceMapping = new UserParkingplaceMapping();
		userParkingplaceMapping.setUserParkingPlaceMapID(0);
		userParkingplaceMapping.setUserID(0);
		userParkingplaceMapping.setParkingPlaceID(0);
		userParkingplaceMapping.setStateID(0);
		userParkingplaceMapping.setDistrictID(0);
		
		userParkingplaceMapping.toString();
		
		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(userParkingplaceMapping);

		// Run the test
		final Set<SpokeReport> result = crmReportServiceImplUnderTest.getChiefcomplaintreport(input);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetChiefcomplaintreport_UserParkingplaceMappingRepoReturnsNull() {
		// Setup
		final ReportInput input = new ReportInput();
		input.setVanID(0);
		input.setFromDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setToDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setUserID(0);
		input.setProviderServiceMapID(0);
		
		input.toString();

		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(null);

		// Run the test
		assertThatThrownBy(() -> crmReportServiceImplUnderTest.getChiefcomplaintreport(input))
				.isInstanceOf(TMException.class);
	}

	@Test
	void testGetChiefcomplaintreport_BenChiefComplaintReportRepoReturnsNoItems() throws Exception {
		// Setup
		final ReportInput input = new ReportInput();
		input.setVanID(0);
		input.setFromDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setToDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setUserID(0);
		input.setProviderServiceMapID(0);

		// Configure
		// UserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(...).
		final UserParkingplaceMapping userParkingplaceMapping = new UserParkingplaceMapping();
		userParkingplaceMapping.setUserParkingPlaceMapID(0);
		userParkingplaceMapping.setUserID(0);
		userParkingplaceMapping.setParkingPlaceID(0);
		userParkingplaceMapping.setStateID(0);
		userParkingplaceMapping.setDistrictID(0);
		
		userParkingplaceMapping.toString();
		
		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(userParkingplaceMapping);

		when(mockBenChiefComplaintReportRepo.getcmreport(Date.valueOf(LocalDate.of(2020, 1, 1)),
				Date.valueOf(LocalDate.of(2020, 1, 1)), 0)).thenReturn(Collections.emptyList());

		// Run the test
		final Set<SpokeReport> result = crmReportServiceImplUnderTest.getChiefcomplaintreport(input);

		// Verify the results
		assertThat(result).isEqualTo(Collections.emptySet());
	}

	@Test
	void testGetConsultationReport() throws Exception {
		// Setup
		final ReportInput input = new ReportInput();
		input.setVanID(0);
		input.setFromDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setToDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setUserID(0);
		input.setProviderServiceMapID(0);

		// Configure
		// UserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(...).
		final UserParkingplaceMapping userParkingplaceMapping = new UserParkingplaceMapping();
		userParkingplaceMapping.setUserParkingPlaceMapID(0);
		userParkingplaceMapping.setUserID(0);
		userParkingplaceMapping.setParkingPlaceID(0);
		userParkingplaceMapping.setStateID(0);
		userParkingplaceMapping.setDistrictID(0);
		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(userParkingplaceMapping);

		// Run the test
		final List<ConsultationReport> result = crmReportServiceImplUnderTest.getConsultationReport(input);

		// Verify the results
	}

	@Test
	void testGetConsultationReport_UserParkingplaceMappingRepoReturnsNull() {
		// Setup
		final ReportInput input = new ReportInput();
		input.setVanID(0);
		input.setFromDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setToDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setUserID(0);
		input.setProviderServiceMapID(0);

		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(null);

		// Run the test
		assertThatThrownBy(() -> crmReportServiceImplUnderTest.getConsultationReport(input))
				.isInstanceOf(TMException.class);
	}

	@Test
	void testGetConsultationReport_BenChiefComplaintReportRepoReturnsNoItems() throws Exception {
		// Setup
		final ReportInput input = new ReportInput();
		input.setVanID(0);
		input.setFromDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setToDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setUserID(0);
		input.setProviderServiceMapID(0);

		// Configure
		// UserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(...).
		final UserParkingplaceMapping userParkingplaceMapping = new UserParkingplaceMapping();
		userParkingplaceMapping.setUserParkingPlaceMapID(0);
		userParkingplaceMapping.setUserID(0);
		userParkingplaceMapping.setParkingPlaceID(0);
		userParkingplaceMapping.setStateID(0);
		userParkingplaceMapping.setDistrictID(0);
		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(userParkingplaceMapping);

		when(mockBenChiefComplaintReportRepo.getConsultationReport(Date.valueOf(LocalDate.of(2020, 1, 1)),
				Date.valueOf(LocalDate.of(2020, 1, 1)), 0)).thenReturn(Collections.emptyList());

		// Run the test
		final List<ConsultationReport> result = crmReportServiceImplUnderTest.getConsultationReport(input);

		// Verify the results
		assertThat(result).isEqualTo(Collections.emptyList());
	}

	@Test
	void testGetTotalConsultationReport() throws Exception {
		// Setup
		final ReportInput input = new ReportInput();
		input.setVanID(0);
		input.setFromDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setToDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setUserID(0);
		input.setProviderServiceMapID(0);

		// Configure
		// UserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(...).
		final UserParkingplaceMapping userParkingplaceMapping = new UserParkingplaceMapping();
		userParkingplaceMapping.setUserParkingPlaceMapID(0);
		userParkingplaceMapping.setUserID(0);
		userParkingplaceMapping.setParkingPlaceID(0);
		userParkingplaceMapping.setStateID(0);
		userParkingplaceMapping.setDistrictID(0);
		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(userParkingplaceMapping);

		// Run the test
		final String result = crmReportServiceImplUnderTest.getTotalConsultationReport(input);

		// Verify the results
		assertThat(result).isEqualTo("[]");
	}

	@Test
	void testGetTotalConsultationReport_UserParkingplaceMappingRepoReturnsNull() {
		// Setup
		final ReportInput input = new ReportInput();
		input.setVanID(0);
		input.setFromDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setToDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setUserID(0);
		input.setProviderServiceMapID(0);

		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(null);

		// Run the test
		assertThatThrownBy(() -> crmReportServiceImplUnderTest.getTotalConsultationReport(input))
				.isInstanceOf(TMException.class);
	}

	@Test
	void testGetTotalConsultationReport_BenChiefComplaintReportRepoReturnsNoItems() throws Exception {
		// Setup
		final ReportInput input = new ReportInput();
		input.setVanID(0);
		input.setFromDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setToDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setUserID(0);
		input.setProviderServiceMapID(0);

		// Configure
		// UserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(...).
		final UserParkingplaceMapping userParkingplaceMapping = new UserParkingplaceMapping();
		userParkingplaceMapping.setUserParkingPlaceMapID(0);
		userParkingplaceMapping.setUserID(0);
		userParkingplaceMapping.setParkingPlaceID(0);
		userParkingplaceMapping.setStateID(0);
		userParkingplaceMapping.setDistrictID(0);
		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(userParkingplaceMapping);

		when(mockBenChiefComplaintReportRepo.getTotalConsultationReport(Date.valueOf(LocalDate.of(2020, 1, 1)),
				Date.valueOf(LocalDate.of(2020, 1, 1)), 0)).thenReturn(Collections.emptyList());

		// Run the test
		final String result = crmReportServiceImplUnderTest.getTotalConsultationReport(input);

		// Verify the results
		assertThat(result).isEqualTo("[]");
	}

	@Test
	void testGetMonthlyReport() throws Exception {
		// Setup
		final ReportInput input = new ReportInput();
		input.setVanID(0);
		input.setFromDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setToDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setUserID(0);
		input.setProviderServiceMapID(0);

		// Configure
		// UserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(...).
		final UserParkingplaceMapping userParkingplaceMapping = new UserParkingplaceMapping();
		userParkingplaceMapping.setUserParkingPlaceMapID(0);
		userParkingplaceMapping.setUserID(0);
		userParkingplaceMapping.setParkingPlaceID(0);
		userParkingplaceMapping.setStateID(0);
		userParkingplaceMapping.setDistrictID(0);
		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(userParkingplaceMapping);

		// Run the test
		final String result = crmReportServiceImplUnderTest.getMonthlyReport(input);

		// Verify the results
		assertThat(result).isEqualTo("[]");
	}

	@Test
	void testGetMonthlyReport_UserParkingplaceMappingRepoReturnsNull() {
		// Setup
		final ReportInput input = new ReportInput();
		input.setVanID(0);
		input.setFromDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setToDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setUserID(0);
		input.setProviderServiceMapID(0);

		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(null);

		// Run the test
		assertThatThrownBy(() -> crmReportServiceImplUnderTest.getMonthlyReport(input)).isInstanceOf(TMException.class);
	}

	@Test
	void testGetDailyReport() throws Exception {
		// Setup
		final ReportInput input = new ReportInput();
		input.setVanID(0);
		input.setFromDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setToDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setUserID(0);
		input.setProviderServiceMapID(0);

		// Configure
		// UserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(...).
		final UserParkingplaceMapping userParkingplaceMapping = new UserParkingplaceMapping();
		userParkingplaceMapping.setUserParkingPlaceMapID(0);
		userParkingplaceMapping.setUserID(0);
		userParkingplaceMapping.setParkingPlaceID(0);
		userParkingplaceMapping.setStateID(0);
		userParkingplaceMapping.setDistrictID(0);
		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(userParkingplaceMapping);

		// Run the test
		final List<TMDailyReport> result = crmReportServiceImplUnderTest.getDailyReport(input);

		// Verify the results
	}

	@Test
	void testGetDailyReport_UserParkingplaceMappingRepoReturnsNull() {
		// Setup
		final ReportInput input = new ReportInput();
		input.setVanID(0);
		input.setFromDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setToDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setUserID(0);
		input.setProviderServiceMapID(0);

		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(null);

		// Run the test
		assertThatThrownBy(() -> crmReportServiceImplUnderTest.getDailyReport(input)).isInstanceOf(TMException.class);
	}

	@Test
	void testGetDailyReport_BenChiefComplaintReportRepoReturnsNoItems() throws Exception {
		// Setup
		final ReportInput input = new ReportInput();
		input.setVanID(0);
		input.setFromDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setToDate(Date.valueOf(LocalDate.of(2020, 1, 1)));
		input.setUserID(0);
		input.setProviderServiceMapID(0);

		// Configure
		// UserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(...).
		final UserParkingplaceMapping userParkingplaceMapping = new UserParkingplaceMapping();
		userParkingplaceMapping.setUserParkingPlaceMapID(0);
		userParkingplaceMapping.setUserID(0);
		userParkingplaceMapping.setParkingPlaceID(0);
		userParkingplaceMapping.setStateID(0);
		userParkingplaceMapping.setDistrictID(0);
		
		userParkingplaceMapping.toString();
		
		when(mockUserParkingplaceMappingRepo.findOneByUserIDAndProviderServiceMapIdAndDeleted(0, 0, 0))
				.thenReturn(userParkingplaceMapping);

		when(mockBenChiefComplaintReportRepo.getDailyReport(Date.valueOf(LocalDate.of(2020, 1, 1)), 0))
				.thenReturn(Collections.emptyList());

		// Run the test
		final List<TMDailyReport> result = crmReportServiceImplUnderTest.getDailyReport(input);

		// Verify the results
		assertThat(result).isEqualTo(Collections.emptyList());
	}
}
