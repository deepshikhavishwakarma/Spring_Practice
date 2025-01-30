package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
@ComponentScan(basePackages = "com.nit")
public class AppConfig {
@Bean
    public LocalTime localTime(){
        return LocalTime.now();
    }
}
