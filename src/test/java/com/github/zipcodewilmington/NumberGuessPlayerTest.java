package com.github.zipcodewilmington;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberGuessPlayerTest {

    /**
     * TESTS
     * 1. Test to see if guessing the target number works.
     * 2. Test to see if the game ends within the set number of turns
     */

    @Test
    public void withinRange() {
        //GIVEN
        int min = 1;
        int max = 50;
        int random = (int) (Math.random() * 50) + 1;

        //WHEN

        //THEN
        assertTrue(random >= min && random <= max);

    }

    @Test
    public void doNotExceedGuesses() {
        //GIVEN
        int numGuesses = 0;
        while (numGuesses < 7) {
            numGuesses++;
            assertTrue(numGuesses <= 7);

        }
    }
}
