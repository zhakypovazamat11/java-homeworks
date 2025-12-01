package clean_code.practice2.creational.fabricmethod;

public class SeaLogistics extends Logistics {

  @Override
  Transport createTransport() {
    return new Ship();
  }
}
