package Dashboard;

import Storage.bankStorage;
import Storage.portfolioStorage;
import Storage.userStorage;
import User.User;
import manageTransactions.Bank;
import manageTransactions.Portfolio;
import manageTransactions.portfolioManager;

import javax.sound.sampled.Port;
import java.util.Scanner;

public class Dashboard {

    //private static Portfolio currentPortfolio = null;
    //private static Bank currentBank = null;

//    public Dashboard(User currentUser){
//        currentPortfolio = new Portfolio();
//        currentBank = new Bank();
//        portfolioStorage.ReadFile(currentPortfolio,currentUser);
//    }

    public static void preDashSetup(User currentUser){
        Portfolio currentPortfolio = new Portfolio();
        Bank currentBank = new Bank();

        //bankStorage.readFile(currentBank,currentUser);
        if (!portfolioStorage.ReadFile(currentPortfolio,currentUser))
            portfolioManager.createPortfolio(currentPortfolio,currentBank);

        launchDash(currentUser, currentPortfolio, currentBank);

        userStorage.writeFile(currentUser);
        portfolioStorage.writeFile(currentPortfolio,currentUser);
        bankStorage.writeFile(currentBank,currentUser);
    }

    public static boolean launchDash(User currentUser, Portfolio currentPortfolio, Bank currentBank) {
        int option;
        while (true) {
            System.out.println("\t\t========================\n" +
                    "\t\t   Hello \t" + currentUser.getName() + "!  \n" +
                    "\t\t========================\n");

            System.out.println("Your current present account value is " + currentPortfolio.getFunds());
            break;
        }
        return true;
    }
}
