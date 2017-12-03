package Stock;

import manageTransactions.Portfolio;
import yahoofinance.*;
import java.io.IOException;
import Stock.stockStore;

public class stockCalc {
    public static void investmentCalc(Portfolio portfolio, stockStore stockList){
        int aggression = portfolio.getAggression();
        double funds = portfolio.getFunds();
        Double changeOfStock1;
        Double changeOfStock2;
        Double changeOfStock3;
        Double overallGrowth;

        if (aggression == 1){
            changeOfStock1 = changeInPercent(stockList,stockPuller.stockPull("BUD"),"BUD");
            changeOfStock2 = changeInPercent(stockList,stockPuller.stockPull("BAC"),"BAC");
            changeOfStock3 = changeInPercent(stockList,stockPuller.stockPull("JNJ"),"JNJ");

            overallGrowth = (changeOfStock1 + changeOfStock2 + changeOfStock3) / 3;

            portfolio.setOverallGrowth(overallGrowth);
            stockList.setChangeOfStock(changeOfStock1);
            stockList.setChangeOfStock(changeOfStock2);
            stockList.setChangeOfStock(changeOfStock3);

            System.out.println("Overall Growth: " + overallGrowth);
            System.out.println("Funds: " + ((overallGrowth + 1) * funds) );

            System.out.printf("Percentage growth of Busch: %.3f\n", changeOfStock1);
            System.out.printf("Percentage growth of Bank Of America: %.3f\n", changeOfStock2);
            System.out.printf("Percentage growth of Johnson and Johnson: %.3f\n", changeOfStock3);

        }
        else if (aggression == 2){
            changeOfStock1 = changeInPercent(stockList,stockPuller.stockPull("CVS"),"CVS");
            changeOfStock2 = changeInPercent(stockList,stockPuller.stockPull("WBA"),"WBA");
            changeOfStock3 = changeInPercent(stockList,stockPuller.stockPull("WMT"),"WMT");

            overallGrowth = (changeOfStock1 + changeOfStock2 + changeOfStock3) / 3;

            portfolio.setOverallGrowth(overallGrowth);
            stockList.setChangeOfStock(changeOfStock1);
            stockList.setChangeOfStock(changeOfStock2);
            stockList.setChangeOfStock(changeOfStock3);

            System.out.println("Overall Growth: " + overallGrowth);
            System.out.println("Funds: " + ((overallGrowth + 1) * funds) );

            System.out.printf("Percentage growth of CVS: %.3f\n", changeOfStock1);
            System.out.printf("Percentage growth of Walgreens: %.3f\n", changeOfStock2);
            System.out.printf("Percentage growth of Walmart: %.3f\n", changeOfStock3);
        }
        else if (aggression == 3){
            changeOfStock1 = changeInPercent(stockList,stockPuller.stockPull("TEVA"),"TEVA");
            changeOfStock2 = changeInPercent(stockList,stockPuller.stockPull("SGMS"),"SGMS");
            changeOfStock3 = changeInPercent(stockList,stockPuller.stockPull("SVU"),"SVU");

            overallGrowth = (changeOfStock1 + changeOfStock2 + changeOfStock3) / 3;

            portfolio.setOverallGrowth(overallGrowth);
            stockList.setChangeOfStock(changeOfStock1);
            stockList.setChangeOfStock(changeOfStock2);
            stockList.setChangeOfStock(changeOfStock3);

            System.out.println("Overall Growth: " + overallGrowth);
            System.out.println("Funds: " + ((overallGrowth + 1) * funds) );

            System.out.printf("Percentage growth of TEVA: %.3f\n", changeOfStock1);
            System.out.printf("Percentage growth of Scientific Games: %.3f\n", changeOfStock2);
            System.out.printf("Percentage growth of Super Value Games: %.3f\n", changeOfStock3);
        }
    }

    private static double changeInPercent(stockStore stockList, double newStock, String oldStock){
        return (newStock - stockList.getInitPrice(oldStock)) / stockList.getInitPrice(oldStock);
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
