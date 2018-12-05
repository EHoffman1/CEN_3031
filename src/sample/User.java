package sample;
public class User {

    //fields
    protected String name = "Default Name";
    protected String username;
    protected String password;
    protected int residenceID;

    //default constructor
    public User() {
        this.name = "Default Name";
        this.username = "Default Username";
        this.password = "Default Password";
        this.residenceID = 0;
    }

    //overloaded constructor
    public User(String name, String username, String password, int residenceID) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.residenceID = residenceID;
    }

    //methods

    //setters
    protected void setName(String name) {
        this.name = name;
    }

    //getters
    protected String getName() {
        return this.name;
    }

    protected String getUsername() {
        return username;
    }

    protected String getPassword() {
        return password;
    }
}
