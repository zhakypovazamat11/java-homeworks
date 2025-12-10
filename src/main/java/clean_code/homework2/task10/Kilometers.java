package clean_code.homework2.task10;

public class Kilometers implements Distance {

  private Double kilometers;

  public Kilometers(double km) {
    this.kilometers = km;
  }

  @Override
  public Double getMiles() {
    return this.kilometers * 0.6214;
  }

  @Override
  public Double getKilometers() {
    return this.kilometers;
  }
}
