package practice9.streamapi;

import java.util.Arrays;
import java.util.List;

public class SortedUniqueElements {
  // Список с дублирующими значениями
  // вывести все уникальные значения в отсортированном порядке


  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 2, 3, 1, 4, 2, 5);
    List<Integer> uniqueSorted = numbers.stream().distinct().sorted().toList();
    System.out.println(uniqueSorted);
  }
}
