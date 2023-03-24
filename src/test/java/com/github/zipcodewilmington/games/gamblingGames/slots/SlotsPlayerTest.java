package com.github.zipcodewilmington.games.gamblingGames.slots;

import com.github.zipcodewilmington.casino.CasinoAccount;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SlotsPlayerTest {

    @Test
    public void testConstructor() {
        CasinoAccount test = new CasinoAccount("Hello", "Password", 50.00);
        SlotsPlayer a = new SlotsPlayer(test);
        Double expected = 50.00;
        Assert.assertEquals(a.getBalance(), expected);
    }

    @Test
    public void testSetBalance() {
        CasinoAccount test = new CasinoAccount("Hello", "Password", 50.00);
        SlotsPlayer a = new SlotsPlayer(test);
        a.setBalance(30.00);
        Double expected = 30.00;
        Assert.assertEquals(a.getBalance(), expected);
    }

}