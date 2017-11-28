package Stock;

import manageTransactions.Portfolio;
import yahoofinance.*;
import java.io.IOException;
import Stock.stockStore;

public class stockCalc {
    public void investmentCalc(Portfolio portfolio, stockStore stockList) throws IOException {
        int aggression = portfolio.getAggression();
        double funds = portfolio.getFunds();
        double fundsDistributed = funds / 3;
        Double changeOfStock1;
        Double  changeOfStock2;
        Double changeOfStock3;
        if (aggression == 1){

            changeOfStock1 = changeInPercent(stockList,stockPuller.stockPull("BUD"),"BUD");
            changeOfStock2 = changeInPercent(stockList,stockPuller.stockPull("BAC"),"BAC");
            changeOfStock3 = changeInPercent(stockList,stockPuller.stockPull("JNJ"),"JNJ");

            System.out.printf("Percentage growth of Busch: %.3f\n", changeOfStock1);
            System.out.printf("Percentage growth of Bank Of America: %.3f\n", changeOfStock2);
            System.out.printf("Percentage growth of Johnson and Johnson: %.3f\n", changeOfStock3);
        }
        else if (aggression == 2){
            double poCVS = stockPuller.stockPull("CVS");
            double poWalgreens = stockPuller.stockPull("WBA");
            double poWalmart = stockPuller.stockPull("WMT");

            changeOfStock1 = poCVS - stockList.getInitPrice("CVS") / stockList.getInitPrice("CVS");
            changeOfStock2 = poWalgreens - stockList.getInitPrice("WBA") / stockList.getInitPrice("WBA");
            changeOfStock3 = poWalmart - stockList.getInitPrice("WMT") / stockList.getInitPrice("WMT");



            System.out.println("Percentage growth of CVS: %" + changeOfStock1/100);
            System.out.println("Percentage growth of Walgreens: %" + changeOfStock2/100);
            System.out.println("Percentage growth of Walmart: %" + changeOfStock3/100);
        }
        else if (aggression == 3){
            double poTEVA = stockPuller.stockPull("TEVA");
            double poScientificGames = stockPuller.stockPull("SGMS");
            double poSuperValueGames = stockPuller.stockPull("SVU");

            changeOfStock1 = poTEVA - stockList.getInitPrice("TEVA") / stockList.getInitPrice("TEVA");
            changeOfStock2 = poScientificGames - stockList.getInitPrice("SGMS") / stockList.getInitPrice("SGMS");
            changeOfStock3 = poSuperValueGames - stockList.getInitPrice("SVU") / stockList.getInitPrice("SVU");

            System.out.println("Percentage growth of TEVA: %" + changeOfStock1);
            System.out.println("Percentage growth of Scientific Games: %" + changeOfStock2);
            System.out.println("Percentage growth of Super Value Games: %" + changeOfStock3);
        }
    }

    private double changeInPercent(stockStore stockList, double newStock, String oldStock){
        return (newStock - stockList.getInitPrice(oldStock)) / stockList.getInitPrice(oldStock)*100;
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
