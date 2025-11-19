package practice14.OrderManager;

public class DigitalProduct extends Product {

  private int fileSize;

  public DigitalProduct(String title, int price, int fileSize) {
    super(title, price);
    this.fileSize = fileSize;
  }
}
