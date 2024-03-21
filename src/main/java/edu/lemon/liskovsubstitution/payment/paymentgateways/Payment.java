package edu.lemon.liskovsubstitution.payment.paymentgateways;

@FunctionalInterface
public interface Payment {
    void pay();
}
