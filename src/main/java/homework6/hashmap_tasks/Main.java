package homework6.hashmap_tasks;

public class Main {

  public static void main(String[] args) {
    HashMapTasks hashmap = new HashMapTasks();
    hashmap.addPair("Azamat", 27);
    hashmap.addPair("Ilya", 28);
    hashmap.addPair("Ivan", 23);
    hashmap.addPair("Petya", 33);
    hashmap.addPair("Kirill", 33);
    hashmap.printPairs();
    System.out.println(hashmap.isNameIncluded("Azamat") ? "Значение есть в списке"
        : "Данного значения нет в списке");
    System.out.println(hashmap.isNameIncluded("Sergei") ? "Значение есть в списке"
        : "Данного значения нет в списке");
  }

}
