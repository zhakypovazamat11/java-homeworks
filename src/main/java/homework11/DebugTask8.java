package homework11;

public class DebugTask8 {

  public static void main(String[] args) {
    double a = 0.1 * 3;
    double b = 0.3;
    double epsilon = 1e-10;

    if (Math.abs(a - b) < epsilon) {
      System.out.println("Equal");
    } else {
      System.out.println("Not Equal");
    }
  }
}