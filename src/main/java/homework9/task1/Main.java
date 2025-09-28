package homework9.task1;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    CustomThread t1 = new CustomThread();
    t1.start();
    t1.join();
  }

}
