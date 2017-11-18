package Start;

import Login.Login;
import Storage.UserStorage;
import Storage.UserPortfolio;
import User.User;
import manageTransactions.Portfolio;

import java.util.Scanner;

public class Start {
    public static void main(String[]args){
        //Start Program with Splash
        //splashScreen();
        Portfolio currentUserPortfolio = new Portfolio(1,1,10,false,100);
        //currentUserPortfolio.setAggression();
        //kingsley.DisplayPortfolioOptions();
         User currentUser = new User();
         boolean checker;

         currentUser.setName("kingsley12");
         currentUser.setEmail("kingsley12@g.com");
         currentUser.setPassword("thisONePassword");

         User newUser = new User("dhaiwat","123","test@g.com");
         Portfolio newPort = new Portfolio();//new Portfolio(2,2,12,true,100);

         UserStorage CHE = new UserStorage();


         UserPortfolio Che = new UserPortfolio();

         Che.writeFile(currentUserPortfolio,currentUser);
         //Che.writeFile(newPort,newUser);

         Che.ReadFile(newPort,newUser);
         //System.out.println(test);

        System.out.println(newPort.getAggression());
         //CHE.writeFile(currentUser);
         //checker  = CHE.ReadFile(currentUser);

        // System.out.println("live its saturday night live "+ checker);

        //boolean loginSuccess = Login.launchLoginMenu(currentUser);
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
