package com.llevett.english;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessagerConfiguration {
	@Value("${producer.id:unset-id}")
	private String producerId;
	@Value("${message-hosts:unset-hosts}")
	private String[] messageHosts;
}
