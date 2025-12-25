package clean_code.homework3.task1;

public class Main {

  public static void main(String[] args) {
    // Конфигурация библиотеки с выбранной стратегией сокращения
    UrlShortenerService shortenerService = new UrlShortenerService(
        new ShortenerFactory(new Base62()));
    
    // Сокращение URL
    String shortUrl =
        shortenerService.shortenUrl("https://example.com/very/long/ur1");
    System.out.println("Short URL: " + shortUrl);
    // Восстановление URL
    String longUrl = shortenerService.expandUrl(shortUrl);
    System.out.println("Original URL: " + longUrl);
  }

}
