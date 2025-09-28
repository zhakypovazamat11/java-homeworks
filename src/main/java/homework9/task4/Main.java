package homework9.task4;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();
    Thread t1 = new Thread(() -> {
      for (int i = 1; i <= 1000; i++) {
        counter.increment();
      }
    });
    Thread t2 = new Thread(() -> {
      for (int i = 1; i <= 1000; i++) {
        counter.increment();
      }
    });
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println("Счетчик: " + counter.getCounter());
  }

}
