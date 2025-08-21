package homework5.task3;

public class Drink extends Dish {

  private final static double DEFAULT_VOLUME = 250;// ml
  private double volume;

  Drink() {
    this.volume = DEFAULT_VOLUME;
  }

  @Override
  void getDescription() {
    System.out.println("Напиток — с объёмом: " + this.volume);
  }
}
