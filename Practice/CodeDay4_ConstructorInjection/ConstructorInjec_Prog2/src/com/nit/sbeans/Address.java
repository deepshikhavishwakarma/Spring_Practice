package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Address {
    private String city;
    private String state;

    public Address() {
    }


    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void displayAddress(){
        System.out.println("Student City : "+city);
        System.out.println("Student state : "+state);
    }
}
