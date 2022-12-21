package com.capg.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.capg.entity.Restaurant;
@Service
public interface RestaurantService {

	public List<Restaurant> getRestaurants();

	public Restaurant getRestaurantById(Integer id) ;
		

}
