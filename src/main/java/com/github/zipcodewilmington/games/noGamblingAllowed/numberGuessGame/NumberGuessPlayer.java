package com.github.zipcodewilmington.games.noGamblingAllowed.numberGuessGame;

import com.fasterxml.jackson.databind.util.ISO8601Utils;
import com.github.zipcodewilmington.Player.Player;
import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.utils.IOConsole;
import com.github.zipcodewilmington.utils.AnsiColor;


import java.util.Scanner;


/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessPlayer extends Player {

    public NumberGuessPlayer(CasinoAccount account) {
        super(account);
    }
}

