package com.driver.onboarding.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.driver.onboarding.model.DeviceShipping;
import com.driver.onboarding.repository.DeviceShippingRepository;
import com.driver.onboarding.service.DeviceShippingService;

@Service
public class DeviceShippingServiceImpl implements DeviceShippingService {
	
	@Autowired
	private DeviceShippingRepository deviceShippingRepository;
	
	@Override
    @Transactional
	public DeviceShipping shipDevice(DeviceShipping deviceShipping) {
		// TODO Auto-generated method stub
		return deviceShippingRepository.save(deviceShipping);
	}
}
