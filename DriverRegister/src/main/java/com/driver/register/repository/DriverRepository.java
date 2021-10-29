package com.driver.register.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.driver.register.model.Driver;


@Repository("DriverRepository")
public interface DriverRepository extends CrudRepository<Driver, Integer> {
	
	Driver findByEmail(String email);	
	Driver findByMobile(BigInteger mobile);	
	
}
