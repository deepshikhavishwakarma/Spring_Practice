package com.nit;

import com.nit.config.AppConfig;
import com.nit.sbeans.FoodDelivery;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.Annotation;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)
    {
//        System.out.println("Hello World!");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        FoodDelivery bean = ctx.getBean(FoodDelivery.class);
        bean.executeDelivery("Sager gerey","sev Puri");

    }
}
