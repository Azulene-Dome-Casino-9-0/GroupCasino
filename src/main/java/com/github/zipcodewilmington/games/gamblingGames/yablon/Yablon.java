package com.github.zipcodewilmington.games.gamblingGames.yablon;

import com.github.zipcodewilmington.Player.Player;
import com.github.zipcodewilmington.deck.Card;
import com.github.zipcodewilmington.deck.Deck;
import com.github.zipcodewilmington.games.Games;
import com.github.zipcodewilmington.games.gamblingGames.GambleGames;


import java.util.List;
import java.util.Scanner;
//public class Yablon extends Games implements GambleGames {
//    public Deck deck;
//    private Double totalProfits;
//    private Double totalLosses;
//    private Double multiplier;
//    private Double betAmount;
//
//    public Yablon(List<Player> players) {
//        super(players);
//    }
//
//    public void yablonGame() {
//        this.deck = new Deck();
//    }
//    public boolean playGame(String input){
//        return true;
//    }
//
//    public void play() {
//        Card card1;
//        Card card2;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How much would you like to bet?");
//        double betAmount = scanner.nextDouble();
//
//        //Deal the first two cards(These will dictate the next step after this method)
//        card1 = this.deck.getRandomCard();
//        card2 = this.deck.getRandomCard();
//
//        //Now the code for getting the third card
//        System.out.println("First Card" + card1.getRank() + " of" + card1.getSuit());
//        System.out.println("Second Card" + card2.getRank() + " of" + card2.getSuit());
//        System.out.println("Would you like to bet if this card's value\n" +
//                "is in between the values of card one and card two?\n" +
//                "Please enter: (y/n)");
//        String answer = scanner.nextLine().toLowerCase();
//        if (answer.equals("y")) { // Todo: if statement for n and if statement for wrong input.
//            Card card3 = this.deck.getRandomCard();
//            System.out.println("Third Card" + card3.getRank() + " of" + card3.getSuit());
//            if (card3.getRankValue() > card1.getRankValue() && card3.getRankValue() < card2.getRankValue()) {
//                System.out.println("You Win");
//                payOut();
//            } else if (card3.getRankValue() == card1.getRankValue() && card3.getRankValue() == card2.getRankValue()) {
//                System.out.println("You Win big!");
//                payOut();
//            } else {
//                System.out.println("You Lose!");
//                bet();
//            }
//        }
//        if (answer.equals("n")) {//Todo: return to Casino
//
//        } else {
//            System.err.println("Wrong input... 'y' or 'n'");
//        }
//    }
//
//
//    public Double bet() {
//        System.out.println("Enter your bet:");
//        Scanner scanner = new Scanner(System.in);
//        Double betAmount = scanner.nextDouble();
//        return betAmount;
//    }
//
//    public boolean payOut() {
//        totalProfits += betAmount * multiplier;
//        return true;
//    }
//
//
//    public Double totalProfit() {
//        return totalProfits;
//    }
//
//
//    public Double totalLosses() {
//        return totalLosses;
//    }
//
//    public Double multiplier() {
//        return multiplier;
//    }
//}