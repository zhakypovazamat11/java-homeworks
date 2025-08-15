package practice4.solver;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTaskSolver {

  public static void main(String[] args) {
    //findNumber(10);
    //findMin();
    checkCredentials();
  }

  public static void findNumber(int bound) {
    Scanner scanner = new Scanner(System.in);

    int random = new Random().nextInt(bound);
    System.out.println(random);
    int number;
    do {
      System.out.print("Угадайте число: ");
      number = scanner.nextInt();
      if (number < random) {
        System.out.println("Больше");
      }
      if (number > random) {
        System.out.println("Меньше");
      }
    } while (number != random);

    System.out.println("Верно!");

  }

  public static void findMin() {
    int min = 2147483647;
    Scanner scanner = new Scanner(System.in);
    int number;
    do {
      System.out.print("Введите число: ");
      number = scanner.nextInt();
      if (number < min && number >= 0) {
        min = number;
      }
    } while (number >= 0);
    System.out.println("Минимальное число: " + min);
  }

  public static void checkCredentials() {
    Scanner scanner = new Scanner(System.in);

    String login;
    String password;

    do {
      System.out.print("Введите логин: ");
      login = scanner.nextLine();
      System.out.print("Введите пароль: ");
      password = scanner.nextLine();
    } while (!login.equals("admin") || !password.equals("123"));

    System.out.println("Доступ разрешен.");
  }
}
