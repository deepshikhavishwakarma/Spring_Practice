package com.nit.sbeans.AllClasses;

import com.nit.sbeans.Interfaces.Bank;
import org.springframework.stereotype.Component;

import javax.naming.InsufficientResourcesException;
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
        return amount+" Deposited successfully.";
    }

    @Override
    public String withdraw(double amount) {
       if(amount>getAmount()){
           amount-=getAmount();
       }else {
           try{
               throw new InsufficientBalanceException();
           }catch (Exception | InsufficientBalanceException e){
               e.printStackTrace();
           }
       }
        return amount+" withdraw Successfully .";
    }

    @Override
    public String toString() {
        return "Current Balance is Rs . "+amount;
    }
}
