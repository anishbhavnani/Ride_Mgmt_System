package com.driver.backgroundcheck.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.driver.backgroundcheck.model.BackgroundCheck;
import com.driver.backgroundcheck.repository.BackgroundCheckRepository;

@Service
public class BackGroundCheckService {
	
	@Autowired
	private BackgroundCheckRepository backgroundCheckRepository;
	
	public BackgroundCheck verifyDriver(BackgroundCheck backgroundCheck) {
		// TODO Auto-generated method stub
		return backgroundCheckRepository.save(backgroundCheck);
	}

}
