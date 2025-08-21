package homework5.task8;

public class Sculpture extends Exhibit {

  @Override
  void info() {
    System.out.println("Скульптура");
  }

  @Override
  void preserve() {
    System.out.println("нуждается в реставрации");
  }
}
