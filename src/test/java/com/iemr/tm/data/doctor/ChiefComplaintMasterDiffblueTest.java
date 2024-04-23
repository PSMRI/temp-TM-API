package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ChiefComplaintMasterDiffblueTest {
    /**
     * Method under test:
     * {@link ChiefComplaintMaster#getChiefComplaintMasters(ArrayList)}
     */
    @Test
    void testGetChiefComplaintMasters() {
        // Arrange and Act
        ArrayList<ChiefComplaintMaster> actualChiefComplaintMasters = ChiefComplaintMaster
                .getChiefComplaintMasters(new ArrayList<>());

        // Assert
        assertTrue(actualChiefComplaintMasters.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ChiefComplaintMaster#ChiefComplaintMaster()}
     *   <li>{@link ChiefComplaintMaster#setChiefComplaint(String)}
     *   <li>{@link ChiefComplaintMaster#setChiefComplaintDesc(String)}
     *   <li>{@link ChiefComplaintMaster#setChiefComplaintID(Integer)}
     *   <li>{@link ChiefComplaintMaster#setCreatedBy(String)}
     *   <li>{@link ChiefComplaintMaster#setCreatedDate(Timestamp)}
     *   <li>{@link ChiefComplaintMaster#setDeleted(Boolean)}
     *   <li>{@link ChiefComplaintMaster#setLastModDate(Timestamp)}
     *   <li>{@link ChiefComplaintMaster#setModifiedBy(String)}
     *   <li>{@link ChiefComplaintMaster#setProcessed(Character)}
     *   <li>{@link ChiefComplaintMaster#getChiefComplaint()}
     *   <li>{@link ChiefComplaintMaster#getChiefComplaintDesc()}
     *   <li>{@link ChiefComplaintMaster#getChiefComplaintID()}
     *   <li>{@link ChiefComplaintMaster#getCreatedBy()}
     *   <li>{@link ChiefComplaintMaster#getCreatedDate()}
     *   <li>{@link ChiefComplaintMaster#getDeleted()}
     *   <li>{@link ChiefComplaintMaster#getLastModDate()}
     *   <li>{@link ChiefComplaintMaster#getModifiedBy()}
     *   <li>{@link ChiefComplaintMaster#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        ChiefComplaintMaster actualChiefComplaintMaster = new ChiefComplaintMaster();
        actualChiefComplaintMaster.setChiefComplaint("Chief Complaint");
        actualChiefComplaintMaster.setChiefComplaintDesc("Chief Complaint Desc");
        actualChiefComplaintMaster.setChiefComplaintID(1);
        actualChiefComplaintMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualChiefComplaintMaster.setCreatedDate(createdDate);
        actualChiefComplaintMaster.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualChiefComplaintMaster.setLastModDate(lastModDate);
        actualChiefComplaintMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualChiefComplaintMaster.setProcessed('A');
        String actualChiefComplaint = actualChiefComplaintMaster.getChiefComplaint();
        String actualChiefComplaintDesc = actualChiefComplaintMaster.getChiefComplaintDesc();
        Integer actualChiefComplaintID = actualChiefComplaintMaster.getChiefComplaintID();
        String actualCreatedBy = actualChiefComplaintMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualChiefComplaintMaster.getCreatedDate();
        Boolean actualDeleted = actualChiefComplaintMaster.getDeleted();
        Timestamp actualLastModDate = actualChiefComplaintMaster.getLastModDate();
        String actualModifiedBy = actualChiefComplaintMaster.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Chief Complaint Desc", actualChiefComplaintDesc);
        assertEquals("Chief Complaint", actualChiefComplaint);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals('A', actualChiefComplaintMaster.getProcessed().charValue());
        assertEquals(1, actualChiefComplaintID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link ChiefComplaintMaster#ChiefComplaintMaster(Integer, String, String)}
     *   <li>{@link ChiefComplaintMaster#setChiefComplaint(String)}
     *   <li>{@link ChiefComplaintMaster#setChiefComplaintDesc(String)}
     *   <li>{@link ChiefComplaintMaster#setChiefComplaintID(Integer)}
     *   <li>{@link ChiefComplaintMaster#setCreatedBy(String)}
     *   <li>{@link ChiefComplaintMaster#setCreatedDate(Timestamp)}
     *   <li>{@link ChiefComplaintMaster#setDeleted(Boolean)}
     *   <li>{@link ChiefComplaintMaster#setLastModDate(Timestamp)}
     *   <li>{@link ChiefComplaintMaster#setModifiedBy(String)}
     *   <li>{@link ChiefComplaintMaster#setProcessed(Character)}
     *   <li>{@link ChiefComplaintMaster#getChiefComplaint()}
     *   <li>{@link ChiefComplaintMaster#getChiefComplaintDesc()}
     *   <li>{@link ChiefComplaintMaster#getChiefComplaintID()}
     *   <li>{@link ChiefComplaintMaster#getCreatedBy()}
     *   <li>{@link ChiefComplaintMaster#getCreatedDate()}
     *   <li>{@link ChiefComplaintMaster#getDeleted()}
     *   <li>{@link ChiefComplaintMaster#getLastModDate()}
     *   <li>{@link ChiefComplaintMaster#getModifiedBy()}
     *   <li>{@link ChiefComplaintMaster#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        ChiefComplaintMaster actualChiefComplaintMaster = new ChiefComplaintMaster(1, "Chief Complaint",
                "Chief Complaint Desc");
        actualChiefComplaintMaster.setChiefComplaint("Chief Complaint");
        actualChiefComplaintMaster.setChiefComplaintDesc("Chief Complaint Desc");
        actualChiefComplaintMaster.setChiefComplaintID(1);
        actualChiefComplaintMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualChiefComplaintMaster.setCreatedDate(createdDate);
        actualChiefComplaintMaster.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualChiefComplaintMaster.setLastModDate(lastModDate);
        actualChiefComplaintMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualChiefComplaintMaster.setProcessed('A');
        String actualChiefComplaint = actualChiefComplaintMaster.getChiefComplaint();
        String actualChiefComplaintDesc = actualChiefComplaintMaster.getChiefComplaintDesc();
        Integer actualChiefComplaintID = actualChiefComplaintMaster.getChiefComplaintID();
        String actualCreatedBy = actualChiefComplaintMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualChiefComplaintMaster.getCreatedDate();
        Boolean actualDeleted = actualChiefComplaintMaster.getDeleted();
        Timestamp actualLastModDate = actualChiefComplaintMaster.getLastModDate();
        String actualModifiedBy = actualChiefComplaintMaster.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Chief Complaint Desc", actualChiefComplaintDesc);
        assertEquals("Chief Complaint", actualChiefComplaint);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals('A', actualChiefComplaintMaster.getProcessed().charValue());
        assertEquals(1, actualChiefComplaintID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link ChiefComplaintMaster#ChiefComplaintMaster(Integer, String, String, Boolean, Character, String, Timestamp, String, Timestamp)}
     *   <li>{@link ChiefComplaintMaster#setChiefComplaint(String)}
     *   <li>{@link ChiefComplaintMaster#setChiefComplaintDesc(String)}
     *   <li>{@link ChiefComplaintMaster#setChiefComplaintID(Integer)}
     *   <li>{@link ChiefComplaintMaster#setCreatedBy(String)}
     *   <li>{@link ChiefComplaintMaster#setCreatedDate(Timestamp)}
     *   <li>{@link ChiefComplaintMaster#setDeleted(Boolean)}
     *   <li>{@link ChiefComplaintMaster#setLastModDate(Timestamp)}
     *   <li>{@link ChiefComplaintMaster#setModifiedBy(String)}
     *   <li>{@link ChiefComplaintMaster#setProcessed(Character)}
     *   <li>{@link ChiefComplaintMaster#getChiefComplaint()}
     *   <li>{@link ChiefComplaintMaster#getChiefComplaintDesc()}
     *   <li>{@link ChiefComplaintMaster#getChiefComplaintID()}
     *   <li>{@link ChiefComplaintMaster#getCreatedBy()}
     *   <li>{@link ChiefComplaintMaster#getCreatedDate()}
     *   <li>{@link ChiefComplaintMaster#getDeleted()}
     *   <li>{@link ChiefComplaintMaster#getLastModDate()}
     *   <li>{@link ChiefComplaintMaster#getModifiedBy()}
     *   <li>{@link ChiefComplaintMaster#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters3() {
        // Arrange and Act
        ChiefComplaintMaster actualChiefComplaintMaster = new ChiefComplaintMaster(1, "Chief Complaint",
                "Chief Complaint Desc", true, 'A', "Jan 1, 2020 8:00am GMT+0100", mock(Timestamp.class),
                "Jan 1, 2020 9:00am GMT+0100", mock(Timestamp.class));
        actualChiefComplaintMaster.setChiefComplaint("Chief Complaint");
        actualChiefComplaintMaster.setChiefComplaintDesc("Chief Complaint Desc");
        actualChiefComplaintMaster.setChiefComplaintID(1);
        actualChiefComplaintMaster.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualChiefComplaintMaster.setCreatedDate(createdDate);
        actualChiefComplaintMaster.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualChiefComplaintMaster.setLastModDate(lastModDate);
        actualChiefComplaintMaster.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualChiefComplaintMaster.setProcessed('A');
        String actualChiefComplaint = actualChiefComplaintMaster.getChiefComplaint();
        String actualChiefComplaintDesc = actualChiefComplaintMaster.getChiefComplaintDesc();
        Integer actualChiefComplaintID = actualChiefComplaintMaster.getChiefComplaintID();
        String actualCreatedBy = actualChiefComplaintMaster.getCreatedBy();
        Timestamp actualCreatedDate = actualChiefComplaintMaster.getCreatedDate();
        Boolean actualDeleted = actualChiefComplaintMaster.getDeleted();
        Timestamp actualLastModDate = actualChiefComplaintMaster.getLastModDate();
        String actualModifiedBy = actualChiefComplaintMaster.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Chief Complaint Desc", actualChiefComplaintDesc);
        assertEquals("Chief Complaint", actualChiefComplaint);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals('A', actualChiefComplaintMaster.getProcessed().charValue());
        assertEquals(1, actualChiefComplaintID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
