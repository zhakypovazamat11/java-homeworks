package clean_code.homework2.task12;

public class LightDevice implements DeviceController {

  @Override
  public void turnOn() {
    System.out.println("Свет включен");
  }

  @Override
  public void turnOff() {
    System.out.println("Свет выключен");
  }
}
