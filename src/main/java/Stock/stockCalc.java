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
            Stock Busch = YahooFinance.get("BUD");
            Stock BankOfAmerica = YahooFinance.get("BAC");
            Stock JohnsonJohnson = YahooFinance.get("JNJ");

            double poBusch = Busch.getQuote(true).getPrice().doubleValue();
            double poBankOfAmerica = BankOfAmerica.getQuote(true).getPrice().doubleValue();
            double poJohnsonJohnson = JohnsonJohnson.getQuote(true).getPrice().doubleValue();

            funds = funds * (.333);
            portfolioWorth = poBusch * (funds) + poBankOfAmerica * (funds) + poJohnsonJohnson * (funds);
            System.out.println("Value of portfolio worth is: " + portfolioWorth);
        }
        else if (aggression == 2){
            Stock CVS = YahooFinance.get("CVS");
            Stock Walgreens = YahooFinance.get("WBA");
            Stock Walmart = YahooFinance.get("WMT");

            double poCVS = CVS.getQuote(true).getPrice().doubleValue();
            double poWalgreens = Walgreens.getQuote(true).getPrice().doubleValue();
            double poWalmart = Walmart.getQuote(true).getPrice().doubleValue();

            funds = funds / .33;
            portfolioWorth = poCVS * (funds) + poWalgreens * (funds) + poWalmart * (funds);
        }
        else if (aggression == 3){
            Stock TEVA = YahooFinance.get("TEVA");
            Stock ScientificGames = YahooFinance.get("SGMS");
            Stock SuperValueGrocery = YahooFinance.get("SVU");

            double poTEVA = TEVA.getQuote(true).getPrice().doubleValue();
            double poScientificGames = ScientificGames.getQuote(true).getPrice().doubleValue();
            double poSuperValueGames = SuperValueGrocery.getQuote(true).getPrice().doubleValue();

            funds = funds / .33;
            portfolioWorth = poTEVA * (funds) + poScientificGames * (funds) + poSuperValueGames * (funds);
        }
    }
    public double calChange(double originalAmount, double newAmount) {
        if (originalAmount == 0) { return 0; }
        else { return ((newAmount - originalAmount) / originalAmount); }
    }
}
