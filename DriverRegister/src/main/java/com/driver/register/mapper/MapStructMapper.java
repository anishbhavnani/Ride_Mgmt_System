package com.driver.register.mapper;

import com.driver.register.dto.DriversDTO;
import com.driver.register.model.Driver;

public interface MapStructMapper {

	DriversDTO driverToDriverDTO(Driver driver);
	Driver diverDtoToDriver(DriversDTO driver);
	
	
}
