package Dashboard;

import Stock.stockCalc;
import Stock.stockStore;
import Storage.bankStorage;
import Storage.portfolioStorage;
import Storage.stockStorage;
import Storage.userStorage;
import User.*;
import static Utilities.queryHandler.*;
import manageTransactions.Bank;
import manageTransactions.Portfolio;
import manageTransactions.portfolioManager;
import java.util.Date;
import java.util.Scanner;

public class Dashboard {
    private Date date = new Date();
    private static Portfolio currentPortfolio = null;
    private static Bank currentBank = null;
    private stockCalc calc = null;
    private static stockStore stocksList = null;

    public Dashboard(User currentUser){
        currentPortfolio = new Portfolio();
        currentBank = new Bank();
        calc = new stockCalc();
        stocksList = new stockStore();
    }

    public void preDashSetup(User currentUser) {
        stockStorage.readFile(stocksList,currentUser);
        bankStorage.readFile(currentBank,currentUser);
        if (!portfolioStorage.ReadFile(currentPortfolio, currentUser))
            portfolioManager.createPortfolio(currentPortfolio, currentBank, stocksList);

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

            System.out.print("Your present account value is $");
            System.out.printf("%.2f\n", currentPortfolio.getFunds());

            //EXAMPLES OF USAGE OF stocksList
//            stocksList.setInitPrice("INTL",35);
//            stocksList.setInitPrice("HELLO", 100);
//            stocksList.setInitPrice("GOOG", 1019);
//
//            System.out.println(stocksList.getInitPrice("INTL"));
//            System.out.println(stocksList.getInitPrice("HELLO"));
//            System.out.println(stocksList.getInitPrice("GOOG"));

            //testing
            try{
                calc.investmentCalc(currentPortfolio,stocksList);
            }catch(Exception e){
                System.out.println("hello");
            }

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
                    portfolioManager.portfolioManagerMenu(currentPortfolio);
                    break;

                case 3:
            }
        }
        //return true;
    }
}
