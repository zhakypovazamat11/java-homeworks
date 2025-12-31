package clean_code.homework3.task1;

public class Base62 implements ShorteningStrategy {

  private static final String ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyz"
      + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  @Override
  public String shorten(String longUrl) {
    int hash = Math.abs(longUrl.hashCode());
    return encode(hash);
  }

  private String encode(int value) {
    StringBuilder sb = new StringBuilder();
    if (value == 0) {
      return String.valueOf(ALPHABET.charAt(0));
    }

    while (value > 0) {
      sb.append(ALPHABET.charAt(value % 62));
      value /= 62;
    }
    return sb.reverse().toString();
  }
}
