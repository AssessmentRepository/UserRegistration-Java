package com.userRegistration.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableAutoConfiguration
@EnableMongoRepositories(basePackages="com.userRegistration.*")
@SpringBootApplication(scanBasePackages = { "com.userRegistration" })
@SpringBootConfiguration
public class UserRegistrationApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationApplication.class, args);
	}
}
