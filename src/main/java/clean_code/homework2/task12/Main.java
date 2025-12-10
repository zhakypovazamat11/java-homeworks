package clean_code.homework2.task12;

public class Main {

  public static void main(String[] args) {
    DeviceControllerFacade facade = DeviceControllerFacade.getInstance();
    facade.turnOnAllDevices();
    facade.turnOffAllDevices();
  }

}
