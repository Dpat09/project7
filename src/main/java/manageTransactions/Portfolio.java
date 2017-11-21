package manageTransactions;

import Utilities.queryHandler;
import Utilities.scannerInputs;

public class Portfolio implements moneyMovement{

    protected int aggression; // 1 for Conservative, 2 for Moderate, 3 for Aggressive
    protected int investmentInterval;
    protected double investmentAmount;
    protected boolean intervalSwitch;
    private double funds;

    public Portfolio() {
        aggression = 1;
        funds = 0.0;
    }

    public Portfolio(int aggression, int investmentInterval, double investmentAmount, boolean intervalSwitch, double funds){
        setAggression(aggression);
        setInvestmentInterval(investmentInterval);
        setInvestmentAmount(investmentAmount);
        setIntervalSwitch(intervalSwitch);
        setFunds(funds);
    }

    public double getFunds() {
        return this.funds;
    }
    public boolean getIntervalSwitch(){return this.intervalSwitch;}
    public double getInvestmentAmount(){return this.investmentAmount;}
    public int getInvestmentInterval(){return this.investmentInterval;}
    public int getAggression(){return this.aggression;}

    public void setAggression(int aggression){
        this.aggression = aggression;
    }
    public void setInvestmentInterval(int investmentInterval){
        this.investmentInterval = investmentInterval;
    }
    public void setInvestmentAmount(double investmentAmount){
        this.investmentAmount = investmentAmount;
    }
    public void setIntervalSwitch(boolean intervalSwitch){
        this.intervalSwitch = intervalSwitch;
    }
    public void setFunds(double funds) {
        this.funds = funds;
    }

    public void changeAggression(){
        String question = "Set aggression on portfolio: \n\n1.) Conservative \n2.) Moderate \n3.) Aggressive \n4.) Cancel \n\nEnter Choice:";
        int input = queryHandler.optionsQuery(question,4);
        aggression = input != 4 ? input : aggression;
    }

    public void deposit(double amount) {
        setFunds(amount+getFunds());
    }

    public boolean withDraw(double amount) {
        if ((getFunds() - amount) > 0) {
            setFunds((getFunds() - amount));
            return true;
        }
        else {
            System.out.println("Insufficient funds!\n" + "You cannot withdraw " + amount);
            return false;
        }
    }
}