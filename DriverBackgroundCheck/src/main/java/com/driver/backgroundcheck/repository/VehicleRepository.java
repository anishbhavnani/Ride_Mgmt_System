package com.driver.backgroundcheck.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.driver.backgroundcheck.model.Vehicle;


@Repository("AddressRepository")
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {	
	
}
