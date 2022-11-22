package Creational.BuilderPattern;

public interface AccountBuilder {
    AccountBuilder setId(int id);
    
    AccountBuilder setUsername(String username);
    
    AccountBuilder setPassword(String password);
    
    AccountBuilder setName(String name);
    
    AccountBuilder setRole(String role);
    
    AccountBuilder setPhoneNumber(String number);

    Account build();
}
