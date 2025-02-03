package com.nit.sbeans;

import org.springframework.stereotype.Component;


public interface DiscountFactory {

    public DiscountStrategy getDiscountStrategy(String customerType);


}
