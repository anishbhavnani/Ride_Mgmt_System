package com.driver.backgroundcheck.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.driver.backgroundcheck.model.BackgroundCheck;


@Repository("DriverRepository")
public interface BackgroundCheckRepository extends CrudRepository<BackgroundCheck, Integer> {			
	
}
