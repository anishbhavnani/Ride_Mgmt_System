package com.driver.backgroundcheck;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DriverBackgroundApplication {

	public static void main(String[] args) {
		System.out.println("started");
		SpringApplication.run(DriverBackgroundApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
