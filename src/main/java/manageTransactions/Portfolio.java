package manageTransactions;

import java.util.ArrayList;
import java.util.Scanner;

public class Portfolio {
    protected String aggression = ""; //portfolio type (conservative to aggressive)
    protected String investment_interval = "";
    protected double investment_amount = 0.00;
    protected boolean interval_switch = false;
    private double funds = 0.00;

    ArrayList<Character> List = new ArrayList<Character>();
    public Portfolio() {
        List.add('C');
        List.add('M');
        List.add('A');
    }

    public Double getFunds() {
        return this.funds;
    }
    public void setFunds(double funds) {
        this.funds = funds;
    }

    public void setAggression(String aggression){
        System.out.println("Set aggression on portfolio '(C), (M), (A)': ");
        Scanner scanner = new Scanner(System.in);
        aggression = scanner.nextLine();
        char type = aggression.charAt(0);
        for (int i = 0; i < List.size(); i++){
            if (!(List.get(i) == type)){
                setAggression(aggression);
            }
            else {
                aggression = Character.toString(type);
            }
        }
    }
}