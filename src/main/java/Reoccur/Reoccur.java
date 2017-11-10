package Reoccur;

import Utilities.scannerInputs;
import manageTransactions.Portfolio;

import java.util.ArrayList;
import java.util.Scanner;

public class Reoccur extends Portfolio {
    ArrayList<Character> optionList = new ArrayList<Character>();
    Reoccur(){
        optionList.add('D'); //Daily
        optionList.add('W'); //Weekly
        optionList.add('M'); //Monthly
    }

    void setReoccurring(){
        System.out.println("Set investment interval (D) (W) (M): ");
//        Scanner scanner = new Scanner(System.in);
//        investment_interval = scanner.nextLine();
        scannerInputs.scanStringInput(investment_interval);
        char type = investment_interval.charAt(0);
        for (int i = 0; i < optionList.size(); i++){
            if (!(optionList.get(i) == type)){
                setReoccurring();
            }
            else {
                investment_interval = Character.toString(type);
                setSwitch();
            }
        }
    }

    void investAmount(){
        System.out.println("Set investment amount (Amount > $1 only): ");
//        Scanner scanner = new Scanner(System.in);
//        investment_amount = scanner.nextInt();
        scannerInputs.scanDoubleInput(investment_amount);
        if (investment_amount < 1){
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
            if (yesNo.equals("Y")) {interval_switch = true; }
            else if (yesNo.equals("N")){interval_switch = false; }
            else {setSwitch(); }
        }
    }
}
