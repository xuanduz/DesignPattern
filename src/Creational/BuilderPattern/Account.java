package Creational.BuilderPattern;

public class Account {
    private int id;
    private String username;
    private String password;
    private String name;
    private String role;
    private String phoneNumber;

    public Account(int id, String username, String password, String name, String role, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.role = role;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Account {"+ 
        "id="+this.id+
        " "+this.username+
        " "+this.password+
        " "+this.name+
        " "+this.phoneNumber+
        " "+this.role+
        "}";
    }
}
