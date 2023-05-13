package com.geekster.RestaurantAPI.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Food {

   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long foodId;
    private String foodName;
    private Double price;
    private Restaurant restaurant;

}
