package Login;

import User.User;
import org.junit.Test;

import java.beans.Expression;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class LoginTest extends Login{

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
        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Login.launchLoginMenu(userObj);
        assert(true);
    }

    @Test
    public void launchLoginMenuFalse() throws Exception {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(2,Login.launchLoginMenu(userObj));
    }

    @Test
    public void launchLoginFalse() throws Exception{
        String input = "test";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(4,Login.launchLogin(userObj));
    }

    @Test
    public void emailValidationTrue() throws Exception {
        String email = "test@g.com";
        assertEquals(true,EmailValidation(email));
    }

    @Test
    public void emailValidationFalse1() throws Exception {
        String email = "testg.com";
        assertEquals(false,EmailValidation(email));
    }

    @Test
    public void emailValidationFalse2() throws Exception {
        String email = "test@gcom";
        assertEquals(false,EmailValidation(email));
    }

    @Test
    public void emailValidationFalse3() throws Exception {
        String email = "testgcom";
        assertEquals(false,EmailValidation(email));
    }

    @Test
    public void varifidationHelperTrue() throws Exception {
        String email = "test@gmail.com";
        assertEquals(true,VarifidationHelper(email,'@'));
    }

    public void varifidationHelperFalse() throws Exception {
        String email = "testgmail.com";
        assertEquals(false,VarifidationHelper(email,'@'));
    }


}