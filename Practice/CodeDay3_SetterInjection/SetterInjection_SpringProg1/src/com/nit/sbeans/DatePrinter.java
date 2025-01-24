package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DatePrinter {
    LocalDate currentDate;
@Autowired
    public void setCurrentDate(LocalDate currentDate) {
        this.currentDate = currentDate;
    }

    public void printDate(){
       // System.out.println(currentDate.getDayOfYear()+"-"+currentDate.getDayOfMonth()+"-"+currentDate);
        System.out.println(currentDate.getYear()+" "+currentDate.getMonthValue()+" "+ currentDate.getDayOfMonth());
    }
}
