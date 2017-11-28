package Utilities;

import manageTransactions.Bank;
import manageTransactions.Portfolio;

public class transactionBridge {
    public static boolean bankToPortfolio(Bank bankAccount, Portfolio currentPortfolio, double amount){
        if (bankAccount.withDraw(amount)) {
            currentPortfolio.deposit(amount);
            return true;
        }
        return false;
    }
    public static boolean portfolioToBank(Bank bankAccount, Portfolio currentPortfolio, double amount){
        if (currentPortfolio.withDraw(amount)) {
            bankAccount.deposit(amount);
            return true;
        }
        return false;
    }
}
