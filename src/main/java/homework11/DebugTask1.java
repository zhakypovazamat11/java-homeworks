package homework11;

public class DebugTask1 {

  public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50};
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
    // есть 3 фикса: 1) использовать цикл for each 2) использовать строгое сравнение < 3) сравнивать length-1
  }
}
