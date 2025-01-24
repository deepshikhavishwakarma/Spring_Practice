package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("great")
public class Greeting {
    public void greetUser(String userName){
        System.out.println("Hello "+userName);
    }
}
