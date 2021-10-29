package com.driver.onboarding.service;

import org.springframework.stereotype.Service;

import com.driver.onboarding.model.DriverStatus;

@Service
public interface  DriverStatusService {	
	public DriverStatus updateRideStatus(DriverStatus driverStatus);

}
