package com.jay;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance){
        this.firstName= firstName;
        this.lastName= lastName;
        this.balance = balance;
    }

    //Function to add deposit amount to balance and return updated balance.
    //if deposit is done from a bank branch , branch flag = 1
    //if deposit is done from an ATM, branch flag = 0
    public double deposit(double amount, boolean branch){
        balance += amount;
        return balance;
    }

    //Function to withdraw  amount from balance and return updated balance.
    //if deposit is done from a bank branch , branch flag = 1
    //if deposit is done from an ATM, branch flag = 0
    public double withdraw(double amount, boolean branch){
        balance += amount;
        return balance;
    }

    public double getBalance(){
        return this.balance;
    }

    //More methods.

}
