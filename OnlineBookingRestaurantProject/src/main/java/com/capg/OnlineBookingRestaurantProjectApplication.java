package com.capg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capg.entity.Restaurant;
import com.capg.service.BookingService;
import com.capg.service.CustomerService;
import com.capg.service.RestaurantService;

@SpringBootApplication
public class OnlineBookingRestaurantProjectApplication {


	public static void main(String[] args) {
		
		SpringApplication.run(OnlineBookingRestaurantProjectApplication.class, args);
	}

}
