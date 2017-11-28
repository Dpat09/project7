package Stock;

import manageTransactions.Portfolio;
import yahoofinance.*;
import java.io.IOException;
import Stock.stockStore;

public class stockCalc {
    private double originalAmount = 0.0;
    private double newAmount = 0.0;
    private double portfolioWorth = 0.0;

    public void investmentCalc(Portfolio portfolio, stockStore stockList) throws IOException {
        int aggression = portfolio.getAggression();
        double funds = portfolio.getFunds();
        double fundsDistributed = funds / 3;
        double changeOfStock1;
        double  changeOfStock2;
        double changeOfStock3;
        if (aggression == 1){
            double poBusch = stockPuller.stockPull("BUD");
            double poBankOfAmerica = stockPuller.stockPull("BAC");
            double poJohnsonJohnson = stockPuller.stockPull("JNJ");

            changeOfStock1 = poBusch - stockList.getInitPrice("BUD") / stockList.getInitPrice("BUD");
            changeOfStock2 = poBankOfAmerica - stockList.getInitPrice("BAC") / stockList.getInitPrice("BAC");
            changeOfStock3 = poJohnsonJohnson - stockList.getInitPrice("JNJ") / stockList.getInitPrice("JNJ");
        }
        else if (aggression == 2){
            double poCVS = stockPuller.stockPull("CVS");
            double poWalgreens = stockPuller.stockPull("WBA");
            double poWalmart = stockPuller.stockPull("WMT");

            changeOfStock1 = poCVS - stockList.getInitPrice("CVS") / stockList.getInitPrice("CVS");
            changeOfStock2 = poWalgreens - stockList.getInitPrice("WBA") / stockList.getInitPrice("WBA");
            changeOfStock3 = poWalmart - stockList.getInitPrice("WMT") / stockList.getInitPrice("WMT");
        }
        else if (aggression == 3){
            double poTEVA = stockPuller.stockPull("TEVA");
            double poScientificGames = stockPuller.stockPull("SGMS");
            double poSuperValueGames = stockPuller.stockPull("SVU");

            changeOfStock1 = poTEVA - stockList.getInitPrice("TEVA") / stockList.getInitPrice("TEVA");
            changeOfStock2 = poScientificGames - stockList.getInitPrice("SGMS") / stockList.getInitPrice("SGMS");
            changeOfStock3 = poSuperValueGames - stockList.getInitPrice("SVU") / stockList.getInitPrice("SVU");
        }
    }
    public double calChange(double originalAmount, double newAmount) {
        if (originalAmount == 0) { return 0; }
        else { return ((newAmount - originalAmount) / originalAmount); }
    }

    public static void setStocks(Portfolio portfolio, stockStore stocksList){
        try {
            switch (portfolio.getAggression()) {
                case 1:
                    stocksList.setInitPrice("BUD", stockPuller.stockPull("BUD"));
                    stocksList.setInitPrice("BAC", stockPuller.stockPull("BAC"));
                    stocksList.setInitPrice("JNJ", stockPuller.stockPull("JNJ"));
                    break;
                case 2:
                    stocksList.setInitPrice("CVS", stockPuller.stockPull("CVS"));
                    stocksList.setInitPrice("WBA", stockPuller.stockPull("WBA"));
                    stocksList.setInitPrice("WMT", stockPuller.stockPull("WMT"));
                    break;
                case 3:
                    stocksList.setInitPrice("TEVA", stockPuller.stockPull("TEVA"));
                    stocksList.setInitPrice("SGMS", stockPuller.stockPull("SGMS"));
                    stocksList.setInitPrice("SVU", stockPuller.stockPull("SVU"));
                    break;
            }
        }catch(Exception e){
            System.out.println("Something broke at setStocks under Stock.stockCalc");
        }
    }
}
