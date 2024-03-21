package edu.lemon.liskovsubstitution.payment.paymentgateways;

public class Payoneer implements RefundablePayment {
    @Override
    public void pay() {
        System.out.println("Pay through Payoneer");
    }

    @Override
    public void refund() {
        System.out.println("Refund from payoneer");
    }
}
