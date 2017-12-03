package manageTransactions;

import org.junit.Test;

import static org.junit.Assert.*;

public class PortfolioTest {

    private Portfolio testObj = new Portfolio(1,100,.5,false,110);

    @Test
    public void canaryTest() throws Exception{
        assert(true);
    }

    @Test
    public void objCreate() throws Exception{
        Portfolio obj = new Portfolio();
    }

    @Test
    public void getFunds() throws Exception {
        assertEquals(110,testObj.getFunds(),0);
    }

    @Test
    public void getIntervalSwitch() throws Exception {
        assertEquals(false,testObj.getIntervalSwitch());
    }

    @Test
    public void getPreInvested() throws Exception {
        assertEquals(100,testObj.getPreInvested(),0);
    }

    @Test
    public void getOverallGrowth() throws Exception {
        assertEquals(0.5, testObj.getOverallGrowth(),0);
    }

    @Test
    public void getAggression() throws Exception {
        assertEquals(1,testObj.getAggression());
    }

    @Test
    public void setAggression() throws Exception {
        testObj.setAggression(2);
        assertEquals(2,testObj.getAggression());
    }

    @Test
    public void setOverallGrowth() throws Exception {
        testObj.setOverallGrowth(2.6);
        assertEquals(2.6, testObj.getOverallGrowth(),0);
    }

    @Test
    public void setPreInvested() throws Exception {
        testObj.setPreInvested(200);
        assertEquals(200,testObj.getPreInvested(),0);
    }

    @Test
    public void setIntervalSwitch() throws Exception {
        testObj.setIntervalSwitch(true);
        assertEquals(true, testObj.getIntervalSwitch());
    }

    @Test
    public void setFunds() throws Exception {
        testObj.setFunds(200);
        assertEquals(200, testObj.getFunds(),0);
    }

    @Test
    public void deposit() throws Exception {
        double amount = testObj.getFunds()+10;
        testObj.deposit(10);
        assertEquals(amount,testObj.getFunds(),0);
    }

    @Test
    public void withDrawTrue() throws Exception {
        double amount = testObj.getFunds();
        assertEquals(true,testObj.withDraw(amount));
    }

    @Test
    public void withDrawFalse() throws Exception {
        double amount = testObj.getFunds()+1;
        assertEquals(false,testObj.withDraw(amount));
    }

}