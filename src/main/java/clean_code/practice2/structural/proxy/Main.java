package clean_code.practice2.structural.proxy;

public class Main {

  public static void main(String[] args) {
    // в момент создания изображения происходит загрузка файла
    ImageProxy image = new ImageProxy("path/to/high/res/image");

    // отображения изображение
    image.show();
  }
}
