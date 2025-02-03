package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("premium")
public class PremiumDiscount implements DiscountStrategy{
    @Override
    public double applyDiscount(double totalAmount) {
        return totalAmount-(totalAmount*10/100);
    }
}
