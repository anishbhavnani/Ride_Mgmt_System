package com.driver.backgroundcheck.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.driver.backgroundcheck.model.Vehicle;
import com.driver.backgroundcheck.repository.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository addressRepository;
	

	public Vehicle addAddress(Vehicle newAddress) {
		// TODO Auto-generated method stub
		return addressRepository.save(newAddress);
	}	

}
