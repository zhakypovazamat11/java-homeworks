package homework6.priorityQueue_task;

import java.util.PriorityQueue;

public class Main {

  public static void main(String[] args) {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    queue.add(3);
    queue.add(2);
    queue.add(5);
    queue.add(7);
    while (!queue.isEmpty()) {
      System.out.println("Вывод из очереди значения: " + queue.poll());
    }
  }
}
