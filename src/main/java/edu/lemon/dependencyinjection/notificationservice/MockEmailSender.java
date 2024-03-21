package edu.lemon.dependencyinjection.notificationservice;

public class MockEmailSender implements EmailSender {
    @Override
    public void send() {
        System.out.println("Send from Mock");
    }
}
