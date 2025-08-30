package homework6.linkedhashset_tasks;

import java.util.LinkedHashSet;

public class Main {

  public static void main(String[] args) {
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
    linkedHashSet.add("Azamat started task 1");
    linkedHashSet.add("Nikolay started task 2");
    linkedHashSet.add("Petya started task 3");
    linkedHashSet.add("Azamat finished task 1");
    linkedHashSet.add("Azamat started task2");
    linkedHashSet.forEach(System.out::println);
  }

}
