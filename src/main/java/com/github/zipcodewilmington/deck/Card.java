package com.github.zipcodewilmington.deck;

    public class Card {

        private Rank rank;
        private Suit suit;

        public Card(Rank rank, Suit suit) {
            this.rank = rank;
            this.suit = suit;
        }

        public Rank getRank() {
            return this.rank;
        }

        public Suit getSuit() {
            return suit;
        }

        public int getRankValue() {
            return getRankValue();
        }
    }