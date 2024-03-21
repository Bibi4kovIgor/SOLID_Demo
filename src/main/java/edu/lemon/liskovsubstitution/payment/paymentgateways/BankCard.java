package edu.lemon.liskovsubstitution.payment.paymentgateways;

public class BankCard implements RefundablePayment {

    @Override
    public void pay() {
        System.out.println("Pay through Bank Card");
    }

    @Override
    public void refund() {
        System.out.println("Refund from Bank Card");
    }
}
