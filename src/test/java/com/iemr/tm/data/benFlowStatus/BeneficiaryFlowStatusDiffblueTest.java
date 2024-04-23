package com.iemr.tm.data.benFlowStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import com.iemr.tm.data.login.MasterVan;
import com.iemr.tm.data.masterdata.registrar.GenderMaster;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class BeneficiaryFlowStatusDiffblueTest {
    /**
     * Method under test:
     * {@link BeneficiaryFlowStatus#getBeneficiaryFlowStatusForLeftPanel(ArrayList)}
     */
    @Test
    void testGetBeneficiaryFlowStatusForLeftPanel() {
        // Arrange, Act and Assert
        assertNull(BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel(new ArrayList<>()));
        assertNull(BeneficiaryFlowStatus.getBeneficiaryFlowStatusForLeftPanel(null));
    }

    /**
     * Method under test:
     * {@link BeneficiaryFlowStatus#getBeneficiaryPastVisitHistory(ArrayList)}
     */
    @Test
    void testGetBeneficiaryPastVisitHistory() {
        // Arrange and Act
        ArrayList<BeneficiaryFlowStatus> actualBeneficiaryPastVisitHistory = BeneficiaryFlowStatus
                .getBeneficiaryPastVisitHistory(new ArrayList<>());

        // Assert
        assertTrue(actualBeneficiaryPastVisitHistory.isEmpty());
    }

    /**
     * Method under test:
     * {@link BeneficiaryFlowStatus#getBeneficiaryPastVisitHistory(ArrayList)}
     */
    @Test
    void testGetBeneficiaryPastVisitHistory2() {
        // Arrange and Act
        ArrayList<BeneficiaryFlowStatus> actualBeneficiaryPastVisitHistory = BeneficiaryFlowStatus
                .getBeneficiaryPastVisitHistory(null);

        // Assert
        assertTrue(actualBeneficiaryPastVisitHistory.isEmpty());
    }

    /**
     * Method under test: {@link BeneficiaryFlowStatus#getdOB()}
     */
    @Test
    void testGetdOB() {
        // Arrange, Act and Assert
        assertNull((new BeneficiaryFlowStatus()).getdOB());
    }

    /**
     * Method under test: {@link BeneficiaryFlowStatus#gettC_SpecialistLabFlag()}
     */
    @Test
    void testGettC_SpecialistLabFlag() {
        // Arrange, Act and Assert
        assertNull((new BeneficiaryFlowStatus()).gettC_SpecialistLabFlag());
    }

    /**
     * Method under test: {@link BeneficiaryFlowStatus#gettC_SpecialistLabFlag()}
     */
    @Test
    void testGettC_SpecialistLabFlag2() {
        // Arrange
        I_bendemographics i_bendemographics = new I_bendemographics();
        i_bendemographics.setDistrictBranchID(1);
        i_bendemographics.setDistrictBranchName("janedoe/featurebranch");
        i_bendemographics.setDistrictID(1);
        i_bendemographics.setDistrictName("District Name");
        i_bendemographics.setServicePointID(1);
        i_bendemographics.setServicePointName("Service Point Name");

        GenderMaster m_gender = new GenderMaster();
        m_gender.setDeleted(true);
        m_gender.setGenderID((short) 1);
        m_gender.setGenderName("Gender Name");

        MasterVan masterVan = new MasterVan();
        masterVan.setDeleted(true);
        masterVan.setFacilityID(1);
        masterVan.setIsFacility(true);
        masterVan.setParkingPlaceID(1);
        masterVan.setProviderServiceMapID(1);
        masterVan.setVanID(1);
        masterVan.setVanName("Van Name");
        masterVan.setVehicalNo("Vehical No");
        masterVan.setVideoConsultationEmailID("jane.doe@example.org");

        BeneficiaryFlowStatus beneficiaryFlowStatus = new BeneficiaryFlowStatus();
        beneficiaryFlowStatus.setAge("Age");
        beneficiaryFlowStatus.setAgeVal(42);
        beneficiaryFlowStatus.setAgentId("42");
        beneficiaryFlowStatus.setBenArrivedFlag(true);
        beneficiaryFlowStatus.setBenFlowID(1L);
        beneficiaryFlowStatus.setBenImage("Ben Image");
        beneficiaryFlowStatus.setBenName("Ben Name");
        beneficiaryFlowStatus.setBenPhoneMaps(new ArrayList<>());
        beneficiaryFlowStatus.setBenVisitCode(1L);
        beneficiaryFlowStatus.setBenVisitDate(mock(Timestamp.class));
        beneficiaryFlowStatus.setBenVisitID(1L);
        beneficiaryFlowStatus.setBenVisitNo((short) 1);
        beneficiaryFlowStatus.setBen_age_val(42);
        beneficiaryFlowStatus.setBeneficiaryID(1L);
        beneficiaryFlowStatus.setBeneficiaryName("Beneficiary Name");
        beneficiaryFlowStatus.setBeneficiaryRegID(1L);
        beneficiaryFlowStatus.setBloodGroup("Blood Group");
        beneficiaryFlowStatus.setConsultantID(1);
        beneficiaryFlowStatus.setConsultantName("Consultant Name");
        beneficiaryFlowStatus.setConsultationDate(mock(Timestamp.class));
        beneficiaryFlowStatus.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        beneficiaryFlowStatus.setCreatedDate(mock(Timestamp.class));
        beneficiaryFlowStatus.setDeleted(true);
        beneficiaryFlowStatus.setDistrictID(1);
        beneficiaryFlowStatus.setDistrictName("District Name");
        beneficiaryFlowStatus.setDoctorFlag((short) 1);
        beneficiaryFlowStatus.setFatherName("Father Name");
        beneficiaryFlowStatus.setFirstName("Jane");
        beneficiaryFlowStatus.setGenderID((short) 1);
        beneficiaryFlowStatus.setGenderName("Gender Name");
        beneficiaryFlowStatus.setI_bendemographics(i_bendemographics);
        beneficiaryFlowStatus.setIsMobile(true);
        beneficiaryFlowStatus.setLabIteration((short) 1);
        beneficiaryFlowStatus.setLab_technician_flag((short) 1);
        beneficiaryFlowStatus.setLastName("Doe");
        beneficiaryFlowStatus.setM_gender(m_gender);
        beneficiaryFlowStatus.setMasterVan(masterVan);
        beneficiaryFlowStatus.setModified_by("Jan 1, 2020 9:00am GMT+0100");
        beneficiaryFlowStatus.setModified_date(mock(Timestamp.class));
        beneficiaryFlowStatus.setNurseFlag((short) 1);
        beneficiaryFlowStatus.setOncologist_flag((short) 1);
        beneficiaryFlowStatus.setParkingPlaceID(1);
        beneficiaryFlowStatus.setPassToNurse(true);
        beneficiaryFlowStatus.setPharmacist_flag((short) 1);
        beneficiaryFlowStatus.setPreferredPhoneNum("6625550144");
        beneficiaryFlowStatus.setProcessed("Processed");
        beneficiaryFlowStatus.setProviderServiceMapID(1);
        beneficiaryFlowStatus.setProviderServiceMapId(1);
        beneficiaryFlowStatus.setRadiologist_flag((short) 1);
        beneficiaryFlowStatus.setReferredVisitCode(1L);
        beneficiaryFlowStatus.setReferred_visit_id(1L);
        beneficiaryFlowStatus.setRegistrationDate(mock(Timestamp.class));
        beneficiaryFlowStatus.setReservedForChange("Reserved For Change");
        beneficiaryFlowStatus.setServiceDate(mock(Timestamp.class));
        beneficiaryFlowStatus.setServicePointID(1);
        beneficiaryFlowStatus.setServicePointName("Service Point Name");
        beneficiaryFlowStatus.setSpecialist_flag((short) 1);
        beneficiaryFlowStatus.setSpouseName("Spouse Name");
        beneficiaryFlowStatus.setSyncedBy("Synced By");
        beneficiaryFlowStatus.setSyncedDate(mock(Timestamp.class));
        beneficiaryFlowStatus.setVanID(1);
        beneficiaryFlowStatus.setVanNo("Van No");
        beneficiaryFlowStatus.setVanSerialNo(1L);
        beneficiaryFlowStatus.setVehicalNo("Vehical No");
        beneficiaryFlowStatus.setVillageID(1);
        beneficiaryFlowStatus.setVillageName("Village Name");
        beneficiaryFlowStatus.setVisitCategory("Visit Category");
        beneficiaryFlowStatus.setVisitCode(1L);
        beneficiaryFlowStatus.setVisitDate(mock(Timestamp.class));
        beneficiaryFlowStatus.setVisitReason("Just cause");
        beneficiaryFlowStatus.setVisitSession(1);
        beneficiaryFlowStatus.setdOB(mock(Timestamp.class));
        beneficiaryFlowStatus.settCRequestDate(mock(Timestamp.class));
        beneficiaryFlowStatus.settCSpecialistUserID(1);
        beneficiaryFlowStatus.settC_SpecialistLabFlag((short) 1);

        // Act and Assert
        assertEquals((short) 1, beneficiaryFlowStatus.gettC_SpecialistLabFlag().shortValue());
    }

    /**
     * Method under test: {@link BeneficiaryFlowStatus#gettCSpecialistUserID()}
     */
    @Test
    void testGettCSpecialistUserID() {
        // Arrange, Act and Assert
        assertNull((new BeneficiaryFlowStatus()).gettCSpecialistUserID());
    }

    /**
     * Method under test: {@link BeneficiaryFlowStatus#gettCSpecialistUserID()}
     */
    @Test
    void testGettCSpecialistUserID2() {
        // Arrange
        I_bendemographics i_bendemographics = new I_bendemographics();
        i_bendemographics.setDistrictBranchID(1);
        i_bendemographics.setDistrictBranchName("janedoe/featurebranch");
        i_bendemographics.setDistrictID(1);
        i_bendemographics.setDistrictName("District Name");
        i_bendemographics.setServicePointID(1);
        i_bendemographics.setServicePointName("Service Point Name");

        GenderMaster m_gender = new GenderMaster();
        m_gender.setDeleted(true);
        m_gender.setGenderID((short) 1);
        m_gender.setGenderName("Gender Name");

        MasterVan masterVan = new MasterVan();
        masterVan.setDeleted(true);
        masterVan.setFacilityID(1);
        masterVan.setIsFacility(true);
        masterVan.setParkingPlaceID(1);
        masterVan.setProviderServiceMapID(1);
        masterVan.setVanID(1);
        masterVan.setVanName("Van Name");
        masterVan.setVehicalNo("Vehical No");
        masterVan.setVideoConsultationEmailID("jane.doe@example.org");

        BeneficiaryFlowStatus beneficiaryFlowStatus = new BeneficiaryFlowStatus();
        beneficiaryFlowStatus.setAge("Age");
        beneficiaryFlowStatus.setAgeVal(42);
        beneficiaryFlowStatus.setAgentId("42");
        beneficiaryFlowStatus.setBenArrivedFlag(true);
        beneficiaryFlowStatus.setBenFlowID(1L);
        beneficiaryFlowStatus.setBenImage("Ben Image");
        beneficiaryFlowStatus.setBenName("Ben Name");
        beneficiaryFlowStatus.setBenPhoneMaps(new ArrayList<>());
        beneficiaryFlowStatus.setBenVisitCode(1L);
        beneficiaryFlowStatus.setBenVisitDate(mock(Timestamp.class));
        beneficiaryFlowStatus.setBenVisitID(1L);
        beneficiaryFlowStatus.setBenVisitNo((short) 1);
        beneficiaryFlowStatus.setBen_age_val(42);
        beneficiaryFlowStatus.setBeneficiaryID(1L);
        beneficiaryFlowStatus.setBeneficiaryName("Beneficiary Name");
        beneficiaryFlowStatus.setBeneficiaryRegID(1L);
        beneficiaryFlowStatus.setBloodGroup("Blood Group");
        beneficiaryFlowStatus.setConsultantID(1);
        beneficiaryFlowStatus.setConsultantName("Consultant Name");
        beneficiaryFlowStatus.setConsultationDate(mock(Timestamp.class));
        beneficiaryFlowStatus.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        beneficiaryFlowStatus.setCreatedDate(mock(Timestamp.class));
        beneficiaryFlowStatus.setDeleted(true);
        beneficiaryFlowStatus.setDistrictID(1);
        beneficiaryFlowStatus.setDistrictName("District Name");
        beneficiaryFlowStatus.setDoctorFlag((short) 1);
        beneficiaryFlowStatus.setFatherName("Father Name");
        beneficiaryFlowStatus.setFirstName("Jane");
        beneficiaryFlowStatus.setGenderID((short) 1);
        beneficiaryFlowStatus.setGenderName("Gender Name");
        beneficiaryFlowStatus.setI_bendemographics(i_bendemographics);
        beneficiaryFlowStatus.setIsMobile(true);
        beneficiaryFlowStatus.setLabIteration((short) 1);
        beneficiaryFlowStatus.setLab_technician_flag((short) 1);
        beneficiaryFlowStatus.setLastName("Doe");
        beneficiaryFlowStatus.setM_gender(m_gender);
        beneficiaryFlowStatus.setMasterVan(masterVan);
        beneficiaryFlowStatus.setModified_by("Jan 1, 2020 9:00am GMT+0100");
        beneficiaryFlowStatus.setModified_date(mock(Timestamp.class));
        beneficiaryFlowStatus.setNurseFlag((short) 1);
        beneficiaryFlowStatus.setOncologist_flag((short) 1);
        beneficiaryFlowStatus.setParkingPlaceID(1);
        beneficiaryFlowStatus.setPassToNurse(true);
        beneficiaryFlowStatus.setPharmacist_flag((short) 1);
        beneficiaryFlowStatus.setPreferredPhoneNum("6625550144");
        beneficiaryFlowStatus.setProcessed("Processed");
        beneficiaryFlowStatus.setProviderServiceMapID(1);
        beneficiaryFlowStatus.setProviderServiceMapId(1);
        beneficiaryFlowStatus.setRadiologist_flag((short) 1);
        beneficiaryFlowStatus.setReferredVisitCode(1L);
        beneficiaryFlowStatus.setReferred_visit_id(1L);
        beneficiaryFlowStatus.setRegistrationDate(mock(Timestamp.class));
        beneficiaryFlowStatus.setReservedForChange("Reserved For Change");
        beneficiaryFlowStatus.setServiceDate(mock(Timestamp.class));
        beneficiaryFlowStatus.setServicePointID(1);
        beneficiaryFlowStatus.setServicePointName("Service Point Name");
        beneficiaryFlowStatus.setSpecialist_flag((short) 1);
        beneficiaryFlowStatus.setSpouseName("Spouse Name");
        beneficiaryFlowStatus.setSyncedBy("Synced By");
        beneficiaryFlowStatus.setSyncedDate(mock(Timestamp.class));
        beneficiaryFlowStatus.setVanID(1);
        beneficiaryFlowStatus.setVanNo("Van No");
        beneficiaryFlowStatus.setVanSerialNo(1L);
        beneficiaryFlowStatus.setVehicalNo("Vehical No");
        beneficiaryFlowStatus.setVillageID(1);
        beneficiaryFlowStatus.setVillageName("Village Name");
        beneficiaryFlowStatus.setVisitCategory("Visit Category");
        beneficiaryFlowStatus.setVisitCode(1L);
        beneficiaryFlowStatus.setVisitDate(mock(Timestamp.class));
        beneficiaryFlowStatus.setVisitReason("Just cause");
        beneficiaryFlowStatus.setVisitSession(1);
        beneficiaryFlowStatus.setdOB(mock(Timestamp.class));
        beneficiaryFlowStatus.settCRequestDate(mock(Timestamp.class));
        beneficiaryFlowStatus.settCSpecialistUserID(1);
        beneficiaryFlowStatus.settC_SpecialistLabFlag((short) 1);

        // Act and Assert
        assertEquals(1, beneficiaryFlowStatus.gettCSpecialistUserID().intValue());
    }

    /**
     * Method under test: {@link BeneficiaryFlowStatus#gettCRequestDate()}
     */
    @Test
    void testGettCRequestDate() {
        // Arrange, Act and Assert
        assertNull((new BeneficiaryFlowStatus()).gettCRequestDate());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link BeneficiaryFlowStatus#BeneficiaryFlowStatus()}
     *   <li>{@link BeneficiaryFlowStatus#setAge(String)}
     *   <li>{@link BeneficiaryFlowStatus#setAgeVal(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setAgentId(String)}
     *   <li>{@link BeneficiaryFlowStatus#setBenArrivedFlag(Boolean)}
     *   <li>{@link BeneficiaryFlowStatus#setBenFlowID(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setBenImage(String)}
     *   <li>{@link BeneficiaryFlowStatus#setBenName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setBenPhoneMaps(List)}
     *   <li>{@link BeneficiaryFlowStatus#setBenVisitCode(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setBenVisitDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setBenVisitID(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setBenVisitNo(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setBen_age_val(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setBeneficiaryID(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setBeneficiaryName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setBeneficiaryRegID(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setBloodGroup(String)}
     *   <li>{@link BeneficiaryFlowStatus#setConsultantID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setConsultantName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setConsultationDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setCreatedBy(String)}
     *   <li>{@link BeneficiaryFlowStatus#setCreatedDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setDeleted(Boolean)}
     *   <li>{@link BeneficiaryFlowStatus#setDistrictID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setDistrictName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setDoctorFlag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setFatherName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setFirstName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setGenderID(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setGenderName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setI_bendemographics(I_bendemographics)}
     *   <li>{@link BeneficiaryFlowStatus#setIsMobile(Boolean)}
     *   <li>{@link BeneficiaryFlowStatus#setLabIteration(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setLab_technician_flag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setLastName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setM_gender(GenderMaster)}
     *   <li>{@link BeneficiaryFlowStatus#setMasterVan(MasterVan)}
     *   <li>{@link BeneficiaryFlowStatus#setModified_by(String)}
     *   <li>{@link BeneficiaryFlowStatus#setModified_date(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setNurseFlag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setOncologist_flag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setParkingPlaceID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setPassToNurse(Boolean)}
     *   <li>{@link BeneficiaryFlowStatus#setPharmacist_flag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setPreferredPhoneNum(String)}
     *   <li>{@link BeneficiaryFlowStatus#setProcessed(String)}
     *   <li>{@link BeneficiaryFlowStatus#setProviderServiceMapID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setProviderServiceMapId(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setRadiologist_flag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setReferredVisitCode(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setReferred_visit_id(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setRegistrationDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setReservedForChange(String)}
     *   <li>{@link BeneficiaryFlowStatus#setServiceDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setServicePointID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setServicePointName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setSpecialist_flag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setSpouseName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setSyncedBy(String)}
     *   <li>{@link BeneficiaryFlowStatus#setSyncedDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setVanID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setVanNo(String)}
     *   <li>{@link BeneficiaryFlowStatus#setVanSerialNo(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setVehicalNo(String)}
     *   <li>{@link BeneficiaryFlowStatus#setVillageID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setVillageName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setVisitCategory(String)}
     *   <li>{@link BeneficiaryFlowStatus#setVisitCode(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setVisitDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setVisitReason(String)}
     *   <li>{@link BeneficiaryFlowStatus#setVisitSession(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setdOB(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#settCRequestDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#settCSpecialistUserID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#settC_SpecialistLabFlag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#getAge()}
     *   <li>{@link BeneficiaryFlowStatus#getAgeVal()}
     *   <li>{@link BeneficiaryFlowStatus#getAgentId()}
     *   <li>{@link BeneficiaryFlowStatus#getBenArrivedFlag()}
     *   <li>{@link BeneficiaryFlowStatus#getBenFlowID()}
     *   <li>{@link BeneficiaryFlowStatus#getBenImage()}
     *   <li>{@link BeneficiaryFlowStatus#getBenName()}
     *   <li>{@link BeneficiaryFlowStatus#getBenPhoneMaps()}
     *   <li>{@link BeneficiaryFlowStatus#getBenVisitCode()}
     *   <li>{@link BeneficiaryFlowStatus#getBenVisitDate()}
     *   <li>{@link BeneficiaryFlowStatus#getBenVisitID()}
     *   <li>{@link BeneficiaryFlowStatus#getBenVisitNo()}
     *   <li>{@link BeneficiaryFlowStatus#getBen_age_val()}
     *   <li>{@link BeneficiaryFlowStatus#getBeneficiaryID()}
     *   <li>{@link BeneficiaryFlowStatus#getBeneficiaryName()}
     *   <li>{@link BeneficiaryFlowStatus#getBeneficiaryRegID()}
     *   <li>{@link BeneficiaryFlowStatus#getBloodGroup()}
     *   <li>{@link BeneficiaryFlowStatus#getConsultantID()}
     *   <li>{@link BeneficiaryFlowStatus#getConsultantName()}
     *   <li>{@link BeneficiaryFlowStatus#getConsultationDate()}
     *   <li>{@link BeneficiaryFlowStatus#getCreatedBy()}
     *   <li>{@link BeneficiaryFlowStatus#getCreatedDate()}
     *   <li>{@link BeneficiaryFlowStatus#getDeleted()}
     *   <li>{@link BeneficiaryFlowStatus#getDistrictID()}
     *   <li>{@link BeneficiaryFlowStatus#getDistrictName()}
     *   <li>{@link BeneficiaryFlowStatus#getDoctorFlag()}
     *   <li>{@link BeneficiaryFlowStatus#getFatherName()}
     *   <li>{@link BeneficiaryFlowStatus#getFirstName()}
     *   <li>{@link BeneficiaryFlowStatus#getGenderID()}
     *   <li>{@link BeneficiaryFlowStatus#getGenderName()}
     *   <li>{@link BeneficiaryFlowStatus#getI_bendemographics()}
     *   <li>{@link BeneficiaryFlowStatus#getIsMobile()}
     *   <li>{@link BeneficiaryFlowStatus#getLabIteration()}
     *   <li>{@link BeneficiaryFlowStatus#getLab_technician_flag()}
     *   <li>{@link BeneficiaryFlowStatus#getLastName()}
     *   <li>{@link BeneficiaryFlowStatus#getM_gender()}
     *   <li>{@link BeneficiaryFlowStatus#getMasterVan()}
     *   <li>{@link BeneficiaryFlowStatus#getModified_by()}
     *   <li>{@link BeneficiaryFlowStatus#getModified_date()}
     *   <li>{@link BeneficiaryFlowStatus#getNurseFlag()}
     *   <li>{@link BeneficiaryFlowStatus#getOncologist_flag()}
     *   <li>{@link BeneficiaryFlowStatus#getParkingPlaceID()}
     *   <li>{@link BeneficiaryFlowStatus#getPassToNurse()}
     *   <li>{@link BeneficiaryFlowStatus#getPharmacist_flag()}
     *   <li>{@link BeneficiaryFlowStatus#getPreferredPhoneNum()}
     *   <li>{@link BeneficiaryFlowStatus#getProcessed()}
     *   <li>{@link BeneficiaryFlowStatus#getProviderServiceMapID()}
     *   <li>{@link BeneficiaryFlowStatus#getProviderServiceMapId()}
     *   <li>{@link BeneficiaryFlowStatus#getRadiologist_flag()}
     *   <li>{@link BeneficiaryFlowStatus#getReferredVisitCode()}
     *   <li>{@link BeneficiaryFlowStatus#getReferred_visit_id()}
     *   <li>{@link BeneficiaryFlowStatus#getRegistrationDate()}
     *   <li>{@link BeneficiaryFlowStatus#getReservedForChange()}
     *   <li>{@link BeneficiaryFlowStatus#getServiceDate()}
     *   <li>{@link BeneficiaryFlowStatus#getServicePointID()}
     *   <li>{@link BeneficiaryFlowStatus#getServicePointName()}
     *   <li>{@link BeneficiaryFlowStatus#getSpecialist_flag()}
     *   <li>{@link BeneficiaryFlowStatus#getSpouseName()}
     *   <li>{@link BeneficiaryFlowStatus#getSyncedBy()}
     *   <li>{@link BeneficiaryFlowStatus#getSyncedDate()}
     *   <li>{@link BeneficiaryFlowStatus#getVanID()}
     *   <li>{@link BeneficiaryFlowStatus#getVanNo()}
     *   <li>{@link BeneficiaryFlowStatus#getVanSerialNo()}
     *   <li>{@link BeneficiaryFlowStatus#getVehicalNo()}
     *   <li>{@link BeneficiaryFlowStatus#getVillageID()}
     *   <li>{@link BeneficiaryFlowStatus#getVillageName()}
     *   <li>{@link BeneficiaryFlowStatus#getVisitCategory()}
     *   <li>{@link BeneficiaryFlowStatus#getVisitCode()}
     *   <li>{@link BeneficiaryFlowStatus#getVisitDate()}
     *   <li>{@link BeneficiaryFlowStatus#getVisitReason()}
     *   <li>{@link BeneficiaryFlowStatus#getVisitSession()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        BeneficiaryFlowStatus actualBeneficiaryFlowStatus = new BeneficiaryFlowStatus();
        actualBeneficiaryFlowStatus.setAge("Age");
        actualBeneficiaryFlowStatus.setAgeVal(42);
        actualBeneficiaryFlowStatus.setAgentId("42");
        actualBeneficiaryFlowStatus.setBenArrivedFlag(true);
        actualBeneficiaryFlowStatus.setBenFlowID(1L);
        actualBeneficiaryFlowStatus.setBenImage("Ben Image");
        actualBeneficiaryFlowStatus.setBenName("Ben Name");
        ArrayList<BenPhoneMaps> benPhoneMaps = new ArrayList<>();
        actualBeneficiaryFlowStatus.setBenPhoneMaps(benPhoneMaps);
        actualBeneficiaryFlowStatus.setBenVisitCode(1L);
        Timestamp benVisitDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setBenVisitDate(benVisitDate);
        actualBeneficiaryFlowStatus.setBenVisitID(1L);
        actualBeneficiaryFlowStatus.setBenVisitNo((short) 1);
        actualBeneficiaryFlowStatus.setBen_age_val(42);
        actualBeneficiaryFlowStatus.setBeneficiaryID(1L);
        actualBeneficiaryFlowStatus.setBeneficiaryName("Beneficiary Name");
        actualBeneficiaryFlowStatus.setBeneficiaryRegID(1L);
        actualBeneficiaryFlowStatus.setBloodGroup("Blood Group");
        actualBeneficiaryFlowStatus.setConsultantID(1);
        actualBeneficiaryFlowStatus.setConsultantName("Consultant Name");
        Timestamp consultationDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setConsultationDate(consultationDate);
        actualBeneficiaryFlowStatus.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setCreatedDate(createdDate);
        actualBeneficiaryFlowStatus.setDeleted(true);
        actualBeneficiaryFlowStatus.setDistrictID(1);
        actualBeneficiaryFlowStatus.setDistrictName("District Name");
        actualBeneficiaryFlowStatus.setDoctorFlag((short) 1);
        actualBeneficiaryFlowStatus.setFatherName("Father Name");
        actualBeneficiaryFlowStatus.setFirstName("Jane");
        actualBeneficiaryFlowStatus.setGenderID((short) 1);
        actualBeneficiaryFlowStatus.setGenderName("Gender Name");
        I_bendemographics i_bendemographics = new I_bendemographics();
        i_bendemographics.setDistrictBranchID(1);
        i_bendemographics.setDistrictBranchName("janedoe/featurebranch");
        i_bendemographics.setDistrictID(1);
        i_bendemographics.setDistrictName("District Name");
        i_bendemographics.setServicePointID(1);
        i_bendemographics.setServicePointName("Service Point Name");
        actualBeneficiaryFlowStatus.setI_bendemographics(i_bendemographics);
        actualBeneficiaryFlowStatus.setIsMobile(true);
        actualBeneficiaryFlowStatus.setLabIteration((short) 1);
        actualBeneficiaryFlowStatus.setLab_technician_flag((short) 1);
        actualBeneficiaryFlowStatus.setLastName("Doe");
        GenderMaster m_gender = new GenderMaster();
        m_gender.setDeleted(true);
        m_gender.setGenderID((short) 1);
        m_gender.setGenderName("Gender Name");
        actualBeneficiaryFlowStatus.setM_gender(m_gender);
        MasterVan masterVan = new MasterVan();
        masterVan.setDeleted(true);
        masterVan.setFacilityID(1);
        masterVan.setIsFacility(true);
        masterVan.setParkingPlaceID(1);
        masterVan.setProviderServiceMapID(1);
        masterVan.setVanID(1);
        masterVan.setVanName("Van Name");
        masterVan.setVehicalNo("Vehical No");
        masterVan.setVideoConsultationEmailID("jane.doe@example.org");
        actualBeneficiaryFlowStatus.setMasterVan(masterVan);
        actualBeneficiaryFlowStatus.setModified_by("Jan 1, 2020 9:00am GMT+0100");
        Timestamp modified_date = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setModified_date(modified_date);
        actualBeneficiaryFlowStatus.setNurseFlag((short) 1);
        actualBeneficiaryFlowStatus.setOncologist_flag((short) 1);
        actualBeneficiaryFlowStatus.setParkingPlaceID(1);
        actualBeneficiaryFlowStatus.setPassToNurse(true);
        actualBeneficiaryFlowStatus.setPharmacist_flag((short) 1);
        actualBeneficiaryFlowStatus.setPreferredPhoneNum("6625550144");
        actualBeneficiaryFlowStatus.setProcessed("Processed");
        actualBeneficiaryFlowStatus.setProviderServiceMapID(1);
        actualBeneficiaryFlowStatus.setProviderServiceMapId(1);
        actualBeneficiaryFlowStatus.setRadiologist_flag((short) 1);
        actualBeneficiaryFlowStatus.setReferredVisitCode(1L);
        actualBeneficiaryFlowStatus.setReferred_visit_id(1L);
        Timestamp registrationDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setRegistrationDate(registrationDate);
        actualBeneficiaryFlowStatus.setReservedForChange("Reserved For Change");
        Timestamp serviceDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setServiceDate(serviceDate);
        actualBeneficiaryFlowStatus.setServicePointID(1);
        actualBeneficiaryFlowStatus.setServicePointName("Service Point Name");
        actualBeneficiaryFlowStatus.setSpecialist_flag((short) 1);
        actualBeneficiaryFlowStatus.setSpouseName("Spouse Name");
        actualBeneficiaryFlowStatus.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setSyncedDate(syncedDate);
        actualBeneficiaryFlowStatus.setVanID(1);
        actualBeneficiaryFlowStatus.setVanNo("Van No");
        actualBeneficiaryFlowStatus.setVanSerialNo(1L);
        actualBeneficiaryFlowStatus.setVehicalNo("Vehical No");
        actualBeneficiaryFlowStatus.setVillageID(1);
        actualBeneficiaryFlowStatus.setVillageName("Village Name");
        actualBeneficiaryFlowStatus.setVisitCategory("Visit Category");
        actualBeneficiaryFlowStatus.setVisitCode(1L);
        Timestamp visitDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setVisitDate(visitDate);
        actualBeneficiaryFlowStatus.setVisitReason("Just cause");
        actualBeneficiaryFlowStatus.setVisitSession(1);
        actualBeneficiaryFlowStatus.setdOB(mock(Timestamp.class));
        actualBeneficiaryFlowStatus.settCRequestDate(mock(Timestamp.class));
        actualBeneficiaryFlowStatus.settCSpecialistUserID(1);
        actualBeneficiaryFlowStatus.settC_SpecialistLabFlag((short) 1);
        String actualAge = actualBeneficiaryFlowStatus.getAge();
        Integer actualAgeVal = actualBeneficiaryFlowStatus.getAgeVal();
        String actualAgentId = actualBeneficiaryFlowStatus.getAgentId();
        Boolean actualBenArrivedFlag = actualBeneficiaryFlowStatus.getBenArrivedFlag();
        Long actualBenFlowID = actualBeneficiaryFlowStatus.getBenFlowID();
        String actualBenImage = actualBeneficiaryFlowStatus.getBenImage();
        String actualBenName = actualBeneficiaryFlowStatus.getBenName();
        List<BenPhoneMaps> actualBenPhoneMaps = actualBeneficiaryFlowStatus.getBenPhoneMaps();
        Long actualBenVisitCode = actualBeneficiaryFlowStatus.getBenVisitCode();
        Timestamp actualBenVisitDate = actualBeneficiaryFlowStatus.getBenVisitDate();
        Long actualBenVisitID = actualBeneficiaryFlowStatus.getBenVisitID();
        Short actualBenVisitNo = actualBeneficiaryFlowStatus.getBenVisitNo();
        Integer actualBen_age_val = actualBeneficiaryFlowStatus.getBen_age_val();
        Long actualBeneficiaryID = actualBeneficiaryFlowStatus.getBeneficiaryID();
        String actualBeneficiaryName = actualBeneficiaryFlowStatus.getBeneficiaryName();
        Long actualBeneficiaryRegID = actualBeneficiaryFlowStatus.getBeneficiaryRegID();
        String actualBloodGroup = actualBeneficiaryFlowStatus.getBloodGroup();
        Integer actualConsultantID = actualBeneficiaryFlowStatus.getConsultantID();
        String actualConsultantName = actualBeneficiaryFlowStatus.getConsultantName();
        Timestamp actualConsultationDate = actualBeneficiaryFlowStatus.getConsultationDate();
        String actualCreatedBy = actualBeneficiaryFlowStatus.getCreatedBy();
        Timestamp actualCreatedDate = actualBeneficiaryFlowStatus.getCreatedDate();
        Boolean actualDeleted = actualBeneficiaryFlowStatus.getDeleted();
        Integer actualDistrictID = actualBeneficiaryFlowStatus.getDistrictID();
        String actualDistrictName = actualBeneficiaryFlowStatus.getDistrictName();
        Short actualDoctorFlag = actualBeneficiaryFlowStatus.getDoctorFlag();
        String actualFatherName = actualBeneficiaryFlowStatus.getFatherName();
        String actualFirstName = actualBeneficiaryFlowStatus.getFirstName();
        Short actualGenderID = actualBeneficiaryFlowStatus.getGenderID();
        String actualGenderName = actualBeneficiaryFlowStatus.getGenderName();
        I_bendemographics actualI_bendemographics = actualBeneficiaryFlowStatus.getI_bendemographics();
        Boolean actualIsMobile = actualBeneficiaryFlowStatus.getIsMobile();
        Short actualLabIteration = actualBeneficiaryFlowStatus.getLabIteration();
        Short actualLab_technician_flag = actualBeneficiaryFlowStatus.getLab_technician_flag();
        String actualLastName = actualBeneficiaryFlowStatus.getLastName();
        GenderMaster actualM_gender = actualBeneficiaryFlowStatus.getM_gender();
        MasterVan actualMasterVan = actualBeneficiaryFlowStatus.getMasterVan();
        String actualModified_by = actualBeneficiaryFlowStatus.getModified_by();
        Timestamp actualModified_date = actualBeneficiaryFlowStatus.getModified_date();
        Short actualNurseFlag = actualBeneficiaryFlowStatus.getNurseFlag();
        Short actualOncologist_flag = actualBeneficiaryFlowStatus.getOncologist_flag();
        Integer actualParkingPlaceID = actualBeneficiaryFlowStatus.getParkingPlaceID();
        Boolean actualPassToNurse = actualBeneficiaryFlowStatus.getPassToNurse();
        Short actualPharmacist_flag = actualBeneficiaryFlowStatus.getPharmacist_flag();
        String actualPreferredPhoneNum = actualBeneficiaryFlowStatus.getPreferredPhoneNum();
        String actualProcessed = actualBeneficiaryFlowStatus.getProcessed();
        Integer actualProviderServiceMapID = actualBeneficiaryFlowStatus.getProviderServiceMapID();
        Integer actualProviderServiceMapId = actualBeneficiaryFlowStatus.getProviderServiceMapId();
        Short actualRadiologist_flag = actualBeneficiaryFlowStatus.getRadiologist_flag();
        Long actualReferredVisitCode = actualBeneficiaryFlowStatus.getReferredVisitCode();
        Long actualReferred_visit_id = actualBeneficiaryFlowStatus.getReferred_visit_id();
        Timestamp actualRegistrationDate = actualBeneficiaryFlowStatus.getRegistrationDate();
        String actualReservedForChange = actualBeneficiaryFlowStatus.getReservedForChange();
        Timestamp actualServiceDate = actualBeneficiaryFlowStatus.getServiceDate();
        Integer actualServicePointID = actualBeneficiaryFlowStatus.getServicePointID();
        String actualServicePointName = actualBeneficiaryFlowStatus.getServicePointName();
        Short actualSpecialist_flag = actualBeneficiaryFlowStatus.getSpecialist_flag();
        String actualSpouseName = actualBeneficiaryFlowStatus.getSpouseName();
        String actualSyncedBy = actualBeneficiaryFlowStatus.getSyncedBy();
        Timestamp actualSyncedDate = actualBeneficiaryFlowStatus.getSyncedDate();
        Integer actualVanID = actualBeneficiaryFlowStatus.getVanID();
        String actualVanNo = actualBeneficiaryFlowStatus.getVanNo();
        Long actualVanSerialNo = actualBeneficiaryFlowStatus.getVanSerialNo();
        String actualVehicalNo = actualBeneficiaryFlowStatus.getVehicalNo();
        Integer actualVillageID = actualBeneficiaryFlowStatus.getVillageID();
        String actualVillageName = actualBeneficiaryFlowStatus.getVillageName();
        String actualVisitCategory = actualBeneficiaryFlowStatus.getVisitCategory();
        Long actualVisitCode = actualBeneficiaryFlowStatus.getVisitCode();
        Timestamp actualVisitDate = actualBeneficiaryFlowStatus.getVisitDate();
        String actualVisitReason = actualBeneficiaryFlowStatus.getVisitReason();
        Integer actualVisitSession = actualBeneficiaryFlowStatus.getVisitSession();

        // Assert that nothing has changed
        assertEquals("42", actualAgentId);
        assertEquals("6625550144", actualPreferredPhoneNum);
        assertEquals("Age", actualAge);
        assertEquals("Ben Image", actualBenImage);
        assertEquals("Ben Name", actualBenName);
        assertEquals("Beneficiary Name", actualBeneficiaryName);
        assertEquals("Blood Group", actualBloodGroup);
        assertEquals("Consultant Name", actualConsultantName);
        assertEquals("District Name", actualDistrictName);
        assertEquals("Doe", actualLastName);
        assertEquals("Father Name", actualFatherName);
        assertEquals("Gender Name", actualGenderName);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModified_by);
        assertEquals("Jane", actualFirstName);
        assertEquals("Just cause", actualVisitReason);
        assertEquals("Processed", actualProcessed);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Service Point Name", actualServicePointName);
        assertEquals("Spouse Name", actualSpouseName);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Van No", actualVanNo);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals("Village Name", actualVillageName);
        assertEquals("Visit Category", actualVisitCategory);
        assertEquals(1, actualConsultantID.intValue());
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualProviderServiceMapId.intValue());
        assertEquals(1, actualServicePointID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1, actualVillageID.intValue());
        assertEquals(1, actualVisitSession.intValue());
        assertEquals(1L, actualBenFlowID.longValue());
        assertEquals(1L, actualBenVisitCode.longValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualReferredVisitCode.longValue());
        assertEquals(1L, actualReferred_visit_id.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertEquals((short) 1, actualBenVisitNo.shortValue());
        assertEquals((short) 1, actualDoctorFlag.shortValue());
        assertEquals((short) 1, actualGenderID.shortValue());
        assertEquals((short) 1, actualLabIteration.shortValue());
        assertEquals((short) 1, actualLab_technician_flag.shortValue());
        assertEquals((short) 1, actualNurseFlag.shortValue());
        assertEquals((short) 1, actualOncologist_flag.shortValue());
        assertEquals((short) 1, actualPharmacist_flag.shortValue());
        assertEquals((short) 1, actualRadiologist_flag.shortValue());
        assertEquals((short) 1, actualSpecialist_flag.shortValue());
        assertEquals(42, actualAgeVal.intValue());
        assertEquals(42, actualBen_age_val.intValue());
        assertTrue(actualBenArrivedFlag);
        assertTrue(actualDeleted);
        assertTrue(actualIsMobile);
        assertTrue(actualPassToNurse);
        assertSame(i_bendemographics, actualI_bendemographics);
        assertSame(masterVan, actualMasterVan);
        assertSame(m_gender, actualM_gender);
        assertSame(benPhoneMaps, actualBenPhoneMaps);
        assertSame(benVisitDate, actualBenVisitDate);
        assertSame(consultationDate, actualConsultationDate);
        assertSame(createdDate, actualCreatedDate);
        assertSame(modified_date, actualModified_date);
        assertSame(registrationDate, actualRegistrationDate);
        assertSame(serviceDate, actualServiceDate);
        assertSame(syncedDate, actualSyncedDate);
        assertSame(visitDate, actualVisitDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link BeneficiaryFlowStatus#BeneficiaryFlowStatus(Long, Long, Long, Timestamp, Short, String, String)}
     *   <li>{@link BeneficiaryFlowStatus#setAge(String)}
     *   <li>{@link BeneficiaryFlowStatus#setAgeVal(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setAgentId(String)}
     *   <li>{@link BeneficiaryFlowStatus#setBenArrivedFlag(Boolean)}
     *   <li>{@link BeneficiaryFlowStatus#setBenFlowID(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setBenImage(String)}
     *   <li>{@link BeneficiaryFlowStatus#setBenName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setBenPhoneMaps(List)}
     *   <li>{@link BeneficiaryFlowStatus#setBenVisitCode(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setBenVisitDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setBenVisitID(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setBenVisitNo(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setBen_age_val(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setBeneficiaryID(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setBeneficiaryName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setBeneficiaryRegID(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setBloodGroup(String)}
     *   <li>{@link BeneficiaryFlowStatus#setConsultantID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setConsultantName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setConsultationDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setCreatedBy(String)}
     *   <li>{@link BeneficiaryFlowStatus#setCreatedDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setDeleted(Boolean)}
     *   <li>{@link BeneficiaryFlowStatus#setDistrictID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setDistrictName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setDoctorFlag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setFatherName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setFirstName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setGenderID(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setGenderName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setI_bendemographics(I_bendemographics)}
     *   <li>{@link BeneficiaryFlowStatus#setIsMobile(Boolean)}
     *   <li>{@link BeneficiaryFlowStatus#setLabIteration(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setLab_technician_flag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setLastName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setM_gender(GenderMaster)}
     *   <li>{@link BeneficiaryFlowStatus#setMasterVan(MasterVan)}
     *   <li>{@link BeneficiaryFlowStatus#setModified_by(String)}
     *   <li>{@link BeneficiaryFlowStatus#setModified_date(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setNurseFlag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setOncologist_flag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setParkingPlaceID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setPassToNurse(Boolean)}
     *   <li>{@link BeneficiaryFlowStatus#setPharmacist_flag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setPreferredPhoneNum(String)}
     *   <li>{@link BeneficiaryFlowStatus#setProcessed(String)}
     *   <li>{@link BeneficiaryFlowStatus#setProviderServiceMapID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setProviderServiceMapId(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setRadiologist_flag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setReferredVisitCode(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setReferred_visit_id(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setRegistrationDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setReservedForChange(String)}
     *   <li>{@link BeneficiaryFlowStatus#setServiceDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setServicePointID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setServicePointName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setSpecialist_flag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setSpouseName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setSyncedBy(String)}
     *   <li>{@link BeneficiaryFlowStatus#setSyncedDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setVanID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setVanNo(String)}
     *   <li>{@link BeneficiaryFlowStatus#setVanSerialNo(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setVehicalNo(String)}
     *   <li>{@link BeneficiaryFlowStatus#setVillageID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setVillageName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setVisitCategory(String)}
     *   <li>{@link BeneficiaryFlowStatus#setVisitCode(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setVisitDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setVisitReason(String)}
     *   <li>{@link BeneficiaryFlowStatus#setVisitSession(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setdOB(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#settCRequestDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#settCSpecialistUserID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#settC_SpecialistLabFlag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#getAge()}
     *   <li>{@link BeneficiaryFlowStatus#getAgeVal()}
     *   <li>{@link BeneficiaryFlowStatus#getAgentId()}
     *   <li>{@link BeneficiaryFlowStatus#getBenArrivedFlag()}
     *   <li>{@link BeneficiaryFlowStatus#getBenFlowID()}
     *   <li>{@link BeneficiaryFlowStatus#getBenImage()}
     *   <li>{@link BeneficiaryFlowStatus#getBenName()}
     *   <li>{@link BeneficiaryFlowStatus#getBenPhoneMaps()}
     *   <li>{@link BeneficiaryFlowStatus#getBenVisitCode()}
     *   <li>{@link BeneficiaryFlowStatus#getBenVisitDate()}
     *   <li>{@link BeneficiaryFlowStatus#getBenVisitID()}
     *   <li>{@link BeneficiaryFlowStatus#getBenVisitNo()}
     *   <li>{@link BeneficiaryFlowStatus#getBen_age_val()}
     *   <li>{@link BeneficiaryFlowStatus#getBeneficiaryID()}
     *   <li>{@link BeneficiaryFlowStatus#getBeneficiaryName()}
     *   <li>{@link BeneficiaryFlowStatus#getBeneficiaryRegID()}
     *   <li>{@link BeneficiaryFlowStatus#getBloodGroup()}
     *   <li>{@link BeneficiaryFlowStatus#getConsultantID()}
     *   <li>{@link BeneficiaryFlowStatus#getConsultantName()}
     *   <li>{@link BeneficiaryFlowStatus#getConsultationDate()}
     *   <li>{@link BeneficiaryFlowStatus#getCreatedBy()}
     *   <li>{@link BeneficiaryFlowStatus#getCreatedDate()}
     *   <li>{@link BeneficiaryFlowStatus#getDeleted()}
     *   <li>{@link BeneficiaryFlowStatus#getDistrictID()}
     *   <li>{@link BeneficiaryFlowStatus#getDistrictName()}
     *   <li>{@link BeneficiaryFlowStatus#getDoctorFlag()}
     *   <li>{@link BeneficiaryFlowStatus#getFatherName()}
     *   <li>{@link BeneficiaryFlowStatus#getFirstName()}
     *   <li>{@link BeneficiaryFlowStatus#getGenderID()}
     *   <li>{@link BeneficiaryFlowStatus#getGenderName()}
     *   <li>{@link BeneficiaryFlowStatus#getI_bendemographics()}
     *   <li>{@link BeneficiaryFlowStatus#getIsMobile()}
     *   <li>{@link BeneficiaryFlowStatus#getLabIteration()}
     *   <li>{@link BeneficiaryFlowStatus#getLab_technician_flag()}
     *   <li>{@link BeneficiaryFlowStatus#getLastName()}
     *   <li>{@link BeneficiaryFlowStatus#getM_gender()}
     *   <li>{@link BeneficiaryFlowStatus#getMasterVan()}
     *   <li>{@link BeneficiaryFlowStatus#getModified_by()}
     *   <li>{@link BeneficiaryFlowStatus#getModified_date()}
     *   <li>{@link BeneficiaryFlowStatus#getNurseFlag()}
     *   <li>{@link BeneficiaryFlowStatus#getOncologist_flag()}
     *   <li>{@link BeneficiaryFlowStatus#getParkingPlaceID()}
     *   <li>{@link BeneficiaryFlowStatus#getPassToNurse()}
     *   <li>{@link BeneficiaryFlowStatus#getPharmacist_flag()}
     *   <li>{@link BeneficiaryFlowStatus#getPreferredPhoneNum()}
     *   <li>{@link BeneficiaryFlowStatus#getProcessed()}
     *   <li>{@link BeneficiaryFlowStatus#getProviderServiceMapID()}
     *   <li>{@link BeneficiaryFlowStatus#getProviderServiceMapId()}
     *   <li>{@link BeneficiaryFlowStatus#getRadiologist_flag()}
     *   <li>{@link BeneficiaryFlowStatus#getReferredVisitCode()}
     *   <li>{@link BeneficiaryFlowStatus#getReferred_visit_id()}
     *   <li>{@link BeneficiaryFlowStatus#getRegistrationDate()}
     *   <li>{@link BeneficiaryFlowStatus#getReservedForChange()}
     *   <li>{@link BeneficiaryFlowStatus#getServiceDate()}
     *   <li>{@link BeneficiaryFlowStatus#getServicePointID()}
     *   <li>{@link BeneficiaryFlowStatus#getServicePointName()}
     *   <li>{@link BeneficiaryFlowStatus#getSpecialist_flag()}
     *   <li>{@link BeneficiaryFlowStatus#getSpouseName()}
     *   <li>{@link BeneficiaryFlowStatus#getSyncedBy()}
     *   <li>{@link BeneficiaryFlowStatus#getSyncedDate()}
     *   <li>{@link BeneficiaryFlowStatus#getVanID()}
     *   <li>{@link BeneficiaryFlowStatus#getVanNo()}
     *   <li>{@link BeneficiaryFlowStatus#getVanSerialNo()}
     *   <li>{@link BeneficiaryFlowStatus#getVehicalNo()}
     *   <li>{@link BeneficiaryFlowStatus#getVillageID()}
     *   <li>{@link BeneficiaryFlowStatus#getVillageName()}
     *   <li>{@link BeneficiaryFlowStatus#getVisitCategory()}
     *   <li>{@link BeneficiaryFlowStatus#getVisitCode()}
     *   <li>{@link BeneficiaryFlowStatus#getVisitDate()}
     *   <li>{@link BeneficiaryFlowStatus#getVisitReason()}
     *   <li>{@link BeneficiaryFlowStatus#getVisitSession()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        BeneficiaryFlowStatus actualBeneficiaryFlowStatus = new BeneficiaryFlowStatus(1L, 1L, 1L, mock(Timestamp.class),
                (short) 1, "Just cause", "Visit Category");
        actualBeneficiaryFlowStatus.setAge("Age");
        actualBeneficiaryFlowStatus.setAgeVal(42);
        actualBeneficiaryFlowStatus.setAgentId("42");
        actualBeneficiaryFlowStatus.setBenArrivedFlag(true);
        actualBeneficiaryFlowStatus.setBenFlowID(1L);
        actualBeneficiaryFlowStatus.setBenImage("Ben Image");
        actualBeneficiaryFlowStatus.setBenName("Ben Name");
        ArrayList<BenPhoneMaps> benPhoneMaps = new ArrayList<>();
        actualBeneficiaryFlowStatus.setBenPhoneMaps(benPhoneMaps);
        actualBeneficiaryFlowStatus.setBenVisitCode(1L);
        Timestamp benVisitDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setBenVisitDate(benVisitDate);
        actualBeneficiaryFlowStatus.setBenVisitID(1L);
        actualBeneficiaryFlowStatus.setBenVisitNo((short) 1);
        actualBeneficiaryFlowStatus.setBen_age_val(42);
        actualBeneficiaryFlowStatus.setBeneficiaryID(1L);
        actualBeneficiaryFlowStatus.setBeneficiaryName("Beneficiary Name");
        actualBeneficiaryFlowStatus.setBeneficiaryRegID(1L);
        actualBeneficiaryFlowStatus.setBloodGroup("Blood Group");
        actualBeneficiaryFlowStatus.setConsultantID(1);
        actualBeneficiaryFlowStatus.setConsultantName("Consultant Name");
        Timestamp consultationDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setConsultationDate(consultationDate);
        actualBeneficiaryFlowStatus.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setCreatedDate(createdDate);
        actualBeneficiaryFlowStatus.setDeleted(true);
        actualBeneficiaryFlowStatus.setDistrictID(1);
        actualBeneficiaryFlowStatus.setDistrictName("District Name");
        actualBeneficiaryFlowStatus.setDoctorFlag((short) 1);
        actualBeneficiaryFlowStatus.setFatherName("Father Name");
        actualBeneficiaryFlowStatus.setFirstName("Jane");
        actualBeneficiaryFlowStatus.setGenderID((short) 1);
        actualBeneficiaryFlowStatus.setGenderName("Gender Name");
        I_bendemographics i_bendemographics = new I_bendemographics();
        i_bendemographics.setDistrictBranchID(1);
        i_bendemographics.setDistrictBranchName("janedoe/featurebranch");
        i_bendemographics.setDistrictID(1);
        i_bendemographics.setDistrictName("District Name");
        i_bendemographics.setServicePointID(1);
        i_bendemographics.setServicePointName("Service Point Name");
        actualBeneficiaryFlowStatus.setI_bendemographics(i_bendemographics);
        actualBeneficiaryFlowStatus.setIsMobile(true);
        actualBeneficiaryFlowStatus.setLabIteration((short) 1);
        actualBeneficiaryFlowStatus.setLab_technician_flag((short) 1);
        actualBeneficiaryFlowStatus.setLastName("Doe");
        GenderMaster m_gender = new GenderMaster();
        m_gender.setDeleted(true);
        m_gender.setGenderID((short) 1);
        m_gender.setGenderName("Gender Name");
        actualBeneficiaryFlowStatus.setM_gender(m_gender);
        MasterVan masterVan = new MasterVan();
        masterVan.setDeleted(true);
        masterVan.setFacilityID(1);
        masterVan.setIsFacility(true);
        masterVan.setParkingPlaceID(1);
        masterVan.setProviderServiceMapID(1);
        masterVan.setVanID(1);
        masterVan.setVanName("Van Name");
        masterVan.setVehicalNo("Vehical No");
        masterVan.setVideoConsultationEmailID("jane.doe@example.org");
        actualBeneficiaryFlowStatus.setMasterVan(masterVan);
        actualBeneficiaryFlowStatus.setModified_by("Jan 1, 2020 9:00am GMT+0100");
        Timestamp modified_date = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setModified_date(modified_date);
        actualBeneficiaryFlowStatus.setNurseFlag((short) 1);
        actualBeneficiaryFlowStatus.setOncologist_flag((short) 1);
        actualBeneficiaryFlowStatus.setParkingPlaceID(1);
        actualBeneficiaryFlowStatus.setPassToNurse(true);
        actualBeneficiaryFlowStatus.setPharmacist_flag((short) 1);
        actualBeneficiaryFlowStatus.setPreferredPhoneNum("6625550144");
        actualBeneficiaryFlowStatus.setProcessed("Processed");
        actualBeneficiaryFlowStatus.setProviderServiceMapID(1);
        actualBeneficiaryFlowStatus.setProviderServiceMapId(1);
        actualBeneficiaryFlowStatus.setRadiologist_flag((short) 1);
        actualBeneficiaryFlowStatus.setReferredVisitCode(1L);
        actualBeneficiaryFlowStatus.setReferred_visit_id(1L);
        Timestamp registrationDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setRegistrationDate(registrationDate);
        actualBeneficiaryFlowStatus.setReservedForChange("Reserved For Change");
        Timestamp serviceDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setServiceDate(serviceDate);
        actualBeneficiaryFlowStatus.setServicePointID(1);
        actualBeneficiaryFlowStatus.setServicePointName("Service Point Name");
        actualBeneficiaryFlowStatus.setSpecialist_flag((short) 1);
        actualBeneficiaryFlowStatus.setSpouseName("Spouse Name");
        actualBeneficiaryFlowStatus.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setSyncedDate(syncedDate);
        actualBeneficiaryFlowStatus.setVanID(1);
        actualBeneficiaryFlowStatus.setVanNo("Van No");
        actualBeneficiaryFlowStatus.setVanSerialNo(1L);
        actualBeneficiaryFlowStatus.setVehicalNo("Vehical No");
        actualBeneficiaryFlowStatus.setVillageID(1);
        actualBeneficiaryFlowStatus.setVillageName("Village Name");
        actualBeneficiaryFlowStatus.setVisitCategory("Visit Category");
        actualBeneficiaryFlowStatus.setVisitCode(1L);
        Timestamp visitDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setVisitDate(visitDate);
        actualBeneficiaryFlowStatus.setVisitReason("Just cause");
        actualBeneficiaryFlowStatus.setVisitSession(1);
        actualBeneficiaryFlowStatus.setdOB(mock(Timestamp.class));
        actualBeneficiaryFlowStatus.settCRequestDate(mock(Timestamp.class));
        actualBeneficiaryFlowStatus.settCSpecialistUserID(1);
        actualBeneficiaryFlowStatus.settC_SpecialistLabFlag((short) 1);
        String actualAge = actualBeneficiaryFlowStatus.getAge();
        Integer actualAgeVal = actualBeneficiaryFlowStatus.getAgeVal();
        String actualAgentId = actualBeneficiaryFlowStatus.getAgentId();
        Boolean actualBenArrivedFlag = actualBeneficiaryFlowStatus.getBenArrivedFlag();
        Long actualBenFlowID = actualBeneficiaryFlowStatus.getBenFlowID();
        String actualBenImage = actualBeneficiaryFlowStatus.getBenImage();
        String actualBenName = actualBeneficiaryFlowStatus.getBenName();
        List<BenPhoneMaps> actualBenPhoneMaps = actualBeneficiaryFlowStatus.getBenPhoneMaps();
        Long actualBenVisitCode = actualBeneficiaryFlowStatus.getBenVisitCode();
        Timestamp actualBenVisitDate = actualBeneficiaryFlowStatus.getBenVisitDate();
        Long actualBenVisitID = actualBeneficiaryFlowStatus.getBenVisitID();
        Short actualBenVisitNo = actualBeneficiaryFlowStatus.getBenVisitNo();
        Integer actualBen_age_val = actualBeneficiaryFlowStatus.getBen_age_val();
        Long actualBeneficiaryID = actualBeneficiaryFlowStatus.getBeneficiaryID();
        String actualBeneficiaryName = actualBeneficiaryFlowStatus.getBeneficiaryName();
        Long actualBeneficiaryRegID = actualBeneficiaryFlowStatus.getBeneficiaryRegID();
        String actualBloodGroup = actualBeneficiaryFlowStatus.getBloodGroup();
        Integer actualConsultantID = actualBeneficiaryFlowStatus.getConsultantID();
        String actualConsultantName = actualBeneficiaryFlowStatus.getConsultantName();
        Timestamp actualConsultationDate = actualBeneficiaryFlowStatus.getConsultationDate();
        String actualCreatedBy = actualBeneficiaryFlowStatus.getCreatedBy();
        Timestamp actualCreatedDate = actualBeneficiaryFlowStatus.getCreatedDate();
        Boolean actualDeleted = actualBeneficiaryFlowStatus.getDeleted();
        Integer actualDistrictID = actualBeneficiaryFlowStatus.getDistrictID();
        String actualDistrictName = actualBeneficiaryFlowStatus.getDistrictName();
        Short actualDoctorFlag = actualBeneficiaryFlowStatus.getDoctorFlag();
        String actualFatherName = actualBeneficiaryFlowStatus.getFatherName();
        String actualFirstName = actualBeneficiaryFlowStatus.getFirstName();
        Short actualGenderID = actualBeneficiaryFlowStatus.getGenderID();
        String actualGenderName = actualBeneficiaryFlowStatus.getGenderName();
        I_bendemographics actualI_bendemographics = actualBeneficiaryFlowStatus.getI_bendemographics();
        Boolean actualIsMobile = actualBeneficiaryFlowStatus.getIsMobile();
        Short actualLabIteration = actualBeneficiaryFlowStatus.getLabIteration();
        Short actualLab_technician_flag = actualBeneficiaryFlowStatus.getLab_technician_flag();
        String actualLastName = actualBeneficiaryFlowStatus.getLastName();
        GenderMaster actualM_gender = actualBeneficiaryFlowStatus.getM_gender();
        MasterVan actualMasterVan = actualBeneficiaryFlowStatus.getMasterVan();
        String actualModified_by = actualBeneficiaryFlowStatus.getModified_by();
        Timestamp actualModified_date = actualBeneficiaryFlowStatus.getModified_date();
        Short actualNurseFlag = actualBeneficiaryFlowStatus.getNurseFlag();
        Short actualOncologist_flag = actualBeneficiaryFlowStatus.getOncologist_flag();
        Integer actualParkingPlaceID = actualBeneficiaryFlowStatus.getParkingPlaceID();
        Boolean actualPassToNurse = actualBeneficiaryFlowStatus.getPassToNurse();
        Short actualPharmacist_flag = actualBeneficiaryFlowStatus.getPharmacist_flag();
        String actualPreferredPhoneNum = actualBeneficiaryFlowStatus.getPreferredPhoneNum();
        String actualProcessed = actualBeneficiaryFlowStatus.getProcessed();
        Integer actualProviderServiceMapID = actualBeneficiaryFlowStatus.getProviderServiceMapID();
        Integer actualProviderServiceMapId = actualBeneficiaryFlowStatus.getProviderServiceMapId();
        Short actualRadiologist_flag = actualBeneficiaryFlowStatus.getRadiologist_flag();
        Long actualReferredVisitCode = actualBeneficiaryFlowStatus.getReferredVisitCode();
        Long actualReferred_visit_id = actualBeneficiaryFlowStatus.getReferred_visit_id();
        Timestamp actualRegistrationDate = actualBeneficiaryFlowStatus.getRegistrationDate();
        String actualReservedForChange = actualBeneficiaryFlowStatus.getReservedForChange();
        Timestamp actualServiceDate = actualBeneficiaryFlowStatus.getServiceDate();
        Integer actualServicePointID = actualBeneficiaryFlowStatus.getServicePointID();
        String actualServicePointName = actualBeneficiaryFlowStatus.getServicePointName();
        Short actualSpecialist_flag = actualBeneficiaryFlowStatus.getSpecialist_flag();
        String actualSpouseName = actualBeneficiaryFlowStatus.getSpouseName();
        String actualSyncedBy = actualBeneficiaryFlowStatus.getSyncedBy();
        Timestamp actualSyncedDate = actualBeneficiaryFlowStatus.getSyncedDate();
        Integer actualVanID = actualBeneficiaryFlowStatus.getVanID();
        String actualVanNo = actualBeneficiaryFlowStatus.getVanNo();
        Long actualVanSerialNo = actualBeneficiaryFlowStatus.getVanSerialNo();
        String actualVehicalNo = actualBeneficiaryFlowStatus.getVehicalNo();
        Integer actualVillageID = actualBeneficiaryFlowStatus.getVillageID();
        String actualVillageName = actualBeneficiaryFlowStatus.getVillageName();
        String actualVisitCategory = actualBeneficiaryFlowStatus.getVisitCategory();
        Long actualVisitCode = actualBeneficiaryFlowStatus.getVisitCode();
        Timestamp actualVisitDate = actualBeneficiaryFlowStatus.getVisitDate();
        String actualVisitReason = actualBeneficiaryFlowStatus.getVisitReason();
        Integer actualVisitSession = actualBeneficiaryFlowStatus.getVisitSession();

        // Assert that nothing has changed
        assertEquals("42", actualAgentId);
        assertEquals("6625550144", actualPreferredPhoneNum);
        assertEquals("Age", actualAge);
        assertEquals("Ben Image", actualBenImage);
        assertEquals("Ben Name", actualBenName);
        assertEquals("Beneficiary Name", actualBeneficiaryName);
        assertEquals("Blood Group", actualBloodGroup);
        assertEquals("Consultant Name", actualConsultantName);
        assertEquals("District Name", actualDistrictName);
        assertEquals("Doe", actualLastName);
        assertEquals("Father Name", actualFatherName);
        assertEquals("Gender Name", actualGenderName);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModified_by);
        assertEquals("Jane", actualFirstName);
        assertEquals("Just cause", actualVisitReason);
        assertEquals("Processed", actualProcessed);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Service Point Name", actualServicePointName);
        assertEquals("Spouse Name", actualSpouseName);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Van No", actualVanNo);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals("Village Name", actualVillageName);
        assertEquals("Visit Category", actualVisitCategory);
        assertEquals(1, actualConsultantID.intValue());
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualProviderServiceMapId.intValue());
        assertEquals(1, actualServicePointID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1, actualVillageID.intValue());
        assertEquals(1, actualVisitSession.intValue());
        assertEquals(1L, actualBenFlowID.longValue());
        assertEquals(1L, actualBenVisitCode.longValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualReferredVisitCode.longValue());
        assertEquals(1L, actualReferred_visit_id.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertEquals((short) 1, actualBenVisitNo.shortValue());
        assertEquals((short) 1, actualDoctorFlag.shortValue());
        assertEquals((short) 1, actualGenderID.shortValue());
        assertEquals((short) 1, actualLabIteration.shortValue());
        assertEquals((short) 1, actualLab_technician_flag.shortValue());
        assertEquals((short) 1, actualNurseFlag.shortValue());
        assertEquals((short) 1, actualOncologist_flag.shortValue());
        assertEquals((short) 1, actualPharmacist_flag.shortValue());
        assertEquals((short) 1, actualRadiologist_flag.shortValue());
        assertEquals((short) 1, actualSpecialist_flag.shortValue());
        assertEquals(42, actualAgeVal.intValue());
        assertEquals(42, actualBen_age_val.intValue());
        assertTrue(actualBenArrivedFlag);
        assertTrue(actualDeleted);
        assertTrue(actualIsMobile);
        assertTrue(actualPassToNurse);
        assertSame(i_bendemographics, actualI_bendemographics);
        assertSame(masterVan, actualMasterVan);
        assertSame(m_gender, actualM_gender);
        assertSame(benPhoneMaps, actualBenPhoneMaps);
        assertSame(benVisitDate, actualBenVisitDate);
        assertSame(consultationDate, actualConsultationDate);
        assertSame(createdDate, actualCreatedDate);
        assertSame(modified_date, actualModified_date);
        assertSame(registrationDate, actualRegistrationDate);
        assertSame(serviceDate, actualServiceDate);
        assertSame(syncedDate, actualSyncedDate);
        assertSame(visitDate, actualVisitDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link BeneficiaryFlowStatus#BeneficiaryFlowStatus(Long, Long, Timestamp, String, String, Integer, Short, String, String, String, Long, String, String, String, Long, Timestamp, Timestamp, Long, Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setAge(String)}
     *   <li>{@link BeneficiaryFlowStatus#setAgeVal(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setAgentId(String)}
     *   <li>{@link BeneficiaryFlowStatus#setBenArrivedFlag(Boolean)}
     *   <li>{@link BeneficiaryFlowStatus#setBenFlowID(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setBenImage(String)}
     *   <li>{@link BeneficiaryFlowStatus#setBenName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setBenPhoneMaps(List)}
     *   <li>{@link BeneficiaryFlowStatus#setBenVisitCode(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setBenVisitDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setBenVisitID(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setBenVisitNo(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setBen_age_val(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setBeneficiaryID(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setBeneficiaryName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setBeneficiaryRegID(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setBloodGroup(String)}
     *   <li>{@link BeneficiaryFlowStatus#setConsultantID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setConsultantName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setConsultationDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setCreatedBy(String)}
     *   <li>{@link BeneficiaryFlowStatus#setCreatedDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setDeleted(Boolean)}
     *   <li>{@link BeneficiaryFlowStatus#setDistrictID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setDistrictName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setDoctorFlag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setFatherName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setFirstName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setGenderID(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setGenderName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setI_bendemographics(I_bendemographics)}
     *   <li>{@link BeneficiaryFlowStatus#setIsMobile(Boolean)}
     *   <li>{@link BeneficiaryFlowStatus#setLabIteration(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setLab_technician_flag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setLastName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setM_gender(GenderMaster)}
     *   <li>{@link BeneficiaryFlowStatus#setMasterVan(MasterVan)}
     *   <li>{@link BeneficiaryFlowStatus#setModified_by(String)}
     *   <li>{@link BeneficiaryFlowStatus#setModified_date(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setNurseFlag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setOncologist_flag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setParkingPlaceID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setPassToNurse(Boolean)}
     *   <li>{@link BeneficiaryFlowStatus#setPharmacist_flag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setPreferredPhoneNum(String)}
     *   <li>{@link BeneficiaryFlowStatus#setProcessed(String)}
     *   <li>{@link BeneficiaryFlowStatus#setProviderServiceMapID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setProviderServiceMapId(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setRadiologist_flag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setReferredVisitCode(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setReferred_visit_id(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setRegistrationDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setReservedForChange(String)}
     *   <li>{@link BeneficiaryFlowStatus#setServiceDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setServicePointID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setServicePointName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setSpecialist_flag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#setSpouseName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setSyncedBy(String)}
     *   <li>{@link BeneficiaryFlowStatus#setSyncedDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setVanID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setVanNo(String)}
     *   <li>{@link BeneficiaryFlowStatus#setVanSerialNo(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setVehicalNo(String)}
     *   <li>{@link BeneficiaryFlowStatus#setVillageID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setVillageName(String)}
     *   <li>{@link BeneficiaryFlowStatus#setVisitCategory(String)}
     *   <li>{@link BeneficiaryFlowStatus#setVisitCode(Long)}
     *   <li>{@link BeneficiaryFlowStatus#setVisitDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#setVisitReason(String)}
     *   <li>{@link BeneficiaryFlowStatus#setVisitSession(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#setdOB(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#settCRequestDate(Timestamp)}
     *   <li>{@link BeneficiaryFlowStatus#settCSpecialistUserID(Integer)}
     *   <li>{@link BeneficiaryFlowStatus#settC_SpecialistLabFlag(Short)}
     *   <li>{@link BeneficiaryFlowStatus#getAge()}
     *   <li>{@link BeneficiaryFlowStatus#getAgeVal()}
     *   <li>{@link BeneficiaryFlowStatus#getAgentId()}
     *   <li>{@link BeneficiaryFlowStatus#getBenArrivedFlag()}
     *   <li>{@link BeneficiaryFlowStatus#getBenFlowID()}
     *   <li>{@link BeneficiaryFlowStatus#getBenImage()}
     *   <li>{@link BeneficiaryFlowStatus#getBenName()}
     *   <li>{@link BeneficiaryFlowStatus#getBenPhoneMaps()}
     *   <li>{@link BeneficiaryFlowStatus#getBenVisitCode()}
     *   <li>{@link BeneficiaryFlowStatus#getBenVisitDate()}
     *   <li>{@link BeneficiaryFlowStatus#getBenVisitID()}
     *   <li>{@link BeneficiaryFlowStatus#getBenVisitNo()}
     *   <li>{@link BeneficiaryFlowStatus#getBen_age_val()}
     *   <li>{@link BeneficiaryFlowStatus#getBeneficiaryID()}
     *   <li>{@link BeneficiaryFlowStatus#getBeneficiaryName()}
     *   <li>{@link BeneficiaryFlowStatus#getBeneficiaryRegID()}
     *   <li>{@link BeneficiaryFlowStatus#getBloodGroup()}
     *   <li>{@link BeneficiaryFlowStatus#getConsultantID()}
     *   <li>{@link BeneficiaryFlowStatus#getConsultantName()}
     *   <li>{@link BeneficiaryFlowStatus#getConsultationDate()}
     *   <li>{@link BeneficiaryFlowStatus#getCreatedBy()}
     *   <li>{@link BeneficiaryFlowStatus#getCreatedDate()}
     *   <li>{@link BeneficiaryFlowStatus#getDeleted()}
     *   <li>{@link BeneficiaryFlowStatus#getDistrictID()}
     *   <li>{@link BeneficiaryFlowStatus#getDistrictName()}
     *   <li>{@link BeneficiaryFlowStatus#getDoctorFlag()}
     *   <li>{@link BeneficiaryFlowStatus#getFatherName()}
     *   <li>{@link BeneficiaryFlowStatus#getFirstName()}
     *   <li>{@link BeneficiaryFlowStatus#getGenderID()}
     *   <li>{@link BeneficiaryFlowStatus#getGenderName()}
     *   <li>{@link BeneficiaryFlowStatus#getI_bendemographics()}
     *   <li>{@link BeneficiaryFlowStatus#getIsMobile()}
     *   <li>{@link BeneficiaryFlowStatus#getLabIteration()}
     *   <li>{@link BeneficiaryFlowStatus#getLab_technician_flag()}
     *   <li>{@link BeneficiaryFlowStatus#getLastName()}
     *   <li>{@link BeneficiaryFlowStatus#getM_gender()}
     *   <li>{@link BeneficiaryFlowStatus#getMasterVan()}
     *   <li>{@link BeneficiaryFlowStatus#getModified_by()}
     *   <li>{@link BeneficiaryFlowStatus#getModified_date()}
     *   <li>{@link BeneficiaryFlowStatus#getNurseFlag()}
     *   <li>{@link BeneficiaryFlowStatus#getOncologist_flag()}
     *   <li>{@link BeneficiaryFlowStatus#getParkingPlaceID()}
     *   <li>{@link BeneficiaryFlowStatus#getPassToNurse()}
     *   <li>{@link BeneficiaryFlowStatus#getPharmacist_flag()}
     *   <li>{@link BeneficiaryFlowStatus#getPreferredPhoneNum()}
     *   <li>{@link BeneficiaryFlowStatus#getProcessed()}
     *   <li>{@link BeneficiaryFlowStatus#getProviderServiceMapID()}
     *   <li>{@link BeneficiaryFlowStatus#getProviderServiceMapId()}
     *   <li>{@link BeneficiaryFlowStatus#getRadiologist_flag()}
     *   <li>{@link BeneficiaryFlowStatus#getReferredVisitCode()}
     *   <li>{@link BeneficiaryFlowStatus#getReferred_visit_id()}
     *   <li>{@link BeneficiaryFlowStatus#getRegistrationDate()}
     *   <li>{@link BeneficiaryFlowStatus#getReservedForChange()}
     *   <li>{@link BeneficiaryFlowStatus#getServiceDate()}
     *   <li>{@link BeneficiaryFlowStatus#getServicePointID()}
     *   <li>{@link BeneficiaryFlowStatus#getServicePointName()}
     *   <li>{@link BeneficiaryFlowStatus#getSpecialist_flag()}
     *   <li>{@link BeneficiaryFlowStatus#getSpouseName()}
     *   <li>{@link BeneficiaryFlowStatus#getSyncedBy()}
     *   <li>{@link BeneficiaryFlowStatus#getSyncedDate()}
     *   <li>{@link BeneficiaryFlowStatus#getVanID()}
     *   <li>{@link BeneficiaryFlowStatus#getVanNo()}
     *   <li>{@link BeneficiaryFlowStatus#getVanSerialNo()}
     *   <li>{@link BeneficiaryFlowStatus#getVehicalNo()}
     *   <li>{@link BeneficiaryFlowStatus#getVillageID()}
     *   <li>{@link BeneficiaryFlowStatus#getVillageName()}
     *   <li>{@link BeneficiaryFlowStatus#getVisitCategory()}
     *   <li>{@link BeneficiaryFlowStatus#getVisitCode()}
     *   <li>{@link BeneficiaryFlowStatus#getVisitDate()}
     *   <li>{@link BeneficiaryFlowStatus#getVisitReason()}
     *   <li>{@link BeneficiaryFlowStatus#getVisitSession()}
     * </ul>
     */
    @Test
    void testGettersAndSetters3() {
        // Arrange and Act
        BeneficiaryFlowStatus actualBeneficiaryFlowStatus = new BeneficiaryFlowStatus(1L, 1L, mock(Timestamp.class),
                "Ben Name", "Age", 42, (short) 1, "Gender Name", "Village Name", "District Name", 1L, "Service Point",
                "Just cause", "Visit Category", 1L, mock(Timestamp.class), mock(Timestamp.class), 1L, mock(Timestamp.class));
        actualBeneficiaryFlowStatus.setAge("Age");
        actualBeneficiaryFlowStatus.setAgeVal(42);
        actualBeneficiaryFlowStatus.setAgentId("42");
        actualBeneficiaryFlowStatus.setBenArrivedFlag(true);
        actualBeneficiaryFlowStatus.setBenFlowID(1L);
        actualBeneficiaryFlowStatus.setBenImage("Ben Image");
        actualBeneficiaryFlowStatus.setBenName("Ben Name");
        ArrayList<BenPhoneMaps> benPhoneMaps = new ArrayList<>();
        actualBeneficiaryFlowStatus.setBenPhoneMaps(benPhoneMaps);
        actualBeneficiaryFlowStatus.setBenVisitCode(1L);
        Timestamp benVisitDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setBenVisitDate(benVisitDate);
        actualBeneficiaryFlowStatus.setBenVisitID(1L);
        actualBeneficiaryFlowStatus.setBenVisitNo((short) 1);
        actualBeneficiaryFlowStatus.setBen_age_val(42);
        actualBeneficiaryFlowStatus.setBeneficiaryID(1L);
        actualBeneficiaryFlowStatus.setBeneficiaryName("Beneficiary Name");
        actualBeneficiaryFlowStatus.setBeneficiaryRegID(1L);
        actualBeneficiaryFlowStatus.setBloodGroup("Blood Group");
        actualBeneficiaryFlowStatus.setConsultantID(1);
        actualBeneficiaryFlowStatus.setConsultantName("Consultant Name");
        Timestamp consultationDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setConsultationDate(consultationDate);
        actualBeneficiaryFlowStatus.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setCreatedDate(createdDate);
        actualBeneficiaryFlowStatus.setDeleted(true);
        actualBeneficiaryFlowStatus.setDistrictID(1);
        actualBeneficiaryFlowStatus.setDistrictName("District Name");
        actualBeneficiaryFlowStatus.setDoctorFlag((short) 1);
        actualBeneficiaryFlowStatus.setFatherName("Father Name");
        actualBeneficiaryFlowStatus.setFirstName("Jane");
        actualBeneficiaryFlowStatus.setGenderID((short) 1);
        actualBeneficiaryFlowStatus.setGenderName("Gender Name");
        I_bendemographics i_bendemographics = new I_bendemographics();
        i_bendemographics.setDistrictBranchID(1);
        i_bendemographics.setDistrictBranchName("janedoe/featurebranch");
        i_bendemographics.setDistrictID(1);
        i_bendemographics.setDistrictName("District Name");
        i_bendemographics.setServicePointID(1);
        i_bendemographics.setServicePointName("Service Point Name");
        actualBeneficiaryFlowStatus.setI_bendemographics(i_bendemographics);
        actualBeneficiaryFlowStatus.setIsMobile(true);
        actualBeneficiaryFlowStatus.setLabIteration((short) 1);
        actualBeneficiaryFlowStatus.setLab_technician_flag((short) 1);
        actualBeneficiaryFlowStatus.setLastName("Doe");
        GenderMaster m_gender = new GenderMaster();
        m_gender.setDeleted(true);
        m_gender.setGenderID((short) 1);
        m_gender.setGenderName("Gender Name");
        actualBeneficiaryFlowStatus.setM_gender(m_gender);
        MasterVan masterVan = new MasterVan();
        masterVan.setDeleted(true);
        masterVan.setFacilityID(1);
        masterVan.setIsFacility(true);
        masterVan.setParkingPlaceID(1);
        masterVan.setProviderServiceMapID(1);
        masterVan.setVanID(1);
        masterVan.setVanName("Van Name");
        masterVan.setVehicalNo("Vehical No");
        masterVan.setVideoConsultationEmailID("jane.doe@example.org");
        actualBeneficiaryFlowStatus.setMasterVan(masterVan);
        actualBeneficiaryFlowStatus.setModified_by("Jan 1, 2020 9:00am GMT+0100");
        Timestamp modified_date = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setModified_date(modified_date);
        actualBeneficiaryFlowStatus.setNurseFlag((short) 1);
        actualBeneficiaryFlowStatus.setOncologist_flag((short) 1);
        actualBeneficiaryFlowStatus.setParkingPlaceID(1);
        actualBeneficiaryFlowStatus.setPassToNurse(true);
        actualBeneficiaryFlowStatus.setPharmacist_flag((short) 1);
        actualBeneficiaryFlowStatus.setPreferredPhoneNum("6625550144");
        actualBeneficiaryFlowStatus.setProcessed("Processed");
        actualBeneficiaryFlowStatus.setProviderServiceMapID(1);
        actualBeneficiaryFlowStatus.setProviderServiceMapId(1);
        actualBeneficiaryFlowStatus.setRadiologist_flag((short) 1);
        actualBeneficiaryFlowStatus.setReferredVisitCode(1L);
        actualBeneficiaryFlowStatus.setReferred_visit_id(1L);
        Timestamp registrationDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setRegistrationDate(registrationDate);
        actualBeneficiaryFlowStatus.setReservedForChange("Reserved For Change");
        Timestamp serviceDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setServiceDate(serviceDate);
        actualBeneficiaryFlowStatus.setServicePointID(1);
        actualBeneficiaryFlowStatus.setServicePointName("Service Point Name");
        actualBeneficiaryFlowStatus.setSpecialist_flag((short) 1);
        actualBeneficiaryFlowStatus.setSpouseName("Spouse Name");
        actualBeneficiaryFlowStatus.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setSyncedDate(syncedDate);
        actualBeneficiaryFlowStatus.setVanID(1);
        actualBeneficiaryFlowStatus.setVanNo("Van No");
        actualBeneficiaryFlowStatus.setVanSerialNo(1L);
        actualBeneficiaryFlowStatus.setVehicalNo("Vehical No");
        actualBeneficiaryFlowStatus.setVillageID(1);
        actualBeneficiaryFlowStatus.setVillageName("Village Name");
        actualBeneficiaryFlowStatus.setVisitCategory("Visit Category");
        actualBeneficiaryFlowStatus.setVisitCode(1L);
        Timestamp visitDate = mock(Timestamp.class);
        actualBeneficiaryFlowStatus.setVisitDate(visitDate);
        actualBeneficiaryFlowStatus.setVisitReason("Just cause");
        actualBeneficiaryFlowStatus.setVisitSession(1);
        actualBeneficiaryFlowStatus.setdOB(mock(Timestamp.class));
        actualBeneficiaryFlowStatus.settCRequestDate(mock(Timestamp.class));
        actualBeneficiaryFlowStatus.settCSpecialistUserID(1);
        actualBeneficiaryFlowStatus.settC_SpecialistLabFlag((short) 1);
        String actualAge = actualBeneficiaryFlowStatus.getAge();
        Integer actualAgeVal = actualBeneficiaryFlowStatus.getAgeVal();
        String actualAgentId = actualBeneficiaryFlowStatus.getAgentId();
        Boolean actualBenArrivedFlag = actualBeneficiaryFlowStatus.getBenArrivedFlag();
        Long actualBenFlowID = actualBeneficiaryFlowStatus.getBenFlowID();
        String actualBenImage = actualBeneficiaryFlowStatus.getBenImage();
        String actualBenName = actualBeneficiaryFlowStatus.getBenName();
        List<BenPhoneMaps> actualBenPhoneMaps = actualBeneficiaryFlowStatus.getBenPhoneMaps();
        Long actualBenVisitCode = actualBeneficiaryFlowStatus.getBenVisitCode();
        Timestamp actualBenVisitDate = actualBeneficiaryFlowStatus.getBenVisitDate();
        Long actualBenVisitID = actualBeneficiaryFlowStatus.getBenVisitID();
        Short actualBenVisitNo = actualBeneficiaryFlowStatus.getBenVisitNo();
        Integer actualBen_age_val = actualBeneficiaryFlowStatus.getBen_age_val();
        Long actualBeneficiaryID = actualBeneficiaryFlowStatus.getBeneficiaryID();
        String actualBeneficiaryName = actualBeneficiaryFlowStatus.getBeneficiaryName();
        Long actualBeneficiaryRegID = actualBeneficiaryFlowStatus.getBeneficiaryRegID();
        String actualBloodGroup = actualBeneficiaryFlowStatus.getBloodGroup();
        Integer actualConsultantID = actualBeneficiaryFlowStatus.getConsultantID();
        String actualConsultantName = actualBeneficiaryFlowStatus.getConsultantName();
        Timestamp actualConsultationDate = actualBeneficiaryFlowStatus.getConsultationDate();
        String actualCreatedBy = actualBeneficiaryFlowStatus.getCreatedBy();
        Timestamp actualCreatedDate = actualBeneficiaryFlowStatus.getCreatedDate();
        Boolean actualDeleted = actualBeneficiaryFlowStatus.getDeleted();
        Integer actualDistrictID = actualBeneficiaryFlowStatus.getDistrictID();
        String actualDistrictName = actualBeneficiaryFlowStatus.getDistrictName();
        Short actualDoctorFlag = actualBeneficiaryFlowStatus.getDoctorFlag();
        String actualFatherName = actualBeneficiaryFlowStatus.getFatherName();
        String actualFirstName = actualBeneficiaryFlowStatus.getFirstName();
        Short actualGenderID = actualBeneficiaryFlowStatus.getGenderID();
        String actualGenderName = actualBeneficiaryFlowStatus.getGenderName();
        I_bendemographics actualI_bendemographics = actualBeneficiaryFlowStatus.getI_bendemographics();
        Boolean actualIsMobile = actualBeneficiaryFlowStatus.getIsMobile();
        Short actualLabIteration = actualBeneficiaryFlowStatus.getLabIteration();
        Short actualLab_technician_flag = actualBeneficiaryFlowStatus.getLab_technician_flag();
        String actualLastName = actualBeneficiaryFlowStatus.getLastName();
        GenderMaster actualM_gender = actualBeneficiaryFlowStatus.getM_gender();
        MasterVan actualMasterVan = actualBeneficiaryFlowStatus.getMasterVan();
        String actualModified_by = actualBeneficiaryFlowStatus.getModified_by();
        Timestamp actualModified_date = actualBeneficiaryFlowStatus.getModified_date();
        Short actualNurseFlag = actualBeneficiaryFlowStatus.getNurseFlag();
        Short actualOncologist_flag = actualBeneficiaryFlowStatus.getOncologist_flag();
        Integer actualParkingPlaceID = actualBeneficiaryFlowStatus.getParkingPlaceID();
        Boolean actualPassToNurse = actualBeneficiaryFlowStatus.getPassToNurse();
        Short actualPharmacist_flag = actualBeneficiaryFlowStatus.getPharmacist_flag();
        String actualPreferredPhoneNum = actualBeneficiaryFlowStatus.getPreferredPhoneNum();
        String actualProcessed = actualBeneficiaryFlowStatus.getProcessed();
        Integer actualProviderServiceMapID = actualBeneficiaryFlowStatus.getProviderServiceMapID();
        Integer actualProviderServiceMapId = actualBeneficiaryFlowStatus.getProviderServiceMapId();
        Short actualRadiologist_flag = actualBeneficiaryFlowStatus.getRadiologist_flag();
        Long actualReferredVisitCode = actualBeneficiaryFlowStatus.getReferredVisitCode();
        Long actualReferred_visit_id = actualBeneficiaryFlowStatus.getReferred_visit_id();
        Timestamp actualRegistrationDate = actualBeneficiaryFlowStatus.getRegistrationDate();
        String actualReservedForChange = actualBeneficiaryFlowStatus.getReservedForChange();
        Timestamp actualServiceDate = actualBeneficiaryFlowStatus.getServiceDate();
        Integer actualServicePointID = actualBeneficiaryFlowStatus.getServicePointID();
        String actualServicePointName = actualBeneficiaryFlowStatus.getServicePointName();
        Short actualSpecialist_flag = actualBeneficiaryFlowStatus.getSpecialist_flag();
        String actualSpouseName = actualBeneficiaryFlowStatus.getSpouseName();
        String actualSyncedBy = actualBeneficiaryFlowStatus.getSyncedBy();
        Timestamp actualSyncedDate = actualBeneficiaryFlowStatus.getSyncedDate();
        Integer actualVanID = actualBeneficiaryFlowStatus.getVanID();
        String actualVanNo = actualBeneficiaryFlowStatus.getVanNo();
        Long actualVanSerialNo = actualBeneficiaryFlowStatus.getVanSerialNo();
        String actualVehicalNo = actualBeneficiaryFlowStatus.getVehicalNo();
        Integer actualVillageID = actualBeneficiaryFlowStatus.getVillageID();
        String actualVillageName = actualBeneficiaryFlowStatus.getVillageName();
        String actualVisitCategory = actualBeneficiaryFlowStatus.getVisitCategory();
        Long actualVisitCode = actualBeneficiaryFlowStatus.getVisitCode();
        Timestamp actualVisitDate = actualBeneficiaryFlowStatus.getVisitDate();
        String actualVisitReason = actualBeneficiaryFlowStatus.getVisitReason();
        Integer actualVisitSession = actualBeneficiaryFlowStatus.getVisitSession();

        // Assert that nothing has changed
        assertEquals("42", actualAgentId);
        assertEquals("6625550144", actualPreferredPhoneNum);
        assertEquals("Age", actualAge);
        assertEquals("Ben Image", actualBenImage);
        assertEquals("Ben Name", actualBenName);
        assertEquals("Beneficiary Name", actualBeneficiaryName);
        assertEquals("Blood Group", actualBloodGroup);
        assertEquals("Consultant Name", actualConsultantName);
        assertEquals("District Name", actualDistrictName);
        assertEquals("Doe", actualLastName);
        assertEquals("Father Name", actualFatherName);
        assertEquals("Gender Name", actualGenderName);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModified_by);
        assertEquals("Jane", actualFirstName);
        assertEquals("Just cause", actualVisitReason);
        assertEquals("Processed", actualProcessed);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Service Point Name", actualServicePointName);
        assertEquals("Spouse Name", actualSpouseName);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Van No", actualVanNo);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals("Village Name", actualVillageName);
        assertEquals("Visit Category", actualVisitCategory);
        assertEquals(1, actualConsultantID.intValue());
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualProviderServiceMapId.intValue());
        assertEquals(1, actualServicePointID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1, actualVillageID.intValue());
        assertEquals(1, actualVisitSession.intValue());
        assertEquals(1L, actualBenFlowID.longValue());
        assertEquals(1L, actualBenVisitCode.longValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualReferredVisitCode.longValue());
        assertEquals(1L, actualReferred_visit_id.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertEquals((short) 1, actualBenVisitNo.shortValue());
        assertEquals((short) 1, actualDoctorFlag.shortValue());
        assertEquals((short) 1, actualGenderID.shortValue());
        assertEquals((short) 1, actualLabIteration.shortValue());
        assertEquals((short) 1, actualLab_technician_flag.shortValue());
        assertEquals((short) 1, actualNurseFlag.shortValue());
        assertEquals((short) 1, actualOncologist_flag.shortValue());
        assertEquals((short) 1, actualPharmacist_flag.shortValue());
        assertEquals((short) 1, actualRadiologist_flag.shortValue());
        assertEquals((short) 1, actualSpecialist_flag.shortValue());
        assertEquals(42, actualAgeVal.intValue());
        assertEquals(42, actualBen_age_val.intValue());
        assertTrue(actualBenArrivedFlag);
        assertTrue(actualDeleted);
        assertTrue(actualIsMobile);
        assertTrue(actualPassToNurse);
        assertSame(i_bendemographics, actualI_bendemographics);
        assertSame(masterVan, actualMasterVan);
        assertSame(m_gender, actualM_gender);
        assertSame(benPhoneMaps, actualBenPhoneMaps);
        assertSame(benVisitDate, actualBenVisitDate);
        assertSame(consultationDate, actualConsultationDate);
        assertSame(createdDate, actualCreatedDate);
        assertSame(modified_date, actualModified_date);
        assertSame(registrationDate, actualRegistrationDate);
        assertSame(serviceDate, actualServiceDate);
        assertSame(syncedDate, actualSyncedDate);
        assertSame(visitDate, actualVisitDate);
    }
}
