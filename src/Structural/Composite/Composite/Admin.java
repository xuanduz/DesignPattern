package Structural.Composite.Composite;

import java.util.ArrayList;

import Structural.Composite.Component.Account;

public class Admin extends Account {

    private ArrayList<Account> listAccount = new ArrayList<>();

    public Admin(int id, String username, String password, String name, String role, String phoneNumber) {
        super(id, username, password, name, role, phoneNumber);
    }

    @Override
    public void add(Account account) {
        listAccount.add(account);
    }

    @Override
    public void remove(int id) {
        listAccount.remove(id);
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
        for (Account account : listAccount) {
            account.print();
        }
    }
    
}
