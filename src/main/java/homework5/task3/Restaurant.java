package homework5.task3;

public class Restaurant {

  private Dish item;

  public void addItem(Dish item) {
    System.out.println("Блюдо добавлено");
    this.item = item;
  }

  public void printDescribtion() {
    this.item.getDescription();
  }
}
