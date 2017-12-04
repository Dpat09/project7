package Storage;

import User.User;
import manageTransactions.Portfolio;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class portfolioStorageTest {

    private User userObj = new User("test1","123","123test@g.com",false);
    private Portfolio portObj = new Portfolio(1,100,.5,false,110);

    @Test
    public void canary() throws Exception{
        assert(true);
    }

    @Test
    public void createObj() throws Exception{
        portfolioStorage test = new portfolioStorage();
        assert(true);
    }

    @Test
    public void writeFile() throws Exception {
        portfolioStorage.writeFile(portObj,userObj);
        assert(true);
    }

    @Test
    public void readFile() throws Exception {
        portfolioStorage.readFile(portObj,userObj);
        assertEquals(100,portObj.getPreInvested(),0);
    }

}