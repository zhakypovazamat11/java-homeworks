package clean_code.practice2.creational.prototype;

public class Main {

  public static void main(String[] args) {
    String[] images = {"image1.png", "image2.png"};
    Document original = new Document("Original", images);
    Document copy = original.clone();

    copy.text = "Copy";

    System.out.println("Original Document: " + original.text);
    System.out.println("Copied Document: " + copy.text);
    // Проблема с копированием массива, т.к. изменения в копии затронут оригинал

    copy.images[1] = "Updated"; // изменила второе изображении в копии

    System.out.println("Original Document: image 1 " + original.images[0]
        + " image 2 " + original.images[1]);
    System.out.println("Copied Document: image 1 " + copy.images[0]
        + " image 2 " + copy.images[1]);
  }
}
