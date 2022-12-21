package com.capg.exception;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = RestaurantNotFoundException.class)
     public ResponseEntity RestaurantNotFoundException(RestaurantNotFoundException ex) {

	return new ResponseEntity("Restaurant not found", HttpStatus.NOT_FOUND);

	}
	@ExceptionHandler(value = CustomerNotFoundException.class)
    public ResponseEntity userNotFoundException(CustomerNotFoundException ex) {

	return new ResponseEntity("Customer Not found", HttpStatus.NOT_FOUND);

	}
	
	
}
