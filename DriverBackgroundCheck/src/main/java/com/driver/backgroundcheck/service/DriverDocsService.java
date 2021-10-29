package com.driver.backgroundcheck.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.driver.backgroundcheck.model.DriverCar;
import com.driver.backgroundcheck.model.DriverDocs;
import com.driver.backgroundcheck.repository.DriverCarRepository;
import com.driver.backgroundcheck.repository.DriverDocsRepository;

@Service
public class DriverDocsService {
	
	@Autowired
	private DriverDocsRepository driverDocsRepository;
	
	@Autowired
	private DriverCarRepository driverCarRepository;
	
	public DriverDocs addDocs(DriverDocs driverDocs) {
		// TODO Auto-generated method stub
		return driverDocsRepository.save(driverDocs);
	}
	
	public DriverCar addDriverCar(DriverCar driverCar) {
		// TODO Auto-generated method stub
		return driverCarRepository.save(driverCar);
	}

}
