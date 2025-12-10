package clean_code.homework2.task12;

public class SecuritySystem implements DeviceController {

  @Override
  public void turnOn() {
    System.out.println("Система безопасности активирована");

  }

  @Override
  public void turnOff() {
    System.out.println("Система безопасности деактивирована");
  }
}
