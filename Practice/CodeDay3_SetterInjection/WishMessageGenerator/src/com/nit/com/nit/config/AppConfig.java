package com.nit.com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class AppConfig {
    @Bean
    public LocalDateTime currentTime(){
        return LocalDateTime.now();
    }
}
