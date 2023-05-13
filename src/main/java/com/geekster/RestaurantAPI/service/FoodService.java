package com.geekster.RestaurantAPI.service;

import com.geekster.RestaurantAPI.model.Food;
import com.geekster.RestaurantAPI.repository.IFoodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FoodService {

    @Autowired
    private IFoodRepo foodRepo;

    @Transactional
    public Food createFood(Food food) {
        return foodRepo.save(food);
    }
    public Food updateFood;


    public Food updateFoodPrice(Long foodId, Double price) {
        return null;
    }
}
