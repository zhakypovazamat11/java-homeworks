package homework4;

import java.util.Scanner;

public class DoWhileTasks {

  public static void main(String[] args) {
    //waitUntilNumPositive();
    //checkCredentials();
    //printNumbersTillTen();
    //closeProgramAfterExit();
    countDigits();
  }

  public static void waitUntilNumPositive() {
    Scanner scanner = new Scanner(System.in);
    int num;
    do {
      System.out.print("Введите число: ");
      num = scanner.nextInt();
    }
    while (num <= 0);
  }

  public static void checkCredentials() {
    Scanner scanner = new Scanner(System.in);
    String password = "Test1234";
    String pas;
    do {
      System.out.print("Введите пароль: ");
      pas = scanner.nextLine();
    }
    while (!pas.equals(password));
    System.out.println("Your password correct, user logged in");
  }

  public static void printNumbersTillTen() {
    Scanner scanner = new Scanner(System.in);
    int i = 1;
    do {
      System.out.print(i + ", ");
      i++;
    }
    while (i <= 10);
  }

  public static void closeProgramAfterExit() {
    Scanner scanner = new Scanner(System.in);
    String str;
    do {
      System.out.print("Введите команду:");
      str = scanner.nextLine();
    }
    while (!str.equals("exit"));
  }

  public static void countDigits() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int number = scanner.nextInt();
    int i = 0;
    do {
      number /= 10;
      i++;
    } while (number != 0);
    System.out.println("В указанном числе кол-во цифр: " + i);
  }

}
