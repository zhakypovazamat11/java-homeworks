package clean_code.homework3.task2;

public class VideoService {

  private AviVideoAdapter aviVideoAdapter;
  private MovVideoAdapter movVideoAdapter;
  private WmvVideoAdapter wmvVideoAdapter;

  public VideoService(AviVideoAdapter aviVideoAdapter, MovVideoAdapter movVideoAdapter,
      WmvVideoAdapter wmvVideoAdapter) {
    this.aviVideoAdapter = aviVideoAdapter;
    this.movVideoAdapter = movVideoAdapter;
    this.wmvVideoAdapter = wmvVideoAdapter;
  }

  public Video uploadVideo(String path) {
    String extension = path.substring(path.lastIndexOf(".") + 1).toLowerCase();
    String newPath;
    switch (extension) {
      case "avi":
        newPath = aviVideoAdapter.convertToMp4(path);
        break;
      case "mov":
        newPath = movVideoAdapter.convertToMp4(path);
        break;
      case "wmv":
        newPath = wmvVideoAdapter.convertToMp4(path);
        break;
      default:
        System.out.println(
            "Unsupported file extension: " + extension);
        return null;
    }
    System.out.println("Video successfully uploaded and converted to MP4: " + newPath);
    return new Video(newPath);
  }

  public Stream streamVideo(String videoId) {
    System.out.println("Streaming video " + videoId);
    return new Stream();
  }
}
