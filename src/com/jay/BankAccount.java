package com.jay;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;
    private int accountType;

    public static final int SAVINGS = 1;
    public static final int  CHECKING = 2;


    public BankAccount(String firstName, String lastName, double balance, int accountType){
        this.firstName= firstName;
        this.lastName= lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    //Function to add deposit amount to balance and return updated balance.
    //if deposit is done from a bank branch , branch flag = 1
    //if deposit is done from an ATM, branch flag = 0
    public double deposit(double amount, boolean branch){
        balance += amount;
        return balance;
    }

    public boolean isChecking(){
        return accountType == CHECKING;
    }

    public boolean isSavings(){
        return accountType == SAVINGS;
    }

    //Function to withdraw  amount from balance and return updated balance.
    //if deposit is done from a bank branch , branch flag = 1
    //if deposit is done from an ATM, branch flag = 0
    public double withdraw(double amount, boolean branch){
        balance -= amount;
        return balance;
    }

    public double getBalance(){
        return this.balance;
    }

    //More methods.

}
