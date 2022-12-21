package com.capg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.entity.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

}
