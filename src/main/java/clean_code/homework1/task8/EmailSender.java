package clean_code.homework1.task8;

public class EmailSender implements NotificationSender {

  @Override
  public void sendNotification(String message) {
    System.out.println("Отправка email: " + message);
  }
}
