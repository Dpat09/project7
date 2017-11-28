package Utilities;

import manageTransactions.Bank;
import manageTransactions.Portfolio;
import org.junit.Test;

import static org.junit.Assert.*;

public class transactionBridgeTest {
    private static Bank bankObj = new Bank();
    private static Portfolio portObj = new Portfolio();

    private void setUpTest(){
        bankObj.updateBalance(100);
        portObj.setFunds(15);
    }

    @Test
    public void bankToPortfolio() throws Exception {
        setUpTest();
        double amount = 15;
        transactionBridge.bankToPortfolio(bankObj,portObj,amount);
        assertEquals(30,portObj.getFunds(),0);
    }

    @Test
    public void portfolioToBank() throws Exception {
        setUpTest();
        double amount = 15;
        transactionBridge.portfolioToBank(bankObj,portObj,amount);
        assertEquals(115,bankObj.getBalance(),0);
    }

    @Test
    public void truebankToPortfolio(){
        setUpTest();
        double amount = 15;
        assertEquals(true,transactionBridge.bankToPortfolio(bankObj,portObj,amount));
    }

    @Test
    public void falsebankToPortfolio(){
        setUpTest();
        double amount = 115;
        assertEquals(false,transactionBridge.bankToPortfolio(bankObj,portObj,amount));
    }

    @Test
    public void trueportfolioToBank() throws Exception {
        setUpTest();
        double amount = 15;
        assertEquals(true,transactionBridge.portfolioToBank(bankObj,portObj,amount));
    }

    @Test
    public void falseportfolioToBank() throws Exception {
        setUpTest();
        double amount = 123;
        assertEquals(false,transactionBridge.portfolioToBank(bankObj,portObj,amount));
    }

}