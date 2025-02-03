package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ShoppingCart {

    private List<Item> items = new ArrayList<>();
    @Autowired
            @Qualifier("nodiscount")
    DiscountStrategy discountStrategy;
    public void addItem(Item item){
               items.add(item);

    }
    public double calculateTotal(){
        double count=0;
    for(Item i:items){
         count+= i.getPrice();
    }
    return count;
    }
    public double applyDiscount(){
        System.out.println("Using Discount Strategy: " + discountStrategy.getClass().getSimpleName()); // Debugging

        return discountStrategy.applyDiscount(calculateTotal());
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    public void displayItems(){
        System.out.println("Items :"+items);
    }
}
