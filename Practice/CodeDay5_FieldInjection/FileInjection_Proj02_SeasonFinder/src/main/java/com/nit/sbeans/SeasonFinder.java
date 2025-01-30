package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SeasonFinder {
    @Autowired
    LocalDate localDate;
    String currentSeason;

    public String findSeason(){
        int monthValue = localDate.getMonthValue();
        if(monthValue >=3 && monthValue <=6){
            currentSeason = "Summer Season";
        }else if (monthValue >= 7 && monthValue <= 9) {
            currentSeason = "Rainy Season";
        } else if (monthValue >= 10 && monthValue <= 11) {
            currentSeason = "Autumn Season";
        } else if (monthValue == 12 || monthValue == 1 || monthValue == 2) {
            currentSeason = "Winter Season";
        } else {
            currentSeason = "Invalid Month";
        }
        return currentSeason;


    }
    public void printSeason(){
        System.out.println(findSeason());
    }
}
