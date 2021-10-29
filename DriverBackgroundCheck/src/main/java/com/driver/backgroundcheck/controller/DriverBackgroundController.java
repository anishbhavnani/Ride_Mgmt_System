package com.driver.backgroundcheck.controller;

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

import com.driver.backgroundcheck.dto.BackGroundCheckDTO;
import com.driver.backgroundcheck.dto.DriverCarDTO;
import com.driver.backgroundcheck.dto.DriverDocsDTO;
import com.driver.backgroundcheck.model.BackgroundCheck;
import com.driver.backgroundcheck.model.DriverCar;
import com.driver.backgroundcheck.model.DriverDocs;
import com.driver.backgroundcheck.service.BackGroundCheckService;
import com.driver.backgroundcheck.service.DriverDocsService;

@RestController
@CrossOrigin
public class DriverBackgroundController {
	
	@Autowired
	private DriverDocsService driverDocsService;
	
	@Autowired
	private BackGroundCheckService backGroundCheckService;
	
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
	
	@PostMapping("/addDocuments")
	public ResponseEntity<String> createUser(@Valid @RequestBody DriverDocsDTO driverDocsDTO){
		
		DriverDocs driverDocs = modelMapper.map(driverDocsDTO,DriverDocs.class);//new Driver();		
		driverDocs.setCreated_by(123);
		driverDocs.setCreated_date(LocalDate.now());
		driverDocs.setUpdated_by(123);
		driverDocs.setUpdated_date(LocalDate.now());		
		driverDocsService.addDocs(driverDocs);
		return new ResponseEntity<String>("Documents saved", HttpStatus.CREATED);
	}
	
	
	@PostMapping("/backgroundCheck")
	public ResponseEntity<String> backgroundCheck(@Valid @RequestBody BackGroundCheckDTO backGroundCheckDTO){
		
		BackgroundCheck backGroundCheck = modelMapper.map(backGroundCheckDTO,BackgroundCheck.class);//new Driver();		
		backGroundCheck.setCreated_by(123);
		backGroundCheck.setCreated_date(LocalDate.now());
		backGroundCheck.setUpdated_by(123);
		backGroundCheck.setUpdated_date(LocalDate.now());		
		backGroundCheckService.verifyDriver(backGroundCheck);
		return new ResponseEntity<String>("Driver verified", HttpStatus.CREATED);
	}

	@PostMapping("/addDriverCar")
	public ResponseEntity<String> addDriverCar(@Valid @RequestBody DriverCarDTO driverCarDTO){
		
		DriverCar driverCar = modelMapper.map(driverCarDTO,DriverCar.class);//new Driver();		
		driverCar.setCreated_by(123);
		driverCar.setCreated_date(LocalDate.now());
		driverCar.setUpdated_by(123);
		driverCar.setUpdated_date(LocalDate.now());		
		driverDocsService.addDriverCar(driverCar);;
		return new ResponseEntity<String>("Driver car added", HttpStatus.CREATED);
	}

}
