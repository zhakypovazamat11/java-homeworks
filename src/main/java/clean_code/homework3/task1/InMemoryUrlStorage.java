package clean_code.homework3.task1;

import java.util.HashMap;
import java.util.Map;

public class InMemoryUrlStorage implements UrlStorage {

  private static InMemoryUrlStorage instance;
  private final Map<String, String> urlStorage;

  private InMemoryUrlStorage() {
    urlStorage = new HashMap<>();
  }

  public static synchronized InMemoryUrlStorage getInstance() {
    if (instance == null) {
      instance = new InMemoryUrlStorage();
    }

    return instance;
  }


  @Override
  public String getLongUrl(String shortUrl) {

    return urlStorage.get(shortUrl);
  }

  @Override
  public void save(String longUrl, String shortUrl) {
    urlStorage.put(shortUrl, longUrl);
  }
}
