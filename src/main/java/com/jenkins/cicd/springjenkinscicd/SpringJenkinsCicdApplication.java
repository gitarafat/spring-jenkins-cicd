package com.jenkins.cicd.springjenkinscicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinsCicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsCicdApplication.class, args);
		System.out.println("Im a Spring Boot Main application changed done....");
		System.out.println("New commit");
	}

}
