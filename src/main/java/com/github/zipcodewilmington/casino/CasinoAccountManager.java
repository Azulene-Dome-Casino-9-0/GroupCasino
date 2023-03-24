package com.github.zipcodewilmington.casino;

import com.github.zipcodewilmington.Casino;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccountManager` stores, manages, and retrieves `ArcadeAccount` objects
 * it is advised that every instruction in this class is logged
 */
public class CasinoAccountManager{

    public List<CasinoAccount> accounts;
    private static final double DEFAULT_BALANCE = 100000.0;

    public CasinoAccountManager() {
        this.accounts = new ArrayList<>();
    }


    public CasinoAccount getAccount(String accountName, String accountPassword) {
        for (CasinoAccount a : accounts) {
            if (accountName.equals(a.getAccountName()) && accountPassword.equals(a.getPassword())) {
                return a;
            }
        }

        return null;
    }

    private List<CasinoAccount> registerAccount(CasinoAccount a) {
        accounts.add(a);
        return accounts;
    }

    public CasinoAccount createAccount(String accountName, String accountPassword) {
        CasinoAccount acc = new CasinoAccount(accountName, accountPassword, DEFAULT_BALANCE);
        registerAccount(acc);
        return acc;
    }



//    private HashMap<String, CasinoAccount> account;
//
//    /**
//     * @param accountName     name of account to be returned
//     * @param accountPassword password of account to be returned
//     * @return `ArcadeAccount` with specified `accountName` and `accountPassword`
//     */
//
//    public CasinoAccountManager() {
//        account = new HashMap<>();
//
//    }
//
//    public HashMap<String, CasinoAccount> getMap(){
//        return account;
//    }
//
//    public void setMap(HashMap<String, CasinoAccount> account) {
//        this.account = account;
//    }
//
//    public void registerAccount(CasinoAccount mainAccount) {
//        account.put(mainAccount.getAccountName(), mainAccount);
//    }
//
//    public CasinoAccount getAccount(CasinoAccount mainAccount, String password) {
//       CasinoAccount currAcc = new CasinoAccount();
//        if(password.equals(account.get(mainAccount).getPassword())) {
//            currAcc = account.get(mainAccount);
//        } else {
//            return null;
//        }
//            return currAcc;
//    }




//    public CasinoAccount getAccount(String accountName, String accountPassword) {
//
//        String currentMethodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        String currentClassName = getClass().getName();
//        String errorMessage = "Method with name [ %s ], defined in class with name [ %s ] has  not yet been implemented";
//        throw new RuntimeException(String.format(errorMessage, currentMethodName, currentClassName));
//    }
//
//    /**
//     * logs & creates a new `ArcadeAccount`
//     *
//     * @param accountName     name of account to be created
//     * @param accountPassword password of account to be created
//     * @return new instance of `ArcadeAccount` with specified `accountName` and `accountPassword`
//     */
//    public CasinoAccount createAccount(String accountName, String accountPassword) {
//        String currentMethodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        String currentClassName = getClass().getName();
//        String errorMessage = "Method with name [ %s ], defined in class with name [ %s ] has  not yet been implemented";
//        throw new RuntimeException(String.format(errorMessage, currentMethodName, currentClassName));
//    }
//
//    /**
//     * logs & registers a new `ArcadeAccount` to `this.getArcadeAccountList()`
//     *
//     * @param casinoAccount the arcadeAccount to be added to `this.getArcadeAccountList()`
//     */
//    public void registerAccount(CasinoAccount casinoAccount) {
//        String currentMethodName = new Object(){}.getClass().getEnclosingMethod().getName();
//        String currentClassName = getClass().getName();
//        String errorMessage = "Method with name [ %s ], defined in class with name [ %s ] has  not yet been implemented";
//        throw new RuntimeException(String.format(errorMessage, currentMethodName, currentClassName));
//    }
}
