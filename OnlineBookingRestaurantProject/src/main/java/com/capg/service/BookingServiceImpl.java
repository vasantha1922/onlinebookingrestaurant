package com.capg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.service.BookingService;
import com.capg.entity.Booking;
import com.capg.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService{
	@Autowired
	private BookingRepository bookingrepo;
	
	@Override
	public List<Booking> getBooking() {
		// TODO Auto-generated method stub
		return bookingrepo.findAll();
	}
	@Override
	public Booking getBookingById(int booking_id) {
		
		// TODO Auto-generated method stub
		return bookingrepo.findById(booking_id).get();
	}
    
	@Override
	public Booking addBooking(Booking booking) {
	return	bookingrepo.save(booking);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBooking(int booking_id) {
		Booking obj=bookingrepo.findById(booking_id).get();
		bookingrepo.delete(obj);
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Booking updateBooking(Booking booking) {
		return bookingrepo.save(booking);
		
	}
	@Override
	public List<Booking> findBookingByEmail(String email) {
		// TODO Auto-generated method stub
		return bookingrepo.findBookingByEmail(email);
	}
	
	
}
