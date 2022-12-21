package com.capg.service;

import java.util.ArrayList;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.capg.repository.CustomerRepository;
import com.capg.entity.Customer;
import com.capg.exception.CustomerNotFoundException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.repository.CustomerRepository;
import com.capg.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerrepo;

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerrepo.findAll();
	}
	
	@Override
	public Customer updateCustomer(Customer Customer) {
		customerrepo.save(Customer);
		return Customer;
	}

	@Override
	public Customer getCustomerById(int customer_id) {
		return customerrepo.getOne(customer_id);
		
	}

	@Override
	public Customer addCustomer(Customer Customer) {
		customerrepo.save(Customer);
		return Customer;
	}

	@Override
	public void deleteCustomerById(int customer_id) {
		Customer obj=customerrepo.getOne( customer_id);
				customerrepo.delete(obj);
		
	}

	@Override
	public Customer getCustomerByEmail(String email) throws CustomerNotFoundException {
		Customer customer;

if (customerrepo.findByEmail(email)!=null) {
			customer=customerrepo.findByEmail(email);
		}
else
{
	throw new CustomerNotFoundException();
}

		return customer;
	}


}
