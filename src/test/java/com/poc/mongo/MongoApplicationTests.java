package com.poc.mongo;

import io.restassured.http.ContentType;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.testcontainers.containers.DockerComposeContainer;

import java.io.File;

import static io.restassured.RestAssured.given;

public class MongoApplicationTests extends RestAssuredConfig {

    @ClassRule
    private static DockerComposeContainer environment = new DockerComposeContainer(
            new File("src/test/resources/docker-compose.yml")
    );

    @Before
    public void setUp() {
      environment.start();
    }

    @Test
    public void shouldSaveOnDbs() {

//        given().
//                contentType(ContentType.JSON)
//                    .body()
//                .when()
//                    .post("/transition")
//                .then()
//                    .statusCode(HttpStatus.CREATED.value());
    }
}
