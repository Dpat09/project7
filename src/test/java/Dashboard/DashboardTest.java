package Dashboard;

import Stock.stockCalc;
import Storage.bankStorage;
import Storage.portfolioStorage;
import Storage.stockStorage;
import Storage.userStorage;
import User.User;
import Stock.stockStore;
import manageTransactions.Bank;
import manageTransactions.Portfolio;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class DashboardTest {

    private User userObj = new User("test1","123","123test@g.com",false);
    private Portfolio portObj = new Portfolio(1,100,.5,false,110);
    private Bank bankObj = new Bank(100,false);
    private stockStore stockObj = new stockStore();
    private Dashboard test = new Dashboard(userObj);


    public void setupTest(){
        stockCalc.setStocks(portObj,stockObj);
        userStorage.writeFile(userObj);
        portfolioStorage.writeFile(portObj, userObj);
        bankStorage.writeFile(bankObj, userObj);
        stockStorage.writeFile(stockObj,userObj);
    }

    @Test
    public void canary() throws Exception{
        assert(true);
    }

    @Test
    public void createObj(){
        Dashboard test = new Dashboard(userObj);
        assert(true);
    }

    @Test
    public void preDashSetup() throws Exception {
        setupTest();
        String input = "4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        test.preDashSetup(userObj);
        assert(true);
    }

    @Test
    public void launchDash() throws Exception {
        setupTest();
        String input = "4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        test.launchDash(userObj);
        assert(true);
    }

}