package com.learning.learning.Springboot.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDao extends CrudRepository<Customer, Integer> {

	//public void updatename(int id, String name);
	
}


