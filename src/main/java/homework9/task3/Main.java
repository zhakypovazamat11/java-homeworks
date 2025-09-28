package homework9.task3;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    TaskForVolatile task1 = new TaskForVolatile();
    Thread t1 = new Thread(task1);
    t1.start();
    Thread.sleep(2000);
    task1.stop();
    t1.join();
  }

}
