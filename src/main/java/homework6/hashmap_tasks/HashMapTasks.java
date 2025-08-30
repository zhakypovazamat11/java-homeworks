package homework6.hashmap_tasks;

import java.util.HashMap;

public class HashMapTasks {

  private HashMap<String, Integer> hashMap;

  public HashMapTasks() {
    this.hashMap = new HashMap<>();
  }

  public void addPair(String name, int age) {
    hashMap.put(name, age);
  }

  public void printPairs() {
    System.out.println("Вывод пар значений: ");
    hashMap.forEach((name, age) -> {
      System.out.println("Имя: " + name + ", возраст " + age);
    });
    System.out.println();
  }

  public boolean isNameIncluded(String name) {
    return hashMap.containsKey(name);
  }
}
