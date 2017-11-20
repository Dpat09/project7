package Start;

import manageTransactions.Bank;
import manageTransactions.Portfolio;
import manageTransactions.investInterval;
//import manageTransactions.portfolioManager;
import User.User;
import Login.Login;

import java.util.Scanner;

public class Start {
    public static void main(String[]args){
        //Start Program with Splash
        //splashScreen();
        Portfolio currentPortfolio = new Portfolio();
        Bank currentBank = new Bank();
        User currentUser = new User();
        boolean loginSuccess = Login.launchLoginMenu(currentUser);
        //System.out.println(currentUser.getName());
        //Dashboard.launchDash(currentUser);

    }
    public static void splashScreen() {

        //Using ACII Art from http://ascii.co.uk/art/acorn

        System.out.println("\t\t\t              _\n" +
                "            _/-\\_\n" +
                "         .-`-:-:-`-.\n" +
                "        /-:-:-:-:-:-\\\n" +
                "        \\:-:-:-:-:-:/\n" +
                "         |`       `|\n" +
                "         |         |\n" +
                "         `\\       /'\n" +
                "           `-._.-'\n" +
                "              `");
//        System.out.println("                                                          \n" +
//                ",adPPYYba,  ,adPPYba,  ,adPPYba,  8b,dPPYba, 8b,dPPYba,   \n" +
//                "\"\"     `Y8 a8\"     \"\" a8\"     \"8a 88P'   \"Y8 88P'   `\"8a  \n" +
//                ",adPPPPP88 8b         8b       d8 88         88       88  \n" +
//                "88,    ,88 \"8a,   ,aa \"8a,   ,a8\" 88         88       88  \n" +
//                "`\"8bbdP\"Y8  `\"Ybbd8\"'  `\"YbbdP\"'  88         88       88  \n" +
//                "                                                          \n" +
//                "                                                          ");
        Scanner next = new Scanner(System.in);
        System.out.println("Please hit any key to continue..");
        String hold = next.nextLine();
    }
}
