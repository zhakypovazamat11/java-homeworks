package clean_code.practice2.creational.fabricmethod;

public class LandLogistics extends Logistics {

  @Override
  Transport createTransport() {
    return new Truck();
  }
}
