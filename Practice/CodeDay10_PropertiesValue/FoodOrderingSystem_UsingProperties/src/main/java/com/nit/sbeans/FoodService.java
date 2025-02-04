package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FoodService {
   @Autowired
    private FoodDetails foodDetails;
   public void displayFoodInfo(){
       System.out.println(foodDetails.getFoodId());
       System.out.println(foodDetails.getFoodName());
       System.out.println(foodDetails.getPreparationTime());
       System.out.println(foodDetails.getRestaurantName());
   }
}
