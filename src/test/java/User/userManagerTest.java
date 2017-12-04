package User;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class userManagerTest extends userManager{

    private User userObj = new User("test","123","123@g.com",false);

    @Test
    public void canary(){
        assert(true);
    }

    @Test
    public void userManagerMenu() throws Exception {
        String input = "2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        userManager.userManagerMenu(userObj);
        assert(true);
    }

    @Test
    public void changeUserPass() throws Exception {
        String input = "123" + System.getProperty("line.separator")
                + "321" + System.getProperty("line.separator");

        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        userManager.changeUserPass(userObj);
        assert (true);
    }

}