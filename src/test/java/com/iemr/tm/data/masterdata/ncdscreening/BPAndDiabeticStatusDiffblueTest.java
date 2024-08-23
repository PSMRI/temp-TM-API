package com.iemr.tm.data.masterdata.ncdscreening;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BPAndDiabeticStatusDiffblueTest {
    /**
     * Method under test:
     * {@link BPAndDiabeticStatus#getBPAndDiabeticStatus(ArrayList)}
     */
    @Test
    void testGetBPAndDiabeticStatus() {
        // Arrange and Act
        ArrayList<BPAndDiabeticStatus> actualBPAndDiabeticStatus = BPAndDiabeticStatus
                .getBPAndDiabeticStatus(new ArrayList<>());

        // Assert
        assertTrue(actualBPAndDiabeticStatus.isEmpty());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link BPAndDiabeticStatus#BPAndDiabeticStatus()}
     *   <li>{@link BPAndDiabeticStatus#setBpAndDiabeticStatus(String)}
     *   <li>{@link BPAndDiabeticStatus#setBpAndDiabeticStatusDesc(String)}
     *   <li>{@link BPAndDiabeticStatus#setBpAndDiabeticStatusID(Short)}
     *   <li>{@link BPAndDiabeticStatus#setCreatedBy(String)}
     *   <li>{@link BPAndDiabeticStatus#setCreatedDate(Timestamp)}
     *   <li>{@link BPAndDiabeticStatus#setDeleted(Boolean)}
     *   <li>{@link BPAndDiabeticStatus#setIsBPStatus(Boolean)}
     *   <li>{@link BPAndDiabeticStatus#setLastModDate(Timestamp)}
     *   <li>{@link BPAndDiabeticStatus#setModifiedBy(String)}
     *   <li>{@link BPAndDiabeticStatus#setProcessed(String)}
     *   <li>{@link BPAndDiabeticStatus#getBpAndDiabeticStatus()}
     *   <li>{@link BPAndDiabeticStatus#getBpAndDiabeticStatusDesc()}
     *   <li>{@link BPAndDiabeticStatus#getBpAndDiabeticStatusID()}
     *   <li>{@link BPAndDiabeticStatus#getCreatedBy()}
     *   <li>{@link BPAndDiabeticStatus#getCreatedDate()}
     *   <li>{@link BPAndDiabeticStatus#getDeleted()}
     *   <li>{@link BPAndDiabeticStatus#getIsBPStatus()}
     *   <li>{@link BPAndDiabeticStatus#getLastModDate()}
     *   <li>{@link BPAndDiabeticStatus#getModifiedBy()}
     *   <li>{@link BPAndDiabeticStatus#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        BPAndDiabeticStatus actualBpAndDiabeticStatus = new BPAndDiabeticStatus();
        actualBpAndDiabeticStatus.setBpAndDiabeticStatus("Bp And Diabetic Status");
        actualBpAndDiabeticStatus.setBpAndDiabeticStatusDesc("Bp And Diabetic Status Desc");
        actualBpAndDiabeticStatus.setBpAndDiabeticStatusID((short) 1);
        actualBpAndDiabeticStatus.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualBpAndDiabeticStatus.setCreatedDate(createdDate);
        actualBpAndDiabeticStatus.setDeleted(true);
        actualBpAndDiabeticStatus.setIsBPStatus(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualBpAndDiabeticStatus.setLastModDate(lastModDate);
        actualBpAndDiabeticStatus.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualBpAndDiabeticStatus.setProcessed("Processed");
        String actualBpAndDiabeticStatus2 = actualBpAndDiabeticStatus.getBpAndDiabeticStatus();
        String actualBpAndDiabeticStatusDesc = actualBpAndDiabeticStatus.getBpAndDiabeticStatusDesc();
        Short actualBpAndDiabeticStatusID = actualBpAndDiabeticStatus.getBpAndDiabeticStatusID();
        String actualCreatedBy = actualBpAndDiabeticStatus.getCreatedBy();
        Timestamp actualCreatedDate = actualBpAndDiabeticStatus.getCreatedDate();
        Boolean actualDeleted = actualBpAndDiabeticStatus.getDeleted();
        Boolean actualIsBPStatus = actualBpAndDiabeticStatus.getIsBPStatus();
        Timestamp actualLastModDate = actualBpAndDiabeticStatus.getLastModDate();
        String actualModifiedBy = actualBpAndDiabeticStatus.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Bp And Diabetic Status Desc", actualBpAndDiabeticStatusDesc);
        assertEquals("Bp And Diabetic Status", actualBpAndDiabeticStatus2);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualBpAndDiabeticStatus.getProcessed());
        assertEquals((short) 1, actualBpAndDiabeticStatusID.shortValue());
        assertTrue(actualDeleted);
        assertTrue(actualIsBPStatus);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link BPAndDiabeticStatus#BPAndDiabeticStatus(Short, String)}
     *   <li>{@link BPAndDiabeticStatus#setBpAndDiabeticStatus(String)}
     *   <li>{@link BPAndDiabeticStatus#setBpAndDiabeticStatusDesc(String)}
     *   <li>{@link BPAndDiabeticStatus#setBpAndDiabeticStatusID(Short)}
     *   <li>{@link BPAndDiabeticStatus#setCreatedBy(String)}
     *   <li>{@link BPAndDiabeticStatus#setCreatedDate(Timestamp)}
     *   <li>{@link BPAndDiabeticStatus#setDeleted(Boolean)}
     *   <li>{@link BPAndDiabeticStatus#setIsBPStatus(Boolean)}
     *   <li>{@link BPAndDiabeticStatus#setLastModDate(Timestamp)}
     *   <li>{@link BPAndDiabeticStatus#setModifiedBy(String)}
     *   <li>{@link BPAndDiabeticStatus#setProcessed(String)}
     *   <li>{@link BPAndDiabeticStatus#getBpAndDiabeticStatus()}
     *   <li>{@link BPAndDiabeticStatus#getBpAndDiabeticStatusDesc()}
     *   <li>{@link BPAndDiabeticStatus#getBpAndDiabeticStatusID()}
     *   <li>{@link BPAndDiabeticStatus#getCreatedBy()}
     *   <li>{@link BPAndDiabeticStatus#getCreatedDate()}
     *   <li>{@link BPAndDiabeticStatus#getDeleted()}
     *   <li>{@link BPAndDiabeticStatus#getIsBPStatus()}
     *   <li>{@link BPAndDiabeticStatus#getLastModDate()}
     *   <li>{@link BPAndDiabeticStatus#getModifiedBy()}
     *   <li>{@link BPAndDiabeticStatus#getProcessed()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        BPAndDiabeticStatus actualBpAndDiabeticStatus = new BPAndDiabeticStatus((short) 1, "Bp And Diabetic Status");
        actualBpAndDiabeticStatus.setBpAndDiabeticStatus("Bp And Diabetic Status");
        actualBpAndDiabeticStatus.setBpAndDiabeticStatusDesc("Bp And Diabetic Status Desc");
        actualBpAndDiabeticStatus.setBpAndDiabeticStatusID((short) 1);
        actualBpAndDiabeticStatus.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        actualBpAndDiabeticStatus.setCreatedDate(createdDate);
        actualBpAndDiabeticStatus.setDeleted(true);
        actualBpAndDiabeticStatus.setIsBPStatus(true);
        Timestamp lastModDate = mock(Timestamp.class);
        actualBpAndDiabeticStatus.setLastModDate(lastModDate);
        actualBpAndDiabeticStatus.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualBpAndDiabeticStatus.setProcessed("Processed");
        String actualBpAndDiabeticStatus2 = actualBpAndDiabeticStatus.getBpAndDiabeticStatus();
        String actualBpAndDiabeticStatusDesc = actualBpAndDiabeticStatus.getBpAndDiabeticStatusDesc();
        Short actualBpAndDiabeticStatusID = actualBpAndDiabeticStatus.getBpAndDiabeticStatusID();
        String actualCreatedBy = actualBpAndDiabeticStatus.getCreatedBy();
        Timestamp actualCreatedDate = actualBpAndDiabeticStatus.getCreatedDate();
        Boolean actualDeleted = actualBpAndDiabeticStatus.getDeleted();
        Boolean actualIsBPStatus = actualBpAndDiabeticStatus.getIsBPStatus();
        Timestamp actualLastModDate = actualBpAndDiabeticStatus.getLastModDate();
        String actualModifiedBy = actualBpAndDiabeticStatus.getModifiedBy();

        // Assert that nothing has changed
        assertEquals("Bp And Diabetic Status Desc", actualBpAndDiabeticStatusDesc);
        assertEquals("Bp And Diabetic Status", actualBpAndDiabeticStatus2);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Processed", actualBpAndDiabeticStatus.getProcessed());
        assertEquals((short) 1, actualBpAndDiabeticStatusID.shortValue());
        assertTrue(actualDeleted);
        assertTrue(actualIsBPStatus);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
