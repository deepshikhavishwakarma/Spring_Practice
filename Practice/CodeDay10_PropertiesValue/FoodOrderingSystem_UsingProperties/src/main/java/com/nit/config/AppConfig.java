package com.nit.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.nit")
@PropertySource(value = "com/nit/commons/food.properties")
public class AppConfig {
}
