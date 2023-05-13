package com.geekster.RestaurantAPI.repository;

import com.geekster.RestaurantAPI.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoodRepo extends JpaRepository<Food,Long> {
}
