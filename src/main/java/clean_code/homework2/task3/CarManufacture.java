package clean_code.homework2.task3;

public class CarManufacture extends TransportManufacture {

  @Override
  Transport createTransport() {
    return new Car();
  }
}
