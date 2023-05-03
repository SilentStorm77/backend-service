package com.car.backendservice;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendServiceApplication.class, args);
	}

	@PostConstruct
	public void init() {
		// Set up GPIO pins using Pi4J library
	}

}
