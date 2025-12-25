package clean_code.homework3.task2;

public class AviVideoAdapter implements VideoAdapter {

  @Override
  public String convertToMp4(String path) {
    System.out.println("Convert video " + path + " to MP4");

    return path.replace(".avi", ".mp4");
  }
}
