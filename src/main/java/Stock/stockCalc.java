package Stock;

import manageTransactions.Portfolio;
import yahoofinance.*;
import java.io.IOException;

public class stockCalc {
    double originalAmount = 0.0;
    double newAmount = 0.0;
    double portfolioWorth = 0.0;

    public void investmentCalc(Portfolio portfolio) throws IOException {
        int aggression = portfolio.getAggression();
        double funds = portfolio.getFunds();
        if (aggression == 1){
            double poBusch = stockPuller.stockPull("BUD");
            double poBankOfAmerica = stockPuller.stockPull("BAC");
            double poJohnsonJohnson = stockPuller.stockPull("JNJ");

            funds = funds / 3;
            System.out.println("funds is: " + funds);
            portfolioWorth = poBusch * (funds) + poBankOfAmerica * (funds) + poJohnsonJohnson * (funds);
            System.out.println("Value of portfolio worth is: " + portfolioWorth);
        }
        else if (aggression == 2){
            double poCVS = stockPuller.stockPull("CVS");
            double poWalgreens = stockPuller.stockPull("WBA");
            double poWalmart = stockPuller.stockPull("WMT");

            funds = funds / .33;
            portfolioWorth = poCVS * (funds) + poWalgreens * (funds) + poWalmart * (funds);
        }
        else if (aggression == 3){
            double poTEVA = stockPuller.stockPull("TEVA");
            double poScientificGames = stockPuller.stockPull("SGMS");
            double poSuperValueGames = stockPuller.stockPull("SVU");

            funds = funds / .33;
            portfolioWorth = poTEVA * (funds) + poScientificGames * (funds) + poSuperValueGames * (funds);
        }
    }
    public double calChange(double originalAmount, double newAmount) {
        if (originalAmount == 0) { return 0; }
        else { return ((newAmount - originalAmount) / originalAmount); }
    }
}
