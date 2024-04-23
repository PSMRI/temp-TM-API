package com.iemr.tm.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import springfox.documentation.spring.web.plugins.Docket;

class SwaggerConfigTest {

    private SwaggerConfig swaggerConfigUnderTest;

    @BeforeEach
    void setUp() {
        swaggerConfigUnderTest = new SwaggerConfig();
    }

    @Test
    void testProductApi() {
        // Setup
        // Run the test
        final Docket result = swaggerConfigUnderTest.productApi();

        // Verify the results
    }
}
