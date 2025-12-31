package clean_code.homework3.task2;

import java.util.HashMap;
import java.util.Map;

public class VideoService {

  private Map<String, VideoAdapter> supportedAdapters = new HashMap<>();

  public VideoService(VideoAdapter... adapters) {
    for (VideoAdapter adapter : adapters) {
      supportedAdapters.put(adapter.getExtension(), adapter);
    }
  }

  public Video uploadVideo(String path) {
    String extension = getExtensionFromPath(path);
    VideoAdapter adapter = supportedAdapters.get(extension);
    if (adapter == null) {
      throw new IllegalArgumentException("Unsupported file extension: " + extension);
    }
    String newPath = adapter.convertToMp4(path);
    System.out.println("Video successfully uploaded and converted to MP4: " + newPath);
    return new Video(newPath);
  }

  public Stream streamVideo(String videoId) {
    System.out.println("Streaming video " + videoId);
    return new Stream();
  }

  private String getExtensionFromPath(String path) {
    return path.substring(path.lastIndexOf(".") + 1).toLowerCase();
  }
}
