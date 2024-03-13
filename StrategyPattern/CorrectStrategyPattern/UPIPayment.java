package StrategyPattern.CorrectStrategyPattern;

public class UPIPayment implements PaymentStrategy{
    public void processPayment() {
        System.out.println("Processing UPI payment");
    }
}
