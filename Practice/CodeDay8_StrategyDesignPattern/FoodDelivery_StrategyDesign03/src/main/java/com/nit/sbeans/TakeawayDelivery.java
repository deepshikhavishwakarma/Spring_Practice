package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("takeWay")
public class TakeawayDelivery implements DeliveryMethod{
    @Override
    public void deliverFood(String restaurantName, String dishName) {
        System.out.println("Takeaway from  "+restaurantName+" Ready to pick up "+dishName+".");
    }
}
