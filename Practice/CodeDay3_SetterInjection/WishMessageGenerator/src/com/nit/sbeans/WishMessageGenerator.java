package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.LocalTime;
@Component
public class WishMessageGenerator {
    LocalDateTime ldt;
@Autowired
    public void setLdt(LocalDateTime ldt) {
        this.ldt = ldt;
    }
    public String generateWishMessage(){
    int hour = ldt.getHour();
    String msg="";
    if(hour<12){
        msg="Good Morning Deep...";
    } else if (hour>=12 && hour<15) {
        msg="Good Afternoon Deep...";
    }else if (hour>=15 && hour<20){
        msg="Good Evening Deep...";
    } else if (hour >=20&&hour<=24 ) {
        msg="Good Night Deep...";
    }else{
        msg="Invalid hours";
    }
    return msg;
    }
}
