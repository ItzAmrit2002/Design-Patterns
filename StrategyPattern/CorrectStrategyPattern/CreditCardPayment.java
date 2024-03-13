package StrategyPattern.CorrectStrategyPattern;

public class CreditCardPayment implements PaymentStrategy{
    public void processPayment() {
        System.out.println("Processing CreditCard payment");
    }
}
