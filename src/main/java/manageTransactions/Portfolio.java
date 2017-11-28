package manageTransactions;

public class Portfolio implements moneyMovement{

    protected int aggression; // 1 for Conservative, 2 for Moderate, 3 for Aggressive
    protected double preInvested;
    protected double overallGrowth;
    protected boolean intervalSwitch;
    private double funds;

    public Portfolio() {
        aggression = 1;
        funds = 0.0;
    }

    public Portfolio(int aggression, int preInvested, double overallGrowth, boolean intervalSwitch, double funds){
        setAggression(aggression);
        setPreInvested(preInvested);
        setOverallGrowth(overallGrowth);
        setIntervalSwitch(intervalSwitch);
        setFunds(funds);
    }

    public double getFunds() {
        return this.funds;
    }
    public boolean getIntervalSwitch(){return this.intervalSwitch;}
    public double getOverallGrowth(){return this.overallGrowth;}
    public double getPreInvested(){return this.preInvested;}
    public int getAggression(){return this.aggression;}

    public void setAggression(int aggression){
        this.aggression = aggression;
    }
    public void setPreInvested(double preInvested){
        this.preInvested = preInvested;
    }
    public void setOverallGrowth(double overallGrowth){
        this.overallGrowth = overallGrowth;
    }
    public void setIntervalSwitch(boolean intervalSwitch){
        this.intervalSwitch = intervalSwitch;
    }
    public void setFunds(double funds) {
        this.funds = funds;
    }

    public void deposit(double amount) {
        setFunds(amount+getFunds());
        setPreInvested(amount+getPreInvested());
    }

    public boolean withDraw(double amount) {
        if ((getFunds() - amount) >= 0) {
            setFunds((getFunds() - amount));
            return true;
        }
        else {
            System.out.println("Insufficient funds!\n" + "You cannot withdraw " + amount);
            return false;
        }
    }
}