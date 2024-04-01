package com.iemr.tm.service.snomedct;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;

import com.iemr.tm.data.snomedct.SCTDescription;
import com.iemr.tm.repo.snomedct.SnomedRepository;

@ExtendWith(MockitoExtension.class)
class SnomedServiceImplTest {

	@Mock
	private SnomedRepository mockSnomedRepository;

	private SnomedServiceImpl snomedServiceImplUnderTest;

	@BeforeEach
	void setUp() {
		snomedServiceImplUnderTest = new SnomedServiceImpl();
		snomedServiceImplUnderTest.setSnomedRepository(mockSnomedRepository);
		ReflectionTestUtils.setField(snomedServiceImplUnderTest, "snomedCTPageSize", 0);
	}

	@Test
	void testFindSnomedCTRecordFromTerm() {

		// Run the test
		final SCTDescription result = snomedServiceImplUnderTest.findSnomedCTRecordFromTerm("term");

		// Verify the results
		assertNull(result);
	}

	@Test
	void testFindSnomedCTRecordFromTerm_SnomedRepositoryReturnsNoItems() {
		// Setup
		when(mockSnomedRepository.findSnomedCTRecordFromTerm("term")).thenReturn(Collections.emptyList());

		// Run the test
		final SCTDescription result = snomedServiceImplUnderTest.findSnomedCTRecordFromTerm("term");

		// Verify the results
		assertNull(result);
	}

}
