package com.driver.onboarding.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.driver.onboarding.model.DriverStatus;
import com.driver.onboarding.repository.DriverStatusRepository;
import com.driver.onboarding.service.DriverStatusService;


@Service
public class DriverStatusServiceImpl implements DriverStatusService {
	
	@Autowired
	private DriverStatusRepository driverStatusRepository;
	
	@Override
    @Transactional
	public DriverStatus updateRideStatus(DriverStatus driverStatus) {
		// TODO Auto-generated method stub
		return driverStatusRepository.save(driverStatus);
	}

}
