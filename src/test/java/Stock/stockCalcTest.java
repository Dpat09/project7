package Stock;

import manageTransactions.Portfolio;
import org.junit.Test;

import static org.junit.Assert.*;

public class stockCalcTest extends stockCalc {

    private Portfolio portObj = new Portfolio(1,100,.5,false,110);
    private stockStore stockObj = new stockStore();

    private void setupTest(int aggression, boolean calc){
        portObj.setAggression(aggression);
        stockCalc.setStocks(portObj,stockObj);
        if (calc)
            stockCalc.investmentCalc(portObj,stockObj);
    }

    @Test
    public void creatObj(){
        stockCalc test = new stockCalc();
    }

    @Test
    public void investmentCalc1() throws Exception {
        setupTest(1,true);
        assert(true);
    }

    @Test
    public void investmentCalc2() throws Exception {
        setupTest(2,true);
        assert(true);
    }

    @Test
    public void investmentCalc3() throws Exception {
        setupTest(3,true);
        assert(true);
    }

    @Test
    public void changeInPercent() throws Exception {
        stockObj.setInitPrice("BUD",10);
        double newStock = 10;
        assertEquals(0,changeInPercent(stockObj,newStock,"BUD"),0);
    }

    @Test
    public void setStocks1() throws Exception {
        setupTest(1,false);
        assert(true);
    }

    @Test
    public void setStocks2() throws Exception {
        setupTest(2,false);
        assert(true);
    }

    @Test
    public void setStocks3() throws Exception {
        setupTest(3,false);
        assert(true);
    }

    @Test
    public void setStocksFalse() throws Exception {
        setupTest(4,false);
        assert(true);
    }

    @Test
    public void changeBuilder() throws Exception {
        setupTest(1,false);
        changeBuilder(new String[]{"BUD", "BAC", "JNJ"},stockObj,portObj);
        assert(true);
    }
}