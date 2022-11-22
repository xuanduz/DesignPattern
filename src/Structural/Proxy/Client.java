package Structural.Proxy;

public class Client {
    public static void main(String[] args) {
        ProxyAccount proxyAccount1 = new ProxyAccount("xuanduc", "123", "USER");
        ProxyAccount proxyAccount2 = new ProxyAccount("vanA", "123", "ADMIN");

        System.out.println("============================");
        proxyAccount1.printAccount();
        proxyAccount2.printAccount();
    }
}
