package practice10.callablefuture;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureExample {
  // Сложные расчеты ДНК задача дождаться вычисления и получить результат
  // ExecutorService для создания пула потоков

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    Callable<Integer> dnaResult = () -> {
      System.out.println("Сложное вычисление DNA");
      Thread.sleep(10_000);
      return new Random().nextInt();
    };

    Future<Integer> future = executorService.submit(dnaResult);

    System.out.println("Результат DNA: " + future.get());

    executorService.shutdown();
  }
}
