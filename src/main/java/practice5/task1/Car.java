package practice5.task1;

public class Car extends Transport {

  public Car() {
    super(70, 4);
  }

  @Override
  public void start() {
    System.out.println("Машина поехала ");
  }
}
