package clean_code.practice2.creational.fabricmethod;

public class Ship extends Transport {

  @Override
  void deliver() {
    System.out.println("Deliver by sea in a container.");
  }
}
