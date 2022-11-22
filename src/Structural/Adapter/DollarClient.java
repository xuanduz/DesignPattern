package Structural.Adapter;

public class DollarClient {
    public static void main(String[] args) {
        DollarTarget client = new MoneyAdapter(new VNDAdaptee());
        client.send(10.00);
    }
}
