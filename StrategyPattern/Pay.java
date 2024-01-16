package StrategyPattern;

// we use  StrategyPattern to define object behaviour during run time... like in this code payment stretagy decide during execution of code
public class Pay {
    private PaymentStrtagy paymentStrategy;

    public void setPaymentStrategy(PaymentStrtagy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }

    public static void main(String[] args) {
        Pay p = new Pay();

        p.setPaymentStrategy(new CreditCard("123-321-321"));
        p.checkout(10);

        p.setPaymentStrategy(new Googlepay("henil@upi"));
        p.checkout(100);
    }
}
