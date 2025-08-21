package homework5.task5;

public class Cow extends Animal {

  @Override
  void produce() {
    System.out.println("Корова даёт молоко");
  }

  @Override
  void care() {
    System.out.println("Корова нуждается в выпасе");
  }
}
