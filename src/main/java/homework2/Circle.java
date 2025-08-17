package homework2;

public class Circle {

  double radius;

  Circle(double radius) {
    if (radius <= 0) {
      throw new IllegalArgumentException("Radius must be positive");
    }
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    if (radius <= 0) {
      throw new IllegalArgumentException("Radius must be positive");
    }
    this.radius = radius;
  }

  public double calculateArea() {
    return Math.PI * Math.pow(this.radius, 2);
  }

  public double calculateCircumference() {
    return 2 * Math.PI * this.radius;
  }
}
