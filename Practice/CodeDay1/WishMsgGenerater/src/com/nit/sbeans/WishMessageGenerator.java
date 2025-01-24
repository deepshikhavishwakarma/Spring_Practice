package com.nit.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {
private LocalTime lt;

    public WishMessageGenerator() {
        System.out.println("WishMessageGenerator::0-param constructor");
    }

    public LocalTime getLt() {
        return lt;
    }

    public void setLt(LocalTime lt) {
        this.lt = lt;
    }
    public String generateWishMessage(String user){
        System.out.println("WishMessageGenerator.generateWishMessage()");
        int hour = lt.getHour();
        if(hour<12)
            return "Good Morning : "+user;
        else if(hour<16)
            return  "Good Afternoon "+user;
        else if(hour <20)
            return  "Good Evening : "+user;
        else
            return "Good Night : "+user;

    }
}
