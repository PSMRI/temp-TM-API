package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.ArrayList;
import java.util.Map;

import org.junit.jupiter.api.Test;

class WrapperCancerExamImgAnotasnDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link WrapperCancerExamImgAnotasn#WrapperCancerExamImgAnotasn()}
     *   <li>{@link WrapperCancerExamImgAnotasn#setBeneficiaryRegID(Long)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setCreatedBy(String)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setImageID(Integer)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setMarkers(ArrayList)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setParkingPlaceID(Integer)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setProviderServiceMapID(Integer)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setVanID(Integer)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setVisitCode(Long)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setVisitID(Long)}
     *   <li>{@link WrapperCancerExamImgAnotasn#getBeneficiaryRegID()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getCreatedBy()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getImageID()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getMarkers()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getParkingPlaceID()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getProviderServiceMapID()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getVanID()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getVisitCode()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getVisitID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange and Act
        WrapperCancerExamImgAnotasn actualWrapperCancerExamImgAnotasn = new WrapperCancerExamImgAnotasn();
        actualWrapperCancerExamImgAnotasn.setBeneficiaryRegID(1L);
        actualWrapperCancerExamImgAnotasn.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        actualWrapperCancerExamImgAnotasn.setImageID(1);
        ArrayList<Map<String, Object>> markers = new ArrayList<>();
        actualWrapperCancerExamImgAnotasn.setMarkers(markers);
        actualWrapperCancerExamImgAnotasn.setParkingPlaceID(1);
        actualWrapperCancerExamImgAnotasn.setProviderServiceMapID(1);
        actualWrapperCancerExamImgAnotasn.setVanID(1);
        actualWrapperCancerExamImgAnotasn.setVisitCode(1L);
        actualWrapperCancerExamImgAnotasn.setVisitID(1L);
        Long actualBeneficiaryRegID = actualWrapperCancerExamImgAnotasn.getBeneficiaryRegID();
        String actualCreatedBy = actualWrapperCancerExamImgAnotasn.getCreatedBy();
        Integer actualImageID = actualWrapperCancerExamImgAnotasn.getImageID();
        ArrayList<Map<String, Object>> actualMarkers = actualWrapperCancerExamImgAnotasn.getMarkers();
        Integer actualParkingPlaceID = actualWrapperCancerExamImgAnotasn.getParkingPlaceID();
        Integer actualProviderServiceMapID = actualWrapperCancerExamImgAnotasn.getProviderServiceMapID();
        Integer actualVanID = actualWrapperCancerExamImgAnotasn.getVanID();
        Long actualVisitCode = actualWrapperCancerExamImgAnotasn.getVisitCode();
        Long actualVisitID = actualWrapperCancerExamImgAnotasn.getVisitID();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals(1, actualImageID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertEquals(1L, actualVisitID.longValue());
        assertSame(markers, actualMarkers);
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>
     * {@link WrapperCancerExamImgAnotasn#WrapperCancerExamImgAnotasn(Long, Long, Integer, Integer, ArrayList, String)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setBeneficiaryRegID(Long)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setCreatedBy(String)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setImageID(Integer)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setMarkers(ArrayList)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setParkingPlaceID(Integer)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setProviderServiceMapID(Integer)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setVanID(Integer)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setVisitCode(Long)}
     *   <li>{@link WrapperCancerExamImgAnotasn#setVisitID(Long)}
     *   <li>{@link WrapperCancerExamImgAnotasn#getBeneficiaryRegID()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getCreatedBy()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getImageID()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getMarkers()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getParkingPlaceID()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getProviderServiceMapID()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getVanID()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getVisitCode()}
     *   <li>{@link WrapperCancerExamImgAnotasn#getVisitID()}
     * </ul>
     */
    @Test
    void testGettersAndSetters2() {
        // Arrange
        ArrayList<Map<String, Object>> markers = new ArrayList<>();

        // Act
        WrapperCancerExamImgAnotasn actualWrapperCancerExamImgAnotasn = new WrapperCancerExamImgAnotasn(1L, 1L, 1, 1,
                markers, "Jan 1, 2020 8:00am GMT+0100");
        actualWrapperCancerExamImgAnotasn.setBeneficiaryRegID(1L);
        actualWrapperCancerExamImgAnotasn.setCreatedBy("Jan 1, 2020 8:00am GMT+0100");
        actualWrapperCancerExamImgAnotasn.setImageID(1);
        ArrayList<Map<String, Object>> markers2 = new ArrayList<>();
        actualWrapperCancerExamImgAnotasn.setMarkers(markers2);
        actualWrapperCancerExamImgAnotasn.setParkingPlaceID(1);
        actualWrapperCancerExamImgAnotasn.setProviderServiceMapID(1);
        actualWrapperCancerExamImgAnotasn.setVanID(1);
        actualWrapperCancerExamImgAnotasn.setVisitCode(1L);
        actualWrapperCancerExamImgAnotasn.setVisitID(1L);
        Long actualBeneficiaryRegID = actualWrapperCancerExamImgAnotasn.getBeneficiaryRegID();
        String actualCreatedBy = actualWrapperCancerExamImgAnotasn.getCreatedBy();
        Integer actualImageID = actualWrapperCancerExamImgAnotasn.getImageID();
        ArrayList<Map<String, Object>> actualMarkers = actualWrapperCancerExamImgAnotasn.getMarkers();
        Integer actualParkingPlaceID = actualWrapperCancerExamImgAnotasn.getParkingPlaceID();
        Integer actualProviderServiceMapID = actualWrapperCancerExamImgAnotasn.getProviderServiceMapID();
        Integer actualVanID = actualWrapperCancerExamImgAnotasn.getVanID();
        Long actualVisitCode = actualWrapperCancerExamImgAnotasn.getVisitCode();
        Long actualVisitID = actualWrapperCancerExamImgAnotasn.getVisitID();

        // Assert that nothing has changed
        assertEquals("Jan 1, 2020 8:00am GMT+0100", actualCreatedBy);
        assertEquals(1, actualImageID.intValue());
        assertEquals(1, actualParkingPlaceID.intValue());
        assertEquals(1, actualProviderServiceMapID.intValue());
        assertEquals(1, actualVanID.intValue());
        assertEquals(1L, actualBeneficiaryRegID.longValue());
        assertEquals(1L, actualVisitCode.longValue());
        assertEquals(1L, actualVisitID.longValue());
        assertEquals(markers, actualMarkers);
        assertSame(markers2, actualMarkers);
    }
}
