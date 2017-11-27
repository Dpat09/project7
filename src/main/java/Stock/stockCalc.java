package Stock;

import User.User;
import manageTransactions.Bank;
import manageTransactions.Portfolio;
import Utilities.readingWrite;
import yahoofinance.*;
import java.io.IOException;
import java.math.BigDecimal;

public class stockCalc {
    public void investmentCalc(Portfolio portfolio) throws IOException {
        int aggression = portfolio.getAggression();
        if (aggression == 1){
            Stock Busch = YahooFinance.get("BUD");
            Stock BankOfAmerica = YahooFinance.get("BAC");
            Stock JohnsonJohnson = YahooFinance.get("JNJ");

            BigDecimal poBusch = Busch.getQuote(true).getPrice();
            BigDecimal poBankOfAmerica = BankOfAmerica.getQuote(true).getPrice();
            BigDecimal poJohnsonJohnson = JohnsonJohnson.getQuote(true).getPrice();

        }
        else if (aggression == 2){
            Stock CVS = YahooFinance.get("CVS");
            Stock Walgreens = YahooFinance.get("WBA");
            Stock Walmart = YahooFinance.get("WMT");

            BigDecimal poCVS = CVS.getQuote(true).getPrice();
            BigDecimal poWalgreens = Walgreens.getQuote(true).getPrice();
            BigDecimal poWalmart = Walmart.getQuote(true).getPrice();
        }
        else if (aggression == 3){
            Stock TEVA = YahooFinance.get("TEVA");
            Stock ScientificGames = YahooFinance.get("SGMS");
            Stock SuperValueGrocery = YahooFinance.get("SVU");

            BigDecimal poTEVA = TEVA.getQuote(true).getPrice();
            BigDecimal poScientificGames = ScientificGames.getQuote(true).getPrice();
            BigDecimal poSuperValueGames = SuperValueGrocery.getQuote(true).getPrice();
        }
    }
}
