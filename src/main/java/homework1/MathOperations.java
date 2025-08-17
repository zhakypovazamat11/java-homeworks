package homework1;

public class MathOperations {

  public static void main(String[] args) {
    int sum = add(4, 5);
    System.out.println("add(4, 5)" + sum);
    System.out.println("subtract(5, 1):" + subtract(5, 1));
    System.out.println("multiply(3, 4):" + multiply(3, 4));
    double division = divide(6, 5);
    System.out.println("divide(6, 5):" + division);
    System.out.println("divide(20, 2):" + divide(20, 2));
    System.out.println("findMax(8, 7):" + findMax(8, 7));
    System.out.println("difference(-5, 2):" + difference(-5, 2));
    System.out.println("squareArea(2):" + squareArea(2));
    System.out.println("squarePerimeter(4):" + squarePerimeter(4));
    System.out.println("convertSecondsToMinutes(130):" + convertSecondsToMinutes(130));
    System.out.println("averageSpeed(72, 3):" + averageSpeed(72, 3));
    System.out.println("findHypotenuse(4, 5):" + findHypotenuse(4, 5));
    System.out.println("circleCircumference(5):" + circleCircumference(5));
    System.out.println("calculatePercentage(1000, 30):" + calculatePercentage(1000, 30));
    System.out.println("celsiusToFahrenheit(32):" + celsiusToFahrenheit(32));
    System.out.println("fahrenheitToCelsius(68):" + fahrenheitToCelsius(68));
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
    if (y == 0) {
      throw new IllegalArgumentException("Деление на ноль запрещено");
    }
    return (double) x / y;
  }

  public static int findMax(int a, int b) {
    return Math.max(a, b);
  }

  public static int difference(int x, int y) {
    return Math.abs(x - y);
  }

  public static int squareArea(int side) {
    if (side < 0) {
      throw new IllegalArgumentException("Сторона не может быть отрицательным числом");
    }

    return side * side;
  }

  public static int squarePerimeter(int side) {
    if (side < 0) {
      throw new IllegalArgumentException("Сторона не может быть отрицательным числом");
    }

    return side * 4;
  }

  public static double convertSecondsToMinutes(int seconds) {
    return (double) seconds / 60;
  }

  public static double averageSpeed(double distance, double time) {
    if (time <= 0) {
      throw new IllegalArgumentException("Сторона не может быть отрицательным числом");
    }

    return distance / time;
  }

  public static double findHypotenuse(double sideA, double sideB) {
    if (sideB < 0 || sideA < 0) {
      throw new IllegalArgumentException("Сторона не может быть отрицательным числом");
    }

    return Math.sqrt(sideA * sideA + sideB * sideB);
  }

  public static double circleCircumference(double radius) {
    if (radius < 0) {
      throw new IllegalArgumentException("Сторона не может быть отрицательным числом");
    }

    return 2 * Math.PI * radius;
  }

  public static double calculatePercentage(double total, double part) {
    if (total == 0) {
      return 0;
    }
    return (part / total) * 100;
  }

  public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
  }

  public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

}
