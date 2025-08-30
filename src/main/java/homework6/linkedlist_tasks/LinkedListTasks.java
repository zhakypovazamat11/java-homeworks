package homework6.linkedlist_tasks;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTasks {

  private LinkedList<String> taskQueue;

  public LinkedListTasks() {
    this.taskQueue = new LinkedList<>();
  }

  //Реализуйте очередь задач с LinkedList. Добавьте 3 задачи
  public void addTaskToQueue(String string) {
    taskQueue.add(string);
  }

  // и обработайте их в порядке поступления.
  public void nextTaskProcess() {
    System.out.println("Выполняю задачу: ");
    while (!taskQueue.isEmpty()) {
      System.out.print(taskQueue.poll() + ", ");
    }
    System.out.println();
    System.out.println("Задач в очереди нет!");
  }

  //Используйте ListIterator для прохода по LinkedList в обоих направлениях.
  public void listIteratorForTasks() {
    System.out.println("Выполнить все задачи с помощью List Iterator в двух направлениях: ");
    ListIterator<String> lt = taskQueue.listIterator();
    while (lt.hasNext()) {
      System.out.println(lt.next());
    }
    while (lt.hasPrevious()) {
      System.out.println(lt.previous());
    }
  }
}
