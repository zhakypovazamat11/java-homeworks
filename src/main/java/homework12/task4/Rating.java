package homework12.task4;

public class Rating<T extends Number> {

  private final T rate;

  public Rating(T rate) {
    this.rate = rate;
  }

  public T getRate() {
    return rate;
  }
}
