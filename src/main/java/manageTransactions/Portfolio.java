package manageTransactions;

import Utilities.query;
import Utilities.scannerInputs;

import java.util.ArrayList;

public class Portfolio implements moneyMovement{
    protected String aggression = ""; //portfolio type (conservative to aggressive)
    protected String investment_interval = "";
    protected double investment_amount = 0.00;
    protected boolean interval_switch = false;
    private double funds = 0.00;

    private ArrayList<Character> aggressionList = new ArrayList<Character>();
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

    public void setAggression(){
        String question = "Set aggression on portfolio: \n\n1.) Conservative \n2.) Moderate \n3.) Aggressive \n\nEnter Choice:";
        //int input =

        //System.out.println(input);
    }

    public void deposit(double amount) {
        setFunds(amount+getFunds());
    }

    public void withDraw(double amount) {
        setFunds((getFunds()-amount)>0?getFunds()-amount:getFunds());
    }
}