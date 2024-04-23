package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

class DocWorkListDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link DocWorkList#DocWorkList()}
     *   <li>{@link DocWorkList#setBenVisitID(Long)}
     *   <li>{@link DocWorkList#setBeneficiaryID(String)}
     *   <li>{@link DocWorkList#setBeneficiaryRegID(Long)}
     *   <li>{@link DocWorkList#setDistrictName(String)}
     *   <li>{@link DocWorkList#setDob(Timestamp)}
     *   <li>{@link DocWorkList#setFatherName(String)}
     *   <li>{@link DocWorkList#setFirstName(String)}
     *   <li>{@link DocWorkList#setFlowStatusFlag(Character)}
     *   <li>{@link DocWorkList#setGenderID(Short)}
     *   <li>{@link DocWorkList#setGenderName(String)}
     *   <li>{@link DocWorkList#setId(Long)}
     *   <li>{@link DocWorkList#setLastName(String)}
     *   <li>{@link DocWorkList#setPhoneNo(String)}
     *   <li>{@link DocWorkList#setRegCreatedDate(Timestamp)}
     *   <li>{@link DocWorkList#setRegLastModDate(Timestamp)}
     *   <li>{@link DocWorkList#setVillageName(String)}
     *   <li>{@link DocWorkList#setVisitCategory(String)}
     *   <li>{@link DocWorkList#setVisitCreatedDate(Timestamp)}
     *   <li>{@link DocWorkList#setVisitFlowStatusFlag(String)}
     *   <li>{@link DocWorkList#setVisitNo(Short)}
     *   <li>{@link DocWorkList#getBenVisitID()}
     *   <li>{@link DocWorkList#getBeneficiaryID()}
     *   <li>{@link DocWorkList#getBeneficiaryRegID()}
     *   <li>{@link DocWorkList#getDistrictName()}
     *   <li>{@link DocWorkList#getDob()}
     *   <li>{@link DocWorkList#getFatherName()}
     *   <li>{@link DocWorkList#getFirstName()}
     *   <li>{@link DocWorkList#getFlowStatusFlag()}
     *   <li>{@link DocWorkList#getGenderID()}
     *   <li>{@link DocWorkList#getGenderName()}
     *   <li>{@link DocWorkList#getId()}
     *   <li>{@link DocWorkList#getLastName()}
     *   <li>{@link DocWorkList#getPhoneNo()}
     *   <li>{@link DocWorkList#getRegCreatedDate()}
     *   <li>{@link DocWorkList#getRegLastModDate()}
     *   <li>{@link DocWorkList#getVillageName()}
     *   <li>{@link DocWorkList#getVisitCategory()}
     *   <li>{@link DocWorkList#getVisitCreatedDate()}
     *   <li>{@link DocWorkList#getVisitFlowStatusFlag()}
     *   <li>{@link DocWorkList#getVisitNo()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        DocWorkList actualDocWorkList = new DocWorkList();
        actualDocWorkList.setBenVisitID(1L);
        actualDocWorkList.setBeneficiaryID("Beneficiary ID");
        actualDocWorkList.setBeneficiaryRegID(1L);
        actualDocWorkList.setDistrictName("District Name");
        Timestamp dob = mock(Timestamp.class);
        actualDocWorkList.setDob(dob);
        actualDocWorkList.setFatherName("Father Name");
        actualDocWorkList.setFirstName("Jane");
        actualDocWorkList.setFlowStatusFlag('A');
        actualDocWorkList.setGenderID((short) 1);
        actualDocWorkList.setGenderName("Gender Name");
        actualDocWorkList.setId(1L);
        actualDocWorkList.setLastName("Doe");
        actualDocWorkList.setPhoneNo("6625550144");
        Timestamp regCreatedDate = mock(Timestamp.class);
        actualDocWorkList.setRegCreatedDate(regCreatedDate);
        Timestamp regLastModDate = mock(Timestamp.class);
        actualDocWorkList.setRegLastModDate(regLastModDate);
        actualDocWorkList.setVillageName("Village Name");
        actualDocWorkList.setVisitCategory("Visit Category");
        Timestamp visitCreatedDate = mock(Timestamp.class);
        actualDocWorkList.setVisitCreatedDate(visitCreatedDate);
        actualDocWorkList.setVisitFlowStatusFlag("Visit Flow Status Flag");
        actualDocWorkList.setVisitNo((short) 1);
        Long actualBenVisitID = actualDocWorkList.getBenVisitID();
        String actualBeneficiaryID = actualDocWorkList.getBeneficiaryID();
        Long actualBeneficiaryRegID = actualDocWorkList.getBeneficiaryRegID();
        String actualDistrictName = actualDocWorkList.getDistrictName();
        Timestamp actualDob = actualDocWorkList.getDob();
        String actualFatherName = actualDocWorkList.getFatherName();
        String actualFirstName = actualDocWorkList.getFirstName();
        Character actualFlowStatusFlag = actualDocWorkList.getFlowStatusFlag();
        Short actualGenderID = actualDocWorkList.getGenderID();
        String actualGenderName = actualDocWorkList.getGenderName();
        Long actualId = actualDocWorkList.getId();
        String actualLastName = actualDocWorkList.getLastName();
        String actualPhoneNo = actualDocWorkList.getPhoneNo();
        Timestamp actualRegCreatedDate = actualDocWorkList.getRegCreatedDate();
        Timestamp actualRegLastModDate = actualDocWorkList.getRegLastModDate();
        String actualVillageName = actualDocWorkList.getVillageName();
        String actualVisitCategory = actualDocWorkList.getVisitCategory();
        Timestamp actualVisitCreatedDate = actualDocWorkList.getVisitCreatedDate();
        String actualVisitFlowStatusFlag = actualDocWorkList.getVisitFlowStatusFlag();
        Short actualVisitNo = actualDocWorkList.getVisitNo();

        // Assert that nothing has changed
        assertEquals("6625550144", actualPhoneNo);
        assertEquals("Beneficiary ID", actualBeneficiaryID);
        assertEquals("District Name", actualDistrictName);
        assertEquals("Doe", actualLastName);
        assertEquals("Father Name", actualFatherName);
        assertEquals("Gender Name", actualGenderName);
        assertEquals("Jane", actualFirstName);
        assertEquals("Village Name", actualVillageName);
        assertEquals("Visit Category", actualVisitCategory);
        assertEquals("Visit Flow Status Flag", actualVisitFlowStatusFlag);
        assertEquals('A', actualFlowStatusFlag.charValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualId.longValue());
        assertEquals((short) 1, actualGenderID.shortValue());
        assertEquals((short) 1, actualVisitNo.shortValue());
        assertSame(dob, actualDob);
        assertSame(regCreatedDate, actualRegCreatedDate);
        assertSame(regLastModDate, actualRegLastModDate);
        assertSame(visitCreatedDate, actualVisitCreatedDate);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link DocWorkList#DocWorkList(Long, Long, String, String, String, Short, String, Timestamp, Timestamp, Timestamp, Character, Long, Short, String, String, Timestamp, String, String, String, String)}
     *   <li>{@link DocWorkList#setBenVisitID(Long)}
     *   <li>{@link DocWorkList#setBeneficiaryID(String)}
     *   <li>{@link DocWorkList#setBeneficiaryRegID(Long)}
     *   <li>{@link DocWorkList#setDistrictName(String)}
     *   <li>{@link DocWorkList#setDob(Timestamp)}
     *   <li>{@link DocWorkList#setFatherName(String)}
     *   <li>{@link DocWorkList#setFirstName(String)}
     *   <li>{@link DocWorkList#setFlowStatusFlag(Character)}
     *   <li>{@link DocWorkList#setGenderID(Short)}
     *   <li>{@link DocWorkList#setGenderName(String)}
     *   <li>{@link DocWorkList#setId(Long)}
     *   <li>{@link DocWorkList#setLastName(String)}
     *   <li>{@link DocWorkList#setPhoneNo(String)}
     *   <li>{@link DocWorkList#setRegCreatedDate(Timestamp)}
     *   <li>{@link DocWorkList#setRegLastModDate(Timestamp)}
     *   <li>{@link DocWorkList#setVillageName(String)}
     *   <li>{@link DocWorkList#setVisitCategory(String)}
     *   <li>{@link DocWorkList#setVisitCreatedDate(Timestamp)}
     *   <li>{@link DocWorkList#setVisitFlowStatusFlag(String)}
     *   <li>{@link DocWorkList#setVisitNo(Short)}
     *   <li>{@link DocWorkList#getBenVisitID()}
     *   <li>{@link DocWorkList#getBeneficiaryID()}
     *   <li>{@link DocWorkList#getBeneficiaryRegID()}
     *   <li>{@link DocWorkList#getDistrictName()}
     *   <li>{@link DocWorkList#getDob()}
     *   <li>{@link DocWorkList#getFatherName()}
     *   <li>{@link DocWorkList#getFirstName()}
     *   <li>{@link DocWorkList#getFlowStatusFlag()}
     *   <li>{@link DocWorkList#getGenderID()}
     *   <li>{@link DocWorkList#getGenderName()}
     *   <li>{@link DocWorkList#getId()}
     *   <li>{@link DocWorkList#getLastName()}
     *   <li>{@link DocWorkList#getPhoneNo()}
     *   <li>{@link DocWorkList#getRegCreatedDate()}
     *   <li>{@link DocWorkList#getRegLastModDate()}
     *   <li>{@link DocWorkList#getVillageName()}
     *   <li>{@link DocWorkList#getVisitCategory()}
     *   <li>{@link DocWorkList#getVisitCreatedDate()}
     *   <li>{@link DocWorkList#getVisitFlowStatusFlag()}
     *   <li>{@link DocWorkList#getVisitNo()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange and Act
        DocWorkList actualDocWorkList = new DocWorkList(1L, 1L, "Beneficiary ID", "Jane", "Doe", (short) 1, "Gender Name",
                mock(Timestamp.class), mock(Timestamp.class), mock(Timestamp.class), 'A', 1L, (short) 1,
                "Visit Flow Status Flag", "Visit Category", mock(Timestamp.class), "Father Name", "District Name",
                "Village Name", "6625550144");
        actualDocWorkList.setBenVisitID(1L);
        actualDocWorkList.setBeneficiaryID("Beneficiary ID");
        actualDocWorkList.setBeneficiaryRegID(1L);
        actualDocWorkList.setDistrictName("District Name");
        Timestamp dob = mock(Timestamp.class);
        actualDocWorkList.setDob(dob);
        actualDocWorkList.setFatherName("Father Name");
        actualDocWorkList.setFirstName("Jane");
        actualDocWorkList.setFlowStatusFlag('A');
        actualDocWorkList.setGenderID((short) 1);
        actualDocWorkList.setGenderName("Gender Name");
        actualDocWorkList.setId(1L);
        actualDocWorkList.setLastName("Doe");
        actualDocWorkList.setPhoneNo("6625550144");
        Timestamp regCreatedDate = mock(Timestamp.class);
        actualDocWorkList.setRegCreatedDate(regCreatedDate);
        Timestamp regLastModDate = mock(Timestamp.class);
        actualDocWorkList.setRegLastModDate(regLastModDate);
        actualDocWorkList.setVillageName("Village Name");
        actualDocWorkList.setVisitCategory("Visit Category");
        Timestamp visitCreatedDate = mock(Timestamp.class);
        actualDocWorkList.setVisitCreatedDate(visitCreatedDate);
        actualDocWorkList.setVisitFlowStatusFlag("Visit Flow Status Flag");
        actualDocWorkList.setVisitNo((short) 1);
        Long actualBenVisitID = actualDocWorkList.getBenVisitID();
        String actualBeneficiaryID = actualDocWorkList.getBeneficiaryID();
        Long actualBeneficiaryRegID = actualDocWorkList.getBeneficiaryRegID();
        String actualDistrictName = actualDocWorkList.getDistrictName();
        Timestamp actualDob = actualDocWorkList.getDob();
        String actualFatherName = actualDocWorkList.getFatherName();
        String actualFirstName = actualDocWorkList.getFirstName();
        Character actualFlowStatusFlag = actualDocWorkList.getFlowStatusFlag();
        Short actualGenderID = actualDocWorkList.getGenderID();
        String actualGenderName = actualDocWorkList.getGenderName();
        Long actualId = actualDocWorkList.getId();
        String actualLastName = actualDocWorkList.getLastName();
        String actualPhoneNo = actualDocWorkList.getPhoneNo();
        Timestamp actualRegCreatedDate = actualDocWorkList.getRegCreatedDate();
        Timestamp actualRegLastModDate = actualDocWorkList.getRegLastModDate();
        String actualVillageName = actualDocWorkList.getVillageName();
        String actualVisitCategory = actualDocWorkList.getVisitCategory();
        Timestamp actualVisitCreatedDate = actualDocWorkList.getVisitCreatedDate();
        String actualVisitFlowStatusFlag = actualDocWorkList.getVisitFlowStatusFlag();
        Short actualVisitNo = actualDocWorkList.getVisitNo();

        // Assert that nothing has changed
        assertEquals("6625550144", actualPhoneNo);
        assertEquals("Beneficiary ID", actualBeneficiaryID);
        assertEquals("District Name", actualDistrictName);
        assertEquals("Doe", actualLastName);
        assertEquals("Father Name", actualFatherName);
        assertEquals("Gender Name", actualGenderName);
        assertEquals("Jane", actualFirstName);
        assertEquals("Village Name", actualVillageName);
        assertEquals("Visit Category", actualVisitCategory);
        assertEquals("Visit Flow Status Flag", actualVisitFlowStatusFlag);
        assertEquals('A', actualFlowStatusFlag.charValue());
        assertEquals(1L, actualBenVisitID.longValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualId.longValue());
        assertEquals((short) 1, actualGenderID.shortValue());
        assertEquals((short) 1, actualVisitNo.shortValue());
        assertSame(dob, actualDob);
        assertSame(regCreatedDate, actualRegCreatedDate);
        assertSame(regLastModDate, actualRegLastModDate);
        assertSame(visitCreatedDate, actualVisitCreatedDate);
    }
}
