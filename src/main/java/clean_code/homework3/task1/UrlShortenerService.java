package clean_code.homework3.task1;

public class UrlShortenerService {

  private ShorteningStrategy strategy;
  private UrlStorage storage;

  public UrlShortenerService(ShortenerFactory factory) {
    strategy = factory.createStrategy();
    storage = InMemoryUrlStorage.getInstance();
  }

  public String shortenUrl(String longUrl) {
    String shortUrl = strategy.shorten(longUrl);
    storage.save(longUrl, shortUrl);

    return shortUrl;
  }

  public String expandUrl(String shortUrl) {
    return storage.getLongUrl(shortUrl);
  }

}
