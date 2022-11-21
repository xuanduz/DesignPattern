package Creational.BuilderPattern;

public class AccountConcreteBuilder implements AccountBuilder {
    
    private int id;
    private String username;
    private String password;
    private String name;
    private String role;
    private String phoneNumber;

    @Override
    public AccountBuilder setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public AccountBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    @Override
    public AccountBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public AccountBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public AccountBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    @Override
    public AccountBuilder setPhoneNumber(String number) {
        this.phoneNumber = number;
        return this;
    }
    
    @Override
    public Account build() {
        return new Account(id, username, password, name, role, phoneNumber);
    } 
}
