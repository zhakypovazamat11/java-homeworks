package homework1;

public class MathOperations {

  public static void main(String[] args) {
    int sum = add(4, 5);
    System.out.println(sum);
    System.out.println(subtract(5, 1));
    System.out.println(multiply(3, 4));
    double division = divide(6, 5);
    System.out.println(division);
    System.out.println(divide(20, 10));
    System.out.println(findMax(8, 7));
    System.out.println(difference(-5, 2));
    System.out.println(squareArea(2));
    System.out.println(squarePerimeter(4));
    System.out.println(convertSecondsToMinutes(130));
    System.out.println(averageSpeed(72, 3));
    System.out.println(findHypotenuse(4, 5));
    System.out.println(circleCircumference(5));
    System.out.println(calculatePercentage(1000, 30));
    System.out.println(celsiusToFahrenheit(32));
    System.out.println(fahrenheitToCelsius(68));
  }

  public static int add(int x, int y) {
    return x + y;
  }

  public static int subtract(int x, int y) {
    return x - y;
  }

  public static int multiply(int x, int y) {
    return x * y;
  }

  public static double divide(int x, int y) {
    return (double) x / y;
  }

  public static int findMax(int a, int b) {
    return Math.max(a, b);
  }

  public static int difference(int x, int y) {
    return Math.abs(x - y);
  }

  public static int squareArea(int side) {
    return side * side;
  }

  public static int squarePerimeter(int side) {
    return side * 4;
  }

  public static double convertSecondsToMinutes(int sec) {
    return (double) sec / 60;
  }

  public static double averageSpeed(double distance, double time) {
    return distance / time;
  }

  public static double findHypotenuse(double a, double b) {
    return Math.sqrt(a * a + b * b);
  }

  public static double circleCircumference(double radius) {
    return 2 * Math.PI * radius;
  }

  public static double calculatePercentage(double total, double part) {
    if (total == 0) {
      return 0;
    }
    return (part / total) * 100;
  }

  public static double celsiusToFahrenheit(double c) {
    return (c * 9 / 5) + 32;
  }

  public static double fahrenheitToCelsius(double f) {
    return (f - 32) * 5 / 9;
  }

}
