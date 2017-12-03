package Stock;

import com.sun.javafx.applet.ExperimentalExtensions;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;

public class stockPuller {
    public static double stockPull(String stock){
        try{
            Stock generic = YahooFinance.get(stock);
            return generic.getQuote(true).getPrice().doubleValue();
        }catch (Exception e){
        }
        System.out.println("error in stockPuller");
        return 0;
    }
}