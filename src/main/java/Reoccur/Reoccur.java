package Reoccur;

import manageTransactions.Portfolio;

import java.util.ArrayList;
import java.util.Scanner;

public class Reoccur extends Portfolio {
    ArrayList<Character> List = new ArrayList<Character>();
    Reoccur(){
        List.add('D'); //Daily
        List.add('W'); //Weekly
        List.add('M'); //Monthly
    }

    void setReoccurring(){
        System.out.println("Set investment interval (D) (W) (M): ");
        Scanner scanner = new Scanner(System.in);
        investment_interval = scanner.nextLine();
        char type = investment_interval.charAt(0);
        for (int i = 0; i < List.size(); i++){
            if (!(List.get(i) == type)){
                setReoccurring();
            }
            else {
                investment_interval = Character.toString(type);
                setSwitch();
            }
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
            else {interval_switch = false; }
        }
    }
}
