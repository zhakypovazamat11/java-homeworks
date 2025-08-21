package homework5.task3;

public class Main {

  public static void main(String[] args) {
    HotDish item1 = new HotDish();
    Restaurant dish = new Restaurant();
    dish.addItem(item1);
    dish.printDescribtion();

  }
}
