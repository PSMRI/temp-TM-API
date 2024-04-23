package com.iemr.tm.data.doctor;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProviderSpecificRequestDiffblueTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link ProviderSpecificRequest#setBenRegID(Long)}
     *   <li>{@link ProviderSpecificRequest#setBenVisitID(String)}
     *   <li>{@link ProviderSpecificRequest#setFetchMMUDataFor(String)}
     *   <li>{@link ProviderSpecificRequest#setVisitCode(Long)}
     *   <li>{@link ProviderSpecificRequest#getBenRegID()}
     *   <li>{@link ProviderSpecificRequest#getBenVisitID()}
     *   <li>{@link ProviderSpecificRequest#getFetchMMUDataFor()}
     *   <li>{@link ProviderSpecificRequest#getVisitCode()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        ProviderSpecificRequest providerSpecificRequest = new ProviderSpecificRequest();

        // Act
        providerSpecificRequest.setBenRegID(1L);
        providerSpecificRequest.setBenVisitID("Ben Visit ID");
        providerSpecificRequest.setFetchMMUDataFor("Fetch MMUData For");
        providerSpecificRequest.setVisitCode(1L);
        Long actualBenRegID = providerSpecificRequest.getBenRegID();
        String actualBenVisitID = providerSpecificRequest.getBenVisitID();
        String actualFetchMMUDataFor = providerSpecificRequest.getFetchMMUDataFor();
        Long actualVisitCode = providerSpecificRequest.getVisitCode();

        // Assert that nothing has changed
        assertEquals("Ben Visit ID", actualBenVisitID);
        assertEquals("Fetch MMUData For", actualFetchMMUDataFor);
        assertEquals(1L, actualBenRegID.longValue());
        assertEquals(1L, actualVisitCode.longValue());
    }
}
