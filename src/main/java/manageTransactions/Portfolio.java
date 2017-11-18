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

    private ArrayList<Integer> aggressionList = new ArrayList<Integer>();
    public Portfolio() {
        aggressionList.add(1);    //Conservative
        aggressionList.add(2);    //Moderate
        aggressionList.add(3);    //Aggressive
    }

    public double getFunds() {
        return this.funds;
    }
    public boolean getIntervalSwitch(){return this.interval_switch;}
    public double getInvestmentAmount(){return this.investment_amount;}
    public String getInvestmentInterval(){return this.investment_interval;}
    public String getAggression(){return this.aggression;}
    public void setFunds(double funds) {
        this.funds = funds;
    }

    public void setAggression(){
        String question = "Set aggression on portfolio: \n\n1.) Conservative \n2.) Moderate \n3.) Aggressive \n\nEnter Choice:";
        //int input = query.optionsQuery(question,aggressionList);
        //System.out.println(scannerInputs.scanStringInput()+scannerInputs.scanStringInput());
        String name = scannerInputs.scanStringInput();
        String name1 = scannerInputs.scanStringInput();
        System.out.println(name+name1);
    }

    public void deposit(double amount) {
        setFunds(amount+getFunds());
    }

    public void withDraw(double amount) {
        setFunds((getFunds()-amount)>0?getFunds()-amount:getFunds());
    }
}