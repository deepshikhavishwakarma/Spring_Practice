package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("calc")
public class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {

        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(int a, int b) {

        int res=0;
        try {
            res= a / b;
        } catch (ArithmeticException ae) {
            System.out.println("b value should not be 0 for division....");
        }
        return res;
    }

}
