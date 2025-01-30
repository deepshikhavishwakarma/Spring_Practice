package com.nit;

import com.nit.config.AppConfig;
import com.nit.sbeans.SeasonFinder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args)
    {
//        System.out.println("Hello World!");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        SeasonFinder bean = ctx.getBean(SeasonFinder.class);
        bean.printSeason();
        ctx.close();
    }
}
