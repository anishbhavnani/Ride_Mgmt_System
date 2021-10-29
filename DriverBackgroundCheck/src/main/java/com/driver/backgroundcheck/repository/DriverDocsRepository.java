package com.driver.backgroundcheck.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.driver.backgroundcheck.model.DriverDocs;


@Repository("DriverDocsRepository")
public interface DriverDocsRepository extends CrudRepository<DriverDocs, Integer> {		
	
}
