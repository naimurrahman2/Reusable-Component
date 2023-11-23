package com.bjit.AuthenticationModule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AuthenticationModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticationModuleApplication.class, args);
	}

}
