package manageTransactions;

import java.util.Scanner;

public class Portfolio {
    protected String aggression = "";
    protected String investment_interval = "";
    protected double investment_amount = 0.00;
    protected boolean interval_switch = false;
    private double funds = 0.00;

    public Double getFunds() {
        return this.funds;
    }
    public void setFunds(double funds) {
        this.funds = funds;
    }

    public void setAggression(String aggression){
        System.out.println("Set aggression on portfolio: ");
        System.out.println("Conservative (C) .. Moderate (M) .. Aggressive (A)");
        //Scanner input, what ever is inputted, set aggression equal to it, assuming its 'C, M, A'

    }
}