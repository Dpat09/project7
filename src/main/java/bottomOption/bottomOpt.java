package bottomOption;

import java.util.Scanner;

/**
 * Created by Kingsley on 9/29/17.
 */
public class bottomOpt {

    public static void nextRespond(){
        System.out.println("1. Exit the Application \n"+"2. Return to Main\n");
        int Nextoption = 0;

        try{
            Scanner respond = new Scanner(System.in);
            Nextoption = respond.nextInt();

            if(Nextoption == 1){

                System.out.println("exit");

            }else if(Nextoption == 2){

                System.out.println("move user to the main");

            }else{

                System.out.println("invalid entry");
            }



        }catch(Exception e){

            System.out.println("please enter a valid option");
        }




    }


}
