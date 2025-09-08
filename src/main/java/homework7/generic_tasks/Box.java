package homework7.generic_tasks;

public class Box<T> {

  private T volume;

  public T getVolume() {
    return this.volume;
  }

  public void setVolume(T t) {
    this.volume = t;
  }
}
