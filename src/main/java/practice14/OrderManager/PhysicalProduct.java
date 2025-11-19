package practice14.OrderManager;

public class PhysicalProduct extends Product {

  private int weight;

  public PhysicalProduct(String title, int price, int weight) {
    super(title, price);
    this.weight = weight;
  }
}
