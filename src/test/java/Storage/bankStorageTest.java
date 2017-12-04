package Storage;

import Stock.stockStore;
import User.User;
import manageTransactions.Bank;
import manageTransactions.Portfolio;
import org.junit.Test;

import static org.junit.Assert.*;

public class bankStorageTest {

    private User userObj = new User("test1","123","123test@g.com",false);
    private Bank bankObj = new Bank(100,false);

    @Test
    public void canary() throws Exception{
        assert(true);
    }

    @Test
    public void createObj() throws Exception{
        bankStorage test = new bankStorage();
        assert(true);
    }

    @Test
    public void writeFile() throws Exception {
        bankStorage.writeFile(bankObj,userObj);
        assert(true);
    }

    @Test
    public void readFile() throws Exception {
        bankStorage.readFile(bankObj,userObj);
        assertEquals(100,bankObj.getBalance(),0);
    }
}