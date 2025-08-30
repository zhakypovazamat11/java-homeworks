package homework6.arrayDeque_tasks;

import java.util.ArrayDeque;

public class Main {

  public static void main(String[] args) {
    ArrayDeque<String> arrayDeque = new ArrayDeque<>();
    arrayDeque.addFirst("Решить задачу 1 ");
    arrayDeque.addLast("Решить задачу 2 ");
    arrayDeque.addLast("Решить задачу 3 ");
    arrayDeque.addLast("Решить задачу 4 ");
    arrayDeque.addLast("Решить задачу 5 ");
    arrayDeque.addLast("Решить задачу 6 ");

    while (!arrayDeque.isEmpty()) {
      String nextElementFromBeginning = arrayDeque.peekFirst();
      String nextElementFromEnd = arrayDeque.peekLast();
      if (nextElementFromBeginning != null) {
        System.out.println("Выведено с начала листа: " + arrayDeque.removeFirst());
      }
      if (nextElementFromEnd != null && !arrayDeque.isEmpty()) {
        System.out.println("Выведено с конца листа: " + arrayDeque.removeLast());
      }
    }
  }

}
