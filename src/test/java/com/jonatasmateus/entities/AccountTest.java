package com.jonatasmateus.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        double amount = 200.0;
        double expectedValue = 196.0;
        Account acc = new Account(1L, 0.0);

        acc.deposit(amount);

        assertEquals(expectedValue, acc.getBalance());
    }
}