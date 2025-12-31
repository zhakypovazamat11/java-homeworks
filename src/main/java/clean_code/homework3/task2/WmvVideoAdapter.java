package clean_code.homework3.task2;

public class WmvVideoAdapter implements VideoAdapter {

  @Override
  public String convertToMp4(String path) {
    System.out.println("Convert video " + path + ".wmv to MP4");
    return path.replace(".wmv", ".mp4");
  }

  @Override
  public String getExtension() {
    return "wmv";
  }
}
