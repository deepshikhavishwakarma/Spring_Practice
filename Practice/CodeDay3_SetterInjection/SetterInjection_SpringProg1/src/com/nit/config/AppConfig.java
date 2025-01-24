package com.nit.config;

import com.nit.sbeans.DatePrinter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class AppConfig {

//    @Autowired
   @Bean   //We use Bean Annotation with predefined classes or factory methods
    public LocalDate  printDate()
    {
        return LocalDate.now();
    }

}
