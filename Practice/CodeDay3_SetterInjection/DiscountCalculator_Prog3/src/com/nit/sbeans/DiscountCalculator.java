package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Component
public class DiscountCalculator {
    LocalDate lt;
    double price;
@Autowired
    public void setLt(LocalDate lt) {
        this.lt = lt;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double calculateDiscount(double price){
        DayOfWeek day = lt.getDayOfWeek();
        double discount = 0.0;

        if(day.getValue()>=1 && day.getValue()<=5){
            discount=(price*10)/100;
            price-=discount;
        }else {
            discount=(price*20)/100;
            price-=discount;
        }
        return price;

    }
}
