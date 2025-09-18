package practice9.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FilterList {

  public static void main(String[] args) {
    // Создать список целых чисел, далее отфильтровать все четные числа и суммировать их
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
    // Промежуточная операция фильтрация по четности, Терминальная операция суммирование
    IntStream stream = numbers.stream().filter(n ->
    {
      System.out.println("Filter " + n);
      return n % 2 == 0;
    }).mapToInt( // Integer::valueOf
        n -> {
          System.out.println("mapToInt" + n);
          return n;
        });
    System.out.println("Стрим создан, но терминальный метод не был выполнен");

    int sum = stream.sum();
    //вывод в консоль
    System.out.println(sum);
  }
}
