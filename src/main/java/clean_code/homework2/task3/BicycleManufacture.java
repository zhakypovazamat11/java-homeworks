package clean_code.homework2.task3;

public class BicycleManufacture extends TransportManufacture {

  @Override
  Transport createTransport() {
    return new Bicycle();
  }
}
