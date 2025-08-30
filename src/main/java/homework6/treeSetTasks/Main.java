package homework6.treeSetTasks;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    // Задача 1:
    //Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
    TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(54, 65, 90, 1, 23));
    System.out.println(treeSet);
  }

}
