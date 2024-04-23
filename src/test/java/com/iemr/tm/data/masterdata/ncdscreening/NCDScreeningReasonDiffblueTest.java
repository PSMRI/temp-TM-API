package com.iemr.tm.data.masterdata.ncdscreening;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class NCDScreeningReasonDiffblueTest {
    /**
     * Method under test:
     * {@link NCDScreeningReason#getNCDScreeningReason(ArrayList)}
     */
    @Test
    void testGetNCDScreeningReason() {
        // Arrange and Act
        ArrayList<NCDScreeningReason> actualNCDScreeningReason = NCDScreeningReason
                .getNCDScreeningReason(new ArrayList<>());

        // Assert
        assertTrue(actualNCDScreeningReason.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link NCDScreeningReason#NCDScreeningReason(Integer, String)}
     *   <li>{@link NCDScreeningReason#setCreatedBy(String)}
     *   <li>{@link NCDScreeningReason#setCreatedDate(Timestamp)}
     *   <li>{@link NCDScreeningReason#setDeleted(Boolean)}
     *   <li>{@link NCDScreeningReason#setLastModDate(Timestamp)}
     *   <li>{@link NCDScreeningReason#setModifiedBy(String)}
     *   <li>{@link NCDScreeningReason#setNcdScreeningConditionID(Integer)}
     *   <li>{@link NCDScreeningReason#setNcdScreeningReason(String)}
     *   <li>{@link NCDScreeningReason#setNcdScreeningReasonDesc(String)}
     *   <li>{@link NCDScreeningReason#setNcdScreeningReasonID(Integer)}
     *   <li>{@link NCDScreeningReason#setProcessed(String)}
     *   <li>{@link NCDScreeningReason#getCreatedBy()}
     *   <li>{@link NCDScreeningReason#getCreatedDate()}
     *   <li>{@link NCDScreeningReason#getLastModDate()}
     *   <li>{@link NCDScreeningReason#getModifiedBy()}
     *   <li>{@link NCDScreeningReason#getNcdScreeningConditionID()}
     *   <li>{@link NCDScreeningReason#getNcdScreeningReason()}
     *   <li>{@link NCDScreeningReason#getNcdScreeningReasonDesc()}
     *   <li>{@link NCDScreeningReason#getNcdScreeningReasonID()}
     *   <li>{@link NCDScreeningReason#getProcessed()}
     *   <li>{@link NCDScreeningReason#isDeleted()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        NCDScreeningReason actualNcdScreeningReason = new NCDScreeningReason(1, "Just cause");
        actualNcdScreeningReason.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualNcdScreeningReason.setCreatedDate(createdDate);
        actualNcdScreeningReason.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualNcdScreeningReason.setLastModDate(lastModDate);
        actualNcdScreeningReason.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualNcdScreeningReason.setNcdScreeningConditionID(1);
        actualNcdScreeningReason.setNcdScreeningReason("Just cause");
        actualNcdScreeningReason.setNcdScreeningReasonDesc("Just cause");
        actualNcdScreeningReason.setNcdScreeningReasonID(1);
        actualNcdScreeningReason.setProcessed("Processed");
        String actualCreatedBy = actualNcdScreeningReason.getCreatedBy();
        Timestamp actualCreatedDate = actualNcdScreeningReason.getCreatedDate();
        Timestamp actualLastModDate = actualNcdScreeningReason.getLastModDate();
        String actualModifiedBy = actualNcdScreeningReason.getModifiedBy();
        Integer actualNcdScreeningConditionID = actualNcdScreeningReason.getNcdScreeningConditionID();
        String actualNcdScreeningReason2 = actualNcdScreeningReason.getNcdScreeningReason();
        String actualNcdScreeningReasonDesc = actualNcdScreeningReason.getNcdScreeningReasonDesc();
        Integer actualNcdScreeningReasonID = actualNcdScreeningReason.getNcdScreeningReasonID();
        String actualProcessed = actualNcdScreeningReason.getProcessed();
        Boolean actualIsDeletedResult = actualNcdScreeningReason.isDeleted();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Just cause", actualNcdScreeningReason2);
        assertEquals("Just cause", actualNcdScreeningReasonDesc);
        assertEquals("Processed", actualProcessed);
        assertEquals(1, actualNcdScreeningConditionID.intValue());
        assertEquals(1, actualNcdScreeningReasonID.intValue());
        assertTrue(actualIsDeletedResult);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
