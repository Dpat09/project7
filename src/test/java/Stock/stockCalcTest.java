package Stock;

import manageTransactions.Portfolio;
import org.junit.Test;

import static org.junit.Assert.*;

public class stockCalcTest extends stockCalc {

    private Portfolio portObj = new Portfolio(1,100,.5,false,110);
    private stockStore stockObj = new stockStore();

    private void setupTest(int aggression){
        portObj.setAggression(aggression);
        stockCalc.setStocks(portObj,stockObj);
        stockCalc.investmentCalc(portObj,stockObj);
    }

    @Test
    public void investmentCalc1() throws Exception {
    }

    @Test
    public void changeInPercent() throws Exception {
    }

    @Test
    public void setStocks1() throws Exception {
    }

    @Test
    public void changeBuilder() throws Exception {
    }
}