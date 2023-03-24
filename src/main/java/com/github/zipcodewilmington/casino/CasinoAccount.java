package com.github.zipcodewilmington.casino;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */
public class CasinoAccount {
    private Double accountBalance;
    private String accountName;
    private String password;


    public CasinoAccount() {
        this.accountBalance = 0.00;
        this.accountName = "";
        this.password = "";
    }

    public CasinoAccount(String accountName, String password, Double accountBalance) {
        this.accountBalance = accountBalance;
        this.accountName = accountName;
        this.password = password;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword(){
        return password;
    }





}
