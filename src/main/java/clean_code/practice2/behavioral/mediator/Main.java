package clean_code.practice2.behavioral.mediator;

public class Main {

  public static void main(String[] args) {
    Light light = new Light();
    Alarm alarm = new Alarm();
    Thermostat thermostat = new Thermostat();

    // Представим, что у нас есть сложный сценарий, где эти устройства взаимодействуют:
    light.turnOn();
    alarm.activate();
    thermostat.setTemperature(22);

    HomeMediator homeMediator = new HomeMediator(light, alarm, thermostat);

    homeMediator.notify(thermostat, "morning");
  }
}
