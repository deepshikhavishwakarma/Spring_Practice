package com.nit;

import com.nit.config.AppConfig;
import com.nit.sbeans.TravelBooking;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)
    {
//        System.out.println("Hello World!");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        TravelBooking bean = ctx.getBean(TravelBooking.class);
bean.executeBooking("USA",30000);

    }
}
