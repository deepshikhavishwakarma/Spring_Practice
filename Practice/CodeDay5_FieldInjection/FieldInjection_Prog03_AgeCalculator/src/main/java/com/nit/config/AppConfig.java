package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
@ComponentScan(basePackages = "com.nit")
public class AppConfig {
    @Bean("lt")
    public LocalDate localDate(){
        return LocalDate.now();
    }
    @Bean("dob")
    public LocalDate birthdate(){
        return LocalDate.of(2000,03,19);
    }
}
