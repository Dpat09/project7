package Login;

import java.util.Scanner;

public class Login {
    public static void launchLogin(){

        int option = 0;
        while(true) {
            System.out.println("\t\t========================\n" +
                               "\t\t   WELCOME TO ACORNS!  \n" +
                               "\t\t========================\n\n");
            //System.out.println("========================");
            System.out.print("Please select an option by entering 1 or 2: ");
            try{
                Scanner input = new Scanner(System.in);
                option = input.nextInt();
                if (option == 1 || option == 2){
                    break;
                }

            }catch(Exception e){
                //Runtime.getRuntime().exec("clear");
                System.out.println("Please enter a valid option");
            }
            //switch(option){
            //    case 1: //Launch Login
            //    case 2: //Launch SignUp
            //}


        }


    }
}
