package Dashboard;

import User.User;

import java.util.Scanner;

public class Dashboard {

     public static boolean launchDash(User currentUser){
         int option;
         while (true) {
             System.out.println("\t\t========================\n" +
                     "\t\t   Hello \t" + currentUser.getName() + "!  \n"+
                     "\t\t========================\n");


             System.out.println("Your current present account value is " + 100.73);
             break;
         }
         return true;
     }

}
