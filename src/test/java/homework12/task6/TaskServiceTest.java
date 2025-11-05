package homework12.task6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import homework12.task6.Task.Priority;
import homework12.task6.Task.Status;
import java.time.LocalDate;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaskServiceTest {

  TaskService<Number> taskService;
  Task<Number> task1;
  int initialSize;

  /**
   * Проверка на добавление задачи, когда задача уникальна, дубликат задачи. Проверка на удаление
   * задачи, существующая задача. Проверка фильтрации по статусу: когда есть задача и когда нет
   * задач. Проверка фильтрации по приоритету: когда есть задача и когда нет задач. Проверка
   * фильтрации по дате: есть задачи и пусто
   */

  @BeforeEach
  public void setup() {
    taskService = new TaskService<>();
    task1 = new Task<>(1, Status.NEW, Priority.MEDIUM, LocalDate.now());
    initialSize = taskService.getAllTasks().size();
  }

  @Test
  public void shouldAddTaskToTaskManager() {
    taskService.addTaskToManager(task1);
    int expectedSize = initialSize + 1;
    int actualSize = taskService.getAllTasks().size();
    assertEquals(expectedSize, actualSize);
  }

  @Test
  public void shouldThrowExceptionWhenExistingTaskAdded() {
    taskService.addTaskToManager(task1);
    assertThrows(IllegalArgumentException.class, () -> taskService.addTaskToManager(task1));
  }

  @Test
  public void shouldRemoveTaskFromManager() {
    taskService.addTaskToManager(task1);
    taskService.removeTaskFromManager(1);
    int expectedSize = initialSize;
    int actualSize = taskService.getAllTasks().size();
    assertEquals(expectedSize, actualSize);
  }

  @Test
  public void shouldReturnFilteredListWhenGettingByStatus() {
    taskService.addTaskToManager(task1);
    List<Task<Number>> expectedList = List.of(task1);
    List<Task<Number>> actualList = taskService.getTasksByStatus(Status.NEW);
    assertEquals(expectedList, actualList);
  }

  @Test
  public void shouldReturnEmptyListWhenGettingByStatusNotContainAnyTasks() {
    taskService.addTaskToManager(task1);
    List<Task<Number>> expectedList = List.of();
    List<Task<Number>> actualList = taskService.getTasksByStatus(Status.IN_PROGRESS);
    assertEquals(expectedList, actualList);
  }

  @Test
  public void shouldReturnFilteredListWhenGettingByPriority() {
    taskService.addTaskToManager(task1);
    List<Task<Number>> expectedList = List.of(task1);
    List<Task<Number>> actualList = taskService.getTasksByPriority(Priority.MEDIUM);
    assertEquals(expectedList, actualList);
  }

  @Test
  public void shouldReturnEmptyListWhenGettingByPriorityNotContainAnyTasks() {
    taskService.addTaskToManager(task1);
    List<Task<Number>> expectedList = List.of();
    List<Task<Number>> actualList = taskService.getTasksByPriority(Priority.HIGH);
    assertEquals(expectedList, actualList);
  }

  @Test
  public void shouldReturnFilteredListWhenSortedByDate() {
    Task<Number> task2 = new Task<>(2, Status.IN_PROGRESS, Priority.HIGH,
        LocalDate.of(2025, 11, 2));
    Task<Number> task3 = new Task<>(3, Status.IN_PROGRESS, Priority.HIGH,
        LocalDate.of(2025, 11, 1));
    taskService.addTaskToManager(task1);
    taskService.addTaskToManager(task2);
    taskService.addTaskToManager(task3);
    List<Task<Number>> expectedList = List.of(task3, task2, task1);
    List<Task<Number>> actualList = taskService.getSortedTasksByDate();
    assertEquals(expectedList, actualList);
  }


}
