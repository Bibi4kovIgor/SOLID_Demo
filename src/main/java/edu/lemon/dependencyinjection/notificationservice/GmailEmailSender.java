package edu.lemon.dependencyinjection.notificationservice;

public class GmailEmailSender implements EmailSender {
  @Override
  public void send() {
    System.out.println("Send message from Gmail sender");
  }
}
