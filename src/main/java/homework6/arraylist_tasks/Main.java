package homework6.arraylist_tasks;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    ArrayListTasks arrayListTask = new ArrayListTasks();
    arrayListTask.printEvenNumbers();
    arrayListTask.printMaxNumberFromArrayList();
    // Не по заданию, делал для себя
    ArrayListTasks arrayList = new ArrayListTasks(Arrays.asList(43, 54, 6546, 23));
    arrayList.printEvenNumbers();
    arrayList.printMaxNumberFromArrayList();
  }

}
