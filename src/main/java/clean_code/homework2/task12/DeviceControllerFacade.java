package clean_code.homework2.task12;

public class DeviceControllerFacade {

  private static DeviceControllerFacade deviceControllerFacade;
  private LightDevice light;
  private AirConditioner airConditioner;
  private SecuritySystem securitySystem;

  private DeviceControllerFacade() {
    light = new LightDevice();
    airConditioner = new AirConditioner();
    securitySystem = new SecuritySystem();
  }

  public static DeviceControllerFacade getInstance() {
    if (deviceControllerFacade == null) {
      deviceControllerFacade = new DeviceControllerFacade();
    }

    return deviceControllerFacade;
  }

  public void turnOffAllDevices() {
    light.turnOff();
    airConditioner.turnOff();
    securitySystem.turnOff();
  }

  public void turnOnAllDevices() {
    light.turnOn();
    airConditioner.turnOn();
    securitySystem.turnOn();
  }

}
