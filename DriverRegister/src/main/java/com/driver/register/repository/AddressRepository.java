package com.driver.register.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.driver.register.model.Address;


@Repository("AddressRepository")
public interface AddressRepository extends CrudRepository<Address, Integer> {	
	Address findByDriverId(int driverid);
}
