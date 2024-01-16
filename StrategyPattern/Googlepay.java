package StrategyPattern;

public class Googlepay implements PaymentStrtagy {
    private String gpay_id;

    public Googlepay(String num) {
        gpay_id = num;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + "Rs. using google pay id: " + gpay_id);
    }
}
