package Storage;

import Stock.stockStore;
import User.User;
import manageTransactions.Bank;
import manageTransactions.Portfolio;
import org.junit.Test;

import static org.junit.Assert.*;

public class portfolioStorageTest {

    private User userObj = new User("test1","123","123test@g.com",false);
    private Portfolio portObj = new Portfolio(1,100,.5,false,110);
    private Bank bankObj = new Bank(100,false);
    private stockStore stockObj = new stockStore();

    @Test
    public void canary() throws Exception{
        assert(true);
    }

    @Test
    public void writeFile() throws Exception {
    }

    @Test
    public void readFile() throws Exception {
    }

}