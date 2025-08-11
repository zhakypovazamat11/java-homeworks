package homework2;

public class Product {

  String name;
  double price;

  Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void applyDiscount(double discount) {
    this.price -= (this.price * discount / 100);
  }

  public void printInfo() {
    System.out.println("Product: " + this.name + " price: " + this.price);
  }
}
