package Dashboard;

import Stock.*;
import Storage.bankStorage;
import Storage.portfolioStorage;
import Storage.stockStorage;
import Storage.userStorage;
import User.*;

import static Stock.stockCalc.investmentCalc;
import static Utilities.queryHandler.*;
import manageTransactions.Bank;
import manageTransactions.Portfolio;
import manageTransactions.portfolioManager;

public class Dashboard {
    private static Portfolio currentPortfolio = null;
    private static Bank currentBank = null;
    private static stockStore stocksList = null;

    public Dashboard(User currentUser){
        currentPortfolio = new Portfolio();
        currentBank = new Bank();
        stocksList = new stockStore();
    }

    public void preDashSetup(User currentUser) {
        stockStorage.readFile(stocksList,currentUser);
        bankStorage.readFile(currentBank,currentUser);
        if (!portfolioStorage.readFile(currentPortfolio, currentUser))
            portfolioManager.createPortfolio(currentPortfolio, currentBank, stocksList);

        investmentCalc(currentPortfolio,stocksList);
        launchDash(currentUser);

        userStorage.writeFile(currentUser);
        portfolioStorage.writeFile(currentPortfolio, currentUser);
        bankStorage.writeFile(currentBank, currentUser);
        stockStorage.writeFile(stocksList,currentUser);
    }

    public void launchDash(User currentUser) {
        int option = 0;
        while (option != 4) {
            System.out.println("\t\t========================\n" +
                    "\t\t   Hello \t" + currentUser.getName() + "!  \n" +
                    "\t\t========================\n");

            System.out.printf("Your present account value is $%.2f\n",currentPortfolio.getFunds());
            System.out.printf("Original Investment Amount: $%.2f\n",currentPortfolio.getPreInvested());


            String question = "What would you like to do today?\n"
                    + "\n1.) Manage User Account"
                    + "\n2.) See Portfolio"
                    + "\n3.) Manage Funds"
                    + "\n4.) Logoff"
                    + "\n\nEnter Choice:";

            option = optionsQuery(question,4);

            switch(option){
                case 1:
                    userManager.userManagerMenu(currentUser);
                    break;

                case 2:
                    portfolioManager.portfolioManagerMenu(currentPortfolio, stocksList);
                    break;

                case 3:
            }
        }
    }
}
