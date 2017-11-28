package Stock;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;

public class stockPuller {
    public static double stockPull(String stock) throws IOException {
        Stock generic = YahooFinance.get(stock);
        return generic.getQuote(true).getPrice().doubleValue();
    }
}
