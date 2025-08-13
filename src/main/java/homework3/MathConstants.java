package homework3;

public class MathConstants {

  final static double PI = 3.14159;
  final double E = 2.71828;

  public static double calculateCircleArea(double r) {
    return PI * Math.pow(r, 2);
  }

  public static double calculateCircumference(double r) {
    return 2 * PI * r;
  }
}
