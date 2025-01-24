package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
public class Employee {
    Integer id;
    String name;
    LocalDate joiningDate;

    public Employee() {
    }

    @Autowired
    public Employee(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }
    public void empDetails(){
        System.out.println("Employee name : "+this.getName());
        System.out.println("Employee Id : "+this.getId());
        System.out.println("Employee Joining Date : "+joiningDate);
    }
}
