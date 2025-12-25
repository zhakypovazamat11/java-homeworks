package clean_code.homework3.task1;

public class Base62 implements ShorteningStrategy {

  @Override
  public String shorten(String longUrl) {
    return Integer.toString(Math.abs(longUrl.hashCode()), 36);
  }
}
