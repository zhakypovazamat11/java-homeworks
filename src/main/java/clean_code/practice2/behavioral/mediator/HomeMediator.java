package clean_code.practice2.behavioral.mediator;

public class HomeMediator implements Mediator {

  private Light light;
  private Alarm alarm;
  private Thermostat thermostat;

  public HomeMediator(Light light, Alarm alarm, Thermostat thermostat) {
    this.light = light;
    this.alarm = alarm;
    this.thermostat = thermostat;
  }

  @Override
  public void notify(Object sender, String event) {
    if (event.equals("morning")) {
      if (!(sender instanceof Light)) {
        light.turnOn();
        alarm.deactivate();
      }
      thermostat.setTemperature(22);
    } else {
      if (!(sender instanceof Alarm)) {
        alarm.activate();
        light.turnOff();
      }
    }
  }
}
