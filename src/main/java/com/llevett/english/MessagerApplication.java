package com.llevett.english;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MessagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return (args) -> {
			System.out.println("Hello world");
		};
	}
}
