package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FoodDetails {
    @Value("${food.id}")
    private int foodId;
    @Value("${food.name}")
    private String foodName;
    @Value("${food.preparationTime}")
    private int preparationTime;
    @Value("${restaurant.name}")
    private String restaurantName;

    public int getFoodId() {
        return foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public String getRestaurantName() {
        return restaurantName;
    }
}
