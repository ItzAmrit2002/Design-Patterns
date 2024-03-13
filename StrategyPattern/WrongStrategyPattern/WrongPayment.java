package StrategyPattern.WrongStrategyPattern;

public class WrongPayment {
    public void processPayment(String paymentMethod) {
        if("UPI".equals(paymentMethod)) {
            System.out.println("Processing UPI payment");
        } else if("CreditCard".equals(paymentMethod)) {
            System.out.println("Processing CreditCard payment");
        } else if("DebitCard".equals(paymentMethod)) {
            System.out.println("Processing DebitCard payment");
        } else {
            System.out.println("Invalid payment method");
        }
    }
}
