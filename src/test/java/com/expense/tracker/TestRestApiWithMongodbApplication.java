package com.expense.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.utility.DockerImageName;

import com.expenditure.tracker.RestApiWithMongodbApplication;

@TestConfiguration(proxyBeanMethods = false)
public class TestRestApiWithMongodbApplication {

	@Bean
	@ServiceConnection
	MongoDBContainer mongoDbContainer() {
		return new MongoDBContainer(DockerImageName.parse("mongo:latest"));
	}

	public static void main(String[] args) {
		SpringApplication.from(RestApiWithMongodbApplication::main).with(TestRestApiWithMongodbApplication.class).run(args);
	}

}
