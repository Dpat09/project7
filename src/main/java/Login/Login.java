package Login;

import User.User;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static boolean launchLoginMenu(User currentUser) {

        int option;
        while (true) {
            System.out.println("\t\t========================\n" +
                    "\t\t   WELCOME TO ACORNS!  \n" +
                    "\t\t========================\n");

            System.out.println("1. Login\n" + "2. Sign up\n" + "3. Exit\n");
            System.out.print("Please select an option by entering either 1 or 2 or 3: ");

            try {
                Scanner input = new Scanner(System.in);
                option = input.nextInt();
                if (option == 1 || option == 2 || option == 3) {
                    break;
                }

            } catch (Exception e) {
                //Runtime.getRuntime().exec("clear");
                System.out.println("Please enter a valid option");
            }

        }
        //User test = new User("test", "123", "test@test.com");
        switch (option) {

            case 1: //Launch Login
                return launchLogin(currentUser);

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
            default:
                return false;
        }
        return false;
    }

    private static boolean launchLogin(User currentUser) {
        String email, password, name = "";
        boolean loginSuccess;
        int trigger = 0;

        while (trigger < 4) {
            System.out.println("\t\t========================\n" +
                    "\t\t        Sign In!        \n" +
                    "\t\t========================\n\n");

              email = inputEmail();
              password = inputPass();
            /*
                   Using basic file I/O with scanner object. What it does it look for a text file named "email".
                   For example if the email entered was "test@test.com", readIn will try to open a file named "test@test.com.txt"
                   As we only need one user at a time, they do not need to be stored into an array at all.
            */
            try{
                String tempUser = "", tempPass = "";
                Scanner readIn = new Scanner (new File(email+".txt"));
                while(readIn.hasNext()){
                    tempUser = readIn.nextLine();
                    tempPass = readIn.nextLine();
                    name = readIn.nextLine();
                }
                loginSuccess =  email.contentEquals(tempUser) && password.contentEquals(tempPass);
            }catch(Exception e){
                loginSuccess = false;
            }

            if (loginSuccess) {
                currentUser.setName(name);
                currentUser.setEmail(email);
                currentUser.setPassword(password);
                return true;
            }
            else {
                trigger++;
                System.out.println("Invalid input, username or password is incorrect\n\n");
            }
        }
        return true;
    }

    private static void launchSignup(User currentUser) {
        String email = "", password = "", name = "";
        boolean loginSuccess;

        System.out.println("\t\t========================\n" +
                "\t\t        Sign Up!        \n" +
                "\t\t========================\n\n");
        System.out.println("Please enter the following information to get started!");

        System.out.print("Name: ");
        Scanner input = new Scanner(System.in);
        try {
            name = input.nextLine();
        } catch (Exception e) {
            System.out.println("Error inputting name");
        }
        email = inputEmail();
        password = inputPass();

        currentUser.setName(name);
        currentUser.setEmail(email);
        currentUser.setPassword(password);

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

    private static String inputEmail (){
        String email = "";
        System.out.print("Email: ");
        Scanner input = new Scanner(System.in);
        try {
            email = input.nextLine();
        } catch (Exception e) {
            System.out.println("Error inputting email");
        }
        return email;
    }

    private static String inputPass(){
        String password = "";
        System.out.print("Password: ");
        Scanner input = new Scanner(System.in);
        try {
            password = input.nextLine();
        } catch (Exception e) {
            System.out.println("Error inputting password");
        }
        return password;
    }

}
