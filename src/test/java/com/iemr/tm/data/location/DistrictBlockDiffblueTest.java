package com.iemr.tm.data.location;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

class DistrictBlockDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DistrictBlock#setBlockID(Integer)}
     *   <li>{@link DistrictBlock#setBlockName(String)}
     *   <li>{@link DistrictBlock#setCreatedBy(String)}
     *   <li>{@link DistrictBlock#setCreatedDate(Timestamp)}
     *   <li>{@link DistrictBlock#setDistrictID(Integer)}
     *   <li>{@link DistrictBlock#setLastModDate(Timestamp)}
     *   <li>{@link DistrictBlock#setModifiedBy(String)}
     *   <li>{@link DistrictBlock#setStateID(Integer)}
     *   <li>{@link DistrictBlock#toString()}
     *   <li>{@link DistrictBlock#getBlockID()}
     *   <li>{@link DistrictBlock#getBlockName()}
     *   <li>{@link DistrictBlock#getCreatedBy()}
     *   <li>{@link DistrictBlock#getCreatedDate()}
     *   <li>{@link DistrictBlock#getDistrictID()}
     *   <li>{@link DistrictBlock#getLastModDate()}
     *   <li>{@link DistrictBlock#getModifiedBy()}
     *   <li>{@link DistrictBlock#getStateID()}
     *   <li>{@link DistrictBlock#isDeleted()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        DistrictBlock districtBlock = new DistrictBlock();

        // Act
        districtBlock.setBlockID(1);
        districtBlock.setBlockName("Block Name");
        districtBlock.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Timestamp createdDate = mock(Timestamp.class);
        districtBlock.setCreatedDate(createdDate);
        districtBlock.setDistrictID(1);
        Timestamp lastModDate = mock(Timestamp.class);
        districtBlock.setLastModDate(lastModDate);
        districtBlock.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        districtBlock.setStateID(1);
        String actualToStringResult = districtBlock.toString();
        Integer actualBlockID = districtBlock.getBlockID();
        String actualBlockName = districtBlock.getBlockName();
        String actualCreatedBy = districtBlock.getCreatedBy();
        Timestamp actualCreatedDate = districtBlock.getCreatedDate();
        Integer actualDistrictID = districtBlock.getDistrictID();
        Timestamp actualLastModDate = districtBlock.getLastModDate();
        String actualModifiedBy = districtBlock.getModifiedBy();
        Integer actualStateID = districtBlock.getStateID();
        districtBlock.isDeleted();

        // Assert that nothing has changed
        assertEquals("Block Name", actualBlockName);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals(
                "{\"blockID\":1,\"districtID\":1,\"blockName\":\"Block Name\",\"stateID\":1,\"deleted\":null,\"createdBy\":\"Jan 1,"
                        + " 2020 8:00am GMT+0100\"}",
                actualToStringResult);
        assertEquals(1, actualBlockID.intValue());
        assertEquals(1, actualDistrictID.intValue());
        assertEquals(1, actualStateID.intValue());
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Method under test: {@link DistrictBlock#setDeleted(boolean)}
     */
    @Test
    void testSetDeleted() {
        // Arrange
        DistrictBlock districtBlock = new DistrictBlock();

        // Act
        districtBlock.setDeleted(true);

        // Assert
        assertTrue(districtBlock.isDeleted());
    }

    /**
     * Method under test: {@link DistrictBlock#setDeleted(boolean)}
     */
    @Test
    void testSetDeleted2() {
        // Arrange
        DistrictBlock districtBlock = new DistrictBlock();
        districtBlock.setBlockID(1);
        districtBlock.setBlockName("Block Name");
        districtBlock.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        districtBlock.setCreatedDate(mock(Timestamp.class));
        districtBlock.setDeleted(true);
        districtBlock.setDistrictID(1);
        districtBlock.setLastModDate(mock(Timestamp.class));
        districtBlock.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        districtBlock.setStateID(1);

        // Act
        districtBlock.setDeleted(true);

        // Assert
        assertTrue(districtBlock.isDeleted());
    }

    /**
     * Method under test: {@link DistrictBlock#DistrictBlock()}
     */
    @Test
    void testNewDistrictBlock() {
        // Arrange and Act
        DistrictBlock actualDistrictBlock = new DistrictBlock();

        // Assert
        assertNull(actualDistrictBlock.isDeleted());
        assertNull(actualDistrictBlock.getBlockID());
        assertNull(actualDistrictBlock.getDistrictID());
        assertNull(actualDistrictBlock.getStateID());
        assertNull(actualDistrictBlock.getBlockName());
        assertNull(actualDistrictBlock.getCreatedBy());
        assertNull(actualDistrictBlock.getModifiedBy());
        assertNull(actualDistrictBlock.getCreatedDate());
        assertNull(actualDistrictBlock.getLastModDate());
    }

    /**
     * Method under test: {@link DistrictBlock#DistrictBlock(Integer, String)}
     */
    @Test
    void testNewDistrictBlock2() {
        // Arrange and Act
        DistrictBlock actualDistrictBlock = new DistrictBlock(1, "Block Name");

        // Assert
        assertEquals("Block Name", actualDistrictBlock.getBlockName());
        assertEquals(1, actualDistrictBlock.getBlockID().intValue());
    }
}
