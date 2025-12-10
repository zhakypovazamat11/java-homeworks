package clean_code.homework2.task10;

public class Miles implements Distance {

  private Double miles;

  public Miles(Double miles) {
    this.miles = miles;
  }

  @Override
  public Double getMiles() {
    return miles;
  }

  @Override
  public Double getKilometers() {
    return miles * 1.609;
  }
}
