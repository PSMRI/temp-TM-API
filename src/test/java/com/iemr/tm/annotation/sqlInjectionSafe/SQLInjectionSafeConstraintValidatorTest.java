package com.iemr.tm.annotation.sqlInjectionSafe;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SQLInjectionSafeConstraintValidatorTest {

    private SQLInjectionSafeConstraintValidator sqlInjectionSafeConstraintValidatorUnderTest;

    @BeforeEach
    void setUp() {
        sqlInjectionSafeConstraintValidatorUnderTest = new SQLInjectionSafeConstraintValidator();
    }

    @Test
    void testInitialize() {
        sqlInjectionSafeConstraintValidatorUnderTest.initialize(null);
    }

    @Test
    void testIsValid() {
        assertThat(sqlInjectionSafeConstraintValidatorUnderTest.isValid("dataString", null)).isTrue();
    }
}
