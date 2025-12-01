package clean_code.practice2.creational.fabricmethod;

public class SkyLogistics extends Logistics {

  @Override
  Transport createTransport() {
    return new Plane();
  }
}
