package edu.lemon.liskovsubstitution.payment.paymentgateways;

public class Bitcoin implements Payment {
    @Override
    public void pay() {
        System.out.println("Pay through Bitcoin");
    }
}
