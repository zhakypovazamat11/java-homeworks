package clean_code.practice2.structural.adapter;

public class CelsiusAdapter {

  private FahrenheitThermometer fahrenheitThermometer;

  public CelsiusAdapter(FahrenheitThermometer f) {
    fahrenheitThermometer = f;
  }

  public double getCelsius() {
    double fTemp = fahrenheitThermometer.getFahrenheitTemperature();
    double cTemp = (fTemp - 32) * 5.0 / 9.0;

    return cTemp;
  }

}
