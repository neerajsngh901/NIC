package com.nic.oauth2.NicAuthServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class NicAuthServerApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(NicAuthServerApplication.class, args);
	}

}
