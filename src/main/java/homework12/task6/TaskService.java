package homework12.task6;

import homework12.task6.Task.Priority;
import homework12.task6.Task.Status;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService<T> {

  private final List<Task<T>> taskManager = new ArrayList<>();

  public synchronized void addTaskToManager(Task<T> task) {
    boolean taskExist = taskManager.stream().anyMatch(t -> t.getId().equals(task.getId()));
    if (taskExist) {
      throw new IllegalArgumentException("Задача с id " + task.getId() + " уже существует! ");
    }
    taskManager.add(task);
  }

  public synchronized void removeTaskFromManager(T id) {
    taskManager.removeIf(t -> t.getId().equals(id));
  }

  public synchronized List<Task<T>> getTasksByStatus(Status status) {
    return taskManager.stream().filter(t -> t.getStatus() == status).collect(Collectors.toList());
  }

  public synchronized List<Task<T>> getTasksByPriority(Priority priority) {
    return taskManager.stream().filter(t -> t.getPriority() == priority)
        .collect(Collectors.toList());
  }

  public synchronized List<Task<T>> getSortedTasksByDate() {
    return taskManager.stream().sorted(Comparator.comparing(Task::getDate))
        .collect(Collectors.toList());
  }

  public synchronized List<Task<T>> getAllTasks() {
    return List.copyOf(taskManager);
  }
}
