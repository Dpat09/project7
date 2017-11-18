package User;

public class User {
    private String name;
    private String password;
    private String email;
    private boolean corporate;

    public User(){

    }

    public User(String name, String password, String email){
        setName(name);
        setPassword(password);
        setEmail(email);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isCorporate() {
        return corporate;
    }

    public void setCorporate(boolean corporate) {
        this.corporate = corporate;
    }
}

