package com.santander.oauth2.autenticationlogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
public class AutenticationLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutenticationLoginApplication.class, args);
	}

}
