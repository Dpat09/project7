package manageTransactions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {

    @Test
    public void getBalance() throws Exception {
        Bank testBank = new Bank(100, false);
        assertEquals(100, testBank.getBalance(), 0);
    }

//    @Test
//    public void isOverDraw() throws Exception {
//    }
//
//    @Test
//    public void setOverDraw() throws Exception {
//    }
//
//    @Test
//    public void resetOverDraw() throws Exception {
//    }
//
//    @Test
//    public void deposit() throws Exception {
//    }
//
//    @Test
//    public void withDraw() throws Exception {
//    }

}