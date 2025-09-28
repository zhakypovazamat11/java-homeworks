package homework9.task1;

public class CustomThread extends Thread {

  @Override
  public void run() {
    for (int i = 1; i <= 5; i++) {
      System.out.println("Привет из потока!");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        throw new RuntimeException("Ошибка в sleep() методе");
      }
    }
  }

}
