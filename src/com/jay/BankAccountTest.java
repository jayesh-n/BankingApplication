package com.jay;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void deposit() throws Exception{
        BankAccount account= new BankAccount("john", "lennon", 1000, BankAccount.SAVINGS);
        double balance = account.deposit(200, true);
        assertEquals(1200, balance);
    }

    @org.junit.jupiter.api.Test
    void withdraw() throws Exception {
        BankAccount account= new BankAccount("john", "lennon", 1000, BankAccount.SAVINGS);
        double balance = account.withdraw(200, true);
        assertEquals(800, balance);
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() throws Exception {
        BankAccount account= new BankAccount("john", "lennon", 1000,BankAccount.SAVINGS);
        account.deposit(200, true);
        assertEquals(1200, account.getBalance());
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() throws Exception {
        BankAccount account= new BankAccount("john", "lennon", 1000,BankAccount.SAVINGS);
        account.withdraw(200, true);
        assertEquals(800, account.getBalance());
    }

    @org.junit.jupiter.api.Test
    void isChecking_true() throws Exception{
        BankAccount account = new BankAccount("john", "lennon", 1000, BankAccount.CHECKING);
        assertTrue(account.isChecking());
    }

    @org.junit.jupiter.api.Test
    void isSavings_true() throws Exception{
        BankAccount account = new BankAccount("john", "lennon", 1000, BankAccount.SAVINGS);
        assertTrue(account.isSavings());
    }
}