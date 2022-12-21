package com.capg.controller;



import java.util.List;

//import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Booking;
//import com.capg.repository.BookingRepository;
import com.capg.service.BookingService;
@RestController

public class BookingController {
	@Autowired
	private BookingService bookingService;
	
	
	@GetMapping("/booking")
	public List<Booking> getBooking(){
		return this.bookingService.getBooking();
	}
	
	@PostMapping("/booking")
	public Booking addBooking(@RequestBody Booking booking) {
		return this.bookingService.addBooking(booking);
	}
	
	@GetMapping("/bookings/{booking_id}")
	public Booking getBookingById(@PathVariable int booking_id) {
		return this.bookingService.getBookingById(booking_id);
	}
	@DeleteMapping("/booking/{booking_id}")
	public void deleteBooking(@PathVariable int booking_id)
	{
		 this.bookingService.deleteBooking(booking_id);
		
	}
	@PutMapping("/booking")
	public Booking updateBooking(@RequestBody Booking booking)
	{
		return this.bookingService.updateBooking(booking);
	}
	@GetMapping("/booking/{email}")
	public List<Booking> findBookingByEmail(@PathVariable String email){
		return this.bookingService.findBookingByEmail(email);
	}
	
	
}


