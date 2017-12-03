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
    public void AwriteFileUser() throws Exception {
        boolean isWorking = writeFile(test,null,null,null,"user");
        assertEquals(true,isWorking);
    }

    @Test
    public void AreadFileUser() throws Exception {
        User example = new User();
        example.setEmail("123@g.com");
        boolean isWorking = readFile(example,null,null,null,"user");
        assertEquals("test",example.getName());
    }

//    @Test
//    public void BwriteFileUser() throws Exception {
//        boolean isWorking = writeFile(test,null,null,null,"user");
//        assertEquals(true,isWorking);
//    }
//
//    @Test
//    public void BreadFileUser() throws Exception {
//        User example = new User();
//        example.setEmail("1234@g.com");
//        boolean isWorking = readFile(example,null,null,null,"user");
//        assertEquals(false,isWorking);
//    }

}