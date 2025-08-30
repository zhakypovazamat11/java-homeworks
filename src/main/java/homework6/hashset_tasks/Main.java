package homework6.hashset_tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

  //Задача 3:
  //Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
  public static Set<String> removeDuplicates(List<String> input) {
    HashSet<String> hashSet = new HashSet<>();
    hashSet.addAll(input);

    return hashSet;
  }

  public static void main(String[] args) {
    //Задача 2:
    //Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
    HashSet<Integer> hashSet = new HashSet<>();
    for (int i = 1; i <= 10; i++) {
      hashSet.add(i);
    }
    System.out.println("Задача 2: ");
    System.out.println(hashSet.contains(8) ? "Данное число содержится во множестве"
        : "Данное число не содержится во множестве");
    System.out.println(hashSet.contains(11) ? "Данное число содержится во множестве"
        : "Данное число не содержится во множестве");
    System.out.println("Задача 3: ");
    System.out.println(
        removeDuplicates(Arrays.asList("Petya", "Ivan", "Kolya", "Azamat", "Ivan", "Azamat")));

  }

}
