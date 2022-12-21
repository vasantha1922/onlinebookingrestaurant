package com.capg.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.capg.entity.Booking;


public interface BookingRepository extends JpaRepository<Booking, Integer> {

	@Query("Select u from Booking u where u.email= ?1" )
	List<Booking> findBookingByEmail(@Param("email") String email);
	
	
	


}
