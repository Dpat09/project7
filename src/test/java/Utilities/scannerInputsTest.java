package Utilities;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class scannerInputsTest {

    @Test
    public void scanString() throws Exception {
        String input = "hello";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("hello",scannerInputs.scanString());
    }

    @Test
    public void scanInteger() throws Exception {
        String input = "10";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(10,scannerInputs.scanInteger());
    }

    @Test
    public void scanDouble() throws Exception {
        String input = "10.55";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals(10.55,scannerInputs.scanDouble(),0);
    }

}