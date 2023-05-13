package com.geekster.RestaurantAPI.controllers;

import com.geekster.RestaurantAPI.model.Food;
import com.geekster.RestaurantAPI.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/foods")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @PostMapping("/")
    public ResponseEntity<Food> createFood(@RequestBody Food food) {
        Food createdFood = foodService.createFood(food);
        return ResponseEntity.ok(createdFood);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Food> updateFoodPrice(@PathVariable("id") Long foodId,
                                                @RequestBody Double price) {
        Food updatedFood = foodService.updateFoodPrice(foodId, price);
        return ResponseEntity.ok(updatedFood);
    }

}
