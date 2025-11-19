package examples.task1;

import java.util.Arrays;

public class Main {

  //посчитать кол-во нечетных чисел в массиве от 3 - до 7

  public static void main(String[] args) {
    int[] numbers = {3, 4, 5, 6, 7};

    int count = (int) Arrays.stream(numbers)
        .filter(num -> num % 2 != 0)
        .count();

    System.out.println("Количество нечетных чисел: " + count);
  }

}
