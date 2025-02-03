package com.nit;

import com.nit.config.AppConfig;
import com.nit.sbeans.DiscountFactory;
import com.nit.sbeans.DiscountStrategy;
import com.nit.sbeans.Item;
import com.nit.sbeans.ShoppingCart;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        
//        System.out.println("Hello World!");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        DiscountFactory bean = ctx.getBean(DiscountFactory.class);
        DiscountStrategy discount = bean.getDiscountStrategy("VIP");

        ShoppingCart cart = ctx.getBean(ShoppingCart.class);

        Item bean1 = new Item("FAN",4500);
        Item bean2 = new Item("Chair",5500);



        cart.addItem(bean1);
        cart.addItem(bean2);
        cart.setDiscountStrategy(discount);
        cart.displayItems();
        double totBeforeDisc = cart.calculateTotal();
        double totAfterDisc = cart.applyDiscount();
        System.out.println("Total Price Before Discount :"+totBeforeDisc);
        System.out.println("Total Price after Discount : "+totAfterDisc);
        ctx.close();


    }
}
