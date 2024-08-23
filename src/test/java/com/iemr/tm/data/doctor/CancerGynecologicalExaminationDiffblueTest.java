package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CancerGynecologicalExaminationDiffblueTest {
    /**
     * Method under test: {@link CancerGynecologicalExamination#getrTIOrSTIDetail()}
     */
    @Test
    void testGetrTIOrSTIDetail() {
        // Arrange, Act and Assert
        assertNull((new CancerGynecologicalExamination()).getrTIOrSTIDetail());
    }

    /**
     * Method under test: {@link CancerGynecologicalExamination#getrTIOrSTIDetail()}
     */
    @Test
    void testGetrTIOrSTIDetail2() {
        // Arrange
        CancerGynecologicalExamination cancerGynecologicalExamination = new CancerGynecologicalExamination();
        cancerGynecologicalExamination.setAppearanceOfCervix("Appearance Of Cervix");
        cancerGynecologicalExamination.setBenVisitID(1L);
        cancerGynecologicalExamination.setBeneficiaryRegID(1L);
        cancerGynecologicalExamination.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        cancerGynecologicalExamination.setCreatedDate(mock(Timestamp.class));
        cancerGynecologicalExamination.setDeleted(true);
        cancerGynecologicalExamination.setExperiencedPostCoitalBleeding(true);
        cancerGynecologicalExamination.setFilePath("/directory/foo.txt");
        cancerGynecologicalExamination.setID(1L);
        cancerGynecologicalExamination.setLastModDate(mock(Timestamp.class));
        cancerGynecologicalExamination.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        cancerGynecologicalExamination.setObservation("Observation");
        cancerGynecologicalExamination.setParkingPlaceID(1);
        cancerGynecologicalExamination.setProcessed("Processed");
        cancerGynecologicalExamination.setProviderServiceMapID(1);
        cancerGynecologicalExamination.setReservedForChange("Reserved For Change");
        cancerGynecologicalExamination.setSufferedFromRTIOrSTI(true);
        cancerGynecologicalExamination.setSyncedBy("Synced By");
        cancerGynecologicalExamination.setSyncedDate(mock(Timestamp.class));
        cancerGynecologicalExamination.setTypeOfLesion("Type Of Lesion");
        cancerGynecologicalExamination.setTypeOfLesionList(new ArrayList<>());
        cancerGynecologicalExamination.setUterus_Normal(true);
        cancerGynecologicalExamination.setVaginalInvolvement(true);
        cancerGynecologicalExamination.setVanID(1);
        cancerGynecologicalExamination.setVanSerialNo(1L);
        cancerGynecologicalExamination.setVehicalNo("Vehical No");
        cancerGynecologicalExamination.setVisitCode(1L);
        cancerGynecologicalExamination.setVulvalInvolvement(true);
        cancerGynecologicalExamination.setrTIOrSTIDetail("R TIOr STIDetail");

        // Act and Assert
        assertEquals("R TIOr STIDetail", cancerGynecologicalExamination.getrTIOrSTIDetail());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CancerGynecologicalExamination#CancerGynecologicalExamination()}
     *   <li>{@link CancerGynecologicalExamination#setAppearanceOfCervix(String)}
     *   <li>{@link CancerGynecologicalExamination#setBenVisitID(Long)}
     *   <li>{@link CancerGynecologicalExamination#setBeneficiaryRegID(Long)}
     *   <li>{@link CancerGynecologicalExamination#setCreatedBy(String)}
     *   <li>{@link CancerGynecologicalExamination#setCreatedDate(Timestamp)}
     *   <li>{@link CancerGynecologicalExamination#setDeleted(Boolean)}
     *   <li>
     * {@link CancerGynecologicalExamination#setExperiencedPostCoitalBleeding(Boolean)}
     *   <li>{@link CancerGynecologicalExamination#setFilePath(String)}
     *   <li>{@link CancerGynecologicalExamination#setID(Long)}
     *   <li>{@link CancerGynecologicalExamination#setLastModDate(Timestamp)}
     *   <li>{@link CancerGynecologicalExamination#setModifiedBy(String)}
     *   <li>{@link CancerGynecologicalExamination#setObservation(String)}
     *   <li>{@link CancerGynecologicalExamination#setParkingPlaceID(Integer)}
     *   <li>{@link CancerGynecologicalExamination#setProcessed(String)}
     *   <li>{@link CancerGynecologicalExamination#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerGynecologicalExamination#setReservedForChange(String)}
     *   <li>{@link CancerGynecologicalExamination#setSufferedFromRTIOrSTI(Boolean)}
     *   <li>{@link CancerGynecologicalExamination#setSyncedBy(String)}
     *   <li>{@link CancerGynecologicalExamination#setSyncedDate(Timestamp)}
     *   <li>{@link CancerGynecologicalExamination#setTypeOfLesion(String)}
     *   <li>{@link CancerGynecologicalExamination#setTypeOfLesionList(List)}
     *   <li>{@link CancerGynecologicalExamination#setUterus_Normal(Boolean)}
     *   <li>{@link CancerGynecologicalExamination#setVaginalInvolvement(Boolean)}
     *   <li>{@link CancerGynecologicalExamination#setVanID(Integer)}
     *   <li>{@link CancerGynecologicalExamination#setVanSerialNo(Long)}
     *   <li>{@link CancerGynecologicalExamination#setVehicalNo(String)}
     *   <li>{@link CancerGynecologicalExamination#setVisitCode(Long)}
     *   <li>{@link CancerGynecologicalExamination#setVulvalInvolvement(Boolean)}
     *   <li>{@link CancerGynecologicalExamination#setrTIOrSTIDetail(String)}
     *   <li>{@link CancerGynecologicalExamination#getAppearanceOfCervix()}
     *   <li>{@link CancerGynecologicalExamination#getBenVisitID()}
     *   <li>{@link CancerGynecologicalExamination#getBeneficiaryRegID()}
     *   <li>{@link CancerGynecologicalExamination#getCreatedBy()}
     *   <li>{@link CancerGynecologicalExamination#getCreatedDate()}
     *   <li>{@link CancerGynecologicalExamination#getDeleted()}
     *   <li>{@link CancerGynecologicalExamination#getExperiencedPostCoitalBleeding()}
     *   <li>{@link CancerGynecologicalExamination#getFilePath()}
     *   <li>{@link CancerGynecologicalExamination#getID()}
     *   <li>{@link CancerGynecologicalExamination#getLastModDate()}
     *   <li>{@link CancerGynecologicalExamination#getModifiedBy()}
     *   <li>{@link CancerGynecologicalExamination#getObservation()}
     *   <li>{@link CancerGynecologicalExamination#getParkingPlaceID()}
     *   <li>{@link CancerGynecologicalExamination#getProcessed()}
     *   <li>{@link CancerGynecologicalExamination#getProviderServiceMapID()}
     *   <li>{@link CancerGynecologicalExamination#getReservedForChange()}
     *   <li>{@link CancerGynecologicalExamination#getSufferedFromRTIOrSTI()}
     *   <li>{@link CancerGynecologicalExamination#getSyncedBy()}
     *   <li>{@link CancerGynecologicalExamination#getSyncedDate()}
     *   <li>{@link CancerGynecologicalExamination#getTypeOfLesion()}
     *   <li>{@link CancerGynecologicalExamination#getTypeOfLesionList()}
     *   <li>{@link CancerGynecologicalExamination#getUterus_Normal()}
     *   <li>{@link CancerGynecologicalExamination#getVaginalInvolvement()}
     *   <li>{@link CancerGynecologicalExamination#getVanID()}
     *   <li>{@link CancerGynecologicalExamination#getVanSerialNo()}
     *   <li>{@link CancerGynecologicalExamination#getVehicalNo()}
     *   <li>{@link CancerGynecologicalExamination#getVisitCode()}
     *   <li>{@link CancerGynecologicalExamination#getVulvalInvolvement()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        CancerGynecologicalExamination actualCancerGynecologicalExamination = new CancerGynecologicalExamination();
        actualCancerGynecologicalExamination.setAppearanceOfCervix("Appearance Of Cervix");
        actualCancerGynecologicalExamination.setBenVisitID(1L);
        actualCancerGynecologicalExamination.setBeneficiaryRegID(1L);
        actualCancerGynecologicalExamination.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerGynecologicalExamination.setCreatedDate(createdDate);
        actualCancerGynecologicalExamination.setDeleted(true);
        actualCancerGynecologicalExamination.setExperiencedPostCoitalBleeding(true);
        actualCancerGynecologicalExamination.setFilePath("/directory/foo.txt");
        actualCancerGynecologicalExamination.setID(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerGynecologicalExamination.setLastModDate(lastModDate);
        actualCancerGynecologicalExamination.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerGynecologicalExamination.setObservation("Observation");
        actualCancerGynecologicalExamination.setParkingPlaceID(1);
        actualCancerGynecologicalExamination.setProcessed("Processed");
        actualCancerGynecologicalExamination.setProviderServiceMapID(1);
        actualCancerGynecologicalExamination.setReservedForChange("Reserved For Change");
        actualCancerGynecologicalExamination.setSufferedFromRTIOrSTI(true);
        actualCancerGynecologicalExamination.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerGynecologicalExamination.setSyncedDate(syncedDate);
        actualCancerGynecologicalExamination.setTypeOfLesion("Type Of Lesion");
        ArrayList<String> typeOfLesionList = new ArrayList<>();
        actualCancerGynecologicalExamination.setTypeOfLesionList(typeOfLesionList);
        actualCancerGynecologicalExamination.setUterus_Normal(true);
        actualCancerGynecologicalExamination.setVaginalInvolvement(true);
        actualCancerGynecologicalExamination.setVanID(1);
        actualCancerGynecologicalExamination.setVanSerialNo(1L);
        actualCancerGynecologicalExamination.setVehicalNo("Vehical No");
        actualCancerGynecologicalExamination.setVisitCode(1L);
        actualCancerGynecologicalExamination.setVulvalInvolvement(true);
        actualCancerGynecologicalExamination.setrTIOrSTIDetail("R TIOr STIDetail");
        String actualAppearanceOfCervix = actualCancerGynecologicalExamination.getAppearanceOfCervix();
        Long actualBenVisitID = actualCancerGynecologicalExamination.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerGynecologicalExamination.getBeneficiaryRegID();
        String actualCreatedBy = actualCancerGynecologicalExamination.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerGynecologicalExamination.getCreatedDate();
        Boolean actualDeleted = actualCancerGynecologicalExamination.getDeleted();
        Boolean actualExperiencedPostCoitalBleeding = actualCancerGynecologicalExamination
                .getExperiencedPostCoitalBleeding();
        String actualFilePath = actualCancerGynecologicalExamination.getFilePath();
        Long actualID = actualCancerGynecologicalExamination.getID();
        Timestamp actualLastModDate = actualCancerGynecologicalExamination.getLastModDate();
        String actualModifiedBy = actualCancerGynecologicalExamination.getModifiedBy();
        String actualObservation = actualCancerGynecologicalExamination.getObservation();
        Integer actualParkingPlaceID = actualCancerGynecologicalExamination.getParkingPlaceID();
        String actualProcessed = actualCancerGynecologicalExamination.getProcessed();
        Integer actualProviderServiceMapID = actualCancerGynecologicalExamination.getProviderServiceMapID();
        String actualReservedForChange = actualCancerGynecologicalExamination.getReservedForChange();
        Boolean actualSufferedFromRTIOrSTI = actualCancerGynecologicalExamination.getSufferedFromRTIOrSTI();
        String actualSyncedBy = actualCancerGynecologicalExamination.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerGynecologicalExamination.getSyncedDate();
        String actualTypeOfLesion = actualCancerGynecologicalExamination.getTypeOfLesion();
        List<String> actualTypeOfLesionList = actualCancerGynecologicalExamination.getTypeOfLesionList();
        Boolean actualUterus_Normal = actualCancerGynecologicalExamination.getUterus_Normal();
        Boolean actualVaginalInvolvement = actualCancerGynecologicalExamination.getVaginalInvolvement();
        Integer actualVanID = actualCancerGynecologicalExamination.getVanID();
        Long actualVanSerialNo = actualCancerGynecologicalExamination.getVanSerialNo();
        String actualVehicalNo = actualCancerGynecologicalExamination.getVehicalNo();
        Long actualVisitCode = actualCancerGynecologicalExamination.getVisitCode();
        Boolean actualVulvalInvolvement = actualCancerGynecologicalExamination.getVulvalInvolvement();

        // Assert that nothing has changed
        assertEquals("/directory/foo.txt", actualFilePath);
        assertEquals("Appearance Of Cervix", actualAppearanceOfCervix);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Observation", actualObservation);
        assertEquals("Processed", actualProcessed);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Type Of Lesion", actualTypeOfLesion);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualID.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertTrue(actualDeleted);
        assertTrue(actualExperiencedPostCoitalBleeding);
        assertTrue(actualSufferedFromRTIOrSTI);
        assertTrue(actualUterus_Normal);
        assertTrue(actualVaginalInvolvement);
        assertTrue(actualVulvalInvolvement);
        assertSame(typeOfLesionList, actualTypeOfLesionList);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link CancerGynecologicalExamination#CancerGynecologicalExamination(Long, Long, Long, Integer, String, String, List, Boolean, Boolean, Boolean, Boolean, String, String, Boolean, String, Boolean, String, String, Timestamp, String, Timestamp)}
     *   <li>{@link CancerGynecologicalExamination#setAppearanceOfCervix(String)}
     *   <li>{@link CancerGynecologicalExamination#setBenVisitID(Long)}
     *   <li>{@link CancerGynecologicalExamination#setBeneficiaryRegID(Long)}
     *   <li>{@link CancerGynecologicalExamination#setCreatedBy(String)}
     *   <li>{@link CancerGynecologicalExamination#setCreatedDate(Timestamp)}
     *   <li>{@link CancerGynecologicalExamination#setDeleted(Boolean)}
     *   <li>
     * {@link CancerGynecologicalExamination#setExperiencedPostCoitalBleeding(Boolean)}
     *   <li>{@link CancerGynecologicalExamination#setFilePath(String)}
     *   <li>{@link CancerGynecologicalExamination#setID(Long)}
     *   <li>{@link CancerGynecologicalExamination#setLastModDate(Timestamp)}
     *   <li>{@link CancerGynecologicalExamination#setModifiedBy(String)}
     *   <li>{@link CancerGynecologicalExamination#setObservation(String)}
     *   <li>{@link CancerGynecologicalExamination#setParkingPlaceID(Integer)}
     *   <li>{@link CancerGynecologicalExamination#setProcessed(String)}
     *   <li>{@link CancerGynecologicalExamination#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerGynecologicalExamination#setReservedForChange(String)}
     *   <li>{@link CancerGynecologicalExamination#setSufferedFromRTIOrSTI(Boolean)}
     *   <li>{@link CancerGynecologicalExamination#setSyncedBy(String)}
     *   <li>{@link CancerGynecologicalExamination#setSyncedDate(Timestamp)}
     *   <li>{@link CancerGynecologicalExamination#setTypeOfLesion(String)}
     *   <li>{@link CancerGynecologicalExamination#setTypeOfLesionList(List)}
     *   <li>{@link CancerGynecologicalExamination#setUterus_Normal(Boolean)}
     *   <li>{@link CancerGynecologicalExamination#setVaginalInvolvement(Boolean)}
     *   <li>{@link CancerGynecologicalExamination#setVanID(Integer)}
     *   <li>{@link CancerGynecologicalExamination#setVanSerialNo(Long)}
     *   <li>{@link CancerGynecologicalExamination#setVehicalNo(String)}
     *   <li>{@link CancerGynecologicalExamination#setVisitCode(Long)}
     *   <li>{@link CancerGynecologicalExamination#setVulvalInvolvement(Boolean)}
     *   <li>{@link CancerGynecologicalExamination#setrTIOrSTIDetail(String)}
     *   <li>{@link CancerGynecologicalExamination#getAppearanceOfCervix()}
     *   <li>{@link CancerGynecologicalExamination#getBenVisitID()}
     *   <li>{@link CancerGynecologicalExamination#getBeneficiaryRegID()}
     *   <li>{@link CancerGynecologicalExamination#getCreatedBy()}
     *   <li>{@link CancerGynecologicalExamination#getCreatedDate()}
     *   <li>{@link CancerGynecologicalExamination#getDeleted()}
     *   <li>{@link CancerGynecologicalExamination#getExperiencedPostCoitalBleeding()}
     *   <li>{@link CancerGynecologicalExamination#getFilePath()}
     *   <li>{@link CancerGynecologicalExamination#getID()}
     *   <li>{@link CancerGynecologicalExamination#getLastModDate()}
     *   <li>{@link CancerGynecologicalExamination#getModifiedBy()}
     *   <li>{@link CancerGynecologicalExamination#getObservation()}
     *   <li>{@link CancerGynecologicalExamination#getParkingPlaceID()}
     *   <li>{@link CancerGynecologicalExamination#getProcessed()}
     *   <li>{@link CancerGynecologicalExamination#getProviderServiceMapID()}
     *   <li>{@link CancerGynecologicalExamination#getReservedForChange()}
     *   <li>{@link CancerGynecologicalExamination#getSufferedFromRTIOrSTI()}
     *   <li>{@link CancerGynecologicalExamination#getSyncedBy()}
     *   <li>{@link CancerGynecologicalExamination#getSyncedDate()}
     *   <li>{@link CancerGynecologicalExamination#getTypeOfLesion()}
     *   <li>{@link CancerGynecologicalExamination#getTypeOfLesionList()}
     *   <li>{@link CancerGynecologicalExamination#getUterus_Normal()}
     *   <li>{@link CancerGynecologicalExamination#getVaginalInvolvement()}
     *   <li>{@link CancerGynecologicalExamination#getVanID()}
     *   <li>{@link CancerGynecologicalExamination#getVanSerialNo()}
     *   <li>{@link CancerGynecologicalExamination#getVehicalNo()}
     *   <li>{@link CancerGynecologicalExamination#getVisitCode()}
     *   <li>{@link CancerGynecologicalExamination#getVulvalInvolvement()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange
        ArrayList<String> typeOfLesionList = new ArrayList<>();

        // Act
        CancerGynecologicalExamination actualCancerGynecologicalExamination = new CancerGynecologicalExamination(1L, 1L, 1L,
                1, "Appearance Of Cervix", "Type Of Lesion", typeOfLesionList, true, true, true, true, "R TIOr STIDetail",
                "/directory/foo.txt", true, "Observation", true, "Processed", "Jan 1, 2020 8:00am GMT+0100",
                mock(Timestamp.class), "Jan 1, 2020 9:00am GMT+0100", mock(Timestamp.class));
        actualCancerGynecologicalExamination.setAppearanceOfCervix("Appearance Of Cervix");
        actualCancerGynecologicalExamination.setBenVisitID(1L);
        actualCancerGynecologicalExamination.setBeneficiaryRegID(1L);
        actualCancerGynecologicalExamination.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerGynecologicalExamination.setCreatedDate(createdDate);
        actualCancerGynecologicalExamination.setDeleted(true);
        actualCancerGynecologicalExamination.setExperiencedPostCoitalBleeding(true);
        actualCancerGynecologicalExamination.setFilePath("/directory/foo.txt");
        actualCancerGynecologicalExamination.setID(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerGynecologicalExamination.setLastModDate(lastModDate);
        actualCancerGynecologicalExamination.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerGynecologicalExamination.setObservation("Observation");
        actualCancerGynecologicalExamination.setParkingPlaceID(1);
        actualCancerGynecologicalExamination.setProcessed("Processed");
        actualCancerGynecologicalExamination.setProviderServiceMapID(1);
        actualCancerGynecologicalExamination.setReservedForChange("Reserved For Change");
        actualCancerGynecologicalExamination.setSufferedFromRTIOrSTI(true);
        actualCancerGynecologicalExamination.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerGynecologicalExamination.setSyncedDate(syncedDate);
        actualCancerGynecologicalExamination.setTypeOfLesion("Type Of Lesion");
        ArrayList<String> typeOfLesionList2 = new ArrayList<>();
        actualCancerGynecologicalExamination.setTypeOfLesionList(typeOfLesionList2);
        actualCancerGynecologicalExamination.setUterus_Normal(true);
        actualCancerGynecologicalExamination.setVaginalInvolvement(true);
        actualCancerGynecologicalExamination.setVanID(1);
        actualCancerGynecologicalExamination.setVanSerialNo(1L);
        actualCancerGynecologicalExamination.setVehicalNo("Vehical No");
        actualCancerGynecologicalExamination.setVisitCode(1L);
        actualCancerGynecologicalExamination.setVulvalInvolvement(true);
        actualCancerGynecologicalExamination.setrTIOrSTIDetail("R TIOr STIDetail");
        String actualAppearanceOfCervix = actualCancerGynecologicalExamination.getAppearanceOfCervix();
        Long actualBenVisitID = actualCancerGynecologicalExamination.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerGynecologicalExamination.getBeneficiaryRegID();
        String actualCreatedBy = actualCancerGynecologicalExamination.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerGynecologicalExamination.getCreatedDate();
        Boolean actualDeleted = actualCancerGynecologicalExamination.getDeleted();
        Boolean actualExperiencedPostCoitalBleeding = actualCancerGynecologicalExamination
                .getExperiencedPostCoitalBleeding();
        String actualFilePath = actualCancerGynecologicalExamination.getFilePath();
        Long actualID = actualCancerGynecologicalExamination.getID();
        Timestamp actualLastModDate = actualCancerGynecologicalExamination.getLastModDate();
        String actualModifiedBy = actualCancerGynecologicalExamination.getModifiedBy();
        String actualObservation = actualCancerGynecologicalExamination.getObservation();
        Integer actualParkingPlaceID = actualCancerGynecologicalExamination.getParkingPlaceID();
        String actualProcessed = actualCancerGynecologicalExamination.getProcessed();
        Integer actualProviderServiceMapID = actualCancerGynecologicalExamination.getProviderServiceMapID();
        String actualReservedForChange = actualCancerGynecologicalExamination.getReservedForChange();
        Boolean actualSufferedFromRTIOrSTI = actualCancerGynecologicalExamination.getSufferedFromRTIOrSTI();
        String actualSyncedBy = actualCancerGynecologicalExamination.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerGynecologicalExamination.getSyncedDate();
        String actualTypeOfLesion = actualCancerGynecologicalExamination.getTypeOfLesion();
        List<String> actualTypeOfLesionList = actualCancerGynecologicalExamination.getTypeOfLesionList();
        Boolean actualUterus_Normal = actualCancerGynecologicalExamination.getUterus_Normal();
        Boolean actualVaginalInvolvement = actualCancerGynecologicalExamination.getVaginalInvolvement();
        Integer actualVanID = actualCancerGynecologicalExamination.getVanID();
        Long actualVanSerialNo = actualCancerGynecologicalExamination.getVanSerialNo();
        String actualVehicalNo = actualCancerGynecologicalExamination.getVehicalNo();
        Long actualVisitCode = actualCancerGynecologicalExamination.getVisitCode();
        Boolean actualVulvalInvolvement = actualCancerGynecologicalExamination.getVulvalInvolvement();

        // Assert that nothing has changed
        assertEquals("/directory/foo.txt", actualFilePath);
        assertEquals("Appearance Of Cervix", actualAppearanceOfCervix);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Observation", actualObservation);
        assertEquals("Processed", actualProcessed);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Type Of Lesion", actualTypeOfLesion);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualID.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertTrue(actualDeleted);
        assertTrue(actualExperiencedPostCoitalBleeding);
        assertTrue(actualSufferedFromRTIOrSTI);
        assertTrue(actualUterus_Normal);
        assertTrue(actualVaginalInvolvement);
        assertTrue(actualVulvalInvolvement);
        assertEquals(typeOfLesionList, actualTypeOfLesionList);
        assertSame(typeOfLesionList2, actualTypeOfLesionList);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }
}
