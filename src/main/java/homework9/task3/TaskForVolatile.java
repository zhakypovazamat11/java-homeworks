package homework9.task3;

public class TaskForVolatile implements Runnable {

  private int counter = 0;
  private volatile boolean stop = false;

  @Override
  public void run() {
    while (!stop) {
      counter++;
      System.out.println("Счетчик равен: " + counter);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }

  public void stop() {
    stop = true;
    System.out.println("Вызываем стоп!");
  }
}
