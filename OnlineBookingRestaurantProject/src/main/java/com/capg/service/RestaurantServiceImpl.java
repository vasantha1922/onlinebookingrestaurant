package com.capg.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Restaurant;
import com.capg.repository.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService{

	@Autowired
	RestaurantRepository repo;
	@Override
	public List<Restaurant> getRestaurants() {
		return repo.findAll();
	}

	@Override
	public Restaurant getRestaurantById(Integer id) {
		return repo.findById(id).get();
	}
	

}
