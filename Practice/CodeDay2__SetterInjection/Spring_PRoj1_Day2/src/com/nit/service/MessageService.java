package com.nit.service;

import org.springframework.stereotype.Component;

@Component("msg")
public class MessageService {
    public void printMessage(){
        System.out.println("Hello Deep....");
    }

}
