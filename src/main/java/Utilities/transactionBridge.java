package Utilities;

import manageTransactions.Bank;
import manageTransactions.Portfolio;

public class transactionBridge {
    public static void bankToPortfolio(Bank bankAccount, Portfolio currentPortfolio, double amount){
        bankAccount.withDraw(amount);
        currentPortfolio.deposit(amount);
    }
    public static void portfolioToBank(Bank bankAccount, Portfolio currentPortfolio, double amount){
        currentPortfolio.withDraw(amount);
        bankAccount.deposit(amount);
    }
}
