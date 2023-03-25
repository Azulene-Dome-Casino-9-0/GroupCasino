package com.github.zipcodewilmington.games.gamblingGames.yablon;

import com.github.zipcodewilmington.deck.Card;
import com.github.zipcodewilmington.deck.Deck;
import com.github.zipcodewilmington.deck.Rank;
import com.github.zipcodewilmington.deck.Suit;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class YablonTest {
    //BeforeAll
    Yablon game = new Yablon(null);


    @Test
    public void testCreateDeck(){
        //given
        int expected = 52;
        //when
        Deck actual = game.createDeck();;
        //then
        assertEquals(expected, actual.size());
    }

    @Test
    public void testGetRandomCard(){
        //Given
        Deck deck = game.createDeck();;
        //When
        Card card1 = deck.getRandomCard();
        //Then
        assertTrue(deck.getCards().contains(card1));
    }
    // Todo: More tests
}