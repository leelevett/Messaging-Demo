package com.llevett.spanish;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpanishHelloWorld implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpanishHelloWorld.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola Mundo");
	}
}
