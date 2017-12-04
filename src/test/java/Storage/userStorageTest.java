package Storage;

import User.User;
import org.junit.Test;

public class userStorageTest {

    private User userObj = new User("test1","123","123test@g.com",false);

    @Test
    public void canary() throws Exception{
        assert(true);
    }

    @Test
    public void createObj() throws Exception{
        userStorage test = new userStorage();
        assert(true);
    }

    @Test
    public void writeFile() throws Exception {
    }

    @Test
    public void readFile() throws Exception {
    }

}