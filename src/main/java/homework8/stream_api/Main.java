package homework8.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("Heldhfodskf", "fsdkjflsf", "fdsfds", "123", "fdsf", "fdsf",
        "Бавыавы");
    List<String> listWithFiveAndGreaterSymbols = list.stream().filter(str -> str.length() > 5)
        .toList();
    System.out.println("Фильтрация строк по длине больше 5 " + listWithFiveAndGreaterSymbols);
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 20, 45, 48, 555);
    List<Integer> listWithNumbersDividedByFive = numbers.stream().filter(n -> n % 5 == 0).toList();
    System.out.println("Фильтрация чисел, кратных 5 " + listWithNumbersDividedByFive);
    List<Integer> convertedStrToLengthList = list.stream().map(String::length).toList();
    System.out.println("Преобразование строк в их длины " + convertedStrToLengthList);
    List<Double> listWithSquareValues = numbers.stream().map(n -> Math.pow(n, 2)).toList();
    System.out.println("Создание списка квадратов чисел " + listWithSquareValues);
    List<String> distinctList = list.stream().distinct().toList();
    System.out.println("Удаление дубликатов из списка " + distinctList);

    System.out.println("Поиск максимального элемента");
    int maxNumberFromList = numbers.stream().max(Comparator.naturalOrder()).get();
    System.out.println("максимальное число в ArrayList " + maxNumberFromList);

    System.out.println("Поиск минимального элемента");

    int minNumberFromList = numbers.stream().min(Comparator.naturalOrder()).get();
    System.out.println("Минимальное число в ArrayList " + minNumberFromList);

    System.out.println("Сумма всех элементов списка");
    int sum = numbers.stream().mapToInt(Integer::intValue).sum();
    System.out.println("Сумма всеx чисел равна: " + sum);

    System.out.println("Поиск первого элемента, начинающегося на Б");
    Optional<String> result = list.stream().filter(string -> string.startsWith("Б")).findFirst();
    String strStartedWithB;
    strStartedWithB = result.orElse("Не найдено");
    System.out.println("Элемент начинающийся на букву Б: " + strStartedWithB);
    System.out.println("Проверка наличия хотя бы одного элемента по условию");
    boolean isListContainsEvenNumber = numbers.stream().anyMatch(num -> num % 2 == 0);
    System.out.println("Есть ли хоть одно четное число: " + isListContainsEvenNumber);

    System.out.println("Группировка строк по первой букве");
    Map<Character, List<String>> listGroupedByFirstSymbol = list.stream()
        .collect(Collectors.groupingBy(str -> str.charAt(0), Collectors.toList()));
    System.out.println(listGroupedByFirstSymbol);

    System.out.println("Группировка чисел по чётности");
    Map<String, List<Integer>> groupedByEvenAndOddNumbers = numbers.stream().collect(
        Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd", Collectors.toList()));
    System.out.println(groupedByEvenAndOddNumbers);

    System.out.println("Поиск среднего значения чисел");
    double average = numbers.stream().collect(Collectors.averagingInt(n -> n));
    System.out.println(average);
  }

}
