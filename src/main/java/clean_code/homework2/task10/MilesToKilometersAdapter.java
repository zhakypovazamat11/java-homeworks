package clean_code.homework2.task10;

public class MilesToKilometersAdapter {

  private Miles miles;

  public MilesToKilometersAdapter(Miles miles) {
    this.miles = miles;
  }

  public Double convertMilesToKilometers() {
    return miles.getKilometers();
  }

}
