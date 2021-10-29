package com.driver.backgroundcheck.mapper;

import com.driver.backgroundcheck.dto.BackGroundCheckDTO;
import com.driver.backgroundcheck.model.BackgroundCheck;

public interface MapStructMapper {

	BackGroundCheckDTO driverToDriverDTO(BackgroundCheck driver);
	BackgroundCheck diverDtoToDriver(BackGroundCheckDTO driver);
	
	
}
