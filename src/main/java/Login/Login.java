package Login;

import User.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static void launchLoginMenu(){

        int option = 0;
        while(true) {
            System.out.println("\t\t========================\n" +
                               "\t\t   WELCOME TO ACORNS!  \n" +
                               "\t\t========================\n");
            //System.out.println("========================");

            System.out.println("1. Login\n"+"2. Sign up\n");
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

        }
        User test = new User("test","123","test@test.com");
        switch(option){

            case 1: //Launch Login
                    launchLogin(test);
                    break;



            case 2: //Launch SignUp
                    launchSignup();

        }
        //ArrayList<User> list = new ArrayList<User>();
        //list.add(new User("test","123","test@test.com"));

    }

    public static void launchLogin(User test){
        String email = "" , password = "";
        Boolean success = false;

        while (true) {
            System.out.println("\t\t========================\n" +
                               "\t\t        Sign In!        \n" +
                               "\t\t========================\n\n");

            System.out.print("Email: ");
            Scanner input = new Scanner(System.in);
            try{
                email = input.nextLine();
            }catch (Exception e){
                System.out.println("Error inputting email");
            }

            //System.out.println();

            try{
                System.out.print("Password: ");
                password = input.nextLine();
            }catch(Exception e){
                System.out.println("Error inputting password");
            }

            success = test.getEmail().equals(email) && test.getPassword().equals(password);

            if (success)
                break;
            else
                System.out.println("Invalid input, username or password is incorrect");
        }



    }

    public static void launchSignup(){
        System.out.println("\t\t========================\n" +
                           "\t\t        Sign Up!        \n" +
                           "\t\t========================\n\n");

    }

}
