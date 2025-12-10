package clean_code.homework2.task12;

public class AirConditioner implements DeviceController {

  @Override
  public void turnOn() {
    System.out.println("Кондиционер включен");
  }

  @Override
  public void turnOff() {
    System.out.println("Кондиционер выключен");
  }
}
