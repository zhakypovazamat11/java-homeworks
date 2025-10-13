package homework9.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceTask {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService executorService = Executors.newFixedThreadPool(4);
    List<Callable<String>> taskList = new ArrayList<>();
    for (int i = 1; i <= 4; i++) {
      int taskId = i;
      Callable<String> task = () -> {
        System.out.println("Выполнение задачи" + taskId);
        Thread.sleep(2_000);
        return "Задача " + taskId + " выполнена потоком : " + Thread.currentThread().getName();
      };
      taskList.add(task);
    }
    List<Future<String>> futureList = executorService.invokeAll(taskList);
    for (Future<String> future : futureList) {
      System.out.println("Результаты задач " + future.get());
    }
    executorService.shutdown();
  }

}
