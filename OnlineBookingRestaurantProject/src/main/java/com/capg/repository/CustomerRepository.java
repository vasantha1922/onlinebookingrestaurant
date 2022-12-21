package com.capg.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capg.entity.Customer;



public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	@Query("Select c from Customer c where c.email= :emailid" )
	Customer findByEmail(@Param("emailid") String emailid);
}
