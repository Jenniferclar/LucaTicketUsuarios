package com.example.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Project LucaTicketUsuarioService
 *
 * @ClassName LucaTicketUsuarioServiceApplication
 *
 * @author Jennifer Pérez
 *
 * @date 7 jul. 2021
 * 
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LucaTicketUsuarioServiceApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(LucaTicketUsuarioServiceApplication.class, args);
	}

}
