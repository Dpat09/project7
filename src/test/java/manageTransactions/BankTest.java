package manageTransactions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {

    private Bank testBank = new Bank(100, false);

    @Test
    public void canaryTest() throws Exception{
        assert(true);
    }

    @Test
    public void getBalance() throws Exception {
        assertEquals(100, testBank.getBalance(), 0);
    }

    @Test
    public void isOverDraw() throws Exception {
        assertEquals(false, testBank.isOverDraw());
    }

    @Test
    public void setOverDraw() throws Exception {
        testBank.setOverDraw(true);
        assertEquals(true,testBank.isOverDraw());
    }

    @Test
    public void resetOverDraw() throws Exception {
        testBank.setOverDraw(true);
        testBank.resetOverDraw();
        assertEquals(false, testBank.isOverDraw());
    }

    @Test
    public void deposit() throws Exception {
        testBank.deposit(15);
        assertEquals(115,testBank.getBalance(),0);
    }

    @Test
    public void withDraw() throws Exception {
        testBank.withDraw(15);
        assertEquals(85,testBank.getBalance(),0);
    }

}