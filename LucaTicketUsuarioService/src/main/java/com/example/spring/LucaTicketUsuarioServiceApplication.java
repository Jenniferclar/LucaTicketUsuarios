package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LucaTicketUsuarioServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LucaTicketUsuarioServiceApplication.class, args);
	}

}
