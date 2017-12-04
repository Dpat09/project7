package Login;

import User.User;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class LoginTest {

    private User userObj = new User("test1","123","123test@g.com",false);

    @Test
    public void canary() throws Exception{
        assert(true);
    }

    @Test
    public void createObj() throws Exception{
        Login test = new Login();
        assert(true);
    }

    @Test
    public void launchLoginMenu() throws Exception {
        String input = "4";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Login.launchLoginMenu(userObj);
        assert(true);
    }

    @Test
    public void emailValidation() throws Exception {
    }

    @Test
    public void varifidationHelper() throws Exception {
    }

}