package com.iemr.tm.service.location;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.iemr.tm.repo.location.CountryCityMasterRepo;
import com.iemr.tm.repo.location.CountryMasterRepo;
import com.iemr.tm.repo.location.DistrictBlockMasterRepo;
import com.iemr.tm.repo.location.DistrictBranchMasterRepo;
import com.iemr.tm.repo.location.DistrictMasterRepo;
import com.iemr.tm.repo.location.ParkingPlaceMasterRepo;
import com.iemr.tm.repo.location.ServicePointMasterRepo;
import com.iemr.tm.repo.location.StateMasterRepo;
import com.iemr.tm.repo.location.V_GetLocDetailsFromSPidAndPSMidRepo;
import com.iemr.tm.repo.location.V_getVanLocDetailsRepo;
import com.iemr.tm.repo.location.V_get_prkngplc_dist_zone_state_from_spidRepo;
import com.iemr.tm.repo.location.ZoneMasterRepo;
import com.iemr.tm.repo.login.ServicePointVillageMappingRepo;

@ExtendWith(MockitoExtension.class)
class LocationServiceImplTest {

	@Mock
	private CountryMasterRepo mockCountryMasterRepo;
	@Mock
	private CountryCityMasterRepo mockCountryCityMasterRepo;
	@Mock
	private StateMasterRepo mockStateMasterRepo;
	@Mock
	private ZoneMasterRepo mockZoneMasterRepo;
	@Mock
	private DistrictMasterRepo mockDistrictMasterRepo;
	@Mock
	private DistrictBlockMasterRepo mockDistrictBlockMasterRepo;
	@Mock
	private ParkingPlaceMasterRepo mockParkingPlaceMasterRepo;
	@Mock
	private ServicePointMasterRepo mockServicePointMasterRepo;
	@Mock
	private V_GetLocDetailsFromSPidAndPSMidRepo mockV_GetLocDetailsFromSPidAndPSMidRepo;
	@Mock
	private ServicePointVillageMappingRepo mockServicePointVillageMappingRepo;
	@Mock
	private DistrictBranchMasterRepo mockDistrictBranchMasterRepo;
	@Mock
	private V_get_prkngplc_dist_zone_state_from_spidRepo mockV_get_prkngplc_dist_zone_state_from_spidRepo;
	@Mock
	private V_getVanLocDetailsRepo mockV_getVanLocDetailsRepo;

