package clean_code.practice2.structural.proxy;

public class ImageProxy implements Showable {

  private HighResolutionImage image;
  private String filePath;

  public ImageProxy(String imageFilePath) {
    filePath = imageFilePath;
  }

  @Override
  public void show() {
    if (image == null) {
      image = new HighResolutionImage(filePath);
    }
    image.showImage();
  }
}
