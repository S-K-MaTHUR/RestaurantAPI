package com.geekster.RestaurantAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long restaurantId;
    private String restaurantName;
    private String restaurantAddress;

    private List<Food> food;

    public List<Food> getMenu() {
        return null;
    }
}
