package com.driver.backgroundcheck.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.driver.backgroundcheck.model.DriverCar;

@Repository("DriverCarRepository")
public interface DriverCarRepository extends CrudRepository<DriverCar, Integer> {		
	
}
