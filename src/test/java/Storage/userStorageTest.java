package Storage;

import User.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
        userStorage.writeFile(userObj);
        assert(true);
    }

    @Test
    public void readFile() throws Exception {
        userStorage.readFile(userObj);
        assertEquals("test1",userObj.getName());
    }

}