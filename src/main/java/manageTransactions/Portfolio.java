package manageTransactions;

import Utilities.scannerInputs;

import java.util.ArrayList;

public class Portfolio implements moneyMovement{
    protected String aggression = ""; //portfolio type (conservative to aggressive)
    protected String investment_interval = "";
    protected double investment_amount = 0.00;
    protected boolean interval_switch = false;
    private double funds = 0.00;

    ArrayList<Character> aggressionList = new ArrayList<Character>();
    public Portfolio() {
        aggressionList.add('C');    //Conservative
        aggressionList.add('M');    //Moderate
        aggressionList.add('A');    //Aggressive
    }

    public Double getFunds() {
        return this.funds;
    }
    public void setFunds(double funds) {
        this.funds = funds;
    }

    public void setAggression(String aggression){
        System.out.print("Set aggression on portfolio (C)onservative \n(M)oderate \n(A)ggresive \nEnter Choice:");

        scannerInputs.scanStringInput(aggression);
        char type = Character.toUpperCase(aggression.charAt(0));
        boolean isFound = false;

        for (int i = 0; i < aggressionList.size(); i++){
            if (aggressionList.get(i) != type){
                isFound = false;
            }
            else {
                isFound = true;
                break;
            }
        }
        aggression = isFound ? Character.toString(type):aggression;
        if (!isFound)
            setAggression(aggression);
    }

    public void deposit(double amount) {
        setFunds(amount+getFunds());
    }

    public void withDraw(double amount) {
        setFunds((getFunds()-amount)>0?getFunds()-amount:getFunds());
    }
}