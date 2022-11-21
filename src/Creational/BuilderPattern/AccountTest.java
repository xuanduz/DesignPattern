package Creational.BuilderPattern;

public class AccountTest {
    public static void main(String[] args) {
        AccountBuilder accountBuilder = new AccountConcreteBuilder()
            .setId(0)
            .setName("duc")
            .setUsername("xuanduc")
            .setPassword("123")
            .setPhoneNumber("123456")
            .setRole("admin");
        System.out.println("account " + accountBuilder.build().toString());
    }
}