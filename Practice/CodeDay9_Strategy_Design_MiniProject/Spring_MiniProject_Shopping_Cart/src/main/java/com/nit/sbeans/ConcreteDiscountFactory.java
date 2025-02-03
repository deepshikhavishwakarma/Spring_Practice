package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConcreteDiscountFactory implements DiscountFactory{
    @Autowired
    @Qualifier("nodiscount")
    public DiscountStrategy noDiscount;
    @Autowired
    @Qualifier("premium")
    private DiscountStrategy premiumDiscount;

    @Autowired
    @Qualifier("vip")
    private DiscountStrategy vipDiscount;



    @Override
    public DiscountStrategy getDiscountStrategy(String customerType) {
       if(customerType.equalsIgnoreCase("Premium")){
            return premiumDiscount;

       } else if (customerType.equalsIgnoreCase("Regular")) {
            return noDiscount;
       } else if (customerType.equalsIgnoreCase("VIP")) {
            return vipDiscount;
       }else{
           System.out.println("Invalid Customer Type ");
       }
       return null;
    }
}
