package practice1;

public class HelloWorld {

  static int a = 1;

  public static void main(String[] args) {
    System.out.println("Hello World !!!");
    System.out.println("Azamat");
    System.out.println(1 + 2);
    System.out.println(3 * 5);
    System.out.println("В поле a хранится: " + a);

    int sum1 = sum(1, 5);
    System.out.println(sum1);

    int mult1 = multiply(2, 5);
    System.out.println("Результат умножения:" + mult1);

    int subs1 = substruct(10, 3);
    System.out.println("Результат вычитания " + subs1);

    double div1 = divide(3, 2);
    System.out.println("Результат деления " + div1);
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  public static int multiply(int x, int y) {
    int mult = x * y;

    return mult;
  }

  public static int substruct(int g, int l) {
    return g - l;
  }


  public static double divide(int s, int h) {
    return (double) s / h;
  }
}
