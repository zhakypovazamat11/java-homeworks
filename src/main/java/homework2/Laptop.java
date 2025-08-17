package homework2;

public class Laptop {

  String brand;
  double price;

  Laptop(String brand, double price) {
    this.brand = brand;
    this.price = price;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void printInfo() {
    System.out.println("Laptop brand: " + this.brand + " price: " + this.price);
  }
}
