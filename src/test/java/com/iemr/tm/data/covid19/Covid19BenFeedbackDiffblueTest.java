package com.iemr.tm.data.covid19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Covid19BenFeedbackDiffblueTest {
    /**
     * Method under test: {@link Covid19BenFeedback#getcOVID19ID()}
     */
    @Test
    void testGetcOVID19ID() {
        // Arrange, Act and Assert
        assertNull((new Covid19BenFeedback()).getcOVID19ID());
    }

    /**
     * Method under test: {@link Covid19BenFeedback#getcOVID19ID()}
     */
    @Test
    void testGetcOVID19ID2() {
        // Arrange
        Covid19BenFeedback covid19BenFeedback = new Covid19BenFeedback();
        covid19BenFeedback.setBenCallID(1L);
        covid19BenFeedback.setBenMedHistoryID(1L);
        covid19BenFeedback.setBeneficiaryRegID(1L);
        covid19BenFeedback.setContactStatus(new String[]{"Contact Status"});
        covid19BenFeedback.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        covid19BenFeedback.setCreatedDate(mock(Timestamp.class));
        covid19BenFeedback.setDeleted(true);
        covid19BenFeedback.setFromCityInter(1);
        covid19BenFeedback.setFromCountryInter(3);
        covid19BenFeedback.setFromDistrictDom(1);
        covid19BenFeedback.setFromStateDom(1);
        covid19BenFeedback.setFromSubDistrictDom(1);
        covid19BenFeedback.setFromcityInter(1);
        covid19BenFeedback.setLastModDate(mock(Timestamp.class));
        covid19BenFeedback.setMedical_consultation(true);
        covid19BenFeedback.setModeOfTravelDomestic("Mode Of Travel Domestic");
        covid19BenFeedback.setModeOfTravelInter("Mode Of Travel Inter");
        covid19BenFeedback.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        covid19BenFeedback.setProcessed("Processed");
        covid19BenFeedback.setProviderServiceMapID(1);
        covid19BenFeedback.setRecommendation(new ArrayList<>());
        covid19BenFeedback.setRecommendation_db("Recommendation db");
        covid19BenFeedback.setSuspectedStatus(true);
        covid19BenFeedback.setSuspectedStatusUI("Suspected Status UI");
        covid19BenFeedback.setSymptom(new String[]{"Symptom"});
        covid19BenFeedback.setSymptoms(new String[]{"Symptoms"});
        covid19BenFeedback.setSymptoms_db("Symptoms db");
        covid19BenFeedback.setToCityInter(1);
        covid19BenFeedback.setToCountryInter(3);
        covid19BenFeedback.setToDistrictDom(1);
        covid19BenFeedback.setToStateDom(1);
        covid19BenFeedback.setToSubDistrictDom(1);
        covid19BenFeedback.setTocityInter(1);
        covid19BenFeedback.setTravelList(new String[]{"Travel List"});
        covid19BenFeedback.setTravelStatus(true);
        covid19BenFeedback.setTravelType("Travel Type");
        covid19BenFeedback.setVanID(1);
        covid19BenFeedback.setVanSerialNo(1L);
        covid19BenFeedback.setVisitCode(1L);
        covid19BenFeedback.setcOVID19ID(1L);
        covid19BenFeedback.setcOVID19_contact_history("C OVID19 contact history");

        // Act and Assert
        assertEquals(1L, covid19BenFeedback.getcOVID19ID().longValue());
    }

    /**
     * Method under test: {@link Covid19BenFeedback#getcOVID19_contact_history()}
     */
    @Test
    void testGetcOVID19_contact_history() {
        // Arrange, Act and Assert
        assertNull((new Covid19BenFeedback()).getcOVID19_contact_history());
    }

    /**
     * Method under test: {@link Covid19BenFeedback#getcOVID19_contact_history()}
     */
    @Test
    void testGetcOVID19_contact_history2() {
        // Arrange
        Covid19BenFeedback covid19BenFeedback = new Covid19BenFeedback();
        covid19BenFeedback.setBenCallID(1L);
        covid19BenFeedback.setBenMedHistoryID(1L);
        covid19BenFeedback.setBeneficiaryRegID(1L);
        covid19BenFeedback.setContactStatus(new String[]{"Contact Status"});
        covid19BenFeedback.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        covid19BenFeedback.setCreatedDate(mock(Timestamp.class));
        covid19BenFeedback.setDeleted(true);
        covid19BenFeedback.setFromCityInter(1);
        covid19BenFeedback.setFromCountryInter(3);
        covid19BenFeedback.setFromDistrictDom(1);
        covid19BenFeedback.setFromStateDom(1);
        covid19BenFeedback.setFromSubDistrictDom(1);
        covid19BenFeedback.setFromcityInter(1);
        covid19BenFeedback.setLastModDate(mock(Timestamp.class));
        covid19BenFeedback.setMedical_consultation(true);
        covid19BenFeedback.setModeOfTravelDomestic("Mode Of Travel Domestic");
        covid19BenFeedback.setModeOfTravelInter("Mode Of Travel Inter");
        covid19BenFeedback.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        covid19BenFeedback.setProcessed("Processed");
        covid19BenFeedback.setProviderServiceMapID(1);
        covid19BenFeedback.setRecommendation(new ArrayList<>());
        covid19BenFeedback.setRecommendation_db("Recommendation db");
        covid19BenFeedback.setSuspectedStatus(true);
        covid19BenFeedback.setSuspectedStatusUI("Suspected Status UI");
        covid19BenFeedback.setSymptom(new String[]{"Symptom"});
        covid19BenFeedback.setSymptoms(new String[]{"Symptoms"});
        covid19BenFeedback.setSymptoms_db("Symptoms db");
        covid19BenFeedback.setToCityInter(1);
        covid19BenFeedback.setToCountryInter(3);
        covid19BenFeedback.setToDistrictDom(1);
        covid19BenFeedback.setToStateDom(1);
        covid19BenFeedback.setToSubDistrictDom(1);
        covid19BenFeedback.setTocityInter(1);
        covid19BenFeedback.setTravelList(new String[]{"Travel List"});
        covid19BenFeedback.setTravelStatus(true);
        covid19BenFeedback.setTravelType("Travel Type");
        covid19BenFeedback.setVanID(1);
        covid19BenFeedback.setVanSerialNo(1L);
        covid19BenFeedback.setVisitCode(1L);
        covid19BenFeedback.setcOVID19ID(1L);
        covid19BenFeedback.setcOVID19_contact_history("C OVID19 contact history");

        // Act and Assert
        assertEquals("C OVID19 contact history", covid19BenFeedback.getcOVID19_contact_history());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link Covid19BenFeedback#setBenCallID(Long)}
     *   <li>{@link Covid19BenFeedback#setBenMedHistoryID(Long)}
     *   <li>{@link Covid19BenFeedback#setBeneficiaryRegID(Long)}
     *   <li>{@link Covid19BenFeedback#setContactStatus(String[])}
     *   <li>{@link Covid19BenFeedback#setCreatedBy(String)}
     *   <li>{@link Covid19BenFeedback#setCreatedDate(Timestamp)}
     *   <li>{@link Covid19BenFeedback#setDeleted(Boolean)}
     *   <li>{@link Covid19BenFeedback#setFromCityInter(Integer)}
     *   <li>{@link Covid19BenFeedback#setFromCountryInter(Integer)}
     *   <li>{@link Covid19BenFeedback#setFromDistrictDom(Integer)}
     *   <li>{@link Covid19BenFeedback#setFromStateDom(Integer)}
     *   <li>{@link Covid19BenFeedback#setFromSubDistrictDom(Integer)}
     *   <li>{@link Covid19BenFeedback#setFromcityInter(Integer)}
     *   <li>{@link Covid19BenFeedback#setLastModDate(Timestamp)}
     *   <li>{@link Covid19BenFeedback#setMedical_consultation(Boolean)}
     *   <li>{@link Covid19BenFeedback#setModeOfTravelDomestic(String)}
     *   <li>{@link Covid19BenFeedback#setModeOfTravelInter(String)}
     *   <li>{@link Covid19BenFeedback#setModifiedBy(String)}
     *   <li>{@link Covid19BenFeedback#setProcessed(String)}
     *   <li>{@link Covid19BenFeedback#setProviderServiceMapID(Integer)}
     *   <li>{@link Covid19BenFeedback#setRecommendation(ArrayList)}
     *   <li>{@link Covid19BenFeedback#setRecommendation_db(String)}
     *   <li>{@link Covid19BenFeedback#setSuspectedStatus(Boolean)}
     *   <li>{@link Covid19BenFeedback#setSuspectedStatusUI(String)}
     *   <li>{@link Covid19BenFeedback#setSymptom(String[])}
     *   <li>{@link Covid19BenFeedback#setSymptoms(String[])}
     *   <li>{@link Covid19BenFeedback#setSymptoms_db(String)}
     *   <li>{@link Covid19BenFeedback#setToCityInter(Integer)}
     *   <li>{@link Covid19BenFeedback#setToCountryInter(Integer)}
     *   <li>{@link Covid19BenFeedback#setToDistrictDom(Integer)}
     *   <li>{@link Covid19BenFeedback#setToStateDom(Integer)}
     *   <li>{@link Covid19BenFeedback#setToSubDistrictDom(Integer)}
     *   <li>{@link Covid19BenFeedback#setTocityInter(Integer)}
     *   <li>{@link Covid19BenFeedback#setTravelList(String[])}
     *   <li>{@link Covid19BenFeedback#setTravelStatus(Boolean)}
     *   <li>{@link Covid19BenFeedback#setTravelType(String)}
     *   <li>{@link Covid19BenFeedback#setVanID(Integer)}
     *   <li>{@link Covid19BenFeedback#setVanSerialNo(Long)}
     *   <li>{@link Covid19BenFeedback#setVisitCode(Long)}
     *   <li>{@link Covid19BenFeedback#setcOVID19ID(Long)}
     *   <li>{@link Covid19BenFeedback#setcOVID19_contact_history(String)}
     *   <li>{@link Covid19BenFeedback#getBenCallID()}
     *   <li>{@link Covid19BenFeedback#getBenMedHistoryID()}
     *   <li>{@link Covid19BenFeedback#getBeneficiaryRegID()}
     *   <li>{@link Covid19BenFeedback#getContactStatus()}
     *   <li>{@link Covid19BenFeedback#getCreatedBy()}
     *   <li>{@link Covid19BenFeedback#getCreatedDate()}
     *   <li>{@link Covid19BenFeedback#getDeleted()}
     *   <li>{@link Covid19BenFeedback#getFromCityInter()}
     *   <li>{@link Covid19BenFeedback#getFromCountryInter()}
     *   <li>{@link Covid19BenFeedback#getFromDistrictDom()}
     *   <li>{@link Covid19BenFeedback#getFromStateDom()}
     *   <li>{@link Covid19BenFeedback#getFromSubDistrictDom()}
     *   <li>{@link Covid19BenFeedback#getFromcityInter()}
     *   <li>{@link Covid19BenFeedback#getLastModDate()}
     *   <li>{@link Covid19BenFeedback#getMedical_consultation()}
     *   <li>{@link Covid19BenFeedback#getModeOfTravelDomestic()}
     *   <li>{@link Covid19BenFeedback#getModeOfTravelInter()}
     *   <li>{@link Covid19BenFeedback#getModifiedBy()}
     *   <li>{@link Covid19BenFeedback#getProcessed()}
     *   <li>{@link Covid19BenFeedback#getProviderServiceMapID()}
     *   <li>{@link Covid19BenFeedback#getRecommendation()}
     *   <li>{@link Covid19BenFeedback#getRecommendation_db()}
     *   <li>{@link Covid19BenFeedback#getSuspectedStatus()}
     *   <li>{@link Covid19BenFeedback#getSuspectedStatusUI()}
     *   <li>{@link Covid19BenFeedback#getSymptom()}
     *   <li>{@link Covid19BenFeedback#getSymptoms()}
     *   <li>{@link Covid19BenFeedback#getSymptoms_db()}
     *   <li>{@link Covid19BenFeedback#getToCityInter()}
     *   <li>{@link Covid19BenFeedback#getToCountryInter()}
     *   <li>{@link Covid19BenFeedback#getToDistrictDom()}
     *   <li>{@link Covid19BenFeedback#getToStateDom()}
     *   <li>{@link Covid19BenFeedback#getToSubDistrictDom()}
     *   <li>{@link Covid19BenFeedback#getTocityInter()}
     *   <li>{@link Covid19BenFeedback#getTravelList()}
     *   <li>{@link Covid19BenFeedback#getTravelStatus()}
     *   <li>{@link Covid19BenFeedback#getTravelType()}
     *   <li>{@link Covid19BenFeedback#getVanID()}
     *   <li>{@link Covid19BenFeedback#getVanSerialNo()}
     *   <li>{@link Covid19BenFeedback#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        Covid19BenFeedback covid19BenFeedback = new Covid19BenFeedback();

        // Act
        covid19BenFeedback.setBenCallID(1L);
        covid19BenFeedback.setBenMedHistoryID(1L);
        covid19BenFeedback.setBeneficiaryRegID(1L);
        String[] contactStatus = new String[]{"Contact Status"};
        covid19BenFeedback.setContactStatus(contactStatus);
        covid19BenFeedback.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        covid19BenFeedback.setCreatedDate(createdDate);
        covid19BenFeedback.setDeleted(true);
        covid19BenFeedback.setFromCityInter(1);
        covid19BenFeedback.setFromCountryInter(3);
        covid19BenFeedback.setFromDistrictDom(1);
        covid19BenFeedback.setFromStateDom(1);
        covid19BenFeedback.setFromSubDistrictDom(1);
        covid19BenFeedback.setFromcityInter(1);
        Timestamp lastModDate = mock(Timestamp.class);
        covid19BenFeedback.setLastModDate(lastModDate);
        covid19BenFeedback.setMedical_consultation(true);
        covid19BenFeedback.setModeOfTravelDomestic("Mode Of Travel Domestic");
        covid19BenFeedback.setModeOfTravelInter("Mode Of Travel Inter");
        covid19BenFeedback.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        covid19BenFeedback.setProcessed("Processed");
        covid19BenFeedback.setProviderServiceMapID(1);
        ArrayList<String[]> recommendation = new ArrayList<>();
        covid19BenFeedback.setRecommendation(recommendation);
        covid19BenFeedback.setRecommendation_db("Recommendation db");
        covid19BenFeedback.setSuspectedStatus(true);
        covid19BenFeedback.setSuspectedStatusUI("Suspected Status UI");
        covid19BenFeedback.setSymptom(new String[]{"Symptom"});
        String[] symptoms = new String[]{"Symptoms"};
        covid19BenFeedback.setSymptoms(symptoms);
        covid19BenFeedback.setSymptoms_db("Symptoms db");
        covid19BenFeedback.setToCityInter(1);
        covid19BenFeedback.setToCountryInter(3);
        covid19BenFeedback.setToDistrictDom(1);
        covid19BenFeedback.setToStateDom(1);
        covid19BenFeedback.setToSubDistrictDom(1);
        covid19BenFeedback.setTocityInter(1);
        String[] travelList = new String[]{"Travel List"};
        covid19BenFeedback.setTravelList(travelList);
        covid19BenFeedback.setTravelStatus(true);
        covid19BenFeedback.setTravelType("Travel Type");
        covid19BenFeedback.setVanID(1);
        covid19BenFeedback.setVanSerialNo(1L);
        covid19BenFeedback.setVisitCode(1L);
        covid19BenFeedback.setcOVID19ID(1L);
        covid19BenFeedback.setcOVID19_contact_history("C OVID19 contact history");
        Long actualBenCallID = covid19BenFeedback.getBenCallID();
        Long actualBenMedHistoryID = covid19BenFeedback.getBenMedHistoryID();
        Long actualBeneficiaryRegID = covid19BenFeedback.getBeneficiaryRegID();
        String[] actualContactStatus = covid19BenFeedback.getContactStatus();
        String actualCreatedBy = covid19BenFeedback.getCreatedBy();
        Timestamp actualCreatedDate = covid19BenFeedback.getCreatedDate();
        Boolean actualDeleted = covid19BenFeedback.getDeleted();
        Integer actualFromCityInter = covid19BenFeedback.getFromCityInter();
        Integer actualFromCountryInter = covid19BenFeedback.getFromCountryInter();
        Integer actualFromDistrictDom = covid19BenFeedback.getFromDistrictDom();
        Integer actualFromStateDom = covid19BenFeedback.getFromStateDom();
        Integer actualFromSubDistrictDom = covid19BenFeedback.getFromSubDistrictDom();
        Integer actualFromcityInter = covid19BenFeedback.getFromcityInter();
        Timestamp actualLastModDate = covid19BenFeedback.getLastModDate();
        Boolean actualMedical_consultation = covid19BenFeedback.getMedical_consultation();
        String actualModeOfTravelDomestic = covid19BenFeedback.getModeOfTravelDomestic();
        String actualModeOfTravelInter = covid19BenFeedback.getModeOfTravelInter();
        String actualModifiedBy = covid19BenFeedback.getModifiedBy();
        String actualProcessed = covid19BenFeedback.getProcessed();
        Integer actualProviderServiceMapID = covid19BenFeedback.getProviderServiceMapID();
        ArrayList<String[]> actualRecommendation = covid19BenFeedback.getRecommendation();
        String actualRecommendation_db = covid19BenFeedback.getRecommendation_db();
        Boolean actualSuspectedStatus = covid19BenFeedback.getSuspectedStatus();
        String actualSuspectedStatusUI = covid19BenFeedback.getSuspectedStatusUI();
        String[] actualSymptom = covid19BenFeedback.getSymptom();
        String[] actualSymptoms = covid19BenFeedback.getSymptoms();
        String actualSymptoms_db = covid19BenFeedback.getSymptoms_db();
        Integer actualToCityInter = covid19BenFeedback.getToCityInter();
        Integer actualToCountryInter = covid19BenFeedback.getToCountryInter();
        Integer actualToDistrictDom = covid19BenFeedback.getToDistrictDom();
        Integer actualToStateDom = covid19BenFeedback.getToStateDom();
        Integer actualToSubDistrictDom = covid19BenFeedback.getToSubDistrictDom();
        Integer actualTocityInter = covid19BenFeedback.getTocityInter();
        String[] actualTravelList = covid19BenFeedback.getTravelList();
        Boolean actualTravelStatus = covid19BenFeedback.getTravelStatus();
        String actualTravelType = covid19BenFeedback.getTravelType();
        Integer actualVanID = covid19BenFeedback.getVanID();
        Long actualVanSerialNo = covid19BenFeedback.getVanSerialNo();
        Long actualVisitCode = covid19BenFeedback.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Mode Of Travel Domestic", actualModeOfTravelDomestic);
        assertEquals("Mode Of Travel Inter", actualModeOfTravelInter);
        assertEquals("Processed", actualProcessed);
        assertEquals("Recommendation db", actualRecommendation_db);
        assertEquals("Suspected Status UI", actualSuspectedStatusUI);
        assertEquals("Symptoms db", actualSymptoms_db);
        assertEquals("Travel Type", actualTravelType);
        assertEquals(1, actualFromCityInter.intValue());
        assertEquals(1, actualFromDistrictDom.intValue());
        assertEquals(1, actualFromStateDom.intValue());
        assertEquals(1, actualFromSubDistrictDom.intValue());
        assertEquals(1, actualFromcityInter.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualToCityInter.intValue());
        assertEquals(1, actualToDistrictDom.intValue());
        assertEquals(1, actualToStateDom.intValue());
        assertEquals(1, actualToSubDistrictDom.intValue());
        assertEquals(1, actualTocityInter.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBenCallID.longValue());
        assertEquals(1L, actualBenMedHistoryID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualVanSerialNo.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertEquals(3, actualFromCountryInter.intValue());
        assertEquals(3, actualToCountryInter.intValue());
        assertTrue(actualDeleted);
        assertTrue(actualMedical_consultation);
        assertTrue(actualSuspectedStatus);
        assertTrue(actualTravelStatus);
        assertSame(recommendation, actualRecommendation);
        assertSame(actualSymptom, actualSymptoms);
        assertSame(contactStatus, actualContactStatus);
        assertSame(symptoms, actualSymptom);
        assertSame(travelList, actualTravelList);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
