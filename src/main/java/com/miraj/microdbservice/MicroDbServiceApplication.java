package com.miraj.microdbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "com.miraj.microdbservice.repository")
@SpringBootApplication
public class MicroDbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroDbServiceApplication.class, args);
	}

}
