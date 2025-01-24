package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Student {
   private  String name;
    private Integer rollNumber;
    private Address address;
   @Autowired
    public Student(Address address) {

        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }



    public void dispStudentDetails(){
        System.out.println("Student name + "+name);
        System.out.println("Student RollNumber + "+rollNumber);
        address.displayAddress();
    }


}
