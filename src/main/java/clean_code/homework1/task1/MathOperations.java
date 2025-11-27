package clean_code.homework1.task1;

public class MathOperations {

  public int add(int a, int b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }

  public int add(int a, int b, int c, int d) {
    return a + b + c + d;
  }

  public int add(int... numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    return sum;
  }
}
