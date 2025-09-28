package practice10.deadlock;

import java.io.File;
import java.util.Objects;

public class DeadLockFree {

  private static final File firstFile = new File(
      Objects.requireNonNull(DeadLockFree.class.getClassLoader().getResource("1.txt")).getFile());
  private static final File secondFile = new File(
      Objects.requireNonNull(DeadLockFree.class.getClassLoader().getResource("2.txt")).getFile());

  public static void main(String[] args) {
    Thread t1 = new Thread(() -> {
      synchronized (firstFile) {
        System.out.println("Поток 1 захватил файл 1");

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }

        synchronized (secondFile) {
          System.out.println("Поток 1 захватил файл 2");
        }
      }
    });

    Thread t2 = new Thread(() -> {
      synchronized (firstFile) {
        System.out.println("Поток 2 захватил файл 1");

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }

        synchronized (secondFile) {
          System.out.println("Поток 2 захватил файл 2");
        }
      }
    });

    t1.start();
    t2.start();

  }
}
