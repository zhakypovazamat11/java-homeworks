package clean_code.homework3.task2;

public class Video {

  public static int count = 0;
  public String id;
  public String videoPath;

  public Video(String path) {
    count++;
    id = String.valueOf(count);
    this.videoPath = path;
  }

  public String getId() {
    return id;
  }
}
