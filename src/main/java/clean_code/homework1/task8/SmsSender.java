package clean_code.homework1.task8;

public class SmsSender implements NotificationSender {

  @Override
  public void sendNotification(String message) {
    System.out.println("Отправка sms: " + message);
  }
}
