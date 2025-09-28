package practice10.synchronize;

public class SafeCounter {

  // методы по увеличению и уменьшению значения
  // задача реализовать решение в многопоточной среде
  private int count = 0;

  public synchronized void increment() {
    count++;
  }

  public synchronized void decrement() {
    count--;
  }

  public synchronized int getCount() {
    return count;
  }
}
