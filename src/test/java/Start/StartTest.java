package Start;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class StartTest {

    @Test
    public void canary() throws Exception{
        assert(true);
    }

    @Test
    public void createObj() throws Exception{
        Start test = new Start();
    }

    @Test
    public void mainTest() throws Exception {
        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Start.main(new String[]{});
        assert(true);
    }

    @Test
    public void splashScreen() throws Exception {
        Start.splashScreen();
        assert(true);
    }

}