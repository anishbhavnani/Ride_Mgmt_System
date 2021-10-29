package com.driver.onboarding.controller;

import java.time.LocalDate;

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

import com.driver.onboarding.dto.DeviceShippingDTO;
import com.driver.onboarding.dto.DriverStatusDTO;
import com.driver.onboarding.model.DeviceShipping;
import com.driver.onboarding.model.DriverStatus;
import com.driver.onboarding.service.DeviceShippingService;
import com.driver.onboarding.service.DriverStatusService;

@RestController
@CrossOrigin
public class DriverOnBoardController {
	
	@Autowired
	private DriverStatusService driverStatusService;
	
	@Autowired
	private DeviceShippingService deviceShippingService;
	
	@Autowired
	private ModelMapper modelMapper;
	/*
	 * @Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	 */
	
	@GetMapping("/test")
	public String checkSystem() {
		System.out.println("User login");
		return "hi";
	}
	
	@PostMapping("/updateRideStatus")
	public ResponseEntity<String> updateRideStatus(@Valid @RequestBody DriverStatusDTO driverStatusDTO){
		
		DriverStatus driverStatus = modelMapper.map(driverStatusDTO,DriverStatus.class);//new Driver();		
		driverStatus.setCreated_date(LocalDate.now());
		driverStatusService.updateRideStatus(driverStatus);
		return new ResponseEntity<String>("Status updated", HttpStatus.CREATED);
	}
	
	
	@PostMapping("/shipDevice")
	public ResponseEntity<String> shipDevice(@Valid @RequestBody DeviceShippingDTO deviceShippingDTO){
		
		DeviceShipping backGroundCheck = modelMapper.map(deviceShippingDTO,DeviceShipping.class);//new Driver();					
		deviceShippingService.shipDevice(backGroundCheck);
		return new ResponseEntity<String>("Device Shipped", HttpStatus.CREATED);
	}

}
