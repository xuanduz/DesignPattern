package Structural.Composite.Leaf;

import Structural.Composite.Component.Account;

public class Customer extends Account {

    public Customer(int id, String username, String password, String name, String role, String phoneNumber) {
        super(id, username, password, name, role, phoneNumber);
    }

    @Override
    public void add(Account account) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void print() {
        System.out.println("Account {"+ 
            "id="+this.getId()+
            " "+this.getUsername()+
            " "+this.getPassword()+
            " "+this.getName()+
            " "+this.getPhoneNumber()+
            " "+this.getRole()+
            "}");
    }
    
}
