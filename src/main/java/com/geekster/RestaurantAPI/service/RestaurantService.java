package com.geekster.RestaurantAPI.service;

import com.geekster.RestaurantAPI.model.Food;
import com.geekster.RestaurantAPI.model.Restaurant;
import com.geekster.RestaurantAPI.repository.IRestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    private IRestaurantRepo restaurantRepo;

    @Transactional(readOnly = true)
    public List<Food> getFoodsByRestaurant(Long restaurantId) {
        Optional<Restaurant> optionalRestaurant = restaurantRepo.findById(restaurantId);
        if (!optionalRestaurant.isPresent()) {
            throw new IllegalArgumentException("Invalid restaurant ID: " + restaurantId);
        }
        Restaurant restaurant = optionalRestaurant.get();
        return restaurant.getMenu();
    }

}
