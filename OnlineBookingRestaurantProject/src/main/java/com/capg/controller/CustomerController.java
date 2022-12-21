package com.capg.controller;

 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.Customer.entities.Pricing;
import com.capg.entity.Customer;
import com.capg.exception.CustomerNotFoundException;
//import com.Customer.service.PricingService;
import com.capg.service.CustomerService;

@RestController

public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@GetMapping("/customer")
	public List<Customer> getcustomers(){
		return this.service.getCustomer();
	}
	@PutMapping("/customers")
	public Customer updatecustomer(@RequestBody Customer customer) {
		return this.service.addCustomer(customer);
	}
	@GetMapping("/customers/{customer_id}")
	public Customer getcustomersById(@PathVariable String customer_id) {
		return this.service.getCustomerByEmail(customer_id);
	}
	@PostMapping("/customers")
	public Customer addcustomer(@RequestBody Customer customers) {
		return this.service.addCustomer(customers);
	}
	@DeleteMapping("/customers/{customer_id}")
	public void deletecustomerById(@PathVariable int customer_id) {
		 this.service.deleteCustomerById(customer_id);
	}
	
	@RequestMapping(value = "/customer/{email}", method = RequestMethod.PUT)
	   public ResponseEntity getByEmail(@PathVariable("email") String email, @RequestBody Customer customer) { 
	      
	      return new ResponseEntity(this.service.getCustomerByEmail(email),HttpStatus.OK);
	   }
		
}
