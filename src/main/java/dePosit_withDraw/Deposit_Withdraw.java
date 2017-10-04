package dePosit_withDraw;

import java.util.Scanner;
/**
 * Created by Kingsley on 10/1/17.
 */
public class Deposit_Withdraw {

    int currentBalance;



    public void TransactionOption(int ActualCurrentBalance){

        System.out.println("Please choose your transaction \n"+" 1. Deposit  or  2. WithDraw \n");
        int inputValue = 0;

        try{
            Scanner respond = new Scanner(System.in);
            inputValue = respond.nextInt();

            if(inputValue == 1){

                withDraw(ActualCurrentBalance);

            }else if (inputValue == 2){

                Deposit(ActualCurrentBalance);

            }


        }catch (Exception e){

            System.out.println("invalid entry");

        }

    }

    public void withDraw(int balance){
        System.out.println("welcome withdraw section of your account\n" +
                "your current balance is " + balance +"\n" +
                "How much would you like to Withdraw today");

         int withdrawValue = ask();

         currentBalance = balance - withdrawValue;

    }

    public void Deposit(int balance){
        System.out.println("welcome Deposit section of your account\n" +
                "your current balance is " + balance +"\n" +
                "How much would you like to deposit today");


        int DepositValue = ask();


        currentBalance = balance + DepositValue;
    }

    public static int ask(){
        int respond = 0;

        try{
            Scanner input = new Scanner(System.in);
            respond = input.nextInt();

        }catch (Exception e){


            System.out.println("invalid entry");

        }

        return respond;
    }



}
