package clean_code.homework3.task2;

public class Main {

  public static void main(String[] args) {
    // Инициализация сервиса с адаптерами для поддерживаемых форматов
    VideoService videoService = new VideoService(new AviVideoAdapter(),
        new MovVideoAdapter(), new WmvVideoAdapter());
    // Загрузка видео файла в формате AVI
    String videoPath = "path/to/example.avi";
    Video video = videoService.uploadVideo(videoPath);
    // Стриминг видео в формате МР4
    Stream stream = videoService.streamVideo(video.getId());
    // Вывод информации о стриме
    System.out.println("Streaming video in MP4 format, Video ID: " + video.getId());
    /*
    При создании второго видео id 2
    // Загрузка видео файла в формате AVI
    String videoPath2 = "path/to/example.mov";
    Video video2 = videoService.uploadVideo(videoPath2);
    // Стриминг видео в формате МР4
    Stream stream2 = videoService.streamVideo(video2.getId());
    // Вывод информации о стриме
    System.out.println("Streaming video in MP4 format, Video ID: " + video.getId());
    */
  }
}
