package edu.lemon.liskovsubstitution.payment.clients;

import edu.lemon.liskovsubstitution.payment.paymentgateways.Payment;

public class ClientImplementation {
    private final Payment payment;

    public ClientImplementation(Payment payment) {
        this.payment = payment;
    }

    public void service() {
        payment.pay();
    }
}
