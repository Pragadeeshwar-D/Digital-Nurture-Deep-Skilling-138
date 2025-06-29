package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        // Arrange: setup a fresh account before each test
        account = new BankAccount(100.0);
    }

    @Test
    void testDeposit() {
        // Act
        account.deposit(50.0);
        // Assert
        assertEquals(150.0, account.getBalance());
    }

    @Test
    void testWithdraw() {
        // Act
        account.withdraw(40.0);
        // Assert
        assertEquals(60.0, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientBalance() {
        // Act & Assert
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.withdraw(200.0));
        assertEquals("Insufficient balance", exception.getMessage());
    }

    @Test
    void testDepositNegativeAmount() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> account.deposit(-50.0));
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }
}