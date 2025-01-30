package com.nit;

import com.nit.config.AppConfig;
import com.nit.sbeans.TimePrinter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.Annotation;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

//        System.out.println("Hello World!");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        TimePrinter bean = ctx.getBean(TimePrinter.class);
        bean.printTime();
        ctx.close();
    }
}
