package Structural.Proxy;

public class ProxyAccount implements Account {
    private String username;
    private String password;
    private String role;

    private RealAccount realAccount;

    public ProxyAccount(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    @Override
    public void printAccount() {
        realAccount = new RealAccount(this.username, this.password, this.role);
        if (realAccount.getAuth()) {
            System.out.println("Cho phep " + this.username);
        } else {
            System.out.println("Khong cho phep" + this.username);
        }
    }
}
