package homework4;

import java.util.Scanner;

public class BreakContinueTasks {

  public static void main(String[] args) {
    //sumOfNumberTillNegative();
    //skipNumberDividedBy3();
    //printPositiveNumbers();
    inputUntilStop();
  }

  public static void sumOfNumberTillNegative() {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    while (true) {
      int i = scanner.nextInt();
      if (i < 0) {
        break;
      }
      sum += i;
    }
    System.out.println(sum);
  }

  public static void skipNumberDividedBy3() {
    for (int i = 1; i <= 20; i++) {
      if (i % 3 == 0) {
        continue;
      }
      System.out.print(i + ", ");
    }
  }

  public static void printPositiveNumbers() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите положительные числа (для выхода введите отрицательное):");
    while (true) {
      int i = scanner.nextInt();
      if (i < 0) {
        System.out.println("Завершение программы.");
        break;
      } else {
        System.out.print(i + ", ");
      }
    }
  }

  public static void inputUntilStop() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String str = scanner.nextLine();
      if (str.equals("stop")) {
        break;
      }
      System.out.println(str);
    }
  }
}


