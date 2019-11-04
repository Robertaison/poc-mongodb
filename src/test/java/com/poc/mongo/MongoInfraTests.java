package com.poc.mongo;

import org.junit.ClassRule;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.DockerComposeContainer;
import org.testcontainers.containers.GenericContainer;

import java.io.File;

@SpringBootTest
class MongoApplicationTests {


	@ClassRule
	private static DockerComposeContainer environment = new DockerComposeContainer(
			new File("src/test/resources/docker-compose.yml")
	);

	@Test
	void contextLoads() {
        environment.start();
	}

}
