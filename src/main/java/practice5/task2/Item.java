package practice5.task2;

public class Item implements Printable {

  private String name;
  private double price;
  private int count;

  Item(String name, double price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  @Override
  public void print() {
    System.out.print(
        "Мой товар: имя " + this.name + ", цена " + this.price + ", количество " + this.count);
  }
}
