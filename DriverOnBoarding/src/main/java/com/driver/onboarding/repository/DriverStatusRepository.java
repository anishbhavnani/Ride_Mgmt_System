package com.driver.onboarding.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.driver.onboarding.model.DeviceShipping;
import com.driver.onboarding.model.DriverStatus;


@Repository("DriverStatusRepository")
public interface DriverStatusRepository extends CrudRepository<DriverStatus, Integer> {		
	
}
