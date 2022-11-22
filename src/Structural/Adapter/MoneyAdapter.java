package Structural.Adapter;

public class MoneyAdapter implements DollarTarget {
    private VNDAdaptee adaptee;

    public MoneyAdapter(VNDAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(Double money) {
        Double vndMoney = this.calculate(money);
        adaptee.moneyCalculated(vndMoney);
    }

    private Double calculate(Double vndMOney) {
        return vndMOney * 225000;
    }
}
