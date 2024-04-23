package com.iemr.tm.service.registrar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.test.util.ReflectionTestUtils;

import com.google.gson.JsonObject;
import com.iemr.tm.data.registrar.BeneficiaryData;
import com.iemr.tm.data.registrar.BeneficiaryDemographicAdditional;
import com.iemr.tm.data.registrar.BeneficiaryDemographicData;
import com.iemr.tm.data.registrar.BeneficiaryImage;
import com.iemr.tm.data.registrar.BeneficiaryPhoneMapping;
import com.iemr.tm.data.registrar.V_BenAdvanceSearch;
import com.iemr.tm.repo.registrar.BeneficiaryDemographicAdditionalRepo;
import com.iemr.tm.repo.registrar.BeneficiaryImageRepo;
import com.iemr.tm.repo.registrar.RegistrarRepoBenData;
import com.iemr.tm.repo.registrar.RegistrarRepoBenDemoData;
import com.iemr.tm.repo.registrar.RegistrarRepoBenGovIdMapping;
import com.iemr.tm.repo.registrar.RegistrarRepoBenPhoneMapData;
import com.iemr.tm.repo.registrar.RegistrarRepoBeneficiaryDetails;
import com.iemr.tm.repo.registrar.ReistrarRepoBenSearch;
import com.iemr.tm.service.benFlowStatus.CommonBenStatusFlowServiceImpl;

@ExtendWith(MockitoExtension.class)
class RegistrarServiceImplTest {

	@Mock
	private RegistrarRepoBenData mockRegistrarRepoBenData;
	@Mock
	private RegistrarRepoBenDemoData mockRegistrarRepoBenDemoData;
	@Mock
	private RegistrarRepoBenPhoneMapData mockRegistrarRepoBenPhoneMapData;
	@Mock
	private RegistrarRepoBenGovIdMapping mockRegistrarRepoBenGovIdMapping;
	@Mock
	private ReistrarRepoBenSearch mockReistrarRepoBenSearch;
	@Mock
	private BeneficiaryDemographicAdditionalRepo mockBeneficiaryDemographicAdditionalRepo;
	@Mock
	private RegistrarRepoBeneficiaryDetails mockRegistrarRepoBeneficiaryDetails;
	@Mock
	private BeneficiaryImageRepo mockBeneficiaryImageRepo;
	@Mock
	private CommonBenStatusFlowServiceImpl mockCommonBenStatusFlowServiceImpl;

