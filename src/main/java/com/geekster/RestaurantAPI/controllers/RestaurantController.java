package com.geekster.RestaurantAPI.controllers;

import com.geekster.RestaurantAPI.model.Food;
import com.geekster.RestaurantAPI.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/{id}/foods")
    public ResponseEntity<List<Food>> getFoodsByRestaurant(@PathVariable("id") Long restaurantId) {
        List<Food> foods = restaurantService.getFoodsByRestaurant(restaurantId);
        return ResponseEntity.ok(foods);
    }
}
