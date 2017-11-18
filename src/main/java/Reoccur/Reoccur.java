package Reoccur;

import Utilities.*;
import manageTransactions.Portfolio;

import java.util.ArrayList;
import java.util.Scanner;

public class Reoccur extends Portfolio {
    //private ArrayList<Integer> optionList = queryHandler.optionsBuilder(3);
    Reoccur(){

//        optionList.add('D'); //Daily
//        optionList.add('W'); //Weekly
//        optionList.add('M'); //Monthly
    }

    void setReoccurring(){
        String question = "Set investment interval \n\n1.) Daily \n2.) Weekly \n3.) Monthly \n4.) Cancel";
        int input = queryHandler.optionsQuery(question,4);
        if (input!=4){
            investmentInterval = input;
            setSwitch();
        }
    }

//    public void setReoccuringNEW(){
//        System.out.print("Pick an investment interval:\n 1. Daily \n 2. Weekly \n 3. Monthly\n Enter Choice: ");
//        int choice = 0;
//        scannerInputs.scanIntegerInput(choice);
//        //scannerInputs.scanStringInput(investmentInterval);
//        while(true){
//
//        }
//    }

    void investAmount(){
        System.out.println("Set investment amount (Amount > $1 only): ");
//        Scanner scanner = new Scanner(System.in);
//        investmentAmount = scanner.nextInt();
        investmentAmount = scannerInputs.scanDoubleInput();
        if (investmentAmount < 1){
            investAmount();
        }
    }

    void setSwitch(){
        System.out.println("Would you like to have a reoccurring investment? (Y/N): ");
        Scanner scanner = new Scanner(System.in);
        String yesNo = scanner.nextLine();
        if (!(yesNo.equals("Y") || yesNo.equals("N"))){
            setSwitch();
        }
        else {
            if (yesNo.equals("Y")) {
                intervalSwitch = true; }
            else if (yesNo.equals("N")){
                intervalSwitch = false; }
            else {setSwitch(); }
        }
    }
}
