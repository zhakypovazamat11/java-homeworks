package homework4;

import java.util.Scanner;

public class ForTasks {

  public static void main(String[] args) {
    //printNumbersDividedBy3Before100();
    //printSumOfAllNumbers();
    //printMultiplyTable();
    //printIsPrimeNumber();
    printNumbersToTen();

  }

  public static void printNumbersDividedBy3Before100() {
    for (int i = 1; i <= 100; i++) {
      if (i % 3 == 0) {
        System.out.print(i + ", ");
      }
    }
  }

  public static void printSumOfAllNumbers() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int n = scanner.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println(sum);
  }

  public static void printMultiplyTable() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int n = scanner.nextInt();
    for (int i = 1; i <= 10; i++) {
      System.out.println(n + " * " + i + " = " + n * i);
    }
  }

  public static void printIsPrimeNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int n = scanner.nextInt();
    boolean isPrime = true;
    for (int i = 2; i < n - 1; i++) {
      if (n % i == 0) {
        isPrime = false;
        break;
      }
    }
    if (isPrime) {
      System.out.println("Число простое");
    } else {
      System.out.println("Число составное");
    }

  }

  public static void printNumbersToTen() {
    for (int i = 1; i <= 10; i++) {
      System.out.print(i + ", ");
    }
  }

}
