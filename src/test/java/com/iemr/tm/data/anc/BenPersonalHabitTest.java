package com.iemr.tm.data.anc;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class BenPersonalHabitTest {

	@Mock
	private BenPersonalHabit benPersonalHabitUnderTest;

	@BeforeEach
	void setUp() {
		benPersonalHabitUnderTest = new BenPersonalHabit("tobaccoUseTypeID", "tobaccoUseType", "otherTobaccoUseType",
				(short) 1, Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)), "alcoholTypeID", "alcoholType",
				"otherAlcoholType", "alcoholIntakeFrequency", "avgAlcoholConsumption",
				Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)),
				Timestamp.valueOf(LocalDateTime.of(2020, 1, 1, 0, 0, 0, 0)), 0L);
	}

	@Test
	void testGetPersonalDetails() {
		// Run the test
		final BenPersonalHabit result = new BenPersonalHabit();
		result.toString();
	}
}
