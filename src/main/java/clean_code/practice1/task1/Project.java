package clean_code.practice1.task1;

class Project {

  private final TaskRepository taskRepository;
  private final UserRepository userRepository;

  public Project(UserRepository user, TaskRepository task) {
    this.taskRepository = task;
    this.userRepository = user;
  }

  public void addTask(Task task) {
    taskRepository.addTask(task);
  }

  public void assignTaskToUser(String title, String username) {
    Task task = taskRepository.findTask(title);
    task.setUser(userRepository.findUser(username));
    System.out.println("Task " + title + " was assign to " + username);
  }

  public void completeTask(String title) {
    Task task = taskRepository.findTask(title);
    task.setCompleted(true);
  }
}
