package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
@Component
public class TimePrinter{
    @Autowired
    LocalTime currentTime;

    public TimePrinter(LocalTime currentTime) {
        this.currentTime = currentTime;
    }

    public void printTime(){
        System.out.println(currentTime);
    }

}
