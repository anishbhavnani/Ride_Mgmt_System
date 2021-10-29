package com.driver.register;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DriverRegisterApplication {

	public static void main(String[] args) {
		System.out.println("started");
		SpringApplication.run(DriverRegisterApplication.class, args);
	}
}
