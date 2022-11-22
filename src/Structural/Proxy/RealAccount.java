package Structural.Proxy;

public class RealAccount implements Account {
    private String username;
    private String password;
    private String role;

    public RealAccount(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public boolean getAuth() {
        if (this.role == "ADMIN") {
            return true;
        }
        return false;
    }

    @Override
    public void printAccount() {
        System.out.println("Account info " + this.username + " | " + this.password + " | " + this.role);
    }
}
