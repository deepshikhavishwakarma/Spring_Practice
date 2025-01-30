package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FoodDelivery {
    private DeliveryMethod deliveryMethod;
    @Autowired
    @Qualifier("takeWay")
    public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }
    public void executeDelivery(String restaurantName, String dishName){
        deliveryMethod.deliverFood(restaurantName,dishName);
    }
}
