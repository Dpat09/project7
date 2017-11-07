package dePosit_withDraw;

import java.util.Scanner;

public class Deposit_Withdraw {

    int currentBalance;

//    public Deposit_Withdraw (int ActualCurrentBalance,String Deposit_Withdraw, int amount){
//
//           if(Deposit_Withdraw.equalsIgnoreCase("deposit")){
//
//               Deposit(ActualCurrentBalance,amount);
//
//           }
//           else(Deposit_Withdraw.equalsIgnoreCase("withdraw")){
//
//               withDraw(ActualCurrentBalance,amount);
//           }
//    }

    public void TransactionOption(int ActualCurrentBalance){

        System.out.println("Please choose your transaction \n"+" 1. Deposit  or  2. WithDraw \n");
        int inputValue = 0;

        try{
            Scanner respond = new Scanner(System.in);
            inputValue = respond.nextInt();

            if(inputValue == 1){

                //withDraw(ActualCurrentBalance);

            }else if (inputValue == 2){

               // Deposit(ActualCurrentBalance);

            }


        }catch (Exception e){

            System.out.println("invalid entry");

        }

    }

    public void withDraw(int balance, int transactionAmount){
        System.out.println("welcome withdraw section of your account\n" +
                "your current balance is " + balance +"\n" +
                "How much would you like to Withdraw today");



         currentBalance = balance - transactionAmount;

    }

    public void Deposit(int balance , int transactionAmount){
        System.out.println("welcome Deposit section of your account\n" +
                "your current balance is " + balance +"\n" +
                "How much would you like to deposit today");





        currentBalance = balance + transactionAmount;
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


    //testing purposes
    public int getNewBalance(){

        return currentBalance;
    }



}
