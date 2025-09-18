package practice9.funcinterfaces;

public class Main {

  public static void main(String[] args) {
    MathOperations add = (x, y) -> x + y;
    MathOperations subtract = (x, y) -> x - y;
    MathOperations multiply = (x, y) -> x * y;
    MathOperations divide = (x, y) -> x / y;

    System.out.println(add.apply(5, 3));
    System.out.println(subtract.apply(10, 3));
    System.out.println(multiply.apply(11, 11));
    System.out.println(divide.apply(20, 4));

    Checker isPositive = n -> n > 0;
    isPositive.printIfValid(20);
    isPositive.printIfValid(-1);
  }

}
