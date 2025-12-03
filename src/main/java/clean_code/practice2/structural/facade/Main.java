package clean_code.practice2.structural.facade;

public class Main {

  public static void main(String[] args) {

    // алгоритм обработки видео
    VideoFile videoFile = new VideoFile("example.mp4");
    CodecConverter codecConverter = new CodecConverter();
    AudioMixer audioMixer = new AudioMixer();
    MultimediaFacade multimediaFacade = new MultimediaFacade(videoFile, codecConverter, audioMixer);
    multimediaFacade.prepareData();
    /*

     */

    // алгоритм обработки видео
//        VideoFile videoFile = new VideoFile("example.mp4");
//        videoFile.load();
//        CodecConverter codecConverter = new CodecConverter();
//        codecConverter.convert(videoFile.fileName);
//        AudioMixer audioMixer = new AudioMixer();
//        audioMixer.fixAudio();
  }
}
