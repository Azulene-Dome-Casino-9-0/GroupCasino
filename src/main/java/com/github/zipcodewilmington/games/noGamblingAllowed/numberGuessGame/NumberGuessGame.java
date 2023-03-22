package com.github.zipcodewilmington.games.noGamblingAllowed.numberGuessGame;

import com.github.zipcodewilmington.utils.AnsiColor;

import java.util.Scanner;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessGame {

    public static void main(String[] args) {

        int actual = (int) (Math.random() * 50) + 1;  //randomly select number between 1 and 50 (both inclusive)
        //String[] rainbowText = new String[]{"RED","GREEN","YELLOW","BLUE","PURPLE","CYAN"};

        System.out.println("Please guess a number from 1 - 50: "); //tie in userName variable to greeting later

        for (int i = 0; i <= 7; i++) {
            Scanner in = new Scanner((System.in));
            int guess = Integer.parseInt(in.nextLine());
            String win = "A winner is you!";
            if (i == 7) {
                System.out.println("\uD83D\uDE2D You didn't guess the number fast enough!");
                break;
            } else if (guess < actual) {
                System.out.println(AnsiColor.BLUE.getColor() + "\uD83E\uDD76 Cold!" + AnsiColor.AUTO.getColor());
            } else if (guess > actual) {
                System.out.println(AnsiColor.RED.getColor() + "\uD83E\uDD75 Hot!" + AnsiColor.AUTO.getColor());
            } else if (guess == actual) {
                System.out.println("\uD83E\uDD73 A winner is you!");
            }
        }
    }
}
