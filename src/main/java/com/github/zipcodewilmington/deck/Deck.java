package com.github.zipcodewilmington.deck;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Deck {

    private List<Card> cards;
    public Deck(){
        cards = new ArrayList<>();


        for(Suit suit :Suit.values()){
            for(Rank rank : Rank.values()){

                cards.add(new Card(rank, suit));
            }
        }
    }
    public Card getRandomCard(){
        Random random = new Random();
        int randomCard = random.nextInt(cards.size());
        Card card = cards.get(randomCard);
        return card;
    }
    public int size(){
        return cards.size();
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
