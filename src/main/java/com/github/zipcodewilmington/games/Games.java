package com.github.zipcodewilmington.games;

import com.github.zipcodewilmington.Player.Player;
import com.github.zipcodewilmington.casino.CasinoAccount;

import java.util.ArrayList;
import java.util.List;

public abstract class Games {
    protected List<Player> players;
    //games and subclasses can access protected
    protected List<CasinoAccount> accounts;

    public Games(List<CasinoAccount> accounts) {
        players = new ArrayList<Player>();

        this.accounts = accounts;
    }

    public void playGame() {

    }

    public int getMaxPlayers() {
        return 0;
    }

    public void addPlayer(Player player) {
        // check that the game isn't full
        if (players.size() == getMaxPlayers()) {
            System.out.println("The game is full!");
            return;
        }

        players.add(player);
    }

//    public void getPlayer(List<Player> players) {
//        int i = 0;
//        for(Player a : players) {
//            ;
//        }

//    }

    public void playAgain() {

    }

    public boolean isGameOver() {
        return false;
    }
}
