package homework2;

public class Car {

  String brand;
  int year;

  Car(String brand, int year) {
    this.brand = brand;
    this.year = year;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void print() {
    System.out.println("Brand of a car " + this.brand + " manufactured in " + getYear());
  }
}
