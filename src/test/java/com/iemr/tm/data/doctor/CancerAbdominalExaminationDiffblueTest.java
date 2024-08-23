package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

class CancerAbdominalExaminationDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link CancerAbdominalExamination#CancerAbdominalExamination()}
     *   <li>{@link CancerAbdominalExamination#setAbdominalInspection_Normal(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setAnyOtherMass_Present(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setAscites_Present(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setBenVisitID(Long)}
     *   <li>{@link CancerAbdominalExamination#setBeneficiaryRegID(Long)}
     *   <li>{@link CancerAbdominalExamination#setCreatedBy(String)}
     *   <li>{@link CancerAbdominalExamination#setCreatedDate(Timestamp)}
     *   <li>{@link CancerAbdominalExamination#setDeleted(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setID(Long)}
     *   <li>{@link CancerAbdominalExamination#setLastModDate(Timestamp)}
     *   <li>{@link CancerAbdominalExamination#setLiver(String)}
     *   <li>
     * {@link CancerAbdominalExamination#setLymphNode_ExternalIliac_Left(Boolean)}
     *   <li>
     * {@link CancerAbdominalExamination#setLymphNode_ExternalIliac_Right(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setLymphNode_Inguinal_Left(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setLymphNode_Inguinal_Right(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setLymphNode_ParaAortic_Left(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setLymphNode_ParaAortic_Right(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setLymphNodes_Enlarged(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setModifiedBy(String)}
     *   <li>{@link CancerAbdominalExamination#setObservation(String)}
     *   <li>{@link CancerAbdominalExamination#setParkingPlaceID(Integer)}
     *   <li>{@link CancerAbdominalExamination#setProcessed(String)}
     *   <li>{@link CancerAbdominalExamination#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerAbdominalExamination#setReservedForChange(String)}
     *   <li>{@link CancerAbdominalExamination#setSyncedBy(String)}
     *   <li>{@link CancerAbdominalExamination#setSyncedDate(Timestamp)}
     *   <li>{@link CancerAbdominalExamination#setVanID(Integer)}
     *   <li>{@link CancerAbdominalExamination#setVanSerialNo(Long)}
     *   <li>{@link CancerAbdominalExamination#setVehicalNo(String)}
     *   <li>{@link CancerAbdominalExamination#setVisitCode(Long)}
     *   <li>{@link CancerAbdominalExamination#getAbdominalInspection_Normal()}
     *   <li>{@link CancerAbdominalExamination#getAnyOtherMass_Present()}
     *   <li>{@link CancerAbdominalExamination#getAscites_Present()}
     *   <li>{@link CancerAbdominalExamination#getBenVisitID()}
     *   <li>{@link CancerAbdominalExamination#getBeneficiaryRegID()}
     *   <li>{@link CancerAbdominalExamination#getCreatedBy()}
     *   <li>{@link CancerAbdominalExamination#getCreatedDate()}
     *   <li>{@link CancerAbdominalExamination#getDeleted()}
     *   <li>{@link CancerAbdominalExamination#getID()}
     *   <li>{@link CancerAbdominalExamination#getLastModDate()}
     *   <li>{@link CancerAbdominalExamination#getLiver()}
     *   <li>{@link CancerAbdominalExamination#getLymphNode_ExternalIliac_Left()}
     *   <li>{@link CancerAbdominalExamination#getLymphNode_ExternalIliac_Right()}
     *   <li>{@link CancerAbdominalExamination#getLymphNode_Inguinal_Left()}
     *   <li>{@link CancerAbdominalExamination#getLymphNode_Inguinal_Right()}
     *   <li>{@link CancerAbdominalExamination#getLymphNode_ParaAortic_Left()}
     *   <li>{@link CancerAbdominalExamination#getLymphNode_ParaAortic_Right()}
     *   <li>{@link CancerAbdominalExamination#getLymphNodes_Enlarged()}
     *   <li>{@link CancerAbdominalExamination#getModifiedBy()}
     *   <li>{@link CancerAbdominalExamination#getObservation()}
     *   <li>{@link CancerAbdominalExamination#getParkingPlaceID()}
     *   <li>{@link CancerAbdominalExamination#getProcessed()}
     *   <li>{@link CancerAbdominalExamination#getProviderServiceMapID()}
     *   <li>{@link CancerAbdominalExamination#getReservedForChange()}
     *   <li>{@link CancerAbdominalExamination#getSyncedBy()}
     *   <li>{@link CancerAbdominalExamination#getSyncedDate()}
     *   <li>{@link CancerAbdominalExamination#getVanID()}
     *   <li>{@link CancerAbdominalExamination#getVanSerialNo()}
     *   <li>{@link CancerAbdominalExamination#getVehicalNo()}
     *   <li>{@link CancerAbdominalExamination#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        CancerAbdominalExamination actualCancerAbdominalExamination = new CancerAbdominalExamination();
        actualCancerAbdominalExamination.setAbdominalInspection_Normal(true);
        actualCancerAbdominalExamination.setAnyOtherMass_Present(true);
        actualCancerAbdominalExamination.setAscites_Present(true);
        actualCancerAbdominalExamination.setBenVisitID(1L);
        actualCancerAbdominalExamination.setBeneficiaryRegID(1L);
        actualCancerAbdominalExamination.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerAbdominalExamination.setCreatedDate(createdDate);
        actualCancerAbdominalExamination.setDeleted(true);
        actualCancerAbdominalExamination.setID(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerAbdominalExamination.setLastModDate(lastModDate);
        actualCancerAbdominalExamination.setLiver("Liver");
        actualCancerAbdominalExamination.setLymphNode_ExternalIliac_Left(true);
        actualCancerAbdominalExamination.setLymphNode_ExternalIliac_Right(true);
        actualCancerAbdominalExamination.setLymphNode_Inguinal_Left(true);
        actualCancerAbdominalExamination.setLymphNode_Inguinal_Right(true);
        actualCancerAbdominalExamination.setLymphNode_ParaAortic_Left(true);
        actualCancerAbdominalExamination.setLymphNode_ParaAortic_Right(true);
        actualCancerAbdominalExamination.setLymphNodes_Enlarged(true);
        actualCancerAbdominalExamination.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerAbdominalExamination.setObservation("Observation");
        actualCancerAbdominalExamination.setParkingPlaceID(1);
        actualCancerAbdominalExamination.setProcessed("Processed");
        actualCancerAbdominalExamination.setProviderServiceMapID(1);
        actualCancerAbdominalExamination.setReservedForChange("Reserved For Change");
        actualCancerAbdominalExamination.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerAbdominalExamination.setSyncedDate(syncedDate);
        actualCancerAbdominalExamination.setVanID(1);
        actualCancerAbdominalExamination.setVanSerialNo(1L);
        actualCancerAbdominalExamination.setVehicalNo("Vehical No");
        actualCancerAbdominalExamination.setVisitCode(1L);
        Boolean actualAbdominalInspection_Normal = actualCancerAbdominalExamination.getAbdominalInspection_Normal();
        Boolean actualAnyOtherMass_Present = actualCancerAbdominalExamination.getAnyOtherMass_Present();
        Boolean actualAscites_Present = actualCancerAbdominalExamination.getAscites_Present();
        Long actualBenVisitID = actualCancerAbdominalExamination.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerAbdominalExamination.getBeneficiaryRegID();
        String actualCreatedBy = actualCancerAbdominalExamination.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerAbdominalExamination.getCreatedDate();
        Boolean actualDeleted = actualCancerAbdominalExamination.getDeleted();
        Long actualID = actualCancerAbdominalExamination.getID();
        Timestamp actualLastModDate = actualCancerAbdominalExamination.getLastModDate();
        String actualLiver = actualCancerAbdominalExamination.getLiver();
        Boolean actualLymphNode_ExternalIliac_Left = actualCancerAbdominalExamination.getLymphNode_ExternalIliac_Left();
        Boolean actualLymphNode_ExternalIliac_Right = actualCancerAbdominalExamination.getLymphNode_ExternalIliac_Right();
        Boolean actualLymphNode_Inguinal_Left = actualCancerAbdominalExamination.getLymphNode_Inguinal_Left();
        Boolean actualLymphNode_Inguinal_Right = actualCancerAbdominalExamination.getLymphNode_Inguinal_Right();
        Boolean actualLymphNode_ParaAortic_Left = actualCancerAbdominalExamination.getLymphNode_ParaAortic_Left();
        Boolean actualLymphNode_ParaAortic_Right = actualCancerAbdominalExamination.getLymphNode_ParaAortic_Right();
        Boolean actualLymphNodes_Enlarged = actualCancerAbdominalExamination.getLymphNodes_Enlarged();
        String actualModifiedBy = actualCancerAbdominalExamination.getModifiedBy();
        String actualObservation = actualCancerAbdominalExamination.getObservation();
        Integer actualParkingPlaceID = actualCancerAbdominalExamination.getParkingPlaceID();
        String actualProcessed = actualCancerAbdominalExamination.getProcessed();
        Integer actualProviderServiceMapID = actualCancerAbdominalExamination.getProviderServiceMapID();
        String actualReservedForChange = actualCancerAbdominalExamination.getReservedForChange();
        String actualSyncedBy = actualCancerAbdominalExamination.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerAbdominalExamination.getSyncedDate();
        Integer actualVanID = actualCancerAbdominalExamination.getVanID();
        Long actualVanSerialNo = actualCancerAbdominalExamination.getVanSerialNo();
        String actualVehicalNo = actualCancerAbdominalExamination.getVehicalNo();
        Long actualVisitCode = actualCancerAbdominalExamination.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Liver", actualLiver);
        assertEquals("Observation", actualObservation);
        assertEquals("Processed", actualProcessed);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualID.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertTrue(actualAbdominalInspection_Normal);
        assertTrue(actualAnyOtherMass_Present);
        assertTrue(actualAscites_Present);
        assertTrue(actualDeleted);
        assertTrue(actualLymphNode_ExternalIliac_Left);
        assertTrue(actualLymphNode_ExternalIliac_Right);
        assertTrue(actualLymphNode_Inguinal_Left);
        assertTrue(actualLymphNode_Inguinal_Right);
        assertTrue(actualLymphNode_ParaAortic_Left);
        assertTrue(actualLymphNode_ParaAortic_Right);
        assertTrue(actualLymphNodes_Enlarged);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link CancerAbdominalExamination#CancerAbdominalExamination(Long, Long, Long, Integer, Boolean, String, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, String, Boolean, String, String, Timestamp, String, Timestamp)}
     *   <li>{@link CancerAbdominalExamination#setAbdominalInspection_Normal(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setAnyOtherMass_Present(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setAscites_Present(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setBenVisitID(Long)}
     *   <li>{@link CancerAbdominalExamination#setBeneficiaryRegID(Long)}
     *   <li>{@link CancerAbdominalExamination#setCreatedBy(String)}
     *   <li>{@link CancerAbdominalExamination#setCreatedDate(Timestamp)}
     *   <li>{@link CancerAbdominalExamination#setDeleted(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setID(Long)}
     *   <li>{@link CancerAbdominalExamination#setLastModDate(Timestamp)}
     *   <li>{@link CancerAbdominalExamination#setLiver(String)}
     *   <li>
     * {@link CancerAbdominalExamination#setLymphNode_ExternalIliac_Left(Boolean)}
     *   <li>
     * {@link CancerAbdominalExamination#setLymphNode_ExternalIliac_Right(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setLymphNode_Inguinal_Left(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setLymphNode_Inguinal_Right(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setLymphNode_ParaAortic_Left(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setLymphNode_ParaAortic_Right(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setLymphNodes_Enlarged(Boolean)}
     *   <li>{@link CancerAbdominalExamination#setModifiedBy(String)}
     *   <li>{@link CancerAbdominalExamination#setObservation(String)}
     *   <li>{@link CancerAbdominalExamination#setParkingPlaceID(Integer)}
     *   <li>{@link CancerAbdominalExamination#setProcessed(String)}
     *   <li>{@link CancerAbdominalExamination#setProviderServiceMapID(Integer)}
     *   <li>{@link CancerAbdominalExamination#setReservedForChange(String)}
     *   <li>{@link CancerAbdominalExamination#setSyncedBy(String)}
     *   <li>{@link CancerAbdominalExamination#setSyncedDate(Timestamp)}
     *   <li>{@link CancerAbdominalExamination#setVanID(Integer)}
     *   <li>{@link CancerAbdominalExamination#setVanSerialNo(Long)}
     *   <li>{@link CancerAbdominalExamination#setVehicalNo(String)}
     *   <li>{@link CancerAbdominalExamination#setVisitCode(Long)}
     *   <li>{@link CancerAbdominalExamination#getAbdominalInspection_Normal()}
     *   <li>{@link CancerAbdominalExamination#getAnyOtherMass_Present()}
     *   <li>{@link CancerAbdominalExamination#getAscites_Present()}
     *   <li>{@link CancerAbdominalExamination#getBenVisitID()}
     *   <li>{@link CancerAbdominalExamination#getBeneficiaryRegID()}
     *   <li>{@link CancerAbdominalExamination#getCreatedBy()}
     *   <li>{@link CancerAbdominalExamination#getCreatedDate()}
     *   <li>{@link CancerAbdominalExamination#getDeleted()}
     *   <li>{@link CancerAbdominalExamination#getID()}
     *   <li>{@link CancerAbdominalExamination#getLastModDate()}
     *   <li>{@link CancerAbdominalExamination#getLiver()}
     *   <li>{@link CancerAbdominalExamination#getLymphNode_ExternalIliac_Left()}
     *   <li>{@link CancerAbdominalExamination#getLymphNode_ExternalIliac_Right()}
     *   <li>{@link CancerAbdominalExamination#getLymphNode_Inguinal_Left()}
     *   <li>{@link CancerAbdominalExamination#getLymphNode_Inguinal_Right()}
     *   <li>{@link CancerAbdominalExamination#getLymphNode_ParaAortic_Left()}
     *   <li>{@link CancerAbdominalExamination#getLymphNode_ParaAortic_Right()}
     *   <li>{@link CancerAbdominalExamination#getLymphNodes_Enlarged()}
     *   <li>{@link CancerAbdominalExamination#getModifiedBy()}
     *   <li>{@link CancerAbdominalExamination#getObservation()}
     *   <li>{@link CancerAbdominalExamination#getParkingPlaceID()}
     *   <li>{@link CancerAbdominalExamination#getProcessed()}
     *   <li>{@link CancerAbdominalExamination#getProviderServiceMapID()}
     *   <li>{@link CancerAbdominalExamination#getReservedForChange()}
     *   <li>{@link CancerAbdominalExamination#getSyncedBy()}
     *   <li>{@link CancerAbdominalExamination#getSyncedDate()}
     *   <li>{@link CancerAbdominalExamination#getVanID()}
     *   <li>{@link CancerAbdominalExamination#getVanSerialNo()}
     *   <li>{@link CancerAbdominalExamination#getVehicalNo()}
     *   <li>{@link CancerAbdominalExamination#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        CancerAbdominalExamination actualCancerAbdominalExamination = new CancerAbdominalExamination(1L, 1L, 1L, 1, true,
                "Liver", true, true, true, true, true, true, true, true, true, "Observation", true, "Processed",
                "Jan 1, 2020 8:00am GMT+0100", mock(Timestamp.class), "Jan 1, 2020 9:00am GMT+0100", mock(Timestamp.class));
        actualCancerAbdominalExamination.setAbdominalInspection_Normal(true);
        actualCancerAbdominalExamination.setAnyOtherMass_Present(true);
        actualCancerAbdominalExamination.setAscites_Present(true);
        actualCancerAbdominalExamination.setBenVisitID(1L);
        actualCancerAbdominalExamination.setBeneficiaryRegID(1L);
        actualCancerAbdominalExamination.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualCancerAbdominalExamination.setCreatedDate(createdDate);
        actualCancerAbdominalExamination.setDeleted(true);
        actualCancerAbdominalExamination.setID(1L);
        Timestamp lastModDate = mock(Timestamp.class);
        actualCancerAbdominalExamination.setLastModDate(lastModDate);
        actualCancerAbdominalExamination.setLiver("Liver");
        actualCancerAbdominalExamination.setLymphNode_ExternalIliac_Left(true);
        actualCancerAbdominalExamination.setLymphNode_ExternalIliac_Right(true);
        actualCancerAbdominalExamination.setLymphNode_Inguinal_Left(true);
        actualCancerAbdominalExamination.setLymphNode_Inguinal_Right(true);
        actualCancerAbdominalExamination.setLymphNode_ParaAortic_Left(true);
        actualCancerAbdominalExamination.setLymphNode_ParaAortic_Right(true);
        actualCancerAbdominalExamination.setLymphNodes_Enlarged(true);
        actualCancerAbdominalExamination.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualCancerAbdominalExamination.setObservation("Observation");
        actualCancerAbdominalExamination.setParkingPlaceID(1);
        actualCancerAbdominalExamination.setProcessed("Processed");
        actualCancerAbdominalExamination.setProviderServiceMapID(1);
        actualCancerAbdominalExamination.setReservedForChange("Reserved For Change");
        actualCancerAbdominalExamination.setSyncedBy("Synced By");
        Timestamp syncedDate = mock(Timestamp.class);
        actualCancerAbdominalExamination.setSyncedDate(syncedDate);
        actualCancerAbdominalExamination.setVanID(1);
        actualCancerAbdominalExamination.setVanSerialNo(1L);
        actualCancerAbdominalExamination.setVehicalNo("Vehical No");
        actualCancerAbdominalExamination.setVisitCode(1L);
        Boolean actualAbdominalInspection_Normal = actualCancerAbdominalExamination.getAbdominalInspection_Normal();
        Boolean actualAnyOtherMass_Present = actualCancerAbdominalExamination.getAnyOtherMass_Present();
        Boolean actualAscites_Present = actualCancerAbdominalExamination.getAscites_Present();
        Long actualBenVisitID = actualCancerAbdominalExamination.getBenVisitID();
        Long actualBeneficiaryRegID = actualCancerAbdominalExamination.getBeneficiaryRegID();
        String actualCreatedBy = actualCancerAbdominalExamination.getCreatedBy();
        Timestamp actualCreatedDate = actualCancerAbdominalExamination.getCreatedDate();
        Boolean actualDeleted = actualCancerAbdominalExamination.getDeleted();
        Long actualID = actualCancerAbdominalExamination.getID();
        Timestamp actualLastModDate = actualCancerAbdominalExamination.getLastModDate();
        String actualLiver = actualCancerAbdominalExamination.getLiver();
        Boolean actualLymphNode_ExternalIliac_Left = actualCancerAbdominalExamination.getLymphNode_ExternalIliac_Left();
        Boolean actualLymphNode_ExternalIliac_Right = actualCancerAbdominalExamination.getLymphNode_ExternalIliac_Right();
        Boolean actualLymphNode_Inguinal_Left = actualCancerAbdominalExamination.getLymphNode_Inguinal_Left();
        Boolean actualLymphNode_Inguinal_Right = actualCancerAbdominalExamination.getLymphNode_Inguinal_Right();
        Boolean actualLymphNode_ParaAortic_Left = actualCancerAbdominalExamination.getLymphNode_ParaAortic_Left();
        Boolean actualLymphNode_ParaAortic_Right = actualCancerAbdominalExamination.getLymphNode_ParaAortic_Right();
        Boolean actualLymphNodes_Enlarged = actualCancerAbdominalExamination.getLymphNodes_Enlarged();
        String actualModifiedBy = actualCancerAbdominalExamination.getModifiedBy();
        String actualObservation = actualCancerAbdominalExamination.getObservation();
        Integer actualParkingPlaceID = actualCancerAbdominalExamination.getParkingPlaceID();
        String actualProcessed = actualCancerAbdominalExamination.getProcessed();
        Integer actualProviderServiceMapID = actualCancerAbdominalExamination.getProviderServiceMapID();
        String actualReservedForChange = actualCancerAbdominalExamination.getReservedForChange();
        String actualSyncedBy = actualCancerAbdominalExamination.getSyncedBy();
        Timestamp actualSyncedDate = actualCancerAbdominalExamination.getSyncedDate();
        Integer actualVanID = actualCancerAbdominalExamination.getVanID();
        Long actualVanSerialNo = actualCancerAbdominalExamination.getVanSerialNo();
        String actualVehicalNo = actualCancerAbdominalExamination.getVehicalNo();
        Long actualVisitCode = actualCancerAbdominalExamination.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Liver", actualLiver);
        assertEquals("Observation", actualObservation);
        assertEquals("Processed", actualProcessed);
        assertEquals("Reserved For Change", actualReservedForChange);
        assertEquals("Synced By", actualSyncedBy);
        assertEquals("Vehical No", actualVehicalNo);
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualID.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertTrue(actualAbdominalInspection_Normal);
        assertTrue(actualAnyOtherMass_Present);
        assertTrue(actualAscites_Present);
        assertTrue(actualDeleted);
        assertTrue(actualLymphNode_ExternalIliac_Left);
        assertTrue(actualLymphNode_ExternalIliac_Right);
        assertTrue(actualLymphNode_Inguinal_Left);
        assertTrue(actualLymphNode_Inguinal_Right);
        assertTrue(actualLymphNode_ParaAortic_Left);
        assertTrue(actualLymphNode_ParaAortic_Right);
        assertTrue(actualLymphNodes_Enlarged);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
        assertSame(syncedDate, actualSyncedDate);
    }
}
