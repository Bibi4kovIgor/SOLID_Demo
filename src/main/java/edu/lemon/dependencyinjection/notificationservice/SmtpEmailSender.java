package edu.lemon.dependencyinjection.notificationservice;

public class SmtpEmailSender implements EmailSender{
    @Override
    public void send() {
        System.out.println("Send from Smtp");
    }
}
