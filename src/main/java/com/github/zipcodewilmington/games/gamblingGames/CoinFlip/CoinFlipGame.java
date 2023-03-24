package com.github.zipcodewilmington.games.gamblingGames.CoinFlip;
import com.github.zipcodewilmington.Player.Player;
import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.games.Games;
import com.github.zipcodewilmington.games.gamblingGames.GambleGames;


import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CoinFlipGame extends Games implements GambleGames {

        private double balance;
        private Scanner scanner;
        private Random random;
    public int getMaxPlayers() {
        return 1;
    }

    public CoinFlipGame(List<Player> players) {
        super(players);

        for (CasinoAccount acc : accounts) {
            CoinFlipPlayer pl = new CoinFlipPlayer(acc);
            addPlayer(pl);
        }
        balance = 0.0;
        scanner = new Scanner(System.in);
        random = new Random();
    }

    public void startGame () {
            System.out.println("Welcome to the Coin Flip Game!");
            System.out.println("You will be prompted to bet on the outcome of a coin toss.");
            boolean playAgain = true;

            while (playAgain) {

                double wager = bet();
                String bet = getBet();
                String coin = flipCoin();
                boolean win = determineOutcome(bet, coin);

                if (win) {
                    System.out.printf("Congratulations! You won $%.2f.\n", payOut(wager, multiplier()));
                } else {
                    System.out.printf("Sorry, you lost $%.2f.\n", wager);
                    balance -= wager;
                }

                System.out.printf("Your current balance is $%.2f.\n", balance);

                playAgain = getPlayAgain();
            }

            System.out.printf("Thanks for playing the Coin Flip Game! Your final balance is $%.2f.\n", balance);
            scanner.close();
        }

        public Double bet () {
            System.out.printf("Your current balance is $%.2f.\n", balance);
            System.out.print("How much money do you want to bet? $");
            double wager = scanner.nextDouble();

            while (wager <= 0.0) {
                System.out.print("Invalid wager. Please enter a positive amount: $");
                wager = scanner.nextDouble();
            }

            return wager;
        }

    @Override
    public boolean payOut() {
        return false;
    }

    public String getBet () {
            System.out.print("Do you bet on heads or tails? ");
            String bet = scanner.next();

            while (!bet.equalsIgnoreCase("heads") && !bet.equalsIgnoreCase("tails")) {
                System.out.print("Invalid bet. Please bet on either 'heads' or 'tails': ");
                bet = scanner.next();
            }

            return bet;
        }

        public String flipCoin () {
            String[] coinSides = {"heads", "tails"};
            String coin = coinSides[random.nextInt(2)];
            System.out.println("The coin landed on " + coin + ".");
            return coin;
        }

        public boolean determineOutcome (String bet, String coin){
            return bet.equalsIgnoreCase(coin);
        }

        public double payOut ( double wager, double multiplier){
            double payout = wager * multiplier;
            balance += payout;
            return payout;
        }

        public boolean getPlayAgain () {
            System.out.printf("Your total profits are $%.2f.\n", totalProfit());
            System.out.printf("Your total losses are $%.2f.\n", totalLosses());
            System.out.print("Do you want to play again? (y/n) ");
            String response = scanner.next();

            while (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n")) {
                System.out.print("Invalid response. Do you want to play again? (y/n) ");
                response = scanner.next();
            }

            return response.equalsIgnoreCase("y");
        }

        public Double totalProfit () {
            return Math.max(balance, 0.0);
        }

        public Double totalLosses () {
            return balance < 0.0 ? -balance : 0.0;
        }

        public Double multiplier () {
            return (double) random.nextInt(10);
        }
    }
