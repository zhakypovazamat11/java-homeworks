package clean_code.practice2.creational.fabricmethod;

public class Plane extends Transport {

  @Override
  void deliver() {
    System.out.println("Deliver by plane in a baggage.");
  }
}
