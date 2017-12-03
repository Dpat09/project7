package manageTransactions;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class BankTest {

    private Bank testBank = new Bank(100, false);
    Random rand = new Random();

    @Test
    public void canaryTest() throws Exception{
        assert(true);
    }

    @Test
    public void objCreate() throws Exception{
        Bank obj = new Bank();
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

        testBank.setOverDraw(false);
        assertEquals(false,testBank.isOverDraw());
    }

    @Test
    public void resetOverDraw() throws Exception {
        testBank.setOverDraw(true);
        testBank.resetOverDraw();
        assertEquals(false, testBank.isOverDraw());

        boolean randBool = rand.nextBoolean();
        testBank.setOverDraw(randBool);
        testBank.resetOverDraw();
        assertEquals(false, testBank.isOverDraw());
    }

    @Test
    public void deposit() throws Exception {
        double depositAmount = rand.nextDouble();
        double expectedAmount = depositAmount+testBank.getBalance();
        testBank.deposit(depositAmount);
        assertEquals(expectedAmount,testBank.getBalance(),0);
    }

    @Test
    public void withDraw() throws Exception {
        testBank.withDraw(15);
        assertEquals(85,testBank.getBalance(),0);
    }

    @Test
    public void withDrawFalse() throws Exception {
        assertEquals(false,testBank.withDraw(1000));
    }

    @Test
    public void checkCorporate() throws Exception{
        testBank.deposit(100000);
        testBank.checkCorporate();
        assertEquals(true,testBank.isCorporate());
    }

    @Test
    public void checkCorporateFalse(){
        testBank.withDraw(testBank.getBalance());
        testBank.checkCorporate();
        assertEquals(false,testBank.isCorporate());
    }

}