package edu.lemon.dependencyinjection.notificationservice;

public class NotificationService {
    private final EmailSender emailSender;

    public NotificationService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendMessage() {
        emailSender.send();
    }

}
