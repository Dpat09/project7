package Stock;

import manageTransactions.Portfolio;

public class stockCalc {
    public static void investmentCalc(Portfolio portfolio, stockStore stockList){
        String[] stockNames = null;

        switch(portfolio.getAggression()){
            case 1:
                stockNames = new String[]{"BUD", "BAC", "JNJ"};
                changeBuilder(stockNames,stockList,portfolio);
                break;

            case 2:
                stockNames = new String[]{"CVS", "WBA", "WMT"};
                changeBuilder(stockNames,stockList,portfolio);
                break;

            case 3:
                stockNames = new String[]{"TEVA", "SGMS", "SVU"};
                changeBuilder(stockNames,stockList,portfolio);
               break;
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

    private static void changeBuilder(String[] stockNames, stockStore stockList, Portfolio portfolio){
        double temp;
        double sum = 0;
        for (String i :stockNames){
            temp = changeInPercent(stockList,stockPuller.stockPull(i),i);
            stockList.setChangeOfStock(temp);
            sum+=temp;
        }
        portfolio.setOverallGrowth(sum/3);
        portfolio.setFunds((portfolio.getOverallGrowth() + 1) * portfolio.getFunds());
    }
}
