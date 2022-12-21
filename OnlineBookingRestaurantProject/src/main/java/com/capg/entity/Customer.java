package com.capg.entity;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
//import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import net.bytebuddy.implementation.bind.annotation.Super;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int customer_id;
	@Column
	String email;
	
	String password;
	
	String first_name;
	
	String last_name;
	
	public int getCustomer_id() {
	return customer_id;
	}
	public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
	}
	public String getEmail() {
	return email;
	}
	public void setEmail(String email) {
	this.email = email;
	}
	public String getPassword() {
	return password;
	}
	public void setPassword(String password) {
	this.password = password;
	}
	public String getFirst_name() {
	return first_name;
	}
	public void setFirst_name(String first_name) {
	this.first_name = first_name;
	}
	public String getLast_name() {
	return last_name;
	}
	public void setLast_name(String last_name) {
	this.last_name = last_name;
	}
	@Override
	public String toString() {
	return "Customers [customer_id=" + customer_id + ", email=" + email + ", password=" + password + ", first_name="
	+ first_name + ", last_name=" + last_name + "]";
	}
	public Customer(int customer_id, String email, String password, String first_name, String last_name) {
	super();
	this.customer_id = customer_id;
	this.email = email;
	this.password = password;
	this.first_name = first_name;
	this.last_name = last_name;
	
	}
	public  Customer() {
	super();
	// TODO Auto-generated constructor stub
	}
}
	//@ManyToMany(mappedBy = "user")
	//public Set<Restaurant> getRestaurants() {
		//return restaurant;
	//}
	//public void setRestaurants(Set<Restaurant> restaurants) {
		//this.restaurant = restaurants;
	//}


