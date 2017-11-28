package Stock;

import manageTransactions.Portfolio;
import yahoofinance.*;
import java.io.IOException;

public class stockCalc {
    private double originalAmount = 0.0;
    private double newAmount = 0.0;
    private double portfolioWorth = 0.0;

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

    public static void setStocks(Portfolio portfolio, stockStore stocksList) throws IOException{
        switch(portfolio.getAggression()){
            case 1:
                stocksList.setInitPrice("BUD",stockPuller.stockPull("BUD"));
                stocksList.setInitPrice("BAC",stockPuller.stockPull("BAC"));
                stocksList.setInitPrice("JNJ",stockPuller.stockPull("JNJ"));
                break;
            case 2:
                stocksList.setInitPrice("CVS",stockPuller.stockPull("CVS"));
                stocksList.setInitPrice("WBA",stockPuller.stockPull("WBA"));
                stocksList.setInitPrice("WMT",stockPuller.stockPull("WMT"));
                break;
            case 3:
                stocksList.setInitPrice("TEVA",stockPuller.stockPull("TEVA"));
                stocksList.setInitPrice("SGMS",stockPuller.stockPull("SGMS"));
                stocksList.setInitPrice("SVU",stockPuller.stockPull("SVU"));
                break;
        }
    }
}
