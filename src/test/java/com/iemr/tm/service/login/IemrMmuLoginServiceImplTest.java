package com.iemr.tm.service.login;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iemr.tm.repo.login.MasterVanRepo;
import com.iemr.tm.repo.login.ServicePointVillageMappingRepo;
import com.iemr.tm.repo.login.UserParkingplaceMappingRepo;
import com.iemr.tm.repo.login.UserVanSpDetails_View_Repo;
import com.iemr.tm.repo.login.VanServicepointMappingRepo;

@ExtendWith(MockitoExtension.class)
class IemrMmuLoginServiceImplTest {

	@Mock
	private UserParkingplaceMappingRepo mockUserParkingplaceMappingRepo;
	@Mock
	private MasterVanRepo mockMasterVanRepo;
	@Mock
	private VanServicepointMappingRepo mockVanServicepointMappingRepo;
	@Mock
	private ServicePointVillageMappingRepo mockServicePointVillageMappingRepo;
	@Mock
	private UserVanSpDetails_View_Repo mockUserVanSpDetails_View_Repo;

	private IemrMmuLoginServiceImpl iemrMmuLoginServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		iemrMmuLoginServiceImplUnderTest = new IemrMmuLoginServiceImpl();
		iemrMmuLoginServiceImplUnderTest.setUserParkingplaceMappingRepo(mockUserParkingplaceMappingRepo);
		iemrMmuLoginServiceImplUnderTest.setMasterVanRepo(mockMasterVanRepo);
		iemrMmuLoginServiceImplUnderTest.setVanServicepointMappingRepo(mockVanServicepointMappingRepo);
		iemrMmuLoginServiceImplUnderTest.setServicePointVillageMappingRepo(mockServicePointVillageMappingRepo);
		iemrMmuLoginServiceImplUnderTest.setUserVanSpDetails_View_Repo(mockUserVanSpDetails_View_Repo);
	}

	@Test
	void testGetUserServicePointVanDetails() {
		// Setup

		// Run the test
		final String result = iemrMmuLoginServiceImplUnderTest.getUserServicePointVanDetails(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetUserServicePointVanDetails_UserParkingplaceMappingRepoReturnsNoItems() {
		// Setup
		when(mockUserParkingplaceMappingRepo.getUserParkingPlce(0)).thenReturn(Collections.emptyList());

		// Run the test
		final String result = iemrMmuLoginServiceImplUnderTest.getUserServicePointVanDetails(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetUserServicePointVanDetails_MasterVanRepoReturnsNoItems() {
		// Setup

		// Run the test
		final String result = iemrMmuLoginServiceImplUnderTest.getUserServicePointVanDetails(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetUserServicePointVanDetails_VanServicepointMappingRepoReturnsNoItems() {
		// Setup

		// Run the test
		final String result = iemrMmuLoginServiceImplUnderTest.getUserServicePointVanDetails(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetServicepointVillages() {
		// Setup

		// Run the test
		final String result = iemrMmuLoginServiceImplUnderTest.getServicepointVillages(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetServicepointVillages_ServicePointVillageMappingRepoReturnsNoItems() {
		// Setup
		when(mockServicePointVillageMappingRepo.getServicePointVillages(0)).thenReturn(Collections.emptyList());

		// Run the test
		final String result = iemrMmuLoginServiceImplUnderTest.getServicepointVillages(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetUserVanSpDetails() {
		// Setup
		// Configure UserVanSpDetails_View_Repo.getUserVanSpDetails_View(...).

		// Run the test
		final String result = iemrMmuLoginServiceImplUnderTest.getUserVanSpDetails(0, 0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetUserVanSpDetails_UserVanSpDetails_View_RepoReturnsNoItems() {
		// Setup
		when(mockUserVanSpDetails_View_Repo.getUserVanSpDetails_View(0, 0)).thenReturn(new ArrayList<>());

		// Run the test
		final String result = iemrMmuLoginServiceImplUnderTest.getUserVanSpDetails(0, 0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetUserVanSpDetails_UserParkingplaceMappingRepoReturnsNoItems() {

		when(mockUserParkingplaceMappingRepo.getUserParkingPlce(0)).thenReturn(Collections.emptyList());

		// Run the test
		final String result = iemrMmuLoginServiceImplUnderTest.getUserVanSpDetails(0, 0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetUserSpokeDetails() {

		// Run the test
		final String result = iemrMmuLoginServiceImplUnderTest.getUserSpokeDetails(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetUserSpokeDetails_MasterVanRepoReturnsNull() {
		// Setup
		when(mockMasterVanRepo.getVanMaster(0)).thenReturn(null);

		// Run the test
		final String result = iemrMmuLoginServiceImplUnderTest.getUserSpokeDetails(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetUserSpokeDetails_MasterVanRepoReturnsNoItems() {
		// Setup
		when(mockMasterVanRepo.getVanMaster(0)).thenReturn(new ArrayList<>());

		// Run the test
		final String result = iemrMmuLoginServiceImplUnderTest.getUserSpokeDetails(0);

		// Verify the results
		assertNotNull(result);
	}
}
