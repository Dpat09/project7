package Login;

import User.User;


import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static boolean launchLoginMenu(User currentUser) {

        int option = 0;
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
        User test = new User("test", "123", "test@test.com");
        switch (option) {

            case 1: //Launch Login
                boolean ifSuccess = launchLogin(test);
                return ifSuccess;

            case 2: //Launch SignUp
                launchSignup();
                break;

            case 3: //Exit program
                System.out.println(
                          "\t\t===============================\n"+
                            "\t\t  Thank you for using Acorns!\n"+
                          "\t\t===============================\n"
                );
                System.exit(0);
            default:
                return false;
        }
        //ArrayList<User> list = new ArrayList<User>();
        //list.add(new User("test","123","test@test.com"));
        return false;
    }

    public static boolean launchLogin(User test) {
        String email = "", password = "";
        boolean loginSuccess = false;

        while (true) {
            System.out.println("\t\t========================\n" +
                    "\t\t        Sign In!        \n" +
                    "\t\t========================\n\n");

            System.out.print("Email: ");
            Scanner input = new Scanner(System.in);
            try {
                email = input.nextLine();
            } catch (Exception e) {
                System.out.println("Error inputting email");
            }

            System.out.print("Password: ");
            try {
                password = input.nextLine();
            } catch (Exception e) {
                System.out.println("Error inputting password");
            }

            try{
                String tempUser = "", tempPass = "";
                Scanner readIn = new Scanner (new File(email));
                while(readIn.hasNext()){
                    tempUser = readIn.nextLine();
                    tempPass = readIn.nextLine();
                }
                loginSuccess =  email.contentEquals(tempUser) && password.contentEquals(tempPass);
            }catch(Exception e){
                loginSuccess = false;
            }

            if (loginSuccess)
                return loginSuccess;
            else
                System.out.println("Invalid input, username or password is incorrect\n\n");
        }


    }

    public static void launchSignup() {
        System.out.println("\t\t========================\n" +
                "\t\t        Sign Up!        \n" +
                "\t\t========================\n\n");

    }

}
