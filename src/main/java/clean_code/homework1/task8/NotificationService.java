package clean_code.homework1.task8;

public class NotificationService {

  private NotificationSender notificationSender;

  public NotificationService(NotificationSender notificationSender) {
    this.notificationSender = notificationSender;
  }

  public void sendNotification(String message) {
    notificationSender.sendNotification(message);
  }
}
