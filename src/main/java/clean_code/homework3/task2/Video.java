package clean_code.homework3.task2;

public class Video {

  private static int nextId = 1;
  private final String id;
  private final String videoPath;

  public Video(String path) {
    id = generateId();
    this.videoPath = path;
  }

  private static String generateId() {
    return String.valueOf(nextId++);
  }

  public String getId() {
    return id;
  }

  public String getVideoPath() {
    return videoPath;
  }
}
