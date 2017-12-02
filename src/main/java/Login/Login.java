package Login;

import Storage.userStorage;
import User.User;
import static Utilities.queryHandler.*;
import java.io.*;
import  java.lang.*;

public class Login {
    public static boolean launchLoginMenu(User currentUser) {

        String title = "\t\t========================\n" +
                "\t\t   WELCOME TO ACORNS!  \n" +
                "\t\t========================\n";

        String question = "1.) Login \n2.) Sign Up \n3.) Exit \n\nEnter Choice:";
        int option = optionsQuery(title+question,3);

        switch (option) {

            case 1: //Launch Login
                boolean loginSuccess = launchLogin(currentUser) < 4;
                if (!loginSuccess){
                    System.out.println("Login attempt failed 3 times.\nPlease try again.");
                    return loginSuccess;
                }
                return loginSuccess;
            case 2: //Launch SignUp
                return launchSignup(currentUser);
            case 3: //Exit program
                System.out.println(
                        "\t\t===============================\n" +
                                "\t\t  Thank you for using Acorns!\n" +
                                "\t\t===============================\n"
                );
                System.exit(0);
        }
        return false;
    }

    private static int launchLogin(User currentUser) {

        int trigger = 0;

        while (trigger < 4) {
            System.out.println("\t\t========================\n" +
                    "\t\t        Sign In!        \n" +
                    "\t\t========================\n\n");

            currentUser.setEmail(inputInfo("Email: "));
            String password = inputInfo("Password: ");

            if (userStorage.readFile(currentUser) && currentUser.getPassword().equals(password))
                return trigger;
            else {
                trigger++;
                System.out.println("Invalid input, username or password is incorrect\n\n");
            }
        }
        return trigger;
    }

    private static boolean launchSignup(User currentUser) {

        while(true) {
            System.out.println("\t\t========================\n" +
                    "\t\t        Sign Up!        \n" +
                    "\t\t========================\n\n");
            System.out.println("Please enter the following information to get started!");
            currentUser.setName(inputInfo("Name: "));
            currentUser.setEmail(inputInfo("Email: "));
            currentUser.setPassword(inputInfo("Password: "));

            boolean flag = userStorage.writeFile(currentUser);
            if (!flag){
                System.out.println("Account already exists!");
                String question = "Would you like to try again? \n\n1.) Yes \n2.) No \n\nEnter Choice:";
                //int input = queryHandler.optionsQuery(question,2);
                if (optionsQuery(question,2) == 2)
                    break;
            }
            else
                return true;
        }
        return false;
    }
    //if the email exist it will return false;
    //if the email doesn't  exist it will return true;
    public  Boolean EmailValidation(String email){

        File theDir = new File("Storage//" +email);
        if (theDir.exists()) {



            return false;
        }



        return true;
    }





}
