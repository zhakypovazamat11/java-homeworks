package clean_code.homework3.task1;

public interface UrlStorage {

  String getLongUrl(String shortUrl);

  void save(String longUrl, String shortUrl);

}
