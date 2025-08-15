package homework4;

import java.util.Scanner;

public class WhileTasks {

  public static void main(String[] args) {
    //calculateFactorial();
    //printAllEvenNumbers();
    printReverseCount();
  }

  public static void calculateFactorial() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число: ");
    int num = scanner.nextInt();
    int result = 1;
    int i = 1;
    while (i <= num) {
      result *= i;
      i++;
    }
    System.out.println(result);
  }

  public static void printAllEvenNumbers() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число: ");
    int num = scanner.nextInt();
    int i = 1;
    while (i <= num) {
      if (i % 2 == 0) {
        System.out.print(i + ", ");
      }
      i++;
    }
  }

  public static void printReverseCount() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число: ");
    int num = scanner.nextInt();
    if (num > 0) {
      while (num >= 1) {
        System.out.print(num + ", ");
        num--;
      }
    } else {
      System.out.println("Число отрицательное !!!");
    }
  }
}
