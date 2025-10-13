package homework6.arraylist_tasks;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTasks {

  private ArrayList<Integer> arraylist;

  public ArrayListTasks() {
    this.arraylist = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
      arraylist.add(i);
    }
  }

  // часть не по заданию делал для себя
  public ArrayListTasks(List<Integer> list) {
    this.arraylist = new ArrayList<>(list);
  }

  // Напишите программу, которая выводит все чётные числа из ArrayList
  public void printEvenNumbers() {
    System.out.println("Четные числа от 1 до 10: ");
    arraylist.forEach(number -> {
      if (number % 2 == 0) {
        System.out.print(number + " ");
      }
    });
    System.out.println();
  }

  //Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.

  public void printMaxNumberFromArrayList() {
    int maxNumber = arraylist.get(0);
    for (int number : arraylist) {
      if (number > maxNumber) {
        maxNumber = number;
      }
    }
    System.out.println("Максимальное число у массива: " + maxNumber);
  }

}
