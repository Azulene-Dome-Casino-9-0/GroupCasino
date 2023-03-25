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
    public int size(){
        return cards.size();
    }

    public static Card drawCard() {
        return Deck.drawCard();
    }

    public static void shuffle(){
        Deck.shuffle();
    }
    public Card getRandomCard(){
        Random random = new Random();
        int randomCard = random.nextInt(cards.size());
        Card card = cards.get(randomCard);
        return card;
    }


    public List<Card> getCards() {
        return cards;
    }


    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

}