	private RegistrarServiceImpl registrarServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		registrarServiceImplUnderTest = new RegistrarServiceImpl();
		registrarServiceImplUnderTest.setRegistrarRepoBenData(mockRegistrarRepoBenData);
		registrarServiceImplUnderTest.setRegistrarRepoBenDemoData(mockRegistrarRepoBenDemoData);
		registrarServiceImplUnderTest.setRegistrarRepoBenPhoneMapData(mockRegistrarRepoBenPhoneMapData);
		registrarServiceImplUnderTest.setRegistrarRepoBenGovIdMapping(mockRegistrarRepoBenGovIdMapping);
		registrarServiceImplUnderTest.setReistrarRepoAdvanceBenSearch(mockReistrarRepoBenSearch);
		registrarServiceImplUnderTest.setBeneficiaryDemographicAdditionalRepo(mockBeneficiaryDemographicAdditionalRepo);
		registrarServiceImplUnderTest.setRegistrarRepoBeneficiaryDetails(mockRegistrarRepoBeneficiaryDetails);
		registrarServiceImplUnderTest.setBeneficiaryImageRepo(mockBeneficiaryImageRepo);
		registrarServiceImplUnderTest.setCommonBenStatusFlowServiceImpl(mockCommonBenStatusFlowServiceImpl);
		ReflectionTestUtils.setField(registrarServiceImplUnderTest, "registrationUrl", "registrationUrl");
		ReflectionTestUtils.setField(registrarServiceImplUnderTest, "registrarQuickSearchByIdUrl",
				"registrarQuickSearchByIdUrl");
		ReflectionTestUtils.setField(registrarServiceImplUnderTest, "registrarQuickSearchByPhoneNoUrl",
				"registrarQuickSearchByPhoneNoUrl");
		ReflectionTestUtils.setField(registrarServiceImplUnderTest, "beneficiaryEditUrl", "beneficiaryEditUrl");
		ReflectionTestUtils.setField(registrarServiceImplUnderTest, "registrarAdvanceSearchUrl",
				"registrarAdvanceSearchUrl");
	}

	@Test
	void testCreateBeneficiary() {
		// Setup
		final JsonObject benD = new JsonObject();

		// Configure RegistrarRepoBenData.save(...).
		final BeneficiaryData beneficiaryData = new BeneficiaryData();
		beneficiaryData.setBeneficiaryRegID(0L);
		beneficiaryData.setBeneficiaryID("beneficiaryID");
		beneficiaryData.setFirstName("firstName");
		beneficiaryData.setLastName("lastName");
		beneficiaryData.setBeneficiaryName("beneficiaryName");
		beneficiaryData.setGenderID((short) 0);
		beneficiaryData.setGenderName("genderName");
		beneficiaryData.setMaritalStatusID((short) 0);
		beneficiaryData.setDob(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		beneficiaryData.setFatherName("fatherName");
		beneficiaryData.setSpouseName("spouseName");
		beneficiaryData.setAadharNo("aadharNo");
		beneficiaryData.setCreatedBy("createdBy");
		beneficiaryData.setCreatedDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		beneficiaryData.setModifiedBy("modifiedBy");
		beneficiaryData.setServicePointName("servicePointName");

		beneficiaryData.toString();

		when(mockRegistrarRepoBenData.save(any(BeneficiaryData.class))).thenReturn(beneficiaryData);

		// Run the test
		final BeneficiaryData result = registrarServiceImplUnderTest.createBeneficiary(benD);

		// Verify the results
	}

	@Test
	void testCreateBeneficiary_RegistrarRepoBenDataThrowsOptimisticLockingFailureException() {
		// Setup
		final JsonObject benD = new JsonObject();
		when(mockRegistrarRepoBenData.save(any(BeneficiaryData.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> registrarServiceImplUnderTest.createBeneficiary(benD))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testCreateBeneficiaryDemographic() {
		// Setup
		final JsonObject benD = new JsonObject();

		// Configure RegistrarRepoBenDemoData.save(...).
		final BeneficiaryDemographicData beneficiaryDemographicData = new BeneficiaryDemographicData();
		beneficiaryDemographicData.setBenDemographicsID(0L);
		beneficiaryDemographicData.setBeneficiaryRegID(0L);
		beneficiaryDemographicData.setEducationID((short) 0);
		beneficiaryDemographicData.setOccupationID((short) 0);
		beneficiaryDemographicData.setIncomeStatusID((short) 0);
		beneficiaryDemographicData.setCommunityID((short) 0);
		beneficiaryDemographicData.setReligionID((short) 0);
		beneficiaryDemographicData.setCountryID(0);
		beneficiaryDemographicData.setStateID(0);
		beneficiaryDemographicData.setDistrictID(0);
		beneficiaryDemographicData.setBlockID(0);
		beneficiaryDemographicData.setDistrictBranchID(0);
		beneficiaryDemographicData.setCreatedBy("createdBy");
		beneficiaryDemographicData.setModifiedBy("modifiedBy");
		beneficiaryDemographicData.setAreaID(0);
		beneficiaryDemographicData.setServicePointID(0);

		beneficiaryDemographicData.toString();

		when(mockRegistrarRepoBenDemoData.save(any(BeneficiaryDemographicData.class)))
				.thenReturn(beneficiaryDemographicData);

		// Run the test
		final Long result = registrarServiceImplUnderTest.createBeneficiaryDemographic(benD, 0L);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testCreateBeneficiaryDemographic_RegistrarRepoBenDemoDataReturnsNull() {
		// Setup
		final JsonObject benD = new JsonObject();
		when(mockRegistrarRepoBenDemoData.save(any(BeneficiaryDemographicData.class))).thenReturn(null);

		// Run the test
		final Long result = registrarServiceImplUnderTest.createBeneficiaryDemographic(benD, 0L);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testCreateBeneficiaryDemographic_RegistrarRepoBenDemoDataThrowsOptimisticLockingFailureException() {
		// Setup
		final JsonObject benD = new JsonObject();
		when(mockRegistrarRepoBenDemoData.save(any(BeneficiaryDemographicData.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> registrarServiceImplUnderTest.createBeneficiaryDemographic(benD, 0L))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testCreateBeneficiaryDemographicAdditional() {
		// Setup
		final JsonObject benD = new JsonObject();

		// Configure BeneficiaryDemographicAdditionalRepo.save(...).
		final BeneficiaryDemographicAdditional beneficiaryDemographicAdditional = new BeneficiaryDemographicAdditional();
		beneficiaryDemographicAdditional.setBenDemoAdditionalID(0L);
		beneficiaryDemographicAdditional.setBeneficiaryRegID(0L);
		beneficiaryDemographicAdditional.setLiteracyStatus("literacyStatus");
		beneficiaryDemographicAdditional.setMarrigeDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		beneficiaryDemographicAdditional.setMotherName("motherName");
		beneficiaryDemographicAdditional.setEmailID("emailID");
		beneficiaryDemographicAdditional.setBankName("bankName");
		beneficiaryDemographicAdditional.setBranchName("branchName");
		beneficiaryDemographicAdditional.setiFSCCode("iFSCCode");
		beneficiaryDemographicAdditional.setAccountNo("accountNo");
		beneficiaryDemographicAdditional.setCreatedBy("createdBy");
		beneficiaryDemographicAdditional.setModifiedBy("modifiedBy");

		beneficiaryDemographicAdditional.toString();

		when(mockBeneficiaryDemographicAdditionalRepo.save(any(BeneficiaryDemographicAdditional.class)))
				.thenReturn(beneficiaryDemographicAdditional);

		// Run the test
		final Long result = registrarServiceImplUnderTest.createBeneficiaryDemographicAdditional(benD, 0L);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testCreateBeneficiaryDemographicAdditional_BeneficiaryDemographicAdditionalRepoReturnsNull() {
		// Setup
		final JsonObject benD = new JsonObject();
		when(mockBeneficiaryDemographicAdditionalRepo.save(any(BeneficiaryDemographicAdditional.class)))
				.thenReturn(null);

		// Run the test
		final Long result = registrarServiceImplUnderTest.createBeneficiaryDemographicAdditional(benD, 0L);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testCreateBeneficiaryDemographicAdditional_BeneficiaryDemographicAdditionalRepoThrowsOptimisticLockingFailureException() {
		// Setup
		final JsonObject benD = new JsonObject();
		when(mockBeneficiaryDemographicAdditionalRepo.save(any(BeneficiaryDemographicAdditional.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> registrarServiceImplUnderTest.createBeneficiaryDemographicAdditional(benD, 0L))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testCreateBeneficiaryPhoneMapping() {
		// Setup
		final JsonObject benD = new JsonObject();

		// Configure RegistrarRepoBenPhoneMapData.save(...).
		final BeneficiaryPhoneMapping beneficiaryPhoneMapping = new BeneficiaryPhoneMapping();
		beneficiaryPhoneMapping.setBenPhMapID(0L);
		beneficiaryPhoneMapping.setBenificiaryRegID(0L);
		beneficiaryPhoneMapping.setPhoneNo("phoneNo");
		beneficiaryPhoneMapping.setCreatedBy("createdBy");
		beneficiaryPhoneMapping.setModifiedBy("modifiedBy");

		beneficiaryPhoneMapping.toString();

		when(mockRegistrarRepoBenPhoneMapData.save(any(BeneficiaryPhoneMapping.class)))
				.thenReturn(beneficiaryPhoneMapping);

		// Run the test
		final Long result = registrarServiceImplUnderTest.createBeneficiaryPhoneMapping(benD, 0L);

		// Verify the results
		assertThat(result).isEqualTo(0L);
	}

	@Test
	void testCreateBeneficiaryPhoneMapping_RegistrarRepoBenPhoneMapDataReturnsNull() {
		// Setup
		final JsonObject benD = new JsonObject();
		when(mockRegistrarRepoBenPhoneMapData.save(any(BeneficiaryPhoneMapping.class))).thenReturn(null);

		// Run the test
		final Long result = registrarServiceImplUnderTest.createBeneficiaryPhoneMapping(benD, 0L);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testCreateBeneficiaryPhoneMapping_RegistrarRepoBenPhoneMapDataThrowsOptimisticLockingFailureException() {
		// Setup
		final JsonObject benD = new JsonObject();
		when(mockRegistrarRepoBenPhoneMapData.save(any(BeneficiaryPhoneMapping.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> registrarServiceImplUnderTest.createBeneficiaryPhoneMapping(benD, 0L))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testGetRegWorkList() {

		// Run the test
		final String result = registrarServiceImplUnderTest.getRegWorkList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetRegWorkList_RegistrarRepoBenDataReturnsNoItems() {
		// Setup
		when(mockRegistrarRepoBenData.getRegistrarWorkList(0)).thenReturn(Collections.emptyList());

		// Run the test
		final String result = registrarServiceImplUnderTest.getRegWorkList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetQuickSearchBenData() {

		// Run the test
		final String result = registrarServiceImplUnderTest.getQuickSearchBenData("benID");

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetQuickSearchBenData_ReistrarRepoBenSearchReturnsNoItems() {
		// Setup
		when(mockReistrarRepoBenSearch.getQuickSearch("benID")).thenReturn(Collections.emptyList());

		// Run the test
		final String result = registrarServiceImplUnderTest.getQuickSearchBenData("benID");

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetAdvanceSearchBenData() {
		// Setup
		final V_BenAdvanceSearch v_BenAdvanceSearch = new V_BenAdvanceSearch();
		v_BenAdvanceSearch.setBeneficiaryID("beneficiaryID");
		v_BenAdvanceSearch.setFirstName("firstName");
		v_BenAdvanceSearch.setLastName("lastName");
		v_BenAdvanceSearch.setFatherName("fatherName");
		v_BenAdvanceSearch.setAadharNo("aadharNo");
		v_BenAdvanceSearch.setDistrictID(0);
		v_BenAdvanceSearch.setPhoneNo("phoneNo");
		v_BenAdvanceSearch.setGovtIdentityNo("govtIdentityNo");
		v_BenAdvanceSearch.setStateID(0);

		// Run the test
		final String result = registrarServiceImplUnderTest.getAdvanceSearchBenData(v_BenAdvanceSearch);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetAdvanceSearchBenData_ReistrarRepoBenSearchReturnsNoItems() {
		// Setup
		final V_BenAdvanceSearch v_BenAdvanceSearch = new V_BenAdvanceSearch();
		v_BenAdvanceSearch.setBeneficiaryID("beneficiaryID");
		v_BenAdvanceSearch.setFirstName("firstName");
		v_BenAdvanceSearch.setLastName("lastName");
		v_BenAdvanceSearch.setFatherName("fatherName");
		v_BenAdvanceSearch.setAadharNo("aadharNo");
		v_BenAdvanceSearch.setDistrictID(0);
		v_BenAdvanceSearch.setPhoneNo("phoneNo");
		v_BenAdvanceSearch.setGovtIdentityNo("govtIdentityNo");
		v_BenAdvanceSearch.setStateID(0);

		v_BenAdvanceSearch.toString();

		when(mockReistrarRepoBenSearch.getAdvanceBenSearchList("beneficiaryID", "firstName", "lastName", "phoneNo",
				"aadharNo", "govtIdentityNo", "%%", "%%")).thenReturn(new ArrayList<>());

		// Run the test
		final String result = registrarServiceImplUnderTest.getAdvanceSearchBenData(v_BenAdvanceSearch);

		// Verify the results
		assertThat(result).isEqualTo("");
	}

	@Test
	void testGetBenOBJ() {
		// Setup
		final JsonObject benD = new JsonObject();

		// Run the test
		final BeneficiaryData result = registrarServiceImplUnderTest.getBenOBJ(benD);

		// Verify the results
	}

	@Test
	void testGetBenDemoOBJ() {
		// Setup
		final JsonObject benD = new JsonObject();

		// Run the test
		final BeneficiaryDemographicData result = registrarServiceImplUnderTest.getBenDemoOBJ(benD, 0L);

		// Verify the results
	}

	@Test
	void testGetBenPhoneOBJ() {
		// Setup
		final JsonObject benD = new JsonObject();

		// Run the test
		final BeneficiaryPhoneMapping result = registrarServiceImplUnderTest.getBenPhoneOBJ(benD, 0L);

		// Verify the results
	}

	@Test
	void testGetBeneficiaryDetails() {
		// Setup

		// Run the test
		final String result = registrarServiceImplUnderTest.getBeneficiaryDetails(0L);

		// Verify the results
		assertNull(result);
	}

	@Test
	void testGetBeneficiaryDetails_RegistrarRepoBeneficiaryDetailsReturnsNull() {
		// Setup
		when(mockRegistrarRepoBeneficiaryDetails.getBeneficiaryDetails(0L)).thenReturn(null);

		// Run the test
		final String result = registrarServiceImplUnderTest.getBeneficiaryDetails(0L);

		// Verify the results
		assertThat(result).isNull();
	}

	@Test
	void testGetBeneficiaryDetails_RegistrarRepoBeneficiaryDetailsReturnsNoItems() {
		// Setup
		when(mockRegistrarRepoBeneficiaryDetails.getBeneficiaryDetails(0L)).thenReturn(Collections.emptyList());

		// Run the test
		final String result = registrarServiceImplUnderTest.getBeneficiaryDetails(0L);

		// Verify the results
		assertThat(result).isEqualTo(null);
	}

	@Test
	void testGetBenImage() {
		// Setup
		when(mockBeneficiaryImageRepo.getBenImage(0L)).thenReturn("result");

		// Run the test
		final String result = registrarServiceImplUnderTest.getBenImage(0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetBenImage_BeneficiaryImageRepoReturnsNull() {
		// Setup
		when(mockBeneficiaryImageRepo.getBenImage(0L)).thenReturn(null);

		// Run the test
		final String result = registrarServiceImplUnderTest.getBenImage(0L);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testUpdateBeneficiaryDemographicAdditional_BeneficiaryDemographicAdditionalRepoGetBeneficiaryDemographicAdditionalReturnsNull() {
		// Setup
		final JsonObject benD = new JsonObject();
		when(mockBeneficiaryDemographicAdditionalRepo.getBeneficiaryDemographicAdditional(0L)).thenReturn(null);

		// Configure BeneficiaryDemographicAdditionalRepo.save(...).
		final BeneficiaryDemographicAdditional beneficiaryDemographicAdditional = new BeneficiaryDemographicAdditional();
		beneficiaryDemographicAdditional.setBenDemoAdditionalID(0L);
		beneficiaryDemographicAdditional.setBeneficiaryRegID(0L);
		beneficiaryDemographicAdditional.setLiteracyStatus("literacyStatus");
		beneficiaryDemographicAdditional.setMarrigeDate(Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)));
		beneficiaryDemographicAdditional.setMotherName("motherName");
		beneficiaryDemographicAdditional.setEmailID("emailID");
		beneficiaryDemographicAdditional.setBankName("bankName");
		beneficiaryDemographicAdditional.setBranchName("branchName");
		beneficiaryDemographicAdditional.setiFSCCode("iFSCCode");
		beneficiaryDemographicAdditional.setAccountNo("accountNo");
		beneficiaryDemographicAdditional.setCreatedBy("createdBy");
		beneficiaryDemographicAdditional.setModifiedBy("modifiedBy");

		beneficiaryDemographicAdditional.toString();

		when(mockBeneficiaryDemographicAdditionalRepo.save(any(BeneficiaryDemographicAdditional.class)))
				.thenReturn(beneficiaryDemographicAdditional);

		// Run the test
		final int result = registrarServiceImplUnderTest.updateBeneficiaryDemographicAdditional(benD, 0L);

		// Verify the results
		assertThat(result).isEqualTo(0);
	}

	@Test
	void testUpdateBeneficiaryDemographicAdditional_BeneficiaryDemographicAdditionalRepoSaveThrowsOptimisticLockingFailureException() {
		// Setup
		final JsonObject benD = new JsonObject();
		when(mockBeneficiaryDemographicAdditionalRepo.getBeneficiaryDemographicAdditional(0L)).thenReturn(null);
		when(mockBeneficiaryDemographicAdditionalRepo.save(any(BeneficiaryDemographicAdditional.class)))
				.thenThrow(OptimisticLockingFailureException.class);

		// Run the test
		assertThatThrownBy(() -> registrarServiceImplUnderTest.updateBeneficiaryDemographicAdditional(benD, 0L))
				.isInstanceOf(OptimisticLockingFailureException.class);
	}

	@Test
	void testUpdateBeneficiaryImage() {
		// Setup
		final JsonObject benD = new JsonObject();

		final int result = registrarServiceImplUnderTest.updateBeneficiaryImage(benD, 0L);

		// Verify the results
		assertThat(result).isEqualTo(1);
	}

	@Test
	void testUpdateBeneficiaryImage_BeneficiaryImageRepoFindBenImageReturnsNull() {
		// Setup
		final JsonObject benD = new JsonObject();

		// Configure BeneficiaryImageRepo.save(...).
		final BeneficiaryImage beneficiaryImage = new BeneficiaryImage();
		beneficiaryImage.setBenImageID(0L);
		beneficiaryImage.setBeneficiaryRegID(0L);
		beneficiaryImage.setBenImage("benImage");
		beneficiaryImage.setCreatedBy("createdBy");
		beneficiaryImage.setModifiedBy("modifiedBy");

		beneficiaryImage.toString();

		// Run the test
		final int result = registrarServiceImplUnderTest.updateBeneficiaryImage(benD, 0L);

		// Verify the results
		assertThat(result).isEqualTo(1);
	}

	@Test
	void testGetBeneficiaryPersonalDetails() {
		// Setup

		// Run the test
		final BeneficiaryData result = registrarServiceImplUnderTest.getBeneficiaryPersonalDetails(0L);

		// Verify the results
	}

	@Test
	void testGetBeneficiaryPersonalDetails_RegistrarRepoBenDemoDataReturnsNull() {
		// Setup
		when(mockRegistrarRepoBenDemoData.getBeneficiaryDemographicData(0L)).thenReturn(null);

		// Run the test
		final BeneficiaryData result = registrarServiceImplUnderTest.getBeneficiaryPersonalDetails(0L);

		// Verify the results
	}

	@Test
	void testGetBeneficiaryPersonalDetails_RegistrarRepoBenDemoDataReturnsNoItems() {
		// Setup
		when(mockRegistrarRepoBenDemoData.getBeneficiaryDemographicData(0L)).thenReturn(Collections.emptyList());

		// Run the test
		final BeneficiaryData result = registrarServiceImplUnderTest.getBeneficiaryPersonalDetails(0L);

		// Verify the results
	}

	@Test
	void testGetBeneficiaryPersonalDetails_RegistrarRepoBenDataReturnsNoItems() {
		// Setup

		when(mockRegistrarRepoBenData.getBenDetailsByRegID(0L)).thenReturn(Collections.emptyList());

		// Run the test
		final BeneficiaryData result = registrarServiceImplUnderTest.getBeneficiaryPersonalDetails(0L);

		// Verify the results
	}

}
