package com.driver.onboarding.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.driver.onboarding.model.DeviceShipping;


@Repository("DeviceShippingRepository")
public interface DeviceShippingRepository extends CrudRepository<DeviceShipping, Integer> {			
	
}
