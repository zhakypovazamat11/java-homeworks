package clean_code.practice2.structural.facade;

public class MultimediaFacade {

  private VideoFile videoFile;
  private CodecConverter codecConverter;
  private AudioMixer audioMixer;

  public MultimediaFacade(VideoFile videoFile, CodecConverter codecConverter,
      AudioMixer audioMixer) {
    this.videoFile = videoFile;
    this.codecConverter = codecConverter;
    this.audioMixer = audioMixer;
  }

  public void prepareData() {
    videoFile.load();
    codecConverter.convert(videoFile.fileName);
    audioMixer.fixAudio();
  }
}
