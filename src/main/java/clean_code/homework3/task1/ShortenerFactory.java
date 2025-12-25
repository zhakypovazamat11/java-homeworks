package clean_code.homework3.task1;

public class ShortenerFactory {

  private final ShorteningStrategy strategy;

  public ShortenerFactory(ShorteningStrategy strategy) {
    this.strategy = strategy;
  }

  public ShorteningStrategy createStrategy() {
    return this.strategy;
  }

}
