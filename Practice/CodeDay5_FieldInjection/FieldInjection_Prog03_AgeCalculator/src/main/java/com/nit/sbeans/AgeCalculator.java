package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Period;

@Component
public class AgeCalculator {
    int age;
    @Autowired
    @Qualifier("lt")
    LocalDate localDate;
    @Autowired
    @Qualifier("dob")
    LocalDate DOB;
    public int calculateAge(){

        return Period.between(DOB,localDate).getYears();
    }
    public void printAge(){
        System.out.println("Your age is : "+calculateAge());
    }
}
