package com.driver.register.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.driver.register.dto.AddressDTO;
import com.driver.register.dto.DriversDTO;
import com.driver.register.model.Address;
import com.driver.register.model.Driver;
import com.driver.register.service.AddressService;
import com.driver.register.service.DriverService;

@RestController
@CrossOrigin
public class DriverController {
	
	@Autowired
	private DriverService userService;
	
	@Autowired
	private AddressService addressService;
	
	@Autowired
	private ModelMapper modelMapper;
	/*
	 * @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	 */
	@Autowired
	private PasswordEncoder bcryptEncoder;

	@GetMapping("/test")
	public String checkSystem() {
		System.out.println("User login");
		return "hi";
	}
	
	@PostMapping("/registerDriver")
	public ResponseEntity<Driver> createUser(@Valid @RequestBody DriversDTO driverDTO){
		System.out.println("User register");
		
		Driver newDriver = modelMapper.map(driverDTO,Driver.class);//new Driver();
		/*
		 * newDriver.setFirstName(user.getFirstName());
		 * newDriver.setLastName(user.getLastName());
		 * newDriver.setMobile(user.getMobile()); newDriver.setDob(user.getDob());
		 * newDriver.setGender(user.getGender()); newDriver.setEmail(user.getEmail());
		 */
		newDriver.setPassword(bcryptEncoder.encode(newDriver.getPassword()));
		newDriver.setCreated_by(123);
		newDriver.setCreated_date(LocalDate.now());
		newDriver.setUpdated_by(123);
		newDriver.setUpdated_date(LocalDate.now());
		newDriver.setStatus("R");
		
		userService.createUser(newDriver);
		return new ResponseEntity<Driver>(newDriver, HttpStatus.CREATED);
	}
	
	
	@PostMapping("/addAddress")
	public ResponseEntity<String> addAddress(@Valid @RequestBody List<AddressDTO> addressDTO){
		
		for(AddressDTO add:addressDTO) {
			Address newAddress = modelMapper.map(add,Address.class);//new Driver();		
			newAddress.setCreated_by(123);
			newAddress.setCreated_date(LocalDate.now());
			newAddress.setUpdated_by(123);
			newAddress.setUpdated_date(LocalDate.now());
			newAddress.setType(add.getType());
			newAddress.setDriverId(add.getDriver_id());
			addressService.addAddress(newAddress);
		}
		
		return new ResponseEntity<String>("Status", HttpStatus.CREATED);
	}

}
