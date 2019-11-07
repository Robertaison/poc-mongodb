package com.poc.mongo;

import io.restassured.RestAssured;
import org.junit.Before;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class RestAssuredConfig {

    @LocalServerPort
    private int port;

    @Before
    public void setUp() {

        RestAssured.baseURI = "http://localhost";
        RestAssured.port = this.port;
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
