package com.driver.register.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.driver.register.model.Address;
import com.driver.register.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	

	public Address addAddress(Address newAddress) {
		// TODO Auto-generated method stub
		return addressRepository.save(newAddress);
	}	

}
