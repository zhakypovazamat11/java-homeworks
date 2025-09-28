package practice10.synchronize;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    SafeCounter counter = new SafeCounter();
    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 10000; i++) {
        counter.increment();
      }
    });
    Thread t2 = new Thread(() -> {
      for (int i = 0; i < 10000; i++) {
        counter.decrement();
      }
    });

    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println(counter.getCount());
  }

}
