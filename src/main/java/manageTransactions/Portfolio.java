package manageTransactions;

import java.util.ArrayList;
import java.util.Scanner;

public class Portfolio implements moneyMovement{
    protected String aggression = ""; //portfolio type (conservative to aggressive)
    protected String investment_interval = "";
    protected double investment_amount = 0.00;
    protected boolean interval_switch = false;
    private double funds = 0.00;

    ArrayList<Character> aggressionList = new ArrayList<Character>();
    public Portfolio() {
        aggressionList.add('C');
        aggressionList.add('M');
        aggressionList.add('A');
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

        for (int i = 0; i < aggressionList.size(); i++){
            if (!(aggressionList.get(i) == type)){
                setAggression(aggression);
            }
            else {
                aggression = Character.toString(type);
            }
        }
    }

    public void deposit(double amount) {
        setFunds(amount+getFunds());
    }

    public void withDraw(double amount) {
        setFunds((getFunds()-amount)>0?getFunds()-amount:getFunds());
    }
}