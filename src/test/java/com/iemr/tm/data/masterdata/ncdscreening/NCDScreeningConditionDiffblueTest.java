package com.iemr.tm.data.masterdata.ncdscreening;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class NCDScreeningConditionDiffblueTest {
    /**
     * Method under test:
     * {@link NCDScreeningCondition#getNCDScreeningCondition(ArrayList)}
     */
    @Test
    void testGetNCDScreeningCondition() {
        // Arrange and Act
        ArrayList<NCDScreeningCondition> actualNCDScreeningCondition = NCDScreeningCondition
                .getNCDScreeningCondition(new ArrayList<>());

        // Assert
        assertTrue(actualNCDScreeningCondition.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link NCDScreeningCondition#NCDScreeningCondition(Integer, String)}
     *   <li>{@link NCDScreeningCondition#setCreatedBy(String)}
     *   <li>{@link NCDScreeningCondition#setCreatedDate(Timestamp)}
     *   <li>{@link NCDScreeningCondition#setDeleted(Boolean)}
     *   <li>{@link NCDScreeningCondition#setLastModDate(Timestamp)}
     *   <li>{@link NCDScreeningCondition#setModifiedBy(String)}
     *   <li>{@link NCDScreeningCondition#setNcdScreeningCondition(String)}
     *   <li>{@link NCDScreeningCondition#setNcdScreeningConditionDesc(String)}
     *   <li>{@link NCDScreeningCondition#setNcdScreeningConditionID(Integer)}
     *   <li>{@link NCDScreeningCondition#setProcessed(String)}
     *   <li>{@link NCDScreeningCondition#getCreatedBy()}
     *   <li>{@link NCDScreeningCondition#getCreatedDate()}
     *   <li>{@link NCDScreeningCondition#getLastModDate()}
     *   <li>{@link NCDScreeningCondition#getModifiedBy()}
     *   <li>{@link NCDScreeningCondition#getNcdScreeningCondition()}
     *   <li>{@link NCDScreeningCondition#getNcdScreeningConditionDesc()}
     *   <li>{@link NCDScreeningCondition#getNcdScreeningConditionID()}
     *   <li>{@link NCDScreeningCondition#getProcessed()}
     *   <li>{@link NCDScreeningCondition#isDeleted()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        NCDScreeningCondition actualNcdScreeningCondition = new NCDScreeningCondition(1, "Ncd Screening Condition");
        actualNcdScreeningCondition.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualNcdScreeningCondition.setCreatedDate(createdDate);
        actualNcdScreeningCondition.setDeleted(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualNcdScreeningCondition.setLastModDate(lastModDate);
        actualNcdScreeningCondition.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualNcdScreeningCondition.setNcdScreeningCondition("Ncd Screening Condition");
        actualNcdScreeningCondition.setNcdScreeningConditionDesc("Ncd Screening Condition Desc");
        actualNcdScreeningCondition.setNcdScreeningConditionID(1);
        actualNcdScreeningCondition.setProcessed("Processed");
        String actualCreatedBy = actualNcdScreeningCondition.getCreatedBy();
        Timestamp actualCreatedDate = actualNcdScreeningCondition.getCreatedDate();
        Timestamp actualLastModDate = actualNcdScreeningCondition.getLastModDate();
        String actualModifiedBy = actualNcdScreeningCondition.getModifiedBy();
        String actualNcdScreeningCondition2 = actualNcdScreeningCondition.getNcdScreeningCondition();
        String actualNcdScreeningConditionDesc = actualNcdScreeningCondition.getNcdScreeningConditionDesc();
        Integer actualNcdScreeningConditionID = actualNcdScreeningCondition.getNcdScreeningConditionID();
        String actualProcessed = actualNcdScreeningCondition.getProcessed();
        Boolean actualIsDeletedResult = actualNcdScreeningCondition.isDeleted();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Ncd Screening Condition Desc", actualNcdScreeningConditionDesc);
        assertEquals("Ncd Screening Condition", actualNcdScreeningCondition2);
        assertEquals("Processed", actualProcessed);
        assertEquals(1, actualNcdScreeningConditionID.intValue());
        assertTrue(actualIsDeletedResult);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
