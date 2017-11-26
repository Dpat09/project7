package Dashboard;

import Storage.bankStorage;
import Storage.portfolioStorage;
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

    public Dashboard(User currentUser){
        currentPortfolio = new Portfolio();
        currentBank = new Bank();
    }

    public void preDashSetup(User currentUser) {
        bankStorage.readFile(currentBank,currentUser);
        if (!portfolioStorage.ReadFile(currentPortfolio, currentUser))
            portfolioManager.createPortfolio(currentPortfolio, currentBank);

        launchDash(currentUser);

        userStorage.writeFile(currentUser);
        portfolioStorage.writeFile(currentPortfolio, currentUser);
        bankStorage.writeFile(currentBank, currentUser);
    }

    public void launchDash(User currentUser) {
        int option = 0;
        while (option != 4) {
            System.out.println("\t\t========================\n" +
                    "\t\t   Hello \t" + currentUser.getName() + "!  \n" +
                    "\t\t========================\n");

            System.out.print("Your present account value is $");
            System.out.printf("%.2f\n", currentPortfolio.getFunds());

            String questionPart1 = "What would you like to do today?\n"
                    + "\n1.) Manage User Account"
                    + "\n2.) Manage Portfolio" +
                        "\n\t-Pick different Aggressions"
                    + "\n3.) Manage Funds"
                    + "\n4.) Logoff"
                    + "\n\nEnter Choice:";

            option = optionsQuery(questionPart1,4);

            switch(option){
                case 1:
                    userManager.userManagerMenu(currentUser);
                    break;

                case 2:
                    portfolioManager.portfolioManagerMenu();
                    break;

                case 3:
            }
        }
        //return true;
    }
}
