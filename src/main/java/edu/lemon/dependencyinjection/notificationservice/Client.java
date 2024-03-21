package edu.lemon.dependencyinjection.notificationservice;

import java.util.List;

public class Client {
  public static void main(String[] args) {
    EmailSender smtpSender = new SmtpEmailSender();
    EmailSender mockSender = new MockEmailSender();
    EmailSender gmailSender = new GmailEmailSender();

    List<NotificationService> services =
        List.of(
            new NotificationService(smtpSender),
            new NotificationService(mockSender),
            new NotificationService(gmailSender));

    services.forEach(NotificationService::sendMessage);

  }
}
