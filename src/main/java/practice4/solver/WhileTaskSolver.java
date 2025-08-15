package practice4.solver;

import java.util.Scanner;

public class WhileTaskSolver {

  public static void main(String[] args) {
    //printAllNumbersBefore10();
    //commandReader();
    System.out.println(sumOfDigits(1035));
  }

  public static void printAllNumbersBefore10() {
    int i = 1;
    while (i <= 10) {
      System.out.print(i + ", ");
      i++;
    }
  }

  public static void commandReader() {
    Scanner scanner = new Scanner(System.in);
    String command = "";

    while (!command.equals("exit")) {
      System.out.print("Введите комаеду: ");
      command = scanner.nextLine();
    }//для непримитивных типов данных нужно использовать метод equals
    System.out.println("Команда завершена");
  }

  public static int sumOfDigits(int number) {
    int sum = 0;
    while (number > 0) {
      sum = sum + number % 10;
      number = number / 10;
    }

    return sum;
  }
}
