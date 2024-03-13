package StrategyPattern.CorrectStrategyPattern;

public class Payment {
    PaymentStrategy paymentStrategy;

    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment() {
        paymentStrategy.processPayment();
    }

    public static void main(String[] args) {
        Payment upiPayment = new Payment(new UPIPayment());
        upiPayment.processPayment();

        Payment creditCardPayment = new Payment(new CreditCardPayment());
        creditCardPayment.processPayment();
    }
}
