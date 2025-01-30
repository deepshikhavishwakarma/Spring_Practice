package com.nit.sbeans.AllClasses;

import com.nit.sbeans.Interfaces.Bank;
import org.springframework.stereotype.Component;

// Custom Exception
//class InsufficientBalanceException extends RuntimeException {
//    public InsufficientBalanceException(String message) {
//        super(message);
//    }
//}

@Component
public class SBI implements Bank {

    private double amount;

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String deposit(double amount) {
        this.amount += amount; // Update the balance
        return amount + " Deposited successfully. New Balance: " + this.amount;
    }

    @Override
    public String withdraw(double amt) {
        if (amt <= amount) {
            amount -= amt;
            return amt + " withdrawn successfully. Remaining Balance: " + amount;
        } else {
//            throw new InsufficientBalanceException("Insufficient balance. Available: " + amount);
            try {
                throw new InsufficientBalanceException("Insufficient Balance : "+ amount);
            } catch (InsufficientBalanceException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public String toString() {
        return "Bank Name : " + this.getClass().getSimpleName() + " | Current Balance: Rs. " + amount;
    }
}
