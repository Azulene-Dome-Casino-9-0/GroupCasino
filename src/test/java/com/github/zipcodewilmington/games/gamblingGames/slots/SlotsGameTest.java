package com.github.zipcodewilmington.games.gamblingGames.slots;

import com.github.zipcodewilmington.Casino;
import com.github.zipcodewilmington.casino.CasinoAccount;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SlotsGameTest {

    @Test
    public void testSlotsGame1() {
        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
        accounts.add(new CasinoAccount("hi", "impw", 50.00));

        String[] a = new String[]{"7", "7", "7"};
        SlotsGame test = new SlotsGame(accounts);

        Double actual = test.pullLever(10.00, a);
        Double expected = 50.00;

        Assert.assertFalse(expected == actual);
    }

    @Test
    public void testSlotsGames2() {
        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
        accounts.add(new CasinoAccount("hi", "impw", 50.00));
        String[] a = new String[]{"10", "7", "7"};
        SlotsGame test = new SlotsGame(accounts);


        Double actual = test.pullLever(10.00, a);
        Double expected = 50.00;

        Assert.assertFalse(expected == actual);
    }

    @Test
    public void testSlotsGames3() {
        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
        accounts.add(new CasinoAccount("hi", "impw", 50.00));
        String[] a = new String[]{"10", "10", "10"};
        SlotsGame test = new SlotsGame(accounts);

        Double actual = test.pullLever( 10.00, a);
        Double expected = 50.00;

        Assert.assertFalse(expected == actual);
    }

    @Test
    public void testSlotsGames4() {
        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
        accounts.add(new CasinoAccount("hi", "impw", 50.00));
        String[] a = new String[]{"10", "3", "5"};
        SlotsGame test = new SlotsGame(accounts);


        Double expected = test.pullLever( 10.00, a);
        Double actual = 50.00;

        Assert.assertFalse(expected == actual);
    }


//    @Test
//    public void testBet() {
//        List<CasinoAccount> accounts = new ArrayList<CasinoAccount>();
//        accounts.add(new CasinoAccount("hi", "impw", 50.00));
//        SlotsGame test = new SlotsGame(accounts);
//        String[] testing = new String[]{"hi", "oranges", "mangoes", "hello", "whatever"};
//
//        Integer actualArr = test.randomSlot(testing).length;
//        Integer actual = 3;
//
//        Assert.assertEquals(actualArr, actual);
//    }

//    @Test
//    public void testPullLever() {
//        SlotsGame test = new SlotsGame();
//
//    }


}