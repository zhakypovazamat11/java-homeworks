package homework9.task2;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(() -> {
      for (int i = 1; i <= 5; i++) {
        System.out.println("A");
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    });

    Thread t2 = new Thread(() -> {
      for (int i = 1; i <= 5; i++) {
        System.out.println("B");
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    });

    t1.start();
    t2.start();
    t1.join();
    t2.join();
  }

}
