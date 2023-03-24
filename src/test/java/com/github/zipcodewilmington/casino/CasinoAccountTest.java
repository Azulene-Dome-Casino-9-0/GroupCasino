package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.Casino;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasinoAccountTest {

    @Test
    public void testNullaryConstructor() {
        CasinoAccount test = new CasinoAccount();
        String expectedName = "";
        String expectedPassword = "";
        Double expectedBalance = 0.00;

        String actualName = test.getAccountName();
        String actualPassword = test.getPassword();
        Double actualBalance = test.getAccountBalance();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedPassword, actualPassword);
        Assert.assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void testConstructor() {
        CasinoAccount test = new CasinoAccount("Account", "password123", 50.00);
        String actualName = test.getAccountName();
        String actualPassword = test.getPassword();
        Double actualBalance = test.getAccountBalance();
        Double expectedBalance = 50.00;


        Assert.assertEquals("Account", actualName);
        Assert.assertEquals("password123", actualPassword);
        Assert.assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void testSetAccountName() {
        CasinoAccount test = new CasinoAccount();
        String expectedName = "Account";

        test.setAccountName(expectedName);
        String actualName = test.getAccountName();

        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetAccountBalance() {
        CasinoAccount test = new CasinoAccount();
        Double expectedBalance = 30.00;

        test.setAccountBalance(expectedBalance);
        Double actualBalance = test.getAccountBalance();

        Assert.assertEquals(expectedBalance, actualBalance);
    }

    @Test
    public void testSetPassword() {
        CasinoAccount test = new CasinoAccount();
        String expectedPassword = "password123";

        test.setPassword(expectedPassword);
        String actualPassword = test.getPassword();

        Assert.assertEquals(expectedPassword, actualPassword);
    }
}