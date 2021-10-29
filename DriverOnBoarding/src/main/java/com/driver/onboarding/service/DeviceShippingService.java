package com.driver.onboarding.service;

import org.springframework.stereotype.Service;
import com.driver.onboarding.model.DeviceShipping;

@Service
public interface DeviceShippingService {	
	public DeviceShipping shipDevice(DeviceShipping deviceShipping);
}
