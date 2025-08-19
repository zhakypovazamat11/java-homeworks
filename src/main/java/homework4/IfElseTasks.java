package homework4;

import java.util.Scanner;

public class IfElseTasks {

  public static void main(String[] args) {
    //checkNumber();
    //compareNumbers();
    //printTextByNumber();
    //checkOddOrEvenNumber();
    //checkDiscountByAge();
    printResultByPoints();
  }

  public static void checkNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int number = scanner.nextInt();
    if (number > 0) {
      System.out.println("Число положительное");
    } else if (number < 0) {
      System.out.println("Число отрицательное");
    } else {
      System.out.println("Число равно нулю");
    }
  }

  public static void compareNumbers() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите значение a: ");
    int a = scanner.nextInt();
    System.out.print("Введите значение b: ");
    int b = scanner.nextInt();
    if (a > b) {
      System.out.println(a);
    } else if (a == b) {
      System.out.println("Числа равны");
    } else {
      System.out.println(b);
    }
  }

  public static void printTextByNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число от 1 до 5: ");
    int number = scanner.nextInt();
    if (number == 5) {
      System.out.println("Отлично");
    } else if (number == 4) {
      System.out.println("Хорошо");
    } else if (number == 3) {
      System.out.println("Удовлетворительно");
    } else if (number == 2 || number == 1) {
      System.out.println("Неудовлетворительно");
    } else {
      System.out.println("Число неверное, введите из диапазона от 1 до 5");
    }
  }

  public static void checkOddOrEvenNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число: ");
    int number = scanner.nextInt();
    if (number % 2 == 0) {
      System.out.println("Число четное!");
    } else {
      System.out.println("Число нечетное");
    }
  }

  public static void checkDiscountByAge() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите свой возраст: ");
    int number = scanner.nextInt();
    if (number < 18) {
      System.out.println("У вас скидка в размере 25%");
    } else if (number >= 65) {
      System.out.println("У вас скидка в размере 30%");
    } else {
      System.out.println("Для вашего возраста непредусмотрена скидка");
    }
  }

  public static void printResultByPoints() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите свой результат теста: ");
    int number = scanner.nextInt();
    if (number < 100 && number > 0) {
      if (number >= 90) {
        System.out.println("Отлично");
      } else if (75 <= number) {
        System.out.println("Хорошо");
      } else if (60 <= number) {
        System.out.println("Удовлетворительно");
      } else {
        System.out.println("Неудовлетворительно");
      }
    } else {
      System.out.println("Введен неверный результат теста");
    }
  }
}
