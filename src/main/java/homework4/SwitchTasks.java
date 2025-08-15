package homework4;

import java.util.Scanner;

public class SwitchTasks {

  public static void main(String[] args) {
    //printDayOfWeek();
    //printTicketFeeByDay();
    //convertNumberGradeToSymbol();
    // printCommand();
    calculatorWithSwitch();
  }

  public static void printDayOfWeek() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число от 1-7: ");
    int number = scanner.nextInt();
    switch (number) {
      case 1:
        System.out.println("Понедельник");
        break;
      case 2:
        System.out.println("Вторник");
        break;
      case 3:
        System.out.println("Среда");
        break;
      case 4:
        System.out.println("Четверг");
        break;
      case 5:
        System.out.println("Пятница");
        break;
      case 6:
        System.out.println("Суббота");
        break;
      case 7:
        System.out.println("Воскресенье");
        break;
      default:
        System.out.println("Несуществующий день недели");
    }
  }

  public static void printTicketFeeByDay() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число от 1-7: ");
    int number = scanner.nextInt();
    switch (number) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        System.out.println("Стоимость билета 300 рублей");
        break;
      case 6:
      case 7:
        System.out.println("Стоимость билета 450 рублей");
        break;
      default:
        System.out.println("Введено некорректное число");
    }
  }

  public static void convertNumberGradeToSymbol() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число от 0-100: ");
    int number = scanner.nextInt();
    if (0 <= number && number <= 100) {
      switch (number / 10) {
        case 10:
        case 9:
          System.out.println("A");
          break;
        case 8:
          System.out.println("B");
          break;
        case 7:
          System.out.println("C");
          break;
        case 6:
          System.out.println("D");
          break;
        default:
          System.out.println("F");
      }
    } else {
      System.out.println("Incorrect input");
    }
  }

  public static void printCommand() {
    //"start", "stop", "restart" или "status"
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите команду: ");
    String command = scanner.nextLine();
    switch (command) {
      case "start":
        System.out.println("Система запущена");
        break;
      case "stop":
        System.out.println("Система остановлена");
        break;
      case "restart":
        System.out.println("Система перезапущена");
        break;
      case "status":
        System.out.println("Статус системы");
        break;
      default:
        System.out.println("Неизвестная команда");
    }
  }

  public static void calculatorWithSwitch() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите число от 0-100: ");
    int number1 = scanner.nextInt();
    int number2 = scanner.nextInt();
    String operator = scanner.next();
    switch (operator) {
      case "+":
        System.out.println(number1 + number2);
        break;
      case "-":
        System.out.println(number1 - number2);
        break;
      case "*":
        System.out.println(number1 * number2);
        break;
      case "/":
        if (number2 == 0) {
          System.out.println("Деление на ноль невозможно");
        }
        System.out.println(number1 / number2);
        break;

      default:
        System.out.println("Неверный оператор");
    }

  }
}
