package homework6.linkedlist_tasks;

public class Main {

  public static void main(String[] args) {
    LinkedListTasks taskQueue = new LinkedListTasks();
    taskQueue.addTaskToQueue("Запустить тесты");
    taskQueue.addTaskToQueue("Посмотреть ошибки");
    taskQueue.addTaskToQueue("Отправить результаты Ранов на почту");
    //taskQueue.nextTaskProcess();
    taskQueue.listIteratorForTasks();
  }

}
