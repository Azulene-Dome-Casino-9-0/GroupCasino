package com.github.zipcodewilmington.deck;

public class Card {


enum Rank{
    ACE, TWO, THREE, FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING
}
enum Suit{
    HEARTS, DIAMONDS,CLUBS,SPADES
}
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }
    public Rank getRank(){
        return rank;
    }
    public Suit getSuit(){
        return suit;
    }

}
