package com.geekster.RestaurantAPI.repository;

import com.geekster.RestaurantAPI.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRestaurantRepo extends JpaRepository<Restaurant,Long> {
}
