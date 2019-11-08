package com.poc.mongo;

import com.poc.mongo.factory.RequestBuilder;
import com.poc.mongo.status.mapping.request.WorkerRequest;
import io.restassured.http.ContentType;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.testcontainers.containers.DockerComposeContainer;

import java.io.File;

import static io.restassured.RestAssured.given;

@SpringBootTest
public class MongoApplicationTests extends RestAssuredConfig {

    @ClassRule
    public static DockerComposeContainer environment = new DockerComposeContainer(
            new File("src/test/resources/docker-compose.yml")
    );

    @Before
    public void setUp() {
      environment.start();
    }

    @Test
    public void shouldSaveOnDbs() {
        final WorkerRequest workerRequest = RequestBuilder.validWorkder()
                                                            .build();

        given().
                contentType(ContentType.JSON)
                .body(workerRequest)
                .when()
                .post("/post")
                .then()
                .statusCode(HttpStatus.CREATED.value());
    }
}
