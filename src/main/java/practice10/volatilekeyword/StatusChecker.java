package practice10.volatilekeyword;

public class StatusChecker implements Runnable {

  // если active = false, все потоки должны завершить исполнение
  private volatile boolean active = true;

  @Override
  public void run() {
    while (active) {
      System.out.println(Thread.currentThread().getName() + " is running!");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }

  public void stop() {
    active = false;
  }
}
