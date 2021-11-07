package com.driver.register.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.driver.register.model.Address;


@Repository("AddressRepository")
public interface AddressRepository  extends JpaRepository<Address, Integer> {	
	Page<Address> findAll(Pageable pageable);
}
