package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("home")
public class HomeDelivery implements DeliveryMethod{
    @Override
    public void deliverFood(String restaurantName, String dishName) {
        System.out.println("Home delivery from "+restaurantName+" : "+dishName+" is on its way!");
    }
}
