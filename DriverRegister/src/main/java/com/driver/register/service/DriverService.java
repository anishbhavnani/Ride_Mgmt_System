package com.driver.register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.driver.register.model.Address;
import com.driver.register.model.Driver;
import com.driver.register.repository.DriverRepository;

@Service
public class DriverService {
	
	@Autowired
	private DriverRepository userRepository;
	
	public Driver createUser(Driver user) {
		return userRepository.save(user);
	}

}
