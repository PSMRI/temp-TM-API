package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import com.iemr.tm.data.institution.Institute;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CancerDiagnosisDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CancerDiagnosis#CancerDiagnosis()}
     *   <li>{@link CancerDiagnosis#setBenVisitID(Long)}
     *   <li>{@link CancerDiagnosis#setBeneficiaryRegID(Long)}
     *   <li>{@link CancerDiagnosis#setCreatedBy(String)}
     *   <li>{@link CancerDiagnosis#setCreatedDate(Timestamp)}
     *   <li>{@link CancerDiagnosis#setDeleted(Boolean)}
     *   <li>{@link CancerDiagnosis#setID(Long)}
     *   <li>{@link CancerDiagnosis#setInstitute(Institute)}
     *   <li>{@link CancerDiagnosis#setLastModDate(Timestamp)}
     *   <li>{@link CancerDiagnosis#setModifiedBy(String)}
     *   <li>{@link CancerDiagnosis#setParkingPlaceID(Integer)}
     *   <li>{@link CancerDiagnosis#setProcessed(String)}
     *   <li>{@link CancerDiagnosis#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerDiagnosis#setProvisionalDiagnosisOncologist(String)}
     *   <li>{@link CancerDiagnosis#setProvisionalDiagnosisPrimaryDoctor(String)}
     *   <li>{@link CancerDiagnosis#setReferralReason(String)}
     *   <li>{@link CancerDiagnosis#setReferredToInstituteID(Integer)}
     *   <li>{@link CancerDiagnosis#setReferredToInstituteName(String)}
     *   <li>{@link CancerDiagnosis#setRefrredToAdditionalService(String)}
     *   <li>{@link CancerDiagnosis#setRefrredToAdditionalServiceList(List)}
     *   <li>{@link CancerDiagnosis#setRemarks(String)}
     *   <li>{@link CancerDiagnosis#setReservedForChange(String)}
     *   <li>{@link CancerDiagnosis#setRevisitDate(Timestamp)}
     *   <li>{@link CancerDiagnosis#setSyncedBy(String)}
     *   <li>{@link CancerDiagnosis#setSyncedDate(Timestamp)}
     *   <li>{@link CancerDiagnosis#setVanID(Integer)}
     *   <li>{@link CancerDiagnosis#setVanSerialNo(Long)}
     *   <li>{@link CancerDiagnosis#setVehicalNo(String)}
     *   <li>{@link CancerDiagnosis#setVisitCode(Long)}
     *   <li>{@link CancerDiagnosis#getBenVisitID()}
     *   <li>{@link CancerDiagnosis#getBeneficiaryRegID()}
     *   <li>{@link CancerDiagnosis#getCreatedBy()}
     *   <li>{@link CancerDiagnosis#getCreatedDate()}
     *   <li>{@link CancerDiagnosis#getDeleted()}
     *   <li>{@link CancerDiagnosis#getID()}
     *   <li>{@link CancerDiagnosis#getInstitute()}
     *   <li>{@link CancerDiagnosis#getLastModDate()}
     *   <li>{@link CancerDiagnosis#getModifiedBy()}
     *   <li>{@link CancerDiagnosis#getParkingPlaceID()}
     *   <li>{@link CancerDiagnosis#getProcessed()}
     *   <li>{@link CancerDiagnosis#getProviderServiceMapID()}
     *   <li>{@link CancerDiagnosis#getProvisionalDiagnosisOncologist()}
     *   <li>{@link CancerDiagnosis#getProvisionalDiagnosisPrimaryDoctor()}
     *   <li>{@link CancerDiagnosis#getReferralReason()}
     *   <li>{@link CancerDiagnosis#getReferredToInstituteID()}
     *   <li>{@link CancerDiagnosis#getReferredToInstituteName()}
     *   <li>{@link CancerDiagnosis#getRefrredToAdditionalService()}
     *   <li>{@link CancerDiagnosis#getRefrredToAdditionalServiceList()}
     *   <li>{@link CancerDiagnosis#getRemarks()}
     *   <li>{@link CancerDiagnosis#getReservedForChange()}
     *   <li>{@link CancerDiagnosis#getRevisitDate()}
     *   <li>{@link CancerDiagnosis#getSyncedBy()}
     *   <li>{@link CancerDiagnosis#getSyncedDate()}
     *   <li>{@link CancerDiagnosis#getVanID()}
     *   <li>{@link CancerDiagnosis#getVanSerialNo()}
     *   <li>{@link CancerDiagnosis#getVehicalNo()}
     *   <li>{@link CancerDiagnosis#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        CancerDiagnosis actualCancerDiagnosis = new CancerDiagnosis();
        actualCancerDiagnosis.setBenVisitID(1L);
        actualCancerDiagnosis.setBeneficiaryRegID(1L);
        actualCancerDiagnosis.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerDiagnosis.setCreatedDate(createdDate);
        actualCancerDiagnosis.setDeleted(true);
        actualCancerDiagnosis.setID(1L);
        Institute institute = new Institute();
        institute.setBlockID(1);
        institute.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        institute.setCreatedDate(mock(Timestamp.class));
        institute.setDeleted(true);
        institute.setDistrictBranchMappingID(1);
        institute.setDistrictID(1);
        institute.setInstitutionID(1);
        institute.setInstitutionName("Institution Name");
        institute.setLastModDate(mock(Timestamp.class));
        institute.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        institute.setProcessed("Processed");
        institute.setProviderServiceMapID(1);
        institute.setStateID(1);
        actualCancerDiagnosis.setInstitute(institute);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerDiagnosis.setLastModDate(lastModDate);
        actualCancerDiagnosis.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerDiagnosis.setParkingPlaceID(1);
        actualCancerDiagnosis.setProcessed("Processed");
        actualCancerDiagnosis.setProviderServiceMapID(1);
        actualCancerDiagnosis.setProvisionalDiagnosisOncologist("Provisional Diagnosis Oncologist");
        actualCancerDiagnosis.setProvisionalDiagnosisPrimaryDoctor("Provisional Diagnosis Primary Doctor");
        actualCancerDiagnosis.setReferralReason("Just cause");
        actualCancerDiagnosis.setReferredToInstituteID(1);
        actualCancerDiagnosis.setReferredToInstituteName("Referred To Institute Name");
        actualCancerDiagnosis.setRefrredToAdditionalService("Refrred To Additional Service");
        ArrayList<String> refrredToAdditionalServiceList = new ArrayList<>();
        actualCancerDiagnosis.setRefrredToAdditionalServiceList(refrredToAdditionalServiceList);
        actualCancerDiagnosis.setRemarks("Remarks");
        actualCancerDiagnosis.setReservedForChange("Reserved For Change");
        Timestamp revisitDate = mock(Timestamp.class);
        actualCancerDiagnosis.setRevisitDate(revisitDate);
        actualCancerDiagnosis.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerDiagnosis.setSyncedDate(syncedDate);
        actualCancerDiagnosis.setVanID(1);
        actualCancerDiagnosis.setVanSerialNo(1L);
        actualCancerDiagnosis.setVehicalNo("Vehical No");
        actualCancerDiagnosis.setVisitCode(1L);
        Long actualBenVisitID = actualCancerDiagnosis.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerDiagnosis.getBeneficiaryRegID();
        String actualCreatedBy = actualCancerDiagnosis.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerDiagnosis.getCreatedDate();
        Boolean actualDeleted = actualCancerDiagnosis.getDeleted();
        Long actualID = actualCancerDiagnosis.getID();
        Institute actualInstitute = actualCancerDiagnosis.getInstitute();
        Timestamp actualLastModDate = actualCancerDiagnosis.getLastModDate();
        String actualModifiedBy = actualCancerDiagnosis.getModifiedBy();
        Integer actualParkingPlaceID = actualCancerDiagnosis.getParkingPlaceID();
        String actualProcessed = actualCancerDiagnosis.getProcessed();
        Integer actualProviderServiceMapID = actualCancerDiagnosis.getProviderServiceMapID();
        String actualProvisionalDiagnosisOncologist = actualCancerDiagnosis.getProvisionalDiagnosisOncologist();
        String actualProvisionalDiagnosisPrimaryDoctor = actualCancerDiagnosis.getProvisionalDiagnosisPrimaryDoctor();
        String actualReferralReason = actualCancerDiagnosis.getReferralReason();
        Integer actualReferredToInstituteID = actualCancerDiagnosis.getReferredToInstituteID();
        String actualReferredToInstituteName = actualCancerDiagnosis.getReferredToInstituteName();
        String actualRefrredToAdditionalService = actualCancerDiagnosis.getRefrredToAdditionalService();
        List<String> actualRefrredToAdditionalServiceList = actualCancerDiagnosis.getRefrredToAdditionalServiceList();
        String actualRemarks = actualCancerDiagnosis.getRemarks();
        String actualReservedForChange = actualCancerDiagnosis.getReservedForChange();
        Timestamp actualRevisitDate = actualCancerDiagnosis.getRevisitDate();
        String actualSyncedBy = actualCancerDiagnosis.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerDiagnosis.getSyncedDate();
        Integer actualVanID = actualCancerDiagnosis.getVanID();
        Long actualVanSerialNo = actualCancerDiagnosis.getVanSerialNo();
        String actualVehicalNo = actualCancerDiagnosis.getVehicalNo();
        Long actualVisitCode = actualCancerDiagnosis.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Just cause", actualReferralReason);
        assertEquals("Processed", actualProcessed);
        assertEquals("Provisional Diagnosis Oncologist", actualProvisionalDiagnosisOncologist);
        assertEquals("Provisional Diagnosis Primary Doctor", actualProvisionalDiagnosisPrimaryDoctor);
        assertEquals("Referred To Institute Name", actualReferredToInstituteName);
        assertEquals("Refrred To Additional Service", actualRefrredToAdditionalService);
        assertEquals("Remarks", actualRemarks);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualReferredToInstituteID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualID.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertTrue(actualDeleted);
        assertSame(institute, actualInstitute);
        assertSame(refrredToAdditionalServiceList, actualRefrredToAdditionalServiceList);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(revisitDate, actualRevisitDate);
        assertSame(syncedDate, actualSyncedDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link CancerDiagnosis#CancerDiagnosis(Long, Long, Long, Integer, String, String, String, Integer, String, String, String)}
     *   <li>{@link CancerDiagnosis#setBenVisitID(Long)}
     *   <li>{@link CancerDiagnosis#setBeneficiaryRegID(Long)}
     *   <li>{@link CancerDiagnosis#setCreatedBy(String)}
     *   <li>{@link CancerDiagnosis#setCreatedDate(Timestamp)}
     *   <li>{@link CancerDiagnosis#setDeleted(Boolean)}
     *   <li>{@link CancerDiagnosis#setID(Long)}
     *   <li>{@link CancerDiagnosis#setInstitute(Institute)}
     *   <li>{@link CancerDiagnosis#setLastModDate(Timestamp)}
     *   <li>{@link CancerDiagnosis#setModifiedBy(String)}
     *   <li>{@link CancerDiagnosis#setParkingPlaceID(Integer)}
     *   <li>{@link CancerDiagnosis#setProcessed(String)}
     *   <li>{@link CancerDiagnosis#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerDiagnosis#setProvisionalDiagnosisOncologist(String)}
     *   <li>{@link CancerDiagnosis#setProvisionalDiagnosisPrimaryDoctor(String)}
     *   <li>{@link CancerDiagnosis#setReferralReason(String)}
     *   <li>{@link CancerDiagnosis#setReferredToInstituteID(Integer)}
     *   <li>{@link CancerDiagnosis#setReferredToInstituteName(String)}
     *   <li>{@link CancerDiagnosis#setRefrredToAdditionalService(String)}
     *   <li>{@link CancerDiagnosis#setRefrredToAdditionalServiceList(List)}
     *   <li>{@link CancerDiagnosis#setRemarks(String)}
     *   <li>{@link CancerDiagnosis#setReservedForChange(String)}
     *   <li>{@link CancerDiagnosis#setRevisitDate(Timestamp)}
     *   <li>{@link CancerDiagnosis#setSyncedBy(String)}
     *   <li>{@link CancerDiagnosis#setSyncedDate(Timestamp)}
     *   <li>{@link CancerDiagnosis#setVanID(Integer)}
     *   <li>{@link CancerDiagnosis#setVanSerialNo(Long)}
     *   <li>{@link CancerDiagnosis#setVehicalNo(String)}
     *   <li>{@link CancerDiagnosis#setVisitCode(Long)}
     *   <li>{@link CancerDiagnosis#getBenVisitID()}
     *   <li>{@link CancerDiagnosis#getBeneficiaryRegID()}
     *   <li>{@link CancerDiagnosis#getCreatedBy()}
     *   <li>{@link CancerDiagnosis#getCreatedDate()}
     *   <li>{@link CancerDiagnosis#getDeleted()}
     *   <li>{@link CancerDiagnosis#getID()}
     *   <li>{@link CancerDiagnosis#getInstitute()}
     *   <li>{@link CancerDiagnosis#getLastModDate()}
     *   <li>{@link CancerDiagnosis#getModifiedBy()}
     *   <li>{@link CancerDiagnosis#getParkingPlaceID()}
     *   <li>{@link CancerDiagnosis#getProcessed()}
     *   <li>{@link CancerDiagnosis#getProviderServiceMapID()}
     *   <li>{@link CancerDiagnosis#getProvisionalDiagnosisOncologist()}
     *   <li>{@link CancerDiagnosis#getProvisionalDiagnosisPrimaryDoctor()}
     *   <li>{@link CancerDiagnosis#getReferralReason()}
     *   <li>{@link CancerDiagnosis#getReferredToInstituteID()}
     *   <li>{@link CancerDiagnosis#getReferredToInstituteName()}
     *   <li>{@link CancerDiagnosis#getRefrredToAdditionalService()}
     *   <li>{@link CancerDiagnosis#getRefrredToAdditionalServiceList()}
     *   <li>{@link CancerDiagnosis#getRemarks()}
     *   <li>{@link CancerDiagnosis#getReservedForChange()}
     *   <li>{@link CancerDiagnosis#getRevisitDate()}
     *   <li>{@link CancerDiagnosis#getSyncedBy()}
     *   <li>{@link CancerDiagnosis#getSyncedDate()}
     *   <li>{@link CancerDiagnosis#getVanID()}
     *   <li>{@link CancerDiagnosis#getVanSerialNo()}
     *   <li>{@link CancerDiagnosis#getVehicalNo()}
     *   <li>{@link CancerDiagnosis#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        CancerDiagnosis actualCancerDiagnosis = new CancerDiagnosis(1L, 1L, 1L, 1, "Provisional Diagnosis Primary Doctor",
                "Provisional Diagnosis Oncologist", "Remarks", 1, "Referred To Institute Name", "Refrred To Additional Service",
                "Just cause");
        actualCancerDiagnosis.setBenVisitID(1L);
        actualCancerDiagnosis.setBeneficiaryRegID(1L);
        actualCancerDiagnosis.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerDiagnosis.setCreatedDate(createdDate);
        actualCancerDiagnosis.setDeleted(true);
        actualCancerDiagnosis.setID(1L);
        Institute institute = new Institute();
        institute.setBlockID(1);
        institute.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        institute.setCreatedDate(mock(Timestamp.class));
        institute.setDeleted(true);
        institute.setDistrictBranchMappingID(1);
        institute.setDistrictID(1);
        institute.setInstitutionID(1);
        institute.setInstitutionName("Institution Name");
        institute.setLastModDate(mock(Timestamp.class));
        institute.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        institute.setProcessed("Processed");
        institute.setProviderServiceMapID(1);
        institute.setStateID(1);
        actualCancerDiagnosis.setInstitute(institute);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerDiagnosis.setLastModDate(lastModDate);
        actualCancerDiagnosis.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerDiagnosis.setParkingPlaceID(1);
        actualCancerDiagnosis.setProcessed("Processed");
        actualCancerDiagnosis.setProviderServiceMapID(1);
        actualCancerDiagnosis.setProvisionalDiagnosisOncologist("Provisional Diagnosis Oncologist");
        actualCancerDiagnosis.setProvisionalDiagnosisPrimaryDoctor("Provisional Diagnosis Primary Doctor");
        actualCancerDiagnosis.setReferralReason("Just cause");
        actualCancerDiagnosis.setReferredToInstituteID(1);
        actualCancerDiagnosis.setReferredToInstituteName("Referred To Institute Name");
        actualCancerDiagnosis.setRefrredToAdditionalService("Refrred To Additional Service");
        ArrayList<String> refrredToAdditionalServiceList = new ArrayList<>();
        actualCancerDiagnosis.setRefrredToAdditionalServiceList(refrredToAdditionalServiceList);
        actualCancerDiagnosis.setRemarks("Remarks");
        actualCancerDiagnosis.setReservedForChange("Reserved For Change");
        Timestamp revisitDate = mock(Timestamp.class);
        actualCancerDiagnosis.setRevisitDate(revisitDate);
        actualCancerDiagnosis.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerDiagnosis.setSyncedDate(syncedDate);
        actualCancerDiagnosis.setVanID(1);
        actualCancerDiagnosis.setVanSerialNo(1L);
        actualCancerDiagnosis.setVehicalNo("Vehical No");
        actualCancerDiagnosis.setVisitCode(1L);
        Long actualBenVisitID = actualCancerDiagnosis.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerDiagnosis.getBeneficiaryRegID();
        String actualCreatedBy = actualCancerDiagnosis.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerDiagnosis.getCreatedDate();
        Boolean actualDeleted = actualCancerDiagnosis.getDeleted();
        Long actualID = actualCancerDiagnosis.getID();
        Institute actualInstitute = actualCancerDiagnosis.getInstitute();
        Timestamp actualLastModDate = actualCancerDiagnosis.getLastModDate();
        String actualModifiedBy = actualCancerDiagnosis.getModifiedBy();
        Integer actualParkingPlaceID = actualCancerDiagnosis.getParkingPlaceID();
        String actualProcessed = actualCancerDiagnosis.getProcessed();
        Integer actualProviderServiceMapID = actualCancerDiagnosis.getProviderServiceMapID();
        String actualProvisionalDiagnosisOncologist = actualCancerDiagnosis.getProvisionalDiagnosisOncologist();
        String actualProvisionalDiagnosisPrimaryDoctor = actualCancerDiagnosis.getProvisionalDiagnosisPrimaryDoctor();
        String actualReferralReason = actualCancerDiagnosis.getReferralReason();
        Integer actualReferredToInstituteID = actualCancerDiagnosis.getReferredToInstituteID();
        String actualReferredToInstituteName = actualCancerDiagnosis.getReferredToInstituteName();
        String actualRefrredToAdditionalService = actualCancerDiagnosis.getRefrredToAdditionalService();
        List<String> actualRefrredToAdditionalServiceList = actualCancerDiagnosis.getRefrredToAdditionalServiceList();
        String actualRemarks = actualCancerDiagnosis.getRemarks();
        String actualReservedForChange = actualCancerDiagnosis.getReservedForChange();
        Timestamp actualRevisitDate = actualCancerDiagnosis.getRevisitDate();
        String actualSyncedBy = actualCancerDiagnosis.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerDiagnosis.getSyncedDate();
        Integer actualVanID = actualCancerDiagnosis.getVanID();
        Long actualVanSerialNo = actualCancerDiagnosis.getVanSerialNo();
        String actualVehicalNo = actualCancerDiagnosis.getVehicalNo();
        Long actualVisitCode = actualCancerDiagnosis.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Just cause", actualReferralReason);
        assertEquals("Processed", actualProcessed);
        assertEquals("Provisional Diagnosis Oncologist", actualProvisionalDiagnosisOncologist);
        assertEquals("Provisional Diagnosis Primary Doctor", actualProvisionalDiagnosisPrimaryDoctor);
        assertEquals("Referred To Institute Name", actualReferredToInstituteName);
        assertEquals("Refrred To Additional Service", actualRefrredToAdditionalService);
        assertEquals("Remarks", actualRemarks);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualReferredToInstituteID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualID.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertTrue(actualDeleted);
        assertSame(institute, actualInstitute);
        assertSame(refrredToAdditionalServiceList, actualRefrredToAdditionalServiceList);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(revisitDate, actualRevisitDate);
        assertSame(syncedDate, actualSyncedDate);
    }
}
