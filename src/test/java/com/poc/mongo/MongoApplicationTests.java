package com.poc.mongo;

import org.junit.ClassRule;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.DockerComposeContainer;

import java.io.File;

public class MongoApplicationTests {
    @ClassRule
    private static DockerComposeContainer environment = new DockerComposeContainer(
            new File("src/test/resources/docker-compose.yml")
    );

    @Test
    void contextLoads() {
        environment.start();
    }
}
