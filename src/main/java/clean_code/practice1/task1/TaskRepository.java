package clean_code.practice1.task1;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

  private final List<Task> tasks;

  public TaskRepository() {
    tasks = new ArrayList<>();
  }

  public void addTask(Task task) {
    tasks.add(task);
    System.out.println("Task added: " + task.getTitle());

  }

  public Task findTask(String title) {
    return tasks.stream().filter(it -> it.getTitle().equals(title)).findFirst().get();
  }
}
