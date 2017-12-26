package com.llevett.english;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MessagerApplication {
	@Value("${producer.id:unset-id}")
	private String producerId;
	@Value("${message-hosts:unset-hosts}")
	private String[] messageHosts;

	public static void main(String[] args) {
		SpringApplication.run(MessagerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return (args) -> {
			System.out.println("Value from app props: " + producerId);
			System.out.println("Value from app profile props: " + Arrays.toString(messageHosts));
		};
	}
}
