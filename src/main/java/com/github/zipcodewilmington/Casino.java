package com.github.zipcodewilmington;

import com.github.zipcodewilmington.Player.Player;
import com.github.zipcodewilmington.casino.CasinoAccount;
import com.github.zipcodewilmington.casino.CasinoAccountManager;
import com.github.zipcodewilmington.casino.GameInterface;
import com.github.zipcodewilmington.casino.PlayerInterface;
import com.github.zipcodewilmington.games.Games;
import com.github.zipcodewilmington.games.gamblingGames.CoinFlip.CoinFlipGame;
import com.github.zipcodewilmington.games.noGamblingAllowed.numberGuessGame.NumberGuessGame;
import com.github.zipcodewilmington.games.noGamblingAllowed.numberGuessGame.NumberGuessPlayer;
import com.github.zipcodewilmington.games.gamblingGames.slots.SlotsGame;
import com.github.zipcodewilmington.games.gamblingGames.slots.SlotsPlayer;
import com.github.zipcodewilmington.utils.AnsiColor;
import com.github.zipcodewilmington.utils.IOConsole;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by leon on 7/21/2020.
 */
public class Casino implements Runnable {
    private final IOConsole console = new IOConsole(AnsiColor.BLUE);

    @Override
    public void run() {
        String arcadeDashBoardInput;
        CasinoAccountManager casinoAccountManager = new CasinoAccountManager();
        do {
            arcadeDashBoardInput = getArcadeDashboardInput();
            if ("select-game".equals(arcadeDashBoardInput)) {


                String gameSelectionInput = getGameSelectionInput().toUpperCase();
                if (gameSelectionInput.equals("SLOTS")) {
                    // once we know what game they want, we can figure out the maxPlayers
                    // let the function below ask for these
                    List<CasinoAccount> accs = askForAccounts(casinoAccountManager, 1);

                    // now we hand them over to a game.. SLOTS GAME
                    SlotsGame game = new SlotsGame(accs);

                    // run the game
                    game.run();


                } else if (gameSelectionInput.equals("NUMBERGUESS")) {

                    List<CasinoAccount> accs = askForAccounts(casinoAccountManager, 1);

                    // now we hand them over to a game.. SLOTS GAME
                    NumberGuessGame game = new NumberGuessGame(accs);

                    // run the game
                    game.run();

                } else if (gameSelectionInput.equals("COINFLIP")) {

                    List<CasinoAccount> accs = askForAccounts(casinoAccountManager, 1);

                    // now we hand them over to a game.. SLOTS GAME
                    CoinFlipGame game = new CoinFlipGame(accs);

                    // run the game
                    game.startGame();


                } else {
                    // TODO - implement better exception handling
                    String errorMessage = "[ %s ] is an invalid game selection";
                    throw new RuntimeException(String.format(errorMessage, gameSelectionInput));
                }
            } else if ("create-account".equals(arcadeDashBoardInput)) {
                console.println("Welcome to the account-creation screen.");
                String accountName = console.getStringInput("Enter your account name:");
                String accountPassword = console.getStringInput("Enter your account password:");
                CasinoAccount newAccount = casinoAccountManager.createAccount(accountName, accountPassword);
            }
        } while (!"logout".equals(arcadeDashBoardInput));
    }

    private String getArcadeDashboardInput() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to the Azure Dome Casino!")
                .append("\nFrom here, you can select any of the following options:")
                .append("\n\t[ create-account ], [ select-game ]")
                .toString());
    }

    private String getGameSelectionInput() {
        return console.getStringInput(new StringBuilder()
                .append("Welcome to the Game Selection Dashboard!")
                .append("\nFrom here, you can select any of the following options:")
                .append("\n\t[ SLOTS ], [ NUMBERGUESS ], [ COINFLIP]")
                .toString());
    }

    private List<CasinoAccount> askForAccounts(CasinoAccountManager manager, int maxPlayers) {
        List<CasinoAccount> accounts = new ArrayList<>();
        String prompt = String.format("How many players do you want? (maximum %d)", maxPlayers);
        Integer playerCount = console.getIntegerInput(prompt);

        if (playerCount > maxPlayers) {
            while (true) {
                playerCount = console.getIntegerInput("Too many players! Learn to read. \n");
                if (playerCount <= maxPlayers) {
                    break;
                }
            }
        }

        // we know how many players, let's start logging them in
        for (int i = 0; i < playerCount; i++) {
            // ask them for their account, using the PERSISTENT method
            CasinoAccount acc = askAccountPersistent(manager);
            accounts.add(acc);
        }

        return accounts;
    }

    public CasinoAccount askAccountPersistent(CasinoAccountManager manager) {
        // as long as it's still empty, we ask them for the login info
        while (true) {
            String accountName = console.getStringInput("Enter your account name:");
            String accountPassword = console.getStringInput("Enter your account password:");
            CasinoAccount acc = manager.getAccount(accountName, accountPassword);
            if (acc != null) {
                return acc;
            } else {
                System.out.println("Account not found. Try again.");
            }
        }
    }


//    private void play(Object gameObject, Object playerObject) {
//        GameInterface game = (GameInterface)gameObject;
//        PlayerInterface player = (PlayerInterface)playerObject;
//        game.add(player);
//        game.run();
//    }



//    private void play(Games game, Player player) {
//
//            game.addPlayer(player);
//            game.playGame();
//
//    }
}
