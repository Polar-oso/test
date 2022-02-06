package com.test.project.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.test.project.repository")
public class TestApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(TestApplication.class, args);
	}
}
