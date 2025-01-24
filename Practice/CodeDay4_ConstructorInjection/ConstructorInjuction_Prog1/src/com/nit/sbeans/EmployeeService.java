package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public Employee emp;
@Autowired
    public EmployeeService(Employee emp) {
        this.emp = emp;
    }
    public void showEmployeeDetails(){
         emp.displayEmployeeInfo();
    }
}
