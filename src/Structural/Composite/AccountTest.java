package Structural.Composite;

import Structural.Composite.Composite.Admin;
import Structural.Composite.Composite.SuperAdmin;
import Structural.Composite.Leaf.Customer;

public class AccountTest {
    public static void main(String[] args) {
        SuperAdmin superAdmin = new SuperAdmin(0, 
            "duc", 
            "123", 
            "duc", 
            "SUPERADMIN", 
            "123456");
        Admin admin = new Admin(1, 
            "dat", 
            "123", 
            "dat", 
            "ADMIN", 
            "123456");
        Customer customer1 = new Customer(2, 
            "custom 1", 
            "123", 
            "custom1", 
            "USER", 
            "123456");
        Customer customer2 = new Customer(3, 
            "custom 2", 
            "123", 
            "custom2", 
            "USER", 
            "123456");
        superAdmin.add(admin);
        admin.add(customer1);
        admin.add(customer2);

        superAdmin.print();
    }
}
