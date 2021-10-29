package com.driver.onboarding.mapper;

import com.driver.onboarding.dto.DeviceShippingDTO;
import com.driver.onboarding.model.DeviceShipping;

public interface MapStructMapper {

	DeviceShippingDTO driverToDriverDTO(DeviceShipping driver);
	DeviceShipping diverDtoToDriver(DeviceShippingDTO driver);
	
	
}
