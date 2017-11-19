package Login;

import Storage.userStorage;
import User.User;
import Utilities.queryHandler;
import Utilities.scannerInputs;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Login {
    public static boolean launchLoginMenu(User currentUser) {

        String title = "\t\t========================\n" +
                "\t\t   WELCOME TO ACORNS!  \n" +
                "\t\t========================\n";

        String question = "1.) Login \n2.) Sign Up \n3.) Exit \n\nEnter Choice:";
        int option = queryHandler.optionsQuery(title+question,3);

        //User test = new User("test", "123", "test@test.com");
        switch (option) {

            case 1: //Launch Login
                return launchLogin(currentUser) < 4;

            case 2: //Launch SignUp
                launchSignup(currentUser);
//                System.out.println(
//                        "Name: "+currentUser.getName()+
//                        "Email: "+currentUser.getPassword()+
//                        "Pass: "+currentUser.getPassword()
//
//                );
                break;

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
        String email, password, name = "";
        boolean loginSuccess;
        int trigger = 0;

        while (trigger < 4) {
            System.out.println("\t\t========================\n" +
                    "\t\t        Sign In!        \n" +
                    "\t\t========================\n\n");

            currentUser.setEmail(inputInfo("Email: "));
            password = inputInfo("Password: ");

            if (userStorage.readFile(currentUser) && currentUser.getPassword().equals(password))
                return trigger;
            else {
                trigger++;
                System.out.println("Invalid input, username or password is incorrect\n\n");
            }
        }
        return trigger;
    }

    private static void launchSignup(User currentUser) {
        boolean loginSuccess;

        System.out.println("\t\t========================\n" +
                "\t\t        Sign Up!        \n" +
                "\t\t========================\n\n");
        System.out.println("Please enter the following information to get started!");

        String name = scannerInputs.scanStringInput();
        String email = scannerInputs.scanStringInput();
        String password = scannerInputs.scanStringInput();


        // Add banking information and save to bank object
        // Store Current current balance

        currentUser.setName(name);
        currentUser.setEmail(email);
        currentUser.setPassword(password);
        //Portfolio user = new Portfolio();
        //user.DisplayPortfolioOptions(100.17);
        //user.printPortfolio();
        try {
            PrintWriter saveUser = new PrintWriter(new FileWriter(email));
            saveUser.println(email);
            saveUser.println(password);
            saveUser.println(name);
            saveUser.close();
        } catch (IOException e) {
            System.out.println("error occurred while outputting user object file");
        }

    }

    private static String inputInfo (String title){
        System.out.print(title);
        return scannerInputs.scanStringInput();
    }
}
