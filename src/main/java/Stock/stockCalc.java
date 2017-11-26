package Stock;

import User.User;
import manageTransactions.Bank;
import manageTransactions.Portfolio;
import Utilities.readingWrite;

public class stockCalc {
    public void investmentCalc(Portfolio portfolio){
        int aggression = portfolio.getAggression();
        if (aggression == 1){
            //aggression is conservative, calculate investment based on conservative stocks.
        }
        else if (aggression == 2){
            //aggression is moderate, calculate investment based on moderate stocks.
        }
        else if (aggression == 3){
            //aggression is aggressive, calculate investment based on aggressive stocks.
        }
    }
}
