package com.capg.service;

import java.util.List;




import com.capg.entity.Booking;
import com.capg.service.BookingService;

public interface BookingService {

	public List<Booking> getBooking();
	public Booking getBookingById(int booking_id);
	public Booking addBooking(Booking booking);
	public void deleteBooking(int booking_id);
	public Booking updateBooking(Booking booking);
	public List<Booking> findBookingByEmail(String email);
	
	}
	

