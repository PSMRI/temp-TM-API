package com.iemr.tm.data.masterdata.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Date;

import org.junit.jupiter.api.Test;

class M_ManufacturerDiffblueTest {
    /**
     * Method under test: {@link M_Manufacturer#getcST_GST_No()}
     */
    @Test
    void testGetcST_GST_No() {
        // Arrange, Act and Assert
        assertNull((new M_Manufacturer()).getcST_GST_No());
    }

    /**
     * Method under test: {@link M_Manufacturer#getcST_GST_No()}
     */
    @Test
    void testGetcST_GST_No2() {
        // Arrange
        M_Manufacturer m_Manufacturer = new M_Manufacturer();
        m_Manufacturer.setContactPerson("Contact Person");
        m_Manufacturer.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        m_Manufacturer.setCreatedDate(mock(Date.class));
        m_Manufacturer.setDeleted(true);
        m_Manufacturer.setLastModDate(mock(Date.class));
        m_Manufacturer.setManufacturerCode("Manufacturer Code");
        m_Manufacturer.setManufacturerDesc("Manufacturer Desc");
        m_Manufacturer.setManufacturerID(1);
        m_Manufacturer.setManufacturerName("Manufacturer Name");
        m_Manufacturer.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        m_Manufacturer.setProviderServiceMapID(1);
        m_Manufacturer.setStatus("Status");
        m_Manufacturer.setcST_GST_No("C ST GST No");

        // Act and Assert
        assertEquals("C ST GST No", m_Manufacturer.getcST_GST_No());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link M_Manufacturer}
     *   <li>{@link M_Manufacturer#setContactPerson(String)}
     *   <li>{@link M_Manufacturer#setCreatedBy(String)}
     *   <li>{@link M_Manufacturer#setCreatedDate(Date)}
     *   <li>{@link M_Manufacturer#setDeleted(Boolean)}
     *   <li>{@link M_Manufacturer#setLastModDate(Date)}
     *   <li>{@link M_Manufacturer#setManufacturerCode(String)}
     *   <li>{@link M_Manufacturer#setManufacturerDesc(String)}
     *   <li>{@link M_Manufacturer#setManufacturerID(Integer)}
     *   <li>{@link M_Manufacturer#setManufacturerName(String)}
     *   <li>{@link M_Manufacturer#setModifiedBy(String)}
     *   <li>{@link M_Manufacturer#setProviderServiceMapID(Integer)}
     *   <li>{@link M_Manufacturer#setStatus(String)}
     *   <li>{@link M_Manufacturer#setcST_GST_No(String)}
     *   <li>{@link M_Manufacturer#getContactPerson()}
     *   <li>{@link M_Manufacturer#getCreatedBy()}
     *   <li>{@link M_Manufacturer#getCreatedDate()}
     *   <li>{@link M_Manufacturer#getDeleted()}
     *   <li>{@link M_Manufacturer#getLastModDate()}
     *   <li>{@link M_Manufacturer#getManufacturerCode()}
     *   <li>{@link M_Manufacturer#getManufacturerDesc()}
     *   <li>{@link M_Manufacturer#getManufacturerID()}
     *   <li>{@link M_Manufacturer#getManufacturerName()}
     *   <li>{@link M_Manufacturer#getModifiedBy()}
     *   <li>{@link M_Manufacturer#getProviderServiceMapID()}
     *   <li>{@link M_Manufacturer#getStatus()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        M_Manufacturer actualM_Manufacturer = new M_Manufacturer();
        actualM_Manufacturer.setContactPerson("Contact Person");
        actualM_Manufacturer.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Date createdDate = mock(Date.class);
        actualM_Manufacturer.setCreatedDate(createdDate);
        actualM_Manufacturer.setDeleted(true);
        Date lastModDate = mock(Date.class);
        actualM_Manufacturer.setLastModDate(lastModDate);
        actualM_Manufacturer.setManufacturerCode("Manufacturer Code");
        actualM_Manufacturer.setManufacturerDesc("Manufacturer Desc");
        actualM_Manufacturer.setManufacturerID(1);
        actualM_Manufacturer.setManufacturerName("Manufacturer Name");
        actualM_Manufacturer.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualM_Manufacturer.setProviderServiceMapID(1);
        actualM_Manufacturer.setStatus("Status");
        actualM_Manufacturer.setcST_GST_No("C ST GST No");
        String actualContactPerson = actualM_Manufacturer.getContactPerson();
        String actualCreatedBy = actualM_Manufacturer.getCreatedBy();
        Date actualCreatedDate = actualM_Manufacturer.getCreatedDate();
        Boolean actualDeleted = actualM_Manufacturer.getDeleted();
        Date actualLastModDate = actualM_Manufacturer.getLastModDate();
        String actualManufacturerCode = actualM_Manufacturer.getManufacturerCode();
        String actualManufacturerDesc = actualM_Manufacturer.getManufacturerDesc();
        Integer actualManufacturerID = actualM_Manufacturer.getManufacturerID();
        String actualManufacturerName = actualM_Manufacturer.getManufacturerName();
        String actualModifiedBy = actualM_Manufacturer.getModifiedBy();
        Integer actualProviderServiceMapID = actualM_Manufacturer.getProviderServiceMapID();

        // Assert that nothing has changed
        assertEquals("Contact Person", actualContactPerson);
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Manufacturer Code", actualManufacturerCode);
        assertEquals("Manufacturer Desc", actualManufacturerDesc);
        assertEquals("Manufacturer Name", actualManufacturerName);
        assertEquals("Status", actualM_Manufacturer.getStatus());
        assertEquals(1, actualManufacturerID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }
}
