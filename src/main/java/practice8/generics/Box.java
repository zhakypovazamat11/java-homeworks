package practice8.generics;

public class Box<T> {

  private T element;

  public T getElement() {
    return this.element;
  }

  public void setElement(T element) {
    this.element = element;
  }
}
