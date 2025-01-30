package com.nit.sbeans.AllClasses;

import com.nit.sbeans.Interfaces.Bank;
import org.springframework.stereotype.Component;

@Component
public class HDFC implements Bank {

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
    public String deposit(double amt) {
        amount+=amt;
        return amount+" Deposited successfully.";
    }

    @Override
    public String withdraw(double amt) {
        if(amt<amount){
            amount-=amt;
        }else {
            try{
                throw new InsufficientBalanceException("Insufficient Balance : "+ amount);
            }catch (Exception | InsufficientBalanceException e){
                e.printStackTrace();

            }
        }
        return amount+" withdraw Successfully .";
    }

    @Override
    public String toString() {
        return "Bank Name: "+this.getClass().getSimpleName()+"Current Balance is Rs . "+amount;
    }
}
