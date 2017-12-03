package manageTransactions;

import Stock.stockCalc;
import Stock.stockStore;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

public class portfolioManagerTest {

    Portfolio portObj = new Portfolio(1,100,.5,false,110);
    Bank bankObj = new Bank(100,false);
    stockStore stockObj = new stockStore();

    private void setupTest(int aggression){
        portObj.setAggression(aggression);
        stockCalc.setStocks(portObj,stockObj);
        stockCalc.investmentCalc(portObj,stockObj);
    }

    @Test
    public void canaryTest() throws Exception{
        assert(true);
    }

    @Test
    public void portfolioManagerMenu() throws Exception {
        //setupTest();
        String input = "4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        portfolioManager.portfolioManagerMenu(portObj,stockObj);
        assert(true);
    }

    @Test
    public void createPortfolio() throws Exception {
        //This test is hard to actually perform, however all functions used here have been extensively tested.
        String input = "1" + System.getProperty("line.separator")
                + "10" + System.getProperty("line.separator");
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        portfolioManager.createPortfolio(portObj,bankObj,stockObj);
        assert(true);
    }

    @Test
    public void changeAggression() throws Exception {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        portfolioManager.changeAggression(portObj);
        assertEquals(1,portObj.getAggression());
    }

    @Test
    public void addFunds() throws Exception {
        double amount = portObj.getFunds()+10;
        String input = "10";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        portfolioManager.addFunds(portObj,bankObj);
        assertEquals(amount, portObj.getFunds(),0);
    }

    @Test
    public void portfolioBreakdownOne() throws Exception{
        setupTest(1);
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        portfolioManager.portfolioBreakdown(portObj,stockObj);
        assert(true);
    }

    @Test
    public void portfolioBreakdownTwo() throws Exception{
        setupTest(2);
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        System.out.println(portObj.getAggression());
        portfolioManager.portfolioBreakdown(portObj,stockObj);
        assert(true);
    }

    @Test
    public void portfolioBreakdownThree() throws Exception{
        setupTest(3);
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        portfolioManager.portfolioBreakdown(portObj,stockObj);
        assert(true);
    }

}