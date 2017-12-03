package Utilities;

import User.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class readingWriteTest extends readingWrite {

    private User test = new User("test","123","123@g.com",false);


    @Test
    public void canary() throws Exception{
        assert(true);
    }

    @Test
    public void writeFileUser() throws Exception {
        boolean isWorking = writeFile(test,null,null,null,"user");
        assertEquals(true,isWorking);
    }

    @Test
    public void readFileUser() throws Exception {

    }

}