package com.jay;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount account;

    @org.junit.jupiter.api.BeforeAll
    public static void startTests(){
        System.out.println("Starting Tests");
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp(){
        account= new BankAccount("john", "lennon", 1000, BankAccount.SAVINGS);
    }
    @org.junit.jupiter.api.Test
    void deposit() throws Exception{
        double balance = account.deposit(200, true);
        assertEquals(1200, balance);
    }

    @org.junit.jupiter.api.Test
    void checkWithdraw_branch() throws Exception {
        double balance = account.withdraw(600, true);
        assertEquals(400, balance);
    }

    @org.junit.jupiter.api.Test
    void checkWithdraw_atm_limit() throws Exception {
        Assertions.assertThrows(IllegalArgumentException.class,() ->{
        double balance = account.withdraw(600, false);
        assertEquals(400, balance);});
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() throws Exception {
        account.deposit(200, true);
        assertEquals(1200, account.getBalance());
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() throws Exception {
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
        assertTrue(account.isSavings());
    }

    @org.junit.jupiter.api.AfterAll
    public static void completeTests(){
        System.out.println("Tests Over");
    }
}