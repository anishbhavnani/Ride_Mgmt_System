package com.driver.register.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.driver.register.model.Address;

@Service
public interface AddressService {
		
	Address addAddress(Address newAddress);
	Address findAddressById(Integer id);
	List<Address> findAll();
	Address updateAddress(Address address);
	void deleteAddress(Integer id);
}