	@InjectMocks
	private LocationServiceImpl locationServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		locationServiceImplUnderTest.setStateMasterRepo(mockStateMasterRepo);
		locationServiceImplUnderTest.setZoneMasterRepo(mockZoneMasterRepo);
		locationServiceImplUnderTest.setDistrictMasterRepo(mockDistrictMasterRepo);
		locationServiceImplUnderTest.setDistrictBlockMasterRepo(mockDistrictBlockMasterRepo);
		locationServiceImplUnderTest.setParkingPlaceMasterRepo(mockParkingPlaceMasterRepo);
		locationServiceImplUnderTest.setServicePointMasterRepo(mockServicePointMasterRepo);
		locationServiceImplUnderTest.setV_GetLocDetailsFromSPidAndPSMidRepo(mockV_GetLocDetailsFromSPidAndPSMidRepo);
		locationServiceImplUnderTest.setServicePointVillageMappingRepo(mockServicePointVillageMappingRepo);
		locationServiceImplUnderTest.setDistrictBranchMasterRepo(mockDistrictBranchMasterRepo);
		locationServiceImplUnderTest
				.setV_get_prkngplc_dist_zone_state_from_spidRepo(mockV_get_prkngplc_dist_zone_state_from_spidRepo);
	}

	@Test
	void testGetCountryList_CountryMasterRepoReturnsNoItems() {
		// Setup
		when(mockCountryMasterRepo.findAllCountries()).thenReturn(new ArrayList<>());

		// Run the test
		final String result = locationServiceImplUnderTest.getCountryList();

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetCountryCityList_CountryCityMasterRepoReturnsNoItems() {
		// Setup
		when(mockCountryCityMasterRepo.findByCountryIDAndDeleted(0, false)).thenReturn(new ArrayList<>());

		// Run the test
		final String result = locationServiceImplUnderTest.getCountryCityList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetStateList() {

		// Run the test
		final String result = locationServiceImplUnderTest.getStateList();

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetStateList_StateMasterRepoReturnsNull() {
		// Setup
		when(mockStateMasterRepo.getStateMaster()).thenReturn(null);

		// Run the test
		final String result = locationServiceImplUnderTest.getStateList();

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetStateList_StateMasterRepoReturnsNoItems() {
		// Setup
		when(mockStateMasterRepo.getStateMaster()).thenReturn(new ArrayList<>());

		// Run the test
		final String result = locationServiceImplUnderTest.getStateList();

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetZoneList() {

		// Run the test
		final String result = locationServiceImplUnderTest.getZoneList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetZoneList_ZoneMasterRepoReturnsNull() {
		// Setup
		when(mockZoneMasterRepo.getZoneMaster(0)).thenReturn(null);

		// Run the test
		final String result = locationServiceImplUnderTest.getZoneList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetZoneList_ZoneMasterRepoReturnsNoItems() {
		// Setup
		when(mockZoneMasterRepo.getZoneMaster(0)).thenReturn(new ArrayList<>());

		// Run the test
		final String result = locationServiceImplUnderTest.getZoneList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetDistrictList() {

		// Run the test
		final String result = locationServiceImplUnderTest.getDistrictList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetDistrictList_DistrictMasterRepoReturnsNull() {
		// Setup
		when(mockDistrictMasterRepo.getDistrictMaster(0)).thenReturn(null);

		// Run the test
		final String result = locationServiceImplUnderTest.getDistrictList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetDistrictList_DistrictMasterRepoReturnsNoItems() {
		// Setup
		when(mockDistrictMasterRepo.getDistrictMaster(0)).thenReturn(new ArrayList<>());

		// Run the test
		final String result = locationServiceImplUnderTest.getDistrictList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetDistrictBlockList() {

		// Run the test
		final String result = locationServiceImplUnderTest.getDistrictBlockList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetDistrictBlockList_DistrictBlockMasterRepoReturnsNull() {
		// Setup
		when(mockDistrictBlockMasterRepo.getDistrictBlockMaster(0)).thenReturn(null);

		// Run the test
		final String result = locationServiceImplUnderTest.getDistrictBlockList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetDistrictBlockList_DistrictBlockMasterRepoReturnsNoItems() {
		// Setup
		when(mockDistrictBlockMasterRepo.getDistrictBlockMaster(0)).thenReturn(new ArrayList<>());

		// Run the test
		final String result = locationServiceImplUnderTest.getDistrictBlockList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetParkingPlaceList() {

		// Run the test
		final String result = locationServiceImplUnderTest.getParkingPlaceList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetParkingPlaceList_ParkingPlaceMasterRepoReturnsNull() {
		// Setup
		when(mockParkingPlaceMasterRepo.getParkingPlaceMaster(0)).thenReturn(null);

		// Run the test
		final String result = locationServiceImplUnderTest.getParkingPlaceList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetParkingPlaceList_ParkingPlaceMasterRepoReturnsNoItems() {
		// Setup
		when(mockParkingPlaceMasterRepo.getParkingPlaceMaster(0)).thenReturn(new ArrayList<>());

		// Run the test
		final String result = locationServiceImplUnderTest.getParkingPlaceList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetServicePointPlaceList() {

		// Run the test
		final String result = locationServiceImplUnderTest.getServicePointPlaceList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetServicePointPlaceList_ServicePointMasterRepoReturnsNull() {
		// Setup
		when(mockServicePointMasterRepo.getServicePointMaster(0)).thenReturn(null);

		// Run the test
		final String result = locationServiceImplUnderTest.getServicePointPlaceList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetServicePointPlaceList_ServicePointMasterRepoReturnsNoItems() {
		// Setup
		when(mockServicePointMasterRepo.getServicePointMaster(0)).thenReturn(new ArrayList<>());

		// Run the test
		final String result = locationServiceImplUnderTest.getServicePointPlaceList(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetVillageMasterFromBlockID() {

		// Run the test
		final String result = locationServiceImplUnderTest.getVillageMasterFromBlockID(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetVillageMasterFromBlockID_DistrictBranchMasterRepoReturnsNoItems() {
		// Setup
		when(mockDistrictBranchMasterRepo.findByBlockID(0)).thenReturn(new ArrayList<>());

		// Run the test
		final String result = locationServiceImplUnderTest.getVillageMasterFromBlockID(0);

		// Verify the results
		assertNotNull(result);
	}

	@Test
	void testGetLocDetailsNew_V_getVanLocDetailsRepoReturnsNoItems() {
		// Setup
		when(mockV_getVanLocDetailsRepo.getVanDetails(0)).thenReturn(new ArrayList<>());

		// Configure StateMasterRepo.getStateMaster(...).

		// Run the test
		final String result = locationServiceImplUnderTest.getLocDetailsNew(0, 0);

		// Verify the results
		assertNotNull(result);
	}

}
