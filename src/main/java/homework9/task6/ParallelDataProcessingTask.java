package homework9.task6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParallelDataProcessingTask {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    List<Integer> numberList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    ExecutorService executorService = Executors.newFixedThreadPool(3);
    List<Callable<Integer>> elements = new ArrayList<>();
    for (int t = 0; t < 3; t++) {
      int startIndex = t * 3;

      Callable<Integer> element = () -> {
        int sum = 0;

        for (int e = startIndex; e < startIndex + 3; e++) {
          int value = numberList.get(e);
          sum += value;
          System.out.println(
              "Поток " + Thread.currentThread().getName() + " обработал элемент " + e + " значение "
                  + value);
        }
        return sum;
      };
      elements.add(element);
    }
    int totalSum = 0;
    List<Future<Integer>> futureList = executorService.invokeAll(elements);
    for (Future<Integer> future : futureList) {
      totalSum += future.get();
    }
    System.out.println("Результат списка элементов " + totalSum);
    executorService.shutdown();
  }

}
