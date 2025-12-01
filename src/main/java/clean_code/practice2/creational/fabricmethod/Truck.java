package clean_code.practice2.creational.fabricmethod;

public class Truck extends Transport {

  @Override
  void deliver() {
    System.out.println("Deliver by land in a box.");
  }
}
