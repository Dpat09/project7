package User;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    private User userObj = new User("test","123","123@g.com",false);

    @Test
    public void canary() throws Exception{
        assert(true);
    }

    @Test
    public void creatObj() throws Exception{
        User test = new User();
        assert(true);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("test",userObj.getName());
    }

    @Test
    public void setName() throws Exception {
        userObj.setName("testing");
        assert(true);
        assertEquals("testing",userObj.getName());
    }

    @Test
    public void getPassword() throws Exception {
        assertEquals("123",userObj.getPassword());
    }

    @Test
    public void setPassword() throws Exception {
    }

    @Test
    public void getEmail() throws Exception {
    }

    @Test
    public void setEmail() throws Exception {
    }

    @Test
    public void isCorporate() throws Exception {
    }

    @Test
    public void setCorporate() throws Exception {
    }

}