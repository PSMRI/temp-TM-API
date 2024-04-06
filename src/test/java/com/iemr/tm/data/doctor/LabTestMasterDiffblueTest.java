package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class LabTestMasterDiffblueTest {
    /**
     * Method under test: {@link LabTestMaster#getLabTestMasters(ArrayList)}
     */
    @Test
    void testGetLabTestMasters() {
        // Arrange and Act
        ArrayList<LabTestMaster> actualLabTestMasters = LabTestMaster.getLabTestMasters(new ArrayList<>());

        // Assert
        assertTrue(actualLabTestMasters.isEmpty());
    }

    /**
     * Method under test: {@link LabTestMaster#getNCDScreeningTests(ArrayList)}
     */
    @Test
    void testGetNCDScreeningTests() {
        // Arrange and Act
        ArrayList<LabTestMaster> actualNCDScreeningTests = LabTestMaster.getNCDScreeningTests(new ArrayList<>());

        // Assert
        assertTrue(actualNCDScreeningTests.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link LabTestMaster#LabTestMaster()}
     *   <li>{@link LabTestMaster#setCreatedBy(String)}
     *   <li>{@link LabTestMaster#setCreatedDate(Timestamp)}
     *   <li>{@link LabTestMaster#setDeleted(Boolean)}
     *   <li>{@link LabTestMaster#setIsRadiologyImaging(Boolean)}
     *   <li>{@link LabTestMaster#setLastModDate(Timestamp)}
     *   <li>{@link LabTestMaster#setModifiedBy(String)}
     *   <li>{@link LabTestMaster#setProcessed(Character)}
     *   <li>{@link LabTestMaster#setTestDesc(String)}
     *   <li>{@link LabTestMaster#setTestFor(String)}
     *   <li>{@link LabTestMaster#setTestID(Integer)}
     *   <li>{@link LabTestMaster#setTestName(String)}
     *   <li>{@link LabTestMaster#getCreatedBy()}
     *   <li>{@link LabTestMaster#getCreatedDate()}
     *   <li>{@link LabTestMaster#getDeleted()}
     *   <li>{@link LabTestMaster#getIsRadiologyImaging()}
     *   <li>{@link LabTestMaster#getLastModDate()}
     *   <li>{@link LabTestMaster#getModifiedBy()}
     *   <li>{@link LabTestMaster#getProcessed()}
     *   <li>{@link LabTestMaster#getTestDesc()}
     *   <li>{@link LabTestMaster#getTestFor()}
     *   <li>{@link LabTestMaster#getTestID()}
     *   <li>{@link LabTestMaster#getTestName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        LabTestMaster actualLabTestMaster = new LabTestMaster();
        actualLabTestMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualLabTestMaster.setCreatedDate(createdDate);
        actualLabTestMaster.setDeleted(true);
        actualLabTestMaster.setIsRadiologyImaging(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualLabTestMaster.setLastModDate(lastModDate);
        actualLabTestMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualLabTestMaster.setProcessed('A');
        actualLabTestMaster.setTestDesc("Test Desc");
        actualLabTestMaster.setTestFor("Test For");
        actualLabTestMaster.setTestID(1);
        actualLabTestMaster.setTestName("Test Name");
        String actualCreatedBy = actualLabTestMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualLabTestMaster.getCreatedDate();
        Boolean actualDeleted = actualLabTestMaster.getDeleted();
        Boolean actualIsRadiologyImaging = actualLabTestMaster.getIsRadiologyImaging();
        Timestamp actualLastModDate = actualLabTestMaster.getLastModDate();
        String actualModifiedBy = actualLabTestMaster.getModifiedBy();
        Character actualProcessed = actualLabTestMaster.getProcessed();
        String actualTestDesc = actualLabTestMaster.getTestDesc();
        String actualTestFor = actualLabTestMaster.getTestFor();
        Integer actualTestID = actualLabTestMaster.getTestID();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Test Desc", actualTestDesc);
        assertEquals("Test For", actualTestFor);
        assertEquals("Test Name", actualLabTestMaster.getTestName());
        assertEquals('A', actualProcessed.charValue());
        assertEquals(1, actualTestID.intValue());
        assertTrue(actualDeleted);
        assertTrue(actualIsRadiologyImaging);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link LabTestMaster#LabTestMaster(Integer, String)}
     *   <li>{@link LabTestMaster#setCreatedBy(String)}
     *   <li>{@link LabTestMaster#setCreatedDate(Timestamp)}
     *   <li>{@link LabTestMaster#setDeleted(Boolean)}
     *   <li>{@link LabTestMaster#setIsRadiologyImaging(Boolean)}
     *   <li>{@link LabTestMaster#setLastModDate(Timestamp)}
     *   <li>{@link LabTestMaster#setModifiedBy(String)}
     *   <li>{@link LabTestMaster#setProcessed(Character)}
     *   <li>{@link LabTestMaster#setTestDesc(String)}
     *   <li>{@link LabTestMaster#setTestFor(String)}
     *   <li>{@link LabTestMaster#setTestID(Integer)}
     *   <li>{@link LabTestMaster#setTestName(String)}
     *   <li>{@link LabTestMaster#getCreatedBy()}
     *   <li>{@link LabTestMaster#getCreatedDate()}
     *   <li>{@link LabTestMaster#getDeleted()}
     *   <li>{@link LabTestMaster#getIsRadiologyImaging()}
     *   <li>{@link LabTestMaster#getLastModDate()}
     *   <li>{@link LabTestMaster#getModifiedBy()}
     *   <li>{@link LabTestMaster#getProcessed()}
     *   <li>{@link LabTestMaster#getTestDesc()}
     *   <li>{@link LabTestMaster#getTestFor()}
     *   <li>{@link LabTestMaster#getTestID()}
     *   <li>{@link LabTestMaster#getTestName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        LabTestMaster actualLabTestMaster = new LabTestMaster(1, "Test Name");
        actualLabTestMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualLabTestMaster.setCreatedDate(createdDate);
        actualLabTestMaster.setDeleted(true);
        actualLabTestMaster.setIsRadiologyImaging(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualLabTestMaster.setLastModDate(lastModDate);
        actualLabTestMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualLabTestMaster.setProcessed('A');
        actualLabTestMaster.setTestDesc("Test Desc");
        actualLabTestMaster.setTestFor("Test For");
        actualLabTestMaster.setTestID(1);
        actualLabTestMaster.setTestName("Test Name");
        String actualCreatedBy = actualLabTestMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualLabTestMaster.getCreatedDate();
        Boolean actualDeleted = actualLabTestMaster.getDeleted();
        Boolean actualIsRadiologyImaging = actualLabTestMaster.getIsRadiologyImaging();
        Timestamp actualLastModDate = actualLabTestMaster.getLastModDate();
        String actualModifiedBy = actualLabTestMaster.getModifiedBy();
        Character actualProcessed = actualLabTestMaster.getProcessed();
        String actualTestDesc = actualLabTestMaster.getTestDesc();
        String actualTestFor = actualLabTestMaster.getTestFor();
        Integer actualTestID = actualLabTestMaster.getTestID();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Test Desc", actualTestDesc);
        assertEquals("Test For", actualTestFor);
        assertEquals("Test Name", actualLabTestMaster.getTestName());
        assertEquals('A', actualProcessed.charValue());
        assertEquals(1, actualTestID.intValue());
        assertTrue(actualDeleted);
        assertTrue(actualIsRadiologyImaging);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link LabTestMaster#LabTestMaster(Integer, String, Boolean)}
     *   <li>{@link LabTestMaster#setCreatedBy(String)}
     *   <li>{@link LabTestMaster#setCreatedDate(Timestamp)}
     *   <li>{@link LabTestMaster#setDeleted(Boolean)}
     *   <li>{@link LabTestMaster#setIsRadiologyImaging(Boolean)}
     *   <li>{@link LabTestMaster#setLastModDate(Timestamp)}
     *   <li>{@link LabTestMaster#setModifiedBy(String)}
     *   <li>{@link LabTestMaster#setProcessed(Character)}
     *   <li>{@link LabTestMaster#setTestDesc(String)}
     *   <li>{@link LabTestMaster#setTestFor(String)}
     *   <li>{@link LabTestMaster#setTestID(Integer)}
     *   <li>{@link LabTestMaster#setTestName(String)}
     *   <li>{@link LabTestMaster#getCreatedBy()}
     *   <li>{@link LabTestMaster#getCreatedDate()}
     *   <li>{@link LabTestMaster#getDeleted()}
     *   <li>{@link LabTestMaster#getIsRadiologyImaging()}
     *   <li>{@link LabTestMaster#getLastModDate()}
     *   <li>{@link LabTestMaster#getModifiedBy()}
     *   <li>{@link LabTestMaster#getProcessed()}
     *   <li>{@link LabTestMaster#getTestDesc()}
     *   <li>{@link LabTestMaster#getTestFor()}
     *   <li>{@link LabTestMaster#getTestID()}
     *   <li>{@link LabTestMaster#getTestName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters3() {
        // Arrange and Act
        LabTestMaster actualLabTestMaster = new LabTestMaster(1, "Test Name", true);
        actualLabTestMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualLabTestMaster.setCreatedDate(createdDate);
        actualLabTestMaster.setDeleted(true);
        actualLabTestMaster.setIsRadiologyImaging(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualLabTestMaster.setLastModDate(lastModDate);
        actualLabTestMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualLabTestMaster.setProcessed('A');
        actualLabTestMaster.setTestDesc("Test Desc");
        actualLabTestMaster.setTestFor("Test For");
        actualLabTestMaster.setTestID(1);
        actualLabTestMaster.setTestName("Test Name");
        String actualCreatedBy = actualLabTestMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualLabTestMaster.getCreatedDate();
        Boolean actualDeleted = actualLabTestMaster.getDeleted();
        Boolean actualIsRadiologyImaging = actualLabTestMaster.getIsRadiologyImaging();
        Timestamp actualLastModDate = actualLabTestMaster.getLastModDate();
        String actualModifiedBy = actualLabTestMaster.getModifiedBy();
        Character actualProcessed = actualLabTestMaster.getProcessed();
        String actualTestDesc = actualLabTestMaster.getTestDesc();
        String actualTestFor = actualLabTestMaster.getTestFor();
        Integer actualTestID = actualLabTestMaster.getTestID();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Test Desc", actualTestDesc);
        assertEquals("Test For", actualTestFor);
        assertEquals("Test Name", actualLabTestMaster.getTestName());
        assertEquals('A', actualProcessed.charValue());
        assertEquals(1, actualTestID.intValue());
        assertTrue(actualDeleted);
        assertTrue(actualIsRadiologyImaging);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link LabTestMaster#LabTestMaster(Integer, String, String, String, Boolean, Boolean, Character, String, Timestamp, String, Timestamp)}
     *   <li>{@link LabTestMaster#setCreatedBy(String)}
     *   <li>{@link LabTestMaster#setCreatedDate(Timestamp)}
     *   <li>{@link LabTestMaster#setDeleted(Boolean)}
     *   <li>{@link LabTestMaster#setIsRadiologyImaging(Boolean)}
     *   <li>{@link LabTestMaster#setLastModDate(Timestamp)}
     *   <li>{@link LabTestMaster#setModifiedBy(String)}
     *   <li>{@link LabTestMaster#setProcessed(Character)}
     *   <li>{@link LabTestMaster#setTestDesc(String)}
     *   <li>{@link LabTestMaster#setTestFor(String)}
     *   <li>{@link LabTestMaster#setTestID(Integer)}
     *   <li>{@link LabTestMaster#setTestName(String)}
     *   <li>{@link LabTestMaster#getCreatedBy()}
     *   <li>{@link LabTestMaster#getCreatedDate()}
     *   <li>{@link LabTestMaster#getDeleted()}
     *   <li>{@link LabTestMaster#getIsRadiologyImaging()}
     *   <li>{@link LabTestMaster#getLastModDate()}
     *   <li>{@link LabTestMaster#getModifiedBy()}
     *   <li>{@link LabTestMaster#getProcessed()}
     *   <li>{@link LabTestMaster#getTestDesc()}
     *   <li>{@link LabTestMaster#getTestFor()}
     *   <li>{@link LabTestMaster#getTestID()}
     *   <li>{@link LabTestMaster#getTestName()}
     * </ul>
     */
    @Test
    void testGettersAndSetters4() {
        // Arrange and Act
        LabTestMaster actualLabTestMaster = new LabTestMaster(1, "Test Name", "Test Desc", "Test For", true, true, 'A',
                "Jan 1, 2020 8:00am GMT+0100", mock(Timestamp.class), "Jan 1, 2020 9:00am GMT+0100", mock(Timestamp.class));
        actualLabTestMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualLabTestMaster.setCreatedDate(createdDate);
        actualLabTestMaster.setDeleted(true);
        actualLabTestMaster.setIsRadiologyImaging(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualLabTestMaster.setLastModDate(lastModDate);
        actualLabTestMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualLabTestMaster.setProcessed('A');
        actualLabTestMaster.setTestDesc("Test Desc");
        actualLabTestMaster.setTestFor("Test For");
        actualLabTestMaster.setTestID(1);
        actualLabTestMaster.setTestName("Test Name");
        String actualCreatedBy = actualLabTestMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualLabTestMaster.getCreatedDate();
        Boolean actualDeleted = actualLabTestMaster.getDeleted();
        Boolean actualIsRadiologyImaging = actualLabTestMaster.getIsRadiologyImaging();
        Timestamp actualLastModDate = actualLabTestMaster.getLastModDate();
        String actualModifiedBy = actualLabTestMaster.getModifiedBy();
        Character actualProcessed = actualLabTestMaster.getProcessed();
        String actualTestDesc = actualLabTestMaster.getTestDesc();
        String actualTestFor = actualLabTestMaster.getTestFor();
        Integer actualTestID = actualLabTestMaster.getTestID();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Test Desc", actualTestDesc);
        assertEquals("Test For", actualTestFor);
        assertEquals("Test Name", actualLabTestMaster.getTestName());
        assertEquals('A', actualProcessed.charValue());
        assertEquals(1, actualTestID.intValue());
        assertTrue(actualDeleted);
        assertTrue(actualIsRadiologyImaging);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
