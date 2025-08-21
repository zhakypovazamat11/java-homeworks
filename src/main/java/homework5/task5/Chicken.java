package homework5.task5;

public class Chicken extends Animal {

  @Override
  void produce() {
    System.out.println("Курица несёт яйца");
  }

  @Override
  void care() {
    System.out.println("Курица требует зерно");
  }
}
