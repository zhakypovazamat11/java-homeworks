package clean_code.homework1.task8;

public class Main {

  public static void main(String[] args) {
    NotificationSender emailSender = new EmailSender();
    NotificationService notificationService = new NotificationService(emailSender);
    notificationService.sendNotification(
        "Код авторизации 0214, никому не сообщайте разовый пароль");
    NotificationSender smsSender = new SmsSender();
    NotificationService notificationService2 = new NotificationService(smsSender);
    notificationService2.sendNotification("Authorization code: 4323");

  }

}
