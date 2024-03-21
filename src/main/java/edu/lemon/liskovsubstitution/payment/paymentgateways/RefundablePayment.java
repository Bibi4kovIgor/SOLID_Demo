package edu.lemon.liskovsubstitution.payment.paymentgateways;

public interface RefundablePayment extends Payment {
    void refund();
}
