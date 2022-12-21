package com.capg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.entity.Customer;
import com.capg.exception.CustomerNotFoundException;
import com.capg.service.CustomerService;
@Service
public interface CustomerService {

	public List<Customer> getCustomer();
	public Customer getCustomerById(int Customer_id);
	public Customer addCustomer(Customer Customer);
    public Customer updateCustomer(Customer Customer);
    public void deleteCustomerById(int Customer_id);
    public Customer getCustomerByEmail(String email) throws CustomerNotFoundException;
    //public List<Restaurant> getRestaurant();
    //public Customer registerCustomer(Customer Customer);
	
	
	}
	

