package StrategyPattern;

public class CreditCard implements PaymentStrtagy {

    private String cardNum;

    public CreditCard(String num) {
        cardNum = num;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + "Rs. using credicard num: " + cardNum);
    }

}
