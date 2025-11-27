package clean_code.homework1.task1;

public class Main {

  public static void main(String[] args) {
    System.out.println("Задача 1:");
    MathOperations mathOperations = new MathOperations();
    System.out.println("Сумма двух чисел " + mathOperations.add(1, 2));
    System.out.println("Сумма трех чисел " + mathOperations.add(1, 2, 3));
    System.out.println("Сумма четырех чисел " + mathOperations.add(1, 2, 3, 4));
    System.out.println("Сумма шести чисел " + mathOperations.add(1, 2, 3, 4, 5, 6));
  }

}
