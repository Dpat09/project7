package Dashboard;

import User.User;
import Stock.stockStore;
import manageTransactions.Bank;
import manageTransactions.Portfolio;
import org.junit.Test;

import static org.junit.Assert.*;

public class DashboardTest {

    private User userObj = new User("test1","123","123test@g.com",false);
    private Portfolio portObj = new Portfolio(1,100,.5,false,110);
    private Bank bankObj = new Bank(100,false);
    private stockStore stockObj = new stockStore();

    @Test
    public void canary() throws Exception{
        assert(true);
    }

    @Test
    public void preDashSetup() throws Exception {
    }

    @Test
    public void launchDash() throws Exception {
    }

}