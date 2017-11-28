package Utilities;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class queryHandlerTest {

    @Test
    public void optionsQuery() throws Exception {
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(1,queryHandler.optionsQuery("1.)test",1));
    }

    @Test
    public void optionsQueryfail() throws Exception {
        String input = "2";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(2,queryHandler.optionsQuery("1.)test \n2.)test",2));
    }

    @Test
    public void inputInfo() throws Exception {
        String input = "hello";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("hello",queryHandler.inputInfo("intputInfoTest:"));
    }

}