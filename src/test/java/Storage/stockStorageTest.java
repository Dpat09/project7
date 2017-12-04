package Storage;

import Stock.stockCalc;
import Stock.stockStore;
import User.User;
import manageTransactions.Portfolio;
import org.junit.Test;

public class stockStorageTest {

    private User userObj = new User("test1","123","123test@g.com",false);
    private Portfolio portObj = new Portfolio(1,100,.5,false,110);
    private stockStore stockObj = new stockStore();

    public void setupTest(){
        stockCalc.setStocks(portObj,stockObj);
    }

    @Test
    public void canary() throws Exception{
        assert(true);
    }

    @Test
    public void createObj() throws Exception{
        stockStorage test = new stockStorage();
        assert(true);
    }

    @Test
    public void writeFile() throws Exception {
        setupTest();
        stockStorage.writeFile(stockObj,userObj);
        assert(true);
    }

    @Test
    public void readFile() throws Exception {
        stockStorage.readFile(stockObj,userObj);
        assert(true);
    }

}