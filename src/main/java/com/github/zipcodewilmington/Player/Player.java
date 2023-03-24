package com.github.zipcodewilmington.Player;
import com.github.zipcodewilmington.casino.CasinoAccount;

public abstract class Player{
//    String firstName;
//    String lastName;
    CasinoAccount account;
    Double balance;
    // firstName, lastName, account balance :3?



    public Player(CasinoAccount account) {
//        this.firstName = firstName;
//        this.lastName = lastName;
        this.account = account;

    }

    public Double getBalance(){
        return account.getAccountBalance();
    }

    public void setBalance(Double balance) {
        account.setAccountBalance(balance);
    }

    public CasinoAccount getCAccount() {
        return this.account;
    }


}
