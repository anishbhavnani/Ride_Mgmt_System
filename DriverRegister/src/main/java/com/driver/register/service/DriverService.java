package com.driver.register.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import com.driver.register.model.Driver;

@Service
public interface DriverService {
	
	public Driver addDriver(Driver user);
	Driver findAddressById(Integer id);
	Page<Driver> getAllAddress(Integer page,Integer size);
	Driver updateDriver(Driver driver);
	void deleteDriver(Integer id);
}
