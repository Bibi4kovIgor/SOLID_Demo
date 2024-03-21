package edu.lemon.liskovsubstitution.payment.clients;

import edu.lemon.liskovsubstitution.payment.paymentgateways.RefundablePayment;

public class RefundableClientImplementation {
    private final RefundablePayment refundablePayment;

    public RefundableClientImplementation(RefundablePayment refundablePayment) {
        this.refundablePayment = refundablePayment;
    }

    public void service(){
        refundablePayment.pay();
    }

    public void reject(){
        refundablePayment.refund();
    }
}
