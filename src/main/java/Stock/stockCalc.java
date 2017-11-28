package Stock;

import User.User;
import manageTransactions.Bank;
import manageTransactions.Portfolio;
import Utilities.readingWrite;
import yahoofinance.*;
import java.io.IOException;
import java.math.BigDecimal;

public class stockCalc {
    double originalAmount = 0.0;
    double newAmount = 0.0;
    BigDecimal investment;

    public void investmentCalc(Portfolio portfolio) throws IOException {
        int aggression = portfolio.getAggression();
        if (aggression == 1){
            Stock Busch = YahooFinance.get("BUD");
            Stock BankOfAmerica = YahooFinance.get("BAC");
            Stock JohnsonJohnson = YahooFinance.get("JNJ");

            double poBusch = Busch.getQuote(true).getPrice().doubleValue();
            double poBankOfAmerica = BankOfAmerica.getQuote(true).getPrice().doubleValue();
            double poJohnsonJohnson = JohnsonJohnson.getQuote(true).getPrice().doubleValue();
        }
        else if (aggression == 2){
            Stock CVS = YahooFinance.get("CVS");
            Stock Walgreens = YahooFinance.get("WBA");
            Stock Walmart = YahooFinance.get("WMT");

            double poCVS = CVS.getQuote(true).getPrice().doubleValue();
            double poWalgreens = Walgreens.getQuote(true).getPrice().doubleValue();
            double poWalmart = Walmart.getQuote(true).getPrice().doubleValue();
        }
        else if (aggression == 3){
            Stock TEVA = YahooFinance.get("TEVA");
            Stock ScientificGames = YahooFinance.get("SGMS");
            Stock SuperValueGrocery = YahooFinance.get("SVU");

            double poTEVA = TEVA.getQuote(true).getPrice().doubleValue();
            double poScientificGames = ScientificGames.getQuote(true).getPrice().doubleValue();
            double poSuperValueGames = SuperValueGrocery.getQuote(true).getPrice().doubleValue();
        }
    }
    public double calChange(double originalAmount, double newAmount) {
        if (originalAmount == 0) { return 0; }
        else { return ((newAmount - originalAmount) / originalAmount); }
    }
}
