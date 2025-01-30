package com.nit.sbeans.AllClasses;

import com.nit.sbeans.Interfaces.Bank;
import com.nit.sbeans.Interfaces.BankFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Customer {
    private int customerId;
    private String customerName;
    private Bank bank;
   @Autowired
    BankFactory bankFactory;

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBank(String bankType) {
        Bank bank1 = bankFactory.createBank(bankType);
        this.bank = bank1;

    }

   public Bank getBank() {
        return bank;
   }

    public void deposit(double amount){
        System.out.println(amount);
       bank.deposit(amount);
        System.out.println("Amount Deposited Successfully "+amount);
    }
    public void withdraw(double amount){
        String withdraw = bank.withdraw(amount);

//        System.out.println("Amount Withdrawl :"+withdraw);
        //synchrionized as a method, wait() pause the current thread and release the lock
    }
    public void displayDetails(){
        System.out.println("Customer Id : "+customerId+"\nCustomer Name : "+customerName+" \nBank name :"+bank.toString());
        System.out.println(getBank());
    }


}
