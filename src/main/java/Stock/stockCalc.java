package Stock;

import manageTransactions.Portfolio;

public class stockCalc {
    public static void investmentCalc(Portfolio portfolio, stockStore stockList){

        switch(portfolio.getAggression()){
            case 1:
                changeBuilder(new String[]{"BUD", "BAC", "JNJ"},stockList,portfolio);
                break;

            case 2:
                changeBuilder(new String[]{"CVS", "WBA", "WMT"},stockList,portfolio);
                break;

            case 3:
                changeBuilder(new String[]{"TEVA", "SGMS", "SVU"},stockList,portfolio);
                break;
        }
    }

    protected static double changeInPercent(stockStore stockList, double newStock, String oldStock){
        return (newStock - stockList.getInitPrice(oldStock)) / stockList.getInitPrice(oldStock);
    }

    public static void setStocks(Portfolio portfolio, stockStore stocksList){
        switch (portfolio.getAggression()) {
            case 1:
                setStocksHelper(new String[]{"BUD", "BAC", "JNJ"},stocksList);
                break;
            case 2:
                setStocksHelper(new String[]{"CVS", "WBA", "WMT"},stocksList);
                break;
            case 3:
                setStocksHelper(new String[]{"TEVA", "SGMS", "SVU"},stocksList);
                break;
        }
    }

    protected static void changeBuilder(String[] stockNames, stockStore stockList, Portfolio portfolio){
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

    protected static void setStocksHelper(String[] stockNames, stockStore stocksList){
        for (String name:stockNames)
            stocksList.setInitPrice(name,stockPuller.stockPull(name));
    }
}
