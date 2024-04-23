package com.iemr.tm.data.masterdata.anc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class OptionalVaccinationsDiffblueTest {
    /**
     * Method under test:
     * {@link OptionalVaccinations#getOptionalVaccinations(ArrayList)}
     */
    @Test
    void testGetOptionalVaccinations() {
        // Arrange and Act
        ArrayList<OptionalVaccinations> actualOptionalVaccinations = OptionalVaccinations
                .getOptionalVaccinations(new ArrayList<>());

        // Assert
        assertTrue(actualOptionalVaccinations.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link OptionalVaccinations#OptionalVaccinations(Short, String, String, String)}
     *   <li>{@link OptionalVaccinations#setCreatedBy(String)}
     *   <li>{@link OptionalVaccinations#setCreatedDate(Timestamp)}
     *   <li>{@link OptionalVaccinations#setDeleted(Boolean)}
     *   <li>{@link OptionalVaccinations#setLastModDate(Timestamp)}
     *   <li>{@link OptionalVaccinations#setModifiedBy(String)}
     *   <li>{@link OptionalVaccinations#setProcessed(String)}
     *   <li>{@link OptionalVaccinations#setSctCode(String)}
     *   <li>{@link OptionalVaccinations#setSctTerm(String)}
     *   <li>{@link OptionalVaccinations#setVaccinationTime(String)}
     *   <li>{@link OptionalVaccinations#setVaccineDesc(String)}
     *   <li>{@link OptionalVaccinations#setVaccineID(Short)}
     *   <li>{@link OptionalVaccinations#setVaccineName(String)}
     *   <li>{@link OptionalVaccinations#getCreatedBy()}
     *   <li>{@link OptionalVaccinations#getCreatedDate()}
     *   <li>{@link OptionalVaccinations#getDeleted()}
     *   <li>{@link OptionalVaccinations#getLastModDate()}
     *   <li>{@link OptionalVaccinations#getModifiedBy()}
     *   <li>{@link OptionalVaccinations#getProcessed()}
     *   <li>{@link OptionalVaccinations#getSctCode()}
     *   <li>{@link OptionalVaccinations#getSctTerm()}
     *   <li>{@link OptionalVaccinations#getVaccinationTime()}
     *   <li>{@link OptionalVaccinations#getVaccineDesc()}
     *   <li>{@link OptionalVaccinations#getVaccineID()}
     *   <li>{@link OptionalVaccinations#getVaccineName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        OptionalVaccinations actualOptionalVaccinations = new OptionalVaccinations((short) 1, "Vaccine Name", "Sct Code",
                "Sct Term");
        actualOptionalVaccinations.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualOptionalVaccinations.setCreatedDate(createdDate);
        actualOptionalVaccinations.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualOptionalVaccinations.setLastModDate(lastModDate);
        actualOptionalVaccinations.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualOptionalVaccinations.setProcessed("Processed");
        actualOptionalVaccinations.setSctCode("Sct Code");
        actualOptionalVaccinations.setSctTerm("Sct Term");
        actualOptionalVaccinations.setVaccinationTime("Vaccination Time");
        actualOptionalVaccinations.setVaccineDesc("Vaccine Desc");
        actualOptionalVaccinations.setVaccineID((short) 1);
        actualOptionalVaccinations.setVaccineName("Vaccine Name");
        String actualCreatedBy = actualOptionalVaccinations.getCreatedBy();
        Timestamp actualCreatedDate = actualOptionalVaccinations.getCreatedDate();
        Boolean actualDeleted = actualOptionalVaccinations.getDeleted();
        Timestamp actualLastModDate = actualOptionalVaccinations.getLastModDate();
        String actualModifiedBy = actualOptionalVaccinations.getModifiedBy();
        String actualProcessed = actualOptionalVaccinations.getProcessed();
        String actualSctCode = actualOptionalVaccinations.getSctCode();
        String actualSctTerm = actualOptionalVaccinations.getSctTerm();
        String actualVaccinationTime = actualOptionalVaccinations.getVaccinationTime();
        String actualVaccineDesc = actualOptionalVaccinations.getVaccineDesc();
        Short actualVaccineID = actualOptionalVaccinations.getVaccineID();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualProcessed);
        assertEquals("Sct Code", actualSctCode);
        assertEquals("Sct Term", actualSctTerm);
        assertEquals("Vaccination Time", actualVaccinationTime);
        assertEquals("Vaccine Desc", actualVaccineDesc);
        assertEquals("Vaccine Name", actualOptionalVaccinations.getVaccineName());
        assertEquals((short) 1, actualVaccineID.shortValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
