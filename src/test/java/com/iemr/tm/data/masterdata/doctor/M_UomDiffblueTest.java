package com.iemr.tm.data.masterdata.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

import java.sql.Date;

import org.junit.jupiter.api.Test;

class M_UomDiffblueTest {
    /**
     * Method under test: {@link M_Uom#getuOMID()}
     */
    @Test
    void testGetuOMID() {
        // Arrange, Act and Assert
        assertNull((new M_Uom()).getuOMID());
    }

    /**
     * Method under test: {@link M_Uom#getuOMID()}
     */
    @Test
    void testGetuOMID2() {
        // Arrange
        M_Uom m_Uom = new M_Uom();
        m_Uom.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        m_Uom.setCreatedDate(mock(Date.class));
        m_Uom.setDeleted(true);
        m_Uom.setLastModDate(mock(Date.class));
        m_Uom.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        m_Uom.setProcessed('A');
        m_Uom.setProviderServiceMapID(1);
        m_Uom.setStatus("Status");
        m_Uom.setuOMCode("U OMCode");
        m_Uom.setuOMDesc("U OMDesc");
        m_Uom.setuOMID(1);
        m_Uom.setuOMName("U OMName");

        // Act and Assert
        assertEquals(1, m_Uom.getuOMID().intValue());
    }

    /**
     * Method under test: {@link M_Uom#getuOMName()}
     */
    @Test
    void testGetuOMName() {
        // Arrange, Act and Assert
        assertNull((new M_Uom()).getuOMName());
    }

    /**
     * Method under test: {@link M_Uom#getuOMName()}
     */
    @Test
    void testGetuOMName2() {
        // Arrange
        M_Uom m_Uom = new M_Uom();
        m_Uom.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        m_Uom.setCreatedDate(mock(Date.class));
        m_Uom.setDeleted(true);
        m_Uom.setLastModDate(mock(Date.class));
        m_Uom.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        m_Uom.setProcessed('A');
        m_Uom.setProviderServiceMapID(1);
        m_Uom.setStatus("Status");
        m_Uom.setuOMCode("U OMCode");
        m_Uom.setuOMDesc("U OMDesc");
        m_Uom.setuOMID(1);
        m_Uom.setuOMName("U OMName");

        // Act and Assert
        assertEquals("U OMName", m_Uom.getuOMName());
    }

    /**
     * Method under test: {@link M_Uom#getuOMDesc()}
     */
    @Test
    void testGetuOMDesc() {
        // Arrange, Act and Assert
        assertNull((new M_Uom()).getuOMDesc());
    }

    /**
     * Method under test: {@link M_Uom#getuOMDesc()}
     */
    @Test
    void testGetuOMDesc2() {
        // Arrange
        M_Uom m_Uom = new M_Uom();
        m_Uom.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        m_Uom.setCreatedDate(mock(Date.class));
        m_Uom.setDeleted(true);
        m_Uom.setLastModDate(mock(Date.class));
        m_Uom.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        m_Uom.setProcessed('A');
        m_Uom.setProviderServiceMapID(1);
        m_Uom.setStatus("Status");
        m_Uom.setuOMCode("U OMCode");
        m_Uom.setuOMDesc("U OMDesc");
        m_Uom.setuOMID(1);
        m_Uom.setuOMName("U OMName");

        // Act and Assert
        assertEquals("U OMDesc", m_Uom.getuOMDesc());
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link M_Uom}
     *   <li>{@link M_Uom#setCreatedBy(String)}
     *   <li>{@link M_Uom#setCreatedDate(Date)}
     *   <li>{@link M_Uom#setDeleted(Boolean)}
     *   <li>{@link M_Uom#setLastModDate(Date)}
     *   <li>{@link M_Uom#setModifiedBy(String)}
     *   <li>{@link M_Uom#setProcessed(Character)}
     *   <li>{@link M_Uom#setProviderServiceMapID(Integer)}
     *   <li>{@link M_Uom#setStatus(String)}
     *   <li>{@link M_Uom#setuOMCode(String)}
     *   <li>{@link M_Uom#setuOMDesc(String)}
     *   <li>{@link M_Uom#setuOMID(Integer)}
     *   <li>{@link M_Uom#setuOMName(String)}
     *   <li>{@link M_Uom#getCreatedBy()}
     *   <li>{@link M_Uom#getCreatedDate()}
     *   <li>{@link M_Uom#getDeleted()}
     *   <li>{@link M_Uom#getLastModDate()}
     *   <li>{@link M_Uom#getModifiedBy()}
     *   <li>{@link M_Uom#getProcessed()}
     *   <li>{@link M_Uom#getProviderServiceMapID()}
     *   <li>{@link M_Uom#getStatus()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        M_Uom actualM_Uom = new M_Uom();
        actualM_Uom.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        Date createdDate = mock(Date.class);
        actualM_Uom.setCreatedDate(createdDate);
        actualM_Uom.setDeleted(true);
        Date lastModDate = mock(Date.class);
        actualM_Uom.setLastModDate(lastModDate);
        actualM_Uom.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        actualM_Uom.setProcessed('A');
        actualM_Uom.setProviderServiceMapID(1);
        actualM_Uom.setStatus("Status");
        actualM_Uom.setuOMCode("U OMCode");
        actualM_Uom.setuOMDesc("U OMDesc");
        actualM_Uom.setuOMID(1);
        actualM_Uom.setuOMName("U OMName");
        String actualCreatedBy = actualM_Uom.getCreatedBy();
        Date actualCreatedDate = actualM_Uom.getCreatedDate();
        Boolean actualDeleted = actualM_Uom.getDeleted();
        Date actualLastModDate = actualM_Uom.getLastModDate();
        String actualModifiedBy = actualM_Uom.getModifiedBy();
        Character actualProcessed = actualM_Uom.getProcessed();
        Integer actualProviderServiceMapID = actualM_Uom.getProviderServiceMapID();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals("Jan 1, 2020 9:00am GMT+0100", actualModifiedBy);
        assertEquals("Status", actualM_Uom.getStatus());
        assertEquals('A', actualProcessed.charValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertTrue(actualDeleted);
        assertSame(createdDate, actualCreatedDate);
        assertSame(lastModDate, actualLastModDate);
    }

    /**
     * Method under test: {@link M_Uom#getuOMCode()}
     */
    @Test
    void testGetuOMCode() {
        // Arrange, Act and Assert
        assertNull((new M_Uom()).getuOMCode());
    }

    /**
     * Method under test: {@link M_Uom#getuOMCode()}
     */
    @Test
    void testGetuOMCode2() {
        // Arrange
        M_Uom m_Uom = new M_Uom();
        m_Uom.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        m_Uom.setCreatedDate(mock(Date.class));
        m_Uom.setDeleted(true);
        m_Uom.setLastModDate(mock(Date.class));
        m_Uom.setModifiedBy("Jan 1, 2020 9:00am GMT+0100");
        m_Uom.setProcessed('A');
        m_Uom.setProviderServiceMapID(1);
        m_Uom.setStatus("Status");
        m_Uom.setuOMCode("U OMCode");
        m_Uom.setuOMDesc("U OMDesc");
        m_Uom.setuOMID(1);
        m_Uom.setuOMName("U OMName");

        // Act and Assert
        assertEquals("U OMCode", m_Uom.getuOMCode());
    }
}
