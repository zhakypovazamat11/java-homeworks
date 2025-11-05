package homework12.task6;

import java.time.LocalDate;

public class Task<T> {

  private final T id;
  private final Status status;
  private final Priority priority;
  private final LocalDate date;

  public Task(T id, Status status, Priority priority, LocalDate date) {
    this.id = id;
    this.status = status;
    this.priority = priority;
    this.date = date;
  }

  public T getId() {
    return id;
  }

  public Status getStatus() {
    return status;
  }

  public Priority getPriority() {
    return priority;
  }

  public LocalDate getDate() {
    return date;
  }

  public enum Status {NEW, IN_PROGRESS, DONE}

  public enum Priority {LOW, MEDIUM, HIGH}
}
