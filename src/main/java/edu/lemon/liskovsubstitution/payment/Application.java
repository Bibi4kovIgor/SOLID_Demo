package edu.lemon.liskovsubstitution.payment;

import edu.lemon.liskovsubstitution.payment.clients.ClientImplementation;
import edu.lemon.liskovsubstitution.payment.clients.RefundableClientImplementation;
import edu.lemon.liskovsubstitution.payment.paymentgateways.*;

public class Application {
    public static void main(String[] args) {
        RefundablePayment payoneerPayment = new Payoneer();
        RefundablePayment bankCardPayment = new BankCard();
        Payment bitcoinPayment = new Bitcoin();


        ClientImplementation client1 = new ClientImplementation(bitcoinPayment);
        RefundableClientImplementation client2 = new RefundableClientImplementation(payoneerPayment);
        RefundableClientImplementation client3 = new RefundableClientImplementation(bankCardPayment);

        client1.service();

        client2.service();
        client2.reject();

        client3.service();
        client3.reject();

    }
}
