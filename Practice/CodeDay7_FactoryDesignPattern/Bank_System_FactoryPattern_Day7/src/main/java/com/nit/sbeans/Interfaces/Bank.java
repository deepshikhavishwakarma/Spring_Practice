package com.nit.sbeans.Interfaces;

public interface Bank {
    public double getAmount();
    public void setAmount(double amount);
    String deposit(double amount);
    String withdraw(double amount);
    String toString();


}
