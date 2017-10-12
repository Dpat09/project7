package Dashboard;

import User.User;

import java.util.Scanner;

public class Dashboard {

     public static void launchDash(User currentUser){
         int option;
         while (true) {
             System.out.println("\t\t========================\n" +
                     "\t\t   Hello " + currentUser.getName() + "!  \\n\""+
                     "\t\t========================\n");


             System.out.println("Your current present account value is " + 100.73);

//             try {
//                 Scanner input = new Scanner(System.in);
//                 option = input.nextInt();
//                 if (option == 1 || option == 2 || option == 3) {
//                     break;
//                 }
//
//             } catch (Exception e) {
//                 //Runtime.getRuntime().exec("clear");
//                 System.out.println("Please enter a valid option");
//             }

         }
     }

}
