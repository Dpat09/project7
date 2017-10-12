package Login;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import User.User;

import static org.junit.Assert.*;

public class LoginTest {
    @Test
    public void launchLoginMenu() throws Exception {

        User currentUser = new User();

        /*String input = "2";
        InputStream in1 = new ByteArrayInputStream(input.getBytes());
        System.setIn(in1);

        String input2 = "Test Name";
        InputStream in2 = new ByteArrayInputStream(input2.getBytes());
        System.setIn(in2);

        String input3 = "Test Password";
        InputStream in3 = new ByteArrayInputStream(input3.getBytes());
        System.setIn(in3);*/

        String input = "2" + System.getProperty("line.separator") + "Test Name" + System.getProperty("line.separator") + "Test Email" + System.getProperty("line.separator") + "Test Password";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

       assertEquals(true, Login.launchLoginMenu(currentUser));

    }
}